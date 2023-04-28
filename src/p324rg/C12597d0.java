package p324rg;

import fi.AbstractC7267g0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11335j1;
import p268og.AbstractC11363o;
import p268og.AbstractC11386t0;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.EnumC11314e0;
import pg.AbstractC11672g;

/* renamed from: rg.d0 */
/* loaded from: classes8.dex */
public class C12597d0 extends AbstractC12589b0 implements AbstractC11390v0 {

    /* renamed from: w */
    private AbstractC7267g0 f28328w;

    /* renamed from: x */
    private final AbstractC11390v0 f28329x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12597d0(AbstractC11388u0 u0Var, AbstractC11672g gVar, EnumC11314e0 e0Var, AbstractC11387u uVar, boolean z, boolean z2, boolean z3, AbstractC11301b.EnumC11302a aVar, AbstractC11390v0 v0Var, AbstractC11299a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, C11142f.m10764i("<get-" + u0Var.getName() + ">"), z, z2, z3, aVar, a1Var);
        C12597d0 d0Var;
        C12597d0 d0Var2;
        if (u0Var == null) {
            m6399I(0);
        }
        if (gVar == null) {
            m6399I(1);
        }
        if (e0Var == null) {
            m6399I(2);
        }
        if (uVar == null) {
            m6399I(3);
        }
        if (aVar == null) {
            m6399I(4);
        }
        if (a1Var == null) {
            m6399I(5);
        }
        if (v0Var != 0) {
            d0Var = this;
            d0Var2 = v0Var;
        } else {
            d0Var2 = this;
            d0Var = d0Var2;
        }
        d0Var.f28329x = d0Var2;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6399I(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 6 || i == 7 || i == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo6312m(this, d);
    }

    /* renamed from: P0 */
    public AbstractC11390v0 mo6162a() {
        AbstractC11390v0 v0Var = this.f28329x;
        if (v0Var == null) {
            m6399I(8);
        }
        return v0Var;
    }

    /* renamed from: Q0 */
    public void m6397Q0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            g0Var = mo6459T().getType();
        }
        this.f28328w = g0Var;
    }

    @Override // p268og.AbstractC11397y, p268og.AbstractC11301b, p268og.AbstractC11297a
    /* renamed from: d */
    public Collection<? extends AbstractC11390v0> mo6249d() {
        Collection<AbstractC11386t0> L0 = super.m6463L0(true);
        if (L0 == null) {
            m6399I(6);
        }
        return L0;
    }

    @Override // p268og.AbstractC11297a
    public AbstractC7267g0 getReturnType() {
        return this.f28328w;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: i */
    public List<AbstractC11335j1> mo6242i() {
        List<AbstractC11335j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6399I(7);
        }
        return emptyList;
    }
}
