package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.LayoutInflater$Factory2C1513d;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.widget.AbstractC1691l0;
import androidx.appcompat.widget.C1704p1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.C2517g;
import androidx.core.view.C2733w0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes.dex */
public class C1547n extends ActionBar {

    /* renamed from: a */
    final AbstractC1691l0 f829a;

    /* renamed from: b */
    final Window.Callback f830b;

    /* renamed from: d */
    boolean f832d;

    /* renamed from: e */
    private boolean f833e;

    /* renamed from: f */
    private boolean f834f;

    /* renamed from: i */
    private final Toolbar.AbstractC1630f f837i;

    /* renamed from: g */
    private ArrayList<ActionBar.AbstractC1500b> f835g = new ArrayList<>();

    /* renamed from: h */
    private final Runnable f836h = new RunnableC1548a();

    /* renamed from: c */
    final LayoutInflater$Factory2C1513d.AbstractC1519g f831c = new C1552e();

    /* renamed from: androidx.appcompat.app.n$a */
    /* loaded from: classes.dex */
    class RunnableC1548a implements Runnable {
        RunnableC1548a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1547n.this.m40774A();
        }
    }

    /* renamed from: androidx.appcompat.app.n$b */
    /* loaded from: classes.dex */
    class C1549b implements Toolbar.AbstractC1630f {
        C1549b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.AbstractC1630f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C1547n.this.f830b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.n$c */
    /* loaded from: classes.dex */
    public final class C1550c implements AbstractC1584j.AbstractC1585a {

        /* renamed from: k */
        private boolean f840k;

        C1550c() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: a */
        public void mo40291a(C1575e eVar, boolean z) {
            if (!this.f840k) {
                this.f840k = true;
                C1547n.this.f829a.mo40074q();
                C1547n.this.f830b.onPanelClosed(108, eVar);
                this.f840k = false;
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
        /* renamed from: b */
        public boolean mo40290b(C1575e eVar) {
            C1547n.this.f830b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.n$d */
    /* loaded from: classes.dex */
    public final class C1551d implements C1575e.AbstractC1576a {
        C1551d() {
        }

        @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
        /* renamed from: a */
        public boolean mo40516a(C1575e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
        /* renamed from: b */
        public void mo40515b(C1575e eVar) {
            if (C1547n.this.f829a.mo40086e()) {
                C1547n.this.f830b.onPanelClosed(108, eVar);
            } else if (C1547n.this.f830b.onPreparePanel(0, null, eVar)) {
                C1547n.this.f830b.onMenuOpened(108, eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.n$e */
    /* loaded from: classes.dex */
    private class C1552e implements LayoutInflater$Factory2C1513d.AbstractC1519g {
        C1552e() {
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1519g
        /* renamed from: a */
        public boolean mo40766a(int i) {
            if (i != 0) {
                return false;
            }
            C1547n nVar = C1547n.this;
            if (nVar.f832d) {
                return false;
            }
            nVar.f829a.mo40085f();
            C1547n.this.f832d = true;
            return false;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C1513d.AbstractC1519g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C1547n.this.f829a.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1547n(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C1549b bVar = new C1549b();
        this.f837i = bVar;
        C2517g.m37588g(toolbar);
        C1704p1 p1Var = new C1704p1(toolbar, false);
        this.f829a = p1Var;
        this.f830b = (Window.Callback) C2517g.m37588g(callback);
        p1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        p1Var.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    private Menu m40767z() {
        if (!this.f833e) {
            this.f829a.mo40071t(new C1550c(), new C1551d());
            this.f833e = true;
        }
        return this.f829a.mo40081j();
    }

    /* renamed from: A */
    void m40774A() {
        C1575e eVar;
        Menu z = m40767z();
        if (z instanceof C1575e) {
            eVar = (C1575e) z;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.m40645d0();
        }
        try {
            z.clear();
            if (!this.f830b.onCreatePanelMenu(0, z) || !this.f830b.onPreparePanel(0, null, z)) {
                z.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.m40647c0();
            }
        }
    }

    /* renamed from: B */
    public void m40773B(int i, int i2) {
        this.f829a.mo40082i((i & i2) | ((~i2) & this.f829a.mo40070u()));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public boolean mo40772g() {
        return this.f829a.mo40089b();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo40741h() {
        if (!this.f829a.mo40083h()) {
            return false;
        }
        this.f829a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo40740i(boolean z) {
        if (z != this.f834f) {
            this.f834f = z;
            int size = this.f835g.size();
            for (int i = 0; i < size; i++) {
                this.f835g.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo40739j() {
        return this.f829a.mo40070u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo40738k() {
        return this.f829a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public boolean mo40771l() {
        this.f829a.mo40078m().removeCallbacks(this.f836h);
        C2733w0.m37006i0(this.f829a.mo40078m(), this.f836h);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo40737m(Configuration configuration) {
        super.mo40737m(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public void mo40770n() {
        this.f829a.mo40078m().removeCallbacks(this.f836h);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo40736o(int i, KeyEvent keyEvent) {
        int i2;
        Menu z = m40767z();
        if (z == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z2 = false;
        }
        z.setQwertyMode(z2);
        return z.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: p */
    public boolean mo40769p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo40768q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: q */
    public boolean mo40768q() {
        return this.f829a.mo40088c();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo40735r(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo40734s(boolean z) {
        m40773B(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo40733t(boolean z) {
        m40773B(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo40732u(Drawable drawable) {
        this.f829a.mo40068w(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo40731v(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo40730w(CharSequence charSequence) {
        this.f829a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo40729x(CharSequence charSequence) {
        this.f829a.setWindowTitle(charSequence);
    }
}
