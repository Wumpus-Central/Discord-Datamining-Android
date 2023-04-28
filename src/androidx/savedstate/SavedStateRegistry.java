package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Map;
import p203l.C10297b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f4889b;

    /* renamed from: c */
    private boolean f4890c;

    /* renamed from: d */
    private Recreator.C3152a f4891d;

    /* renamed from: a */
    private C10297b<String, AbstractC3154b> f4888a = new C10297b<>();

    /* renamed from: e */
    boolean f4892e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: classes.dex */
    public interface AbstractC3153a {
        /* renamed from: a */
        void mo35054a(AbstractC3156b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: classes.dex */
    public interface AbstractC3154b {
        /* renamed from: a */
        Bundle mo35053a();
    }

    /* renamed from: a */
    public Bundle m35059a(String str) {
        if (this.f4890c) {
            Bundle bundle = this.f4889b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f4889b.remove(str);
            if (this.f4889b.isEmpty()) {
                this.f4889b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35058b(Lifecycle lifecycle, Bundle bundle) {
        if (!this.f4890c) {
            if (bundle != null) {
                this.f4889b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            lifecycle.mo35844a(new AbstractC3038j() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.AbstractC3038j
                /* renamed from: c */
                public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
                    if (bVar == Lifecycle.EnumC3010b.ON_START) {
                        SavedStateRegistry.this.f4892e = true;
                    } else if (bVar == Lifecycle.EnumC3010b.ON_STOP) {
                        SavedStateRegistry.this.f4892e = false;
                    }
                }
            });
            this.f4890c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35057c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4889b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C10297b<String, AbstractC3154b>.C10300d e = this.f4888a.m13668e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            bundle2.putBundle((String) next.getKey(), ((AbstractC3154b) next.getValue()).mo35053a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m35056d(String str, AbstractC3154b bVar) {
        if (this.f4888a.mo13665i(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m35055e(Class<? extends AbstractC3153a> cls) {
        if (this.f4892e) {
            if (this.f4891d == null) {
                this.f4891d = new Recreator.C3152a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f4891d.m35060b(cls.getName());
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
