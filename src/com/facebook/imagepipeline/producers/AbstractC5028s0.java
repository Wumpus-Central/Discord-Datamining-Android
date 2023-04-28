package com.facebook.imagepipeline.producers;

import java.util.Map;
import p359u3.AbstractRunnableC13189g;

/* renamed from: com.facebook.imagepipeline.producers.s0 */
/* loaded from: classes7.dex */
public abstract class AbstractC5028s0<T> extends AbstractRunnableC13189g<T> {

    /* renamed from: l */
    private final Consumer<T> f8606l;

    /* renamed from: m */
    private final AbstractC5011n0 f8607m;

    /* renamed from: n */
    private final String f8608n;

    /* renamed from: o */
    private final ProducerContext f8609o;

    public AbstractC5028s0(Consumer<T> consumer, AbstractC5011n0 n0Var, ProducerContext producerContext, String str) {
        this.f8606l = consumer;
        this.f8607m = n0Var;
        this.f8608n = str;
        this.f8609o = producerContext;
        n0Var.mo2244d(producerContext, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p359u3.AbstractRunnableC13189g
    /* renamed from: d */
    public void mo4379d() {
        Map<String, String> map;
        AbstractC5011n0 n0Var = this.f8607m;
        ProducerContext producerContext = this.f8609o;
        String str = this.f8608n;
        if (n0Var.mo2243f(producerContext, str)) {
            map = m30963g();
        } else {
            map = null;
        }
        n0Var.mo2245c(producerContext, str, map);
        this.f8606l.mo31200a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p359u3.AbstractRunnableC13189g
    /* renamed from: e */
    public void mo4378e(Exception exc) {
        Map<String, String> map;
        AbstractC5011n0 n0Var = this.f8607m;
        ProducerContext producerContext = this.f8609o;
        String str = this.f8608n;
        if (n0Var.mo2243f(producerContext, str)) {
            map = m30962h(exc);
        } else {
            map = null;
        }
        n0Var.mo2240k(producerContext, str, exc, map);
        this.f8606l.onFailure(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p359u3.AbstractRunnableC13189g
    /* renamed from: f */
    public void mo4377f(T t) {
        Map<String, String> map;
        AbstractC5011n0 n0Var = this.f8607m;
        ProducerContext producerContext = this.f8609o;
        String str = this.f8608n;
        if (n0Var.mo2243f(producerContext, str)) {
            map = mo30961i(t);
        } else {
            map = null;
        }
        n0Var.mo2241j(producerContext, str, map);
        this.f8606l.mo31199b(t, 1);
    }

    /* renamed from: g */
    protected Map<String, String> m30963g() {
        return null;
    }

    /* renamed from: h */
    protected Map<String, String> m30962h(Exception exc) {
        return null;
    }

    /* renamed from: i */
    protected Map<String, String> mo30961i(T t) {
        return null;
    }
}
