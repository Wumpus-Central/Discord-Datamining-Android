package io.sentry;

import java.io.File;

/* renamed from: io.sentry.p2 */
/* loaded from: classes8.dex */
public final class C8963p2 {

    /* renamed from: d */
    private static final C8963p2 f19671d = new C8963p2();

    /* renamed from: a */
    private boolean f19672a;

    /* renamed from: b */
    private Boolean f19673b;

    /* renamed from: c */
    private final Object f19674c = new Object();

    private C8963p2() {
    }

    /* renamed from: a */
    public static C8963p2 m17550a() {
        return f19671d;
    }

    /* renamed from: b */
    public Boolean m17549b(String str, boolean z) {
        synchronized (this.f19674c) {
            if (this.f19672a) {
                return this.f19673b;
            } else if (str == null) {
                return null;
            } else {
                boolean z2 = true;
                this.f19672a = true;
                File file = new File(str, "last_crash");
                File file2 = new File(str, ".sentry-native/last_crash");
                if (file.exists()) {
                    file.delete();
                } else {
                    if (file2.exists()) {
                        if (z) {
                            file2.delete();
                        }
                        Boolean valueOf = Boolean.valueOf(z2);
                        this.f19673b = valueOf;
                        return valueOf;
                    }
                    z2 = false;
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    this.f19673b = valueOf2;
                    return valueOf2;
                }
                Boolean valueOf22 = Boolean.valueOf(z2);
                this.f19673b = valueOf22;
                return valueOf22;
            }
        }
    }

    /* renamed from: c */
    public void m17548c(boolean z) {
        synchronized (this.f19674c) {
            if (!this.f19672a) {
                this.f19673b = Boolean.valueOf(z);
                this.f19672a = true;
            }
        }
    }
}
