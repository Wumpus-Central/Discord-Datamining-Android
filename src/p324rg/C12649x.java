package p324rg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import p087ei.AbstractC6936g;
import p087ei.AbstractC6944n;
import p217lg.AbstractC10420h;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11327h0;
import p268og.AbstractC11346m;
import p268og.AbstractC11347m0;
import p268og.AbstractC11363o;
import p268og.AbstractC11368q0;
import p268og.C11303b0;
import p268og.C11321g0;
import p269oh.C11405a;
import p324rg.AbstractC12585a0;
import pg.AbstractC11672g;

/* renamed from: rg.x */
/* loaded from: classes8.dex */
public final class C12649x extends AbstractC12612j implements AbstractC11327h0 {

    /* renamed from: m */
    private final AbstractC6944n f28462m;

    /* renamed from: n */
    private final AbstractC10420h f28463n;

    /* renamed from: o */
    private final C11142f f28464o;

    /* renamed from: p */
    private final Map<C11321g0<?>, Object> f28465p;

    /* renamed from: q */
    private final AbstractC12585a0 f28466q;

    /* renamed from: r */
    private AbstractC12647v f28467r;

    /* renamed from: s */
    private AbstractC11347m0 f28468s;

    /* renamed from: t */
    private boolean f28469t;

    /* renamed from: u */
    private final AbstractC6936g<C11137c, AbstractC11368q0> f28470u;

    /* renamed from: v */
    private final Lazy f28471v;

    /* renamed from: rg.x$a */
    /* loaded from: classes8.dex */
    static final class C12650a extends AbstractC9973s implements Function0<C12610i> {
        C12650a() {
            super(0);
        }

        /* renamed from: a */
        public final C12610i invoke() {
            int t;
            AbstractC12647v vVar = C12649x.this.f28467r;
            C12649x xVar = C12649x.this;
            if (vVar != null) {
                List<C12649x> a = vVar.mo6157a();
                C12649x.this.m6148O0();
                a.contains(C12649x.this);
                for (C12649x xVar2 : a) {
                    xVar2.m6143T0();
                }
                t = C9907k.m14809t(a, 10);
                ArrayList arrayList = new ArrayList(t);
                for (C12649x xVar3 : a) {
                    AbstractC11347m0 m0Var = xVar3.f28468s;
                    C9971q.m14636d(m0Var);
                    arrayList.add(m0Var);
                }
                return new C12610i(arrayList, "CompositeProvider@ModuleDescriptor for " + C12649x.this.getName());
            }
            throw new AssertionError("Dependencies of module " + xVar.m6147P0() + " were not set before querying module content");
        }
    }

    /* renamed from: rg.x$b */
    /* loaded from: classes8.dex */
    static final class C12651b extends AbstractC9973s implements Function1<C11137c, AbstractC11368q0> {
        C12651b() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11368q0 invoke(C11137c fqName) {
            C9971q.m14633g(fqName, "fqName");
            AbstractC12585a0 a0Var = C12649x.this.f28466q;
            C12649x xVar = C12649x.this;
            return a0Var.mo6468a(xVar, fqName, xVar.f28462m);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12649x(C11142f moduleName, AbstractC6944n storageManager, AbstractC10420h builtIns, C11405a aVar) {
        this(moduleName, storageManager, builtIns, aVar, null, null, 48, null);
        C9971q.m14633g(moduleName, "moduleName");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(builtIns, "builtIns");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C12649x(p249nh.C11142f r10, p087ei.AbstractC6944n r11, p217lg.AbstractC10420h r12, p269oh.C11405a r13, java.util.Map r14, p249nh.C11142f r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r6 = r1
            goto L_0x0008
        L_0x0007:
            r6 = r13
        L_0x0008:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = p267of.C11286s.m10268h()
            r7 = r0
            goto L_0x0013
        L_0x0012:
            r7 = r14
        L_0x0013:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x0019
            r8 = r1
            goto L_0x001a
        L_0x0019:
            r8 = r15
        L_0x001a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p324rg.C12649x.<init>(nh.f, ei.n, lg.h, oh.a, java.util.Map, nh.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public final String m6147P0() {
        String fVar = getName().toString();
        C9971q.m14634f(fVar, "name.toString()");
        return fVar;
    }

    /* renamed from: R0 */
    private final C12610i m6145R0() {
        return (C12610i) this.f28471v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public final boolean m6143T0() {
        return this.f28468s != null;
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return (R) AbstractC11327h0.C11328a.m10205a(this, oVar, d);
    }

    /* renamed from: O0 */
    public void m6148O0() {
        if (!m6142U0()) {
            C11303b0.m10223a(this);
        }
    }

    /* renamed from: Q0 */
    public final AbstractC11347m0 m6146Q0() {
        m6148O0();
        return m6145R0();
    }

    /* renamed from: S0 */
    public final void m6144S0(AbstractC11347m0 providerForModuleContent) {
        C9971q.m14633g(providerForModuleContent, "providerForModuleContent");
        m6143T0();
        this.f28468s = providerForModuleContent;
    }

    /* renamed from: U0 */
    public boolean m6142U0() {
        return this.f28469t;
    }

    /* renamed from: V0 */
    public final void m6141V0(List<C12649x> descriptors) {
        Set<C12649x> d;
        C9971q.m14633g(descriptors, "descriptors");
        d = C9921w.m14722d();
        m6140W0(descriptors, d);
    }

    /* renamed from: W0 */
    public final void m6140W0(List<C12649x> descriptors, Set<C12649x> friends) {
        List i;
        Set d;
        C9971q.m14633g(descriptors, "descriptors");
        C9971q.m14633g(friends, "friends");
        i = C9906j.m14820i();
        d = C9921w.m14722d();
        m6139X0(new C12648w(descriptors, friends, i, d));
    }

    /* renamed from: X0 */
    public final void m6139X0(AbstractC12647v dependencies) {
        C9971q.m14633g(dependencies, "dependencies");
        this.f28467r = dependencies;
    }

    /* renamed from: Y0 */
    public final void m6138Y0(C12649x... descriptors) {
        List<C12649x> u0;
        C9971q.m14633g(descriptors, "descriptors");
        u0 = C9899f.m14914u0(descriptors);
        m6141V0(u0);
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        return AbstractC11327h0.C11328a.m10204b(this);
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: m0 */
    public boolean mo6137m0(AbstractC11327h0 targetModule) {
        boolean M;
        C9971q.m14633g(targetModule, "targetModule");
        if (C9971q.m14638b(this, targetModule)) {
            return true;
        }
        AbstractC12647v vVar = this.f28467r;
        C9971q.m14636d(vVar);
        M = C9914r.m14778M(vVar.mo6155c(), targetModule);
        if (!M && !mo6132x0().contains(targetModule) && !targetModule.mo6132x0().contains(this)) {
            return false;
        }
        return true;
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: n */
    public AbstractC10420h mo6136n() {
        return this.f28463n;
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: n0 */
    public AbstractC11368q0 mo6135n0(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        m6148O0();
        return this.f28470u.invoke(fqName);
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: q */
    public Collection<C11137c> mo6134q(C11137c fqName, Function1<? super C11142f, Boolean> nameFilter) {
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(nameFilter, "nameFilter");
        m6148O0();
        return m6146Q0().mo6354q(fqName, nameFilter);
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: v0 */
    public <T> T mo6133v0(C11321g0<T> capability) {
        C9971q.m14633g(capability, "capability");
        T t = (T) this.f28465p.get(capability);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: x0 */
    public List<AbstractC11327h0> mo6132x0() {
        AbstractC12647v vVar = this.f28467r;
        if (vVar != null) {
            return vVar.mo6156b();
        }
        throw new AssertionError("Dependencies of module " + m6147P0() + " were not set");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12649x(C11142f moduleName, AbstractC6944n storageManager, AbstractC10420h builtIns, C11405a aVar, Map<C11321g0<?>, ? extends Object> capabilities, C11142f fVar) {
        super(AbstractC11672g.f26044g.m9048b(), moduleName);
        Lazy a;
        C9971q.m14633g(moduleName, "moduleName");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(builtIns, "builtIns");
        C9971q.m14633g(capabilities, "capabilities");
        this.f28462m = storageManager;
        this.f28463n = builtIns;
        this.f28464o = fVar;
        if (moduleName.m10766g()) {
            this.f28465p = capabilities;
            AbstractC12585a0 a0Var = (AbstractC12585a0) mo6133v0(AbstractC12585a0.f28289a.m6469a());
            this.f28466q = a0Var == null ? AbstractC12585a0.C12587b.f28292b : a0Var;
            this.f28469t = true;
            this.f28470u = storageManager.mo23892i(new C12651b());
            a = C11084n.m10945a(new C12650a());
            this.f28471v = a;
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
