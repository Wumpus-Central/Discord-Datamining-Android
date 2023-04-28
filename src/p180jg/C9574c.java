package p180jg;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import nf.C11084n;
import p446yf.C14376a;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0016\u0010\u0014\u001a\u00020\u0004\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002"}, m15073d2 = {"", "Ljava/lang/Class;", "expectedType", "k", "", "index", "", "name", "expectedJvmType", "", "j", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "d", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: jg.c */
/* loaded from: classes8.dex */
public final class C9574c {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "T", "", "invoke", "()Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: jg.c$a */
    /* loaded from: classes8.dex */
    public static final class C9575a extends AbstractC9973s implements Function0<Integer> {

        /* renamed from: k */
        final /* synthetic */ Map<String, Object> f21254k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9575a(Map<String, ? extends Object> map) {
            super(0);
            this.f21254k = map;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            int i;
            Iterator<T> it = this.f21254k.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    i = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    i = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    i = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    i = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    i = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    i = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    i = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    i = Arrays.hashCode((double[]) value);
                } else {
                    i = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                i2 += i ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "T", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: jg.c$b */
    /* loaded from: classes8.dex */
    public static final class C9576b extends AbstractC9973s implements Function0<String> {

        /* renamed from: k */
        final /* synthetic */ Class<T> f21255k;

        /* renamed from: l */
        final /* synthetic */ Map<String, Object> f21256l;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m15073d2 = {"", "T", "", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: jg.c$b$a */
        /* loaded from: classes8.dex */
        public static final class C9577a extends AbstractC9973s implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: k */
            public static final C9577a f21257k = new C9577a();

            C9577a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String str;
                C9971q.m14633g(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof char[]) {
                    str = Arrays.toString((char[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof byte[]) {
                    str = Arrays.toString((byte[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof short[]) {
                    str = Arrays.toString((short[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof int[]) {
                    str = Arrays.toString((int[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof float[]) {
                    str = Arrays.toString((float[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof long[]) {
                    str = Arrays.toString((long[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof double[]) {
                    str = Arrays.toString((double[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else if (value instanceof Object[]) {
                    str = Arrays.toString((Object[]) value);
                    C9971q.m14634f(str, "toString(this)");
                } else {
                    str = value.toString();
                }
                return key + '=' + str;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9576b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f21255k = cls;
            this.f21256l = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Class<T> cls = this.f21255k;
            Map<String, Object> map = this.f21256l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(cls.getCanonicalName());
            C9914r.m14762c0(map.entrySet(), sb2, ", ", "(", ")", 0, null, C9577a.f21257k, 48, null);
            String sb3 = sb2.toString();
            C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* renamed from: d */
    public static final <T> T m15962d(Class<T> annotationClass, Map<String, ? extends Object> values, List<Method> methods) {
        Lazy a;
        Lazy a2;
        C9971q.m14633g(annotationClass, "annotationClass");
        C9971q.m14633g(values, "values");
        C9971q.m14633g(methods, "methods");
        a = C11084n.m10945a(new C9575a(values));
        a2 = C11084n.m10945a(new C9576b(annotationClass, values));
        T t = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new C9573b(annotationClass, values, a2, a, methods));
        C9971q.m14635e(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m15961e(Class cls, Map map, List list, int i, Object obj) {
        int t;
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            t = C9907k.m14809t(keySet, 10);
            ArrayList arrayList = new ArrayList(t);
            for (String str : keySet) {
                arrayList.add(cls.getDeclaredMethod(str, new Class[0]));
            }
            list = arrayList;
        }
        return m15962d(cls, map, list);
    }

    /* renamed from: f */
    private static final <T> boolean m15960f(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        Annotation annotation;
        boolean z;
        boolean z2;
        KClass a;
        Class cls2 = null;
        if (obj instanceof Annotation) {
            annotation = (Annotation) obj;
        } else {
            annotation = null;
        }
        if (!(annotation == null || (a = C14376a.m738a(annotation)) == null)) {
            cls2 = C14376a.m737b(a);
        }
        if (!C9971q.m14638b(cls2, cls)) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Method method : list) {
                Object obj2 = map.get(method.getName());
                Object invoke = method.invoke(obj, new Object[0]);
                if (obj2 instanceof boolean[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    z2 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    continue;
                } else if (obj2 instanceof char[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                    z2 = Arrays.equals((char[]) obj2, (char[]) invoke);
                    continue;
                } else if (obj2 instanceof byte[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    z2 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    continue;
                } else if (obj2 instanceof short[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    z2 = Arrays.equals((short[]) obj2, (short[]) invoke);
                    continue;
                } else if (obj2 instanceof int[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                    z2 = Arrays.equals((int[]) obj2, (int[]) invoke);
                    continue;
                } else if (obj2 instanceof float[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    z2 = Arrays.equals((float[]) obj2, (float[]) invoke);
                    continue;
                } else if (obj2 instanceof long[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                    z2 = Arrays.equals((long[]) obj2, (long[]) invoke);
                    continue;
                } else if (obj2 instanceof double[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    z2 = Arrays.equals((double[]) obj2, (double[]) invoke);
                    continue;
                } else if (obj2 instanceof Object[]) {
                    C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    z2 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    continue;
                } else {
                    z2 = C9971q.m14638b(obj2, invoke);
                    continue;
                }
                if (!z2) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static final int m15959g(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* renamed from: h */
    private static final String m15958h(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r9.length == 1) goto L_0x006d;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m15957i(java.lang.Class r2, java.util.Map r3, kotlin.Lazy r4, kotlin.Lazy r5, java.util.List r6, java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            java.lang.String r7 = "$annotationClass"
            kotlin.jvm.internal.C9971q.m14633g(r2, r7)
            java.lang.String r7 = "$values"
            kotlin.jvm.internal.C9971q.m14633g(r3, r7)
            java.lang.String r7 = "$toString$delegate"
            kotlin.jvm.internal.C9971q.m14633g(r4, r7)
            java.lang.String r7 = "$hashCode$delegate"
            kotlin.jvm.internal.C9971q.m14633g(r5, r7)
            java.lang.String r7 = "$methods"
            kotlin.jvm.internal.C9971q.m14633g(r6, r7)
            java.lang.String r7 = r8.getName()
            if (r7 == 0) goto L_0x005c
            int r0 = r7.hashCode()
            r1 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r0 == r1) goto L_0x004e
            r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r0 == r4) goto L_0x003c
            r4 = 1444986633(0x5620bf09, float:4.4185588E13)
            if (r0 == r4) goto L_0x0033
            goto L_0x005c
        L_0x0033:
            java.lang.String r4 = "annotationType"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x008b
            goto L_0x005c
        L_0x003c:
            java.lang.String r4 = "hashCode"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            int r2 = m15959g(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x008b
        L_0x004e:
            java.lang.String r5 = "toString"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            java.lang.String r2 = m15958h(r4)
            goto L_0x008b
        L_0x005c:
            java.lang.String r4 = "equals"
            boolean r4 = kotlin.jvm.internal.C9971q.m14638b(r7, r4)
            r5 = 0
            if (r4 == 0) goto L_0x0081
            if (r9 == 0) goto L_0x006c
            int r4 = r9.length
            r0 = 1
            if (r4 != r0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r0 = r5
        L_0x006d:
            if (r0 == 0) goto L_0x0081
            java.lang.String r4 = "args"
            kotlin.jvm.internal.C9971q.m14634f(r9, r4)
            java.lang.Object r4 = kotlin.collections.C9894b.m15025h0(r9)
            boolean r2 = m15960f(r2, r6, r3, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x008b
        L_0x0081:
            boolean r2 = r3.containsKey(r7)
            if (r2 == 0) goto L_0x008c
            java.lang.Object r2 = r3.get(r7)
        L_0x008b:
            return r2
        L_0x008c:
            ig.h0 r2 = new ig.h0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Method is not supported: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = " (args: "
            r3.append(r4)
            if (r9 != 0) goto L_0x00a4
            java.lang.Object[] r9 = new java.lang.Object[r5]
        L_0x00a4:
            java.util.List r4 = kotlin.collections.C9894b.m15002u0(r9)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p180jg.C9574c.m15957i(java.lang.Class, java.util.Map, kotlin.Lazy, kotlin.Lazy, java.util.List, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final Void m15956j(int i, String str, Class<?> cls) {
        KClass kClass;
        String str2;
        if (C9971q.m14638b(cls, Class.class)) {
            kClass = C9951f0.m14684b(KClass.class);
        } else if (!cls.isArray() || !C9971q.m14638b(cls.getComponentType(), Class.class)) {
            kClass = C14376a.m734e(cls);
        } else {
            kClass = C9951f0.m14684b(KClass[].class);
        }
        if (C9971q.m14638b(kClass.mo14599k(), C9951f0.m14684b(Object[].class).mo14599k())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kClass.mo14599k());
            sb2.append('<');
            Class<?> componentType = C14376a.m737b(kClass).getComponentType();
            C9971q.m14634f(componentType, "kotlinClass.java.componentType");
            sb2.append(C14376a.m734e(componentType).mo14599k());
            sb2.append('>');
            str2 = sb2.toString();
        } else {
            str2 = kClass.mo14599k();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final Object m15955k(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = C14376a.m737b((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(C14376a.m737b(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
