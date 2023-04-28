package p042c9;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7562u;

/* renamed from: c9.c */
/* loaded from: classes5.dex */
public class C3783c implements AbstractC3793m {

    /* renamed from: a */
    private final Resources f6202a;

    public C3783c(Resources resources) {
        this.f6202a = (Resources) C7510a.m22367e(resources);
    }

    /* renamed from: b */
    private String m33596b(C6722k kVar) {
        int i = kVar.f37969I;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.f6202a.getString(C3791k.f6249j);
        }
        if (i == 2) {
            return this.f6202a.getString(C3791k.f6257r);
        }
        if (i == 6 || i == 7) {
            return this.f6202a.getString(C3791k.f6259t);
        }
        if (i != 8) {
            return this.f6202a.getString(C3791k.f6258s);
        }
        return this.f6202a.getString(C3791k.f6260u);
    }

    /* renamed from: c */
    private String m33595c(C6722k kVar) {
        int i = kVar.f14325r;
        if (i == -1) {
            return "";
        }
        return this.f6202a.getString(C3791k.f6248i, Float.valueOf(i / 1000000.0f));
    }

    /* renamed from: d */
    private String m33594d(C6722k kVar) {
        return TextUtils.isEmpty(kVar.f14319l) ? "" : kVar.f14319l;
    }

    /* renamed from: e */
    private String m33593e(C6722k kVar) {
        String j = m33588j(m33592f(kVar), m33590h(kVar));
        if (TextUtils.isEmpty(j)) {
            return m33594d(kVar);
        }
        return j;
    }

    /* renamed from: f */
    private String m33592f(C6722k kVar) {
        Locale locale;
        String str = kVar.f14320m;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        if (C7557q0.f16368a >= 21) {
            locale = Locale.forLanguageTag(str);
        } else {
            locale = new Locale(str);
        }
        return locale.getDisplayName();
    }

    /* renamed from: g */
    private String m33591g(C6722k kVar) {
        int i = kVar.f37961A;
        int i2 = kVar.f37962B;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.f6202a.getString(C3791k.f6250k, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: h */
    private String m33590h(C6722k kVar) {
        String str;
        if ((kVar.f14322o & 2) != 0) {
            str = this.f6202a.getString(C3791k.f6251l);
        } else {
            str = "";
        }
        if ((kVar.f14322o & 4) != 0) {
            str = m33588j(str, this.f6202a.getString(C3791k.f6254o));
        }
        if ((kVar.f14322o & 8) != 0) {
            str = m33588j(str, this.f6202a.getString(C3791k.f6253n));
        }
        if ((kVar.f14322o & 1088) != 0) {
            return m33588j(str, this.f6202a.getString(C3791k.f6252m));
        }
        return str;
    }

    /* renamed from: i */
    private static int m33589i(C6722k kVar) {
        int l = C7562u.m22076l(kVar.f14329v);
        if (l != -1) {
            return l;
        }
        if (C7562u.m22073o(kVar.f14326s) != null) {
            return 2;
        }
        if (C7562u.m22085c(kVar.f14326s) != null) {
            return 1;
        }
        if (kVar.f37961A != -1 || kVar.f37962B != -1) {
            return 2;
        }
        if (kVar.f37969I == -1 && kVar.f37970J == -1) {
            return -1;
        }
        return 1;
    }

    /* renamed from: j */
    private String m33588j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f6202a.getString(C3791k.f6247h, str, str2);
                }
            }
        }
        return str;
    }

    @Override // p042c9.AbstractC3793m
    /* renamed from: a */
    public String mo33587a(C6722k kVar) {
        String str;
        int i = m33589i(kVar);
        if (i == 2) {
            str = m33588j(m33590h(kVar), m33591g(kVar), m33595c(kVar));
        } else if (i == 1) {
            str = m33588j(m33593e(kVar), m33596b(kVar), m33595c(kVar));
        } else {
            str = m33593e(kVar);
        }
        if (str.length() == 0) {
            return this.f6202a.getString(C3791k.f6261v);
        }
        return str;
    }
}
