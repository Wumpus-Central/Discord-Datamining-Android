package io.sentry.clientreport;

import io.sentry.C8875h;
import io.sentry.C8879h3;
import io.sentry.C8951o3;
import io.sentry.C9025q2;
import io.sentry.EnumC8868g;
import io.sentry.EnumC8935m3;
import io.sentry.EnumC8942n3;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: io.sentry.clientreport.d */
/* loaded from: classes8.dex */
public final class C8826d implements AbstractC8830g {

    /* renamed from: a */
    private final AbstractC8831h f19507a = new C8822a();

    /* renamed from: b */
    private final C8951o3 f19508b;

    public C8826d(C8951o3 o3Var) {
        this.f19508b = o3Var;
    }

    /* renamed from: e */
    private EnumC8868g m17950e(EnumC8935m3 m3Var) {
        if (EnumC8935m3.Event.equals(m3Var)) {
            return EnumC8868g.Error;
        }
        if (EnumC8935m3.Session.equals(m3Var)) {
            return EnumC8868g.Session;
        }
        if (EnumC8935m3.Transaction.equals(m3Var)) {
            return EnumC8868g.Transaction;
        }
        if (EnumC8935m3.UserFeedback.equals(m3Var)) {
            return EnumC8868g.UserReport;
        }
        if (EnumC8935m3.Attachment.equals(m3Var)) {
            return EnumC8868g.Attachment;
        }
        return EnumC8868g.Default;
    }

    /* renamed from: f */
    private void m17949f(String str, String str2, Long l) {
        this.f19507a.mo17940a(new C8825c(str, str2), l);
    }

    /* renamed from: h */
    private void m17947h(C8823b bVar) {
        if (bVar != null) {
            for (C8828f fVar : bVar.m17956a()) {
                m17949f(fVar.m17944c(), fVar.m17946a(), fVar.m17945b());
            }
        }
    }

    @Override // io.sentry.clientreport.AbstractC8830g
    /* renamed from: a */
    public void mo17938a(EnumC8827e eVar, EnumC8868g gVar) {
        try {
            m17949f(eVar.getReason(), gVar.getCategory(), 1L);
        } catch (Throwable th2) {
            this.f19508b.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.AbstractC8830g
    /* renamed from: b */
    public void mo17937b(EnumC8827e eVar, C9025q2 q2Var) {
        if (q2Var != null) {
            try {
                for (C8879h3 h3Var : q2Var.m17205d()) {
                    mo17936c(eVar, h3Var);
                }
            } catch (Throwable th2) {
                this.f19508b.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.clientreport.AbstractC8830g
    /* renamed from: c */
    public void mo17936c(EnumC8827e eVar, C8879h3 h3Var) {
        if (h3Var != null) {
            try {
                EnumC8935m3 b = h3Var.m17776w().m17763b();
                if (EnumC8935m3.ClientReport.equals(b)) {
                    try {
                        m17947h(h3Var.m17778u(this.f19508b.getSerializer()));
                    } catch (Exception unused) {
                        this.f19508b.getLogger().mo17722c(EnumC8942n3.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    }
                } else {
                    m17949f(eVar.getReason(), m17950e(b).getCategory(), 1L);
                }
            } catch (Throwable th2) {
                this.f19508b.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.clientreport.AbstractC8830g
    /* renamed from: d */
    public C9025q2 mo17935d(C9025q2 q2Var) {
        C8823b g = m17948g();
        if (g == null) {
            return q2Var;
        }
        try {
            this.f19508b.getLogger().mo17722c(EnumC8942n3.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (C8879h3 h3Var : q2Var.m17205d()) {
                arrayList.add(h3Var);
            }
            arrayList.add(C8879h3.m17782q(this.f19508b.getSerializer(), g));
            return new C9025q2(q2Var.m17206c(), arrayList);
        } catch (Throwable th2) {
            this.f19508b.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return q2Var;
        }
    }

    /* renamed from: g */
    C8823b m17948g() {
        Date b = C8875h.m17846b();
        List<C8828f> b2 = this.f19507a.mo17939b();
        if (b2.isEmpty()) {
            return null;
        }
        return new C8823b(b, b2);
    }
}
