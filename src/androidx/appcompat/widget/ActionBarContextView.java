package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.C1575e;
import androidx.core.view.C2674n2;
import androidx.core.view.C2733w0;
import p052d.C6379a;
import p052d.C6384f;
import p052d.C6385g;
import p052d.C6388j;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1634a {

    /* renamed from: A */
    private int f35184A;

    /* renamed from: B */
    private int f35185B;

    /* renamed from: C */
    private boolean f35186C;

    /* renamed from: D */
    private int f35187D;

    /* renamed from: s */
    private CharSequence f1088s;

    /* renamed from: t */
    private CharSequence f1089t;

    /* renamed from: u */
    private View f1090u;

    /* renamed from: v */
    private View f1091v;

    /* renamed from: w */
    private View f1092w;

    /* renamed from: x */
    private LinearLayout f1093x;

    /* renamed from: y */
    private TextView f1094y;

    /* renamed from: z */
    private TextView f1095z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1592a implements View.OnClickListener {

        /* renamed from: k */
        final /* synthetic */ ActionMode f1096k;

        View$OnClickListenerC1592a(ActionMode actionMode) {
            this.f1096k = actionMode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1096k.mo40722c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m40555i() {
        int i;
        if (this.f1093x == null) {
            LayoutInflater.from(getContext()).inflate(C6385g.f13197a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1093x = linearLayout;
            this.f1094y = (TextView) linearLayout.findViewById(C6384f.f13175e);
            this.f1095z = (TextView) this.f1093x.findViewById(C6384f.f13174d);
            if (this.f35184A != 0) {
                this.f1094y.setTextAppearance(getContext(), this.f35184A);
            }
            if (this.f35185B != 0) {
                this.f1095z.setTextAppearance(getContext(), this.f35185B);
            }
        }
        this.f1094y.setText(this.f1088s);
        this.f1095z.setText(this.f1089t);
        boolean z = !TextUtils.isEmpty(this.f1088s);
        boolean z2 = !TextUtils.isEmpty(this.f1089t);
        TextView textView = this.f1095z;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f1093x;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1093x.getParent() == null) {
            addView(this.f1093x);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1634a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C2674n2 mo40330f(int i, long j) {
        return super.mo40330f(i, j);
    }

    /* renamed from: g */
    public void m40557g() {
        if (this.f1090u == null) {
            m40553k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1634a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1634a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1089t;
    }

    public CharSequence getTitle() {
        return this.f1088s;
    }

    /* renamed from: h */
    public void m40556h(ActionMode actionMode) {
        View view = this.f1090u;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f35187D, (ViewGroup) this, false);
            this.f1090u = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1090u);
        }
        View findViewById = this.f1090u.findViewById(C6384f.f13179i);
        this.f1091v = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC1592a(actionMode));
        C1575e eVar = (C1575e) actionMode.mo40720e();
        C1640c cVar = this.f1272n;
        if (cVar != null) {
            cVar.m40297y();
        }
        C1640c cVar2 = new C1640c(getContext());
        this.f1272n = cVar2;
        cVar2.m40316J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.m40648c(this.f1272n, this.f1270l);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1272n.mo40306o(this);
        this.f1271m = actionMenuView;
        C2733w0.m36982u0(actionMenuView, null);
        addView(this.f1271m, layoutParams);
    }

    /* renamed from: j */
    public boolean m40554j() {
        return this.f35186C;
    }

    /* renamed from: k */
    public void m40553k() {
        removeAllViews();
        this.f1092w = null;
        this.f1271m = null;
        this.f1272n = null;
        View view = this.f1091v;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m40552l() {
        C1640c cVar = this.f1272n;
        if (cVar != null) {
            return cVar.m40315K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1640c cVar = this.f1272n;
        if (cVar != null) {
            cVar.m40324B();
            this.f1272n.m40323C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1634a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean b = C1735v1.m39981b(this);
        if (b) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1090u;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1090u.getLayoutParams();
            if (b) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (b) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            int d = AbstractC1634a.m40332d(i5, i7, b);
            i5 = AbstractC1634a.m40332d(d + m40331e(this.f1090u, d, paddingTop, paddingTop2, b), i8, b);
        }
        int i9 = i5;
        LinearLayout linearLayout = this.f1093x;
        if (!(linearLayout == null || this.f1092w != null || linearLayout.getVisibility() == 8)) {
            i9 += m40331e(this.f1093x, i9, paddingTop, paddingTop2, b);
        }
        View view2 = this.f1092w;
        if (view2 != null) {
            m40331e(view2, i9, paddingTop, paddingTop2, b);
        }
        if (b) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1271m;
        if (actionMenuView != null) {
            m40331e(actionMenuView, i6, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i6 = this.f1273o;
            if (i6 <= 0) {
                i6 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i6 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.f1090u;
            if (view != null) {
                int c = m40333c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1090u.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1271m;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = m40333c(this.f1271m, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1093x;
            if (linearLayout != null && this.f1092w == null) {
                if (this.f35186C) {
                    this.f1093x.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1093x.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f1093x;
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                } else {
                    paddingLeft = m40333c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1092w;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width;
                if (i8 != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i7 = Math.min(i9, i7);
                }
                this.f1092w.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
            }
            if (this.f1273o <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i6);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1634a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1634a
    public void setContentHeight(int i) {
        this.f1273o = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1092w;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1092w = view;
        if (!(view == null || (linearLayout = this.f1093x) == null)) {
            removeView(linearLayout);
            this.f1093x = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1089t = charSequence;
        m40555i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1088s = charSequence;
        m40555i();
        C2733w0.m36984t0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f35186C) {
            requestLayout();
        }
        this.f35186C = z;
    }

    @Override // androidx.appcompat.widget.AbstractC1634a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f13104j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1698n1 v = C1698n1.m40105v(context, attributeSet, C6388j.f13355y, i, 0);
        C2733w0.m36982u0(this, v.m40120g(C6388j.f13360z));
        this.f35184A = v.m40113n(C6388j.f37800D, 0);
        this.f35185B = v.m40113n(C6388j.f37795C, 0);
        this.f1273o = v.m40114m(C6388j.f37790B, 0);
        this.f35187D = v.m40113n(C6388j.f37785A, C6385g.f13200d);
        v.m40104w();
    }
}
