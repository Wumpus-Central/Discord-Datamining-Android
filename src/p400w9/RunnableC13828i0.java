package p400w9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: w9.i0 */
/* loaded from: classes5.dex */
final class RunnableC13828i0 implements Runnable {

    /* renamed from: k */
    final /* synthetic */ LifecycleCallback f31140k;

    /* renamed from: l */
    final /* synthetic */ String f31141l;

    /* renamed from: m */
    final /* synthetic */ FragmentC13830j0 f31142m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC13828i0(FragmentC13830j0 j0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f31142m = j0Var;
        this.f31140k = lifecycleCallback;
        this.f31141l = str;
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
        FragmentC13830j0 j0Var = this.f31142m;
        i = j0Var.f31145l;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f31140k;
            bundle = j0Var.f31146m;
            if (bundle != null) {
                bundle3 = j0Var.f31146m;
                bundle2 = bundle3.getBundle(this.f31141l);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo29000f(bundle2);
        }
        i2 = this.f31142m.f31145l;
        if (i2 >= 2) {
            this.f31140k.mo28998j();
        }
        i3 = this.f31142m.f31145l;
        if (i3 >= 3) {
            this.f31140k.mo29007h();
        }
        i4 = this.f31142m.f31145l;
        if (i4 >= 4) {
            this.f31140k.mo28997k();
        }
        i5 = this.f31142m.f31145l;
        if (i5 >= 5) {
            this.f31140k.m29102g();
        }
    }
}
