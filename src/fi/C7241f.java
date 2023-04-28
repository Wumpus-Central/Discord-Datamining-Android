package fi;

import fi.C7250f1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p182ji.AbstractC9613d;
import p182ji.AbstractC9614e;
import p182ji.AbstractC9617h;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9621l;
import p182ji.AbstractC9622m;
import p182ji.AbstractC9623n;
import p182ji.AbstractC9624o;
import p182ji.AbstractC9625p;
import p182ji.AbstractC9630t;
import p182ji.C9610a;
import p182ji.EnumC9611b;
import p182ji.EnumC9631u;
import p286pi.C11768e;

/* renamed from: fi.f */
/* loaded from: classes8.dex */
public final class C7241f {

    /* renamed from: a */
    public static final C7241f f15681a = new C7241f();

    /* renamed from: b */
    public static boolean f15682b;

    /* renamed from: fi.f$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7242a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15683a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15684b;

        static {
            int[] iArr = new int[EnumC9631u.values().length];
            try {
                iArr[EnumC9631u.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9631u.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9631u.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15683a = iArr;
            int[] iArr2 = new int[C7250f1.EnumC7252b.values().length];
            try {
                iArr2[C7250f1.EnumC7252b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C7250f1.EnumC7252b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C7250f1.EnumC7252b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f15684b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.f$b */
    /* loaded from: classes8.dex */
    public static final class C7243b extends AbstractC9973s implements Function1<C7250f1.AbstractC7251a, Unit> {

        /* renamed from: k */
        final /* synthetic */ List<AbstractC9620k> f15685k;

        /* renamed from: l */
        final /* synthetic */ C7250f1 f15686l;

        /* renamed from: m */
        final /* synthetic */ AbstractC9625p f15687m;

        /* renamed from: n */
        final /* synthetic */ AbstractC9620k f15688n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fi.f$b$a */
        /* loaded from: classes8.dex */
        public static final class C7244a extends AbstractC9973s implements Function0<Boolean> {

            /* renamed from: k */
            final /* synthetic */ C7250f1 f15689k;

            /* renamed from: l */
            final /* synthetic */ AbstractC9625p f15690l;

            /* renamed from: m */
            final /* synthetic */ AbstractC9620k f15691m;

            /* renamed from: n */
            final /* synthetic */ AbstractC9620k f15692n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7244a(C7250f1 f1Var, AbstractC9625p pVar, AbstractC9620k kVar, AbstractC9620k kVar2) {
                super(0);
                this.f15689k = f1Var;
                this.f15690l = pVar;
                this.f15691m = kVar;
                this.f15692n = kVar2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(C7241f.f15681a.m23117q(this.f15689k, this.f15690l.mo5896r0(this.f15691m), this.f15692n));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7243b(List<? extends AbstractC9620k> list, C7250f1 f1Var, AbstractC9625p pVar, AbstractC9620k kVar) {
            super(1);
            this.f15685k = list;
            this.f15686l = f1Var;
            this.f15687m = pVar;
            this.f15688n = kVar;
        }

        /* renamed from: a */
        public final void m23110a(C7250f1.AbstractC7251a runForkingPoint) {
            C9971q.m14633g(runForkingPoint, "$this$runForkingPoint");
            for (AbstractC9620k kVar : this.f15685k) {
                runForkingPoint.mo23083a(new C7244a(this.f15686l, this.f15687m, kVar, this.f15688n));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7250f1.AbstractC7251a aVar) {
            m23110a(aVar);
            return Unit.f22042a;
        }
    }

    private C7241f() {
    }

    /* renamed from: a */
    private final Boolean m23133a(C7250f1 f1Var, AbstractC9620k kVar, AbstractC9620k kVar2) {
        AbstractC9625p j = f1Var.m23091j();
        if (!j.mo5952H(kVar) && !j.mo5952H(kVar2)) {
            return null;
        }
        if (m23130d(j, kVar) && m23130d(j, kVar2)) {
            return Boolean.TRUE;
        }
        if (j.mo5952H(kVar)) {
            if (m23129e(j, f1Var, kVar, kVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j.mo5952H(kVar2) && (m23131c(j, kVar) || m23129e(j, f1Var, kVar2, kVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: b */
    private static final boolean m23132b(AbstractC9625p pVar, AbstractC9620k kVar) {
        if (!(kVar instanceof AbstractC9613d)) {
            return false;
        }
        AbstractC9622m D = pVar.mo5960D(pVar.mo5899q((AbstractC9613d) kVar));
        if (pVar.mo5948J(D) || !pVar.mo5952H(pVar.mo5891u(pVar.mo5932Z(D)))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static final boolean m23131c(AbstractC9625p pVar, AbstractC9620k kVar) {
        boolean z;
        boolean z2;
        AbstractC9623n a = pVar.mo5931a(kVar);
        if (!(a instanceof AbstractC9617h)) {
            return false;
        }
        Collection<AbstractC9618i> m0 = pVar.mo5906m0(a);
        if (!(m0 instanceof Collection) || !m0.isEmpty()) {
            for (AbstractC9618i iVar : m0) {
                AbstractC9620k f = pVar.mo5921f(iVar);
                if (f == null || !pVar.mo5952H(f)) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static final boolean m23130d(AbstractC9625p pVar, AbstractC9620k kVar) {
        return pVar.mo5952H(kVar) || m23132b(pVar, kVar);
    }

    /* renamed from: e */
    private static final boolean m23129e(AbstractC9625p pVar, C7250f1 f1Var, AbstractC9620k kVar, AbstractC9620k kVar2, boolean z) {
        boolean z2;
        Collection<AbstractC9618i> t0 = pVar.mo5892t0(kVar);
        if ((t0 instanceof Collection) && t0.isEmpty()) {
            return false;
        }
        for (AbstractC9618i iVar : t0) {
            if (C9971q.m14638b(pVar.mo5943O(iVar), pVar.mo5931a(kVar2)) || (z && m23114t(f15681a, f1Var, kVar2, iVar, false, 8, null))) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0127, code lost:
        if (r10 != false) goto L_0x0129;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean m23128f(fi.C7250f1 r15, p182ji.AbstractC9620k r16, p182ji.AbstractC9620k r17) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7241f.m23128f(fi.f1, ji.k, ji.k):java.lang.Boolean");
    }

    /* renamed from: g */
    private final List<AbstractC9620k> m23127g(C7250f1 f1Var, AbstractC9620k kVar, AbstractC9623n nVar) {
        String e0;
        C7250f1.AbstractC7253c cVar;
        List<AbstractC9620k> i;
        List<AbstractC9620k> d;
        List<AbstractC9620k> i2;
        AbstractC9625p j = f1Var.m23091j();
        List<AbstractC9620k> z = j.mo5881z(kVar, nVar);
        if (z != null) {
            return z;
        }
        if (!j.mo5924d0(nVar) && j.mo5914i0(kVar)) {
            i2 = C9906j.m14820i();
            return i2;
        } else if (!j.mo5888v0(nVar)) {
            C11768e eVar = new C11768e();
            f1Var.m23090k();
            ArrayDeque<AbstractC9620k> h = f1Var.m23093h();
            C9971q.m14636d(h);
            Set<AbstractC9620k> i3 = f1Var.m23092i();
            C9971q.m14636d(i3);
            h.push(kVar);
            while (!h.isEmpty()) {
                if (i3.size() <= 1000) {
                    AbstractC9620k current = h.pop();
                    C9971q.m14634f(current, "current");
                    if (i3.add(current)) {
                        AbstractC9620k G = j.mo5954G(current, EnumC9611b.FOR_SUBTYPING);
                        if (G == null) {
                            G = current;
                        }
                        if (j.mo5903o(j.mo5931a(G), nVar)) {
                            eVar.add(G);
                            cVar = C7250f1.AbstractC7253c.C0224c.f15716a;
                        } else if (j.mo5900p0(G) == 0) {
                            cVar = C7250f1.AbstractC7253c.C7255b.f15715a;
                        } else {
                            cVar = f1Var.m23091j().mo5933Y(G);
                        }
                        if (!(!C9971q.m14638b(cVar, C7250f1.AbstractC7253c.C0224c.f15716a))) {
                            cVar = null;
                        }
                        if (cVar != null) {
                            AbstractC9625p j2 = f1Var.m23091j();
                            for (AbstractC9618i iVar : j2.mo5906m0(j2.mo5931a(current))) {
                                h.add(cVar.mo21709a(f1Var, iVar));
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too many supertypes for type: ");
                    sb2.append(kVar);
                    sb2.append(". Supertypes = ");
                    e0 = C9914r.m14760e0(i3, null, null, null, 0, null, null, 63, null);
                    sb2.append(e0);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            f1Var.m23095e();
            return eVar;
        } else if (j.mo5903o(j.mo5931a(kVar), nVar)) {
            AbstractC9620k G2 = j.mo5954G(kVar, EnumC9611b.FOR_SUBTYPING);
            if (G2 != null) {
                kVar = G2;
            }
            d = C9905i.m14825d(kVar);
            return d;
        } else {
            i = C9906j.m14820i();
            return i;
        }
    }

    /* renamed from: h */
    private final List<AbstractC9620k> m23126h(C7250f1 f1Var, AbstractC9620k kVar, AbstractC9623n nVar) {
        return m23111w(f1Var, m23127g(f1Var, kVar, nVar));
    }

    /* renamed from: i */
    private final boolean m23125i(C7250f1 f1Var, AbstractC9618i iVar, AbstractC9618i iVar2, boolean z) {
        AbstractC9625p j = f1Var.m23091j();
        AbstractC9618i o = f1Var.m23086o(f1Var.m23085p(iVar));
        AbstractC9618i o2 = f1Var.m23086o(f1Var.m23085p(iVar2));
        C7241f fVar = f15681a;
        Boolean f = fVar.m23128f(f1Var, j.mo5907m(o), j.mo5891u(o2));
        if (f != null) {
            boolean booleanValue = f.booleanValue();
            f1Var.m23097c(o, o2, z);
            return booleanValue;
        }
        Boolean c = f1Var.m23097c(o, o2, z);
        if (c != null) {
            return c.booleanValue();
        }
        return fVar.m23113u(f1Var, j.mo5907m(o), j.mo5891u(o2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return r8.mo5942P(r8.mo5943O(r9), r2);
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p182ji.AbstractC9624o m23121m(p182ji.AbstractC9625p r8, p182ji.AbstractC9618i r9, p182ji.AbstractC9618i r10) {
        /*
            r7 = this;
            int r0 = r8.mo5900p0(r9)
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 0
            if (r2 >= r0) goto L_0x0067
            ji.m r4 = r8.mo5959D0(r9, r2)
            boolean r5 = r8.mo5948J(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0016
            r3 = r4
        L_0x0016:
            if (r3 == 0) goto L_0x0064
            ji.i r3 = r8.mo5932Z(r3)
            if (r3 != 0) goto L_0x001f
            goto L_0x0064
        L_0x001f:
            ji.k r4 = r8.mo5907m(r3)
            ji.k r4 = r8.mo5890u0(r4)
            boolean r4 = r8.mo5905n(r4)
            if (r4 == 0) goto L_0x003c
            ji.k r4 = r8.mo5907m(r10)
            ji.k r4 = r8.mo5890u0(r4)
            boolean r4 = r8.mo5905n(r4)
            if (r4 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r1
        L_0x003d:
            boolean r4 = kotlin.jvm.internal.C9971q.m14638b(r3, r10)
            if (r4 != 0) goto L_0x005b
            if (r6 == 0) goto L_0x0054
            ji.n r4 = r8.mo5943O(r3)
            ji.n r5 = r8.mo5943O(r10)
            boolean r4 = kotlin.jvm.internal.C9971q.m14638b(r4, r5)
            if (r4 == 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            ji.o r3 = r7.m23121m(r8, r3, r10)
            if (r3 == 0) goto L_0x0064
            return r3
        L_0x005b:
            ji.n r9 = r8.mo5943O(r9)
            ji.o r8 = r8.mo5942P(r9, r2)
            return r8
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0067:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7241f.m23121m(ji.p, ji.i, ji.i):ji.o");
    }

    /* renamed from: n */
    private final boolean m23120n(C7250f1 f1Var, AbstractC9620k kVar) {
        String e0;
        C7250f1.AbstractC7253c cVar;
        AbstractC9625p j = f1Var.m23091j();
        AbstractC9623n a = j.mo5931a(kVar);
        if (j.mo5924d0(a)) {
            return j.mo5955F0(a);
        }
        if (j.mo5955F0(j.mo5931a(kVar))) {
            return true;
        }
        f1Var.m23090k();
        ArrayDeque<AbstractC9620k> h = f1Var.m23093h();
        C9971q.m14636d(h);
        Set<AbstractC9620k> i = f1Var.m23092i();
        C9971q.m14636d(i);
        h.push(kVar);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                AbstractC9620k current = h.pop();
                C9971q.m14634f(current, "current");
                if (i.add(current)) {
                    if (j.mo5914i0(current)) {
                        cVar = C7250f1.AbstractC7253c.C0224c.f15716a;
                    } else {
                        cVar = C7250f1.AbstractC7253c.C7255b.f15715a;
                    }
                    if (!(!C9971q.m14638b(cVar, C7250f1.AbstractC7253c.C0224c.f15716a))) {
                        cVar = null;
                    }
                    if (cVar == null) {
                        continue;
                    } else {
                        AbstractC9625p j2 = f1Var.m23091j();
                        for (AbstractC9618i iVar : j2.mo5906m0(j2.mo5931a(current))) {
                            AbstractC9620k a2 = cVar.mo21709a(f1Var, iVar);
                            if (j.mo5955F0(j.mo5931a(a2))) {
                                f1Var.m23095e();
                                return true;
                            }
                            h.add(a2);
                        }
                        continue;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(kVar);
                sb2.append(". Supertypes = ");
                e0 = C9914r.m14760e0(i, null, null, null, 0, null, null, 63, null);
                sb2.append(e0);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        f1Var.m23095e();
        return false;
    }

    /* renamed from: o */
    private final boolean m23119o(AbstractC9625p pVar, AbstractC9618i iVar) {
        if (!pVar.mo5902o0(pVar.mo5943O(iVar)) || pVar.mo5962C(iVar) || pVar.mo5944N(iVar) || pVar.mo5882y0(iVar) || !C9971q.m14638b(pVar.mo5931a(pVar.mo5907m(iVar)), pVar.mo5931a(pVar.mo5891u(iVar)))) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private final boolean m23118p(AbstractC9625p pVar, AbstractC9620k kVar, AbstractC9620k kVar2) {
        AbstractC9620k kVar3;
        AbstractC9620k kVar4;
        AbstractC9614e s = pVar.mo5895s(kVar);
        if (s == null || (kVar3 = pVar.mo5915i(s)) == null) {
            kVar3 = kVar;
        }
        AbstractC9614e s2 = pVar.mo5895s(kVar2);
        if (s2 == null || (kVar4 = pVar.mo5915i(s2)) == null) {
            kVar4 = kVar2;
        }
        if (pVar.mo5931a(kVar3) != pVar.mo5931a(kVar4)) {
            return false;
        }
        if (!pVar.mo5944N(kVar) && pVar.mo5944N(kVar2)) {
            return false;
        }
        if (!pVar.mo5880z0(kVar) || pVar.mo5880z0(kVar2)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m23114t(C7241f fVar, C7250f1 f1Var, AbstractC9618i iVar, AbstractC9618i iVar2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return fVar.m23115s(f1Var, iVar, iVar2, z);
    }

    /* renamed from: u */
    private final boolean m23113u(C7250f1 f1Var, AbstractC9620k kVar, AbstractC9620k kVar2) {
        int t;
        Object U;
        int t2;
        boolean z;
        AbstractC9618i Z;
        AbstractC9625p j = f1Var.m23091j();
        if (f15682b) {
            if (!j.mo5919g(kVar) && !j.mo5886w0(j.mo5931a(kVar))) {
                f1Var.m23089l(kVar);
            }
            if (!j.mo5919g(kVar2)) {
                f1Var.m23089l(kVar2);
            }
        }
        boolean z2 = false;
        if (!C7230c.f15668a.m23161d(f1Var, kVar, kVar2)) {
            return false;
        }
        C7241f fVar = f15681a;
        Boolean a = fVar.m23133a(f1Var, j.mo5907m(kVar), j.mo5891u(kVar2));
        if (a != null) {
            boolean booleanValue = a.booleanValue();
            C7250f1.m23096d(f1Var, kVar, kVar2, false, 4, null);
            return booleanValue;
        }
        AbstractC9623n a2 = j.mo5931a(kVar2);
        boolean z3 = true;
        if ((j.mo5903o(j.mo5931a(kVar), a2) && j.mo5965A0(a2) == 0) || j.mo5956F(j.mo5931a(kVar2))) {
            return true;
        }
        List<AbstractC9620k> l = fVar.m23122l(f1Var, kVar, a2);
        int i = 10;
        t = C9907k.m14809t(l, 10);
        ArrayList<AbstractC9620k> arrayList = new ArrayList(t);
        for (AbstractC9620k kVar3 : l) {
            AbstractC9620k f = j.mo5921f(f1Var.m23086o(kVar3));
            if (f != null) {
                kVar3 = f;
            }
            arrayList.add(kVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f15681a.m23120n(f1Var, kVar);
        }
        if (size != 1) {
            C9610a aVar = new C9610a(j.mo5965A0(a2));
            int A0 = j.mo5965A0(a2);
            int i2 = 0;
            boolean z4 = false;
            while (i2 < A0) {
                if (z4 || j.mo5910k0(j.mo5942P(a2, i2)) != EnumC9631u.OUT) {
                    z4 = z3;
                } else {
                    z4 = z2;
                }
                if (!z4) {
                    t2 = C9907k.m14809t(arrayList, i);
                    List<? extends AbstractC9618i> arrayList2 = new ArrayList<>(t2);
                    for (AbstractC9620k kVar4 : arrayList) {
                        AbstractC9622m q0 = j.mo5898q0(kVar4, i2);
                        if (q0 != null) {
                            if (j.mo5885x(q0) == EnumC9631u.INV) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                q0 = null;
                            }
                            if (!(q0 == null || (Z = j.mo5932Z(q0)) == null)) {
                                arrayList2.add(Z);
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + kVar4 + ", subType: " + kVar + ", superType: " + kVar2).toString());
                    }
                    aVar.add(j.mo5922e0(j.mo5920f0(arrayList2)));
                }
                i2++;
                z2 = false;
                z3 = true;
                i = 10;
            }
            if (z4 || !f15681a.m23117q(f1Var, aVar, kVar2)) {
                return f1Var.m23084q(new C7243b(arrayList, f1Var, j, kVar2));
            }
            return true;
        }
        C7241f fVar2 = f15681a;
        U = C9914r.m14770U(arrayList);
        return fVar2.m23117q(f1Var, j.mo5896r0((AbstractC9620k) U), kVar2);
    }

    /* renamed from: v */
    private final boolean m23112v(AbstractC9625p pVar, AbstractC9618i iVar, AbstractC9618i iVar2, AbstractC9623n nVar) {
        AbstractC9630t tVar;
        AbstractC9624o s0;
        AbstractC9620k f = pVar.mo5921f(iVar);
        if (!(f instanceof AbstractC9613d)) {
            return false;
        }
        AbstractC9613d dVar = (AbstractC9613d) f;
        if (pVar.mo5930a0(dVar) || !pVar.mo5948J(pVar.mo5960D(pVar.mo5899q(dVar))) || pVar.mo5963B0(dVar) != EnumC9611b.FOR_SUBTYPING) {
            return false;
        }
        AbstractC9623n O = pVar.mo5943O(iVar2);
        if (O instanceof AbstractC9630t) {
            tVar = (AbstractC9630t) O;
        } else {
            tVar = null;
        }
        if (tVar == null || (s0 = pVar.mo5894s0(tVar)) == null || !pVar.mo5918g0(s0, nVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private final List<AbstractC9620k> m23111w(C7250f1 f1Var, List<? extends AbstractC9620k> list) {
        boolean z;
        AbstractC9625p j = f1Var.m23091j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AbstractC9621l r0 = j.mo5896r0((AbstractC9620k) next);
            int V = j.mo5936V(r0);
            int i = 0;
            while (true) {
                if (i >= V) {
                    break;
                }
                if (j.mo5950I(j.mo5932Z(j.mo5911k(r0, i))) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
                i++;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return list;
    }

    /* renamed from: j */
    public final EnumC9631u m23124j(EnumC9631u declared, EnumC9631u useSite) {
        C9971q.m14633g(declared, "declared");
        C9971q.m14633g(useSite, "useSite");
        EnumC9631u uVar = EnumC9631u.INV;
        if (declared == uVar) {
            return useSite;
        }
        if (useSite == uVar) {
            return declared;
        }
        if (declared == useSite) {
            return declared;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m23123k(C7250f1 state, AbstractC9618i a, AbstractC9618i b) {
        C9971q.m14633g(state, "state");
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        AbstractC9625p j = state.m23091j();
        if (a == b) {
            return true;
        }
        C7241f fVar = f15681a;
        if (fVar.m23119o(j, a) && fVar.m23119o(j, b)) {
            AbstractC9618i o = state.m23086o(state.m23085p(a));
            AbstractC9618i o2 = state.m23086o(state.m23085p(b));
            AbstractC9620k m = j.mo5907m(o);
            if (!j.mo5903o(j.mo5943O(o), j.mo5943O(o2))) {
                return false;
            }
            if (j.mo5900p0(m) == 0) {
                if (j.mo5957E0(o) || j.mo5957E0(o2) || j.mo5880z0(m) == j.mo5880z0(j.mo5907m(o2))) {
                    return true;
                }
                return false;
            }
        }
        if (!m23114t(fVar, state, a, b, false, 8, null) || !m23114t(fVar, state, b, a, false, 8, null)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final List<AbstractC9620k> m23122l(C7250f1 state, AbstractC9620k subType, AbstractC9623n superConstructor) {
        String e0;
        C7250f1.AbstractC7253c cVar;
        C9971q.m14633g(state, "state");
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superConstructor, "superConstructor");
        AbstractC9625p j = state.m23091j();
        if (j.mo5914i0(subType)) {
            return f15681a.m23126h(state, subType, superConstructor);
        }
        if (!(j.mo5924d0(superConstructor) || j.mo5966A(superConstructor))) {
            return f15681a.m23127g(state, subType, superConstructor);
        }
        C11768e<AbstractC9620k> eVar = new C11768e();
        state.m23090k();
        ArrayDeque<AbstractC9620k> h = state.m23093h();
        C9971q.m14636d(h);
        Set<AbstractC9620k> i = state.m23092i();
        C9971q.m14636d(i);
        h.push(subType);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                AbstractC9620k current = h.pop();
                C9971q.m14634f(current, "current");
                if (i.add(current)) {
                    if (j.mo5914i0(current)) {
                        eVar.add(current);
                        cVar = C7250f1.AbstractC7253c.C0224c.f15716a;
                    } else {
                        cVar = C7250f1.AbstractC7253c.C7255b.f15715a;
                    }
                    if (!(!C9971q.m14638b(cVar, C7250f1.AbstractC7253c.C0224c.f15716a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        AbstractC9625p j2 = state.m23091j();
                        for (AbstractC9618i iVar : j2.mo5906m0(j2.mo5931a(current))) {
                            h.add(cVar.mo21709a(state, iVar));
                        }
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(subType);
                sb2.append(". Supertypes = ");
                e0 = C9914r.m14760e0(i, null, null, null, 0, null, null, 63, null);
                sb2.append(e0);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        state.m23095e();
        ArrayList arrayList = new ArrayList();
        for (AbstractC9620k it : eVar) {
            C7241f fVar = f15681a;
            C9971q.m14634f(it, "it");
            C9911o.m14801y(arrayList, fVar.m23126h(state, it, superConstructor));
        }
        return arrayList;
    }

    /* renamed from: q */
    public final boolean m23117q(C7250f1 f1Var, AbstractC9621l capturedSubArguments, AbstractC9620k superType) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        C9971q.m14633g(f1Var, "<this>");
        C9971q.m14633g(capturedSubArguments, "capturedSubArguments");
        C9971q.m14633g(superType, "superType");
        AbstractC9625p j = f1Var.m23091j();
        AbstractC9623n a = j.mo5931a(superType);
        int V = j.mo5936V(capturedSubArguments);
        int A0 = j.mo5965A0(a);
        if (!(V == A0 && V == j.mo5900p0(superType))) {
            return false;
        }
        for (int i4 = 0; i4 < A0; i4++) {
            AbstractC9622m D0 = j.mo5959D0(superType, i4);
            if (!j.mo5948J(D0)) {
                AbstractC9618i Z = j.mo5932Z(D0);
                AbstractC9622m k = j.mo5911k(capturedSubArguments, i4);
                j.mo5885x(k);
                EnumC9631u uVar = EnumC9631u.INV;
                AbstractC9618i Z2 = j.mo5932Z(k);
                C7241f fVar = f15681a;
                EnumC9631u j2 = fVar.m23124j(j.mo5910k0(j.mo5942P(a, i4)), j.mo5885x(D0));
                if (j2 == null) {
                    return f1Var.m23088m();
                }
                if (j2 != uVar || (!fVar.m23112v(j, Z2, Z, a) && !fVar.m23112v(j, Z, Z2, a))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    continue;
                } else {
                    i = f1Var.f15706g;
                    if (i <= 100) {
                        i2 = f1Var.f15706g;
                        f1Var.f15706g = i2 + 1;
                        int i5 = C7242a.f15683a[j2.ordinal()];
                        if (i5 == 1) {
                            z2 = fVar.m23123k(f1Var, Z2, Z);
                        } else if (i5 == 2) {
                            z2 = m23114t(fVar, f1Var, Z2, Z, false, 8, null);
                        } else if (i5 == 3) {
                            z2 = m23114t(fVar, f1Var, Z, Z2, false, 8, null);
                        } else {
                            throw new C11088q();
                        }
                        i3 = f1Var.f15706g;
                        f1Var.f15706g = i3 - 1;
                        if (!z2) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + Z2).toString());
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m23116r(C7250f1 state, AbstractC9618i subType, AbstractC9618i superType) {
        C9971q.m14633g(state, "state");
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superType, "superType");
        return m23114t(this, state, subType, superType, false, 8, null);
    }

    /* renamed from: s */
    public final boolean m23115s(C7250f1 state, AbstractC9618i subType, AbstractC9618i superType, boolean z) {
        C9971q.m14633g(state, "state");
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (!state.mo5879f(subType, superType)) {
            return false;
        }
        return m23125i(state, subType, superType, z);
    }
}
