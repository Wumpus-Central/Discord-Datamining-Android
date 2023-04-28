package p158ig;

import com.facebook.react.util.JSStackTrace;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.AbstractC10609d;
import p303qf.C12120c;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m15073d2 = {"Lig/j;", "", "", "a", "<init>", "()V", "b", "c", "d", "e", "Lig/j$a;", "Lig/j$b;", "Lig/j$c;", "Lig/j$d;", "Lig/j$e;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.j */
/* loaded from: classes8.dex */
public abstract class AbstractC8434j {

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lig/j$a;", "Lig/j;", "", "a", "Ljava/lang/Class;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "()Ljava/util/List;", "methods", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.j$a */
    /* loaded from: classes8.dex */
    public static final class C8435a extends AbstractC8434j {

        /* renamed from: a */
        private final Class<?> f18380a;

        /* renamed from: b */
        private final List<Method> f18381b;

        @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.j$a$a */
        /* loaded from: classes8.dex */
        static final class C0260a extends AbstractC9973s implements Function1<Method, CharSequence> {

            /* renamed from: k */
            public static final C0260a f18382k = new C0260a();

            C0260a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                C9971q.m14634f(returnType, "it.returnType");
                return C13283d.m4052b(returnType);
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.j$a$b */
        /* loaded from: classes8.dex */
        public static final class C8436b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int d;
                d = C12120c.m7778d(((Method) t).getName(), ((Method) t2).getName());
                return d;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8435a(Class<?> jClass) {
            super(null);
            List<Method> k0;
            C9971q.m14633g(jClass, "jClass");
            this.f18380a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            C9971q.m14634f(declaredMethods, "jClass.declaredMethods");
            k0 = C9899f.m14926k0(declaredMethods, new C8436b());
            this.f18381b = k0;
        }

        @Override // p158ig.AbstractC8434j
        /* renamed from: a */
        public String mo19774a() {
            String e0;
            e0 = C9914r.m14760e0(this.f18381b, "", "<init>(", ")V", 0, null, C0260a.f18382k, 24, null);
            return e0;
        }

        /* renamed from: b */
        public final List<Method> m19780b() {
            return this.f18381b;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m15073d2 = {"Lig/j$b;", "Lig/j;", "", "a", "Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.j$b */
    /* loaded from: classes8.dex */
    public static final class C8437b extends AbstractC8434j {

        /* renamed from: a */
        private final Constructor<?> f18383a;

        @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ig.j$b$a */
        /* loaded from: classes8.dex */
        static final class C8438a extends AbstractC9973s implements Function1<Class<?>, CharSequence> {

            /* renamed from: k */
            public static final C8438a f18384k = new C8438a();

            C8438a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(Class<?> it) {
                C9971q.m14634f(it, "it");
                return C13283d.m4052b(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8437b(Constructor<?> constructor) {
            super(null);
            C9971q.m14633g(constructor, "constructor");
            this.f18383a = constructor;
        }

        @Override // p158ig.AbstractC8434j
        /* renamed from: a */
        public String mo19774a() {
            String c0;
            Class<?>[] parameterTypes = this.f18383a.getParameterTypes();
            C9971q.m14634f(parameterTypes, "constructor.parameterTypes");
            c0 = C9899f.m14934c0(parameterTypes, "", "<init>(", ")V", 0, null, C8438a.f18384k, 24, null);
            return c0;
        }

        /* renamed from: b */
        public final Constructor<?> m19778b() {
            return this.f18383a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m15073d2 = {"Lig/j$c;", "Lig/j;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.j$c */
    /* loaded from: classes8.dex */
    public static final class C8439c extends AbstractC8434j {

        /* renamed from: a */
        private final Method f18385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8439c(Method method) {
            super(null);
            C9971q.m14633g(method, "method");
            this.f18385a = method;
        }

        @Override // p158ig.AbstractC8434j
        /* renamed from: a */
        public String mo19774a() {
            return C8490n0.m19689a(this.f18385a);
        }

        /* renamed from: b */
        public final Method m19776b() {
            return this.f18385a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lig/j$d;", "Lig/j;", "", "a", "Lmh/d$b;", "Lmh/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "()Ljava/lang/String;", "constructorDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.j$d */
    /* loaded from: classes8.dex */
    public static final class C8440d extends AbstractC8434j {

        /* renamed from: a */
        private final AbstractC10609d.C10611b f18386a;

        /* renamed from: b */
        private final String f18387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8440d(AbstractC10609d.C10611b signature) {
            super(null);
            C9971q.m14633g(signature, "signature");
            this.f18386a = signature;
            this.f18387b = signature.mo12735a();
        }

        @Override // p158ig.AbstractC8434j
        /* renamed from: a */
        public String mo19774a() {
            return this.f18387b;
        }

        /* renamed from: b */
        public final String m19775b() {
            return this.f18386a.mo12734b();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\r¨\u0006\u0012"}, m15073d2 = {"Lig/j$e;", "Lig/j;", "", "a", "Lmh/d$b;", "Lmh/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "c", "()Ljava/lang/String;", JSStackTrace.METHOD_NAME_KEY, "methodDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.j$e */
    /* loaded from: classes8.dex */
    public static final class C8441e extends AbstractC8434j {

        /* renamed from: a */
        private final AbstractC10609d.C10611b f18388a;

        /* renamed from: b */
        private final String f18389b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8441e(AbstractC10609d.C10611b signature) {
            super(null);
            C9971q.m14633g(signature, "signature");
            this.f18388a = signature;
            this.f18389b = signature.mo12735a();
        }

        @Override // p158ig.AbstractC8434j
        /* renamed from: a */
        public String mo19774a() {
            return this.f18389b;
        }

        /* renamed from: b */
        public final String m19773b() {
            return this.f18388a.mo12734b();
        }

        /* renamed from: c */
        public final String m19772c() {
            return this.f18388a.mo12733c();
        }
    }

    private AbstractC8434j() {
    }

    public /* synthetic */ AbstractC8434j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo19774a();
}
