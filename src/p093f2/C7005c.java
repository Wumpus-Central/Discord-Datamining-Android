package p093f2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p074e2.EnumC6603b;

/* renamed from: f2.c */
/* loaded from: classes.dex */
public class C7005c {

    /* renamed from: a */
    private final String f15283a;

    /* renamed from: b */
    private final String f15284b;

    /* renamed from: c */
    private final String f15285c;

    /* renamed from: d */
    final List<String> f15286d;

    /* renamed from: e */
    final List<String> f15287e;

    /* renamed from: f */
    final List<String> f15288f;

    /* renamed from: g */
    boolean f15289g = false;

    /* renamed from: h */
    int f15290h = 0;

    /* renamed from: i */
    int f15291i = 0;

    /* renamed from: j */
    boolean f15292j = false;

    public C7005c(String str, String str2, String str3, String str4) {
        this.f15283a = str;
        this.f15284b = str2;
        this.f15285c = str3;
        this.f15286d = m23673a(str4);
        this.f15287e = m23672b(str4);
        this.f15288f = m23669e(str4);
    }

    /* renamed from: a */
    private static List<String> m23673a(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://app.adjust.net.in", "https://app.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://app.adjust.world", "https://app.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://app.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://app.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://app.us.adjust.com");
        }
        return Arrays.asList("https://app.adjust.com", "https://app.adjust.net.in", "https://app.adjust.world");
    }

    /* renamed from: b */
    private static List<String> m23672b(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://gdpr.adjust.net.in", "https://gdpr.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://gdpr.adjust.world", "https://gdpr.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://gdpr.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://gdpr.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://gdpr.us.adjust.com");
        }
        return Arrays.asList("https://gdpr.adjust.com", "https://gdpr.adjust.net.in", "https://gdpr.adjust.world");
    }

    /* renamed from: e */
    private static List<String> m23669e(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://subscription.adjust.net.in", "https://subscription.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://subscription.adjust.world", "https://subscription.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://subscription.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://subscription.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://subscription.us.adjust.com");
        }
        return Arrays.asList("https://subscription.adjust.com", "https://subscription.adjust.net.in", "https://subscription.adjust.world");
    }

    /* renamed from: c */
    public void m23671c() {
        this.f15291i = this.f15290h;
        this.f15289g = true;
    }

    /* renamed from: d */
    public boolean m23670d(EnumC6603b bVar) {
        int i;
        this.f15289g = false;
        if (this.f15292j) {
            return false;
        }
        if (bVar == EnumC6603b.GDPR) {
            i = this.f15287e.size();
        } else if (bVar == EnumC6603b.SUBSCRIPTION) {
            i = this.f15288f.size();
        } else {
            i = this.f15286d.size();
        }
        int i2 = (this.f15290h + 1) % i;
        this.f15290h = i2;
        if (i2 != this.f15291i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m23668f(EnumC6603b bVar) {
        if (bVar == EnumC6603b.GDPR) {
            String str = this.f15284b;
            if (str != null) {
                this.f15292j = true;
                return str;
            }
            this.f15292j = false;
            return this.f15287e.get(this.f15290h);
        } else if (bVar == EnumC6603b.SUBSCRIPTION) {
            String str2 = this.f15285c;
            if (str2 != null) {
                this.f15292j = true;
                return str2;
            }
            this.f15292j = false;
            return this.f15288f.get(this.f15290h);
        } else {
            String str3 = this.f15283a;
            if (str3 != null) {
                this.f15292j = true;
                return str3;
            }
            this.f15292j = false;
            return this.f15286d.get(this.f15290h);
        }
    }
}
