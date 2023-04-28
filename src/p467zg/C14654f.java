package p467zg;

import fi.AbstractC7267g0;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function0;
import p087ei.AbstractC6939j;
import p108fh.C7219r;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.AbstractC11392w0;
import p268og.AbstractC11396x0;
import p268og.C11333j;
import p268og.EnumC11314e0;
import p324rg.C12591c0;
import p324rg.C12597d0;
import p324rg.C12603e0;
import p325rh.C12659d;
import pg.AbstractC11672g;
import th.AbstractC13104g;

/* renamed from: zg.f */
/* loaded from: classes8.dex */
public class C14654f extends C12591c0 implements AbstractC14646a {

    /* renamed from: M */
    private final boolean f39528M;

    /* renamed from: N */
    private final Pair<AbstractC11297a.AbstractC0362a<?>, ?> f39529N;

    /* renamed from: O */
    private AbstractC7267g0 f39530O;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14654f(AbstractC11346m mVar, AbstractC11672g gVar, EnumC11314e0 e0Var, AbstractC11387u uVar, boolean z, C11142f fVar, AbstractC11299a1 a1Var, AbstractC11388u0 u0Var, AbstractC11301b.EnumC11302a aVar, boolean z2, Pair<AbstractC11297a.AbstractC0362a<?>, ?> pair) {
        super(mVar, u0Var, gVar, e0Var, uVar, z, fVar, aVar, a1Var, false, false, false, false, false, false);
        if (mVar == null) {
            m61I(0);
        }
        if (gVar == null) {
            m61I(1);
        }
        if (e0Var == null) {
            m61I(2);
        }
        if (uVar == null) {
            m61I(3);
        }
        if (fVar == null) {
            m61I(4);
        }
        if (a1Var == null) {
            m61I(5);
        }
        if (aVar == null) {
            m61I(6);
        }
        this.f39530O = null;
        this.f39528M = z2;
        this.f39529N = pair;
    }

    /* renamed from: I */
    private static /* synthetic */ void m61I(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: f1 */
    public static C14654f m56f1(AbstractC11346m mVar, AbstractC11672g gVar, EnumC11314e0 e0Var, AbstractC11387u uVar, boolean z, C11142f fVar, AbstractC11299a1 a1Var, boolean z2) {
        if (mVar == null) {
            m61I(7);
        }
        if (gVar == null) {
            m61I(8);
        }
        if (e0Var == null) {
            m61I(9);
        }
        if (uVar == null) {
            m61I(10);
        }
        if (fVar == null) {
            m61I(11);
        }
        if (a1Var == null) {
            m61I(12);
        }
        return new C14654f(mVar, gVar, e0Var, uVar, z, fVar, a1Var, null, AbstractC11301b.EnumC11302a.DECLARATION, z2, null);
    }

    @Override // p467zg.AbstractC14646a
    /* renamed from: H0 */
    public AbstractC14646a mo62H0(AbstractC7267g0 g0Var, List<AbstractC7267g0> list, AbstractC7267g0 g0Var2, Pair<AbstractC11297a.AbstractC0362a<?>, ?> pair) {
        AbstractC11388u0 u0Var;
        C12597d0 d0Var;
        C12603e0 e0Var;
        AbstractC11396x0 x0Var;
        List<AbstractC11396x0> i;
        AbstractC11392w0 w0Var;
        AbstractC11390v0 v0Var;
        if (list == null) {
            m61I(19);
        }
        if (g0Var2 == null) {
            m61I(20);
        }
        if (mo6162a() == this) {
            u0Var = null;
        } else {
            u0Var = mo6162a();
        }
        C14654f fVar = new C14654f(mo6104b(), getAnnotations(), mo6108s(), getVisibility(), mo6277L(), getName(), mo6102j(), u0Var, mo6245g(), this.f39528M, pair);
        C12597d0 R0 = mo6437f();
        if (R0 != null) {
            AbstractC11672g annotations = R0.getAnnotations();
            EnumC11314e0 s = R0.mo6108s();
            AbstractC11387u visibility = R0.getVisibility();
            boolean D = R0.mo6466D();
            boolean isExternal = R0.isExternal();
            boolean isInline = R0.isInline();
            AbstractC11301b.EnumC11302a g = mo6245g();
            if (u0Var == null) {
                v0Var = null;
            } else {
                v0Var = u0Var.mo6437f();
            }
            d0Var = r15;
            C12597d0 d0Var2 = new C12597d0(fVar, annotations, s, visibility, D, isExternal, isInline, g, v0Var, R0.mo6102j());
            d0Var.m6461N0(R0.mo6239p0());
            d0Var.m6397Q0(g0Var2);
        } else {
            d0Var = null;
        }
        AbstractC11392w0 h = mo6436h();
        if (h != null) {
            AbstractC11672g annotations2 = h.getAnnotations();
            EnumC11314e0 s2 = h.mo6108s();
            AbstractC11387u visibility2 = h.getVisibility();
            boolean D2 = h.mo6466D();
            boolean isExternal2 = h.isExternal();
            boolean isInline2 = h.isInline();
            AbstractC11301b.EnumC11302a g2 = mo6245g();
            if (u0Var == null) {
                w0Var = null;
            } else {
                w0Var = u0Var.mo6436h();
            }
            C12603e0 e0Var2 = new C12603e0(fVar, annotations2, s2, visibility2, D2, isExternal2, isInline2, g2, w0Var, h.mo6102j());
            e0Var2.m6461N0(e0Var2.mo6239p0());
            e0Var2.m6376R0(h.mo6242i().get(0));
            e0Var = e0Var2;
        } else {
            e0Var = null;
        }
        fVar.m6446V0(d0Var, e0Var, mo6435t0(), mo6454N());
        fVar.m6442a1(m6445W0());
        Function0<AbstractC6939j<AbstractC13104g<?>>> function0 = this.f28397r;
        if (function0 != null) {
            fVar.m6278K0(this.f28396q, function0);
        }
        fVar.mo6272B0(mo6249d());
        if (g0Var == null) {
            x0Var = null;
        } else {
            x0Var = C12659d.m6076i(this, g0Var, AbstractC11672g.f26044g.m9048b());
        }
        List<AbstractC11319f1> typeParameters = getTypeParameters();
        AbstractC11396x0 J = mo6266J();
        i = C9906j.m14820i();
        fVar.m6441b1(g0Var2, typeParameters, J, x0Var, i);
        return fVar;
    }

    @Override // p324rg.C12591c0
    /* renamed from: P0 */
    protected C12591c0 mo60P0(AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11388u0 u0Var, AbstractC11301b.EnumC11302a aVar, C11142f fVar, AbstractC11299a1 a1Var) {
        if (mVar == null) {
            m61I(13);
        }
        if (e0Var == null) {
            m61I(14);
        }
        if (uVar == null) {
            m61I(15);
        }
        if (aVar == null) {
            m61I(16);
        }
        if (fVar == null) {
            m61I(17);
        }
        if (a1Var == null) {
            m61I(18);
        }
        return new C14654f(mVar, getAnnotations(), e0Var, uVar, mo6277L(), fVar, a1Var, u0Var, aVar, this.f39528M, this.f39529N);
    }

    @Override // p324rg.C12591c0, p268og.AbstractC11342k1
    /* renamed from: Y */
    public boolean mo59Y() {
        AbstractC7267g0 type = getType();
        if (!this.f39528M || !C11333j.m10202a(type) || (C7219r.m23181i(type) && !AbstractC10420h.m13362u0(type))) {
            return false;
        }
        return true;
    }

    @Override // p324rg.C12591c0
    /* renamed from: Z0 */
    public void mo58Z0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m61I(22);
        }
        this.f39530O = g0Var;
    }

    @Override // p324rg.AbstractC12624m0, p268og.AbstractC11297a
    /* renamed from: d0 */
    public boolean mo57d0() {
        return false;
    }

    @Override // p324rg.C12591c0, p268og.AbstractC11297a
    /* renamed from: s0 */
    public <V> V mo55s0(AbstractC11297a.AbstractC0362a<V> aVar) {
        Pair<AbstractC11297a.AbstractC0362a<?>, ?> pair = this.f39529N;
        if (pair == null || !pair.m15065c().equals(aVar)) {
            return null;
        }
        return (V) this.f39529N.m15064d();
    }
}
