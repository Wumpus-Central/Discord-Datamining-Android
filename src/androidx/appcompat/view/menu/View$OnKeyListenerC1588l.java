package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.widget.C1648c1;
import androidx.core.view.C2733w0;
import p052d.C6382d;
import p052d.C6385g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC1588l extends AbstractC1581h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: F */
    private static final int f35176F = C6385g.f13209m;

    /* renamed from: A */
    private boolean f35177A;

    /* renamed from: B */
    private boolean f35178B;

    /* renamed from: C */
    private int f35179C;

    /* renamed from: E */
    private boolean f35181E;

    /* renamed from: l */
    private final Context f1061l;

    /* renamed from: m */
    private final C1575e f1062m;

    /* renamed from: n */
    private final C1574d f1063n;

    /* renamed from: o */
    private final boolean f1064o;

    /* renamed from: p */
    private final int f1065p;

    /* renamed from: q */
    private final int f1066q;

    /* renamed from: r */
    private final int f1067r;

    /* renamed from: s */
    final C1648c1 f1068s;

    /* renamed from: v */
    private PopupWindow.OnDismissListener f1071v;

    /* renamed from: w */
    private View f1072w;

    /* renamed from: x */
    View f1073x;

    /* renamed from: y */
    private AbstractC1584j.AbstractC1585a f1074y;

    /* renamed from: z */
    ViewTreeObserver f1075z;

    /* renamed from: t */
    final ViewTreeObserver.OnGlobalLayoutListener f1069t = new ViewTreeObserver$OnGlobalLayoutListenerC1589a();

    /* renamed from: u */
    private final View.OnAttachStateChangeListener f1070u = new View$OnAttachStateChangeListenerC1590b();

    /* renamed from: D */
    private int f35180D = 0;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC1589a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC1589a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC1588l.this.isShowing() && !View$OnKeyListenerC1588l.this.f1068s.m39919z()) {
                View view = View$OnKeyListenerC1588l.this.f1073x;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC1588l.this.dismiss();
                } else {
                    View$OnKeyListenerC1588l.this.f1068s.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC1590b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC1590b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC1588l.this.f1075z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC1588l.this.f1075z = view.getViewTreeObserver();
                }
                View$OnKeyListenerC1588l lVar = View$OnKeyListenerC1588l.this;
                lVar.f1075z.removeGlobalOnLayoutListener(lVar.f1069t);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC1588l(Context context, C1575e eVar, View view, int i, int i2, boolean z) {
        this.f1061l = context;
        this.f1062m = eVar;
        this.f1064o = z;
        this.f1063n = new C1574d(eVar, LayoutInflater.from(context), z, f35176F);
        this.f1066q = i;
        this.f1067r = i2;
        Resources resources = context.getResources();
        this.f1065p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6382d.f13133d));
        this.f1072w = view;
        this.f1068s = new C1648c1(context, null, i, i2);
        eVar.m40648c(this, context);
    }

    /* renamed from: x */
    private boolean m40570x() {
        View view;
        boolean z;
        if (isShowing()) {
            return true;
        }
        if (this.f35177A || (view = this.f1072w) == null) {
            return false;
        }
        this.f1073x = view;
        this.f1068s.m39944I(this);
        this.f1068s.m39943J(this);
        this.f1068s.m39945H(true);
        View view2 = this.f1073x;
        if (this.f1075z == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1075z = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1069t);
        }
        view2.addOnAttachStateChangeListener(this.f1070u);
        this.f1068s.m39951B(view2);
        this.f1068s.m39948E(this.f35180D);
        if (!this.f35178B) {
            this.f35179C = AbstractC1581h.m40596l(this.f1063n, null, this.f1061l, this.f1065p);
            this.f35178B = true;
        }
        this.f1068s.m39949D(this.f35179C);
        this.f1068s.m39946G(2);
        this.f1068s.m39947F(m40597k());
        this.f1068s.show();
        ListView n = this.f1068s.mo16201n();
        n.setOnKeyListener(this);
        if (this.f35181E && this.f1062m.m40629x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1061l).inflate(C6385g.f13208l, (ViewGroup) n, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1062m.m40629x());
            }
            frameLayout.setEnabled(false);
            n.addHeaderView(frameLayout, null, false);
        }
        this.f1068s.mo39931l(this.f1063n);
        this.f1068s.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: a */
    public void mo40314a(C1575e eVar, boolean z) {
        if (eVar == this.f1062m) {
            dismiss();
            AbstractC1584j.AbstractC1585a aVar = this.f1074y;
            if (aVar != null) {
                aVar.mo40291a(eVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: c */
    public void mo40579c(AbstractC1584j.AbstractC1585a aVar) {
        this.f1074y = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: d */
    public boolean mo40313d(SubMenuC1591m mVar) {
        if (mVar.hasVisibleItems()) {
            C1582i iVar = new C1582i(this.f1061l, mVar, this.f1073x, this.f1064o, this.f1066q, this.f1067r);
            iVar.m40584j(this.f1074y);
            iVar.m40587g(AbstractC1581h.m40594v(mVar));
            iVar.m40585i(this.f1071v);
            this.f1071v = null;
            this.f1062m.m40644e(false);
            int c = this.f1068s.m39936c();
            int k = this.f1068s.m39932k();
            if ((Gravity.getAbsoluteGravity(this.f35180D, C2733w0.m37063B(this.f1072w)) & 7) == 5) {
                c += this.f1072w.getWidth();
            }
            if (iVar.m40580n(c, k)) {
                AbstractC1584j.AbstractC1585a aVar = this.f1074y;
                if (aVar == null) {
                    return true;
                }
                aVar.mo40290b(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // p164j.AbstractC9457e
    public void dismiss() {
        if (isShowing()) {
            this.f1068s.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: e */
    public void mo40312e(boolean z) {
        this.f35178B = false;
        C1574d dVar = this.f1063n;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
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
    }

    @Override // p164j.AbstractC9457e
    public boolean isShowing() {
        return !this.f35177A && this.f1068s.isShowing();
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: m */
    public void mo40577m(View view) {
        this.f1072w = view;
    }

    @Override // p164j.AbstractC9457e
    /* renamed from: n */
    public ListView mo16201n() {
        return this.f1068s.mo16201n();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f35177A = true;
        this.f1062m.close();
        ViewTreeObserver viewTreeObserver = this.f1075z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1075z = this.f1073x.getViewTreeObserver();
            }
            this.f1075z.removeGlobalOnLayoutListener(this.f1069t);
            this.f1075z = null;
        }
        this.f1073x.removeOnAttachStateChangeListener(this.f1070u);
        PopupWindow.OnDismissListener onDismissListener = this.f1071v;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f1063n.m40674d(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: q */
    public void mo40575q(int i) {
        this.f35180D = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: r */
    public void mo40574r(int i) {
        this.f1068s.m39935d(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: s */
    public void mo40573s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1071v = onDismissListener;
    }

    @Override // p164j.AbstractC9457e
    public void show() {
        if (!m40570x()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: t */
    public void mo40572t(boolean z) {
        this.f35181E = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1581h
    /* renamed from: u */
    public void mo40571u(int i) {
        this.f1068s.m39933h(i);
    }
}
