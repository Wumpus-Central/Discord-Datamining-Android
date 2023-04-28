package p074e2;

import android.net.UrlQuerySanitizer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: e2.u0 */
/* loaded from: classes.dex */
public class C6677u0 {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
        r1 = r7.toString();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p074e2.C6607c m24715a(android.net.Uri r7, long r8, p074e2.C6610d r10, p074e2.C6624h r11, p074e2.C6689x r12, p074e2.C6609c1 r13) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r7.toString()
            if (r1 == 0) goto L_0x008c
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0012
            goto L_0x008c
        L_0x0012:
            r2 = 0
            r3 = 1
            java.lang.String r4 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r4)     // Catch: Exception -> 0x001b, IllegalArgumentException -> 0x002e, UnsupportedEncodingException -> 0x0041
            goto L_0x0053
        L_0x001b:
            r4 = move-exception
            e2.c0 r5 = p074e2.C6639l.m24863j()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed. Message: (%s)"
            r5.mo24885b(r4, r6)
            goto L_0x0053
        L_0x002e:
            r4 = move-exception
            e2.c0 r5 = p074e2.C6639l.m24863j()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r5.mo24885b(r4, r6)
            goto L_0x0053
        L_0x0041:
            r4 = move-exception
            e2.c0 r5 = p074e2.C6639l.m24863j()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r5.mo24885b(r4, r6)
        L_0x0053:
            e2.c0 r4 = p074e2.C6639l.m24863j()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r1
            java.lang.String r2 = "Url to parse (%s)"
            r4.mo24880g(r2, r5)
            android.net.UrlQuerySanitizer r2 = new android.net.UrlQuerySanitizer
            r2.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r4 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r2.setUnregisteredParameterValueSanitizer(r4)
            r2.setAllowUnregisteredParamaters(r3)
            r2.parseUrl(r1)
            java.util.List r1 = r2.getParameterList()
            e2.t0 r10 = m24711e(r1, r10, r11, r12, r13)
            if (r10 != 0) goto L_0x007d
            return r0
        L_0x007d:
            java.lang.String r7 = r7.toString()
            r10.f14133l = r7
            r10.f14128g = r8
            java.lang.String r7 = "deeplink"
            e2.c r7 = r10.m24751p(r7)
            return r7
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p074e2.C6677u0.m24715a(android.net.Uri, long, e2.d, e2.h, e2.x, e2.c1):e2.c");
    }

    /* renamed from: b */
    public static C6607c m24714b(C6690x0 x0Var, String str, C6610d dVar, C6624h hVar, C6689x xVar, C6609c1 c1Var) {
        C6668t0 t0Var = new C6668t0(hVar, xVar, dVar, c1Var, System.currentTimeMillis());
        t0Var.f14134m = x0Var.f14224a;
        t0Var.f14127f = x0Var.f14225b;
        t0Var.f14129h = x0Var.f14226c;
        t0Var.f14130i = x0Var.f14227d;
        t0Var.f14131j = x0Var.f14228e;
        t0Var.f14135n = x0Var.f14229f;
        t0Var.f14140s = x0Var.f14230g;
        t0Var.f14137p = str;
        return t0Var.m24751p("install_referrer");
    }

    /* renamed from: c */
    public static C6607c m24713c(String str, String str2, C6610d dVar, C6624h hVar, C6689x xVar, C6609c1 c1Var) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C6668t0 t0Var = new C6668t0(hVar, xVar, dVar, c1Var, System.currentTimeMillis());
        t0Var.f14138q = str;
        t0Var.f14139r = str2;
        return t0Var.m24751p("preinstall");
    }

    /* renamed from: d */
    public static C6607c m24712d(String str, long j, C6610d dVar, C6624h hVar, C6689x xVar, C6609c1 c1Var) {
        String str2 = "malformed";
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C6639l.m24863j().mo24885b("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (IllegalArgumentException e2) {
            C6639l.m24863j().mo24885b("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (Exception e3) {
            C6639l.m24863j().mo24885b("Referrer decoding failed. Message: (%s)", e3.getMessage());
        }
        C6639l.m24863j().mo24880g("Referrer to parse (%s)", str2);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str2);
        C6668t0 e4 = m24711e(urlQuerySanitizer.getParameterList(), dVar, hVar, xVar, c1Var);
        if (e4 == null) {
            return null;
        }
        e4.f14134m = str2;
        e4.f14128g = j;
        e4.f14136o = str;
        return e4.m24751p("reftag");
    }

    /* renamed from: e */
    private static C6668t0 m24711e(List<UrlQuerySanitizer.ParameterValuePair> list, C6610d dVar, C6624h hVar, C6689x xVar, C6609c1 c1Var) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C6619g gVar = new C6619g();
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            m24710f(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, gVar);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove("reftag");
        if (dVar != null) {
            dVar.f13903w = currentTimeMillis - dVar.f13902v;
        }
        C6668t0 t0Var = new C6668t0(hVar, xVar, dVar, c1Var, currentTimeMillis);
        t0Var.f14142u = linkedHashMap;
        t0Var.f14141t = gVar;
        t0Var.f14132k = str;
        return t0Var;
    }

    /* renamed from: f */
    private static boolean m24710f(String str, String str2, Map<String, String> map, C6619g gVar) {
        if (str == null || str2 == null || !str.startsWith("adjust_")) {
            return false;
        }
        String substring = str.substring(7);
        if (substring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (m24709g(gVar, substring, str2)) {
            return true;
        }
        map.put(substring, str2);
        return true;
    }

    /* renamed from: g */
    private static boolean m24709g(C6619g gVar, String str, String str2) {
        if (str.equals("tracker")) {
            gVar.f13925l = str2;
            return true;
        } else if (str.equals("campaign")) {
            gVar.f13927n = str2;
            return true;
        } else if (str.equals("adgroup")) {
            gVar.f13928o = str2;
            return true;
        } else if (!str.equals("creative")) {
            return false;
        } else {
            gVar.f13929p = str2;
            return true;
        }
    }
}
