package p158ig;

import bi.C3585k;
import bi.C3588m;
import bi.C3604w;
import fi.AbstractC7267g0;
import gh.AbstractC7637r;
import gh.C7644t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.AbstractC9869a;
import kh.AbstractC9874c;
import kh.C9879g;
import kh.C9880h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9897e;
import kotlin.collections.C9905i;
import kotlin.collections.C9911o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9946d0;
import kotlin.jvm.internal.AbstractC9956h0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import nf.C11088q;
import nf.C11098x;
import ng.C11105c;
import p159ih.C8568i;
import p159ih.C8581n;
import p159ih.C8603s;
import p180jg.C9574c;
import p217lg.EnumC10426i;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p267of.C11289v;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.C11373t;
import p325rh.C12665g;
import p326ri.C12718u;
import p388vh.C13508c;
import p446yf.C14376a;
import pg.AbstractC11664a;
import pg.AbstractC11666c;
import pg.AbstractC11672g;
import ph.AbstractC11724q;
import tg.C13082b;
import tg.C13085e;
import tg.C13086f;
import tg.C13092k;
import tg.C13094l;
import th.AbstractC13104g;
import th.AbstractC13110k;
import th.C13097a;
import th.C13099b;
import th.C13109j;
import th.C13122q;
import th.C13127s;
import ug.AbstractC13306p;
import ug.C13283d;
import ug.C13286e;
import ug.C13294l;

@Metadata(m15074d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0000\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0012H\u0000\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0014*\u00020\u0017H\u0002\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 *\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u0004\u0018\u00010\u001aH\u0000\u001a\u0012\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020$H\u0000\u001ai\u00106\u001a\u00028\u0001\"\b\b\u0000\u0010(*\u00020'\"\b\b\u0001\u0010**\u00020)2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010,\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0000¢\u0006\u0004\b6\u00107\u001a'\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\"\u001a\u0010A\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010@\"\u0018\u0010F\u001a\u00020C*\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001a\u0010J\u001a\u0004\u0018\u00010G*\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006K"}, m15073d2 = {"Log/e;", "Ljava/lang/Class;", "p", "Ljava/lang/ClassLoader;", "classLoader", "Lnh/b;", "kotlinClassId", "", "arrayDimensions", "m", "", "packageName", "className", "l", "f", "Log/u;", "Lkotlin/reflect/KVisibility;", "q", "Lpg/a;", "", "", "e", "s", "Lpg/c;", "o", "Lth/g;", "", "r", "Lth/b;", "a", "Lig/q;", "c", "Lig/c0;", "d", "Lig/l;", "b", "Ljava/lang/reflect/Type;", "type", "g", "Lph/q;", "M", "Log/a;", "D", "moduleAnchor", "proto", "Lkh/c;", "nameResolver", "Lkh/g;", "typeTable", "Lkh/a;", "metadataVersion", "Lkotlin/Function2;", "Lbi/w;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lnh/c;", "Lnh/c;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/KType;", "", "k", "(Lkotlin/reflect/KType;)Z", "isInlineClassType", "Log/x0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ig.p0 */
/* loaded from: classes8.dex */
public final class C8503p0 {

    /* renamed from: a */
    private static final C11137c f18492a = new C11137c("kotlin.jvm.JvmStatic");

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: ig.p0$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C8504a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18493a;

        static {
            int[] iArr = new int[EnumC10426i.values().length];
            try {
                iArr[EnumC10426i.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10426i.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10426i.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC10426i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC10426i.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC10426i.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC10426i.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC10426i.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f18493a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v13, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v15, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v14, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object m19659a(th.C13099b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p158ig.C8503p0.m19659a(th.b, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    public static final AbstractC8453l<?> m19658b(Object obj) {
        AbstractC8453l<?> lVar = obj instanceof AbstractC8453l ? (AbstractC8453l) obj : null;
        if (lVar != null) {
            return lVar;
        }
        C8505q c = m19657c(obj);
        return c != null ? c : m19656d(obj);
    }

    /* renamed from: c */
    public static final C8505q m19657c(Object obj) {
        C8505q qVar = obj instanceof C8505q ? (C8505q) obj : null;
        if (qVar != null) {
            return qVar;
        }
        C9965m mVar = obj instanceof C9965m ? (C9965m) obj : null;
        KCallable compute = mVar != null ? mVar.compute() : null;
        if (compute instanceof C8505q) {
            return (C8505q) compute;
        }
        return null;
    }

    /* renamed from: d */
    public static final AbstractC8404c0<?> m19656d(Object obj) {
        AbstractC8404c0<?> c0Var = obj instanceof AbstractC8404c0 ? (AbstractC8404c0) obj : null;
        if (c0Var != null) {
            return c0Var;
        }
        AbstractC9946d0 d0Var = obj instanceof AbstractC9946d0 ? (AbstractC9946d0) obj : null;
        KCallable compute = d0Var != null ? d0Var.compute() : null;
        if (compute instanceof AbstractC8404c0) {
            return (AbstractC8404c0) compute;
        }
        return null;
    }

    /* renamed from: e */
    public static final List<Annotation> m19655e(AbstractC11664a aVar) {
        Annotation annotation;
        C13286e eVar;
        C9971q.m14633g(aVar, "<this>");
        AbstractC11672g annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AbstractC11666c cVar : annotations) {
            AbstractC11299a1 j = cVar.mo721j();
            if (j instanceof C13082b) {
                annotation = ((C13082b) j).m4644d();
            } else if (j instanceof C13094l.C13095a) {
                AbstractC13306p d = ((C13094l.C13095a) j).mo4611c();
                if (d instanceof C13286e) {
                    eVar = (C13286e) d;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    annotation = eVar.m4042P();
                } else {
                    annotation = null;
                }
            } else {
                annotation = m19645o(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return m19641s(arrayList);
    }

    /* renamed from: f */
    public static final Class<?> m19654f(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: g */
    public static final Object m19653g(Type type) {
        C9971q.m14633g(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C9971q.m14638b(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C9971q.m14638b(type, Character.TYPE)) {
            return (char) 0;
        }
        if (C9971q.m14638b(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (C9971q.m14638b(type, Short.TYPE)) {
            return (short) 0;
        }
        if (C9971q.m14638b(type, Integer.TYPE)) {
            return 0;
        }
        if (C9971q.m14638b(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C9971q.m14638b(type, Long.TYPE)) {
            return 0L;
        }
        if (C9971q.m14638b(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C9971q.m14638b(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    /* renamed from: h */
    public static final <M extends AbstractC11724q, D extends AbstractC11297a> D m19652h(Class<?> moduleAnchor, M proto, AbstractC9874c nameResolver, C9879g typeTable, AbstractC9869a metadataVersion, Function2<? super C3604w, ? super M, ? extends D> createDescriptor) {
        List<C8603s> typeParameters;
        C9971q.m14633g(moduleAnchor, "moduleAnchor");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        C9971q.m14633g(createDescriptor, "createDescriptor");
        C13092k a = C8433i0.m19781a(moduleAnchor);
        if (proto instanceof C8568i) {
            typeParameters = ((C8568i) proto).m19107m0();
        } else if (proto instanceof C8581n) {
            typeParameters = ((C8581n) proto).m18942n0();
        } else {
            throw new IllegalStateException(("Unsupported message: " + proto).toString());
        }
        C3585k a2 = a.m4617a();
        AbstractC11327h0 b = a.m4616b();
        C9880h b2 = C9880h.f22033b.m15107b();
        C9971q.m14634f(typeParameters, "typeParameters");
        return (D) ((AbstractC11297a) createDescriptor.invoke(new C3604w(new C3588m(a2, nameResolver, b, typeTable, b2, metadataVersion, null, null, typeParameters)), proto));
    }

    /* renamed from: i */
    public static final AbstractC11396x0 m19651i(AbstractC11297a aVar) {
        C9971q.m14633g(aVar, "<this>");
        if (aVar.mo6266J() == null) {
            return null;
        }
        AbstractC11346m b = aVar.mo6104b();
        C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((AbstractC11313e) b).mo6174J0();
    }

    /* renamed from: j */
    public static final C11137c m19650j() {
        return f18492a;
    }

    /* renamed from: k */
    public static final boolean m19649k(KType kType) {
        C8418e0 e0Var;
        AbstractC7267g0 o;
        C9971q.m14633g(kType, "<this>");
        if (kType instanceof C8418e0) {
            e0Var = (C8418e0) kType;
        } else {
            e0Var = null;
        }
        if (e0Var == null || (o = e0Var.m19799o()) == null || !C12665g.m6025c(o)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static final Class<?> m19648l(ClassLoader classLoader, String str, String str2, int i) {
        String C;
        String z;
        if (C9971q.m14638b(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('.');
        C = C12718u.m5741C(str2, '.', '$', false, 4, null);
        sb2.append(C);
        String sb3 = sb2.toString();
        if (i > 0) {
            StringBuilder sb4 = new StringBuilder();
            z = C12718u.m5726z("[", i);
            sb4.append(z);
            sb4.append('L');
            sb4.append(sb3);
            sb4.append(';');
            sb3 = sb4.toString();
        }
        return C13085e.m4634a(classLoader, sb3);
    }

    /* renamed from: m */
    private static final Class<?> m19647m(ClassLoader classLoader, C11136b bVar, int i) {
        C11105c cVar = C11105c.f24626a;
        C11138d j = bVar.m10816b().m10795j();
        C9971q.m14634f(j, "kotlinClassId.asSingleFqName().toUnsafe()");
        C11136b n = cVar.m10896n(j);
        if (n != null) {
            bVar = n;
        }
        String b = bVar.m10810h().m10803b();
        C9971q.m14634f(b, "javaClassId.packageFqName.asString()");
        String b2 = bVar.m10809i().m10803b();
        C9971q.m14634f(b2, "javaClassId.relativeClassName.asString()");
        return m19648l(classLoader, b, b2, i);
    }

    /* renamed from: n */
    static /* synthetic */ Class m19646n(ClassLoader classLoader, C11136b bVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m19647m(classLoader, bVar, i);
    }

    /* renamed from: o */
    private static final Annotation m19645o(AbstractC11666c cVar) {
        Class<?> cls;
        Map r;
        Pair pair;
        AbstractC11313e i = C13508c.m3532i(cVar);
        if (i != null) {
            cls = m19644p(i);
        } else {
            cls = null;
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry<C11142f, AbstractC13104g<?>>> entrySet = cVar.mo700a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C11142f fVar = (C11142f) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            C9971q.m14634f(classLoader, "annotationClass.classLoader");
            Object r2 = m19642r((AbstractC13104g) entry.getValue(), classLoader);
            if (r2 != null) {
                pair = C11098x.m10921a(fVar.m10771b(), r2);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        r = C11289v.m10241r(arrayList);
        return (Annotation) C9574c.m15961e(cls, r, null, 4, null);
    }

    /* renamed from: p */
    public static final Class<?> m19644p(AbstractC11313e eVar) {
        C9971q.m14633g(eVar, "<this>");
        AbstractC11299a1 source = eVar.mo6102j();
        C9971q.m14634f(source, "source");
        if (source instanceof C7644t) {
            AbstractC7637r d = ((C7644t) source).m21813d();
            C9971q.m14635e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C13086f) d).m4629e();
        } else if (source instanceof C13094l.C13095a) {
            AbstractC13306p d2 = ((C13094l.C13095a) source).mo4611c();
            C9971q.m14635e(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C13294l) d2).mo3981b();
        } else {
            C11136b k = C13508c.m3530k(eVar);
            if (k == null) {
                return null;
            }
            return m19647m(C13283d.m4048f(eVar.getClass()), k, 0);
        }
    }

    /* renamed from: q */
    public static final KVisibility m19643q(AbstractC11387u uVar) {
        boolean z;
        C9971q.m14633g(uVar, "<this>");
        if (C9971q.m14638b(uVar, C11373t.f25299e)) {
            return KVisibility.PUBLIC;
        }
        if (C9971q.m14638b(uVar, C11373t.f25297c)) {
            return KVisibility.PROTECTED;
        }
        if (C9971q.m14638b(uVar, C11373t.f25298d)) {
            return KVisibility.INTERNAL;
        }
        if (C9971q.m14638b(uVar, C11373t.f25295a)) {
            z = true;
        } else {
            z = C9971q.m14638b(uVar, C11373t.f25296b);
        }
        if (z) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* renamed from: r */
    private static final Object m19642r(AbstractC13104g<?> gVar, ClassLoader classLoader) {
        boolean z;
        AbstractC11313e eVar;
        if (gVar instanceof C13097a) {
            return m19645o(((C13097a) gVar).mo4590b());
        }
        if (gVar instanceof C13099b) {
            return m19659a((C13099b) gVar, classLoader);
        }
        if (gVar instanceof C13109j) {
            Pair<? extends C11136b, ? extends C11142f> b = ((C13109j) gVar).mo4590b();
            C11142f fVar = (C11142f) b.m15066b();
            Class n = m19646n(classLoader, (C11136b) b.m15067a(), 0, 4, null);
            if (n != null) {
                return C8493o0.m19686a(n, fVar.m10771b());
            }
        } else if (gVar instanceof C13122q) {
            C13122q.AbstractC13124b b2 = ((C13122q) gVar).mo4590b();
            if (b2 instanceof C13122q.AbstractC13124b.C0421b) {
                C13122q.AbstractC13124b.C0421b bVar = (C13122q.AbstractC13124b.C0421b) b2;
                return m19647m(classLoader, bVar.m4559b(), bVar.m4560a());
            } else if (b2 instanceof C13122q.AbstractC13124b.C13125a) {
                AbstractC11326h p = ((C13122q.AbstractC13124b.C13125a) b2).m4561a().mo5172N0().mo4565p();
                if (p instanceof AbstractC11313e) {
                    eVar = (AbstractC11313e) p;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    return m19644p(eVar);
                }
            } else {
                throw new C11088q();
            }
        } else {
            if (gVar instanceof AbstractC13110k) {
                z = true;
            } else {
                z = gVar instanceof C13127s;
            }
            if (!z) {
                return gVar.mo4590b();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private static final List<Annotation> m19641s(List<? extends Annotation> list) {
        boolean z;
        List list2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Annotation annotation : list) {
                if (C9971q.m14638b(C14376a.m737b(C14376a.m738a(annotation)).getSimpleName(), "Container")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation2 : list) {
            Class b = C14376a.m737b(C14376a.m738a(annotation2));
            if (!C9971q.m14638b(b.getSimpleName(), "Container") || b.getAnnotation(AbstractC9956h0.class) == null) {
                list2 = C9905i.m14825d(annotation2);
            } else {
                Object invoke = b.getDeclaredMethod("value", new Class[0]).invoke(annotation2, new Object[0]);
                C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                list2 = C9897e.m14991d((Annotation[]) invoke);
            }
            C9911o.m14801y(arrayList, list2);
        }
        return arrayList;
    }
}
