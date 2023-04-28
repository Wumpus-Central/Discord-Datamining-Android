package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C2674n2;
import androidx.core.view.C2686p2;
import androidx.core.view.C2733w0;
import p052d.C6379a;
import p052d.C6383e;
import p052d.C6384f;
import p052d.C6386h;
import p052d.C6388j;
import p071e.C6525a;
import p164j.C9449a;

/* renamed from: androidx.appcompat.widget.p1 */
/* loaded from: classes.dex */
public class C1704p1 implements AbstractC1691l0 {

    /* renamed from: a */
    Toolbar f1432a;

    /* renamed from: b */
    private int f1433b;

    /* renamed from: c */
    private View f1434c;

    /* renamed from: d */
    private View f1435d;

    /* renamed from: e */
    private Drawable f1436e;

    /* renamed from: f */
    private Drawable f1437f;

    /* renamed from: g */
    private Drawable f1438g;

    /* renamed from: h */
    private boolean f1439h;

    /* renamed from: i */
    CharSequence f1440i;

    /* renamed from: j */
    private CharSequence f1441j;

    /* renamed from: k */
    private CharSequence f1442k;

    /* renamed from: l */
    Window.Callback f1443l;

    /* renamed from: m */
    boolean f1444m;

    /* renamed from: n */
    private C1640c f1445n;

    /* renamed from: o */
    private int f1446o;

    /* renamed from: p */
    private int f1447p;

    /* renamed from: q */
    private Drawable f1448q;

    /* renamed from: androidx.appcompat.widget.p1$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1705a implements View.OnClickListener {

        /* renamed from: k */
        final C9449a f1449k;

        View$OnClickListenerC1705a() {
            this.f1449k = new C9449a(C1704p1.this.f1432a.getContext(), 0, 16908332, 0, 0, C1704p1.this.f1440i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1704p1 p1Var = C1704p1.this;
            Window.Callback callback = p1Var.f1443l;
            if (callback != null && p1Var.f1444m) {
                callback.onMenuItemSelected(0, this.f1449k);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.p1$b */
    /* loaded from: classes.dex */
    class C1706b extends C2686p2 {

        /* renamed from: a */
        private boolean f1451a = false;

        /* renamed from: b */
        final /* synthetic */ int f1452b;

        C1706b(int i) {
            this.f1452b = i;
        }

        @Override // androidx.core.view.C2686p2, androidx.core.view.AbstractC2681o2
        /* renamed from: a */
        public void mo37153a(View view) {
            this.f1451a = true;
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: b */
        public void mo20596b(View view) {
            if (!this.f1451a) {
                C1704p1.this.f1432a.setVisibility(this.f1452b);
            }
        }

        @Override // androidx.core.view.C2686p2, androidx.core.view.AbstractC2681o2
        /* renamed from: c */
        public void mo20595c(View view) {
            C1704p1.this.f1432a.setVisibility(0);
        }
    }

    public C1704p1(Toolbar toolbar, boolean z) {
        this(toolbar, z, C6386h.f13217a, C6383e.f13158n);
    }

    /* renamed from: E */
    private void m40094E(CharSequence charSequence) {
        this.f1440i = charSequence;
        if ((this.f1433b & 8) != 0) {
            this.f1432a.setTitle(charSequence);
            if (this.f1439h) {
                C2733w0.m36984t0(this.f1432a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: F */
    private void m40093F() {
        if ((this.f1433b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1442k)) {
            this.f1432a.setNavigationContentDescription(this.f1447p);
        } else {
            this.f1432a.setNavigationContentDescription(this.f1442k);
        }
    }

    /* renamed from: G */
    private void m40092G() {
        if ((this.f1433b & 4) != 0) {
            Toolbar toolbar = this.f1432a;
            Drawable drawable = this.f1438g;
            if (drawable == null) {
                drawable = this.f1448q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1432a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: H */
    private void m40091H() {
        Drawable drawable;
        int i = this.f1433b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1437f;
            if (drawable == null) {
                drawable = this.f1436e;
            }
        } else {
            drawable = this.f1436e;
        }
        this.f1432a.setLogo(drawable);
    }

    /* renamed from: x */
    private int m40067x() {
        if (this.f1432a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1448q = this.f1432a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void m40098A(Drawable drawable) {
        this.f1437f = drawable;
        m40091H();
    }

    /* renamed from: B */
    public void m40097B(int i) {
        m40096C(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: C */
    public void m40096C(CharSequence charSequence) {
        this.f1442k = charSequence;
        m40093F();
    }

    /* renamed from: D */
    public void m40095D(CharSequence charSequence) {
        this.f1441j = charSequence;
        if ((this.f1433b & 8) != 0) {
            this.f1432a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: a */
    public boolean mo40090a() {
        return this.f1432a.m40365d();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: b */
    public boolean mo40089b() {
        return this.f1432a.m40346w();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: c */
    public boolean mo40088c() {
        return this.f1432a.m40369Q();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public void collapseActionView() {
        this.f1432a.m40364e();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: d */
    public void mo40087d(Menu menu, AbstractC1584j.AbstractC1585a aVar) {
        if (this.f1445n == null) {
            C1640c cVar = new C1640c(this.f1432a.getContext());
            this.f1445n = cVar;
            cVar.m40690p(C6384f.f13177g);
        }
        this.f1445n.mo40579c(aVar);
        this.f1432a.m40375K((C1575e) menu, this.f1445n);
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: e */
    public boolean mo40086e() {
        return this.f1432a.m40384B();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: f */
    public void mo40085f() {
        this.f1444m = true;
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: g */
    public boolean mo40084g() {
        return this.f1432a.m40385A();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public Context getContext() {
        return this.f1432a.getContext();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public CharSequence getTitle() {
        return this.f1432a.getTitle();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: h */
    public boolean mo40083h() {
        return this.f1432a.m40347v();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: i */
    public void mo40082i(int i) {
        View view;
        int i2 = this.f1433b ^ i;
        this.f1433b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m40093F();
                }
                m40092G();
            }
            if ((i2 & 3) != 0) {
                m40091H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1432a.setTitle(this.f1440i);
                    this.f1432a.setSubtitle(this.f1441j);
                } else {
                    this.f1432a.setTitle((CharSequence) null);
                    this.f1432a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1435d) != null) {
                if ((i & 16) != 0) {
                    this.f1432a.addView(view);
                } else {
                    this.f1432a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: j */
    public Menu mo40081j() {
        return this.f1432a.getMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: k */
    public int mo40080k() {
        return this.f1446o;
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: l */
    public C2674n2 mo40079l(int i, long j) {
        float f;
        C2674n2 e = C2733w0.m37015e(this.f1432a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return e.m37172b(f).m37168f(j).m37166h(new C1706b(i));
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: m */
    public ViewGroup mo40078m() {
        return this.f1432a;
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: n */
    public void mo40077n(boolean z) {
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: o */
    public void mo40076o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: p */
    public void mo40075p(boolean z) {
        this.f1432a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: q */
    public void mo40074q() {
        this.f1432a.m40363f();
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: r */
    public void mo40073r(C1671g1 g1Var) {
        View view = this.f1434c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1432a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1434c);
            }
        }
        this.f1434c = g1Var;
        if (g1Var != null && this.f1446o == 2) {
            this.f1432a.addView(g1Var, 0);
            Toolbar.C1629e eVar = (Toolbar.C1629e) this.f1434c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.f658a = 8388691;
            g1Var.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: s */
    public void mo40072s(int i) {
        m40098A(i != 0 ? C6525a.m25364b(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public void setIcon(int i) {
        setIcon(i != 0 ? C6525a.m25364b(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public void setTitle(CharSequence charSequence) {
        this.f1439h = true;
        m40094E(charSequence);
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public void setVisibility(int i) {
        this.f1432a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public void setWindowCallback(Window.Callback callback) {
        this.f1443l = callback;
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1439h) {
            m40094E(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: t */
    public void mo40071t(AbstractC1584j.AbstractC1585a aVar, C1575e.AbstractC1576a aVar2) {
        this.f1432a.m40374L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: u */
    public int mo40070u() {
        return this.f1433b;
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: v */
    public void mo40069v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    /* renamed from: w */
    public void mo40068w(Drawable drawable) {
        this.f1438g = drawable;
        m40092G();
    }

    /* renamed from: y */
    public void m40066y(View view) {
        View view2 = this.f1435d;
        if (!(view2 == null || (this.f1433b & 16) == 0)) {
            this.f1432a.removeView(view2);
        }
        this.f1435d = view;
        if (view != null && (this.f1433b & 16) != 0) {
            this.f1432a.addView(view);
        }
    }

    /* renamed from: z */
    public void m40065z(int i) {
        if (i != this.f1447p) {
            this.f1447p = i;
            if (TextUtils.isEmpty(this.f1432a.getNavigationContentDescription())) {
                m40097B(this.f1447p);
            }
        }
    }

    public C1704p1(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1446o = 0;
        this.f1447p = 0;
        this.f1432a = toolbar;
        this.f1440i = toolbar.getTitle();
        this.f1441j = toolbar.getSubtitle();
        this.f1439h = this.f1440i != null;
        this.f1438g = toolbar.getNavigationIcon();
        C1698n1 v = C1698n1.m40105v(toolbar.getContext(), null, C6388j.f13235a, C6379a.f13097c, 0);
        this.f1448q = v.m40120g(C6388j.f13290l);
        if (z) {
            CharSequence p = v.m40111p(C6388j.f13320r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.m40111p(C6388j.f13310p);
            if (!TextUtils.isEmpty(p2)) {
                m40095D(p2);
            }
            Drawable g = v.m40120g(C6388j.f13300n);
            if (g != null) {
                m40098A(g);
            }
            Drawable g2 = v.m40120g(C6388j.f13295m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1438g == null && (drawable = this.f1448q) != null) {
                mo40068w(drawable);
            }
            mo40082i(v.m40116k(C6388j.f13270h, 0));
            int n = v.m40113n(C6388j.f13265g, 0);
            if (n != 0) {
                m40066y(LayoutInflater.from(this.f1432a.getContext()).inflate(n, (ViewGroup) this.f1432a, false));
                mo40082i(this.f1433b | 16);
            }
            int m = v.m40114m(C6388j.f13280j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1432a.getLayoutParams();
                layoutParams.height = m;
                this.f1432a.setLayoutParams(layoutParams);
            }
            int e = v.m40122e(C6388j.f13260f, -1);
            int e2 = v.m40122e(C6388j.f13255e, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1432a.m40376J(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.m40113n(C6388j.f13325s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1432a;
                toolbar2.m40372N(toolbar2.getContext(), n2);
            }
            int n3 = v.m40113n(C6388j.f13315q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1432a;
                toolbar3.m40373M(toolbar3.getContext(), n3);
            }
            int n4 = v.m40113n(C6388j.f13305o, 0);
            if (n4 != 0) {
                this.f1432a.setPopupTheme(n4);
            }
        } else {
            this.f1433b = m40067x();
        }
        v.m40104w();
        m40065z(i);
        this.f1442k = this.f1432a.getNavigationContentDescription();
        this.f1432a.setNavigationOnClickListener(new View$OnClickListenerC1705a());
    }

    @Override // androidx.appcompat.widget.AbstractC1691l0
    public void setIcon(Drawable drawable) {
        this.f1436e = drawable;
        m40091H();
    }
}
