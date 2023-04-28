package mh;

import eg.C6884j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.AbstractC9874c;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p218lh.C10440a;
import p267of.C11280m;
import p267of.C11288u;
import p326ri.C12718u;

/* renamed from: mh.g */
/* loaded from: classes8.dex */
public class C10615g implements AbstractC9874c {

    /* renamed from: d */
    public static final C10616a f23503d = new C10616a(null);

    /* renamed from: e */
    private static final String f23504e;

    /* renamed from: f */
    private static final List<String> f23505f;

    /* renamed from: g */
    private static final Map<String, Integer> f23506g;

    /* renamed from: a */
    private final String[] f23507a;

    /* renamed from: b */
    private final Set<Integer> f23508b;

    /* renamed from: c */
    private final List<C10440a.C10446e.C10448c> f23509c;

    /* renamed from: mh.g$a */
    /* loaded from: classes8.dex */
    public static final class C10616a {
        private C10616a() {
        }

        public /* synthetic */ C10616a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mh.g$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C10617b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23510a;

        static {
            int[] iArr = new int[C10440a.C10446e.C10448c.EnumC0334c.values().length];
            try {
                iArr[C10440a.C10446e.C10448c.EnumC0334c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C10440a.C10446e.C10448c.EnumC0334c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C10440a.C10446e.C10448c.EnumC0334c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23510a = iArr;
        }
    }

    static {
        List l;
        String e0;
        List<String> l2;
        Iterable<C11280m> J0;
        int t;
        int d;
        int c;
        l = C9906j.m14817l('k', 'o', 't', 'l', 'i', 'n');
        e0 = C9914r.m14760e0(l, "", null, null, 0, null, null, 62, null);
        f23504e = e0;
        l2 = C9906j.m14817l(e0 + "/Any", e0 + "/Nothing", e0 + "/Unit", e0 + "/Throwable", e0 + "/Number", e0 + "/Byte", e0 + "/Double", e0 + "/Float", e0 + "/Int", e0 + "/Long", e0 + "/Short", e0 + "/Boolean", e0 + "/Char", e0 + "/CharSequence", e0 + "/String", e0 + "/Comparable", e0 + "/Enum", e0 + "/Array", e0 + "/ByteArray", e0 + "/DoubleArray", e0 + "/FloatArray", e0 + "/IntArray", e0 + "/LongArray", e0 + "/ShortArray", e0 + "/BooleanArray", e0 + "/CharArray", e0 + "/Cloneable", e0 + "/Annotation", e0 + "/collections/Iterable", e0 + "/collections/MutableIterable", e0 + "/collections/Collection", e0 + "/collections/MutableCollection", e0 + "/collections/List", e0 + "/collections/MutableList", e0 + "/collections/Set", e0 + "/collections/MutableSet", e0 + "/collections/Map", e0 + "/collections/MutableMap", e0 + "/collections/Map.Entry", e0 + "/collections/MutableMap.MutableEntry", e0 + "/collections/Iterator", e0 + "/collections/MutableIterator", e0 + "/collections/ListIterator", e0 + "/collections/MutableListIterator");
        f23505f = l2;
        J0 = C9914r.m14783J0(l2);
        t = C9907k.m14809t(J0, 10);
        d = C11288u.m10255d(t);
        c = C6884j.m23961c(d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (C11280m mVar : J0) {
            linkedHashMap.put((String) mVar.m10276d(), Integer.valueOf(mVar.m10277c()));
        }
        f23506g = linkedHashMap;
    }

    public C10615g(String[] strings, Set<Integer> localNameIndices, List<C10440a.C10446e.C10448c> records) {
        C9971q.m14633g(strings, "strings");
        C9971q.m14633g(localNameIndices, "localNameIndices");
        C9971q.m14633g(records, "records");
        this.f23507a = strings;
        this.f23508b = localNameIndices;
        this.f23509c = records;
    }

    @Override // kh.AbstractC9874c
    /* renamed from: a */
    public boolean mo12731a(int i) {
        return this.f23508b.contains(Integer.valueOf(i));
    }

    @Override // kh.AbstractC9874c
    /* renamed from: b */
    public String mo12730b(int i) {
        return getString(i);
    }

    @Override // kh.AbstractC9874c
    public String getString(int i) {
        String string;
        boolean z;
        C10440a.C10446e.C10448c cVar = this.f23509c.get(i);
        if (cVar.m13182Q()) {
            string = cVar.m13189J();
        } else {
            if (cVar.m13184O()) {
                List<String> list = f23505f;
                int size = list.size();
                int F = cVar.m13193F();
                if (F < 0 || F >= size) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    string = list.get(cVar.m13193F());
                }
            }
            string = this.f23507a[i];
        }
        if (cVar.m13187L() >= 2) {
            List<Integer> substringIndexList = cVar.m13186M();
            C9971q.m14634f(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            C9971q.m14634f(begin, "begin");
            if (begin.intValue() >= 0) {
                int intValue = begin.intValue();
                C9971q.m14634f(end, "end");
                if (intValue <= end.intValue() && end.intValue() <= string.length()) {
                    C9971q.m14634f(string, "string");
                    string = string.substring(begin.intValue(), end.intValue());
                    C9971q.m14634f(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String string2 = string;
        if (cVar.m13191H() >= 2) {
            List<Integer> replaceCharList = cVar.m13190I();
            C9971q.m14634f(replaceCharList, "replaceCharList");
            C9971q.m14634f(string2, "string");
            string2 = C12718u.m5741C(string2, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue(), false, 4, null);
        }
        String string3 = string2;
        C10440a.C10446e.C10448c.EnumC0334c E = cVar.m13194E();
        if (E == null) {
            E = C10440a.C10446e.C10448c.EnumC0334c.NONE;
        }
        int i2 = C10617b.f23510a[E.ordinal()];
        if (i2 == 2) {
            C9971q.m14634f(string3, "string");
            string3 = C12718u.m5741C(string3, '$', '.', false, 4, null);
        } else if (i2 == 3) {
            if (string3.length() >= 2) {
                C9971q.m14634f(string3, "string");
                string3 = string3.substring(1, string3.length() - 1);
                C9971q.m14634f(string3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            C9971q.m14634f(string3, "string");
            string3 = C12718u.m5741C(string3, '$', '.', false, 4, null);
        }
        C9971q.m14634f(string3, "string");
        return string3;
    }
}
