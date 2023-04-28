package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.AbstractC3156b;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
final class SavedStateHandleController implements AbstractC3038j {

    /* renamed from: k */
    private final String f4448k;

    /* renamed from: l */
    private boolean f4449l = false;

    /* renamed from: m */
    private final C3052u f4450m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C3021a implements SavedStateRegistry.AbstractC3153a {
        C3021a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.AbstractC3153a
        /* renamed from: a */
        public void mo35054a(AbstractC3156b bVar) {
            if (bVar instanceof AbstractC3056x) {
                ViewModelStore viewModelStore = ((AbstractC3056x) bVar).getViewModelStore();
                SavedStateRegistry savedStateRegistry = bVar.getSavedStateRegistry();
                for (String str : viewModelStore.m35790c()) {
                    SavedStateHandleController.m35802a(viewModelStore.m35791b(str), savedStateRegistry, bVar.getLifecycle());
                }
                if (!viewModelStore.m35790c().isEmpty()) {
                    savedStateRegistry.m35055e(C3021a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, C3052u uVar) {
        this.f4448k = str;
        this.f4450m = uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35802a(AbstractC3055w wVar, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) wVar.m35738c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.m35798f()) {
            savedStateHandleController.m35801b(savedStateRegistry, lifecycle);
            m35797g(savedStateRegistry, lifecycle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static SavedStateHandleController m35800d(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C3052u.m35747a(savedStateRegistry.m35059a(str), bundle));
        savedStateHandleController.m35801b(savedStateRegistry, lifecycle);
        m35797g(savedStateRegistry, lifecycle);
        return savedStateHandleController;
    }

    /* renamed from: g */
    private static void m35797g(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) {
        Lifecycle.State b = lifecycle.mo35843b();
        if (b == Lifecycle.State.INITIALIZED || b.m35851a(Lifecycle.State.STARTED)) {
            savedStateRegistry.m35055e(C3021a.class);
        } else {
            lifecycle.mo35844a(new AbstractC3038j() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.AbstractC3038j
                /* renamed from: c */
                public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
                    if (bVar == Lifecycle.EnumC3010b.ON_START) {
                        Lifecycle.this.mo35842c(this);
                        savedStateRegistry.m35055e(C3021a.class);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    void m35801b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        if (!this.f4449l) {
            this.f4449l = true;
            lifecycle.mo35844a(this);
            savedStateRegistry.m35056d(this.f4448k, this.f4450m.m35746b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        if (bVar == Lifecycle.EnumC3010b.ON_DESTROY) {
            this.f4449l = false;
            lifecycleOwner.getLifecycle().mo35842c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C3052u m35799e() {
        return this.f4450m;
    }

    /* renamed from: f */
    boolean m35798f() {
        return this.f4449l;
    }
}
