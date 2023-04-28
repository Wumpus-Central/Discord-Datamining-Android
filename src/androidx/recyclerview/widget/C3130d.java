package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C2733w0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C3130d extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {

    /* renamed from: D */
    private static final int[] f35770D = {16842919};

    /* renamed from: E */
    private static final int[] f35771E = new int[0];

    /* renamed from: a */
    private final int f4826a;

    /* renamed from: b */
    private final int f4827b;

    /* renamed from: c */
    final StateListDrawable f4828c;

    /* renamed from: d */
    final Drawable f4829d;

    /* renamed from: e */
    private final int f4830e;

    /* renamed from: f */
    private final int f4831f;

    /* renamed from: g */
    private final StateListDrawable f4832g;

    /* renamed from: h */
    private final Drawable f4833h;

    /* renamed from: i */
    private final int f4834i;

    /* renamed from: j */
    private final int f4835j;

    /* renamed from: k */
    int f4836k;

    /* renamed from: l */
    int f4837l;

    /* renamed from: m */
    float f4838m;

    /* renamed from: n */
    int f4839n;

    /* renamed from: o */
    int f4840o;

    /* renamed from: p */
    float f4841p;

    /* renamed from: s */
    private RecyclerView f4844s;

    /* renamed from: z */
    final ValueAnimator f4851z;

    /* renamed from: q */
    private int f4842q = 0;

    /* renamed from: r */
    private int f4843r = 0;

    /* renamed from: t */
    private boolean f4845t = false;

    /* renamed from: u */
    private boolean f4846u = false;

    /* renamed from: v */
    private int f4847v = 0;

    /* renamed from: w */
    private int f4848w = 0;

    /* renamed from: x */
    private final int[] f4849x = new int[2];

    /* renamed from: y */
    private final int[] f4850y = new int[2];

    /* renamed from: A */
    int f35772A = 0;

    /* renamed from: B */
    private final Runnable f35773B = new RunnableC3131a();

    /* renamed from: C */
    private final RecyclerView.OnScrollListener f35774C = new C3132b();

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    class RunnableC3131a implements Runnable {
        RunnableC3131a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3130d.this.m35141f(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    class C3132b extends RecyclerView.OnScrollListener {
        C3132b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C3130d.this.m35131p(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private class C3133c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4854a = false;

        C3133c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4854a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4854a) {
                this.f4854a = false;
            } else if (((Float) C3130d.this.f4851z.getAnimatedValue()).floatValue() == 0.0f) {
                C3130d dVar = C3130d.this;
                dVar.f35772A = 0;
                dVar.m35133n(0);
            } else {
                C3130d dVar2 = C3130d.this;
                dVar2.f35772A = 2;
                dVar2.m35136k();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    private class C0064d implements ValueAnimator.AnimatorUpdateListener {
        C0064d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C3130d.this.f4828c.setAlpha(floatValue);
            C3130d.this.f4829d.setAlpha(floatValue);
            C3130d.this.m35136k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3130d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4851z = ofFloat;
        this.f4828c = stateListDrawable;
        this.f4829d = drawable;
        this.f4832g = stateListDrawable2;
        this.f4833h = drawable2;
        this.f4830e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4831f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4834i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4835j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4826a = i2;
        this.f4827b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C3133c());
        ofFloat.addUpdateListener(new C0064d());
        attachToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    private void m35146a() {
        this.f4844s.removeCallbacks(this.f35773B);
    }

    /* renamed from: b */
    private void m35145b(Canvas canvas) {
        int i = this.f4843r;
        int i2 = this.f4834i;
        int i3 = i - i2;
        int i4 = this.f4840o;
        int i5 = this.f4839n;
        int i6 = i4 - (i5 / 2);
        this.f4832g.setBounds(0, 0, i5, i2);
        this.f4833h.setBounds(0, 0, this.f4842q, this.f4835j);
        canvas.translate(0.0f, i3);
        this.f4833h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f4832g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: c */
    private void m35144c(Canvas canvas) {
        int i = this.f4842q;
        int i2 = this.f4830e;
        int i3 = i - i2;
        int i4 = this.f4837l;
        int i5 = this.f4836k;
        int i6 = i4 - (i5 / 2);
        this.f4828c.setBounds(0, 0, i2, i5);
        this.f4829d.setBounds(0, 0, this.f4831f, this.f4843r);
        if (m35139h()) {
            this.f4829d.draw(canvas);
            canvas.translate(this.f4830e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4828c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f4830e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.f4829d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.f4828c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    /* renamed from: d */
    private int[] m35143d() {
        int[] iArr = this.f4850y;
        int i = this.f4827b;
        iArr[0] = i;
        iArr[1] = this.f4842q - i;
        return iArr;
    }

    private void destroyCallbacks() {
        this.f4844s.removeItemDecoration(this);
        this.f4844s.removeOnItemTouchListener(this);
        this.f4844s.removeOnScrollListener(this.f35774C);
        m35146a();
    }

    /* renamed from: e */
    private int[] m35142e() {
        int[] iArr = this.f4849x;
        int i = this.f4827b;
        iArr[0] = i;
        iArr[1] = this.f4843r - i;
        return iArr;
    }

    /* renamed from: g */
    private void m35140g(float f) {
        int[] d = m35143d();
        float max = Math.max(d[0], Math.min(d[1], f));
        if (Math.abs(this.f4840o - max) >= 2.0f) {
            int m = m35134m(this.f4841p, max, d, this.f4844s.computeHorizontalScrollRange(), this.f4844s.computeHorizontalScrollOffset(), this.f4842q);
            if (m != 0) {
                this.f4844s.scrollBy(m, 0);
            }
            this.f4841p = max;
        }
    }

    /* renamed from: h */
    private boolean m35139h() {
        return C2733w0.m37063B(this.f4844s) == 1;
    }

    /* renamed from: l */
    private void m35135l(int i) {
        m35146a();
        this.f4844s.postDelayed(this.f35773B, i);
    }

    /* renamed from: m */
    private int m35134m(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: q */
    private void m35130q(float f) {
        int[] e = m35142e();
        float max = Math.max(e[0], Math.min(e[1], f));
        if (Math.abs(this.f4837l - max) >= 2.0f) {
            int m = m35134m(this.f4838m, max, e, this.f4844s.computeVerticalScrollRange(), this.f4844s.computeVerticalScrollOffset(), this.f4843r);
            if (m != 0) {
                this.f4844s.scrollBy(0, m);
            }
            this.f4838m = max;
        }
    }

    private void setupCallbacks() {
        this.f4844s.addItemDecoration(this);
        this.f4844s.addOnItemTouchListener(this);
        this.f4844s.addOnScrollListener(this.f35774C);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4844s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.f4844s = recyclerView;
            if (recyclerView != null) {
                setupCallbacks();
            }
        }
    }

    /* renamed from: f */
    void m35141f(int i) {
        int i2 = this.f35772A;
        if (i2 == 1) {
            this.f4851z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f35772A = 3;
        ValueAnimator valueAnimator = this.f4851z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4851z.setDuration(i);
        this.f4851z.start();
    }

    /* renamed from: i */
    boolean m35138i(float f, float f2) {
        if (f2 >= this.f4843r - this.f4834i) {
            int i = this.f4840o;
            int i2 = this.f4839n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    boolean m35137j(float f, float f2) {
        if (!m35139h() ? f >= this.f4842q - this.f4830e : f <= this.f4830e) {
            int i = this.f4837l;
            int i2 = this.f4836k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    void m35136k() {
        this.f4844s.invalidate();
    }

    /* renamed from: n */
    void m35133n(int i) {
        if (i == 2 && this.f4847v != 2) {
            this.f4828c.setState(f35770D);
            m35146a();
        }
        if (i == 0) {
            m35136k();
        } else {
            m35132o();
        }
        if (this.f4847v == 2 && i != 2) {
            this.f4828c.setState(f35771E);
            m35135l(1200);
        } else if (i == 1) {
            m35135l(1500);
        }
        this.f4847v = i;
    }

    /* renamed from: o */
    public void m35132o() {
        int i = this.f35772A;
        if (i != 0) {
            if (i == 3) {
                this.f4851z.cancel();
            } else {
                return;
            }
        }
        this.f35772A = 1;
        ValueAnimator valueAnimator = this.f4851z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4851z.setDuration(500L);
        this.f4851z.setStartDelay(0L);
        this.f4851z.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f4842q != this.f4844s.getWidth() || this.f4843r != this.f4844s.getHeight()) {
            this.f4842q = this.f4844s.getWidth();
            this.f4843r = this.f4844s.getHeight();
            m35133n(0);
        } else if (this.f35772A != 0) {
            if (this.f4845t) {
                m35144c(canvas);
            }
            if (this.f4846u) {
                m35145b(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4847v;
        if (i == 1) {
            boolean j = m35137j(motionEvent.getX(), motionEvent.getY());
            boolean i2 = m35138i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!j && !i2) {
                return false;
            }
            if (i2) {
                this.f4848w = 1;
                this.f4841p = (int) motionEvent.getX();
            } else if (j) {
                this.f4848w = 2;
                this.f4838m = (int) motionEvent.getY();
            }
            m35133n(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4847v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean j = m35137j(motionEvent.getX(), motionEvent.getY());
                boolean i = m35138i(motionEvent.getX(), motionEvent.getY());
                if (j || i) {
                    if (i) {
                        this.f4848w = 1;
                        this.f4841p = (int) motionEvent.getX();
                    } else if (j) {
                        this.f4848w = 2;
                        this.f4838m = (int) motionEvent.getY();
                    }
                    m35133n(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4847v == 2) {
                this.f4838m = 0.0f;
                this.f4841p = 0.0f;
                m35133n(1);
                this.f4848w = 0;
            } else if (motionEvent.getAction() == 2 && this.f4847v == 2) {
                m35132o();
                if (this.f4848w == 1) {
                    m35140g(motionEvent.getX());
                }
                if (this.f4848w == 2) {
                    m35130q(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: p */
    void m35131p(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f4844s.computeVerticalScrollRange();
        int i3 = this.f4843r;
        if (computeVerticalScrollRange - i3 <= 0 || i3 < this.f4826a) {
            z = false;
        } else {
            z = true;
        }
        this.f4845t = z;
        int computeHorizontalScrollRange = this.f4844s.computeHorizontalScrollRange();
        int i4 = this.f4842q;
        if (computeHorizontalScrollRange - i4 <= 0 || i4 < this.f4826a) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f4846u = z2;
        boolean z3 = this.f4845t;
        if (z3 || z2) {
            if (z3) {
                float f = i3;
                this.f4837l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
                this.f4836k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f4846u) {
                float f2 = i4;
                this.f4840o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
                this.f4839n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f4847v;
            if (i5 == 0 || i5 == 1) {
                m35133n(1);
            }
        } else if (this.f4847v != 0) {
            m35133n(0);
        }
    }
}
