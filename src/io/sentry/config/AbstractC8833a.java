package io.sentry.config;

import io.sentry.util.C9111k;
import io.sentry.util.C9115o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: io.sentry.config.a */
/* loaded from: classes8.dex */
abstract class AbstractC8833a implements AbstractC8839g {

    /* renamed from: a */
    private final String f19513a;

    /* renamed from: b */
    private final Properties f19514b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8833a(String str, Properties properties) {
        this.f19513a = (String) C9111k.m16995a(str, "prefix is required");
        this.f19514b = (Properties) C9111k.m16995a(properties, "properties are required");
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
        String str2 = this.f19513a + str + ".";
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f19514b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    hashMap.put(str3.substring(str2.length()), C9115o.m16981e((String) entry.getValue(), "\""));
                }
            }
        }
        return hashMap;
    }

    @Override // io.sentry.config.AbstractC8839g
    public String getProperty(String str) {
        Properties properties = this.f19514b;
        return C9115o.m16981e(properties.getProperty(this.f19513a + str), "\"");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8833a(Properties properties) {
        this("", properties);
    }
}
