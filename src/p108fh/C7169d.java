package p108fh;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7232c1;
import fi.C7235d0;
import fi.C7236d1;
import fi.C7270h0;
import fi.C7321s0;
import fi.C7322s1;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p013ah.AbstractC1392c;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import pg.AbstractC11672g;

/* renamed from: fh.d */
/* loaded from: classes8.dex */
public final class C7169d {

    /* renamed from: a */
    private final AbstractC1392c f15573a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fh.d$a */
    /* loaded from: classes8.dex */
    public static final class C7170a {

        /* renamed from: a */
        private final AbstractC7267g0 f15574a;

        /* renamed from: b */
        private final int f15575b;

        public C7170a(AbstractC7267g0 g0Var, int i) {
            this.f15574a = g0Var;
            this.f15575b = i;
        }

        /* renamed from: a */
        public final int m23291a() {
            return this.f15575b;
        }

        /* renamed from: b */
        public final AbstractC7267g0 m23290b() {
            return this.f15574a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fh.d$b */
    /* loaded from: classes8.dex */
    public static final class C7171b {

        /* renamed from: a */
        private final AbstractC7304o0 f15576a;

        /* renamed from: b */
        private final int f15577b;

        /* renamed from: c */
        private final boolean f15578c;

        public C7171b(AbstractC7304o0 o0Var, int i, boolean z) {
            this.f15576a = o0Var;
            this.f15577b = i;
            this.f15578c = z;
        }

        /* renamed from: a */
        public final boolean m23289a() {
            return this.f15578c;
        }

        /* renamed from: b */
        public final int m23288b() {
            return this.f15577b;
        }

        /* renamed from: c */
        public final AbstractC7304o0 m23287c() {
            return this.f15576a;
        }
    }

    public C7169d(AbstractC1392c javaResolverSettings) {
        C9971q.m14633g(javaResolverSettings, "javaResolverSettings");
        this.f15573a = javaResolverSettings;
    }

    /* renamed from: b */
    private final C7171b m23295b(AbstractC7304o0 o0Var, Function1<? super Integer, C7172e> function1, int i, EnumC7216o oVar, boolean z, boolean z2) {
        boolean z3;
        AbstractC11326h f;
        Boolean h;
        AbstractC7268g1 g1Var;
        int t;
        int t2;
        C7168c cVar;
        boolean z4;
        boolean z5;
        AbstractC11672g gVar;
        List n;
        AbstractC11672g e;
        int t3;
        int t4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        C7170a aVar;
        AbstractC7290k1 k1Var;
        Function1<? super Integer, C7172e> function12 = function1;
        boolean a = C7217p.m23191a(oVar);
        if (!z2 || !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC7267g0 g0Var = null;
        if (!a && o0Var.mo5174L0().isEmpty()) {
            return new C7171b(null, 1, false);
        }
        AbstractC11326h p = o0Var.mo5172N0().mo4565p();
        if (p == null) {
            return new C7171b(null, 1, false);
        }
        C7172e invoke = function12.invoke(Integer.valueOf(i));
        f = C7219r.m23184f(p, invoke, oVar);
        h = C7219r.m23182h(invoke, oVar);
        if (f == null || (g1Var = f.mo6111k()) == null) {
            g1Var = o0Var.mo5172N0();
        }
        C9971q.m14634f(g1Var, "enhancedClassifier?.typeConstructor ?: constructor");
        int i2 = i + 1;
        List<AbstractC7290k1> L0 = o0Var.mo5174L0();
        List<AbstractC11319f1> parameters = g1Var.getParameters();
        C9971q.m14634f(parameters, "typeConstructor.parameters");
        Iterator<T> it = L0.iterator();
        Iterator<T> it2 = parameters.iterator();
        t = C9907k.m14809t(L0, 10);
        t2 = C9907k.m14809t(parameters, 10);
        ArrayList<AbstractC7290k1> arrayList = new ArrayList(Math.min(t, t2));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            AbstractC11319f1 f1Var = (AbstractC11319f1) it2.next();
            AbstractC7290k1 k1Var2 = (AbstractC7290k1) next;
            if (!z3) {
                z10 = z3;
                aVar = new C7170a(g0Var, 0);
            } else {
                z10 = z3;
                if (!k1Var2.mo22907a()) {
                    aVar = m23293d(k1Var2.getType().mo22868Q0(), function12, i2, z2);
                } else if (function12.invoke(Integer.valueOf(i2)).m23283d() == EnumC7176h.FORCE_FLEXIBILITY) {
                    AbstractC7335v1 Q0 = k1Var2.getType().mo22868Q0();
                    aVar = new C7170a(C7270h0.m23056d(C7235d0.m23143c(Q0).mo5166U0(false), C7235d0.m23142d(Q0).mo5166U0(true)), 1);
                } else {
                    aVar = new C7170a(null, 1);
                }
            }
            i2 += aVar.m23291a();
            if (aVar.m23290b() != null) {
                AbstractC7267g0 b = aVar.m23290b();
                EnumC7338w1 b2 = k1Var2.mo22906b();
                C9971q.m14634f(b2, "arg.projectionKind");
                k1Var = C9883a.m15099f(b, b2, f1Var);
            } else if (f != null && !k1Var2.mo22907a()) {
                AbstractC7267g0 type = k1Var2.getType();
                C9971q.m14634f(type, "arg.type");
                EnumC7338w1 b3 = k1Var2.mo22906b();
                C9971q.m14634f(b3, "arg.projectionKind");
                k1Var = C9883a.m15099f(type, b3, f1Var);
            } else if (f != null) {
                k1Var = C7322s1.m22928s(f1Var);
            } else {
                k1Var = null;
            }
            arrayList.add(k1Var);
            function12 = function1;
            z3 = z10;
            g0Var = null;
        }
        int i3 = i2 - i;
        if (f == null && h == null) {
            if (!arrayList.isEmpty()) {
                for (AbstractC7290k1 k1Var3 : arrayList) {
                    if (k1Var3 == null) {
                        z9 = true;
                        continue;
                    } else {
                        z9 = false;
                        continue;
                    }
                    if (!z9) {
                        z8 = false;
                        break;
                    }
                }
            }
            z8 = true;
            if (z8) {
                return new C7171b(null, i3, false);
            }
        }
        AbstractC11672g[] gVarArr = new AbstractC11672g[3];
        gVarArr[0] = o0Var.getAnnotations();
        cVar = C7219r.f15659b;
        if (f != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            cVar = null;
        }
        gVarArr[1] = cVar;
        AbstractC11672g g = C7219r.m23183g();
        if (h != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            gVar = g;
        } else {
            gVar = null;
        }
        gVarArr[2] = gVar;
        n = C9906j.m14815n(gVarArr);
        e = C7219r.m23185e(n);
        C7232c1 b4 = C7236d1.m23140b(e);
        List<AbstractC7290k1> L02 = o0Var.mo5174L0();
        Iterator it3 = arrayList.iterator();
        Iterator<T> it4 = L02.iterator();
        t3 = C9907k.m14809t(arrayList, 10);
        t4 = C9907k.m14809t(L02, 10);
        ArrayList arrayList2 = new ArrayList(Math.min(t3, t4));
        while (it3.hasNext() && it4.hasNext()) {
            Object next2 = it3.next();
            AbstractC7290k1 k1Var4 = (AbstractC7290k1) it4.next();
            AbstractC7290k1 k1Var5 = (AbstractC7290k1) next2;
            if (k1Var5 != null) {
                k1Var4 = k1Var5;
            }
            arrayList2.add(k1Var4);
        }
        if (h != null) {
            z6 = h.booleanValue();
        } else {
            z6 = o0Var.mo5171O0();
        }
        AbstractC7304o0 j = C7270h0.m23050j(b4, g1Var, arrayList2, z6, null, 16, null);
        if (invoke.m23285b()) {
            j = m23292e(j);
        }
        if (h == null || !invoke.m23282e()) {
            z7 = false;
        } else {
            z7 = true;
        }
        return new C7171b(j, i3, z7);
    }

    /* renamed from: c */
    static /* synthetic */ C7171b m23294c(C7169d dVar, AbstractC7304o0 o0Var, Function1 function1, int i, EnumC7216o oVar, boolean z, boolean z2, int i2, Object obj) {
        return dVar.m23295b(o0Var, function1, i, oVar, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p108fh.C7169d.C7170a m23293d(fi.AbstractC7335v1 r12, kotlin.jvm.functions.Function1<? super java.lang.Integer, p108fh.C7172e> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = fi.C7278i0.m23035a(r12)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            fh.d$a r12 = new fh.d$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        L_0x000e:
            boolean r0 = r12 instanceof fi.AbstractC7223a0
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r12 instanceof fi.AbstractC7298n0
            r9 = r12
            fi.a0 r9 = (fi.AbstractC7223a0) r9
            fi.o0 r3 = r9.m23170V0()
            fh.o r6 = p108fh.EnumC7216o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            fh.d$b r10 = r2.m23295b(r3, r4, r5, r6, r7, r8)
            fi.o0 r3 = r9.m23169W0()
            fh.o r6 = p108fh.EnumC7216o.FLEXIBLE_UPPER
            fh.d$b r13 = r2.m23295b(r3, r4, r5, r6, r7, r8)
            r10.m23288b()
            r13.m23288b()
            fi.o0 r14 = r10.m23287c()
            if (r14 != 0) goto L_0x0043
            fi.o0 r14 = r13.m23287c()
            if (r14 != 0) goto L_0x0043
            goto L_0x00a3
        L_0x0043:
            boolean r14 = r10.m23289a()
            if (r14 != 0) goto L_0x0085
            boolean r14 = r13.m23289a()
            if (r14 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            if (r0 == 0) goto L_0x006c
            ch.h r1 = new ch.h
            fi.o0 r12 = r10.m23287c()
            if (r12 != 0) goto L_0x005e
            fi.o0 r12 = r9.m23170V0()
        L_0x005e:
            fi.o0 r13 = r13.m23287c()
            if (r13 != 0) goto L_0x0068
            fi.o0 r13 = r9.m23169W0()
        L_0x0068:
            r1.<init>(r12, r13)
            goto L_0x00a3
        L_0x006c:
            fi.o0 r12 = r10.m23287c()
            if (r12 != 0) goto L_0x0076
            fi.o0 r12 = r9.m23170V0()
        L_0x0076:
            fi.o0 r13 = r13.m23287c()
            if (r13 != 0) goto L_0x0080
            fi.o0 r13 = r9.m23169W0()
        L_0x0080:
            fi.v1 r1 = fi.C7270h0.m23056d(r12, r13)
            goto L_0x00a3
        L_0x0085:
            fi.o0 r13 = r13.m23287c()
            if (r13 == 0) goto L_0x0098
            fi.o0 r14 = r10.m23287c()
            if (r14 != 0) goto L_0x0092
            r14 = r13
        L_0x0092:
            fi.v1 r13 = fi.C7270h0.m23056d(r14, r13)
            if (r13 != 0) goto L_0x009f
        L_0x0098:
            fi.o0 r13 = r10.m23287c()
            kotlin.jvm.internal.C9971q.m14636d(r13)
        L_0x009f:
            fi.v1 r1 = fi.C7331u1.m22898d(r12, r13)
        L_0x00a3:
            fh.d$a r12 = new fh.d$a
            int r13 = r10.m23288b()
            r12.<init>(r1, r13)
            goto L_0x00df
        L_0x00ad:
            boolean r0 = r12 instanceof fi.AbstractC7304o0
            if (r0 == 0) goto L_0x00e0
            r2 = r12
            fi.o0 r2 = (fi.AbstractC7304o0) r2
            fh.o r5 = p108fh.EnumC7216o.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            fh.d$b r13 = m23294c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            fh.d$a r14 = new fh.d$a
            boolean r15 = r13.m23289a()
            if (r15 == 0) goto L_0x00d3
            fi.o0 r15 = r13.m23287c()
            fi.v1 r12 = fi.C7331u1.m22898d(r12, r15)
            goto L_0x00d7
        L_0x00d3:
            fi.o0 r12 = r13.m23287c()
        L_0x00d7:
            int r13 = r13.m23288b()
            r14.<init>(r12, r13)
            r12 = r14
        L_0x00df:
            return r12
        L_0x00e0:
            nf.q r12 = new nf.q
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p108fh.C7169d.m23293d(fi.v1, kotlin.jvm.functions.Function1, int, boolean):fh.d$a");
    }

    /* renamed from: e */
    private final AbstractC7304o0 m23292e(AbstractC7304o0 o0Var) {
        if (this.f15573a.mo41185a()) {
            return C7321s0.m22950h(o0Var, true);
        }
        return new C7175g(o0Var);
    }

    /* renamed from: a */
    public final AbstractC7267g0 m23296a(AbstractC7267g0 g0Var, Function1<? super Integer, C7172e> qualifiers, boolean z) {
        C9971q.m14633g(g0Var, "<this>");
        C9971q.m14633g(qualifiers, "qualifiers");
        return m23293d(g0Var.mo22868Q0(), qualifiers, 0, z).m23290b();
    }
}
