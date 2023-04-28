package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.core.view.C2706t;
import androidx.core.view.C2733w0;
import p052d.C6382d;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public class C1582i {

    /* renamed from: a */
    private final Context f1048a;

    /* renamed from: b */
    private final C1575e f1049b;

    /* renamed from: c */
    private final boolean f1050c;

    /* renamed from: d */
    private final int f1051d;

    /* renamed from: e */
    private final int f1052e;

    /* renamed from: f */
    private View f1053f;

    /* renamed from: g */
    private int f1054g;

    /* renamed from: h */
    private boolean f1055h;

    /* renamed from: i */
    private AbstractC1584j.AbstractC1585a f1056i;

    /* renamed from: j */
    private AbstractC1581h f1057j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1058k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1059l;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes.dex */
    class C1583a implements PopupWindow.OnDismissListener {
        C1583a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C1582i.this.mo40292e();
        }
    }

    public C1582i(Context context, C1575e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    /* renamed from: a */
    private AbstractC1581h m40592a() {
        boolean z;
        AbstractC1581h hVar;
        Display defaultDisplay = ((WindowManager) this.f1048a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (Math.min(point.x, point.y) >= this.f1048a.getResources().getDimensionPixelSize(C6382d.f13132c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hVar = new View$OnKeyListenerC1567b(this.f1048a, this.f1053f, this.f1051d, this.f1052e, this.f1050c);
        } else {
            hVar = new View$OnKeyListenerC1588l(this.f1048a, this.f1049b, this.f1053f, this.f1051d, this.f1052e, this.f1050c);
        }
        hVar.mo40578i(this.f1049b);
        hVar.mo40573s(this.f1059l);
        hVar.mo40577m(this.f1053f);
        hVar.mo40579c(this.f1056i);
        hVar.mo40576p(this.f1055h);
        hVar.mo40575q(this.f1054g);
        return hVar;
    }

    /* renamed from: l */
    private void m40582l(int i, int i2, boolean z, boolean z2) {
        AbstractC1581h c = m40590c();
        c.mo40572t(z2);
        if (z) {
            if ((C2706t.m37125b(this.f1054g, C2733w0.m37063B(this.f1053f)) & 7) == 5) {
                i -= this.f1053f.getWidth();
            }
            c.mo40574r(i);
            c.mo40571u(i2);
            int i3 = (int) ((this.f1048a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.m40595o(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.show();
    }

    /* renamed from: b */
    public void m40591b() {
        if (m40589d()) {
            this.f1057j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC1581h m40590c() {
        if (this.f1057j == null) {
            this.f1057j = m40592a();
        }
        return this.f1057j;
    }

    /* renamed from: d */
    public boolean m40589d() {
        AbstractC1581h hVar = this.f1057j;
        return hVar != null && hVar.isShowing();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo40292e() {
        this.f1057j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1058k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m40588f(View view) {
        this.f1053f = view;
    }

    /* renamed from: g */
    public void m40587g(boolean z) {
        this.f1055h = z;
        AbstractC1581h hVar = this.f1057j;
        if (hVar != null) {
            hVar.mo40576p(z);
        }
    }

    /* renamed from: h */
    public void m40586h(int i) {
        this.f1054g = i;
    }

    /* renamed from: i */
    public void m40585i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1058k = onDismissListener;
    }

    /* renamed from: j */
    public void m40584j(AbstractC1584j.AbstractC1585a aVar) {
        this.f1056i = aVar;
        AbstractC1581h hVar = this.f1057j;
        if (hVar != null) {
            hVar.mo40579c(aVar);
        }
    }

    /* renamed from: k */
    public void m40583k() {
        if (!m40581m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m40581m() {
        if (m40589d()) {
            return true;
        }
        if (this.f1053f == null) {
            return false;
        }
        m40582l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m40580n(int i, int i2) {
        if (m40589d()) {
            return true;
        }
        if (this.f1053f == null) {
            return false;
        }
        m40582l(i, i2, true, true);
        return true;
    }

    public C1582i(Context context, C1575e eVar, View view, boolean z, int i, int i2) {
        this.f1054g = 8388611;
        this.f1059l = new C1583a();
        this.f1048a = context;
        this.f1049b = eVar;
        this.f1053f = view;
        this.f1050c = z;
        this.f1051d = i;
        this.f1052e = i2;
    }
}
