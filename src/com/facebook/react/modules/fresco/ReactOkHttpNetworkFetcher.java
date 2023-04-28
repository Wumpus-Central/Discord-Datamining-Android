package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class ReactOkHttpNetworkFetcher extends OkHttpNetworkFetcher {
    private static final String TAG = "ReactOkHttpNetworkFetcher";
    private final Executor mCancellationExecutor;
    private final OkHttpClient mOkHttpClient;

    public ReactOkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.mOkHttpClient = okHttpClient;
        this.mCancellationExecutor = okHttpClient.m9941r().m10084d();
    }

    private Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher
    public void fetch(OkHttpNetworkFetcher.OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback) {
        okHttpNetworkFetchState.f8107f = SystemClock.elapsedRealtime();
        Uri g = okHttpNetworkFetchState.m31219g();
        Map<String, String> headers = okHttpNetworkFetchState.m31224b().mo31159l() instanceof ReactNetworkImageRequest ? getHeaders(((ReactNetworkImageRequest) okHttpNetworkFetchState.m31224b().mo31159l()).getHeaders()) : null;
        if (headers == null) {
            headers = Collections.emptyMap();
        }
        fetchWithRequest(okHttpNetworkFetchState, callback, new Request.Builder().m9874c(new CacheControl.C11415a().m10091e().m10095a()).m9865l(g.toString()).m9871f(Headers.m10069g(headers)).m9873d().m9875b());
    }
}
