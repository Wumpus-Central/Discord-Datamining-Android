package io.sentry.transport;

import io.sentry.C8879h3;
import io.sentry.C8951o3;
import io.sentry.C9025q2;
import io.sentry.C9116v;
import io.sentry.EnumC8868g;
import io.sentry.EnumC8942n3;
import io.sentry.clientreport.EnumC8827e;
import io.sentry.hints.AbstractC8887f;
import io.sentry.hints.AbstractC8892k;
import io.sentry.util.C9105h;
import io.sentry.util.C9115o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.transport.y */
/* loaded from: classes8.dex */
public final class C9090y {

    /* renamed from: a */
    private final AbstractC9079o f19942a;

    /* renamed from: b */
    private final C8951o3 f19943b;

    /* renamed from: c */
    private final Map<EnumC8868g, Date> f19944c;

    public C9090y(AbstractC9079o oVar, C8951o3 o3Var) {
        this.f19944c = new ConcurrentHashMap();
        this.f19942a = oVar;
        this.f19943b = o3Var;
    }

    /* renamed from: c */
    private void m17103c(EnumC8868g gVar, Date date) {
        Date date2 = this.f19944c.get(gVar);
        if (date2 == null || date.after(date2)) {
            this.f19944c.put(gVar, date);
        }
    }

    /* renamed from: e */
    private EnumC8868g m17101e(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1963501277:
                if (str.equals("attachment")) {
                    c = 0;
                    break;
                }
                break;
            case 96891546:
                if (str.equals("event")) {
                    c = 1;
                    break;
                }
                break;
            case 1984987798:
                if (str.equals("session")) {
                    c = 2;
                    break;
                }
                break;
            case 2141246174:
                if (str.equals("transaction")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return EnumC8868g.Attachment;
            case 1:
                return EnumC8868g.Error;
            case 2:
                return EnumC8868g.Session;
            case 3:
                return EnumC8868g.Transaction;
            default:
                return EnumC8868g.Unknown;
        }
    }

    /* renamed from: f */
    private boolean m17100f(String str) {
        Date date;
        EnumC8868g e = m17101e(str);
        Date date2 = new Date(this.f19942a.mo17116a());
        Date date3 = this.f19944c.get(EnumC8868g.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (!EnumC8868g.Unknown.equals(e) && (date = this.f19944c.get(e)) != null) {
            return !date2.after(date);
        }
        return false;
    }

    /* renamed from: i */
    private static void m17097i(C9116v vVar, final boolean z) {
        C9105h.m17005n(vVar, AbstractC8892k.class, new C9105h.AbstractC9106a() { // from class: io.sentry.transport.w
            @Override // io.sentry.util.C9105h.AbstractC9106a
            public final void accept(Object obj) {
                ((AbstractC8892k) obj).mo17716b(false);
            }
        });
        C9105h.m17005n(vVar, AbstractC8887f.class, new C9105h.AbstractC9106a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.C9105h.AbstractC9106a
            public final void accept(Object obj) {
                ((AbstractC8887f) obj).mo17715c(z);
            }
        });
    }

    /* renamed from: j */
    private long m17096j(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }

    /* renamed from: d */
    public C9025q2 m17102d(C9025q2 q2Var, C9116v vVar) {
        ArrayList arrayList = null;
        for (C8879h3 h3Var : q2Var.m17205d()) {
            if (m17100f(h3Var.m17776w().m17763b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(h3Var);
                this.f19943b.getClientReportRecorder().mo17936c(EnumC8827e.RATELIMIT_BACKOFF, h3Var);
            }
        }
        if (arrayList == null) {
            return q2Var;
        }
        this.f19943b.getLogger().mo17722c(EnumC8942n3.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (C8879h3 h3Var2 : q2Var.m17205d()) {
            if (!arrayList.contains(h3Var2)) {
                arrayList2.add(h3Var2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C9025q2(q2Var.m17206c(), arrayList2);
        }
        this.f19943b.getLogger().mo17722c(EnumC8942n3.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
        m17097i(vVar, false);
        return null;
    }

    /* renamed from: k */
    public void m17095k(String str, String str2, int i) {
        String[] split;
        if (str != null) {
            int i2 = -1;
            String[] split2 = str.split(",", -1);
            int length = split2.length;
            int i3 = 0;
            while (i3 < length) {
                String[] split3 = split2[i3].replace(" ", "").split(":", i2);
                if (split3.length > 0) {
                    long j = m17096j(split3[0]);
                    if (split3.length > 1) {
                        String str3 = split3[1];
                        Date date = new Date(this.f19942a.mo17116a() + j);
                        if (str3 == null || str3.isEmpty()) {
                            m17103c(EnumC8868g.All, date);
                        } else {
                            for (String str4 : str3.split(";", i2)) {
                                EnumC8868g gVar = EnumC8868g.Unknown;
                                try {
                                    String b = C9115o.m16984b(str4);
                                    if (b != null) {
                                        gVar = EnumC8868g.valueOf(b);
                                    } else {
                                        this.f19943b.getLogger().mo17722c(EnumC8942n3.ERROR, "Couldn't capitalize: %s", str4);
                                    }
                                } catch (IllegalArgumentException e) {
                                    this.f19943b.getLogger().mo17724a(EnumC8942n3.INFO, e, "Unknown category: %s", str4);
                                }
                                if (!EnumC8868g.Unknown.equals(gVar)) {
                                    m17103c(gVar, date);
                                }
                            }
                        }
                    }
                }
                i3++;
                i2 = -1;
            }
        } else if (i == 429) {
            m17103c(EnumC8868g.All, new Date(this.f19942a.mo17116a() + m17096j(str2)));
        }
    }

    public C9090y(C8951o3 o3Var) {
        this(C9077m.m17126b(), o3Var);
    }
}
