package p223m2;

import p126h2.C7762i;
import p341t0.C12936a;

/* renamed from: m2.g */
/* loaded from: classes.dex */
public class C10476g {

    /* renamed from: b */
    private static final C10476g f23135b = new C10476g();

    /* renamed from: a */
    private final C12936a<String, C7762i> f23136a = new C12936a<>(20);

    C10476g() {
    }

    /* renamed from: b */
    public static C10476g m13086b() {
        return f23135b;
    }

    /* renamed from: a */
    public C7762i m13087a(String str) {
        if (str == null) {
            return null;
        }
        return this.f23136a.m5032c(str);
    }

    /* renamed from: c */
    public void m13085c(String str, C7762i iVar) {
        if (str != null) {
            this.f23136a.m5031d(str, iVar);
        }
    }
}
