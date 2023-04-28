package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.AbstractC4937i;
import com.facebook.imagepipeline.nativecode.C4938j;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p076e4.EnumC6704e;
import p170j5.C9489b;
import p170j5.C9490c;
import p170j5.C9492d;
import p380v5.C13434e;
import p394w3.C13740j;
import p455z3.AbstractC14537h;
import p455z3.AbstractC14539j;

/* renamed from: com.facebook.imagepipeline.producers.b1 */
/* loaded from: classes7.dex */
public class C4956b1 implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final Executor f8389a;

    /* renamed from: b */
    private final AbstractC14537h f8390b;

    /* renamed from: c */
    private final AbstractC5001l0<C13434e> f8391c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.b1$a */
    /* loaded from: classes7.dex */
    public class C4957a extends AbstractC5028s0<C13434e> {

        /* renamed from: p */
        final /* synthetic */ C13434e f8392p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4957a(Consumer consumer, AbstractC5011n0 n0Var, ProducerContext producerContext, String str, C13434e eVar) {
            super(consumer, n0Var, producerContext, str);
            this.f8392p = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC5028s0, p359u3.AbstractRunnableC13189g
        /* renamed from: d */
        public void mo4379d() {
            C13434e.m3706h(this.f8392p);
            super.mo4379d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC5028s0, p359u3.AbstractRunnableC13189g
        /* renamed from: e */
        public void mo4378e(Exception exc) {
            C13434e.m3706h(this.f8392p);
            super.mo4378e(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: j */
        public void mo4381b(C13434e eVar) {
            C13434e.m3706h(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k */
        public C13434e mo4380c() {
            AbstractC14539j c = C4956b1.this.f8390b.mo261c();
            try {
                C4956b1.m31181g(this.f8392p, c);
                CloseableReference S = CloseableReference.m32035S(c.mo258b());
                C13434e eVar = new C13434e(S);
                eVar.m3705i(this.f8392p);
                CloseableReference.m32025t(S);
                return eVar;
            } finally {
                c.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l */
        public void mo4377f(C13434e eVar) {
            C13434e.m3706h(this.f8392p);
            super.mo4377f(eVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.b1$b */
    /* loaded from: classes7.dex */
    private class C4958b extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private final ProducerContext f8394c;

        /* renamed from: d */
        private EnumC6704e f8395d = EnumC6704e.UNSET;

        public C4958b(Consumer<C13434e> consumer, ProducerContext producerContext) {
            super(consumer);
            this.f8394c = producerContext;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p */
        public void mo30912h(C13434e eVar, int i) {
            if (this.f8395d == EnumC6704e.UNSET && eVar != null) {
                this.f8395d = C4956b1.m31180h(eVar);
            }
            if (this.f8395d == EnumC6704e.NO) {
                m31000o().mo31199b(eVar, i);
            } else if (!AbstractC4954b.m31197d(i)) {
            } else {
                if (this.f8395d != EnumC6704e.YES || eVar == null) {
                    m31000o().mo31199b(eVar, i);
                } else {
                    C4956b1.this.m31179i(eVar, m31000o(), this.f8394c);
                }
            }
        }
    }

    public C4956b1(Executor executor, AbstractC14537h hVar, AbstractC5001l0<C13434e> l0Var) {
        this.f8389a = (Executor) C13740j.m2834g(executor);
        this.f8390b = (AbstractC14537h) C13740j.m2834g(hVar);
        this.f8391c = (AbstractC5001l0) C13740j.m2834g(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static void m31181g(C13434e eVar, AbstractC14539j jVar) {
        InputStream inputStream = (InputStream) C13740j.m2834g(eVar.m3696z());
        C9490c c = C9492d.m16139c(inputStream);
        if (c == C9489b.f21016f || c == C9489b.f21018h) {
            C4938j.m31244a().mo31245c(inputStream, jVar, 80);
            eVar.m3719K0(C9489b.f21011a);
        } else if (c == C9489b.f21017g || c == C9489b.f21019i) {
            C4938j.m31244a().mo31247a(inputStream, jVar);
            eVar.m3719K0(C9489b.f21012b);
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static EnumC6704e m31180h(C13434e eVar) {
        C13740j.m2834g(eVar);
        C9490c c = C9492d.m16139c((InputStream) C13740j.m2834g(eVar.m3696z()));
        if (C9489b.m16146a(c)) {
            AbstractC4937i a = C4938j.m31244a();
            if (a == null) {
                return EnumC6704e.NO;
            }
            return EnumC6704e.m24610c(!a.mo31246b(c));
        } else if (c == C9490c.f21023c) {
            return EnumC6704e.UNSET;
        } else {
            return EnumC6704e.NO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m31179i(C13434e eVar, Consumer<C13434e> consumer, ProducerContext producerContext) {
        C13740j.m2834g(eVar);
        this.f8389a.execute(new C4957a(consumer, producerContext.mo31163h(), producerContext, "WebpTranscodeProducer", C13434e.m3707g(eVar)));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        this.f8391c.mo30917b(new C4958b(consumer, producerContext), producerContext);
    }
}
