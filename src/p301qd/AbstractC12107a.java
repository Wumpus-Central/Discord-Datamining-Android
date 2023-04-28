package p301qd;

import com.facebook.react.uimanager.ViewDefaults;
import p066dd.C6441j;
import p285pd.AbstractC11631k;

/* renamed from: qd.a */
/* loaded from: classes3.dex */
public abstract class AbstractC12107a extends AbstractC11631k {

    /* renamed from: b */
    private final int[] f27156b;

    /* renamed from: e */
    private final int[] f27159e;

    /* renamed from: f */
    private final int[] f27160f;

    /* renamed from: a */
    private final int[] f27155a = new int[4];

    /* renamed from: c */
    private final float[] f27157c = new float[4];

    /* renamed from: d */
    private final float[] f27158d = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12107a() {
        int[] iArr = new int[8];
        this.f27156b = iArr;
        this.f27159e = new int[iArr.length / 2];
        this.f27160f = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static void m7831g(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static void m7824n(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static boolean m7823o(int[] iArr) {
        int i;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = ViewDefaults.NUMBER_OF_LINES;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public static int m7822p(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (AbstractC11631k.m9201d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C6441j.m25551a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final int[] m7830h() {
        return this.f27156b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final int[] m7829i() {
        return this.f27155a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] m7828j() {
        return this.f27160f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final float[] m7827k() {
        return this.f27158d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] m7826l() {
        return this.f27159e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] m7825m() {
        return this.f27157c;
    }
}
