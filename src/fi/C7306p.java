package fi;

import gi.AbstractC7677n;
import gi.C7667i;
import gi.C7678o;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p182ji.AbstractC9614e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p324rg.C12617k0;

/* renamed from: fi.p */
/* loaded from: classes8.dex */
public final class C7306p extends AbstractC7317r implements AbstractC7297n, AbstractC9614e {

    /* renamed from: n */
    public static final C7307a f15782n = new C7307a(null);

    /* renamed from: l */
    private final AbstractC7304o0 f15783l;

    /* renamed from: m */
    private final boolean f15784m;

    /* renamed from: fi.p$a */
    /* loaded from: classes8.dex */
    public static final class C7307a {
        private C7307a() {
        }

        public /* synthetic */ C7307a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final boolean m22989a(AbstractC7335v1 v1Var) {
            if ((v1Var.mo5172N0() instanceof AbstractC7677n) || (v1Var.mo5172N0().mo4565p() instanceof AbstractC11319f1) || (v1Var instanceof C7667i) || (v1Var instanceof C7337w0)) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private final boolean m22987c(AbstractC7335v1 v1Var, boolean z) {
            C12617k0 k0Var;
            boolean z2 = false;
            if (!m22989a(v1Var)) {
                return false;
            }
            if (v1Var instanceof C7337w0) {
                return C7322s1.m22935l(v1Var);
            }
            AbstractC11326h p = v1Var.mo5172N0().mo4565p();
            if (p instanceof C12617k0) {
                k0Var = (C12617k0) p;
            } else {
                k0Var = null;
            }
            if (k0Var != null && !k0Var.m6326T0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            if (!z || !(v1Var.mo5172N0().mo4565p() instanceof AbstractC11319f1)) {
                return !C7678o.f16685a.m21667a(v1Var);
            }
            return C7322s1.m22935l(v1Var);
        }

        /* renamed from: b */
        public final C7306p m22988b(AbstractC7335v1 type, boolean z) {
            C9971q.m14633g(type, "type");
            if (type instanceof C7306p) {
                return (C7306p) type;
            }
            if (!m22987c(type, z)) {
                return null;
            }
            if (type instanceof AbstractC7223a0) {
                AbstractC7223a0 a0Var = (AbstractC7223a0) type;
                C9971q.m14638b(a0Var.m23170V0().mo5172N0(), a0Var.m23169W0().mo5172N0());
            }
            return new C7306p(C7235d0.m23143c(type).mo5166U0(false), z, null);
        }
    }

    private C7306p(AbstractC7304o0 o0Var, boolean z) {
        this.f15783l = o0Var;
        this.f15784m = z;
    }

    public /* synthetic */ C7306p(AbstractC7304o0 o0Var, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(o0Var, z);
    }

    @Override // fi.AbstractC7297n
    /* renamed from: D0 */
    public boolean mo22993D0() {
        if ((mo22923W0().mo5172N0() instanceof AbstractC7677n) || (mo22923W0().mo5172N0().mo4565p() instanceof AbstractC11319f1)) {
            return true;
        }
        return false;
    }

    @Override // fi.AbstractC7297n
    /* renamed from: I */
    public AbstractC7267g0 mo22992I(AbstractC7267g0 replacement) {
        C9971q.m14633g(replacement, "replacement");
        return C7321s0.m22953e(replacement.mo22868Q0(), this.f15784m);
    }

    @Override // fi.AbstractC7317r, fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return false;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: U0 */
    public AbstractC7304o0 mo5169R0(boolean z) {
        return z ? mo22923W0().mo5166U0(z) : this;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return new C7306p(mo22923W0().mo5165V0(newAttributes), this.f15784m);
    }

    @Override // fi.AbstractC7317r
    /* renamed from: W0 */
    protected AbstractC7304o0 mo22923W0() {
        return this.f15783l;
    }

    /* renamed from: Z0 */
    public final AbstractC7304o0 m22991Z0() {
        return this.f15783l;
    }

    /* renamed from: a1 */
    public C7306p mo22921Y0(AbstractC7304o0 delegate) {
        C9971q.m14633g(delegate, "delegate");
        return new C7306p(delegate, this.f15784m);
    }

    @Override // fi.AbstractC7304o0
    public String toString() {
        return mo22923W0() + " & Any";
    }
}
