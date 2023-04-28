package p268og;

import fi.AbstractC7267g0;
import fi.C7336w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.C9921w;
import p233mi.AbstractC10644l;
import p268og.C11348m1;
import p286pi.C11754a;
import p324rg.AbstractC12611i0;
import p325rh.C12661e;
import p468zh.AbstractC14663g;
import p468zh.AbstractC14664h;
import p468zh.AbstractC14665i;

/* renamed from: og.t */
/* loaded from: classes8.dex */
public class C11373t {

    /* renamed from: a */
    public static final AbstractC11387u f25295a;

    /* renamed from: b */
    public static final AbstractC11387u f25296b;

    /* renamed from: c */
    public static final AbstractC11387u f25297c;

    /* renamed from: d */
    public static final AbstractC11387u f25298d;

    /* renamed from: e */
    public static final AbstractC11387u f25299e;

    /* renamed from: f */
    public static final AbstractC11387u f25300f;

    /* renamed from: g */
    public static final AbstractC11387u f25301g;

    /* renamed from: h */
    public static final AbstractC11387u f25302h;

    /* renamed from: i */
    public static final AbstractC11387u f25303i;

    /* renamed from: j */
    public static final Set<AbstractC11387u> f25304j;

    /* renamed from: k */
    private static final Map<AbstractC11387u, Integer> f25305k;

    /* renamed from: l */
    public static final AbstractC11387u f25306l;

    /* renamed from: m */
    private static final AbstractC14663g f25307m = new C11374a();

    /* renamed from: n */
    public static final AbstractC14663g f25308n = new C11375b();
    @Deprecated

    /* renamed from: o */
    public static final AbstractC14663g f25309o = new C11376c();

    /* renamed from: p */
    private static final AbstractC10644l f25310p;

    /* renamed from: q */
    private static final Map<AbstractC11362n1, AbstractC11387u> f25311q;

    /* renamed from: og.t$a */
    /* loaded from: classes8.dex */
    static class C11374a implements AbstractC14663g {
        C11374a() {
        }

        @Override // p468zh.AbstractC14663g
        public AbstractC7267g0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: og.t$b */
    /* loaded from: classes8.dex */
    static class C11375b implements AbstractC14663g {
        C11375b() {
        }

        @Override // p468zh.AbstractC14663g
        public AbstractC7267g0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: og.t$c */
    /* loaded from: classes8.dex */
    static class C11376c implements AbstractC14663g {
        C11376c() {
        }

        @Override // p468zh.AbstractC14663g
        public AbstractC7267g0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: og.t$d */
    /* loaded from: classes8.dex */
    static class C11377d extends AbstractC11369r {
        C11377d(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10165g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m10164h(AbstractC11346m mVar) {
            if (mVar == null) {
                m10165g(0);
            }
            if (C12661e.m6044j(mVar) != AbstractC11304b1.f25237a) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == 0) {
                m10165g(1);
            }
            if (mVar == null) {
                m10165g(2);
            }
            if (C12661e.m6057J(qVar) && m10164h(mVar)) {
                return C11373t.m10170f(qVar, mVar);
            }
            if (qVar instanceof AbstractC11343l) {
                AbstractC11330i b = ((AbstractC11343l) qVar).mo6104b();
                if (z && C12661e.m6060G(b) && C12661e.m6057J(b) && (mVar instanceof AbstractC11343l) && C12661e.m6057J(mVar.mo6104b()) && C11373t.m10170f(qVar, mVar)) {
                    return true;
                }
            }
            while (qVar != 0) {
                qVar = qVar.mo6104b();
                if (qVar instanceof AbstractC11313e) {
                    if (!C12661e.m6030x(qVar)) {
                        break;
                    }
                }
                if (qVar instanceof AbstractC11344l0) {
                    break;
                }
            }
            if (qVar == 0) {
                return false;
            }
            while (mVar != null) {
                if (qVar == mVar) {
                    return true;
                }
                if (!(mVar instanceof AbstractC11344l0)) {
                    mVar = mVar.mo6104b();
                } else if (!(qVar instanceof AbstractC11344l0) || !((AbstractC11344l0) qVar).mo6103e().equals(((AbstractC11344l0) mVar).mo6103e()) || !C12661e.m6052b(mVar, qVar)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: og.t$e */
    /* loaded from: classes8.dex */
    static class C11378e extends AbstractC11369r {
        C11378e(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10163g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            AbstractC11346m q;
            if (qVar == null) {
                m10163g(0);
            }
            if (mVar == null) {
                m10163g(1);
            }
            if (C11373t.f25295a.mo1506e(gVar, qVar, mVar, z)) {
                if (gVar == C11373t.f25308n) {
                    return true;
                }
                if (!(gVar == C11373t.f25307m || (q = C12661e.m6037q(qVar, AbstractC11313e.class)) == null || !(gVar instanceof AbstractC14665i))) {
                    return ((AbstractC14665i) gVar).mo45t().mo6162a().equals(q.mo6162a());
                }
            }
            return false;
        }
    }

    /* renamed from: og.t$f */
    /* loaded from: classes8.dex */
    static class C11379f extends AbstractC11369r {
        C11379f(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10162g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m10161h(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11313e eVar) {
            AbstractC7267g0 g0Var;
            if (qVar == null) {
                m10162g(2);
            }
            if (eVar == null) {
                m10162g(3);
            }
            if (gVar == C11373t.f25309o) {
                return false;
            }
            if (!(qVar instanceof AbstractC11301b) || (qVar instanceof AbstractC11343l) || gVar == C11373t.f25308n) {
                return true;
            }
            if (gVar == C11373t.f25307m || gVar == null) {
                return false;
            }
            if (gVar instanceof AbstractC14664h) {
                g0Var = ((AbstractC14664h) gVar).m46b();
            } else {
                g0Var = gVar.getType();
            }
            if (C12661e.m6058I(g0Var, eVar) || C7336w.m22890a(g0Var)) {
                return true;
            }
            return false;
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            AbstractC11313e eVar;
            if (qVar == null) {
                m10162g(0);
            }
            if (mVar == null) {
                m10162g(1);
            }
            AbstractC11313e eVar2 = (AbstractC11313e) C12661e.m6037q(qVar, AbstractC11313e.class);
            AbstractC11313e eVar3 = (AbstractC11313e) C12661e.m6036r(mVar, AbstractC11313e.class, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && C12661e.m6030x(eVar2) && (eVar = (AbstractC11313e) C12661e.m6037q(eVar2, AbstractC11313e.class)) != null && C12661e.m6059H(eVar3, eVar)) {
                return true;
            }
            AbstractC11367q M = C12661e.m6054M(qVar);
            AbstractC11313e eVar4 = (AbstractC11313e) C12661e.m6037q(M, AbstractC11313e.class);
            if (eVar4 == null) {
                return false;
            }
            if (!C12661e.m6059H(eVar3, eVar4) || !m10161h(gVar, M, eVar3)) {
                return mo1506e(gVar, qVar, eVar3.mo6104b(), z);
            }
            return true;
        }
    }

    /* renamed from: og.t$g */
    /* loaded from: classes8.dex */
    static class C11380g extends AbstractC11369r {
        C11380g(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10160g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m10160g(0);
            }
            if (mVar == null) {
                m10160g(1);
            }
            if (!C12661e.m6047g(mVar).mo6137m0(C12661e.m6047g(qVar))) {
                return false;
            }
            return C11373t.f25310p.mo12697a(qVar, mVar);
        }
    }

    /* renamed from: og.t$h */
    /* loaded from: classes8.dex */
    static class C11381h extends AbstractC11369r {
        C11381h(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10159g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m10159g(0);
            }
            if (mVar == null) {
                m10159g(1);
            }
            return true;
        }
    }

    /* renamed from: og.t$i */
    /* loaded from: classes8.dex */
    static class C11382i extends AbstractC11369r {
        C11382i(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10158g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m10158g(0);
            }
            if (mVar == null) {
                m10158g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: og.t$j */
    /* loaded from: classes8.dex */
    static class C11383j extends AbstractC11369r {
        C11383j(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10157g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m10157g(0);
            }
            if (mVar == null) {
                m10157g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: og.t$k */
    /* loaded from: classes8.dex */
    static class C11384k extends AbstractC11369r {
        C11384k(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10156g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m10156g(0);
            }
            if (mVar == null) {
                m10156g(1);
            }
            return false;
        }
    }

    /* renamed from: og.t$l */
    /* loaded from: classes8.dex */
    static class C11385l extends AbstractC11369r {
        C11385l(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m10155g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m10155g(0);
            }
            if (mVar == null) {
                m10155g(1);
            }
            return false;
        }
    }

    static {
        Set i;
        AbstractC10644l lVar;
        C11377d dVar = new C11377d(C11348m1.C11353e.f25281c);
        f25295a = dVar;
        C11378e eVar = new C11378e(C11348m1.C11354f.f25282c);
        f25296b = eVar;
        C11379f fVar = new C11379f(C11348m1.C11355g.f25283c);
        f25297c = fVar;
        C11380g gVar = new C11380g(C11348m1.C11350b.f25278c);
        f25298d = gVar;
        C11381h hVar = new C11381h(C11348m1.C11356h.f25284c);
        f25299e = hVar;
        C11382i iVar = new C11382i(C11348m1.C11352d.f25280c);
        f25300f = iVar;
        C11383j jVar = new C11383j(C11348m1.C11349a.f25277c);
        f25301g = jVar;
        C11384k kVar = new C11384k(C11348m1.C11351c.f25279c);
        f25302h = kVar;
        C11385l lVar2 = new C11385l(C11348m1.C11357i.f25285c);
        f25303i = lVar2;
        i = C9921w.m14717i(dVar, eVar, gVar, iVar);
        f25304j = Collections.unmodifiableSet(i);
        HashMap e = C11754a.m8685e(4);
        e.put(eVar, 0);
        e.put(dVar, 0);
        e.put(gVar, 1);
        e.put(fVar, 1);
        e.put(hVar, 2);
        f25305k = Collections.unmodifiableMap(e);
        f25306l = hVar;
        Iterator it = ServiceLoader.load(AbstractC10644l.class, AbstractC10644l.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            lVar = (AbstractC10644l) it.next();
        } else {
            lVar = AbstractC10644l.C10645a.f23539a;
        }
        f25310p = lVar;
        f25311q = new HashMap();
        m10167i(dVar);
        m10167i(eVar);
        m10167i(fVar);
        m10167i(gVar);
        m10167i(hVar);
        m10167i(iVar);
        m10167i(jVar);
        m10167i(kVar);
        m10167i(lVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m10175a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L_0x0007
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0009
        L_0x0007:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L_0x0009:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto L_0x000f
            r4 = r2
            goto L_0x0010
        L_0x000f:
            r4 = r3
        L_0x0010:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L_0x003a
            if (r8 == r2) goto L_0x003a
            r2 = 5
            if (r8 == r2) goto L_0x003a
            r2 = 7
            if (r8 == r2) goto L_0x003a
            switch(r8) {
                case 9: goto L_0x003a;
                case 10: goto L_0x0035;
                case 11: goto L_0x0030;
                case 12: goto L_0x0035;
                case 13: goto L_0x0030;
                case 14: goto L_0x002b;
                case 15: goto L_0x002b;
                case 16: goto L_0x0028;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L_0x003e
        L_0x0028:
            r4[r7] = r5
            goto L_0x003e
        L_0x002b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L_0x003e
        L_0x0030:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L_0x003e
        L_0x0035:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L_0x003e
        L_0x003a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L_0x003e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L_0x0045
            r4[r6] = r5
            goto L_0x0047
        L_0x0045:
            r4[r6] = r2
        L_0x0047:
            switch(r8) {
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                case 4: goto L_0x006b;
                case 5: goto L_0x006b;
                case 6: goto L_0x0066;
                case 7: goto L_0x0066;
                case 8: goto L_0x0061;
                case 9: goto L_0x0061;
                case 10: goto L_0x005c;
                case 11: goto L_0x005c;
                case 12: goto L_0x0057;
                case 13: goto L_0x0057;
                case 14: goto L_0x0052;
                case 15: goto L_0x004f;
                case 16: goto L_0x0074;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L_0x0074
        L_0x004f:
            r4[r3] = r2
            goto L_0x0074
        L_0x0052:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L_0x0074
        L_0x0057:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L_0x0074
        L_0x005c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L_0x0074
        L_0x0061:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L_0x0074
        L_0x0066:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L_0x0074
        L_0x006b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L_0x0074
        L_0x0070:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L_0x0074:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L_0x0080
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L_0x0085
        L_0x0080:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L_0x0085:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p268og.C11373t.m10175a(int):void");
    }

    /* renamed from: d */
    public static Integer m10172d(AbstractC11387u uVar, AbstractC11387u uVar2) {
        if (uVar == null) {
            m10175a(12);
        }
        if (uVar2 == null) {
            m10175a(13);
        }
        Integer a = uVar.m10154a(uVar2);
        if (a != null) {
            return a;
        }
        Integer a2 = uVar2.m10154a(uVar);
        if (a2 != null) {
            return Integer.valueOf(-a2.intValue());
        }
        return null;
    }

    /* renamed from: e */
    public static AbstractC11367q m10171e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
        AbstractC11367q e;
        if (qVar == null) {
            m10175a(8);
        }
        if (mVar == null) {
            m10175a(9);
        }
        for (AbstractC11367q qVar2 = (AbstractC11367q) qVar.mo6162a(); qVar2 != null && qVar2.getVisibility() != f25300f; qVar2 = (AbstractC11367q) C12661e.m6037q(qVar2, AbstractC11367q.class)) {
            if (!qVar2.getVisibility().mo1506e(gVar, qVar2, mVar, z)) {
                return qVar2;
            }
        }
        if (!(qVar instanceof AbstractC12611i0) || (e = m10171e(gVar, ((AbstractC12611i0) qVar).mo6350P(), mVar, z)) == null) {
            return null;
        }
        return e;
    }

    /* renamed from: f */
    public static boolean m10170f(AbstractC11346m mVar, AbstractC11346m mVar2) {
        if (mVar == null) {
            m10175a(6);
        }
        if (mVar2 == null) {
            m10175a(7);
        }
        AbstractC11304b1 j = C12661e.m6044j(mVar2);
        if (j != AbstractC11304b1.f25237a) {
            return j.equals(C12661e.m6044j(mVar));
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m10169g(AbstractC11387u uVar) {
        if (uVar == null) {
            m10175a(14);
        }
        if (uVar == f25295a || uVar == f25296b) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m10168h(AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
        if (qVar == null) {
            m10175a(2);
        }
        if (mVar == null) {
            m10175a(3);
        }
        if (m10171e(f25308n, qVar, mVar, z) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static void m10167i(AbstractC11387u uVar) {
        f25311q.put(uVar.mo10153b(), uVar);
    }

    /* renamed from: j */
    public static AbstractC11387u m10166j(AbstractC11362n1 n1Var) {
        if (n1Var == null) {
            m10175a(15);
        }
        AbstractC11387u uVar = f25311q.get(n1Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + n1Var);
    }
}
