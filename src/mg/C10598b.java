package mg;

import fi.AbstractC7225b;
import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7296m1;
import fi.EnumC7338w1;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import nf.C11088q;
import p087ei.AbstractC6944n;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11142f;
import p267of.AbstractC11283p;
import p268og.AbstractC11299a1;
import p268og.AbstractC11309d;
import p268og.AbstractC11311d1;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11327h0;
import p268og.AbstractC11329h1;
import p268og.AbstractC11344l0;
import p268og.AbstractC11387u;
import p268og.C11373t;
import p268og.C11393x;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p324rg.AbstractC12582a;
import p324rg.C12617k0;
import p448yh.AbstractC14411h;
import pg.AbstractC11672g;

/* renamed from: mg.b */
/* loaded from: classes8.dex */
public final class C10598b extends AbstractC12582a {

    /* renamed from: w */
    public static final C10599a f23461w = new C10599a(null);

    /* renamed from: x */
    private static final C11136b f23462x = new C11136b(C10434k.f22894u, C11142f.m10767f("Function"));

    /* renamed from: y */
    private static final C11136b f23463y = new C11136b(C10434k.f22891r, C11142f.m10767f("KFunction"));

    /* renamed from: p */
    private final AbstractC6944n f23464p;

    /* renamed from: q */
    private final AbstractC11344l0 f23465q;

    /* renamed from: r */
    private final EnumC10600c f23466r;

    /* renamed from: s */
    private final int f23467s;

    /* renamed from: t */
    private final C0341b f23468t = new C0341b();

    /* renamed from: u */
    private final C10602d f23469u;

    /* renamed from: v */
    private final List<AbstractC11319f1> f23470v;

    /* renamed from: mg.b$a */
    /* loaded from: classes8.dex */
    public static final class C10599a {
        private C10599a() {
        }

        public /* synthetic */ C10599a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mg.b$b */
    /* loaded from: classes8.dex */
    private final class C0341b extends AbstractC7225b {

        /* renamed from: mg.b$b$a */
        /* loaded from: classes8.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23472a;

            static {
                int[] iArr = new int[EnumC10600c.values().length];
                try {
                    iArr[EnumC10600c.Function.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC10600c.KFunction.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC10600c.SuspendFunction.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC10600c.KSuspendFunction.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f23472a = iArr;
            }
        }

        public C0341b() {
            super(C10598b.this.f23464p);
        }

        @Override // fi.AbstractC7268g1
        public List<AbstractC11319f1> getParameters() {
            return C10598b.this.f23470v;
        }

        @Override // fi.AbstractC7257g
        /* renamed from: h */
        protected Collection<AbstractC7267g0> mo6386h() {
            List<C11136b> list;
            int t;
            List D0;
            List<AbstractC11319f1> y0;
            int t2;
            int i = a.f23472a[C10598b.this.m12767U0().ordinal()];
            if (i == 1) {
                list = C9905i.m14825d(C10598b.f23462x);
            } else if (i == 2) {
                list = C9906j.m14817l(C10598b.f23463y, new C11136b(C10434k.f22894u, EnumC10600c.Function.m12757d(C10598b.this.m12771Q0())));
            } else if (i == 3) {
                list = C9905i.m14825d(C10598b.f23462x);
            } else if (i == 4) {
                list = C9906j.m14817l(C10598b.f23463y, new C11136b(C10434k.f22886m, EnumC10600c.SuspendFunction.m12757d(C10598b.this.m12771Q0())));
            } else {
                throw new C11088q();
            }
            AbstractC11327h0 b = C10598b.this.f23465q.mo6104b();
            t = C9907k.m14809t(list, 10);
            ArrayList arrayList = new ArrayList(t);
            for (C11136b bVar : list) {
                AbstractC11313e a2 = C11393x.m10149a(b, bVar);
                if (a2 != null) {
                    y0 = C9914r.m14740y0(getParameters(), a2.mo6111k().getParameters().size());
                    t2 = C9907k.m14809t(y0, 10);
                    ArrayList arrayList2 = new ArrayList(t2);
                    for (AbstractC11319f1 f1Var : y0) {
                        arrayList2.add(new C7296m1(f1Var.mo6166p()));
                    }
                    arrayList.add(C7270h0.m23053g(C7232c1.f15671l.m23149h(), a2, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            D0 = C9914r.m14790D0(arrayList);
            return D0;
        }

        @Override // fi.AbstractC7257g
        /* renamed from: l */
        protected AbstractC11311d1 mo6384l() {
            return AbstractC11311d1.C11312a.f25241a;
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: q */
        public boolean mo4564q() {
            return true;
        }

        public String toString() {
            return mo12762w().toString();
        }

        /* renamed from: x */
        public C10598b mo12762w() {
            return C10598b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10598b(AbstractC6944n storageManager, AbstractC11344l0 containingDeclaration, EnumC10600c functionKind, int i) {
        super(storageManager, functionKind.m12757d(i));
        int t;
        List<AbstractC11319f1> D0;
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(functionKind, "functionKind");
        this.f23464p = storageManager;
        this.f23465q = containingDeclaration;
        this.f23466r = functionKind;
        this.f23467s = i;
        this.f23469u = new C10602d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i);
        t = C9907k.m14809t(intRange, 10);
        ArrayList arrayList2 = new ArrayList(t);
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11283p) it).nextInt();
            EnumC7338w1 w1Var = EnumC7338w1.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(nextInt);
            m12777K0(arrayList, this, w1Var, sb2.toString());
            arrayList2.add(Unit.f22042a);
        }
        m12777K0(arrayList, this, EnumC7338w1.OUT_VARIANCE, "R");
        D0 = C9914r.m14790D0(arrayList);
        this.f23470v = D0;
    }

    /* renamed from: K0 */
    private static final void m12777K0(ArrayList<AbstractC11319f1> arrayList, C10598b bVar, EnumC7338w1 w1Var, String str) {
        arrayList.add(C12617k0.m6328R0(bVar, AbstractC11672g.f26044g.m9048b(), false, w1Var, C11142f.m10767f(str), arrayList.size(), bVar.f23464p));
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: B */
    public /* bridge */ /* synthetic */ AbstractC11309d mo6129B() {
        return (AbstractC11309d) m12763Y0();
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: I0 */
    public boolean mo6127I0() {
        return false;
    }

    /* renamed from: Q0 */
    public final int m12771Q0() {
        return this.f23467s;
    }

    /* renamed from: R0 */
    public Void m12770R0() {
        return null;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: S */
    public AbstractC11329h1<AbstractC7304o0> mo6121S() {
        return null;
    }

    /* renamed from: S0 */
    public List<AbstractC11309d> mo6110l() {
        List<AbstractC11309d> i;
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: T0 */
    public AbstractC11344l0 mo6104b() {
        return this.f23465q;
    }

    /* renamed from: U0 */
    public final EnumC10600c m12767U0() {
        return this.f23466r;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: V */
    public boolean mo6120V() {
        return false;
    }

    /* renamed from: V0 */
    public List<AbstractC11313e> mo6107x() {
        List<AbstractC11313e> i;
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: W0 */
    public AbstractC14411h.C14413b mo6113i0() {
        return AbstractC14411h.C14413b.f32626b;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: X */
    public boolean mo6119X() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X0 */
    public C10602d mo6117e0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f23469u;
    }

    /* renamed from: Y0 */
    public Void m12763Y0() {
        return null;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: b0 */
    public boolean mo6118b0() {
        return false;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g */
    public EnumC11317f mo6116g() {
        return EnumC11317f.INTERFACE;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g0 */
    public boolean mo6115g0() {
        return false;
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        return AbstractC11672g.f26044g.m9048b();
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u PUBLIC = C11373t.f25299e;
        C9971q.m14634f(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return false;
    }

    @Override // p268og.AbstractC11310d0
    public boolean isExternal() {
        return false;
    }

    @Override // p268og.AbstractC11313e
    public boolean isInline() {
        return false;
    }

    @Override // p268og.AbstractC11365p
    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
        C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: j0 */
    public /* bridge */ /* synthetic */ AbstractC11313e mo6112j0() {
        return (AbstractC11313e) m12770R0();
    }

    @Override // p268og.AbstractC11326h
    /* renamed from: k */
    public AbstractC7268g1 mo6111k() {
        return this.f23468t;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11330i
    /* renamed from: r */
    public List<AbstractC11319f1> mo6109r() {
        return this.f23470v;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        return EnumC11314e0.ABSTRACT;
    }

    public String toString() {
        String b = getName().m10771b();
        C9971q.m14634f(b, "name.asString()");
        return b;
    }

    @Override // p268og.AbstractC11330i
    /* renamed from: y */
    public boolean mo6106y() {
        return false;
    }
}
