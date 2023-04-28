package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.FetchState;
import java.io.InputStream;
import java.util.Map;
import p380v5.C13434e;

/* loaded from: classes7.dex */
public interface NetworkFetcher<FETCH_STATE extends FetchState> {

    /* loaded from: classes7.dex */
    public interface Callback {
        /* renamed from: a */
        void mo31084a();

        /* renamed from: b */
        void mo31083b(InputStream inputStream, int i);

        void onFailure(Throwable th2);
    }

    FETCH_STATE createFetchState(Consumer<C13434e> consumer, ProducerContext producerContext);

    void fetch(FETCH_STATE fetch_state, Callback callback);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i);

    void onFetchCompletion(FETCH_STATE fetch_state, int i);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
