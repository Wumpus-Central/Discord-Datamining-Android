package p010a9;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p119g9.C7510a;
import p119g9.C7520e;
import p119g9.C7557q0;
import p119g9.C7570y;

/* renamed from: a9.a */
/* loaded from: classes7.dex */
final class C1334a {

    /* renamed from: c */
    private static final Pattern f225c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    private final C7570y f226a = new C7570y();

    /* renamed from: b */
    private final StringBuilder f227b = new StringBuilder();

    /* renamed from: a */
    private void m41345a(C1337d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f225c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.m41308x((String) C7510a.m22367e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] N0 = C7557q0.m22188N0(str, "\\.");
            String str2 = N0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.m41309w(str2.substring(0, indexOf2));
                dVar.m41310v(str2.substring(indexOf2 + 1));
            } else {
                dVar.m41309w(str2);
            }
            if (N0.length > 1) {
                dVar.m41311u((String[]) C7557q0.m22210C0(N0, 1, N0.length));
            }
        }
    }

    /* renamed from: b */
    private static boolean m41344b(C7570y yVar) {
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        byte[] d = yVar.m22012d();
        if (e + 2 > f) {
            return false;
        }
        int i = e + 1;
        if (d[e] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (d[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= f) {
                yVar.m22016Q(f - yVar.m22011e());
                return true;
            } else if (((char) d[i2]) == '*' && ((char) d[i3]) == '/') {
                i2 = i3 + 1;
                f = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    private static boolean m41343c(C7570y yVar) {
        char j = m41336j(yVar, yVar.m22011e());
        if (j != '\t' && j != '\n' && j != '\f' && j != '\r' && j != ' ') {
            return false;
        }
        yVar.m22016Q(1);
        return true;
    }

    /* renamed from: e */
    private static String m41341e(C7570y yVar, StringBuilder sb2) {
        boolean z = false;
        sb2.setLength(0);
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        while (e < f && !z) {
            char c = (char) yVar.m22012d()[e];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                e++;
                sb2.append(c);
            }
        }
        yVar.m22016Q(e - yVar.m22011e());
        return sb2.toString();
    }

    /* renamed from: f */
    static String m41340f(C7570y yVar, StringBuilder sb2) {
        m41333m(yVar);
        if (yVar.m22015a() == 0) {
            return null;
        }
        String e = m41341e(yVar, sb2);
        if (!"".equals(e)) {
            return e;
        }
        return "" + ((char) yVar.m22029D());
    }

    /* renamed from: g */
    private static String m41339g(C7570y yVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int e = yVar.m22011e();
            String f = m41340f(yVar, sb2);
            if (f == null) {
                return null;
            }
            if ("}".equals(f) || ";".equals(f)) {
                yVar.m22017P(e);
                z = true;
            } else {
                sb3.append(f);
            }
        }
        return sb3.toString();
    }

    /* renamed from: h */
    private static String m41338h(C7570y yVar, StringBuilder sb2) {
        String str;
        m41333m(yVar);
        if (yVar.m22015a() < 5 || !"::cue".equals(yVar.m22032A(5))) {
            return null;
        }
        int e = yVar.m22011e();
        String f = m41340f(yVar, sb2);
        if (f == null) {
            return null;
        }
        if ("{".equals(f)) {
            yVar.m22017P(e);
            return "";
        }
        if ("(".equals(f)) {
            str = m41335k(yVar);
        } else {
            str = null;
        }
        if (!")".equals(m41340f(yVar, sb2))) {
            return null;
        }
        return str;
    }

    /* renamed from: i */
    private static void m41337i(C7570y yVar, C1337d dVar, StringBuilder sb2) {
        m41333m(yVar);
        String e = m41341e(yVar, sb2);
        if (!"".equals(e) && ":".equals(m41340f(yVar, sb2))) {
            m41333m(yVar);
            String g = m41339g(yVar, sb2);
            if (g != null && !"".equals(g)) {
                int e2 = yVar.m22011e();
                String f = m41340f(yVar, sb2);
                if (!";".equals(f)) {
                    if ("}".equals(f)) {
                        yVar.m22017P(e2);
                    } else {
                        return;
                    }
                }
                if (ViewProps.COLOR.equals(e)) {
                    dVar.m41315q(C7520e.m22340b(g));
                } else if ("background-color".equals(e)) {
                    dVar.m41318n(C7520e.m22340b(g));
                } else {
                    boolean z = true;
                    if ("ruby-position".equals(e)) {
                        if ("over".equals(g)) {
                            dVar.m41312t(1);
                        } else if ("under".equals(g)) {
                            dVar.m41312t(2);
                        }
                    } else if ("text-combine-upright".equals(e)) {
                        if (!"all".equals(g) && !g.startsWith("digits")) {
                            z = false;
                        }
                        dVar.m41316p(z);
                    } else if ("text-decoration".equals(e)) {
                        if ("underline".equals(g)) {
                            dVar.m41307y(true);
                        }
                    } else if ("font-family".equals(e)) {
                        dVar.m41314r(g);
                    } else if ("font-weight".equals(e)) {
                        if ("bold".equals(g)) {
                            dVar.m41317o(true);
                        }
                    } else if ("font-style".equals(e) && "italic".equals(g)) {
                        dVar.m41313s(true);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private static char m41336j(C7570y yVar, int i) {
        return (char) yVar.m22012d()[i];
    }

    /* renamed from: k */
    private static String m41335k(C7570y yVar) {
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        boolean z = false;
        while (e < f && !z) {
            int i = e + 1;
            if (((char) yVar.m22012d()[e]) == ')') {
                z = true;
            } else {
                z = false;
            }
            e = i;
        }
        return yVar.m22032A((e - 1) - yVar.m22011e()).trim();
    }

    /* renamed from: l */
    static void m41334l(C7570y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.m22000p()));
    }

    /* renamed from: m */
    static void m41333m(C7570y yVar) {
        while (true) {
            for (boolean z = true; yVar.m22015a() > 0 && z; z = false) {
                if (m41343c(yVar) || m41344b(yVar)) {
                }
            }
            return;
        }
    }

    /* renamed from: d */
    public List<C1337d> m41342d(C7570y yVar) {
        boolean z;
        this.f227b.setLength(0);
        int e = yVar.m22011e();
        m41334l(yVar);
        this.f226a.m22019N(yVar.m22012d(), yVar.m22011e());
        this.f226a.m22017P(e);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String h = m41338h(this.f226a, this.f227b);
            if (h == null) {
                return arrayList;
            }
            if (!"{".equals(m41340f(this.f226a, this.f227b))) {
                return arrayList;
            }
            C1337d dVar = new C1337d();
            m41345a(dVar, h);
            String str = null;
            boolean z2 = false;
            while (!z2) {
                int e2 = this.f226a.m22011e();
                String f = m41340f(this.f226a, this.f227b);
                if (f == null || "}".equals(f)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f226a.m22017P(e2);
                    m41337i(this.f226a, dVar, this.f227b);
                }
                str = f;
                z2 = z;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
