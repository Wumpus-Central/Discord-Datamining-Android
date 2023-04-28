package p163j$.time;

import java.io.Serializable;
import p163j$.time.chrono.AbstractC9170b;
import p163j$.time.chrono.AbstractC9171c;
import p163j$.time.chrono.C9176h;
import p163j$.time.format.DateTimeFormatter;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;

/* renamed from: j$.time.LocalDateTime */
/* loaded from: classes2.dex */
public final class LocalDateTime implements AbstractC9223k, AbstractC9171c, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f20126c;

    /* renamed from: d */
    public static final LocalDateTime f20127d;

    /* renamed from: a */
    private final C9203g f20128a;

    /* renamed from: b */
    private final C9205i f20129b;

    static {
        C9203g gVar = C9203g.f20202d;
        C9205i iVar = C9205i.f20209e;
        if (gVar == null) {
            throw new NullPointerException("date");
        } else if (iVar != null) {
            f20126c = new LocalDateTime(gVar, iVar);
            C9203g gVar2 = C9203g.f20203e;
            C9205i iVar2 = C9205i.f20210f;
            if (gVar2 == null) {
                throw new NullPointerException("date");
            } else if (iVar2 != null) {
                f20127d = new LocalDateTime(gVar2, iVar2);
            } else {
                throw new NullPointerException("time");
            }
        } else {
            throw new NullPointerException("time");
        }
    }

    private LocalDateTime(C9203g gVar, C9205i iVar) {
        this.f20128a = gVar;
        this.f20129b = iVar;
    }

    /* renamed from: i */
    public static LocalDateTime m16742i(long j, int i, ZoneOffset zoneOffset) {
        long g;
        if (zoneOffset != null) {
            long j2 = i;
            EnumC9213a.NANO_OF_SECOND.m16653h(j2);
            return new LocalDateTime(C9203g.m16675o(AbstractC9166a.m16730d(j + zoneOffset.m16735g(), 86400L)), C9205i.m16667j((((int) AbstractC9166a.m16731c(g, 86400L)) * 1000000000) + j2));
        }
        throw new NullPointerException("offset");
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        if (!(lVar instanceof EnumC9213a)) {
            return lVar.mo16629b(this);
        }
        if (!((EnumC9213a) lVar).mo16626e()) {
            return this.f20128a.mo16635a(lVar);
        }
        C9205i iVar = this.f20129b;
        iVar.getClass();
        return AbstractC9222j.m16643c(iVar, lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        if (!(lVar instanceof EnumC9213a)) {
            return lVar != null && lVar.mo16630a(this);
        }
        EnumC9213a aVar = (EnumC9213a) lVar;
        return aVar.mo16628c() || aVar.mo16626e();
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? ((EnumC9213a) lVar).mo16626e() ? this.f20129b.mo16633c(lVar) : this.f20128a.mo16633c(lVar) : lVar.mo16625f(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        if (nVar == AbstractC9222j.m16641e()) {
            return this.f20128a;
        }
        if (nVar == AbstractC9222j.m16636j() || nVar == AbstractC9222j.m16637i() || nVar == AbstractC9222j.m16639g()) {
            return null;
        }
        if (nVar == AbstractC9222j.m16640f()) {
            return this.f20129b;
        }
        if (nVar != AbstractC9222j.m16642d()) {
            return nVar == AbstractC9222j.m16638h() ? EnumC9214b.NANOS : nVar.mo16624a(this);
        }
        ((C9203g) m16739l()).getClass();
        return C9176h.f20141a;
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        return aVar instanceof EnumC9213a ? aVar.mo16626e() ? this.f20129b.mo16631e(aVar) : this.f20128a.mo16631e(aVar) : AbstractC9222j.m16645a(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f20128a.equals(localDateTime.f20128a) && this.f20129b.equals(localDateTime.f20129b);
    }

    /* renamed from: f */
    public final int compareTo(AbstractC9171c cVar) {
        boolean z = cVar instanceof LocalDateTime;
        C9205i iVar = this.f20129b;
        C9203g gVar = this.f20128a;
        if (z) {
            LocalDateTime localDateTime = (LocalDateTime) cVar;
            int g = gVar.m16683g(localDateTime.f20128a);
            return g == 0 ? iVar.compareTo(localDateTime.f20129b) : g;
        }
        LocalDateTime localDateTime2 = (LocalDateTime) cVar;
        int f = gVar.compareTo(localDateTime2.f20128a);
        if (f != 0) {
            return f;
        }
        int f2 = iVar.compareTo(localDateTime2.f20129b);
        if (f2 != 0) {
            return f2;
        }
        ((C9203g) m16739l()).getClass();
        C9176h hVar = C9176h.f20141a;
        ((C9203g) localDateTime2.m16739l()).getClass();
        hVar.getClass();
        hVar.getClass();
        return 0;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.m16723a(this);
        }
        throw new NullPointerException("formatter");
    }

    /* renamed from: g */
    public final int m16744g() {
        return this.f20129b.m16668i();
    }

    /* renamed from: h */
    public final int m16743h() {
        return this.f20128a.m16678l();
    }

    public final int hashCode() {
        return this.f20128a.hashCode() ^ this.f20129b.hashCode();
    }

    /* renamed from: j */
    public final long m16741j(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((((C9203g) m16739l()).m16673q() * 86400) + m16738m().m16665l()) - zoneOffset.m16735g();
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: k */
    public final C9203g m16740k() {
        return this.f20128a;
    }

    /* renamed from: l */
    public final AbstractC9170b m16739l() {
        return this.f20128a;
    }

    /* renamed from: m */
    public final C9205i m16738m() {
        return this.f20129b;
    }

    public final String toString() {
        return this.f20128a.toString() + 'T' + this.f20129b.toString();
    }
}
