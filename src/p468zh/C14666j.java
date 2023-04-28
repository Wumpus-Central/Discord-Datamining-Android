package p468zh;

import fi.AbstractC7267g0;

/* renamed from: zh.j */
/* loaded from: classes8.dex */
public class C14666j extends AbstractC14657a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14666j(AbstractC7267g0 g0Var) {
        this(g0Var, null);
        if (g0Var == null) {
            m44c(0);
        }
    }

    /* renamed from: c */
    private static /* synthetic */ void m44c(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C14666j(AbstractC7267g0 g0Var, AbstractC14663g gVar) {
        super(g0Var, gVar);
        if (g0Var == null) {
            m44c(1);
        }
    }
}
