package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewDefaults;
import p052d.C6384f;
import p052d.C6388j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: k */
    private boolean f1078k;

    /* renamed from: l */
    private View f1079l;

    /* renamed from: m */
    private View f1080m;

    /* renamed from: n */
    private View f1081n;

    /* renamed from: o */
    Drawable f1082o;

    /* renamed from: p */
    Drawable f1083p;

    /* renamed from: q */
    Drawable f1084q;

    /* renamed from: r */
    boolean f1085r;

    /* renamed from: s */
    boolean f1086s;

    /* renamed from: t */
    private int f1087t;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2733w0.m36982u0(this, new C1637b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6388j.f13235a);
        this.f1082o = obtainStyledAttributes.getDrawable(C6388j.f13240b);
        this.f1083p = obtainStyledAttributes.getDrawable(C6388j.f13250d);
        this.f1087t = obtainStyledAttributes.getDimensionPixelSize(C6388j.f13280j, -1);
        boolean z = true;
        if (getId() == C6384f.f37776H) {
            this.f1085r = true;
            this.f1084q = obtainStyledAttributes.getDrawable(C6388j.f13245c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1085r ? !(this.f1082o == null && this.f1083p == null) : this.f1084q != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m40559a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m40558b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1082o;
        if (drawable != null && drawable.isStateful()) {
            this.f1082o.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1083p;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1083p.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1084q;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1084q.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1079l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1082o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1083p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1084q;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1080m = findViewById(C6384f.f13171a);
        this.f1081n = findViewById(C6384f.f13176f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1078k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1079l;
        boolean z3 = true;
        boolean z4 = false;
        if (view == null || view.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1085r) {
            Drawable drawable2 = this.f1084q;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z3 = z4;
        } else {
            if (this.f1082o != null) {
                if (this.f1080m.getVisibility() == 0) {
                    this.f1082o.setBounds(this.f1080m.getLeft(), this.f1080m.getTop(), this.f1080m.getRight(), this.f1080m.getBottom());
                } else {
                    View view2 = this.f1081n;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1082o.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1082o.setBounds(this.f1081n.getLeft(), this.f1081n.getTop(), this.f1081n.getRight(), this.f1081n.getBottom());
                    }
                }
                z4 = true;
            }
            this.f1086s = z2;
            if (z2 && (drawable = this.f1083p) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z3 = z4;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1080m == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f1087t) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1080m != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1079l;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m40558b(this.f1080m)) {
                    i3 = m40559a(this.f1080m);
                } else if (!m40558b(this.f1081n)) {
                    i3 = m40559a(this.f1081n);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = ViewDefaults.NUMBER_OF_LINES;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m40559a(this.f1079l), i4));
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1082o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1082o);
        }
        this.f1082o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1080m;
            if (view != null) {
                this.f1082o.setBounds(view.getLeft(), this.f1080m.getTop(), this.f1080m.getRight(), this.f1080m.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1085r ? !(this.f1082o == null && this.f1083p == null) : this.f1084q != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1084q;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1084q);
        }
        this.f1084q = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1085r && (drawable2 = this.f1084q) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1085r ? this.f1082o == null && this.f1083p == null : this.f1084q == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1083p;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1083p);
        }
        this.f1083p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1086s && (drawable2 = this.f1083p) != null) {
                drawable2.setBounds(this.f1079l.getLeft(), this.f1079l.getTop(), this.f1079l.getRight(), this.f1079l.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1085r ? !(this.f1082o == null && this.f1083p == null) : this.f1084q != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C1671g1 g1Var) {
        View view = this.f1079l;
        if (view != null) {
            removeView(view);
        }
        this.f1079l = g1Var;
        if (g1Var != null) {
            addView(g1Var);
            ViewGroup.LayoutParams layoutParams = g1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            g1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f1078k = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1082o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1083p;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1084q;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f1082o || this.f1085r) && ((drawable != this.f1083p || !this.f1086s) && ((drawable != this.f1084q || !this.f1085r) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }
}
