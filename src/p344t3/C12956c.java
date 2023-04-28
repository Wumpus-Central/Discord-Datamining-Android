package p344t3;

/* renamed from: t3.c */
/* loaded from: classes7.dex */
public class C12956c implements AbstractC12955b {

    /* renamed from: a */
    private static C12956c f29045a;

    private C12956c() {
    }

    /* renamed from: b */
    public static synchronized C12956c m4952b() {
        C12956c cVar;
        synchronized (C12956c.class) {
            if (f29045a == null) {
                f29045a = new C12956c();
            }
            cVar = f29045a;
        }
        return cVar;
    }

    @Override // p344t3.AbstractC12955b
    /* renamed from: a */
    public void mo4953a(AbstractC12954a aVar) {
    }
}
