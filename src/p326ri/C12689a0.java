package p326ri;

/* renamed from: ri.a0 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C12689a0 {
    /* renamed from: a */
    public static /* synthetic */ long m5871a(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
            i = 0;
        }
        return j3 + i;
    }
}
