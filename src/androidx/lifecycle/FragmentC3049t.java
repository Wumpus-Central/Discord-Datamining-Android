package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public class FragmentC3049t extends Fragment {

    /* renamed from: k */
    private AbstractC3050a f4479k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.t$a */
    /* loaded from: classes.dex */
    public interface AbstractC3050a {
        /* renamed from: c */
        void mo35750c();

        /* renamed from: d */
        void mo35749d();

        /* renamed from: e */
        void mo35748e();
    }

    /* renamed from: androidx.lifecycle.t$b */
    /* loaded from: classes.dex */
    static class C3051b implements Application.ActivityLifecycleCallbacks {
        C3051b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C3051b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC3049t.m35758a(activity, Lifecycle.EnumC3010b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC3049t.m35758a(activity, Lifecycle.EnumC3010b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC3049t.m35758a(activity, Lifecycle.EnumC3010b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC3049t.m35758a(activity, Lifecycle.EnumC3010b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC3049t.m35758a(activity, Lifecycle.EnumC3010b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC3049t.m35758a(activity, Lifecycle.EnumC3010b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m35758a(Activity activity, Lifecycle.EnumC3010b bVar) {
        if (activity instanceof AbstractC3042n) {
            ((AbstractC3042n) activity).getLifecycle().m35837h(bVar);
        } else if (activity instanceof LifecycleOwner) {
            Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof LifecycleRegistry) {
                ((LifecycleRegistry) lifecycle).m35837h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m35757b(Lifecycle.EnumC3010b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m35758a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m35756c(AbstractC3050a aVar) {
        if (aVar != null) {
            aVar.mo35749d();
        }
    }

    /* renamed from: d */
    private void m35755d(AbstractC3050a aVar) {
        if (aVar != null) {
            aVar.mo35750c();
        }
    }

    /* renamed from: e */
    private void m35754e(AbstractC3050a aVar) {
        if (aVar != null) {
            aVar.mo35748e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static FragmentC3049t m35753f(Activity activity) {
        return (FragmentC3049t) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m35752g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C3051b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC3049t(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m35751h(AbstractC3050a aVar) {
        this.f4479k = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m35756c(this.f4479k);
        m35757b(Lifecycle.EnumC3010b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m35757b(Lifecycle.EnumC3010b.ON_DESTROY);
        this.f4479k = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m35757b(Lifecycle.EnumC3010b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m35755d(this.f4479k);
        m35757b(Lifecycle.EnumC3010b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m35754e(this.f4479k);
        m35757b(Lifecycle.EnumC3010b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m35757b(Lifecycle.EnumC3010b.ON_STOP);
    }
}
