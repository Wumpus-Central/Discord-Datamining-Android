package ng;

import bh.C3502f;
import bh.C3509g;
import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.C7281j0;
import fi.C7309p1;
import gh.C7647v;
import gh.C7648w;
import gh.C7651y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import ng.C11112f;
import p070di.C6467d;
import p087ei.AbstractC6915a;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p217lg.AbstractC10420h;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11335j1;
import p268og.AbstractC11343l;
import p268og.AbstractC11346m;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p268og.C11337k0;
import p268og.C11371s;
import p268og.C11373t;
import p268og.C11393x;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p286pi.C11755b;
import p286pi.C11773f;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12127c;
import p304qg.C12130d;
import p324rg.AbstractC12653z;
import p324rg.C12608h;
import p325rh.C12669k;
import p388vh.C13508c;
import p406wg.EnumC13881d;
import p447yg.AbstractC14388g;
import p448yh.AbstractC14411h;
import pg.AbstractC11666c;
import pg.AbstractC11672g;
import pg.C11670f;

/* renamed from: ng.i */
/* loaded from: classes8.dex */
public final class C11121i implements AbstractC12125a, AbstractC12127c {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f24676h = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C11121i.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C11121i.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C11121i.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a */
    private final AbstractC11327h0 f24677a;

    /* renamed from: b */
    private final C11107d f24678b = C11107d.f24646a;

    /* renamed from: c */
    private final AbstractC6938i f24679c;

    /* renamed from: d */
    private final AbstractC7267g0 f24680d;

    /* renamed from: e */
    private final AbstractC6938i f24681e;

    /* renamed from: f */
    private final AbstractC6915a<C11137c, AbstractC11313e> f24682f;

    /* renamed from: g */
    private final AbstractC6938i f24683g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ng.i$a */
    /* loaded from: classes8.dex */
    public enum EnumC11122a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* renamed from: ng.i$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C11123b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24689a;

        static {
            int[] iArr = new int[EnumC11122a.values().length];
            try {
                iArr[EnumC11122a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11122a.NOT_CONSIDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11122a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC11122a.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24689a = iArr;
        }
    }

    /* renamed from: ng.i$c */
    /* loaded from: classes8.dex */
    static final class C11124c extends AbstractC9973s implements Function0<AbstractC7304o0> {

        /* renamed from: l */
        final /* synthetic */ AbstractC6944n f24691l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11124c(AbstractC6944n nVar) {
            super(0);
            this.f24691l = nVar;
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke() {
            return C11393x.m10147c(C11121i.this.m10843u().m10863a(), C11108e.f24647d.m10875a(), new C11337k0(this.f24691l, C11121i.this.m10843u().m10863a())).mo6166p();
        }
    }

    /* renamed from: ng.i$d */
    /* loaded from: classes8.dex */
    public static final class C11125d extends AbstractC12653z {
        C11125d(AbstractC11327h0 h0Var, C11137c cVar) {
            super(h0Var, cVar);
        }

        /* renamed from: G0 */
        public AbstractC14411h.C14413b mo6298o() {
            return AbstractC14411h.C14413b.f32626b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ng.i$e */
    /* loaded from: classes8.dex */
    public static final class C11126e extends AbstractC9973s implements Function0<AbstractC7267g0> {
        C11126e() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke() {
            AbstractC7304o0 i = C11121i.this.f24677a.mo6136n().m13387i();
            C9971q.m14634f(i, "moduleDescriptor.builtIns.anyType");
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ng.i$f */
    /* loaded from: classes8.dex */
    public static final class C11127f extends AbstractC9973s implements Function0<AbstractC11313e> {

        /* renamed from: k */
        final /* synthetic */ C3502f f24693k;

        /* renamed from: l */
        final /* synthetic */ AbstractC11313e f24694l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11127f(C3502f fVar, AbstractC11313e eVar) {
            super(0);
            this.f24693k = fVar;
            this.f24694l = eVar;
        }

        /* renamed from: a */
        public final AbstractC11313e invoke() {
            C3502f fVar = this.f24693k;
            AbstractC14388g EMPTY = AbstractC14388g.f32565a;
            C9971q.m14634f(EMPTY, "EMPTY");
            return fVar.m34268N0(EMPTY, this.f24694l);
        }
    }

    /* renamed from: ng.i$g */
    /* loaded from: classes8.dex */
    static final class C11128g extends AbstractC9973s implements Function1<AbstractC14411h, Collection<? extends AbstractC11404z0>> {

        /* renamed from: k */
        final /* synthetic */ C11142f f24695k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11128g(C11142f fVar) {
            super(1);
            this.f24695k = fVar;
        }

        /* renamed from: a */
        public final Collection<AbstractC11404z0> invoke(AbstractC14411h it) {
            C9971q.m14633g(it, "it");
            return it.mo626d(this.f24695k, EnumC13881d.FROM_BUILTINS);
        }
    }

    /* renamed from: ng.i$h */
    /* loaded from: classes8.dex */
    public static final class C11129h extends C11755b.AbstractC0376b<AbstractC11313e, EnumC11122a> {

        /* renamed from: a */
        final /* synthetic */ String f24696a;

        /* renamed from: b */
        final /* synthetic */ Ref$ObjectRef<EnumC11122a> f24697b;

        C11129h(String str, Ref$ObjectRef<EnumC11122a> ref$ObjectRef) {
            this.f24696a = str;
            this.f24697b = ref$ObjectRef;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, ng.i$a] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, ng.i$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, ng.i$a] */
        /* renamed from: d */
        public boolean mo3515c(AbstractC11313e javaClassDescriptor) {
            C9971q.m14633g(javaClassDescriptor, "javaClassDescriptor");
            String a = C7647v.m21806a(C7651y.f16655a, javaClassDescriptor, this.f24696a);
            C11133k kVar = C11133k.f24701a;
            if (kVar.m10824e().contains(a)) {
                this.f24697b.f22069k = EnumC11122a.HIDDEN;
            } else if (kVar.m10821h().contains(a)) {
                this.f24697b.f22069k = EnumC11122a.VISIBLE;
            } else if (kVar.m10826c().contains(a)) {
                this.f24697b.f22069k = EnumC11122a.DROP;
            }
            if (this.f24697b.f22069k == null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public EnumC11122a mo3517a() {
            EnumC11122a aVar = this.f24697b.f22069k;
            return aVar == null ? EnumC11122a.NOT_CONSIDERED : aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ng.i$i */
    /* loaded from: classes8.dex */
    public static final class C0354i extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {
        C0354i() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b bVar) {
            boolean z;
            if (bVar.mo6245g() == AbstractC11301b.EnumC11302a.DECLARATION) {
                C11107d dVar = C11121i.this.f24678b;
                AbstractC11346m b = bVar.mo6104b();
                C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (dVar.m10887c((AbstractC11313e) b)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ng.i$j */
    /* loaded from: classes8.dex */
    static final class C11130j extends AbstractC9973s implements Function0<AbstractC11672g> {
        C11130j() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC11672g invoke() {
            List<? extends AbstractC11666c> d;
            AbstractC11666c b = C11670f.m9051b(C11121i.this.f24677a.mo6136n(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null);
            AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
            d = C9905i.m14825d(b);
            return aVar.m9049a(d);
        }
    }

    public C11121i(AbstractC11327h0 moduleDescriptor, AbstractC6944n storageManager, Function0<C11112f.C11114b> settingsComputation) {
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(settingsComputation, "settingsComputation");
        this.f24677a = moduleDescriptor;
        this.f24679c = storageManager.mo23898c(settingsComputation);
        this.f24680d = m10852l(storageManager);
        this.f24681e = storageManager.mo23898c(new C11124c(storageManager));
        this.f24682f = storageManager.mo23900a();
        this.f24683g = storageManager.mo23898c(new C11130j());
    }

    /* renamed from: k */
    private final AbstractC11404z0 m10853k(C6467d dVar, AbstractC11404z0 z0Var) {
        AbstractC11397y.AbstractC11398a<? extends AbstractC11404z0> u = z0Var.mo6238u();
        u.mo6194s(dVar);
        u.mo6203j(C11373t.f25299e);
        u.mo6199n(dVar.mo6166p());
        u.mo6198o(dVar.mo6174J0());
        AbstractC11397y build = u.build();
        C9971q.m14636d(build);
        return (AbstractC11404z0) build;
    }

    /* renamed from: l */
    private final AbstractC7267g0 m10852l(AbstractC6944n nVar) {
        List d;
        Set<AbstractC11309d> d2;
        C11125d dVar = new C11125d(this.f24677a, new C11137c("java.io"));
        d = C9905i.m14825d(new C7281j0(nVar, new C11126e()));
        C12608h hVar = new C12608h(dVar, C11142f.m10767f("Serializable"), EnumC11314e0.ABSTRACT, EnumC11317f.INTERFACE, d, AbstractC11299a1.f25230a, false, nVar);
        AbstractC14411h.C14413b bVar = AbstractC14411h.C14413b.f32626b;
        d2 = C9921w.m14722d();
        hVar.m6359K0(bVar, d2, null);
        AbstractC7304o0 p = hVar.mo6166p();
        C9971q.m14634f(p, "mockSerializableClass.defaultType");
        return p;
    }

    /* renamed from: m */
    private final Collection<AbstractC11404z0> m10851m(AbstractC11313e eVar, Function1<? super AbstractC14411h, ? extends Collection<? extends AbstractC11404z0>> function1) {
        Object h0;
        int t;
        boolean z;
        List i;
        List i2;
        C3502f q = m10847q(eVar);
        if (q == null) {
            i2 = C9906j.m14820i();
            return i2;
        }
        Collection<AbstractC11313e> g = this.f24678b.m10883g(C13508c.m3529l(q), C11103b.f24624h.m10910a());
        h0 = C9914r.m14757h0(g);
        AbstractC11313e eVar2 = (AbstractC11313e) h0;
        if (eVar2 == null) {
            i = C9906j.m14820i();
            return i;
        }
        C11773f.C11775b bVar = C11773f.f26275m;
        t = C9907k.m14809t(g, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11313e eVar3 : g) {
            arrayList.add(C13508c.m3529l(eVar3));
        }
        C11773f b = bVar.m8653b(arrayList);
        boolean c = this.f24678b.m10887c(eVar);
        AbstractC14411h U = this.f24682f.mo23928a(C13508c.m3529l(q), new C11127f(q, eVar2)).mo6169U();
        C9971q.m14634f(U, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (Iterable) function1.invoke(U)) {
            AbstractC11404z0 z0Var = (AbstractC11404z0) obj;
            boolean z2 = false;
            if (z0Var.mo6245g() == AbstractC11301b.EnumC11302a.DECLARATION && z0Var.getVisibility().m10151d() && !AbstractC10420h.m13384j0(z0Var)) {
                Collection<? extends AbstractC11397y> d = z0Var.mo6249d();
                C9971q.m14634f(d, "analogueMember.overriddenDescriptors");
                if (!(d instanceof Collection) || !d.isEmpty()) {
                    for (AbstractC11397y yVar : d) {
                        AbstractC11346m b2 = yVar.mo6104b();
                        C9971q.m14634f(b2, "it.containingDeclaration");
                        if (b.contains(C13508c.m3529l(b2))) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z && !m10842v(z0Var, c)) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: n */
    private final AbstractC7304o0 m10850n() {
        return (AbstractC7304o0) C6943m.m23902a(this.f24681e, this, f24676h[1]);
    }

    /* renamed from: o */
    private static final boolean m10849o(AbstractC11343l lVar, C7309p1 p1Var, AbstractC11343l lVar2) {
        if (C12669k.m5982x(lVar, lVar2.mo6167c(p1Var)) == C12669k.C12678i.EnumC12679a.OVERRIDABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final C3502f m10847q(AbstractC11313e eVar) {
        C11136b n;
        C11137c b;
        if (AbstractC10420h.m13401a0(eVar) || !AbstractC10420h.m13430A0(eVar)) {
            return null;
        }
        C11138d m = C13508c.m3528m(eVar);
        if (!m.m10788f() || (n = C11105c.f24626a.m10896n(m)) == null || (b = n.m10816b()) == null) {
            return null;
        }
        AbstractC11313e c = C11371s.m10179c(m10843u().m10863a(), b, EnumC13881d.FROM_BUILTINS);
        if (c instanceof C3502f) {
            return (C3502f) c;
        }
        return null;
    }

    /* renamed from: r */
    private final EnumC11122a m10846r(AbstractC11397y yVar) {
        List d;
        AbstractC11346m b = yVar.mo6104b();
        C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c = C7648w.m21803c(yVar, false, false, 3, null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        d = C9905i.m14825d((AbstractC11313e) b);
        Object b2 = C11755b.m8681b(d, new C11120h(this), new C11129h(c, ref$ObjectRef));
        C9971q.m14634f(b2, "jvmDescriptor = computeJ…CONSIDERED\n            })");
        return (EnumC11122a) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final Iterable m10845s(C11121i this$0, AbstractC11313e eVar) {
        AbstractC11326h hVar;
        AbstractC11313e eVar2;
        C9971q.m14633g(this$0, "this$0");
        Collection<AbstractC7267g0> m = eVar.mo6111k().mo4568m();
        C9971q.m14634f(m, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (AbstractC7267g0 g0Var : m) {
            AbstractC11326h p = g0Var.mo5172N0().mo4565p();
            C3502f fVar = null;
            if (p != null) {
                hVar = p.mo6162a();
            } else {
                hVar = null;
            }
            if (hVar instanceof AbstractC11313e) {
                eVar2 = (AbstractC11313e) hVar;
            } else {
                eVar2 = null;
            }
            if (eVar2 != null) {
                fVar = this$0.m10847q(eVar2);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private final AbstractC11672g m10844t() {
        return (AbstractC11672g) C6943m.m23902a(this.f24683g, this, f24676h[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final C11112f.C11114b m10843u() {
        return (C11112f.C11114b) C6943m.m23902a(this.f24679c, this, f24676h[0]);
    }

    /* renamed from: v */
    private final boolean m10842v(AbstractC11404z0 z0Var, boolean z) {
        List d;
        AbstractC11346m b = z0Var.mo6104b();
        C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c = C7648w.m21803c(z0Var, false, false, 3, null);
        if (z ^ C11133k.f24701a.m10823f().contains(C7647v.m21806a(C7651y.f16655a, (AbstractC11313e) b, c))) {
            return true;
        }
        d = C9905i.m14825d(z0Var);
        Boolean e = C11755b.m8678e(d, C11119g.f24674a, new C0354i());
        C9971q.m14634f(e, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final Iterable m10841w(AbstractC11301b bVar) {
        return bVar.mo6162a().mo6249d();
    }

    /* renamed from: x */
    private final boolean m10840x(AbstractC11343l lVar, AbstractC11313e eVar) {
        Object r0;
        C11138d dVar;
        if (lVar.mo6242i().size() == 1) {
            List<AbstractC11335j1> valueParameters = lVar.mo6242i();
            C9971q.m14634f(valueParameters, "valueParameters");
            r0 = C9914r.m14747r0(valueParameters);
            AbstractC11326h p = ((AbstractC11335j1) r0).getType().mo5172N0().mo4565p();
            if (p != null) {
                dVar = C13508c.m3528m(p);
            } else {
                dVar = null;
            }
            if (C9971q.m14638b(dVar, C13508c.m3528m(eVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // p304qg.AbstractC12125a
    /* renamed from: b */
    public Collection<AbstractC7267g0> mo7772b(AbstractC11313e classDescriptor) {
        List i;
        List d;
        List l;
        C9971q.m14633g(classDescriptor, "classDescriptor");
        C11138d m = C13508c.m3528m(classDescriptor);
        C11133k kVar = C11133k.f24701a;
        if (kVar.m10820i(m)) {
            AbstractC7304o0 cloneableType = m10850n();
            C9971q.m14634f(cloneableType, "cloneableType");
            l = C9906j.m14817l(cloneableType, this.f24680d);
            return l;
        } else if (kVar.m10819j(m)) {
            d = C9905i.m14825d(this.f24680d);
            return d;
        } else {
            i = C9906j.m14820i();
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
        if (r2 != 3) goto L_0x0111;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[SYNTHETIC] */
    @Override // p304qg.AbstractC12125a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<p268og.AbstractC11404z0> mo7771c(p249nh.C11142f r7, p268og.AbstractC11313e r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.C11121i.mo7771c(nh.f, og.e):java.util.Collection");
    }

    @Override // p304qg.AbstractC12127c
    /* renamed from: d */
    public boolean mo7766d(AbstractC11313e classDescriptor, AbstractC11404z0 functionDescriptor) {
        C9971q.m14633g(classDescriptor, "classDescriptor");
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        C3502f q = m10847q(classDescriptor);
        if (q == null || !functionDescriptor.getAnnotations().mo9037l(C12130d.m7765a())) {
            return true;
        }
        if (!m10843u().m10862b()) {
            return false;
        }
        String c = C7648w.m21803c(functionDescriptor, false, false, 3, null);
        C3509g S0 = q.mo6169U();
        C11142f name = functionDescriptor.getName();
        C9971q.m14634f(name, "functionDescriptor.name");
        Collection<AbstractC11404z0> d = S0.mo626d(name, EnumC13881d.FROM_BUILTINS);
        if (!(d instanceof Collection) || !d.isEmpty()) {
            for (AbstractC11404z0 z0Var : d) {
                if (C9971q.m14638b(C7648w.m21803c(z0Var, false, false, 3, null), c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p304qg.AbstractC12125a
    /* renamed from: e */
    public Collection<AbstractC11309d> mo7770e(AbstractC11313e classDescriptor) {
        List i;
        int t;
        boolean z;
        List i2;
        List i3;
        C9971q.m14633g(classDescriptor, "classDescriptor");
        if (classDescriptor.mo6116g() != EnumC11317f.CLASS || !m10843u().m10862b()) {
            i = C9906j.m14820i();
            return i;
        }
        C3502f q = m10847q(classDescriptor);
        if (q == null) {
            i3 = C9906j.m14820i();
            return i3;
        }
        AbstractC11313e f = C11107d.m10884f(this.f24678b, C13508c.m3529l(q), C11103b.f24624h.m10910a(), null, 4, null);
        if (f == null) {
            i2 = C9906j.m14820i();
            return i2;
        }
        C7309p1 c = C11134l.m10818a(f, q).m23003c();
        List<AbstractC11309d> O0 = q.mo6110l();
        ArrayList<AbstractC11309d> arrayList = new ArrayList();
        Iterator<T> it = O0.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AbstractC11309d dVar = (AbstractC11309d) next;
            if (dVar.getVisibility().m10151d()) {
                Collection<AbstractC11309d> l = f.mo6110l();
                C9971q.m14634f(l, "defaultKotlinVersion.constructors");
                if (!(l instanceof Collection) || !l.isEmpty()) {
                    for (AbstractC11309d it2 : l) {
                        C9971q.m14634f(it2, "it");
                        if (m10849o(it2, c, dVar)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z && !m10840x(dVar, classDescriptor) && !AbstractC10420h.m13384j0(dVar) && !C11133k.f24701a.m10825d().contains(C7647v.m21806a(C7651y.f16655a, q, C7648w.m21803c(dVar, false, false, 3, null)))) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        t = C9907k.m14809t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t);
        for (AbstractC11309d dVar2 : arrayList) {
            AbstractC11397y.AbstractC11398a<? extends AbstractC11397y> u = dVar2.mo6238u();
            u.mo6194s(classDescriptor);
            u.mo6199n(classDescriptor.mo6166p());
            u.mo6202k();
            u.mo6206g(c.m22976j());
            if (!C11133k.f24701a.m10822g().contains(C7647v.m21806a(C7651y.f16655a, q, C7648w.m21803c(dVar2, false, false, 3, null)))) {
                u.mo6197p(m10844t());
            }
            AbstractC11397y build = u.build();
            C9971q.m14635e(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((AbstractC11309d) build);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public Set<C11142f> mo7773a(AbstractC11313e classDescriptor) {
        Set<C11142f> d;
        C3509g S0;
        Set<C11142f> b;
        Set<C11142f> d2;
        C9971q.m14633g(classDescriptor, "classDescriptor");
        if (!m10843u().m10862b()) {
            d2 = C9921w.m14722d();
            return d2;
        }
        C3502f q = m10847q(classDescriptor);
        if (q != null && (S0 = q.mo6169U()) != null && (b = S0.mo638b()) != null) {
            return b;
        }
        d = C9921w.m14722d();
        return d;
    }
}
