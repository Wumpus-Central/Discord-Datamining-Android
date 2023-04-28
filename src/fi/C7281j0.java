package fi;

import gi.AbstractC7664g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p182ji.AbstractC9618i;

/* renamed from: fi.j0 */
/* loaded from: classes8.dex */
public final class C7281j0 extends AbstractC7342x1 {

    /* renamed from: l */
    private final AbstractC6944n f15755l;

    /* renamed from: m */
    private final Function0<AbstractC7267g0> f15756m;

    /* renamed from: n */
    private final AbstractC6938i<AbstractC7267g0> f15757n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.j0$a */
    /* loaded from: classes8.dex */
    public static final class C7282a extends AbstractC9973s implements Function0<AbstractC7267g0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7664g f15758k;

        /* renamed from: l */
        final /* synthetic */ C7281j0 f15759l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7282a(AbstractC7664g gVar, C7281j0 j0Var) {
            super(0);
            this.f15758k = gVar;
            this.f15759l = j0Var;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke() {
            return this.f15758k.mo21694h((AbstractC9618i) this.f15759l.f15756m.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7281j0(AbstractC6944n storageManager, Function0<? extends AbstractC7267g0> computation) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(computation, "computation");
        this.f15755l = storageManager;
        this.f15756m = computation;
        this.f15757n = storageManager.mo23898c(computation);
    }

    @Override // fi.AbstractC7342x1
    /* renamed from: R0 */
    protected AbstractC7267g0 mo22867R0() {
        return this.f15757n.invoke();
    }

    @Override // fi.AbstractC7342x1
    /* renamed from: S0 */
    public boolean mo22866S0() {
        return this.f15757n.m23906p();
    }

    /* renamed from: U0 */
    public C7281j0 mo5170P0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C7281j0(this.f15755l, new C7282a(kotlinTypeRefiner, this));
    }
}
