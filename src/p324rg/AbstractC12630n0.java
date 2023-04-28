package p324rg;

import fi.AbstractC7267g0;
import kotlin.jvm.functions.Function0;
import p087ei.AbstractC6939j;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11346m;
import pg.AbstractC11672g;
import th.AbstractC13104g;

/* renamed from: rg.n0 */
/* loaded from: classes8.dex */
public abstract class AbstractC12630n0 extends AbstractC12624m0 {

    /* renamed from: p */
    private final boolean f28395p;

    /* renamed from: q */
    protected AbstractC6939j<AbstractC13104g<?>> f28396q;

    /* renamed from: r */
    protected Function0<AbstractC6939j<AbstractC13104g<?>>> f28397r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12630n0(AbstractC11346m mVar, AbstractC11672g gVar, C11142f fVar, AbstractC7267g0 g0Var, boolean z, AbstractC11299a1 a1Var) {
        super(mVar, gVar, fVar, g0Var, a1Var);
        if (mVar == null) {
            m6279I(0);
        }
        if (gVar == null) {
            m6279I(1);
        }
        if (fVar == null) {
            m6279I(2);
        }
        if (a1Var == null) {
            m6279I(3);
        }
        this.f28395p = z;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6279I(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: K0 */
    public void m6278K0(AbstractC6939j<AbstractC13104g<?>> jVar, Function0<AbstractC6939j<AbstractC13104g<?>>> function0) {
        if (function0 == null) {
            m6279I(5);
        }
        this.f28397r = function0;
        if (jVar == null) {
            jVar = function0.invoke();
        }
        this.f28396q = jVar;
    }

    @Override // p268og.AbstractC11342k1
    /* renamed from: L */
    public boolean mo6277L() {
        return this.f28395p;
    }

    /* renamed from: L0 */
    public void m6276L0(Function0<AbstractC6939j<AbstractC13104g<?>>> function0) {
        if (function0 == null) {
            m6279I(4);
        }
        m6278K0(null, function0);
    }

    @Override // p268og.AbstractC11342k1
    /* renamed from: k0 */
    public AbstractC13104g<?> mo6275k0() {
        AbstractC6939j<AbstractC13104g<?>> jVar = this.f28396q;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }
}
