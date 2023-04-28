package p070di;

import kh.AbstractC9874c;
import kh.C9879g;
import kh.C9880h;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p159ih.C8547d;
import p163j$.util.Spliterator;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11343l;
import p268og.AbstractC11346m;
import p268og.AbstractC11397y;
import p324rg.C12604f;
import pg.AbstractC11672g;

/* renamed from: di.c */
/* loaded from: classes8.dex */
public final class C6466c extends C12604f implements AbstractC6465b {

    /* renamed from: P */
    private final C8547d f37909P;

    /* renamed from: Q */
    private final AbstractC9874c f37910Q;

    /* renamed from: R */
    private final C9879g f37911R;

    /* renamed from: S */
    private final C9880h f37912S;

    /* renamed from: T */
    private final AbstractC6483f f37913T;

    public /* synthetic */ C6466c(AbstractC11313e eVar, AbstractC11343l lVar, AbstractC11672g gVar, boolean z, AbstractC11301b.EnumC11302a aVar, C8547d dVar, AbstractC9874c cVar, C9879g gVar2, C9880h hVar, AbstractC6483f fVar, AbstractC11299a1 a1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, lVar, gVar, z, aVar, dVar, cVar, gVar2, hVar, fVar, (i & Spliterator.IMMUTABLE) != 0 ? null : a1Var);
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11397y
    /* renamed from: A */
    public boolean mo6274A() {
        return false;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: C */
    public C9879g mo25405C() {
        return this.f37911R;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: F */
    public AbstractC9874c mo25404F() {
        return this.f37910Q;
    }

    @Override // p070di.AbstractC6484g
    /* renamed from: H */
    public AbstractC6483f mo25403H() {
        return this.f37913T;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11310d0
    public boolean isExternal() {
        return false;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11397y
    public boolean isInline() {
        return false;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11397y
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public C6466c mo77o1(AbstractC11346m newOwner, AbstractC11397y yVar, AbstractC11301b.EnumC11302a kind, C11142f fVar, AbstractC11672g annotations, AbstractC11299a1 source) {
        C9971q.m14633g(newOwner, "newOwner");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(source, "source");
        C6466c cVar = new C6466c((AbstractC11313e) newOwner, (AbstractC11343l) yVar, annotations, this.f39320O, kind, mo25408c0(), mo25404F(), mo25405C(), m25532u1(), mo25403H(), source);
        cVar.mo79Y0(mo70Q0());
        return cVar;
    }

    /* renamed from: t1 */
    public C8547d mo25408c0() {
        return this.f37909P;
    }

    /* renamed from: u1 */
    public C9880h m25532u1() {
        return this.f37912S;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6466c(AbstractC11313e containingDeclaration, AbstractC11343l lVar, AbstractC11672g annotations, boolean z, AbstractC11301b.EnumC11302a kind, C8547d proto, AbstractC9874c nameResolver, C9879g typeTable, C9880h versionRequirementTable, AbstractC6483f fVar, AbstractC11299a1 a1Var) {
        super(containingDeclaration, lVar, annotations, z, kind, a1Var == null ? AbstractC11299a1.f25230a : a1Var);
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        C9971q.m14633g(versionRequirementTable, "versionRequirementTable");
        this.f37909P = proto;
        this.f37910Q = nameResolver;
        this.f37911R = typeTable;
        this.f37912S = versionRequirementTable;
        this.f37913T = fVar;
    }
}
