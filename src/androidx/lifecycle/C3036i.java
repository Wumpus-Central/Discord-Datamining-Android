package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.i */
/* loaded from: classes.dex */
class C3036i {

    /* renamed from: a */
    private static AtomicBoolean f4471a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.i$a */
    /* loaded from: classes.dex */
    static class C3037a extends C3031d {
        C3037a() {
        }

        @Override // androidx.lifecycle.C3031d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC3049t.m35752g(activity);
        }

        @Override // androidx.lifecycle.C3031d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C3031d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35773a(Context context) {
        if (!f4471a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C3037a());
        }
    }
}
