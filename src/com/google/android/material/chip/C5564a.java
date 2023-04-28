package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.C2382a;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.text.C2485a;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.material.internal.C5658k;
import com.google.android.material.internal.C5662m;
import com.google.android.material.internal.C5665o;
import gb.C7574a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import lb.C10395a;
import p071e.C6525a;
import p083eb.C6812k;
import p102fb.C7108h;
import p246nb.C10773a;
import p366ub.C13242c;
import p366ub.C13243d;
import p385vb.C13488b;
import p422xb.C14038g;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes3.dex */
public class C5564a extends C14038g implements Drawable.Callback, C5658k.AbstractC5660b {

    /* renamed from: T0 */
    private static final int[] f37443T0 = {16842910};

    /* renamed from: U0 */
    private static final ShapeDrawable f37444U0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f37445A0;

    /* renamed from: B0 */
    private int f37446B0;

    /* renamed from: C0 */
    private int f37447C0;

    /* renamed from: D0 */
    private int f37448D0;

    /* renamed from: E0 */
    private boolean f37449E0;

    /* renamed from: F0 */
    private int f37450F0;

    /* renamed from: H0 */
    private ColorFilter f37452H0;

    /* renamed from: I0 */
    private PorterDuffColorFilter f37453I0;

    /* renamed from: J */
    private ColorStateList f37454J;

    /* renamed from: J0 */
    private ColorStateList f37455J0;

    /* renamed from: K */
    private ColorStateList f37456K;

    /* renamed from: L */
    private float f37458L;

    /* renamed from: L0 */
    private int[] f37459L0;

    /* renamed from: M0 */
    private boolean f37461M0;

    /* renamed from: N */
    private ColorStateList f37462N;

    /* renamed from: N0 */
    private ColorStateList f37463N0;

    /* renamed from: O */
    private float f37464O;

    /* renamed from: P */
    private ColorStateList f37466P;

    /* renamed from: P0 */
    private TextUtils.TruncateAt f37467P0;

    /* renamed from: R */
    private boolean f37470R;

    /* renamed from: R0 */
    private int f37471R0;

    /* renamed from: S */
    private Drawable f37472S;

    /* renamed from: S0 */
    private boolean f37473S0;

    /* renamed from: T */
    private ColorStateList f37474T;

    /* renamed from: U */
    private float f37475U;

    /* renamed from: V */
    private boolean f37476V;

    /* renamed from: W */
    private boolean f37477W;

    /* renamed from: X */
    private Drawable f37478X;

    /* renamed from: Y */
    private Drawable f37479Y;

    /* renamed from: Z */
    private ColorStateList f37480Z;

    /* renamed from: a0 */
    private float f10733a0;

    /* renamed from: b0 */
    private CharSequence f10734b0;

    /* renamed from: c0 */
    private boolean f10735c0;

    /* renamed from: d0 */
    private boolean f10736d0;

    /* renamed from: e0 */
    private Drawable f10737e0;

    /* renamed from: f0 */
    private ColorStateList f10738f0;

    /* renamed from: g0 */
    private C7108h f10739g0;

    /* renamed from: h0 */
    private C7108h f10740h0;

    /* renamed from: i0 */
    private float f10741i0;

    /* renamed from: j0 */
    private float f10742j0;

    /* renamed from: k0 */
    private float f10743k0;

    /* renamed from: l0 */
    private float f10744l0;

    /* renamed from: m0 */
    private float f10745m0;

    /* renamed from: n0 */
    private float f10746n0;

    /* renamed from: o0 */
    private float f10747o0;

    /* renamed from: p0 */
    private float f10748p0;

    /* renamed from: q0 */
    private final Context f10749q0;

    /* renamed from: x0 */
    private final C5658k f10756x0;

    /* renamed from: y0 */
    private int f10757y0;

    /* renamed from: z0 */
    private int f10758z0;

    /* renamed from: M */
    private float f37460M = -1.0f;

    /* renamed from: r0 */
    private final Paint f10750r0 = new Paint(1);

    /* renamed from: t0 */
    private final Paint.FontMetrics f10752t0 = new Paint.FontMetrics();

    /* renamed from: u0 */
    private final RectF f10753u0 = new RectF();

    /* renamed from: v0 */
    private final PointF f10754v0 = new PointF();

    /* renamed from: w0 */
    private final Path f10755w0 = new Path();

    /* renamed from: G0 */
    private int f37451G0 = 255;

    /* renamed from: K0 */
    private PorterDuff.Mode f37457K0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: O0 */
    private WeakReference<AbstractC0154a> f37465O0 = new WeakReference<>(null);

    /* renamed from: Q */
    private CharSequence f37468Q = "";

    /* renamed from: s0 */
    private final Paint f10751s0 = null;

    /* renamed from: Q0 */
    private boolean f37469Q0 = true;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes3.dex */
    public interface AbstractC0154a {
        /* renamed from: a */
        void mo28248a();
    }

    private C5564a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1991O(context);
        this.f10749q0 = context;
        C5658k kVar = new C5658k(this);
        this.f10756x0 = kVar;
        kVar.m27852e().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f37443T0;
        setState(iArr);
        m28288m2(iArr);
        if (C13488b.f30123a) {
            f37444U0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m28386A0(Canvas canvas, Rect rect) {
        if (this.f37464O > 0.0f && !this.f37473S0) {
            this.f10750r0.setColor(this.f37446B0);
            this.f10750r0.setStyle(Paint.Style.STROKE);
            if (!this.f37473S0) {
                this.f10750r0.setColorFilter(m28289m1());
            }
            RectF rectF = this.f10753u0;
            float f = this.f37464O;
            rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
            float f2 = this.f37460M - (this.f37464O / 2.0f);
            canvas.drawRoundRect(this.f10753u0, f2, f2, this.f10750r0);
        }
    }

    /* renamed from: B0 */
    private void m28383B0(Canvas canvas, Rect rect) {
        if (!this.f37473S0) {
            this.f10750r0.setColor(this.f10757y0);
            this.f10750r0.setStyle(Paint.Style.FILL);
            this.f10753u0.set(rect);
            canvas.drawRoundRect(this.f10753u0, m28359J0(), m28359J0(), this.f10750r0);
        }
    }

    /* renamed from: C0 */
    private void m28380C0(Canvas canvas, Rect rect) {
        if (m28339P2()) {
            m28281p0(rect, this.f10753u0);
            RectF rectF = this.f10753u0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f37478X.setBounds(0, 0, (int) this.f10753u0.width(), (int) this.f10753u0.height());
            if (C13488b.f30123a) {
                this.f37479Y.setBounds(this.f37478X.getBounds());
                this.f37479Y.jumpToCurrentState();
                this.f37479Y.draw(canvas);
            } else {
                this.f37478X.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: D0 */
    private void m28377D0(Canvas canvas, Rect rect) {
        this.f10750r0.setColor(this.f37447C0);
        this.f10750r0.setStyle(Paint.Style.FILL);
        this.f10753u0.set(rect);
        if (!this.f37473S0) {
            canvas.drawRoundRect(this.f10753u0, m28359J0(), m28359J0(), this.f10750r0);
            return;
        }
        m1966h(new RectF(rect), this.f10755w0);
        super.m1954p(canvas, this.f10750r0, this.f10755w0, m1949u());
    }

    /* renamed from: E0 */
    private void m28374E0(Canvas canvas, Rect rect) {
        Paint paint = this.f10751s0;
        if (paint != null) {
            paint.setColor(C2382a.m37920k(-16777216, 127));
            canvas.drawRect(rect, this.f10751s0);
            if (m28342O2() || m28345N2()) {
                m28290m0(rect, this.f10753u0);
                canvas.drawRect(this.f10753u0, this.f10751s0);
            }
            if (this.f37468Q != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f10751s0);
            }
            if (m28339P2()) {
                m28281p0(rect, this.f10753u0);
                canvas.drawRect(this.f10753u0, this.f10751s0);
            }
            this.f10751s0.setColor(C2382a.m37920k(-65536, 127));
            m28284o0(rect, this.f10753u0);
            canvas.drawRect(this.f10753u0, this.f10751s0);
            this.f10751s0.setColor(C2382a.m37920k(-16711936, 127));
            m28278q0(rect, this.f10753u0);
            canvas.drawRect(this.f10753u0, this.f10751s0);
        }
    }

    /* renamed from: F0 */
    private void m28371F0(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f37468Q != null) {
            Paint.Align u0 = m28266u0(rect, this.f10754v0);
            m28272s0(rect, this.f10753u0);
            if (this.f10756x0.m27853d() != null) {
                this.f10756x0.m27852e().drawableState = getState();
                this.f10756x0.m27847j(this.f10749q0);
            }
            this.f10756x0.m27852e().setTextAlign(u0);
            int i = 0;
            if (Math.round(this.f10756x0.m27851f(m28299i1().toString())) > Math.round(this.f10753u0.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f10753u0);
            }
            CharSequence charSequence = this.f37468Q;
            if (z && this.f37467P0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f10756x0.m27852e(), this.f10753u0.width(), this.f37467P0);
            }
            int length = charSequence.length();
            PointF pointF = this.f10754v0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f10756x0.m27852e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: N2 */
    private boolean m28345N2() {
        return this.f10736d0 && this.f10737e0 != null && this.f37449E0;
    }

    /* renamed from: O2 */
    private boolean m28342O2() {
        return this.f37470R && this.f37472S != null;
    }

    /* renamed from: P2 */
    private boolean m28339P2() {
        return this.f37477W && this.f37478X != null;
    }

    /* renamed from: Q2 */
    private void m28336Q2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: R2 */
    private void m28333R2() {
        this.f37463N0 = this.f37461M0 ? C13488b.m3601a(this.f37466P) : null;
    }

    @TargetApi(21)
    /* renamed from: S2 */
    private void m28330S2() {
        this.f37479Y = new RippleDrawable(C13488b.m3601a(m28303g1()), this.f37478X, f37444U0);
    }

    /* renamed from: a1 */
    private float m28315a1() {
        Drawable drawable;
        if (this.f37449E0) {
            drawable = this.f10737e0;
        } else {
            drawable = this.f37472S;
        }
        float f = this.f37475U;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(C5665o.m27829b(this.f10749q0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: b1 */
    private float m28313b1() {
        Drawable drawable;
        if (this.f37449E0) {
            drawable = this.f10737e0;
        } else {
            drawable = this.f37472S;
        }
        float f = this.f37475U;
        if (f > 0.0f || drawable == null) {
            return f;
        }
        return drawable.getIntrinsicWidth();
    }

    /* renamed from: c2 */
    private void m28310c2(ColorStateList colorStateList) {
        if (this.f37454J != colorStateList) {
            this.f37454J = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: l0 */
    private void m28293l0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C2400a.m37830m(drawable, C2400a.m37837f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f37478X) {
                if (drawable.isStateful()) {
                    drawable.setState(m28321X0());
                }
                C2400a.m37828o(drawable, this.f37480Z);
                return;
            }
            Drawable drawable2 = this.f37472S;
            if (drawable == drawable2 && this.f37476V) {
                C2400a.m37828o(drawable2, this.f37474T);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* renamed from: m0 */
    private void m28290m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m28342O2() || m28345N2()) {
            float f = this.f10741i0 + this.f10742j0;
            float b1 = m28313b1();
            if (C2400a.m37837f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + b1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - b1;
            }
            float a1 = m28315a1();
            float exactCenterY = rect.exactCenterY() - (a1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + a1;
        }
    }

    /* renamed from: m1 */
    private ColorFilter m28289m1() {
        ColorFilter colorFilter = this.f37452H0;
        return colorFilter != null ? colorFilter : this.f37453I0;
    }

    /* renamed from: o0 */
    private void m28284o0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m28339P2()) {
            float f = this.f10748p0 + this.f10747o0 + this.f10733a0 + this.f10746n0 + this.f10745m0;
            if (C2400a.m37837f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: o1 */
    private static boolean m28283o1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p0 */
    private void m28281p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m28339P2()) {
            float f = this.f10748p0 + this.f10747o0;
            if (C2400a.m37837f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f10733a0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f10733a0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f10733a0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: q0 */
    private void m28278q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m28339P2()) {
            float f = this.f10748p0 + this.f10747o0 + this.f10733a0 + this.f10746n0 + this.f10745m0;
            if (C2400a.m37837f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: s0 */
    private void m28272s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f37468Q != null) {
            float n0 = this.f10741i0 + m28287n0() + this.f10744l0;
            float r0 = this.f10748p0 + m28275r0() + this.f10745m0;
            if (C2400a.m37837f(this) == 0) {
                rectF.left = rect.left + n0;
                rectF.right = rect.right - r0;
            } else {
                rectF.left = rect.left + r0;
                rectF.right = rect.right - n0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: s1 */
    private static boolean m28271s1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t0 */
    private float m28269t0() {
        this.f10756x0.m27852e().getFontMetrics(this.f10752t0);
        Paint.FontMetrics fontMetrics = this.f10752t0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: t1 */
    private static boolean m28268t1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: u1 */
    private static boolean m28265u1(C13243d dVar) {
        if (dVar == null || dVar.m4225i() == null || !dVar.m4225i().isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: v0 */
    private boolean m28263v0() {
        return this.f10736d0 && this.f10737e0 != null && this.f10735c0;
    }

    /* renamed from: v1 */
    private void m28262v1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C5662m.m27838h(this.f10749q0, attributeSet, C6812k.f14790o0, i, i2, new int[0]);
        this.f37473S0 = h.hasValue(C6812k.f38229Z0);
        m28310c2(C13242c.m4241a(this.f10749q0, h, C6812k.f38128M0));
        m28367G1(C13242c.m4241a(this.f10749q0, h, C6812k.f14878z0));
        m28326U1(h.getDimension(C6812k.f38088H0, 0.0f));
        int i3 = C6812k.f38032A0;
        if (h.hasValue(i3)) {
            m28361I1(h.getDimension(i3, 0.0f));
        }
        m28318Y1(C13242c.m4241a(this.f10749q0, h, C6812k.f38112K0));
        m28314a2(h.getDimension(C6812k.f38120L0, 0.0f));
        m28249z2(C13242c.m4241a(this.f10749q0, h, C6812k.f38222Y0));
        m28372E2(h.getText(C6812k.f14830t0));
        C13243d f = C13242c.m4236f(this.f10749q0, h, C6812k.f14798p0);
        f.m4222l(h.getDimension(C6812k.f14806q0, f.m4224j()));
        m28369F2(f);
        int i4 = h.getInt(C6812k.f14814r0, 0);
        if (i4 == 1) {
            m28273r2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            m28273r2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            m28273r2(TextUtils.TruncateAt.END);
        }
        m28328T1(h.getBoolean(C6812k.f38080G0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            m28328T1(h.getBoolean(C6812k.f38056D0, false));
        }
        m28349M1(C13242c.m4238d(this.f10749q0, h, C6812k.f38048C0));
        int i5 = C6812k.f38072F0;
        if (h.hasValue(i5)) {
            m28337Q1(C13242c.m4241a(this.f10749q0, h, i5));
        }
        m28343O1(h.getDimension(C6812k.f38064E0, -1.0f));
        m28279p2(h.getBoolean(C6812k.f38184T0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            m28279p2(h.getBoolean(C6812k.f38144O0, false));
        }
        m28308d2(C13242c.m4238d(this.f10749q0, h, C6812k.f38136N0));
        m28285n2(C13242c.m4241a(this.f10749q0, h, C6812k.f38176S0));
        m28298i2(h.getDimension(C6812k.f38160Q0, 0.0f));
        m28253y1(h.getBoolean(C6812k.f14838u0, false));
        m28370F1(h.getBoolean(C6812k.f14870y0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            m28370F1(h.getBoolean(C6812k.f14854w0, false));
        }
        m28385A1(C13242c.m4238d(this.f10749q0, h, C6812k.f14846v0));
        int i6 = C6812k.f14862x0;
        if (h.hasValue(i6)) {
            m28379C1(C13242c.m4241a(this.f10749q0, h, i6));
        }
        m28378C2(C7108h.m23385b(this.f10749q0, h, C6812k.f14679a1));
        m28270s2(C7108h.m23385b(this.f10749q0, h, C6812k.f38200V0));
        m28322W1(h.getDimension(C6812k.f38104J0, 0.0f));
        m28258w2(h.getDimension(C6812k.f38215X0, 0.0f));
        m28264u2(h.getDimension(C6812k.f38208W0, 0.0f));
        m28357J2(h.getDimension(C6812k.f14695c1, 0.0f));
        m28363H2(h.getDimension(C6812k.f14687b1, 0.0f));
        m28294k2(h.getDimension(C6812k.f38168R0, 0.0f));
        m28304f2(h.getDimension(C6812k.f38152P0, 0.0f));
        m28355K1(h.getDimension(C6812k.f38040B0, 0.0f));
        m28252y2(h.getDimensionPixelSize(C6812k.f14822s0, ViewDefaults.NUMBER_OF_LINES));
        h.recycle();
    }

    /* renamed from: w0 */
    public static C5564a m28260w0(Context context, AttributeSet attributeSet, int i, int i2) {
        C5564a aVar = new C5564a(context, attributeSet, i, i2);
        aVar.m28262v1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: x0 */
    private void m28257x0(Canvas canvas, Rect rect) {
        if (m28345N2()) {
            m28290m0(rect, this.f10753u0);
            RectF rectF = this.f10753u0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f10737e0.setBounds(0, 0, (int) this.f10753u0.width(), (int) this.f10753u0.height());
            this.f10737e0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: x1 */
    private boolean m28256x1(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f37454J;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, this.f10757y0);
        } else {
            i = 0;
        }
        int l = m1958l(i);
        boolean z5 = true;
        if (this.f10757y0 != l) {
            this.f10757y0 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f37456K;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(iArr, this.f10758z0);
        } else {
            i2 = 0;
        }
        int l2 = m1958l(i2);
        if (this.f10758z0 != l2) {
            this.f10758z0 = l2;
            onStateChange = true;
        }
        int g = C10395a.m13514g(l, l2);
        if (this.f37445A0 != g) {
            z = true;
        } else {
            z = false;
        }
        if (m1946x() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            this.f37445A0 = g;
            m1981Y(ColorStateList.valueOf(g));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f37462N;
        if (colorStateList3 != null) {
            i3 = colorStateList3.getColorForState(iArr, this.f37446B0);
        } else {
            i3 = 0;
        }
        if (this.f37446B0 != i3) {
            this.f37446B0 = i3;
            onStateChange = true;
        }
        if (this.f37463N0 == null || !C13488b.m3600b(iArr)) {
            i4 = 0;
        } else {
            i4 = this.f37463N0.getColorForState(iArr, this.f37447C0);
        }
        if (this.f37447C0 != i4) {
            this.f37447C0 = i4;
            if (this.f37461M0) {
                onStateChange = true;
            }
        }
        if (this.f10756x0.m27853d() == null || this.f10756x0.m27853d().m4225i() == null) {
            i5 = 0;
        } else {
            i5 = this.f10756x0.m27853d().m4225i().getColorForState(iArr, this.f37448D0);
        }
        if (this.f37448D0 != i5) {
            this.f37448D0 = i5;
            onStateChange = true;
        }
        if (!m28283o1(getState(), 16842912) || !this.f10735c0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f37449E0 == z3 || this.f10737e0 == null) {
            z4 = false;
        } else {
            float n0 = m28287n0();
            this.f37449E0 = z3;
            if (n0 != m28287n0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f37455J0;
        if (colorStateList4 != null) {
            i6 = colorStateList4.getColorForState(iArr, this.f37450F0);
        } else {
            i6 = 0;
        }
        if (this.f37450F0 != i6) {
            this.f37450F0 = i6;
            this.f37453I0 = C10773a.m12354a(this, this.f37455J0, this.f37457K0);
        } else {
            z5 = onStateChange;
        }
        if (m28268t1(this.f37472S)) {
            z5 |= this.f37472S.setState(iArr);
        }
        if (m28268t1(this.f10737e0)) {
            z5 |= this.f10737e0.setState(iArr);
        }
        if (m28268t1(this.f37478X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f37478X.setState(iArr3);
        }
        if (C13488b.f30123a && m28268t1(this.f37479Y)) {
            z5 |= this.f37479Y.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            m28259w1();
        }
        return z5;
    }

    /* renamed from: y0 */
    private void m28254y0(Canvas canvas, Rect rect) {
        if (!this.f37473S0) {
            this.f10750r0.setColor(this.f10758z0);
            this.f10750r0.setStyle(Paint.Style.FILL);
            this.f10750r0.setColorFilter(m28289m1());
            this.f10753u0.set(rect);
            canvas.drawRoundRect(this.f10753u0, m28359J0(), m28359J0(), this.f10750r0);
        }
    }

    /* renamed from: z0 */
    private void m28251z0(Canvas canvas, Rect rect) {
        if (m28342O2()) {
            m28290m0(rect, this.f10753u0);
            RectF rectF = this.f10753u0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f37472S.setBounds(0, 0, (int) this.f10753u0.width(), (int) this.f10753u0.height());
            this.f37472S.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: A1 */
    public void m28385A1(Drawable drawable) {
        if (this.f10737e0 != drawable) {
            float n0 = m28287n0();
            this.f10737e0 = drawable;
            float n02 = m28287n0();
            m28336Q2(this.f10737e0);
            m28293l0(this.f10737e0);
            invalidateSelf();
            if (n0 != n02) {
                m28259w1();
            }
        }
    }

    /* renamed from: A2 */
    public void m28384A2(int i) {
        m28249z2(C6525a.m25365a(this.f10749q0, i));
    }

    /* renamed from: B1 */
    public void m28382B1(int i) {
        m28385A1(C6525a.m25364b(this.f10749q0, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B2 */
    public void m28381B2(boolean z) {
        this.f37469Q0 = z;
    }

    /* renamed from: C1 */
    public void m28379C1(ColorStateList colorStateList) {
        if (this.f10738f0 != colorStateList) {
            this.f10738f0 = colorStateList;
            if (m28263v0()) {
                C2400a.m37828o(this.f10737e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: C2 */
    public void m28378C2(C7108h hVar) {
        this.f10739g0 = hVar;
    }

    /* renamed from: D1 */
    public void m28376D1(int i) {
        m28379C1(C6525a.m25365a(this.f10749q0, i));
    }

    /* renamed from: D2 */
    public void m28375D2(int i) {
        m28378C2(C7108h.m23384c(this.f10749q0, i));
    }

    /* renamed from: E1 */
    public void m28373E1(int i) {
        m28370F1(this.f10749q0.getResources().getBoolean(i));
    }

    /* renamed from: E2 */
    public void m28372E2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f37468Q, charSequence)) {
            this.f37468Q = charSequence;
            this.f10756x0.m27848i(true);
            invalidateSelf();
            m28259w1();
        }
    }

    /* renamed from: F1 */
    public void m28370F1(boolean z) {
        boolean z2;
        if (this.f10736d0 != z) {
            boolean N2 = m28345N2();
            this.f10736d0 = z;
            boolean N22 = m28345N2();
            if (N2 != N22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (N22) {
                    m28293l0(this.f10737e0);
                } else {
                    m28336Q2(this.f10737e0);
                }
                invalidateSelf();
                m28259w1();
            }
        }
    }

    /* renamed from: F2 */
    public void m28369F2(C13243d dVar) {
        this.f10756x0.m27849h(dVar, this.f10749q0);
    }

    /* renamed from: G0 */
    public Drawable m28368G0() {
        return this.f10737e0;
    }

    /* renamed from: G1 */
    public void m28367G1(ColorStateList colorStateList) {
        if (this.f37456K != colorStateList) {
            this.f37456K = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: G2 */
    public void m28366G2(int i) {
        m28369F2(new C13243d(this.f10749q0, i));
    }

    /* renamed from: H0 */
    public ColorStateList m28365H0() {
        return this.f10738f0;
    }

    /* renamed from: H1 */
    public void m28364H1(int i) {
        m28367G1(C6525a.m25365a(this.f10749q0, i));
    }

    /* renamed from: H2 */
    public void m28363H2(float f) {
        if (this.f10745m0 != f) {
            this.f10745m0 = f;
            invalidateSelf();
            m28259w1();
        }
    }

    /* renamed from: I0 */
    public ColorStateList m28362I0() {
        return this.f37456K;
    }

    @Deprecated
    /* renamed from: I1 */
    public void m28361I1(float f) {
        if (this.f37460M != f) {
            this.f37460M = f;
            setShapeAppearanceModel(m2001E().m1913w(f));
        }
    }

    /* renamed from: I2 */
    public void m28360I2(int i) {
        m28363H2(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: J0 */
    public float m28359J0() {
        return this.f37473S0 ? m1998H() : this.f37460M;
    }

    @Deprecated
    /* renamed from: J1 */
    public void m28358J1(int i) {
        m28361I1(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: J2 */
    public void m28357J2(float f) {
        if (this.f10744l0 != f) {
            this.f10744l0 = f;
            invalidateSelf();
            m28259w1();
        }
    }

    /* renamed from: K0 */
    public float m28356K0() {
        return this.f10748p0;
    }

    /* renamed from: K1 */
    public void m28355K1(float f) {
        if (this.f10748p0 != f) {
            this.f10748p0 = f;
            invalidateSelf();
            m28259w1();
        }
    }

    /* renamed from: K2 */
    public void m28354K2(int i) {
        m28357J2(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: L0 */
    public Drawable m28353L0() {
        Drawable drawable = this.f37472S;
        if (drawable != null) {
            return C2400a.m37826q(drawable);
        }
        return null;
    }

    /* renamed from: L1 */
    public void m28352L1(int i) {
        m28355K1(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: L2 */
    public void m28351L2(boolean z) {
        if (this.f37461M0 != z) {
            this.f37461M0 = z;
            m28333R2();
            onStateChange(getState());
        }
    }

    /* renamed from: M0 */
    public float m28350M0() {
        return this.f37475U;
    }

    /* renamed from: M1 */
    public void m28349M1(Drawable drawable) {
        Drawable drawable2;
        Drawable L0 = m28353L0();
        if (L0 != drawable) {
            float n0 = m28287n0();
            if (drawable != null) {
                drawable2 = C2400a.m37825r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f37472S = drawable2;
            float n02 = m28287n0();
            m28336Q2(L0);
            if (m28342O2()) {
                m28293l0(this.f37472S);
            }
            invalidateSelf();
            if (n0 != n02) {
                m28259w1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M2 */
    public boolean m28348M2() {
        return this.f37469Q0;
    }

    /* renamed from: N0 */
    public ColorStateList m28347N0() {
        return this.f37474T;
    }

    /* renamed from: N1 */
    public void m28346N1(int i) {
        m28349M1(C6525a.m25364b(this.f10749q0, i));
    }

    /* renamed from: O0 */
    public float m28344O0() {
        return this.f37458L;
    }

    /* renamed from: O1 */
    public void m28343O1(float f) {
        if (this.f37475U != f) {
            float n0 = m28287n0();
            this.f37475U = f;
            float n02 = m28287n0();
            invalidateSelf();
            if (n0 != n02) {
                m28259w1();
            }
        }
    }

    /* renamed from: P0 */
    public float m28341P0() {
        return this.f10741i0;
    }

    /* renamed from: P1 */
    public void m28340P1(int i) {
        m28343O1(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: Q0 */
    public ColorStateList m28338Q0() {
        return this.f37462N;
    }

    /* renamed from: Q1 */
    public void m28337Q1(ColorStateList colorStateList) {
        this.f37476V = true;
        if (this.f37474T != colorStateList) {
            this.f37474T = colorStateList;
            if (m28342O2()) {
                C2400a.m37828o(this.f37472S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: R0 */
    public float m28335R0() {
        return this.f37464O;
    }

    /* renamed from: R1 */
    public void m28334R1(int i) {
        m28337Q1(C6525a.m25365a(this.f10749q0, i));
    }

    /* renamed from: S0 */
    public Drawable m28332S0() {
        Drawable drawable = this.f37478X;
        if (drawable != null) {
            return C2400a.m37826q(drawable);
        }
        return null;
    }

    /* renamed from: S1 */
    public void m28331S1(int i) {
        m28328T1(this.f10749q0.getResources().getBoolean(i));
    }

    /* renamed from: T0 */
    public CharSequence m28329T0() {
        return this.f10734b0;
    }

    /* renamed from: T1 */
    public void m28328T1(boolean z) {
        boolean z2;
        if (this.f37470R != z) {
            boolean O2 = m28342O2();
            this.f37470R = z;
            boolean O22 = m28342O2();
            if (O2 != O22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (O22) {
                    m28293l0(this.f37472S);
                } else {
                    m28336Q2(this.f37472S);
                }
                invalidateSelf();
                m28259w1();
            }
        }
    }

    /* renamed from: U0 */
    public float m28327U0() {
        return this.f10747o0;
    }

    /* renamed from: U1 */
    public void m28326U1(float f) {
        if (this.f37458L != f) {
            this.f37458L = f;
            invalidateSelf();
            m28259w1();
        }
    }

    /* renamed from: V0 */
    public float m28325V0() {
        return this.f10733a0;
    }

    /* renamed from: V1 */
    public void m28324V1(int i) {
        m28326U1(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public float m28323W0() {
        return this.f10746n0;
    }

    /* renamed from: W1 */
    public void m28322W1(float f) {
        if (this.f10741i0 != f) {
            this.f10741i0 = f;
            invalidateSelf();
            m28259w1();
        }
    }

    /* renamed from: X0 */
    public int[] m28321X0() {
        return this.f37459L0;
    }

    /* renamed from: X1 */
    public void m28320X1(int i) {
        m28322W1(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: Y0 */
    public ColorStateList m28319Y0() {
        return this.f37480Z;
    }

    /* renamed from: Y1 */
    public void m28318Y1(ColorStateList colorStateList) {
        if (this.f37462N != colorStateList) {
            this.f37462N = colorStateList;
            if (this.f37473S0) {
                m1967g0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Z0 */
    public void m28317Z0(RectF rectF) {
        m28278q0(getBounds(), rectF);
    }

    /* renamed from: Z1 */
    public void m28316Z1(int i) {
        m28318Y1(C6525a.m25365a(this.f10749q0, i));
    }

    @Override // com.google.android.material.internal.C5658k.AbstractC5660b
    /* renamed from: a */
    public void mo27846a() {
        m28259w1();
        invalidateSelf();
    }

    /* renamed from: a2 */
    public void m28314a2(float f) {
        if (this.f37464O != f) {
            this.f37464O = f;
            this.f10750r0.setStrokeWidth(f);
            if (this.f37473S0) {
                super.m1965h0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: b2 */
    public void m28312b2(int i) {
        m28314a2(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: c1 */
    public TextUtils.TruncateAt m28311c1() {
        return this.f37467P0;
    }

    /* renamed from: d1 */
    public C7108h m28309d1() {
        return this.f10740h0;
    }

    /* renamed from: d2 */
    public void m28308d2(Drawable drawable) {
        Drawable drawable2;
        Drawable S0 = m28332S0();
        if (S0 != drawable) {
            float r0 = m28275r0();
            if (drawable != null) {
                drawable2 = C2400a.m37825r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f37478X = drawable2;
            if (C13488b.f30123a) {
                m28330S2();
            }
            float r02 = m28275r0();
            m28336Q2(S0);
            if (m28339P2()) {
                m28293l0(this.f37478X);
            }
            invalidateSelf();
            if (r0 != r02) {
                m28259w1();
            }
        }
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.f37451G0;
            if (i2 < 255) {
                i = C7574a.m21976a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                i = 0;
            }
            m28383B0(canvas, bounds);
            m28254y0(canvas, bounds);
            if (this.f37473S0) {
                super.draw(canvas);
            }
            m28386A0(canvas, bounds);
            m28377D0(canvas, bounds);
            m28251z0(canvas, bounds);
            m28257x0(canvas, bounds);
            if (this.f37469Q0) {
                m28371F0(canvas, bounds);
            }
            m28380C0(canvas, bounds);
            m28374E0(canvas, bounds);
            if (this.f37451G0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public float m28307e1() {
        return this.f10743k0;
    }

    /* renamed from: e2 */
    public void m28306e2(CharSequence charSequence) {
        if (this.f10734b0 != charSequence) {
            this.f10734b0 = C2485a.m37650c().m37645h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: f1 */
    public float m28305f1() {
        return this.f10742j0;
    }

    /* renamed from: f2 */
    public void m28304f2(float f) {
        if (this.f10747o0 != f) {
            this.f10747o0 = f;
            invalidateSelf();
            if (m28339P2()) {
                m28259w1();
            }
        }
    }

    /* renamed from: g1 */
    public ColorStateList m28303g1() {
        return this.f37466P;
    }

    /* renamed from: g2 */
    public void m28302g2(int i) {
        m28304f2(this.f10749q0.getResources().getDimension(i));
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37451G0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f37452H0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f37458L;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f10741i0 + m28287n0() + this.f10744l0 + this.f10756x0.m27851f(m28299i1().toString()) + this.f10745m0 + m28275r0() + this.f10748p0), this.f37471R0);
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f37473S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f37460M);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f37460M);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public C7108h m28301h1() {
        return this.f10739g0;
    }

    /* renamed from: h2 */
    public void m28300h2(int i) {
        m28308d2(C6525a.m25364b(this.f10749q0, i));
    }

    /* renamed from: i1 */
    public CharSequence m28299i1() {
        return this.f37468Q;
    }

    /* renamed from: i2 */
    public void m28298i2(float f) {
        if (this.f10733a0 != f) {
            this.f10733a0 = f;
            invalidateSelf();
            if (m28339P2()) {
                m28259w1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (m28271s1(this.f37454J) || m28271s1(this.f37456K) || m28271s1(this.f37462N) || ((this.f37461M0 && m28271s1(this.f37463N0)) || m28265u1(this.f10756x0.m27853d()) || m28263v0() || m28268t1(this.f37472S) || m28268t1(this.f10737e0) || m28271s1(this.f37455J0))) {
            return true;
        }
        return false;
    }

    /* renamed from: j1 */
    public C13243d m28297j1() {
        return this.f10756x0.m27853d();
    }

    /* renamed from: j2 */
    public void m28296j2(int i) {
        m28298i2(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: k1 */
    public float m28295k1() {
        return this.f10745m0;
    }

    /* renamed from: k2 */
    public void m28294k2(float f) {
        if (this.f10746n0 != f) {
            this.f10746n0 = f;
            invalidateSelf();
            if (m28339P2()) {
                m28259w1();
            }
        }
    }

    /* renamed from: l1 */
    public float m28292l1() {
        return this.f10744l0;
    }

    /* renamed from: l2 */
    public void m28291l2(int i) {
        m28294k2(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: m2 */
    public boolean m28288m2(int[] iArr) {
        if (Arrays.equals(this.f37459L0, iArr)) {
            return false;
        }
        this.f37459L0 = iArr;
        if (m28339P2()) {
            return m28256x1(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public float m28287n0() {
        if (m28342O2() || m28345N2()) {
            return this.f10742j0 + m28313b1() + this.f10743k0;
        }
        return 0.0f;
    }

    /* renamed from: n1 */
    public boolean m28286n1() {
        return this.f37461M0;
    }

    /* renamed from: n2 */
    public void m28285n2(ColorStateList colorStateList) {
        if (this.f37480Z != colorStateList) {
            this.f37480Z = colorStateList;
            if (m28339P2()) {
                C2400a.m37828o(this.f37478X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: o2 */
    public void m28282o2(int i) {
        m28285n2(C6525a.m25365a(this.f10749q0, i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m28342O2()) {
            onLayoutDirectionChanged |= C2400a.m37830m(this.f37472S, i);
        }
        if (m28345N2()) {
            onLayoutDirectionChanged |= C2400a.m37830m(this.f10737e0, i);
        }
        if (m28339P2()) {
            onLayoutDirectionChanged |= C2400a.m37830m(this.f37478X, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m28342O2()) {
            onLevelChange |= this.f37472S.setLevel(i);
        }
        if (m28345N2()) {
            onLevelChange |= this.f10737e0.setLevel(i);
        }
        if (m28339P2()) {
            onLevelChange |= this.f37478X.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable, com.google.android.material.internal.C5658k.AbstractC5660b
    public boolean onStateChange(int[] iArr) {
        if (this.f37473S0) {
            super.onStateChange(iArr);
        }
        return m28256x1(iArr, m28321X0());
    }

    /* renamed from: p1 */
    public boolean m28280p1() {
        return this.f10735c0;
    }

    /* renamed from: p2 */
    public void m28279p2(boolean z) {
        boolean z2;
        if (this.f37477W != z) {
            boolean P2 = m28339P2();
            this.f37477W = z;
            boolean P22 = m28339P2();
            if (P2 != P22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (P22) {
                    m28293l0(this.f37478X);
                } else {
                    m28336Q2(this.f37478X);
                }
                invalidateSelf();
                m28259w1();
            }
        }
    }

    /* renamed from: q1 */
    public boolean m28277q1() {
        return m28268t1(this.f37478X);
    }

    /* renamed from: q2 */
    public void m28276q2(AbstractC0154a aVar) {
        this.f37465O0 = new WeakReference<>(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public float m28275r0() {
        if (m28339P2()) {
            return this.f10746n0 + this.f10733a0 + this.f10747o0;
        }
        return 0.0f;
    }

    /* renamed from: r1 */
    public boolean m28274r1() {
        return this.f37477W;
    }

    /* renamed from: r2 */
    public void m28273r2(TextUtils.TruncateAt truncateAt) {
        this.f37467P0 = truncateAt;
    }

    /* renamed from: s2 */
    public void m28270s2(C7108h hVar) {
        this.f10740h0 = hVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f37451G0 != i) {
            this.f37451G0 = i;
            invalidateSelf();
        }
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f37452H0 != colorFilter) {
            this.f37452H0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f37455J0 != colorStateList) {
            this.f37455J0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p422xb.C14038g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f37457K0 != mode) {
            this.f37457K0 = mode;
            this.f37453I0 = C10773a.m12354a(this, this.f37455J0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m28342O2()) {
            visible |= this.f37472S.setVisible(z, z2);
        }
        if (m28345N2()) {
            visible |= this.f10737e0.setVisible(z, z2);
        }
        if (m28339P2()) {
            visible |= this.f37478X.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t2 */
    public void m28267t2(int i) {
        m28270s2(C7108h.m23384c(this.f10749q0, i));
    }

    /* renamed from: u0 */
    Paint.Align m28266u0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f37468Q != null) {
            float n0 = this.f10741i0 + m28287n0() + this.f10744l0;
            if (C2400a.m37837f(this) == 0) {
                pointF.x = rect.left + n0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - n0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m28269t0();
        }
        return align;
    }

    /* renamed from: u2 */
    public void m28264u2(float f) {
        if (this.f10743k0 != f) {
            float n0 = m28287n0();
            this.f10743k0 = f;
            float n02 = m28287n0();
            invalidateSelf();
            if (n0 != n02) {
                m28259w1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v2 */
    public void m28261v2(int i) {
        m28264u2(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: w1 */
    protected void m28259w1() {
        AbstractC0154a aVar = this.f37465O0.get();
        if (aVar != null) {
            aVar.mo28248a();
        }
    }

    /* renamed from: w2 */
    public void m28258w2(float f) {
        if (this.f10742j0 != f) {
            float n0 = m28287n0();
            this.f10742j0 = f;
            float n02 = m28287n0();
            invalidateSelf();
            if (n0 != n02) {
                m28259w1();
            }
        }
    }

    /* renamed from: x2 */
    public void m28255x2(int i) {
        m28258w2(this.f10749q0.getResources().getDimension(i));
    }

    /* renamed from: y1 */
    public void m28253y1(boolean z) {
        if (this.f10735c0 != z) {
            this.f10735c0 = z;
            float n0 = m28287n0();
            if (!z && this.f37449E0) {
                this.f37449E0 = false;
            }
            float n02 = m28287n0();
            invalidateSelf();
            if (n0 != n02) {
                m28259w1();
            }
        }
    }

    /* renamed from: y2 */
    public void m28252y2(int i) {
        this.f37471R0 = i;
    }

    /* renamed from: z1 */
    public void m28250z1(int i) {
        m28253y1(this.f10749q0.getResources().getBoolean(i));
    }

    /* renamed from: z2 */
    public void m28249z2(ColorStateList colorStateList) {
        if (this.f37466P != colorStateList) {
            this.f37466P = colorStateList;
            m28333R2();
            onStateChange(getState());
        }
    }
}
