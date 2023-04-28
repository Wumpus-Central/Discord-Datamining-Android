package p319ra;

import com.google.android.gms.common.api.internal.C5378d;
import java.util.Set;

/* renamed from: ra.n */
/* loaded from: classes3.dex */
final class BinderC12526n extends AbstractBinderC12548y {

    /* renamed from: a */
    private final C5378d f28192a;

    /* renamed from: b */
    private final Set f28193b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static boolean m6585e0(C12504e0 e0Var) {
        if (e0Var.m6608p() == null) {
            return false;
        }
        if (e0Var.m6607r() == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(e0Var.m6607r())) {
            return true;
        }
        return false;
    }

    @Override // p319ra.AbstractC12550z
    /* renamed from: C */
    public final synchronized void mo6572C(C12498c0 c0Var) {
        this.f28192a.m29054c(new C12518j(this, c0Var));
    }

    @Override // p319ra.AbstractC12550z
    /* renamed from: W */
    public final synchronized void mo6571W(C12510g0 g0Var) {
        this.f28193b.remove(g0Var.m6603p());
        this.f28192a.m29054c(new C12522l(this, g0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void m6587c() {
        for (String str : this.f28193b) {
            this.f28192a.m29054c(new C12524m(this, str));
        }
        this.f28193b.clear();
    }

    @Override // p319ra.AbstractC12550z
    /* renamed from: n */
    public final synchronized void mo6570n(C12504e0 e0Var) {
        if (!m6585e0(e0Var)) {
            this.f28193b.add(e0Var.m6607r());
        }
        this.f28192a.m29054c(new C12520k(this, e0Var));
    }
}
