package p163j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* renamed from: j$.time.d */
/* loaded from: classes2.dex */
public final class C9177d implements Comparable, Serializable {

    /* renamed from: c */
    public static final C9177d f20142c = new C9177d(0, 0);

    /* renamed from: a */
    private final long f20143a;

    /* renamed from: b */
    private final int f20144b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private C9177d(long j, int i) {
        this.f20143a = j;
        this.f20144b = i;
    }

    /* renamed from: a */
    private static C9177d m16726a(long j, int i) {
        return (((long) i) | j) == 0 ? f20142c : new C9177d(j, i);
    }

    /* renamed from: b */
    public static C9177d m16725b(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return m16726a(j2, i);
    }

    /* renamed from: c */
    public static C9177d m16724c() {
        return m16726a(AbstractC9166a.m16732b(Long.MAX_VALUE, AbstractC9166a.m16730d(999999999L, 1000000000L)), (int) AbstractC9166a.m16731c(999999999L, 1000000000L));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9177d dVar = (C9177d) obj;
        int compare = Long.compare(this.f20143a, dVar.f20143a);
        return compare != 0 ? compare : this.f20144b - dVar.f20144b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9177d)) {
            return false;
        }
        C9177d dVar = (C9177d) obj;
        return this.f20143a == dVar.f20143a && this.f20144b == dVar.f20144b;
    }

    public final int hashCode() {
        long j = this.f20143a;
        return (this.f20144b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f20142c) {
            return "PT0S";
        }
        long j = this.f20143a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j2 != 0) {
            sb2.append(j2);
            sb2.append('H');
        }
        if (i != 0) {
            sb2.append(i);
            sb2.append('M');
        }
        int i3 = this.f20144b;
        if (i2 == 0 && i3 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i2 >= 0 || i3 <= 0) {
            sb2.append(i2);
        } else if (i2 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i2 + 1);
        }
        if (i3 > 0) {
            int length = sb2.length();
            sb2.append(i2 < 0 ? 2000000000 - i3 : i3 + 1000000000);
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
