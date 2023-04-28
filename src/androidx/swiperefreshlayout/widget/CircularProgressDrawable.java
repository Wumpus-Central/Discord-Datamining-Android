package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C2517g;
import p237n1.C10690b;

/* loaded from: classes.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {

    /* renamed from: q */
    private static final Interpolator f4922q = new LinearInterpolator();

    /* renamed from: r */
    private static final Interpolator f4923r = new C10690b();

    /* renamed from: s */
    private static final int[] f4924s = {-16777216};

    /* renamed from: k */
    private final C3165c f4925k;

    /* renamed from: l */
    private float f4926l;

    /* renamed from: m */
    private Resources f4927m;

    /* renamed from: n */
    private Animator f4928n;

    /* renamed from: o */
    float f4929o;

    /* renamed from: p */
    boolean f4930p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$a */
    /* loaded from: classes.dex */
    public class C3163a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C3165c f4931a;

        C3163a(C3165c cVar) {
            this.f4931a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.m35016n(floatValue, this.f4931a);
            CircularProgressDrawable.this.m35028b(floatValue, this.f4931a, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$b */
    /* loaded from: classes.dex */
    public class C3164b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C3165c f4933a;

        C3164b(C3165c cVar) {
            this.f4933a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.m35028b(1.0f, this.f4933a, true);
            this.f4933a.m35015A();
            this.f4933a.m35003l();
            CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
            if (circularProgressDrawable.f4930p) {
                circularProgressDrawable.f4930p = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f4933a.m34991x(false);
                return;
            }
            circularProgressDrawable.f4929o += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.f4929o = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$c */
    /* loaded from: classes.dex */
    public static class C3165c {

        /* renamed from: b */
        final Paint f4936b;

        /* renamed from: c */
        final Paint f4937c;

        /* renamed from: d */
        final Paint f4938d;

        /* renamed from: i */
        int[] f4943i;

        /* renamed from: j */
        int f4944j;

        /* renamed from: k */
        float f4945k;

        /* renamed from: l */
        float f4946l;

        /* renamed from: m */
        float f4947m;

        /* renamed from: n */
        boolean f4948n;

        /* renamed from: o */
        Path f4949o;

        /* renamed from: q */
        float f4951q;

        /* renamed from: r */
        int f4952r;

        /* renamed from: s */
        int f4953s;

        /* renamed from: u */
        int f4955u;

        /* renamed from: a */
        final RectF f4935a = new RectF();

        /* renamed from: e */
        float f4939e = 0.0f;

        /* renamed from: f */
        float f4940f = 0.0f;

        /* renamed from: g */
        float f4941g = 0.0f;

        /* renamed from: h */
        float f4942h = 5.0f;

        /* renamed from: p */
        float f4950p = 1.0f;

        /* renamed from: t */
        int f4954t = 255;

        C3165c() {
            Paint paint = new Paint();
            this.f4936b = paint;
            Paint paint2 = new Paint();
            this.f4937c = paint2;
            Paint paint3 = new Paint();
            this.f4938d = paint3;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m35015A() {
            this.f4945k = this.f4939e;
            this.f4946l = this.f4940f;
            this.f4947m = this.f4941g;
        }

        /* renamed from: a */
        void m35014a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4935a;
            float f = this.f4951q;
            float f2 = (this.f4942h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f4952r * this.f4950p) / 2.0f, this.f4942h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f4939e;
            float f4 = this.f4941g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f4940f + f4) * 360.0f) - f5;
            this.f4936b.setColor(this.f4955u);
            this.f4936b.setAlpha(this.f4954t);
            float f7 = this.f4942h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4938d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f4936b);
            m35013b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        void m35013b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f4948n) {
                Path path = this.f4949o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4949o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f4949o.moveTo(0.0f, 0.0f);
                this.f4949o.lineTo(this.f4952r * this.f4950p, 0.0f);
                Path path3 = this.f4949o;
                float f3 = this.f4950p;
                path3.lineTo((this.f4952r * f3) / 2.0f, this.f4953s * f3);
                this.f4949o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f4952r * this.f4950p) / 2.0f), rectF.centerY() + (this.f4942h / 2.0f));
                this.f4949o.close();
                this.f4937c.setColor(this.f4955u);
                this.f4937c.setAlpha(this.f4954t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4949o, this.f4937c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m35012c() {
            return this.f4954t;
        }

        /* renamed from: d */
        float m35011d() {
            return this.f4940f;
        }

        /* renamed from: e */
        int m35010e() {
            return this.f4943i[m35009f()];
        }

        /* renamed from: f */
        int m35009f() {
            return (this.f4944j + 1) % this.f4943i.length;
        }

        /* renamed from: g */
        float m35008g() {
            return this.f4939e;
        }

        /* renamed from: h */
        int m35007h() {
            return this.f4943i[this.f4944j];
        }

        /* renamed from: i */
        float m35006i() {
            return this.f4946l;
        }

        /* renamed from: j */
        float m35005j() {
            return this.f4947m;
        }

        /* renamed from: k */
        float m35004k() {
            return this.f4945k;
        }

        /* renamed from: l */
        void m35003l() {
            m34995t(m35009f());
        }

        /* renamed from: m */
        void m35002m() {
            this.f4945k = 0.0f;
            this.f4946l = 0.0f;
            this.f4947m = 0.0f;
            m34990y(0.0f);
            m34993v(0.0f);
            m34992w(0.0f);
        }

        /* renamed from: n */
        void m35001n(int i) {
            this.f4954t = i;
        }

        /* renamed from: o */
        void m35000o(float f, float f2) {
            this.f4952r = (int) f;
            this.f4953s = (int) f2;
        }

        /* renamed from: p */
        void m34999p(float f) {
            if (f != this.f4950p) {
                this.f4950p = f;
            }
        }

        /* renamed from: q */
        void m34998q(float f) {
            this.f4951q = f;
        }

        /* renamed from: r */
        void m34997r(int i) {
            this.f4955u = i;
        }

        /* renamed from: s */
        void m34996s(ColorFilter colorFilter) {
            this.f4936b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m34995t(int i) {
            this.f4944j = i;
            this.f4955u = this.f4943i[i];
        }

        /* renamed from: u */
        void m34994u(int[] iArr) {
            this.f4943i = iArr;
            m34995t(0);
        }

        /* renamed from: v */
        void m34993v(float f) {
            this.f4940f = f;
        }

        /* renamed from: w */
        void m34992w(float f) {
            this.f4941g = f;
        }

        /* renamed from: x */
        void m34991x(boolean z) {
            if (this.f4948n != z) {
                this.f4948n = z;
            }
        }

        /* renamed from: y */
        void m34990y(float f) {
            this.f4939e = f;
        }

        /* renamed from: z */
        void m34989z(float f) {
            this.f4942h = f;
            this.f4936b.setStrokeWidth(f);
        }
    }

    public CircularProgressDrawable(Context context) {
        this.f4927m = ((Context) C2517g.m37588g(context)).getResources();
        C3165c cVar = new C3165c();
        this.f4925k = cVar;
        cVar.m34994u(f4924s);
        m35019k(2.5f);
        m35017m();
    }

    /* renamed from: a */
    private void m35029a(float f, C3165c cVar) {
        m35016n(f, cVar);
        cVar.m34990y(cVar.m35004k() + (((cVar.m35006i() - 0.01f) - cVar.m35004k()) * f));
        cVar.m34993v(cVar.m35006i());
        cVar.m34992w(cVar.m35005j() + ((((float) (Math.floor(cVar.m35005j() / 0.8f) + 1.0d)) - cVar.m35005j()) * f));
    }

    /* renamed from: c */
    private int m35027c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* renamed from: h */
    private void m35022h(float f) {
        this.f4926l = f;
    }

    /* renamed from: i */
    private void m35021i(float f, float f2, float f3, float f4) {
        C3165c cVar = this.f4925k;
        float f5 = this.f4927m.getDisplayMetrics().density;
        cVar.m34989z(f2 * f5);
        cVar.m34998q(f * f5);
        cVar.m34995t(0);
        cVar.m35000o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m35017m() {
        C3165c cVar = this.f4925k;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C3163a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4922q);
        ofFloat.addListener(new C3164b(cVar));
        this.f4928n = ofFloat;
    }

    /* renamed from: b */
    void m35028b(float f, C3165c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f4930p) {
            m35029a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.m35005j();
            if (f < 0.5f) {
                f2 = cVar.m35004k();
                f3 = (f4923r.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.m35004k() + 0.79f;
                f2 = k - (((1.0f - f4923r.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = k;
            }
            cVar.m34990y(f2);
            cVar.m34993v(f3);
            cVar.m34992w(j + (0.20999998f * f));
            m35022h((f + this.f4929o) * 216.0f);
        }
    }

    /* renamed from: d */
    public void m35026d(boolean z) {
        this.f4925k.m34991x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4926l, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4925k.m35014a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m35025e(float f) {
        this.f4925k.m34999p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m35024f(int... iArr) {
        this.f4925k.m34994u(iArr);
        this.f4925k.m34995t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m35023g(float f) {
        this.f4925k.m34992w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4925k.m35012c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4928n.isRunning();
    }

    /* renamed from: j */
    public void m35020j(float f, float f2) {
        this.f4925k.m34990y(f);
        this.f4925k.m34993v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m35019k(float f) {
        this.f4925k.m34989z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m35018l(int i) {
        if (i == 0) {
            m35021i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m35021i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: n */
    void m35016n(float f, C3165c cVar) {
        if (f > 0.75f) {
            cVar.m34997r(m35027c((f - 0.75f) / 0.25f, cVar.m35007h(), cVar.m35010e()));
        } else {
            cVar.m34997r(cVar.m35007h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f4925k.m35001n(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4925k.m34996s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4928n.cancel();
        this.f4925k.m35015A();
        if (this.f4925k.m35011d() != this.f4925k.m35008g()) {
            this.f4930p = true;
            this.f4928n.setDuration(666L);
            this.f4928n.start();
            return;
        }
        this.f4925k.m34995t(0);
        this.f4925k.m35002m();
        this.f4928n.setDuration(1332L);
        this.f4928n.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4928n.cancel();
        m35022h(0.0f);
        this.f4925k.m34991x(false);
        this.f4925k.m34995t(0);
        this.f4925k.m35002m();
        invalidateSelf();
    }
}
