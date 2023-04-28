package p217lg;

import fi.AbstractC7267g0;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7329u0;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C9905i;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import nf.C11084n;
import nf.EnumC11087p;
import ni.C11148a;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.C11337k0;
import p268og.C11393x;
import p406wg.EnumC13881d;
import p448yh.AbstractC14411h;

/* renamed from: lg.j */
/* loaded from: classes8.dex */
public final class C10430j {

    /* renamed from: a */
    private final C11337k0 f22862a;

    /* renamed from: b */
    private final Lazy f22863b;

    /* renamed from: c */
    private final C10431a f22864c = new C10431a(1);

    /* renamed from: d */
    private final C10431a f22865d = new C10431a(1);

    /* renamed from: e */
    private final C10431a f22866e = new C10431a(1);

    /* renamed from: f */
    private final C10431a f22867f = new C10431a(2);

    /* renamed from: g */
    private final C10431a f22868g = new C10431a(3);

    /* renamed from: h */
    private final C10431a f22869h = new C10431a(1);

    /* renamed from: i */
    private final C10431a f22870i = new C10431a(2);

    /* renamed from: j */
    private final C10431a f22871j = new C10431a(3);

    /* renamed from: l */
    static final /* synthetic */ KProperty<Object>[] f22861l = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C10430j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: k */
    public static final C10432b f22860k = new C10432b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lg.j$a */
    /* loaded from: classes8.dex */
    public static final class C10431a {

        /* renamed from: a */
        private final int f22872a;

        public C10431a(int i) {
            this.f22872a = i;
        }

        /* renamed from: a */
        public final AbstractC11313e m13336a(C10430j types, KProperty<?> property) {
            C9971q.m14633g(types, "types");
            C9971q.m14633g(property, "property");
            return types.m13339b(C11148a.m10725a(property.getName()), this.f22872a);
        }
    }

    /* renamed from: lg.j$b */
    /* loaded from: classes8.dex */
    public static final class C10432b {
        private C10432b() {
        }

        public /* synthetic */ C10432b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7267g0 m13335a(AbstractC11327h0 module) {
            Object r0;
            List d;
            C9971q.m14633g(module, "module");
            AbstractC11313e a = C11393x.m10149a(module, C10434k.C10435a.f22937s0);
            if (a == null) {
                return null;
            }
            C7232c1 h = C7232c1.f15671l.m23149h();
            List<AbstractC11319f1> parameters = a.mo6111k().getParameters();
            C9971q.m14634f(parameters, "kPropertyClass.typeConstructor.parameters");
            r0 = C9914r.m14747r0(parameters);
            C9971q.m14634f(r0, "kPropertyClass.typeConstructor.parameters.single()");
            d = C9905i.m14825d(new C7329u0((AbstractC11319f1) r0));
            return C7270h0.m23053g(h, a, d);
        }
    }

    /* renamed from: lg.j$c */
    /* loaded from: classes8.dex */
    static final class C10433c extends AbstractC9973s implements Function0<AbstractC14411h> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11327h0 f22873k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10433c(AbstractC11327h0 h0Var) {
            super(0);
            this.f22873k = h0Var;
        }

        /* renamed from: a */
        public final AbstractC14411h invoke() {
            return this.f22873k.mo6135n0(C10434k.f22891r).mo6180o();
        }
    }

    public C10430j(AbstractC11327h0 module, C11337k0 notFoundClasses) {
        Lazy b;
        C9971q.m14633g(module, "module");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        this.f22862a = notFoundClasses;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C10433c(module));
        this.f22863b = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final AbstractC11313e m13339b(String str, int i) {
        AbstractC11313e eVar;
        List<Integer> d;
        C11142f f = C11142f.m10767f(str);
        C9971q.m14634f(f, "identifier(className)");
        AbstractC11326h e = m13337d().mo636e(f, EnumC13881d.FROM_REFLECTION);
        if (e instanceof AbstractC11313e) {
            eVar = (AbstractC11313e) e;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        C11337k0 k0Var = this.f22862a;
        C11136b bVar = new C11136b(C10434k.f22891r, f);
        d = C9905i.m14825d(Integer.valueOf(i));
        return k0Var.m10197d(bVar, d);
    }

    /* renamed from: d */
    private final AbstractC14411h m13337d() {
        return (AbstractC14411h) this.f22863b.getValue();
    }

    /* renamed from: c */
    public final AbstractC11313e m13338c() {
        return this.f22864c.m13336a(this, f22861l[0]);
    }
}
