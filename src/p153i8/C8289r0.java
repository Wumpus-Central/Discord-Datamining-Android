package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import p119g9.C7510a;

/* renamed from: i8.r0 */
/* loaded from: classes7.dex */
public final class C8289r0 extends Timeline {

    /* renamed from: n */
    private static final Object f18045n = new Object();

    /* renamed from: o */
    private static final MediaItem f18046o = new MediaItem.C5147c().m30548d("SinglePeriodTimeline").m30543i(Uri.EMPTY).m30551a();

    /* renamed from: b */
    private final long f18047b;

    /* renamed from: c */
    private final long f18048c;

    /* renamed from: d */
    private final long f18049d;

    /* renamed from: e */
    private final long f18050e;

    /* renamed from: f */
    private final long f18051f;

    /* renamed from: g */
    private final long f18052g;

    /* renamed from: h */
    private final long f18053h;

    /* renamed from: i */
    private final boolean f18054i;

    /* renamed from: j */
    private final boolean f18055j;

    /* renamed from: k */
    private final Object f18056k;

    /* renamed from: l */
    private final MediaItem f18057l;

    /* renamed from: m */
    private final MediaItem.C5150f f18058m;

    public C8289r0(long j, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: b */
    public int mo20027b(Object obj) {
        return f18045n.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: g */
    public Timeline.C5160b mo20026g(int i, Timeline.C5160b bVar, boolean z) {
        Object obj;
        C7510a.m22369c(i, 0, 1);
        if (z) {
            obj = f18045n;
        } else {
            obj = null;
        }
        return bVar.m30420n(null, obj, 0, this.f18050e, -this.f18052g);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public int mo20025i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: m */
    public Object mo20024m(int i) {
        C7510a.m22369c(i, 0, 1);
        return f18045n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 > r3) goto L_0x0020;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.Timeline.C5161c mo20023o(int r25, com.google.android.exoplayer2.Timeline.C5161c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p119g9.C7510a.m22369c(r3, r1, r2)
            long r1 = r0.f18053h
            boolean r14 = r0.f18055j
            if (r14 == 0) goto L_0x002a
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002a
            long r3 = r0.f18051f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
        L_0x0020:
            r16 = r5
            goto L_0x002c
        L_0x0023:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            goto L_0x0020
        L_0x002a:
            r16 = r1
        L_0x002c:
            java.lang.Object r4 = com.google.android.exoplayer2.Timeline.C5161c.f9088r
            com.google.android.exoplayer2.MediaItem r5 = r0.f18057l
            java.lang.Object r6 = r0.f18056k
            long r7 = r0.f18047b
            long r9 = r0.f18048c
            long r11 = r0.f18049d
            boolean r13 = r0.f18054i
            com.google.android.exoplayer2.MediaItem$f r15 = r0.f18058m
            long r1 = r0.f18051f
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f18052g
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.Timeline$c r1 = r3.m30412g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p153i8.C8289r0.mo20023o(int, com.google.android.exoplayer2.Timeline$c, long):com.google.android.exoplayer2.Timeline$c");
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: p */
    public int mo20022p() {
        return 1;
    }

    public C8289r0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj, mediaItem, z3 ? mediaItem.f8964c : null);
    }

    public C8289r0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, MediaItem mediaItem, MediaItem.C5150f fVar) {
        this.f18047b = j;
        this.f18048c = j2;
        this.f18049d = j3;
        this.f18050e = j4;
        this.f18051f = j5;
        this.f18052g = j6;
        this.f18053h = j7;
        this.f18054i = z;
        this.f18055j = z2;
        this.f18056k = obj;
        this.f18057l = (MediaItem) C7510a.m22367e(mediaItem);
        this.f18058m = fVar;
    }
}
