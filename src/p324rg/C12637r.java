package p324rg;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p249nh.C11137c;
import p268og.AbstractC11344l0;
import p268og.AbstractC11363o;
import p268og.AbstractC11368q0;
import p268og.C11364o0;
import p448yh.AbstractC14411h;
import p448yh.C14398b;
import p448yh.C14409g;
import pg.AbstractC11672g;

/* renamed from: rg.r */
/* loaded from: classes8.dex */
public class C12637r extends AbstractC12612j implements AbstractC11368q0 {

    /* renamed from: r */
    static final /* synthetic */ KProperty<Object>[] f28440r = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C12637r.class), "fragments", "getFragments()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C12637r.class), "empty", "getEmpty()Z"))};

    /* renamed from: m */
    private final C12649x f28441m;

    /* renamed from: n */
    private final C11137c f28442n;

    /* renamed from: o */
    private final AbstractC6938i f28443o;

    /* renamed from: p */
    private final AbstractC6938i f28444p;

    /* renamed from: q */
    private final AbstractC14411h f28445q;

    /* renamed from: rg.r$a */
    /* loaded from: classes8.dex */
    static final class C12638a extends AbstractC9973s implements Function0<Boolean> {
        C12638a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C11364o0.m10183b(C12637r.this.mo6179z0().m6146Q0(), C12637r.this.mo6182e()));
        }
    }

    /* renamed from: rg.r$b */
    /* loaded from: classes8.dex */
    static final class C12639b extends AbstractC9973s implements Function0<List<? extends AbstractC11344l0>> {
        C12639b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC11344l0> invoke() {
            return C11364o0.m10182c(C12637r.this.mo6179z0().m6146Q0(), C12637r.this.mo6182e());
        }
    }

    /* renamed from: rg.r$c */
    /* loaded from: classes8.dex */
    static final class C12640c extends AbstractC9973s implements Function0<AbstractC14411h> {
        C12640c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC14411h invoke() {
            int t;
            List p0;
            if (C12637r.this.isEmpty()) {
                return AbstractC14411h.C14413b.f32626b;
            }
            List<AbstractC11344l0> f0 = C12637r.this.mo6181f0();
            t = C9907k.m14809t(f0, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC11344l0 l0Var : f0) {
                arrayList.add(l0Var.mo6298o());
            }
            p0 = C9914r.m14749p0(arrayList, new C12609h0(C12637r.this.mo6179z0(), C12637r.this.mo6182e()));
            C14398b.C14399a aVar = C14398b.f32579d;
            return aVar.m686a("package view scope for " + C12637r.this.mo6182e() + " in " + C12637r.this.mo6179z0().getName(), p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12637r(C12649x module, C11137c fqName, AbstractC6944n storageManager) {
        super(AbstractC11672g.f26044g.m9048b(), fqName.m10797h());
        C9971q.m14633g(module, "module");
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(storageManager, "storageManager");
        this.f28441m = module;
        this.f28442n = fqName;
        this.f28443o = storageManager.mo23898c(new C12639b());
        this.f28444p = storageManager.mo23898c(new C12638a());
        this.f28445q = new C14409g(storageManager, new C12640c());
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> visitor, D d) {
        C9971q.m14633g(visitor, "visitor");
        return visitor.mo6319e(this, d);
    }

    /* renamed from: D0 */
    public AbstractC11368q0 mo6104b() {
        if (mo6182e().m10801d()) {
            return null;
        }
        C12649x K0 = mo6179z0();
        C11137c e = mo6182e().m10800e();
        C9971q.m14634f(e, "fqName.parent()");
        return K0.mo6135n0(e);
    }

    /* renamed from: G0 */
    protected final boolean m6184G0() {
        return ((Boolean) C6943m.m23902a(this.f28444p, this, f28440r[1])).booleanValue();
    }

    /* renamed from: K0 */
    public C12649x mo6179z0() {
        return this.f28441m;
    }

    @Override // p268og.AbstractC11368q0
    /* renamed from: e */
    public C11137c mo6182e() {
        return this.f28442n;
    }

    public boolean equals(Object obj) {
        AbstractC11368q0 q0Var;
        if (obj instanceof AbstractC11368q0) {
            q0Var = (AbstractC11368q0) obj;
        } else {
            q0Var = null;
        }
        if (q0Var != null && C9971q.m14638b(mo6182e(), q0Var.mo6182e()) && C9971q.m14638b(mo6179z0(), q0Var.mo6179z0())) {
            return true;
        }
        return false;
    }

    @Override // p268og.AbstractC11368q0
    /* renamed from: f0 */
    public List<AbstractC11344l0> mo6181f0() {
        return (List) C6943m.m23902a(this.f28443o, this, f28440r[0]);
    }

    public int hashCode() {
        return (mo6179z0().hashCode() * 31) + mo6182e().hashCode();
    }

    @Override // p268og.AbstractC11368q0
    public boolean isEmpty() {
        return m6184G0();
    }

    @Override // p268og.AbstractC11368q0
    /* renamed from: o */
    public AbstractC14411h mo6180o() {
        return this.f28445q;
    }
}
