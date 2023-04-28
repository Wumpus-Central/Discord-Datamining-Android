package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C2733w0;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ViewDragHelper {

    /* renamed from: x */
    private static final Interpolator f3727x = new animationInterpolatorC2818a();

    /* renamed from: a */
    private int f3728a;

    /* renamed from: b */
    private int f3729b;

    /* renamed from: d */
    private float[] f3731d;

    /* renamed from: e */
    private float[] f3732e;

    /* renamed from: f */
    private float[] f3733f;

    /* renamed from: g */
    private float[] f3734g;

    /* renamed from: h */
    private int[] f3735h;

    /* renamed from: i */
    private int[] f3736i;

    /* renamed from: j */
    private int[] f3737j;

    /* renamed from: k */
    private int f3738k;

    /* renamed from: l */
    private VelocityTracker f3739l;

    /* renamed from: m */
    private float f3740m;

    /* renamed from: n */
    private float f3741n;

    /* renamed from: o */
    private int f3742o;

    /* renamed from: p */
    private final int f3743p;

    /* renamed from: q */
    private int f3744q;

    /* renamed from: r */
    private OverScroller f3745r;

    /* renamed from: s */
    private final AbstractC2820c f3746s;

    /* renamed from: t */
    private View f3747t;

    /* renamed from: u */
    private boolean f3748u;

    /* renamed from: v */
    private final ViewGroup f3749v;

    /* renamed from: c */
    private int f3730c = -1;

    /* renamed from: w */
    private final Runnable f3750w = new RunnableC2819b();

    /* renamed from: androidx.customview.widget.ViewDragHelper$a  reason: invalid class name */
    /* loaded from: classes.dex */
    class animationInterpolatorC2818a implements Interpolator {
        animationInterpolatorC2818a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$b */
    /* loaded from: classes.dex */
    class RunnableC2819b implements Runnable {
        RunnableC2819b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.m36602K(0);
        }
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2820c {
        /* renamed from: a */
        public abstract int mo28580a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo28579b(View view, int i, int i2);

        /* renamed from: c */
        public int m36568c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo28714d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo28578e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo36567f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo36566g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo36565h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo28713i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo28577j(int i);

        /* renamed from: k */
        public abstract void mo28576k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo28575l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo28574m(View view, int i);
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, AbstractC2820c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f3749v = viewGroup;
            this.f3746s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3743p = i;
            this.f3742o = i;
            this.f3729b = viewConfiguration.getScaledTouchSlop();
            this.f3740m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3741n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3745r = new OverScroller(context, f3727x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: D */
    private boolean m36609D(int i) {
        if (m36610C(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: G */
    private void m36606G() {
        this.f3739l.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f3740m);
        m36579p(m36588g(this.f3739l.getXVelocity(this.f3730c), this.f3741n, this.f3740m), m36588g(this.f3739l.getYVelocity(this.f3730c), this.f3741n, this.f3740m));
    }

    /* renamed from: H */
    private void m36605H(float f, float f2, int i) {
        boolean c = m36592c(f, f2, i, 1);
        if (m36592c(f2, f, i, 4)) {
            c |= true;
        }
        if (m36592c(f, f2, i, 2)) {
            boolean z = c ? 1 : 0;
            char c2 = c ? 1 : 0;
            c = z | true;
        }
        if (m36592c(f2, f, i, 8)) {
            boolean z2 = c ? 1 : 0;
            char c3 = c ? 1 : 0;
            c = z2 | true;
        }
        if (c) {
            int[] iArr = this.f3736i;
            int i2 = iArr[i];
            int i3 = c ? 1 : 0;
            char c4 = c ? 1 : 0;
            iArr[i] = i2 | i3;
            AbstractC2820c cVar = this.f3746s;
            int i4 = c ? 1 : 0;
            int i5 = c ? 1 : 0;
            int i6 = c ? 1 : 0;
            int i7 = c ? 1 : 0;
            cVar.mo36567f(i4, i);
        }
    }

    /* renamed from: I */
    private void m36604I(float f, float f2, int i) {
        m36576s(i);
        float[] fArr = this.f3731d;
        this.f3733f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f3732e;
        this.f3734g[i] = f2;
        fArr2[i] = f2;
        this.f3735h[i] = m36570y((int) f, (int) f2);
        this.f3738k |= 1 << i;
    }

    /* renamed from: J */
    private void m36603J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m36609D(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3733f[pointerId] = x;
                this.f3734g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m36592c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3735h[i] & i2) != i2 || (this.f3744q & i2) == 0 || (this.f3737j[i] & i2) == i2 || (this.f3736i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3729b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f3746s.mo36566g(i2)) {
            int[] iArr = this.f3737j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f3736i[i] & i2) != 0 || abs <= this.f3729b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    private boolean m36589f(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f3746s.mo28714d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f3746s.mo28578e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f3729b;
            if ((f * f) + (f2 * f2) > i * i) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > this.f3729b) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= this.f3729b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    private float m36588g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: h */
    private int m36587h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: i */
    private void m36586i() {
        float[] fArr = this.f3731d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3732e, 0.0f);
            Arrays.fill(this.f3733f, 0.0f);
            Arrays.fill(this.f3734g, 0.0f);
            Arrays.fill(this.f3735h, 0);
            Arrays.fill(this.f3736i, 0);
            Arrays.fill(this.f3737j, 0);
            this.f3738k = 0;
        }
    }

    /* renamed from: j */
    private void m36585j(int i) {
        if (this.f3731d != null && m36610C(i)) {
            this.f3731d[i] = 0.0f;
            this.f3732e[i] = 0.0f;
            this.f3733f[i] = 0.0f;
            this.f3734g[i] = 0.0f;
            this.f3735h[i] = 0;
            this.f3736i[i] = 0;
            this.f3737j[i] = 0;
            this.f3738k = (~(1 << i)) & this.f3738k;
        }
    }

    /* renamed from: k */
    private int m36584k(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f3749v.getWidth();
        float f = width / 2;
        float q = f + (m36578q(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(q / abs) * 1000.0f) * 4;
        } else {
            i4 = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: l */
    private int m36583l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int h = m36587h(i3, (int) this.f3741n, (int) this.f3740m);
        int h2 = m36587h(i4, (int) this.f3741n, (int) this.f3740m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(h);
        int abs4 = Math.abs(h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (h != 0) {
            f2 = abs3;
            f = i5;
        } else {
            f2 = abs;
            f = i6;
        }
        float f5 = f2 / f;
        if (h2 != 0) {
            f4 = abs4;
            f3 = i5;
        } else {
            f4 = abs2;
            f3 = i6;
        }
        return (int) ((m36584k(i, h, this.f3746s.mo28714d(view)) * f5) + (m36584k(i2, h2, this.f3746s.mo28578e(view)) * (f4 / f3)));
    }

    /* renamed from: n */
    public static ViewDragHelper m36581n(ViewGroup viewGroup, float f, AbstractC2820c cVar) {
        ViewDragHelper o = m36580o(viewGroup, cVar);
        o.f3729b = (int) (o.f3729b * (1.0f / f));
        return o;
    }

    /* renamed from: o */
    public static ViewDragHelper m36580o(ViewGroup viewGroup, AbstractC2820c cVar) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: p */
    private void m36579p(float f, float f2) {
        this.f3748u = true;
        this.f3746s.mo28575l(this.f3747t, f, f2);
        this.f3748u = false;
        if (this.f3728a == 1) {
            m36602K(0);
        }
    }

    /* renamed from: q */
    private float m36578q(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: r */
    private void m36577r(int i, int i2, int i3, int i4) {
        int left = this.f3747t.getLeft();
        int top = this.f3747t.getTop();
        if (i3 != 0) {
            i = this.f3746s.mo28580a(this.f3747t, i, i3);
            C2733w0.m37022a0(this.f3747t, i - left);
        }
        if (i4 != 0) {
            i2 = this.f3746s.mo28579b(this.f3747t, i2, i4);
            C2733w0.m37020b0(this.f3747t, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.f3746s.mo28576k(this.f3747t, i, i2, i - left, i2 - top);
        }
    }

    /* renamed from: s */
    private void m36576s(int i) {
        float[] fArr = this.f3731d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3732e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3733f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3734g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3735h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3736i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3737j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3731d = fArr2;
            this.f3732e = fArr3;
            this.f3733f = fArr4;
            this.f3734g = fArr5;
            this.f3735h = iArr;
            this.f3736i = iArr2;
            this.f3737j = iArr3;
        }
    }

    /* renamed from: u */
    private boolean m36574u(int i, int i2, int i3, int i4) {
        int left = this.f3747t.getLeft();
        int top = this.f3747t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3745r.abortAnimation();
            m36602K(0);
            return false;
        }
        this.f3745r.startScroll(left, top, i5, i6, m36583l(this.f3747t, i5, i6, i3, i4));
        m36602K(2);
        return true;
    }

    /* renamed from: y */
    private int m36570y(int i, int i2) {
        int i3;
        if (i < this.f3749v.getLeft() + this.f3742o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f3749v.getTop() + this.f3742o) {
            i3 |= 4;
        }
        if (i > this.f3749v.getRight() - this.f3742o) {
            i3 |= 2;
        }
        if (i2 > this.f3749v.getBottom() - this.f3742o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: A */
    public int m36612A() {
        return this.f3728a;
    }

    /* renamed from: B */
    public boolean m36611B(int i, int i2) {
        return m36608E(this.f3747t, i, i2);
    }

    /* renamed from: C */
    public boolean m36610C(int i) {
        return ((1 << i) & this.f3738k) != 0;
    }

    /* renamed from: E */
    public boolean m36608E(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public void m36607F(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m36594a();
        }
        if (this.f3739l == null) {
            this.f3739l = VelocityTracker.obtain();
        }
        this.f3739l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t = m36575t((int) x, (int) y);
            m36604I(x, y, pointerId);
            m36595R(t, pointerId);
            int i3 = this.f3735h[pointerId];
            int i4 = this.f3744q;
            if ((i3 & i4) != 0) {
                this.f3746s.mo36565h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f3728a == 1) {
                m36606G();
            }
            m36594a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3728a == 1) {
                    m36579p(0.0f, 0.0f);
                }
                m36594a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m36604I(x2, y2, pointerId2);
                if (this.f3728a == 0) {
                    m36595R(m36575t((int) x2, (int) y2), pointerId2);
                    int i5 = this.f3735h[pointerId2];
                    int i6 = this.f3744q;
                    if ((i5 & i6) != 0) {
                        this.f3746s.mo36565h(i5 & i6, pointerId2);
                    }
                } else if (m36611B((int) x2, (int) y2)) {
                    m36595R(this.f3747t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f3728a == 1 && pointerId3 == this.f3730c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f3730c) {
                            View t2 = m36575t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f3747t;
                            if (t2 == view && m36595R(view, pointerId4)) {
                                i = this.f3730c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m36606G();
                    }
                }
                m36585j(pointerId3);
            }
        } else if (this.f3728a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m36609D(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f3731d[pointerId5];
                    float f2 = y3 - this.f3732e[pointerId5];
                    m36605H(f, f2, pointerId5);
                    if (this.f3728a != 1) {
                        View t3 = m36575t((int) x3, (int) y3);
                        if (m36589f(t3, f, f2) && m36595R(t3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m36603J(motionEvent);
        } else if (m36609D(this.f3730c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3730c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f3733f;
            int i7 = this.f3730c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f3734g[i7]);
            m36577r(this.f3747t.getLeft() + i8, this.f3747t.getTop() + i9, i8, i9);
            m36603J(motionEvent);
        }
    }

    /* renamed from: K */
    void m36602K(int i) {
        this.f3749v.removeCallbacks(this.f3750w);
        if (this.f3728a != i) {
            this.f3728a = i;
            this.f3746s.mo28577j(i);
            if (this.f3728a == 0) {
                this.f3747t = null;
            }
        }
    }

    /* renamed from: L */
    public void m36601L(int i) {
        this.f3742o = i;
    }

    /* renamed from: M */
    public void m36600M(int i) {
        this.f3744q = i;
    }

    /* renamed from: N */
    public void m36599N(float f) {
        this.f3741n = f;
    }

    /* renamed from: O */
    public boolean m36598O(int i, int i2) {
        if (this.f3748u) {
            return m36574u(i, i2, (int) this.f3739l.getXVelocity(this.f3730c), (int) this.f3739l.getYVelocity(this.f3730c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m36597P(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.m36597P(android.view.MotionEvent):boolean");
    }

    /* renamed from: Q */
    public boolean m36596Q(View view, int i, int i2) {
        this.f3747t = view;
        this.f3730c = -1;
        boolean u = m36574u(i, i2, 0, 0);
        if (!u && this.f3728a == 0 && this.f3747t != null) {
            this.f3747t = null;
        }
        return u;
    }

    /* renamed from: R */
    boolean m36595R(View view, int i) {
        if (view == this.f3747t && this.f3730c == i) {
            return true;
        }
        if (view == null || !this.f3746s.mo28574m(view, i)) {
            return false;
        }
        this.f3730c = i;
        m36593b(view, i);
        return true;
    }

    /* renamed from: a */
    public void m36594a() {
        this.f3730c = -1;
        m36586i();
        VelocityTracker velocityTracker = this.f3739l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3739l = null;
        }
    }

    /* renamed from: b */
    public void m36593b(View view, int i) {
        if (view.getParent() == this.f3749v) {
            this.f3747t = view;
            this.f3730c = i;
            this.f3746s.mo28713i(view, i);
            m36602K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3749v + ")");
    }

    /* renamed from: d */
    public boolean m36591d(int i) {
        int length = this.f3731d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m36590e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m36590e(int i, int i2) {
        boolean z;
        boolean z2;
        if (!m36610C(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f3733f[i2] - this.f3731d[i2];
        float f2 = this.f3734g[i2] - this.f3732e[i2];
        if (z && z2) {
            int i3 = this.f3729b;
            if ((f * f) + (f2 * f2) > i3 * i3) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > this.f3729b) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= this.f3729b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public boolean m36582m(boolean z) {
        if (this.f3728a == 2) {
            boolean computeScrollOffset = this.f3745r.computeScrollOffset();
            int currX = this.f3745r.getCurrX();
            int currY = this.f3745r.getCurrY();
            int left = currX - this.f3747t.getLeft();
            int top = currY - this.f3747t.getTop();
            if (left != 0) {
                C2733w0.m37022a0(this.f3747t, left);
            }
            if (top != 0) {
                C2733w0.m37020b0(this.f3747t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3746s.mo28576k(this.f3747t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3745r.getFinalX() && currY == this.f3745r.getFinalY()) {
                this.f3745r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f3749v.post(this.f3750w);
                } else {
                    m36602K(0);
                }
            }
        }
        if (this.f3728a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public View m36575t(int i, int i2) {
        for (int childCount = this.f3749v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3749v.getChildAt(this.f3746s.m36568c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public View m36573v() {
        return this.f3747t;
    }

    /* renamed from: w */
    public int m36572w() {
        return this.f3743p;
    }

    /* renamed from: x */
    public int m36571x() {
        return this.f3742o;
    }

    /* renamed from: z */
    public int m36569z() {
        return this.f3729b;
    }
}
