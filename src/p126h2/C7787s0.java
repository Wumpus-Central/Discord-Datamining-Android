package p126h2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: h2.s0 */
/* loaded from: classes.dex */
public class C7787s0 {

    /* renamed from: b */
    private final C7756h f16979b;

    /* renamed from: a */
    private final Map<String, String> f16978a = new HashMap();

    /* renamed from: d */
    private boolean f16981d = true;

    /* renamed from: c */
    private final C7748e0 f16980c = null;

    public C7787s0(C7756h hVar) {
        this.f16979b = hVar;
    }

    /* renamed from: d */
    private void m21323d() {
        C7756h hVar = this.f16979b;
        if (hVar != null) {
            hVar.invalidate();
        }
        C7748e0 e0Var = this.f16980c;
        if (e0Var != null) {
            e0Var.invalidateSelf();
        }
    }

    /* renamed from: a */
    public String m21326a(String str) {
        return str;
    }

    /* renamed from: b */
    public String m21325b(String str, String str2) {
        return m21326a(str2);
    }

    /* renamed from: c */
    public final String m21324c(String str, String str2) {
        if (this.f16981d && this.f16978a.containsKey(str2)) {
            return this.f16978a.get(str2);
        }
        String b = m21325b(str, str2);
        if (this.f16981d) {
            this.f16978a.put(str2, b);
        }
        return b;
    }

    /* renamed from: e */
    public void m21322e(String str, String str2) {
        this.f16978a.put(str, str2);
        m21323d();
    }
}
