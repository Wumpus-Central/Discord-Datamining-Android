package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C2367h;
import androidx.core.view.C2733w0;
import androidx.core.widget.AbstractC2783b;
import java.lang.ref.WeakReference;
import p052d.C6388j;
import p092f1.C6987d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppCompatTextHelper {

    /* renamed from: a */
    private final TextView f1149a;

    /* renamed from: b */
    private C1692l1 f1150b;

    /* renamed from: c */
    private C1692l1 f1151c;

    /* renamed from: d */
    private C1692l1 f1152d;

    /* renamed from: e */
    private C1692l1 f1153e;

    /* renamed from: f */
    private C1692l1 f1154f;

    /* renamed from: g */
    private C1692l1 f1155g;

    /* renamed from: h */
    private C1692l1 f1156h;

    /* renamed from: i */
    private final C1667g0 f1157i;

    /* renamed from: j */
    private int f1158j = 0;

    /* renamed from: k */
    private int f1159k = -1;

    /* renamed from: l */
    private Typeface f1160l;

    /* renamed from: m */
    private boolean f1161m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$a */
    /* loaded from: classes.dex */
    public class C1603a extends C2367h.AbstractC2372e {

        /* renamed from: a */
        final /* synthetic */ int f1162a;

        /* renamed from: b */
        final /* synthetic */ int f1163b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1164c;

        C1603a(int i, int i2, WeakReference weakReference) {
            this.f1162a = i;
            this.f1163b = i2;
            this.f1164c = weakReference;
        }

        @Override // androidx.core.content.res.C2367h.AbstractC2372e
        /* renamed from: h */
        public void mo4217h(int i) {
        }

        @Override // androidx.core.content.res.C2367h.AbstractC2372e
        /* renamed from: i */
        public void mo4216i(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1162a) != -1) {
                if ((this.f1163b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = Typeface.create(typeface, i, z);
            }
            AppCompatTextHelper.this.m40452n(this.f1164c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$b */
    /* loaded from: classes.dex */
    public class RunnableC1604b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ TextView f1166k;

        /* renamed from: l */
        final /* synthetic */ Typeface f1167l;

        /* renamed from: m */
        final /* synthetic */ int f1168m;

        RunnableC1604b(TextView textView, Typeface typeface, int i) {
            this.f1166k = textView;
            this.f1167l = typeface;
            this.f1168m = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1166k.setTypeface(this.f1167l, this.f1168m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatTextHelper(TextView textView) {
        this.f1149a = textView;
        this.f1157i = new C1667g0(textView);
    }

    /* renamed from: B */
    private void m40467B(int i, float f) {
        this.f1157i.m40221u(i, f);
    }

    /* renamed from: C */
    private void m40466C(Context context, C1698n1 n1Var) {
        String o;
        Typeface create;
        boolean z;
        boolean z2;
        Typeface create2;
        this.f1158j = n1Var.m40116k(C6388j.f37890V2, this.f1158j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int k = n1Var.m40116k(C6388j.f37902Y2, -1);
            this.f1159k = k;
            if (k != -1) {
                this.f1158j = (this.f1158j & 2) | 0;
            }
        }
        int i2 = C6388j.f37898X2;
        if (n1Var.m40108s(i2) || n1Var.m40108s(C6388j.f37906Z2)) {
            this.f1160l = null;
            int i3 = C6388j.f37906Z2;
            if (n1Var.m40108s(i3)) {
                i2 = i3;
            }
            int i4 = this.f1159k;
            int i5 = this.f1158j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = n1Var.m40117j(i2, this.f1158j, new C1603a(i4, i5, new WeakReference(this.f1149a)));
                    if (j != null) {
                        if (i < 28 || this.f1159k == -1) {
                            this.f1160l = j;
                        } else {
                            Typeface create3 = Typeface.create(j, 0);
                            int i6 = this.f1159k;
                            if ((this.f1158j & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            create2 = Typeface.create(create3, i6, z2);
                            this.f1160l = create2;
                        }
                    }
                    if (this.f1160l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f1161m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1160l == null && (o = n1Var.m40112o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1159k == -1) {
                    this.f1160l = Typeface.create(o, this.f1158j);
                    return;
                }
                Typeface create4 = Typeface.create(o, 0);
                int i7 = this.f1159k;
                if ((this.f1158j & 2) != 0) {
                    z3 = true;
                }
                create = Typeface.create(create4, i7, z3);
                this.f1160l = create;
                return;
            }
            return;
        }
        int i8 = C6388j.f37886U2;
        if (n1Var.m40108s(i8)) {
            this.f1161m = false;
            int k2 = n1Var.m40116k(i8, 1);
            if (k2 == 1) {
                this.f1160l = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.f1160l = Typeface.SERIF;
            } else if (k2 == 3) {
                this.f1160l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    private void m40465a(Drawable drawable, C1692l1 l1Var) {
        if (drawable != null && l1Var != null) {
            C1683j.m40155i(drawable, l1Var, this.f1149a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C1692l1 m40462d(Context context, C1683j jVar, int i) {
        ColorStateList f = jVar.m40158f(context, i);
        if (f == null) {
            return null;
        }
        C1692l1 l1Var = new C1692l1();
        l1Var.f1417d = true;
        l1Var.f1414a = f;
        return l1Var;
    }

    /* renamed from: y */
    private void m40441y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1149a.getCompoundDrawablesRelative();
            TextView textView = this.f1149a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f1149a.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f1149a.getCompoundDrawables();
                TextView textView2 = this.f1149a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f1149a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
        }
    }

    /* renamed from: z */
    private void m40440z() {
        C1692l1 l1Var = this.f1156h;
        this.f1150b = l1Var;
        this.f1151c = l1Var;
        this.f1152d = l1Var;
        this.f1153e = l1Var;
        this.f1154f = l1Var;
        this.f1155g = l1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m40468A(int i, float f) {
        if (!AbstractC2783b.f3715b && !m40454l()) {
            m40467B(i, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40464b() {
        if (!(this.f1150b == null && this.f1151c == null && this.f1152d == null && this.f1153e == null)) {
            Drawable[] compoundDrawables = this.f1149a.getCompoundDrawables();
            m40465a(compoundDrawables[0], this.f1150b);
            m40465a(compoundDrawables[1], this.f1151c);
            m40465a(compoundDrawables[2], this.f1152d);
            m40465a(compoundDrawables[3], this.f1153e);
        }
        if (this.f1154f != null || this.f1155g != null) {
            Drawable[] compoundDrawablesRelative = this.f1149a.getCompoundDrawablesRelative();
            m40465a(compoundDrawablesRelative[0], this.f1154f);
            m40465a(compoundDrawablesRelative[2], this.f1155g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m40463c() {
        this.f1157i.m40241a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m40461e() {
        return this.f1157i.m40235g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m40460f() {
        return this.f1157i.m40234h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m40459g() {
        return this.f1157i.m40233i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] m40458h() {
        return this.f1157i.m40232j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m40457i() {
        return this.f1157i.m40231k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m40456j() {
        C1692l1 l1Var = this.f1156h;
        if (l1Var != null) {
            return l1Var.f1414a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m40455k() {
        C1692l1 l1Var = this.f1156h;
        if (l1Var != null) {
            return l1Var.f1415b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m40454l() {
        return this.f1157i.m40227o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fb  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40453m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.m40453m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m40452n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1161m) {
            this.f1160l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (C2733w0.m37030T(textView)) {
                textView.post(new RunnableC1604b(textView, typeface, this.f1158j));
            } else {
                textView.setTypeface(typeface, this.f1158j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m40451o(boolean z, int i, int i2, int i3, int i4) {
        if (!AbstractC2783b.f3715b) {
            m40463c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m40450p() {
        m40464b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m40449q(Context context, int i) {
        String o;
        C1698n1 t = C1698n1.m40107t(context, i, C6388j.f37878S2);
        int i2 = C6388j.f13244b3;
        if (t.m40108s(i2)) {
            m40447s(t.m40126a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = C6388j.f37882T2;
        if (t.m40108s(i4) && t.m40121f(i4, -1) == 0) {
            this.f1149a.setTextSize(0, 0.0f);
        }
        m40466C(context, t);
        if (i3 >= 26) {
            int i5 = C6388j.f13239a3;
            if (t.m40108s(i5) && (o = t.m40112o(i5)) != null) {
                this.f1149a.setFontVariationSettings(o);
            }
        }
        t.m40104w();
        Typeface typeface = this.f1160l;
        if (typeface != null) {
            this.f1149a.setTypeface(typeface, this.f1158j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m40448r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C6987d.m23727f(editorInfo, textView.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m40447s(boolean z) {
        this.f1149a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m40446t(int i, int i2, int i3, int i4) {
        this.f1157i.m40225q(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m40445u(int[] iArr, int i) {
        this.f1157i.m40224r(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m40444v(int i) {
        this.f1157i.m40223s(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m40443w(ColorStateList colorStateList) {
        boolean z;
        if (this.f1156h == null) {
            this.f1156h = new C1692l1();
        }
        C1692l1 l1Var = this.f1156h;
        l1Var.f1414a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        l1Var.f1417d = z;
        m40440z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m40442x(PorterDuff.Mode mode) {
        boolean z;
        if (this.f1156h == null) {
            this.f1156h = new C1692l1();
        }
        C1692l1 l1Var = this.f1156h;
        l1Var.f1415b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        l1Var.f1416c = z;
        m40440z();
    }
}
