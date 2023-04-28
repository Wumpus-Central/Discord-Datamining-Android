package p163j$.time;

import java.io.Serializable;
import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9225m;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;
import p163j$.time.zone.C9232c;

/* renamed from: j$.time.OffsetDateTime */
/* loaded from: classes2.dex */
public final class OffsetDateTime implements AbstractC9223k, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f20130a;

    /* renamed from: b */
    private final ZoneOffset f20131b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f20126c;
        ZoneOffset zoneOffset = ZoneOffset.f20135f;
        localDateTime.getClass();
        m16737f(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f20127d;
        ZoneOffset zoneOffset2 = ZoneOffset.f20134e;
        localDateTime2.getClass();
        m16737f(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f20130a = localDateTime;
        if (zoneOffset != null) {
            this.f20131b = zoneOffset;
            return;
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: f */
    public static OffsetDateTime m16737f(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: g */
    public static OffsetDateTime m16736g(Instant instant, AbstractC9209m mVar) {
        if (instant == null) {
            throw new NullPointerException("instant");
        } else if (mVar != null) {
            ZoneOffset a = C9232c.m16608c((ZoneOffset) mVar).m16610a(instant);
            return new OffsetDateTime(LocalDateTime.m16742i(instant.m16749h(), instant.m16748i(), a), a);
        } else {
            throw new NullPointerException("zone");
        }
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? (lVar == EnumC9213a.INSTANT_SECONDS || lVar == EnumC9213a.OFFSET_SECONDS) ? lVar.mo16627d() : this.f20130a.mo16635a(lVar) : lVar.mo16629b(this);
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
        int i = AbstractC9208l.f20219a[((EnumC9213a) lVar).ordinal()];
        ZoneOffset zoneOffset = this.f20131b;
        LocalDateTime localDateTime = this.f20130a;
        return i != 1 ? i != 2 ? localDateTime.mo16633c(lVar) : zoneOffset.m16735g() : localDateTime.m16741j(zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int i;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f20131b;
        ZoneOffset zoneOffset2 = this.f20131b;
        if (zoneOffset2.equals(zoneOffset)) {
            i = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f20130a;
            long j = localDateTime.m16741j(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.f20131b;
            LocalDateTime localDateTime2 = offsetDateTime2.f20130a;
            int compare = Long.compare(j, localDateTime2.m16741j(zoneOffset3));
            i = compare == 0 ? localDateTime.m16738m().m16669h() - localDateTime2.m16738m().m16669h() : compare;
        }
        return i == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : i;
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        if (nVar == AbstractC9222j.m16639g() || nVar == AbstractC9222j.m16637i()) {
            return this.f20131b;
        }
        if (nVar == AbstractC9222j.m16636j()) {
            return null;
        }
        C9225m e = AbstractC9222j.m16641e();
        LocalDateTime localDateTime = this.f20130a;
        return nVar == e ? localDateTime.m16740k() : nVar == AbstractC9222j.m16640f() ? localDateTime.m16738m() : nVar == AbstractC9222j.m16642d() ? C9176h.f20141a : nVar == AbstractC9222j.m16638h() ? EnumC9214b.NANOS : nVar.mo16624a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        if (!(aVar instanceof EnumC9213a)) {
            return AbstractC9222j.m16645a(this, aVar);
        }
        int i = AbstractC9208l.f20219a[aVar.ordinal()];
        if (i != 1) {
            return i != 2 ? this.f20130a.mo16631e(aVar) : this.f20131b.m16735g();
        }
        throw new C9228p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f20130a.equals(offsetDateTime.f20130a) && this.f20131b.equals(offsetDateTime.f20131b);
    }

    public final int hashCode() {
        return this.f20130a.hashCode() ^ this.f20131b.hashCode();
    }

    public LocalDateTime toLocalDateTime() {
        return this.f20130a;
    }

    public final String toString() {
        return this.f20130a.toString() + this.f20131b.toString();
    }
}
