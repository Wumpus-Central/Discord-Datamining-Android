package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import ca.C3803j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes5.dex */
public final class ComponentCallbacks2C5372a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: o */
    private static final ComponentCallbacks2C5372a f10114o = new ComponentCallbacks2C5372a();

    /* renamed from: k */
    private final AtomicBoolean f10115k = new AtomicBoolean();

    /* renamed from: l */
    private final AtomicBoolean f10116l = new AtomicBoolean();

    /* renamed from: m */
    private final ArrayList<AbstractC0150a> f10117m = new ArrayList<>();

    /* renamed from: n */
    private boolean f10118n = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    /* loaded from: classes5.dex */
    public interface AbstractC0150a {
        /* renamed from: a */
        void mo20951a(boolean z);
    }

    private ComponentCallbacks2C5372a() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C5372a m29100b() {
        return f10114o;
    }

    /* renamed from: c */
    public static void m29099c(Application application) {
        ComponentCallbacks2C5372a aVar = f10114o;
        synchronized (aVar) {
            if (!aVar.f10118n) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f10118n = true;
            }
        }
    }

    /* renamed from: f */
    private final void m29096f(boolean z) {
        synchronized (f10114o) {
            Iterator<AbstractC0150a> it = this.f10117m.iterator();
            while (it.hasNext()) {
                it.next().mo20951a(z);
            }
        }
    }

    /* renamed from: a */
    public void m29101a(AbstractC0150a aVar) {
        synchronized (f10114o) {
            this.f10117m.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m29098d() {
        return this.f10115k.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean m29097e(boolean z) {
        if (!this.f10116l.get()) {
            if (!C3803j.m33565b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f10116l.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f10115k.set(true);
            }
        }
        return m29098d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f10115k.compareAndSet(true, false);
        this.f10116l.set(true);
        if (compareAndSet) {
            m29096f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f10115k.compareAndSet(true, false);
        this.f10116l.set(true);
        if (compareAndSet) {
            m29096f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f10115k.compareAndSet(false, true)) {
            this.f10116l.set(true);
            m29096f(true);
        }
    }
}
