package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.StandardCharsets;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import fk.C7361i;
import fk.C7366m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import p307qj.AbstractC12216d;
import p307qj.C12245p;
import p414x3.C13925a;

@ReactModule(name = NetworkingModule.NAME)
/* loaded from: classes7.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static CustomClientBuilder customClientBuilder;
    private final OkHttpClient mClient;
    private final ForwardingCookieHandler mCookieHandler;
    private final CookieJarContainer mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<RequestBodyHandler> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<ResponseHandler> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<UriHandler> mUriHandlers;

    /* loaded from: classes7.dex */
    public interface CustomClientBuilder {
        void apply(OkHttpClient.Builder builder);
    }

    /* loaded from: classes7.dex */
    public interface RequestBodyHandler {
        boolean supports(ReadableMap readableMap);

        RequestBody toRequestBody(ReadableMap readableMap, String str);
    }

    /* loaded from: classes7.dex */
    public interface ResponseHandler {
        boolean supports(String str);

        WritableMap toResponseData(ResponseBody responseBody);
    }

    /* loaded from: classes7.dex */
    public interface UriHandler {
        WritableMap fetch(Uri uri);

        boolean supports(Uri uri, String str);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<NetworkInterceptorCreator> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder B = okHttpClient.m9968B();
            for (NetworkInterceptorCreator networkInterceptorCreator : list) {
                B.m9915b(networkInterceptorCreator.create());
            }
            okHttpClient = B.m9914c();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
        this.mCookieJarContainer = (CookieJarContainer) okHttpClient.m9942q();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        CustomClientBuilder customClientBuilder2 = customClientBuilder;
        if (customClientBuilder2 != null) {
            customClientBuilder2.apply(builder);
        }
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(final int i) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.network.NetworkingModule.4
            /* JADX INFO: Access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                OkHttpCallUtil.cancelTag(NetworkingModule.this.mClient, Integer.valueOf(i));
            }
        }.execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("constructMultipartBody");
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.m9973d(MediaType.m9982f(str));
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                ResponseUtil.onRequestError(eventEmitter, i, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String a = extractHeaders.m10072a(CONTENT_TYPE_HEADER_NAME);
            if (a != null) {
                mediaType = MediaType.m9982f(a);
                extractHeaders = extractHeaders.m10070f().m10059g(CONTENT_TYPE_HEADER_NAME).m10062d();
            } else {
                mediaType = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                builder.m9976a(extractHeaders, RequestBody.create(mediaType, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                ResponseUtil.onRequestError(eventEmitter, i, "Unrecognized FormData part.", null);
            } else if (mediaType == null) {
                ResponseUtil.onRequestError(eventEmitter, i, "Binary FormData part needs a content-type header.", null);
                return null;
            } else {
                String string = map.getString(REQUEST_BODY_KEY_URI);
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string);
                if (fileInputStream == null) {
                    ResponseUtil.onRequestError(eventEmitter, i, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.m9976a(extractHeaders, RequestBodyUtil.create(mediaType, fileInputStream));
            }
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.C11418a aVar = new Headers.C11418a();
        int size = readableArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String stripHeaderName = HeaderUtil.stripHeaderName(array.getString(0));
                String stripHeaderValue = HeaderUtil.stripHeaderValue(array.getString(1));
                if (!(stripHeaderName == null || stripHeaderValue == null)) {
                    aVar.m10065a(stripHeaderName, stripHeaderValue);
                }
            }
            return null;
        }
        if (aVar.m10061e(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            aVar.m10065a(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z = true;
        }
        if (!z) {
            aVar.m10059g(CONTENT_ENCODING_HEADER_NAME);
        }
        return aVar.m10062d();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        if (getReactApplicationContextIfActiveOrWarn() != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) {
        long j;
        Charset charset;
        long j2 = -1;
        try {
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            j = progressResponseBody.totalBytesRead();
            try {
                j2 = progressResponseBody.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        if (responseBody.contentType() == null) {
            charset = StandardCharsets.UTF_8;
        } else {
            charset = responseBody.contentType().m9985c(StandardCharsets.UTF_8);
        }
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(charset);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    ResponseUtil.onIncrementalDataReceived(rCTDeviceEventEmitter, i, progressiveStringDecoder.decodeNext(bArr, read), j, j2);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static void setCustomClientBuilder(CustomClientBuilder customClientBuilder2) {
        customClientBuilder = customClientBuilder2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < headers.size(); i++) {
            String b = headers.m10071b(i);
            if (bundle.containsKey(b)) {
                bundle.putString(b, bundle.getString(b) + ", " + headers.m10067j(i));
            } else {
                bundle.putString(b, headers.m10067j(i));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, final int i) {
        if (requestBody == null) {
            return null;
        }
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.3
            long last = System.nanoTime();

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if (z || NetworkingModule.shouldDispatch(nanoTime, this.last)) {
                    ResponseUtil.onDataSend(rCTDeviceEventEmitter, i, j, j2);
                    this.last = nanoTime;
                }
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d) {
        int i = (int) d;
        cancelRequest(i);
        removeRequest(i);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.add(requestBodyHandler);
    }

    public void addResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.add(responseHandler);
    }

    public void addUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.add(uriHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.setCookieJar(new C12245p(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.destroy();
        this.mCookieJarContainer.removeCookieJar();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d) {
    }

    public void removeRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.remove(requestBodyHandler);
    }

    public void removeResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.remove(responseHandler);
    }

    public void removeUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.remove(uriHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2) {
        int i = (int) d;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, (int) d2, z2);
        } catch (Throwable th2) {
            C13925a.m2287k(TAG, "Failed to send url request: " + str2, th2);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequest error");
            if (eventEmitter != null) {
                ResponseUtil.onRequestError(eventEmitter, i, th2.getMessage(), th2);
            }
        }
    }

    public void sendRequestInternal(String str, String str2, final int i, ReadableArray readableArray, ReadableMap readableMap, final String str3, final boolean z, int i2, boolean z2) {
        RequestBodyHandler requestBodyHandler;
        RequestBody requestBody;
        Charset charset;
        final DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequestInternal");
        try {
            Uri parse = Uri.parse(str2);
            for (UriHandler uriHandler : this.mUriHandlers) {
                if (uriHandler.supports(parse, str3)) {
                    ResponseUtil.onDataReceived(eventEmitter, i, uriHandler.fetch(parse));
                    ResponseUtil.onRequestSuccess(eventEmitter, i);
                    return;
                }
            }
            try {
                Request.Builder l = new Request.Builder().m9865l(str2);
                if (i != 0) {
                    l.m9866k(Integer.valueOf(i));
                }
                OkHttpClient.Builder B = this.mClient.m9968B();
                applyCustomBuilder(B);
                if (!z2) {
                    B.m9911f(CookieJar.f25367a);
                }
                if (z) {
                    B.m9915b(new Interceptor() { // from class: com.facebook.react.modules.network.NetworkingModule.1
                        @Override // okhttp3.Interceptor
                        public Response intercept(Interceptor.Chain chain) {
                            Response a = chain.mo2360a(chain.mo2359b());
                            return a.m9850R().m9831b(new ProgressResponseBody(a.m9845b(), new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.1.1
                                long last = System.nanoTime();

                                @Override // com.facebook.react.modules.network.ProgressListener
                                public void onProgress(long j, long j2, boolean z3) {
                                    long nanoTime = System.nanoTime();
                                    if ((z3 || NetworkingModule.shouldDispatch(nanoTime, this.last)) && !str3.equals("text")) {
                                        AnonymousClass1 r13 = AnonymousClass1.this;
                                        ResponseUtil.onDataReceivedProgress(eventEmitter, i, j, j2);
                                        this.last = nanoTime;
                                    }
                                }
                            })).m9830c();
                        }
                    });
                }
                if (i2 != this.mClient.m9945m()) {
                    B.m9912e(i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient c = B.m9914c();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    ResponseUtil.onRequestError(eventEmitter, i, "Unrecognized headers format", null);
                    return;
                }
                String a = extractHeaders.m10072a(CONTENT_TYPE_HEADER_NAME);
                String a2 = extractHeaders.m10072a(CONTENT_ENCODING_HEADER_NAME);
                l.m9871f(extractHeaders);
                if (readableMap != null) {
                    Iterator<RequestBodyHandler> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        requestBodyHandler = it.next();
                        if (requestBodyHandler.supports(readableMap)) {
                            break;
                        }
                    }
                }
                requestBodyHandler = null;
                if (readableMap != null) {
                    Locale locale = Locale.ROOT;
                    if (!str.toLowerCase(locale).equals("get") && !str.toLowerCase(locale).equals("head")) {
                        if (requestBodyHandler != null) {
                            requestBody = requestBodyHandler.toRequestBody(readableMap, a);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                            if (a == null) {
                                ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                            MediaType f = MediaType.m9982f(a);
                            if (RequestBodyUtil.isGzipEncoding(a2)) {
                                requestBody = RequestBodyUtil.createGzip(f, string);
                                if (requestBody == null) {
                                    ResponseUtil.onRequestError(eventEmitter, i, "Failed to gzip request body", null);
                                    return;
                                }
                            } else {
                                if (f == null) {
                                    charset = StandardCharsets.UTF_8;
                                } else {
                                    charset = f.m9985c(StandardCharsets.UTF_8);
                                }
                                requestBody = RequestBody.create(f, string.getBytes(charset));
                            }
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                            if (a == null) {
                                ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            requestBody = RequestBody.create(MediaType.m9982f(a), ByteString.m9716c(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                            if (a == null) {
                                ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                            InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string2);
                            if (fileInputStream == null) {
                                ResponseUtil.onRequestError(eventEmitter, i, "Could not retrieve file for uri " + string2, null);
                                return;
                            }
                            requestBody = RequestBodyUtil.create(MediaType.m9982f(a), fileInputStream);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                            if (a == null) {
                                a = "multipart/form-data";
                            }
                            MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), a, i);
                            if (constructMultipartBody != null) {
                                requestBody = constructMultipartBody.m9974c();
                            } else {
                                return;
                            }
                        } else {
                            requestBody = RequestBodyUtil.getEmptyBody(str);
                        }
                        l.m9870g(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                        addRequest(i);
                        c.mo9954a(l.m9875b()).mo3413p(new AbstractC12216d() { // from class: com.facebook.react.modules.network.NetworkingModule.2
                            @Override // p307qj.AbstractC12216d
                            public void onFailure(Call call, IOException iOException) {
                                String str4;
                                if (!NetworkingModule.this.mShuttingDown) {
                                    NetworkingModule.this.removeRequest(i);
                                    if (iOException.getMessage() != null) {
                                        str4 = iOException.getMessage();
                                    } else {
                                        str4 = "Error while executing request: " + iOException.getClass().getSimpleName();
                                    }
                                    ResponseUtil.onRequestError(eventEmitter, i, str4, iOException);
                                }
                            }

                            @Override // p307qj.AbstractC12216d
                            public void onResponse(Call call, Response response) {
                                MediaType mediaType;
                                if (!NetworkingModule.this.mShuttingDown) {
                                    NetworkingModule.this.removeRequest(i);
                                    ResponseUtil.onResponseReceived(eventEmitter, i, response.m9839l(), NetworkingModule.translateHeaders(response.m9833z()), response.m9844b0().m9877l().toString());
                                    try {
                                        ResponseBody b = response.m9845b();
                                        if ("gzip".equalsIgnoreCase(response.m9836r("Content-Encoding")) && b != null) {
                                            C7361i iVar = new C7361i(b.source());
                                            String r = response.m9836r("Content-Type");
                                            if (r != null) {
                                                mediaType = MediaType.m9982f(r);
                                            } else {
                                                mediaType = null;
                                            }
                                            b = ResponseBody.create(mediaType, -1L, C7366m.m22819d(iVar));
                                        }
                                        for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                            if (responseHandler.supports(str3)) {
                                                ResponseUtil.onDataReceived(eventEmitter, i, responseHandler.toResponseData(b));
                                                ResponseUtil.onRequestSuccess(eventEmitter, i);
                                                return;
                                            }
                                        }
                                        if (!z || !str3.equals("text")) {
                                            String str4 = "";
                                            if (str3.equals("text")) {
                                                try {
                                                    str4 = b.string();
                                                } catch (IOException e) {
                                                    if (!response.m9844b0().m9881h().equalsIgnoreCase("HEAD")) {
                                                        ResponseUtil.onRequestError(eventEmitter, i, e.getMessage(), e);
                                                    }
                                                }
                                            } else if (str3.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                                                str4 = Base64.encodeToString(b.bytes(), 2);
                                            }
                                            ResponseUtil.onDataReceived(eventEmitter, i, str4);
                                            ResponseUtil.onRequestSuccess(eventEmitter, i);
                                            return;
                                        }
                                        NetworkingModule.this.readWithProgress(eventEmitter, i, b);
                                        ResponseUtil.onRequestSuccess(eventEmitter, i);
                                    } catch (IOException e2) {
                                        ResponseUtil.onRequestError(eventEmitter, i, e2.getMessage(), e2);
                                    }
                                }
                            }
                        });
                    }
                }
                requestBody = RequestBodyUtil.getEmptyBody(str);
                l.m9870g(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                addRequest(i);
                c.mo9954a(l.m9875b()).mo3413p(new AbstractC12216d() { // from class: com.facebook.react.modules.network.NetworkingModule.2
                    @Override // p307qj.AbstractC12216d
                    public void onFailure(Call call, IOException iOException) {
                        String str4;
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i);
                            if (iOException.getMessage() != null) {
                                str4 = iOException.getMessage();
                            } else {
                                str4 = "Error while executing request: " + iOException.getClass().getSimpleName();
                            }
                            ResponseUtil.onRequestError(eventEmitter, i, str4, iOException);
                        }
                    }

                    @Override // p307qj.AbstractC12216d
                    public void onResponse(Call call, Response response) {
                        MediaType mediaType;
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i);
                            ResponseUtil.onResponseReceived(eventEmitter, i, response.m9839l(), NetworkingModule.translateHeaders(response.m9833z()), response.m9844b0().m9877l().toString());
                            try {
                                ResponseBody b = response.m9845b();
                                if ("gzip".equalsIgnoreCase(response.m9836r("Content-Encoding")) && b != null) {
                                    C7361i iVar = new C7361i(b.source());
                                    String r = response.m9836r("Content-Type");
                                    if (r != null) {
                                        mediaType = MediaType.m9982f(r);
                                    } else {
                                        mediaType = null;
                                    }
                                    b = ResponseBody.create(mediaType, -1L, C7366m.m22819d(iVar));
                                }
                                for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                    if (responseHandler.supports(str3)) {
                                        ResponseUtil.onDataReceived(eventEmitter, i, responseHandler.toResponseData(b));
                                        ResponseUtil.onRequestSuccess(eventEmitter, i);
                                        return;
                                    }
                                }
                                if (!z || !str3.equals("text")) {
                                    String str4 = "";
                                    if (str3.equals("text")) {
                                        try {
                                            str4 = b.string();
                                        } catch (IOException e) {
                                            if (!response.m9844b0().m9881h().equalsIgnoreCase("HEAD")) {
                                                ResponseUtil.onRequestError(eventEmitter, i, e.getMessage(), e);
                                            }
                                        }
                                    } else if (str3.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                                        str4 = Base64.encodeToString(b.bytes(), 2);
                                    }
                                    ResponseUtil.onDataReceived(eventEmitter, i, str4);
                                    ResponseUtil.onRequestSuccess(eventEmitter, i);
                                    return;
                                }
                                NetworkingModule.this.readWithProgress(eventEmitter, i, b);
                                ResponseUtil.onRequestSuccess(eventEmitter, i);
                            } catch (IOException e2) {
                                ResponseUtil.onRequestError(eventEmitter, i, e2.getMessage(), e2);
                            }
                        }
                    }
                });
            } catch (Exception e) {
                ResponseUtil.onRequestError(eventEmitter, i, e.getMessage(), null);
            }
        } catch (IOException e2) {
            ResponseUtil.onRequestError(eventEmitter, i, e2.getMessage(), e2);
        }
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<NetworkInterceptorCreator> list) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }
}
