package p180jg;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p180jg.AbstractC9579e;
import p267of.C11289v;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eBA\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\t\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010 R\u0014\u0010$\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, m15073d2 = {"Ljg/a;", "Ljg/e;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "jClass", "", "", "b", "Ljava/util/List;", "parameterNames", "Ljg/a$a;", "c", "Ljg/a$a;", "callMode", "Ljava/lang/reflect/Method;", "d", "methods", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljg/a$b;", "origin", "<init>", "(Ljava/lang/Class;Ljava/util/List;Ljg/a$a;Ljg/a$b;Ljava/util/List;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: jg.a */
/* loaded from: classes8.dex */
public final class C9571a implements AbstractC9579e {

    /* renamed from: a */
    private final Class<?> f21236a;

    /* renamed from: b */
    private final List<String> f21237b;

    /* renamed from: c */
    private final EnumC0289a f21238c;

    /* renamed from: d */
    private final List<Method> f21239d;

    /* renamed from: e */
    private final List<Type> f21240e;

    /* renamed from: f */
    private final List<Class<?>> f21241f;

    /* renamed from: g */
    private final List<Object> f21242g;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m15073d2 = {"Ljg/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.a$a */
    /* loaded from: classes8.dex */
    public enum EnumC0289a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m15073d2 = {"Ljg/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.a$b */
    /* loaded from: classes8.dex */
    public enum EnumC9572b {
        JAVA,
        KOTLIN
    }

    public C9571a(Class<?> jClass, List<String> parameterNames, EnumC0289a callMode, EnumC9572b origin, List<Method> methods) {
        int t;
        int t2;
        int t3;
        List l0;
        C9971q.m14633g(jClass, "jClass");
        C9971q.m14633g(parameterNames, "parameterNames");
        C9971q.m14633g(callMode, "callMode");
        C9971q.m14633g(origin, "origin");
        C9971q.m14633g(methods, "methods");
        this.f21236a = jClass;
        this.f21237b = parameterNames;
        this.f21238c = callMode;
        this.f21239d = methods;
        t = C9907k.m14809t(methods, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Method method : methods) {
            arrayList.add(method.getGenericReturnType());
        }
        this.f21240e = arrayList;
        List<Method> list = this.f21239d;
        t2 = C9907k.m14809t(list, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        for (Method method2 : list) {
            Class<?> it = method2.getReturnType();
            C9971q.m14634f(it, "it");
            Class<?> g = C13283d.m4047g(it);
            if (g != null) {
                it = g;
            }
            arrayList2.add(it);
        }
        this.f21241f = arrayList2;
        List<Method> list2 = this.f21239d;
        t3 = C9907k.m14809t(list2, 10);
        ArrayList arrayList3 = new ArrayList(t3);
        for (Method method3 : list2) {
            arrayList3.add(method3.getDefaultValue());
        }
        this.f21242g = arrayList3;
        if (this.f21238c == EnumC0289a.POSITIONAL_CALL && origin == EnumC9572b.JAVA) {
            l0 = C9914r.m14753l0(this.f21237b, "value");
            if (!l0.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: a */
    public List<Type> mo15932a() {
        return this.f21240e;
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo15931b() {
        return (Member) m15968d();
    }

    /* renamed from: c */
    public void m15969c(Object[] objArr) {
        AbstractC9579e.C9580a.m15953a(this, objArr);
    }

    @Override // p180jg.AbstractC9579e
    public Object call(Object[] args) {
        List K0;
        Map r;
        Object obj;
        C9971q.m14633g(args, "args");
        m15969c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj2 = args[i];
            int i3 = i2 + 1;
            if (obj2 == null && this.f21238c == EnumC0289a.CALL_BY_NAME) {
                obj = this.f21242g.get(i2);
            } else {
                obj = C9574c.m15955k(obj2, this.f21241f.get(i2));
            }
            if (obj != null) {
                arrayList.add(obj);
                i++;
                i2 = i3;
            } else {
                C9574c.m15956j(i2, this.f21237b.get(i2), this.f21241f.get(i2));
                throw null;
            }
        }
        Class<?> cls = this.f21236a;
        K0 = C9914r.m14781K0(this.f21237b, arrayList);
        r = C11289v.m10241r(K0);
        return C9574c.m15962d(cls, r, this.f21239d);
    }

    /* renamed from: d */
    public Void m15968d() {
        return null;
    }

    @Override // p180jg.AbstractC9579e
    public Type getReturnType() {
        return this.f21236a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C9571a(java.lang.Class r7, java.util.List r8, p180jg.C9571a.EnumC0289a r9, p180jg.C9571a.EnumC9572b r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C9904h.m14841t(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x002a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L_0x0013
        L_0x002a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p180jg.C9571a.<init>(java.lang.Class, java.util.List, jg.a$a, jg.a$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
