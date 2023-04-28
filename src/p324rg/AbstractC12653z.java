package p324rg;

import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import p268og.AbstractC11299a1;
import p268og.AbstractC11327h0;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import pg.AbstractC11672g;

/* renamed from: rg.z */
/* loaded from: classes8.dex */
public abstract class AbstractC12653z extends AbstractC12616k implements AbstractC11344l0 {

    /* renamed from: o */
    private final C11137c f28482o;

    /* renamed from: p */
    private final String f28483p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12653z(AbstractC11327h0 module, C11137c fqName) {
        super(module, AbstractC11672g.f26044g.m9048b(), fqName.m10797h(), AbstractC11299a1.f25230a);
        C9971q.m14633g(module, "module");
        C9971q.m14633g(fqName, "fqName");
        this.f28482o = fqName;
        this.f28483p = "package " + fqName + " of " + module;
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> visitor, D d) {
        C9971q.m14633g(visitor, "visitor");
        return visitor.mo6318f(this, d);
    }

    @Override // p268og.AbstractC11344l0
    /* renamed from: e */
    public final C11137c mo6103e() {
        return this.f28482o;
    }

    @Override // p324rg.AbstractC12616k, p268og.AbstractC11365p
    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
        C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p324rg.AbstractC12612j
    public String toString() {
        return this.f28483p;
    }

    @Override // p324rg.AbstractC12616k, p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11327h0 mo6104b() {
        AbstractC11346m b = super.mo6104b();
        C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (AbstractC11327h0) b;
    }
}
