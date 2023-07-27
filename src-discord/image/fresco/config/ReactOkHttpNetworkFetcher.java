package com.discord.image.fresco.config;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;



public class ReactOkHttpNetworkFetcher extends OkHttpNetworkFetcher {
    private static final String TAG = "ReactOkHttpNetworkFetcher";
    private final Executor mCancellationExecutor;
    private final OkHttpClient mOkHttpClient;

    public ReactOkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.mOkHttpClient = okHttpClient;
        this.mCancellationExecutor = okHttpClient.r().d();
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

    @Override 
    public void fetch(OkHttpNetworkFetcher.OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback) {
        okHttpNetworkFetchState.f7796f = SystemClock.elapsedRealtime();
        Uri g10 = okHttpNetworkFetchState.g();
        Map<String, String> headers = okHttpNetworkFetchState.b().d() instanceof ReactNetworkImageRequest ? getHeaders(((ReactNetworkImageRequest) okHttpNetworkFetchState.b().d()).getHeaders()) : null;
        if (headers == null) {
            headers = Collections.emptyMap();
        }
        fetchWithRequest(okHttpNetworkFetchState, callback, new Request.Builder().c(new CacheControl.a().e().a()).l(g10.toString()).f(Headers.h(headers)).d().b());
    }
}
