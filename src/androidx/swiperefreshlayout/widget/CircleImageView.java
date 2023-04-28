package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C2733w0;
import p357u1.C13177a;

/* loaded from: classes.dex */
class CircleImageView extends ImageView {

    /* renamed from: k */
    private Animation.AnimationListener f4916k;

    /* renamed from: l */
    private int f4917l;

    /* renamed from: m */
    private int f4918m;

    /* renamed from: androidx.swiperefreshlayout.widget.CircleImageView$a */
    /* loaded from: classes.dex */
    private static class C3162a extends OvalShape {

        /* renamed from: k */
        private Paint f4919k = new Paint();

        /* renamed from: l */
        private int f4920l;

        /* renamed from: m */
        private CircleImageView f4921m;

        C3162a(CircleImageView circleImageView, int i) {
            this.f4921m = circleImageView;
            this.f4920l = i;
            m35030a((int) rect().width());
        }

        /* renamed from: a */
        private void m35030a(int i) {
            float f = i / 2;
            this.f4919k.setShader(new RadialGradient(f, f, this.f4920l, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.f4921m.getWidth() / 2;
            float height = this.f4921m.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f4919k);
            canvas.drawCircle(width2, height, width - this.f4920l, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m35030a((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircleImageView(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f4917l = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C13177a.f29537f);
        this.f4918m = obtainStyledAttributes.getColor(C13177a.f29538g, -328966);
        obtainStyledAttributes.recycle();
        if (m35032a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C2733w0.m36974y0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C3162a(this, this.f4917l));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f4917l, i2, i, 503316480);
            int i3 = this.f4917l;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f4918m);
        C2733w0.m36982u0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m35032a() {
        return true;
    }

    /* renamed from: b */
    public void m35031b(Animation.AnimationListener animationListener) {
        this.f4916k = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4916k;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4916k;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m35032a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f4917l * 2), getMeasuredHeight() + (this.f4917l * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f4918m = i;
        }
    }
}
