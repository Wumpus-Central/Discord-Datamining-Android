package com.facebook.hermes.intl;

import com.facebook.hermes.intl.C4871e;
import com.facebook.hermes.intl.C4881k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import p129h5.C7848j;
import p129h5.C7863m;

/* renamed from: com.facebook.hermes.intl.f */
/* loaded from: classes7.dex */
public class C4874f {
    /* renamed from: a */
    private static void m31597a(String str, C4881k.C4882a aVar) {
        ArrayList<String> arrayList = aVar.f8084d;
        if (arrayList != null) {
            int binarySearch = Collections.binarySearch(arrayList, str);
            if (binarySearch < 0) {
                aVar.f8084d.add((binarySearch * (-1)) - 1, str);
                return;
            }
            throw new C7848j("Duplicate variant");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        aVar.f8084d = arrayList2;
        arrayList2.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m31596b(String str) {
        return C7863m.m21221b(str).mo21163g();
    }

    /* renamed from: c */
    static boolean m31595c(CharSequence charSequence, C4871e eVar, C4871e.C4872a aVar, boolean z, C4881k kVar) {
        if (z && aVar.m31609d()) {
            m31588j(charSequence, eVar, aVar, kVar);
            return true;
        } else if (!aVar.m31612a()) {
            return false;
        } else {
            if (!z) {
                m31594d(charSequence, aVar, eVar, kVar);
                return true;
            }
            throw new C7848j(String.format("Extension singletons in transformed extension language tag: %s", charSequence));
        }
    }

    /* renamed from: d */
    static void m31594d(CharSequence charSequence, C4871e.C4872a aVar, C4871e eVar, C4881k kVar) {
        if (eVar.m31615a()) {
            char charAt = aVar.toString().charAt(0);
            if (charAt == 'u') {
                m31586l(charSequence, eVar, kVar);
            } else if (charAt == 't') {
                m31587k(charSequence, eVar, kVar);
            } else if (charAt == 'x') {
                m31589i(charSequence, eVar, kVar);
            } else {
                m31590h(charSequence, eVar, kVar, charAt);
            }
        } else {
            throw new C7848j("Extension sequence expected.");
        }
    }

    /* renamed from: e */
    static void m31593e(CharSequence charSequence, C4871e eVar, C4871e.C4872a aVar, boolean z, C4881k kVar) {
        C4881k.C4882a aVar2 = new C4881k.C4882a();
        if (z) {
            kVar.f8077d = aVar2;
        } else {
            kVar.f8074a = aVar2;
        }
        try {
            if (aVar.m31604i()) {
                aVar2.f8081a = aVar.m31600m();
                if (eVar.m31615a()) {
                    C4871e.C4872a c = eVar.m31613c();
                    if (!m31595c(charSequence, eVar, c, z, kVar)) {
                        if (c.m31602k()) {
                            aVar2.f8082b = c.m31599n();
                            if (eVar.m31615a()) {
                                c = eVar.m31613c();
                            } else {
                                return;
                            }
                        }
                        if (c.m31603j()) {
                            aVar2.f8083c = c.m31598o();
                            if (eVar.m31615a()) {
                                c = eVar.m31613c();
                            } else {
                                return;
                            }
                        }
                        while (!m31595c(charSequence, eVar, c, z, kVar)) {
                            if (c.m31601l()) {
                                m31597a(c.toString(), aVar2);
                                if (eVar.m31615a()) {
                                    c = eVar.m31613c();
                                } else {
                                    return;
                                }
                            } else {
                                throw new C7848j(String.format("Unknown token [%s] found in locale id: %s", c.toString(), charSequence));
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new C7848j(String.format("Language subtag expected at %s: %s", aVar.toString(), charSequence));
        } catch (C4871e.C4873b unused) {
            throw new C7848j(String.format("Locale Identifier subtag iteration failed: %s", charSequence));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C4881k m31592f(String str) {
        int binarySearch;
        String[] strArr = C4870d.f8040a;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str.toString())) >= 0) {
            str = C4870d.f8041b[binarySearch];
        }
        String lowerCase = str.toLowerCase();
        return m31591g(lowerCase, new C4871e(lowerCase));
    }

    /* renamed from: g */
    static C4881k m31591g(String str, C4871e eVar) {
        C4881k kVar = new C4881k();
        try {
            if (eVar.m31615a()) {
                m31593e(str, eVar, eVar.m31613c(), false, kVar);
                return kVar;
            }
            throw new C7848j(String.format("Language subtag not found: %s", str));
        } catch (C4871e.C4873b unused) {
            throw new C7848j(String.format("Locale Identifier subtag iteration failed: %s", str));
        }
    }

    /* renamed from: h */
    static void m31590h(CharSequence charSequence, C4871e eVar, C4881k kVar, char c) {
        if (eVar.m31615a()) {
            C4871e.C4872a c2 = eVar.m31613c();
            if (kVar.f8079f == null) {
                kVar.f8079f = new TreeMap<>();
            }
            ArrayList<String> arrayList = new ArrayList<>();
            kVar.f8079f.put(new Character(c), arrayList);
            while (c2.m31611b()) {
                arrayList.add(c2.toString());
                if (eVar.m31615a()) {
                    c2 = eVar.m31613c();
                } else {
                    return;
                }
            }
            if (c2.m31612a()) {
                m31594d(charSequence, c2, eVar, kVar);
                return;
            }
            throw new C7848j("Malformed sequence expected.");
        }
        throw new C7848j("Extension sequence expected.");
    }

    /* renamed from: i */
    static void m31589i(CharSequence charSequence, C4871e eVar, C4881k kVar) {
        if (eVar.m31615a()) {
            C4871e.C4872a c = eVar.m31613c();
            if (kVar.f8080g == null) {
                kVar.f8080g = new ArrayList<>();
            }
            while (c.m31610c()) {
                kVar.f8080g.add(c.toString());
                if (eVar.m31615a()) {
                    c = eVar.m31613c();
                } else {
                    return;
                }
            }
            throw new C7848j("Tokens are not expected after pu extension.");
        }
        throw new C7848j("Extension sequence expected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m31588j(java.lang.CharSequence r4, com.facebook.hermes.intl.C4871e r5, com.facebook.hermes.intl.C4871e.C4872a r6, com.facebook.hermes.intl.C4881k r7) {
        /*
            boolean r0 = r6.m31609d()
            if (r0 == 0) goto L_0x006d
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r7.f8078e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x005d
            if (r0 != 0) goto L_0x0015
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r7.f8078e = r0
        L_0x0015:
            java.lang.String r6 = r6.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r3 = r7.f8078e
            r3.put(r6, r0)
            boolean r6 = r5.m31615a()
            if (r6 == 0) goto L_0x004d
            com.facebook.hermes.intl.e$a r6 = r5.m31613c()
        L_0x002d:
            boolean r3 = r6.m31608e()
            if (r3 == 0) goto L_0x0046
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            boolean r6 = r5.m31615a()
            if (r6 != 0) goto L_0x0041
            return
        L_0x0041:
            com.facebook.hermes.intl.e$a r6 = r5.m31613c()
            goto L_0x002d
        L_0x0046:
            boolean r0 = r6.m31609d()
            if (r0 != 0) goto L_0x0015
            goto L_0x006d
        L_0x004d:
            h5.j r5 = new h5.j
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Malformated transformed key in : %s"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L_0x005d:
            h5.j r5 = new h5.j
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Duplicate transformed extension sequence in [%s]"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L_0x006d:
            boolean r0 = r6.m31612a()
            if (r0 == 0) goto L_0x0077
            m31594d(r4, r6, r5, r7)
            return
        L_0x0077:
            h5.j r4 = new h5.j
            java.lang.String r5 = "Malformed extension sequence."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C4874f.m31588j(java.lang.CharSequence, com.facebook.hermes.intl.e, com.facebook.hermes.intl.e$a, com.facebook.hermes.intl.k):void");
    }

    /* renamed from: k */
    static void m31587k(CharSequence charSequence, C4871e eVar, C4881k kVar) {
        if (eVar.m31615a()) {
            C4871e.C4872a c = eVar.m31613c();
            if (c.m31604i()) {
                m31593e(charSequence, eVar, c, true, kVar);
            } else if (c.m31609d()) {
                m31588j(charSequence, eVar, c, kVar);
            } else {
                throw new C7848j(String.format("Unexpected token [%s] in transformed extension sequence [%s]", c.toString(), charSequence));
            }
        } else {
            throw new C7848j("Extension sequence expected.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m31586l(java.lang.CharSequence r3, com.facebook.hermes.intl.C4871e r4, com.facebook.hermes.intl.C4881k r5) {
        /*
            boolean r0 = r4.m31615a()
            if (r0 == 0) goto L_0x00a5
            com.facebook.hermes.intl.e$a r0 = r4.m31613c()
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f8075b
            if (r1 != 0) goto L_0x0093
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f8076c
            if (r1 != 0) goto L_0x0093
        L_0x0012:
            boolean r1 = r0.m31607f()
            if (r1 == 0) goto L_0x0038
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f8075b
            if (r1 != 0) goto L_0x0023
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8075b = r1
        L_0x0023:
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f8075b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.m31615a()
            if (r0 != 0) goto L_0x0033
            return
        L_0x0033:
            com.facebook.hermes.intl.e$a r0 = r4.m31613c()
            goto L_0x0012
        L_0x0038:
            boolean r1 = r0.m31606g()
            if (r1 == 0) goto L_0x0081
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f8076c
            if (r1 != 0) goto L_0x0049
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r5.f8076c = r1
        L_0x0049:
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r2 = r5.f8076c
            r2.put(r0, r1)
            boolean r0 = r4.m31615a()
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            com.facebook.hermes.intl.e$a r0 = r4.m31613c()
        L_0x0062:
            boolean r2 = r0.m31605h()
            if (r2 == 0) goto L_0x007b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.m31615a()
            if (r0 != 0) goto L_0x0076
            return
        L_0x0076:
            com.facebook.hermes.intl.e$a r0 = r4.m31613c()
            goto L_0x0062
        L_0x007b:
            boolean r1 = r0.m31606g()
            if (r1 != 0) goto L_0x0049
        L_0x0081:
            boolean r1 = r0.m31612a()
            if (r1 == 0) goto L_0x008b
            m31594d(r3, r0, r4, r5)
            return
        L_0x008b:
            h5.j r3 = new h5.j
            java.lang.String r4 = "Malformed sequence expected."
            r3.<init>(r4)
            throw r3
        L_0x0093:
            h5.j r4 = new h5.j
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            java.lang.String r3 = "Duplicate unicode extension sequence in [%s]"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
        L_0x00a5:
            h5.j r3 = new h5.j
            java.lang.String r4 = "Extension sequence expected."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C4874f.m31586l(java.lang.CharSequence, com.facebook.hermes.intl.e, com.facebook.hermes.intl.k):void");
    }

    /* renamed from: m */
    public static void m31585m(StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        if (C4870d.f8042c != null) {
            if (stringBuffer.length() == 2) {
                strArr6 = C4870d.f8042c;
                strArr5 = C4870d.f8043d;
                strArr4 = C4870d.f8046g;
                strArr3 = C4870d.f8047h;
                strArr2 = C4870d.f8048i;
                strArr = C4870d.f8049j;
            } else {
                strArr6 = C4870d.f8044e;
                strArr5 = C4870d.f8045f;
                strArr4 = C4870d.f8050k;
                strArr3 = C4870d.f8051l;
                strArr2 = C4870d.f8052m;
                strArr = C4870d.f8053n;
            }
            int binarySearch = Arrays.binarySearch(strArr6, stringBuffer.toString());
            if (binarySearch >= 0) {
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(strArr5[binarySearch]);
                return;
            }
            int binarySearch2 = Arrays.binarySearch(strArr4, stringBuffer.toString());
            if (binarySearch2 >= 0) {
                String str = strArr3[binarySearch2];
                String str2 = strArr2[binarySearch2];
                String str3 = strArr[binarySearch2];
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(str);
                if (stringBuffer2.length() == 0 && str2 != null) {
                    stringBuffer2.append(str2);
                }
                if (stringBuffer3.length() == 0 && str3 != null) {
                    stringBuffer3.append(str3);
                }
            }
        }
    }

    /* renamed from: n */
    public static String m31584n(StringBuffer stringBuffer) {
        if (C4870d.f8054o == null) {
            return stringBuffer.toString();
        }
        if (stringBuffer.length() == 2) {
            int binarySearch = Arrays.binarySearch(C4870d.f8054o, stringBuffer.toString());
            if (binarySearch >= 0) {
                return C4870d.f8055p[binarySearch];
            }
            return stringBuffer.toString();
        }
        int binarySearch2 = Arrays.binarySearch(C4870d.f8056q, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            return C4870d.f8057r[binarySearch2];
        }
        return stringBuffer.toString();
    }
}
