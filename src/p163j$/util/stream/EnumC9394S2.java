package p163j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p163j$.util.Map;
import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Init of enum DISTINCT can be incorrect */
/* JADX WARN: Init of enum ORDERED can be incorrect */
/* JADX WARN: Init of enum SHORT_CIRCUIT can be incorrect */
/* JADX WARN: Init of enum SIZED can be incorrect */
/* JADX WARN: Init of enum SORTED can be incorrect */
/* renamed from: j$.util.stream.S2 */
/* loaded from: classes2.dex */
public enum EnumC9394S2 {
    DISTINCT(0, r2),
    SORTED(1, r6),
    ORDERED(2, r8),
    SIZED(3, r11),
    SHORT_CIRCUIT(12, r14);
    

    /* renamed from: f */
    static final int f20564f;

    /* renamed from: g */
    static final int f20565g;

    /* renamed from: h */
    static final int f20566h;

    /* renamed from: i */
    private static final int f20567i;

    /* renamed from: j */
    private static final int f20568j;

    /* renamed from: k */
    private static final int f20569k;

    /* renamed from: l */
    static final int f20570l;

    /* renamed from: m */
    static final int f20571m;

    /* renamed from: n */
    static final int f20572n;

    /* renamed from: o */
    static final int f20573o;

    /* renamed from: p */
    static final int f20574p;

    /* renamed from: q */
    static final int f20575q;

    /* renamed from: r */
    static final int f20576r;

    /* renamed from: s */
    static final int f20577s;

    /* renamed from: t */
    static final int f20578t;

    /* renamed from: u */
    static final int f20579u;

    /* renamed from: a */
    private final Map f20581a;

    /* renamed from: b */
    private final int f20582b;

    /* renamed from: c */
    private final int f20583c;

    /* renamed from: d */
    private final int f20584d;

    /* renamed from: e */
    private final int f20585e;

    static {
        EnumC9390R2 r2 = EnumC9390R2.SPLITERATOR;
        C9387Q2 f = m16437f(r2);
        EnumC9390R2 r22 = EnumC9390R2.STREAM;
        f.m16446a(r22);
        EnumC9390R2 r23 = EnumC9390R2.OP;
        f.f20556a.put(r23, 3);
        C9387Q2 f2 = m16437f(r2);
        f2.m16446a(r22);
        f2.f20556a.put(r23, 3);
        C9387Q2 f3 = m16437f(r2);
        f3.m16446a(r22);
        Map map = f3.f20556a;
        map.put(r23, 3);
        EnumC9390R2 r24 = EnumC9390R2.TERMINAL_OP;
        map.put(r24, 2);
        EnumC9390R2 r25 = EnumC9390R2.UPSTREAM_TERMINAL_OP;
        map.put(r25, 2);
        C9387Q2 f4 = m16437f(r2);
        f4.m16446a(r22);
        f4.f20556a.put(r23, 2);
        m16437f(r23).m16446a(r24);
        f20564f = m16441b(r2);
        f20565g = m16441b(r22);
        f20566h = m16441b(r23);
        m16441b(r24);
        m16441b(r25);
        int i = 0;
        for (EnumC9394S2 s2 : values()) {
            i |= s2.f20585e;
        }
        f20567i = i;
        int i2 = f20565g;
        f20568j = i2;
        int i3 = i2 << 1;
        f20569k = i3;
        f20570l = i2 | i3;
        EnumC9394S2 s22 = DISTINCT;
        f20571m = s22.f20583c;
        f20572n = s22.f20584d;
        EnumC9394S2 s23 = SORTED;
        f20573o = s23.f20583c;
        f20574p = s23.f20584d;
        EnumC9394S2 s24 = ORDERED;
        f20575q = s24.f20583c;
        f20576r = s24.f20584d;
        EnumC9394S2 s25 = SIZED;
        f20577s = s25.f20583c;
        f20578t = s25.f20584d;
        f20579u = SHORT_CIRCUIT.f20583c;
    }

    EnumC9394S2(int i, C9387Q2 q2) {
        EnumC9390R2[] values = EnumC9390R2.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            Map map = q2.f20556a;
            if (i2 < length) {
                Map.EL.putIfAbsent(map, values[i2], 0);
                i2++;
            } else {
                this.f20581a = map;
                int i3 = i * 2;
                this.f20582b = i3;
                this.f20583c = 1 << i3;
                this.f20584d = 2 << i3;
                this.f20585e = 3 << i3;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m16442a(int i, int i2) {
        return i | (i2 & (i == 0 ? f20567i : ~(((f20568j & i) << 1) | i | ((f20569k & i) >> 1))));
    }

    /* renamed from: b */
    private static int m16441b(EnumC9390R2 r2) {
        EnumC9394S2[] values;
        int i = 0;
        for (EnumC9394S2 s2 : values()) {
            i |= ((Integer) s2.f20581a.get(r2)).intValue() << s2.f20582b;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m16440c(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i = characteristics & 4;
        int i2 = f20564f;
        return (i == 0 || spliterator.getComparator() == null) ? characteristics & i2 : characteristics & i2 & (-5);
    }

    /* renamed from: f */
    private static C9387Q2 m16437f(EnumC9390R2 r2) {
        C9387Q2 q2 = new C9387Q2(new EnumMap(EnumC9390R2.class));
        q2.m16446a(r2);
        return q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m16436g(int i) {
        return i & ((~i) >> 1) & f20568j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m16439d(int i) {
        return (i & this.f20585e) == this.f20583c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m16438e(int i) {
        int i2 = this.f20585e;
        return (i & i2) == i2;
    }
}
