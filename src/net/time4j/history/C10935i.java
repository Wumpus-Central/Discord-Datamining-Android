package net.time4j.history;

import net.time4j.C10892f0;
import p143hj.AbstractC8050e;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8091z;
import p143hj.C8081r;
import p143hj.C8087x;

/* renamed from: net.time4j.history.i */
/* loaded from: classes8.dex */
final class C10935i extends AbstractC8050e<C10934h> {
    private static final long serialVersionUID = -5386613740709845550L;
    private final C10929d history;

    /* renamed from: net.time4j.history.i$a */
    /* loaded from: classes8.dex */
    private static class C10936a<C extends AbstractC8080q<C>> implements AbstractC8091z<C, C10934h> {

        /* renamed from: k */
        private final C10929d f24288k;

        C10936a(C10929d dVar) {
            this.f24288k = dVar;
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        /* renamed from: f */
        public C10934h mo11084d(C c) {
            C10929d dVar = this.f24288k;
            if (dVar == C10929d.f38935C) {
                return C10934h.m11540g(EnumC10937j.BYZANTINE, 999984973, 8, 31);
            }
            if (dVar == C10929d.f38934B) {
                return C10934h.m11540g(EnumC10937j.AD, 999979465, 12, 31);
            }
            if (dVar == C10929d.f38933A) {
                return C10934h.m11540g(EnumC10937j.AD, 999999999, 12, 31);
            }
            return C10934h.m11540g(EnumC10937j.AD, 9999, 12, 31);
        }

        /* renamed from: i */
        public C10934h mo11078k(C c) {
            C10929d dVar = this.f24288k;
            if (dVar == C10929d.f38935C) {
                return C10934h.m11540g(EnumC10937j.BYZANTINE, 0, 9, 1);
            }
            if (dVar == C10929d.f38934B) {
                return C10934h.m11540g(EnumC10937j.BC, 999979466, 1, 1);
            }
            if (dVar == C10929d.f38933A) {
                return C10934h.m11540g(EnumC10937j.BC, 1000000000, 1, 1);
            }
            return C10934h.m11540g(EnumC10937j.BC, 45, 1, 1);
        }

        /* renamed from: j */
        public C10934h mo11076n(C c) {
            try {
                return this.f24288k.m11577e((C10892f0) c.mo11371r(C10892f0.f24173y));
            } catch (IllegalArgumentException e) {
                throw new C8081r(e.getMessage(), e);
            }
        }

        /* renamed from: o */
        public boolean mo11081h(C c, C10934h hVar) {
            return this.f24288k.m11593B(hVar);
        }

        /* renamed from: p */
        public C mo11077m(C c, C10934h hVar, boolean z) {
            if (hVar != null) {
                return (C) c.mo15654D(C10892f0.f24173y, this.f24288k.m11578d(hVar));
            }
            throw new IllegalArgumentException("Missing historic date.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10935i(C10929d dVar) {
        super("HISTORIC_DATE");
        this.history = dVar;
    }

    private Object readResolve() {
        return this.history.m11576f();
    }

    /* renamed from: A */
    public C10934h mo11059f() {
        return C10934h.m11540g(EnumC10937j.AD, 9999, 12, 31);
    }

    /* renamed from: D */
    public C10934h mo11062T() {
        return C10934h.m11540g(EnumC10937j.BC, 45, 1, 1);
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    public Class<C10934h> getType() {
        return C10934h.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8050e
    /* renamed from: q */
    public <T extends AbstractC8080q<T>> AbstractC8091z<T, C10934h> mo11057q(C8087x<T> xVar) {
        if (xVar.m20657A(C10892f0.f24173y)) {
            return new C10936a(this.history);
        }
        return null;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: s */
    protected boolean mo11055s(AbstractC8050e<?> eVar) {
        return this.history.equals(((C10935i) eVar).history);
    }
}
