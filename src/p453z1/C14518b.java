package p453z1;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import p003a2.C1247d;
import p003a2.C1251g;
import p003a2.EnumC1248e;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public class C14518b {
    /* renamed from: a */
    private static C1247d m284a(WebSettings webSettings) {
        return C1251g.m41524c().m41519a(webSettings);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m283b(WebSettings webSettings, int i) {
        EnumC1248e eVar = EnumC1248e.FORCE_DARK;
        if (eVar.m41529f()) {
            webSettings.setForceDark(i);
        } else if (eVar.m41528g()) {
            m284a(webSettings).m41536a(i);
        } else {
            throw EnumC1248e.m41532c();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m282c(WebSettings webSettings, int i) {
        if (EnumC1248e.FORCE_DARK_STRATEGY.m41528g()) {
            m284a(webSettings).m41535b(i);
            return;
        }
        throw EnumC1248e.m41532c();
    }
}
