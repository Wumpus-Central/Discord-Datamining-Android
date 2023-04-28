package bj;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import nf.C11075i;
import p446yf.C14376a;
import p449yi.AbstractC14430b;
import p449yi.AbstractC14435f;
import p449yi.C14431c;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001aM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0005*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\r\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u000eH\u0000\u001aO\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a\u001c\u0010\u0017\u001a\u00020\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001aQ\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u000eH\u0002\u001a\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a\u0016\u0010\u001f\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¨\u0006 "}, m15073d2 = {"", "T", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "b", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "", "n", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "", "l", "Ljava/lang/Class;", "m", "args", "d", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "c", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "i", "j", "g", "jClass", "h", "a", "e", "f", "rootClass", "k", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.l1 */
/* loaded from: classes8.dex */
public final class C3673l1 {
    /* renamed from: a */
    private static final Object m33850a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final <T> KSerializer<T> m33849b(KClass<T> kClass) {
        C9971q.m14633g(kClass, "<this>");
        return m33847d(kClass, new KSerializer[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r3 == false) goto L_0x0065;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> kotlinx.serialization.KSerializer<T> m33848c(java.lang.Class<T> r8, kotlinx.serialization.KSerializer<java.lang.Object>... r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9971q.m14633g(r8, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C9971q.m14633g(r9, r0)
            boolean r0 = r8.isEnum()
            if (r0 == 0) goto L_0x001b
            boolean r0 = m33842i(r8)
            if (r0 == 0) goto L_0x001b
            kotlinx.serialization.KSerializer r8 = m33846e(r8)
            return r8
        L_0x001b:
            boolean r0 = r8.isInterface()
            if (r0 == 0) goto L_0x0028
            kotlinx.serialization.KSerializer r0 = m33844g(r8)
            if (r0 == 0) goto L_0x0028
            return r0
        L_0x0028:
            int r0 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            kotlinx.serialization.KSerializer[] r9 = (kotlinx.serialization.KSerializer[]) r9
            kotlinx.serialization.KSerializer r9 = m33843h(r8, r9)
            if (r9 == 0) goto L_0x0036
            return r9
        L_0x0036:
            kotlinx.serialization.KSerializer r9 = m33845f(r8)
            if (r9 == 0) goto L_0x003d
            return r9
        L_0x003d:
            r9 = 0
            java.lang.Class[] r0 = r8.getDeclaredClasses()     // Catch: NoSuchFieldException -> 0x007f
            java.lang.String r1 = "declaredClasses"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)     // Catch: NoSuchFieldException -> 0x007f
            int r1 = r0.length     // Catch: NoSuchFieldException -> 0x007f
            r2 = 0
            r4 = r9
            r3 = r2
        L_0x004b:
            if (r2 >= r1) goto L_0x0063
            r5 = r0[r2]     // Catch: NoSuchFieldException -> 0x007f
            java.lang.String r6 = r5.getSimpleName()     // Catch: NoSuchFieldException -> 0x007f
            java.lang.String r7 = "$serializer"
            boolean r6 = kotlin.jvm.internal.C9971q.m14638b(r6, r7)     // Catch: NoSuchFieldException -> 0x007f
            if (r6 == 0) goto L_0x0060
            if (r3 == 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            r3 = 1
            r4 = r5
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0063:
            if (r3 != 0) goto L_0x0066
        L_0x0065:
            r4 = r9
        L_0x0066:
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: NoSuchFieldException -> 0x007f
            if (r4 == 0) goto L_0x0077
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r4.getField(r0)     // Catch: NoSuchFieldException -> 0x007f
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r0.get(r9)     // Catch: NoSuchFieldException -> 0x007f
            goto L_0x0078
        L_0x0077:
            r0 = r9
        L_0x0078:
            boolean r1 = r0 instanceof kotlinx.serialization.KSerializer     // Catch: NoSuchFieldException -> 0x007f
            if (r1 == 0) goto L_0x007f
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0     // Catch: NoSuchFieldException -> 0x007f
            goto L_0x0080
        L_0x007f:
            r0 = r9
        L_0x0080:
            if (r0 == 0) goto L_0x0083
            return r0
        L_0x0083:
            boolean r0 = m33841j(r8)
            if (r0 == 0) goto L_0x0092
            yi.c r9 = new yi.c
            kotlin.reflect.KClass r8 = p446yf.C14376a.m734e(r8)
            r9.<init>(r8)
        L_0x0092:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.C3673l1.m33848c(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    /* renamed from: d */
    public static final <T> KSerializer<T> m33847d(KClass<T> kClass, KSerializer<Object>... args) {
        C9971q.m14633g(kClass, "<this>");
        C9971q.m14633g(args, "args");
        return m33848c(C14376a.m737b(kClass), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    /* renamed from: e */
    private static final <T> KSerializer<T> m33846e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        C9971q.m14634f(canonicalName, "canonicalName");
        C9971q.m14635e(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C3624b0(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5 == false) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r5 == false) goto L_0x0096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> kotlinx.serialization.KSerializer<T> m33845f(java.lang.Class<T> r11) {
        /*
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r1 = "declaredFields"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        L_0x000f:
            r7 = 1
            if (r4 >= r1) goto L_0x0041
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.C9971q.m14638b(r9, r10)
            if (r9 == 0) goto L_0x0036
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.C9971q.m14638b(r9, r11)
            if (r9 == 0) goto L_0x0036
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L_0x0036
            r9 = r7
            goto L_0x0037
        L_0x0036:
            r9 = r3
        L_0x0037:
            if (r9 == 0) goto L_0x003e
            if (r5 == 0) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            r5 = r7
            r6 = r8
        L_0x003e:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0041:
            if (r5 != 0) goto L_0x0044
        L_0x0043:
            r6 = r2
        L_0x0044:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 != 0) goto L_0x0049
            return r2
        L_0x0049:
            java.lang.Object r0 = r6.get(r2)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r1 = "methods"
            kotlin.jvm.internal.C9971q.m14634f(r11, r1)
            int r1 = r11.length
            r6 = r2
            r4 = r3
            r5 = r4
        L_0x005a:
            if (r4 >= r1) goto L_0x0094
            r8 = r11[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "serializer"
            boolean r9 = kotlin.jvm.internal.C9971q.m14638b(r9, r10)
            if (r9 == 0) goto L_0x0089
            java.lang.Class[] r9 = r8.getParameterTypes()
            java.lang.String r10 = "it.parameterTypes"
            kotlin.jvm.internal.C9971q.m14634f(r9, r10)
            int r9 = r9.length
            if (r9 != 0) goto L_0x0078
            r9 = r7
            goto L_0x0079
        L_0x0078:
            r9 = r3
        L_0x0079:
            if (r9 == 0) goto L_0x0089
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r10 = kotlinx.serialization.KSerializer.class
            boolean r9 = kotlin.jvm.internal.C9971q.m14638b(r9, r10)
            if (r9 == 0) goto L_0x0089
            r9 = r7
            goto L_0x008a
        L_0x0089:
            r9 = r3
        L_0x008a:
            if (r9 == 0) goto L_0x0091
            if (r5 == 0) goto L_0x008f
            goto L_0x0096
        L_0x008f:
            r5 = r7
            r6 = r8
        L_0x0091:
            int r4 = r4 + 1
            goto L_0x005a
        L_0x0094:
            if (r5 != 0) goto L_0x0097
        L_0x0096:
            r6 = r2
        L_0x0097:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L_0x009c
            return r2
        L_0x009c:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Object r11 = r6.invoke(r0, r11)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto L_0x00a9
            r2 = r11
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.C3673l1.m33845f(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    /* renamed from: g */
    private static final <T> KSerializer<T> m33844g(Class<T> cls) {
        AbstractC14435f fVar = (AbstractC14435f) cls.getAnnotation(AbstractC14435f.class);
        if (fVar == null || C9971q.m14638b(C9951f0.m14684b(fVar.with()), C9951f0.m14684b(C14431c.class))) {
            return new C14431c(C14376a.m734e(cls));
        }
        return null;
    }

    /* renamed from: h */
    private static final <T> KSerializer<T> m33843h(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        boolean z;
        Class[] clsArr;
        Object a = m33850a(cls);
        if (a == null) {
            return null;
        }
        try {
            if (kSerializerArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = a.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(a, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    /* renamed from: i */
    private static final <T> boolean m33842i(Class<T> cls) {
        if (cls.getAnnotation(AbstractC14435f.class) == null && cls.getAnnotation(AbstractC14430b.class) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static final <T> boolean m33841j(Class<T> cls) {
        if (cls.getAnnotation(AbstractC14430b.class) != null) {
            return true;
        }
        AbstractC14435f fVar = (AbstractC14435f) cls.getAnnotation(AbstractC14435f.class);
        if (fVar == null || !C9971q.m14638b(C9951f0.m14684b(fVar.with()), C9951f0.m14684b(C14431c.class))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final boolean m33840k(KClass<Object> rootClass) {
        C9971q.m14633g(rootClass, "rootClass");
        return C14376a.m737b(rootClass).isArray();
    }

    /* renamed from: l */
    public static final Void m33839l(KClass<?> kClass) {
        C9971q.m14633g(kClass, "<this>");
        C3677m1.m33825f(kClass);
        throw new C11075i();
    }

    /* renamed from: m */
    public static final Void m33838m(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        throw new C14436g(C3677m1.m33826e(C14376a.m734e(cls)));
    }

    /* renamed from: n */
    public static final <T, E extends T> E[] m33837n(ArrayList<E> arrayList, KClass<T> eClass) {
        C9971q.m14633g(arrayList, "<this>");
        C9971q.m14633g(eClass, "eClass");
        Object newInstance = Array.newInstance(C14376a.m737b(eClass), arrayList.size());
        C9971q.m14635e(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
        C9971q.m14634f(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }
}
