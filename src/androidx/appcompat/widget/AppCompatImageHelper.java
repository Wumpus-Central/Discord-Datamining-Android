package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C2733w0;
import androidx.core.widget.C2795h;
import p052d.C6388j;
import p071e.C6525a;

/* loaded from: classes.dex */
public class AppCompatImageHelper {

    /* renamed from: a */
    private final ImageView f1136a;

    /* renamed from: b */
    private C1692l1 f1137b;

    /* renamed from: c */
    private C1692l1 f1138c;

    /* renamed from: d */
    private C1692l1 f1139d;

    /* renamed from: e */
    private int f1140e = 0;

    public AppCompatImageHelper(ImageView imageView) {
        this.f1136a = imageView;
    }

    /* renamed from: a */
    private boolean m40487a(Drawable drawable) {
        if (this.f1139d == null) {
            this.f1139d = new C1692l1();
        }
        C1692l1 l1Var = this.f1139d;
        l1Var.m40129a();
        ColorStateList a = C2795h.m36710a(this.f1136a);
        if (a != null) {
            l1Var.f1417d = true;
            l1Var.f1414a = a;
        }
        PorterDuff.Mode b = C2795h.m36709b(this.f1136a);
        if (b != null) {
            l1Var.f1416c = true;
            l1Var.f1415b = b;
        }
        if (!l1Var.f1417d && !l1Var.f1416c) {
            return false;
        }
        C1683j.m40155i(drawable, l1Var, this.f1136a.getDrawableState());
        return true;
    }

    /* renamed from: l */
    private boolean m40476l() {
        return this.f1137b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40486b() {
        if (this.f1136a.getDrawable() != null) {
            this.f1136a.getDrawable().setLevel(this.f1140e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m40485c() {
        Drawable drawable = this.f1136a.getDrawable();
        if (drawable != null) {
            C1709q0.m40057b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m40476l() || !m40487a(drawable)) {
            C1692l1 l1Var = this.f1138c;
            if (l1Var != null) {
                C1683j.m40155i(drawable, l1Var, this.f1136a.getDrawableState());
                return;
            }
            C1692l1 l1Var2 = this.f1137b;
            if (l1Var2 != null) {
                C1683j.m40155i(drawable, l1Var2, this.f1136a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList m40484d() {
        C1692l1 l1Var = this.f1138c;
        if (l1Var != null) {
            return l1Var.f1414a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public PorterDuff.Mode m40483e() {
        C1692l1 l1Var = this.f1138c;
        if (l1Var != null) {
            return l1Var.f1415b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m40482f() {
        if (this.f1136a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m40481g(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f1136a.getContext();
        int[] iArr = C6388j.f37860P;
        C1698n1 v = C1698n1.m40105v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1136a;
        C2733w0.m36994o0(imageView, imageView.getContext(), iArr, attributeSet, v.m40109r(), i, 0);
        try {
            Drawable drawable = this.f1136a.getDrawable();
            if (!(drawable != null || (n = v.m40113n(C6388j.f37865Q, -1)) == -1 || (drawable = C6525a.m25364b(this.f1136a.getContext(), n)) == null)) {
                this.f1136a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C1709q0.m40057b(drawable);
            }
            int i2 = C6388j.f37870R;
            if (v.m40108s(i2)) {
                C2795h.m36708c(this.f1136a, v.m40124c(i2));
            }
            int i3 = C6388j.f37875S;
            if (v.m40108s(i3)) {
                C2795h.m36707d(this.f1136a, C1709q0.m40054e(v.m40116k(i3, -1), null));
            }
        } finally {
            v.m40104w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40480h(Drawable drawable) {
        this.f1140e = drawable.getLevel();
    }

    /* renamed from: i */
    public void m40479i(int i) {
        if (i != 0) {
            Drawable b = C6525a.m25364b(this.f1136a.getContext(), i);
            if (b != null) {
                C1709q0.m40057b(b);
            }
            this.f1136a.setImageDrawable(b);
        } else {
            this.f1136a.setImageDrawable(null);
        }
        m40485c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m40478j(ColorStateList colorStateList) {
        if (this.f1138c == null) {
            this.f1138c = new C1692l1();
        }
        C1692l1 l1Var = this.f1138c;
        l1Var.f1414a = colorStateList;
        l1Var.f1417d = true;
        m40485c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m40477k(PorterDuff.Mode mode) {
        if (this.f1138c == null) {
            this.f1138c = new C1692l1();
        }
        C1692l1 l1Var = this.f1138c;
        l1Var.f1415b = mode;
        l1Var.f1416c = true;
        m40485c();
    }
}
