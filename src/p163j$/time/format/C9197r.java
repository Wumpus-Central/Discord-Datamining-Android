package p163j$.time.format;

import java.util.Locale;
import p163j$.time.AbstractC9209m;
import p163j$.time.C9167b;
import p163j$.time.C9203g;
import p163j$.time.C9212p;
import p163j$.time.Instant;
import p163j$.time.ZoneOffset;
import p163j$.time.chrono.AbstractC9175g;
import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.zone.C9232c;
import p163j$.util.AbstractC0518n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.r */
/* loaded from: classes2.dex */
public final class C9197r {

    /* renamed from: a */
    private AbstractC9223k f20194a;

    /* renamed from: b */
    private DateTimeFormatter f20195b;

    /* renamed from: c */
    private int f20196c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9197r(AbstractC9223k kVar, DateTimeFormatter dateTimeFormatter) {
        EnumC9213a[] values;
        Instant k;
        AbstractC9175g b = dateTimeFormatter.m16722b();
        AbstractC9209m e = dateTimeFormatter.m16719e();
        if (!(b == null && e == null)) {
            AbstractC9175g gVar = (AbstractC9175g) kVar.mo16632d(AbstractC9222j.m16642d());
            AbstractC9209m mVar = (AbstractC9209m) kVar.mo16632d(AbstractC9222j.m16636j());
            C9203g gVar2 = null;
            b = AbstractC0518n.m16483k(b, gVar) ? null : b;
            e = AbstractC0518n.m16483k(e, mVar) ? null : e;
            if (!(b == null && e == null)) {
                AbstractC9175g gVar3 = b != null ? b : gVar;
                if (e != null) {
                    EnumC9213a aVar = EnumC9213a.INSTANT_SECONDS;
                    if (kVar.mo16634b(aVar)) {
                        gVar3 = gVar3 == null ? C9176h.f20141a : gVar3;
                        Instant instant = Instant.f20123c;
                        if (kVar instanceof Instant) {
                            k = (Instant) kVar;
                        } else {
                            try {
                                k = Instant.m16746k(kVar.mo16633c(aVar), kVar.mo16631e(EnumC9213a.NANO_OF_SECOND));
                            } catch (C9167b e2) {
                                throw new C9167b("Unable to obtain Instant from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName(), e2);
                            }
                        }
                        ((C9176h) gVar3).getClass();
                        kVar = C9212p.m16659g(k, e);
                    } else {
                        ZoneOffset zoneOffset = (ZoneOffset) e;
                        C9232c c = C9232c.m16608c(zoneOffset);
                        if ((c.m16609b() ? c.m16610a(Instant.f20123c) : e) instanceof ZoneOffset) {
                            EnumC9213a aVar2 = EnumC9213a.OFFSET_SECONDS;
                            if (kVar.mo16634b(aVar2) && kVar.mo16631e(aVar2) != C9232c.m16608c(zoneOffset).m16610a(Instant.f20123c).m16735g()) {
                                throw new C9167b("Unable to apply override zone '" + e + "' because the temporal object being formatted has a different offset but does not represent an instant: " + kVar);
                            }
                        }
                    }
                }
                mVar = e != null ? e : mVar;
                if (b != null) {
                    if (kVar.mo16634b(EnumC9213a.EPOCH_DAY)) {
                        ((C9176h) gVar3).getClass();
                        gVar2 = C9203g.m16682h(kVar);
                    } else if (!(b == C9176h.f20141a && gVar == null)) {
                        for (EnumC9213a aVar3 : EnumC9213a.values()) {
                            if (aVar3.mo16628c() && kVar.mo16634b(aVar3)) {
                                throw new C9167b("Unable to apply override chronology '" + b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + kVar);
                            }
                        }
                    }
                }
                kVar = new C9196q(gVar2, kVar, gVar3, mVar);
            }
        }
        this.f20194a = kVar;
        this.f20195b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m16692a() {
        this.f20196c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9199t m16691b() {
        return this.f20195b.m16721c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Locale m16690c() {
        return this.f20195b.m16720d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final AbstractC9223k m16689d() {
        return this.f20194a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final Long m16688e(AbstractC9224l lVar) {
        try {
            return Long.valueOf(this.f20194a.mo16633c(lVar));
        } catch (C9167b e) {
            if (this.f20196c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object m16687f(AbstractC9226n nVar) {
        Object d = this.f20194a.mo16632d(nVar);
        if (d != null || this.f20196c != 0) {
            return d;
        }
        throw new C9167b("Unable to extract value: " + this.f20194a.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m16686g() {
        this.f20196c++;
    }

    public final String toString() {
        return this.f20194a.toString();
    }
}
