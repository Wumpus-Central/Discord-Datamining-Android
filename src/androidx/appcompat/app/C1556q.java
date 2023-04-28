package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.widget.AbstractC1691l0;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C1671g1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC2681o2;
import androidx.core.view.AbstractC2691q2;
import androidx.core.view.C2674n2;
import androidx.core.view.C2686p2;
import androidx.core.view.C2733w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p052d.C6379a;
import p052d.C6384f;
import p052d.C6388j;
import p144i.C8094a;
import p144i.C8097d;
import p144i.C8100e;

/* renamed from: androidx.appcompat.app.q */
/* loaded from: classes.dex */
public class C1556q extends ActionBar implements ActionBarOverlayLayout.AbstractC1596d {

    /* renamed from: E */
    private static final Interpolator f35151E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f35152F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f35153A;

    /* renamed from: a */
    Context f858a;

    /* renamed from: b */
    private Context f859b;

    /* renamed from: c */
    private Activity f860c;

    /* renamed from: d */
    ActionBarOverlayLayout f861d;

    /* renamed from: e */
    ActionBarContainer f862e;

    /* renamed from: f */
    AbstractC1691l0 f863f;

    /* renamed from: g */
    ActionBarContextView f864g;

    /* renamed from: h */
    View f865h;

    /* renamed from: i */
    C1671g1 f866i;

    /* renamed from: l */
    private boolean f869l;

    /* renamed from: m */
    C1560d f870m;

    /* renamed from: n */
    ActionMode f871n;

    /* renamed from: o */
    ActionMode.Callback f872o;

    /* renamed from: p */
    private boolean f873p;

    /* renamed from: r */
    private boolean f875r;

    /* renamed from: u */
    boolean f878u;

    /* renamed from: v */
    boolean f879v;

    /* renamed from: w */
    private boolean f880w;

    /* renamed from: y */
    C8100e f882y;

    /* renamed from: z */
    private boolean f883z;

    /* renamed from: j */
    private ArrayList<Object> f867j = new ArrayList<>();

    /* renamed from: k */
    private int f868k = -1;

    /* renamed from: q */
    private ArrayList<ActionBar.AbstractC1500b> f874q = new ArrayList<>();

    /* renamed from: s */
    private int f876s = 0;

    /* renamed from: t */
    boolean f877t = true;

    /* renamed from: x */
    private boolean f881x = true;

    /* renamed from: B */
    final AbstractC2681o2 f35154B = new C1557a();

    /* renamed from: C */
    final AbstractC2681o2 f35155C = new C1558b();

    /* renamed from: D */
    final AbstractC2691q2 f35156D = new C1559c();

    /* renamed from: androidx.appcompat.app.q$a */
    /* loaded from: classes.dex */
    class C1557a extends C2686p2 {
        C1557a() {
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: b */
        public void mo20596b(View view) {
            View view2;
            C1556q qVar = C1556q.this;
            if (qVar.f877t && (view2 = qVar.f865h) != null) {
                view2.setTranslationY(0.0f);
                C1556q.this.f862e.setTranslationY(0.0f);
            }
            C1556q.this.f862e.setVisibility(8);
            C1556q.this.f862e.setTransitioning(false);
            C1556q qVar2 = C1556q.this;
            qVar2.f882y = null;
            qVar2.m40756B();
            ActionBarOverlayLayout actionBarOverlayLayout = C1556q.this.f861d;
            if (actionBarOverlayLayout != null) {
                C2733w0.m36996n0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.q$b */
    /* loaded from: classes.dex */
    class C1558b extends C2686p2 {
        C1558b() {
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: b */
        public void mo20596b(View view) {
            C1556q qVar = C1556q.this;
            qVar.f882y = null;
            qVar.f862e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.q$c */
    /* loaded from: classes.dex */
    class C1559c implements AbstractC2691q2 {
        C1559c() {
        }

        @Override // androidx.core.view.AbstractC2691q2
        /* renamed from: a */
        public void mo37149a(View view) {
            ((View) C1556q.this.f862e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.q$d */
    /* loaded from: classes.dex */
    public class C1560d extends ActionMode implements C1575e.AbstractC1576a {

        /* renamed from: m */
        private final Context f887m;

        /* renamed from: n */
        private final C1575e f888n;

        /* renamed from: o */
        private ActionMode.Callback f889o;

        /* renamed from: p */
        private WeakReference<View> f890p;

        public C1560d(Context context, ActionMode.Callback callback) {
            this.f887m = context;
            this.f889o = callback;
            C1575e S = new C1575e(context).m40660S(1);
            this.f888n = S;
            S.mo40565R(this);
        }

        @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
        /* renamed from: a */
        public boolean mo40516a(C1575e eVar, MenuItem menuItem) {
            ActionMode.Callback callback = this.f889o;
            if (callback != null) {
                return callback.mo40706c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
        /* renamed from: b */
        public void mo40515b(C1575e eVar) {
            if (this.f889o != null) {
                mo40716k();
                C1556q.this.f864g.m40552l();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: c */
        public void mo40722c() {
            C1556q qVar = C1556q.this;
            if (qVar.f870m == this) {
                if (!C1556q.m40757A(qVar.f878u, qVar.f879v, false)) {
                    C1556q qVar2 = C1556q.this;
                    qVar2.f871n = this;
                    qVar2.f872o = this.f889o;
                } else {
                    this.f889o.mo40708a(this);
                }
                this.f889o = null;
                C1556q.this.m40727z(false);
                C1556q.this.f864g.m40557g();
                C1556q qVar3 = C1556q.this;
                qVar3.f861d.setHideOnContentScrollEnabled(qVar3.f35153A);
                C1556q.this.f870m = null;
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: d */
        public View mo40721d() {
            WeakReference<View> weakReference = this.f890p;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: e */
        public Menu mo40720e() {
            return this.f888n;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: f */
        public MenuInflater mo40719f() {
            return new C8097d(this.f887m);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: g */
        public CharSequence mo40718g() {
            return C1556q.this.f864g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: i */
        public CharSequence mo40717i() {
            return C1556q.this.f864g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: k */
        public void mo40716k() {
            if (C1556q.this.f870m == this) {
                this.f888n.m40645d0();
                try {
                    this.f889o.mo40705d(this, this.f888n);
                } finally {
                    this.f888n.m40647c0();
                }
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: l */
        public boolean mo40715l() {
            return C1556q.this.f864g.m40554j();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: m */
        public void mo40714m(View view) {
            C1556q.this.f864g.setCustomView(view);
            this.f890p = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: n */
        public void mo40713n(int i) {
            mo40712o(C1556q.this.f858a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: o */
        public void mo40712o(CharSequence charSequence) {
            C1556q.this.f864g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: q */
        public void mo40711q(int i) {
            mo40710r(C1556q.this.f858a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: r */
        public void mo40710r(CharSequence charSequence) {
            C1556q.this.f864g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: s */
        public void mo40709s(boolean z) {
            super.mo40709s(z);
            C1556q.this.f864g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m40726t() {
            this.f888n.m40645d0();
            try {
                return this.f889o.mo40707b(this, this.f888n);
            } finally {
                this.f888n.m40647c0();
            }
        }
    }

    public C1556q(Activity activity, boolean z) {
        this.f860c = activity;
        View decorView = activity.getWindow().getDecorView();
        m40750H(decorView);
        if (!z) {
            this.f865h = decorView.findViewById(16908290);
        }
    }

    /* renamed from: A */
    static boolean m40757A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: E */
    private AbstractC1691l0 m40753E(View view) {
        String str;
        if (view instanceof AbstractC1691l0) {
            return (AbstractC1691l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: G */
    private void m40751G() {
        if (this.f880w) {
            this.f880w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f861d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m40742P(false);
        }
    }

    /* renamed from: H */
    private void m40750H(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C6384f.f13186p);
        this.f861d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f863f = m40753E(view.findViewById(C6384f.f13171a));
        this.f864g = (ActionBarContextView) view.findViewById(C6384f.f13176f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C6384f.f13173c);
        this.f862e = actionBarContainer;
        AbstractC1691l0 l0Var = this.f863f;
        if (l0Var == null || this.f864g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f858a = l0Var.getContext();
        if ((this.f863f.mo40070u() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f869l = true;
        }
        C8094a b = C8094a.m20628b(this.f858a);
        if (b.m20629a() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        m40745M(z2);
        m40747K(b.m20623g());
        TypedArray obtainStyledAttributes = this.f858a.obtainStyledAttributes(null, C6388j.f13235a, C6379a.f13097c, 0);
        if (obtainStyledAttributes.getBoolean(C6388j.f13285k, false)) {
            m40746L(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C6388j.f13275i, 0);
        if (dimensionPixelSize != 0) {
            m40748J(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: K */
    private void m40747K(boolean z) {
        boolean z2;
        boolean z3;
        this.f875r = z;
        if (!z) {
            this.f863f.mo40073r(null);
            this.f862e.setTabContainer(this.f866i);
        } else {
            this.f862e.setTabContainer(null);
            this.f863f.mo40073r(this.f866i);
        }
        boolean z4 = true;
        if (m40752F() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1671g1 g1Var = this.f866i;
        if (g1Var != null) {
            if (z2) {
                g1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f861d;
                if (actionBarOverlayLayout != null) {
                    C2733w0.m36996n0(actionBarOverlayLayout);
                }
            } else {
                g1Var.setVisibility(8);
            }
        }
        AbstractC1691l0 l0Var = this.f863f;
        if (this.f875r || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        l0Var.mo40075p(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f861d;
        if (this.f875r || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: N */
    private boolean m40744N() {
        return C2733w0.m37029U(this.f862e);
    }

    /* renamed from: O */
    private void m40743O() {
        if (!this.f880w) {
            this.f880w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f861d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m40742P(false);
        }
    }

    /* renamed from: P */
    private void m40742P(boolean z) {
        if (m40757A(this.f878u, this.f879v, this.f880w)) {
            if (!this.f881x) {
                this.f881x = true;
                m40754D(z);
            }
        } else if (this.f881x) {
            this.f881x = false;
            m40755C(z);
        }
    }

    /* renamed from: B */
    void m40756B() {
        ActionMode.Callback callback = this.f872o;
        if (callback != null) {
            callback.mo40708a(this.f871n);
            this.f871n = null;
            this.f872o = null;
        }
    }

    /* renamed from: C */
    public void m40755C(boolean z) {
        View view;
        int[] iArr;
        C8100e eVar = this.f882y;
        if (eVar != null) {
            eVar.m20604a();
        }
        if (this.f876s != 0 || (!this.f883z && !z)) {
            this.f35154B.mo20596b(null);
            return;
        }
        this.f862e.setAlpha(1.0f);
        this.f862e.setTransitioning(true);
        C8100e eVar2 = new C8100e();
        float f = -this.f862e.getHeight();
        if (z) {
            this.f862e.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        C2674n2 m = C2733w0.m37015e(this.f862e).m37161m(f);
        m.m37163k(this.f35156D);
        eVar2.m20602c(m);
        if (this.f877t && (view = this.f865h) != null) {
            eVar2.m20602c(C2733w0.m37015e(view).m37161m(f));
        }
        eVar2.m20599f(f35151E);
        eVar2.m20600e(250L);
        eVar2.m20598g(this.f35154B);
        this.f882y = eVar2;
        eVar2.m20597h();
    }

    /* renamed from: D */
    public void m40754D(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C8100e eVar = this.f882y;
        if (eVar != null) {
            eVar.m20604a();
        }
        this.f862e.setVisibility(0);
        if (this.f876s != 0 || (!this.f883z && !z)) {
            this.f862e.setAlpha(1.0f);
            this.f862e.setTranslationY(0.0f);
            if (this.f877t && (view = this.f865h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f35155C.mo20596b(null);
        } else {
            this.f862e.setTranslationY(0.0f);
            float f = -this.f862e.getHeight();
            if (z) {
                this.f862e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f862e.setTranslationY(f);
            C8100e eVar2 = new C8100e();
            C2674n2 m = C2733w0.m37015e(this.f862e).m37161m(0.0f);
            m.m37163k(this.f35156D);
            eVar2.m20602c(m);
            if (this.f877t && (view2 = this.f865h) != null) {
                view2.setTranslationY(f);
                eVar2.m20602c(C2733w0.m37015e(this.f865h).m37161m(0.0f));
            }
            eVar2.m20599f(f35152F);
            eVar2.m20600e(250L);
            eVar2.m20598g(this.f35155C);
            this.f882y = eVar2;
            eVar2.m20597h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f861d;
        if (actionBarOverlayLayout != null) {
            C2733w0.m36996n0(actionBarOverlayLayout);
        }
    }

    /* renamed from: F */
    public int m40752F() {
        return this.f863f.mo40080k();
    }

    /* renamed from: I */
    public void m40749I(int i, int i2) {
        int u = this.f863f.mo40070u();
        if ((i2 & 4) != 0) {
            this.f869l = true;
        }
        this.f863f.mo40082i((i & i2) | ((~i2) & u));
    }

    /* renamed from: J */
    public void m40748J(float f) {
        C2733w0.m36974y0(this.f862e, f);
    }

    /* renamed from: L */
    public void m40746L(boolean z) {
        if (!z || this.f861d.m40544q()) {
            this.f35153A = z;
            this.f861d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: M */
    public void m40745M(boolean z) {
        this.f863f.mo40077n(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC1596d
    /* renamed from: a */
    public void mo40538a() {
        if (this.f879v) {
            this.f879v = false;
            m40742P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC1596d
    /* renamed from: b */
    public void mo40537b(int i) {
        this.f876s = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC1596d
    /* renamed from: c */
    public void mo40536c() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC1596d
    /* renamed from: d */
    public void mo40535d(boolean z) {
        this.f877t = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC1596d
    /* renamed from: e */
    public void mo40534e() {
        if (!this.f879v) {
            this.f879v = true;
            m40742P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC1596d
    /* renamed from: f */
    public void mo40533f() {
        C8100e eVar = this.f882y;
        if (eVar != null) {
            eVar.m20604a();
            this.f882y = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo40741h() {
        AbstractC1691l0 l0Var = this.f863f;
        if (l0Var == null || !l0Var.mo40083h()) {
            return false;
        }
        this.f863f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo40740i(boolean z) {
        if (z != this.f873p) {
            this.f873p = z;
            int size = this.f874q.size();
            for (int i = 0; i < size; i++) {
                this.f874q.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo40739j() {
        return this.f863f.mo40070u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo40738k() {
        if (this.f859b == null) {
            TypedValue typedValue = new TypedValue();
            this.f858a.getTheme().resolveAttribute(C6379a.f13101g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f859b = new ContextThemeWrapper(this.f858a, i);
            } else {
                this.f859b = this.f858a;
            }
        }
        return this.f859b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo40737m(Configuration configuration) {
        m40747K(C8094a.m20628b(this.f858a).m20623g());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo40736o(int i, KeyEvent keyEvent) {
        Menu e;
        int i2;
        C1560d dVar = this.f870m;
        if (dVar == null || (e = dVar.mo40720e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo40735r(boolean z) {
        if (!this.f869l) {
            mo40734s(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo40734s(boolean z) {
        m40749I(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo40733t(boolean z) {
        m40749I(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo40732u(Drawable drawable) {
        this.f863f.mo40068w(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo40731v(boolean z) {
        C8100e eVar;
        this.f883z = z;
        if (!z && (eVar = this.f882y) != null) {
            eVar.m20604a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo40730w(CharSequence charSequence) {
        this.f863f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo40729x(CharSequence charSequence) {
        this.f863f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: y */
    public ActionMode mo40728y(ActionMode.Callback callback) {
        C1560d dVar = this.f870m;
        if (dVar != null) {
            dVar.mo40722c();
        }
        this.f861d.setHideOnContentScrollEnabled(false);
        this.f864g.m40553k();
        C1560d dVar2 = new C1560d(this.f864g.getContext(), callback);
        if (!dVar2.m40726t()) {
            return null;
        }
        this.f870m = dVar2;
        dVar2.mo40716k();
        this.f864g.m40556h(dVar2);
        m40727z(true);
        return dVar2;
    }

    /* renamed from: z */
    public void m40727z(boolean z) {
        C2674n2 n2Var;
        C2674n2 n2Var2;
        if (z) {
            m40743O();
        } else {
            m40751G();
        }
        if (m40744N()) {
            if (z) {
                n2Var = this.f863f.mo40079l(4, 100L);
                n2Var2 = this.f864g.mo40330f(0, 200L);
            } else {
                n2Var2 = this.f863f.mo40079l(0, 200L);
                n2Var = this.f864g.mo40330f(8, 100L);
            }
            C8100e eVar = new C8100e();
            eVar.m20601d(n2Var, n2Var2);
            eVar.m20597h();
        } else if (z) {
            this.f863f.setVisibility(4);
            this.f864g.setVisibility(0);
        } else {
            this.f863f.setVisibility(0);
            this.f864g.setVisibility(8);
        }
    }

    public C1556q(Dialog dialog) {
        m40750H(dialog.getWindow().getDecorView());
    }
}
