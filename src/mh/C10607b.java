package mh;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p326ri.C12718u;
import p370uf.C13274c;

/* renamed from: mh.b */
/* loaded from: classes8.dex */
public final class C10607b {

    /* renamed from: a */
    public static final C10607b f23487a = new C10607b();

    /* renamed from: b */
    private static final String f23488b;

    /* renamed from: c */
    private static final Map<String, String> f23489c;

    static {
        List l;
        String e0;
        List l2;
        List<String> l3;
        List<String> l4;
        List<String> l5;
        int i;
        l = C9906j.m14817l('k', 'o', 't', 'l', 'i', 'n');
        e0 = C9914r.m14760e0(l, "", null, null, 0, null, null, 62, null);
        f23488b = e0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l2 = C9906j.m14817l("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int c = C13274c.m4084c(0, l2.size() - 1, 2);
        if (c >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f23488b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) l2.get(i2));
                linkedHashMap.put(sb2.toString(), l2.get(i2 + 1));
                linkedHashMap.put(str + '/' + ((String) l2.get(i2)) + "Array", '[' + ((String) l2.get(i)));
                if (i2 == c) {
                    break;
                }
                i2 += 2;
            }
        }
        linkedHashMap.put(f23488b + "/Unit", "V");
        m12740a(linkedHashMap, "Any", "java/lang/Object");
        m12740a(linkedHashMap, "Nothing", "java/lang/Void");
        m12740a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        l3 = C9906j.m14817l("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum");
        for (String str2 : l3) {
            m12740a(linkedHashMap, str2, "java/lang/" + str2);
        }
        l4 = C9906j.m14817l("Iterator", "Collection", "List", "Set", "Map", "ListIterator");
        for (String str3 : l4) {
            m12740a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m12740a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m12740a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m12740a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m12740a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m12740a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f23488b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            m12740a(linkedHashMap, "Function" + i3, sb3.toString());
            m12740a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        l5 = C9906j.m14817l("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum");
        for (String str5 : l5) {
            m12740a(linkedHashMap, str5 + ".Companion", f23488b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f23489c = linkedHashMap;
    }

    private C10607b() {
    }

    /* renamed from: a */
    private static final void m12740a(Map<String, String> map, String str, String str2) {
        map.put(f23488b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m12739b(String classId) {
        String C;
        C9971q.m14633g(classId, "classId");
        String str = f23489c.get(classId);
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('L');
        C = C12718u.m5741C(classId, '.', '$', false, 4, null);
        sb2.append(C);
        sb2.append(';');
        return sb2.toString();
    }
}
