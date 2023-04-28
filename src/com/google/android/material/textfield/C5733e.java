package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C2574c;
import com.google.android.material.internal.C5661l;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6806e;
import p083eb.C6810i;
import p102fb.C7101a;
import p422xb.C14038g;
import p422xb.C14045k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes3.dex */
public class C5733e extends AbstractC5746f {

    /* renamed from: t */
    private static final boolean f11277t = true;

    /* renamed from: e */
    private final TextWatcher f11278e = new C5734a();

    /* renamed from: f */
    private final View.OnFocusChangeListener f11279f = new View$OnFocusChangeListenerC0165e();

    /* renamed from: g */
    private final TextInputLayout.C5716e f11280g = new C5738f(this.f11310a);

    /* renamed from: h */
    private final TextInputLayout.AbstractC5717f f11281h = new C5739g();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    private final TextInputLayout.AbstractC5718g f11282i = new C5740h();

    /* renamed from: j */
    private final View.OnAttachStateChangeListener f11283j = new View$OnAttachStateChangeListenerC5742i();

    /* renamed from: k */
    private final C2574c.AbstractC2576b f11284k = new C5743j();

    /* renamed from: l */
    private boolean f11285l = false;

    /* renamed from: m */
    private boolean f11286m = false;

    /* renamed from: n */
    private long f11287n = Long.MAX_VALUE;

    /* renamed from: o */
    private StateListDrawable f11288o;

    /* renamed from: p */
    private C14038g f11289p;

    /* renamed from: q */
    private AccessibilityManager f11290q;

    /* renamed from: r */
    private ValueAnimator f11291r;

    /* renamed from: s */
    private ValueAnimator f11292s;

    /* renamed from: com.google.android.material.textfield.e$a */
    /* loaded from: classes3.dex */
    class C5734a extends C5661l {

        /* renamed from: com.google.android.material.textfield.e$a$a */
        /* loaded from: classes3.dex */
        class RunnableC0164a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ AutoCompleteTextView f11294k;

            RunnableC0164a(AutoCompleteTextView autoCompleteTextView) {
                this.f11294k = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f11294k.isPopupShowing();
                C5733e.this.m27547J(isPopupShowing);
                C5733e.this.f11285l = isPopupShowing;
            }
        }

        C5734a() {
        }

        @Override // com.google.android.material.internal.C5661l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView C = C5733e.m27554C(C5733e.this.f11310a.getEditText());
            if (C5733e.this.f11290q.isTouchExplorationEnabled() && C5733e.m27549H(C) && !C5733e.this.f11312c.hasFocus()) {
                C.dismissDropDown();
            }
            C.post(new RunnableC0164a(C));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$b */
    /* loaded from: classes3.dex */
    public class C5735b implements AutoCompleteTextView.OnDismissListener {
        C5735b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C5733e.this.m27543N();
            C5733e.this.m27547J(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$c */
    /* loaded from: classes3.dex */
    public class C5736c extends AnimatorListenerAdapter {
        C5736c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5733e eVar = C5733e.this;
            eVar.f11312c.setChecked(eVar.f11286m);
            C5733e.this.f11292s.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$d */
    /* loaded from: classes3.dex */
    public class C5737d implements ValueAnimator.AnimatorUpdateListener {
        C5737d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5733e.this.f11312c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.e$e */
    /* loaded from: classes3.dex */
    class View$OnFocusChangeListenerC0165e implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0165e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C5733e.this.f11310a.setEndIconActivated(z);
            if (!z) {
                C5733e.this.m27547J(false);
                C5733e.this.f11285l = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.e$f */
    /* loaded from: classes3.dex */
    class C5738f extends TextInputLayout.C5716e {
        C5738f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C5716e, androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!C5733e.m27549H(C5733e.this.f11310a.getEditText())) {
                accessibilityNodeInfoCompat.m37389a0(Spinner.class.getName());
            }
            if (accessibilityNodeInfoCompat.m37405L()) {
                accessibilityNodeInfoCompat.m37369k0(null);
            }
        }

        @Override // androidx.core.view.C2549a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView C = C5733e.m27554C(C5733e.this.f11310a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C5733e.this.f11290q.isEnabled() && !C5733e.m27549H(C5733e.this.f11310a.getEditText())) {
                C5733e.this.m27544M(C);
                C5733e.this.m27543N();
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.e$g */
    /* loaded from: classes3.dex */
    class C5739g implements TextInputLayout.AbstractC5717f {
        C5739g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC5717f
        /* renamed from: a */
        public void mo27457a(TextInputLayout textInputLayout) {
            AutoCompleteTextView C = C5733e.m27554C(textInputLayout.getEditText());
            C5733e.this.m27546K(C);
            C5733e.this.m27521y(C);
            C5733e.this.m27545L(C);
            C.setThreshold(0);
            C.removeTextChangedListener(C5733e.this.f11278e);
            C.addTextChangedListener(C5733e.this.f11278e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C5733e.m27549H(C) && C5733e.this.f11290q.isTouchExplorationEnabled()) {
                C2733w0.m37064A0(C5733e.this.f11312c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C5733e.this.f11280g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.e$h */
    /* loaded from: classes3.dex */
    class C5740h implements TextInputLayout.AbstractC5718g {

        /* renamed from: com.google.android.material.textfield.e$h$a */
        /* loaded from: classes3.dex */
        class RunnableC5741a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ AutoCompleteTextView f11303k;

            RunnableC5741a(AutoCompleteTextView autoCompleteTextView) {
                this.f11303k = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11303k.removeTextChangedListener(C5733e.this.f11278e);
            }
        }

        C5740h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC5718g
        /* renamed from: a */
        public void mo27456a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new RunnableC5741a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C5733e.this.f11279f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (C5733e.f11277t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(C5733e.this.f11283j);
                C5733e.this.m27548I();
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.e$i */
    /* loaded from: classes3.dex */
    class View$OnAttachStateChangeListenerC5742i implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC5742i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C5733e.this.m27555B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C5733e.this.m27548I();
        }
    }

    /* renamed from: com.google.android.material.textfield.e$j */
    /* loaded from: classes3.dex */
    class C5743j implements C2574c.AbstractC2576b {
        C5743j() {
        }

        @Override // androidx.core.view.accessibility.C2574c.AbstractC2576b
        public void onTouchExplorationStateChanged(boolean z) {
            AutoCompleteTextView autoCompleteTextView;
            int i;
            TextInputLayout textInputLayout = C5733e.this.f11310a;
            if (textInputLayout != null && (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) != null && !C5733e.m27549H(autoCompleteTextView)) {
                CheckableImageButton checkableImageButton = C5733e.this.f11312c;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                C2733w0.m37064A0(checkableImageButton, i);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.e$k */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC5744k implements View.OnClickListener {
        View$OnClickListenerC5744k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5733e.this.m27544M((AutoCompleteTextView) C5733e.this.f11310a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$l */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC5745l implements View.OnTouchListener {

        /* renamed from: k */
        final /* synthetic */ AutoCompleteTextView f11308k;

        View$OnTouchListenerC5745l(AutoCompleteTextView autoCompleteTextView) {
            this.f11308k = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C5733e.this.m27550G()) {
                    C5733e.this.f11285l = false;
                }
                C5733e.this.m27544M(this.f11308k);
                C5733e.this.m27543N();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5733e(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* renamed from: A */
    private void m27556A(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C14038g gVar) {
        LayerDrawable layerDrawable;
        int d = C10395a.m13517d(autoCompleteTextView, C6803b.f14539m);
        C14038g gVar2 = new C14038g(gVar.m2001E());
        int h = C10395a.m13513h(i, d, 0.1f);
        gVar2.m1981Y(new ColorStateList(iArr, new int[]{h, 0}));
        if (f11277t) {
            gVar2.setTint(d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h, d});
            C14038g gVar3 = new C14038g(gVar.m2001E());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C2733w0.m36982u0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m27555B() {
        TextInputLayout textInputLayout;
        if (this.f11290q != null && (textInputLayout = this.f11310a) != null && C2733w0.m37030T(textInputLayout)) {
            C2574c.m37321a(this.f11290q, this.f11284k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static AutoCompleteTextView m27554C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: D */
    private ValueAnimator m27553D(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7101a.f15486a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new C5737d());
        return ofFloat;
    }

    /* renamed from: E */
    private C14038g m27552E(float f, float f2, float f3, int i) {
        C14045k m = C14045k.m1935a().m1910A(f).m1906E(f).m1886s(f2).m1882w(f2).m1892m();
        C14038g m2 = C14038g.m1957m(this.f11311b, f3);
        m2.setShapeAppearanceModel(m);
        m2.m1979a0(0, i, 0, i);
        return m2;
    }

    /* renamed from: F */
    private void m27551F() {
        this.f11292s = m27553D(67, 0.0f, 1.0f);
        ValueAnimator D = m27553D(50, 1.0f, 0.0f);
        this.f11291r = D;
        D.addListener(new C5736c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public boolean m27550G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f11287n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static boolean m27549H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public void m27548I() {
        AccessibilityManager accessibilityManager = this.f11290q;
        if (accessibilityManager != null) {
            C2574c.m37320b(accessibilityManager, this.f11284k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m27547J(boolean z) {
        if (this.f11286m != z) {
            this.f11286m = z;
            this.f11292s.cancel();
            this.f11291r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m27546K(AutoCompleteTextView autoCompleteTextView) {
        if (f11277t) {
            int boxBackgroundMode = this.f11310a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f11289p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f11288o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: L */
    public void m27545L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View$OnTouchListenerC5745l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f11279f);
        if (f11277t) {
            autoCompleteTextView.setOnDismissListener(new C5735b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m27544M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m27550G()) {
                this.f11285l = false;
            }
            if (!this.f11285l) {
                if (f11277t) {
                    m27547J(!this.f11286m);
                } else {
                    this.f11286m = !this.f11286m;
                    this.f11312c.toggle();
                }
                if (this.f11286m) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f11285l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m27543N() {
        this.f11285l = true;
        this.f11287n = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m27521y(AutoCompleteTextView autoCompleteTextView) {
        if (!m27549H(autoCompleteTextView)) {
            int boxBackgroundMode = this.f11310a.getBoxBackgroundMode();
            C14038g boxBackground = this.f11310a.getBoxBackground();
            int d = C10395a.m13517d(autoCompleteTextView, C6803b.f14535i);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m27556A(autoCompleteTextView, d, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m27520z(autoCompleteTextView, d, iArr, boxBackground);
            }
        }
    }

    /* renamed from: z */
    private void m27520z(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C14038g gVar) {
        int boxBackgroundColor = this.f11310a.getBoxBackgroundColor();
        int[] iArr2 = {C10395a.m13513h(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f11277t) {
            C2733w0.m36982u0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C14038g gVar2 = new C14038g(gVar.m2001E());
        gVar2.m1981Y(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int G = C2733w0.m37053G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int F = C2733w0.m37055F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C2733w0.m36982u0(autoCompleteTextView, layerDrawable);
        C2733w0.m37054F0(autoCompleteTextView, G, paddingTop, F, paddingBottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m27542O(AutoCompleteTextView autoCompleteTextView) {
        if (!m27549H(autoCompleteTextView) && this.f11310a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            m27521y(autoCompleteTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC5746f
    /* renamed from: a */
    public void mo27462a() {
        float dimensionPixelOffset = this.f11311b.getResources().getDimensionPixelOffset(C6805d.f38009Q);
        float dimensionPixelOffset2 = this.f11311b.getResources().getDimensionPixelOffset(C6805d.f38003K);
        int dimensionPixelOffset3 = this.f11311b.getResources().getDimensionPixelOffset(C6805d.f38004L);
        C14038g E = m27552E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C14038g E2 = m27552E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f11289p = E;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f11288o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, E);
        this.f11288o.addState(new int[0], E2);
        int i = this.f11313d;
        if (i == 0) {
            if (f11277t) {
                i = C6806e.f14588d;
            } else {
                i = C6806e.f14589e;
            }
        }
        this.f11310a.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f11310a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C6810i.f14645g));
        this.f11310a.setEndIconOnClickListener(new View$OnClickListenerC5744k());
        this.f11310a.m27614g(this.f11281h);
        this.f11310a.m27612h(this.f11282i);
        m27551F();
        this.f11290q = (AccessibilityManager) this.f11311b.getSystemService("accessibility");
        this.f11310a.addOnAttachStateChangeListener(this.f11283j);
        m27555B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC5746f
    /* renamed from: b */
    public boolean mo27519b(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC5746f
    /* renamed from: d */
    public boolean mo27517d() {
        return true;
    }
}
