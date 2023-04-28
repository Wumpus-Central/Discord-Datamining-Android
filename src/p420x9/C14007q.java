package p420x9;

/* renamed from: x9.q */
/* loaded from: classes5.dex */
public final class C14007q {

    /* renamed from: b */
    private static C14007q f31583b;

    /* renamed from: c */
    private static final C14010r f31584c = new C14010r(0, false, false, 0, 0);

    /* renamed from: a */
    private C14010r f31585a;

    private C14007q() {
    }

    /* renamed from: b */
    public static synchronized C14007q m2042b() {
        C14007q qVar;
        synchronized (C14007q.class) {
            if (f31583b == null) {
                f31583b = new C14007q();
            }
            qVar = f31583b;
        }
        return qVar;
    }

    /* renamed from: a */
    public C14010r m2043a() {
        return this.f31585a;
    }

    /* renamed from: c */
    public final synchronized void m2041c(C14010r rVar) {
        if (rVar == null) {
            this.f31585a = f31584c;
            return;
        }
        C14010r rVar2 = this.f31585a;
        if (rVar2 == null || rVar2.m2033z() < rVar.m2033z()) {
            this.f31585a = rVar;
        }
    }
}
