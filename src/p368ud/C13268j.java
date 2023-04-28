package p368ud;

import id.C8388a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p066dd.C6435d;
import p066dd.C6437f;
import p066dd.C6441j;
import p066dd.C6446o;
import p137hd.C7997b;
import p137hd.C8000e;
import p386vd.C13490a;
import td.C13054a;

/* renamed from: ud.j */
/* loaded from: classes3.dex */
public final class C13268j {

    /* renamed from: a */
    private static final C13490a f29789a = new C13490a();

    /* renamed from: a */
    private static C13259c m4134a(C13266h hVar) {
        int[] j;
        if (hVar == null || (j = hVar.m4143j()) == null) {
            return null;
        }
        int p = m4119p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C13260d[] d = hVar.m4149d();
        for (int i4 = 0; i2 > 0 && d[i4] == null; i4++) {
            i2--;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            int i5 = j[length];
            i += p - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = d.length - 1; i > 0 && d[length2] == null; length2--) {
            i--;
        }
        return hVar.m4152a().m4196a(i2, i, hVar.m4142k());
    }

    /* renamed from: b */
    private static void m4133b(C13264f fVar, C13258b[][] bVarArr) {
        C13258b bVar = bVarArr[0][1];
        int[] a = bVar.m4198a();
        int j = (fVar.m4160j() * fVar.m4158l()) - m4117r(fVar.m4159k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw C6441j.m25551a();
            }
            bVar.m4197b(j);
        } else if (a[0] != j) {
            bVar.m4197b(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m4132c(p137hd.C7997b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L_0x0004
            r0 = -1
            goto L_0x0005
        L_0x0004:
            r0 = 1
        L_0x0005:
            r1 = 0
            r2 = r9
        L_0x0007:
            r3 = 2
            if (r1 >= r3) goto L_0x0028
        L_0x000a:
            if (r8 == 0) goto L_0x000f
            if (r2 < r6) goto L_0x0022
            goto L_0x0011
        L_0x000f:
            if (r2 >= r7) goto L_0x0022
        L_0x0011:
            boolean r4 = r5.m20923e(r2, r10)
            if (r8 != r4) goto L_0x0022
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L_0x0020
            return r9
        L_0x0020:
            int r2 = r2 + r0
            goto L_0x000a
        L_0x0022:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p368ud.C13268j.m4132c(hd.b, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    private static boolean m4131d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m4130e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f29789a.m3598a(iArr, i, iArr2);
        }
        throw C6435d.m25562a();
    }

    /* renamed from: f */
    private static C13258b[][] m4129f(C13264f fVar) {
        C13265g[] o;
        C13260d[] d;
        int c;
        C13258b[][] bVarArr = (C13258b[][]) Array.newInstance(C13258b.class, fVar.m4158l(), fVar.m4160j() + 2);
        for (C13258b[] bVarArr2 : bVarArr) {
            int i = 0;
            while (true) {
                if (i < bVarArr2.length) {
                    bVarArr2[i] = new C13258b();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (C13265g gVar : fVar.m4155o()) {
            if (gVar != null) {
                for (C13260d dVar : gVar.m4149d()) {
                    if (dVar != null && (c = dVar.m4184c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i2].m4197b(dVar.m4182e());
                    }
                }
            }
            i2++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C8000e m4128g(C13264f fVar) {
        C13258b[][] f = m4129f(fVar);
        m4133b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.m4158l() * fVar.m4160j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.m4158l(); i++) {
            int i2 = 0;
            while (i2 < fVar.m4160j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].m4198a();
                int j = (fVar.m4160j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m4127h(fVar.m4159k(), iArr, C13054a.m4697b(arrayList), C13054a.m4697b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C8000e m4127h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m4125j(iArr, i, iArr2);
                } catch (C6435d unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw C6435d.m25562a();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C6435d.m25562a();
                    }
                }
            } else {
                throw C6435d.m25562a();
            }
        }
    }

    /* renamed from: i */
    public static C8000e m4126i(C7997b bVar, C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4, int i, int i2) {
        boolean z;
        int i3;
        C13265g gVar;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        C13266h hVar = null;
        C13266h hVar2 = null;
        C13264f fVar = null;
        C13259c cVar = new C13259c(bVar, oVar, oVar2, oVar3, oVar4);
        for (int i8 = 0; i8 < 2; i8++) {
            if (oVar != null) {
                hVar = m4116s(bVar, cVar, oVar, true, i, i2);
            }
            if (oVar3 != null) {
                hVar2 = m4116s(bVar, cVar, oVar3, false, i, i2);
            }
            fVar = m4113v(hVar, hVar2);
            if (fVar == null) {
                throw C6441j.m25551a();
            } else if (i8 != 0 || fVar.m4157m() == null || (fVar.m4157m().m4190g() >= cVar.m4190g() && fVar.m4157m().m4192e() <= cVar.m4192e())) {
                fVar.m4154p(cVar);
                break;
            } else {
                cVar = fVar.m4157m();
            }
        }
        int j = fVar.m4160j() + 1;
        fVar.m4153q(0, hVar);
        fVar.m4153q(j, hVar2);
        if (hVar != null) {
            z = true;
        } else {
            z = false;
        }
        int i9 = i;
        int i10 = i2;
        for (int i11 = 1; i11 <= j; i11++) {
            if (z) {
                i3 = i11;
            } else {
                i3 = j - i11;
            }
            if (fVar.m4156n(i3) == null) {
                if (i3 == 0 || i3 == j) {
                    if (i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    gVar = new C13266h(cVar, z2);
                } else {
                    gVar = new C13265g(cVar);
                }
                fVar.m4153q(i3, gVar);
                int i12 = -1;
                int g = cVar.m4190g();
                int i13 = -1;
                while (g <= cVar.m4192e()) {
                    int t = m4115t(fVar, i3, g, z);
                    if (t >= 0 && t <= cVar.m4193d()) {
                        i7 = t;
                    } else if (i13 != i12) {
                        i7 = i13;
                    } else {
                        i6 = i13;
                        i5 = g;
                        i4 = i12;
                        i13 = i6;
                        g = i5 + 1;
                        i12 = i4;
                    }
                    i6 = i13;
                    i4 = i12;
                    C13260d k = m4124k(bVar, cVar.m4191f(), cVar.m4193d(), z, i7, g, i9, i10);
                    i5 = g;
                    if (k != null) {
                        gVar.m4147f(i5, k);
                        i9 = Math.min(i9, k.m4181f());
                        i10 = Math.max(i10, k.m4181f());
                        i13 = i7;
                        g = i5 + 1;
                        i12 = i4;
                    }
                    i13 = i6;
                    g = i5 + 1;
                    i12 = i4;
                }
            }
        }
        return m4128g(fVar);
    }

    /* renamed from: j */
    private static C8000e m4125j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m4130e(iArr, iArr2, i2);
            m4112w(iArr, i2);
            C8000e b = C13261e.m4175b(iArr, String.valueOf(i));
            b.m20896k(Integer.valueOf(e));
            b.m20897j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw C6437f.m25561a();
    }

    /* renamed from: k */
    private static C13260d m4124k(C7997b bVar, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int d;
        int a;
        int c = m4132c(bVar, i, i2, z, i3, i4);
        int[] q = m4118q(bVar, i, i2, z, c, i4);
        if (q == null) {
            return null;
        }
        int d2 = C8388a.m19875d(q);
        if (z) {
            i7 = c + d2;
        } else {
            for (int i8 = 0; i8 < q.length / 2; i8++) {
                int i9 = q[i8];
                q[i8] = q[(q.length - 1) - i8];
                q[(q.length - 1) - i8] = i9;
            }
            c -= d2;
            i7 = c;
        }
        if (m4131d(d2, i5, i6) && (a = C13054a.m4698a((d = C13267i.m4136d(q)))) != -1) {
            return new C13260d(c, i7, m4121n(d), a);
        }
        return null;
    }

    /* renamed from: l */
    private static C13257a m4123l(C13266h hVar, C13266h hVar2) {
        C13257a i;
        C13257a i2;
        if (hVar == null || (i = hVar.m4144i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.m4144i();
        } else if (hVar2 == null || (i2 = hVar2.m4144i()) == null || i.m4203a() == i2.m4203a() || i.m4202b() == i2.m4202b() || i.m4201c() == i2.m4201c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m4122m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m4121n(int i) {
        return m4120o(m4122m(i));
    }

    /* renamed from: o */
    private static int m4120o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m4119p(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0027 A[EDGE_INSN: B:24:0x0027->B:15:0x0027 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] m4118q(p137hd.C7997b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L_0x0009
            r3 = r2
            goto L_0x000a
        L_0x0009:
            r3 = -1
        L_0x000a:
            r4 = 0
            r5 = r10
        L_0x000c:
            if (r10 == 0) goto L_0x0011
            if (r11 >= r9) goto L_0x0027
            goto L_0x0013
        L_0x0011:
            if (r11 < r8) goto L_0x0027
        L_0x0013:
            if (r4 >= r0) goto L_0x0027
            boolean r6 = r7.m20923e(r11, r12)
            if (r6 != r5) goto L_0x0022
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto L_0x000c
        L_0x0022:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto L_0x000c
        L_0x0027:
            if (r4 == r0) goto L_0x0034
            if (r10 == 0) goto L_0x002c
            r8 = r9
        L_0x002c:
            if (r11 != r8) goto L_0x0032
            r7 = 7
            if (r4 != r7) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r7 = 0
            return r7
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p368ud.C13268j.m4118q(hd.b, int, int, boolean, int, int):int[]");
    }

    /* renamed from: r */
    private static int m4117r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C13266h m4116s(C7997b bVar, C13259c cVar, C6446o oVar, boolean z, int i, int i2) {
        int i3;
        int i4;
        C13266h hVar = new C13266h(cVar, z);
        for (int i5 = 0; i5 < 2; i5++) {
            if (i5 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int c = (int) oVar.m25545c();
            for (int d = (int) oVar.m25544d(); d <= cVar.m4192e() && d >= cVar.m4190g(); d += i3) {
                C13260d k = m4124k(bVar, 0, bVar.m20917m(), z, c, d, i, i2);
                if (k != null) {
                    hVar.m4147f(d, k);
                    if (z) {
                        i4 = k.m4183d();
                    } else {
                        i4 = k.m4185b();
                    }
                    c = i4;
                }
            }
        }
        return hVar;
    }

    /* renamed from: t */
    private static int m4115t(C13264f fVar, int i, int i2, boolean z) {
        int i3;
        C13260d dVar;
        C13260d[] d;
        int i4;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i5 = i - i3;
        if (m4114u(fVar, i5)) {
            dVar = fVar.m4156n(i5).m4151b(i2);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            C13260d c = fVar.m4156n(i).m4150c(i2);
            if (c == null) {
                if (m4114u(fVar, i5)) {
                    c = fVar.m4156n(i5).m4150c(i2);
                }
                if (c == null) {
                    int i6 = 0;
                    while (true) {
                        i -= i3;
                        if (m4114u(fVar, i)) {
                            for (C13260d dVar2 : fVar.m4156n(i).m4149d()) {
                                if (dVar2 != null) {
                                    if (z) {
                                        i4 = dVar2.m4185b();
                                    } else {
                                        i4 = dVar2.m4183d();
                                    }
                                    return i4 + (i3 * i6 * (dVar2.m4185b() - dVar2.m4183d()));
                                }
                            }
                            i6++;
                        } else {
                            C13259c m = fVar.m4157m();
                            if (z) {
                                return m.m4191f();
                            }
                            return m.m4193d();
                        }
                    }
                } else if (z) {
                    return c.m4185b();
                } else {
                    return c.m4183d();
                }
            } else if (z) {
                return c.m4183d();
            } else {
                return c.m4185b();
            }
        } else if (z) {
            return dVar.m4185b();
        } else {
            return dVar.m4183d();
        }
    }

    /* renamed from: u */
    private static boolean m4114u(C13264f fVar, int i) {
        return i >= 0 && i <= fVar.m4160j() + 1;
    }

    /* renamed from: v */
    private static C13264f m4113v(C13266h hVar, C13266h hVar2) {
        C13257a l;
        if ((hVar == null && hVar2 == null) || (l = m4123l(hVar, hVar2)) == null) {
            return null;
        }
        return new C13264f(l, C13259c.m4187j(m4134a(hVar), m4134a(hVar2)));
    }

    /* renamed from: w */
    private static void m4112w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C6437f.m25561a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C6437f.m25561a();
            }
        } else {
            throw C6437f.m25561a();
        }
    }
}
