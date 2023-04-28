package fi;

import gi.AbstractC7664g;

/* renamed from: fi.m1 */
/* loaded from: classes8.dex */
public class C7296m1 extends AbstractC7293l1 {

    /* renamed from: a */
    private final EnumC7338w1 f15776a;

    /* renamed from: b */
    private final AbstractC7267g0 f15777b;

    public C7296m1(EnumC7338w1 w1Var, AbstractC7267g0 g0Var) {
        if (w1Var == null) {
            m23004c(0);
        }
        if (g0Var == null) {
            m23004c(1);
        }
        this.f15776a = w1Var;
        this.f15777b = g0Var;
    }

    /* renamed from: c */
    private static /* synthetic */ void m23004c(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: a */
    public boolean mo22907a() {
        return false;
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: b */
    public EnumC7338w1 mo22906b() {
        EnumC7338w1 w1Var = this.f15776a;
        if (w1Var == null) {
            m23004c(4);
        }
        return w1Var;
    }

    @Override // fi.AbstractC7290k1
    public AbstractC7267g0 getType() {
        AbstractC7267g0 g0Var = this.f15777b;
        if (g0Var == null) {
            m23004c(5);
        }
        return g0Var;
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: o */
    public AbstractC7290k1 mo22903o(AbstractC7664g gVar) {
        if (gVar == null) {
            m23004c(6);
        }
        return new C7296m1(this.f15776a, gVar.mo21694h(this.f15777b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7296m1(AbstractC7267g0 g0Var) {
        this(EnumC7338w1.INVARIANT, g0Var);
        if (g0Var == null) {
            m23004c(2);
        }
    }
}
