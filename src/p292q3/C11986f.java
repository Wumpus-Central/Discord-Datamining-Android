package p292q3;

import p292q3.AbstractC11980a;

/* renamed from: q3.f */
/* loaded from: classes7.dex */
public class C11986f implements AbstractC11980a {

    /* renamed from: a */
    private static C11986f f26837a;

    private C11986f() {
    }

    /* renamed from: b */
    public static synchronized C11986f m8069b() {
        C11986f fVar;
        synchronized (C11986f.class) {
            if (f26837a == null) {
                f26837a = new C11986f();
            }
            fVar = f26837a;
        }
        return fVar;
    }

    @Override // p292q3.AbstractC11980a
    /* renamed from: a */
    public void mo8070a(AbstractC11980a.EnumC0380a aVar, Class<?> cls, String str, Throwable th2) {
    }
}
