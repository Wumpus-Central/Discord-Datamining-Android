package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C2733w0;
import p052d.C6388j;

/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes.dex */
public class C1733v0 extends ViewGroup {

    /* renamed from: k */
    private boolean f1520k;

    /* renamed from: l */
    private int f1521l;

    /* renamed from: m */
    private int f1522m;

    /* renamed from: n */
    private int f1523n;

    /* renamed from: o */
    private int f1524o;

    /* renamed from: p */
    private int f1525p;

    /* renamed from: q */
    private float f1526q;

    /* renamed from: r */
    private boolean f1527r;

    /* renamed from: s */
    private int[] f1528s;

    /* renamed from: t */
    private int[] f1529t;

    /* renamed from: u */
    private Drawable f1530u;

    /* renamed from: v */
    private int f1531v;

    /* renamed from: w */
    private int f1532w;

    /* renamed from: x */
    private int f1533x;

    /* renamed from: y */
    private int f1534y;

    /* renamed from: androidx.appcompat.widget.v0$a */
    /* loaded from: classes.dex */
    public static class C1734a extends LinearLayout.LayoutParams {
        public C1734a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1734a(int i, int i2) {
            super(i, i2);
        }

        public C1734a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C1733v0(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m39999i(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View q = m39991q(i3);
            if (q.getVisibility() != 8) {
                C1734a aVar = (C1734a) q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = q.getMeasuredWidth();
                    measureChildWithMargins(q, i2, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i4;
                }
            }
        }
    }

    /* renamed from: j */
    private void m39998j(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View q = m39991q(i3);
            if (q.getVisibility() != 8) {
                C1734a aVar = (C1734a) q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = q.getMeasuredHeight();
                    measureChildWithMargins(q, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i4;
                }
            }
        }
    }

    /* renamed from: y */
    private void m39983y(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1734a;
    }

    /* renamed from: e */
    void m40003e(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean b = C1735v1.m39981b(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View q = m39991q(i5);
            if (!(q == null || q.getVisibility() == 8 || !m39990r(i5))) {
                C1734a aVar = (C1734a) q.getLayoutParams();
                if (b) {
                    i4 = q.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    i4 = (q.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1531v;
                }
                m40000h(canvas, i4);
            }
        }
        if (m39990r(virtualChildCount)) {
            View q2 = m39991q(virtualChildCount - 1);
            if (q2 != null) {
                C1734a aVar2 = (C1734a) q2.getLayoutParams();
                if (b) {
                    i3 = q2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i2 = this.f1531v;
                    i = i3 - i2;
                    m40000h(canvas, i);
                }
                i = q2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                m40000h(canvas, i);
            } else if (b) {
                i = getPaddingLeft();
                m40000h(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.f1531v;
                i = i3 - i2;
                m40000h(canvas, i);
            }
        }
    }

    /* renamed from: f */
    void m40002f(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View q = m39991q(i2);
            if (!(q == null || q.getVisibility() == 8 || !m39990r(i2))) {
                m40001g(canvas, (q.getTop() - ((LinearLayout.LayoutParams) ((C1734a) q.getLayoutParams())).topMargin) - this.f1532w);
            }
        }
        if (m39990r(virtualChildCount)) {
            View q2 = m39991q(virtualChildCount - 1);
            if (q2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f1532w;
            } else {
                i = q2.getBottom() + ((LinearLayout.LayoutParams) ((C1734a) q2.getLayoutParams())).bottomMargin;
            }
            m40001g(canvas, i);
        }
    }

    /* renamed from: g */
    void m40001g(Canvas canvas, int i) {
        this.f1530u.setBounds(getPaddingLeft() + this.f1534y, i, (getWidth() - getPaddingRight()) - this.f1534y, this.f1532w + i);
        this.f1530u.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1521l < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1521l;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f1522m;
                if (this.f1523n == 1 && (i = this.f1524o & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1525p) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1525p;
                    }
                }
                return i3 + ((LinearLayout.LayoutParams) ((C1734a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f1521l == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1521l;
    }

    public Drawable getDividerDrawable() {
        return this.f1530u;
    }

    public int getDividerPadding() {
        return this.f1534y;
    }

    public int getDividerWidth() {
        return this.f1531v;
    }

    public int getGravity() {
        return this.f1524o;
    }

    public int getOrientation() {
        return this.f1523n;
    }

    public int getShowDividers() {
        return this.f1533x;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1526q;
    }

    /* renamed from: h */
    void m40000h(Canvas canvas, int i) {
        this.f1530u.setBounds(i, getPaddingTop() + this.f1534y, this.f1531v + i, (getHeight() - getPaddingBottom()) - this.f1534y);
        this.f1530u.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public C1734a generateDefaultLayoutParams() {
        int i = this.f1523n;
        if (i == 0) {
            return new C1734a(-2, -2);
        }
        if (i == 1) {
            return new C1734a(-1, -2);
        }
        return null;
    }

    /* renamed from: l */
    public C1734a generateLayoutParams(AttributeSet attributeSet) {
        return new C1734a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public C1734a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1734a(layoutParams);
    }

    /* renamed from: n */
    int m39994n(View view, int i) {
        return 0;
    }

    /* renamed from: o */
    int m39993o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1530u != null) {
            if (this.f1523n == 1) {
                m40002f(canvas);
            } else {
                m40003e(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1523n == 1) {
            m39988t(i, i2, i3, i4);
        } else {
            m39989s(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1523n == 1) {
            m39984x(i, i2);
        } else {
            m39986v(i, i2);
        }
    }

    /* renamed from: p */
    int m39992p(View view) {
        return 0;
    }

    /* renamed from: q */
    View m39991q(int i) {
        return getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public boolean m39990r(int i) {
        if (i == 0) {
            if ((this.f1533x & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.f1533x & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f1533x & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39989s(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1733v0.m39989s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f1520k = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1521l = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1530u) {
            this.f1530u = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1531v = drawable.getIntrinsicWidth();
                this.f1532w = drawable.getIntrinsicHeight();
            } else {
                this.f1531v = 0;
                this.f1532w = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1534y = i;
    }

    public void setGravity(int i) {
        if (this.f1524o != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1524o = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1524o;
        if ((8388615 & i3) != i2) {
            this.f1524o = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1527r = z;
    }

    public void setOrientation(int i) {
        if (this.f1523n != i) {
            this.f1523n = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1533x) {
            requestLayout();
        }
        this.f1533x = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1524o;
        if ((i3 & 112) != i2) {
            this.f1524o = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1526q = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39988t(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1524o
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1525p
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1525p
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = r1
        L_0x0049:
            if (r12 >= r10) goto L_0x00cb
            android.view.View r13 = r6.m39991q(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.m39985w(r12)
            int r0 = r0 + r1
            goto L_0x00c7
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c7
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.v0$a r5 = (androidx.appcompat.widget.C1733v0.C1734a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = androidx.core.view.C2733w0.m37063B(r17)
            int r1 = androidx.core.view.C2706t.m37125b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008d
            r2 = 5
            if (r1 == r2) goto L_0x0088
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0098
        L_0x0088:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L_0x0097
        L_0x008d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L_0x0097:
            int r1 = r1 - r2
        L_0x0098:
            r2 = r1
            boolean r1 = r6.m39990r(r12)
            if (r1 == 0) goto L_0x00a2
            int r1 = r6.f1532w
            int r0 = r0 + r1
        L_0x00a2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m39993o(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m39983y(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m39992p(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m39994n(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto L_0x00c8
        L_0x00c7:
            r1 = r14
        L_0x00c8:
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1733v0.m39988t(int, int, int, int):void");
    }

    /* renamed from: u */
    void m39987u(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d8  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39986v(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1733v0.m39986v(int, int):void");
    }

    /* renamed from: w */
    int m39985w(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0325  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m39984x(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1733v0.m39984x(int, int):void");
    }

    public C1733v0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1733v0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1520k = true;
        this.f1521l = -1;
        this.f1522m = 0;
        this.f1524o = 8388659;
        int[] iArr = C6388j.f13237a1;
        C1698n1 v = C1698n1.m40105v(context, attributeSet, iArr, i, 0);
        C2733w0.m36994o0(this, context, iArr, attributeSet, v.m40109r(), i, 0);
        int k = v.m40116k(C6388j.f13247c1, -1);
        if (k >= 0) {
            setOrientation(k);
        }
        int k2 = v.m40116k(C6388j.f13242b1, -1);
        if (k2 >= 0) {
            setGravity(k2);
        }
        boolean a = v.m40126a(C6388j.f13252d1, true);
        if (!a) {
            setBaselineAligned(a);
        }
        this.f1526q = v.m40118i(C6388j.f13262f1, -1.0f);
        this.f1521l = v.m40116k(C6388j.f13257e1, -1);
        this.f1527r = v.m40126a(C6388j.f13277i1, false);
        setDividerDrawable(v.m40120g(C6388j.f13267g1));
        this.f1533x = v.m40116k(C6388j.f13282j1, 0);
        this.f1534y = v.m40121f(C6388j.f13272h1, 0);
        v.m40104w();
    }
}
