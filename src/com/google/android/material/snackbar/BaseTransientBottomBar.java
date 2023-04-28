package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2733w0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C5665o;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C5709b;
import java.util.List;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6812k;
import p102fb.C7101a;
import p366ub.C13242c;
import p462zb.C14615a;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    private final ViewGroup f11150a;

    /* renamed from: b */
    protected final C5706o f11151b;

    /* renamed from: c */
    private final AbstractC5708a f11152c;

    /* renamed from: d */
    private boolean f11153d;

    /* renamed from: e */
    private final Runnable f11154e;

    /* renamed from: f */
    private int f11155f;

    /* renamed from: g */
    private int f11156g;

    /* renamed from: h */
    private int f11157h;

    /* renamed from: i */
    private int f11158i;

    /* renamed from: j */
    private int f11159j;

    /* renamed from: k */
    private boolean f11160k;

    /* renamed from: l */
    private List<AbstractC5704m<B>> f11161l;

    /* renamed from: m */
    private Behavior f11162m;

    /* renamed from: n */
    private final AccessibilityManager f11163n;

    /* renamed from: o */
    C5709b.AbstractC0161b f11164o;

    /* renamed from: q */
    private static final boolean f11147q = false;

    /* renamed from: r */
    private static final int[] f11148r = {C6803b.f37983C};

    /* renamed from: s */
    private static final String f11149s = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: p */
    static final Handler f11146p = new Handler(Looper.getMainLooper(), new C5699h());

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C5705n f11165k = new C5705n(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public void m27690P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f11165k.m27682c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo27692E(View view) {
            return this.f11165k.m27684a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: k */
        public boolean mo27689k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f11165k.m27683b(coordinatorLayout, view, motionEvent);
            return super.mo27689k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes3.dex */
    public class C5692a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f11166a;

        C5692a(int i) {
            this.f11166a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m27698u(this.f11166a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes3.dex */
    public class C5693b implements ValueAnimator.AnimatorUpdateListener {
        C5693b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f11151b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes3.dex */
    public class C5694c implements ValueAnimator.AnimatorUpdateListener {
        C5694c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f11151b.setScaleX(floatValue);
            BaseTransientBottomBar.this.f11151b.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: classes3.dex */
    public class C5695d extends AnimatorListenerAdapter {
        C5695d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m27697v();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11152c.mo27675a(70, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes3.dex */
    public class C5696e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f11171a;

        /* renamed from: b */
        final /* synthetic */ int f11172b;

        C5696e(int i) {
            this.f11172b = i;
            this.f11171a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f11147q) {
                C2733w0.m37020b0(BaseTransientBottomBar.this.f11151b, intValue - this.f11171a);
            } else {
                BaseTransientBottomBar.this.f11151b.setTranslationY(intValue);
            }
            this.f11171a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: classes3.dex */
    public class C5697f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f11174a;

        C5697f(int i) {
            this.f11174a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m27698u(this.f11174a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11152c.mo27674b(0, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: classes3.dex */
    public class C5698g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f11176a = 0;

        C5698g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f11147q) {
                C2733w0.m37020b0(BaseTransientBottomBar.this.f11151b, intValue - this.f11176a);
            } else {
                BaseTransientBottomBar.this.f11151b.setTranslationY(intValue);
            }
            this.f11176a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: classes3.dex */
    class C5699h implements Handler.Callback {
        C5699h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).m27725A();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).m27704o(message.arg1);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: classes3.dex */
    public class RunnableC5700i implements Runnable {
        RunnableC5700i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m27698u(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: classes3.dex */
    public class C5701j implements SwipeDismissBehavior.AbstractC5518c {
        C5701j() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC5518c
        /* renamed from: a */
        public void mo27688a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m27710i(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC5518c
        /* renamed from: b */
        public void mo27687b(int i) {
            if (i == 0) {
                C5709b.m27671c().m27663k(BaseTransientBottomBar.this.f11164o);
            } else if (i == 1 || i == 2) {
                C5709b.m27671c().m27664j(BaseTransientBottomBar.this.f11164o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: classes3.dex */
    public class RunnableC5702k implements Runnable {
        RunnableC5702k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5706o oVar = BaseTransientBottomBar.this.f11151b;
            if (oVar != null) {
                if (oVar.getParent() != null) {
                    BaseTransientBottomBar.this.f11151b.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f11151b.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.m27723C();
                } else {
                    BaseTransientBottomBar.this.m27721E();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    /* loaded from: classes3.dex */
    public class C5703l extends AnimatorListenerAdapter {
        C5703l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m27697v();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC5704m<B> {
        /* renamed from: a */
        public void m27686a(B b, int i) {
        }

        /* renamed from: b */
        public void m27685b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: classes3.dex */
    public static class C5705n {

        /* renamed from: a */
        private C5709b.AbstractC0161b f11182a;

        public C5705n(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m28717L(0.1f);
            swipeDismissBehavior.m28719J(0.6f);
            swipeDismissBehavior.m28716M(0);
        }

        /* renamed from: a */
        public boolean m27684a(View view) {
            return view instanceof C5706o;
        }

        /* renamed from: b */
        public void m27683b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C5709b.m27671c().m27663k(this.f11182a);
                }
            } else if (coordinatorLayout.m38705v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C5709b.m27671c().m27664j(this.f11182a);
            }
        }

        /* renamed from: c */
        public void m27682c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f11182a = baseTransientBottomBar.f11164o;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: classes3.dex */
    public static class C5706o extends FrameLayout {

        /* renamed from: u */
        private static final View.OnTouchListener f11183u = new View$OnTouchListenerC5707a();

        /* renamed from: k */
        private BaseTransientBottomBar<?> f11184k;

        /* renamed from: l */
        private int f11185l;

        /* renamed from: m */
        private final float f11186m;

        /* renamed from: n */
        private final float f11187n;

        /* renamed from: o */
        private final int f11188o;

        /* renamed from: p */
        private final int f11189p;

        /* renamed from: q */
        private ColorStateList f11190q;

        /* renamed from: r */
        private PorterDuff.Mode f11191r;

        /* renamed from: s */
        private Rect f11192s;

        /* renamed from: t */
        private boolean f11193t;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o$a */
        /* loaded from: classes3.dex */
        class View$OnTouchListenerC5707a implements View.OnTouchListener {
            View$OnTouchListenerC5707a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public C5706o(Context context, AttributeSet attributeSet) {
            super(C14615a.m126c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6812k.f38140N4);
            int i = C6812k.f38196U4;
            if (obtainStyledAttributes.hasValue(i)) {
                C2733w0.m36974y0(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f11185l = obtainStyledAttributes.getInt(C6812k.f38164Q4, 0);
            this.f11186m = obtainStyledAttributes.getFloat(C6812k.f38172R4, 1.0f);
            setBackgroundTintList(C13242c.m4241a(context2, obtainStyledAttributes, C6812k.f38180S4));
            setBackgroundTintMode(C5665o.m27825f(obtainStyledAttributes.getInt(C6812k.f38188T4, -1), PorterDuff.Mode.SRC_IN));
            this.f11187n = obtainStyledAttributes.getFloat(C6812k.f38156P4, 1.0f);
            this.f11188o = obtainStyledAttributes.getDimensionPixelSize(C6812k.f38148O4, -1);
            this.f11189p = obtainStyledAttributes.getDimensionPixelSize(C6812k.f38204V4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f11183u);
            setFocusable(true);
            if (getBackground() == null) {
                C2733w0.m36982u0(this, m27679c());
            }
        }

        /* renamed from: c */
        private Drawable m27679c() {
            float dimension = getResources().getDimension(C6805d.f38010R);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C10395a.m13512i(this, C6803b.f14539m, C6803b.f14536j, getBackgroundOverlayColorAlpha()));
            if (this.f11190q == null) {
                return C2400a.m37825r(gradientDrawable);
            }
            Drawable r = C2400a.m37825r(gradientDrawable);
            C2400a.m37828o(r, this.f11190q);
            return r;
        }

        /* renamed from: d */
        private void m27678d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f11192s = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f11184k = baseTransientBottomBar;
        }

        /* renamed from: b */
        void m27680b(ViewGroup viewGroup) {
            this.f11193t = true;
            viewGroup.addView(this);
            this.f11193t = false;
        }

        float getActionTextColorAlpha() {
            return this.f11187n;
        }

        int getAnimationMode() {
            return this.f11185l;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f11186m;
        }

        int getMaxInlineActionWidth() {
            return this.f11189p;
        }

        int getMaxWidth() {
            return this.f11188o;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f11184k;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m27701r();
            }
            C2733w0.m36996n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f11184k;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m27700s();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f11184k;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m27699t();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f11188o > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f11188o;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        void setAnimationMode(int i) {
            this.f11185l = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f11190q == null)) {
                drawable = C2400a.m37825r(drawable.mutate());
                C2400a.m37828o(drawable, this.f11190q);
                C2400a.m37827p(drawable, this.f11191r);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f11190q = colorStateList;
            if (getBackground() != null) {
                Drawable r = C2400a.m37825r(getBackground().mutate());
                C2400a.m37828o(r, colorStateList);
                C2400a.m37827p(r, this.f11191r);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f11191r = mode;
            if (getBackground() != null) {
                Drawable r = C2400a.m37825r(getBackground().mutate());
                C2400a.m37827p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f11193t && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                m27678d((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f11184k;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.m27719G();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f11183u;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: B */
    private void m27724B() {
        if (m27694y()) {
            m27713f();
            return;
        }
        if (this.f11151b.getParent() != null) {
            this.f11151b.setVisibility(0);
        }
        m27697v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m27723C() {
        ValueAnimator j = m27709j(0.0f, 1.0f);
        ValueAnimator m = m27706m(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(j, m);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C5703l());
        animatorSet.start();
    }

    /* renamed from: D */
    private void m27722D(int i) {
        ValueAnimator j = m27709j(1.0f, 0.0f);
        j.setDuration(75L);
        j.addListener(new C5692a(i));
        j.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m27721E() {
        int n = m27705n();
        if (f11147q) {
            C2733w0.m37020b0(this.f11151b, n);
        } else {
            this.f11151b.setTranslationY(n);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(n, 0);
        valueAnimator.setInterpolator(C7101a.f15487b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C5695d());
        valueAnimator.addUpdateListener(new C5696e(n));
        valueAnimator.start();
    }

    /* renamed from: F */
    private void m27720F(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m27705n());
        valueAnimator.setInterpolator(C7101a.f15487b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C5697f(i));
        valueAnimator.addUpdateListener(new C5698g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m27719G() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.f11151b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f11151b.f11192s == null) {
            Log.w(f11149s, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.f11151b.getParent() != null) {
            if (m27708k() != null) {
                i = this.f11159j;
            } else {
                i = this.f11155f;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f11151b.f11192s.bottom + i;
            marginLayoutParams.leftMargin = this.f11151b.f11192s.left + this.f11156g;
            marginLayoutParams.rightMargin = this.f11151b.f11192s.right + this.f11157h;
            marginLayoutParams.topMargin = this.f11151b.f11192s.top;
            this.f11151b.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && m27693z()) {
                this.f11151b.removeCallbacks(this.f11154e);
                this.f11151b.post(this.f11154e);
            }
        }
    }

    /* renamed from: g */
    private void m27712g(int i) {
        if (this.f11151b.getAnimationMode() == 1) {
            m27722D(i);
        } else {
            m27720F(i);
        }
    }

    /* renamed from: h */
    private int m27711h() {
        if (m27708k() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        m27708k().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f11150a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f11150a.getHeight()) - i;
    }

    /* renamed from: j */
    private ValueAnimator m27709j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7101a.f15486a);
        ofFloat.addUpdateListener(new C5693b());
        return ofFloat;
    }

    /* renamed from: m */
    private ValueAnimator m27706m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7101a.f15489d);
        ofFloat.addUpdateListener(new C5694c());
        return ofFloat;
    }

    /* renamed from: n */
    private int m27705n() {
        int height = this.f11151b.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f11151b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* renamed from: q */
    private boolean m27702q() {
        ViewGroup.LayoutParams layoutParams = this.f11151b.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C2155f) || !(((CoordinatorLayout.C2155f) layoutParams).m38683f() instanceof SwipeDismissBehavior)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private void m27696w() {
        this.f11159j = m27711h();
        m27719G();
    }

    /* renamed from: x */
    private void m27695x(CoordinatorLayout.C2155f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f11162m;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = m27707l();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m27690P(this);
        }
        swipeDismissBehavior.m28718K(new C5701j());
        fVar.m38674o(swipeDismissBehavior);
        if (m27708k() == null) {
            fVar.f3002g = 80;
        }
    }

    /* renamed from: z */
    private boolean m27693z() {
        return this.f11158i > 0 && !this.f11153d && m27702q();
    }

    /* renamed from: A */
    final void m27725A() {
        if (this.f11151b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f11151b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2155f) {
                m27695x((CoordinatorLayout.C2155f) layoutParams);
            }
            this.f11151b.m27680b(this.f11150a);
            m27696w();
            this.f11151b.setVisibility(4);
        }
        if (C2733w0.m37029U(this.f11151b)) {
            m27724B();
        } else {
            this.f11160k = true;
        }
    }

    /* renamed from: f */
    void m27713f() {
        this.f11151b.post(new RunnableC5702k());
    }

    /* renamed from: i */
    protected void m27710i(int i) {
        C5709b.m27671c().m27672b(this.f11164o, i);
    }

    /* renamed from: k */
    public View m27708k() {
        return null;
    }

    /* renamed from: l */
    protected SwipeDismissBehavior<? extends View> m27707l() {
        return new Behavior();
    }

    /* renamed from: o */
    final void m27704o(int i) {
        if (!m27694y() || this.f11151b.getVisibility() != 0) {
            m27698u(i);
        } else {
            m27712g(i);
        }
    }

    /* renamed from: p */
    public boolean m27703p() {
        return C5709b.m27671c().m27669e(this.f11164o);
    }

    /* renamed from: r */
    void m27701r() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f11151b.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            this.f11158i = i;
            m27719G();
        }
    }

    /* renamed from: s */
    void m27700s() {
        if (m27703p()) {
            f11146p.post(new RunnableC5700i());
        }
    }

    /* renamed from: t */
    void m27699t() {
        if (this.f11160k) {
            m27724B();
            this.f11160k = false;
        }
    }

    /* renamed from: u */
    void m27698u(int i) {
        C5709b.m27671c().m27666h(this.f11164o);
        List<AbstractC5704m<B>> list = this.f11161l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11161l.get(size).m27686a(this, i);
            }
        }
        ViewParent parent = this.f11151b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f11151b);
        }
    }

    /* renamed from: v */
    void m27697v() {
        C5709b.m27671c().m27665i(this.f11164o);
        List<AbstractC5704m<B>> list = this.f11161l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11161l.get(size).m27685b(this);
            }
        }
    }

    /* renamed from: y */
    boolean m27694y() {
        AccessibilityManager accessibilityManager = this.f11163n;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }
}
