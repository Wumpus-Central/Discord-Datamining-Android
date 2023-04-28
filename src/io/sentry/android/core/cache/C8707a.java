package io.sentry.android.core.cache;

import io.sentry.C8951o3;
import io.sentry.C9025q2;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.C8709d0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C8742a;
import io.sentry.cache.C8820d;
import io.sentry.hints.AbstractC8884c;
import io.sentry.transport.AbstractC9079o;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.File;

/* renamed from: io.sentry.android.core.cache.a */
/* loaded from: classes8.dex */
public final class C8707a extends C8820d {

    /* renamed from: q */
    private final AbstractC9079o f19260q;

    public C8707a(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, C8742a.m18225b());
    }

    /* renamed from: I */
    public static boolean m18320I(C8951o3 o3Var) {
        if (o3Var.getOutboxPath() == null) {
            o3Var.getLogger().mo17722c(EnumC8942n3.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(o3Var.getOutboxPath(), "startup_crash");
        try {
            boolean exists = file.exists();
            if (exists && !file.delete()) {
                o3Var.getLogger().mo17722c(EnumC8942n3.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return exists;
        } catch (Throwable th2) {
            o3Var.getLogger().mo17723b(EnumC8942n3.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    /* renamed from: J */
    private void m18319J() {
        if (this.f19496k.getOutboxPath() == null) {
            this.f19496k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(this.f19496k.getOutboxPath(), "startup_crash").createNewFile();
        } catch (Throwable th2) {
            this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @Override // io.sentry.cache.C8820d, io.sentry.cache.AbstractC8821e
    /* renamed from: o */
    public void mo17113o(C9025q2 q2Var, C9116v vVar) {
        super.mo17113o(q2Var, vVar);
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f19496k;
        Long b = C8709d0.m18315d().m18317b();
        if (C9105h.m17012g(vVar, AbstractC8884c.class) && b != null) {
            long a = this.f19260q.mo17116a() - b.longValue();
            if (a <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(a));
                m18319J();
            }
        }
    }

    C8707a(SentryAndroidOptions sentryAndroidOptions, AbstractC9079o oVar) {
        super(sentryAndroidOptions, (String) C9111k.m16995a(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f19260q = oVar;
    }
}
