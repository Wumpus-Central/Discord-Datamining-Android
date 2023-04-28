package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C2733w0;
import p052d.C6388j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppCompatBackgroundHelper {

    /* renamed from: a */
    private final View f1126a;

    /* renamed from: d */
    private C1692l1 f1129d;

    /* renamed from: e */
    private C1692l1 f1130e;

    /* renamed from: f */
    private C1692l1 f1131f;

    /* renamed from: c */
    private int f1128c = -1;

    /* renamed from: b */
    private final C1683j f1127b = C1683j.m40162b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatBackgroundHelper(View view) {
        this.f1126a = view;
    }

    /* renamed from: a */
    private boolean m40510a(Drawable drawable) {
        if (this.f1131f == null) {
            this.f1131f = new C1692l1();
        }
        C1692l1 l1Var = this.f1131f;
        l1Var.m40129a();
        ColorStateList s = C2733w0.m36987s(this.f1126a);
        if (s != null) {
            l1Var.f1417d = true;
            l1Var.f1414a = s;
        }
        PorterDuff.Mode t = C2733w0.m36985t(this.f1126a);
        if (t != null) {
            l1Var.f1416c = true;
            l1Var.f1415b = t;
        }
        if (!l1Var.f1417d && !l1Var.f1416c) {
            return false;
        }
        C1683j.m40155i(drawable, l1Var, this.f1126a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m40500k() {
        return this.f1129d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40509b() {
        Drawable background = this.f1126a.getBackground();
        if (background == null) {
            return;
        }
        if (!m40500k() || !m40510a(background)) {
            C1692l1 l1Var = this.f1130e;
            if (l1Var != null) {
                C1683j.m40155i(background, l1Var, this.f1126a.getDrawableState());
                return;
            }
            C1692l1 l1Var2 = this.f1129d;
            if (l1Var2 != null) {
                C1683j.m40155i(background, l1Var2, this.f1126a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m40508c() {
        C1692l1 l1Var = this.f1130e;
        if (l1Var != null) {
            return l1Var.f1414a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m40507d() {
        C1692l1 l1Var = this.f1130e;
        if (l1Var != null) {
            return l1Var.f1415b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40506e(AttributeSet attributeSet, int i) {
        Context context = this.f1126a.getContext();
        int[] iArr = C6388j.f37839K3;
        C1698n1 v = C1698n1.m40105v(context, attributeSet, iArr, i, 0);
        View view = this.f1126a;
        C2733w0.m36994o0(view, view.getContext(), iArr, attributeSet, v.m40109r(), i, 0);
        try {
            int i2 = C6388j.f37844L3;
            if (v.m40108s(i2)) {
                this.f1128c = v.m40113n(i2, -1);
                ColorStateList f = this.f1127b.m40158f(this.f1126a.getContext(), this.f1128c);
                if (f != null) {
                    m40503h(f);
                }
            }
            int i3 = C6388j.f37849M3;
            if (v.m40108s(i3)) {
                C2733w0.m36980v0(this.f1126a, v.m40124c(i3));
            }
            int i4 = C6388j.f37854N3;
            if (v.m40108s(i4)) {
                C2733w0.m36978w0(this.f1126a, C1709q0.m40054e(v.m40116k(i4, -1), null));
            }
        } finally {
            v.m40104w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40505f(Drawable drawable) {
        this.f1128c = -1;
        m40503h(null);
        m40509b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40504g(int i) {
        ColorStateList colorStateList;
        this.f1128c = i;
        C1683j jVar = this.f1127b;
        if (jVar != null) {
            colorStateList = jVar.m40158f(this.f1126a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m40503h(colorStateList);
        m40509b();
    }

    /* renamed from: h */
    void m40503h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1129d == null) {
                this.f1129d = new C1692l1();
            }
            C1692l1 l1Var = this.f1129d;
            l1Var.f1414a = colorStateList;
            l1Var.f1417d = true;
        } else {
            this.f1129d = null;
        }
        m40509b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m40502i(ColorStateList colorStateList) {
        if (this.f1130e == null) {
            this.f1130e = new C1692l1();
        }
        C1692l1 l1Var = this.f1130e;
        l1Var.f1414a = colorStateList;
        l1Var.f1417d = true;
        m40509b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m40501j(PorterDuff.Mode mode) {
        if (this.f1130e == null) {
            this.f1130e = new C1692l1();
        }
        C1692l1 l1Var = this.f1130e;
        l1Var.f1415b = mode;
        l1Var.f1416c = true;
        m40509b();
    }
}
