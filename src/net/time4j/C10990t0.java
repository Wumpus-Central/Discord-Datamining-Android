package net.time4j;

import p143hj.AbstractC8085v;

/* renamed from: net.time4j.t0 */
/* loaded from: classes8.dex */
final class C10990t0<T> implements AbstractC8085v<T> {

    /* renamed from: k */
    private final AbstractC8085v<T> f24428k;

    /* renamed from: l */
    private final Object f24429l;

    private C10990t0(AbstractC8085v<T> vVar, Object obj) {
        this.f24428k = vVar;
        this.f24429l = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> C10990t0 m11343a(AbstractC8085v<T> vVar, Object obj) {
        return new C10990t0(vVar, obj);
    }

    @Override // p143hj.AbstractC8085v
    public T apply(T t) {
        return this.f24428k.apply(t);
    }
}
