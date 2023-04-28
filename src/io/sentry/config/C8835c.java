package io.sentry.config;

import java.util.List;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.config.c */
/* loaded from: classes8.dex */
final class C8835c implements AbstractC8839g {

    /* renamed from: a */
    private final List<AbstractC8839g> f19518a;

    public C8835c(List<AbstractC8839g> list) {
        this.f19518a = list;
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
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (AbstractC8839g gVar : this.f19518a) {
            concurrentHashMap.putAll(gVar.getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.AbstractC8839g
    public String getProperty(String str) {
        for (AbstractC8839g gVar : this.f19518a) {
            String property = gVar.getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
