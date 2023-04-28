package p163j$.time;

import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.ZoneOffset */
/* loaded from: classes2.dex */
public final class ZoneOffset extends AbstractC9209m implements AbstractC9223k, Comparable<ZoneOffset> {

    /* renamed from: a */
    private final int f20136a;

    /* renamed from: b */
    private final transient String f20137b;

    /* renamed from: c */
    private static final ConcurrentHashMap f20132c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d */
    private static final ConcurrentHashMap f20133d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = m16734h(0);

    /* renamed from: e */
    public static final ZoneOffset f20134e = m16734h(-64800);

    /* renamed from: f */
    public static final ZoneOffset f20135f = m16734h(64800);

    private ZoneOffset(int i) {
        String str;
        this.f20136a = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb2.append(i < 0 ? "-" : "+");
            sb2.append(i2 < 10 ? "0" : "");
            sb2.append(i2);
            String str2 = ":0";
            sb2.append(i3 < 10 ? str2 : ":");
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 >= 10 ? ":" : str2);
                sb2.append(i4);
            }
            str = sb2.toString();
        }
        this.f20137b = str;
    }

    /* renamed from: h */
    public static ZoneOffset m16734h(int i) {
        if (i < -64800 || i > 64800) {
            throw new C9167b("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = f20132c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f20133d.putIfAbsent(zoneOffset2.f20137b, zoneOffset2);
            return zoneOffset2;
        }
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        return AbstractC9222j.m16643c(this, lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar == EnumC9213a.OFFSET_SECONDS : lVar != null && lVar.mo16630a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        if (lVar == EnumC9213a.OFFSET_SECONDS) {
            return this.f20136a;
        }
        if (!(lVar instanceof EnumC9213a)) {
            return lVar.mo16625f(this);
        }
        throw new C9228p("Unsupported field: " + lVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f20136a - this.f20136a;
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        return (nVar == AbstractC9222j.m16639g() || nVar == AbstractC9222j.m16637i()) ? this : AbstractC9222j.m16644b(this, nVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        if (aVar == EnumC9213a.OFFSET_SECONDS) {
            return this.f20136a;
        }
        if (!(aVar instanceof EnumC9213a)) {
            return AbstractC9222j.m16643c(this, aVar).m16623a(mo16633c(aVar), aVar);
        }
        throw new C9228p("Unsupported field: " + aVar);
    }

    @Override // p163j$.time.AbstractC9209m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneOffset)) {
            return false;
        }
        return this.f20136a == ((ZoneOffset) obj).f20136a;
    }

    @Override // p163j$.time.AbstractC9209m
    /* renamed from: f */
    public final String mo16661f() {
        return this.f20137b;
    }

    /* renamed from: g */
    public final int m16735g() {
        return this.f20136a;
    }

    @Override // p163j$.time.AbstractC9209m
    public final int hashCode() {
        return this.f20136a;
    }

    @Override // p163j$.time.AbstractC9209m
    public final String toString() {
        return this.f20137b;
    }
}
