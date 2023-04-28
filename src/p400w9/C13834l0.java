package p400w9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C2094a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p163j$.util.DesugarCollections;
import pa.HandlerC11593e;

/* renamed from: w9.l0 */
/* loaded from: classes5.dex */
public final class C13834l0 extends Fragment implements AbstractC13821f {

    /* renamed from: n */
    private static final WeakHashMap<FragmentActivity, WeakReference<C13834l0>> f31150n = new WeakHashMap<>();

    /* renamed from: k */
    private final Map<String, LifecycleCallback> f31151k = DesugarCollections.synchronizedMap(new C2094a());

    /* renamed from: l */
    private int f31152l = 0;

    /* renamed from: m */
    private Bundle f31153m;

    /* renamed from: f */
    public static C13834l0 m2550f(FragmentActivity fragmentActivity) {
        C13834l0 l0Var;
        WeakHashMap<FragmentActivity, WeakReference<C13834l0>> weakHashMap = f31150n;
        WeakReference<C13834l0> weakReference = weakHashMap.get(fragmentActivity);
        if (weakReference != null && (l0Var = weakReference.get()) != null) {
            return l0Var;
        }
        try {
            C13834l0 l0Var2 = (C13834l0) fragmentActivity.getSupportFragmentManager().m36130j0("SupportLifecycleFragmentImpl");
            if (l0Var2 == null || l0Var2.isRemoving()) {
                l0Var2 = new C13834l0();
                fragmentActivity.getSupportFragmentManager().m36122m().m36071e(l0Var2, "SupportLifecycleFragmentImpl").mo36046h();
            }
            weakHashMap.put(fragmentActivity, new WeakReference<>(l0Var2));
            return l0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // p400w9.AbstractC13821f
    /* renamed from: a */
    public final void mo2555a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f31151k.containsKey(str)) {
            this.f31151k.put(str, lifecycleCallback);
            if (this.f31152l > 0) {
                new HandlerC11593e(Looper.getMainLooper()).post(new RunnableC13832k0(this, lifecycleCallback, str));
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
        return cls.cast(this.f31151k.get(str));
    }

    @Override // p400w9.AbstractC13821f
    /* renamed from: c */
    public final /* synthetic */ Activity mo2553c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f31151k.values()) {
            lifecycleCallback.m29106a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f31151k.values()) {
            lifecycleCallback.mo29001e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f31152l = 1;
        this.f31153m = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f31151k.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.mo29000f(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f31152l = 5;
        for (LifecycleCallback lifecycleCallback : this.f31151k.values()) {
            lifecycleCallback.m29102g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f31152l = 3;
        for (LifecycleCallback lifecycleCallback : this.f31151k.values()) {
            lifecycleCallback.mo29007h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f31151k.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().mo28999i(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f31152l = 2;
        for (LifecycleCallback lifecycleCallback : this.f31151k.values()) {
            lifecycleCallback.mo28998j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f31152l = 4;
        for (LifecycleCallback lifecycleCallback : this.f31151k.values()) {
            lifecycleCallback.mo28997k();
        }
    }
}
