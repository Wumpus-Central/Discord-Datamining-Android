package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7291l;
import gi.AbstractC7664g;
import java.util.Collection;
import java.util.Collections;
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
import p268og.C11373t;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p448yh.AbstractC14411h;
import pg.AbstractC11672g;

/* renamed from: rg.h */
/* loaded from: classes8.dex */
public class C12608h extends AbstractC12606g {

    /* renamed from: s */
    private final EnumC11314e0 f28351s;

    /* renamed from: t */
    private final EnumC11317f f28352t;

    /* renamed from: u */
    private final AbstractC7268g1 f28353u;

    /* renamed from: v */
    private AbstractC14411h f28354v;

    /* renamed from: w */
    private Set<AbstractC11309d> f28355w;

    /* renamed from: x */
    private AbstractC11309d f28356x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12608h(AbstractC11346m mVar, C11142f fVar, EnumC11314e0 e0Var, EnumC11317f fVar2, Collection<AbstractC7267g0> collection, AbstractC11299a1 a1Var, boolean z, AbstractC6944n nVar) {
        super(nVar, mVar, fVar, a1Var, z);
        if (mVar == null) {
            m6360D0(0);
        }
        if (fVar == null) {
            m6360D0(1);
        }
        if (e0Var == null) {
            m6360D0(2);
        }
        if (fVar2 == null) {
            m6360D0(3);
        }
        if (collection == null) {
            m6360D0(4);
        }
        if (a1Var == null) {
            m6360D0(5);
        }
        if (nVar == null) {
            m6360D0(6);
        }
        this.f28351s = e0Var;
        this.f28352t = fVar2;
        this.f28353u = new C7291l(this, Collections.emptyList(), collection, nVar);
    }

    /* renamed from: D0 */
    private static /* synthetic */ void m6360D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: B */
    public AbstractC11309d mo6129B() {
        return this.f28356x;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: I0 */
    public boolean mo6127I0() {
        return false;
    }

    /* renamed from: K0 */
    public final void m6359K0(AbstractC14411h hVar, Set<AbstractC11309d> set, AbstractC11309d dVar) {
        if (hVar == null) {
            m6360D0(7);
        }
        if (set == null) {
            m6360D0(8);
        }
        this.f28354v = hVar;
        this.f28355w = set;
        this.f28356x = dVar;
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
            m6360D0(12);
        }
        AbstractC14411h hVar = this.f28354v;
        if (hVar == null) {
            m6360D0(13);
        }
        return hVar;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g */
    public EnumC11317f mo6116g() {
        EnumC11317f fVar = this.f28352t;
        if (fVar == null) {
            m6360D0(15);
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
            m6360D0(9);
        }
        return b;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u uVar = C11373t.f25299e;
        if (uVar == null) {
            m6360D0(17);
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
            m6360D0(14);
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
        AbstractC7268g1 g1Var = this.f28353u;
        if (g1Var == null) {
            m6360D0(10);
        }
        return g1Var;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: l */
    public Collection<AbstractC11309d> mo6110l() {
        Set<AbstractC11309d> set = this.f28355w;
        if (set == null) {
            m6360D0(11);
        }
        return set;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11330i
    /* renamed from: r */
    public List<AbstractC11319f1> mo6109r() {
        List<AbstractC11319f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6360D0(18);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        EnumC11314e0 e0Var = this.f28351s;
        if (e0Var == null) {
            m6360D0(16);
        }
        return e0Var;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: x */
    public Collection<AbstractC11313e> mo6107x() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6360D0(19);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11330i
    /* renamed from: y */
    public boolean mo6106y() {
        return false;
    }
}
