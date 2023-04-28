package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements AbstractC3038j {

    /* renamed from: k */
    private final AbstractC3156b f4886k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C3152a implements SavedStateRegistry.AbstractC3154b {

        /* renamed from: a */
        final Set<String> f4887a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3152a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m35056d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.AbstractC3154b
        /* renamed from: a */
        public Bundle mo35053a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4887a));
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m35060b(String str) {
            this.f4887a.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(AbstractC3156b bVar) {
        this.f4886k = bVar;
    }

    /* renamed from: a */
    private void m35061a(String str) {
        Class cls;
        try {
            try {
                Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AbstractC3153a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.AbstractC3153a) declaredConstructor.newInstance(new Object[0])).mo35054a(this.f4886k);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        if (bVar == Lifecycle.EnumC3010b.ON_CREATE) {
            lifecycleOwner.getLifecycle().mo35842c(this);
            Bundle a = this.f4886k.getSavedStateRegistry().m35059a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m35061a(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
