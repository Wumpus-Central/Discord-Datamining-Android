package p324rg;

import p249nh.C11142f;
import p268og.AbstractC11346m;
import p305qh.AbstractC12137c;
import pg.AbstractC11672g;
import pg.C11665b;

/* renamed from: rg.j */
/* loaded from: classes8.dex */
public abstract class AbstractC12612j extends C11665b implements AbstractC11346m {

    /* renamed from: l */
    private final C11142f f28361l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12612j(AbstractC11672g gVar, C11142f fVar) {
        super(gVar);
        if (gVar == null) {
            m6353I(0);
        }
        if (fVar == null) {
            m6353I(1);
        }
        this.f28361l = fVar;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6353I(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: e0 */
    public static String m6352e0(AbstractC11346m mVar) {
        if (mVar == null) {
            m6353I(4);
        }
        try {
            String str = AbstractC12137c.f27233j.mo7630q(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                m6353I(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 == null) {
                m6353I(6);
            }
            return str2;
        }
    }

    /* renamed from: a */
    public AbstractC11346m mo6162a() {
        return this;
    }

    @Override // p268og.AbstractC11334j0
    public C11142f getName() {
        C11142f fVar = this.f28361l;
        if (fVar == null) {
            m6353I(2);
        }
        return fVar;
    }

    public String toString() {
        return m6352e0(this);
    }
}
