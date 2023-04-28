package p163j$.time;

import java.io.Serializable;
import p163j$.time.chrono.AbstractC9172d;
import p163j$.time.chrono.AbstractC9174f;
import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;
import p163j$.time.zone.C9232c;

/* renamed from: j$.time.p */
/* loaded from: classes2.dex */
public final class C9212p implements AbstractC9223k, AbstractC9174f, Serializable {

    /* renamed from: a */
    private final LocalDateTime f20221a;

    /* renamed from: b */
    private final ZoneOffset f20222b;

    /* renamed from: c */
    private final AbstractC9209m f20223c;

    private C9212p(LocalDateTime localDateTime, ZoneOffset zoneOffset, AbstractC9209m mVar) {
        this.f20221a = localDateTime;
        this.f20222b = zoneOffset;
        this.f20223c = mVar;
    }

    /* renamed from: g */
    public static C9212p m16659g(Instant instant, AbstractC9209m mVar) {
        if (instant != null) {
            long h = instant.m16749h();
            int i = instant.m16748i();
            ZoneOffset a = C9232c.m16608c((ZoneOffset) mVar).m16610a(Instant.m16746k(h, i));
            return new C9212p(LocalDateTime.m16742i(h, i, a), a, mVar);
        }
        throw new NullPointerException("instant");
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? (lVar == EnumC9213a.INSTANT_SECONDS || lVar == EnumC9213a.OFFSET_SECONDS) ? lVar.mo16627d() : this.f20221a.mo16635a(lVar) : lVar.mo16629b(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        return (lVar instanceof EnumC9213a) || (lVar != null && lVar.mo16630a(this));
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        if (!(lVar instanceof EnumC9213a)) {
            return lVar.mo16625f(this);
        }
        int i = AbstractC9211o.f20220a[((EnumC9213a) lVar).ordinal()];
        return i != 1 ? i != 2 ? this.f20221a.mo16633c(lVar) : this.f20222b.m16735g() : m16658h();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9212p pVar = (C9212p) ((AbstractC9174f) obj);
        int compare = Long.compare(m16658h(), pVar.m16658h());
        if (compare != 0) {
            return compare;
        }
        int h = m16655k().m16669h() - pVar.m16655k().m16669h();
        if (h != 0) {
            return h;
        }
        int f = this.f20221a.compareTo(pVar.f20221a);
        if (f != 0) {
            return f;
        }
        int compareTo = this.f20223c.mo16661f().compareTo(pVar.f20223c.mo16661f());
        if (compareTo != 0) {
            return compareTo;
        }
        m16657i().getClass();
        C9176h hVar = C9176h.f20141a;
        pVar.m16657i().getClass();
        hVar.getClass();
        hVar.getClass();
        return 0;
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        if (nVar == AbstractC9222j.m16641e()) {
            return m16657i();
        }
        if (nVar == AbstractC9222j.m16637i() || nVar == AbstractC9222j.m16636j()) {
            return this.f20223c;
        }
        if (nVar == AbstractC9222j.m16639g()) {
            return this.f20222b;
        }
        if (nVar == AbstractC9222j.m16640f()) {
            return m16655k();
        }
        if (nVar != AbstractC9222j.m16642d()) {
            return nVar == AbstractC9222j.m16638h() ? EnumC9214b.NANOS : nVar.mo16624a(this);
        }
        m16657i().getClass();
        return C9176h.f20141a;
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        if (!(aVar instanceof EnumC9213a)) {
            return AbstractC9172d.m16728a(this, aVar);
        }
        int i = AbstractC9211o.f20220a[aVar.ordinal()];
        if (i != 1) {
            return i != 2 ? this.f20221a.mo16631e(aVar) : this.f20222b.m16735g();
        }
        throw new C9228p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9212p)) {
            return false;
        }
        C9212p pVar = (C9212p) obj;
        return this.f20221a.equals(pVar.f20221a) && this.f20222b.equals(pVar.f20222b) && this.f20223c.equals(pVar.f20223c);
    }

    /* renamed from: f */
    public final ZoneOffset m16660f() {
        return this.f20222b;
    }

    /* renamed from: h */
    public final long m16658h() {
        return ((m16657i().m16673q() * 86400) + m16655k().m16665l()) - m16660f().m16735g();
    }

    public final int hashCode() {
        return (this.f20221a.hashCode() ^ this.f20222b.hashCode()) ^ Integer.rotateLeft(this.f20223c.hashCode(), 3);
    }

    /* renamed from: i */
    public final C9203g m16657i() {
        return this.f20221a.m16740k();
    }

    /* renamed from: j */
    public final LocalDateTime m16656j() {
        return this.f20221a;
    }

    /* renamed from: k */
    public final C9205i m16655k() {
        return this.f20221a.m16738m();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20221a.toString());
        ZoneOffset zoneOffset = this.f20222b;
        sb2.append(zoneOffset.toString());
        String sb3 = sb2.toString();
        AbstractC9209m mVar = this.f20223c;
        if (zoneOffset == mVar) {
            return sb3;
        }
        return sb3 + '[' + mVar.toString() + ']';
    }
}
