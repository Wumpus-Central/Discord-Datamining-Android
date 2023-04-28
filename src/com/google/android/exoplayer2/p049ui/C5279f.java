package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import p119g9.C7510a;
import p119g9.C7557q0;
import p317r8.C12452a;
import p317r8.C12453b;

/* renamed from: com.google.android.exoplayer2.ui.f */
/* loaded from: classes5.dex */
final class C5279f {

    /* renamed from: A */
    private int f37352A;

    /* renamed from: B */
    private int f37353B;

    /* renamed from: C */
    private int f37354C;

    /* renamed from: D */
    private int f37355D;

    /* renamed from: E */
    private StaticLayout f37356E;

    /* renamed from: F */
    private StaticLayout f37357F;

    /* renamed from: G */
    private int f37358G;

    /* renamed from: H */
    private int f37359H;

    /* renamed from: I */
    private int f37360I;

    /* renamed from: J */
    private Rect f37361J;

    /* renamed from: a */
    private final float f9679a;

    /* renamed from: b */
    private final float f9680b;

    /* renamed from: c */
    private final float f9681c;

    /* renamed from: d */
    private final float f9682d;

    /* renamed from: e */
    private final float f9683e;

    /* renamed from: f */
    private final TextPaint f9684f;

    /* renamed from: g */
    private final Paint f9685g;

    /* renamed from: h */
    private final Paint f9686h;

    /* renamed from: i */
    private CharSequence f9687i;

    /* renamed from: j */
    private Layout.Alignment f9688j;

    /* renamed from: k */
    private Bitmap f9689k;

    /* renamed from: l */
    private float f9690l;

    /* renamed from: m */
    private int f9691m;

    /* renamed from: n */
    private int f9692n;

    /* renamed from: o */
    private float f9693o;

    /* renamed from: p */
    private int f9694p;

    /* renamed from: q */
    private float f9695q;

    /* renamed from: r */
    private float f9696r;

    /* renamed from: s */
    private int f9697s;

    /* renamed from: t */
    private int f9698t;

    /* renamed from: u */
    private int f9699u;

    /* renamed from: v */
    private int f9700v;

    /* renamed from: w */
    private int f9701w;

    /* renamed from: x */
    private float f9702x;

    /* renamed from: y */
    private float f9703y;

    /* renamed from: z */
    private float f9704z;

    public C5279f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f9683e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f9682d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f9679a = round;
        this.f9680b = round;
        this.f9681c = round;
        TextPaint textPaint = new TextPaint();
        this.f9684f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f9685g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f9686h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    private static boolean m29664a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* renamed from: c */
    private void m29662c(Canvas canvas) {
        canvas.drawBitmap(this.f9689k, (Rect) null, this.f37361J, this.f9686h);
    }

    /* renamed from: d */
    private void m29661d(Canvas canvas, boolean z) {
        if (z) {
            m29660e(canvas);
            return;
        }
        C7510a.m22367e(this.f37361J);
        C7510a.m22367e(this.f9689k);
        m29662c(canvas);
    }

    /* renamed from: e */
    private void m29660e(Canvas canvas) {
        int i;
        StaticLayout staticLayout = this.f37356E;
        StaticLayout staticLayout2 = this.f37357F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate(this.f37358G, this.f37359H);
            if (Color.alpha(this.f9699u) > 0) {
                this.f9685g.setColor(this.f9699u);
                canvas.drawRect(-this.f37360I, 0.0f, staticLayout.getWidth() + this.f37360I, staticLayout.getHeight(), this.f9685g);
            }
            int i2 = this.f9701w;
            boolean z = true;
            if (i2 == 1) {
                this.f9684f.setStrokeJoin(Paint.Join.ROUND);
                this.f9684f.setStrokeWidth(this.f9679a);
                this.f9684f.setColor(this.f9700v);
                this.f9684f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f9684f;
                float f = this.f9680b;
                float f2 = this.f9681c;
                textPaint.setShadowLayer(f, f2, f2, this.f9700v);
            } else if (i2 == 3 || i2 == 4) {
                if (i2 != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.f9700v;
                }
                if (z) {
                    i3 = this.f9700v;
                }
                float f3 = this.f9680b / 2.0f;
                this.f9684f.setColor(this.f9697s);
                this.f9684f.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                this.f9684f.setShadowLayer(this.f9680b, f4, f4, i);
                staticLayout2.draw(canvas);
                this.f9684f.setShadowLayer(this.f9680b, f3, f3, i3);
            }
            this.f9684f.setColor(this.f9697s);
            this.f9684f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f9684f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29659f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f9689k
            int r1 = r7.f37354C
            int r2 = r7.f37352A
            int r1 = r1 - r2
            int r3 = r7.f37355D
            int r4 = r7.f37353B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f9693o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f9690l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f9695q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f9696r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L_0x003f
        L_0x002e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L_0x003f:
            int r3 = r7.f9694p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x0048
            float r3 = (float) r1
        L_0x0046:
            float r2 = r2 - r3
            goto L_0x004e
        L_0x0048:
            if (r3 != r5) goto L_0x004e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0046
        L_0x004e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f9692n
            if (r3 != r6) goto L_0x0059
            float r3 = (float) r0
        L_0x0057:
            float r4 = r4 - r3
            goto L_0x005f
        L_0x0059:
            if (r3 != r5) goto L_0x005f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0057
        L_0x005f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f37361J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.C5279f.m29659f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29658g() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.C5279f.m29658g():void");
    }

    /* renamed from: b */
    public void m29663b(C12453b bVar, C12452a aVar, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = bVar.f28081c == null;
        if (!z) {
            i5 = -16777216;
        } else if (!TextUtils.isEmpty(bVar.f28079a)) {
            i5 = bVar.f28089k ? bVar.f28090l : aVar.f28074c;
        } else {
            return;
        }
        if (m29664a(this.f9687i, bVar.f28079a) && C7557q0.m22159c(this.f9688j, bVar.f28080b) && this.f9689k == bVar.f28081c && this.f9690l == bVar.f28082d && this.f9691m == bVar.f28083e && C7557q0.m22159c(Integer.valueOf(this.f9692n), Integer.valueOf(bVar.f28084f)) && this.f9693o == bVar.f28085g && C7557q0.m22159c(Integer.valueOf(this.f9694p), Integer.valueOf(bVar.f28086h)) && this.f9695q == bVar.f28087i && this.f9696r == bVar.f28088j && this.f9697s == aVar.f28072a && this.f9698t == aVar.f28073b && this.f9699u == i5 && this.f9701w == aVar.f28075d && this.f9700v == aVar.f28076e && C7557q0.m22159c(this.f9684f.getTypeface(), aVar.f28077f) && this.f9702x == f && this.f9703y == f2 && this.f9704z == f3 && this.f37352A == i && this.f37353B == i2 && this.f37354C == i3 && this.f37355D == i4) {
            m29661d(canvas, z);
            return;
        }
        this.f9687i = bVar.f28079a;
        this.f9688j = bVar.f28080b;
        this.f9689k = bVar.f28081c;
        this.f9690l = bVar.f28082d;
        this.f9691m = bVar.f28083e;
        this.f9692n = bVar.f28084f;
        this.f9693o = bVar.f28085g;
        this.f9694p = bVar.f28086h;
        this.f9695q = bVar.f28087i;
        this.f9696r = bVar.f28088j;
        this.f9697s = aVar.f28072a;
        this.f9698t = aVar.f28073b;
        this.f9699u = i5;
        this.f9701w = aVar.f28075d;
        this.f9700v = aVar.f28076e;
        this.f9684f.setTypeface(aVar.f28077f);
        this.f9702x = f;
        this.f9703y = f2;
        this.f9704z = f3;
        this.f37352A = i;
        this.f37353B = i2;
        this.f37354C = i3;
        this.f37355D = i4;
        if (z) {
            C7510a.m22367e(this.f9687i);
            m29658g();
        } else {
            C7510a.m22367e(this.f9689k);
            m29659f();
        }
        m29661d(canvas, z);
    }
}
