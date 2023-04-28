package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.io.InputStream;
import java.util.Map;
import p007a6.C1271b;
import p163j$.util.Spliterator;
import p380v5.C13434e;
import p380v5.EnumC13435f;
import p455z3.AbstractC14529a;
import p455z3.AbstractC14537h;
import p455z3.AbstractC14539j;

/* renamed from: com.facebook.imagepipeline.producers.h0 */
/* loaded from: classes7.dex */
public class C4978h0 implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    protected final AbstractC14537h f8452a;

    /* renamed from: b */
    private final AbstractC14529a f8453b;

    /* renamed from: c */
    private final NetworkFetcher f8454c;

    /* renamed from: com.facebook.imagepipeline.producers.h0$a */
    /* loaded from: classes7.dex */
    class C4979a implements NetworkFetcher.Callback {

        /* renamed from: a */
        final /* synthetic */ FetchState f8455a;

        C4979a(FetchState fetchState) {
            this.f8455a = fetchState;
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        /* renamed from: a */
        public void mo31084a() {
            C4978h0.this.m31088k(this.f8455a);
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        /* renamed from: b */
        public void mo31083b(InputStream inputStream, int i) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("NetworkFetcher->onResponse");
            }
            C4978h0.this.m31086m(this.f8455a, inputStream, i);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        public void onFailure(Throwable th2) {
            C4978h0.this.m31087l(this.f8455a, th2);
        }
    }

    public C4978h0(AbstractC14537h hVar, AbstractC14529a aVar, NetworkFetcher networkFetcher) {
        this.f8452a = hVar;
        this.f8453b = aVar;
        this.f8454c = networkFetcher;
    }

    /* renamed from: e */
    protected static float m31094e(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp((-i) / 50000.0d));
    }

    /* renamed from: f */
    private Map<String, String> m31093f(FetchState fetchState, int i) {
        if (!fetchState.m31222d().mo2243f(fetchState.m31224b(), "NetworkFetchProducer")) {
            return null;
        }
        return this.f8454c.getExtraMap(fetchState, i);
    }

    /* renamed from: j */
    protected static void m31089j(AbstractC14539j jVar, int i, BytesRange bytesRange, Consumer<C13434e> consumer, ProducerContext producerContext) {
        Throwable th2;
        CloseableReference S = CloseableReference.m32035S(jVar.mo258b());
        C13434e eVar = null;
        try {
            C13434e eVar2 = new C13434e(S);
            try {
                eVar2.m3722H0(bytesRange);
                eVar2.m3697w0();
                producerContext.mo31160k(EnumC13435f.NETWORK);
                consumer.mo31199b(eVar2, i);
                C13434e.m3706h(eVar2);
                CloseableReference.m32025t(S);
            } catch (Throwable th3) {
                th2 = th3;
                eVar = eVar2;
                C13434e.m3706h(eVar);
                CloseableReference.m32025t(S);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m31088k(FetchState fetchState) {
        fetchState.m31222d().mo2245c(fetchState.m31224b(), "NetworkFetchProducer", null);
        fetchState.m31225a().mo31200a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m31087l(FetchState fetchState, Throwable th2) {
        fetchState.m31222d().mo2240k(fetchState.m31224b(), "NetworkFetchProducer", th2, null);
        fetchState.m31222d().mo2246b(fetchState.m31224b(), "NetworkFetchProducer", false);
        fetchState.m31224b().mo31164g("network");
        fetchState.m31225a().onFailure(th2);
    }

    /* renamed from: n */
    private boolean m31085n(FetchState fetchState) {
        if (!fetchState.m31224b().mo31162i()) {
            return false;
        }
        return this.f8454c.shouldPropagate(fetchState);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        producerContext.mo31163h().mo2244d(producerContext, "NetworkFetchProducer");
        FetchState createFetchState = this.f8454c.createFetchState(consumer, producerContext);
        this.f8454c.fetch(createFetchState, new C4979a(createFetchState));
    }

    /* renamed from: g */
    protected long m31092g() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: h */
    protected void m31091h(AbstractC14539j jVar, FetchState fetchState) {
        Map<String, String> f = m31093f(fetchState, jVar.size());
        AbstractC5011n0 d = fetchState.m31222d();
        d.mo2241j(fetchState.m31224b(), "NetworkFetchProducer", f);
        d.mo2246b(fetchState.m31224b(), "NetworkFetchProducer", true);
        fetchState.m31224b().mo31164g("network");
        m31089j(jVar, fetchState.m31221e() | 1, fetchState.m31220f(), fetchState.m31225a(), fetchState.m31224b());
    }

    /* renamed from: i */
    protected void m31090i(AbstractC14539j jVar, FetchState fetchState) {
        long g = m31092g();
        if (m31085n(fetchState) && g - fetchState.m31223c() >= 100) {
            fetchState.m31218h(g);
            fetchState.m31222d().mo2242h(fetchState.m31224b(), "NetworkFetchProducer", "intermediate_result");
            m31089j(jVar, fetchState.m31221e(), fetchState.m31220f(), fetchState.m31225a(), fetchState.m31224b());
        }
    }

    /* renamed from: m */
    protected void m31086m(FetchState fetchState, InputStream inputStream, int i) {
        AbstractC14539j jVar;
        if (i > 0) {
            jVar = this.f8452a.mo259e(i);
        } else {
            jVar = this.f8452a.mo261c();
        }
        byte[] bArr = this.f8453b.get(Spliterator.SUBSIZED);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f8454c.onFetchCompletion(fetchState, jVar.size());
                    m31091h(jVar, fetchState);
                    return;
                } else if (read > 0) {
                    jVar.write(bArr, 0, read);
                    m31090i(jVar, fetchState);
                    fetchState.m31225a().mo31198c(m31094e(jVar.size(), i));
                }
            } finally {
                this.f8453b.release(bArr);
                jVar.close();
            }
        }
    }
}
