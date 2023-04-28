package p163j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import p163j$.time.AbstractC9166a;
import p163j$.time.C9203g;
import p163j$.time.Instant;
import p163j$.time.ZoneOffset;
import p163j$.util.AbstractC0518n;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.c */
/* loaded from: classes2.dex */
public final class C9232c implements Serializable {

    /* renamed from: g */
    private static final long[] f20248g = new long[0];

    /* renamed from: h */
    private static final AbstractC9231b[] f20249h = new AbstractC9231b[0];

    /* renamed from: a */
    private final long[] f20250a;

    /* renamed from: b */
    private final ZoneOffset[] f20251b;

    /* renamed from: c */
    private final long[] f20252c;

    /* renamed from: d */
    private final ZoneOffset[] f20253d;

    /* renamed from: f */
    private final transient ConcurrentHashMap f20255f = new ConcurrentHashMap();

    /* renamed from: e */
    private final AbstractC9231b[] f20254e = f20249h;

    private C9232c(ZoneOffset zoneOffset) {
        this.f20251b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f20248g;
        this.f20250a = jArr;
        this.f20252c = jArr;
        this.f20253d = zoneOffsetArr;
    }

    /* renamed from: c */
    public static C9232c m16608c(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new C9232c(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: a */
    public final ZoneOffset m16610a(Instant instant) {
        long[] jArr = this.f20252c;
        if (jArr.length == 0) {
            return this.f20251b[0];
        }
        long h = instant.m16749h();
        AbstractC9231b[] bVarArr = this.f20254e;
        int length = bVarArr.length;
        ZoneOffset[] zoneOffsetArr = this.f20253d;
        if (length <= 0 || h <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, h);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        int l = C9203g.m16675o(AbstractC9166a.m16730d(zoneOffsetArr[zoneOffsetArr.length - 1].m16735g() + h, 86400L)).m16678l();
        Integer valueOf = Integer.valueOf(l);
        ConcurrentHashMap concurrentHashMap = this.f20255f;
        AbstractC9230a[] aVarArr = (AbstractC9230a[]) concurrentHashMap.get(valueOf);
        AbstractC9230a aVar = null;
        if (aVarArr == null) {
            aVarArr = new AbstractC9230a[bVarArr.length];
            if (bVarArr.length > 0) {
                AbstractC9231b bVar = bVarArr[0];
                throw null;
            } else if (l < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, aVarArr);
            }
        }
        for (int i = 0; i < aVarArr.length; i++) {
            aVar = aVarArr[i];
            if (h < aVar.m16611c()) {
                return aVar.m16612b();
            }
        }
        return aVar.m16613a();
    }

    /* renamed from: b */
    public final boolean m16609b() {
        return this.f20252c.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9232c)) {
            return false;
        }
        C9232c cVar = (C9232c) obj;
        cVar.getClass();
        return AbstractC0518n.m16483k(null, null) && Arrays.equals(this.f20250a, cVar.f20250a) && Arrays.equals(this.f20251b, cVar.f20251b) && Arrays.equals(this.f20252c, cVar.f20252c) && Arrays.equals(this.f20253d, cVar.f20253d) && Arrays.equals(this.f20254e, cVar.f20254e);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f20250a) ^ 0) ^ Arrays.hashCode(this.f20251b)) ^ Arrays.hashCode(this.f20252c)) ^ Arrays.hashCode(this.f20253d)) ^ Arrays.hashCode(this.f20254e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.f20251b;
        sb2.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }
}
