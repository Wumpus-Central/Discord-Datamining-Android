package fi;

import gi.AbstractC7664g;
import gi.C7666h;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.EnumC11087p;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p142hi.C8039k;
import p217lg.AbstractC10420h;
import p268og.AbstractC11311d1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

/* renamed from: fi.g */
/* loaded from: classes8.dex */
public abstract class AbstractC7257g extends AbstractC7294m {

    /* renamed from: b */
    private final AbstractC6938i<C7259b> f15718b;

    /* renamed from: c */
    private final boolean f15719c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.g$a */
    /* loaded from: classes8.dex */
    public final class C7258a implements AbstractC7268g1 {

        /* renamed from: a */
        private final AbstractC7664g f15720a;

        /* renamed from: b */
        private final Lazy f15721b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7257g f15722c;

        /* renamed from: fi.g$a$a */
        /* loaded from: classes8.dex */
        static final class C0225a extends AbstractC9973s implements Function0<List<? extends AbstractC7267g0>> {

            /* renamed from: l */
            final /* synthetic */ AbstractC7257g f15724l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0225a(AbstractC7257g gVar) {
                super(0);
                this.f15724l = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC7267g0> invoke() {
                return C7666h.m21691b(C7258a.this.f15720a, this.f15724l.mo4568m());
            }
        }

        public C7258a(AbstractC7257g gVar, AbstractC7664g kotlinTypeRefiner) {
            Lazy b;
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f15722c = gVar;
            this.f15720a = kotlinTypeRefiner;
            b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C0225a(gVar));
            this.f15721b = b;
        }

        /* renamed from: d */
        private final List<AbstractC7267g0> m23072d() {
            return (List) this.f15721b.getValue();
        }

        /* renamed from: e */
        public List<AbstractC7267g0> mo4568m() {
            return m23072d();
        }

        public boolean equals(Object obj) {
            return this.f15722c.equals(obj);
        }

        @Override // fi.AbstractC7268g1
        public List<AbstractC11319f1> getParameters() {
            List<AbstractC11319f1> parameters = this.f15722c.getParameters();
            C9971q.m14634f(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f15722c.hashCode();
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: n */
        public AbstractC10420h mo4567n() {
            AbstractC10420h n = this.f15722c.mo4567n();
            C9971q.m14634f(n, "this@AbstractTypeConstructor.builtIns");
            return n;
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: o */
        public AbstractC7268g1 mo4566o(AbstractC7664g kotlinTypeRefiner) {
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f15722c.mo4566o(kotlinTypeRefiner);
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: p */
        public AbstractC11326h mo4565p() {
            return this.f15722c.mo4565p();
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: q */
        public boolean mo4564q() {
            return this.f15722c.mo4564q();
        }

        public String toString() {
            return this.f15722c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.g$b */
    /* loaded from: classes8.dex */
    public static final class C7259b {

        /* renamed from: a */
        private final Collection<AbstractC7267g0> f15725a;

        /* renamed from: b */
        private List<? extends AbstractC7267g0> f15726b;

        /* JADX WARN: Multi-variable type inference failed */
        public C7259b(Collection<? extends AbstractC7267g0> allSupertypes) {
            List<? extends AbstractC7267g0> d;
            C9971q.m14633g(allSupertypes, "allSupertypes");
            this.f15725a = allSupertypes;
            d = C9905i.m14825d(C8039k.f17408a.m20766l());
            this.f15726b = d;
        }

        /* renamed from: a */
        public final Collection<AbstractC7267g0> m23070a() {
            return this.f15725a;
        }

        /* renamed from: b */
        public final List<AbstractC7267g0> m23069b() {
            return this.f15726b;
        }

        /* renamed from: c */
        public final void m23068c(List<? extends AbstractC7267g0> list) {
            C9971q.m14633g(list, "<set-?>");
            this.f15726b = list;
        }
    }

    /* renamed from: fi.g$c */
    /* loaded from: classes8.dex */
    static final class C7260c extends AbstractC9973s implements Function0<C7259b> {
        C7260c() {
            super(0);
        }

        /* renamed from: a */
        public final C7259b invoke() {
            return new C7259b(AbstractC7257g.this.mo6386h());
        }
    }

    /* renamed from: fi.g$d */
    /* loaded from: classes8.dex */
    static final class C7261d extends AbstractC9973s implements Function1<Boolean, C7259b> {

        /* renamed from: k */
        public static final C7261d f15728k = new C7261d();

        C7261d() {
            super(1);
        }

        /* renamed from: a */
        public final C7259b m23066a(boolean z) {
            List d;
            d = C9905i.m14825d(C8039k.f17408a.m20766l());
            return new C7259b(d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C7259b invoke(Boolean bool) {
            return m23066a(bool.booleanValue());
        }
    }

    /* renamed from: fi.g$e */
    /* loaded from: classes8.dex */
    static final class C7262e extends AbstractC9973s implements Function1<C7259b, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.g$e$a */
        /* loaded from: classes8.dex */
        public static final class C7263a extends AbstractC9973s implements Function1<AbstractC7268g1, Iterable<? extends AbstractC7267g0>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC7257g f15730k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7263a(AbstractC7257g gVar) {
                super(1);
                this.f15730k = gVar;
            }

            /* renamed from: a */
            public final Iterable<AbstractC7267g0> invoke(AbstractC7268g1 it) {
                C9971q.m14633g(it, "it");
                return this.f15730k.m23078g(it, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.g$e$b */
        /* loaded from: classes8.dex */
        public static final class C7264b extends AbstractC9973s implements Function1<AbstractC7267g0, Unit> {

            /* renamed from: k */
            final /* synthetic */ AbstractC7257g f15731k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7264b(AbstractC7257g gVar) {
                super(1);
                this.f15731k = gVar;
            }

            /* renamed from: a */
            public final void m23063a(AbstractC7267g0 it) {
                C9971q.m14633g(it, "it");
                this.f15731k.m23074t(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC7267g0 g0Var) {
                m23063a(g0Var);
                return Unit.f22042a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.g$e$c */
        /* loaded from: classes8.dex */
        public static final class C7265c extends AbstractC9973s implements Function1<AbstractC7268g1, Iterable<? extends AbstractC7267g0>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC7257g f15732k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7265c(AbstractC7257g gVar) {
                super(1);
                this.f15732k = gVar;
            }

            /* renamed from: a */
            public final Iterable<AbstractC7267g0> invoke(AbstractC7268g1 it) {
                C9971q.m14633g(it, "it");
                return this.f15732k.m23078g(it, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.g$e$d */
        /* loaded from: classes8.dex */
        public static final class C7266d extends AbstractC9973s implements Function1<AbstractC7267g0, Unit> {

            /* renamed from: k */
            final /* synthetic */ AbstractC7257g f15733k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7266d(AbstractC7257g gVar) {
                super(1);
                this.f15733k = gVar;
            }

            /* renamed from: a */
            public final void m23061a(AbstractC7267g0 it) {
                C9971q.m14633g(it, "it");
                this.f15733k.mo6382u(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC7267g0 g0Var) {
                m23061a(g0Var);
                return Unit.f22042a;
            }
        }

        C7262e() {
            super(1);
        }

        /* renamed from: a */
        public final void m23065a(C7259b supertypes) {
            C9971q.m14633g(supertypes, "supertypes");
            Collection<AbstractC7267g0> a = AbstractC7257g.this.mo6384l().mo10221a(AbstractC7257g.this, supertypes.m23070a(), new C7265c(AbstractC7257g.this), new C7266d(AbstractC7257g.this));
            List<AbstractC7267g0> list = null;
            if (a.isEmpty()) {
                AbstractC7267g0 i = AbstractC7257g.this.mo6385i();
                if (i != null) {
                    a = C9905i.m14825d(i);
                } else {
                    a = null;
                }
                if (a == null) {
                    a = C9906j.m14820i();
                }
            }
            if (AbstractC7257g.this.m23076k()) {
                AbstractC11311d1 l = AbstractC7257g.this.mo6384l();
                AbstractC7257g gVar = AbstractC7257g.this;
                l.mo10221a(gVar, a, new C7263a(gVar), new C7264b(AbstractC7257g.this));
            }
            AbstractC7257g gVar2 = AbstractC7257g.this;
            if (a instanceof List) {
                list = (List) a;
            }
            if (list == null) {
                list = C9914r.m14790D0(a);
            }
            supertypes.m23068c(gVar2.mo6383s(list));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7259b bVar) {
            m23065a(bVar);
            return Unit.f22042a;
        }
    }

    public AbstractC7257g(AbstractC6944n storageManager) {
        C9971q.m14633g(storageManager, "storageManager");
        this.f15718b = storageManager.mo23895f(new C7260c(), C7261d.f15728k, new C7262e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
        r4 = kotlin.collections.C9914r.m14750o0(r0.f15718b.invoke().m23070a(), r0.mo23077j(r4));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<fi.AbstractC7267g0> m23078g(fi.AbstractC7268g1 r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof fi.AbstractC7257g
            if (r0 == 0) goto L_0x0008
            r0 = r3
            fi.g r0 = (fi.AbstractC7257g) r0
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x0022
            ei.i<fi.g$b> r1 = r0.f15718b
            java.lang.Object r1 = r1.invoke()
            fi.g$b r1 = (fi.AbstractC7257g.C7259b) r1
            java.util.Collection r1 = r1.m23070a()
            java.util.Collection r4 = r0.mo23077j(r4)
            java.util.List r4 = kotlin.collections.C9904h.m14849o0(r1, r4)
            if (r4 == 0) goto L_0x0022
            goto L_0x002b
        L_0x0022:
            java.util.Collection r4 = r3.mo4568m()
            java.lang.String r3 = "supertypes"
            kotlin.jvm.internal.C9971q.m14634f(r4, r3)
        L_0x002b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.AbstractC7257g.m23078g(fi.g1, boolean):java.util.Collection");
    }

    /* renamed from: h */
    protected abstract Collection<AbstractC7267g0> mo6386h();

    /* renamed from: i */
    protected AbstractC7267g0 mo6385i() {
        return null;
    }

    /* renamed from: j */
    protected Collection<AbstractC7267g0> mo23077j(boolean z) {
        List i;
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: k */
    protected boolean m23076k() {
        return this.f15719c;
    }

    /* renamed from: l */
    protected abstract AbstractC11311d1 mo6384l();

    @Override // fi.AbstractC7268g1
    /* renamed from: o */
    public AbstractC7268g1 mo4566o(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C7258a(this, kotlinTypeRefiner);
    }

    /* renamed from: r */
    public List<AbstractC7267g0> mo4568m() {
        return this.f15718b.invoke().m23069b();
    }

    /* renamed from: s */
    protected List<AbstractC7267g0> mo6383s(List<AbstractC7267g0> supertypes) {
        C9971q.m14633g(supertypes, "supertypes");
        return supertypes;
    }

    /* renamed from: t */
    protected void m23074t(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
    }

    /* renamed from: u */
    protected void mo6382u(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
    }
}
