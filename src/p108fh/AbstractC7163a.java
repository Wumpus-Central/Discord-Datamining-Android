package p108fh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9899f;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import ng.C11105c;
import p182ji.AbstractC9616g;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9619j;
import p182ji.AbstractC9622m;
import p182ji.AbstractC9623n;
import p182ji.AbstractC9624o;
import p182ji.AbstractC9625p;
import p249nh.C11138d;
import p427xg.AbstractC14104a;
import p427xg.C14164y;
import p427xg.EnumC14107b;

/* renamed from: fh.a */
/* loaded from: classes8.dex */
public abstract class AbstractC7163a<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fh.a$a */
    /* loaded from: classes8.dex */
    public static final class C0220a {

        /* renamed from: a */
        private final AbstractC9618i f15563a;

        /* renamed from: b */
        private final C14164y f15564b;

        /* renamed from: c */
        private final AbstractC9624o f15565c;

        public C0220a(AbstractC9618i iVar, C14164y yVar, AbstractC9624o oVar) {
            this.f15563a = iVar;
            this.f15564b = yVar;
            this.f15565c = oVar;
        }

        /* renamed from: a */
        public final C14164y m23304a() {
            return this.f15564b;
        }

        /* renamed from: b */
        public final AbstractC9618i m23303b() {
            return this.f15563a;
        }

        /* renamed from: c */
        public final AbstractC9624o m23302c() {
            return this.f15565c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.a$b */
    /* loaded from: classes8.dex */
    public static final class C7164b extends AbstractC9973s implements Function1<Integer, C7172e> {

        /* renamed from: k */
        final /* synthetic */ C7218q f15566k;

        /* renamed from: l */
        final /* synthetic */ C7172e[] f15567l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7164b(C7218q qVar, C7172e[] eVarArr) {
            super(1);
            this.f15566k = qVar;
            this.f15567l = eVarArr;
        }

        /* renamed from: a */
        public final C7172e m23301a(int i) {
            int I;
            Map<Integer, C7172e> a;
            C7172e eVar;
            C7218q qVar = this.f15566k;
            if (qVar != null && (a = qVar.m23190a()) != null && (eVar = a.get(Integer.valueOf(i))) != null) {
                return eVar;
            }
            C7172e[] eVarArr = this.f15567l;
            if (i >= 0) {
                I = C9899f.m14956I(eVarArr);
                if (i <= I) {
                    return eVarArr[i];
                }
            }
            return C7172e.f15579e.m23281a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C7172e invoke(Integer num) {
            return m23301a(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.a$c */
    /* loaded from: classes8.dex */
    public static final class C7165c extends AbstractC9973s implements Function1<TAnnotation, Boolean> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7163a<TAnnotation> f15568k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7165c(AbstractC7163a<TAnnotation> aVar) {
            super(1);
            this.f15568k = aVar;
        }

        /* renamed from: a */
        public final Boolean invoke(TAnnotation extractNullability) {
            C9971q.m14633g(extractNullability, "$this$extractNullability");
            return Boolean.valueOf(this.f15568k.mo23200r(extractNullability));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.a$d */
    /* loaded from: classes8.dex */
    public static final class C7166d extends AbstractC9973s implements Function1<C0220a, Iterable<? extends C0220a>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7163a<TAnnotation> f15569k;

        /* renamed from: l */
        final /* synthetic */ AbstractC9625p f15570l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7166d(AbstractC7163a<TAnnotation> aVar, AbstractC9625p pVar) {
            super(1);
            this.f15569k = aVar;
            this.f15570l = pVar;
        }

        /* renamed from: a */
        public final Iterable<C0220a> invoke(C0220a it) {
            AbstractC9623n O;
            List<AbstractC9624o> C0;
            int t;
            int t2;
            C0220a aVar;
            AbstractC9619j jVar;
            AbstractC9616g I;
            C9971q.m14633g(it, "it");
            if (this.f15569k.mo23198u()) {
                AbstractC9618i b = it.m23303b();
                if (b == null || (I = this.f15570l.mo5950I(b)) == null) {
                    jVar = null;
                } else {
                    jVar = this.f15570l.mo5945M(I);
                }
                if (jVar != null) {
                    return null;
                }
            }
            AbstractC9618i b2 = it.m23303b();
            if (b2 == null || (O = this.f15570l.mo5943O(b2)) == null || (C0 = this.f15570l.mo5961C0(O)) == null) {
                return null;
            }
            List<AbstractC9622m> S = this.f15570l.mo5939S(it.m23303b());
            AbstractC9625p pVar = this.f15570l;
            AbstractC7163a<TAnnotation> aVar2 = this.f15569k;
            Iterator<T> it2 = C0.iterator();
            Iterator<T> it3 = S.iterator();
            t = C9907k.m14809t(C0, 10);
            t2 = C9907k.m14809t(S, 10);
            ArrayList arrayList = new ArrayList(Math.min(t, t2));
            while (it2.hasNext() && it3.hasNext()) {
                Object next = it2.next();
                AbstractC9622m mVar = (AbstractC9622m) it3.next();
                AbstractC9624o oVar = (AbstractC9624o) next;
                if (pVar.mo5948J(mVar)) {
                    aVar = new C0220a(null, it.m23304a(), oVar);
                } else {
                    AbstractC9618i Z = pVar.mo5932Z(mVar);
                    aVar = new C0220a(Z, aVar2.m23312c(Z, it.m23304a()), oVar);
                }
                arrayList.add(aVar);
            }
            return arrayList;
        }
    }

    /* renamed from: B */
    private final C7177i m23316B(C7177i iVar, C7177i iVar2) {
        if (iVar == null) {
            return iVar2;
        }
        if (iVar2 == null) {
            return iVar;
        }
        if (iVar.m23272d() && !iVar2.m23272d()) {
            return iVar2;
        }
        if (!iVar.m23272d() && iVar2.m23272d()) {
            return iVar;
        }
        if (iVar.m23273c().compareTo(iVar2.m23273c()) < 0) {
            return iVar2;
        }
        if (iVar.m23273c().compareTo(iVar2.m23273c()) > 0) {
            return iVar;
        }
        return iVar2;
    }

    /* renamed from: C */
    private final List<C0220a> m23315C(AbstractC9618i iVar) {
        return m23309f(new C0220a(iVar, m23312c(iVar, mo23204m()), null), new C7166d(this, mo23197v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final C14164y m23312c(AbstractC9618i iVar, C14164y yVar) {
        return mo23208h().m1666c(yVar, mo23207i(iVar));
    }

    /* renamed from: d */
    private final C7172e m23311d(AbstractC9618i iVar) {
        EnumC7176h hVar;
        boolean z;
        EnumC7176h t = m23305t(iVar);
        EnumC7174f fVar = null;
        if (t == null) {
            AbstractC9618i p = mo23201p(iVar);
            if (p != null) {
                hVar = m23305t(p);
            } else {
                hVar = null;
            }
        } else {
            hVar = t;
        }
        AbstractC9625p v = mo23197v();
        C11105c cVar = C11105c.f24626a;
        if (cVar.m10898l(mo23199s(v.mo5907m(iVar)))) {
            fVar = EnumC7174f.READ_ONLY;
        } else if (cVar.m10899k(mo23199s(v.mo5891u(iVar)))) {
            fVar = EnumC7174f.MUTABLE;
        }
        boolean z2 = false;
        if (mo23197v().mo5944N(iVar) || mo23213A(iVar)) {
            z = true;
        } else {
            z = false;
        }
        if (hVar != t) {
            z2 = true;
        }
        return new C7172e(hVar, fVar, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x012a, code lost:
        if (r0 != false) goto L_0x012f;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0154  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p108fh.C7172e m23310e(p108fh.AbstractC7163a.C0220a r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p108fh.AbstractC7163a.m23310e(fh.a$a):fh.e");
    }

    /* renamed from: f */
    private final <T> List<T> m23309f(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        m23308g(t, arrayList, function1);
        return arrayList;
    }

    /* renamed from: g */
    private final <T> void m23308g(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<T> iterable = (Iterable) function1.invoke(t);
        if (iterable != null) {
            for (T t2 : iterable) {
                m23308g(t2, list, function1);
            }
        }
    }

    /* renamed from: j */
    private final C7177i m23307j(AbstractC9624o oVar) {
        boolean z;
        boolean z2;
        List<AbstractC9618i> list;
        boolean z3;
        EnumC7176h hVar;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC9625p v = mo23197v();
        C7177i iVar = null;
        if (!mo23193z(oVar)) {
            return null;
        }
        List<AbstractC9618i> r = v.mo5897r(oVar);
        boolean z7 = r instanceof Collection;
        boolean z8 = false;
        if (!z7 || !r.isEmpty()) {
            for (AbstractC9618i iVar2 : r) {
                if (!v.mo5938T(iVar2)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        if (!z7 || !r.isEmpty()) {
            for (AbstractC9618i iVar3 : r) {
                if (m23305t(iVar3) != null) {
                    z6 = true;
                    continue;
                } else {
                    z6 = false;
                    continue;
                }
                if (z6) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            list = r;
        } else {
            if (!z7 || !r.isEmpty()) {
                for (AbstractC9618i iVar4 : r) {
                    if (mo23201p(iVar4) != null) {
                        z5 = true;
                        continue;
                    } else {
                        z5 = false;
                        continue;
                    }
                    if (z5) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
            if (z4) {
                list = new ArrayList<>();
                for (AbstractC9618i iVar5 : r) {
                    AbstractC9618i p = mo23201p(iVar5);
                    if (p != null) {
                        list.add(p);
                    }
                }
            }
            return iVar;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AbstractC9618i iVar6 : list) {
                if (!v.mo5908l0(iVar6)) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        if (z3) {
            hVar = EnumC7176h.NULLABLE;
        } else {
            hVar = EnumC7176h.NOT_NULL;
        }
        if (list != r) {
            z8 = true;
        }
        iVar = new C7177i(hVar, z8);
        return iVar;
    }

    /* renamed from: t */
    private final EnumC7176h m23305t(AbstractC9618i iVar) {
        AbstractC9625p v = mo23197v();
        if (v.mo5880z0(v.mo5907m(iVar))) {
            return EnumC7176h.NULLABLE;
        }
        if (!v.mo5880z0(v.mo5891u(iVar))) {
            return EnumC7176h.NOT_NULL;
        }
        return null;
    }

    /* renamed from: A */
    public abstract boolean mo23213A(AbstractC9618i iVar);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r10 != false) goto L_0x006b;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, p108fh.C7172e> m23313b(p182ji.AbstractC9618i r10, java.lang.Iterable<? extends p182ji.AbstractC9618i> r11, p108fh.C7218q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9971q.m14633g(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.C9971q.m14633g(r11, r0)
            java.util.List r0 = r9.m23315C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C9904h.m14841t(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            ji.i r3 = (p182ji.AbstractC9618i) r3
            java.util.List r3 = r9.m23315C(r3)
            r1.add(r3)
            goto L_0x001d
        L_0x0031:
            boolean r2 = r9.m23306q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x006b
            boolean r2 = r9.mo23195x()
            if (r2 == 0) goto L_0x0069
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L_0x004e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x004e
        L_0x004c:
            r10 = r3
            goto L_0x0066
        L_0x004e:
            java.util.Iterator r11 = r11.iterator()
        L_0x0052:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r11.next()
            ji.i r2 = (p182ji.AbstractC9618i) r2
            boolean r2 = r9.mo23194y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0052
            r10 = r4
        L_0x0066:
            if (r10 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r10 = r3
            goto L_0x006c
        L_0x006b:
            r10 = r4
        L_0x006c:
            if (r10 == 0) goto L_0x0070
            r10 = r4
            goto L_0x0074
        L_0x0070:
            int r10 = r0.size()
        L_0x0074:
            fh.e[] r11 = new p108fh.C7172e[r10]
            r2 = r3
        L_0x0077:
            if (r2 >= r10) goto L_0x00d1
            java.lang.Object r5 = r0.get(r2)
            fh.a$a r5 = (p108fh.AbstractC7163a.C0220a) r5
            fh.e r5 = r9.m23310e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x008c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.C9904h.m14875X(r8, r2)
            fh.a$a r8 = (p108fh.AbstractC7163a.C0220a) r8
            if (r8 == 0) goto L_0x00ab
            ji.i r8 = r8.m23303b()
            if (r8 == 0) goto L_0x00ab
            fh.e r8 = r9.m23311d(r8)
            goto L_0x00ac
        L_0x00ab:
            r8 = 0
        L_0x00ac:
            if (r8 == 0) goto L_0x008c
            r6.add(r8)
            goto L_0x008c
        L_0x00b2:
            if (r2 != 0) goto L_0x00bc
            boolean r7 = r9.mo23195x()
            if (r7 == 0) goto L_0x00bc
            r7 = r4
            goto L_0x00bd
        L_0x00bc:
            r7 = r3
        L_0x00bd:
            if (r2 != 0) goto L_0x00c7
            boolean r8 = r9.mo23203n()
            if (r8 == 0) goto L_0x00c7
            r8 = r4
            goto L_0x00c8
        L_0x00c7:
            r8 = r3
        L_0x00c8:
            fh.e r5 = p108fh.C7221s.m23180a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L_0x0077
        L_0x00d1:
            fh.a$b r10 = new fh.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p108fh.AbstractC7163a.m23313b(ji.i, java.lang.Iterable, fh.q, boolean):kotlin.jvm.functions.Function1");
    }

    /* renamed from: h */
    public abstract AbstractC14104a<TAnnotation> mo23208h();

    /* renamed from: i */
    public abstract Iterable<TAnnotation> mo23207i(AbstractC9618i iVar);

    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo23206k();

    /* renamed from: l */
    public abstract EnumC14107b mo23205l();

    /* renamed from: m */
    public abstract C14164y mo23204m();

    /* renamed from: n */
    public abstract boolean mo23203n();

    /* renamed from: o */
    public abstract boolean mo23202o();

    /* renamed from: p */
    public abstract AbstractC9618i mo23201p(AbstractC9618i iVar);

    /* renamed from: q */
    public boolean m23306q() {
        return false;
    }

    /* renamed from: r */
    public abstract boolean mo23200r(TAnnotation tannotation);

    /* renamed from: s */
    public abstract C11138d mo23199s(AbstractC9618i iVar);

    /* renamed from: u */
    public abstract boolean mo23198u();

    /* renamed from: v */
    public abstract AbstractC9625p mo23197v();

    /* renamed from: w */
    public abstract boolean mo23196w(AbstractC9618i iVar);

    /* renamed from: x */
    public abstract boolean mo23195x();

    /* renamed from: y */
    public abstract boolean mo23194y(AbstractC9618i iVar, AbstractC9618i iVar2);

    /* renamed from: z */
    public abstract boolean mo23193z(AbstractC9624o oVar);
}
