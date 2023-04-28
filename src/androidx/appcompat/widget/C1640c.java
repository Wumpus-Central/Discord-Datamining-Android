package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC1566a;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.AbstractC1586k;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.view.menu.C1579g;
import androidx.appcompat.view.menu.C1582i;
import androidx.appcompat.view.menu.SubMenuC1591m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.AbstractC2599b;
import java.util.ArrayList;
import p052d.C6379a;
import p052d.C6385g;
import p144i.C8094a;
import p164j.AbstractC9457e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C1640c extends AbstractC1566a implements AbstractC2599b.AbstractC2600a {

    /* renamed from: A */
    private int f35261A;

    /* renamed from: B */
    private int f35262B;

    /* renamed from: C */
    private boolean f35263C;

    /* renamed from: D */
    private boolean f35264D;

    /* renamed from: E */
    private boolean f35265E;

    /* renamed from: F */
    private boolean f35266F;

    /* renamed from: G */
    private int f35267G;

    /* renamed from: I */
    C1645e f35269I;

    /* renamed from: J */
    C1641a f35270J;

    /* renamed from: K */
    RunnableC0019c f35271K;

    /* renamed from: L */
    private C1642b f35272L;

    /* renamed from: N */
    int f35274N;

    /* renamed from: u */
    C1643d f1281u;

    /* renamed from: v */
    private Drawable f1282v;

    /* renamed from: w */
    private boolean f1283w;

    /* renamed from: x */
    private boolean f1284x;

    /* renamed from: y */
    private boolean f1285y;

    /* renamed from: z */
    private int f1286z;

    /* renamed from: H */
    private final SparseBooleanArray f35268H = new SparseBooleanArray();

    /* renamed from: M */
    final C1646f f35273M = new C1646f();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public class C1641a extends C1582i {
        public C1641a(Context context, SubMenuC1591m mVar, View view) {
            super(context, mVar, view, false, C6379a.f13106l);
            if (!((C1579g) mVar.getItem()).m40613l()) {
                View view2 = C1640c.this.f1281u;
                m40588f(view2 == null ? (View) ((AbstractC1566a) C1640c.this).f946s : view2);
            }
            m40584j(C1640c.this.f35273M);
        }

        @Override // androidx.appcompat.view.menu.C1582i
        /* renamed from: e */
        protected void mo40292e() {
            C1640c cVar = C1640c.this;
            cVar.f35270J = null;
            cVar.f35274N = 0;
            super.mo40292e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    private class C1642b extends ActionMenuItemView.AbstractC1565b {
        C1642b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC1565b
        /* renamed from: a */
        public AbstractC9457e mo40295a() {
            C1641a aVar = C1640c.this.f35270J;
            if (aVar != null) {
                return aVar.m40590c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0019c implements Runnable {

        /* renamed from: k */
        private C1645e f1289k;

        public RunnableC0019c(C1645e eVar) {
            this.f1289k = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC1566a) C1640c.this).f940m != null) {
                ((AbstractC1566a) C1640c.this).f940m.m40646d();
            }
            View view = (View) ((AbstractC1566a) C1640c.this).f946s;
            if (!(view == null || view.getWindowToken() == null || !this.f1289k.m40581m())) {
                C1640c.this.f35269I = this.f1289k;
            }
            C1640c.this.f35271K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    public class C1643d extends C1696n implements ActionMenuView.AbstractC1598a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes.dex */
        class C1644a extends AbstractView$OnTouchListenerC1728u0 {

            /* renamed from: t */
            final /* synthetic */ C1640c f1292t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1644a(View view, C1640c cVar) {
                super(view);
                this.f1292t = cVar;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0
            /* renamed from: b */
            public AbstractC9457e mo39977b() {
                C1645e eVar = C1640c.this.f35269I;
                if (eVar == null) {
                    return null;
                }
                return eVar.m40590c();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0
            /* renamed from: c */
            public boolean mo39976c() {
                C1640c.this.m40315K();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0
            /* renamed from: d */
            public boolean mo40013d() {
                C1640c cVar = C1640c.this;
                if (cVar.f35271K != null) {
                    return false;
                }
                cVar.m40324B();
                return true;
            }
        }

        public C1643d(Context context) {
            super(context, null, C6379a.f13105k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C1715r1.m40049a(this, getContentDescription());
            setOnTouchListener(new C1644a(this, C1640c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC1598a
        /* renamed from: a */
        public boolean mo40294a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC1598a
        /* renamed from: b */
        public boolean mo40293b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1640c.this.m40315K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C2400a.m37831l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes.dex */
    public class C1645e extends C1582i {
        public C1645e(Context context, C1575e eVar, View view, boolean z) {
            super(context, eVar, view, z, C6379a.f13106l);
            m40586h(8388613);
            m40584j(C1640c.this.f35273M);
        }

        @Override // androidx.appcompat.view.menu.C1582i
        /* renamed from: e */
        protected void mo40292e() {
            if (((AbstractC1566a) C1640c.this).f940m != null) {
                ((AbstractC1566a) C1640c.this).f940m.close();
            }
            C1640c.this.f35269I = null;
            super.mo40292e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes.dex */
    private class C1646f implements AbstractC1584j.AbstractC1585a {
        C1646f() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: a */
        public void mo40291a(C1575e eVar, boolean z) {
            if (eVar instanceof SubMenuC1591m) {
                eVar.mo40569D().m40644e(false);
            }
            AbstractC1584j.AbstractC1585a m = C1640c.this.m40691m();
            if (m != null) {
                m.mo40291a(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: b */
        public boolean mo40290b(C1575e eVar) {
            if (eVar == ((AbstractC1566a) C1640c.this).f940m) {
                return false;
            }
            C1640c.this.f35274N = ((SubMenuC1591m) eVar).getItem().getItemId();
            AbstractC1584j.AbstractC1585a m = C1640c.this.m40691m();
            if (m != null) {
                return m.mo40290b(eVar);
            }
            return false;
        }
    }

    public C1640c(Context context) {
        super(context, C6385g.f13199c, C6385g.f13198b);
    }

    /* renamed from: z */
    private View m40296z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f946s;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof AbstractC1586k.AbstractC1587a) && ((AbstractC1586k.AbstractC1587a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable m40325A() {
        C1643d dVar = this.f1281u;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1283w) {
            return this.f1282v;
        }
        return null;
    }

    /* renamed from: B */
    public boolean m40324B() {
        AbstractC1586k kVar;
        RunnableC0019c cVar = this.f35271K;
        if (cVar == null || (kVar = this.f946s) == null) {
            C1645e eVar = this.f35269I;
            if (eVar == null) {
                return false;
            }
            eVar.m40591b();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.f35271K = null;
        return true;
    }

    /* renamed from: C */
    public boolean m40323C() {
        C1641a aVar = this.f35270J;
        if (aVar == null) {
            return false;
        }
        aVar.m40591b();
        return true;
    }

    /* renamed from: D */
    public boolean m40322D() {
        return this.f35271K != null || m40321E();
    }

    /* renamed from: E */
    public boolean m40321E() {
        C1645e eVar = this.f35269I;
        return eVar != null && eVar.m40589d();
    }

    /* renamed from: F */
    public void m40320F(Configuration configuration) {
        if (!this.f35263C) {
            this.f35262B = C8094a.m20628b(this.f939l).m20626d();
        }
        C1575e eVar = this.f940m;
        if (eVar != null) {
            eVar.m40667K(true);
        }
    }

    /* renamed from: G */
    public void m40319G(boolean z) {
        this.f35266F = z;
    }

    /* renamed from: H */
    public void m40318H(ActionMenuView actionMenuView) {
        this.f946s = actionMenuView;
        actionMenuView.mo27963a(this.f940m);
    }

    /* renamed from: I */
    public void m40317I(Drawable drawable) {
        C1643d dVar = this.f1281u;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1283w = true;
        this.f1282v = drawable;
    }

    /* renamed from: J */
    public void m40316J(boolean z) {
        this.f1284x = z;
        this.f1285y = true;
    }

    /* renamed from: K */
    public boolean m40315K() {
        C1575e eVar;
        if (!this.f1284x || m40321E() || (eVar = this.f940m) == null || this.f946s == null || this.f35271K != null || eVar.m40627z().isEmpty()) {
            return false;
        }
        RunnableC0019c cVar = new RunnableC0019c(new C1645e(this.f939l, this.f940m, this.f1281u, true));
        this.f35271K = cVar;
        ((View) this.f946s).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a, androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: a */
    public void mo40314a(C1575e eVar, boolean z) {
        m40297y();
        super.mo40314a(eVar, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a, androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: d */
    public boolean mo40313d(SubMenuC1591m mVar) {
        boolean z = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        SubMenuC1591m mVar2 = mVar;
        while (mVar2.m40564e0() != this.f940m) {
            mVar2 = (SubMenuC1591m) mVar2.m40564e0();
        }
        View z2 = m40296z(mVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.f35274N = mVar.getItem().getItemId();
        int size = mVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C1641a aVar = new C1641a(this.f939l, mVar, z2);
        this.f35270J = aVar;
        aVar.m40587g(z);
        this.f35270J.m40583k();
        super.mo40313d(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a, androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: e */
    public void mo40312e(boolean z) {
        ArrayList<C1579g> arrayList;
        super.mo40312e(z);
        ((View) this.f946s).requestLayout();
        C1575e eVar = this.f940m;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<C1579g> s = eVar.m40633s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                AbstractC2599b a = s.get(i).mo16222a();
                if (a != null) {
                    a.m37285i(this);
                }
            }
        }
        C1575e eVar2 = this.f940m;
        if (eVar2 != null) {
            arrayList = eVar2.m40627z();
        } else {
            arrayList = null;
        }
        if (this.f1284x && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1281u == null) {
                this.f1281u = new C1643d(this.f938k);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1281u.getParent();
            if (viewGroup != this.f946s) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1281u);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f946s;
                actionMenuView.addView(this.f1281u, actionMenuView.m40529D());
            }
        } else {
            C1643d dVar = this.f1281u;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                AbstractC1586k kVar = this.f946s;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.f1281u);
                }
            }
        }
        ((ActionMenuView) this.f946s).setOverflowReserved(this.f1284x);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: f */
    public boolean mo40311f() {
        int i;
        ArrayList<C1579g> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        C1640c cVar = this;
        C1575e eVar = cVar.f940m;
        View view = null;
        boolean z4 = false;
        if (eVar != null) {
            arrayList = eVar.m40670E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = cVar.f35262B;
        int i6 = cVar.f35261A;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f946s;
        boolean z5 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C1579g gVar = arrayList.get(i9);
            if (gVar.m40610o()) {
                i7++;
            } else if (gVar.m40611n()) {
                i8++;
            } else {
                z5 = true;
            }
            if (cVar.f35266F && gVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.f1284x && (z5 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.f35268H;
        sparseBooleanArray.clear();
        if (cVar.f35264D) {
            int i11 = cVar.f35267G;
            i2 = i6 / i11;
            i3 = i11 + ((i6 % i11) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C1579g gVar2 = arrayList.get(i12);
            if (gVar2.m40610o()) {
                View n = cVar.mo40307n(gVar2, view, viewGroup);
                if (cVar.f35264D) {
                    int i14 = z4 ? 1 : 0;
                    int i15 = z4 ? 1 : 0;
                    int i16 = z4 ? 1 : 0;
                    i2 -= ActionMenuView.m40523J(n, i3, i2, makeMeasureSpec, i14);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.m40604u(true);
                z = z4;
                i4 = i;
            } else if (gVar2.m40611n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                if ((i10 > 0 || z6) && i6 > 0 && (!cVar.f35264D || i2 > 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z7 = z2;
                i4 = i;
                if (z2) {
                    View n2 = cVar.mo40307n(gVar2, null, viewGroup);
                    if (cVar.f35264D) {
                        int J = ActionMenuView.m40523J(n2, i3, i2, makeMeasureSpec, 0);
                        i2 -= J;
                        if (J == 0) {
                            z7 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (!cVar.f35264D ? i6 + i13 <= 0 : i6 < 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    z2 = z7 & z3;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i17 = 0; i17 < i12; i17++) {
                        C1579g gVar3 = arrayList.get(i17);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.m40613l()) {
                                i10++;
                            }
                            gVar3.m40604u(false);
                        }
                    }
                }
                if (z2) {
                    i10--;
                }
                gVar2.m40604u(z2);
                z = false;
            } else {
                boolean z8 = z4 ? 1 : 0;
                Object[] objArr = z4 ? 1 : 0;
                Object[] objArr2 = z4 ? 1 : 0;
                z = z8;
                i4 = i;
                gVar2.m40604u(z);
            }
            i12++;
            z4 = z;
            i = i4;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a, androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: h */
    public void mo40310h(Context context, C1575e eVar) {
        super.mo40310h(context, eVar);
        Resources resources = context.getResources();
        C8094a b = C8094a.m20628b(context);
        if (!this.f1285y) {
            this.f1284x = b.m20622h();
        }
        if (!this.f35265E) {
            this.f1286z = b.m20627c();
        }
        if (!this.f35263C) {
            this.f35262B = b.m20626d();
        }
        int i = this.f1286z;
        if (this.f1284x) {
            if (this.f1281u == null) {
                C1643d dVar = new C1643d(this.f938k);
                this.f1281u = dVar;
                if (this.f1283w) {
                    dVar.setImageDrawable(this.f1282v);
                    this.f1282v = null;
                    this.f1283w = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1281u.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1281u.getMeasuredWidth();
        } else {
            this.f1281u = null;
        }
        this.f35261A = i;
        this.f35267G = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a
    /* renamed from: j */
    public void mo40309j(C1579g gVar, AbstractC1586k.AbstractC1587a aVar) {
        aVar.mo27966c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f946s);
        if (this.f35272L == null) {
            this.f35272L = new C1642b();
        }
        actionMenuItemView.setPopupCallback(this.f35272L);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a
    /* renamed from: l */
    public boolean mo40308l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1281u) {
            return false;
        }
        return super.mo40308l(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a
    /* renamed from: n */
    public View mo40307n(C1579g gVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.m40615j()) {
            actionView = super.mo40307n(gVar, view, viewGroup);
        }
        if (gVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo39995m(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a
    /* renamed from: o */
    public AbstractC1586k mo40306o(ViewGroup viewGroup) {
        AbstractC1586k kVar = this.f946s;
        AbstractC1586k o = super.mo40306o(viewGroup);
        if (kVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1566a
    /* renamed from: q */
    public boolean mo40305q(int i, C1579g gVar) {
        return gVar.m40613l();
    }

    /* renamed from: y */
    public boolean m40297y() {
        return m40324B() | m40323C();
    }
}
