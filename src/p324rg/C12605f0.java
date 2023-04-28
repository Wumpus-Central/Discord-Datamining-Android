package p324rg;

import p268og.AbstractC11346m;
import p468zh.AbstractC14663g;
import pg.AbstractC11672g;

/* renamed from: rg.f0 */
/* loaded from: classes8.dex */
public class C12605f0 extends AbstractC12590c {

    /* renamed from: m */
    private final AbstractC11346m f28346m;

    /* renamed from: n */
    private AbstractC14663g f28347n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12605f0(AbstractC11346m mVar, AbstractC14663g gVar, AbstractC11672g gVar2) {
        super(gVar2);
        if (mVar == null) {
            m6367I(0);
        }
        if (gVar == null) {
            m6367I(1);
        }
        if (gVar2 == null) {
            m6367I(2);
        }
        this.f28346m = mVar;
        this.f28347n = gVar;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6367I(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = "copy";
            } else if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4) {
            throw new IllegalStateException(format);
        }
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        AbstractC11346m mVar = this.f28346m;
        if (mVar == null) {
            m6367I(4);
        }
        return mVar;
    }

    @Override // p268og.AbstractC11396x0
    public AbstractC14663g getValue() {
        AbstractC14663g gVar = this.f28347n;
        if (gVar == null) {
            m6367I(3);
        }
        return gVar;
    }
}
