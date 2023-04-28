package p324rg;

import fi.EnumC7338w1;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11311d1;
import p268og.AbstractC11346m;
import pg.AbstractC11672g;

/* renamed from: rg.b */
/* loaded from: classes8.dex */
public abstract class AbstractC12588b extends AbstractC12598e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12588b(AbstractC6944n nVar, AbstractC11346m mVar, AbstractC11672g gVar, C11142f fVar, EnumC7338w1 w1Var, boolean z, int i, AbstractC11299a1 a1Var, AbstractC11311d1 d1Var) {
        super(nVar, mVar, gVar, fVar, w1Var, z, i, a1Var, d1Var);
        if (nVar == null) {
            m6467I(0);
        }
        if (mVar == null) {
            m6467I(1);
        }
        if (gVar == null) {
            m6467I(2);
        }
        if (fVar == null) {
            m6467I(3);
        }
        if (w1Var == null) {
            m6467I(4);
        }
        if (a1Var == null) {
            m6467I(5);
        }
        if (d1Var == null) {
            m6467I(6);
        }
    }

    /* renamed from: I */
    private static /* synthetic */ void m6467I(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p324rg.AbstractC12612j
    public String toString() {
        String str;
        Object[] objArr = new Object[3];
        String str2 = "";
        if (mo6391w()) {
            str = "reified ";
        } else {
            str = str2;
        }
        objArr[0] = str;
        if (mo6392m() != EnumC7338w1.INVARIANT) {
            str2 = mo6392m() + " ";
        }
        objArr[1] = str2;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
