package p301qd;

import com.google.zxing.Result;
import id.C8388a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p066dd.AbstractC6447p;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p137hd.C7996a;
import p285pd.AbstractC11631k;

/* renamed from: qd.e */
/* loaded from: classes3.dex */
public final class C12111e extends AbstractC12107a {

    /* renamed from: i */
    private static final int[] f27168i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f27169j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f27170k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f27171l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f27172m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f27173n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f27174o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C12110d> f27175g = new ArrayList();

    /* renamed from: h */
    private final List<C12110d> f27176h = new ArrayList();

    /* renamed from: q */
    private static void m7813q(Collection<C12110d> collection, C12110d dVar) {
        boolean z;
        if (dVar != null) {
            Iterator<C12110d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C12110d next = it.next();
                if (next.m7820b() == dVar.m7820b()) {
                    next.m7814e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7812r(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301qd.C12111e.m7812r(boolean, int):void");
    }

    /* renamed from: s */
    private static boolean m7811s(C12110d dVar, C12110d dVar2) {
        int a = (dVar.m7821a() + (dVar2.m7821a() * 16)) % 79;
        int c = (dVar.m7815d().m7817c() * 9) + dVar2.m7815d().m7817c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        if (a == c) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private static Result m7810t(C12110d dVar, C12110d dVar2) {
        String valueOf = String.valueOf((dVar.m7820b() * 4537077) + dVar2.m7820b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb2.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb2.append(i3);
        C6446o[] a = dVar.m7815d().m7819a();
        C6446o[] a2 = dVar2.m7815d().m7819a();
        return new Result(sb2.toString(), null, new C6446o[]{a[0], a[1], a2[0], a2[1]}, EnumC6432a.RSS_14);
    }

    /* renamed from: u */
    private C12108b m7809u(C7996a aVar, C12109c cVar, boolean z) {
        int i;
        int[] h = m7830h();
        for (int i2 = 0; i2 < h.length; i2++) {
            h[i2] = 0;
        }
        if (z) {
            AbstractC11631k.m9199f(aVar, cVar.m7818b()[0], h);
        } else {
            AbstractC11631k.m9200e(aVar, cVar.m7818b()[1] + 1, h);
            int i3 = 0;
            for (int length = h.length - 1; i3 < length; length--) {
                int i4 = h[i3];
                h[i3] = h[length];
                h[length] = i4;
                i3++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float d = C8388a.m19875d(h) / i;
        int[] l = m7826l();
        int[] j = m7828j();
        float[] m = m7825m();
        float[] k = m7827k();
        for (int i5 = 0; i5 < h.length; i5++) {
            float f = h[i5] / d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                l[i7] = i6;
                m[i7] = f - i6;
            } else {
                j[i7] = i6;
                k[i7] = f - i6;
            }
        }
        m7812r(z, i);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = l.length - 1; length2 >= 0; length2--) {
            int i10 = l[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = j.length - 1; length3 >= 0; length3--) {
            int i13 = j[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (z) {
            if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
                throw C6441j.m25551a();
            }
            int i15 = (12 - i9) / 2;
            int i16 = f27172m[i15];
            int i17 = 9 - i16;
            return new C12108b((C12112f.m7804b(l, i16, false) * f27168i[i15]) + C12112f.m7804b(j, i17, true) + f27170k[i15], i14);
        } else if ((i12 & 1) != 0 || i12 > 10 || i12 < 4) {
            throw C6441j.m25551a();
        } else {
            int i18 = (10 - i12) / 2;
            int i19 = f27173n[i18];
            return new C12108b((C12112f.m7804b(j, 9 - i19, false) * f27169j[i18]) + C12112f.m7804b(l, i19, true) + f27171l[i18], i14);
        }
    }

    /* renamed from: v */
    private C12110d m7808v(C7996a aVar, boolean z, int i, Map<EnumC6436e, ?> map) {
        int[] w;
        AbstractC6447p pVar;
        try {
            C12109c x = m7806x(aVar, i, z, m7807w(aVar, z));
            if (map == null) {
                pVar = null;
            } else {
                pVar = (AbstractC6447p) map.get(EnumC6436e.NEED_RESULT_POINT_CALLBACK);
            }
            if (pVar != null) {
                float f = (w[0] + w[1]) / 2.0f;
                if (z) {
                    f = (aVar.m20932j() - 1) - f;
                }
                pVar.m25542a(new C6446o(f, i));
            }
            C12108b u = m7809u(aVar, x, true);
            C12108b u2 = m7809u(aVar, x, false);
            return new C12110d((u.m7820b() * 1597) + u2.m7820b(), u.m7821a() + (u2.m7821a() * 4), x);
        } catch (C6441j unused) {
            return null;
        }
    }

    /* renamed from: w */
    private int[] m7807w(C7996a aVar, boolean z) {
        int[] i = m7829i();
        i[0] = 0;
        i[1] = 0;
        i[2] = 0;
        i[3] = 0;
        int j = aVar.m20932j();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < j) {
            z2 = !aVar.m20936d(i2);
            if (z == z2) {
                break;
            }
            i2++;
        }
        int i3 = 0;
        int i4 = i2;
        while (i2 < j) {
            if (aVar.m20936d(i2) != z2) {
                i[i3] = i[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (AbstractC12107a.m7823o(i)) {
                    return new int[]{i4, i2};
                } else {
                    i4 += i[0] + i[1];
                    i[0] = i[2];
                    i[1] = i[3];
                    i[2] = 0;
                    i[3] = 0;
                    i3--;
                }
                i[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: x */
    private C12109c m7806x(C7996a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean d = aVar.m20936d(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && d != aVar.m20936d(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] i6 = m7829i();
        System.arraycopy(i6, 0, i6, 1, i6.length - 1);
        i6[0] = iArr[0] - i5;
        int p = AbstractC12107a.m7822p(i6, f27174o);
        int i7 = iArr[1];
        if (z) {
            i2 = (aVar.m20932j() - 1) - i7;
            i3 = (aVar.m20932j() - 1) - i5;
        } else {
            i2 = i7;
            i3 = i5;
        }
        return new C12109c(p, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        m7813q(this.f27175g, m7808v(aVar, false, i, map));
        aVar.m20929m();
        m7813q(this.f27176h, m7808v(aVar, true, i, map));
        aVar.m20929m();
        for (C12110d dVar : this.f27175g) {
            if (dVar.m7816c() > 1) {
                for (C12110d dVar2 : this.f27176h) {
                    if (dVar2.m7816c() > 1 && m7811s(dVar, dVar2)) {
                        return m7810t(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw C6441j.m25551a();
    }

    @Override // p285pd.AbstractC11631k, p066dd.AbstractC6443l
    public void reset() {
        this.f27175g.clear();
        this.f27176h.clear();
    }
}
