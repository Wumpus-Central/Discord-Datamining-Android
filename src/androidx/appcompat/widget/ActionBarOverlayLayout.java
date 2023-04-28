package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.core.graphics.Insets;
import androidx.core.view.AbstractC2684p0;
import androidx.core.view.AbstractC2689q0;
import androidx.core.view.C2733w0;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.uimanager.ViewDefaults;
import p052d.C6379a;
import p052d.C6384f;
import p163j$.util.Spliterator;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements AbstractC1688k0, AbstractC2684p0, AbstractC2689q0 {

    /* renamed from: P */
    static final int[] f35188P = {C6379a.f13096b, 16842841};

    /* renamed from: E */
    private WindowInsetsCompat f35193E;

    /* renamed from: F */
    private WindowInsetsCompat f35194F;

    /* renamed from: G */
    private WindowInsetsCompat f35195G;

    /* renamed from: H */
    private WindowInsetsCompat f35196H;

    /* renamed from: I */
    private AbstractC1596d f35197I;

    /* renamed from: J */
    private OverScroller f35198J;

    /* renamed from: K */
    ViewPropertyAnimator f35199K;

    /* renamed from: k */
    private int f1098k;

    /* renamed from: m */
    private ContentFrameLayout f1100m;

    /* renamed from: n */
    ActionBarContainer f1101n;

    /* renamed from: o */
    private AbstractC1691l0 f1102o;

    /* renamed from: p */
    private Drawable f1103p;

    /* renamed from: q */
    private boolean f1104q;

    /* renamed from: r */
    private boolean f1105r;

    /* renamed from: s */
    private boolean f1106s;

    /* renamed from: t */
    private boolean f1107t;

    /* renamed from: u */
    boolean f1108u;

    /* renamed from: v */
    private int f1109v;

    /* renamed from: w */
    private int f1110w;

    /* renamed from: l */
    private int f1099l = 0;

    /* renamed from: x */
    private final Rect f1111x = new Rect();

    /* renamed from: y */
    private final Rect f1112y = new Rect();

    /* renamed from: z */
    private final Rect f1113z = new Rect();

    /* renamed from: A */
    private final Rect f35189A = new Rect();

    /* renamed from: B */
    private final Rect f35190B = new Rect();

    /* renamed from: C */
    private final Rect f35191C = new Rect();

    /* renamed from: D */
    private final Rect f35192D = new Rect();

    /* renamed from: L */
    final AnimatorListenerAdapter f35200L = new C1593a();

    /* renamed from: M */
    private final Runnable f35201M = new RunnableC1594b();

    /* renamed from: N */
    private final Runnable f35202N = new RunnableC1595c();

    /* renamed from: O */
    private final NestedScrollingParentHelper f35203O = new NestedScrollingParentHelper(this);

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C1593a extends AnimatorListenerAdapter {
        C1593a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f35199K = null;
            actionBarOverlayLayout.f1108u = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f35199K = null;
            actionBarOverlayLayout.f1108u = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC1594b implements Runnable {
        RunnableC1594b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m40546o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f35199K = actionBarOverlayLayout.f1101n.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f35200L);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC1595c implements Runnable {
        RunnableC1595c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m40546o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f35199K = actionBarOverlayLayout.f1101n.animate().translationY(-ActionBarOverlayLayout.this.f1101n.getHeight()).setListener(ActionBarOverlayLayout.this.f35200L);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface AbstractC1596d {
        /* renamed from: a */
        void mo40538a();

        /* renamed from: b */
        void mo40537b(int i);

        /* renamed from: c */
        void mo40536c();

        /* renamed from: d */
        void mo40535d(boolean z);

        /* renamed from: e */
        void mo40534e();

        /* renamed from: f */
        void mo40533f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C1597e extends ViewGroup.MarginLayoutParams {
        public C1597e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1597e(int i, int i2) {
            super(i, i2);
        }

        public C1597e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f3512b;
        this.f35193E = windowInsetsCompat;
        this.f35194F = windowInsetsCompat;
        this.f35195G = windowInsetsCompat;
        this.f35196H = windowInsetsCompat;
        m40545p(context);
    }

    /* renamed from: j */
    private void m40551j() {
        m40546o();
        this.f35202N.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40550k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C1597e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = r0
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = r0
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = r0
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            goto L_0x0036
        L_0x0035:
            r0 = r5
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m40550k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: n */
    private AbstractC1691l0 m40547n(View view) {
        if (view instanceof AbstractC1691l0) {
            return (AbstractC1691l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: p */
    private void m40545p(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f35188P);
        boolean z2 = false;
        this.f1098k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1103p = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1104q = z2;
        this.f35198J = new OverScroller(context);
    }

    /* renamed from: r */
    private void m40543r() {
        m40546o();
        postDelayed(this.f35202N, 600L);
    }

    /* renamed from: s */
    private void m40542s() {
        m40546o();
        postDelayed(this.f35201M, 600L);
    }

    /* renamed from: u */
    private void m40540u() {
        m40546o();
        this.f35201M.run();
    }

    /* renamed from: v */
    private boolean m40539v(float f) {
        this.f35198J.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES);
        if (this.f35198J.getFinalY() > this.f1101n.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: a */
    public boolean mo40141a() {
        m40541t();
        return this.f1102o.mo40090a();
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: b */
    public boolean mo40140b() {
        m40541t();
        return this.f1102o.mo40089b();
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: c */
    public boolean mo40139c() {
        m40541t();
        return this.f1102o.mo40088c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1597e;
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: d */
    public void mo40138d(Menu menu, AbstractC1584j.AbstractC1585a aVar) {
        m40541t();
        this.f1102o.mo40087d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1103p != null && !this.f1104q) {
            if (this.f1101n.getVisibility() == 0) {
                i = (int) (this.f1101n.getBottom() + this.f1101n.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f1103p.setBounds(0, i, getWidth(), this.f1103p.getIntrinsicHeight() + i);
            this.f1103p.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: e */
    public boolean mo40137e() {
        m40541t();
        return this.f1102o.mo40086e();
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: f */
    public void mo40136f() {
        m40541t();
        this.f1102o.mo40085f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: g */
    public boolean mo40135g() {
        m40541t();
        return this.f1102o.mo40084g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1101n;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f35203O.m37531a();
    }

    public CharSequence getTitle() {
        m40541t();
        return this.f1102o.getTitle();
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: h */
    public void mo40134h(int i) {
        m40541t();
        if (i == 2) {
            this.f1102o.mo40076o();
        } else if (i == 5) {
            this.f1102o.mo40069v();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    /* renamed from: i */
    public void mo40133i() {
        m40541t();
        this.f1102o.mo40074q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public C1597e generateDefaultLayoutParams() {
        return new C1597e(-1, -1);
    }

    /* renamed from: m */
    public C1597e generateLayoutParams(AttributeSet attributeSet) {
        return new C1597e(getContext(), attributeSet);
    }

    /* renamed from: o */
    void m40546o() {
        removeCallbacks(this.f35201M);
        removeCallbacks(this.f35202N);
        ViewPropertyAnimator viewPropertyAnimator = this.f35199K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m40541t();
        WindowInsetsCompat z = WindowInsetsCompat.m37501z(windowInsets, this);
        boolean k = m40550k(this.f1101n, new Rect(z.m37514m(), z.m37512o(), z.m37513n(), z.m37515l()), true, true, false, true);
        C2733w0.m37013f(this, z, this.f1111x);
        Rect rect = this.f1111x;
        WindowInsetsCompat p = z.m37511p(rect.left, rect.top, rect.right, rect.bottom);
        this.f35193E = p;
        boolean z2 = true;
        if (!this.f35194F.equals(p)) {
            this.f35194F = this.f35193E;
            k = true;
        }
        if (!this.f1112y.equals(this.f1111x)) {
            this.f1112y.set(this.f1111x);
        } else {
            z2 = k;
        }
        if (z2) {
            requestLayout();
        }
        return z.m37526a().m37524c().m37525b().m37503x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m40545p(getContext());
        C2733w0.m36996n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m40546o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1597e eVar = (C1597e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        m40541t();
        measureChildWithMargins(this.f1101n, i, 0, i2, 0);
        C1597e eVar = (C1597e) this.f1101n.getLayoutParams();
        int max = Math.max(0, this.f1101n.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1101n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1101n.getMeasuredState());
        if ((C2733w0.m37041M(this) & Spliterator.NONNULL) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f1098k;
            if (this.f1106s && this.f1101n.getTabContainer() != null) {
                i3 += this.f1098k;
            }
        } else {
            i3 = this.f1101n.getVisibility() != 8 ? this.f1101n.getMeasuredHeight() : 0;
        }
        this.f1113z.set(this.f1111x);
        WindowInsetsCompat windowInsetsCompat = this.f35193E;
        this.f35195G = windowInsetsCompat;
        if (this.f1105r || z) {
            this.f35195G = new WindowInsetsCompat.C2531b(this.f35195G).m37496d(Insets.m37935b(windowInsetsCompat.m37514m(), this.f35195G.m37512o() + i3, this.f35195G.m37513n(), this.f35195G.m37515l() + 0)).m37499a();
        } else {
            Rect rect = this.f1113z;
            rect.top += i3;
            rect.bottom += 0;
            this.f35195G = windowInsetsCompat.m37511p(0, i3, 0, 0);
        }
        m40550k(this.f1100m, this.f1113z, true, true, true, true);
        if (!this.f35196H.equals(this.f35195G)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f35195G;
            this.f35196H = windowInsetsCompat2;
            C2733w0.m37011g(this.f1100m, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f1100m, i, 0, i2, 0);
        C1597e eVar2 = (C1597e) this.f1100m.getLayoutParams();
        int max3 = Math.max(max, this.f1100m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1100m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1100m.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1107t || !z) {
            return false;
        }
        if (m40539v(f2)) {
            m40551j();
        } else {
            m40540u();
        }
        this.f1108u = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.core.view.AbstractC2689q0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.AbstractC2684p0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        m40541t();
        int i2 = this.f1110w ^ i;
        this.f1110w = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & Spliterator.NONNULL) != 0) {
            z2 = true;
        }
        AbstractC1596d dVar = this.f35197I;
        if (dVar != null) {
            dVar.mo40535d(!z2);
            if (z || !z2) {
                this.f35197I.mo40538a();
            } else {
                this.f35197I.mo40534e();
            }
        }
        if ((i2 & Spliterator.NONNULL) != 0 && this.f35197I != null) {
            C2733w0.m36996n0(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1099l = i;
        AbstractC1596d dVar = this.f35197I;
        if (dVar != null) {
            dVar.mo40537b(i);
        }
    }

    /* renamed from: q */
    public boolean m40544q() {
        return this.f1105r;
    }

    public void setActionBarHideOffset(int i) {
        m40546o();
        this.f1101n.setTranslationY(-Math.max(0, Math.min(i, this.f1101n.getHeight())));
    }

    public void setActionBarVisibilityCallback(AbstractC1596d dVar) {
        this.f35197I = dVar;
        if (getWindowToken() != null) {
            this.f35197I.mo40537b(this.f1099l);
            int i = this.f1110w;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C2733w0.m36996n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1106s = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1107t) {
            this.f1107t = z;
            if (!z) {
                m40546o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m40541t();
        this.f1102o.setIcon(i);
    }

    public void setLogo(int i) {
        m40541t();
        this.f1102o.mo40072s(i);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f1105r = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f1104q = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    public void setWindowCallback(Window.Callback callback) {
        m40541t();
        this.f1102o.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.AbstractC1688k0
    public void setWindowTitle(CharSequence charSequence) {
        m40541t();
        this.f1102o.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    void m40541t() {
        if (this.f1100m == null) {
            this.f1100m = (ContentFrameLayout) findViewById(C6384f.f13172b);
            this.f1101n = (ActionBarContainer) findViewById(C6384f.f13173c);
            this.f1102o = m40547n(findViewById(C6384f.f13171a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1597e(layoutParams);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f35203O.m37530b(view, view2, i);
        this.f1109v = getActionBarHideOffset();
        m40546o();
        AbstractC1596d dVar = this.f35197I;
        if (dVar != null) {
            dVar.mo40533f();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1101n.getVisibility() != 0) {
            return false;
        }
        return this.f1107t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1107t && !this.f1108u) {
            if (this.f1109v <= this.f1101n.getHeight()) {
                m40542s();
            } else {
                m40543r();
            }
        }
        AbstractC1596d dVar = this.f35197I;
        if (dVar != null) {
            dVar.mo40536c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1109v + i2;
        this.f1109v = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        m40541t();
        this.f1102o.setIcon(drawable);
    }
}
