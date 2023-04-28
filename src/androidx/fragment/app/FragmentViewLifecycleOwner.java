package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3056x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.AbstractC3156b;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FragmentViewLifecycleOwner implements AbstractC3156b, AbstractC3056x {

    /* renamed from: k */
    private final Fragment f4125k;

    /* renamed from: l */
    private final ViewModelStore f4126l;

    /* renamed from: m */
    private LifecycleRegistry f4127m = null;

    /* renamed from: n */
    private SavedStateRegistryController f4128n = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore) {
        this.f4125k = fragment;
        this.f4126l = viewModelStore;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36062a(Lifecycle.EnumC3010b bVar) {
        this.f4127m.m35837h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36061b() {
        if (this.f4127m == null) {
            this.f4127m = new LifecycleRegistry(this);
            this.f4128n = SavedStateRegistryController.m35052a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m36060c() {
        return this.f4127m != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36059d(Bundle bundle) {
        this.f4128n.m35050c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36058e(Bundle bundle) {
        this.f4128n.m35049d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36057f(Lifecycle.State state) {
        this.f4127m.m35830o(state);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        m36061b();
        return this.f4127m;
    }

    @Override // androidx.savedstate.AbstractC3156b
    public SavedStateRegistry getSavedStateRegistry() {
        m36061b();
        return this.f4128n.m35051b();
    }

    @Override // androidx.lifecycle.AbstractC3056x
    public ViewModelStore getViewModelStore() {
        m36061b();
        return this.f4126l;
    }
}
