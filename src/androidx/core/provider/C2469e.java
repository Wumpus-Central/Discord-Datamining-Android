package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C2517g;
import java.util.List;

/* renamed from: androidx.core.provider.e */
/* loaded from: classes.dex */
public final class C2469e {

    /* renamed from: a */
    private final String f3398a;

    /* renamed from: b */
    private final String f3399b;

    /* renamed from: c */
    private final String f3400c;

    /* renamed from: d */
    private final List<List<byte[]>> f3401d;

    /* renamed from: e */
    private final int f3402e = 0;

    /* renamed from: f */
    private final String f3403f;

    public C2469e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3398a = (String) C2517g.m37588g(str);
        this.f3399b = (String) C2517g.m37588g(str2);
        this.f3400c = (String) C2517g.m37588g(str3);
        this.f3401d = (List) C2517g.m37588g(list);
        this.f3403f = m37697a(str, str2, str3);
    }

    /* renamed from: a */
    private String m37697a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m37696b() {
        return this.f3401d;
    }

    /* renamed from: c */
    public int m37695c() {
        return this.f3402e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m37694d() {
        return this.f3403f;
    }

    /* renamed from: e */
    public String m37693e() {
        return this.f3398a;
    }

    /* renamed from: f */
    public String m37692f() {
        return this.f3399b;
    }

    /* renamed from: g */
    public String m37691g() {
        return this.f3400c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f3398a + ", mProviderPackage: " + this.f3399b + ", mQuery: " + this.f3400c + ", mCertificates:");
        for (int i = 0; i < this.f3401d.size(); i++) {
            sb2.append(" [");
            List<byte[]> list = this.f3401d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3402e);
        return sb2.toString();
    }
}
