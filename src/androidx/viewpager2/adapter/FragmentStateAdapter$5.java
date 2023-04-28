package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements AbstractC3038j {

    /* renamed from: k */
    final /* synthetic */ Handler f5288k;

    /* renamed from: l */
    final /* synthetic */ Runnable f5289l;

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        if (bVar == Lifecycle.EnumC3010b.ON_DESTROY) {
            this.f5288k.removeCallbacks(this.f5289l);
            lifecycleOwner.getLifecycle().mo35842c(this);
        }
    }
}
