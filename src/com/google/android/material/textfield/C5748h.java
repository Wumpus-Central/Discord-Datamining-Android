package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C2733w0;
import androidx.core.widget.C2803l;
import java.util.ArrayList;
import java.util.List;
import p083eb.C6805d;
import p083eb.C6807f;
import p102fb.C7101a;
import p102fb.C7102b;
import p366ub.C13242c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.h */
/* loaded from: classes3.dex */
public final class C5748h {

    /* renamed from: a */
    private final Context f11314a;

    /* renamed from: b */
    private final TextInputLayout f11315b;

    /* renamed from: c */
    private LinearLayout f11316c;

    /* renamed from: d */
    private int f11317d;

    /* renamed from: e */
    private FrameLayout f11318e;

    /* renamed from: f */
    private Animator f11319f;

    /* renamed from: g */
    private final float f11320g;

    /* renamed from: h */
    private int f11321h;

    /* renamed from: i */
    private int f11322i;

    /* renamed from: j */
    private CharSequence f11323j;

    /* renamed from: k */
    private boolean f11324k;

    /* renamed from: l */
    private TextView f11325l;

    /* renamed from: m */
    private CharSequence f11326m;

    /* renamed from: n */
    private int f11327n;

    /* renamed from: o */
    private ColorStateList f11328o;

    /* renamed from: p */
    private CharSequence f11329p;

    /* renamed from: q */
    private boolean f11330q;

    /* renamed from: r */
    private TextView f11331r;

    /* renamed from: s */
    private int f11332s;

    /* renamed from: t */
    private ColorStateList f11333t;

    /* renamed from: u */
    private Typeface f11334u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.h$a */
    /* loaded from: classes3.dex */
    public class C5749a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f11335a;

        /* renamed from: b */
        final /* synthetic */ TextView f11336b;

        /* renamed from: c */
        final /* synthetic */ int f11337c;

        /* renamed from: d */
        final /* synthetic */ TextView f11338d;

        C5749a(int i, TextView textView, int i2, TextView textView2) {
            this.f11335a = i;
            this.f11336b = textView;
            this.f11337c = i2;
            this.f11338d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5748h.this.f11321h = this.f11335a;
            C5748h.this.f11319f = null;
            TextView textView = this.f11336b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f11337c == 1 && C5748h.this.f11325l != null) {
                    C5748h.this.f11325l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f11338d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f11338d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f11338d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.h$b */
    /* loaded from: classes3.dex */
    public class C5750b extends View.AccessibilityDelegate {
        C5750b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C5748h.this.f11315b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C5748h(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f11314a = context;
        this.f11315b = textInputLayout;
        this.f11320g = context.getResources().getDimensionPixelSize(C6805d.f14566h);
    }

    /* renamed from: C */
    private void m27508C(int i, int i2) {
        TextView m;
        TextView m2;
        if (i != i2) {
            if (!(i2 == 0 || (m2 = m27481m(i2)) == null)) {
                m2.setVisibility(0);
                m2.setAlpha(1.0f);
            }
            if (!(i == 0 || (m = m27481m(i)) == null)) {
                m.setVisibility(4);
                if (i == 1) {
                    m.setText((CharSequence) null);
                }
            }
            this.f11321h = i2;
        }
    }

    /* renamed from: K */
    private void m27500K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: M */
    private void m27498M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: N */
    private boolean m27497N(TextView textView, CharSequence charSequence) {
        if (!C2733w0.m37029U(this.f11315b) || !this.f11315b.isEnabled() || (this.f11322i == this.f11321h && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private void m27494Q(int i, int i2, boolean z) {
        if (i != i2) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f11319f = animatorSet;
                ArrayList arrayList = new ArrayList();
                m27485i(arrayList, this.f11330q, this.f11331r, 2, i, i2);
                m27485i(arrayList, this.f11324k, this.f11325l, 1, i, i2);
                C7102b.m23396a(animatorSet, arrayList);
                animatorSet.addListener(new C5749a(i2, m27481m(i), i, m27481m(i2)));
                animatorSet.start();
            } else {
                m27508C(i, i2);
            }
            this.f11315b.m27591r0();
            this.f11315b.m27581w0(z);
            this.f11315b.m27648E0();
        }
    }

    /* renamed from: g */
    private boolean m27487g() {
        return (this.f11316c == null || this.f11315b.getEditText() == null) ? false : true;
    }

    /* renamed from: i */
    private void m27485i(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(m27484j(textView, z2));
                if (i3 == i) {
                    list.add(m27483k(textView));
                }
            }
        }
    }

    /* renamed from: j */
    private ObjectAnimator m27484j(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C7101a.f15486a);
        return ofFloat;
    }

    /* renamed from: k */
    private ObjectAnimator m27483k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f11320g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C7101a.f15489d);
        return ofFloat;
    }

    /* renamed from: m */
    private TextView m27481m(int i) {
        if (i == 1) {
            return this.f11325l;
        }
        if (i != 2) {
            return null;
        }
        return this.f11331r;
    }

    /* renamed from: u */
    private int m27473u(boolean z, int i, int i2) {
        return z ? this.f11314a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: x */
    private boolean m27470x(int i) {
        if (i != 1 || this.f11325l == null || TextUtils.isEmpty(this.f11323j)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m27510A() {
        return this.f11330q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m27509B(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f11316c != null) {
            if (!m27469y(i) || (frameLayout = this.f11318e) == null) {
                this.f11316c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f11317d - 1;
            this.f11317d = i2;
            m27498M(this.f11316c, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m27507D(CharSequence charSequence) {
        this.f11326m = charSequence;
        TextView textView = this.f11325l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m27506E(boolean z) {
        if (this.f11324k != z) {
            m27486h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f11314a);
                this.f11325l = appCompatTextView;
                appCompatTextView.setId(C6807f.f38026L);
                this.f11325l.setTextAlignment(5);
                Typeface typeface = this.f11334u;
                if (typeface != null) {
                    this.f11325l.setTypeface(typeface);
                }
                m27505F(this.f11327n);
                m27504G(this.f11328o);
                m27507D(this.f11326m);
                this.f11325l.setVisibility(4);
                C2733w0.m36986s0(this.f11325l, 1);
                m27489e(this.f11325l, 0);
            } else {
                m27472v();
                m27509B(this.f11325l, 0);
                this.f11325l = null;
                this.f11315b.m27591r0();
                this.f11315b.m27648E0();
            }
            this.f11324k = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m27505F(int i) {
        this.f11327n = i;
        TextView textView = this.f11325l;
        if (textView != null) {
            this.f11315b.m27619d0(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m27504G(ColorStateList colorStateList) {
        this.f11328o = colorStateList;
        TextView textView = this.f11325l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m27503H(int i) {
        this.f11332s = i;
        TextView textView = this.f11331r;
        if (textView != null) {
            C2803l.m36674n(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m27502I(boolean z) {
        if (this.f11330q != z) {
            m27486h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f11314a);
                this.f11331r = appCompatTextView;
                appCompatTextView.setId(C6807f.f38027M);
                this.f11331r.setTextAlignment(5);
                Typeface typeface = this.f11334u;
                if (typeface != null) {
                    this.f11331r.setTypeface(typeface);
                }
                this.f11331r.setVisibility(4);
                C2733w0.m36986s0(this.f11331r, 1);
                m27503H(this.f11332s);
                m27501J(this.f11333t);
                m27489e(this.f11331r, 1);
                this.f11331r.setAccessibilityDelegate(new C5750b());
            } else {
                m27471w();
                m27509B(this.f11331r, 1);
                this.f11331r = null;
                this.f11315b.m27591r0();
                this.f11315b.m27648E0();
            }
            this.f11330q = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m27501J(ColorStateList colorStateList) {
        this.f11333t = colorStateList;
        TextView textView = this.f11331r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m27499L(Typeface typeface) {
        if (typeface != this.f11334u) {
            this.f11334u = typeface;
            m27500K(this.f11325l, typeface);
            m27500K(this.f11331r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m27496O(CharSequence charSequence) {
        m27486h();
        this.f11323j = charSequence;
        this.f11325l.setText(charSequence);
        int i = this.f11321h;
        if (i != 1) {
            this.f11322i = 1;
        }
        m27494Q(i, this.f11322i, m27497N(this.f11325l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m27495P(CharSequence charSequence) {
        m27486h();
        this.f11329p = charSequence;
        this.f11331r.setText(charSequence);
        int i = this.f11321h;
        if (i != 2) {
            this.f11322i = 2;
        }
        m27494Q(i, this.f11322i, m27497N(this.f11331r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m27489e(TextView textView, int i) {
        if (this.f11316c == null && this.f11318e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f11314a);
            this.f11316c = linearLayout;
            linearLayout.setOrientation(0);
            this.f11315b.addView(this.f11316c, -1, -2);
            this.f11318e = new FrameLayout(this.f11314a);
            this.f11316c.addView(this.f11318e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f11315b.getEditText() != null) {
                m27488f();
            }
        }
        if (m27469y(i)) {
            this.f11318e.setVisibility(0);
            this.f11318e.addView(textView);
        } else {
            this.f11316c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f11316c.setVisibility(0);
        this.f11317d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m27488f() {
        if (m27487g()) {
            EditText editText = this.f11315b.getEditText();
            boolean g = C13242c.m4235g(this.f11314a);
            LinearLayout linearLayout = this.f11316c;
            int i = C6805d.f14578t;
            C2733w0.m37054F0(linearLayout, m27473u(g, i, C2733w0.m37053G(editText)), m27473u(g, C6805d.f14579u, this.f11314a.getResources().getDimensionPixelSize(C6805d.f14577s)), m27473u(g, i, C2733w0.m37055F(editText)), 0);
        }
    }

    /* renamed from: h */
    void m27486h() {
        Animator animator = this.f11319f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m27482l() {
        return m27470x(this.f11322i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence m27480n() {
        return this.f11326m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public CharSequence m27479o() {
        return this.f11323j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m27478p() {
        TextView textView = this.f11325l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList m27477q() {
        TextView textView = this.f11325l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public CharSequence m27476r() {
        return this.f11329p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public View m27475s() {
        return this.f11331r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public int m27474t() {
        TextView textView = this.f11331r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m27472v() {
        this.f11323j = null;
        m27486h();
        if (this.f11321h == 1) {
            if (!this.f11330q || TextUtils.isEmpty(this.f11329p)) {
                this.f11322i = 0;
            } else {
                this.f11322i = 2;
            }
        }
        m27494Q(this.f11321h, this.f11322i, m27497N(this.f11325l, ""));
    }

    /* renamed from: w */
    void m27471w() {
        m27486h();
        int i = this.f11321h;
        if (i == 2) {
            this.f11322i = 0;
        }
        m27494Q(i, this.f11322i, m27497N(this.f11331r, ""));
    }

    /* renamed from: y */
    boolean m27469y(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m27468z() {
        return this.f11324k;
    }
}
