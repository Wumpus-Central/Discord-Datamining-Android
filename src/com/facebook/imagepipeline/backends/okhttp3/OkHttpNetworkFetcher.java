package com.facebook.imagepipeline.backends.okhttp3;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.producers.AbstractC4959c;
import com.facebook.imagepipeline.producers.C4965e;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.FetchState;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.ProducerContext;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p307qj.AbstractC12216d;
import p380v5.C13434e;

/* loaded from: classes7.dex */
public class OkHttpNetworkFetcher extends AbstractC4959c<OkHttpNetworkFetchState> {
    private static final String FETCH_TIME = "fetch_time";
    private static final String IMAGE_SIZE = "image_size";
    private static final String QUEUE_TIME = "queue_time";
    private static final String TOTAL_TIME = "total_time";
    private final CacheControl mCacheControl;
    private final Call.Factory mCallFactory;
    private Executor mCancellationExecutor;

    /* loaded from: classes7.dex */
    public static class OkHttpNetworkFetchState extends FetchState {

        /* renamed from: f */
        public long f8107f;

        /* renamed from: g */
        public long f8108g;

        /* renamed from: h */
        public long f8109h;

        public OkHttpNetworkFetchState(Consumer<C13434e> consumer, ProducerContext producerContext) {
            super(consumer, producerContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$a */
    /* loaded from: classes7.dex */
    public class C4896a extends C4965e {

        /* renamed from: a */
        final /* synthetic */ Call f8110a;

        /* renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$a$a */
        /* loaded from: classes7.dex */
        class RunnableC0118a implements Runnable {
            RunnableC0118a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4896a.this.f8110a.cancel();
            }
        }

        C4896a(Call call) {
            this.f8110a = call;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f8110a.cancel();
            } else {
                OkHttpNetworkFetcher.this.mCancellationExecutor.execute(new RunnableC0118a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$b */
    /* loaded from: classes7.dex */
    public class C4897b implements AbstractC12216d {

        /* renamed from: a */
        final /* synthetic */ OkHttpNetworkFetchState f8113a;

        /* renamed from: b */
        final /* synthetic */ NetworkFetcher.Callback f8114b;

        C4897b(OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback) {
            this.f8113a = okHttpNetworkFetchState;
            this.f8114b = callback;
        }

        @Override // p307qj.AbstractC12216d
        public void onFailure(Call call, IOException iOException) {
            OkHttpNetworkFetcher.this.handleException(call, iOException, this.f8114b);
        }

        @Override // p307qj.AbstractC12216d
        public void onResponse(Call call, Response response) {
            this.f8113a.f8108g = SystemClock.elapsedRealtime();
            ResponseBody b = response.m9845b();
            try {
                if (b == null) {
                    OkHttpNetworkFetcher.this.handleException(call, new IOException("Response body null: " + response), this.f8114b);
                    return;
                }
                try {
                } catch (Exception e) {
                    OkHttpNetworkFetcher.this.handleException(call, e, this.f8114b);
                }
                if (!response.m9847X()) {
                    OkHttpNetworkFetcher.this.handleException(call, new IOException("Unexpected HTTP code " + response), this.f8114b);
                    return;
                }
                BytesRange c = BytesRange.m31506c(response.m9836r("Content-Range"));
                if (!(c == null || (c.f8123a == 0 && c.f8124b == Integer.MAX_VALUE))) {
                    this.f8113a.m31216j(c);
                    this.f8113a.m31217i(8);
                }
                long contentLength = b.contentLength();
                if (contentLength < 0) {
                    contentLength = 0;
                }
                this.f8114b.mo31083b(b.byteStream(), (int) contentLength);
            } finally {
                b.close();
            }
        }
    }

    public OkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.m9941r().m10084d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleException(Call call, Exception exc, NetworkFetcher.Callback callback) {
        if (call.mo3420i()) {
            callback.mo31084a();
        } else {
            callback.onFailure(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void fetchWithRequest(OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback, Request request) {
        Call a = this.mCallFactory.mo9954a(request);
        okHttpNetworkFetchState.m31224b().mo31168c(new C4896a(a));
        a.mo3413p(new C4897b(okHttpNetworkFetchState, callback));
    }

    public OkHttpNetworkFetcher(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public OkHttpNetworkFetchState createFetchState(Consumer<C13434e> consumer, ProducerContext producerContext) {
        return new OkHttpNetworkFetchState(consumer, producerContext);
    }

    public void fetch(OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback) {
        okHttpNetworkFetchState.f8107f = SystemClock.elapsedRealtime();
        try {
            Request.Builder d = new Request.Builder().m9865l(okHttpNetworkFetchState.m31219g().toString()).m9873d();
            CacheControl cacheControl = this.mCacheControl;
            if (cacheControl != null) {
                d.m9874c(cacheControl);
            }
            BytesRange bytesRange = okHttpNetworkFetchState.m31224b().mo31159l().getBytesRange();
            if (bytesRange != null) {
                d.m9876a("Range", bytesRange.m31505d());
            }
            fetchWithRequest(okHttpNetworkFetchState, callback, d.m9875b());
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    public Map<String, String> getExtraMap(OkHttpNetworkFetchState okHttpNetworkFetchState, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(QUEUE_TIME, Long.toString(okHttpNetworkFetchState.f8108g - okHttpNetworkFetchState.f8107f));
        hashMap.put(FETCH_TIME, Long.toString(okHttpNetworkFetchState.f8109h - okHttpNetworkFetchState.f8108g));
        hashMap.put(TOTAL_TIME, Long.toString(okHttpNetworkFetchState.f8109h - okHttpNetworkFetchState.f8107f));
        hashMap.put(IMAGE_SIZE, Integer.toString(i));
        return hashMap;
    }

    public void onFetchCompletion(OkHttpNetworkFetchState okHttpNetworkFetchState, int i) {
        okHttpNetworkFetchState.f8109h = SystemClock.elapsedRealtime();
    }

    public OkHttpNetworkFetcher(Call.Factory factory, Executor executor, boolean z) {
        this.mCallFactory = factory;
        this.mCancellationExecutor = executor;
        this.mCacheControl = z ? new CacheControl.C11415a().m10091e().m10095a() : null;
    }
}
