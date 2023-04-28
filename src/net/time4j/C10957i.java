package net.time4j;

import p143hj.AbstractC8079p;
import p143hj.AbstractC8085v;
import p143hj.C8057g0;

/* renamed from: net.time4j.i */
/* loaded from: classes8.dex */
final class C10957i extends AbstractC10975o<C10892f0> {

    /* renamed from: m */
    private final Object f24316m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10957i(AbstractC8079p<?> pVar, int i) {
        this(pVar, i, null);
    }

    /* renamed from: c */
    private static <V> Object m11474c(AbstractC8079p<V> pVar, Object obj) {
        return C10990t0.m11343a(C8057g0.m20722o(pVar.getType().cast(obj), pVar), obj);
    }

    /* renamed from: d */
    private static <V> Object m11473d(AbstractC8079p<V> pVar, Object obj) {
        return C10990t0.m11343a(C8057g0.m20723n(pVar.getType().cast(obj), pVar), obj);
    }

    /* renamed from: b */
    public C10892f0 apply(C10892f0 f0Var) {
        return (C10892f0) ((AbstractC8085v) this.f24316m).apply(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10957i(AbstractC8079p<?> pVar, int i, Object obj) {
        super(pVar, i);
        switch (i) {
            case -1:
                this.f24316m = m11473d(pVar, obj);
                return;
            case 0:
                this.f24316m = C8057g0.m20725l(pVar);
                return;
            case 1:
                this.f24316m = C8057g0.m20727j(pVar);
                return;
            case 2:
                this.f24316m = C8057g0.m20731f(pVar);
                return;
            case 3:
                this.f24316m = C8057g0.m20729h(pVar);
                return;
            case 4:
                this.f24316m = C8057g0.m20733d(pVar);
                return;
            case 5:
                this.f24316m = C8057g0.m20734c(pVar);
                return;
            case 6:
                this.f24316m = m11474c(pVar, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + m11405a());
        }
    }
}
