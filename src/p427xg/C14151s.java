package p427xg;

import java.util.HashMap;
import java.util.Map;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11362n1;
import p268og.AbstractC11367q;
import p268og.AbstractC11369r;
import p268og.AbstractC11387u;
import p268og.C11373t;
import p325rh.C12661e;
import p468zh.AbstractC14663g;
import sg.C12896a;
import sg.C12897b;
import sg.C12898c;

/* renamed from: xg.s */
/* loaded from: classes8.dex */
public class C14151s {

    /* renamed from: a */
    public static final AbstractC11387u f31959a;

    /* renamed from: b */
    public static final AbstractC11387u f31960b;

    /* renamed from: c */
    public static final AbstractC11387u f31961c;

    /* renamed from: d */
    private static final Map<AbstractC11362n1, AbstractC11387u> f31962d = new HashMap();

    /* renamed from: xg.s$a */
    /* loaded from: classes8.dex */
    static class C14152a extends AbstractC11369r {
        C14152a(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m1508g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m1508g(0);
            }
            if (mVar == null) {
                m1508g(1);
            }
            return C14151s.m1512d(qVar, mVar);
        }
    }

    /* renamed from: xg.s$b */
    /* loaded from: classes8.dex */
    static class C14153b extends AbstractC11369r {
        C14153b(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m1507g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m1507g(0);
            }
            if (mVar == null) {
                m1507g(1);
            }
            return C14151s.m1511e(gVar, qVar, mVar);
        }
    }

    /* renamed from: xg.s$c */
    /* loaded from: classes8.dex */
    static class C14154c extends AbstractC11369r {
        C14154c(AbstractC11362n1 n1Var) {
            super(n1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m1505g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p268og.AbstractC11387u
        /* renamed from: e */
        public boolean mo1506e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar, boolean z) {
            if (qVar == null) {
                m1505g(0);
            }
            if (mVar == null) {
                m1505g(1);
            }
            return C14151s.m1511e(gVar, qVar, mVar);
        }
    }

    static {
        C14152a aVar = new C14152a(C12896a.f28970c);
        f31959a = aVar;
        C14153b bVar = new C14153b(C12898c.f28972c);
        f31960b = bVar;
        C14154c cVar = new C14154c(C12897b.f28971c);
        f31961c = cVar;
        m1510f(aVar);
        m1510f(bVar);
        m1510f(cVar);
    }

    /* renamed from: a */
    private static /* synthetic */ void m1515a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m1512d(AbstractC11346m mVar, AbstractC11346m mVar2) {
        if (mVar == null) {
            m1515a(2);
        }
        if (mVar2 == null) {
            m1515a(3);
        }
        AbstractC11344l0 l0Var = (AbstractC11344l0) C12661e.m6036r(mVar, AbstractC11344l0.class, false);
        AbstractC11344l0 l0Var2 = (AbstractC11344l0) C12661e.m6036r(mVar2, AbstractC11344l0.class, false);
        if (l0Var2 == null || l0Var == null || !l0Var.mo6103e().equals(l0Var2.mo6103e())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m1511e(AbstractC14663g gVar, AbstractC11367q qVar, AbstractC11346m mVar) {
        if (qVar == null) {
            m1515a(0);
        }
        if (mVar == null) {
            m1515a(1);
        }
        if (m1512d(C12661e.m6054M(qVar), mVar)) {
            return true;
        }
        return C11373t.f25297c.mo1506e(gVar, qVar, mVar, false);
    }

    /* renamed from: f */
    private static void m1510f(AbstractC11387u uVar) {
        f31962d.put(uVar.mo10153b(), uVar);
    }

    /* renamed from: g */
    public static AbstractC11387u m1509g(AbstractC11362n1 n1Var) {
        if (n1Var == null) {
            m1515a(4);
        }
        AbstractC11387u uVar = f31962d.get(n1Var);
        if (uVar != null) {
            return uVar;
        }
        AbstractC11387u j = C11373t.m10166j(n1Var);
        if (j == null) {
            m1515a(5);
        }
        return j;
    }
}
