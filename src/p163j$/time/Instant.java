package p163j$.time;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.Serializable;
import p163j$.time.format.DateTimeFormatter;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;

/* renamed from: j$.time.Instant */
/* loaded from: classes2.dex */
public final class Instant implements AbstractC9223k, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f20123c = new Instant(0, 0);

    /* renamed from: a */
    private final long f20124a;

    /* renamed from: b */
    private final int f20125b;

    static {
        m16746k(-31557014167219200L, 0L);
        m16746k(31556889864403199L, 999999999L);
    }

    private Instant(long j, int i) {
        this.f20124a = j;
        this.f20125b = i;
    }

    /* renamed from: g */
    private static Instant m16750g(long j, int i) {
        if ((i | j) == 0) {
            return f20123c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new C9167b("Instant exceeds minimum or maximum instant");
    }

    /* renamed from: j */
    public static Instant m16747j(long j) {
        return m16750g(AbstractC9166a.m16730d(j, 1000L), ((int) AbstractC9166a.m16731c(j, 1000L)) * 1000000);
    }

    /* renamed from: k */
    public static Instant m16746k(long j, long j2) {
        return m16750g(AbstractC9166a.m16732b(j, AbstractC9166a.m16730d(j2, 1000000000L)), (int) AbstractC9166a.m16731c(j2, 1000000000L));
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        return AbstractC9222j.m16643c(this, lVar);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m16736g(this, zoneOffset);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar == EnumC9213a.INSTANT_SECONDS || lVar == EnumC9213a.NANO_OF_SECOND || lVar == EnumC9213a.MICRO_OF_SECOND || lVar == EnumC9213a.MILLI_OF_SECOND : lVar != null && lVar.mo16630a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        int i;
        if (!(lVar instanceof EnumC9213a)) {
            return lVar.mo16625f(this);
        }
        int i2 = AbstractC9178e.f20145a[((EnumC9213a) lVar).ordinal()];
        int i3 = this.f20125b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        } else if (i2 == 3) {
            i = i3 / 1000000;
        } else if (i2 == 4) {
            return this.f20124a;
        } else {
            throw new C9228p("Unsupported field: " + lVar);
        }
        return i;
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        if (nVar == AbstractC9222j.m16638h()) {
            return EnumC9214b.NANOS;
        }
        if (nVar == AbstractC9222j.m16642d() || nVar == AbstractC9222j.m16636j() || nVar == AbstractC9222j.m16637i() || nVar == AbstractC9222j.m16639g() || nVar == AbstractC9222j.m16641e() || nVar == AbstractC9222j.m16640f()) {
            return null;
        }
        return nVar.mo16624a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        if (!(aVar instanceof EnumC9213a)) {
            return AbstractC9222j.m16643c(this, aVar).m16623a(mo16633c(aVar), aVar);
        }
        int i = AbstractC9178e.f20145a[aVar.ordinal()];
        int i2 = this.f20125b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            EnumC9213a.INSTANT_SECONDS.m16654g(this.f20124a);
        }
        throw new C9228p("Unsupported field: " + aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f20124a == instant.f20124a && this.f20125b == instant.f20125b;
    }

    /* renamed from: f */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f20124a, instant.f20124a);
        return compare != 0 ? compare : this.f20125b - instant.f20125b;
    }

    /* renamed from: h */
    public final long m16749h() {
        return this.f20124a;
    }

    public final int hashCode() {
        long j = this.f20124a;
        return (this.f20125b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: i */
    public final int m16748i() {
        return this.f20125b;
    }

    public final String toString() {
        return DateTimeFormatter.f20149f.m16723a(this);
    }
}
