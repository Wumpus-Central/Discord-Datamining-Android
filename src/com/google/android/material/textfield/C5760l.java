package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1698n1;
import androidx.core.view.C2731w;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C2803l;
import com.google.android.material.internal.C5665o;
import com.google.android.material.internal.CheckableImageButton;
import p083eb.C6805d;
import p083eb.C6807f;
import p083eb.C6809h;
import p083eb.C6812k;
import p366ub.C13242c;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.l */
/* loaded from: classes3.dex */
public class C5760l extends LinearLayout {

    /* renamed from: k */
    private final TextInputLayout f11355k;

    /* renamed from: l */
    private final TextView f11356l;

    /* renamed from: m */
    private CharSequence f11357m;

    /* renamed from: n */
    private final CheckableImageButton f11358n;

    /* renamed from: o */
    private ColorStateList f11359o;

    /* renamed from: p */
    private PorterDuff.Mode f11360p;

    /* renamed from: q */
    private View.OnLongClickListener f11361q;

    /* renamed from: r */
    private boolean f11362r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5760l(TextInputLayout textInputLayout, C1698n1 n1Var) {
        super(textInputLayout.getContext());
        this.f11355k = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C6809h.f14623c, (ViewGroup) this, false);
        this.f11358n = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f11356l = appCompatTextView;
        m27449g(n1Var);
        m27450f(n1Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: f */
    private void m27450f(C1698n1 n1Var) {
        this.f11356l.setVisibility(8);
        this.f11356l.setId(C6807f.f38029O);
        this.f11356l.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C2733w0.m36986s0(this.f11356l, 1);
        m27444l(n1Var.m40113n(C6812k.f14884z6, 0));
        int i = C6812k.f38038A6;
        if (n1Var.m40108s(i)) {
            m27443m(n1Var.m40124c(i));
        }
        m27445k(n1Var.m40111p(C6812k.f14876y6));
    }

    /* renamed from: g */
    private void m27449g(C1698n1 n1Var) {
        if (C13242c.m4235g(getContext())) {
            C2731w.m37075c((ViewGroup.MarginLayoutParams) this.f11358n.getLayoutParams(), 0);
        }
        m27439q(null);
        m27438r(null);
        int i = C6812k.f38070E6;
        if (n1Var.m40108s(i)) {
            this.f11359o = C13242c.m4240b(getContext(), n1Var, i);
        }
        int i2 = C6812k.f38078F6;
        if (n1Var.m40108s(i2)) {
            this.f11360p = C5665o.m27825f(n1Var.m40116k(i2, -1), null);
        }
        int i3 = C6812k.f38062D6;
        if (n1Var.m40108s(i3)) {
            m27440p(n1Var.m40120g(i3));
            int i4 = C6812k.f38054C6;
            if (n1Var.m40108s(i4)) {
                m27441o(n1Var.m40111p(i4));
            }
            m27442n(n1Var.m40126a(C6812k.f38046B6, true));
        }
    }

    /* renamed from: x */
    private void m27432x() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.f11357m == null || this.f11362r) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f11358n.getVisibility() == 0 || i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f11356l.setVisibility(i);
        this.f11355k.m27593q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence m27455a() {
        return this.f11357m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m27454b() {
        return this.f11356l.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public TextView m27453c() {
        return this.f11356l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence m27452d() {
        return this.f11358n.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable m27451e() {
        return this.f11358n.getDrawable();
    }

    /* renamed from: h */
    boolean m27448h() {
        return this.f11358n.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m27447i(boolean z) {
        this.f11362r = z;
        m27432x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m27446j() {
        C5747g.m27514c(this.f11355k, this.f11358n, this.f11359o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m27445k(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f11357m = charSequence2;
        this.f11356l.setText(charSequence);
        m27432x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m27444l(int i) {
        C2803l.m36674n(this.f11356l, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m27443m(ColorStateList colorStateList) {
        this.f11356l.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m27442n(boolean z) {
        this.f11358n.setCheckable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m27441o(CharSequence charSequence) {
        if (m27452d() != charSequence) {
            this.f11358n.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m27433w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m27440p(Drawable drawable) {
        this.f11358n.setImageDrawable(drawable);
        if (drawable != null) {
            C5747g.m27516a(this.f11355k, this.f11358n, this.f11359o, this.f11360p);
            m27435u(true);
            m27446j();
            return;
        }
        m27435u(false);
        m27439q(null);
        m27438r(null);
        m27441o(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m27439q(View.OnClickListener onClickListener) {
        C5747g.m27512e(this.f11358n, onClickListener, this.f11361q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m27438r(View.OnLongClickListener onLongClickListener) {
        this.f11361q = onLongClickListener;
        C5747g.m27511f(this.f11358n, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m27437s(ColorStateList colorStateList) {
        if (this.f11359o != colorStateList) {
            this.f11359o = colorStateList;
            C5747g.m27516a(this.f11355k, this.f11358n, colorStateList, this.f11360p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m27436t(PorterDuff.Mode mode) {
        if (this.f11360p != mode) {
            this.f11360p = mode;
            C5747g.m27516a(this.f11355k, this.f11358n, this.f11359o, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m27435u(boolean z) {
        int i;
        if (m27448h() != z) {
            CheckableImageButton checkableImageButton = this.f11358n;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m27433w();
            m27432x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m27434v(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f11356l.getVisibility() == 0) {
            accessibilityNodeInfoCompat.m37365m0(this.f11356l);
            accessibilityNodeInfoCompat.m37416E0(this.f11356l);
            return;
        }
        accessibilityNodeInfoCompat.m37416E0(this.f11358n);
    }

    /* renamed from: w */
    void m27433w() {
        int i;
        EditText editText = this.f11355k.f11226o;
        if (editText != null) {
            if (m27448h()) {
                i = 0;
            } else {
                i = C2733w0.m37053G(editText);
            }
            C2733w0.m37054F0(this.f11356l, i, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C6805d.f14580v), editText.getCompoundPaddingBottom());
        }
    }
}
