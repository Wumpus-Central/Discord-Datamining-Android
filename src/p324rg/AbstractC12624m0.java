package p324rg;

import fi.AbstractC7267g0;
import java.util.Collections;
import java.util.List;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11342k1;
import p268og.AbstractC11346m;
import p268og.AbstractC11396x0;
import pg.AbstractC11672g;

/* renamed from: rg.m0 */
/* loaded from: classes8.dex */
public abstract class AbstractC12624m0 extends AbstractC12616k implements AbstractC11342k1 {

    /* renamed from: o */
    protected AbstractC7267g0 f28378o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12624m0(AbstractC11346m mVar, AbstractC11672g gVar, C11142f fVar, AbstractC7267g0 g0Var, AbstractC11299a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            m6296I(0);
        }
        if (gVar == null) {
            m6296I(1);
        }
        if (fVar == null) {
            m6296I(2);
        }
        if (a1Var == null) {
            m6296I(3);
        }
        this.f28378o = g0Var;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6296I(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: G0 */
    public void m6297G0(AbstractC7267g0 g0Var) {
        this.f28378o = g0Var;
    }

    /* renamed from: J */
    public AbstractC11396x0 mo6266J() {
        return null;
    }

    /* renamed from: M */
    public AbstractC11396x0 mo6264M() {
        return null;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: d0 */
    public boolean mo57d0() {
        return false;
    }

    public AbstractC7267g0 getReturnType() {
        AbstractC7267g0 type = getType();
        if (type == null) {
            m6296I(10);
        }
        return type;
    }

    @Override // p268og.AbstractC11332i1
    public AbstractC7267g0 getType() {
        AbstractC7267g0 g0Var = this.f28378o;
        if (g0Var == null) {
            m6296I(4);
        }
        return g0Var;
    }

    public List<AbstractC11319f1> getTypeParameters() {
        List<AbstractC11319f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6296I(8);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: i */
    public List<AbstractC11335j1> mo6242i() {
        List<AbstractC11335j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6296I(6);
        }
        return emptyList;
    }
}
