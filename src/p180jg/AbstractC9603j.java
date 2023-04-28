package p180jg;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p180jg.AbstractC9579e;
import p180jg.AbstractC9581f;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eB\u001f\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, m15073d2 = {"Ljg/j;", "Ljg/e;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "c", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "b", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "e", "()Ljava/lang/reflect/Method;", "member", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "Ljg/j$a;", "Ljg/j$b;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: jg.j */
/* loaded from: classes8.dex */
public abstract class AbstractC9603j implements AbstractC9579e<Method> {

    /* renamed from: a */
    private final Method f21277a;

    /* renamed from: b */
    private final List<Type> f21278b;

    /* renamed from: c */
    private final Type f21279c;

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m15073d2 = {"Ljg/j$a;", "Ljg/j;", "Ljg/d;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.j$a */
    /* loaded from: classes8.dex */
    public static final class C9604a extends AbstractC9603j implements AbstractC9578d {

        /* renamed from: d */
        private final Object f21280d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9604a(java.lang.reflect.Method r3, java.lang.Object r4) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.C9971q.m14633g(r3, r0)
                java.util.List r0 = kotlin.collections.C9904h.m14862i()
                r1 = 0
                r2.<init>(r3, r0, r1)
                r2.f21280d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9603j.C9604a.<init>(java.lang.reflect.Method, java.lang.Object):void");
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            C9971q.m14633g(args, "args");
            m15934d(args);
            return m15935c(this.f21280d, args);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Ljg/j$b;", "Ljg/j;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.j$b */
    /* loaded from: classes8.dex */
    public static final class C9605b extends AbstractC9603j {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9605b(java.lang.reflect.Method r3) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.C9971q.m14633g(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.util.List r0 = kotlin.collections.C9904h.m14869d(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9603j.C9605b.<init>(java.lang.reflect.Method):void");
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            Object[] objArr;
            C9971q.m14633g(args, "args");
            m15934d(args);
            Object obj = args[0];
            AbstractC9581f.C9585d dVar = AbstractC9581f.f21258e;
            if (args.length <= 1) {
                objArr = new Object[0];
            } else {
                objArr = C9897e.m14985j(args, 1, args.length);
            }
            return m15935c(obj, objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC9603j(Method method, List<? extends Type> list) {
        this.f21277a = method;
        this.f21278b = list;
        Class<?> returnType = method.getReturnType();
        C9971q.m14634f(returnType, "unboxMethod.returnType");
        this.f21279c = returnType;
    }

    public /* synthetic */ AbstractC9603j(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: a */
    public final List<Type> mo15932a() {
        return this.f21278b;
    }

    /* renamed from: c */
    protected final Object m15935c(Object obj, Object[] args) {
        C9971q.m14633g(args, "args");
        return this.f21277a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    /* renamed from: d */
    public void m15934d(Object[] objArr) {
        AbstractC9579e.C9580a.m15953a(this, objArr);
    }

    /* renamed from: e */
    public final Method mo15931b() {
        return null;
    }

    @Override // p180jg.AbstractC9579e
    public final Type getReturnType() {
        return this.f21279c;
    }
}
