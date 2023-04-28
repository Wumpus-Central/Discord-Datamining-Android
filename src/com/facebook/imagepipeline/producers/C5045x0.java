package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.producers.x0 */
/* loaded from: classes7.dex */
public class C5045x0<T> implements AbstractC5001l0<T> {

    /* renamed from: a */
    private final AbstractC5001l0<T> f8654a;

    /* renamed from: b */
    private final int f8655b;

    /* renamed from: e */
    private final Executor f8658e;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<Pair<Consumer<T>, ProducerContext>> f8657d = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private int f8656c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.x0$b */
    /* loaded from: classes7.dex */
    public class C5047b extends AbstractC5012o<T, T> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.x0$b$a */
        /* loaded from: classes7.dex */
        public class RunnableC5048a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ Pair f8660k;

            RunnableC5048a(Pair pair) {
                this.f8660k = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5045x0 x0Var = C5045x0.this;
                Pair pair = this.f8660k;
                x0Var.m30933f((Consumer) pair.first, (ProducerContext) pair.second);
            }
        }

        /* renamed from: p */
        private void m30931p() {
            Pair pair;
            synchronized (C5045x0.this) {
                pair = (Pair) C5045x0.this.f8657d.poll();
                if (pair == null) {
                    C5045x0.m30935d(C5045x0.this);
                }
            }
            if (pair != null) {
                C5045x0.this.f8658e.execute(new RunnableC5048a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: f */
        protected void mo30932f() {
            m31000o().mo31200a();
            m30931p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: g */
        protected void mo30913g(Throwable th2) {
            m31000o().onFailure(th2);
            m30931p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: h */
        protected void mo30912h(T t, int i) {
            m31000o().mo31199b(t, i);
            if (AbstractC4954b.m31197d(i)) {
                m30931p();
            }
        }

        private C5047b(Consumer<T> consumer) {
            super(consumer);
        }
    }

    public C5045x0(int i, Executor executor, AbstractC5001l0<T> l0Var) {
        this.f8655b = i;
        this.f8658e = (Executor) C13740j.m2834g(executor);
        this.f8654a = (AbstractC5001l0) C13740j.m2834g(l0Var);
    }

    /* renamed from: d */
    static /* synthetic */ int m30935d(C5045x0 x0Var) {
        int i = x0Var.f8656c;
        x0Var.f8656c = i - 1;
        return i;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<T> consumer, ProducerContext producerContext) {
        boolean z;
        producerContext.mo31163h().mo2244d(producerContext, "ThrottlingProducer");
        synchronized (this) {
            int i = this.f8656c;
            z = true;
            if (i >= this.f8655b) {
                this.f8657d.add(Pair.create(consumer, producerContext));
            } else {
                this.f8656c = i + 1;
                z = false;
            }
        }
        if (!z) {
            m30933f(consumer, producerContext);
        }
    }

    /* renamed from: f */
    void m30933f(Consumer<T> consumer, ProducerContext producerContext) {
        producerContext.mo31163h().mo2241j(producerContext, "ThrottlingProducer", null);
        this.f8654a.mo30917b(new C5047b(consumer), producerContext);
    }
}
