package p010a9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p079e7.C6728o;
import p119g9.C7557q0;
import p119g9.C7570y;

/* renamed from: a9.i */
/* loaded from: classes7.dex */
public final class C1347i {

    /* renamed from: a */
    private static final Pattern f276a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m41265a(C7570y yVar) {
        String p;
        while (true) {
            String p2 = yVar.m22000p();
            if (p2 == null) {
                return null;
            }
            if (f276a.matcher(p2).matches()) {
                do {
                    p = yVar.m22000p();
                    if (p != null) {
                    }
                } while (!p.isEmpty());
            } else {
                Matcher matcher = C1339f.f250a.matcher(p2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m41264b(C7570y yVar) {
        String p = yVar.m22000p();
        if (p == null || !p.startsWith("WEBVTT")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static float m41263c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m41262d(String str) {
        String[] O0 = C7557q0.m22186O0(str, "\\.");
        long j = 0;
        for (String str2 : C7557q0.m22188N0(O0[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (O0.length == 2) {
            j2 += Long.parseLong(O0[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: e */
    public static void m41261e(C7570y yVar) {
        int e = yVar.m22011e();
        if (!m41264b(yVar)) {
            yVar.m22017P(e);
            throw new C6728o("Expected WEBVTT. Got " + yVar.m22000p());
        }
    }
}
