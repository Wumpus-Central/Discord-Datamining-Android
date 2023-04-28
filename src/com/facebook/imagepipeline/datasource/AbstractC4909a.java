package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.AbstractC4775a;
import com.facebook.imagepipeline.producers.AbstractC4954b;
import com.facebook.imagepipeline.producers.AbstractC5001l0;
import com.facebook.imagepipeline.producers.C5025r0;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.ProducerContext;
import java.util.Map;
import p007a6.C1271b;
import p394w3.C13740j;
import p416x5.AbstractC13937d;

/* renamed from: com.facebook.imagepipeline.datasource.a */
/* loaded from: classes7.dex */
public abstract class AbstractC4909a<T> extends AbstractC4775a<T> {

    /* renamed from: h */
    private final C5025r0 f8303h;

    /* renamed from: i */
    private final AbstractC13937d f8304i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.datasource.a$a */
    /* loaded from: classes7.dex */
    public class C0120a extends AbstractC4954b<T> {
        C0120a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: f */
        protected void mo30932f() {
            AbstractC4909a.this.m31337D();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: g */
        protected void mo30913g(Throwable th2) {
            AbstractC4909a.this.m31336E(th2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: h */
        protected void mo30912h(T t, int i) {
            AbstractC4909a aVar = AbstractC4909a.this;
            aVar.mo31331F(t, i, aVar.f8303h);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: i */
        protected void mo31001i(float f) {
            AbstractC4909a.this.m32006s(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4909a(AbstractC5001l0<T> l0Var, C5025r0 r0Var, AbstractC13937d dVar) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractProducerToDataSourceAdapter()");
        }
        this.f8303h = r0Var;
        this.f8304i = dVar;
        m31335G();
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        dVar.mo2236a(r0Var);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        if (C1271b.m41491d()) {
            C1271b.m41494a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        l0Var.mo30917b(m31339B(), r0Var);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* renamed from: B */
    private Consumer<T> m31339B() {
        return new C0120a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public synchronized void m31337D() {
        C13740j.m2832i(m32013k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m31336E(Throwable th2) {
        if (super.m32008q(th2, m31338C(this.f8303h))) {
            this.f8304i.mo2233i(this.f8303h, th2);
        }
    }

    /* renamed from: G */
    private void m31335G() {
        m32009o(this.f8303h.getExtras());
    }

    /* renamed from: C */
    protected Map<String, Object> m31338C(ProducerContext producerContext) {
        return producerContext.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo31331F(T t, int i, ProducerContext producerContext) {
        boolean d = AbstractC4954b.m31197d(i);
        if (super.m32004u(t, d, m31338C(producerContext)) && d) {
            this.f8304i.mo2235e(this.f8303h);
        }
    }

    @Override // com.facebook.datasource.AbstractC4775a, com.facebook.datasource.DataSource
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.mo32020a()) {
            return true;
        }
        this.f8304i.mo2234g(this.f8303h);
        this.f8303h.m31150u();
        return true;
    }
}
