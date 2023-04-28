package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import p394w3.C13740j;

/* renamed from: com.facebook.drawee.drawable.e */
/* loaded from: classes7.dex */
public class C4814e extends C4810a {

    /* renamed from: A */
    int[] f37141A;

    /* renamed from: B */
    int f37142B;

    /* renamed from: C */
    boolean[] f37143C;

    /* renamed from: D */
    int f37144D;

    /* renamed from: E */
    private AbstractC4815a f37145E;

    /* renamed from: F */
    private boolean f37146F;

    /* renamed from: G */
    private boolean f37147G;

    /* renamed from: H */
    private boolean f37148H = true;

    /* renamed from: s */
    private final Drawable[] f7739s;

    /* renamed from: t */
    private final boolean f7740t;

    /* renamed from: u */
    private final int f7741u;

    /* renamed from: v */
    private final int f7742v;

    /* renamed from: w */
    int f7743w;

    /* renamed from: x */
    int f7744x;

    /* renamed from: y */
    long f7745y;

    /* renamed from: z */
    int[] f7746z;

    /* renamed from: com.facebook.drawee.drawable.e$a */
    /* loaded from: classes7.dex */
    public interface AbstractC4815a {
        /* renamed from: a */
        void m31816a();

        /* renamed from: b */
        void m31815b();

        /* renamed from: c */
        void m31814c();
    }

    public C4814e(Drawable[] drawableArr, boolean z, int i) {
        super(drawableArr);
        boolean z2 = true;
        int i2 = 0;
        C13740j.m2831j(drawableArr.length < 1 ? false : z2, "At least one layer required!");
        this.f7739s = drawableArr;
        this.f7746z = new int[drawableArr.length];
        this.f37141A = new int[drawableArr.length];
        this.f37142B = 255;
        this.f37143C = new boolean[drawableArr.length];
        this.f37144D = 0;
        this.f7740t = z;
        this.f7741u = z ? 255 : i2;
        this.f7742v = i;
        m31819q();
    }

    /* renamed from: g */
    private void m31829g(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.f37144D++;
            if (this.f37148H) {
                drawable.mutate();
            }
            drawable.setAlpha(i);
            this.f37144D--;
            drawable.draw(canvas);
        }
    }

    /* renamed from: n */
    private void m31822n() {
        if (this.f37146F) {
            this.f37146F = false;
            AbstractC4815a aVar = this.f37145E;
            if (aVar != null) {
                aVar.m31814c();
            }
        }
    }

    /* renamed from: o */
    private void m31821o() {
        int i;
        if (!this.f37146F && (i = this.f7742v) >= 0) {
            boolean[] zArr = this.f37143C;
            if (i < zArr.length && zArr[i]) {
                this.f37146F = true;
                AbstractC4815a aVar = this.f37145E;
                if (aVar != null) {
                    aVar.m31816a();
                }
            }
        }
    }

    /* renamed from: p */
    private void m31820p() {
        if (this.f37147G && this.f7743w == 2 && this.f37143C[this.f7742v]) {
            AbstractC4815a aVar = this.f37145E;
            if (aVar != null) {
                aVar.m31815b();
            }
            this.f37147G = false;
        }
    }

    /* renamed from: q */
    private void m31819q() {
        this.f7743w = 2;
        Arrays.fill(this.f7746z, this.f7741u);
        this.f7746z[0] = 255;
        Arrays.fill(this.f37141A, this.f7741u);
        this.f37141A[0] = 255;
        Arrays.fill(this.f37143C, this.f7740t);
        this.f37143C[0] = true;
    }

    /* renamed from: s */
    private boolean m31817s(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.f7739s.length; i2++) {
            boolean z2 = this.f37143C[i2];
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            int[] iArr = this.f37141A;
            int i3 = (int) (this.f7746z[i2] + (i * 255 * f));
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (z2 && iArr[i2] < 255) {
                z = false;
            }
            if (!z2 && iArr[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[LOOP:0: B:22:0x0051->B:24:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[EDGE_INSN: B:29:0x0071->B:25:0x0071 ?: BREAK  , SYNTHETIC] */
    @Override // com.facebook.drawee.drawable.C4810a, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f7743w
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r3) goto L_0x000a
            goto L_0x0051
        L_0x000a:
            int r0 = r8.f7744x
            if (r0 <= 0) goto L_0x0010
            r0 = r3
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            p394w3.C13740j.m2832i(r0)
            long r4 = r8.m31823m()
            long r6 = r8.f7745y
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f7744x
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.m31817s(r0)
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            r8.f7743w = r1
            goto L_0x0050
        L_0x002b:
            int[] r0 = r8.f37141A
            int[] r4 = r8.f7746z
            android.graphics.drawable.Drawable[] r5 = r8.f7739s
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.m31823m()
            r8.f7745y = r4
            int r0 = r8.f7744x
            if (r0 != 0) goto L_0x0042
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            boolean r0 = r8.m31817s(r0)
            r8.m31821o()
            if (r0 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r3
        L_0x004e:
            r8.f7743w = r1
        L_0x0050:
            r3 = r0
        L_0x0051:
            android.graphics.drawable.Drawable[] r0 = r8.f7739s
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0071
            r0 = r0[r2]
            int[] r1 = r8.f37141A
            r1 = r1[r2]
            int r4 = r8.f37142B
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.m31829g(r9, r0, r1)
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0071:
            if (r3 == 0) goto L_0x007a
            r8.m31822n()
            r8.m31820p()
            goto L_0x007d
        L_0x007a:
            r8.invalidateSelf()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.C4814e.draw(android.graphics.Canvas):void");
    }

    /* renamed from: f */
    public void m31830f() {
        this.f37144D++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37142B;
    }

    /* renamed from: h */
    public void m31828h() {
        this.f37144D--;
        invalidateSelf();
    }

    /* renamed from: i */
    public void m31827i() {
        this.f7743w = 0;
        Arrays.fill(this.f37143C, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f37144D == 0) {
            super.invalidateSelf();
        }
    }

    /* renamed from: j */
    public void m31826j(int i) {
        this.f7743w = 0;
        this.f37143C[i] = true;
        invalidateSelf();
    }

    /* renamed from: k */
    public void m31825k(int i) {
        this.f7743w = 0;
        this.f37143C[i] = false;
        invalidateSelf();
    }

    /* renamed from: l */
    public void m31824l() {
        int i;
        this.f7743w = 2;
        for (int i2 = 0; i2 < this.f7739s.length; i2++) {
            int[] iArr = this.f37141A;
            if (this.f37143C[i2]) {
                i = 255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    /* renamed from: m */
    protected long m31823m() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: r */
    public void m31818r(int i) {
        this.f7744x = i;
        if (this.f7743w == 1) {
            this.f7743w = 0;
        }
    }

    @Override // com.facebook.drawee.drawable.C4810a, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f37142B != i) {
            this.f37142B = i;
            invalidateSelf();
        }
    }
}
