package p158ig;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9947e;
import kotlin.jvm.internal.AbstractC9963l;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import nf.C11088q;
import p107fg.AbstractC7144f;
import p158ig.AbstractC8431i;
import p158ig.AbstractC8434j;
import p158ig.C8442j0;
import p180jg.AbstractC9579e;
import p180jg.AbstractC9581f;
import p180jg.C9571a;
import p180jg.C9599g;
import p180jg.C9602i;
import p268og.AbstractC11313e;
import p268og.AbstractC11346m;
import p268og.AbstractC11397y;
import p407wh.C13883b;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bC\u0010DB7\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u0010E\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010FB+\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010GJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010\u000e\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010.\u001a\u0006\u0012\u0002\b\u00030)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R!\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010?\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00106R\u0014\u0010@\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00106R\u0014\u0010A\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00106R\u0014\u0010B\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u00106¨\u0006H"}, m15073d2 = {"Lig/q;", "Lig/l;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/l;", "Lig/i;", "Ljava/lang/reflect/Method;", "member", "Ljg/f$h;", "I", "H", "G", "Ljava/lang/reflect/Constructor;", "Log/y;", "descriptor", "", "isDefault", "Ljg/f;", "F", "other", "equals", "", "hashCode", "", "toString", "Lig/p;", "o", "Lig/p;", "v", "()Lig/p;", "container", "p", "Ljava/lang/String;", "signature", "q", "Ljava/lang/Object;", "rawBoundReceiver", "r", "Lig/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Ljg/e;", "s", "Lig/j0$b;", "u", "()Ljg/e;", "caller", "t", "w", "defaultCaller", "J", "()Ljava/lang/Object;", "boundReceiver", "z", "()Z", "isBound", "getName", "()Ljava/lang/String;", "name", "getArity", "()I", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "<init>", "(Lig/p;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lig/p;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "(Lig/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.q */
/* loaded from: classes8.dex */
public final class C8505q extends AbstractC8453l<Object> implements AbstractC9963l<Object>, KFunction<Object>, AbstractC8431i {

    /* renamed from: u */
    static final /* synthetic */ KProperty<Object>[] f18494u = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8505q.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8505q.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C8505q.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: o */
    private final AbstractC8494p f18495o;

    /* renamed from: p */
    private final String f18496p;

    /* renamed from: q */
    private final Object f18497q;

    /* renamed from: r */
    private final C8442j0.C8443a f18498r;

    /* renamed from: s */
    private final C8442j0.C8444b f18499s;

    /* renamed from: t */
    private final C8442j0.C8444b f18500t;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Ljg/e;", "Ljava/lang/reflect/Executable;", "kotlin.jvm.PlatformType", "a", "()Ljg/e;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.q$a */
    /* loaded from: classes8.dex */
    static final class C8506a extends AbstractC9973s implements Function0<AbstractC9579e<? extends Executable>> {
        C8506a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC9579e<Executable> invoke() {
            Object obj;
            AbstractC9579e eVar;
            int t;
            int t2;
            AbstractC8434j g = C8488m0.f18475a.m19690g(C8505q.this.mo19626x());
            if (g instanceof AbstractC8434j.C8440d) {
                if (C8505q.this.m19744y()) {
                    Class<?> i = C8505q.this.mo19628v().mo14611i();
                    List<AbstractC7144f> parameters = C8505q.this.getParameters();
                    t2 = C9907k.m14809t(parameters, 10);
                    ArrayList arrayList = new ArrayList(t2);
                    for (AbstractC7144f fVar : parameters) {
                        String name = fVar.getName();
                        C9971q.m14636d(name);
                        arrayList.add(name);
                    }
                    return new C9571a(i, arrayList, C9571a.EnumC0289a.POSITIONAL_CALL, C9571a.EnumC9572b.KOTLIN, null, 16, null);
                }
                obj = C8505q.this.mo19628v().m19675r(((AbstractC8434j.C8440d) g).m19775b());
            } else if (g instanceof AbstractC8434j.C8441e) {
                AbstractC8434j.C8441e eVar2 = (AbstractC8434j.C8441e) g;
                obj = C8505q.this.mo19628v().m19671v(eVar2.m19772c(), eVar2.m19773b());
            } else if (g instanceof AbstractC8434j.C8439c) {
                obj = ((AbstractC8434j.C8439c) g).m19776b();
            } else if (g instanceof AbstractC8434j.C8437b) {
                obj = ((AbstractC8434j.C8437b) g).m19778b();
            } else if (g instanceof AbstractC8434j.C8435a) {
                List<Method> b = ((AbstractC8434j.C8435a) g).m19780b();
                Class<?> i2 = C8505q.this.mo19628v().mo14611i();
                t = C9907k.m14809t(b, 10);
                ArrayList arrayList2 = new ArrayList(t);
                for (Method method : b) {
                    arrayList2.add(method.getName());
                }
                return new C9571a(i2, arrayList2, C9571a.EnumC0289a.POSITIONAL_CALL, C9571a.EnumC9572b.JAVA, b);
            } else {
                throw new C11088q();
            }
            if (obj instanceof Constructor) {
                C8505q qVar = C8505q.this;
                eVar = qVar.m19635F((Constructor) obj, qVar.mo19626x(), false);
            } else if (obj instanceof Method) {
                Method method2 = (Method) obj;
                if (!Modifier.isStatic(method2.getModifiers())) {
                    eVar = C8505q.this.m19634G(method2);
                } else if (C8505q.this.mo19626x().getAnnotations().mo9038c(C8503p0.m19650j()) != null) {
                    eVar = C8505q.this.m19633H(method2);
                } else {
                    eVar = C8505q.this.m19632I(method2);
                }
            } else {
                throw new C8430h0("Could not compute caller for function: " + C8505q.this.mo19626x() + " (member = " + obj + ')');
            }
            return C9602i.m15942c(eVar, C8505q.this.mo19626x(), false, 2, null);
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"Ljg/e;", "Ljava/lang/reflect/Executable;", "a", "()Ljg/e;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.q$b */
    /* loaded from: classes8.dex */
    static final class C8507b extends AbstractC9973s implements Function0<AbstractC9579e<? extends Executable>> {
        C8507b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC9579e<Executable> invoke() {
            Object obj;
            AbstractC9579e eVar;
            int t;
            int t2;
            Member b;
            AbstractC8434j g = C8488m0.f18475a.m19690g(C8505q.this.mo19626x());
            if (g instanceof AbstractC8434j.C8441e) {
                AbstractC8494p v = C8505q.this.mo19628v();
                AbstractC8434j.C8441e eVar2 = (AbstractC8434j.C8441e) g;
                String c = eVar2.m19772c();
                String b2 = eVar2.m19773b();
                C9971q.m14636d(C8505q.this.mo19629u().mo15931b());
                obj = v.m19673t(c, b2, !Modifier.isStatic(b.getModifiers()));
            } else if (g instanceof AbstractC8434j.C8440d) {
                if (C8505q.this.m19744y()) {
                    Class<?> i = C8505q.this.mo19628v().mo14611i();
                    List<AbstractC7144f> parameters = C8505q.this.getParameters();
                    t2 = C9907k.m14809t(parameters, 10);
                    ArrayList arrayList = new ArrayList(t2);
                    for (AbstractC7144f fVar : parameters) {
                        String name = fVar.getName();
                        C9971q.m14636d(name);
                        arrayList.add(name);
                    }
                    return new C9571a(i, arrayList, C9571a.EnumC0289a.CALL_BY_NAME, C9571a.EnumC9572b.KOTLIN, null, 16, null);
                }
                obj = C8505q.this.mo19628v().m19674s(((AbstractC8434j.C8440d) g).m19775b());
            } else if (g instanceof AbstractC8434j.C8435a) {
                List<Method> b3 = ((AbstractC8434j.C8435a) g).m19780b();
                Class<?> i2 = C8505q.this.mo19628v().mo14611i();
                t = C9907k.m14809t(b3, 10);
                ArrayList arrayList2 = new ArrayList(t);
                for (Method method : b3) {
                    arrayList2.add(method.getName());
                }
                return new C9571a(i2, arrayList2, C9571a.EnumC0289a.CALL_BY_NAME, C9571a.EnumC9572b.JAVA, b3);
            } else {
                obj = null;
            }
            if (obj instanceof Constructor) {
                C8505q qVar = C8505q.this;
                eVar = qVar.m19635F((Constructor) obj, qVar.mo19626x(), true);
            } else if (obj instanceof Method) {
                if (C8505q.this.mo19626x().getAnnotations().mo9038c(C8503p0.m19650j()) != null) {
                    AbstractC11346m b4 = C8505q.this.mo19626x().mo6104b();
                    C9971q.m14635e(b4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((AbstractC11313e) b4).mo6119X()) {
                        eVar = C8505q.this.m19633H((Method) obj);
                    }
                }
                eVar = C8505q.this.m19632I((Method) obj);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return C9602i.m15943b(eVar, C8505q.this.mo19626x(), true);
            }
            return null;
        }
    }

    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"Log/y;", "kotlin.jvm.PlatformType", "a", "()Log/y;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.q$c */
    /* loaded from: classes8.dex */
    static final class C8508c extends AbstractC9973s implements Function0<AbstractC11397y> {

        /* renamed from: l */
        final /* synthetic */ String f18504l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8508c(String str) {
            super(0);
            this.f18504l = str;
        }

        /* renamed from: a */
        public final AbstractC11397y invoke() {
            return C8505q.this.mo19628v().m19672u(this.f18504l, C8505q.this.f18496p);
        }
    }

    /* synthetic */ C8505q(AbstractC8494p pVar, String str, String str2, AbstractC11397y yVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, str, str2, yVar, (i & 16) != 0 ? AbstractC9947e.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final AbstractC9581f<Constructor<?>> m19635F(Constructor<?> constructor, AbstractC11397y yVar, boolean z) {
        if (z || !C13883b.m2405f(yVar)) {
            if (mo19625z()) {
                return new AbstractC9581f.C9584c(constructor, m19631J());
            }
            return new AbstractC9581f.C9586e(constructor);
        } else if (mo19625z()) {
            return new AbstractC9581f.C9582a(constructor, m19631J());
        } else {
            return new AbstractC9581f.C9583b(constructor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final AbstractC9581f.AbstractC9593h m19634G(Method method) {
        return mo19625z() ? new AbstractC9581f.AbstractC9593h.C9594a(method, m19631J()) : new AbstractC9581f.AbstractC9593h.C9597d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final AbstractC9581f.AbstractC9593h m19633H(Method method) {
        return mo19625z() ? new AbstractC9581f.AbstractC9593h.C9595b(method) : new AbstractC9581f.AbstractC9593h.C9598e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final AbstractC9581f.AbstractC9593h m19632I(Method method) {
        return mo19625z() ? new AbstractC9581f.AbstractC9593h.C9596c(method, m19631J()) : new AbstractC9581f.AbstractC9593h.C0291f(method);
    }

    /* renamed from: J */
    private final Object m19631J() {
        return C9602i.m15944a(this.f18497q, mo19626x());
    }

    /* renamed from: K */
    public AbstractC11397y mo19626x() {
        T b = this.f18498r.m19764b(this, f18494u[0]);
        C9971q.m14634f(b, "<get-descriptor>(...)");
        return (AbstractC11397y) b;
    }

    public boolean equals(Object obj) {
        C8505q c = C8503p0.m19657c(obj);
        if (c != null && C9971q.m14638b(mo19628v(), c.mo19628v()) && C9971q.m14638b(getName(), c.getName()) && C9971q.m14638b(this.f18496p, c.f18496p) && C9971q.m14638b(this.f18497q, c.f18497q)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC9963l
    public int getArity() {
        return C9599g.m15948a(mo19629u());
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        String b = mo19626x().getName().m10771b();
        C9971q.m14634f(b, "descriptor.name.asString()");
        return b;
    }

    public int hashCode() {
        return (((mo19628v().hashCode() * 31) + getName().hashCode()) * 31) + this.f18496p.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractC8431i.C8432a.m19786a(this);
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return mo19626x().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return mo19626x().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return mo19626x().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return mo19626x().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return mo19626x().isSuspend();
    }

    public String toString() {
        return C8462l0.f18419a.m19734d(mo19626x());
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: u */
    public AbstractC9579e<?> mo19629u() {
        T b = this.f18499s.m19764b(this, f18494u[1]);
        C9971q.m14634f(b, "<get-caller>(...)");
        return (AbstractC9579e) b;
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: v */
    public AbstractC8494p mo19628v() {
        return this.f18495o;
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: w */
    public AbstractC9579e<?> mo19627w() {
        return (AbstractC9579e) this.f18500t.m19764b(this, f18494u[2]);
    }

    @Override // p158ig.AbstractC8453l
    /* renamed from: z */
    public boolean mo19625z() {
        return !C9971q.m14638b(this.f18497q, AbstractC9947e.NO_RECEIVER);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC8431i.C8432a.m19785b(this, obj);
    }

    private C8505q(AbstractC8494p pVar, String str, String str2, AbstractC11397y yVar, Object obj) {
        this.f18495o = pVar;
        this.f18496p = str2;
        this.f18497q = obj;
        this.f18498r = C8442j0.m19769c(yVar, new C8508c(str));
        this.f18499s = C8442j0.m19770b(new C8506a());
        this.f18500t = C8442j0.m19770b(new C8507b());
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return AbstractC8431i.C8432a.m19784c(this, obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return AbstractC8431i.C8432a.m19783d(this, obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return AbstractC8431i.C8432a.m19782e(this, obj, obj2, obj3, obj4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8505q(AbstractC8494p container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        C9971q.m14633g(container, "container");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8505q(p158ig.AbstractC8494p r10, p268og.AbstractC11397y r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C9971q.m14633g(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C9971q.m14633g(r11, r0)
            nh.f r0 = r11.getName()
            java.lang.String r3 = r0.m10771b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C9971q.m14634f(r3, r0)
            ig.m0 r0 = p158ig.C8488m0.f18475a
            ig.j r0 = r0.m19690g(r11)
            java.lang.String r4 = r0.mo19774a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158ig.C8505q.<init>(ig.p, og.y):void");
    }
}
