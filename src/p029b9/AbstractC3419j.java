package p029b9;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;
import p079e7.AbstractC6733t;
import p079e7.C6732s;
import p079e7.C6734u;
import p119g9.C7557q0;
import p119g9.C7562u;
import p153i8.AbstractC8299u;
import p153i8.C8302u0;

/* renamed from: b9.j */
/* loaded from: classes5.dex */
public abstract class AbstractC3419j extends AbstractC3425m {

    /* renamed from: c */
    private C3420a f5539c;

    /* renamed from: b9.j$a */
    /* loaded from: classes5.dex */
    public static final class C3420a {

        /* renamed from: a */
        private final int f5540a;

        /* renamed from: b */
        private final String[] f5541b;

        /* renamed from: c */
        private final int[] f5542c;

        /* renamed from: d */
        private final TrackGroupArray[] f5543d;

        /* renamed from: e */
        private final int[] f5544e;

        /* renamed from: f */
        private final int[][][] f5545f;

        /* renamed from: g */
        private final TrackGroupArray f5546g;

        C3420a(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f5541b = strArr;
            this.f5542c = iArr;
            this.f5543d = trackGroupArrayArr;
            this.f5545f = iArr3;
            this.f5544e = iArr2;
            this.f5546g = trackGroupArray;
            this.f5540a = iArr.length;
        }

        /* renamed from: a */
        public int m34420a(int i, int i2, boolean z) {
            int i3 = this.f5543d[i].m29997a(i2).f18099k;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int f = m34415f(i, i2, i5);
                if (f == 4 || (z && f == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return m34419b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: b */
        public int m34419b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int i4 = 16;
            String str = null;
            boolean z = false;
            int i5 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f5543d[i].m29997a(i2).m19990a(iArr[i3]).f14329v;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !C7557q0.m22159c(str, str2);
                }
                i4 = Math.min(i4, C6732s.m24427c(this.f5545f[i][i2][i3]));
                i3++;
                i5 = i6;
            }
            if (z) {
                return Math.min(i4, this.f5544e[i]);
            }
            return i4;
        }

        /* renamed from: c */
        public int m34418c() {
            return this.f5540a;
        }

        /* renamed from: d */
        public int m34417d(int i) {
            return this.f5542c[i];
        }

        /* renamed from: e */
        public TrackGroupArray m34416e(int i) {
            return this.f5543d[i];
        }

        /* renamed from: f */
        public int m34415f(int i, int i2, int i3) {
            return C6732s.m24426d(this.f5545f[i][i2][i3]);
        }
    }

    /* renamed from: f */
    private static int m34425f(AbstractC6733t[] tVarArr, C8302u0 u0Var, int[] iArr, boolean z) {
        boolean z2;
        int length = tVarArr.length;
        int i = 0;
        boolean z3 = true;
        for (int i2 = 0; i2 < tVarArr.length; i2++) {
            AbstractC6733t tVar = tVarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < u0Var.f18099k; i4++) {
                i3 = Math.max(i3, C6732s.m24426d(tVar.mo166a(u0Var.m19990a(i4))));
            }
            if (iArr[i2] == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 > i || (i3 == i && z && !z3 && z2)) {
                length = i2;
                z3 = z2;
                i = i3;
            }
        }
        return length;
    }

    /* renamed from: h */
    private static int[] m34423h(AbstractC6733t tVar, C8302u0 u0Var) {
        int[] iArr = new int[u0Var.f18099k];
        for (int i = 0; i < u0Var.f18099k; i++) {
            iArr[i] = tVar.mo166a(u0Var.m19990a(i));
        }
        return iArr;
    }

    /* renamed from: i */
    private static int[] m34422i(AbstractC6733t[] tVarArr) {
        int length = tVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = tVarArr[i].mo1030q();
        }
        return iArr;
    }

    @Override // p029b9.AbstractC3425m
    /* renamed from: d */
    public final void mo34401d(Object obj) {
        this.f5539c = (C3420a) obj;
    }

    @Override // p029b9.AbstractC3425m
    /* renamed from: e */
    public final C3427n mo34400e(AbstractC6733t[] tVarArr, TrackGroupArray trackGroupArray, AbstractC8299u.C8300a aVar, Timeline timeline) {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[tVarArr.length + 1];
        int length = tVarArr.length + 1;
        C8302u0[][] u0VarArr = new C8302u0[length];
        int[][][] iArr3 = new int[tVarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroupArray.f9362k;
            u0VarArr[i] = new C8302u0[i2];
            iArr3[i] = new int[i2];
        }
        int[] i3 = m34422i(tVarArr);
        for (int i4 = 0; i4 < trackGroupArray.f9362k; i4++) {
            C8302u0 a = trackGroupArray.m29997a(i4);
            if (C7562u.m22076l(a.m19990a(0).f14329v) == 5) {
                z = true;
            } else {
                z = false;
            }
            int f = m34425f(tVarArr, a, iArr2, z);
            if (f == tVarArr.length) {
                iArr = new int[a.f18099k];
            } else {
                iArr = m34423h(tVarArr[f], a);
            }
            int i5 = iArr2[f];
            u0VarArr[f][i5] = a;
            iArr3[f][i5] = iArr;
            iArr2[f] = i5 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[tVarArr.length];
        String[] strArr = new String[tVarArr.length];
        int[] iArr4 = new int[tVarArr.length];
        for (int i6 = 0; i6 < tVarArr.length; i6++) {
            int i7 = iArr2[i6];
            trackGroupArrayArr[i6] = new TrackGroupArray((C8302u0[]) C7557q0.m22212B0(u0VarArr[i6], i7));
            iArr3[i6] = (int[][]) C7557q0.m22212B0(iArr3[i6], i7);
            strArr[i6] = tVarArr[i6].getName();
            iArr4[i6] = tVarArr[i6].mo24424d();
        }
        C3420a aVar2 = new C3420a(strArr, iArr4, trackGroupArrayArr, i3, iArr3, new TrackGroupArray((C8302u0[]) C7557q0.m22212B0(u0VarArr[tVarArr.length], iArr2[tVarArr.length])));
        Pair<C6734u[], AbstractC3415h[]> j = mo34421j(aVar2, iArr3, i3, aVar, timeline);
        return new C3427n((C6734u[]) j.first, (AbstractC3415h[]) j.second, aVar2);
    }

    /* renamed from: g */
    public final C3420a m34424g() {
        return this.f5539c;
    }

    /* renamed from: j */
    protected abstract Pair<C6734u[], AbstractC3415h[]> mo34421j(C3420a aVar, int[][][] iArr, int[] iArr2, AbstractC8299u.C8300a aVar2, Timeline timeline);
}
