package ug;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9960j0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6898j;
import p086eh.AbstractC6911w;
import p086eh.EnumC6892d0;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11362n1;
import p268og.C11348m1;
import p306qi.C12200o;
import sg.C12896a;
import sg.C12897b;
import sg.C12898c;

/* renamed from: ug.l */
/* loaded from: classes8.dex */
public final class C13294l extends AbstractC13306p implements AbstractC13290h, AbstractC13312v, AbstractC6895g {

    /* renamed from: a */
    private final Class<?> f29838a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C13295a extends C9965m implements Function1<Member, Boolean> {

        /* renamed from: k */
        public static final C13295a f29839k = new C13295a();

        C13295a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        /* renamed from: i */
        public final Boolean invoke(Member p0) {
            C9971q.m14633g(p0, "p0");
            return Boolean.valueOf(p0.isSynthetic());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C13296b extends C9965m implements Function1<Constructor<?>, C13305o> {

        /* renamed from: k */
        public static final C13296b f29840k = new C13296b();

        C13296b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C13305o.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        /* renamed from: i */
        public final C13305o invoke(Constructor<?> p0) {
            C9971q.m14633g(p0, "p0");
            return new C13305o(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C13297c extends C9965m implements Function1<Member, Boolean> {

        /* renamed from: k */
        public static final C13297c f29841k = new C13297c();

        C13297c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        /* renamed from: i */
        public final Boolean invoke(Member p0) {
            C9971q.m14633g(p0, "p0");
            return Boolean.valueOf(p0.isSynthetic());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C13298d extends C9965m implements Function1<Field, C13308r> {

        /* renamed from: k */
        public static final C13298d f29842k = new C13298d();

        C13298d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C13308r.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        /* renamed from: i */
        public final C13308r invoke(Field p0) {
            C9971q.m14633g(p0, "p0");
            return new C13308r(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$e */
    /* loaded from: classes8.dex */
    public static final class C13299e extends AbstractC9973s implements Function1<Class<?>, Boolean> {

        /* renamed from: k */
        public static final C13299e f29843k = new C13299e();

        C13299e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            C9971q.m14634f(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$f */
    /* loaded from: classes8.dex */
    public static final class C13300f extends AbstractC9973s implements Function1<Class<?>, C11142f> {

        /* renamed from: k */
        public static final C13300f f29844k = new C13300f();

        C13300f() {
            super(1);
        }

        /* renamed from: a */
        public final C11142f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!C11142f.m10765h(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return C11142f.m10767f(simpleName);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$g */
    /* loaded from: classes8.dex */
    public static final class C13301g extends AbstractC9973s implements Function1<Method, Boolean> {
        C13301g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
            if (r0.m4018W(r5) == false) goto L_0x001e;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                goto L_0x001f
            L_0x0008:
                ug.l r0 = ug.C13294l.this
                boolean r0 = r0.mo4009v()
                r2 = 1
                if (r0 == 0) goto L_0x001e
                ug.l r0 = ug.C13294l.this
                java.lang.String r3 = "method"
                kotlin.jvm.internal.C9971q.m14634f(r5, r3)
                boolean r5 = ug.C13294l.m4025P(r0, r5)
                if (r5 != 0) goto L_0x001f
            L_0x001e:
                r1 = r2
            L_0x001f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ug.C13294l.C13301g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug.l$h */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C13302h extends C9965m implements Function1<Method, C13311u> {

        /* renamed from: k */
        public static final C13302h f29846k = new C13302h();

        C13302h() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C13311u.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        /* renamed from: i */
        public final C13311u invoke(Method p0) {
            C9971q.m14633g(p0, "p0");
            return new C13311u(p0);
        }
    }

    public C13294l(Class<?> klass) {
        C9971q.m14633g(klass, "klass");
        this.f29838a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final boolean m4018W(Method method) {
        String name = method.getName();
        if (C9971q.m14638b(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            C9971q.m14634f(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (C9971q.m14638b(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: C */
    public Collection<AbstractC6898j> mo4028C() {
        List i;
        Class<?>[] c = C13277b.f29806a.m4071c(this.f29838a);
        if (c != null) {
            ArrayList arrayList = new ArrayList(c.length);
            for (Class<?> cls : c) {
                arrayList.add(new C13304n(cls));
            }
            return arrayList;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return false;
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: J */
    public boolean mo4027J() {
        return this.f29838a.isInterface();
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: K */
    public EnumC6892d0 mo4026K() {
        return null;
    }

    /* renamed from: Q */
    public List<C13305o> mo4016l() {
        Sequence u;
        Sequence q;
        Sequence y;
        List<C13305o> E;
        Constructor<?>[] declaredConstructors = this.f29838a.getDeclaredConstructors();
        C9971q.m14634f(declaredConstructors, "klass.declaredConstructors");
        u = C9899f.m14915u(declaredConstructors);
        q = C12200o.m7428q(u, C13295a.f29839k);
        y = C12200o.m7420y(q, C13296b.f29840k);
        E = C12200o.m7436E(y);
        return E;
    }

    /* renamed from: R */
    public Class<?> mo3981b() {
        return this.f29838a;
    }

    /* renamed from: S */
    public List<C13308r> mo4008x() {
        Sequence u;
        Sequence q;
        Sequence y;
        List<C13308r> E;
        Field[] declaredFields = this.f29838a.getDeclaredFields();
        C9971q.m14634f(declaredFields, "klass.declaredFields");
        u = C9899f.m14915u(declaredFields);
        q = C12200o.m7428q(u, C13297c.f29841k);
        y = C12200o.m7420y(q, C13298d.f29842k);
        E = C12200o.m7436E(y);
        return E;
    }

    /* renamed from: T */
    public List<C11142f> mo4030A() {
        Sequence u;
        Sequence q;
        Sequence z;
        List<C11142f> E;
        Class<?>[] declaredClasses = this.f29838a.getDeclaredClasses();
        C9971q.m14634f(declaredClasses, "klass.declaredClasses");
        u = C9899f.m14915u(declaredClasses);
        q = C12200o.m7428q(u, C13299e.f29843k);
        z = C12200o.m7419z(q, C13300f.f29844k);
        E = C12200o.m7436E(z);
        return E;
    }

    /* renamed from: U */
    public List<C13311u> mo4029B() {
        Sequence u;
        Sequence p;
        Sequence y;
        List<C13311u> E;
        Method[] declaredMethods = this.f29838a.getDeclaredMethods();
        C9971q.m14634f(declaredMethods, "klass.declaredMethods");
        u = C9899f.m14915u(declaredMethods);
        p = C12200o.m7429p(u, new C13301g());
        y = C12200o.m7420y(p, C13302h.f29846k);
        E = C12200o.m7436E(y);
        return E;
    }

    /* renamed from: V */
    public C13294l mo4014o() {
        Class<?> declaringClass = this.f29838a.getDeclaringClass();
        if (declaringClass != null) {
            return new C13294l(declaringClass);
        }
        return null;
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: e */
    public C11137c mo4017e() {
        C11137c b = C13283d.m4053a(this.f29838a).m10816b();
        C9971q.m14634f(b, "klass.classId.asSingleFqName()");
        return b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13294l) && C9971q.m14638b(this.f29838a, ((C13294l) obj).f29838a);
    }

    @Override // p086eh.AbstractC6907s
    /* renamed from: f */
    public boolean mo3980f() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // ug.AbstractC13312v
    public int getModifiers() {
        return this.f29838a.getModifiers();
    }

    @Override // p086eh.AbstractC6908t
    public C11142f getName() {
        C11142f f = C11142f.m10767f(this.f29838a.getSimpleName());
        C9971q.m14634f(f, "identifier(klass.simpleName)");
        return f;
    }

    @Override // p086eh.AbstractC6914z
    public List<C13276a0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f29838a.getTypeParameters();
        C9971q.m14634f(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C13276a0(typeVariable));
        }
        return arrayList;
    }

    @Override // p086eh.AbstractC6907s
    public AbstractC11362n1 getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return C11348m1.C11356h.f25284c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return C11348m1.C11353e.f25281c;
        }
        if (!Modifier.isProtected(modifiers)) {
            return C12896a.f28970c;
        }
        if (Modifier.isStatic(modifiers)) {
            return C12898c.f28972c;
        }
        return C12897b.f28971c;
    }

    public int hashCode() {
        return this.f29838a.hashCode();
    }

    @Override // p086eh.AbstractC6907s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p086eh.AbstractC6907s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: m */
    public Collection<AbstractC6898j> mo4015m() {
        List<Type> l;
        int t;
        List i;
        Object obj = Object.class;
        if (C9971q.m14638b(this.f29838a, obj)) {
            i = C9906j.m14820i();
            return i;
        }
        C9960j0 j0Var = new C9960j0(2);
        Object genericSuperclass = this.f29838a.getGenericSuperclass();
        if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        j0Var.m14660a(obj);
        Type[] genericInterfaces = this.f29838a.getGenericInterfaces();
        C9971q.m14634f(genericInterfaces, "klass.genericInterfaces");
        j0Var.m14659b(genericInterfaces);
        l = C9906j.m14817l(j0Var.m14657d(new Type[j0Var.m14658c()]));
        t = C9907k.m14809t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Type type : l) {
            arrayList.add(new C13304n(type));
        }
        return arrayList;
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: p */
    public Collection<AbstractC6911w> mo4013p() {
        Object[] d = C13277b.f29806a.m4070d(this.f29838a);
        if (d == null) {
            d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d.length);
        for (Object obj : d) {
            arrayList.add(new C13315y(obj));
        }
        return arrayList;
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: q */
    public boolean mo4012q() {
        return this.f29838a.isAnnotation();
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: r */
    public boolean mo4011r() {
        Boolean e = C13277b.f29806a.m4069e(this.f29838a);
        if (e != null) {
            return e.booleanValue();
        }
        return false;
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: s */
    public boolean mo4010s() {
        return false;
    }

    public String toString() {
        return C13294l.class.getName() + ": " + this.f29838a;
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: v */
    public boolean mo4009v() {
        return this.f29838a.isEnum();
    }

    @Override // p086eh.AbstractC6895g
    /* renamed from: y */
    public boolean mo4007y() {
        Boolean f = C13277b.f29806a.m4068f(this.f29838a);
        if (f != null) {
            return f.booleanValue();
        }
        return false;
    }

    @Override // ug.AbstractC13290h, p086eh.AbstractC6891d
    /* renamed from: c */
    public C13286e mo3966c(C11137c fqName) {
        Annotation[] declaredAnnotations;
        C9971q.m14633g(fqName, "fqName");
        AnnotatedElement b = mo3981b();
        if (b == null || (declaredAnnotations = b.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C13291i.m4034a(declaredAnnotations, fqName);
    }

    @Override // ug.AbstractC13290h, p086eh.AbstractC6891d
    public List<C13286e> getAnnotations() {
        List<C13286e> i;
        Annotation[] declaredAnnotations;
        List<C13286e> b;
        AnnotatedElement b2 = mo3981b();
        if (b2 != null && (declaredAnnotations = b2.getDeclaredAnnotations()) != null && (b = C13291i.m4033b(declaredAnnotations)) != null) {
            return b;
        }
        i = C9906j.m14820i();
        return i;
    }
}
