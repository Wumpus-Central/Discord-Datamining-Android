package p180jg;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p158ig.C8503p0;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001b¨\u0006!"}, m15073d2 = {"Ljg/h;", "Ljava/lang/reflect/Member;", "M", "Ljg/e;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljg/e;", "caller", "", "b", "Z", "isDefault", "Ljg/h$a;", "c", "Ljg/h$a;", "data", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "Log/b;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Ljg/e;Z)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: jg.h */
/* loaded from: classes8.dex */
public final class C9600h<M extends Member> implements AbstractC9579e<M> {

    /* renamed from: a */
    private final AbstractC9579e<M> f21271a;

    /* renamed from: b */
    private final boolean f21272b;

    /* renamed from: c */
    private final C9601a f21273c;

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0086\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Ljg/h$a;", "", "Lkotlin/ranges/IntRange;", "a", "", "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "Lkotlin/ranges/IntRange;", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "argumentRange", "[Ljava/lang/reflect/Method;", "getUnbox", "unbox", "Ljava/lang/reflect/Method;", "getBox", "()Ljava/lang/reflect/Method;", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.h$a */
    /* loaded from: classes8.dex */
    private static final class C9601a {

        /* renamed from: a */
        private final IntRange f21274a;

        /* renamed from: b */
        private final Method[] f21275b;

        /* renamed from: c */
        private final Method f21276c;

        public C9601a(IntRange argumentRange, Method[] unbox, Method method) {
            C9971q.m14633g(argumentRange, "argumentRange");
            C9971q.m14633g(unbox, "unbox");
            this.f21274a = argumentRange;
            this.f21275b = unbox;
            this.f21276c = method;
        }

        /* renamed from: a */
        public final IntRange m15947a() {
            return this.f21274a;
        }

        /* renamed from: b */
        public final Method[] m15946b() {
            return this.f21275b;
        }

        /* renamed from: c */
        public final Method m15945c() {
            return this.f21276c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        if ((r12 instanceof p180jg.AbstractC9578d) != false) goto L_0x0068;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9600h(p268og.AbstractC11301b r11, p180jg.AbstractC9579e<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p180jg.C9600h.<init>(og.b, jg.e, boolean):void");
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: a */
    public List<Type> mo15932a() {
        return this.f21271a.mo15932a();
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: b */
    public M mo15931b() {
        return this.f21271a.mo15931b();
    }

    @Override // p180jg.AbstractC9579e
    public Object call(Object[] args) {
        Object invoke;
        C9971q.m14633g(args, "args");
        C9601a aVar = this.f21273c;
        IntRange a = aVar.m15947a();
        Method[] b = aVar.m15946b();
        Method c = aVar.m15945c();
        Object[] copyOf = Arrays.copyOf(args, args.length);
        C9971q.m14634f(copyOf, "copyOf(this, size)");
        int a2 = a.m14605a();
        int b2 = a.m14604b();
        if (a2 <= b2) {
            while (true) {
                Method method = b[a2];
                Object obj = args[a2];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        C9971q.m14634f(returnType, "method.returnType");
                        obj = C8503p0.m19653g(returnType);
                    }
                }
                copyOf[a2] = obj;
                if (a2 == b2) {
                    break;
                }
                a2++;
            }
        }
        Object call = this.f21271a.call(copyOf);
        if (c == null || (invoke = c.invoke(null, call)) == null) {
            return call;
        }
        return invoke;
    }

    @Override // p180jg.AbstractC9579e
    public Type getReturnType() {
        return this.f21271a.getReturnType();
    }
}
