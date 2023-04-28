package p468zh;

import fi.AbstractC7267g0;
import p268og.AbstractC11297a;

/* renamed from: zh.d */
/* loaded from: classes8.dex */
public class C14660d extends AbstractC14657a {

    /* renamed from: c */
    private final AbstractC11297a f33139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14660d(AbstractC11297a aVar, AbstractC7267g0 g0Var, AbstractC14663g gVar) {
        super(g0Var, gVar);
        if (aVar == null) {
            m49c(0);
        }
        if (g0Var == null) {
            m49c(1);
        }
        this.f33139c = aVar;
    }

    /* renamed from: c */
    private static /* synthetic */ void m49c(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f33139c + "}";
    }
}
