package p163j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.s */
/* loaded from: classes2.dex */
public final class C9270s extends C9264m {

    /* renamed from: e */
    C9270s f20357e;

    /* renamed from: f */
    C9270s f20358f;

    /* renamed from: g */
    C9270s f20359g;

    /* renamed from: h */
    C9270s f20360h;

    /* renamed from: i */
    boolean f20361i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9270s(int i, Object obj, Object obj2, C9270s sVar, C9270s sVar2) {
        super(i, obj, obj2, sVar);
        this.f20357e = sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.concurrent.C9264m
    /* renamed from: a */
    public final C9264m mo16560a(int i, Object obj) {
        return m16559b(i, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9270s m16559b(int i, Object obj, Class cls) {
        int compareComparables;
        if (obj == null) {
            return null;
        }
        C9270s sVar = this;
        do {
            sVar = sVar.f20358f;
            C9270s sVar2 = sVar.f20359g;
            int i2 = sVar.f20336a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = sVar.f20337b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return sVar;
                    }
                    if (sVar != null) {
                        if (sVar2 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) {
                                C9270s b = sVar2.m16559b(i, obj, cls);
                                if (b != null) {
                                    return b;
                                }
                            } else if (compareComparables >= 0) {
                                sVar = sVar2;
                            }
                        }
                    }
                }
                sVar = sVar2;
                continue;
            }
            continue;
        } while (sVar != null);
        return null;
    }
}
