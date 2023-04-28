package p070di;

import kh.AbstractC9874c;
import kh.C9870b;
import kh.C9879g;
import kh.C9880h;
import kotlin.jvm.internal.C9971q;
import p159ih.C8581n;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.EnumC11314e0;
import p324rg.C12591c0;
import pg.AbstractC11672g;

/* renamed from: di.j */
/* loaded from: classes8.dex */
public final class C6505j extends C12591c0 implements AbstractC6465b {

    /* renamed from: M */
    private final C8581n f37923M;

    /* renamed from: N */
    private final AbstractC9874c f37924N;

    /* renamed from: O */
    private final C9879g f37925O;

    /* renamed from: P */
    private final C9880h f37926P;

    /* renamed from: Q */
    private final AbstractC6483f f37927Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6505j(AbstractC11346m containingDeclaration, AbstractC11388u0 u0Var, AbstractC11672g annotations, EnumC11314e0 modality, AbstractC11387u visibility, boolean z, C11142f name, AbstractC11301b.EnumC11302a kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C8581n proto, AbstractC9874c nameResolver, C9879g typeTable, C9880h versionRequirementTable, AbstractC6483f fVar) {
        super(containingDeclaration, u0Var, annotations, modality, visibility, z, name, kind, AbstractC11299a1.f25230a, z2, z3, z6, false, z4, z5);
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(modality, "modality");
        C9971q.m14633g(visibility, "visibility");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        C9971q.m14633g(versionRequirementTable, "versionRequirementTable");
        this.f37923M = proto;
        this.f37924N = nameResolver;
        this.f37925O = typeTable;
        this.f37926P = versionRequirementTable;
        this.f37927Q = fVar;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: C */
    public C9879g mo25405C() {
        return this.f37925O;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: F */
    public AbstractC9874c mo25404F() {
        return this.f37924N;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: H */
    public AbstractC6483f mo25403H() {
        return this.f37927Q;
    }

    @Override // p324rg.C12591c0
    /* renamed from: P0 */
    protected C12591c0 mo60P0(AbstractC11346m newOwner, EnumC11314e0 newModality, AbstractC11387u newVisibility, AbstractC11388u0 u0Var, AbstractC11301b.EnumC11302a kind, C11142f newName, AbstractC11299a1 source) {
        C9971q.m14633g(newOwner, "newOwner");
        C9971q.m14633g(newModality, "newModality");
        C9971q.m14633g(newVisibility, "newVisibility");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(newName, "newName");
        C9971q.m14633g(source, "source");
        return new C6505j(newOwner, u0Var, getAnnotations(), newModality, newVisibility, mo6277L(), newName, kind, mo6433w0(), mo59Y(), isExternal(), mo6432z(), mo6114h0(), mo25408c0(), mo25404F(), mo25405C(), m25409g1(), mo25403H());
    }

    /* renamed from: f1 */
    public C8581n mo25408c0() {
        return this.f37923M;
    }

    /* renamed from: g1 */
    public C9880h m25409g1() {
        return this.f37926P;
    }

    @Override // p324rg.C12591c0, p268og.AbstractC11310d0
    public boolean isExternal() {
        Boolean g = C9870b.f38751D.mo15135d(mo25408c0().m18954b0());
        C9971q.m14634f(g, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return g.booleanValue();
    }
}
