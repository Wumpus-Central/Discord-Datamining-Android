package p324rg;

import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11346m;

/* renamed from: rg.g */
/* loaded from: classes8.dex */
public abstract class AbstractC12606g extends AbstractC12582a {

    /* renamed from: p */
    private final AbstractC11346m f28348p;

    /* renamed from: q */
    private final AbstractC11299a1 f28349q;

    /* renamed from: r */
    private final boolean f28350r;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12606g(AbstractC6944n nVar, AbstractC11346m mVar, C11142f fVar, AbstractC11299a1 a1Var, boolean z) {
        super(nVar, fVar);
        if (nVar == null) {
            m6366D0(0);
        }
        if (mVar == null) {
            m6366D0(1);
        }
        if (fVar == null) {
            m6366D0(2);
        }
        if (a1Var == null) {
            m6366D0(3);
        }
        this.f28348p = mVar;
        this.f28349q = a1Var;
        this.f28350r = z;
    }

    /* renamed from: D0 */
    private static /* synthetic */ void m6366D0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11358n, p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        AbstractC11346m mVar = this.f28348p;
        if (mVar == null) {
            m6366D0(4);
        }
        return mVar;
    }

    public boolean isExternal() {
        return this.f28350r;
    }

    @Override // p268og.AbstractC11365p
    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        AbstractC11299a1 a1Var = this.f28349q;
        if (a1Var == null) {
            m6366D0(5);
        }
        return a1Var;
    }
}
