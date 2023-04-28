package p400w9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: w9.k0 */
/* loaded from: classes5.dex */
final class RunnableC13832k0 implements Runnable {

    /* renamed from: k */
    final /* synthetic */ LifecycleCallback f31147k;

    /* renamed from: l */
    final /* synthetic */ String f31148l;

    /* renamed from: m */
    final /* synthetic */ C13834l0 f31149m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC13832k0(C13834l0 l0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f31149m = l0Var;
        this.f31147k = lifecycleCallback;
        this.f31148l = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C13834l0 l0Var = this.f31149m;
        i = l0Var.f31152l;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f31147k;
            bundle = l0Var.f31153m;
            if (bundle != null) {
                bundle3 = l0Var.f31153m;
                bundle2 = bundle3.getBundle(this.f31148l);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo29000f(bundle2);
        }
        i2 = this.f31149m.f31152l;
        if (i2 >= 2) {
            this.f31147k.mo28998j();
        }
        i3 = this.f31149m.f31152l;
        if (i3 >= 3) {
            this.f31147k.mo29007h();
        }
        i4 = this.f31149m.f31152l;
        if (i4 >= 4) {
            this.f31147k.mo28997k();
        }
        i5 = this.f31149m.f31152l;
        if (i5 >= 5) {
            this.f31147k.m29102g();
        }
    }
}
