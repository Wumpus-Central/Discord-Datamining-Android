package p003a2;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: a2.d */
/* loaded from: classes.dex */
public class C1247d {

    /* renamed from: a */
    private WebSettingsBoundaryInterface f90a;

    public C1247d(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f90a = webSettingsBoundaryInterface;
    }

    /* renamed from: a */
    public void m41536a(int i) {
        this.f90a.setForceDark(i);
    }

    /* renamed from: b */
    public void m41535b(int i) {
        this.f90a.setForceDarkBehavior(i);
    }
}
