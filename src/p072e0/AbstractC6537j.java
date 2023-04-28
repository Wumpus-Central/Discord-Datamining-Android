package p072e0;

import androidx.camera.core.C1915r1;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* renamed from: e0.j */
/* loaded from: classes.dex */
public abstract class AbstractC6537j {

    /* renamed from: a */
    private static volatile AbstractC6537j f13691a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0.j$a */
    /* loaded from: classes.dex */
    public static class C6538a extends AbstractC6537j {
        C6538a() {
        }

        @Override // p072e0.AbstractC6537j
        /* renamed from: c */
        AbstractC6548o mo25349c() {
            return null;
        }

        @Override // p072e0.AbstractC6537j
        /* renamed from: e */
        boolean mo25348e() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0.j$b */
    /* loaded from: classes.dex */
    public static class C6539b extends AbstractC6537j {

        /* renamed from: c */
        private static ExtensionVersionImpl f13692c;

        /* renamed from: b */
        private AbstractC6548o f13693b;

        C6539b() {
            if (f13692c == null) {
                f13692c = new ExtensionVersionImpl();
            }
            AbstractC6548o h = AbstractC6548o.m25327h(f13692c.checkApiVersion(C6549p.m25326a().m25324c()));
            if (h != null && C6549p.m25326a().m25325b().mo25330e() == h.mo25330e()) {
                this.f13693b = h;
            }
            C1915r1.m39527a("ExtenderVersion", "Selected vendor runtime: " + this.f13693b);
        }

        @Override // p072e0.AbstractC6537j
        /* renamed from: c */
        AbstractC6548o mo25349c() {
            return this.f13693b;
        }

        @Override // p072e0.AbstractC6537j
        /* renamed from: e */
        boolean mo25348e() {
            try {
                return f13692c.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    private static AbstractC6537j m25352a() {
        if (f13691a != null) {
            return f13691a;
        }
        synchronized (AbstractC6537j.class) {
            if (f13691a == null) {
                try {
                    f13691a = new C6539b();
                } catch (NoClassDefFoundError unused) {
                    C1915r1.m39527a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f13691a = new C6538a();
                }
            }
        }
        return f13691a;
    }

    /* renamed from: b */
    public static AbstractC6548o m25351b() {
        return m25352a().mo25349c();
    }

    /* renamed from: d */
    public static boolean m25350d() {
        return m25352a().mo25348e();
    }

    /* renamed from: c */
    abstract AbstractC6548o mo25349c();

    /* renamed from: e */
    abstract boolean mo25348e();
}
