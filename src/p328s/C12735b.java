package p328s;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: s.b */
/* loaded from: classes.dex */
public final class C12735b {

    /* renamed from: a */
    private final AbstractC12736a f28596a;

    /* renamed from: s.b$a */
    /* loaded from: classes.dex */
    interface AbstractC12736a {
        /* renamed from: a */
        void mo5576a(String str);

        /* renamed from: b */
        String mo5575b();

        /* renamed from: c */
        Object mo5574c();

        Surface getSurface();
    }

    public C12735b(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f28596a = new C12744h(surface);
        } else if (i >= 26) {
            this.f28596a = new C12741f(surface);
        } else if (i >= 24) {
            this.f28596a = new C12739e(surface);
        } else {
            this.f28596a = new C12745i(surface);
        }
    }

    /* renamed from: e */
    public static C12735b m5583e(Object obj) {
        AbstractC12736a aVar;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            aVar = C12744h.m5577f((OutputConfiguration) obj);
        } else if (i >= 26) {
            aVar = C12741f.m5579e((OutputConfiguration) obj);
        } else if (i >= 24) {
            aVar = C12739e.m5580d((OutputConfiguration) obj);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return new C12735b(aVar);
    }

    /* renamed from: a */
    public String m5587a() {
        return this.f28596a.mo5575b();
    }

    /* renamed from: b */
    public Surface m5586b() {
        return this.f28596a.getSurface();
    }

    /* renamed from: c */
    public void m5585c(String str) {
        this.f28596a.mo5576a(str);
    }

    /* renamed from: d */
    public Object m5584d() {
        return this.f28596a.mo5574c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12735b)) {
            return false;
        }
        return this.f28596a.equals(((C12735b) obj).f28596a);
    }

    public int hashCode() {
        return this.f28596a.hashCode();
    }

    private C12735b(AbstractC12736a aVar) {
        this.f28596a = aVar;
    }
}
