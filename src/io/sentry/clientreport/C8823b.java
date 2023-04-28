package io.sentry.clientreport;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C8875h;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.EnumC8942n3;
import io.sentry.clientreport.C8828f;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.clientreport.b */
/* loaded from: classes8.dex */
public final class C8823b implements AbstractC8806b1 {

    /* renamed from: k */
    private final Date f19502k;

    /* renamed from: l */
    private final List<C8828f> f19503l;

    /* renamed from: m */
    private Map<String, Object> f19504m;

    /* renamed from: io.sentry.clientreport.b$a */
    /* loaded from: classes8.dex */
    public static final class C8824a implements AbstractC9030r0<C8823b> {
        /* renamed from: c */
        private Exception m17953c(String str, AbstractC8869g0 g0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            g0Var.mo17723b(EnumC8942n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* renamed from: b */
        public C8823b mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            ArrayList arrayList = new ArrayList();
            x0Var.m16940g();
            Date date = null;
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (S.equals("discarded_events")) {
                    arrayList.addAll(x0Var.m16806U0(g0Var, new C8828f.C8829a()));
                } else if (!S.equals("timestamp")) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    x0Var.m16799b1(g0Var, hashMap, S);
                } else {
                    date = x0Var.m16811P0(g0Var);
                }
            }
            x0Var.m16934p();
            if (date == null) {
                throw m17953c("timestamp", g0Var);
            } else if (!arrayList.isEmpty()) {
                C8823b bVar = new C8823b(date, arrayList);
                bVar.m17955b(hashMap);
                return bVar;
            } else {
                throw m17953c("discarded_events", g0Var);
            }
        }
    }

    public C8823b(Date date, List<C8828f> list) {
        this.f19502k = date;
        this.f19503l = list;
    }

    /* renamed from: a */
    public List<C8828f> m17956a() {
        return this.f19503l;
    }

    /* renamed from: b */
    public void m17955b(Map<String, Object> map) {
        this.f19504m = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("timestamp").m16918f0(C8875h.m17842f(this.f19502k));
        z0Var.m16753z0("discarded_events").m16754F0(g0Var, this.f19503l);
        Map<String, Object> map = this.f19504m;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19504m.get(str));
            }
        }
        z0Var.m16911p();
    }
}
