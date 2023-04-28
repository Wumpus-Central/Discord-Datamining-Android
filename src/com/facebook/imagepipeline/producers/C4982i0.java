package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p022b2.AbstractC3371d;
import p022b2.C3373f;
import p163j$.util.Spliterator;
import p170j5.C9490c;
import p278p5.AbstractC11543f;
import p278p5.C11538e;
import p380v5.C13434e;
import p394w3.C13733f;
import p394w3.C13740j;
import p414x3.C13925a;
import p455z3.AbstractC14529a;
import p455z3.AbstractC14537h;
import p455z3.AbstractC14539j;

/* renamed from: com.facebook.imagepipeline.producers.i0 */
/* loaded from: classes7.dex */
public class C4982i0 implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final C11538e f8463a;

    /* renamed from: b */
    private final AbstractC11543f f8464b;

    /* renamed from: c */
    private final AbstractC14537h f8465c;

    /* renamed from: d */
    private final AbstractC14529a f8466d;

    /* renamed from: e */
    private final AbstractC5001l0<C13434e> f8467e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.i0$a */
    /* loaded from: classes7.dex */
    public class C4983a implements AbstractC3371d<C13434e, Void> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5011n0 f8468a;

        /* renamed from: b */
        final /* synthetic */ ProducerContext f8469b;

        /* renamed from: c */
        final /* synthetic */ Consumer f8470c;

        /* renamed from: d */
        final /* synthetic */ CacheKey f8471d;

        C4983a(AbstractC5011n0 n0Var, ProducerContext producerContext, Consumer consumer, CacheKey cacheKey) {
            this.f8468a = n0Var;
            this.f8469b = producerContext;
            this.f8470c = consumer;
            this.f8471d = cacheKey;
        }

        /* renamed from: b */
        public Void mo30992a(C3373f<C13434e> fVar) {
            if (C4982i0.m31076g(fVar)) {
                this.f8468a.mo2245c(this.f8469b, "PartialDiskCacheProducer", null);
                this.f8470c.mo31200a();
            } else if (fVar.m34568n()) {
                this.f8468a.mo2240k(this.f8469b, "PartialDiskCacheProducer", fVar.m34573i(), null);
                C4982i0.this.m31074i(this.f8470c, this.f8469b, this.f8471d, null);
            } else {
                C13434e j = fVar.m34572j();
                if (j != null) {
                    AbstractC5011n0 n0Var = this.f8468a;
                    ProducerContext producerContext = this.f8469b;
                    n0Var.mo2241j(producerContext, "PartialDiskCacheProducer", C4982i0.m31077f(n0Var, producerContext, true, j.m3714R()));
                    BytesRange e = BytesRange.m31504e(j.m3714R() - 1);
                    j.m3722H0(e);
                    int R = j.m3714R();
                    ImageRequest l = this.f8469b.mo31159l();
                    if (e.m31508a(l.getBytesRange())) {
                        this.f8469b.mo31166e("disk", "partial");
                        this.f8468a.mo2246b(this.f8469b, "PartialDiskCacheProducer", true);
                        this.f8470c.mo31199b(j, 9);
                    } else {
                        this.f8470c.mo31199b(j, 8);
                        C4982i0.this.m31074i(this.f8470c, new C5025r0(ImageRequestBuilder.m30891b(l).m30872u(BytesRange.m31507b(R - 1)).m30892a(), this.f8469b), this.f8471d, j);
                    }
                } else {
                    AbstractC5011n0 n0Var2 = this.f8468a;
                    ProducerContext producerContext2 = this.f8469b;
                    n0Var2.mo2241j(producerContext2, "PartialDiskCacheProducer", C4982i0.m31077f(n0Var2, producerContext2, false, 0));
                    C4982i0.this.m31074i(this.f8470c, this.f8469b, this.f8471d, j);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.i0$b */
    /* loaded from: classes7.dex */
    public class C4984b extends C4965e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f8473a;

        C4984b(AtomicBoolean atomicBoolean) {
            this.f8473a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            this.f8473a.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.i0$c */
    /* loaded from: classes7.dex */
    public static class C4985c extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private final C11538e f8475c;

        /* renamed from: d */
        private final CacheKey f8476d;

        /* renamed from: e */
        private final AbstractC14537h f8477e;

        /* renamed from: f */
        private final AbstractC14529a f8478f;

        /* renamed from: g */
        private final C13434e f8479g;

        /* synthetic */ C4985c(Consumer consumer, C11538e eVar, CacheKey cacheKey, AbstractC14537h hVar, AbstractC14529a aVar, C13434e eVar2, C4983a aVar2) {
            this(consumer, eVar, cacheKey, hVar, aVar, eVar2);
        }

        /* renamed from: p */
        private void m31071p(InputStream inputStream, OutputStream outputStream, int i) {
            byte[] bArr = this.f8478f.get(Spliterator.SUBSIZED);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min((int) Spliterator.SUBSIZED, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } finally {
                    this.f8478f.release(bArr);
                }
            }
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        /* renamed from: q */
        private AbstractC14539j m31070q(C13434e eVar, C13434e eVar2) {
            int i = ((BytesRange) C13740j.m2834g(eVar2.m3702n())).f8123a;
            AbstractC14539j e = this.f8477e.mo259e(eVar2.m3714R() + i);
            m31071p(eVar.m3726C(), e, i);
            m31071p(eVar2.m3726C(), e, eVar2.m3714R());
            return e;
        }

        /* renamed from: s */
        private void m31068s(AbstractC14539j jVar) {
            C13434e eVar;
            Throwable th2;
            CloseableReference S = CloseableReference.m32035S(jVar.mo258b());
            try {
                eVar = new C13434e(S);
                try {
                    eVar.m3697w0();
                    m31000o().mo31199b(eVar, 1);
                    C13434e.m3706h(eVar);
                    CloseableReference.m32025t(S);
                } catch (Throwable th3) {
                    th2 = th3;
                    C13434e.m3706h(eVar);
                    CloseableReference.m32025t(S);
                    throw th2;
                }
            } catch (Throwable th4) {
                eVar = null;
                th2 = th4;
            }
        }

        /* renamed from: r */
        public void mo30912h(C13434e eVar, int i) {
            if (!AbstractC4954b.m31196e(i)) {
                if (this.f8479g != null && eVar != null && eVar.m3702n() != null) {
                    try {
                        try {
                            m31068s(m31070q(this.f8479g, eVar));
                        } catch (IOException e) {
                            C13925a.m2287k("PartialDiskCacheProducer", "Error while merging image data", e);
                            m31000o().onFailure(e);
                        }
                        this.f8475c.m9416r(this.f8476d);
                    } finally {
                        eVar.close();
                        this.f8479g.close();
                    }
                } else if (!AbstractC4954b.m31192m(i, 8) || !AbstractC4954b.m31197d(i) || eVar == null || eVar.m3698t() == C9490c.f21023c) {
                    m31000o().mo31199b(eVar, i);
                } else {
                    this.f8475c.m9418p(this.f8476d, eVar);
                    m31000o().mo31199b(eVar, i);
                }
            }
        }

        private C4985c(Consumer<C13434e> consumer, C11538e eVar, CacheKey cacheKey, AbstractC14537h hVar, AbstractC14529a aVar, C13434e eVar2) {
            super(consumer);
            this.f8475c = eVar;
            this.f8476d = cacheKey;
            this.f8477e = hVar;
            this.f8478f = aVar;
            this.f8479g = eVar2;
        }
    }

    public C4982i0(C11538e eVar, AbstractC11543f fVar, AbstractC14537h hVar, AbstractC14529a aVar, AbstractC5001l0<C13434e> l0Var) {
        this.f8463a = eVar;
        this.f8464b = fVar;
        this.f8465c = hVar;
        this.f8466d = aVar;
        this.f8467e = l0Var;
    }

    /* renamed from: e */
    private static Uri m31078e(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* renamed from: f */
    static Map<String, String> m31077f(AbstractC5011n0 n0Var, ProducerContext producerContext, boolean z, int i) {
        if (!n0Var.mo2243f(producerContext, "PartialDiskCacheProducer")) {
            return null;
        }
        if (z) {
            return C13733f.m2851of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C13733f.m2852of("cached_value_found", String.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static boolean m31076g(C3373f<?> fVar) {
        if (fVar.m34570l() || (fVar.m34568n() && (fVar.m34573i() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private AbstractC3371d<C13434e, Void> m31075h(Consumer<C13434e> consumer, ProducerContext producerContext, CacheKey cacheKey) {
        return new C4983a(producerContext.mo31163h(), producerContext, consumer, cacheKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m31074i(Consumer<C13434e> consumer, ProducerContext producerContext, CacheKey cacheKey, C13434e eVar) {
        this.f8467e.mo30917b(new C4985c(consumer, this.f8463a, cacheKey, this.f8465c, this.f8466d, eVar, null), producerContext);
    }

    /* renamed from: j */
    private void m31073j(AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.mo31168c(new C4984b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        ImageRequest l = producerContext.mo31159l();
        if (!l.isDiskCacheEnabled()) {
            this.f8467e.mo30917b(consumer, producerContext);
            return;
        }
        producerContext.mo31163h().mo2244d(producerContext, "PartialDiskCacheProducer");
        CacheKey b = this.f8464b.mo9396b(l, m31078e(l), producerContext.mo31170a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f8463a.m9420n(b, atomicBoolean).m34577e(m31075h(consumer, producerContext, b));
        m31073j(atomicBoolean, producerContext);
    }
}
