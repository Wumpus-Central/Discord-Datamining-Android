package p348t7;

import p119g9.C7570y;
import p228m7.AbstractC10515j;

/* renamed from: t7.n */
/* loaded from: classes7.dex */
final class C12997n {

    /* renamed from: a */
    private static final int[] f29186a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    private static boolean m4779a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f29186a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m4778b(AbstractC10515j jVar) {
        return m4777c(jVar, true, false);
    }

    /* renamed from: c */
    private static boolean m4777c(AbstractC10515j jVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        long length = jVar.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && length <= 4096) {
            j2 = length;
        }
        int i3 = (int) j2;
        C7570y yVar = new C7570y(64);
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        while (i4 < i3) {
            yVar.m22021L(8);
            byte[] d = yVar.m22012d();
            int i5 = z8 ? 1 : 0;
            int i6 = z8 ? 1 : 0;
            int i7 = z8 ? 1 : 0;
            int i8 = z8 ? 1 : 0;
            if (!jVar.mo12937d(d, i5, 8, true)) {
                break;
            }
            long F = yVar.m22027F();
            int n = yVar.m22002n();
            if (F == 1) {
                jVar.mo12930n(yVar.m22012d(), 8, 8);
                yVar.m22018O(16);
                i = 16;
                F = yVar.m21993w();
            } else {
                if (F == 0) {
                    long length2 = jVar.getLength();
                    if (length2 != j) {
                        F = (length2 - jVar.mo7939h()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (F < j3) {
                return z8;
            }
            i4 += i;
            if (n == 1836019574) {
                i3 += (int) F;
                if (i2 != 0 && i3 > length) {
                    i3 = (int) length;
                }
            } else if (n == 1836019558 || n == 1836475768) {
                z4 = z8;
                z3 = true;
                z5 = true;
                break;
            } else if ((i4 + F) - j3 >= i3) {
                z4 = false;
                z3 = true;
                break;
            } else {
                int i9 = (int) (F - j3);
                i4 += i9;
                if (n != 1718909296) {
                    z6 = false;
                    z9 = z9;
                    if (i9 != 0) {
                        jVar.mo12934i(i9);
                        z9 = z9;
                    }
                } else if (i9 < 8) {
                    return false;
                } else {
                    yVar.m22021L(i9);
                    jVar.mo12930n(yVar.m22012d(), 0, i9);
                    int i10 = i9 / 4;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= i10) {
                            z7 = z9;
                            break;
                        }
                        if (i11 == 1) {
                            yVar.m22016Q(4);
                        } else if (m4779a(yVar.m22002n(), z2)) {
                            z7 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z7) {
                        return false;
                    }
                    z6 = false;
                    z9 = z7;
                }
                z8 = z6;
                i2 = i2;
            }
            j = -1;
            z9 = z9;
        }
        boolean z10 = z8 ? 1 : 0;
        boolean z11 = z8 ? 1 : 0;
        boolean z12 = z8 ? 1 : 0;
        boolean z13 = z8 ? 1 : 0;
        z4 = z10;
        z3 = true;
        z5 = z4;
        if (!z9 || z != z5) {
            return z4;
        }
        return z3;
    }

    /* renamed from: d */
    public static boolean m4776d(AbstractC10515j jVar, boolean z) {
        return m4777c(jVar, false, z);
    }
}
