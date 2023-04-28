package com.reactnativecommunity.webview;

import af.C1370a;
import af.C1371b;
import af.C1373c;
import af.C1375d;
import af.C1377e;
import af.C1379f;
import af.C1381g;
import af.C1383h;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.core.content.C2337a;
import androidx.core.util.C2515e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
import com.facebook.react.views.scroll.OnScrollDispatchHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.reactnativecommunity.webview.C6158b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.reactnativecommunity.webview.RNCWebViewModule;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p414x3.C13925a;
import p453z1.C14518b;
import p453z1.C14519c;
import p453z1.C14525d;

@ReactModule(name = "RNCWebView")
/* loaded from: classes6.dex */
public class RNCWebViewManager extends SimpleViewManager<C6158b> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELEASE = 4001;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebView";
    protected static final int SHOULD_OVERRIDE_URL_LOADING_TIMEOUT = 250;
    private static final String TAG = "RNCWebViewManager";
    Set<String> assetLoaderHandlerTypes;
    protected boolean mAllowsFullscreenVideo;
    protected String mUserAgent;
    protected String mUserAgentWithApplicationName;
    protected C6148f mWebChromeClient;
    protected AbstractC6173f1 mWebViewConfig;

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$a */
    /* loaded from: classes6.dex */
    class C6140a implements AbstractC6173f1 {
        C6140a() {
        }

        @Override // com.reactnativecommunity.webview.AbstractC6173f1
        /* renamed from: a */
        public void mo26109a(WebView webView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$b */
    /* loaded from: classes6.dex */
    public class C6141b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ C6144e f12510a;

        /* renamed from: b */
        final /* synthetic */ ThemedReactContext f12511b;

        C6141b(C6144e eVar, ThemedReactContext themedReactContext) {
            this.f12510a = eVar;
            this.f12511b = themedReactContext;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            this.f12510a.setIgnoreErrFailedForThisURL(str);
            RNCWebViewModule module = RNCWebViewManager.getModule(this.f12511b);
            try {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String guessFileName = URLUtil.guessFileName(str, str3, str4);
                String str5 = "Downloading " + guessFileName;
                try {
                    URL url = new URL(str);
                    request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                } catch (MalformedURLException e) {
                    Log.w(RNCWebViewManager.TAG, "Error getting cookie for DownloadManager", e);
                }
                request.addRequestHeader("User-Agent", str2);
                request.setTitle(guessFileName);
                request.setDescription(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                module.setDownloadRequest(request);
                if (module.grantFileDownloaderPermissions()) {
                    module.downloadFile();
                }
            } catch (IllegalArgumentException e2) {
                Log.w(RNCWebViewManager.TAG, "Unsupported URI, aborting download", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$c */
    /* loaded from: classes6.dex */
    public class C6142c extends C6148f {

        /* renamed from: x */
        final /* synthetic */ Activity f12513x;

        /* renamed from: y */
        final /* synthetic */ int f12514y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6142c(ReactContext reactContext, WebView webView, Activity activity, int i) {
            super(reactContext, webView);
            this.f12513x = activity;
            this.f12514y = i;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (this.f12543m != null) {
                ViewGroup c = m26135c();
                if (c.getRootView() != this.f12542l.getRootView()) {
                    this.f12542l.getRootView().setVisibility(0);
                } else {
                    this.f12542l.setVisibility(0);
                }
                this.f12513x.getWindow().clearFlags(512);
                c.removeView(this.f12543m);
                this.f12544n.onCustomViewHidden();
                this.f12543m = null;
                this.f12544n = null;
                this.f12513x.setRequestedOrientation(this.f12514y);
                this.f12541k.removeLifecycleEventListener(this);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f12543m != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f12543m = view;
            this.f12544n = customViewCallback;
            this.f12513x.setRequestedOrientation(-1);
            this.f12543m.setSystemUiVisibility(7942);
            this.f12513x.getWindow().setFlags(512, 512);
            this.f12543m.setBackgroundColor(-16777216);
            ViewGroup c = m26135c();
            c.addView(this.f12543m, C6148f.f12540w);
            if (c.getRootView() != this.f12542l.getRootView()) {
                this.f12542l.getRootView().setVisibility(8);
            } else {
                this.f12542l.setVisibility(8);
            }
            this.f12541k.addLifecycleEventListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$d */
    /* loaded from: classes6.dex */
    public class C6143d extends C6148f {
        C6143d(ReactContext reactContext, WebView webView) {
            super(reactContext, webView);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$e */
    /* loaded from: classes6.dex */
    public static class C6144e extends WebView implements LifecycleEventListener {

        /* renamed from: k */
        protected String f12517k;

        /* renamed from: l */
        protected String f12518l;

        /* renamed from: p */
        protected String f12522p;

        /* renamed from: q */
        protected String f12523q;

        /* renamed from: r */
        protected C6149g f12524r;

        /* renamed from: s */
        protected CatalystInstance f12525s;

        /* renamed from: u */
        private OnScrollDispatchHelper f12527u;

        /* renamed from: y */
        protected ReadableMap f12531y;

        /* renamed from: z */
        WebChromeClient f12532z;

        /* renamed from: m */
        protected boolean f12519m = true;

        /* renamed from: n */
        protected boolean f12520n = true;

        /* renamed from: o */
        protected boolean f12521o = false;

        /* renamed from: t */
        protected boolean f12526t = false;

        /* renamed from: v */
        protected boolean f12528v = false;

        /* renamed from: w */
        protected boolean f12529w = false;

        /* renamed from: x */
        protected C6146b f12530x = new C6146b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$e$a */
        /* loaded from: classes6.dex */
        public class RunnableC6145a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ WebView f12533k;

            /* renamed from: l */
            final /* synthetic */ String f12534l;

            /* renamed from: m */
            final /* synthetic */ C6144e f12535m;

            RunnableC6145a(WebView webView, String str, C6144e eVar) {
                this.f12533k = webView;
                this.f12534l = str;
                this.f12535m = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6149g gVar = C6144e.this.f12524r;
                if (gVar != null) {
                    WebView webView = this.f12533k;
                    WritableMap a = gVar.m26131a(webView, webView.getUrl());
                    a.putString("data", this.f12534l);
                    C6144e eVar = C6144e.this;
                    if (eVar.f12525s != null) {
                        this.f12535m.m26140l("onMessage", a);
                    } else {
                        eVar.m26145g(this.f12533k, new C1379f(C6158b.m26115c(this.f12533k), a));
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$e$b */
        /* loaded from: classes6.dex */
        public static class C6146b {

            /* renamed from: a */
            private boolean f12537a = false;

            protected C6146b() {
            }

            /* renamed from: a */
            public boolean m26139a() {
                return this.f12537a;
            }

            /* renamed from: b */
            public void m26138b(boolean z) {
                this.f12537a = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$e$c */
        /* loaded from: classes6.dex */
        public class C6147c {

            /* renamed from: a */
            C6144e f12538a;

            C6147c(C6144e eVar) {
                this.f12538a = eVar;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f12538a.m26141k(str);
            }
        }

        public C6144e(ThemedReactContext themedReactContext) {
            super(themedReactContext);
            m26147e();
            setBackgroundColor(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m26142j(WebView webView, String str, ReactContext reactContext) {
            WritableMap a = this.f12524r.m26131a(webView, webView.getUrl());
            a.putString("webViewKey", this.f12522p);
            a.putString("data", str);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeWebViewOnMessageWithWebViewKey", a);
        }

        /* renamed from: b */
        public void m26150b() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.f12517k) != null && !TextUtils.isEmpty(str)) {
                m26144h("(function() {\n" + this.f12517k + ";\n})();");
            }
        }

        /* renamed from: c */
        public void m26149c() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.f12518l) != null && !TextUtils.isEmpty(str)) {
                m26144h("(function() {\n" + this.f12518l + ";\n})();");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: d */
        public void m26148d() {
            setWebViewClient(null);
            destroy();
        }

        @Override // android.webkit.WebView
        public void destroy() {
            WebChromeClient webChromeClient = this.f12532z;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            }
            super.destroy();
        }

        /* renamed from: e */
        protected void m26147e() {
            ReactContext reactContext = (ReactContext) getContext();
            if (reactContext != null) {
                this.f12525s = reactContext.getCatalystInstance();
            }
        }

        /* renamed from: f */
        protected C6147c m26146f(C6144e eVar) {
            return new C6147c(eVar);
        }

        /* renamed from: g */
        protected void m26145g(WebView webView, Event event) {
            if (event.getViewTag() == -1) {
                C13925a.m2302J(RNCWebViewManager.TAG, "Unable to dispatch event: ", event.getEventName() + "due to InternalWebView not being attached.");
                return;
            }
            ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(event);
        }

        public C6149g getRNCWebViewClient() {
            return this.f12524r;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: h */
        public void m26144h(String str) {
            evaluateJavascript(str, null);
        }

        /* renamed from: i */
        public boolean m26143i(ReadableMap readableMap) {
            Map map;
            Object obj;
            if (this.f12531y == null || readableMap == null) {
                return true;
            }
            String[] strArr = {"uri", "method", "body", "html", "baseUrl"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                String string = this.f12531y.getString(str);
                String string2 = readableMap.getString(str);
                if (!(string2 == null || string2.equals(string))) {
                    return true;
                }
            }
            ReadableMap map2 = this.f12531y.getMap("headers");
            ReadableMap map3 = readableMap.getMap("headers");
            if (map2 == null) {
                map = Collections.emptyMap();
            } else {
                map = map2.toHashMap();
            }
            if (map3 == null) {
                obj = Collections.emptyMap();
            } else {
                obj = map3.toHashMap();
            }
            return !map.equals(obj);
        }

        /* renamed from: k */
        public void m26141k(final String str) {
            final ReactContext reactContext = (ReactContext) getContext();
            if (this.f12522p != null && this.f12524r != null) {
                reactContext.runOnUiQueueThread(new Runnable() { // from class: com.reactnativecommunity.webview.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNCWebViewManager.C6144e.this.m26142j(this, str, reactContext);
                    }
                });
            } else if (this.f12524r != null) {
                post(new RunnableC6145a(this, str, this));
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("data", str);
                if (this.f12525s != null) {
                    m26140l("onMessage", createMap);
                } else {
                    m26145g(this, new C1379f(C6158b.m26115c(this), createMap));
                }
            }
        }

        /* renamed from: l */
        protected void m26140l(String str, WritableMap writableMap) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMap);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushMap(writableNativeMap);
            this.f12525s.callFunction(this.f12523q, str, writableNativeArray);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            m26148d();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.f12528v) {
                if (this.f12527u == null) {
                    this.f12527u = new OnScrollDispatchHelper();
                }
                if (this.f12527u.onScrollChanged(i, i2)) {
                    m26145g(this, ScrollEvent.obtain(C6158b.m26115c(this), ScrollEventType.SCROLL, i, i2, this.f12527u.getXFlingVelocity(), this.f12527u.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.f12526t) {
                m26145g(this, new ContentSizeChangeEvent(C6158b.m26115c(this), i, i2));
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.f12529w) {
                requestDisallowInterceptTouchEvent(true);
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setBasicAuthCredential(C6155a aVar) {
            this.f12524r.m26129c(aVar);
        }

        public void setHasScrollEvent(boolean z) {
            this.f12528v = z;
        }

        public void setIgnoreErrFailedForThisURL(String str) {
            this.f12524r.m26128d(str);
        }

        public void setInjectedJavaScript(String str) {
            this.f12517k = str;
        }

        public void setInjectedJavaScriptBeforeContentLoaded(String str) {
            this.f12518l = str;
        }

        public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean z) {
            this.f12520n = z;
        }

        public void setInjectedJavaScriptForMainFrameOnly(boolean z) {
            this.f12519m = z;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.f12521o != z) {
                this.f12521o = z;
                if (z) {
                    addJavascriptInterface(m26146f(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
                } else {
                    removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
                }
            }
        }

        public void setMessagingModuleName(String str) {
            this.f12523q = str;
        }

        public void setNestedScrollEnabled(boolean z) {
            this.f12529w = z;
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.f12526t = z;
        }

        public void setSource(ReadableMap readableMap) {
            this.f12531y = readableMap;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            this.f12532z = webChromeClient;
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof C6148f) {
                ((C6148f) webChromeClient).m26132f(this.f12530x);
            }
        }

        public void setWebViewAssetLoader(C14519c cVar) {
            this.f12524r.m26125g(cVar);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof C6149g) {
                C6149g gVar = (C6149g) webViewClient;
                this.f12524r = gVar;
                gVar.m26127e(this.f12530x);
            }
        }

        public void setWebViewKey(String str) {
            this.f12522p = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f */
    /* loaded from: classes6.dex */
    public static class C6148f extends WebChromeClient implements LifecycleEventListener {

        /* renamed from: w */
        protected static final FrameLayout.LayoutParams f12540w = new FrameLayout.LayoutParams(-1, -1, 17);

        /* renamed from: k */
        protected ReactContext f12541k;

        /* renamed from: l */
        protected View f12542l;

        /* renamed from: m */
        protected View f12543m;

        /* renamed from: n */
        protected WebChromeClient.CustomViewCallback f12544n;

        /* renamed from: o */
        protected PermissionRequest f12545o;

        /* renamed from: p */
        protected List<String> f12546p;

        /* renamed from: q */
        protected GeolocationPermissions.Callback f12547q;

        /* renamed from: r */
        protected String f12548r;

        /* renamed from: s */
        protected boolean f12549s = false;

        /* renamed from: t */
        protected List<String> f12550t = new ArrayList();

        /* renamed from: u */
        protected C6144e.C6146b f12551u = null;
        @TargetApi(21)

        /* renamed from: v */
        private PermissionListener f12552v = new PermissionListener() { // from class: com.reactnativecommunity.webview.z0
            @Override // com.facebook.react.modules.core.PermissionListener
            public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                boolean d;
                d = RNCWebViewManager.C6148f.this.m26134d(i, strArr, iArr);
                return d;
            }
        };

        public C6148f(ReactContext reactContext, WebView webView) {
            this.f12541k = reactContext;
            this.f12542l = webView;
        }

        /* renamed from: b */
        private PermissionAwareActivity m26136b() {
            Activity currentActivity = this.f12541k.getCurrentActivity();
            if (currentActivity == null) {
                throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
            } else if (currentActivity instanceof PermissionAwareActivity) {
                return (PermissionAwareActivity) currentActivity;
            } else {
                throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ boolean m26134d(int i, String[] strArr, int[] iArr) {
            PermissionRequest permissionRequest;
            List<String> list;
            boolean z;
            List<String> list2;
            List<String> list3;
            List<String> list4;
            GeolocationPermissions.Callback callback;
            String str;
            this.f12549s = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str2 = strArr[i2];
                if (iArr[i2] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!str2.equals("android.permission.ACCESS_FINE_LOCATION") || (callback = this.f12547q) == null || (str = this.f12548r) == null)) {
                    if (z) {
                        callback.invoke(str, true, false);
                    } else {
                        callback.invoke(str, false, false);
                    }
                    this.f12547q = null;
                    this.f12548r = null;
                }
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    if (z && (list4 = this.f12546p) != null) {
                        list4.add("android.webkit.resource.AUDIO_CAPTURE");
                    }
                    z2 = true;
                }
                if (str2.equals("android.permission.CAMERA")) {
                    if (z && (list3 = this.f12546p) != null) {
                        list3.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                    z2 = true;
                }
                if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    if (z && (list2 = this.f12546p) != null) {
                        list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                    }
                    z2 = true;
                }
            }
            if (!(!z2 || (permissionRequest = this.f12545o) == null || (list = this.f12546p) == null)) {
                permissionRequest.grant((String[]) list.toArray(new String[0]));
                this.f12545o = null;
                this.f12546p = null;
            }
            if (this.f12550t.isEmpty()) {
                return true;
            }
            m26133e(this.f12550t);
            return false;
        }

        /* renamed from: e */
        private synchronized void m26133e(List<String> list) {
            if (this.f12549s) {
                this.f12550t.addAll(list);
                return;
            }
            PermissionAwareActivity b = m26136b();
            this.f12549s = true;
            b.requestPermissions((String[]) list.toArray(new String[0]), 3, this.f12552v);
            this.f12550t.clear();
        }

        /* renamed from: c */
        protected ViewGroup m26135c() {
            return (ViewGroup) this.f12541k.getCurrentActivity().findViewById(16908290);
        }

        /* renamed from: f */
        public void m26132f(C6144e.C6146b bVar) {
            this.f12551u = bVar;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (C2337a.m38137a(this.f12541k, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                this.f12547q = callback;
                this.f12548r = str;
                m26133e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
                return;
            }
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view = this.f12543m;
            if (view != null && view.getSystemUiVisibility() != 7942) {
                this.f12543m.setSystemUiVisibility(7942);
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f12546p = new ArrayList();
            ArrayList arrayList = new ArrayList();
            String[] resources = permissionRequest.getResources();
            int length = resources.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    break;
                }
                String str2 = resources[i];
                if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    str = "android.permission.RECORD_AUDIO";
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "android.permission.CAMERA";
                } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
                if (str != null) {
                    if (C2337a.m38137a(this.f12541k, str) == 0) {
                        this.f12546p.add(str2);
                    } else {
                        arrayList.add(str);
                    }
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                permissionRequest.grant((String[]) this.f12546p.toArray(new String[0]));
                this.f12546p = null;
                return;
            }
            this.f12545o = permissionRequest;
            m26133e(arrayList);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (!this.f12551u.m26139a()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble(TouchesHelper.TARGET_KEY, C6158b.m26115c(webView));
                createMap.putString("title", webView.getTitle());
                createMap.putString("url", url);
                createMap.putBoolean("canGoBack", webView.canGoBack());
                createMap.putBoolean("canGoForward", webView.canGoForward());
                createMap.putDouble("progress", i / 100.0f);
                ((C6144e) webView).m26145g(webView, new C1375d(C6158b.m26115c(webView), createMap));
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            boolean z = true;
            if (fileChooserParams.getMode() != 1) {
                z = false;
            }
            return RNCWebViewManager.getModule(this.f12541k).startPhotoPickerIntent(valueCallback, acceptTypes, z);
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.assetLoaderHandlerTypes = new HashSet(Arrays.asList("assets", "internal", "resources"));
        this.mWebViewConfig = new C6140a();
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addEventEmitters$44(C6144e eVar) {
        eVar.setWebViewClient(new C6149g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDropViewInstance$46(C6158b bVar, C6144e eVar) {
        if (eVar.f12522p == null) {
            ((ThemedReactContext) eVar.getContext()).removeLifecycleEventListener(eVar);
            eVar.m26148d();
            this.mWebChromeClient = null;
            return;
        }
        bVar.m26113e();
        C6161b1 b1Var = C6161b1.f12579a;
        b1Var.m26111b().remove(eVar.f12522p);
        b1Var.m26110c().remove(Integer.valueOf(eVar.getId()));
        if (bVar.f12575k != 0) {
            ViewGroup viewGroup = (ViewGroup) ((UIManagerModule) ((ReactContext) bVar.getContext()).getNativeModule(UIManagerModule.class)).resolveView(bVar.f12575k);
            viewGroup.addView(eVar);
            eVar.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), 1073741824));
            eVar.layout(0, 0, eVar.getMeasuredWidth(), eVar.getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$receiveCommand$45(int i, ReadableArray readableArray, C6144e eVar) {
        boolean z = false;
        switch (i) {
            case 1:
                eVar.goBack();
                return;
            case 2:
                eVar.goForward();
                return;
            case 3:
                eVar.reload();
                return;
            case 4:
                eVar.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    eVar.m26144h("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                eVar.m26144h(readableArray.getString(0));
                return;
            case 7:
                if (readableArray != null) {
                    eVar.f12530x.m26138b(false);
                    eVar.loadUrl(readableArray.getString(0));
                    return;
                }
                throw new RuntimeException("Arguments for loading an url are null!");
            case 8:
                eVar.requestFocus();
                return;
            default:
                switch (i) {
                    case COMMAND_CLEAR_FORM_DATA /* 1000 */:
                        eVar.clearFormData();
                        return;
                    case COMMAND_CLEAR_CACHE /* 1001 */:
                        if (readableArray != null && readableArray.getBoolean(0)) {
                            z = true;
                        }
                        eVar.clearCache(z);
                        return;
                    case COMMAND_CLEAR_HISTORY /* 1002 */:
                        eVar.clearHistory();
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAllowFileAccess$39(Boolean bool, C6144e eVar) {
        eVar.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAllowFileAccessFromFileURLs$21(boolean z, C6144e eVar) {
        eVar.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAllowUniversalAccessFromFileURLs$22(boolean z, C6144e eVar) {
        eVar.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAllowsFullscreenVideo$38(C6158b bVar, C6144e eVar) {
        setupWebChromeClient((ReactContext) bVar.getContext(), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setBasicAuthCredential$32(ReadableMap readableMap, C6144e eVar) {
        C6155a aVar;
        if (readableMap == null || !readableMap.hasKey("username") || !readableMap.hasKey("password")) {
            aVar = null;
        } else {
            aVar = new C6155a(readableMap.getString("username"), readableMap.getString("password"));
        }
        eVar.setBasicAuthCredential(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setBuiltInZoomControls$1(boolean z, C6144e eVar) {
        eVar.getSettings().setBuiltInZoomControls(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCacheEnabled$7(C6144e eVar) {
        eVar.getSettings().setCacheMode(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCacheEnabled$8(C6144e eVar) {
        eVar.getSettings().setCacheMode(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCacheMode$9(Integer num, C6144e eVar) {
        eVar.getSettings().setCacheMode(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDisplayZoomControls$2(boolean z, C6144e eVar) {
        eVar.getSettings().setDisplayZoomControls(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDomStorageEnabled$18(boolean z, C6144e eVar) {
        eVar.getSettings().setDomStorageEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setForceDarkOn$42(boolean z, C6144e eVar) {
        int i;
        if (Build.VERSION.SDK_INT > 28) {
            if (C14525d.m272a("FORCE_DARK")) {
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                C14518b.m283b(eVar.getSettings(), i);
            }
            if (z && C14525d.m272a("FORCE_DARK_STRATEGY")) {
                C14518b.m282c(eVar.getSettings(), 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setGeolocationEnabled$40(Boolean bool, C6144e eVar) {
        eVar.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setIncognito$30(C6144e eVar) {
        eVar.getSettings().setCacheMode(2);
        eVar.clearHistory();
        eVar.clearCache(true);
        eVar.clearFormData();
        eVar.getSettings().setSavePassword(false);
        eVar.getSettings().setSaveFormData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setJavaScriptCanOpenWindowsAutomatically$20(boolean z, C6144e eVar) {
        eVar.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setJavaScriptEnabled$0(boolean z, C6144e eVar) {
        eVar.getSettings().setJavaScriptEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setMediaPlaybackRequiresUserAction$19(boolean z, C6144e eVar) {
        eVar.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setMinimumFontSize$43(int i, C6144e eVar) {
        eVar.getSettings().setMinimumFontSize(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setMixedContentMode$34(C6144e eVar) {
        eVar.getSettings().setMixedContentMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setMixedContentMode$35(C6144e eVar) {
        eVar.getSettings().setMixedContentMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setMixedContentMode$36(C6144e eVar) {
        eVar.getSettings().setMixedContentMode(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setOverScrollMode$13(Integer num, C6144e eVar) {
        eVar.setOverScrollMode(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSaveFormDataDisabled$23(boolean z, C6144e eVar) {
        eVar.getSettings().setSaveFormData(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setScalesPageToFit$17(boolean z, C6144e eVar) {
        eVar.getSettings().setLoadWithOverviewMode(z);
        eVar.getSettings().setUseWideViewPort(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSource$31(ReadableMap readableMap, C6144e eVar) {
        byte[] bArr;
        String str;
        if (eVar.f12522p == null || eVar.m26143i(readableMap)) {
            eVar.setSource(readableMap);
            if (readableMap != null) {
                if (readableMap.hasKey("html")) {
                    String string = readableMap.getString("html");
                    if (readableMap.hasKey("baseUrl")) {
                        str = readableMap.getString("baseUrl");
                    } else {
                        str = "";
                    }
                    eVar.loadDataWithBaseURL(str, string, HTML_MIME_TYPE, HTML_ENCODING, null);
                    return;
                } else if (readableMap.hasKey("uri")) {
                    String string2 = readableMap.getString("uri");
                    String url = eVar.getUrl();
                    if (url != null && url.equals(string2)) {
                        return;
                    }
                    if (!readableMap.hasKey("method") || !readableMap.getString("method").equalsIgnoreCase(HTTP_METHOD_POST)) {
                        HashMap hashMap = new HashMap();
                        if (readableMap.hasKey("headers")) {
                            ReadableMap map = readableMap.getMap("headers");
                            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                            while (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                if (!"user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                    hashMap.put(nextKey, map.getString(nextKey));
                                } else if (eVar.getSettings() != null) {
                                    eVar.getSettings().setUserAgentString(map.getString(nextKey));
                                }
                            }
                        }
                        eVar.loadUrl(string2, hashMap);
                        return;
                    }
                    if (readableMap.hasKey("body")) {
                        String string3 = readableMap.getString("body");
                        try {
                            bArr = string3.getBytes(HTML_ENCODING);
                        } catch (UnsupportedEncodingException unused) {
                            bArr = string3.getBytes();
                        }
                    } else {
                        bArr = null;
                    }
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    eVar.postUrl(string2, bArr);
                    return;
                }
            }
            eVar.loadUrl(BLANK_URL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSupportMultipleWindows$3(boolean z, C6144e eVar) {
        eVar.getSettings().setSupportMultipleWindows(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setTextZoom$16(int i, C6144e eVar) {
        eVar.getSettings().setTextZoom(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setThirdPartyCookiesEnabled$15(boolean z, C6144e eVar) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(eVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUrlPrefixesForDefaultIntent$37(ReadableArray readableArray, C6144e eVar) {
        C6149g rNCWebViewClient = eVar.getRNCWebViewClient();
        if (rNCWebViewClient != null && readableArray != null) {
            rNCWebViewClient.m26126f(readableArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setWebViewKey$4(String str, C6158b bVar, Map map, Map map2, C6144e eVar) {
        eVar.setWebViewKey(str);
        C6161b1.f12579a.m26110c().put(Integer.valueOf(eVar.getId()), Integer.valueOf(bVar.getId()));
        map.put(str, eVar);
        map2.put(str, bVar);
    }

    protected C6144e createInternalWebViewInstance(ThemedReactContext themedReactContext) {
        return new C6144e(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.builder().put("goBack", 1).put("goForward", 2).put("reload", 3).put("stopLoading", 4).put("postMessage", 5).put("injectJavaScript", 6).put("loadUrl", 7).put("requestFocus", 8).put("clearFormData", Integer.valueOf((int) COMMAND_CLEAR_FORM_DATA)).put("clearCache", Integer.valueOf((int) COMMAND_CLEAR_CACHE)).put("clearHistory", Integer.valueOf((int) COMMAND_CLEAR_HISTORY)).put("release", Integer.valueOf((int) COMMAND_RELEASE)).build();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", MapBuilder.m30831of("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", MapBuilder.m30831of("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.m30831of("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", MapBuilder.m30831of("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", MapBuilder.m30831of("registrationName", "onRenderProcessGone"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(C6158b bVar, final Boolean bool) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.d
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setAllowFileAccess$39(bool, eVar);
            }
        });
    }

    @ReactProp(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.q0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setAllowFileAccessFromFileURLs$21(z, eVar);
            }
        });
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.d0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setAllowUniversalAccessFromFileURLs$22(z, eVar);
            }
        });
    }

    @ReactProp(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(final C6158b bVar, Boolean bool) {
        boolean z;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.mAllowsFullscreenVideo = z;
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.f
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.this.lambda$setAllowsFullscreenVideo$38(bVar, eVar);
            }
        });
    }

    @ReactProp(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(C6158b bVar, String str) {
        if (str != null) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(bVar.getContext());
            this.mUserAgentWithApplicationName = defaultUserAgent + " " + str;
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        bVar.m26114d(new C6206w(this));
    }

    @ReactProp(name = "androidAssetLoaderConfig")
    public void setAssetLoaderConfig(C6158b bVar, ReadableMap readableMap) {
        C14519c.C14521b bVar2 = new C14519c.C14521b();
        String string = readableMap.getString("domain");
        if (string != null) {
            bVar2.m278c(string);
        }
        if (readableMap.hasKey("httpAllowed")) {
            bVar2.m277d(readableMap.getBoolean("httpAllowed"));
        }
        ReadableArray array = readableMap.getArray("pathHandlers");
        if (array == null || array.size() <= 0) {
            C13925a.m2304H(TAG, "WebViewAssetLoader error. No Path Handlers found.");
        } else {
            for (int i = 0; i < array.size(); i++) {
                ReadableMap map = array.getMap(i);
                String string2 = map.getString("type");
                if (string2 == null) {
                    C13925a.m2304H(TAG, "WebViewAssetLoader error. Path Handler type is null.");
                } else if (!this.assetLoaderHandlerTypes.contains(string2)) {
                    C13925a.m2304H(TAG, "WebViewAssetLoader error. Skipping Path Handler. Unexpected handler type: " + string2 + ". Path Handler type must be one of " + this.assetLoaderHandlerTypes);
                } else {
                    String string3 = map.getString("path");
                    if (string3 == null) {
                        C13925a.m2304H(TAG, "WebViewAssetLoader error. Skipping Path Handler. Handler path is missing");
                    } else if (string2.equals("resources")) {
                        bVar2.m280a(string3, new C14519c.C14524f(bVar.getContext()));
                    } else if (string2.equals("assets")) {
                        bVar2.m280a(string3, new C14519c.C14520a(bVar.getContext()));
                    } else if (string2.equals("internal")) {
                        String string4 = map.getString("directory");
                        if (string4 == null) {
                            C13925a.m2304H(TAG, "WebViewAssetLoader error. Skipping Path Handler. Directory is missing for internal handler path");
                        } else {
                            bVar2.m280a(string3, new C14519c.C0474c(bVar.getContext(), new File(string4)));
                        }
                    }
                }
            }
        }
        final C14519c b = bVar2.m279b();
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.i0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setWebViewAssetLoader(C14519c.this);
            }
        });
    }

    @ReactProp(name = "basicAuthCredential")
    public void setBasicAuthCredential(C6158b bVar, final ReadableMap readableMap) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.z
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setBasicAuthCredential$32(ReadableMap.this, eVar);
            }
        });
    }

    @ReactProp(name = "setBuiltInZoomControls")
    public void setBuiltInZoomControls(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.j
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setBuiltInZoomControls$1(z, eVar);
            }
        });
    }

    @ReactProp(name = "cacheEnabled")
    public void setCacheEnabled(C6158b bVar, boolean z) {
        if (!z) {
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.m
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    RNCWebViewManager.lambda$setCacheEnabled$8(eVar);
                }
            });
        } else if (bVar.getContext() != null) {
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.l
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    RNCWebViewManager.lambda$setCacheEnabled$7(eVar);
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(name = "cacheMode")
    public void setCacheMode(C6158b bVar, String str) {
        boolean z;
        final int i;
        switch (str.hashCode()) {
            case -2059164003:
                if (str.equals("LOAD_NO_CACHE")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case -1215135800:
                if (str.equals("LOAD_DEFAULT")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case -873877826:
                if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1548620642:
                if (str.equals("LOAD_CACHE_ONLY")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (!z) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (!z) {
            i = -1;
        } else {
            i = 2;
        }
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.x
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setCacheMode$9(i, eVar);
            }
        });
    }

    @ReactProp(name = "setDisplayZoomControls")
    public void setDisplayZoomControls(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.o0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setDisplayZoomControls$2(z, eVar);
            }
        });
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.v0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setDomStorageEnabled$18(z, eVar);
            }
        });
    }

    @ReactProp(name = "forceDarkOn")
    public void setForceDarkOn(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.n0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setForceDarkOn$42(z, eVar);
            }
        });
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(C6158b bVar, final Boolean bool) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.e0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setGeolocationEnabled$40(bool, eVar);
            }
        });
    }

    @ReactProp(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(C6158b bVar, boolean z) {
        if (z) {
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.x0
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    eVar.setLayerType(1, null);
                }
            });
        }
    }

    @ReactProp(name = "incognito")
    public void setIncognito(C6158b bVar, boolean z) {
        if (z) {
            CookieManager.getInstance().removeAllCookies(null);
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.s
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    RNCWebViewManager.lambda$setIncognito$30(eVar);
                }
            });
        }
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(C6158b bVar, final String str) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.l0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setInjectedJavaScript(str);
            }
        });
    }

    @ReactProp(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(C6158b bVar, final String str) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.e
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setInjectedJavaScriptBeforeContentLoaded(str);
            }
        });
    }

    @ReactProp(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.r0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(z);
            }
        });
    }

    @ReactProp(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.m0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setInjectedJavaScriptForMainFrameOnly(z);
            }
        });
    }

    @ReactProp(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.p0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setJavaScriptCanOpenWindowsAutomatically$20(z, eVar);
            }
        });
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.h0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setJavaScriptEnabled$0(z, eVar);
            }
        });
    }

    @ReactProp(name = "androidLayerType")
    public void setLayerType(C6158b bVar, String str) {
        final int i;
        str.hashCode();
        if (str.equals("hardware")) {
            i = 2;
        } else if (!str.equals("software")) {
            i = 0;
        } else {
            i = 1;
        }
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.j0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setLayerType(i, null);
            }
        });
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.i
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setMediaPlaybackRequiresUserAction$19(z, eVar);
            }
        });
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.g
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setMessagingEnabled(z);
            }
        });
    }

    @ReactProp(name = "messagingModuleName")
    public void setMessagingModuleName(C6158b bVar, final String str) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.r
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setMessagingModuleName(str);
            }
        });
    }

    @ReactProp(name = "minimumFontSize")
    public void setMinimumFontSize(C6158b bVar, final int i) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.c
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setMinimumFontSize$43(i, eVar);
            }
        });
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(C6158b bVar, String str) {
        if (str == null || ReactScrollViewHelper.OVER_SCROLL_NEVER.equals(str)) {
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.t
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    RNCWebViewManager.lambda$setMixedContentMode$34(eVar);
                }
            });
        } else if (ReactScrollViewHelper.OVER_SCROLL_ALWAYS.equals(str)) {
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.u
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    RNCWebViewManager.lambda$setMixedContentMode$35(eVar);
                }
            });
        } else if ("compatibility".equals(str)) {
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.v
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    RNCWebViewManager.lambda$setMixedContentMode$36(eVar);
                }
            });
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.f0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setNestedScrollEnabled(z);
            }
        });
    }

    @ReactProp(name = "onContentSizeChange")
    public void setOnContentSizeChange(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.w0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setSendContentSizeChangeEvents(z);
            }
        });
    }

    @ReactProp(name = "onScroll")
    public void setOnScroll(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.s0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setHasScrollEvent(z);
            }
        });
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(C6158b bVar, String str) {
        char c;
        final int i;
        int hashCode = str.hashCode();
        if (hashCode == -1414557169) {
            if (str.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 104712844) {
            if (hashCode == 951530617 && str.equals("content")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            i = 2;
        } else if (c != 1) {
            i = 0;
        } else {
            i = 1;
        }
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.n
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setOverScrollMode$13(i, eVar);
            }
        });
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.g0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setSaveFormDataDisabled$23(z, eVar);
            }
        });
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.c0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setScalesPageToFit$17(z, eVar);
            }
        });
    }

    @ReactProp(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.q
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setHorizontalScrollBarEnabled(z);
            }
        });
    }

    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.y
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                eVar.setVerticalScrollBarEnabled(z);
            }
        });
    }

    @ReactProp(name = "source")
    public void setSource(C6158b bVar, final ReadableMap readableMap) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.k
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setSource$31(ReadableMap.this, eVar);
            }
        });
    }

    @ReactProp(name = "setSupportMultipleWindows")
    public void setSupportMultipleWindows(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.b0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setSupportMultipleWindows$3(z, eVar);
            }
        });
    }

    @ReactProp(name = "temporaryParentNodeTag")
    public void setTemporaryParentNodeTag(C6158b bVar, int i) {
        bVar.f12575k = i;
    }

    @ReactProp(name = "textZoom")
    public void setTextZoom(C6158b bVar, final int i) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.k0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setTextZoom$16(i, eVar);
            }
        });
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(C6158b bVar, final boolean z) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.a0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setThirdPartyCookiesEnabled$15(z, eVar);
            }
        });
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(C6158b bVar, final ReadableArray readableArray) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.u0
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$setUrlPrefixesForDefaultIntent$37(ReadableArray.this, eVar);
            }
        });
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(C6158b bVar, String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        bVar.m26114d(new C6206w(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    @ReactProp(name = "webViewKey")
    public void setWebViewKey(final C6158b bVar, final String str) {
        C6161b1 b1Var = C6161b1.f12579a;
        final Map<String, WebView> a = b1Var.m26112a();
        final Map<String, C6158b> b = b1Var.m26111b();
        if (b.containsKey(str)) {
            C6144e b2 = b.get(str).m26116b();
            bVar.m26117a(b2);
            setupWebChromeClient((ThemedReactContext) b2.getContext(), b2);
        } else if (a.containsKey(str)) {
            C6144e eVar = (C6144e) a.get(str);
            ViewGroup viewGroup = (ViewGroup) eVar.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(eVar);
            }
            bVar.m26117a(eVar);
        }
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.p
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar2) {
                RNCWebViewManager.lambda$setWebViewKey$4(str, bVar, a, b, eVar2);
            }
        });
    }

    protected void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        Activity currentActivity = reactContext.getCurrentActivity();
        if (!this.mAllowsFullscreenVideo || currentActivity == null) {
            C6148f fVar = this.mWebChromeClient;
            if (fVar != null) {
                fVar.onHideCustomView();
            }
            C6143d dVar = new C6143d(reactContext, webView);
            this.mWebChromeClient = dVar;
            webView.setWebChromeClient(dVar);
            return;
        }
        C6142c cVar = new C6142c(reactContext, webView, currentActivity, currentActivity.getRequestedOrientation());
        this.mWebChromeClient = cVar;
        webView.setWebChromeClient(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, C6158b bVar) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.o
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$addEventEmitters$44(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public C6158b createViewInstance(ThemedReactContext themedReactContext) {
        C6158b bVar = new C6158b(themedReactContext);
        C6144e createInternalWebViewInstance = createInternalWebViewInstance(themedReactContext);
        bVar.m26117a(createInternalWebViewInstance);
        C6161b1.f12579a.m26110c().put(Integer.valueOf(createInternalWebViewInstance.getId()), Integer.valueOf(bVar.getId()));
        setupWebChromeClient(themedReactContext, createInternalWebViewInstance);
        themedReactContext.addLifecycleEventListener(createInternalWebViewInstance);
        this.mWebViewConfig.mo26109a(createInternalWebViewInstance);
        WebSettings settings = createInternalWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        boolean z = false;
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs(bVar, false);
        setMixedContentMode(bVar, ReactScrollViewHelper.OVER_SCROLL_NEVER);
        if ((themedReactContext.getApplicationInfo().flags & 2) != 0) {
            z = true;
        }
        if (z) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        createInternalWebViewInstance.setDownloadListener(new C6141b(createInternalWebViewInstance, themedReactContext));
        return bVar;
    }

    public void onDropViewInstance(final C6158b bVar) {
        super.onDropViewInstance((RNCWebViewManager) bVar);
        if (bVar.getWebView() != null) {
            bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.t0
                @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
                /* renamed from: a */
                public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                    RNCWebViewManager.this.lambda$onDropViewInstance$46(bVar, eVar);
                }
            });
        }
    }

    public void receiveCommand(C6158b bVar, final int i, final ReadableArray readableArray) {
        bVar.m26114d(new C6158b.AbstractC0183b() { // from class: com.reactnativecommunity.webview.h
            @Override // com.reactnativecommunity.webview.C6158b.AbstractC0183b
            /* renamed from: a */
            public final void mo26108a(RNCWebViewManager.C6144e eVar) {
                RNCWebViewManager.lambda$receiveCommand$45(i, readableArray, eVar);
            }
        });
    }

    public RNCWebViewManager(AbstractC6173f1 f1Var) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.assetLoaderHandlerTypes = new HashSet(Arrays.asList("assets", "internal", "resources"));
        this.mWebViewConfig = f1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$g */
    /* loaded from: classes6.dex */
    public static class C6149g extends WebViewClient {

        /* renamed from: b */
        protected ReadableArray f12554b;

        /* renamed from: f */
        protected C14519c f12558f;

        /* renamed from: a */
        protected boolean f12553a = false;

        /* renamed from: c */
        protected C6144e.C6146b f12555c = null;

        /* renamed from: d */
        protected String f12556d = null;

        /* renamed from: e */
        protected C6155a f12557e = null;

        protected C6149g() {
        }

        /* renamed from: a */
        protected WritableMap m26131a(WebView webView, String str) {
            boolean z;
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(TouchesHelper.TARGET_KEY, C6158b.m26115c(webView));
            createMap.putString("url", str);
            if (this.f12553a || webView.getProgress() == 100) {
                z = false;
            } else {
                z = true;
            }
            createMap.putBoolean("loading", z);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        /* renamed from: b */
        protected void m26130b(WebView webView, String str) {
            ((C6144e) webView).m26145g(webView, new C1373c(C6158b.m26115c(webView), m26131a(webView, str)));
        }

        /* renamed from: c */
        public void m26129c(C6155a aVar) {
            this.f12557e = aVar;
        }

        /* renamed from: d */
        public void m26128d(String str) {
            this.f12556d = str;
        }

        /* renamed from: e */
        public void m26127e(C6144e.C6146b bVar) {
            this.f12555c = bVar;
        }

        /* renamed from: f */
        public void m26126f(ReadableArray readableArray) {
            this.f12554b = readableArray;
        }

        /* renamed from: g */
        public void m26125g(C14519c cVar) {
            this.f12558f = cVar;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f12553a) {
                ((C6144e) webView).m26150b();
                m26130b(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f12553a = false;
            C6144e eVar = (C6144e) webView;
            eVar.m26149c();
            eVar.m26145g(webView, new C1377e(C6158b.m26115c(webView), m26131a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            String str3 = this.f12556d;
            if (str3 == null || !str2.equals(str3) || i != -1 || !str.equals("net::ERR_FAILED")) {
                super.onReceivedError(webView, i, str, str2);
                this.f12553a = true;
                m26130b(webView, str2);
                WritableMap a = m26131a(webView, str2);
                a.putDouble("code", i);
                a.putString("description", str);
                ((C6144e) webView).m26145g(webView, new C1371b(C6158b.m26115c(webView), a));
                return;
            }
            m26128d(null);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            C6155a aVar = this.f12557e;
            if (aVar != null) {
                httpAuthHandler.proceed(aVar.f12572a, aVar.f12573b);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap a = m26131a(webView, webResourceRequest.getUrl().toString());
                a.putInt("statusCode", webResourceResponse.getStatusCode());
                a.putString("description", webResourceResponse.getReasonPhrase());
                ((C6144e) webView).m26145g(webView, new C1370a(C6158b.m26115c(webView), a));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            String url = webView.getUrl();
            String url2 = sslError.getUrl();
            sslErrorHandler.cancel();
            if (!url.equalsIgnoreCase(url2)) {
                Log.w(RNCWebViewManager.TAG, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
                return;
            }
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 0) {
                str = "The certificate is not yet valid";
            } else if (primaryError == 1) {
                str = "The certificate has expired";
            } else if (primaryError == 2) {
                str = "Hostname mismatch";
            } else if (primaryError == 3) {
                str = "The certificate authority is not trusted";
            } else if (primaryError == 4) {
                str = "The date of the certificate is invalid";
            } else if (primaryError != 5) {
                str = "Unknown SSL Error";
            } else {
                str = "A generic error occurred";
            }
            onReceivedError(webView, primaryError, "SSL error: " + str, url2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            boolean didCrash2;
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            didCrash = renderProcessGoneDetail.didCrash();
            if (didCrash) {
                Log.e(RNCWebViewManager.TAG, "The WebView rendering process crashed.");
            } else {
                Log.w(RNCWebViewManager.TAG, "The WebView rendering process was killed by the system.");
            }
            if (webView == null) {
                return true;
            }
            WritableMap a = m26131a(webView, webView.getUrl());
            didCrash2 = renderProcessGoneDetail.didCrash();
            a.putBoolean("didCrash", didCrash2);
            ((C6144e) webView).m26145g(webView, new C1381g(C6158b.m26115c(webView), a));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            C14519c cVar = this.f12558f;
            if (cVar == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            return cVar.m281a(webResourceRequest.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C6144e eVar = (C6144e) webView;
            boolean z = true;
            if ((((ReactContext) webView.getContext()).getJavaScriptContextHolder().get() == 0) || eVar.f12525s == null) {
                C13925a.m2304H(RNCWebViewManager.TAG, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
                this.f12555c.m26138b(true);
                ((C6144e) webView).m26145g(webView, new C1383h(C6158b.m26115c(webView), m26131a(webView, str)));
                return true;
            }
            C2515e<Integer, AtomicReference<RNCWebViewModule.C6153d.EnumC6154a>> b = RNCWebViewModule.shouldOverrideUrlLoadingLock.m26120b();
            int intValue = b.f3485a.intValue();
            AtomicReference<RNCWebViewModule.C6153d.EnumC6154a> atomicReference = b.f3486b;
            WritableMap a = m26131a(webView, str);
            a.putInt("lockIdentifier", intValue);
            eVar.m26140l("onShouldStartLoadWithRequest", a);
            try {
                synchronized (atomicReference) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    while (atomicReference.get() == RNCWebViewModule.C6153d.EnumC6154a.UNDECIDED) {
                        if (SystemClock.elapsedRealtime() - elapsedRealtime > 250) {
                            C13925a.m2304H(RNCWebViewManager.TAG, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                            RNCWebViewModule.shouldOverrideUrlLoadingLock.m26119c(Integer.valueOf(intValue));
                            return false;
                        }
                        atomicReference.wait(250L);
                    }
                    if (atomicReference.get() != RNCWebViewModule.C6153d.EnumC6154a.SHOULD_OVERRIDE) {
                        z = false;
                    }
                    RNCWebViewModule.shouldOverrideUrlLoadingLock.m26119c(Integer.valueOf(intValue));
                    return z;
                }
            } catch (InterruptedException e) {
                C13925a.m2287k(RNCWebViewManager.TAG, "shouldOverrideUrlLoading was interrupted while waiting for result.", e);
                RNCWebViewModule.shouldOverrideUrlLoadingLock.m26119c(Integer.valueOf(intValue));
                return false;
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }
}
