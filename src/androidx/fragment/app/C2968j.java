package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC3055w;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public final class C2968j extends AbstractC3055w {

    /* renamed from: j */
    private static final ViewModelProvider.Factory f4221j = new C2969a();

    /* renamed from: f */
    private final boolean f4225f;

    /* renamed from: c */
    private final HashMap<String, Fragment> f4222c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C2968j> f4223d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, ViewModelStore> f4224e = new HashMap<>();

    /* renamed from: g */
    private boolean f4226g = false;

    /* renamed from: h */
    private boolean f4227h = false;

    /* renamed from: i */
    private boolean f4228i = false;

    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes.dex */
    class C2969a implements ViewModelProvider.Factory {
        C2969a() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: a */
        public <T extends AbstractC3055w> T mo35708a(Class<T> cls) {
            return new C2968j(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2968j(boolean z) {
        this.f4225f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C2968j m35986j(ViewModelStore viewModelStore) {
        return (C2968j) new ViewModelProvider(viewModelStore, f4221j).m35796a(C2968j.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC3055w
    /* renamed from: d */
    public void mo35717d() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4226g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2968j.class != obj.getClass()) {
            return false;
        }
        C2968j jVar = (C2968j) obj;
        if (!this.f4222c.equals(jVar.f4222c) || !this.f4223d.equals(jVar.f4223d) || !this.f4224e.equals(jVar.f4224e)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m35990f(Fragment fragment) {
        if (this.f4228i) {
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f4222c.containsKey(fragment.mWho)) {
            this.f4222c.put(fragment.mWho, fragment);
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m35989g(Fragment fragment) {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C2968j jVar = this.f4223d.get(fragment.mWho);
        if (jVar != null) {
            jVar.mo35717d();
            this.f4223d.remove(fragment.mWho);
        }
        ViewModelStore viewModelStore = this.f4224e.get(fragment.mWho);
        if (viewModelStore != null) {
            viewModelStore.m35792a();
            this.f4224e.remove(fragment.mWho);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m35988h(String str) {
        return this.f4222c.get(str);
    }

    public int hashCode() {
        return (((this.f4222c.hashCode() * 31) + this.f4223d.hashCode()) * 31) + this.f4224e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C2968j m35987i(Fragment fragment) {
        C2968j jVar = this.f4223d.get(fragment.mWho);
        if (jVar != null) {
            return jVar;
        }
        C2968j jVar2 = new C2968j(this.f4225f);
        this.f4223d.put(fragment.mWho, jVar2);
        return jVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Collection<Fragment> m35985k() {
        return new ArrayList(this.f4222c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ViewModelStore m35984l(Fragment fragment) {
        ViewModelStore viewModelStore = this.f4224e.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.f4224e.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m35983m() {
        return this.f4226g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m35982n(Fragment fragment) {
        boolean z;
        if (!this.f4228i) {
            if (this.f4222c.remove(fragment.mWho) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35981o(boolean z) {
        this.f4228i = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m35980p(Fragment fragment) {
        if (!this.f4222c.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f4225f) {
            return this.f4226g;
        }
        return !this.f4227h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f4222c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4223d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4224e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
