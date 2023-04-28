package io.sentry;

import io.sentry.protocol.C9015w;
import io.sentry.util.C9111k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p163j$.util.DesugarCollections;

/* renamed from: io.sentry.m */
/* loaded from: classes8.dex */
public final class C8931m implements AbstractC9053t {

    /* renamed from: k */
    private final Map<Throwable, Object> f19639k = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: l */
    private final C8951o3 f19640l;

    public C8931m(C8951o3 o3Var) {
        this.f19640l = (C8951o3) C9111k.m16995a(o3Var, "options are required");
    }

    /* renamed from: a */
    private static List<Throwable> m17609a(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    /* renamed from: c */
    private static <T> boolean m17608c(Map<T, Object> map, List<T> list) {
        for (T t : list) {
            if (map.containsKey(t)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: b */
    public C8908j3 mo17164b(C8908j3 j3Var, C9116v vVar) {
        if (this.f19640l.isEnableDeduplication()) {
            Throwable M = j3Var.m17657M();
            if (M != null) {
                if (this.f19639k.containsKey(M) || m17608c(this.f19639k, m17609a(M))) {
                    this.f19640l.getLogger().mo17722c(EnumC8942n3.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", j3Var.m17665E());
                    return null;
                }
                this.f19639k.put(M, null);
            }
        } else {
            this.f19640l.getLogger().mo17722c(EnumC8942n3.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return j3Var;
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: g */
    public /* synthetic */ C9015w mo17163g(C9015w wVar, C9116v vVar) {
        return C9046s.m17167a(this, wVar, vVar);
    }
}
