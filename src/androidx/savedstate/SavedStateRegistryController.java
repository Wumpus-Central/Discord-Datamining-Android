package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class SavedStateRegistryController {

    /* renamed from: a */
    private final AbstractC3156b f4894a;

    /* renamed from: b */
    private final SavedStateRegistry f4895b = new SavedStateRegistry();

    private SavedStateRegistryController(AbstractC3156b bVar) {
        this.f4894a = bVar;
    }

    /* renamed from: a */
    public static SavedStateRegistryController m35052a(AbstractC3156b bVar) {
        return new SavedStateRegistryController(bVar);
    }

    /* renamed from: b */
    public SavedStateRegistry m35051b() {
        return this.f4895b;
    }

    /* renamed from: c */
    public void m35050c(Bundle bundle) {
        Lifecycle lifecycle = this.f4894a.getLifecycle();
        if (lifecycle.mo35843b() == Lifecycle.State.INITIALIZED) {
            lifecycle.mo35844a(new Recreator(this.f4894a));
            this.f4895b.m35058b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void m35049d(Bundle bundle) {
        this.f4895b.m35057c(bundle);
    }
}
