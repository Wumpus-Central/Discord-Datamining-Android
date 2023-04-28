package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.text.AbstractC2500o;
import androidx.core.text.C2501p;
import androidx.core.util.C2517g;
import androidx.core.view.C2706t;
import androidx.core.view.C2733w0;
import com.google.android.material.internal.C5656j;
import lb.C10395a;
import p054d1.C6391a;
import p102fb.C7101a;
import p366ub.C13240a;
import p366ub.C13243d;
import p366ub.C13250i;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes3.dex */
public final class C5644b {

    /* renamed from: t0 */
    private static final boolean f10980t0 = false;

    /* renamed from: u0 */
    private static final Paint f10981u0 = null;

    /* renamed from: A */
    private Typeface f37526A;

    /* renamed from: B */
    private Typeface f37527B;

    /* renamed from: C */
    private Typeface f37528C;

    /* renamed from: D */
    private Typeface f37529D;

    /* renamed from: E */
    private C13240a f37530E;

    /* renamed from: F */
    private C13240a f37531F;

    /* renamed from: G */
    private CharSequence f37532G;

    /* renamed from: H */
    private CharSequence f37533H;

    /* renamed from: I */
    private boolean f37534I;

    /* renamed from: K */
    private boolean f37536K;

    /* renamed from: L */
    private Bitmap f37537L;

    /* renamed from: M */
    private Paint f37538M;

    /* renamed from: N */
    private float f37539N;

    /* renamed from: O */
    private float f37540O;

    /* renamed from: P */
    private float f37541P;

    /* renamed from: Q */
    private float f37542Q;

    /* renamed from: R */
    private float f37543R;

    /* renamed from: S */
    private int f37544S;

    /* renamed from: T */
    private int[] f37545T;

    /* renamed from: U */
    private boolean f37546U;

    /* renamed from: V */
    private final TextPaint f37547V;

    /* renamed from: W */
    private final TextPaint f37548W;

    /* renamed from: X */
    private TimeInterpolator f37549X;

    /* renamed from: Y */
    private TimeInterpolator f37550Y;

    /* renamed from: Z */
    private float f37551Z;

    /* renamed from: a */
    private final View f10982a;

    /* renamed from: a0 */
    private float f10983a0;

    /* renamed from: b */
    private boolean f10984b;

    /* renamed from: b0 */
    private float f10985b0;

    /* renamed from: c */
    private float f10986c;

    /* renamed from: c0 */
    private ColorStateList f10987c0;

    /* renamed from: d */
    private boolean f10988d;

    /* renamed from: d0 */
    private float f10989d0;

    /* renamed from: e */
    private float f10990e;

    /* renamed from: e0 */
    private float f10991e0;

    /* renamed from: f0 */
    private float f10993f0;

    /* renamed from: g */
    private int f10994g;

    /* renamed from: g0 */
    private ColorStateList f10995g0;

    /* renamed from: h0 */
    private float f10997h0;

    /* renamed from: i0 */
    private float f10999i0;

    /* renamed from: j0 */
    private float f11001j0;

    /* renamed from: k0 */
    private StaticLayout f11003k0;

    /* renamed from: l0 */
    private float f11005l0;

    /* renamed from: m0 */
    private float f11007m0;

    /* renamed from: n0 */
    private float f11009n0;

    /* renamed from: o */
    private ColorStateList f11010o;

    /* renamed from: o0 */
    private CharSequence f11011o0;

    /* renamed from: p */
    private ColorStateList f11012p;

    /* renamed from: q */
    private int f11014q;

    /* renamed from: r */
    private float f11016r;

    /* renamed from: s */
    private float f11018s;

    /* renamed from: t */
    private float f11020t;

    /* renamed from: u */
    private float f11021u;

    /* renamed from: v */
    private float f11022v;

    /* renamed from: w */
    private float f11023w;

    /* renamed from: x */
    private Typeface f11024x;

    /* renamed from: y */
    private Typeface f11025y;

    /* renamed from: z */
    private Typeface f11026z;

    /* renamed from: k */
    private int f11002k = 16;

    /* renamed from: l */
    private int f11004l = 16;

    /* renamed from: m */
    private float f11006m = 15.0f;

    /* renamed from: n */
    private float f11008n = 15.0f;

    /* renamed from: J */
    private boolean f37535J = true;

    /* renamed from: p0 */
    private int f11013p0 = 1;

    /* renamed from: q0 */
    private float f11015q0 = 0.0f;

    /* renamed from: r0 */
    private float f11017r0 = 1.0f;

    /* renamed from: s0 */
    private int f11019s0 = C5656j.f11042n;

    /* renamed from: i */
    private final Rect f10998i = new Rect();

    /* renamed from: h */
    private final Rect f10996h = new Rect();

    /* renamed from: j */
    private final RectF f11000j = new RectF();

    /* renamed from: f */
    private float f10992f = m27908e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.b$a */
    /* loaded from: classes3.dex */
    public class C5645a implements C13240a.AbstractC0430a {
        C5645a() {
        }

        @Override // p366ub.C13240a.AbstractC0430a
        /* renamed from: a */
        public void mo4247a(Typeface typeface) {
            C5644b.this.m27923T(typeface);
        }
    }

    public C5644b(View view) {
        this.f10982a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f37547V = textPaint;
        this.f37548W = new TextPaint(textPaint);
        m27935H(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: A */
    private void m27942A(TextPaint textPaint) {
        textPaint.setTextSize(this.f11006m);
        textPaint.setTypeface(this.f37526A);
        textPaint.setLetterSpacing(this.f10999i0);
    }

    /* renamed from: B */
    private void m27941B(float f) {
        Rect rect;
        if (this.f10988d) {
            RectF rectF = this.f11000j;
            if (f < this.f10992f) {
                rect = this.f10996h;
            } else {
                rect = this.f10998i;
            }
            rectF.set(rect);
            return;
        }
        this.f11000j.left = m27936G(this.f10996h.left, this.f10998i.left, f, this.f37549X);
        this.f11000j.top = m27936G(this.f11016r, this.f11018s, f, this.f37549X);
        this.f11000j.right = m27936G(this.f10996h.right, this.f10998i.right, f, this.f37549X);
        this.f11000j.bottom = m27936G(this.f10996h.bottom, this.f10998i.bottom, f, this.f37549X);
    }

    /* renamed from: C */
    private static boolean m27940C(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: D */
    private boolean m27939D() {
        return C2733w0.m37063B(this.f10982a) == 1;
    }

    /* renamed from: F */
    private boolean m27937F(CharSequence charSequence, boolean z) {
        AbstractC2500o oVar;
        if (z) {
            oVar = C2501p.f3469d;
        } else {
            oVar = C2501p.f3468c;
        }
        return oVar.isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: G */
    private static float m27936G(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C7101a.m23399a(f, f2, f3);
    }

    /* renamed from: I */
    private float m27934I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: M */
    private static boolean m27930M(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: Q */
    private void m27926Q(float f) {
        this.f11007m0 = f;
        C2733w0.m37008h0(this.f10982a);
    }

    /* renamed from: U */
    private boolean m27922U(Typeface typeface) {
        C13240a aVar = this.f37531F;
        if (aVar != null) {
            aVar.m4249c();
        }
        if (this.f11026z == typeface) {
            return false;
        }
        this.f11026z = typeface;
        Typeface b = C13250i.m4209b(this.f10982a.getContext().getResources().getConfiguration(), typeface);
        this.f11025y = b;
        if (b == null) {
            b = this.f11026z;
        }
        this.f11024x = b;
        return true;
    }

    /* renamed from: Y */
    private void m27918Y(float f) {
        this.f11009n0 = f;
        C2733w0.m37008h0(this.f10982a);
    }

    /* renamed from: a */
    private static int m27916a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: b */
    private void m27914b(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        m27900i(1.0f, z);
        CharSequence charSequence = this.f37533H;
        if (!(charSequence == null || (staticLayout = this.f11003k0) == null)) {
            this.f11011o0 = TextUtils.ellipsize(charSequence, this.f37547V, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f11011o0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.f11005l0 = m27934I(this.f37547V, charSequence2);
        } else {
            this.f11005l0 = 0.0f;
        }
        int b = C2706t.m37125b(this.f11004l, this.f37534I ? 1 : 0);
        int i2 = b & 112;
        if (i2 == 48) {
            this.f11018s = this.f10998i.top;
        } else if (i2 != 80) {
            this.f11018s = this.f10998i.centerY() - ((this.f37547V.descent() - this.f37547V.ascent()) / 2.0f);
        } else {
            this.f11018s = this.f10998i.bottom + this.f37547V.ascent();
        }
        int i3 = b & 8388615;
        if (i3 == 1) {
            this.f11021u = this.f10998i.centerX() - (this.f11005l0 / 2.0f);
        } else if (i3 != 5) {
            this.f11021u = this.f10998i.left;
        } else {
            this.f11021u = this.f10998i.right - this.f11005l0;
        }
        m27900i(0.0f, z);
        StaticLayout staticLayout2 = this.f11003k0;
        if (staticLayout2 != null) {
            f = staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.f11003k0;
        if (staticLayout3 == null || this.f11013p0 <= 1) {
            CharSequence charSequence3 = this.f37533H;
            if (charSequence3 != null) {
                f2 = m27934I(this.f37547V, charSequence3);
            }
        } else {
            f2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f11003k0;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.f11014q = i;
        int b2 = C2706t.m37125b(this.f11002k, this.f37534I ? 1 : 0);
        int i4 = b2 & 112;
        if (i4 == 48) {
            this.f11016r = this.f10996h.top;
        } else if (i4 != 80) {
            this.f11016r = this.f10996h.centerY() - (f / 2.0f);
        } else {
            this.f11016r = (this.f10996h.bottom - f) + this.f37547V.descent();
        }
        int i5 = b2 & 8388615;
        if (i5 == 1) {
            this.f11020t = this.f10996h.centerX() - (f2 / 2.0f);
        } else if (i5 != 5) {
            this.f11020t = this.f10996h.left;
        } else {
            this.f11020t = this.f10996h.right - f2;
        }
        m27898j();
        m27907e0(this.f10986c);
    }

    /* renamed from: c */
    private void m27912c() {
        m27904g(this.f10986c);
    }

    /* renamed from: c0 */
    private boolean m27911c0(Typeface typeface) {
        C13240a aVar = this.f37530E;
        if (aVar != null) {
            aVar.m4249c();
        }
        if (this.f37528C == typeface) {
            return false;
        }
        this.f37528C = typeface;
        Typeface b = C13250i.m4209b(this.f10982a.getContext().getResources().getConfiguration(), typeface);
        this.f37527B = b;
        if (b == null) {
            b = this.f37528C;
        }
        this.f37526A = b;
        return true;
    }

    /* renamed from: d */
    private float m27910d(float f) {
        float f2 = this.f10992f;
        if (f <= f2) {
            return C7101a.m23398b(1.0f, 0.0f, this.f10990e, f2, f);
        }
        return C7101a.m23398b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e */
    private float m27908e() {
        float f = this.f10990e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: e0 */
    private void m27907e0(float f) {
        boolean z;
        m27902h(f);
        if (!f10980t0 || this.f37539N == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f37536K = z;
        if (z) {
            m27892n();
        }
        C2733w0.m37008h0(this.f10982a);
    }

    /* renamed from: f */
    private boolean m27906f(CharSequence charSequence) {
        boolean D = m27939D();
        if (this.f37535J) {
            return m27937F(charSequence, D);
        }
        return D;
    }

    /* renamed from: g */
    private void m27904g(float f) {
        float f2;
        m27941B(f);
        if (!this.f10988d) {
            this.f11022v = m27936G(this.f11020t, this.f11021u, f, this.f37549X);
            this.f11023w = m27936G(this.f11016r, this.f11018s, f, this.f37549X);
            m27907e0(f);
            f2 = f;
        } else if (f < this.f10992f) {
            this.f11022v = this.f11020t;
            this.f11023w = this.f11016r;
            m27907e0(0.0f);
            f2 = 0.0f;
        } else {
            this.f11022v = this.f11021u;
            this.f11023w = this.f11018s - Math.max(0, this.f10994g);
            m27907e0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C7101a.f15487b;
        m27926Q(1.0f - m27936G(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m27918Y(m27936G(1.0f, 0.0f, f, timeInterpolator));
        if (this.f11012p != this.f11010o) {
            this.f37547V.setColor(m27916a(m27884v(), m27886t(), f2));
        } else {
            this.f37547V.setColor(m27886t());
        }
        float f3 = this.f10997h0;
        float f4 = this.f10999i0;
        if (f3 != f4) {
            this.f37547V.setLetterSpacing(m27936G(f4, f3, f, timeInterpolator));
        } else {
            this.f37547V.setLetterSpacing(f3);
        }
        this.f37541P = m27936G(this.f10989d0, this.f37551Z, f, null);
        this.f37542Q = m27936G(this.f10991e0, this.f10983a0, f, null);
        this.f37543R = m27936G(this.f10993f0, this.f10985b0, f, null);
        int a = m27916a(m27885u(this.f10995g0), m27885u(this.f10987c0), f);
        this.f37544S = a;
        this.f37547V.setShadowLayer(this.f37541P, this.f37542Q, this.f37543R, a);
        if (this.f10988d) {
            this.f37547V.setAlpha((int) (m27910d(f) * this.f37547V.getAlpha()));
        }
        C2733w0.m37008h0(this.f10982a);
    }

    /* renamed from: h */
    private void m27902h(float f) {
        m27900i(f, false);
    }

    /* renamed from: i */
    private void m27900i(float f, boolean z) {
        float f2;
        float f3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f37532G != null) {
            float width = this.f10998i.width();
            float width2 = this.f10996h.width();
            boolean z6 = false;
            int i = 1;
            if (m27940C(f, 1.0f)) {
                f3 = this.f11008n;
                f2 = this.f10997h0;
                this.f37539N = 1.0f;
                Typeface typeface = this.f37529D;
                Typeface typeface2 = this.f11024x;
                if (typeface != typeface2) {
                    this.f37529D = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.f11006m;
                float f5 = this.f10999i0;
                Typeface typeface3 = this.f37529D;
                Typeface typeface4 = this.f37526A;
                if (typeface3 != typeface4) {
                    this.f37529D = typeface4;
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (m27940C(f, 0.0f)) {
                    this.f37539N = 1.0f;
                } else {
                    this.f37539N = m27936G(this.f11006m, this.f11008n, f, this.f37550Y) / this.f11006m;
                }
                float f6 = this.f11008n / this.f11006m;
                float f7 = width2 * f6;
                if (!z && f7 > width) {
                    width = Math.min(width / f6, width2);
                } else {
                    width = width2;
                }
                f3 = f4;
                f2 = f5;
                z2 = z5;
            }
            if (width > 0.0f) {
                if (this.f37540O != f3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f11001j0 != f2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 || z4 || this.f37546U || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f37540O = f3;
                this.f11001j0 = f2;
                this.f37546U = false;
            }
            if (this.f37533H == null || z2) {
                this.f37547V.setTextSize(this.f37540O);
                this.f37547V.setTypeface(this.f37529D);
                this.f37547V.setLetterSpacing(this.f11001j0);
                TextPaint textPaint = this.f37547V;
                if (this.f37539N != 1.0f) {
                    z6 = true;
                }
                textPaint.setLinearText(z6);
                this.f37534I = m27906f(this.f37532G);
                if (m27895k0()) {
                    i = this.f11013p0;
                }
                StaticLayout k = m27896k(i, width, this.f37534I);
                this.f11003k0 = k;
                this.f37533H = k.getText();
            }
        }
    }

    /* renamed from: j */
    private void m27898j() {
        Bitmap bitmap = this.f37537L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f37537L = null;
        }
    }

    /* renamed from: k */
    private StaticLayout m27896k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        try {
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = m27881y();
            }
            staticLayout = C5656j.m27864b(this.f37532G, this.f37547V, (int) f).m27862d(TextUtils.TruncateAt.END).m27859g(z).m27863c(alignment).m27860f(false).m27857i(i).m27858h(this.f11015q0, this.f11017r0).m27861e(this.f11019s0).m27865a();
        } catch (C5656j.C5657a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C2517g.m37588g(staticLayout);
    }

    /* renamed from: k0 */
    private boolean m27895k0() {
        return this.f11013p0 > 1 && (!this.f37534I || this.f10988d) && !this.f37536K;
    }

    /* renamed from: m */
    private void m27893m(Canvas canvas, float f, float f2) {
        int alpha = this.f37547V.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.f37547V.setAlpha((int) (this.f11009n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.f37547V;
            textPaint.setShadowLayer(this.f37541P, this.f37542Q, this.f37543R, C10395a.m13520a(this.f37544S, textPaint.getAlpha()));
        }
        this.f11003k0.draw(canvas);
        this.f37547V.setAlpha((int) (this.f11007m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.f37547V;
            textPaint2.setShadowLayer(this.f37541P, this.f37542Q, this.f37543R, C10395a.m13520a(this.f37544S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f11003k0.getLineBaseline(0);
        CharSequence charSequence = this.f11011o0;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f37547V);
        if (i >= 31) {
            this.f37547V.setShadowLayer(this.f37541P, this.f37542Q, this.f37543R, this.f37544S);
        }
        if (!this.f10988d) {
            String trim = this.f11011o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            this.f37547V.setAlpha(alpha);
            canvas.drawText(trim, 0, Math.min(this.f11003k0.getLineEnd(0), trim.length()), 0.0f, f4, (Paint) this.f37547V);
        }
    }

    /* renamed from: n */
    private void m27892n() {
        if (this.f37537L == null && !this.f10996h.isEmpty() && !TextUtils.isEmpty(this.f37533H)) {
            m27904g(0.0f);
            int width = this.f11003k0.getWidth();
            int height = this.f11003k0.getHeight();
            if (width > 0 && height > 0) {
                this.f37537L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f11003k0.draw(new Canvas(this.f37537L));
                if (this.f37538M == null) {
                    this.f37538M = new Paint(3);
                }
            }
        }
    }

    /* renamed from: r */
    private float m27888r(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (this.f11005l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f37534I) {
                return this.f10998i.left;
            }
            return this.f10998i.right - this.f11005l0;
        } else if (this.f37534I) {
            return this.f10998i.right - this.f11005l0;
        } else {
            return this.f10998i.left;
        }
    }

    /* renamed from: s */
    private float m27887s(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (this.f11005l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f37534I) {
                return rectF.left + this.f11005l0;
            }
            return this.f10998i.right;
        } else if (this.f37534I) {
            return this.f10998i.right;
        } else {
            return rectF.left + this.f11005l0;
        }
    }

    /* renamed from: u */
    private int m27885u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f37545T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: v */
    private int m27884v() {
        return m27885u(this.f11010o);
    }

    /* renamed from: y */
    private Layout.Alignment m27881y() {
        int b = C2706t.m37125b(this.f11002k, this.f37534I ? 1 : 0) & 7;
        if (b == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (b != 5) {
            if (this.f37534I) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (this.f37534I) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    /* renamed from: z */
    private void m27880z(TextPaint textPaint) {
        textPaint.setTextSize(this.f11008n);
        textPaint.setTypeface(this.f11024x);
        textPaint.setLetterSpacing(this.f10997h0);
    }

    /* renamed from: E */
    public final boolean m27938E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f11012p;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f11010o) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public void m27935H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f11026z;
            if (typeface != null) {
                this.f11025y = C13250i.m4209b(configuration, typeface);
            }
            Typeface typeface2 = this.f37528C;
            if (typeface2 != null) {
                this.f37527B = C13250i.m4209b(configuration, typeface2);
            }
            Typeface typeface3 = this.f11025y;
            if (typeface3 == null) {
                typeface3 = this.f11026z;
            }
            this.f11024x = typeface3;
            Typeface typeface4 = this.f37527B;
            if (typeface4 == null) {
                typeface4 = this.f37528C;
            }
            this.f37526A = typeface4;
            m27931L(true);
        }
    }

    /* renamed from: J */
    void m27933J() {
        boolean z;
        if (this.f10998i.width() <= 0 || this.f10998i.height() <= 0 || this.f10996h.width() <= 0 || this.f10996h.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f10984b = z;
    }

    /* renamed from: K */
    public void m27932K() {
        m27931L(false);
    }

    /* renamed from: L */
    public void m27931L(boolean z) {
        if ((this.f10982a.getHeight() > 0 && this.f10982a.getWidth() > 0) || z) {
            m27914b(z);
            m27912c();
        }
    }

    /* renamed from: N */
    public void m27929N(int i, int i2, int i3, int i4) {
        if (!m27930M(this.f10998i, i, i2, i3, i4)) {
            this.f10998i.set(i, i2, i3, i4);
            this.f37546U = true;
            m27933J();
        }
    }

    /* renamed from: O */
    public void m27928O(Rect rect) {
        m27929N(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: P */
    public void m27927P(int i) {
        C13243d dVar = new C13243d(this.f10982a.getContext(), i);
        if (dVar.m4225i() != null) {
            this.f11012p = dVar.m4225i();
        }
        if (dVar.m4224j() != 0.0f) {
            this.f11008n = dVar.m4224j();
        }
        ColorStateList colorStateList = dVar.f29721c;
        if (colorStateList != null) {
            this.f10987c0 = colorStateList;
        }
        this.f10983a0 = dVar.f29726h;
        this.f10985b0 = dVar.f29727i;
        this.f37551Z = dVar.f29728j;
        this.f10997h0 = dVar.f29730l;
        C13240a aVar = this.f37531F;
        if (aVar != null) {
            aVar.m4249c();
        }
        this.f37531F = new C13240a(new C5645a(), dVar.m4229e());
        dVar.m4226h(this.f10982a.getContext(), this.f37531F);
        m27932K();
    }

    /* renamed from: R */
    public void m27925R(ColorStateList colorStateList) {
        if (this.f11012p != colorStateList) {
            this.f11012p = colorStateList;
            m27932K();
        }
    }

    /* renamed from: S */
    public void m27924S(int i) {
        if (this.f11004l != i) {
            this.f11004l = i;
            m27932K();
        }
    }

    /* renamed from: T */
    public void m27923T(Typeface typeface) {
        if (m27922U(typeface)) {
            m27932K();
        }
    }

    /* renamed from: V */
    public void m27921V(int i, int i2, int i3, int i4) {
        if (!m27930M(this.f10996h, i, i2, i3, i4)) {
            this.f10996h.set(i, i2, i3, i4);
            this.f37546U = true;
            m27933J();
        }
    }

    /* renamed from: W */
    public void m27920W(Rect rect) {
        m27921V(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: X */
    public void m27919X(float f) {
        if (this.f10999i0 != f) {
            this.f10999i0 = f;
            m27932K();
        }
    }

    /* renamed from: Z */
    public void m27917Z(ColorStateList colorStateList) {
        if (this.f11010o != colorStateList) {
            this.f11010o = colorStateList;
            m27932K();
        }
    }

    /* renamed from: a0 */
    public void m27915a0(int i) {
        if (this.f11002k != i) {
            this.f11002k = i;
            m27932K();
        }
    }

    /* renamed from: b0 */
    public void m27913b0(float f) {
        if (this.f11006m != f) {
            this.f11006m = f;
            m27932K();
        }
    }

    /* renamed from: d0 */
    public void m27909d0(float f) {
        float a = C6391a.m25633a(f, 0.0f, 1.0f);
        if (a != this.f10986c) {
            this.f10986c = a;
            m27912c();
        }
    }

    /* renamed from: f0 */
    public void m27905f0(TimeInterpolator timeInterpolator) {
        this.f37549X = timeInterpolator;
        m27932K();
    }

    /* renamed from: g0 */
    public final boolean m27903g0(int[] iArr) {
        this.f37545T = iArr;
        if (!m27938E()) {
            return false;
        }
        m27932K();
        return true;
    }

    /* renamed from: h0 */
    public void m27901h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f37532G, charSequence)) {
            this.f37532G = charSequence;
            this.f37533H = null;
            m27898j();
            m27932K();
        }
    }

    /* renamed from: i0 */
    public void m27899i0(TimeInterpolator timeInterpolator) {
        this.f37550Y = timeInterpolator;
        m27932K();
    }

    /* renamed from: j0 */
    public void m27897j0(Typeface typeface) {
        boolean U = m27922U(typeface);
        boolean c0 = m27911c0(typeface);
        if (U || c0) {
            m27932K();
        }
    }

    /* renamed from: l */
    public void m27894l(Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.f37533H != null && this.f10984b) {
            this.f37547V.setTextSize(this.f37540O);
            float f = this.f11022v;
            float f2 = this.f11023w;
            if (!this.f37536K || this.f37537L == null) {
                z = false;
            } else {
                z = true;
            }
            float f3 = this.f37539N;
            if (f3 != 1.0f && !this.f10988d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f37537L, f, f2, this.f37538M);
                canvas.restoreToCount(save);
                return;
            }
            if (!m27895k0() || (this.f10988d && this.f10986c <= this.f10992f)) {
                canvas.translate(f, f2);
                this.f11003k0.draw(canvas);
            } else {
                m27893m(canvas, this.f11022v - this.f11003k0.getLineStart(0), f2);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: o */
    public void m27891o(RectF rectF, int i, int i2) {
        this.f37534I = m27906f(this.f37532G);
        rectF.left = m27888r(i, i2);
        rectF.top = this.f10998i.top;
        rectF.right = m27887s(rectF, i, i2);
        rectF.bottom = this.f10998i.top + m27889q();
    }

    /* renamed from: p */
    public ColorStateList m27890p() {
        return this.f11012p;
    }

    /* renamed from: q */
    public float m27889q() {
        m27880z(this.f37548W);
        return -this.f37548W.ascent();
    }

    /* renamed from: t */
    public int m27886t() {
        return m27885u(this.f11012p);
    }

    /* renamed from: w */
    public float m27883w() {
        m27942A(this.f37548W);
        return -this.f37548W.ascent();
    }

    /* renamed from: x */
    public float m27882x() {
        return this.f10986c;
    }
}
