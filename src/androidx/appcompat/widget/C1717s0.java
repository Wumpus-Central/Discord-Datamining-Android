package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2674n2;
import androidx.core.widget.C2797i;
import java.lang.reflect.Field;
import p052d.C6379a;
import p090f.C6978c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
public class C1717s0 extends ListView {

    /* renamed from: k */
    private final Rect f1471k = new Rect();

    /* renamed from: l */
    private int f1472l = 0;

    /* renamed from: m */
    private int f1473m = 0;

    /* renamed from: n */
    private int f1474n = 0;

    /* renamed from: o */
    private int f1475o = 0;

    /* renamed from: p */
    private int f1476p;

    /* renamed from: q */
    private Field f1477q;

    /* renamed from: r */
    private C1718a f1478r;

    /* renamed from: s */
    private boolean f1479s;

    /* renamed from: t */
    private boolean f1480t;

    /* renamed from: u */
    private boolean f1481u;

    /* renamed from: v */
    private C2674n2 f1482v;

    /* renamed from: w */
    private C2797i f1483w;

    /* renamed from: x */
    RunnableC1719b f1484x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.s0$a */
    /* loaded from: classes.dex */
    public static class C1718a extends C6978c {

        /* renamed from: l */
        private boolean f1485l = true;

        C1718a(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: c */
        void m40037c(boolean z) {
            this.f1485l = z;
        }

        @Override // p090f.C6978c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1485l) {
                super.draw(canvas);
            }
        }

        @Override // p090f.C6978c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1485l) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p090f.C6978c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1485l) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p090f.C6978c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1485l) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p090f.C6978c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1485l) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.s0$b */
    /* loaded from: classes.dex */
    public class RunnableC1719b implements Runnable {
        RunnableC1719b() {
        }

        /* renamed from: a */
        public void m40036a() {
            C1717s0 s0Var = C1717s0.this;
            s0Var.f1484x = null;
            s0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m40035b() {
            C1717s0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C1717s0 s0Var = C1717s0.this;
            s0Var.f1484x = null;
            s0Var.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1717s0(Context context, boolean z) {
        super(context, null, C6379a.f37735A);
        this.f1480t = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1477q = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m40048a() {
        this.f1481u = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1476p - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C2674n2 n2Var = this.f1482v;
        if (n2Var != null) {
            n2Var.m37171c();
            this.f1482v = null;
        }
    }

    /* renamed from: b */
    private void m40047b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m40046c(Canvas canvas) {
        Drawable selector;
        if (!this.f1471k.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1471k);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m40043f(int i, View view) {
        boolean z;
        Rect rect = this.f1471k;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1472l;
        rect.top -= this.f1473m;
        rect.right += this.f1474n;
        rect.bottom += this.f1475o;
        try {
            boolean z2 = this.f1477q.getBoolean(this);
            if (view.isEnabled() != z2) {
                Field field = this.f1477q;
                if (!z2) {
                    z = true;
                } else {
                    z = false;
                }
                field.set(this, Boolean.valueOf(z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m40042g(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        m40043f(i, view);
        if (z) {
            Rect rect = this.f1471k;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            C2400a.m37832k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m40041h(int i, View view, float f, float f2) {
        m40042g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C2400a.m37832k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m40040i(View view, int i, float f, float f2) {
        View childAt;
        this.f1481u = true;
        drawableHotspotChanged(f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1476p;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1476p = i;
        view.drawableHotspotChanged(f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m40041h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m40039j() {
        return this.f1481u;
    }

    /* renamed from: k */
    private void m40038k() {
        Drawable selector = getSelector();
        if (selector != null && m40039j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C1718a aVar = this.f1478r;
        if (aVar != null) {
            aVar.m40037c(z);
        }
    }

    /* renamed from: d */
    public int mo40045d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i10 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 < i4) {
                if (i5 >= 0 && i10 >= i5) {
                    i9 = i7;
                }
            } else if (i5 < 0 || i10 <= i5 || i9 <= 0 || i7 == i4) {
                return i4;
            } else {
                return i9;
            }
        }
        return i7;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m40046c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1484x == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m40038k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo40044e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r3 = r1
            r9 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r2
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m40040i(r3, r5, r4, r9)
            if (r0 != r1) goto L_0x000e
            r7.m40047b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m40048a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.i r9 = r7.f1483w
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.i r9 = new androidx.core.widget.i
            r9.<init>(r7)
            r7.f1483w = r9
        L_0x005a:
            androidx.core.widget.i r9 = r7.f1483w
            r9.m36758m(r1)
            androidx.core.widget.i r9 = r7.f1483w
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.i r8 = r7.f1483w
            if (r8 == 0) goto L_0x006c
            r8.m36758m(r2)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1717s0.mo40044e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1480t || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1480t || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1480t || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1480t && this.f1479s) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1484x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1484x == null) {
            RunnableC1719b bVar = new RunnableC1719b();
            this.f1484x = bVar;
            bVar.m40035b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m40038k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1476p = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1719b bVar = this.f1484x;
        if (bVar != null) {
            bVar.m40036a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1479s = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1718a aVar;
        if (drawable != null) {
            aVar = new C1718a(drawable);
        } else {
            aVar = null;
        }
        this.f1478r = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1472l = rect.left;
        this.f1473m = rect.top;
        this.f1474n = rect.right;
        this.f1475o = rect.bottom;
    }
}
