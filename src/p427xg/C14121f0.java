package p427xg;

import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import ni.C11148a;
import p249nh.C11142f;
import p326ri.C12718u;
import p326ri.C12719v;

/* renamed from: xg.f0 */
/* loaded from: classes8.dex */
public final class C14121f0 {
    /* renamed from: a */
    public static final List<C11142f> m1598a(C11142f name) {
        List<C11142f> m;
        C9971q.m14633g(name, "name");
        String b = name.m10771b();
        C9971q.m14634f(b, "name.asString()");
        if (C14106a0.m1648c(b)) {
            m = C9906j.m14816m(m1597b(name));
            return m;
        } else if (C14106a0.m1647d(b)) {
            return m1593f(name);
        } else {
            return C14122g.f31903a.m1591b(name);
        }
    }

    /* renamed from: b */
    public static final C11142f m1597b(C11142f methodName) {
        C9971q.m14633g(methodName, "methodName");
        C11142f e = m1594e(methodName, "get", false, null, 12, null);
        if (e == null) {
            return m1594e(methodName, "is", false, null, 8, null);
        }
        return e;
    }

    /* renamed from: c */
    public static final C11142f m1596c(C11142f methodName, boolean z) {
        String str;
        C9971q.m14633g(methodName, "methodName");
        if (z) {
            str = "is";
        } else {
            str = null;
        }
        return m1594e(methodName, "set", false, str, 4, null);
    }

    /* renamed from: d */
    private static final C11142f m1595d(C11142f fVar, String str, boolean z, String str2) {
        boolean H;
        String p0;
        String p02;
        if (fVar.m10766g()) {
            return null;
        }
        String d = fVar.m10769d();
        C9971q.m14634f(d, "methodName.identifier");
        boolean z2 = false;
        H = C12718u.m5736H(d, str, false, 2, null);
        if (!H || d.length() == str.length()) {
            return null;
        }
        char charAt = d.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            p02 = C12719v.m5670p0(d, str);
            sb2.append(p02);
            return C11142f.m10767f(sb2.toString());
        } else if (!z) {
            return fVar;
        } else {
            p0 = C12719v.m5670p0(d, str);
            String c = C11148a.m10723c(p0, true);
            if (!C11142f.m10765h(c)) {
                return null;
            }
            return C11142f.m10767f(c);
        }
    }

    /* renamed from: e */
    static /* synthetic */ C11142f m1594e(C11142f fVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m1595d(fVar, str, z, str2);
    }

    /* renamed from: f */
    public static final List<C11142f> m1593f(C11142f methodName) {
        List<C11142f> n;
        C9971q.m14633g(methodName, "methodName");
        n = C9906j.m14815n(m1596c(methodName, false), m1596c(methodName, true));
        return n;
    }
}
