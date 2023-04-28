package io.sentry.clientreport;

import io.sentry.EnumC8868g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.clientreport.a */
/* loaded from: classes8.dex */
final class C8822a implements AbstractC8831h {

    /* renamed from: a */
    private final Map<C8825c, AtomicLong> f19501a;

    public C8822a() {
        EnumC8827e[] values;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (EnumC8827e eVar : EnumC8827e.values()) {
            for (EnumC8868g gVar : EnumC8868g.values()) {
                concurrentHashMap.put(new C8825c(eVar.getReason(), gVar.getCategory()), new AtomicLong(0L));
            }
        }
        this.f19501a = Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.AbstractC8831h
    /* renamed from: a */
    public void mo17940a(C8825c cVar, Long l) {
        AtomicLong atomicLong = this.f19501a.get(cVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    @Override // io.sentry.clientreport.AbstractC8831h
    /* renamed from: b */
    public List<C8828f> mo17939b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C8825c, AtomicLong> entry : this.f19501a.entrySet()) {
            Long valueOf = Long.valueOf(entry.getValue().getAndSet(0L));
            if (valueOf.longValue() > 0) {
                arrayList.add(new C8828f(entry.getKey().m17951b(), entry.getKey().m17952a(), valueOf));
            }
        }
        return arrayList;
    }
}
