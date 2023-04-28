package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.view.menu.C1579g;
import androidx.appcompat.view.menu.SubMenuC1591m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C2706t;
import androidx.core.view.C2731w;
import androidx.core.view.C2733w0;
import androidx.core.view.C2760x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p052d.C6379a;
import p052d.C6388j;
import p071e.C6525a;
import p125h1.AbstractC7736a;
import p144i.AbstractC8095b;
import p144i.C8097d;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f35238A;

    /* renamed from: B */
    private int f35239B;

    /* renamed from: C */
    private int f35240C;

    /* renamed from: D */
    private C1665f1 f35241D;

    /* renamed from: E */
    private int f35242E;

    /* renamed from: F */
    private int f35243F;

    /* renamed from: G */
    private int f35244G;

    /* renamed from: H */
    private CharSequence f35245H;

    /* renamed from: I */
    private CharSequence f35246I;

    /* renamed from: J */
    private ColorStateList f35247J;

    /* renamed from: K */
    private ColorStateList f35248K;

    /* renamed from: L */
    private boolean f35249L;

    /* renamed from: M */
    private boolean f35250M;

    /* renamed from: N */
    private final ArrayList<View> f35251N;

    /* renamed from: O */
    private final ArrayList<View> f35252O;

    /* renamed from: P */
    private final int[] f35253P;

    /* renamed from: Q */
    final C2760x f35254Q;

    /* renamed from: R */
    private ArrayList<MenuItem> f35255R;

    /* renamed from: S */
    AbstractC1630f f35256S;

    /* renamed from: T */
    private final ActionMenuView.AbstractC1602e f35257T;

    /* renamed from: U */
    private C1704p1 f35258U;

    /* renamed from: V */
    private C1640c f35259V;

    /* renamed from: W */
    private C1628d f35260W;

    /* renamed from: a0 */
    private AbstractC1584j.AbstractC1585a f1236a0;

    /* renamed from: b0 */
    private C1575e.AbstractC1576a f1237b0;

    /* renamed from: c0 */
    private boolean f1238c0;

    /* renamed from: d0 */
    private final Runnable f1239d0;

    /* renamed from: k */
    private ActionMenuView f1240k;

    /* renamed from: l */
    private TextView f1241l;

    /* renamed from: m */
    private TextView f1242m;

    /* renamed from: n */
    private ImageButton f1243n;

    /* renamed from: o */
    private ImageView f1244o;

    /* renamed from: p */
    private Drawable f1245p;

    /* renamed from: q */
    private CharSequence f1246q;

    /* renamed from: r */
    ImageButton f1247r;

    /* renamed from: s */
    View f1248s;

    /* renamed from: t */
    private Context f1249t;

    /* renamed from: u */
    private int f1250u;

    /* renamed from: v */
    private int f1251v;

    /* renamed from: w */
    private int f1252w;

    /* renamed from: x */
    int f1253x;

    /* renamed from: y */
    private int f1254y;

    /* renamed from: z */
    private int f1255z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C1625a implements ActionMenuView.AbstractC1602e {
        C1625a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC1602e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f35254Q.m36828b(menuItem)) {
                return true;
            }
            AbstractC1630f fVar = Toolbar.this.f35256S;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC1626b implements Runnable {
        RunnableC1626b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m40369Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1627c implements View.OnClickListener {
        View$OnClickListenerC1627c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m40364e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C1628d implements AbstractC1584j {

        /* renamed from: k */
        C1575e f1259k;

        /* renamed from: l */
        C1579g f1260l;

        C1628d() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j
        /* renamed from: a */
        public void mo40314a(C1575e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j
        /* renamed from: b */
        public boolean mo40342b(C1575e eVar, C1579g gVar) {
            Toolbar.this.m40362g();
            ViewParent parent = Toolbar.this.f1247r.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1247r);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1247r);
            }
            Toolbar.this.f1248s = gVar.getActionView();
            this.f1260l = gVar;
            ViewParent parent2 = Toolbar.this.f1248s.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1248s);
                }
                C1629e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f658a = (toolbar4.f1253x & 112) | 8388611;
                m.f1262b = 2;
                toolbar4.f1248s.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1248s);
            }
            Toolbar.this.m40377I();
            Toolbar.this.requestLayout();
            gVar.m40607r(true);
            View view = Toolbar.this.f1248s;
            if (view instanceof AbstractC8095b) {
                ((AbstractC8095b) view).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j
        /* renamed from: d */
        public boolean mo40313d(SubMenuC1591m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j
        /* renamed from: e */
        public void mo40312e(boolean z) {
            if (this.f1260l != null) {
                C1575e eVar = this.f1259k;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1259k.getItem(i) == this.f1260l) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo40341g(this.f1259k, this.f1260l);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j
        /* renamed from: f */
        public boolean mo40311f() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j
        /* renamed from: g */
        public boolean mo40341g(C1575e eVar, C1579g gVar) {
            View view = Toolbar.this.f1248s;
            if (view instanceof AbstractC8095b) {
                ((AbstractC8095b) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1248s);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1247r);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1248s = null;
            toolbar3.m40368a();
            this.f1260l = null;
            Toolbar.this.requestLayout();
            gVar.m40607r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j
        /* renamed from: h */
        public void mo40310h(Context context, C1575e eVar) {
            C1579g gVar;
            C1575e eVar2 = this.f1259k;
            if (!(eVar2 == null || (gVar = this.f1260l) == null)) {
                eVar2.mo40563f(gVar);
            }
            this.f1259k = eVar;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface AbstractC1630f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    private int m40383C(View view, int i, int[] iArr, int i2) {
        C1629e eVar = (C1629e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m40352q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    /* renamed from: D */
    private int m40382D(View view, int i, int[] iArr, int i2) {
        C1629e eVar = (C1629e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m40352q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    /* renamed from: E */
    private int m40381E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    private void m40380F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    private void m40379G() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f35254Q.m36829a(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f35255R = currentMenuItems2;
    }

    /* renamed from: H */
    private void m40378H() {
        removeCallbacks(this.f1239d0);
        post(this.f1239d0);
    }

    /* renamed from: O */
    private boolean m40371O() {
        if (!this.f1238c0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m40370P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    private boolean m40370P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m40367b(List<View> list, int i) {
        boolean z;
        if (C2733w0.m37063B(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int b = C2706t.m37125b(i, C2733w0.m37063B(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C1629e eVar = (C1629e) childAt.getLayoutParams();
                if (eVar.f1262b == 0 && m40370P(childAt) && m40353p(eVar.f658a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C1629e eVar2 = (C1629e) childAt2.getLayoutParams();
            if (eVar2.f1262b == 0 && m40370P(childAt2) && m40353p(eVar2.f658a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m40366c(View view, boolean z) {
        C1629e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (C1629e) layoutParams;
        }
        eVar.f1262b = 1;
        if (!z || this.f1248s == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f35252O.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C8097d(getContext());
    }

    /* renamed from: h */
    private void m40361h() {
        if (this.f35241D == null) {
            this.f35241D = new C1665f1();
        }
    }

    /* renamed from: i */
    private void m40360i() {
        if (this.f1244o == null) {
            this.f1244o = new C1696n(getContext());
        }
    }

    /* renamed from: j */
    private void m40359j() {
        m40358k();
        if (this.f1240k.m40521L() == null) {
            C1575e eVar = (C1575e) this.f1240k.getMenu();
            if (this.f35260W == null) {
                this.f35260W = new C1628d();
            }
            this.f1240k.setExpandedActionViewsExclusive(true);
            eVar.m40648c(this.f35260W, this.f1249t);
        }
    }

    /* renamed from: k */
    private void m40358k() {
        if (this.f1240k == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1240k = actionMenuView;
            actionMenuView.setPopupTheme(this.f1250u);
            this.f1240k.setOnMenuItemClickListener(this.f35257T);
            this.f1240k.m40520M(this.f1236a0, this.f1237b0);
            C1629e m = generateDefaultLayoutParams();
            m.f658a = (this.f1253x & 112) | 8388613;
            this.f1240k.setLayoutParams(m);
            m40366c(this.f1240k, false);
        }
    }

    /* renamed from: l */
    private void m40357l() {
        if (this.f1243n == null) {
            this.f1243n = new C1693m(getContext(), null, C6379a.f37748N);
            C1629e m = generateDefaultLayoutParams();
            m.f658a = (this.f1253x & 112) | 8388611;
            this.f1243n.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m40353p(int i) {
        int B = C2733w0.m37063B(this);
        int b = C2706t.m37125b(i, B) & 7;
        if (b == 1 || b == 3 || b == 5) {
            return b;
        }
        if (B == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: q */
    private int m40352q(View view, int i) {
        int i2;
        C1629e eVar = (C1629e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int r = m40351r(eVar.f658a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m40351r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f35244G & 112;
    }

    /* renamed from: s */
    private int m40350s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C2731w.m37076b(marginLayoutParams) + C2731w.m37077a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m40349t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m40348u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C1629e eVar = (C1629e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: z */
    private boolean m40343z(View view) {
        return view.getParent() == this || this.f35252O.contains(view);
    }

    /* renamed from: A */
    public boolean m40385A() {
        ActionMenuView actionMenuView = this.f1240k;
        return actionMenuView != null && actionMenuView.m40526G();
    }

    /* renamed from: B */
    public boolean m40384B() {
        ActionMenuView actionMenuView = this.f1240k;
        return actionMenuView != null && actionMenuView.m40525H();
    }

    /* renamed from: I */
    void m40377I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C1629e) childAt.getLayoutParams()).f1262b == 2 || childAt == this.f1240k)) {
                removeViewAt(childCount);
                this.f35252O.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void m40376J(int i, int i2) {
        m40361h();
        this.f35241D.m40243g(i, i2);
    }

    /* renamed from: K */
    public void m40375K(C1575e eVar, C1640c cVar) {
        if (eVar != null || this.f1240k != null) {
            m40358k();
            C1575e L = this.f1240k.m40521L();
            if (L != eVar) {
                if (L != null) {
                    L.m40663O(this.f35259V);
                    L.m40663O(this.f35260W);
                }
                if (this.f35260W == null) {
                    this.f35260W = new C1628d();
                }
                cVar.m40319G(true);
                if (eVar != null) {
                    eVar.m40648c(cVar, this.f1249t);
                    eVar.m40648c(this.f35260W, this.f1249t);
                } else {
                    cVar.mo40310h(this.f1249t, null);
                    this.f35260W.mo40310h(this.f1249t, null);
                    cVar.mo40312e(true);
                    this.f35260W.mo40312e(true);
                }
                this.f1240k.setPopupTheme(this.f1250u);
                this.f1240k.setPresenter(cVar);
                this.f35259V = cVar;
            }
        }
    }

    /* renamed from: L */
    public void m40374L(AbstractC1584j.AbstractC1585a aVar, C1575e.AbstractC1576a aVar2) {
        this.f1236a0 = aVar;
        this.f1237b0 = aVar2;
        ActionMenuView actionMenuView = this.f1240k;
        if (actionMenuView != null) {
            actionMenuView.m40520M(aVar, aVar2);
        }
    }

    /* renamed from: M */
    public void m40373M(Context context, int i) {
        this.f1252w = i;
        TextView textView = this.f1242m;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: N */
    public void m40372N(Context context, int i) {
        this.f1251v = i;
        TextView textView = this.f1241l;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: Q */
    public boolean m40369Q() {
        ActionMenuView actionMenuView = this.f1240k;
        return actionMenuView != null && actionMenuView.m40519N();
    }

    /* renamed from: a */
    void m40368a() {
        for (int size = this.f35252O.size() - 1; size >= 0; size--) {
            addView(this.f35252O.get(size));
        }
        this.f35252O.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1629e);
    }

    /* renamed from: d */
    public boolean m40365d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1240k) != null && actionMenuView.m40524I();
    }

    /* renamed from: e */
    public void m40364e() {
        C1579g gVar;
        C1628d dVar = this.f35260W;
        if (dVar == null) {
            gVar = null;
        } else {
            gVar = dVar.f1260l;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m40363f() {
        ActionMenuView actionMenuView = this.f1240k;
        if (actionMenuView != null) {
            actionMenuView.m40517z();
        }
    }

    /* renamed from: g */
    void m40362g() {
        if (this.f1247r == null) {
            C1693m mVar = new C1693m(getContext(), null, C6379a.f37748N);
            this.f1247r = mVar;
            mVar.setImageDrawable(this.f1245p);
            this.f1247r.setContentDescription(this.f1246q);
            C1629e m = generateDefaultLayoutParams();
            m.f658a = (this.f1253x & 112) | 8388611;
            m.f1262b = 2;
            this.f1247r.setLayoutParams(m);
            this.f1247r.setOnClickListener(new View$OnClickListenerC1627c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1247r;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1247r;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1665f1 f1Var = this.f35241D;
        if (f1Var != null) {
            return f1Var.m40249a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f35243F;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1665f1 f1Var = this.f35241D;
        if (f1Var != null) {
            return f1Var.m40248b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1665f1 f1Var = this.f35241D;
        if (f1Var != null) {
            return f1Var.m40247c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1665f1 f1Var = this.f35241D;
        if (f1Var != null) {
            return f1Var.m40246d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f35242E;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C1575e L;
        ActionMenuView actionMenuView = this.f1240k;
        if (actionMenuView == null || (L = actionMenuView.m40521L()) == null || !L.hasVisibleItems()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f35243F, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C2733w0.m37063B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C2733w0.m37063B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f35242E, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1244o;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1244o;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m40359j();
        return this.f1240k.getMenu();
    }

    View getNavButtonView() {
        return this.f1243n;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1243n;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1243n;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1640c getOuterActionMenuPresenter() {
        return this.f35259V;
    }

    public Drawable getOverflowIcon() {
        m40359j();
        return this.f1240k.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1249t;
    }

    public int getPopupTheme() {
        return this.f1250u;
    }

    public CharSequence getSubtitle() {
        return this.f35246I;
    }

    final TextView getSubtitleTextView() {
        return this.f1242m;
    }

    public CharSequence getTitle() {
        return this.f35245H;
    }

    public int getTitleMarginBottom() {
        return this.f35240C;
    }

    public int getTitleMarginEnd() {
        return this.f35238A;
    }

    public int getTitleMarginStart() {
        return this.f1255z;
    }

    public int getTitleMarginTop() {
        return this.f35239B;
    }

    final TextView getTitleTextView() {
        return this.f1241l;
    }

    public AbstractC1691l0 getWrapper() {
        if (this.f35258U == null) {
            this.f35258U = new C1704p1(this, true);
        }
        return this.f35258U;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public C1629e generateDefaultLayoutParams() {
        return new C1629e(-2, -2);
    }

    /* renamed from: n */
    public C1629e generateLayoutParams(AttributeSet attributeSet) {
        return new C1629e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public C1629e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1629e) {
            return new C1629e((C1629e) layoutParams);
        }
        if (layoutParams instanceof ActionBar.C1499a) {
            return new C1629e((ActionBar.C1499a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1629e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1629e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1239d0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f35250M = false;
        }
        if (!this.f35250M) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f35250M = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f35250M = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029f A[LOOP:0: B:103:0x029d->B:104:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c1 A[LOOP:1: B:106:0x02bf->B:107:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fa A[LOOP:2: B:114:0x02f8->B:115:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f35253P;
        boolean b = C1735v1.m39981b(this);
        int i10 = 0;
        int i11 = !b ? 1 : 0;
        if (m40370P(this.f1243n)) {
            m40380F(this.f1243n, i, 0, i2, 0, this.f1254y);
            i5 = this.f1243n.getMeasuredWidth() + m40350s(this.f1243n);
            i4 = Math.max(0, this.f1243n.getMeasuredHeight() + m40349t(this.f1243n));
            i3 = View.combineMeasuredStates(0, this.f1243n.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m40370P(this.f1247r)) {
            m40380F(this.f1247r, i, 0, i2, 0, this.f1254y);
            i5 = this.f1247r.getMeasuredWidth() + m40350s(this.f1247r);
            i4 = Math.max(i4, this.f1247r.getMeasuredHeight() + m40349t(this.f1247r));
            i3 = View.combineMeasuredStates(i3, this.f1247r.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b ? 1 : 0] = Math.max(0, currentContentInsetStart - i5);
        if (m40370P(this.f1240k)) {
            m40380F(this.f1240k, i, max, i2, 0, this.f1254y);
            i6 = this.f1240k.getMeasuredWidth() + m40350s(this.f1240k);
            i4 = Math.max(i4, this.f1240k.getMeasuredHeight() + m40349t(this.f1240k));
            i3 = View.combineMeasuredStates(i3, this.f1240k.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i6);
        if (m40370P(this.f1248s)) {
            max2 += m40381E(this.f1248s, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1248s.getMeasuredHeight() + m40349t(this.f1248s));
            i3 = View.combineMeasuredStates(i3, this.f1248s.getMeasuredState());
        }
        if (m40370P(this.f1244o)) {
            max2 += m40381E(this.f1244o, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1244o.getMeasuredHeight() + m40349t(this.f1244o));
            i3 = View.combineMeasuredStates(i3, this.f1244o.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C1629e) childAt.getLayoutParams()).f1262b == 0 && m40370P(childAt)) {
                max2 += m40381E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m40349t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f35239B + this.f35240C;
        int i14 = this.f1255z + this.f35238A;
        if (m40370P(this.f1241l)) {
            m40381E(this.f1241l, i, max2 + i14, i2, i13, iArr);
            int measuredWidth = this.f1241l.getMeasuredWidth() + m40350s(this.f1241l);
            i7 = this.f1241l.getMeasuredHeight() + m40349t(this.f1241l);
            i9 = View.combineMeasuredStates(i3, this.f1241l.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (m40370P(this.f1242m)) {
            i8 = Math.max(i8, m40381E(this.f1242m, i, max2 + i14, i2, i7 + i13, iArr));
            i7 += this.f1242m.getMeasuredHeight() + m40349t(this.f1242m);
            i9 = View.combineMeasuredStates(i9, this.f1242m.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m40371O()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C1575e eVar;
        MenuItem findItem;
        if (!(parcelable instanceof C1631g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1631g gVar = (C1631g) parcelable;
        super.onRestoreInstanceState(gVar.m21547a());
        ActionMenuView actionMenuView = this.f1240k;
        if (actionMenuView != null) {
            eVar = actionMenuView.m40521L();
        } else {
            eVar = null;
        }
        int i = gVar.f1263m;
        if (!(i == 0 || this.f35260W == null || eVar == null || (findItem = eVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f1264n) {
            m40378H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m40361h();
        C1665f1 f1Var = this.f35241D;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        f1Var.m40244f(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1579g gVar;
        C1631g gVar2 = new C1631g(super.onSaveInstanceState());
        C1628d dVar = this.f35260W;
        if (!(dVar == null || (gVar = dVar.f1260l) == null)) {
            gVar2.f1263m = gVar.getItemId();
        }
        gVar2.f1264n = m40384B();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f35249L = false;
        }
        if (!this.f35249L) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f35249L = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f35249L = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C6525a.m25364b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1238c0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f35243F) {
            this.f35243F = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f35242E) {
            this.f35242E = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C6525a.m25364b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C6525a.m25364b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m40357l();
        this.f1243n.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(AbstractC1630f fVar) {
        this.f35256S = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m40359j();
        this.f1240k.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1250u != i) {
            this.f1250u = i;
            if (i == 0) {
                this.f1249t = getContext();
            } else {
                this.f1249t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f35240C = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f35238A = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1255z = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f35239B = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public boolean m40347v() {
        C1628d dVar = this.f35260W;
        return (dVar == null || dVar.f1260l == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m40346w() {
        ActionMenuView actionMenuView = this.f1240k;
        return actionMenuView != null && actionMenuView.m40527F();
    }

    /* renamed from: x */
    public void m40345x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void m40344y() {
        Iterator<MenuItem> it = this.f35255R.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m40379G();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C1629e extends ActionBar.C1499a {

        /* renamed from: b */
        int f1262b;

        public C1629e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1262b = 0;
        }

        /* renamed from: a */
        void m40340a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C1629e(int i, int i2) {
            super(i, i2);
            this.f1262b = 0;
            this.f658a = 8388627;
        }

        public C1629e(C1629e eVar) {
            super((ActionBar.C1499a) eVar);
            this.f1262b = 0;
            this.f1262b = eVar.f1262b;
        }

        public C1629e(ActionBar.C1499a aVar) {
            super(aVar);
            this.f1262b = 0;
        }

        public C1629e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1262b = 0;
            m40340a(marginLayoutParams);
        }

        public C1629e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1262b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37749O);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40362g();
        }
        ImageButton imageButton = this.f1247r;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m40362g();
            this.f1247r.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1247r;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1245p);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m40360i();
            if (!m40343z(this.f1244o)) {
                m40366c(this.f1244o, true);
            }
        } else {
            ImageView imageView = this.f1244o;
            if (imageView != null && m40343z(imageView)) {
                removeView(this.f1244o);
                this.f35252O.remove(this.f1244o);
            }
        }
        ImageView imageView2 = this.f1244o;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40360i();
        }
        ImageView imageView = this.f1244o;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40357l();
        }
        ImageButton imageButton = this.f1243n;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C1715r1.m40049a(this.f1243n, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m40357l();
            if (!m40343z(this.f1243n)) {
                m40366c(this.f1243n, true);
            }
        } else {
            ImageButton imageButton = this.f1243n;
            if (imageButton != null && m40343z(imageButton)) {
                removeView(this.f1243n);
                this.f35252O.remove(this.f1243n);
            }
        }
        ImageButton imageButton2 = this.f1243n;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1242m == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1242m = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1242m.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1252w;
                if (i != 0) {
                    this.f1242m.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f35248K;
                if (colorStateList != null) {
                    this.f1242m.setTextColor(colorStateList);
                }
            }
            if (!m40343z(this.f1242m)) {
                m40366c(this.f1242m, true);
            }
        } else {
            TextView textView = this.f1242m;
            if (textView != null && m40343z(textView)) {
                removeView(this.f1242m);
                this.f35252O.remove(this.f1242m);
            }
        }
        TextView textView2 = this.f1242m;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f35246I = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f35248K = colorStateList;
        TextView textView = this.f1242m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1241l == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1241l = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1241l.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1251v;
                if (i != 0) {
                    this.f1241l.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f35247J;
                if (colorStateList != null) {
                    this.f1241l.setTextColor(colorStateList);
                }
            }
            if (!m40343z(this.f1241l)) {
                m40366c(this.f1241l, true);
            }
        } else {
            TextView textView = this.f1241l;
            if (textView != null && m40343z(textView)) {
                removeView(this.f1241l);
                this.f35252O.remove(this.f1241l);
            }
        }
        TextView textView2 = this.f1241l;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f35245H = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f35247J = colorStateList;
        TextView textView = this.f1241l;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C1631g extends AbstractC7736a {
        public static final Parcelable.Creator<C1631g> CREATOR = new C1632a();

        /* renamed from: m */
        int f1263m;

        /* renamed from: n */
        boolean f1264n;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: classes.dex */
        class C1632a implements Parcelable.ClassLoaderCreator<C1631g> {
            C1632a() {
            }

            /* renamed from: a */
            public C1631g createFromParcel(Parcel parcel) {
                return new C1631g(parcel, null);
            }

            /* renamed from: b */
            public C1631g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1631g(parcel, classLoader);
            }

            /* renamed from: c */
            public C1631g[] newArray(int i) {
                return new C1631g[i];
            }
        }

        public C1631g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1263m = parcel.readInt();
            this.f1264n = parcel.readInt() != 0;
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1263m);
            parcel.writeInt(this.f1264n ? 1 : 0);
        }

        public C1631g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35244G = 8388627;
        this.f35251N = new ArrayList<>();
        this.f35252O = new ArrayList<>();
        this.f35253P = new int[2];
        this.f35254Q = new C2760x(new Runnable() { // from class: androidx.appcompat.widget.o1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.m40344y();
            }
        });
        this.f35255R = new ArrayList<>();
        this.f35257T = new C1625a();
        this.f1239d0 = new RunnableC1626b();
        Context context2 = getContext();
        int[] iArr = C6388j.f13254d3;
        C1698n1 v = C1698n1.m40105v(context2, attributeSet, iArr, i, 0);
        C2733w0.m36994o0(this, context, iArr, attributeSet, v.m40109r(), i, 0);
        this.f1251v = v.m40113n(C6388j.f37814F3, 0);
        this.f1252w = v.m40113n(C6388j.f13349w3, 0);
        this.f35244G = v.m40115l(C6388j.f13259e3, this.f35244G);
        this.f1253x = v.m40115l(C6388j.f13264f3, 48);
        int e = v.m40122e(C6388j.f13364z3, 0);
        int i2 = C6388j.f37809E3;
        e = v.m40108s(i2) ? v.m40122e(i2, e) : e;
        this.f35240C = e;
        this.f35239B = e;
        this.f35238A = e;
        this.f1255z = e;
        int e2 = v.m40122e(C6388j.f37799C3, -1);
        if (e2 >= 0) {
            this.f1255z = e2;
        }
        int e3 = v.m40122e(C6388j.f37794B3, -1);
        if (e3 >= 0) {
            this.f35238A = e3;
        }
        int e4 = v.m40122e(C6388j.f37804D3, -1);
        if (e4 >= 0) {
            this.f35239B = e4;
        }
        int e5 = v.m40122e(C6388j.f37789A3, -1);
        if (e5 >= 0) {
            this.f35240C = e5;
        }
        this.f1254y = v.m40121f(C6388j.f13319q3, -1);
        int e6 = v.m40122e(C6388j.f13299m3, Integer.MIN_VALUE);
        int e7 = v.m40122e(C6388j.f13279i3, Integer.MIN_VALUE);
        int f = v.m40121f(C6388j.f13289k3, 0);
        int f2 = v.m40121f(C6388j.f13294l3, 0);
        m40361h();
        this.f35241D.m40245e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f35241D.m40243g(e6, e7);
        }
        this.f35242E = v.m40122e(C6388j.f13304n3, Integer.MIN_VALUE);
        this.f35243F = v.m40122e(C6388j.f13284j3, Integer.MIN_VALUE);
        this.f1245p = v.m40120g(C6388j.f13274h3);
        this.f1246q = v.m40111p(C6388j.f13269g3);
        CharSequence p = v.m40111p(C6388j.f13359y3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.m40111p(C6388j.f13344v3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f1249t = getContext();
        setPopupTheme(v.m40113n(C6388j.f13339u3, 0));
        Drawable g = v.m40120g(C6388j.f13334t3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.m40111p(C6388j.f13329s3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.m40120g(C6388j.f13309o3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.m40111p(C6388j.f13314p3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C6388j.f37819G3;
        if (v.m40108s(i3)) {
            setTitleTextColor(v.m40124c(i3));
        }
        int i4 = C6388j.f13354x3;
        if (v.m40108s(i4)) {
            setSubtitleTextColor(v.m40124c(i4));
        }
        int i5 = C6388j.f13324r3;
        if (v.m40108s(i5)) {
            m40345x(v.m40113n(i5, 0));
        }
        v.m40104w();
    }
}
