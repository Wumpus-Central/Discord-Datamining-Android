package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.AbstractC1586k;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.view.menu.C1579g;
import androidx.appcompat.widget.C1733v0;

/* loaded from: classes.dex */
public class ActionMenuView extends C1733v0 implements C1575e.AbstractC1577b, AbstractC1586k {

    /* renamed from: A */
    private Context f35204A;

    /* renamed from: B */
    private int f35205B;

    /* renamed from: C */
    private boolean f35206C;

    /* renamed from: D */
    private C1640c f35207D;

    /* renamed from: E */
    private AbstractC1584j.AbstractC1585a f35208E;

    /* renamed from: F */
    C1575e.AbstractC1576a f35209F;

    /* renamed from: G */
    private boolean f35210G;

    /* renamed from: H */
    private int f35211H;

    /* renamed from: I */
    private int f35212I;

    /* renamed from: J */
    private int f35213J;

    /* renamed from: K */
    AbstractC1602e f35214K;

    /* renamed from: z */
    private C1575e f1117z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface AbstractC1598a {
        /* renamed from: a */
        boolean mo40294a();

        /* renamed from: b */
        boolean mo40293b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C1599b implements AbstractC1584j.AbstractC1585a {
        C1599b() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: a */
        public void mo40291a(C1575e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: b */
        public boolean mo40290b(C1575e eVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C1600c extends C1733v0.C1734a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1118a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1119b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1120c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1121d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1122e;

        /* renamed from: f */
        boolean f1123f;

        public C1600c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1600c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1600c(C1600c cVar) {
            super(cVar);
            this.f1118a = cVar.f1118a;
        }

        public C1600c(int i, int i2) {
            super(i, i2);
            this.f1118a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C1601d implements C1575e.AbstractC1576a {
        C1601d() {
        }

        @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
        /* renamed from: a */
        public boolean mo40516a(C1575e eVar, MenuItem menuItem) {
            AbstractC1602e eVar2 = ActionMenuView.this.f35214K;
            if (eVar2 == null || !eVar2.onMenuItemClick(menuItem)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
        /* renamed from: b */
        public void mo40515b(C1575e eVar) {
            C1575e.AbstractC1576a aVar = ActionMenuView.this.f35209F;
            if (aVar != null) {
                aVar.mo40515b(eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface AbstractC1602e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m40523J(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        C1600c cVar = (C1600c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.m40702e()) {
            z = false;
        } else {
            z = true;
        }
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
                if (!cVar.f1118a || !z) {
                    z2 = false;
                }
                cVar.f1121d = z2;
                cVar.f1119b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!cVar.f1118a) {
        }
        z2 = false;
        cVar.f1121d = z2;
        cVar.f1119b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m40522K(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m40522K(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public C1600c mo39997k() {
        C1600c cVar = new C1600c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    /* renamed from: B */
    public C1600c mo39996l(AttributeSet attributeSet) {
        return new C1600c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public C1600c mo39995m(ViewGroup.LayoutParams layoutParams) {
        C1600c cVar;
        if (layoutParams == null) {
            return mo39997k();
        }
        if (layoutParams instanceof C1600c) {
            cVar = new C1600c((C1600c) layoutParams);
        } else {
            cVar = new C1600c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    /* renamed from: D */
    public C1600c m40529D() {
        C1600c A = mo39997k();
        A.f1118a = true;
        return A;
    }

    /* renamed from: E */
    protected boolean m40528E(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof AbstractC1598a)) {
            z = false | ((AbstractC1598a) childAt).mo40294a();
        }
        if (i <= 0 || !(childAt2 instanceof AbstractC1598a)) {
            return z;
        }
        return z | ((AbstractC1598a) childAt2).mo40293b();
    }

    /* renamed from: F */
    public boolean m40527F() {
        C1640c cVar = this.f35207D;
        return cVar != null && cVar.m40324B();
    }

    /* renamed from: G */
    public boolean m40526G() {
        C1640c cVar = this.f35207D;
        return cVar != null && cVar.m40322D();
    }

    /* renamed from: H */
    public boolean m40525H() {
        C1640c cVar = this.f35207D;
        return cVar != null && cVar.m40321E();
    }

    /* renamed from: I */
    public boolean m40524I() {
        return this.f35206C;
    }

    /* renamed from: L */
    public C1575e m40521L() {
        return this.f1117z;
    }

    /* renamed from: M */
    public void m40520M(AbstractC1584j.AbstractC1585a aVar, C1575e.AbstractC1576a aVar2) {
        this.f35208E = aVar;
        this.f35209F = aVar2;
    }

    /* renamed from: N */
    public boolean m40519N() {
        C1640c cVar = this.f35207D;
        return cVar != null && cVar.m40315K();
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k
    /* renamed from: a */
    public void mo27963a(C1575e eVar) {
        this.f1117z = eVar;
    }

    @Override // androidx.appcompat.view.menu.C1575e.AbstractC1577b
    /* renamed from: b */
    public boolean mo40518b(C1579g gVar) {
        return this.f1117z.m40666L(gVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1733v0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1600c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1117z == null) {
            Context context = getContext();
            C1575e eVar = new C1575e(context);
            this.f1117z = eVar;
            eVar.mo40565R(new C1601d());
            C1640c cVar = new C1640c(context);
            this.f35207D = cVar;
            cVar.m40316J(true);
            C1640c cVar2 = this.f35207D;
            AbstractC1584j.AbstractC1585a aVar = this.f35208E;
            if (aVar == null) {
                aVar = new C1599b();
            }
            cVar2.mo40579c(aVar);
            this.f1117z.m40648c(this.f35207D, this.f35204A);
            this.f35207D.m40318H(this);
        }
        return this.f1117z;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f35207D.m40325A();
    }

    public int getPopupTheme() {
        return this.f35205B;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1640c cVar = this.f35207D;
        if (cVar != null) {
            cVar.mo40312e(false);
            if (this.f35207D.m40321E()) {
                this.f35207D.m40324B();
                this.f35207D.m40315K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m40517z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1733v0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (!this.f35210G) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b = C1735v1.m39981b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C1600c cVar = (C1600c) childAt.getLayoutParams();
                if (cVar.f1118a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m40528E(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    m40528E(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C1600c cVar2 = (C1600c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1118a) {
                    int i18 = width - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C1600c cVar3 = (C1600c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1118a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1733v0, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        C1575e eVar;
        boolean z2 = this.f35210G;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f35210G = z;
        if (z2 != z) {
            this.f35211H = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f35210G || (eVar = this.f1117z) == null || size == this.f35211H)) {
            this.f35211H = size;
            eVar.m40667K(true);
        }
        int childCount = getChildCount();
        if (!this.f35210G || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C1600c cVar = (C1600c) getChildAt(i3).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m40522K(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f35207D.m40319G(z);
    }

    public void setOnMenuItemClickListener(AbstractC1602e eVar) {
        this.f35214K = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f35207D.m40317I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f35206C = z;
    }

    public void setPopupTheme(int i) {
        if (this.f35205B != i) {
            this.f35205B = i;
            if (i == 0) {
                this.f35204A = getContext();
            } else {
                this.f35204A = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1640c cVar) {
        this.f35207D = cVar;
        cVar.m40318H(this);
    }

    /* renamed from: z */
    public void m40517z() {
        C1640c cVar = this.f35207D;
        if (cVar != null) {
            cVar.m40297y();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f35212I = (int) (56.0f * f);
        this.f35213J = (int) (f * 4.0f);
        this.f35204A = context;
        this.f35205B = 0;
    }
}
