package si;

import bg.C3491c;
import eg.C6880g;
import eg.C6884j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002\u001a\u001a\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001a\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019\u001a\"\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001a\u0010 \u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019\u001a\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m15073d2 = {"", "Lsi/d;", "unit", "Lsi/a;", "s", "(ILsi/d;)J", "", "t", "(JLsi/d;)J", "", "r", "(DLsi/d;)J", "", "value", "", "strictIso", "p", "(Ljava/lang/String;Z)J", "q", "nanos", "o", "millis", "n", "normalNanos", "l", "(J)J", "normalMillis", "j", "normalValue", "unitDiscriminator", "i", "(JI)J", "m", "k", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: si.c */
/* loaded from: classes8.dex */
public final class C12907c {
    /* renamed from: i */
    public static final long m5100i(long j, int i) {
        return C12905a.m5130h((j << 1) + i);
    }

    /* renamed from: j */
    public static final long m5099j(long j) {
        return C12905a.m5130h((j << 1) + 1);
    }

    /* renamed from: k */
    public static final long m5098k(long j) {
        long k;
        if (new C6880g(-4611686018426L, 4611686018426L).m23981j(j)) {
            return m5097l(m5095n(j));
        }
        k = C6884j.m23953k(j, -4611686018427387903L, 4611686018427387903L);
        return m5099j(k);
    }

    /* renamed from: l */
    public static final long m5097l(long j) {
        return C12905a.m5130h(j << 1);
    }

    /* renamed from: m */
    public static final long m5096m(long j) {
        if (new C6880g(-4611686018426999999L, 4611686018426999999L).m23981j(j)) {
            return m5097l(j);
        }
        return m5099j(m5094o(j));
    }

    /* renamed from: n */
    public static final long m5095n(long j) {
        return j * 1000000;
    }

    /* renamed from: o */
    public static final long m5094o(long j) {
        return j / 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00a6 A[EDGE_INSN: B:165:0x00a6->B:47:0x00a6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[LOOP:1: B:35:0x006c->B:45:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ae  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long m5093p(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: si.C12907c.m5093p(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final long m5092q(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L_0x0018
            java.lang.String r5 = "+-"
            char r6 = r9.charAt(r4)
            boolean r5 = p326ri.C12707l.m5809L(r5, r6, r4, r2, r1)
            if (r5 == 0) goto L_0x0018
            r5 = r3
            goto L_0x0019
        L_0x0018:
            r5 = r4
        L_0x0019:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L_0x006e
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r6 = p326ri.C12707l.m5800T(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0036
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0036
        L_0x0034:
            r0 = r3
            goto L_0x005b
        L_0x0036:
            java.util.Iterator r0 = r0.iterator()
        L_0x003a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0034
            r5 = r0
            of.p r5 = (p267of.AbstractC11283p) r5
            int r5 = r5.nextInt()
            eg.c r6 = new eg.c
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.m23988g(r5)
            if (r5 != 0) goto L_0x003a
            r0 = r4
        L_0x005b:
            if (r0 == 0) goto L_0x006e
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L_0x0068
            r0 = -9223372036854775808
            goto L_0x006d
        L_0x0068:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x006d:
            return r0
        L_0x006e:
            java.lang.String r0 = "+"
            boolean r0 = p326ri.C12707l.m5813H(r9, r0, r4, r2, r1)
            if (r0 == 0) goto L_0x007a
            java.lang.String r9 = p326ri.C12707l.m5796W0(r9, r3)
        L_0x007a:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.C12907c.m5092q(java.lang.String):long");
    }

    /* renamed from: r */
    public static final long m5091r(double d, EnumC12908d unit) {
        long b;
        long b2;
        C9971q.m14633g(unit, "unit");
        double a = C12909e.m5086a(d, unit, EnumC12908d.NANOSECONDS);
        if (!Double.isNaN(a)) {
            b = C3491c.m34304b(a);
            if (new C6880g(-4611686018426999999L, 4611686018426999999L).m23981j(b)) {
                return m5097l(b);
            }
            b2 = C3491c.m34304b(C12909e.m5086a(d, unit, EnumC12908d.MILLISECONDS));
            return m5098k(b2);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    /* renamed from: s */
    public static final long m5090s(int i, EnumC12908d unit) {
        C9971q.m14633g(unit, "unit");
        if (unit.compareTo(EnumC12908d.SECONDS) <= 0) {
            return m5097l(C12909e.m5084c(i, unit, EnumC12908d.NANOSECONDS));
        }
        return m5089t(i, unit);
    }

    /* renamed from: t */
    public static final long m5089t(long j, EnumC12908d unit) {
        long k;
        C9971q.m14633g(unit, "unit");
        EnumC12908d dVar = EnumC12908d.NANOSECONDS;
        long c = C12909e.m5084c(4611686018426999999L, dVar, unit);
        if (new C6880g(-c, c).m23981j(j)) {
            return m5097l(C12909e.m5084c(j, unit, dVar));
        }
        k = C6884j.m23953k(C12909e.m5085b(j, unit, EnumC12908d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L);
        return m5099j(k);
    }
}
