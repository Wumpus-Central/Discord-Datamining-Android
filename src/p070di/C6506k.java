package p070di;

import kh.AbstractC9874c;
import kh.C9879g;
import kh.C9880h;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p159ih.C8568i;
import p163j$.util.Spliterator;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11346m;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p324rg.AbstractC12632p;
import p324rg.C12607g0;
import pg.AbstractC11672g;

/* renamed from: di.k */
/* loaded from: classes8.dex */
public final class C6506k extends C12607g0 implements AbstractC6465b {

    /* renamed from: O */
    private final C8568i f37928O;

    /* renamed from: P */
    private final AbstractC9874c f37929P;

    /* renamed from: Q */
    private final C9879g f37930Q;

    /* renamed from: R */
    private final C9880h f37931R;

    /* renamed from: S */
    private final AbstractC6483f f37932S;

    public /* synthetic */ C6506k(AbstractC11346m mVar, AbstractC11404z0 z0Var, AbstractC11672g gVar, C11142f fVar, AbstractC11301b.EnumC11302a aVar, C8568i iVar, AbstractC9874c cVar, C9879g gVar2, C9880h hVar, AbstractC6483f fVar2, AbstractC11299a1 a1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, z0Var, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, fVar2, (i & Spliterator.IMMUTABLE) != 0 ? null : a1Var);
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: C */
    public C9879g mo25405C() {
        return this.f37930Q;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: F */
    public AbstractC9874c mo25404F() {
        return this.f37929P;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: H */
    public AbstractC6483f mo25403H() {
        return this.f37932S;
    }

    @Override // p324rg.C12607g0, p324rg.AbstractC12632p
    /* renamed from: L0 */
    protected AbstractC12632p mo71L0(AbstractC11346m newOwner, AbstractC11397y yVar, AbstractC11301b.EnumC11302a kind, C11142f fVar, AbstractC11672g annotations, AbstractC11299a1 source) {
        C11142f fVar2;
        C9971q.m14633g(newOwner, "newOwner");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(source, "source");
        AbstractC11404z0 z0Var = (AbstractC11404z0) yVar;
        if (fVar == null) {
            C11142f name = getName();
            C9971q.m14634f(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        C6506k kVar = new C6506k(newOwner, z0Var, annotations, fVar2, kind, mo25408c0(), mo25404F(), mo25405C(), m25406q1(), mo25403H(), source);
        kVar.mo79Y0(mo70Q0());
        return kVar;
    }

    /* renamed from: p1 */
    public C8568i mo25408c0() {
        return this.f37928O;
    }

    /* renamed from: q1 */
    public C9880h m25406q1() {
        return this.f37931R;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6506k(AbstractC11346m containingDeclaration, AbstractC11404z0 z0Var, AbstractC11672g annotations, C11142f name, AbstractC11301b.EnumC11302a kind, C8568i proto, AbstractC9874c nameResolver, C9879g typeTable, C9880h versionRequirementTable, AbstractC6483f fVar, AbstractC11299a1 a1Var) {
        super(containingDeclaration, z0Var, annotations, name, kind, a1Var == null ? AbstractC11299a1.f25230a : a1Var);
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        C9971q.m14633g(versionRequirementTable, "versionRequirementTable");
        this.f37928O = proto;
        this.f37929P = nameResolver;
        this.f37930Q = typeTable;
        this.f37931R = versionRequirementTable;
        this.f37932S = fVar;
    }
}
