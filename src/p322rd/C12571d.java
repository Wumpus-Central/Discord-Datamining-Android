package p322rd;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.Result;
import id.C8388a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p137hd.C7996a;
import p285pd.AbstractC11631k;
import p301qd.AbstractC12107a;
import p301qd.C12108b;
import p301qd.C12109c;
import p301qd.C12112f;
import sd.AbstractC12871j;

/* renamed from: rd.d */
/* loaded from: classes3.dex */
public final class C12571d extends AbstractC12107a {

    /* renamed from: k */
    private static final int[] f28263k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f28264l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f28265m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f28266n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f28267o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f28268p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C12569b> f28269g = new ArrayList(11);

    /* renamed from: h */
    private final List<C12570c> f28270h = new ArrayList();

    /* renamed from: i */
    private final int[] f28271i = new int[2];

    /* renamed from: j */
    private boolean f28272j;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        continue;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m6522A(java.lang.Iterable<p322rd.C12569b> r7, java.lang.Iterable<p322rd.C12570c> r8) {
        /*
            java.util.Iterator r8 = r8.iterator()
        L_0x0004:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r8.next()
            rd.c r0 = (p322rd.C12570c) r0
            java.util.Iterator r2 = r7.iterator()
        L_0x0015:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r2.next()
            rd.b r3 = (p322rd.C12569b) r3
            java.util.List r5 = r0.m6525a()
            java.util.Iterator r5 = r5.iterator()
        L_0x002a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x003e
            java.lang.Object r6 = r5.next()
            rd.b r6 = (p322rd.C12569b) r6
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x002a
            r3 = r4
            goto L_0x003f
        L_0x003e:
            r3 = r1
        L_0x003f:
            if (r3 != 0) goto L_0x0015
            goto L_0x0043
        L_0x0042:
            r1 = r4
        L_0x0043:
            if (r1 == 0) goto L_0x0004
            return r4
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p322rd.C12571d.m6522A(java.lang.Iterable, java.lang.Iterable):boolean");
    }

    /* renamed from: B */
    private static boolean m6521B(List<C12569b> list) {
        int[][] iArr;
        boolean z;
        for (int[] iArr2 : f28268p) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).m6530b().m7817c() != iArr2[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private C12109c m6520C(C7996a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f28271i[0] - 1;
            while (i5 >= 0 && !aVar.m20936d(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f28271i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f28271i;
            int i7 = iArr2[0];
            int h = aVar.m20933h(iArr2[1] + 1);
            i2 = h;
            i3 = i7;
            i4 = h - this.f28271i[1];
        }
        int[] i8 = m7829i();
        System.arraycopy(i8, 0, i8, 1, i8.length - 1);
        i8[0] = i4;
        try {
            return new C12109c(AbstractC12107a.m7822p(i8, f28266n), new int[]{i3, i2}, i3, i2, i);
        } catch (C6441j unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        continue;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m6519D(java.util.List<p322rd.C12569b> r6, java.util.List<p322rd.C12570c> r7) {
        /*
            java.util.Iterator r7 = r7.iterator()
        L_0x0004:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r7.next()
            rd.c r0 = (p322rd.C12570c) r0
            java.util.List r1 = r0.m6525a()
            int r1 = r1.size()
            int r2 = r6.size()
            if (r1 == r2) goto L_0x0004
            java.util.List r0 = r0.m6525a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r0.next()
            rd.b r1 = (p322rd.C12569b) r1
            java.util.Iterator r3 = r6.iterator()
        L_0x0037:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r3.next()
            rd.b r4 = (p322rd.C12569b) r4
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0037
            goto L_0x004c
        L_0x004b:
            r2 = r5
        L_0x004c:
            if (r2 != 0) goto L_0x0026
            r2 = r5
        L_0x004f:
            if (r2 == 0) goto L_0x0004
            r7.remove()
            goto L_0x0004
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p322rd.C12571d.m6519D(java.util.List, java.util.List):void");
    }

    /* renamed from: F */
    private static void m6517F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: G */
    private void m6516G(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f28270h.size()) {
                break;
            }
            C12570c cVar = this.f28270h.get(i2);
            if (cVar.m6524b() > i) {
                z2 = cVar.m6523c(this.f28269g);
                break;
            } else {
                z3 = cVar.m6523c(this.f28269g);
                i2++;
            }
        }
        if (!z2 && !z3 && !m6522A(this.f28269g, this.f28270h)) {
            this.f28270h.add(i2, new C12570c(this.f28269g, i, z));
            m6519D(this.f28269g, this.f28270h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6514q(int r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p322rd.C12571d.m6514q(int):void");
    }

    /* renamed from: r */
    private boolean m6513r() {
        C12569b bVar = this.f28269g.get(0);
        C12108b c = bVar.m6529c();
        C12108b d = bVar.m6528d();
        if (d == null) {
            return false;
        }
        int a = d.m7821a();
        int i = 2;
        for (int i2 = 1; i2 < this.f28269g.size(); i2++) {
            C12569b bVar2 = this.f28269g.get(i2);
            a += bVar2.m6529c().m7821a();
            i++;
            C12108b d2 = bVar2.m6528d();
            if (d2 != null) {
                a += d2.m7821a();
                i++;
            }
        }
        if (((i - 4) * 211) + (a % 211) == c.m7820b()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private List<C12569b> m6512s(List<C12570c> list, int i) {
        while (i < this.f28270h.size()) {
            C12570c cVar = this.f28270h.get(i);
            this.f28269g.clear();
            for (C12570c cVar2 : list) {
                this.f28269g.addAll(cVar2.m6525a());
            }
            this.f28269g.addAll(cVar.m6525a());
            if (m6521B(this.f28269g)) {
                if (m6513r()) {
                    return this.f28269g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return m6512s(arrayList, i + 1);
                } catch (C6441j unused) {
                    continue;
                }
            }
            i++;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: t */
    private List<C12569b> m6511t(boolean z) {
        List<C12569b> list = null;
        if (this.f28270h.size() > 25) {
            this.f28270h.clear();
            return null;
        }
        this.f28269g.clear();
        if (z) {
            Collections.reverse(this.f28270h);
        }
        try {
            list = m6512s(new ArrayList(), 0);
        } catch (C6441j unused) {
        }
        if (z) {
            Collections.reverse(this.f28270h);
        }
        return list;
    }

    /* renamed from: u */
    static Result m6510u(List<C12569b> list) {
        String d = AbstractC12871j.m5238a(C12568a.m6532a(list)).mo5235d();
        C6446o[] a = list.get(0).m6530b().m7819a();
        C6446o[] a2 = list.get(list.size() - 1).m6530b().m7819a();
        return new Result(d, null, new C6446o[]{a[0], a[1], a2[0], a2[1]}, EnumC6432a.RSS_EXPANDED);
    }

    /* renamed from: x */
    private void m6507x(C7996a aVar, List<C12569b> list, int i) {
        boolean z;
        int[] i2 = m7829i();
        i2[0] = 0;
        i2[1] = 0;
        i2[2] = 0;
        i2[3] = 0;
        int j = aVar.m20932j();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).m6530b().m7818b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f28272j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < j) {
            z2 = !aVar.m20936d(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i3 = 0;
        boolean z3 = z2;
        int i4 = i;
        while (i < j) {
            if (aVar.m20936d(i) != z3) {
                i2[i3] = i2[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z) {
                        m6517F(i2);
                    }
                    if (AbstractC12107a.m7823o(i2)) {
                        int[] iArr = this.f28271i;
                        iArr[0] = i4;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m6517F(i2);
                    }
                    i4 += i2[0] + i2[1];
                    i2[0] = i2[2];
                    i2[1] = i2[3];
                    i2[2] = 0;
                    i2[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                i2[i3] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: y */
    private static int m6506y(C7996a aVar, int i) {
        if (aVar.m20936d(i)) {
            return aVar.m20934f(aVar.m20933h(i));
        }
        return aVar.m20933h(aVar.m20934f(i));
    }

    /* renamed from: z */
    private static boolean m6505z(C12109c cVar, boolean z, boolean z2) {
        return cVar.m7817c() != 0 || !z || !z2;
    }

    /* renamed from: E */
    C12569b m6518E(C7996a aVar, List<C12569b> list, int i) {
        boolean z;
        C12109c C;
        C12108b bVar;
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f28272j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m6507x(aVar, list, i2);
            C = m6520C(aVar, i, z);
            if (C == null) {
                i2 = m6506y(aVar, this.f28271i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C12108b v = m6509v(aVar, C, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).m6526f()) {
            try {
                bVar = m6509v(aVar, C, z, false);
            } catch (C6441j unused) {
                bVar = null;
            }
            return new C12569b(v, bVar, C, true);
        }
        throw C6441j.m25551a();
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        this.f28269g.clear();
        this.f28272j = false;
        try {
            return m6510u(m6508w(i, aVar));
        } catch (C6441j unused) {
            this.f28269g.clear();
            this.f28272j = true;
            return m6510u(m6508w(i, aVar));
        }
    }

    @Override // p285pd.AbstractC11631k, p066dd.AbstractC6443l
    public void reset() {
        this.f28269g.clear();
        this.f28270h.clear();
    }

    /* renamed from: v */
    C12108b m6509v(C7996a aVar, C12109c cVar, boolean z, boolean z2) {
        int i;
        int[] h = m7830h();
        for (int i2 = 0; i2 < h.length; i2++) {
            h[i2] = 0;
        }
        if (z2) {
            AbstractC11631k.m9199f(aVar, cVar.m7818b()[0], h);
        } else {
            AbstractC11631k.m9200e(aVar, cVar.m7818b()[1], h);
            int i3 = 0;
            for (int length = h.length - 1; i3 < length; length--) {
                int i4 = h[i3];
                h[i3] = h[length];
                h[length] = i4;
                i3++;
            }
        }
        float d = C8388a.m19875d(h) / 17.0f;
        float f = (cVar.m7818b()[1] - cVar.m7818b()[0]) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] l = m7826l();
            int[] j = m7828j();
            float[] m = m7825m();
            float[] k = m7827k();
            for (int i5 = 0; i5 < h.length; i5++) {
                float f2 = (h[i5] * 1.0f) / d;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw C6441j.m25551a();
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw C6441j.m25551a();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    l[i7] = i6;
                    m[i7] = f2 - i6;
                } else {
                    j[i7] = i6;
                    k[i7] = f2 - i6;
                }
            }
            m6514q(17);
            int c = cVar.m7817c() * 4;
            if (z) {
                i = 0;
            } else {
                i = 2;
            }
            int i8 = ((c + i) + (!z2 ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = l.length - 1; length2 >= 0; length2--) {
                if (m6505z(cVar, z, z2)) {
                    i9 += l[length2] * f28267o[i8][length2 * 2];
                }
                i10 += l[length2];
            }
            int i11 = 0;
            for (int length3 = j.length - 1; length3 >= 0; length3--) {
                if (m6505z(cVar, z, z2)) {
                    i11 += j[length3] * f28267o[i8][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) != 0 || i10 > 13 || i10 < 4) {
                throw C6441j.m25551a();
            }
            int i13 = (13 - i10) / 2;
            int i14 = f28263k[i13];
            return new C12108b((C12112f.m7804b(l, i14, true) * f28264l[i13]) + C12112f.m7804b(j, 9 - i14, false) + f28265m[i13], i12);
        }
        throw C6441j.m25551a();
    }

    /* renamed from: w */
    List<C12569b> m6508w(int i, C7996a aVar) {
        boolean z = false;
        while (!z) {
            try {
                List<C12569b> list = this.f28269g;
                list.add(m6518E(aVar, list, i));
            } catch (C6441j e) {
                if (!this.f28269g.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (m6513r()) {
            return this.f28269g;
        }
        boolean z2 = !this.f28270h.isEmpty();
        m6516G(i, false);
        if (z2) {
            List<C12569b> t = m6511t(false);
            if (t != null) {
                return t;
            }
            List<C12569b> t2 = m6511t(true);
            if (t2 != null) {
                return t2;
            }
        }
        throw C6441j.m25551a();
    }
}
