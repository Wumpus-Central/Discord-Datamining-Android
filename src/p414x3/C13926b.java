package p414x3;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: x3.b */
/* loaded from: classes7.dex */
public class C13926b implements AbstractC13927c {

    /* renamed from: c */
    public static final C13926b f31387c = new C13926b();

    /* renamed from: a */
    private String f31388a = "unknown";

    /* renamed from: b */
    private int f31389b = 5;

    private C13926b() {
    }

    /* renamed from: k */
    public static C13926b m2271k() {
        return f31387c;
    }

    /* renamed from: l */
    private static String m2270l(String str, Throwable th2) {
        return str + '\n' + m2269m(th2);
    }

    /* renamed from: m */
    private static String m2269m(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: n */
    private String m2268n(String str) {
        if (this.f31388a == null) {
            return str;
        }
        return this.f31388a + ":" + str;
    }

    /* renamed from: o */
    private void m2267o(int i, String str, String str2) {
        Log.println(i, m2268n(str), str2);
    }

    /* renamed from: p */
    private void m2266p(int i, String str, String str2, Throwable th2) {
        Log.println(i, m2268n(str), m2270l(str2, th2));
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: a */
    public void mo2265a(String str, String str2) {
        m2267o(5, str, str2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: b */
    public void mo2264b(String str, String str2) {
        m2267o(6, str, str2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: c */
    public void mo2263c(String str, String str2) {
        m2267o(2, str, str2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: d */
    public void mo2262d(String str, String str2) {
        m2267o(6, str, str2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: e */
    public void mo2261e(String str, String str2) {
        m2267o(3, str, str2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: f */
    public void mo2259f(String str, String str2, Throwable th2) {
        m2266p(3, str, str2, th2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: g */
    public void mo2258g(String str, String str2, Throwable th2) {
        m2266p(6, str, str2, th2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: h */
    public void mo2257h(String str, String str2, Throwable th2) {
        m2266p(5, str, str2, th2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: i */
    public boolean mo2256i(int i) {
        return this.f31389b <= i;
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: j */
    public void mo2255j(String str, String str2) {
        m2267o(4, str, str2);
    }

    @Override // p414x3.AbstractC13927c
    /* renamed from: e */
    public void mo2260e(String str, String str2, Throwable th2) {
        m2266p(6, str, str2, th2);
    }
}
