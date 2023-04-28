package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7291l;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11329h1;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p448yh.AbstractC14411h;
import pg.AbstractC11672g;

/* renamed from: rg.y */
/* loaded from: classes8.dex */
public class C12652y extends AbstractC12606g {

    /* renamed from: s */
    private final EnumC11317f f28474s;

    /* renamed from: t */
    private final boolean f28475t;

    /* renamed from: u */
    private EnumC11314e0 f28476u;

    /* renamed from: v */
    private AbstractC11387u f28477v;

    /* renamed from: w */
    private AbstractC7268g1 f28478w;

    /* renamed from: x */
    private List<AbstractC11319f1> f28479x;

    /* renamed from: y */
    private final Collection<AbstractC7267g0> f28480y;

    /* renamed from: z */
    private final AbstractC6944n f28481z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12652y(AbstractC11346m mVar, EnumC11317f fVar, boolean z, boolean z2, C11142f fVar2, AbstractC11299a1 a1Var, AbstractC6944n nVar) {
        super(nVar, mVar, fVar2, a1Var, z2);
        if (mVar == null) {
            m6128D0(0);
        }
        if (fVar == null) {
            m6128D0(1);
        }
        if (fVar2 == null) {
            m6128D0(2);
        }
        if (a1Var == null) {
            m6128D0(3);
        }
        if (nVar == null) {
            m6128D0(4);
        }
        this.f28480y = new ArrayList();
        this.f28481z = nVar;
        this.f28474s = fVar;
        this.f28475t = z;
    }

    /* renamed from: D0 */
    private static /* synthetic */ void m6128D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: B */
    public AbstractC11309d mo6129B() {
        return null;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: I0 */
    public boolean mo6127I0() {
        return false;
    }

    /* renamed from: K0 */
    public void m6126K0() {
        this.f28478w = new C7291l(this, this.f28479x, this.f28480y, this.f28481z);
        Iterator<AbstractC11309d> it = mo6110l().iterator();
        while (it.hasNext()) {
            ((C12604f) it.next()).m6244g1(mo6166p());
        }
    }

    /* renamed from: L0 */
    public Set<AbstractC11309d> mo6110l() {
        Set<AbstractC11309d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            m6128D0(13);
        }
        return emptySet;
    }

    /* renamed from: M0 */
    public void m6124M0(EnumC11314e0 e0Var) {
        if (e0Var == null) {
            m6128D0(6);
        }
        this.f28476u = e0Var;
    }

    /* renamed from: N0 */
    public void m6123N0(List<AbstractC11319f1> list) {
        if (list == null) {
            m6128D0(14);
        }
        if (this.f28479x == null) {
            this.f28479x = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    /* renamed from: O0 */
    public void m6122O0(AbstractC11387u uVar) {
        if (uVar == null) {
            m6128D0(9);
        }
        this.f28477v = uVar;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: S */
    public AbstractC11329h1<AbstractC7304o0> mo6121S() {
        return null;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: V */
    public boolean mo6120V() {
        return false;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: X */
    public boolean mo6119X() {
        return false;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: b0 */
    public boolean mo6118b0() {
        return false;
    }

    @Override // p324rg.AbstractC12644t
    /* renamed from: e0 */
    public AbstractC14411h mo6117e0(AbstractC7664g gVar) {
        if (gVar == null) {
            m6128D0(16);
        }
        AbstractC14411h.C14413b bVar = AbstractC14411h.C14413b.f32626b;
        if (bVar == null) {
            m6128D0(17);
        }
        return bVar;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g */
    public EnumC11317f mo6116g() {
        EnumC11317f fVar = this.f28474s;
        if (fVar == null) {
            m6128D0(8);
        }
        return fVar;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g0 */
    public boolean mo6115g0() {
        return false;
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        AbstractC11672g b = AbstractC11672g.f26044g.m9048b();
        if (b == null) {
            m6128D0(5);
        }
        return b;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u uVar = this.f28477v;
        if (uVar == null) {
            m6128D0(10);
        }
        return uVar;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return false;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: i0 */
    public AbstractC14411h mo6113i0() {
        AbstractC14411h.C14413b bVar = AbstractC14411h.C14413b.f32626b;
        if (bVar == null) {
            m6128D0(18);
        }
        return bVar;
    }

    @Override // p268og.AbstractC11313e
    public boolean isInline() {
        return false;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: j0 */
    public AbstractC11313e mo6112j0() {
        return null;
    }

    @Override // p268og.AbstractC11326h
    /* renamed from: k */
    public AbstractC7268g1 mo6111k() {
        AbstractC7268g1 g1Var = this.f28478w;
        if (g1Var == null) {
            m6128D0(11);
        }
        return g1Var;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11330i
    /* renamed from: r */
    public List<AbstractC11319f1> mo6109r() {
        List<AbstractC11319f1> list = this.f28479x;
        if (list == null) {
            m6128D0(15);
        }
        return list;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        EnumC11314e0 e0Var = this.f28476u;
        if (e0Var == null) {
            m6128D0(7);
        }
        return e0Var;
    }

    public String toString() {
        return AbstractC12612j.m6352e0(this);
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: x */
    public Collection<AbstractC11313e> mo6107x() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6128D0(19);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11330i
    /* renamed from: y */
    public boolean mo6106y() {
        return this.f28475t;
    }
}
