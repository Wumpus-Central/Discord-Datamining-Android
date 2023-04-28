package kotlin.jvm.internal;

import ag.AbstractC1385a;
import ag.AbstractC1386b;
import ag.AbstractC1387c;
import ag.AbstractC1388d;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import nf.AbstractC11069g;
import p466zf.AbstractC14628a;
import p466zf.AbstractC14629b;
import p466zf.AbstractC14630c;
import p466zf.AbstractC14631d;
import p466zf.AbstractC14632e;
import p466zf.AbstractC14633f;
import p466zf.AbstractC14634g;
import p466zf.AbstractC14635h;
import p466zf.AbstractC14636i;
import p466zf.AbstractC14637j;
import p466zf.AbstractC14638k;
import p466zf.AbstractC14639l;
import p466zf.AbstractC14640m;
import p466zf.AbstractC14641n;
import p466zf.AbstractC14642o;
import p466zf.AbstractC14643p;
import p466zf.AbstractC14644q;
import p466zf.AbstractC14645r;

/* renamed from: kotlin.jvm.internal.l0 */
/* loaded from: classes8.dex */
public class C9964l0 {
    /* renamed from: a */
    public static Collection m14656a(Object obj) {
        if ((obj instanceof AbstractC1385a) && !(obj instanceof AbstractC1386b)) {
            m14644m(obj, "kotlin.collections.MutableCollection");
        }
        return m14652e(obj);
    }

    /* renamed from: b */
    public static List m14655b(Object obj) {
        if ((obj instanceof AbstractC1385a) && !(obj instanceof AbstractC1387c)) {
            m14644m(obj, "kotlin.collections.MutableList");
        }
        return m14651f(obj);
    }

    /* renamed from: c */
    public static Set m14654c(Object obj) {
        if ((obj instanceof AbstractC1385a) && !(obj instanceof AbstractC1388d)) {
            m14644m(obj, "kotlin.collections.MutableSet");
        }
        return m14650g(obj);
    }

    /* renamed from: d */
    public static Object m14653d(Object obj, int i) {
        if (obj != null && !m14648i(obj, i)) {
            m14644m(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: e */
    public static Collection m14652e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m14645l(e);
        }
    }

    /* renamed from: f */
    public static List m14651f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m14645l(e);
        }
    }

    /* renamed from: g */
    public static Set m14650g(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m14645l(e);
        }
    }

    /* renamed from: h */
    public static int m14649h(Object obj) {
        if (obj instanceof AbstractC9963l) {
            return ((AbstractC9963l) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof AbstractC14641n) {
            return 5;
        }
        if (obj instanceof AbstractC14642o) {
            return 6;
        }
        if (obj instanceof AbstractC14643p) {
            return 7;
        }
        if (obj instanceof AbstractC14644q) {
            return 8;
        }
        if (obj instanceof AbstractC14645r) {
            return 9;
        }
        if (obj instanceof AbstractC14628a) {
            return 10;
        }
        if (obj instanceof AbstractC14629b) {
            return 11;
        }
        if (obj instanceof AbstractC14630c) {
            return 12;
        }
        if (obj instanceof AbstractC14631d) {
            return 13;
        }
        if (obj instanceof AbstractC14632e) {
            return 14;
        }
        if (obj instanceof AbstractC14633f) {
            return 15;
        }
        if (obj instanceof AbstractC14634g) {
            return 16;
        }
        if (obj instanceof AbstractC14635h) {
            return 17;
        }
        if (obj instanceof AbstractC14636i) {
            return 18;
        }
        if (obj instanceof AbstractC14637j) {
            return 19;
        }
        if (obj instanceof AbstractC14638k) {
            return 20;
        }
        if (obj instanceof AbstractC14639l) {
            return 21;
        }
        if (obj instanceof AbstractC14640m) {
            return 22;
        }
        return -1;
    }

    /* renamed from: i */
    public static boolean m14648i(Object obj, int i) {
        return (obj instanceof AbstractC11069g) && m14649h(obj) == i;
    }

    /* renamed from: j */
    public static boolean m14647j(Object obj) {
        return (obj instanceof List) && (!(obj instanceof AbstractC1385a) || (obj instanceof AbstractC1387c));
    }

    /* renamed from: k */
    private static <T extends Throwable> T m14646k(T t) {
        return (T) C9971q.m14625o(t, C9964l0.class.getName());
    }

    /* renamed from: l */
    public static ClassCastException m14645l(ClassCastException classCastException) {
        throw ((ClassCastException) m14646k(classCastException));
    }

    /* renamed from: m */
    public static void m14644m(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        m14643n(str2 + " cannot be cast to " + str);
    }

    /* renamed from: n */
    public static void m14643n(String str) {
        throw m14645l(new ClassCastException(str));
    }
}
