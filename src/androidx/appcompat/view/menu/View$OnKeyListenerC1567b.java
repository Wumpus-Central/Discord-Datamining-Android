package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.widget.AbstractC1636a1;
import androidx.appcompat.widget.C1648c1;
import androidx.core.view.C2706t;
import androidx.core.view.C2733w0;
import java.util.ArrayList;
import java.util.List;
import p052d.C6382d;
import p052d.C6385g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC1567b extends AbstractC1581h implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: L */
    private static final int f35158L = C6385g.f13201e;

    /* renamed from: B */
    private boolean f35160B;

    /* renamed from: C */
    private boolean f35161C;

    /* renamed from: D */
    private int f35162D;

    /* renamed from: E */
    private int f35163E;

    /* renamed from: G */
    private boolean f35165G;

    /* renamed from: H */
    private AbstractC1584j.AbstractC1585a f35166H;

    /* renamed from: I */
    ViewTreeObserver f35167I;

    /* renamed from: J */
    private PopupWindow.OnDismissListener f35168J;

    /* renamed from: K */
    boolean f35169K;

    /* renamed from: l */
    private final Context f948l;

    /* renamed from: m */
    private final int f949m;

    /* renamed from: n */
    private final int f950n;

    /* renamed from: o */
    private final int f951o;

    /* renamed from: p */
    private final boolean f952p;

    /* renamed from: y */
    private View f961y;

    /* renamed from: z */
    View f962z;

    /* renamed from: r */
    private final List<C1575e> f954r = new ArrayList();

    /* renamed from: s */
    final List<C1571d> f955s = new ArrayList();

    /* renamed from: t */
    final ViewTreeObserver.OnGlobalLayoutListener f956t = new ViewTreeObserver$OnGlobalLayoutListenerC1568a();

    /* renamed from: u */
    private final View.OnAttachStateChangeListener f957u = new View$OnAttachStateChangeListenerC0017b();

    /* renamed from: v */
    private final AbstractC1636a1 f958v = new C1569c();

    /* renamed from: w */
    private int f959w = 0;

    /* renamed from: x */
    private int f960x = 0;

    /* renamed from: F */
    private boolean f35164F = false;

    /* renamed from: A */
    private int f35159A = m40688B();

    /* renamed from: q */
    final Handler f953q = new Handler();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC1568a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC1568a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC1567b.this.isShowing() && View$OnKeyListenerC1567b.this.f955s.size() > 0 && !View$OnKeyListenerC1567b.this.f955s.get(0).f970a.m39919z()) {
                View view = View$OnKeyListenerC1567b.this.f962z;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC1567b.this.dismiss();
                    return;
                }
                for (C1571d dVar : View$OnKeyListenerC1567b.this.f955s) {
                    dVar.f970a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0017b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0017b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC1567b.this.f35167I;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC1567b.this.f35167I = view.getViewTreeObserver();
                }
                View$OnKeyListenerC1567b bVar = View$OnKeyListenerC1567b.this;
                bVar.f35167I.removeGlobalOnLayoutListener(bVar.f956t);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes.dex */
    class C1569c implements AbstractC1636a1 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes.dex */
        class RunnableC1570a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ C1571d f966k;

            /* renamed from: l */
            final /* synthetic */ MenuItem f967l;

            /* renamed from: m */
            final /* synthetic */ C1575e f968m;

            RunnableC1570a(C1571d dVar, MenuItem menuItem, C1575e eVar) {
                this.f966k = dVar;
                this.f967l = menuItem;
                this.f968m = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1571d dVar = this.f966k;
                if (dVar != null) {
                    View$OnKeyListenerC1567b.this.f35169K = true;
                    dVar.f971b.m40644e(false);
                    View$OnKeyListenerC1567b.this.f35169K = false;
                }
                if (this.f967l.isEnabled() && this.f967l.hasSubMenu()) {
                    this.f968m.m40666L(this.f967l, 4);
                }
            }
        }

        C1569c() {
        }

        @Override // androidx.appcompat.widget.AbstractC1636a1
        /* renamed from: a */
        public void mo40284a(C1575e eVar, MenuItem menuItem) {
            C1571d dVar = null;
            View$OnKeyListenerC1567b.this.f953q.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC1567b.this.f955s.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == View$OnKeyListenerC1567b.this.f955s.get(i).f971b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < View$OnKeyListenerC1567b.this.f955s.size()) {
                    dVar = View$OnKeyListenerC1567b.this.f955s.get(i2);
                }
                View$OnKeyListenerC1567b.this.f953q.postAtTime(new RunnableC1570a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.AbstractC1636a1
        /* renamed from: m */
        public void mo40283m(C1575e eVar, MenuItem menuItem) {
            View$OnKeyListenerC1567b.this.f953q.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class C1571d {

        /* renamed from: a */
        public final C1648c1 f970a;

        /* renamed from: b */
        public final C1575e f971b;

        /* renamed from: c */
        public final int f972c;

        public C1571d(C1648c1 c1Var, C1575e eVar, int i) {
            this.f970a = c1Var;
            this.f971b = eVar;
            this.f972c = i;
        }

        /* renamed from: a */
        public ListView m40682a() {
            return this.f970a.mo16201n();
        }
    }

    public View$OnKeyListenerC1567b(Context context, View view, int i, int i2, boolean z) {
        this.f948l = context;
        this.f961y = view;
        this.f950n = i;
        this.f951o = i2;
        this.f952p = z;
        Resources resources = context.getResources();
        this.f949m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6382d.f13133d));
    }

    /* renamed from: A */
    private View m40689A(C1571d dVar, C1575e eVar) {
        int i;
        C1574d dVar2;
        int firstVisiblePosition;
        MenuItem z = m40683z(dVar.f971b, eVar);
        if (z == null) {
            return null;
        }
        ListView a = dVar.m40682a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (C1574d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (C1574d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (z == dVar2.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: B */
    private int m40688B() {
        return C2733w0.m37063B(this.f961y) == 1 ? 0 : 1;
    }

    /* renamed from: C */
    private int m40687C(int i) {
        List<C1571d> list = this.f955s;
        ListView a = list.get(list.size() - 1).m40682a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f962z.getWindowVisibleDisplayFrame(rect);
        if (this.f35159A == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: D */
    private void m40686D(C1575e eVar) {
        View view;
        C1571d dVar;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f948l);
        C1574d dVar2 = new C1574d(eVar, from, this.f952p, f35158L);
        if (!isShowing() && this.f35164F) {
            dVar2.m40674d(true);
        } else if (isShowing()) {
            dVar2.m40674d(AbstractC1581h.m40594v(eVar));
        }
        int l = AbstractC1581h.m40596l(dVar2, null, this.f948l, this.f949m);
        C1648c1 x = m40685x();
        x.mo39931l(dVar2);
        x.m39949D(l);
        x.m39948E(this.f960x);
        if (this.f955s.size() > 0) {
            List<C1571d> list = this.f955s;
            dVar = list.get(list.size() - 1);
            view = m40689A(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            x.m40285S(false);
            x.m40288P(null);
            int C = m40687C(l);
            if (C == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f35159A = C;
            if (Build.VERSION.SDK_INT >= 26) {
                x.m39951B(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f961y.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f960x & 7) == 5) {
                    iArr[0] = iArr[0] + this.f961y.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f960x & 5) == 5) {
                if (!z) {
                    l = view.getWidth();
                    i3 = i - l;
                }
                i3 = i + l;
            } else {
                if (z) {
                    l = view.getWidth();
                    i3 = i + l;
                }
                i3 = i - l;
            }
            x.m39935d(i3);
            x.m39942K(true);
            x.m39933h(i2);
        } else {
            if (this.f35160B) {
                x.m39935d(this.f35162D);
            }
            if (this.f35161C) {
                x.m39933h(this.f35163E);
            }
            x.m39947F(m40597k());
        }
        this.f955s.add(new C1571d(x, eVar, this.f35159A));
        x.show();
        ListView n = x.mo16201n();
        n.setOnKeyListener(this);
        if (dVar == null && this.f35165G && eVar.m40629x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C6385g.f13208l, (ViewGroup) n, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.m40629x());
            n.addHeaderView(frameLayout, null, false);
            x.show();
        }
    }

    /* renamed from: x */
    private C1648c1 m40685x() {
        C1648c1 c1Var = new C1648c1(this.f948l, null, this.f950n, this.f951o);
        c1Var.m40286R(this.f958v);
        c1Var.m39943J(this);
        c1Var.m39944I(this);
        c1Var.m39951B(this.f961y);
        c1Var.m39948E(this.f960x);
        c1Var.m39945H(true);
        c1Var.m39946G(2);
        return c1Var;
    }

    /* renamed from: y */
    private int m40684y(C1575e eVar) {
        int size = this.f955s.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.f955s.get(i).f971b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: z */
    private MenuItem m40683z(C1575e eVar, C1575e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: a */
    public void mo40314a(C1575e eVar, boolean z) {
        int y = m40684y(eVar);
        if (y >= 0) {
            int i = y + 1;
            if (i < this.f955s.size()) {
                this.f955s.get(i).f971b.m40644e(false);
            }
            C1571d remove = this.f955s.remove(y);
            remove.f971b.m40663O(this);
            if (this.f35169K) {
                remove.f970a.m40287Q(null);
                remove.f970a.m39950C(0);
            }
            remove.f970a.dismiss();
            int size = this.f955s.size();
            if (size > 0) {
                this.f35159A = this.f955s.get(size - 1).f972c;
            } else {
                this.f35159A = m40688B();
            }
            if (size == 0) {
                dismiss();
                AbstractC1584j.AbstractC1585a aVar = this.f35166H;
                if (aVar != null) {
                    aVar.mo40291a(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f35167I;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f35167I.removeGlobalOnLayoutListener(this.f956t);
                    }
                    this.f35167I = null;
                }
                this.f962z.removeOnAttachStateChangeListener(this.f957u);
                this.f35168J.onDismiss();
            } else if (z) {
                this.f955s.get(0).f971b.m40644e(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: c */
    public void mo40579c(AbstractC1584j.AbstractC1585a aVar) {
        this.f35166H = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: d */
    public boolean mo40313d(SubMenuC1591m mVar) {
        for (C1571d dVar : this.f955s) {
            if (mVar == dVar.f971b) {
                dVar.m40682a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        mo40578i(mVar);
        AbstractC1584j.AbstractC1585a aVar = this.f35166H;
        if (aVar != null) {
            aVar.mo40290b(mVar);
        }
        return true;
    }

    @Override // p164j.AbstractC9457e
    public void dismiss() {
        int size = this.f955s.size();
        if (size > 0) {
            C1571d[] dVarArr = (C1571d[]) this.f955s.toArray(new C1571d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1571d dVar = dVarArr[i];
                if (dVar.f970a.isShowing()) {
                    dVar.f970a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: e */
    public void mo40312e(boolean z) {
        for (C1571d dVar : this.f955s) {
            AbstractC1581h.m40593w(dVar.m40682a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: f */
    public boolean mo40311f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: i */
    public void mo40578i(C1575e eVar) {
        eVar.m40648c(this, this.f948l);
        if (isShowing()) {
            m40686D(eVar);
        } else {
            this.f954r.add(eVar);
        }
    }

    @Override // p164j.AbstractC9457e
    public boolean isShowing() {
        return this.f955s.size() > 0 && this.f955s.get(0).f970a.isShowing();
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: j */
    protected boolean mo40598j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: m */
    public void mo40577m(View view) {
        if (this.f961y != view) {
            this.f961y = view;
            this.f960x = C2706t.m37125b(this.f959w, C2733w0.m37063B(view));
        }
    }

    @Override // p164j.AbstractC9457e
    /* renamed from: n */
    public ListView mo16201n() {
        if (this.f955s.isEmpty()) {
            return null;
        }
        List<C1571d> list = this.f955s;
        return list.get(list.size() - 1).m40682a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C1571d dVar;
        int size = this.f955s.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f955s.get(i);
            if (!dVar.f970a.isShowing()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f971b.m40644e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: p */
    public void mo40576p(boolean z) {
        this.f35164F = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: q */
    public void mo40575q(int i) {
        if (this.f959w != i) {
            this.f959w = i;
            this.f960x = C2706t.m37125b(i, C2733w0.m37063B(this.f961y));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: r */
    public void mo40574r(int i) {
        this.f35160B = true;
        this.f35162D = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: s */
    public void mo40573s(PopupWindow.OnDismissListener onDismissListener) {
        this.f35168J = onDismissListener;
    }

    @Override // p164j.AbstractC9457e
    public void show() {
        boolean z;
        if (!isShowing()) {
            for (C1575e eVar : this.f954r) {
                m40686D(eVar);
            }
            this.f954r.clear();
            View view = this.f961y;
            this.f962z = view;
            if (view != null) {
                if (this.f35167I == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f35167I = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f956t);
                }
                this.f962z.addOnAttachStateChangeListener(this.f957u);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: t */
    public void mo40572t(boolean z) {
        this.f35165G = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: u */
    public void mo40571u(int i) {
        this.f35161C = true;
        this.f35163E = i;
    }
}
