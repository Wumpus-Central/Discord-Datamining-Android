package bh;

import bh.AbstractC3493b;
import gh.AbstractC7633p;
import gh.AbstractC7637r;
import gh.C7636q;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;
import p013ah.C1399g;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6909u;
import p086eh.EnumC6892d0;
import p087ei.AbstractC6937h;
import p087ei.AbstractC6939j;
import p141hh.C8019a;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p249nh.C11144h;
import p268og.AbstractC11313e;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p286pi.C11762d;
import p406wg.AbstractC13878b;
import p427xg.AbstractC14146p;
import p448yh.C14403d;

/* renamed from: bh.i */
/* loaded from: classes8.dex */
public final class C3526i extends AbstractC3554m {

    /* renamed from: n */
    private final AbstractC6909u f5698n;

    /* renamed from: o */
    private final C3521h f5699o;

    /* renamed from: p */
    private final AbstractC6939j<Set<String>> f5700p;

    /* renamed from: q */
    private final AbstractC6937h<C3527a, AbstractC11313e> f5701q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bh.i$a */
    /* loaded from: classes8.dex */
    public static final class C3527a {

        /* renamed from: a */
        private final C11142f f5702a;

        /* renamed from: b */
        private final AbstractC6895g f5703b;

        public C3527a(C11142f name, AbstractC6895g gVar) {
            C9971q.m14633g(name, "name");
            this.f5702a = name;
            this.f5703b = gVar;
        }

        /* renamed from: a */
        public final AbstractC6895g m34181a() {
            return this.f5703b;
        }

        /* renamed from: b */
        public final C11142f m34180b() {
            return this.f5702a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3527a) && C9971q.m14638b(this.f5702a, ((C3527a) obj).f5702a);
        }

        public int hashCode() {
            return this.f5702a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bh.i$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC3528b {

        /* renamed from: bh.i$b$a */
        /* loaded from: classes8.dex */
        public static final class C3529a extends AbstractC3528b {

            /* renamed from: a */
            private final AbstractC11313e f5704a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3529a(AbstractC11313e descriptor) {
                super(null);
                C9971q.m14633g(descriptor, "descriptor");
                this.f5704a = descriptor;
            }

            /* renamed from: a */
            public final AbstractC11313e m34179a() {
                return this.f5704a;
            }
        }

        /* renamed from: bh.i$b$b */
        /* loaded from: classes8.dex */
        public static final class C0089b extends AbstractC3528b {

            /* renamed from: a */
            public static final C0089b f5705a = new C0089b();

            private C0089b() {
                super(null);
            }
        }

        /* renamed from: bh.i$b$c */
        /* loaded from: classes8.dex */
        public static final class C3530c extends AbstractC3528b {

            /* renamed from: a */
            public static final C3530c f5706a = new C3530c();

            private C3530c() {
                super(null);
            }
        }

        private AbstractC3528b() {
        }

        public /* synthetic */ AbstractC3528b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bh.i$c */
    /* loaded from: classes8.dex */
    static final class C3531c extends AbstractC9973s implements Function1<C3527a, AbstractC11313e> {

        /* renamed from: l */
        final /* synthetic */ C1399g f5708l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3531c(C1399g gVar) {
            super(1);
            this.f5708l = gVar;
        }

        /* renamed from: a */
        public final AbstractC11313e invoke(C3527a request) {
            AbstractC7633p.AbstractC7634a aVar;
            AbstractC7637r rVar;
            C11136b bVar;
            EnumC6892d0 d0Var;
            C11137c cVar;
            byte[] bArr;
            C9971q.m14633g(request, "request");
            C11136b bVar2 = new C11136b(C3526i.this.mo34135C().mo6103e(), request.m34180b());
            if (request.m34181a() != null) {
                aVar = this.f5708l.m41174a().m41200j().mo4624c(request.m34181a());
            } else {
                aVar = this.f5708l.m41174a().m41200j().mo4625b(bVar2);
            }
            if (aVar != null) {
                rVar = aVar.m21822a();
            } else {
                rVar = null;
            }
            if (rVar != null) {
                bVar = rVar.mo4628k();
            } else {
                bVar = null;
            }
            if (bVar != null && (bVar.m10806l() || bVar.m10807k())) {
                return null;
            }
            AbstractC3528b R = C3526i.this.m34182R(rVar);
            if (R instanceof AbstractC3528b.C3529a) {
                return ((AbstractC3528b.C3529a) R).m34179a();
            }
            if (R instanceof AbstractC3528b.C3530c) {
                return null;
            }
            if (R instanceof AbstractC3528b.C0089b) {
                AbstractC6895g a = request.m34181a();
                if (a == null) {
                    AbstractC14146p d = this.f5708l.m41174a().m41206d();
                    if (aVar != null) {
                        if (!(aVar instanceof AbstractC7633p.AbstractC7634a.C0241a)) {
                            aVar = null;
                        }
                        AbstractC7633p.AbstractC7634a.C0241a aVar2 = (AbstractC7633p.AbstractC7634a.C0241a) aVar;
                        if (aVar2 != null) {
                            bArr = aVar2.m21821b();
                            a = d.mo1525a(new AbstractC14146p.C14147a(bVar2, bArr, null, 4, null));
                        }
                    }
                    bArr = null;
                    a = d.mo1525a(new AbstractC14146p.C14147a(bVar2, bArr, null, 4, null));
                }
                if (a != null) {
                    d0Var = a.mo4026K();
                } else {
                    d0Var = null;
                }
                if (d0Var != EnumC6892d0.BINARY) {
                    if (a != null) {
                        cVar = a.mo4017e();
                    } else {
                        cVar = null;
                    }
                    if (cVar == null || cVar.m10801d() || !C9971q.m14638b(cVar.m10800e(), C3526i.this.mo34135C().mo6103e())) {
                        return null;
                    }
                    C3502f fVar = new C3502f(this.f5708l, C3526i.this.mo34135C(), a, null, 8, null);
                    this.f5708l.m41174a().m41205e().mo1521a(fVar);
                    return fVar;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + a + "\nClassId: " + bVar2 + "\nfindKotlinClass(JavaClass) = " + C7636q.m21819a(this.f5708l.m41174a().m41200j(), a) + "\nfindKotlinClass(ClassId) = " + C7636q.m21818b(this.f5708l.m41174a().m41200j(), bVar2) + '\n');
            }
            throw new C11088q();
        }
    }

    /* renamed from: bh.i$d */
    /* loaded from: classes8.dex */
    static final class C3532d extends AbstractC9973s implements Function0<Set<? extends String>> {

        /* renamed from: k */
        final /* synthetic */ C1399g f5709k;

        /* renamed from: l */
        final /* synthetic */ C3526i f5710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3532d(C1399g gVar, C3526i iVar) {
            super(0);
            this.f5709k = gVar;
            this.f5710l = iVar;
        }

        /* renamed from: a */
        public final Set<String> invoke() {
            return this.f5709k.m41174a().m41206d().mo1523c(this.f5710l.mo34135C().mo6103e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3526i(C1399g c, AbstractC6909u jPackage, C3521h ownerDescriptor) {
        super(c);
        C9971q.m14633g(c, "c");
        C9971q.m14633g(jPackage, "jPackage");
        C9971q.m14633g(ownerDescriptor, "ownerDescriptor");
        this.f5698n = jPackage;
        this.f5699o = ownerDescriptor;
        this.f5700p = c.m41170e().mo23896e(new C3532d(c, this));
        this.f5701q = c.m41170e().mo23894g(new C3531c(c));
    }

    /* renamed from: N */
    private final AbstractC11313e m34186N(C11142f fVar, AbstractC6895g gVar) {
        if (!C11144h.f24733a.m10762a(fVar)) {
            return null;
        }
        Set<String> invoke = this.f5700p.invoke();
        if (gVar != null || invoke == null || invoke.contains(fVar.m10771b())) {
            return this.f5701q.invoke(new C3527a(fVar, gVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final AbstractC3528b m34182R(AbstractC7637r rVar) {
        if (rVar == null) {
            return AbstractC3528b.C0089b.f5705a;
        }
        if (rVar.mo4630d().m20842c() != C8019a.EnumC0249a.CLASS) {
            return AbstractC3528b.C3530c.f5706a;
        }
        AbstractC11313e k = m34158w().m41174a().m41208b().m21865k(rVar);
        if (k != null) {
            return new AbstractC3528b.C3529a(k);
        }
        return AbstractC3528b.C0089b.f5705a;
    }

    /* renamed from: O */
    public final AbstractC11313e m34185O(AbstractC6895g javaClass) {
        C9971q.m14633g(javaClass, "javaClass");
        return m34186N(javaClass.getName(), javaClass);
    }

    /* renamed from: P */
    public AbstractC11313e mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return m34186N(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public C3521h mo34135C() {
        return this.f5699o;
    }

    @Override // bh.AbstractC3533j, p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        List i;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        i = C9906j.m14820i();
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC] */
    @Override // bh.AbstractC3533j, p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<p268og.AbstractC11346m> mo625f(p448yh.C14403d r5, kotlin.jvm.functions.Function1<? super p249nh.C11142f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C9971q.m14633g(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C9971q.m14633g(r6, r0)
            yh.d$a r0 = p448yh.C14403d.f32585c
            int r1 = r0.m667c()
            int r0 = r0.m665e()
            r0 = r0 | r1
            boolean r5 = r5.m683a(r0)
            if (r5 != 0) goto L_0x0020
            java.util.List r5 = kotlin.collections.C9904h.m14862i()
            goto L_0x0065
        L_0x0020:
            ei.i r5 = r4.m34159v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0033:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r5.next()
            r2 = r1
            og.m r2 = (p268og.AbstractC11346m) r2
            boolean r3 = r2 instanceof p268og.AbstractC11313e
            if (r3 == 0) goto L_0x005d
            og.e r2 = (p268og.AbstractC11313e) r2
            nh.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.C9971q.m14634f(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0033
            r0.add(r1)
            goto L_0x0033
        L_0x0064:
            r5 = r0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C3526i.mo625f(yh.d, kotlin.jvm.functions.Function1):java.util.Collection");
    }

    @Override // bh.AbstractC3533j
    /* renamed from: l */
    protected Set<C11142f> mo34127l(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        C11142f fVar;
        Set<C11142f> d;
        C9971q.m14633g(kindFilter, "kindFilter");
        if (!kindFilter.m683a(C14403d.f32585c.m665e())) {
            d = C9921w.m14722d();
            return d;
        }
        Set<String> invoke = this.f5700p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            for (String str : invoke) {
                hashSet.add(C11142f.m10767f(str));
            }
            return hashSet;
        }
        AbstractC6909u uVar = this.f5698n;
        if (function1 == null) {
            function1 = C11762d.m8672a();
        }
        Collection<AbstractC6895g> F = uVar.mo3974F(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC6895g gVar : F) {
            if (gVar.mo4026K() == EnumC6892d0.SOURCE) {
                fVar = null;
            } else {
                fVar = gVar.getName();
            }
            if (fVar != null) {
                linkedHashSet.add(fVar);
            }
        }
        return linkedHashSet;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: n */
    protected Set<C11142f> mo34126n(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        Set<C11142f> d;
        C9971q.m14633g(kindFilter, "kindFilter");
        d = C9921w.m14722d();
        return d;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: p */
    protected AbstractC3493b mo34124p() {
        return AbstractC3493b.C3494a.f5631a;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: r */
    protected void mo34123r(Collection<AbstractC11404z0> result, C11142f name) {
        C9971q.m14633g(result, "result");
        C9971q.m14633g(name, "name");
    }

    @Override // bh.AbstractC3533j
    /* renamed from: t */
    protected Set<C11142f> mo34122t(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        Set<C11142f> d;
        C9971q.m14633g(kindFilter, "kindFilter");
        d = C9921w.m14722d();
        return d;
    }
}
