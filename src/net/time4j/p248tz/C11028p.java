package net.time4j.p248tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: net.time4j.tz.p */
/* loaded from: classes8.dex */
public final class C11028p implements Comparable<C11028p>, AbstractC11001k, Serializable {

    /* renamed from: n */
    private static final ConcurrentMap<Integer, C11028p> f24509n;
    private static final long serialVersionUID = -1410512619471503090L;

    /* renamed from: u */
    public static final C11028p f24516u;

    /* renamed from: k */
    private final transient int f24517k;

    /* renamed from: l */
    private final transient int f24518l;

    /* renamed from: m */
    private final transient String f24519m;

    /* renamed from: o */
    private static final BigDecimal f24510o = new BigDecimal(60);

    /* renamed from: p */
    private static final BigDecimal f24511p = new BigDecimal(3600);

    /* renamed from: q */
    private static final BigDecimal f24512q = new BigDecimal(-180);

    /* renamed from: r */
    private static final BigDecimal f24513r = new BigDecimal(180);

    /* renamed from: s */
    private static final BigDecimal f24514s = new BigDecimal(240);

    /* renamed from: t */
    private static final BigDecimal f24515t = new BigDecimal(1000000000);

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f24509n = concurrentHashMap;
        C11028p pVar = new C11028p(0, 0);
        f24516u = pVar;
        concurrentHashMap.put(0, pVar);
    }

    private C11028p(int i, int i2) {
        boolean z;
        char c;
        if (i2 == 0) {
            if (i < -64800 || i > 64800) {
                throw new IllegalArgumentException("Total seconds out of range: " + i);
            }
        } else if (Math.abs(i2) > 999999999) {
            throw new IllegalArgumentException("Fraction out of range: " + i2);
        } else if (i < -39600 || i > 39600) {
            throw new IllegalArgumentException("Total seconds out of range while fraction is non-zero: " + i);
        } else if ((i < 0 && i2 > 0) || (i > 0 && i2 < 0)) {
            throw new IllegalArgumentException("Different signs: offset=" + i + ", fraction=" + i2);
        }
        if (i < 0 || i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            c = '-';
        } else {
            c = '+';
        }
        sb2.append(c);
        int abs = Math.abs(i);
        int i3 = abs / 3600;
        int i4 = (abs / 60) % 60;
        int i5 = abs % 60;
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        sb2.append(':');
        if (i4 < 10) {
            sb2.append('0');
        }
        sb2.append(i4);
        if (!(i5 == 0 && i2 == 0)) {
            sb2.append(':');
            if (i5 < 10) {
                sb2.append('0');
            }
            sb2.append(i5);
            if (i2 != 0) {
                sb2.append('.');
                String valueOf = String.valueOf(Math.abs(i2));
                int length = 9 - valueOf.length();
                for (int i6 = 0; i6 < length; i6++) {
                    sb2.append('0');
                }
                sb2.append(valueOf);
            }
        }
        this.f24519m = sb2.toString();
        this.f24517k = i;
        this.f24518l = i2;
    }

    /* renamed from: b */
    public static C11028p m11195b(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(f24513r) > 0 || bigDecimal.compareTo(f24512q) < 0) {
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
        BigDecimal multiply = bigDecimal.multiply(f24514s);
        BigDecimal scale = multiply.setScale(0, RoundingMode.DOWN);
        BigDecimal multiply2 = multiply.subtract(scale).setScale(9, RoundingMode.HALF_UP).multiply(f24515t);
        int intValueExact = scale.intValueExact();
        int intValueExact2 = multiply2.intValueExact();
        if (intValueExact2 == 0) {
            return m11181p(intValueExact);
        }
        if (intValueExact2 == 1000000000) {
            return m11181p(intValueExact + 1);
        }
        if (intValueExact2 == -1000000000) {
            return m11181p(intValueExact - 1);
        }
        return new C11028p(intValueExact, intValueExact2);
    }

    /* renamed from: c */
    public static C11028p m11194c(EnumC10996f fVar, int i, int i2, double d) {
        if (fVar == null) {
            throw new NullPointerException("Missing sign.");
        } else if (i < 0 || i > 180) {
            throw new IllegalArgumentException("Degrees of longitude out of range (0 <= degrees <= 180).");
        } else if (i2 < 0 || i2 > 59) {
            throw new IllegalArgumentException("Arc minute out of range (0 <= arcMinutes <= 59).");
        } else if (Double.compare(d, 0.0d) < 0 || Double.compare(d, 60.0d) >= 0) {
            throw new IllegalArgumentException("Arc second out of range (0.0 <= arcSeconds < 60.0).");
        } else {
            BigDecimal valueOf = BigDecimal.valueOf(i);
            if (i2 != 0) {
                valueOf = valueOf.add(BigDecimal.valueOf(i2).setScale(15, RoundingMode.UNNECESSARY).divide(f24510o, RoundingMode.HALF_UP));
            }
            if (d != 0.0d) {
                valueOf = valueOf.add(BigDecimal.valueOf(d).setScale(15, RoundingMode.FLOOR).divide(f24511p, RoundingMode.HALF_UP));
            }
            if (fVar == EnumC10996f.BEHIND_UTC) {
                valueOf = valueOf.negate();
            }
            return m11195b(valueOf);
        }
    }

    /* renamed from: e */
    private static String m11192e(int i, int i2) {
        return "[hours=" + i + ",minutes=" + i2 + ']';
    }

    /* renamed from: n */
    public static C11028p m11183n(EnumC10996f fVar, int i) {
        return m11182o(fVar, i, 0);
    }

    /* renamed from: o */
    public static C11028p m11182o(EnumC10996f fVar, int i, int i2) {
        if (fVar == null) {
            throw new NullPointerException("Missing sign.");
        } else if (i < 0 || i > 18) {
            throw new IllegalArgumentException("Hour part out of range (0 <= hours <= 18) in: " + m11192e(i, i2));
        } else if (i2 < 0 || i2 > 59) {
            throw new IllegalArgumentException("Minute part out of range (0 <= minutes <= 59) in: " + m11192e(i, i2));
        } else if (i != 18 || i2 == 0) {
            int i3 = (i * 3600) + (i2 * 60);
            if (fVar == EnumC10996f.BEHIND_UTC) {
                i3 = -i3;
            }
            return m11181p(i3);
        } else {
            throw new IllegalArgumentException("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: " + m11192e(i, i2));
        }
    }

    /* renamed from: p */
    public static C11028p m11181p(int i) {
        return m11180q(i, 0);
    }

    /* renamed from: q */
    public static C11028p m11180q(int i, int i2) {
        if (i2 != 0) {
            return new C11028p(i, i2);
        }
        if (i == 0) {
            return f24516u;
        }
        if (i % 900 != 0) {
            return new C11028p(i, 0);
        }
        Integer valueOf = Integer.valueOf(i);
        ConcurrentMap<Integer, C11028p> concurrentMap = f24509n;
        C11028p pVar = concurrentMap.get(valueOf);
        if (pVar != null) {
            return pVar;
        }
        concurrentMap.putIfAbsent(valueOf, new C11028p(i, 0));
        return concurrentMap.get(valueOf);
    }

    /* renamed from: r */
    private static int m11179r(String str, int i, int i2) {
        int min = Math.min(str.length() - i, i2);
        int i3 = -1;
        for (int i4 = 0; i4 < min; i4++) {
            char charAt = str.charAt(i + i4);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3 = i3 == -1 ? charAt - '0' : (i3 * 10) + (charAt - '0');
        }
        return i3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static net.time4j.p248tz.C11028p m11178s(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.p248tz.C11028p.m11178s(java.lang.String, boolean):net.time4j.tz.p");
    }

    private Object writeReplace() {
        return new SPX(this, 15);
    }

    @Override // net.time4j.p248tz.AbstractC11001k
    /* renamed from: a */
    public String mo11196a() {
        if (this.f24517k == 0 && this.f24518l == 0) {
            return "Z";
        }
        return "UTC" + this.f24519m;
    }

    /* renamed from: d */
    public int compareTo(C11028p pVar) {
        int i = this.f24517k;
        int i2 = pVar.f24517k;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.f24518l - pVar.f24518l;
        if (i3 < 0) {
            return -1;
        }
        if (i3 == 0) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11028p)) {
            return false;
        }
        C11028p pVar = (C11028p) obj;
        if (this.f24517k == pVar.f24517k && this.f24518l == pVar.f24518l) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m11191f() {
        return Math.abs(this.f24517k) / 3600;
    }

    /* renamed from: g */
    public int m11190g() {
        return (Math.abs(this.f24517k) / 60) % 60;
    }

    /* renamed from: h */
    public int m11189h() {
        return Math.abs(this.f24517k) % 60;
    }

    public int hashCode() {
        return (~this.f24517k) + (this.f24518l % 64000);
    }

    /* renamed from: i */
    public int m11188i() {
        return this.f24518l;
    }

    /* renamed from: j */
    public int m11187j() {
        return this.f24517k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C11000j m11186k() {
        return C11000j.m11324R(this);
    }

    /* renamed from: l */
    public EnumC10996f m11185l() {
        return (this.f24517k < 0 || this.f24518l < 0) ? EnumC10996f.BEHIND_UTC : EnumC10996f.AHEAD_OF_UTC;
    }

    /* renamed from: m */
    public String m11184m(Locale locale) {
        boolean z;
        if (this.f24517k == 0 && this.f24518l == 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            return AbstractC11002l.f38950D.mo8627e(z, locale);
        } catch (Throwable unused) {
            if (z) {
                return "GMT";
            }
            return "GMT±hh:mm";
        }
    }

    public String toString() {
        return this.f24519m;
    }
}
