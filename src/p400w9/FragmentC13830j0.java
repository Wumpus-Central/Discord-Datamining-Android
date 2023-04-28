package p400w9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C2094a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p163j$.util.DesugarCollections;
import pa.HandlerC11593e;

/* renamed from: w9.j0 */
/* loaded from: classes5.dex */
public final class FragmentC13830j0 extends Fragment implements AbstractC13821f {

    /* renamed from: n */
    private static final WeakHashMap<Activity, WeakReference<FragmentC13830j0>> f31143n = new WeakHashMap<>();

    /* renamed from: k */
    private final Map<String, LifecycleCallback> f31144k = DesugarCollections.synchronizedMap(new C2094a());

    /* renamed from: l */
    private int f31145l = 0;

    /* renamed from: m */
    private Bundle f31146m;

    /* renamed from: f */
    public static FragmentC13830j0 m2557f(Activity activity) {
        FragmentC13830j0 j0Var;
        WeakHashMap<Activity, WeakReference<FragmentC13830j0>> weakHashMap = f31143n;
        WeakReference<FragmentC13830j0> weakReference = weakHashMap.get(activity);
        if (weakReference != null && (j0Var = weakReference.get()) != null) {
            return j0Var;
        }
        try {
            FragmentC13830j0 j0Var2 = (FragmentC13830j0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (j0Var2 == null || j0Var2.isRemoving()) {
                j0Var2 = new FragmentC13830j0();
                activity.getFragmentManager().beginTransaction().add(j0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference<>(j0Var2));
            return j0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // p400w9.AbstractC13821f
    /* renamed from: a */
    public final void mo2555a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f31144k.containsKey(str)) {
            this.f31144k.put(str, lifecycleCallback);
            if (this.f31145l > 0) {
                new HandlerC11593e(Looper.getMainLooper()).post(new RunnableC13828i0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("LifecycleCallback with tag ");
        sb2.append(str);
        sb2.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // p400w9.AbstractC13821f
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo2554b(String str, Class<T> cls) {
        return cls.cast(this.f31144k.get(str));
    }

    @Override // p400w9.AbstractC13821f
    /* renamed from: c */
    public final Activity mo2553c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f31144k.values()) {
            lifecycleCallback.m29106a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f31144k.values()) {
            lifecycleCallback.mo29001e(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f31145l = 1;
        this.f31146m = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f31144k.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.mo29000f(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f31145l = 5;
        for (LifecycleCallback lifecycleCallback : this.f31144k.values()) {
            lifecycleCallback.m29102g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f31145l = 3;
        for (LifecycleCallback lifecycleCallback : this.f31144k.values()) {
            lifecycleCallback.mo29007h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f31144k.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().mo28999i(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f31145l = 2;
        for (LifecycleCallback lifecycleCallback : this.f31144k.values()) {
            lifecycleCallback.mo28998j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f31145l = 4;
        for (LifecycleCallback lifecycleCallback : this.f31144k.values()) {
            lifecycleCallback.mo28997k();
        }
    }
}
