package io.sentry.android.core;

import android.os.Build;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import io.sentry.util.C9111k;

/* renamed from: io.sentry.android.core.f0 */
/* loaded from: classes8.dex */
public final class C8715f0 {

    /* renamed from: a */
    final AbstractC8869g0 f19282a;

    public C8715f0(AbstractC8869g0 g0Var) {
        this.f19282a = (AbstractC8869g0) C9111k.m16995a(g0Var, "The ILogger object is required.");
    }

    /* renamed from: a */
    public String m18306a() {
        return Build.TAGS;
    }

    /* renamed from: b */
    public String m18305b() {
        return Build.MANUFACTURER;
    }

    /* renamed from: c */
    public String m18304c() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public int m18303d() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: e */
    public String m18302e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public Boolean m18301f() {
        boolean z;
        try {
            if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
                String str = Build.FINGERPRINT;
                if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                    String str2 = Build.HARDWARE;
                    if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                        String str3 = Build.MODEL;
                        if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                            String str4 = Build.PRODUCT;
                            if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                                z = false;
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            this.f19282a.mo17723b(EnumC8942n3.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}
