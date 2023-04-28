package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p083eb.C6806e;
import p083eb.C6810i;
import p102fb.C7101a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes3.dex */
public class C5721a extends AbstractC5746f {

    /* renamed from: e */
    private final TextWatcher f11260e = new C0162a();

    /* renamed from: f */
    private final View.OnFocusChangeListener f11261f = new View$OnFocusChangeListenerC5722b();

    /* renamed from: g */
    private final TextInputLayout.AbstractC5717f f11262g = new C5723c();

    /* renamed from: h */
    private final TextInputLayout.AbstractC5718g f11263h = new C5724d();

    /* renamed from: i */
    private AnimatorSet f11264i;

    /* renamed from: j */
    private ValueAnimator f11265j;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes3.dex */
    class C0162a implements TextWatcher {
        C0162a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C5721a.this.f11310a.getSuffixText() == null) {
                C5721a aVar = C5721a.this;
                aVar.m27567i(aVar.m27563m());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes3.dex */
    class View$OnFocusChangeListenerC5722b implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC5722b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C5721a aVar = C5721a.this;
            aVar.m27567i(aVar.m27563m());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes3.dex */
    class C5723c implements TextInputLayout.AbstractC5717f {
        C5723c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC5717f
        /* renamed from: a */
        public void mo27457a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C5721a.this.m27563m());
            editText.setOnFocusChangeListener(C5721a.this.f11261f);
            C5721a aVar = C5721a.this;
            aVar.f11312c.setOnFocusChangeListener(aVar.f11261f);
            editText.removeTextChangedListener(C5721a.this.f11260e);
            editText.addTextChangedListener(C5721a.this.f11260e);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes3.dex */
    class C5724d implements TextInputLayout.AbstractC5718g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes3.dex */
        class RunnableC0163a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ EditText f11270k;

            RunnableC0163a(EditText editText) {
                this.f11270k = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11270k.removeTextChangedListener(C5721a.this.f11260e);
                C5721a.this.m27567i(true);
            }
        }

        C5724d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC5718g
        /* renamed from: a */
        public void mo27456a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new RunnableC0163a(editText));
                if (editText.getOnFocusChangeListener() == C5721a.this.f11261f) {
                    editText.setOnFocusChangeListener(null);
                }
                if (C5721a.this.f11312c.getOnFocusChangeListener() == C5721a.this.f11261f) {
                    C5721a.this.f11312c.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC5725e implements View.OnClickListener {
        View$OnClickListenerC5725e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C5721a.this.f11310a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C5721a.this.f11310a.m27632U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes3.dex */
    public class C5726f extends AnimatorListenerAdapter {
        C5726f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5721a.this.f11310a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes3.dex */
    public class C5727g extends AnimatorListenerAdapter {
        C5727g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5721a.this.f11310a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$h */
    /* loaded from: classes3.dex */
    public class C5728h implements ValueAnimator.AnimatorUpdateListener {
        C5728h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5721a.this.f11312c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$i */
    /* loaded from: classes3.dex */
    public class C5729i implements ValueAnimator.AnimatorUpdateListener {
        C5729i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C5721a.this.f11312c.setScaleX(floatValue);
            C5721a.this.f11312c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5721a(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m27567i(boolean z) {
        boolean z2;
        if (this.f11310a.m27642K() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f11264i.isRunning()) {
            this.f11265j.cancel();
            this.f11264i.start();
            if (z2) {
                this.f11264i.end();
            }
        } else if (!z) {
            this.f11264i.cancel();
            this.f11265j.start();
            if (z2) {
                this.f11265j.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m27566j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7101a.f15486a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C5728h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m27565k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C7101a.f15489d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C5729i());
        return ofFloat;
    }

    /* renamed from: l */
    private void m27564l() {
        ValueAnimator k = m27565k();
        ValueAnimator j = m27566j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f11264i = animatorSet;
        animatorSet.playTogether(k, j);
        this.f11264i.addListener(new C5726f());
        ValueAnimator j2 = m27566j(1.0f, 0.0f);
        this.f11265j = j2;
        j2.addListener(new C5727g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m27563m() {
        EditText editText = this.f11310a.getEditText();
        if (editText == null || ((!editText.hasFocus() && !this.f11312c.hasFocus()) || editText.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC5746f
    /* renamed from: a */
    public void mo27462a() {
        TextInputLayout textInputLayout = this.f11310a;
        int i = this.f11313d;
        if (i == 0) {
            i = C6806e.f14590f;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f11310a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C6810i.f14643e));
        this.f11310a.setEndIconCheckable(false);
        this.f11310a.setEndIconOnClickListener(new View$OnClickListenerC5725e());
        this.f11310a.m27614g(this.f11262g);
        this.f11310a.m27612h(this.f11263h);
        m27564l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC5746f
    /* renamed from: c */
    public void mo27518c(boolean z) {
        if (this.f11310a.getSuffixText() != null) {
            m27567i(z);
        }
    }
}
