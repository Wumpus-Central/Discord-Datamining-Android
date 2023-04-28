package p448yh;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yh.d */
/* loaded from: classes8.dex */
public final class C14403d {

    /* renamed from: c */
    public static final C14404a f32585c;

    /* renamed from: d */
    private static int f32586d = 1;

    /* renamed from: e */
    private static final int f32587e;

    /* renamed from: f */
    private static final int f32588f;

    /* renamed from: g */
    private static final int f32589g;

    /* renamed from: h */
    private static final int f32590h;

    /* renamed from: i */
    private static final int f32591i;

    /* renamed from: j */
    private static final int f32592j;

    /* renamed from: k */
    private static final int f32593k;

    /* renamed from: l */
    private static final int f32594l;

    /* renamed from: m */
    private static final int f32595m;

    /* renamed from: n */
    private static final int f32596n;

    /* renamed from: o */
    public static final C14403d f32597o;

    /* renamed from: p */
    public static final C14403d f32598p;

    /* renamed from: q */
    public static final C14403d f32599q;

    /* renamed from: r */
    public static final C14403d f32600r;

    /* renamed from: s */
    public static final C14403d f32601s;

    /* renamed from: t */
    public static final C14403d f32602t;

    /* renamed from: u */
    public static final C14403d f32603u;

    /* renamed from: v */
    public static final C14403d f32604v;

    /* renamed from: w */
    public static final C14403d f32605w;

    /* renamed from: x */
    public static final C14403d f32606x;

    /* renamed from: y */
    private static final List<C14404a.C0469a> f32607y;

    /* renamed from: z */
    private static final List<C14404a.C0469a> f32608z;

    /* renamed from: a */
    private final List<AbstractC14400c> f32609a;

    /* renamed from: b */
    private final int f32610b;

    /* renamed from: yh.d$a */
    /* loaded from: classes8.dex */
    public static final class C14404a {

        /* renamed from: yh.d$a$a */
        /* loaded from: classes8.dex */
        private static final class C0469a {

            /* renamed from: a */
            private final int f32611a;

            /* renamed from: b */
            private final String f32612b;

            public C0469a(int i, String name) {
                C9971q.m14633g(name, "name");
                this.f32611a = i;
                this.f32612b = name;
            }

            /* renamed from: a */
            public final int m659a() {
                return this.f32611a;
            }

            /* renamed from: b */
            public final String m658b() {
                return this.f32612b;
            }
        }

        private C14404a() {
        }

        public /* synthetic */ C14404a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final int m660j() {
            int i = C14403d.f32586d;
            C14403d.f32586d <<= 1;
            return i;
        }

        /* renamed from: b */
        public final int m668b() {
            return C14403d.f32593k;
        }

        /* renamed from: c */
        public final int m667c() {
            return C14403d.f32594l;
        }

        /* renamed from: d */
        public final int m666d() {
            return C14403d.f32591i;
        }

        /* renamed from: e */
        public final int m665e() {
            return C14403d.f32587e;
        }

        /* renamed from: f */
        public final int m664f() {
            return C14403d.f32590h;
        }

        /* renamed from: g */
        public final int m663g() {
            return C14403d.f32588f;
        }

        /* renamed from: h */
        public final int m662h() {
            return C14403d.f32589g;
        }

        /* renamed from: i */
        public final int m661i() {
            return C14403d.f32592j;
        }
    }

    static {
        boolean z;
        C14404a.C0469a aVar;
        C14403d dVar;
        C14404a.C0469a aVar2;
        C14404a aVar3 = new C14404a(null);
        f32585c = aVar3;
        int j = aVar3.m660j();
        f32587e = j;
        int j2 = aVar3.m660j();
        f32588f = j2;
        int j3 = aVar3.m660j();
        f32589g = j3;
        int j4 = aVar3.m660j();
        f32590h = j4;
        int j5 = aVar3.m660j();
        f32591i = j5;
        int j6 = aVar3.m660j();
        f32592j = j6;
        int j7 = aVar3.m660j() - 1;
        f32593k = j7;
        int i = j | j2 | j3;
        f32594l = i;
        int i2 = j2 | j5 | j6;
        f32595m = i2;
        int i3 = j5 | j6;
        f32596n = i3;
        f32597o = new C14403d(j7, null, 2, null);
        f32598p = new C14403d(i3, null, 2, null);
        f32599q = new C14403d(j, null, 2, null);
        f32600r = new C14403d(j2, null, 2, null);
        f32601s = new C14403d(j3, null, 2, null);
        f32602t = new C14403d(i, null, 2, null);
        f32603u = new C14403d(j4, null, 2, null);
        f32604v = new C14403d(j5, null, 2, null);
        f32605w = new C14403d(j6, null, 2, null);
        f32606x = new C14403d(i2, null, 2, null);
        Field[] fields = C14403d.class.getFields();
        C9971q.m14634f(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            if (obj instanceof C14403d) {
                dVar = (C14403d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                int i4 = dVar.f32610b;
                String name = field2.getName();
                C9971q.m14634f(name, "field.name");
                aVar2 = new C14404a.C0469a(i4, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f32607y = arrayList2;
        Field[] fields2 = C14403d.class.getFields();
        C9971q.m14634f(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (C9971q.m14638b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            C9971q.m14635e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String name2 = field4.getName();
                C9971q.m14634f(name2, "field.name");
                aVar = new C14404a.C0469a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f32608z = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14403d(int i, List<? extends AbstractC14400c> excludes) {
        C9971q.m14633g(excludes, "excludes");
        this.f32609a = excludes;
        for (AbstractC14400c cVar : excludes) {
            i &= ~cVar.mo684a();
        }
        this.f32610b = i;
    }

    /* renamed from: a */
    public final boolean m683a(int i) {
        return (i & this.f32610b) != 0;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C9971q.m14638b(C14403d.class, cls)) {
            return false;
        }
        C9971q.m14635e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C14403d dVar = (C14403d) obj;
        if (C9971q.m14638b(this.f32609a, dVar.f32609a) && this.f32610b == dVar.f32610b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32609a.hashCode() * 31) + this.f32610b;
    }

    /* renamed from: l */
    public final List<AbstractC14400c> m672l() {
        return this.f32609a;
    }

    /* renamed from: m */
    public final int m671m() {
        return this.f32610b;
    }

    /* renamed from: n */
    public final C14403d m670n(int i) {
        int i2 = i & this.f32610b;
        if (i2 == 0) {
            return null;
        }
        return new C14403d(i2, this.f32609a);
    }

    public String toString() {
        Object obj;
        String str;
        String str2;
        boolean z;
        Iterator<T> it = f32607y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C14404a.C0469a) obj).m659a() == this.f32610b) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C14404a.C0469a aVar = (C14404a.C0469a) obj;
        if (aVar != null) {
            str = aVar.m658b();
        } else {
            str = null;
        }
        if (str == null) {
            List<C14404a.C0469a> list = f32608z;
            ArrayList arrayList = new ArrayList();
            for (C14404a.C0469a aVar2 : list) {
                if (m683a(aVar2.m659a())) {
                    str2 = aVar2.m658b();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = C9914r.m14760e0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f32609a + ')';
    }

    public /* synthetic */ C14403d(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? C9906j.m14820i() : list);
    }
}
