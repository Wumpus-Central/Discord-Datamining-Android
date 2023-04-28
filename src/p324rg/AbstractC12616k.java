package p324rg;

import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11346m;
import p268og.AbstractC11358n;
import p268og.AbstractC11365p;
import pg.AbstractC11672g;

/* renamed from: rg.k */
/* loaded from: classes8.dex */
public abstract class AbstractC12616k extends AbstractC12612j implements AbstractC11358n {

    /* renamed from: m */
    private final AbstractC11346m f28364m;

    /* renamed from: n */
    private final AbstractC11299a1 f28365n;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12616k(AbstractC11346m mVar, AbstractC11672g gVar, C11142f fVar, AbstractC11299a1 a1Var) {
        super(gVar, fVar);
        if (mVar == null) {
            m6337I(0);
        }
        if (gVar == null) {
            m6337I(1);
        }
        if (fVar == null) {
            m6337I(2);
        }
        if (a1Var == null) {
            m6337I(3);
        }
        this.f28364m = mVar;
        this.f28365n = a1Var;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6337I(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: D0 */
    public AbstractC11365p mo6162a() {
        AbstractC11365p pVar = (AbstractC11365p) super.mo6162a();
        if (pVar == null) {
            m6337I(4);
        }
        return pVar;
    }

    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        AbstractC11346m mVar = this.f28364m;
        if (mVar == null) {
            m6337I(5);
        }
        return mVar;
    }

    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        AbstractC11299a1 a1Var = this.f28365n;
        if (a1Var == null) {
            m6337I(6);
        }
        return a1Var;
    }
}
