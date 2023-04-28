package io.sentry.android.core.internal.util;

import io.sentry.util.C9100c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.sentry.android.core.internal.util.c */
/* loaded from: classes8.dex */
public final class C8745c {

    /* renamed from: b */
    private static final C8745c f19327b = new C8745c();

    /* renamed from: a */
    private final List<Integer> f19328a = new ArrayList();

    private C8745c() {
    }

    /* renamed from: a */
    public static C8745c m18220a() {
        return f19327b;
    }

    /* renamed from: b */
    String m18219b() {
        return "/sys/devices/system/cpu";
    }

    /* renamed from: c */
    public List<Integer> m18218c() {
        if (!this.f19328a.isEmpty()) {
            return this.f19328a;
        }
        File[] listFiles = new File(m18219b()).listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        for (File file : listFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String b = C9100c.m17019b(file2);
                        if (b != null) {
                            this.f19328a.add(Integer.valueOf((int) (Long.parseLong(b.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f19328a;
    }
}
