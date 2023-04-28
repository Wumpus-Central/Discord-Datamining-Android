package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: io.sentry.android.core.i0 */
/* loaded from: classes8.dex */
public class C8723i0 {

    /* renamed from: b */
    private static final C8723i0 f19296b = new C8723i0();

    /* renamed from: a */
    private WeakReference<Activity> f19297a;

    private C8723i0() {
    }

    /* renamed from: c */
    public static C8723i0 m18272c() {
        return f19296b;
    }

    /* renamed from: a */
    public void m18274a() {
        this.f19297a = null;
    }

    /* renamed from: b */
    public Activity m18273b() {
        WeakReference<Activity> weakReference = this.f19297a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public void m18271d(Activity activity) {
        WeakReference<Activity> weakReference = this.f19297a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f19297a = new WeakReference<>(activity);
        }
    }
}
