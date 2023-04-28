package p003a2;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p184jk.C9687a;

/* renamed from: a2.j */
/* loaded from: classes.dex */
public class C1256j {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f118a;

    public C1256j(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f118a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public C1247d m41519a(WebSettings webSettings) {
        return new C1247d((WebSettingsBoundaryInterface) C9687a.m15593a(WebSettingsBoundaryInterface.class, this.f118a.convertSettings(webSettings)));
    }
}
