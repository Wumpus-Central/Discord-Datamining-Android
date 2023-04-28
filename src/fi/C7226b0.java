package fi;

import gi.AbstractC7659e;
import gi.AbstractC7664g;
import ki.C9883a;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;
import p268og.AbstractC11319f1;
import p305qh.AbstractC12137c;
import p305qh.AbstractC12161f;

/* renamed from: fi.b0 */
/* loaded from: classes8.dex */
public final class C7226b0 extends AbstractC7223a0 implements AbstractC7297n {

    /* renamed from: o */
    public static final C7227a f15665o = new C7227a(null);

    /* renamed from: p */
    public static boolean f15666p;

    /* renamed from: n */
    private boolean f15667n;

    /* renamed from: fi.b0$a */
    /* loaded from: classes8.dex */
    public static final class C7227a {
        private C7227a() {
        }

        public /* synthetic */ C7227a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7226b0(AbstractC7304o0 lowerBound, AbstractC7304o0 upperBound) {
        super(lowerBound, upperBound);
        C9971q.m14633g(lowerBound, "lowerBound");
        C9971q.m14633g(upperBound, "upperBound");
    }

    /* renamed from: Z0 */
    private final void m23166Z0() {
        if (f15666p && !this.f15667n) {
            this.f15667n = true;
            C7235d0.m23144b(m23170V0());
            C7235d0.m23144b(m23169W0());
            C9971q.m14638b(m23170V0(), m23169W0());
            AbstractC7659e.f16659a.mo21674b(m23170V0(), m23169W0());
        }
    }

    @Override // fi.AbstractC7297n
    /* renamed from: D0 */
    public boolean mo22993D0() {
        if (!(m23170V0().mo5172N0().mo4565p() instanceof AbstractC11319f1) || !C9971q.m14638b(m23170V0().mo5172N0(), m23169W0().mo5172N0())) {
            return false;
        }
        return true;
    }

    @Override // fi.AbstractC7297n
    /* renamed from: I */
    public AbstractC7267g0 mo22992I(AbstractC7267g0 replacement) {
        AbstractC7335v1 v1Var;
        C9971q.m14633g(replacement, "replacement");
        AbstractC7335v1 Q0 = replacement.mo22868Q0();
        if (Q0 instanceof AbstractC7223a0) {
            v1Var = Q0;
        } else if (Q0 instanceof AbstractC7304o0) {
            AbstractC7304o0 o0Var = (AbstractC7304o0) Q0;
            v1Var = C7270h0.m23056d(o0Var, o0Var.mo5166U0(true));
        } else {
            throw new C11088q();
        }
        return C7331u1.m22900b(v1Var, Q0);
    }

    @Override // fi.AbstractC7335v1
    /* renamed from: R0 */
    public AbstractC7335v1 mo5169R0(boolean z) {
        return C7270h0.m23056d(m23170V0().mo5166U0(z), m23169W0().mo5166U0(z));
    }

    @Override // fi.AbstractC7335v1
    /* renamed from: T0 */
    public AbstractC7335v1 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return C7270h0.m23056d(m23170V0().mo5165V0(newAttributes), m23169W0().mo5165V0(newAttributes));
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: U0 */
    public AbstractC7304o0 mo22897U0() {
        m23166Z0();
        return m23170V0();
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: X0 */
    public String mo22896X0(AbstractC12137c renderer, AbstractC12161f options) {
        C9971q.m14633g(renderer, "renderer");
        C9971q.m14633g(options, "options");
        if (!options.mo7537h()) {
            return renderer.mo7622t(renderer.mo7613w(m23170V0()), renderer.mo7613w(m23169W0()), C9883a.m15096i(this));
        }
        return '(' + renderer.mo7613w(m23170V0()) + ".." + renderer.mo7613w(m23169W0()) + ')';
    }

    /* renamed from: Y0 */
    public AbstractC7223a0 mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7267g0 h = kotlinTypeRefiner.mo21694h(m23170V0());
        C9971q.m14635e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC7267g0 h2 = kotlinTypeRefiner.mo21694h(m23169W0());
        C9971q.m14635e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7226b0((AbstractC7304o0) h, (AbstractC7304o0) h2);
    }

    @Override // fi.AbstractC7223a0
    public String toString() {
        return '(' + m23170V0() + ".." + m23169W0() + ')';
    }
}
