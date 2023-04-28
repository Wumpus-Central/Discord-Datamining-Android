package p249nh;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C9971q;
import p326ri.C12718u;

/* renamed from: nh.e */
/* loaded from: classes8.dex */
public final class C11140e {

    /* renamed from: nh.e$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C11141a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24728a;

        static {
            int[] iArr = new int[EnumC11147k.values().length];
            try {
                iArr[EnumC11147k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11147k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11147k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24728a = iArr;
        }
    }

    /* renamed from: a */
    public static final <V> V m10779a(C11137c cVar, Map<C11137c, ? extends V> values) {
        Object obj;
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(values, "values");
        Map linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<C11137c, ? extends V>> it = values.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<C11137c, ? extends V> next = it.next();
            C11137c key = next.getKey();
            if (!C9971q.m14638b(cVar, key) && !m10778b(cVar, key)) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        boolean z2 = !linkedHashMap.isEmpty();
        Map map = linkedHashMap;
        if (!z2) {
            map = null;
        }
        if (map == null) {
            return null;
        }
        Iterator it2 = map.entrySet().iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                int length = m10773g((C11137c) ((Map.Entry) obj).getKey(), cVar).m10803b().length();
                do {
                    Object next2 = it2.next();
                    int length2 = m10773g((C11137c) ((Map.Entry) next2).getKey(), cVar).m10803b().length();
                    if (length > length2) {
                        obj = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (V) entry.getValue();
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m10778b(C11137c cVar, C11137c packageName) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(packageName, "packageName");
        return C9971q.m14638b(m10774f(cVar), packageName);
    }

    /* renamed from: c */
    private static final boolean m10777c(String str, String str2) {
        boolean H;
        H = C12718u.m5736H(str, str2, false, 2, null);
        return H && str.charAt(str2.length()) == '.';
    }

    /* renamed from: d */
    public static final boolean m10776d(C11137c cVar, C11137c packageName) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(packageName, "packageName");
        if (C9971q.m14638b(cVar, packageName) || packageName.m10801d()) {
            return true;
        }
        String b = cVar.m10803b();
        C9971q.m14634f(b, "this.asString()");
        String b2 = packageName.m10803b();
        C9971q.m14634f(b2, "packageName.asString()");
        return m10777c(b, b2);
    }

    /* renamed from: e */
    public static final boolean m10775e(String str) {
        if (str == null) {
            return false;
        }
        EnumC11147k kVar = EnumC11147k.BEGINNING;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int i2 = C11141a.f24728a[kVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                kVar = EnumC11147k.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                kVar = EnumC11147k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (kVar != EnumC11147k.AFTER_DOT) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final C11137c m10774f(C11137c cVar) {
        C9971q.m14633g(cVar, "<this>");
        if (cVar.m10801d()) {
            return null;
        }
        return cVar.m10800e();
    }

    /* renamed from: g */
    public static final C11137c m10773g(C11137c cVar, C11137c prefix) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(prefix, "prefix");
        if (!m10776d(cVar, prefix) || prefix.m10801d()) {
            return cVar;
        }
        if (C9971q.m14638b(cVar, prefix)) {
            C11137c ROOT = C11137c.f24718c;
            C9971q.m14634f(ROOT, "ROOT");
            return ROOT;
        }
        String b = cVar.m10803b();
        C9971q.m14634f(b, "asString()");
        String substring = b.substring(prefix.m10803b().length() + 1);
        C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
        return new C11137c(substring);
    }
}
