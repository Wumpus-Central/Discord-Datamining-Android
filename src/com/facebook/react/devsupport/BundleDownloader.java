package com.facebook.react.devsupport;

import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import fk.C7366m;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import org.json.JSONException;
import org.json.JSONObject;
import p059d6.C6399a;
import p307qj.AbstractC12216d;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class BundleDownloader {
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;
    private static final String TAG = "BundleDownloader";
    private final OkHttpClient mClient;
    private Call mDownloadBundleFromURLCall;

    /* loaded from: classes7.dex */
    public static class BundleInfo {
        private int mFilesChangedCount;
        private String mUrl;

        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mUrl = jSONObject.getString("url");
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException e) {
                C13925a.m2287k(BundleDownloader.TAG, "Invalid bundle info: ", e);
                return null;
            }
        }

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }

        public String getUrl() {
            String str = this.mUrl;
            return str != null ? str : "unknown";
        }

        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e) {
                C13925a.m2287k(BundleDownloader.TAG, "Can't serialize bundle info: ", e);
                return null;
            }
        }
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    private static void populateBundleInfo(String str, Headers headers, BundleInfo bundleInfo) {
        bundleInfo.mUrl = str;
        String a = headers.m10072a("X-Metro-Files-Changed-Count");
        if (a != null) {
            try {
                bundleInfo.mFilesChangedCount = Integer.parseInt(a);
            } catch (NumberFormatException unused) {
                bundleInfo.mFilesChangedCount = FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processBundleResult(String str, int i, Headers headers, BufferedSource bufferedSource, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) {
        if (i != 200) {
            String s0 = bufferedSource.mo9726s0();
            DebugServerException parse = DebugServerException.parse(str, s0);
            if (parse != null) {
                devBundleDownloadListener.onFailure(parse);
                return;
            }
            devBundleDownloadListener.onFailure(new DebugServerException("The development server returned response error code: " + i + "\n\nURL: " + str + "\n\nBody:\n" + s0));
            return;
        }
        if (bundleInfo != null) {
            populateBundleInfo(str, headers, bundleInfo);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (!storePlainJSInFile(bufferedSource, file2) || file2.renameTo(file)) {
            devBundleDownloadListener.onSuccess();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMultipartResponse(final String str, final Response response, String str2, final File file, final BundleInfo bundleInfo, final DevBundleDownloadListener devBundleDownloadListener) {
        if (!new MultipartStreamReader(response.m9845b().source(), str2).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader.2
            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z) {
                String str3;
                Integer num;
                if (z) {
                    int l = response.m9839l();
                    if (map.containsKey("X-Http-Status")) {
                        l = Integer.parseInt(map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str, l, Headers.m10069g(map), buffer, file, bundleInfo, devBundleDownloadListener);
                } else if (map.containsKey("Content-Type") && map.get("Content-Type").equals("application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(buffer.mo9726s0());
                        if (jSONObject.has("status")) {
                            str3 = jSONObject.getString("status");
                        } else {
                            str3 = "Bundling";
                        }
                        Integer num2 = null;
                        if (jSONObject.has("done")) {
                            num = Integer.valueOf(jSONObject.getInt("done"));
                        } else {
                            num = null;
                        }
                        if (jSONObject.has("total")) {
                            num2 = Integer.valueOf(jSONObject.getInt("total"));
                        }
                        devBundleDownloadListener.onProgress(str3, num, num2);
                    } catch (JSONException e) {
                        C13925a.m2288j(ReactConstants.TAG, "Error parsing progress JSON. " + e.toString());
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> map, long j, long j2) {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener.onProgress("Downloading", Integer.valueOf((int) (j / 1024)), Integer.valueOf((int) (j2 / 1024)));
                }
            }
        })) {
            devBundleDownloadListener.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.m9839l() + "\n\nURL: " + str.toString() + "\n\n"));
        }
    }

    private static boolean storePlainJSInFile(BufferedSource bufferedSource, File file) {
        Sink sink;
        Throwable th2;
        try {
            sink = C7366m.m22817f(file);
        } catch (Throwable th3) {
            th2 = th3;
            sink = null;
        }
        try {
            bufferedSource.mo9723x0(sink);
            if (sink == null) {
                return true;
            }
            sink.close();
            return true;
        } catch (Throwable th4) {
            th2 = th4;
            if (sink != null) {
                sink.close();
            }
            throw th2;
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo) {
        downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, new Request.Builder());
    }

    public void downloadBundleFromURL(final DevBundleDownloadListener devBundleDownloadListener, final File file, String str, final BundleInfo bundleInfo, Request.Builder builder) {
        Call call = (Call) C6399a.m25622c(this.mClient.mo9954a(builder.m9865l(str).m9876a("Accept", "multipart/mixed").m9875b()));
        this.mDownloadBundleFromURLCall = call;
        call.mo3413p(new AbstractC12216d() { // from class: com.facebook.react.devsupport.BundleDownloader.1
            @Override // p307qj.AbstractC12216d
            public void onFailure(Call call2, IOException iOException) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.mo3420i()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                String httpUrl = call2.mo3426b().m9877l().toString();
                DevBundleDownloadListener devBundleDownloadListener2 = devBundleDownloadListener;
                devBundleDownloadListener2.onFailure(DebugServerException.makeGeneric(httpUrl, "Could not connect to development server.", "URL: " + httpUrl, iOException));
            }

            @Override // p307qj.AbstractC12216d
            public void onResponse(Call call2, Response response) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.mo3420i()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                String httpUrl = response.m9844b0().m9877l().toString();
                Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.m9836r("content-type"));
                try {
                    if (matcher.find()) {
                        BundleDownloader.this.processMultipartResponse(httpUrl, response, matcher.group(1), file, bundleInfo, devBundleDownloadListener);
                    } else {
                        BundleDownloader.this.processBundleResult(httpUrl, response.m9839l(), response.m9833z(), C7366m.m22819d(response.m9845b().source()), file, bundleInfo, devBundleDownloadListener);
                    }
                    response.close();
                } catch (Throwable th2) {
                    try {
                        response.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        });
    }
}
