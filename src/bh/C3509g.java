package bh;

import bh.AbstractC3533j;
import bi.AbstractC3596r;
import ch.C4005a;
import ch.C4006b;
import eg.C6884j;
import fi.AbstractC7267g0;
import fi.C7322s1;
import fi.EnumC7319r1;
import gh.C7648w;
import gi.AbstractC7659e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.collections.C9922x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KDeclarationContainer;
import p013ah.C1389a;
import p013ah.C1396e;
import p013ah.C1399g;
import p086eh.AbstractC6894f;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6899k;
import p086eh.AbstractC6902n;
import p086eh.AbstractC6905q;
import p086eh.AbstractC6906r;
import p086eh.AbstractC6911w;
import p086eh.AbstractC6912x;
import p086eh.AbstractC6913y;
import p087ei.AbstractC6937h;
import p087ei.AbstractC6938i;
import p108fh.C7207l;
import p217lg.AbstractC10420h;
import p249nh.C11136b;
import p249nh.C11142f;
import p267of.C11288u;
import p268og.AbstractC11297a;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11335j1;
import p268og.AbstractC11343l;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p286pi.C11754a;
import p286pi.C11773f;
import p324rg.C12597d0;
import p324rg.C12603e0;
import p324rg.C12604f;
import p324rg.C12619l0;
import p324rg.C12625n;
import p325rh.C12659d;
import p325rh.C12661e;
import p325rh.C12669k;
import p388vh.C13508c;
import p406wg.AbstractC13878b;
import p406wg.EnumC13881d;
import p427xg.AbstractC14146p;
import p427xg.C14106a0;
import p427xg.C14108b0;
import p427xg.C14114e;
import p427xg.C14118f;
import p427xg.C14126h0;
import p427xg.C14130i;
import p427xg.C14132i0;
import p427xg.C14138j0;
import p427xg.C14151s;
import p427xg.C14155t;
import p447yg.AbstractC14394j;
import p447yg.C14378a;
import p448yh.C14403d;
import p467zg.C14647b;
import p467zg.C14649d;
import p467zg.C14650e;
import p467zg.C14654f;
import p467zg.C14656h;
import pg.AbstractC11672g;
import vg.C13505a;

/* renamed from: bh.g */
/* loaded from: classes8.dex */
public final class C3509g extends AbstractC3533j {

    /* renamed from: n */
    private final AbstractC11313e f5664n;

    /* renamed from: o */
    private final AbstractC6895g f5665o;

    /* renamed from: p */
    private final boolean f5666p;

    /* renamed from: q */
    private final AbstractC6938i<List<AbstractC11309d>> f5667q;

    /* renamed from: r */
    private final AbstractC6938i<Set<C11142f>> f5668r;

    /* renamed from: s */
    private final AbstractC6938i<Set<C11142f>> f5669s;

    /* renamed from: t */
    private final AbstractC6938i<Map<C11142f, AbstractC6902n>> f5670t;

    /* renamed from: u */
    private final AbstractC6937h<C11142f, AbstractC11313e> f5671u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bh.g$a */
    /* loaded from: classes8.dex */
    public static final class C3510a extends AbstractC9973s implements Function1<AbstractC6905q, Boolean> {

        /* renamed from: k */
        public static final C3510a f5672k = new C3510a();

        C3510a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC6905q it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(!it.mo3980f());
        }
    }

    /* renamed from: bh.g$b */
    /* loaded from: classes8.dex */
    /* synthetic */ class C3511b extends C9965m implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {
        C3511b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C3509g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        /* renamed from: i */
        public final Collection<AbstractC11404z0> invoke(C11142f p0) {
            C9971q.m14633g(p0, "p0");
            return ((C3509g) this.receiver).m34249J0(p0);
        }
    }

    /* renamed from: bh.g$c */
    /* loaded from: classes8.dex */
    /* synthetic */ class C3512c extends C9965m implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {
        C3512c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C3509g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        /* renamed from: i */
        public final Collection<AbstractC11404z0> invoke(C11142f p0) {
            C9971q.m14633g(p0, "p0");
            return ((C3509g) this.receiver).m34248K0(p0);
        }
    }

    /* renamed from: bh.g$d */
    /* loaded from: classes8.dex */
    static final class C3513d extends AbstractC9973s implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {
        C3513d() {
            super(1);
        }

        /* renamed from: a */
        public final Collection<AbstractC11404z0> invoke(C11142f it) {
            C9971q.m14633g(it, "it");
            return C3509g.this.m34249J0(it);
        }
    }

    /* renamed from: bh.g$e */
    /* loaded from: classes8.dex */
    static final class C3514e extends AbstractC9973s implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {
        C3514e() {
            super(1);
        }

        /* renamed from: a */
        public final Collection<AbstractC11404z0> invoke(C11142f it) {
            C9971q.m14633g(it, "it");
            return C3509g.this.m34248K0(it);
        }
    }

    /* renamed from: bh.g$f */
    /* loaded from: classes8.dex */
    static final class C3515f extends AbstractC9973s implements Function0<List<? extends AbstractC11309d>> {

        /* renamed from: l */
        final /* synthetic */ C1399g f5676l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3515f(C1399g gVar) {
            super(0);
            this.f5676l = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC11309d> invoke() {
            List<? extends AbstractC11309d> D0;
            Collection m;
            Collection<AbstractC6899k> l = C3509g.this.f5665o.mo4016l();
            ArrayList<AbstractC11309d> arrayList = new ArrayList(l.size());
            for (AbstractC6899k kVar : l) {
                arrayList.add(C3509g.this.m34251H0(kVar));
            }
            if (C3509g.this.f5665o.mo4011r()) {
                AbstractC11309d f0 = C3509g.this.m34227f0();
                boolean z = false;
                String c = C7648w.m21803c(f0, false, false, 2, null);
                z = true;
                if (!arrayList.isEmpty()) {
                    for (AbstractC11309d dVar : arrayList) {
                        if (C9971q.m14638b(C7648w.m21803c(dVar, false, false, 2, null), c)) {
                            break;
                        }
                    }
                }
                if (z) {
                    arrayList.add(f0);
                    this.f5676l.m41174a().m41202h().mo704d(C3509g.this.f5665o, f0);
                }
            }
            C1399g gVar = this.f5676l;
            gVar.m41174a().m41187w().mo2382g(gVar, C3509g.this.mo34135C(), arrayList);
            C7207l r = this.f5676l.m41174a().m41192r();
            C1399g gVar2 = this.f5676l;
            C3509g gVar3 = C3509g.this;
            boolean isEmpty = arrayList.isEmpty();
            Collection collection = arrayList;
            if (isEmpty) {
                m = C9906j.m14816m(gVar3.m34228e0());
                collection = m;
            }
            D0 = C9914r.m14790D0(r.m23231g(gVar2, collection == 1 ? 1 : 0));
            return D0;
        }
    }

    /* renamed from: bh.g$g */
    /* loaded from: classes8.dex */
    static final class C0088g extends AbstractC9973s implements Function0<Map<C11142f, ? extends AbstractC6902n>> {
        C0088g() {
            super(0);
        }

        /* renamed from: a */
        public final Map<C11142f, AbstractC6902n> invoke() {
            int t;
            int d;
            int c;
            Collection<AbstractC6902n> x = C3509g.this.f5665o.mo4008x();
            ArrayList arrayList = new ArrayList();
            for (Object obj : x) {
                if (((AbstractC6902n) obj).mo3988I()) {
                    arrayList.add(obj);
                }
            }
            t = C9907k.m14809t(arrayList, 10);
            d = C11288u.m10255d(t);
            c = C6884j.m23961c(d, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(c);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((AbstractC6902n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: bh.g$h */
    /* loaded from: classes8.dex */
    static final class C3516h extends AbstractC9973s implements Function0<Set<? extends C11142f>> {

        /* renamed from: k */
        final /* synthetic */ C1399g f5678k;

        /* renamed from: l */
        final /* synthetic */ C3509g f5679l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3516h(C1399g gVar, C3509g gVar2) {
            super(0);
            this.f5678k = gVar;
            this.f5679l = gVar2;
        }

        /* renamed from: a */
        public final Set<C11142f> invoke() {
            Set<C11142f> H0;
            C1399g gVar = this.f5678k;
            H0 = C9914r.m14786H0(gVar.m41174a().m41187w().mo2388a(gVar, this.f5679l.mo34135C()));
            return H0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bh.g$i */
    /* loaded from: classes8.dex */
    public static final class C3517i extends AbstractC9973s implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11404z0 f5680k;

        /* renamed from: l */
        final /* synthetic */ C3509g f5681l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3517i(AbstractC11404z0 z0Var, C3509g gVar) {
            super(1);
            this.f5680k = z0Var;
            this.f5681l = gVar;
        }

        /* renamed from: a */
        public final Collection<AbstractC11404z0> invoke(C11142f accessorName) {
            List o0;
            List d;
            C9971q.m14633g(accessorName, "accessorName");
            if (C9971q.m14638b(this.f5680k.getName(), accessorName)) {
                d = C9905i.m14825d(this.f5680k);
                return d;
            }
            o0 = C9914r.m14750o0(this.f5681l.m34249J0(accessorName), this.f5681l.m34248K0(accessorName));
            return o0;
        }
    }

    /* renamed from: bh.g$j */
    /* loaded from: classes8.dex */
    static final class C3518j extends AbstractC9973s implements Function0<Set<? extends C11142f>> {
        C3518j() {
            super(0);
        }

        /* renamed from: a */
        public final Set<C11142f> invoke() {
            Set<C11142f> H0;
            H0 = C9914r.m14786H0(C3509g.this.f5665o.mo4030A());
            return H0;
        }
    }

    /* renamed from: bh.g$k */
    /* loaded from: classes8.dex */
    static final class C3519k extends AbstractC9973s implements Function1<C11142f, AbstractC11313e> {

        /* renamed from: l */
        final /* synthetic */ C1399g f5684l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bh.g$k$a */
        /* loaded from: classes8.dex */
        public static final class C3520a extends AbstractC9973s implements Function0<Set<? extends C11142f>> {

            /* renamed from: k */
            final /* synthetic */ C3509g f5685k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3520a(C3509g gVar) {
                super(0);
                this.f5685k = gVar;
            }

            /* renamed from: a */
            public final Set<C11142f> invoke() {
                Set<C11142f> l;
                l = C9922x.m14714l(this.f5685k.mo638b(), this.f5685k.mo637c());
                return l;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3519k(C1399g gVar) {
            super(1);
            this.f5684l = gVar;
        }

        /* renamed from: a */
        public final AbstractC11313e invoke(C11142f name) {
            List<AbstractC11313e> c;
            List a;
            Object r0;
            C9971q.m14633g(name, "name");
            if (((Set) C3509g.this.f5668r.invoke()).contains(name)) {
                AbstractC14146p d = this.f5684l.m41174a().m41206d();
                C11136b k = C13508c.m3530k(C3509g.this.mo34135C());
                C9971q.m14636d(k);
                C11136b d2 = k.m10814d(name);
                C9971q.m14634f(d2, "ownerDescriptor.classId!…createNestedClassId(name)");
                AbstractC6895g a2 = d.mo1525a(new AbstractC14146p.C14147a(d2, null, C3509g.this.f5665o, 2, null));
                if (a2 == null) {
                    return null;
                }
                C1399g gVar = this.f5684l;
                C3502f fVar = new C3502f(gVar, C3509g.this.mo34135C(), a2, null, 8, null);
                gVar.m41174a().m41205e().mo1521a(fVar);
                return fVar;
            } else if (((Set) C3509g.this.f5669s.invoke()).contains(name)) {
                C1399g gVar2 = this.f5684l;
                C3509g gVar3 = C3509g.this;
                c = C9905i.m14826c();
                gVar2.m41174a().m41187w().mo2386c(gVar2, gVar3.mo34135C(), name, c);
                a = C9905i.m14828a(c);
                int size = a.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    r0 = C9914r.m14747r0(a);
                    return (AbstractC11313e) r0;
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + a).toString());
            } else {
                AbstractC6902n nVar = (AbstractC6902n) ((Map) C3509g.this.f5670t.invoke()).get(name);
                if (nVar == null) {
                    return null;
                }
                return C12625n.m6293L0(this.f5684l.m41170e(), C3509g.this.mo34135C(), name, this.f5684l.m41170e().mo23898c(new C3520a(C3509g.this)), C1396e.m41179a(this.f5684l, nVar), this.f5684l.m41174a().m41190t().mo4613a(nVar));
            }
        }
    }

    public /* synthetic */ C3509g(C1399g gVar, AbstractC11313e eVar, AbstractC6895g gVar2, boolean z, C3509g gVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, eVar, gVar2, z, (i & 16) != 0 ? null : gVar3);
    }

    /* renamed from: A0 */
    private final Set<AbstractC11388u0> m34258A0(C11142f fVar) {
        Set<AbstractC11388u0> H0;
        int t;
        Collection<AbstractC7267g0> c0 = m34230c0();
        ArrayList arrayList = new ArrayList();
        for (AbstractC7267g0 g0Var : c0) {
            Collection<? extends AbstractC11388u0> a = g0Var.mo5161o().mo627a(fVar, EnumC13881d.WHEN_GET_SUPER_MEMBERS);
            t = C9907k.m14809t(a, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (AbstractC11388u0 u0Var : a) {
                arrayList2.add(u0Var);
            }
            C9911o.m14801y(arrayList, arrayList2);
        }
        H0 = C9914r.m14786H0(arrayList);
        return H0;
    }

    /* renamed from: B0 */
    private final boolean m34257B0(AbstractC11404z0 z0Var, AbstractC11397y yVar) {
        String c = C7648w.m21803c(z0Var, false, false, 2, null);
        AbstractC11397y a = yVar.mo6162a();
        C9971q.m14634f(a, "builtinWithErasedParameters.original");
        if (!C9971q.m14638b(c, C7648w.m21803c(a, false, false, 2, null)) || m34217p0(z0Var, yVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (p427xg.C14106a0.m1647d(r4) == false) goto L_0x006f;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[SYNTHETIC] */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m34256C0(p268og.AbstractC11404z0 r7) {
        /*
            r6 = this;
            nh.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            java.util.List r0 = p427xg.C14121f0.m1598a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001b
        L_0x0019:
            r0 = r3
            goto L_0x0078
        L_0x001b:
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            nh.f r1 = (p249nh.C11142f) r1
            java.util.Set r1 = r6.m34258A0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x003b
        L_0x0039:
            r1 = r3
            goto L_0x0075
        L_0x003b:
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r1.next()
            og.u0 r4 = (p268og.AbstractC11388u0) r4
            bh.g$i r5 = new bh.g$i
            r5.<init>(r7, r6)
            boolean r5 = r6.m34218o0(r4, r5)
            if (r5 == 0) goto L_0x0071
            boolean r4 = r4.mo6277L()
            if (r4 != 0) goto L_0x006f
            nh.f r4 = r7.getName()
            java.lang.String r4 = r4.m10771b()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.C9971q.m14634f(r4, r5)
            boolean r4 = p427xg.C14106a0.m1647d(r4)
            if (r4 != 0) goto L_0x0071
        L_0x006f:
            r4 = r2
            goto L_0x0072
        L_0x0071:
            r4 = r3
        L_0x0072:
            if (r4 == 0) goto L_0x003f
            r1 = r2
        L_0x0075:
            if (r1 == 0) goto L_0x001f
            r0 = r2
        L_0x0078:
            if (r0 == 0) goto L_0x007b
            return r3
        L_0x007b:
            boolean r0 = r6.m34216q0(r7)
            if (r0 != 0) goto L_0x008e
            boolean r0 = r6.m34247L0(r7)
            if (r0 != 0) goto L_0x008e
            boolean r7 = r6.m34214s0(r7)
            if (r7 != 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r2 = r3
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C3509g.m34256C0(og.z0):boolean");
    }

    /* renamed from: D0 */
    private final AbstractC11404z0 m34255D0(AbstractC11404z0 z0Var, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1, Collection<? extends AbstractC11404z0> collection) {
        AbstractC11404z0 h0;
        AbstractC11397y k = C14118f.m1603k(z0Var);
        if (k == null || (h0 = m34225h0(k, function1)) == null) {
            return null;
        }
        if (!m34256C0(h0)) {
            h0 = null;
        }
        if (h0 != null) {
            return m34226g0(h0, k, collection);
        }
        return null;
    }

    /* renamed from: E0 */
    private final AbstractC11404z0 m34254E0(AbstractC11404z0 z0Var, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1, C11142f fVar, Collection<? extends AbstractC11404z0> collection) {
        AbstractC11404z0 z0Var2 = (AbstractC11404z0) C14126h0.m1577d(z0Var);
        if (z0Var2 == null) {
            return null;
        }
        String b = C14126h0.m1579b(z0Var2);
        C9971q.m14636d(b);
        C11142f f = C11142f.m10767f(b);
        C9971q.m14634f(f, "identifier(nameInJava)");
        for (AbstractC11404z0 z0Var3 : (Collection) function1.invoke(f)) {
            AbstractC11404z0 m0 = m34220m0(z0Var3, fVar);
            if (m34215r0(z0Var2, m0)) {
                return m34226g0(m0, z0Var2, collection);
            }
        }
        return null;
    }

    /* renamed from: F0 */
    private final AbstractC11404z0 m34253F0(AbstractC11404z0 z0Var, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        if (!z0Var.isSuspend()) {
            return null;
        }
        C11142f name = z0Var.getName();
        C9971q.m14634f(name, "descriptor.name");
        for (AbstractC11404z0 z0Var2 : (Iterable) function1.invoke(name)) {
            AbstractC11404z0 n0 = m34219n0(z0Var2);
            if (n0 == null || !m34217p0(n0, z0Var)) {
                n0 = null;
                continue;
            }
            if (n0 != null) {
                return n0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public final C14647b m34251H0(AbstractC6899k kVar) {
        int t;
        List<AbstractC11319f1> o0;
        AbstractC11313e z0 = mo34135C();
        C14647b t1 = C14647b.m75t1(z0, C1396e.m41179a(m34158w(), kVar), false, m34158w().m41174a().m41190t().mo4613a(kVar));
        C9971q.m14634f(t1, "createJavaConstructor(\n …ce(constructor)\n        )");
        C1399g e = C1389a.m41216e(m34158w(), t1, kVar, z0.mo6109r().size());
        AbstractC3533j.C3535b K = m34168K(e, t1, kVar.mo3991i());
        List<AbstractC11319f1> r = z0.mo6109r();
        C9971q.m14634f(r, "classDescriptor.declaredTypeParameters");
        List<AbstractC6913y> typeParameters = kVar.getTypeParameters();
        t = C9907k.m14809t(typeParameters, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC6913y yVar : typeParameters) {
            AbstractC11319f1 a = e.m41169f().mo41159a(yVar);
            C9971q.m14636d(a);
            arrayList.add(a);
        }
        o0 = C9914r.m14750o0(r, arrayList);
        t1.m6368r1(K.m34149a(), C14138j0.m1536d(kVar.getVisibility()), o0);
        t1.mo79Y0(false);
        t1.mo78Z0(K.m34148b());
        t1.m6244g1(z0.mo6166p());
        e.m41174a().m41202h().mo704d(kVar, t1);
        return t1;
    }

    /* renamed from: I0 */
    private final C14650e m34250I0(AbstractC6911w wVar) {
        List<AbstractC11396x0> i;
        List<? extends AbstractC11319f1> i2;
        List<AbstractC11335j1> i3;
        C14650e p1 = C14650e.m68p1(mo34135C(), C1396e.m41179a(m34158w(), wVar), wVar.getName(), m34158w().m41174a().m41190t().mo4613a(wVar), true);
        C9971q.m14634f(p1, "createJavaMethod(\n      …omponent), true\n        )");
        AbstractC7267g0 o = m34158w().m41168g().m33093o(wVar.getType(), C4006b.m33109b(EnumC7319r1.COMMON, false, false, null, 6, null));
        AbstractC11396x0 z = mo34113z();
        i = C9906j.m14820i();
        i2 = C9906j.m14820i();
        i3 = C9906j.m14820i();
        p1.mo69o1(null, z, i, i2, i3, o, EnumC11314e0.f25242k.m10219a(false, false, true), C11373t.f25299e, null);
        p1.m65s1(false, false);
        m34158w().m41174a().m41202h().mo707a(wVar, p1);
        return p1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public final Collection<AbstractC11404z0> m34249J0(C11142f fVar) {
        int t;
        Collection<AbstractC6906r> e = m34156y().invoke().mo34297e(fVar);
        t = C9907k.m14809t(e, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC6906r rVar : e) {
            arrayList.add(m34170I(rVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public final Collection<AbstractC11404z0> m34248K0(C11142f fVar) {
        boolean z;
        Set<AbstractC11404z0> y0 = m34208y0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : y0) {
            AbstractC11404z0 z0Var = (AbstractC11404z0) obj;
            if (C14126h0.m1580a(z0Var) || C14118f.m1603k(z0Var) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: L0 */
    private final boolean m34247L0(AbstractC11404z0 z0Var) {
        C14118f fVar = C14118f.f31900n;
        C11142f name = z0Var.getName();
        C9971q.m14634f(name, "name");
        if (!fVar.m1602l(name)) {
            return false;
        }
        C11142f name2 = z0Var.getName();
        C9971q.m14634f(name2, "name");
        Set<AbstractC11404z0> y0 = m34208y0(name2);
        ArrayList<AbstractC11397y> arrayList = new ArrayList();
        for (AbstractC11404z0 z0Var2 : y0) {
            AbstractC11397y k = C14118f.m1603k(z0Var2);
            if (k != null) {
                arrayList.add(k);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC11397y yVar : arrayList) {
            if (m34257B0(z0Var, yVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    private final void m34237V(List<AbstractC11335j1> list, AbstractC11343l lVar, int i, AbstractC6906r rVar, AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2) {
        AbstractC7267g0 g0Var3;
        AbstractC11672g b = AbstractC11672g.f26044g.m9048b();
        C11142f name = rVar.getName();
        AbstractC7267g0 n = C7322s1.m22933n(g0Var);
        C9971q.m14634f(n, "makeNotNullable(returnType)");
        boolean M = rVar.mo3979M();
        if (g0Var2 != null) {
            g0Var3 = C7322s1.m22933n(g0Var2);
        } else {
            g0Var3 = null;
        }
        list.add(new C12619l0(lVar, null, i, b, name, n, M, false, false, g0Var3, m34158w().m41174a().m41190t().mo4613a(rVar)));
    }

    /* renamed from: W */
    private final void m34236W(Collection<AbstractC11404z0> collection, C11142f fVar, Collection<? extends AbstractC11404z0> collection2, boolean z) {
        List o0;
        int t;
        Collection<? extends AbstractC11404z0> d = C14378a.m730d(fVar, collection2, collection, mo34135C(), m34158w().m41174a().m41207c(), m34158w().m41174a().m41199k().mo21675a());
        C9971q.m14634f(d, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(d);
            return;
        }
        o0 = C9914r.m14750o0(collection, d);
        t = C9907k.m14809t(d, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11404z0 resolvedOverride : d) {
            AbstractC11404z0 z0Var = (AbstractC11404z0) C14126h0.m1576e(resolvedOverride);
            if (z0Var == null) {
                C9971q.m14634f(resolvedOverride, "resolvedOverride");
            } else {
                C9971q.m14634f(resolvedOverride, "resolvedOverride");
                resolvedOverride = m34226g0(resolvedOverride, z0Var, o0);
            }
            arrayList.add(resolvedOverride);
        }
        collection.addAll(arrayList);
    }

    /* renamed from: X */
    private final void m34235X(C11142f fVar, Collection<? extends AbstractC11404z0> collection, Collection<? extends AbstractC11404z0> collection2, Collection<AbstractC11404z0> collection3, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        for (AbstractC11404z0 z0Var : collection2) {
            C11754a.m8689a(collection3, m34254E0(z0Var, function1, fVar, collection));
            C11754a.m8689a(collection3, m34255D0(z0Var, function1, collection));
            C11754a.m8689a(collection3, m34253F0(z0Var, function1));
        }
    }

    /* renamed from: Y */
    private final void m34234Y(Set<? extends AbstractC11388u0> set, Collection<AbstractC11388u0> collection, Set<AbstractC11388u0> set2, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        for (AbstractC11388u0 u0Var : set) {
            C14654f i0 = m34224i0(u0Var, function1);
            if (i0 != null) {
                collection.add(i0);
                if (set2 != null) {
                    set2.add(u0Var);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: Z */
    private final void m34233Z(C11142f fVar, Collection<AbstractC11388u0> collection) {
        Object s0;
        s0 = C9914r.m14746s0(m34156y().invoke().mo34297e(fVar));
        AbstractC6906r rVar = (AbstractC6906r) s0;
        if (rVar != null) {
            collection.add(m34222k0(this, rVar, null, EnumC11314e0.FINAL, 2, null));
        }
    }

    /* renamed from: c0 */
    private final Collection<AbstractC7267g0> m34230c0() {
        if (!this.f5666p) {
            return m34158w().m41174a().m41199k().mo21672d().mo21695g(mo34135C());
        }
        Collection<AbstractC7267g0> m = mo34135C().mo6111k().mo4568m();
        C9971q.m14634f(m, "ownerDescriptor.typeConstructor.supertypes");
        return m;
    }

    /* renamed from: d0 */
    private final List<AbstractC11335j1> m34229d0(C12604f fVar) {
        Object W;
        Pair pair;
        Collection<AbstractC6906r> B = this.f5665o.mo4029B();
        ArrayList arrayList = new ArrayList(B.size());
        C4005a b = C4006b.m33109b(EnumC7319r1.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : B) {
            if (C9971q.m14638b(((AbstractC6906r) obj).getName(), C14108b0.f31848c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.m15067a();
        List<AbstractC6906r> list2 = (List) pair2.m15066b();
        list.size();
        W = C9914r.m14768W(list);
        AbstractC6906r rVar = (AbstractC6906r) W;
        int i = 1;
        if (rVar != null) {
            AbstractC6912x returnType = rVar.getReturnType();
            if (returnType instanceof AbstractC6894f) {
                AbstractC6894f fVar2 = (AbstractC6894f) returnType;
                pair = new Pair(m34158w().m41168g().m33097k(fVar2, b, true), m34158w().m41168g().m33093o(fVar2.getComponentType(), b));
            } else {
                pair = new Pair(m34158w().m41168g().m33093o(returnType, b), null);
            }
            m34237V(arrayList, fVar, 0, rVar, (AbstractC7267g0) pair.m15067a(), (AbstractC7267g0) pair.m15066b());
        }
        int i2 = 0;
        if (rVar == null) {
            i = 0;
        }
        for (AbstractC6906r rVar2 : list2) {
            m34237V(arrayList, fVar, i2 + i, rVar2, m34158w().m41168g().m33093o(rVar2.getReturnType(), b), null);
            i2++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final AbstractC11309d m34228e0() {
        List<AbstractC11335j1> list;
        boolean q = this.f5665o.mo4012q();
        if ((this.f5665o.mo4027J() || !this.f5665o.mo4010s()) && !q) {
            return null;
        }
        AbstractC11313e z0 = mo34135C();
        C14647b t1 = C14647b.m75t1(z0, AbstractC11672g.f26044g.m9048b(), true, m34158w().m41174a().m41190t().mo4613a(this.f5665o));
        C9971q.m14634f(t1, "createJavaConstructor(\n ….source(jClass)\n        )");
        if (q) {
            list = m34229d0(t1);
        } else {
            list = Collections.emptyList();
        }
        t1.mo78Z0(false);
        t1.m6369q1(list, m34210w0(z0));
        t1.mo79Y0(true);
        t1.m6244g1(z0.mo6166p());
        m34158w().m41174a().m41202h().mo704d(this.f5665o, t1);
        return t1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final AbstractC11309d m34227f0() {
        AbstractC11313e z0 = mo34135C();
        C14647b t1 = C14647b.m75t1(z0, AbstractC11672g.f26044g.m9048b(), true, m34158w().m41174a().m41190t().mo4613a(this.f5665o));
        C9971q.m14634f(t1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<AbstractC11335j1> l0 = m34221l0(t1);
        t1.mo78Z0(false);
        t1.m6369q1(l0, m34210w0(z0));
        t1.mo79Y0(false);
        t1.m6244g1(z0.mo6166p());
        return t1;
    }

    /* renamed from: g0 */
    private final AbstractC11404z0 m34226g0(AbstractC11404z0 z0Var, AbstractC11297a aVar, Collection<? extends AbstractC11404z0> collection) {
        boolean z;
        boolean z2 = true;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC11404z0 z0Var2 = (AbstractC11404z0) it.next();
                if (C9971q.m14638b(z0Var, z0Var2) || z0Var2.mo6239p0() != null || !m34217p0(z0Var2, aVar)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return z0Var;
        }
        AbstractC11397y build = z0Var.mo6238u().mo6204i().build();
        C9971q.m14636d(build);
        return (AbstractC11404z0) build;
    }

    /* renamed from: h0 */
    private final AbstractC11404z0 m34225h0(AbstractC11397y yVar, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        Object obj;
        int t;
        C11142f name = yVar.getName();
        C9971q.m14634f(name, "overridden.name");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m34257B0((AbstractC11404z0) obj, yVar)) {
                break;
            }
        }
        AbstractC11404z0 z0Var = (AbstractC11404z0) obj;
        if (z0Var == null) {
            return null;
        }
        AbstractC11397y.AbstractC11398a<? extends AbstractC11404z0> u = z0Var.mo6238u();
        List<AbstractC11335j1> i = yVar.mo6242i();
        C9971q.m14634f(i, "overridden.valueParameters");
        t = C9907k.m14809t(i, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11335j1 j1Var : i) {
            arrayList.add(j1Var.getType());
        }
        List<AbstractC11335j1> i2 = z0Var.mo6242i();
        C9971q.m14634f(i2, "override.valueParameters");
        u.mo6210c(C14656h.m53a(arrayList, i2, yVar));
        u.mo6193t();
        u.mo6202k();
        u.mo6211b(C14650e.f39525R, Boolean.TRUE);
        return (AbstractC11404z0) u.build();
    }

    /* renamed from: i0 */
    private final C14654f m34224i0(AbstractC11388u0 u0Var, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        AbstractC11404z0 z0Var;
        List<? extends AbstractC11319f1> i;
        List<AbstractC11396x0> i2;
        Object W;
        C12603e0 e0Var = null;
        if (!m34218o0(u0Var, function1)) {
            return null;
        }
        AbstractC11404z0 u0 = m34212u0(u0Var, function1);
        C9971q.m14636d(u0);
        if (u0Var.mo6277L()) {
            z0Var = m34211v0(u0Var, function1);
            C9971q.m14636d(z0Var);
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            z0Var.mo6108s();
            u0.mo6108s();
        }
        C14649d dVar = new C14649d(mo34135C(), u0, z0Var, u0Var);
        AbstractC7267g0 returnType = u0.getReturnType();
        C9971q.m14636d(returnType);
        i = C9906j.m14820i();
        AbstractC11396x0 z = mo34113z();
        i2 = C9906j.m14820i();
        dVar.m6441b1(returnType, i, z, null, i2);
        C12597d0 k = C12659d.m6074k(dVar, u0.getAnnotations(), false, false, false, u0.mo6102j());
        k.m6461N0(u0);
        k.m6397Q0(dVar.getType());
        C9971q.m14634f(k, "createGetter(\n          …escriptor.type)\n        }");
        if (z0Var != null) {
            List<AbstractC11335j1> i3 = z0Var.mo6242i();
            C9971q.m14634f(i3, "setterMethod.valueParameters");
            W = C9914r.m14768W(i3);
            AbstractC11335j1 j1Var = (AbstractC11335j1) W;
            if (j1Var != null) {
                e0Var = C12659d.m6072m(dVar, z0Var.getAnnotations(), j1Var.getAnnotations(), false, false, false, z0Var.getVisibility(), z0Var.mo6102j());
                e0Var.m6461N0(z0Var);
            } else {
                throw new AssertionError("No parameter found for " + z0Var);
            }
        }
        dVar.m6447U0(k, e0Var);
        return dVar;
    }

    /* renamed from: j0 */
    private final C14654f m34223j0(AbstractC6906r rVar, AbstractC7267g0 g0Var, EnumC11314e0 e0Var) {
        AbstractC7267g0 g0Var2;
        List<? extends AbstractC11319f1> i;
        List<AbstractC11396x0> i2;
        C14654f f1 = C14654f.m56f1(mo34135C(), C1396e.m41179a(m34158w(), rVar), e0Var, C14138j0.m1536d(rVar.getVisibility()), false, rVar.getName(), m34158w().m41174a().m41190t().mo4613a(rVar), false);
        C9971q.m14634f(f1, "create(\n            owne…inal = */ false\n        )");
        C12597d0 d = C12659d.m6081d(f1, AbstractC11672g.f26044g.m9048b());
        C9971q.m14634f(d, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        f1.m6447U0(d, null);
        if (g0Var == null) {
            g0Var2 = m34161q(rVar, C1389a.m41215f(m34158w(), f1, rVar, 0, 4, null));
        } else {
            g0Var2 = g0Var;
        }
        i = C9906j.m14820i();
        AbstractC11396x0 z = mo34113z();
        i2 = C9906j.m14820i();
        f1.m6441b1(g0Var2, i, z, null, i2);
        d.m6397Q0(g0Var2);
        return f1;
    }

    /* renamed from: k0 */
    static /* synthetic */ C14654f m34222k0(C3509g gVar, AbstractC6906r rVar, AbstractC7267g0 g0Var, EnumC11314e0 e0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            g0Var = null;
        }
        return gVar.m34223j0(rVar, g0Var, e0Var);
    }

    /* renamed from: l0 */
    private final List<AbstractC11335j1> m34221l0(C12604f fVar) {
        AbstractC7267g0 g0Var;
        Collection<AbstractC6911w> p = this.f5665o.mo4013p();
        ArrayList arrayList = new ArrayList(p.size());
        C4005a b = C4006b.m33109b(EnumC7319r1.COMMON, false, false, null, 6, null);
        int i = 0;
        for (AbstractC6911w wVar : p) {
            i++;
            AbstractC7267g0 o = m34158w().m41168g().m33093o(wVar.getType(), b);
            if (wVar.mo3968a()) {
                g0Var = m34158w().m41174a().m41197m().mo6136n().m13383k(o);
            } else {
                g0Var = null;
            }
            arrayList.add(new C12619l0(fVar, null, i, AbstractC11672g.f26044g.m9048b(), wVar.getName(), o, false, false, false, g0Var, m34158w().m41174a().m41190t().mo4613a(wVar)));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    private final AbstractC11404z0 m34220m0(AbstractC11404z0 z0Var, C11142f fVar) {
        AbstractC11397y.AbstractC11398a<? extends AbstractC11404z0> u = z0Var.mo6238u();
        u.mo6208e(fVar);
        u.mo6193t();
        u.mo6202k();
        AbstractC11397y build = u.build();
        C9971q.m14636d(build);
        return (AbstractC11404z0) build;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p268og.AbstractC11404z0 m34219n0(p268og.AbstractC11404z0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo6242i()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            java.lang.Object r0 = kotlin.collections.C9904h.m14861i0(r0)
            og.j1 r0 = (p268og.AbstractC11335j1) r0
            r2 = 0
            if (r0 == 0) goto L_0x007e
            fi.g0 r3 = r0.getType()
            fi.g1 r3 = r3.mo5172N0()
            og.h r3 = r3.mo4565p()
            if (r3 == 0) goto L_0x0035
            nh.d r3 = p388vh.C13508c.m3528m(r3)
            if (r3 == 0) goto L_0x0035
            boolean r4 = r3.m10788f()
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0035
            nh.c r3 = r3.m10782l()
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            nh.c r4 = p217lg.C10434k.f22889p
            boolean r3 = kotlin.jvm.internal.C9971q.m14638b(r3, r4)
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0043
            goto L_0x007e
        L_0x0043:
            og.y$a r2 = r6.mo6238u()
            java.util.List r6 = r6.mo6242i()
            kotlin.jvm.internal.C9971q.m14634f(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.C9904h.m14882P(r6, r1)
            og.y$a r6 = r2.mo6210c(r6)
            fi.g0 r0 = r0.getType()
            java.util.List r0 = r0.mo5174L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            fi.k1 r0 = (fi.AbstractC7290k1) r0
            fi.g0 r0 = r0.getType()
            og.y$a r6 = r6.mo6199n(r0)
            og.y r6 = r6.build()
            og.z0 r6 = (p268og.AbstractC11404z0) r6
            r0 = r6
            rg.g0 r0 = (p324rg.C12607g0) r0
            if (r0 != 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r0.m6243h1(r1)
        L_0x007d:
            return r6
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C3509g.m34219n0(og.z0):og.z0");
    }

    /* renamed from: o0 */
    private final boolean m34218o0(AbstractC11388u0 u0Var, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        if (C3495c.m34294a(u0Var)) {
            return false;
        }
        AbstractC11404z0 u0 = m34212u0(u0Var, function1);
        AbstractC11404z0 v0 = m34211v0(u0Var, function1);
        if (u0 == null) {
            return false;
        }
        if (!u0Var.mo6277L()) {
            return true;
        }
        if (v0 == null || v0.mo6108s() != u0.mo6108s()) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    private final boolean m34217p0(AbstractC11297a aVar, AbstractC11297a aVar2) {
        C12669k.C12678i.EnumC12679a c = C12669k.f28507f.m6012F(aVar2, aVar, true).m5969c();
        C9971q.m14634f(c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (c != C12669k.C12678i.EnumC12679a.OVERRIDABLE || C14155t.f31963a.m1501a(aVar2, aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: q0 */
    private final boolean m34216q0(AbstractC11404z0 z0Var) {
        C14132i0.C14133a aVar = C14132i0.f31919a;
        C11142f name = z0Var.getName();
        C9971q.m14634f(name, "name");
        C11142f b = aVar.m1556b(name);
        if (b == null) {
            return false;
        }
        Set<AbstractC11404z0> y0 = m34208y0(b);
        ArrayList<AbstractC11404z0> arrayList = new ArrayList();
        for (Object obj : y0) {
            if (C14126h0.m1580a((AbstractC11404z0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        AbstractC11404z0 m0 = m34220m0(z0Var, b);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC11404z0 z0Var2 : arrayList) {
            if (m34215r0(z0Var2, m0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r0 */
    private final boolean m34215r0(AbstractC11404z0 z0Var, AbstractC11397y yVar) {
        if (C14114e.f31894n.m1610k(z0Var)) {
            yVar = yVar.mo6162a();
        }
        C9971q.m14634f(yVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return m34217p0(yVar, z0Var);
    }

    /* renamed from: s0 */
    private final boolean m34214s0(AbstractC11404z0 z0Var) {
        boolean z;
        AbstractC11404z0 n0 = m34219n0(z0Var);
        if (n0 == null) {
            return false;
        }
        C11142f name = z0Var.getName();
        C9971q.m14634f(name, "name");
        Set<AbstractC11404z0> y0 = m34208y0(name);
        if ((y0 instanceof Collection) && y0.isEmpty()) {
            return false;
        }
        for (AbstractC11404z0 z0Var2 : y0) {
            if (!z0Var2.isSuspend() || !m34217p0(n0, z0Var2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t0 */
    private final AbstractC11404z0 m34213t0(AbstractC11388u0 u0Var, String str, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        AbstractC11404z0 z0Var;
        boolean z;
        C11142f f = C11142f.m10767f(str);
        C9971q.m14634f(f, "identifier(getterName)");
        Iterator it = ((Iterable) function1.invoke(f)).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC11404z0 z0Var2 = (AbstractC11404z0) it.next();
            if (z0Var2.mo6242i().size() == 0) {
                AbstractC7659e eVar = AbstractC7659e.f16659a;
                AbstractC7267g0 returnType = z0Var2.getReturnType();
                if (returnType == null) {
                    z = false;
                } else {
                    z = eVar.mo21674b(returnType, u0Var.getType());
                }
                if (z) {
                    z0Var = z0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    /* renamed from: u0 */
    private final AbstractC11404z0 m34212u0(AbstractC11388u0 u0Var, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        AbstractC11390v0 v0Var;
        AbstractC11390v0 f = u0Var.mo6437f();
        String str = null;
        if (f != null) {
            v0Var = (AbstractC11390v0) C14126h0.m1577d(f);
        } else {
            v0Var = null;
        }
        if (v0Var != null) {
            str = C14130i.f31917a.m1569a(v0Var);
        }
        if (str != null && !C14126h0.m1575f(mo34135C(), v0Var)) {
            return m34213t0(u0Var, str, function1);
        }
        String b = u0Var.getName().m10771b();
        C9971q.m14634f(b, "name.asString()");
        return m34213t0(u0Var, C14106a0.m1649b(b), function1);
    }

    /* renamed from: v0 */
    private final AbstractC11404z0 m34211v0(AbstractC11388u0 u0Var, Function1<? super C11142f, ? extends Collection<? extends AbstractC11404z0>> function1) {
        AbstractC11404z0 z0Var;
        AbstractC7267g0 returnType;
        Object r0;
        String b = u0Var.getName().m10771b();
        C9971q.m14634f(b, "name.asString()");
        C11142f f = C11142f.m10767f(C14106a0.m1646e(b));
        C9971q.m14634f(f, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator it = ((Iterable) function1.invoke(f)).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC11404z0 z0Var2 = (AbstractC11404z0) it.next();
            if (z0Var2.mo6242i().size() == 1 && (returnType = z0Var2.getReturnType()) != null && AbstractC10420h.m13428B0(returnType)) {
                AbstractC7659e eVar = AbstractC7659e.f16659a;
                List<AbstractC11335j1> i = z0Var2.mo6242i();
                C9971q.m14634f(i, "descriptor.valueParameters");
                r0 = C9914r.m14747r0(i);
                if (eVar.mo21673c(((AbstractC11335j1) r0).getType(), u0Var.getType())) {
                    z0Var = z0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    /* renamed from: w0 */
    private final AbstractC11387u m34210w0(AbstractC11313e eVar) {
        AbstractC11387u visibility = eVar.getVisibility();
        C9971q.m14634f(visibility, "classDescriptor.visibility");
        if (!C9971q.m14638b(visibility, C14151s.f31960b)) {
            return visibility;
        }
        AbstractC11387u PROTECTED_AND_PACKAGE = C14151s.f31961c;
        C9971q.m14634f(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    /* renamed from: y0 */
    private final Set<AbstractC11404z0> m34208y0(C11142f fVar) {
        Collection<AbstractC7267g0> c0 = m34230c0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC7267g0 g0Var : c0) {
            C9911o.m14801y(linkedHashSet, g0Var.mo5161o().mo626d(fVar, EnumC13881d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: G */
    protected boolean mo34171G(C14650e eVar) {
        C9971q.m14633g(eVar, "<this>");
        if (this.f5665o.mo4012q()) {
            return false;
        }
        return m34256C0(eVar);
    }

    /* renamed from: G0 */
    public void m34252G0(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        C13505a.m3544a(m34158w().m41174a().m41198l(), location, mo34135C(), name);
    }

    @Override // bh.AbstractC3533j
    /* renamed from: H */
    protected AbstractC3533j.C3534a mo34115H(AbstractC6906r method, List<? extends AbstractC11319f1> methodTypeParameters, AbstractC7267g0 returnType, List<? extends AbstractC11335j1> valueParameters) {
        C9971q.m14633g(method, "method");
        C9971q.m14633g(methodTypeParameters, "methodTypeParameters");
        C9971q.m14633g(returnType, "returnType");
        C9971q.m14633g(valueParameters, "valueParameters");
        AbstractC14394j.C14396b b = m34158w().m41174a().m41191s().mo697b(method, mo34135C(), returnType, null, valueParameters, methodTypeParameters);
        C9971q.m14634f(b, "c.components.signaturePr…dTypeParameters\n        )");
        AbstractC7267g0 d = b.m692d();
        C9971q.m14634f(d, "propagated.returnType");
        AbstractC7267g0 c = b.m693c();
        List<AbstractC11335j1> f = b.m690f();
        C9971q.m14634f(f, "propagated.valueParameters");
        List<AbstractC11319f1> e = b.m691e();
        C9971q.m14634f(e, "propagated.typeParameters");
        boolean g = b.m689g();
        List<String> b2 = b.m694b();
        C9971q.m14634f(b2, "propagated.errors");
        return new AbstractC3533j.C3534a(d, c, f, e, g, b2);
    }

    @Override // bh.AbstractC3533j, p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        m34252G0(name, location);
        return super.mo627a(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a0 */
    public LinkedHashSet<C11142f> mo34126n(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        C9971q.m14633g(kindFilter, "kindFilter");
        Collection<AbstractC7267g0> m = mo34135C().mo6111k().mo4568m();
        C9971q.m14634f(m, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<C11142f> linkedHashSet = new LinkedHashSet<>();
        for (AbstractC7267g0 g0Var : m) {
            C9911o.m14801y(linkedHashSet, g0Var.mo5161o().mo638b());
        }
        linkedHashSet.addAll(m34156y().invoke().mo34301a());
        linkedHashSet.addAll(m34156y().invoke().mo34300b());
        linkedHashSet.addAll(mo34127l(kindFilter, function1));
        linkedHashSet.addAll(m34158w().m41174a().m41187w().mo2387b(m34158w(), mo34135C()));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b0 */
    public C3492a mo34124p() {
        return new C3492a(this.f5665o, C3510a.f5672k);
    }

    @Override // bh.AbstractC3533j, p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        m34252G0(name, location);
        return super.mo626d(name, location);
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        AbstractC6937h<C11142f, AbstractC11313e> hVar;
        AbstractC11313e invoke;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        m34252G0(name, location);
        C3509g gVar = (C3509g) m34175B();
        if (gVar == null || (hVar = gVar.f5671u) == null || (invoke = hVar.invoke(name)) == null) {
            return this.f5671u.invoke(name);
        }
        return invoke;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: l */
    protected Set<C11142f> mo34127l(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        Set<C11142f> l;
        C9971q.m14633g(kindFilter, "kindFilter");
        l = C9922x.m14714l(this.f5668r.invoke(), this.f5670t.invoke().keySet());
        return l;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: o */
    protected void mo34125o(Collection<AbstractC11404z0> result, C11142f name) {
        C9971q.m14633g(result, "result");
        C9971q.m14633g(name, "name");
        if (this.f5665o.mo4011r() && m34156y().invoke().mo34298d(name) != null) {
            boolean z = true;
            if (!result.isEmpty()) {
                Iterator<T> it = result.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AbstractC11404z0) it.next()).mo6242i().isEmpty()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                AbstractC6911w d = m34156y().invoke().mo34298d(name);
                C9971q.m14636d(d);
                result.add(m34250I0(d));
            }
        }
        m34158w().m41174a().m41187w().mo2383f(m34158w(), mo34135C(), name, result);
    }

    @Override // bh.AbstractC3533j
    /* renamed from: r */
    protected void mo34123r(Collection<AbstractC11404z0> result, C11142f name) {
        List i;
        List o0;
        boolean z;
        C9971q.m14633g(result, "result");
        C9971q.m14633g(name, "name");
        Set<AbstractC11404z0> y0 = m34208y0(name);
        if (!C14132i0.f31919a.m1547k(name) && !C14118f.f31900n.m1602l(name)) {
            if (!(y0 instanceof Collection) || !y0.isEmpty()) {
                for (AbstractC11397y yVar : y0) {
                    if (yVar.isSuspend()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : y0) {
                    if (m34256C0((AbstractC11404z0) obj)) {
                        arrayList.add(obj);
                    }
                }
                m34236W(result, name, arrayList, false);
                return;
            }
        }
        C11773f a = C11773f.f26275m.m8654a();
        i = C9906j.m14820i();
        Collection<? extends AbstractC11404z0> d = C14378a.m730d(name, y0, i, mo34135C(), AbstractC3596r.f5862a, m34158w().m41174a().m41199k().mo21675a());
        C9971q.m14634f(d, "resolveOverridesForNonSt….overridingUtil\n        )");
        m34235X(name, result, d, result, new C3511b(this));
        m34235X(name, result, d, a, new C3512c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : y0) {
            if (m34256C0((AbstractC11404z0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        o0 = C9914r.m14750o0(arrayList2, a);
        m34236W(result, name, o0, true);
    }

    @Override // bh.AbstractC3533j
    /* renamed from: s */
    protected void mo34114s(C11142f name, Collection<AbstractC11388u0> result) {
        Set<? extends AbstractC11388u0> j;
        Set l;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(result, "result");
        if (this.f5665o.mo4012q()) {
            m34233Z(name, result);
        }
        Set<AbstractC11388u0> A0 = m34258A0(name);
        if (!A0.isEmpty()) {
            C11773f.C11775b bVar = C11773f.f26275m;
            C11773f a = bVar.m8654a();
            C11773f a2 = bVar.m8654a();
            m34234Y(A0, result, a, new C3513d());
            j = C9922x.m14716j(A0, a);
            m34234Y(j, a2, null, new C3514e());
            l = C9922x.m14714l(A0, a2);
            Collection<? extends AbstractC11388u0> d = C14378a.m730d(name, l, result, mo34135C(), m34158w().m41174a().m41207c(), m34158w().m41174a().m41199k().mo21675a());
            C9971q.m14634f(d, "resolveOverridesForNonSt…rridingUtil\n            )");
            result.addAll(d);
        }
    }

    @Override // bh.AbstractC3533j
    /* renamed from: t */
    protected Set<C11142f> mo34122t(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        C9971q.m14633g(kindFilter, "kindFilter");
        if (this.f5665o.mo4012q()) {
            return mo638b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m34156y().invoke().mo34299c());
        Collection<AbstractC7267g0> m = mo34135C().mo6111k().mo4568m();
        C9971q.m14634f(m, "ownerDescriptor.typeConstructor.supertypes");
        for (AbstractC7267g0 g0Var : m) {
            C9911o.m14801y(linkedHashSet, g0Var.mo5161o().mo637c());
        }
        return linkedHashSet;
    }

    @Override // bh.AbstractC3533j
    public String toString() {
        return "Lazy Java member scope for " + this.f5665o.mo4017e();
    }

    /* renamed from: x0 */
    public final AbstractC6938i<List<AbstractC11309d>> m34209x0() {
        return this.f5667q;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: z */
    protected AbstractC11396x0 mo34113z() {
        return C12661e.m6042l(mo34135C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z0 */
    public AbstractC11313e mo34135C() {
        return this.f5664n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3509g(C1399g c, AbstractC11313e ownerDescriptor, AbstractC6895g jClass, boolean z, C3509g gVar) {
        super(c, gVar);
        C9971q.m14633g(c, "c");
        C9971q.m14633g(ownerDescriptor, "ownerDescriptor");
        C9971q.m14633g(jClass, "jClass");
        this.f5664n = ownerDescriptor;
        this.f5665o = jClass;
        this.f5666p = z;
        this.f5667q = c.m41170e().mo23898c(new C3515f(c));
        this.f5668r = c.m41170e().mo23898c(new C3518j());
        this.f5669s = c.m41170e().mo23898c(new C3516h(c, this));
        this.f5670t = c.m41170e().mo23898c(new C0088g());
        this.f5671u = c.m41170e().mo23894g(new C3519k(c));
    }
}
