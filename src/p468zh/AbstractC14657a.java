package p468zh;

import fi.AbstractC7267g0;

/* renamed from: zh.a */
/* loaded from: classes8.dex */
public abstract class AbstractC14657a implements AbstractC14663g {

    /* renamed from: a */
    protected final AbstractC7267g0 f33133a;

    /* renamed from: b */
    private final AbstractC14663g f33134b;

    public AbstractC14657a(AbstractC7267g0 g0Var, AbstractC14663g gVar) {
        if (g0Var == null) {
            m51c(0);
        }
        this.f33133a = g0Var;
        this.f33134b = gVar == null ? this : gVar;
    }

    /* renamed from: c */
    private static /* synthetic */ void m51c(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // p468zh.AbstractC14663g
    public AbstractC7267g0 getType() {
        AbstractC7267g0 g0Var = this.f33133a;
        if (g0Var == null) {
            m51c(1);
        }
        return g0Var;
    }
}
