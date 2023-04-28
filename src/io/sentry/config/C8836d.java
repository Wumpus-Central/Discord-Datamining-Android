package io.sentry.config;

import io.sentry.util.C9115o;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.config.d */
/* loaded from: classes8.dex */
final class C8836d implements AbstractC8839g {
    /* renamed from: f */
    private String m17933f(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.AbstractC8839g
    /* renamed from: a */
    public /* synthetic */ Long mo17926a(String str) {
        return C8838f.m17928d(this, str);
    }

    @Override // io.sentry.config.AbstractC8839g
    /* renamed from: b */
    public /* synthetic */ Double mo17925b(String str) {
        return C8838f.m17930b(this, str);
    }

    @Override // io.sentry.config.AbstractC8839g
    /* renamed from: c */
    public /* synthetic */ String mo17924c(String str, String str2) {
        return C8838f.m17927e(this, str, str2);
    }

    @Override // io.sentry.config.AbstractC8839g
    /* renamed from: d */
    public /* synthetic */ List mo17923d(String str) {
        return C8838f.m17929c(this, str);
    }

    @Override // io.sentry.config.AbstractC8839g
    /* renamed from: e */
    public /* synthetic */ Boolean mo17922e(String str) {
        return C8838f.m17931a(this, str);
    }

    @Override // io.sentry.config.AbstractC8839g
    public Map<String, String> getMap(String str) {
        String e;
        String str2 = m17933f(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (e = C9115o.m16981e(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), e);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.AbstractC8839g
    public String getProperty(String str) {
        return C9115o.m16981e(System.getenv(m17933f(str)), "\"");
    }
}
