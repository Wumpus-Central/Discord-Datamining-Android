package com.google.android.exoplayer2.p049ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.p049ui.AbstractC5281h;
import com.google.android.exoplayer2.p049ui.DefaultTimeBar;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p042c9.C3792l;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar */
/* loaded from: classes5.dex */
public class DefaultTimeBar extends View implements AbstractC5281h {

    /* renamed from: A */
    private final int f37296A;

    /* renamed from: B */
    private final int f37297B;

    /* renamed from: C */
    private final int f37298C;

    /* renamed from: D */
    private final int f37299D;

    /* renamed from: E */
    private final StringBuilder f37300E;

    /* renamed from: F */
    private final Formatter f37301F;

    /* renamed from: G */
    private final Runnable f37302G;

    /* renamed from: H */
    private final CopyOnWriteArraySet<AbstractC5281h.AbstractC5282a> f37303H;

    /* renamed from: I */
    private final Point f37304I;

    /* renamed from: J */
    private final float f37305J;

    /* renamed from: K */
    private int f37306K;

    /* renamed from: L */
    private long f37307L;

    /* renamed from: M */
    private int f37308M;

    /* renamed from: N */
    private Rect f37309N;

    /* renamed from: O */
    private ValueAnimator f37310O;

    /* renamed from: P */
    private float f37311P;

    /* renamed from: Q */
    private boolean f37312Q;

    /* renamed from: R */
    private boolean f37313R;

    /* renamed from: S */
    private long f37314S;

    /* renamed from: T */
    private long f37315T;

    /* renamed from: U */
    private long f37316U;

    /* renamed from: V */
    private long f37317V;

    /* renamed from: W */
    private int f37318W;

    /* renamed from: a0 */
    private long[] f9566a0;

    /* renamed from: b0 */
    private boolean[] f9567b0;

    /* renamed from: k */
    private final Rect f9568k;

    /* renamed from: l */
    private final Rect f9569l;

    /* renamed from: m */
    private final Rect f9570m;

    /* renamed from: n */
    private final Rect f9571n;

    /* renamed from: o */
    private final Paint f9572o;

    /* renamed from: p */
    private final Paint f9573p;

    /* renamed from: q */
    private final Paint f9574q;

    /* renamed from: r */
    private final Paint f9575r;

    /* renamed from: s */
    private final Paint f9576s;

    /* renamed from: t */
    private final Paint f9577t;

    /* renamed from: u */
    private final Drawable f9578u;

    /* renamed from: v */
    private final int f9579v;

    /* renamed from: w */
    private final int f9580w;

    /* renamed from: x */
    private final int f9581x;

    /* renamed from: y */
    private final int f9582y;

    /* renamed from: z */
    private final int f9583z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private static int m29810e(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    /* renamed from: f */
    private void m29809f(Canvas canvas) {
        int i;
        if (this.f37315T > 0) {
            Rect rect = this.f9571n;
            int r = C7557q0.m22129r(rect.right, rect.left, this.f9569l.right);
            int centerY = this.f9571n.centerY();
            Drawable drawable = this.f9578u;
            if (drawable == null) {
                if (this.f37313R || isFocused()) {
                    i = this.f37297B;
                } else if (isEnabled()) {
                    i = this.f9583z;
                } else {
                    i = this.f37296A;
                }
                canvas.drawCircle(r, centerY, (int) ((i * this.f37311P) / 2.0f), this.f9577t);
                return;
            }
            int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f37311P)) / 2;
            int intrinsicHeight = ((int) (this.f9578u.getIntrinsicHeight() * this.f37311P)) / 2;
            this.f9578u.setBounds(r - intrinsicWidth, centerY - intrinsicHeight, r + intrinsicWidth, centerY + intrinsicHeight);
            this.f9578u.draw(canvas);
        }
    }

    /* renamed from: g */
    private void m29808g(Canvas canvas) {
        Paint paint;
        int height = this.f9569l.height();
        int centerY = this.f9569l.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f37315T <= 0) {
            Rect rect = this.f9569l;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.f9574q);
            return;
        }
        Rect rect2 = this.f9570m;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f9569l.left, i3), this.f9571n.right);
        int i4 = this.f9569l.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.f9574q);
        }
        int max2 = Math.max(i2, this.f9571n.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.f9573p);
        }
        if (this.f9571n.width() > 0) {
            Rect rect3 = this.f9571n;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f9572o);
        }
        if (this.f37318W != 0) {
            long[] jArr = (long[]) C7510a.m22367e(this.f9566a0);
            boolean[] zArr = (boolean[]) C7510a.m22367e(this.f9567b0);
            int i5 = this.f9582y / 2;
            for (int i6 = 0; i6 < this.f37318W; i6++) {
                long s = C7557q0.m22127s(jArr[i6], 0L, this.f37315T);
                Rect rect4 = this.f9569l;
                int min = rect4.left + Math.min(rect4.width() - this.f9582y, Math.max(0, ((int) ((this.f9569l.width() * s) / this.f37315T)) - i5));
                if (zArr[i6]) {
                    paint = this.f9576s;
                } else {
                    paint = this.f9575r;
                }
                canvas.drawRect(min, centerY, min + this.f9582y, i, paint);
            }
        }
    }

    private long getPositionIncrement() {
        long j = this.f37307L;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f37315T;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.f37306K;
    }

    private String getProgressText() {
        return C7557q0.m22152f0(this.f37300E, this.f37301F, this.f37316U);
    }

    private long getScrubberPosition() {
        if (this.f9569l.width() <= 0 || this.f37315T == -9223372036854775807L) {
            return 0L;
        }
        return (this.f9571n.width() * this.f37315T) / this.f9569l.width();
    }

    /* renamed from: h */
    private boolean m29807h(float f, float f2) {
        return this.f9568k.contains((int) f, (int) f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m29806i() {
        m29796s(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m29805j(ValueAnimator valueAnimator) {
        this.f37311P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f9568k);
    }

    /* renamed from: k */
    private void m29804k(float f) {
        Rect rect = this.f9571n;
        Rect rect2 = this.f9569l;
        rect.right = C7557q0.m22129r((int) f, rect2.left, rect2.right);
    }

    /* renamed from: l */
    private static int m29803l(float f, int i) {
        return (int) (i / f);
    }

    /* renamed from: m */
    private Point m29802m(MotionEvent motionEvent) {
        this.f37304I.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f37304I;
    }

    /* renamed from: n */
    private boolean m29801n(long j) {
        long j2;
        long j3 = this.f37315T;
        if (j3 <= 0) {
            return false;
        }
        if (this.f37313R) {
            j2 = this.f37314S;
        } else {
            j2 = this.f37316U;
        }
        long s = C7557q0.m22127s(j2 + j, 0L, j3);
        if (s == j2) {
            return false;
        }
        if (!this.f37313R) {
            m29797r(s);
        } else {
            m29793v(s);
        }
        m29795t();
        return true;
    }

    /* renamed from: o */
    private boolean m29800o(Drawable drawable) {
        return C7557q0.f16368a >= 23 && m29799p(drawable, getLayoutDirection());
    }

    /* renamed from: p */
    private static boolean m29799p(Drawable drawable, int i) {
        return C7557q0.f16368a >= 23 && drawable.setLayoutDirection(i);
    }

    /* renamed from: q */
    private void m29798q(int i, int i2) {
        Rect rect = this.f37309N;
        if (rect == null || rect.width() != i || this.f37309N.height() != i2) {
            Rect rect2 = new Rect(0, 0, i, i2);
            this.f37309N = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    /* renamed from: r */
    private void m29797r(long j) {
        this.f37314S = j;
        this.f37313R = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<AbstractC5281h.AbstractC5282a> it = this.f37303H.iterator();
        while (it.hasNext()) {
            it.next().mo29652c(this, j);
        }
    }

    /* renamed from: s */
    private void m29796s(boolean z) {
        removeCallbacks(this.f37302G);
        this.f37313R = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<AbstractC5281h.AbstractC5282a> it = this.f37303H.iterator();
        while (it.hasNext()) {
            it.next().mo29653b(this, this.f37314S, z);
        }
    }

    /* renamed from: t */
    private void m29795t() {
        long j;
        this.f9570m.set(this.f9569l);
        this.f9571n.set(this.f9569l);
        if (this.f37313R) {
            j = this.f37314S;
        } else {
            j = this.f37316U;
        }
        if (this.f37315T > 0) {
            Rect rect = this.f9570m;
            Rect rect2 = this.f9569l;
            rect.right = Math.min(rect2.left + ((int) ((this.f9569l.width() * this.f37317V) / this.f37315T)), rect2.right);
            int width = (int) ((this.f9569l.width() * j) / this.f37315T);
            Rect rect3 = this.f9571n;
            Rect rect4 = this.f9569l;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f9570m;
            int i = this.f9569l.left;
            rect5.right = i;
            this.f9571n.right = i;
        }
        invalidate(this.f9568k);
    }

    /* renamed from: u */
    private void m29794u() {
        Drawable drawable = this.f9578u;
        if (drawable != null && drawable.isStateful() && this.f9578u.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: v */
    private void m29793v(long j) {
        if (this.f37314S != j) {
            this.f37314S = j;
            Iterator<AbstractC5281h.AbstractC5282a> it = this.f37303H.iterator();
            while (it.hasNext()) {
                it.next().mo29654a(this, j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h
    /* renamed from: a */
    public void mo29656a(AbstractC5281h.AbstractC5282a aVar) {
        C7510a.m22367e(aVar);
        this.f37303H.add(aVar);
    }

    @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h
    /* renamed from: b */
    public void mo29655b(long[] jArr, boolean[] zArr, int i) {
        boolean z;
        if (i == 0 || !(jArr == null || zArr == null)) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f37318W = i;
        this.f9566a0 = jArr;
        this.f9567b0 = zArr;
        m29795t();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m29794u();
    }

    @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h
    public long getPreferredUpdateDelay() {
        int l = m29803l(this.f37305J, this.f9569l.width());
        if (l != 0) {
            long j = this.f37315T;
            if (!(j == 0 || j == -9223372036854775807L)) {
                return j / l;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9578u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m29808g(canvas);
        m29809f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f37313R && !z) {
            m29796s(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f37315T > 0) {
            if (C7557q0.f16368a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.m29801n(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f37302G
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f37302G
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f37313R
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.m29796s(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.f37312Q) {
            i5 = 0;
        } else {
            i5 = this.f37298C;
        }
        if (this.f9581x == 1) {
            i7 = (i9 - getPaddingBottom()) - this.f9580w;
            int i10 = this.f9579v;
            i6 = ((i9 - getPaddingBottom()) - i10) - Math.max(i5 - (i10 / 2), 0);
        } else {
            i7 = (i9 - this.f9580w) / 2;
            i6 = (i9 - this.f9579v) / 2;
        }
        this.f9568k.set(paddingLeft, i7, paddingRight, this.f9580w + i7);
        Rect rect = this.f9569l;
        Rect rect2 = this.f9568k;
        rect.set(rect2.left + i5, i6, rect2.right - i5, this.f9579v + i6);
        if (C7557q0.f16368a >= 29) {
            m29798q(i8, i9);
        }
        m29795t();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f9580w;
        } else if (mode != 1073741824) {
            size = Math.min(this.f9580w, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m29794u();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f9578u;
        if (drawable != null && m29799p(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r3 != 3) goto L_0x0076;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            long r2 = r7.f37315T
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x0076
        L_0x0010:
            android.graphics.Point r0 = r7.m29802m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r5 = 3
            if (r3 == r4) goto L_0x004e
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004e
            goto L_0x0076
        L_0x0028:
            boolean r8 = r7.f37313R
            if (r8 == 0) goto L_0x0076
            int r8 = r7.f37299D
            if (r0 >= r8) goto L_0x003a
            int r8 = r7.f37308M
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m29804k(r8)
            goto L_0x0040
        L_0x003a:
            r7.f37308M = r2
            float r8 = (float) r2
            r7.m29804k(r8)
        L_0x0040:
            long r0 = r7.getScrubberPosition()
            r7.m29793v(r0)
            r7.m29795t()
            r7.invalidate()
            return r4
        L_0x004e:
            boolean r0 = r7.f37313R
            if (r0 == 0) goto L_0x0076
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0059
            r1 = r4
        L_0x0059:
            r7.m29796s(r1)
            return r4
        L_0x005d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m29807h(r8, r0)
            if (r0 == 0) goto L_0x0076
            r7.m29804k(r8)
            long r0 = r7.getScrubberPosition()
            r7.m29797r(r0)
            r7.m29795t()
            r7.invalidate()
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f37315T <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m29801n(-getPositionIncrement())) {
                m29796s(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m29801n(getPositionIncrement())) {
                m29796s(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f9575r.setColor(i);
        invalidate(this.f9568k);
    }

    public void setBufferedColor(int i) {
        this.f9573p.setColor(i);
        invalidate(this.f9568k);
    }

    @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h
    public void setBufferedPosition(long j) {
        this.f37317V = j;
        m29795t();
    }

    @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h
    public void setDuration(long j) {
        this.f37315T = j;
        if (this.f37313R && j == -9223372036854775807L) {
            m29796s(true);
        }
        m29795t();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p049ui.AbstractC5281h
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f37313R && !z) {
            m29796s(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f37306K = i;
        this.f37307L = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f37306K = -1;
        this.f37307L = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f9576s.setColor(i);
        invalidate(this.f9568k);
    }

    public void setPlayedColor(int i) {
        this.f9572o.setColor(i);
        invalidate(this.f9568k);
    }

    @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h
    public void setPosition(long j) {
        this.f37316U = j;
        setContentDescription(getProgressText());
        m29795t();
    }

    public void setScrubberColor(int i) {
        this.f9577t.setColor(i);
        invalidate(this.f9568k);
    }

    public void setUnplayedColor(int i) {
        this.f9574q.setColor(i);
        invalidate(this.f9568k);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f9568k = new Rect();
        this.f9569l = new Rect();
        this.f9570m = new Rect();
        this.f9571n = new Rect();
        Paint paint = new Paint();
        this.f9572o = paint;
        Paint paint2 = new Paint();
        this.f9573p = paint2;
        Paint paint3 = new Paint();
        this.f9574q = paint3;
        Paint paint4 = new Paint();
        this.f9575r = paint4;
        Paint paint5 = new Paint();
        this.f9576s = paint5;
        Paint paint6 = new Paint();
        this.f9577t = paint6;
        paint6.setAntiAlias(true);
        this.f37303H = new CopyOnWriteArraySet<>();
        this.f37304I = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f37305J = f;
        this.f37299D = m29810e(f, -50);
        int e = m29810e(f, 4);
        int e2 = m29810e(f, 26);
        int e3 = m29810e(f, 4);
        int e4 = m29810e(f, 12);
        int e5 = m29810e(f, 0);
        int e6 = m29810e(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3792l.f6265d, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C3792l.f6276o);
                this.f9578u = drawable;
                if (drawable != null) {
                    m29800o(drawable);
                    e2 = Math.max(drawable.getMinimumHeight(), e2);
                }
                this.f9579v = obtainStyledAttributes.getDimensionPixelSize(C3792l.f6269h, e);
                this.f9580w = obtainStyledAttributes.getDimensionPixelSize(C3792l.f6278q, e2);
                this.f9581x = obtainStyledAttributes.getInt(C3792l.f6268g, 0);
                this.f9582y = obtainStyledAttributes.getDimensionPixelSize(C3792l.f6267f, e3);
                this.f9583z = obtainStyledAttributes.getDimensionPixelSize(C3792l.f6277p, e4);
                this.f37296A = obtainStyledAttributes.getDimensionPixelSize(C3792l.f6274m, e5);
                this.f37297B = obtainStyledAttributes.getDimensionPixelSize(C3792l.f6275n, e6);
                int i3 = obtainStyledAttributes.getInt(C3792l.f6272k, -1);
                int i4 = obtainStyledAttributes.getInt(C3792l.f6273l, -1);
                int i5 = obtainStyledAttributes.getInt(C3792l.f6270i, -855638017);
                int i6 = obtainStyledAttributes.getInt(C3792l.f6279r, 872415231);
                int i7 = obtainStyledAttributes.getInt(C3792l.f6266e, -1291845888);
                int i8 = obtainStyledAttributes.getInt(C3792l.f6271j, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f9579v = e;
            this.f9580w = e2;
            this.f9581x = 0;
            this.f9582y = e3;
            this.f9583z = e4;
            this.f37296A = e5;
            this.f37297B = e6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f9578u = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f37300E = sb2;
        this.f37301F = new Formatter(sb2, Locale.getDefault());
        this.f37302G = new Runnable() { // from class: c9.a
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.m29806i();
            }
        };
        Drawable drawable2 = this.f9578u;
        if (drawable2 != null) {
            this.f37298C = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f37298C = (Math.max(this.f37296A, Math.max(this.f9583z, this.f37297B)) + 1) / 2;
        }
        this.f37311P = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f37310O = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c9.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.this.m29805j(valueAnimator2);
            }
        });
        this.f37315T = -9223372036854775807L;
        this.f37307L = -9223372036854775807L;
        this.f37306K = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
