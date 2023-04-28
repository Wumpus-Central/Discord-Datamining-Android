package p305qh;

import java.util.List;
import kotlin.jvm.internal.C9971q;
import p249nh.C11138d;
import p249nh.C11142f;
import p326ri.C12718u;

/* renamed from: qh.n */
/* loaded from: classes8.dex */
public final class C12175n {
    /* renamed from: a */
    public static final String m7504a(C11138d dVar) {
        C9971q.m14633g(dVar, "<this>");
        List<C11142f> h = dVar.m10786h();
        C9971q.m14634f(h, "pathSegments()");
        return m7502c(h);
    }

    /* renamed from: b */
    public static final String m7503b(C11142f fVar) {
        C9971q.m14633g(fVar, "<this>");
        if (m7500e(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            String b = fVar.m10771b();
            C9971q.m14634f(b, "asString()");
            sb2.append('`' + b);
            sb2.append('`');
            return sb2.toString();
        }
        String b2 = fVar.m10771b();
        C9971q.m14634f(b2, "asString()");
        return b2;
    }

    /* renamed from: c */
    public static final String m7502c(List<C11142f> pathSegments) {
        C9971q.m14633g(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (C11142f fVar : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(m7503b(fVar));
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: d */
    public static final String m7501d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        boolean H;
        boolean H2;
        C9971q.m14633g(lowerRendered, "lowerRendered");
        C9971q.m14633g(lowerPrefix, "lowerPrefix");
        C9971q.m14633g(upperRendered, "upperRendered");
        C9971q.m14633g(upperPrefix, "upperPrefix");
        C9971q.m14633g(foldedPrefix, "foldedPrefix");
        H = C12718u.m5736H(lowerRendered, lowerPrefix, false, 2, null);
        if (H) {
            H2 = C12718u.m5736H(upperRendered, upperPrefix, false, 2, null);
            if (H2) {
                String substring = lowerRendered.substring(lowerPrefix.length());
                C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
                String substring2 = upperRendered.substring(upperPrefix.length());
                C9971q.m14634f(substring2, "this as java.lang.String).substring(startIndex)");
                String str = foldedPrefix + substring;
                if (C9971q.m14638b(substring, substring2)) {
                    return str;
                }
                if (m7499f(substring, substring2)) {
                    return str + '!';
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    private static final boolean m7500e(C11142f fVar) {
        boolean z;
        boolean z2;
        String b = fVar.m10771b();
        C9971q.m14634f(b, "asString()");
        if (C12168i.f27307a.contains(b)) {
            return true;
        }
        int i = 0;
        while (true) {
            if (i >= b.length()) {
                z = false;
                break;
            }
            char charAt = b.charAt(i);
            if (Character.isLetterOrDigit(charAt) || charAt == '_') {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (kotlin.jvm.internal.C9971q.m14638b(r7 + '?', r8) == false) goto L_0x003e;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m7499f(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.C9971q.m14633g(r7, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.C9971q.m14633g(r8, r0)
            java.lang.String r2 = "?"
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            java.lang.String r0 = p326ri.C12707l.m5818D(r1, r2, r3, r4, r5, r6)
            boolean r0 = kotlin.jvm.internal.C9971q.m14638b(r7, r0)
            if (r0 != 0) goto L_0x005a
            r0 = 2
            r1 = 0
            java.lang.String r2 = "?"
            r3 = 0
            boolean r0 = p326ri.C12707l.m5772s(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.C9971q.m14638b(r0, r8)
            if (r0 != 0) goto L_0x005a
        L_0x003e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.C9971q.m14638b(r7, r8)
            if (r7 == 0) goto L_0x005b
        L_0x005a:
            r3 = 1
        L_0x005b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p305qh.C12175n.m7499f(java.lang.String, java.lang.String):boolean");
    }
}
