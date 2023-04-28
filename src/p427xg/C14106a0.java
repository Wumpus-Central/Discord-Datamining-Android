package p427xg;

import kotlin.jvm.internal.C9971q;
import ni.C11148a;
import p249nh.C11136b;
import p249nh.C11137c;
import p326ri.C12718u;

/* renamed from: xg.a0 */
/* loaded from: classes8.dex */
public final class C14106a0 {

    /* renamed from: a */
    public static final C14106a0 f31833a = new C14106a0();

    /* renamed from: b */
    public static final C11137c f31834b;

    /* renamed from: c */
    public static final C11136b f31835c;

    /* renamed from: d */
    private static final C11136b f31836d;

    /* renamed from: e */
    private static final C11136b f31837e;

    static {
        C11137c cVar = new C11137c("kotlin.jvm.JvmField");
        f31834b = cVar;
        C11136b m = C11136b.m10805m(cVar);
        C9971q.m14634f(m, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f31835c = m;
        C11136b m2 = C11136b.m10805m(new C11137c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        C9971q.m14634f(m2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f31836d = m2;
        C11136b e = C11136b.m10813e("kotlin/jvm/internal/RepeatableContainer");
        C9971q.m14634f(e, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f31837e = e;
    }

    private C14106a0() {
    }

    /* renamed from: b */
    public static final String m1649b(String propertyName) {
        C9971q.m14633g(propertyName, "propertyName");
        if (m1645f(propertyName)) {
            return propertyName;
        }
        return "get" + C11148a.m10725a(propertyName);
    }

    /* renamed from: c */
    public static final boolean m1648c(String name) {
        boolean H;
        boolean H2;
        C9971q.m14633g(name, "name");
        H = C12718u.m5736H(name, "get", false, 2, null);
        if (!H) {
            H2 = C12718u.m5736H(name, "is", false, 2, null);
            if (!H2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m1647d(String name) {
        boolean H;
        C9971q.m14633g(name, "name");
        H = C12718u.m5736H(name, "set", false, 2, null);
        return H;
    }

    /* renamed from: e */
    public static final String m1646e(String propertyName) {
        String str;
        C9971q.m14633g(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (m1645f(propertyName)) {
            str = propertyName.substring(2);
            C9971q.m14634f(str, "this as java.lang.String).substring(startIndex)");
        } else {
            str = C11148a.m10725a(propertyName);
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: f */
    public static final boolean m1645f(String name) {
        boolean H;
        C9971q.m14633g(name, "name");
        H = C12718u.m5736H(name, "is", false, 2, null);
        if (!H || name.length() == 2) {
            return false;
        }
        char charAt = name.charAt(2);
        if (C9971q.m14631i(97, charAt) > 0 || C9971q.m14631i(charAt, 122) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C11136b m1650a() {
        return f31837e;
    }
}
