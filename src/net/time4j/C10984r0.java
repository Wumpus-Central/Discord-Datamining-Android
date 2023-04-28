package net.time4j;

import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8085v;
import p143hj.C8057g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.r0 */
/* loaded from: classes8.dex */
public final class C10984r0 extends AbstractC10975o<C10906g0> {

    /* renamed from: m */
    private final Object f24399m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10984r0(AbstractC8079p<?> pVar, int i) {
        this(pVar, i, null);
    }

    /* renamed from: c */
    private static <V, T extends AbstractC8080q<T>> AbstractC8085v<T> m11368c(AbstractC8079p<V> pVar, boolean z) {
        String name = pVar.name();
        if (name.equals("MILLI_OF_SECOND") || name.equals("MILLI_OF_DAY")) {
            return new C10981q('3', z);
        }
        if (name.equals("MICRO_OF_SECOND") || name.equals("MICRO_OF_DAY")) {
            return new C10981q('6', z);
        }
        if (name.equals("NANO_OF_SECOND") || name.equals("NANO_OF_DAY")) {
            return new C10981q('9', z);
        }
        if (z) {
            return C8057g0.m20734c(pVar);
        }
        return C8057g0.m20733d(pVar);
    }

    /* renamed from: d */
    private static <V> Object m11367d(AbstractC8079p<V> pVar, Object obj) {
        return C10990t0.m11343a(C8057g0.m20722o(pVar.getType().cast(obj), pVar), obj);
    }

    /* renamed from: e */
    private static <V> Object m11366e(AbstractC8079p<V> pVar, Object obj) {
        return C10990t0.m11343a(C8057g0.m20723n(pVar.getType().cast(obj), pVar), obj);
    }

    /* renamed from: b */
    public C10906g0 apply(C10906g0 g0Var) {
        return (C10906g0) ((AbstractC8085v) this.f24399m).apply(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10984r0(AbstractC8079p<?> pVar, int i, Object obj) {
        super(pVar, i);
        switch (i) {
            case -1:
                this.f24399m = m11366e(pVar, obj);
                return;
            case 0:
                this.f24399m = C8057g0.m20725l(pVar);
                return;
            case 1:
                this.f24399m = C8057g0.m20727j(pVar);
                return;
            case 2:
                this.f24399m = C8057g0.m20731f(pVar);
                return;
            case 3:
                this.f24399m = C8057g0.m20729h(pVar);
                return;
            case 4:
                this.f24399m = m11368c(pVar, false);
                return;
            case 5:
                this.f24399m = m11368c(pVar, true);
                return;
            case 6:
                this.f24399m = m11367d(pVar, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + m11405a());
        }
    }
}
