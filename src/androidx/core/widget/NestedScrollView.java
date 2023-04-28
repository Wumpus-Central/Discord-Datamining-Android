package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC2679o0;
import androidx.core.view.AbstractC2689q0;
import androidx.core.view.C2549a;
import androidx.core.view.C2672n0;
import androidx.core.view.C2733w0;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C2595v;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import p002a1.C1235a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements AbstractC2689q0, AbstractC2679o0, ScrollingView {

    /* renamed from: K */
    private static final C2775a f35660K = new C2775a();

    /* renamed from: L */
    private static final int[] f35661L = {16843130};

    /* renamed from: A */
    private int f35662A;

    /* renamed from: B */
    private final int[] f35663B;

    /* renamed from: C */
    private final int[] f35664C;

    /* renamed from: D */
    private int f35665D;

    /* renamed from: E */
    private int f35666E;

    /* renamed from: F */
    private C2778d f35667F;

    /* renamed from: G */
    private final NestedScrollingParentHelper f35668G;

    /* renamed from: H */
    private final NestedScrollingChildHelper f35669H;

    /* renamed from: I */
    private float f35670I;

    /* renamed from: J */
    private AbstractC2777c f35671J;

    /* renamed from: k */
    private long f3670k;

    /* renamed from: l */
    private final Rect f3671l;

    /* renamed from: m */
    private OverScroller f3672m;

    /* renamed from: n */
    public EdgeEffect f3673n;

    /* renamed from: o */
    public EdgeEffect f3674o;

    /* renamed from: p */
    private int f3675p;

    /* renamed from: q */
    private boolean f3676q;

    /* renamed from: r */
    private boolean f3677r;

    /* renamed from: s */
    private View f3678s;

    /* renamed from: t */
    private boolean f3679t;

    /* renamed from: u */
    private VelocityTracker f3680u;

    /* renamed from: v */
    private boolean f3681v;

    /* renamed from: w */
    private boolean f3682w;

    /* renamed from: x */
    private int f3683x;

    /* renamed from: y */
    private int f3684y;

    /* renamed from: z */
    private int f3685z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C2775a extends C2549a {
        C2775a() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C2595v.m37299a(accessibilityEvent, nestedScrollView.getScrollX());
            C2595v.m37298b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.m37389a0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfoCompat.m37343x0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    accessibilityNodeInfoCompat.m37388b(AccessibilityNodeInfoCompat.C2556a.f3570r);
                    accessibilityNodeInfoCompat.m37388b(AccessibilityNodeInfoCompat.C2556a.f35645C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    accessibilityNodeInfoCompat.m37388b(AccessibilityNodeInfoCompat.C2556a.f3569q);
                    accessibilityNodeInfoCompat.m37388b(AccessibilityNodeInfoCompat.C2556a.f35647E);
                }
            }
        }

        @Override // androidx.core.view.C2549a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m36804K(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m36804K(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    static class C2776b {
        /* renamed from: a */
        static boolean m36774a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public interface AbstractC2777c {
        /* renamed from: a */
        void m36773a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.NestedScrollView$d */
    /* loaded from: classes.dex */
    public static class C2778d extends View.BaseSavedState {
        public static final Parcelable.Creator<C2778d> CREATOR = new C2779a();

        /* renamed from: k */
        public int f3686k;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        /* loaded from: classes.dex */
        class C2779a implements Parcelable.Creator<C2778d> {
            C2779a() {
            }

            /* renamed from: a */
            public C2778d createFromParcel(Parcel parcel) {
                return new C2778d(parcel);
            }

            /* renamed from: b */
            public C2778d[] newArray(int i) {
                return new C2778d[i];
            }
        }

        C2778d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3686k + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3686k);
        }

        C2778d(Parcel parcel) {
            super(parcel);
            this.f3686k = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1235a.f7c);
    }

    /* renamed from: B */
    private void m36813B() {
        VelocityTracker velocityTracker = this.f3680u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3680u = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m36812C(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3673n
            float r0 = androidx.core.widget.C2790e.m36719b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f3673n
            float r4 = -r4
            float r4 = androidx.core.widget.C2790e.m36717d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3673n
            float r5 = androidx.core.widget.C2790e.m36719b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3673n
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f3674o
            float r0 = androidx.core.widget.C2790e.m36719b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f3674o
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C2790e.m36717d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3674o
            float r5 = androidx.core.widget.C2790e.m36719b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3674o
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m36812C(int, float):int");
    }

    /* renamed from: D */
    private void m36811D(boolean z) {
        if (z) {
            m36803L(2, 1);
        } else {
            m36801N(1);
        }
        this.f35666E = getScrollY();
        C2733w0.m37008h0(this);
    }

    /* renamed from: E */
    private boolean m36810E(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View m = m36788m(z, i2, i3);
        if (m == null) {
            m = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m36792i(i4);
            z2 = true;
        }
        if (m != findFocus()) {
            m.requestFocus(i);
        }
        return z2;
    }

    /* renamed from: F */
    private void m36809F(View view) {
        view.getDrawingRect(this.f3671l);
        offsetDescendantRectToMyCoords(view, this.f3671l);
        int f = m36795f(this.f3671l);
        if (f != 0) {
            scrollBy(0, f);
        }
    }

    /* renamed from: G */
    private boolean m36808G(Rect rect, boolean z) {
        boolean z2;
        int f = m36795f(rect);
        if (f != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, f);
            } else {
                m36807H(0, f);
            }
        }
        return z2;
    }

    /* renamed from: I */
    private void m36806I(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3670k > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3672m;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m36811D(z);
            } else {
                if (!this.f3672m.isFinished()) {
                    m36800a();
                }
                scrollBy(i, i2);
            }
            this.f3670k = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: M */
    private boolean m36802M(MotionEvent motionEvent) {
        boolean z;
        if (C2790e.m36719b(this.f3673n) != 0.0f) {
            C2790e.m36717d(this.f3673n, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C2790e.m36719b(this.f3674o) == 0.0f) {
            return z;
        }
        C2790e.m36717d(this.f3674o, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: a */
    private void m36800a() {
        this.f3672m.abortAnimation();
        m36801N(1);
    }

    /* renamed from: c */
    private boolean m36798c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m36797d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static int m36796e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f35670I == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f35670I = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f35670I;
    }

    /* renamed from: i */
    private void m36792i(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3682w) {
            m36807H(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: j */
    private boolean m36791j(int i) {
        if (C2790e.m36719b(this.f3673n) != 0.0f) {
            this.f3673n.onAbsorb(i);
        } else if (C2790e.m36719b(this.f3674o) == 0.0f) {
            return false;
        } else {
            this.f3674o.onAbsorb(-i);
        }
        return true;
    }

    /* renamed from: k */
    private void m36790k() {
        this.f3679t = false;
        m36813B();
        m36801N(0);
        this.f3673n.onRelease();
        this.f3674o.onRelease();
    }

    /* renamed from: m */
    private View m36788m(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i >= top || bottom >= i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                            view = view2;
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z3) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: q */
    private boolean m36784q(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private void m36783r() {
        VelocityTracker velocityTracker = this.f3680u;
        if (velocityTracker == null) {
            this.f3680u = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: s */
    private void m36782s() {
        this.f3672m = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3683x = viewConfiguration.getScaledTouchSlop();
        this.f3684y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3685z = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: t */
    private void m36781t() {
        if (this.f3680u == null) {
            this.f3680u = VelocityTracker.obtain();
        }
    }

    /* renamed from: u */
    private boolean m36780u(View view) {
        return !m36778w(view, 0, getHeight());
    }

    /* renamed from: v */
    private static boolean m36779v(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m36779v((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m36778w(View view, int i, int i2) {
        view.getDrawingRect(this.f3671l);
        offsetDescendantRectToMyCoords(view, this.f3671l);
        if (this.f3671l.bottom + i < getScrollY() || this.f3671l.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private void m36777x(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f35669H.m37546e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: y */
    private void m36776y(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f35662A) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f3675p = (int) motionEvent.getY(i);
            this.f35662A = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3680u;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: A */
    public boolean m36814A(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f3671l.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3671l;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3671l.top = getScrollY() - height;
            Rect rect2 = this.f3671l;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3671l;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m36810E(i, i2, i3);
    }

    /* renamed from: H */
    public final void m36807H(int i, int i2) {
        m36806I(i, i2, ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    /* renamed from: J */
    void m36805J(int i, int i2, int i3, boolean z) {
        m36806I(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: K */
    void m36804K(int i, int i2, boolean z) {
        m36805J(i, i2, ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION, z);
    }

    /* renamed from: L */
    public boolean m36803L(int i, int i2) {
        return this.f35669H.m37534q(i, i2);
    }

    /* renamed from: N */
    public void m36801N(int i) {
        this.f35669H.m37532s(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean m36799b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m36778w(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m36792i(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3671l);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3671l);
            m36792i(m36795f(this.f3671l));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m36780u(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.f3672m.isFinished()) {
            this.f3672m.computeScrollOffset();
            int currY = this.f3672m.getCurrY();
            int i = currY - this.f35666E;
            this.f35666E = currY;
            int[] iArr = this.f35664C;
            boolean z = false;
            iArr[1] = 0;
            m36794g(0, i, iArr, null, 1);
            int i2 = i - this.f35664C[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                m36775z(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f35664C;
                iArr2[1] = 0;
                m36793h(0, scrollY2, 0, i3, this.f35663B, 1, iArr2);
                i2 = i3 - this.f35664C[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i2 < 0) {
                        if (this.f3673n.isFinished()) {
                            this.f3673n.onAbsorb((int) this.f3672m.getCurrVelocity());
                        }
                    } else if (this.f3674o.isFinished()) {
                        this.f3674o.onAbsorb((int) this.f3672m.getCurrVelocity());
                    }
                }
                m36800a();
            }
            if (!this.f3672m.isFinished()) {
                C2733w0.m37008h0(this);
            } else {
                m36801N(1);
            }
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m36789l(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f35669H.m37550a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f35669H.m37549b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m36794g(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f35669H.m37545f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f3673n.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C2776b.m36774a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C2776b.m36774a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.f3673n.setSize(width, height);
            if (this.f3673n.draw(canvas)) {
                C2733w0.m37008h0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f3674o.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C2776b.m36774a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (C2776b.m36774a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f3674o.setSize(width2, height2);
            if (this.f3674o.draw(canvas)) {
                C2733w0.m37008h0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: f */
    protected int m36795f(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    /* renamed from: g */
    public boolean m36794g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f35669H.m37547d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f35668G.m37531a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void m36793h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f35669H.m37546e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m36785p(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f35669H.m37538m();
    }

    /* renamed from: l */
    public boolean m36789l(KeyEvent keyEvent) {
        this.f3671l.setEmpty();
        int i = 130;
        if (!m36797d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m36814A(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return m36799b(130);
                } else {
                    return m36786o(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return m36799b(33);
            } else {
                return m36786o(33);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void m36787n(int i) {
        if (getChildCount() > 0) {
            this.f3672m.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES, 0, 0);
            m36811D(true);
        }
    }

    /* renamed from: o */
    public boolean m36786o(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f3671l;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3671l.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3671l;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3671l;
        return m36810E(i, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3677r = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.f3679t) {
            if (C2672n0.m37175a(motionEvent, 2)) {
                f = motionEvent.getAxisValue(9);
            } else if (C2672n0.m37175a(motionEvent, 4194304)) {
                f = motionEvent.getAxisValue(26);
            } else {
                f = 0.0f;
            }
            if (f != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (f * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    if (!m36798c() || C2672n0.m37175a(motionEvent, 8194)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        C2790e.m36717d(this.f3673n, (-verticalScrollFactorCompat) / getHeight(), 0.5f);
                        this.f3673n.onRelease();
                        invalidate();
                        z = 1;
                    } else {
                        z = 0;
                    }
                } else if (verticalScrollFactorCompat > scrollRange) {
                    if (!m36798c() || C2672n0.m37175a(motionEvent, 8194)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        C2790e.m36717d(this.f3674o, (verticalScrollFactorCompat - scrollRange) / getHeight(), 0.5f);
                        this.f3674o.onRelease();
                        invalidate();
                        i = 1;
                    }
                    z = i;
                    i = scrollRange;
                } else {
                    z = 0;
                    i = verticalScrollFactorCompat;
                }
                if (i == scrollY) {
                    return z;
                }
                super.scrollTo(getScrollX(), i);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f3679t) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f35662A;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3675p) > this.f3683x && (2 & getNestedScrollAxes()) == 0) {
                                this.f3679t = true;
                                this.f3675p = y;
                                m36781t();
                                this.f3680u.addMovement(motionEvent);
                                this.f35665D = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m36776y(motionEvent);
                    }
                }
            }
            this.f3679t = false;
            this.f35662A = -1;
            m36813B();
            if (this.f3672m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C2733w0.m37008h0(this);
            }
            m36801N(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m36784q((int) motionEvent.getX(), y2)) {
                if (!m36802M(motionEvent) && this.f3672m.isFinished()) {
                    z = false;
                }
                this.f3679t = z;
                m36813B();
            } else {
                this.f3675p = y2;
                this.f35662A = motionEvent.getPointerId(0);
                m36783r();
                this.f3680u.addMovement(motionEvent);
                this.f3672m.computeScrollOffset();
                if (!m36802M(motionEvent) && this.f3672m.isFinished()) {
                    z = false;
                }
                this.f3679t = z;
                m36803L(2, 0);
            }
        }
        return this.f3679t;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3676q = false;
        View view = this.f3678s;
        if (view != null && m36779v(view, this)) {
            m36809F(this.f3678s);
        }
        this.f3678s = null;
        if (!this.f3677r) {
            if (this.f35667F != null) {
                scrollTo(getScrollX(), this.f35667F.f3686k);
                this.f35667F = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e = m36796e(scrollY, paddingTop, i5);
            if (e != scrollY) {
                scrollTo(getScrollX(), e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3677r = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3681v && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m36787n((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        m36794g(i, i2, iArr, null, i3);
    }

    @Override // androidx.core.view.AbstractC2689q0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m36777x(i4, i5, iArr);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f35668G.m37529c(view, view2, i, i2);
        m36803L(2, i2);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m36780u(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2778d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2778d dVar = (C2778d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f35667F = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C2778d dVar = new C2778d(super.onSaveInstanceState());
        dVar.f3686k = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC2777c cVar = this.f35671J;
        if (cVar != null) {
            cVar.m36773a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m36778w(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3671l);
            offsetDescendantRectToMyCoords(findFocus, this.f3671l);
            m36792i(m36795f(this.f3671l));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onStopNestedScroll(View view, int i) {
        this.f35668G.m37527e(view, i);
        m36801N(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean m36785p(int i) {
        return this.f35669H.m37539l(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3676q) {
            m36809F(view2);
        } else {
            this.f3678s = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m36808G(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m36813B();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3676q = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e = m36796e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e2 = m36796e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e != getScrollX() || e2 != getScrollY()) {
                super.scrollTo(e, e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3681v) {
            this.f3681v = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f35669H.m37537n(z);
    }

    public void setOnScrollChangeListener(AbstractC2777c cVar) {
        this.f35671J = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3682w = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m36803L(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m36801N(0);
    }

    /* renamed from: z */
    boolean m36775z(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z3)) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i11 = i3 + i;
        if (!z4) {
            i9 = 0;
        } else {
            i9 = i7;
        }
        int i12 = i4 + i2;
        if (!z5) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        int i13 = -i9;
        int i14 = i9 + i5;
        int i15 = -i10;
        int i16 = i10 + i6;
        if (i11 > i14) {
            i11 = i14;
            z6 = true;
        } else if (i11 < i13) {
            z6 = true;
            i11 = i13;
        } else {
            z6 = false;
        }
        if (i12 > i16) {
            i12 = i16;
            z7 = true;
        } else if (i12 < i15) {
            z7 = true;
            i12 = i15;
        } else {
            z7 = false;
        }
        if (z7 && !m36785p(1)) {
            this.f3672m.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i11, i12, z6, z7);
        if (z6 || z7) {
            return true;
        }
        return false;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3671l = new Rect();
        this.f3676q = true;
        this.f3677r = false;
        this.f3678s = null;
        this.f3679t = false;
        this.f3682w = true;
        this.f35662A = -1;
        this.f35663B = new int[2];
        this.f35664C = new int[2];
        this.f3673n = C2790e.m36720a(context, attributeSet);
        this.f3674o = C2790e.m36720a(context, attributeSet);
        m36782s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f35661L, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f35668G = new NestedScrollingParentHelper(this);
        this.f35669H = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        C2733w0.m36990q0(this, f35660K);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m36777x(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m36777x(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
