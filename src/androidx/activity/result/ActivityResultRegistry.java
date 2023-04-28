package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.C2212d;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f623a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f624b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f625c = new HashMap();

    /* renamed from: d */
    private final Map<String, C1491d> f626d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f627e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C1490c<?>> f628f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f629g = new HashMap();

    /* renamed from: h */
    final Bundle f630h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes.dex */
    public class C1488a extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ String f635a;

        /* renamed from: b */
        final /* synthetic */ int f636b;

        /* renamed from: c */
        final /* synthetic */ ActivityResultContract f637c;

        C1488a(String str, int i, ActivityResultContract activityResultContract) {
            this.f635a = str;
            this.f636b = i;
            this.f637c = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: b */
        public void mo36253b(I i, C2212d dVar) {
            int i2;
            ActivityResultRegistry.this.f627e.add(this.f635a);
            Integer num = ActivityResultRegistry.this.f625c.get(this.f635a);
            ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = this.f636b;
            }
            activityResultRegistry.mo40988f(i2, this.f637c, i, dVar);
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: c */
        public void mo36252c() {
            ActivityResultRegistry.this.m40982l(this.f635a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes.dex */
    public class C1489b extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ String f639a;

        /* renamed from: b */
        final /* synthetic */ int f640b;

        /* renamed from: c */
        final /* synthetic */ ActivityResultContract f641c;

        C1489b(String str, int i, ActivityResultContract activityResultContract) {
            this.f639a = str;
            this.f640b = i;
            this.f641c = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: b */
        public void mo36253b(I i, C2212d dVar) {
            int i2;
            ActivityResultRegistry.this.f627e.add(this.f639a);
            Integer num = ActivityResultRegistry.this.f625c.get(this.f639a);
            ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = this.f640b;
            }
            activityResultRegistry.mo40988f(i2, this.f641c, i, dVar);
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: c */
        public void mo36252c() {
            ActivityResultRegistry.this.m40982l(this.f639a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes.dex */
    public static class C1490c<O> {

        /* renamed from: a */
        final ActivityResultCallback<O> f643a;

        /* renamed from: b */
        final ActivityResultContract<?, O> f644b;

        C1490c(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            this.f643a = activityResultCallback;
            this.f644b = activityResultContract;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: classes.dex */
    public static class C1491d {

        /* renamed from: a */
        final Lifecycle f645a;

        /* renamed from: b */
        private final ArrayList<AbstractC3038j> f646b = new ArrayList<>();

        C1491d(Lifecycle lifecycle) {
            this.f645a = lifecycle;
        }

        /* renamed from: a */
        void m40981a(AbstractC3038j jVar) {
            this.f645a.mo35844a(jVar);
            this.f646b.add(jVar);
        }

        /* renamed from: b */
        void m40980b() {
            Iterator<AbstractC3038j> it = this.f646b.iterator();
            while (it.hasNext()) {
                this.f645a.mo35842c(it.next());
            }
            this.f646b.clear();
        }
    }

    /* renamed from: a */
    private void m40993a(int i, String str) {
        this.f624b.put(Integer.valueOf(i), str);
        this.f625c.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    private <O> void m40990d(String str, int i, Intent intent, C1490c<O> cVar) {
        ActivityResultCallback<O> activityResultCallback;
        if (cVar == null || (activityResultCallback = cVar.f643a) == null) {
            this.f629g.remove(str);
            this.f630h.putParcelable(str, new C1492a(i, intent));
            return;
        }
        activityResultCallback.mo36085a(cVar.f644b.mo33699c(i, intent));
    }

    /* renamed from: e */
    private int m40989e() {
        int nextInt = this.f623a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f624b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f623a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private int m40983k(String str) {
        Integer num = this.f625c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e = m40989e();
        m40993a(e, str);
        return e;
    }

    /* renamed from: b */
    public final boolean m40992b(int i, int i2, Intent intent) {
        String str = this.f624b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f627e.remove(str);
        m40990d(str, i2, intent, this.f628f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m40991c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.f624b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f627e.remove(str);
        C1490c<?> cVar = this.f628f.get(str);
        if (cVar == null || (activityResultCallback = cVar.f643a) == null) {
            this.f630h.remove(str);
            this.f629g.put(str, o);
            return true;
        }
        activityResultCallback.mo36085a(o);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo40988f(int i, ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i2, C2212d dVar);

    /* renamed from: g */
    public final void m40987g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                this.f627e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f623a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f630h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f625c.containsKey(str)) {
                        Integer remove = this.f625c.remove(str);
                        if (!this.f630h.containsKey(str)) {
                            this.f624b.remove(remove);
                        }
                    }
                    m40993a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: h */
    public final void m40986h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f625c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f625c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f627e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f630h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f623a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <I, O> ActivityResultLauncher<I> m40985i(String str, ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        int k = m40983k(str);
        this.f628f.put(str, new C1490c<>(activityResultCallback, activityResultContract));
        if (this.f629g.containsKey(str)) {
            Object obj = this.f629g.get(str);
            this.f629g.remove(str);
            activityResultCallback.mo36085a(obj);
        }
        C1492a aVar = (C1492a) this.f630h.getParcelable(str);
        if (aVar != null) {
            this.f630h.remove(str);
            activityResultCallback.mo36085a(activityResultContract.mo33699c(aVar.m40978b(), aVar.m40979a()));
        }
        return new C1489b(str, k, activityResultContract);
    }

    /* renamed from: j */
    public final <I, O> ActivityResultLauncher<I> m40984j(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> activityResultContract, final ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.mo35843b().m35851a(Lifecycle.State.STARTED)) {
            int k = m40983k(str);
            C1491d dVar = this.f626d.get(str);
            if (dVar == null) {
                dVar = new C1491d(lifecycle);
            }
            dVar.m40981a(new AbstractC3038j() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.AbstractC3038j
                /* renamed from: c */
                public void mo34707c(LifecycleOwner lifecycleOwner2, Lifecycle.EnumC3010b bVar) {
                    if (Lifecycle.EnumC3010b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f628f.put(str, new C1490c<>(activityResultCallback, activityResultContract));
                        if (ActivityResultRegistry.this.f629g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f629g.get(str);
                            ActivityResultRegistry.this.f629g.remove(str);
                            activityResultCallback.mo36085a(obj);
                        }
                        C1492a aVar = (C1492a) ActivityResultRegistry.this.f630h.getParcelable(str);
                        if (aVar != null) {
                            ActivityResultRegistry.this.f630h.remove(str);
                            activityResultCallback.mo36085a(activityResultContract.mo33699c(aVar.m40978b(), aVar.m40979a()));
                        }
                    } else if (Lifecycle.EnumC3010b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f628f.remove(str);
                    } else if (Lifecycle.EnumC3010b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.m40982l(str);
                    }
                }
            });
            this.f626d.put(str, dVar);
            return new C1488a(str, k, activityResultContract);
        }
        throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.mo35843b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: l */
    final void m40982l(String str) {
        Integer remove;
        if (!this.f627e.contains(str) && (remove = this.f625c.remove(str)) != null) {
            this.f624b.remove(remove);
        }
        this.f628f.remove(str);
        if (this.f629g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f629g.get(str));
            this.f629g.remove(str);
        }
        if (this.f630h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f630h.getParcelable(str));
            this.f630h.remove(str);
        }
        C1491d dVar = this.f626d.get(str);
        if (dVar != null) {
            dVar.m40980b();
            this.f626d.remove(str);
        }
    }
}
