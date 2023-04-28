package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.AbstractC5062a;
import com.facebook.imagepipeline.request.AbstractC5063b;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;
import java.util.concurrent.Executor;
import p380v5.AbstractC13432c;
import p380v5.C13433d;
import p394w3.C13733f;
import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.producers.k0 */
/* loaded from: classes7.dex */
public class C4993k0 implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final AbstractC5001l0<CloseableReference<AbstractC13432c>> f8505a;

    /* renamed from: b */
    private final PlatformBitmapFactory f8506b;

    /* renamed from: c */
    private final Executor f8507c;

    /* renamed from: com.facebook.imagepipeline.producers.k0$b */
    /* loaded from: classes7.dex */
    private class C4995b extends AbstractC5012o<CloseableReference<AbstractC13432c>, CloseableReference<AbstractC13432c>> {

        /* renamed from: c */
        private final AbstractC5011n0 f8508c;

        /* renamed from: d */
        private final ProducerContext f8509d;

        /* renamed from: e */
        private final Postprocessor f8510e;

        /* renamed from: f */
        private boolean f8511f;

        /* renamed from: g */
        private CloseableReference<AbstractC13432c> f8512g = null;

        /* renamed from: h */
        private int f8513h = 0;

        /* renamed from: i */
        private boolean f8514i = false;

        /* renamed from: j */
        private boolean f8515j = false;

        /* renamed from: com.facebook.imagepipeline.producers.k0$b$a */
        /* loaded from: classes7.dex */
        class C4996a extends C4965e {

            /* renamed from: a */
            final /* synthetic */ C4993k0 f8517a;

            C4996a(C4993k0 k0Var) {
                this.f8517a = k0Var;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: b */
            public void mo30945b() {
                C4995b.this.m31058B();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.k0$b$b */
        /* loaded from: classes7.dex */
        public class RunnableC0124b implements Runnable {
            RunnableC0124b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CloseableReference closeableReference;
                int i;
                synchronized (C4995b.this) {
                    closeableReference = C4995b.this.f8512g;
                    i = C4995b.this.f8513h;
                    C4995b.this.f8512g = null;
                    C4995b.this.f8514i = false;
                }
                if (CloseableReference.m32036R(closeableReference)) {
                    try {
                        C4995b.this.m31040y(closeableReference, i);
                    } finally {
                        CloseableReference.m32025t(closeableReference);
                    }
                }
                C4995b.this.m31042w();
            }
        }

        public C4995b(Consumer<CloseableReference<AbstractC13432c>> consumer, AbstractC5011n0 n0Var, Postprocessor postprocessor, ProducerContext producerContext) {
            super(consumer);
            this.f8508c = n0Var;
            this.f8510e = postprocessor;
            this.f8509d = producerContext;
            producerContext.mo31168c(new C4996a(C4993k0.this));
        }

        /* renamed from: A */
        private synchronized boolean m31059A() {
            return this.f8511f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public void m31058B() {
            if (m31041x()) {
                m31000o().mo31200a();
            }
        }

        /* renamed from: C */
        private void m31057C(Throwable th2) {
            if (m31041x()) {
                m31000o().onFailure(th2);
            }
        }

        /* renamed from: D */
        private void m31056D(CloseableReference<AbstractC13432c> closeableReference, int i) {
            boolean d = AbstractC4954b.m31197d(i);
            if ((!d && !m31059A()) || (d && m31041x())) {
                m31000o().mo31199b(closeableReference, i);
            }
        }

        /* renamed from: F */
        private CloseableReference<AbstractC13432c> m31054F(AbstractC13432c cVar) {
            C13433d dVar = (C13433d) cVar;
            CloseableReference<Bitmap> process = this.f8510e.process(dVar.mo3732n(), C4993k0.this.f8506b);
            try {
                C13433d dVar2 = new C13433d(process, cVar.mo3734b(), dVar.m3735C(), dVar.m3727z());
                dVar2.m3736l(dVar.getExtras());
                return CloseableReference.m32035S(dVar2);
            } finally {
                CloseableReference.m32025t(process);
            }
        }

        /* renamed from: G */
        private synchronized boolean m31053G() {
            if (this.f8511f || !this.f8514i || this.f8515j || !CloseableReference.m32036R(this.f8512g)) {
                return false;
            }
            this.f8515j = true;
            return true;
        }

        /* renamed from: H */
        private boolean m31052H(AbstractC13432c cVar) {
            return cVar instanceof C13433d;
        }

        /* renamed from: I */
        private void m31051I() {
            C4993k0.this.f8507c.execute(new RunnableC0124b());
        }

        /* renamed from: J */
        private void m31050J(CloseableReference<AbstractC13432c> closeableReference, int i) {
            synchronized (this) {
                if (!this.f8511f) {
                    CloseableReference<AbstractC13432c> closeableReference2 = this.f8512g;
                    this.f8512g = CloseableReference.m32027r(closeableReference);
                    this.f8513h = i;
                    this.f8514i = true;
                    boolean G = m31053G();
                    CloseableReference.m32025t(closeableReference2);
                    if (G) {
                        m31051I();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public void m31042w() {
            boolean G;
            synchronized (this) {
                this.f8515j = false;
                G = m31053G();
            }
            if (G) {
                m31051I();
            }
        }

        /* renamed from: x */
        private boolean m31041x() {
            synchronized (this) {
                if (this.f8511f) {
                    return false;
                }
                CloseableReference<AbstractC13432c> closeableReference = this.f8512g;
                this.f8512g = null;
                this.f8511f = true;
                CloseableReference.m32025t(closeableReference);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public void m31040y(CloseableReference<AbstractC13432c> closeableReference, int i) {
            C13740j.m2839b(Boolean.valueOf(CloseableReference.m32036R(closeableReference)));
            if (!m31052H(closeableReference.m32039C())) {
                m31056D(closeableReference, i);
                return;
            }
            this.f8508c.mo2244d(this.f8509d, "PostprocessorProducer");
            CloseableReference closeableReference2 = null;
            try {
                closeableReference2 = m31054F(closeableReference.m32039C());
                AbstractC5011n0 n0Var = this.f8508c;
                ProducerContext producerContext = this.f8509d;
                n0Var.mo2241j(producerContext, "PostprocessorProducer", m31039z(n0Var, producerContext, this.f8510e));
                m31056D(closeableReference2, i);
            } catch (Exception e) {
                AbstractC5011n0 n0Var2 = this.f8508c;
                ProducerContext producerContext2 = this.f8509d;
                n0Var2.mo2240k(producerContext2, "PostprocessorProducer", e, m31039z(n0Var2, producerContext2, this.f8510e));
                m31057C(e);
            } finally {
                CloseableReference.m32025t(closeableReference2);
            }
        }

        /* renamed from: z */
        private Map<String, String> m31039z(AbstractC5011n0 n0Var, ProducerContext producerContext, Postprocessor postprocessor) {
            if (!n0Var.mo2243f(producerContext, "PostprocessorProducer")) {
                return null;
            }
            return C13733f.m2852of("Postprocessor", postprocessor.getName());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: E */
        public void mo30912h(CloseableReference<AbstractC13432c> closeableReference, int i) {
            if (CloseableReference.m32036R(closeableReference)) {
                m31050J(closeableReference, i);
            } else if (AbstractC4954b.m31197d(i)) {
                m31056D(null, i);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: f */
        protected void mo30932f() {
            m31058B();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: g */
        protected void mo30913g(Throwable th2) {
            m31057C(th2);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.k0$c */
    /* loaded from: classes7.dex */
    class C4997c extends AbstractC5012o<CloseableReference<AbstractC13432c>, CloseableReference<AbstractC13432c>> implements AbstractC5063b {

        /* renamed from: c */
        private boolean f8520c;

        /* renamed from: d */
        private CloseableReference<AbstractC13432c> f8521d;

        /* renamed from: com.facebook.imagepipeline.producers.k0$c$a */
        /* loaded from: classes7.dex */
        class C4998a extends C4965e {

            /* renamed from: a */
            final /* synthetic */ C4993k0 f8523a;

            C4998a(C4993k0 k0Var) {
                this.f8523a = k0Var;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: b */
            public void mo30945b() {
                if (C4997c.this.m31037q()) {
                    C4997c.this.m31000o().mo31200a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public boolean m31037q() {
            synchronized (this) {
                if (this.f8520c) {
                    return false;
                }
                CloseableReference<AbstractC13432c> closeableReference = this.f8521d;
                this.f8521d = null;
                this.f8520c = true;
                CloseableReference.m32025t(closeableReference);
                return true;
            }
        }

        /* renamed from: s */
        private void m31035s(CloseableReference<AbstractC13432c> closeableReference) {
            synchronized (this) {
                if (!this.f8520c) {
                    CloseableReference<AbstractC13432c> closeableReference2 = this.f8521d;
                    this.f8521d = CloseableReference.m32027r(closeableReference);
                    CloseableReference.m32025t(closeableReference2);
                }
            }
        }

        /* renamed from: t */
        private void m31034t() {
            synchronized (this) {
                if (!this.f8520c) {
                    CloseableReference<AbstractC13432c> r = CloseableReference.m32027r(this.f8521d);
                    try {
                        m31000o().mo31199b(r, 0);
                    } finally {
                        CloseableReference.m32025t(r);
                    }
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: f */
        protected void mo30932f() {
            if (m31037q()) {
                m31000o().mo31200a();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: g */
        protected void mo30913g(Throwable th2) {
            if (m31037q()) {
                m31000o().onFailure(th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r */
        public void mo30912h(CloseableReference<AbstractC13432c> closeableReference, int i) {
            if (!AbstractC4954b.m31196e(i)) {
                m31035s(closeableReference);
                m31034t();
            }
        }

        private C4997c(C4995b bVar, AbstractC5062a aVar, ProducerContext producerContext) {
            super(bVar);
            this.f8520c = false;
            this.f8521d = null;
            aVar.m30866a(this);
            producerContext.mo31168c(new C4998a(C4993k0.this));
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.k0$d */
    /* loaded from: classes7.dex */
    class C4999d extends AbstractC5012o<CloseableReference<AbstractC13432c>, CloseableReference<AbstractC13432c>> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p */
        public void mo30912h(CloseableReference<AbstractC13432c> closeableReference, int i) {
            if (!AbstractC4954b.m31196e(i)) {
                m31000o().mo31199b(closeableReference, i);
            }
        }

        private C4999d(C4995b bVar) {
            super(bVar);
        }
    }

    public C4993k0(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        this.f8505a = (AbstractC5001l0) C13740j.m2834g(l0Var);
        this.f8506b = platformBitmapFactory;
        this.f8507c = (Executor) C13740j.m2834g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        Consumer<CloseableReference<AbstractC13432c>> consumer2;
        AbstractC5011n0 h = producerContext.mo31163h();
        Postprocessor postprocessor = producerContext.mo31159l().getPostprocessor();
        C4995b bVar = new C4995b(consumer, h, postprocessor, producerContext);
        if (postprocessor instanceof AbstractC5062a) {
            consumer2 = new C4997c(bVar, (AbstractC5062a) postprocessor, producerContext);
        } else {
            consumer2 = new C4999d(bVar);
        }
        this.f8505a.mo30917b(consumer2, producerContext);
    }
}
