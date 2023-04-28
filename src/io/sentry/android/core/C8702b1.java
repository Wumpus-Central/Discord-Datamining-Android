package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8875h;
import io.sentry.C8915k2;
import io.sentry.C8951o3;
import io.sentry.C9031r1;
import io.sentry.EnumC8942n3;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: io.sentry.android.core.b1 */
/* loaded from: classes8.dex */
public final class C8702b1 {

    /* renamed from: a */
    private static final Date f19247a = C8875h.m17846b();

    /* renamed from: b */
    private static final long f19248b = SystemClock.uptimeMillis();

    /* renamed from: c */
    private static void m18333c(C8951o3 o3Var, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC9023q0 q0Var : o3Var.getIntegrations()) {
            if (z && (q0Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(q0Var);
            }
            if (z2 && (q0Var instanceof SentryTimberIntegration)) {
                arrayList.add(q0Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 1; i < arrayList2.size(); i++) {
                o3Var.getIntegrations().remove((AbstractC9023q0) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                o3Var.getIntegrations().remove((AbstractC9023q0) arrayList.get(i2));
            }
        }
    }

    /* renamed from: d */
    public static void m18332d(Context context, AbstractC8869g0 g0Var) {
        m18331e(context, g0Var, new C8915k2.AbstractC8916a() { // from class: io.sentry.android.core.z0
            @Override // io.sentry.C8915k2.AbstractC8916a
            /* renamed from: a */
            public final void mo17168a(C8951o3 o3Var) {
                C8702b1.m18329g((SentryAndroidOptions) o3Var);
            }
        });
    }

    /* renamed from: e */
    public static synchronized void m18331e(final Context context, final AbstractC8869g0 g0Var, final C8915k2.AbstractC8916a<SentryAndroidOptions> aVar) {
        synchronized (C8702b1.class) {
            C8709d0.m18315d().m18311h(f19248b, f19247a);
            try {
                try {
                    C8915k2.m17700n(C9031r1.m17192a(SentryAndroidOptions.class), new C8915k2.AbstractC8916a() { // from class: io.sentry.android.core.a1
                        @Override // io.sentry.C8915k2.AbstractC8916a
                        /* renamed from: a */
                        public final void mo17168a(C8951o3 o3Var) {
                            C8702b1.m18328h(AbstractC8869g0.this, context, aVar, (SentryAndroidOptions) o3Var);
                        }
                    }, true);
                } catch (InstantiationException e) {
                    g0Var.mo17723b(EnumC8942n3.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (InvocationTargetException e2) {
                    g0Var.mo17723b(EnumC8942n3.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (IllegalAccessException e3) {
                g0Var.mo17723b(EnumC8942n3.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (NoSuchMethodException e4) {
                g0Var.mo17723b(EnumC8942n3.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        }
    }

    /* renamed from: f */
    public static void m18330f(Context context, C8915k2.AbstractC8916a<SentryAndroidOptions> aVar) {
        m18331e(context, new C8770n(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m18329g(SentryAndroidOptions sentryAndroidOptions) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m18328h(AbstractC8869g0 g0Var, Context context, C8915k2.AbstractC8916a aVar, SentryAndroidOptions sentryAndroidOptions) {
        boolean z;
        C8776p0 p0Var = new C8776p0();
        boolean b = p0Var.m18113b("timber.log.Timber", sentryAndroidOptions);
        boolean z2 = true;
        if (!p0Var.m18113b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) || !p0Var.m18113b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z = false;
        } else {
            z = true;
        }
        if (!b || !p0Var.m18113b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions)) {
            z2 = false;
        }
        C8715f0 f0Var = new C8715f0(g0Var);
        C8776p0 p0Var2 = new C8776p0();
        C8777q.m18101k(sentryAndroidOptions, context, g0Var, f0Var);
        aVar.mo17168a(sentryAndroidOptions);
        C8777q.m18106f(sentryAndroidOptions, context, f0Var, p0Var2, z, z2);
        m18333c(sentryAndroidOptions, z, z2);
    }
}
