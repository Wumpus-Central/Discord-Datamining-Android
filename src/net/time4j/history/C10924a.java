package net.time4j.history;

import java.util.Arrays;

/* renamed from: net.time4j.history.a */
/* loaded from: classes8.dex */
public final class C10924a {

    /* renamed from: c */
    private static final int[] f24240c;

    /* renamed from: d */
    private static final C10934h f24241d = C10934h.m11540g(EnumC10937j.AD, 8, 1, 1);

    /* renamed from: e */
    private static final C10934h f24242e = C10934h.m11540g(EnumC10937j.BC, 45, 1, 1);

    /* renamed from: f */
    public static final C10924a f24243f;

    /* renamed from: a */
    private final int[] f24244a;

    /* renamed from: b */
    private final AbstractC10925b f24245b;

    /* renamed from: net.time4j.history.a$a */
    /* loaded from: classes8.dex */
    class C0351a implements AbstractC10925b {
        C0351a() {
        }

        /* renamed from: e */
        private int m11603e(int i, int i2) {
            switch (i2) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    if (m11601g(i)) {
                        return 29;
                    }
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    throw new IllegalArgumentException("Invalid month: " + i2);
            }
        }

        /* renamed from: f */
        private int m11602f(C10934h hVar) {
            return hVar.m11544c().m11528a(hVar.m11542e());
        }

        /* renamed from: g */
        private boolean m11601g(int i) {
            return Arrays.binarySearch(C10924a.this.f24244a, i) >= 0;
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: a */
        public long mo11598a(C10934h hVar) {
            long j;
            if (hVar.compareTo(C10924a.f24241d) >= 0) {
                return EnumC10926c.f24248l.mo11598a(hVar);
            }
            if (hVar.compareTo(C10924a.f24242e) >= 0) {
                int f = m11602f(hVar);
                long j2 = -676021;
                for (int i = 7; i >= f; i--) {
                    if (m11601g(i)) {
                        j = 366;
                    } else {
                        j = 365;
                    }
                    j2 -= j;
                }
                for (int i2 = 1; i2 < hVar.m11543d(); i2++) {
                    j2 += m11603e(f, i2);
                }
                return (j2 + hVar.m11545b()) - 1;
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: b */
        public int mo11597b(C10934h hVar) {
            if (hVar.compareTo(C10924a.f24241d) >= 0) {
                return EnumC10926c.f24248l.mo11597b(hVar);
            }
            if (hVar.compareTo(C10924a.f24242e) >= 0) {
                return m11603e(m11602f(hVar), hVar.m11543d());
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: c */
        public C10934h mo11596c(long j) {
            long j2;
            EnumC10937j jVar;
            long j3 = -676021;
            if (j >= -676021) {
                return EnumC10926c.f24248l.mo11596c(j);
            }
            int i = 7;
            while (i >= -44) {
                if (m11601g(i)) {
                    j2 = 366;
                } else {
                    j2 = 365;
                }
                j3 -= j2;
                if (j3 <= j) {
                    int i2 = 1;
                    while (i2 <= 12) {
                        long e = m11603e(i, i2) + j3;
                        if (e > j) {
                            if (i <= 0) {
                                jVar = EnumC10937j.BC;
                            } else {
                                jVar = EnumC10937j.AD;
                            }
                            if (i <= 0) {
                                i = 1 - i;
                            }
                            return C10934h.m11540g(jVar, i, i2, (int) ((j - j3) + 1));
                        }
                        i2++;
                        j3 = e;
                    }
                    continue;
                }
                i--;
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + j);
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: d */
        public boolean mo11595d(C10934h hVar) {
            int f;
            if (hVar == null || (f = m11602f(hVar)) < -44) {
                return false;
            }
            if (f >= 8) {
                return EnumC10926c.f24248l.mo11595d(hVar);
            }
            if (hVar.m11545b() <= m11603e(f, hVar.m11543d())) {
                return true;
            }
            return false;
        }
    }

    static {
        int[] iArr = {42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9};
        f24240c = iArr;
        f24243f = new C10924a(iArr);
    }

    private C10924a(int... iArr) {
        int i;
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= iArr.length) {
                break;
            }
            iArr2[i2] = 1 - iArr[i2];
            i2++;
        }
        Arrays.sort(iArr2);
        this.f24244a = iArr2;
        if (iArr2.length != 0) {
            int i3 = iArr2[0];
            if (i3 < -44 || iArr2[iArr2.length - 1] >= 8) {
                throw new IllegalArgumentException("Out of range: " + Arrays.toString(iArr));
            }
            while (i < iArr.length) {
                int i4 = iArr2[i];
                if (i4 != i3) {
                    i++;
                    i3 = i4;
                } else {
                    throw new IllegalArgumentException("Contains duplicates: " + Arrays.toString(iArr));
                }
            }
            this.f24245b = new C0351a();
            return;
        }
        throw new IllegalArgumentException("Missing leap years.");
    }

    /* renamed from: f */
    public static C10924a m11604f(int... iArr) {
        if (Arrays.equals(iArr, f24240c)) {
            return f24243f;
        }
        return new C10924a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC10925b m11606d() {
        return this.f24245b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m11605e() {
        return this.f24244a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10924a) || this.f24244a != ((C10924a) obj).f24244a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24244a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < this.f24244a.length; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            int i2 = 1 - this.f24244a[i];
            if (i2 > 0) {
                sb2.append("BC ");
                sb2.append(i2);
            } else {
                sb2.append("AD ");
                sb2.append(this.f24244a[i]);
            }
        }
        return sb2.toString();
    }
}
