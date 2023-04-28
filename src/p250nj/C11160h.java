package p250nj;

import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import java.util.MissingResourceException;
import net.time4j.EnumC11039x0;
import p161ij.AbstractC8667r;
import p161ij.EnumC8659n;
import p161ij.EnumC8671v;

/* renamed from: nj.h */
/* loaded from: classes8.dex */
public final class C11160h implements AbstractC8667r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nj.h$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C11161a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24839a;

        static {
            int[] iArr = new int[EnumC8671v.values().length];
            f24839a = iArr;
            try {
                iArr[EnumC8671v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24839a[EnumC8671v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24839a[EnumC8671v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24839a[EnumC8671v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: F */
    private static String m10660F(char c, EnumC8671v vVar, EnumC8659n nVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        int i = C11161a.f24839a[vVar.ordinal()];
        if (i == 1) {
            sb2.append('w');
        } else if (i == 2 || i == 3) {
            sb2.append('s');
        } else if (i == 4) {
            sb2.append('n');
        } else {
            throw new UnsupportedOperationException(vVar.name());
        }
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    /* renamed from: G */
    private static String m10659G(char c, boolean z, EnumC8659n nVar) {
        char c2;
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        if (z) {
            c2 = '+';
        } else {
            c2 = '-';
        }
        sb2.append(c2);
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    /* renamed from: H */
    private static String m10658H(EnumC8671v vVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('L');
        int i = C11161a.f24839a[vVar.ordinal()];
        if (i == 1) {
            sb2.append('w');
        } else if (i == 2 || i == 3) {
            sb2.append('s');
        } else if (i == 4) {
            sb2.append('n');
        } else {
            throw new UnsupportedOperationException(vVar.name());
        }
        sb2.append('-');
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: I */
    private String m10657I(Locale locale, String str) {
        C11155e eVar;
        boolean z = true;
        C11155e eVar2 = null;
        for (Locale locale2 : C11155e.m10686c(locale)) {
            if (!z || eVar2 == null) {
                eVar = C11155e.m10681h("i18n/reltime/relpattern", locale2);
            } else {
                eVar = eVar2;
            }
            if (z) {
                if (locale2.equals(eVar.m10684e())) {
                    z = false;
                } else {
                    eVar2 = eVar;
                }
            }
            if (eVar.m10685d().contains(str)) {
                return eVar.m10683f(str);
            }
        }
        return "";
    }

    /* renamed from: J */
    private String m10656J(Locale locale, String str, String str2, String str3, EnumC8659n nVar) {
        C11155e eVar;
        boolean z = true;
        C11155e eVar2 = null;
        for (Locale locale2 : C11155e.m10686c(locale)) {
            if (!z || eVar2 == null) {
                eVar = C11155e.m10681h("i18n/" + str, locale2);
            } else {
                eVar = eVar2;
            }
            if (z) {
                if (locale2.equals(eVar.m10684e())) {
                    z = false;
                } else {
                    eVar2 = eVar;
                }
            }
            if (eVar.m10685d().contains(str2)) {
                return eVar.m10683f(str2);
            }
            if (nVar != EnumC8659n.OTHER && eVar.m10685d().contains(str3)) {
                return eVar.m10683f(str3);
            }
        }
        throw new MissingResourceException("Can't find resource for bundle " + str + ".properties, key " + str2, str + ".properties", str2);
    }

    /* renamed from: K */
    private String m10655K(Locale locale, char c, boolean z, EnumC8659n nVar) {
        return m10656J(locale, "reltime/relpattern", m10659G(c, z, nVar), m10659G(c, z, EnumC8659n.OTHER), nVar);
    }

    /* renamed from: L */
    private String m10654L(Locale locale, char c, EnumC8671v vVar, EnumC8659n nVar) {
        return m10656J(locale, "units/upattern", m10660F(c, vVar, nVar), m10660F(c, vVar, EnumC8659n.OTHER), nVar);
    }

    /* renamed from: M */
    private static String m10653M(String str, char c, int i) {
        int length = str.length() - 2;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '{') {
                int i3 = i2 + 1;
                if (str.charAt(i3) == c) {
                    int i4 = i2 + 2;
                    if (str.charAt(i4) == '}') {
                        StringBuilder sb2 = new StringBuilder(length + 10);
                        sb2.append(str);
                        sb2.replace(i3, i4, String.valueOf(i));
                        return sb2.toString();
                    }
                } else {
                    continue;
                }
            }
        }
        return str;
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: A */
    public String mo10665A(EnumC11039x0 x0Var, Locale locale) {
        return m10657I(locale, x0Var.name().substring(0, 3).toLowerCase() + "+");
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: B */
    public String mo10664B(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'M', z, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: C */
    public String mo10663C(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, '6', vVar, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: D */
    public String mo10662D(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'H', z, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: E */
    public String mo10661E(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, '3', vVar, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: a */
    public String mo10652a(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, '9', vVar, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: b */
    public String mo10651b(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'm', z, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: c */
    public String mo10650c(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, 'M', vVar, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: d */
    public String mo10649d(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'n', z, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: e */
    public String mo10648e(Locale locale) {
        return m10656J(locale, "reltime/relpattern", "yesterday", null, EnumC8659n.OTHER);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: f */
    public String mo10647f(Locale locale) {
        return m10656J(locale, "reltime/relpattern", "now", null, EnumC8659n.OTHER);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: g */
    public String mo10646g(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, 'D', vVar, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: h */
    public String mo10645h(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'd', z, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: i */
    public String mo10644i(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'S', z, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: j */
    public String mo10643j(Locale locale) {
        return m10656J(locale, "reltime/relpattern", "tomorrow", null, EnumC8659n.OTHER);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: k */
    public String mo10642k(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'h', z, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: l */
    public String mo10641l(Locale locale, EnumC8671v vVar, int i) {
        String str;
        int i2;
        if (i >= 2) {
            C11155e h = C11155e.m10681h("i18n/units/upattern", locale);
            String H = m10658H(vVar, String.valueOf(i));
            if (h.m10687b(H)) {
                return h.m10683f(H);
            }
            String f = h.m10683f(m10658H(vVar, ViewProps.END));
            if (i == 2) {
                return f;
            }
            String f2 = h.m10683f(m10658H(vVar, ViewProps.START));
            String f3 = h.m10683f(m10658H(vVar, "middle"));
            String M = m10653M(m10653M(f, '1', i - 1), '0', i - 2);
            String str2 = M;
            for (int i3 = i - 3; i3 >= 0; i3--) {
                if (i3 == 0) {
                    str = f2;
                } else {
                    str = f3;
                }
                int length = str.length();
                int i4 = length - 1;
                while (true) {
                    if (i4 < 0) {
                        i2 = -1;
                        break;
                    }
                    if (i4 >= 2 && str.charAt(i4) == '}' && str.charAt(i4 - 1) == '1') {
                        i2 = i4 - 2;
                        if (str.charAt(i2) == '{') {
                            break;
                        }
                    }
                    i4--;
                }
                if (i2 > -1) {
                    M = str.substring(0, i2) + str2;
                    if (i2 < length - 3) {
                        M = M + str.substring(i2 + 3);
                    }
                }
                if (i3 > 0) {
                    str2 = m10653M(M, '0', i3);
                }
            }
            return M;
        }
        throw new IllegalArgumentException("Size must be greater than 1.");
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: m */
    public String mo10640m(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, 'Y', vVar, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: n */
    public String mo10639n(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'W', z, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: o */
    public String mo10638o(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'Y', z, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: p */
    public String mo10637p(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'w', z, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: q */
    public String mo10636q(EnumC11039x0 x0Var, Locale locale) {
        return m10657I(locale, x0Var.name().substring(0, 3).toLowerCase() + "-");
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: r */
    public String mo10635r(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, 'S', vVar, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: s */
    public String mo10634s(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, 'N', vVar, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: t */
    public String mo10633t(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 's', z, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: u */
    public String mo10632u(Locale locale) {
        return m10656J(locale, "reltime/relpattern", "today", null, EnumC8659n.OTHER);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: v */
    public String mo10631v(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, 'H', vVar, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: w */
    public String mo10630w(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'N', z, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: x */
    public String mo10629x(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
        return m10654L(locale, 'W', vVar, nVar);
    }

    @Override // p161ij.AbstractC8683x
    /* renamed from: y */
    public String mo10628y(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'D', z, nVar);
    }

    @Override // p161ij.AbstractC8667r
    /* renamed from: z */
    public String mo10627z(Locale locale, boolean z, EnumC8659n nVar) {
        return m10655K(locale, 'y', z, nVar);
    }
}
