package p108fh;

import bh.C3498e;
import bh.C3555n;
import fi.AbstractC7267g0;
import fi.C7322s1;
import fi.C7331u1;
import gi.C7680q;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p013ah.C1399g;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9624o;
import p182ji.AbstractC9628r;
import p217lg.AbstractC10420h;
import p249nh.C11138d;
import p268og.AbstractC11313e;
import p268og.AbstractC11335j1;
import p325rh.C12661e;
import p427xg.C14111d;
import p427xg.C14164y;
import p427xg.EnumC14107b;
import p467zg.AbstractC14655g;
import pg.AbstractC11664a;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fh.n */
/* loaded from: classes8.dex */
public final class C7215n extends AbstractC7163a<AbstractC11666c> {

    /* renamed from: a */
    private final AbstractC11664a f15648a;

    /* renamed from: b */
    private final boolean f15649b;

    /* renamed from: c */
    private final C1399g f15650c;

    /* renamed from: d */
    private final EnumC14107b f15651d;

    /* renamed from: e */
    private final boolean f15652e;

    public /* synthetic */ C7215n(AbstractC11664a aVar, boolean z, C1399g gVar, EnumC14107b bVar, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z, gVar, bVar, (i & 16) != 0 ? false : z2);
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: A */
    public boolean mo23213A(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        return ((AbstractC7267g0) iVar).mo22868Q0() instanceof C7175g;
    }

    /* renamed from: D */
    public C14111d mo23208h() {
        return this.f15650c.m41174a().m41209a();
    }

    /* renamed from: E */
    public AbstractC7267g0 mo23201p(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        return C7331u1.m22901a((AbstractC7267g0) iVar);
    }

    /* renamed from: F */
    public boolean mo23200r(AbstractC11666c cVar) {
        C9971q.m14633g(cVar, "<this>");
        if ((!(cVar instanceof AbstractC14655g) || !((AbstractC14655g) cVar).mo54n()) && (!(cVar instanceof C3498e) || mo23202o() || (!((C3498e) cVar).m34280k() && mo23205l() != EnumC14107b.TYPE_PARAMETER_BOUNDS))) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public AbstractC9628r mo23197v() {
        return C7680q.f16687a;
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: i */
    public Iterable<AbstractC11666c> mo23207i(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        return ((AbstractC7267g0) iVar).getAnnotations();
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: k */
    public Iterable<AbstractC11666c> mo23206k() {
        List i;
        AbstractC11672g annotations;
        AbstractC11664a aVar = this.f15648a;
        if (aVar != null && (annotations = aVar.getAnnotations()) != null) {
            return annotations;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: l */
    public EnumC14107b mo23205l() {
        return this.f15651d;
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: m */
    public C14164y mo23204m() {
        return this.f15650c.m41173b();
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: n */
    public boolean mo23203n() {
        AbstractC11664a aVar = this.f15648a;
        return (aVar instanceof AbstractC11335j1) && ((AbstractC11335j1) aVar).mo6304r0() != null;
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: o */
    public boolean mo23202o() {
        return this.f15650c.m41174a().m41193q().mo41183c();
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: s */
    public C11138d mo23199s(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        AbstractC11313e f = C7322s1.m22941f((AbstractC7267g0) iVar);
        if (f != null) {
            return C12661e.m6041m(f);
        }
        return null;
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: u */
    public boolean mo23198u() {
        return this.f15652e;
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: w */
    public boolean mo23196w(AbstractC9618i iVar) {
        C9971q.m14633g(iVar, "<this>");
        return AbstractC10420h.m13395d0((AbstractC7267g0) iVar);
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: x */
    public boolean mo23195x() {
        return this.f15649b;
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: y */
    public boolean mo23194y(AbstractC9618i iVar, AbstractC9618i other) {
        C9971q.m14633g(iVar, "<this>");
        C9971q.m14633g(other, "other");
        return this.f15650c.m41174a().m41199k().mo21673c((AbstractC7267g0) iVar, (AbstractC7267g0) other);
    }

    @Override // p108fh.AbstractC7163a
    /* renamed from: z */
    public boolean mo23193z(AbstractC9624o oVar) {
        C9971q.m14633g(oVar, "<this>");
        return oVar instanceof C3555n;
    }

    public C7215n(AbstractC11664a aVar, boolean z, C1399g containerContext, EnumC14107b containerApplicabilityType, boolean z2) {
        C9971q.m14633g(containerContext, "containerContext");
        C9971q.m14633g(containerApplicabilityType, "containerApplicabilityType");
        this.f15648a = aVar;
        this.f15649b = z;
        this.f15650c = containerContext;
        this.f15651d = containerApplicabilityType;
        this.f15652e = z2;
    }
}
