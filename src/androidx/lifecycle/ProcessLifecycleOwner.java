package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.FragmentC3049t;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class ProcessLifecycleOwner implements LifecycleOwner {

    /* renamed from: s */
    private static final ProcessLifecycleOwner f4403s = new ProcessLifecycleOwner();

    /* renamed from: t */
    public static final /* synthetic */ int f4404t = 0;

    /* renamed from: o */
    private Handler f4409o;

    /* renamed from: k */
    private int f4405k = 0;

    /* renamed from: l */
    private int f4406l = 0;

    /* renamed from: m */
    private boolean f4407m = true;

    /* renamed from: n */
    private boolean f4408n = true;

    /* renamed from: p */
    private final LifecycleRegistry f4410p = new LifecycleRegistry(this);

    /* renamed from: q */
    private Runnable f4411q = new RunnableC3016a();

    /* renamed from: r */
    FragmentC3049t.AbstractC3050a f4412r = new C3017b();

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$a */
    /* loaded from: classes.dex */
    class RunnableC3016a implements Runnable {
        RunnableC3016a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.this.m35808f();
            ProcessLifecycleOwner.this.m35807g();
        }
    }

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$b */
    /* loaded from: classes.dex */
    class C3017b implements FragmentC3049t.AbstractC3050a {
        C3017b() {
        }

        @Override // androidx.lifecycle.FragmentC3049t.AbstractC3050a
        /* renamed from: c */
        public void mo35750c() {
            ProcessLifecycleOwner.this.m35812b();
        }

        @Override // androidx.lifecycle.FragmentC3049t.AbstractC3050a
        /* renamed from: d */
        public void mo35749d() {
        }

        @Override // androidx.lifecycle.FragmentC3049t.AbstractC3050a
        /* renamed from: e */
        public void mo35748e() {
            ProcessLifecycleOwner.this.m35811c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$c */
    /* loaded from: classes.dex */
    public class C3018c extends C3031d {

        /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$c$a */
        /* loaded from: classes.dex */
        class C3019a extends C3031d {
            C3019a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                ProcessLifecycleOwner.this.m35812b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                ProcessLifecycleOwner.this.m35811c();
            }
        }

        C3018c() {
        }

        @Override // androidx.lifecycle.C3031d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC3049t.m35753f(activity).m35751h(ProcessLifecycleOwner.this.f4412r);
            }
        }

        @Override // androidx.lifecycle.C3031d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ProcessLifecycleOwner.this.m35813a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C3019a());
        }

        @Override // androidx.lifecycle.C3031d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ProcessLifecycleOwner.this.m35810d();
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* renamed from: h */
    public static LifecycleOwner m35806h() {
        return f4403s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m35805i(Context context) {
        f4403s.m35809e(context);
    }

    /* renamed from: a */
    void m35813a() {
        int i = this.f4406l - 1;
        this.f4406l = i;
        if (i == 0) {
            this.f4409o.postDelayed(this.f4411q, 700L);
        }
    }

    /* renamed from: b */
    void m35812b() {
        int i = this.f4406l + 1;
        this.f4406l = i;
        if (i != 1) {
            return;
        }
        if (this.f4407m) {
            this.f4410p.m35837h(Lifecycle.EnumC3010b.ON_RESUME);
            this.f4407m = false;
            return;
        }
        this.f4409o.removeCallbacks(this.f4411q);
    }

    /* renamed from: c */
    void m35811c() {
        int i = this.f4405k + 1;
        this.f4405k = i;
        if (i == 1 && this.f4408n) {
            this.f4410p.m35837h(Lifecycle.EnumC3010b.ON_START);
            this.f4408n = false;
        }
    }

    /* renamed from: d */
    void m35810d() {
        this.f4405k--;
        m35807g();
    }

    /* renamed from: e */
    void m35809e(Context context) {
        this.f4409o = new Handler();
        this.f4410p.m35837h(Lifecycle.EnumC3010b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C3018c());
    }

    /* renamed from: f */
    void m35808f() {
        if (this.f4406l == 0) {
            this.f4407m = true;
            this.f4410p.m35837h(Lifecycle.EnumC3010b.ON_PAUSE);
        }
    }

    /* renamed from: g */
    void m35807g() {
        if (this.f4405k == 0 && this.f4407m) {
            this.f4410p.m35837h(Lifecycle.EnumC3010b.ON_STOP);
            this.f4408n = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f4410p;
    }
}
