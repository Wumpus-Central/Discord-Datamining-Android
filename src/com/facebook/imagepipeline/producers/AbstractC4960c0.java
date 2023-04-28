package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p380v5.C13434e;
import p394w3.C13729b;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.c0 */
/* loaded from: classes7.dex */
public abstract class AbstractC4960c0 implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final Executor f8397a;

    /* renamed from: b */
    private final AbstractC14537h f8398b;

    /* renamed from: com.facebook.imagepipeline.producers.c0$a */
    /* loaded from: classes7.dex */
    class C4961a extends AbstractC5028s0<C13434e> {

        /* renamed from: p */
        final /* synthetic */ ImageRequest f8399p;

        /* renamed from: q */
        final /* synthetic */ AbstractC5011n0 f8400q;

        /* renamed from: r */
        final /* synthetic */ ProducerContext f8401r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4961a(Consumer consumer, AbstractC5011n0 n0Var, ProducerContext producerContext, String str, ImageRequest imageRequest, AbstractC5011n0 n0Var2, ProducerContext producerContext2) {
            super(consumer, n0Var, producerContext, str);
            this.f8399p = imageRequest;
            this.f8400q = n0Var2;
            this.f8401r = producerContext2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: j */
        public void mo4381b(C13434e eVar) {
            C13434e.m3706h(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k */
        public C13434e mo4380c() {
            C13434e d = AbstractC4960c0.this.mo30910d(this.f8399p);
            if (d == null) {
                this.f8400q.mo2246b(this.f8401r, AbstractC4960c0.this.mo30909f(), false);
                this.f8401r.mo31164g("local");
                return null;
            }
            d.m3697w0();
            this.f8400q.mo2246b(this.f8401r, AbstractC4960c0.this.mo30909f(), true);
            this.f8401r.mo31164g("local");
            return d;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.c0$b */
    /* loaded from: classes7.dex */
    class C4962b extends C4965e {

        /* renamed from: a */
        final /* synthetic */ AbstractC5028s0 f8403a;

        C4962b(AbstractC5028s0 s0Var) {
            this.f8403a = s0Var;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            this.f8403a.m4382a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4960c0(Executor executor, AbstractC14537h hVar) {
        this.f8397a = executor;
        this.f8398b = hVar;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        AbstractC5011n0 h = producerContext.mo31163h();
        ImageRequest l = producerContext.mo31159l();
        producerContext.mo31166e("local", "fetch");
        C4961a aVar = new C4961a(consumer, h, producerContext, mo30909f(), l, h, producerContext);
        producerContext.mo31168c(new C4962b(aVar));
        this.f8397a.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public C13434e m31174c(InputStream inputStream, int i) {
        CloseableReference closeableReference;
        CloseableReference closeableReference2 = null;
        try {
            if (i <= 0) {
                closeableReference = CloseableReference.m32035S(this.f8398b.mo263a(inputStream));
            } else {
                closeableReference = CloseableReference.m32035S(this.f8398b.mo262b(inputStream, i));
            }
            closeableReference2 = closeableReference;
            return new C13434e(closeableReference2);
        } finally {
            C13729b.m2856b(inputStream);
            CloseableReference.m32025t(closeableReference2);
        }
    }

    /* renamed from: d */
    protected abstract C13434e mo30910d(ImageRequest imageRequest);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public C13434e m31173e(InputStream inputStream, int i) {
        return m31174c(inputStream, i);
    }

    /* renamed from: f */
    protected abstract String mo30909f();
}
