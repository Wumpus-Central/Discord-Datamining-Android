package io.sentry;

import io.sentry.protocol.C9009t;
import io.sentry.protocol.C9011u;
import io.sentry.protocol.C9013v;
import io.sentry.util.C9111k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.r3 */
/* loaded from: classes8.dex */
public final class C9034r3 {

    /* renamed from: a */
    private final C9026q3 f19863a;

    /* renamed from: b */
    private final C8951o3 f19864b;

    public C9034r3(C9026q3 q3Var, C8951o3 o3Var) {
        this.f19863a = (C9026q3) C9111k.m16995a(q3Var, "The SentryStackTraceFactory is required.");
        this.f19864b = (C8951o3) C9111k.m16995a(o3Var, "The SentryOptions is required");
    }

    /* renamed from: d */
    private C9013v m17182d(boolean z, StackTraceElement[] stackTraceElementArr, Thread thread) {
        C9013v vVar = new C9013v();
        vVar.m17253o(thread.getName());
        vVar.m17252p(Integer.valueOf(thread.getPriority()));
        vVar.m17254n(Long.valueOf(thread.getId()));
        vVar.m17255m(Boolean.valueOf(thread.isDaemon()));
        vVar.m17250r(thread.getState().name());
        vVar.m17257k(Boolean.valueOf(z));
        List<C9009t> a = this.f19863a.m17204a(stackTraceElementArr);
        if (this.f19864b.isAttachStacktrace() && a != null && !a.isEmpty()) {
            C9011u uVar = new C9011u(a);
            uVar.m17270d(Boolean.TRUE);
            vVar.m17251q(uVar);
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C9013v> m17185a() {
        HashMap hashMap = new HashMap();
        Thread currentThread = Thread.currentThread();
        hashMap.put(currentThread, currentThread.getStackTrace());
        return m17183c(hashMap, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C9013v> m17184b(List<Long> list) {
        return m17183c(Thread.getAllStackTraces(), list);
    }

    /* renamed from: c */
    List<C9013v> m17183c(Map<Thread, StackTraceElement[]> map, List<Long> list) {
        boolean z;
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            if (key == currentThread || (list != null && list.contains(Long.valueOf(key.getId())))) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(m17182d(z, entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }
}
