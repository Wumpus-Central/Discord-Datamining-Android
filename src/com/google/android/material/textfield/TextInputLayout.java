package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1683j;
import androidx.appcompat.widget.C1709q0;
import androidx.core.content.C2337a;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.text.C2485a;
import androidx.core.view.C2549a;
import androidx.core.view.C2731w;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C2803l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C3184a0;
import androidx.transition.C3226h;
import com.google.android.material.internal.C5644b;
import com.google.android.material.internal.C5646c;
import com.google.android.material.internal.C5665o;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lb.C10395a;
import p071e.C6525a;
import p083eb.C6803b;
import p083eb.C6804c;
import p083eb.C6805d;
import p083eb.C6807f;
import p083eb.C6810i;
import p083eb.C6811j;
import p102fb.C7101a;
import p125h1.AbstractC7736a;
import p366ub.C13242c;
import p422xb.C14038g;
import p422xb.C14045k;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: S0 */
    private static final int f37563S0 = C6811j.f14662h;

    /* renamed from: A */
    private int f37564A;

    /* renamed from: A0 */
    private ColorStateList f37565A0;

    /* renamed from: B */
    private CharSequence f37566B;

    /* renamed from: B0 */
    private ColorStateList f37567B0;

    /* renamed from: C */
    private boolean f37568C;

    /* renamed from: C0 */
    private int f37569C0;

    /* renamed from: D */
    private TextView f37570D;

    /* renamed from: D0 */
    private int f37571D0;

    /* renamed from: E */
    private ColorStateList f37572E;

    /* renamed from: E0 */
    private int f37573E0;

    /* renamed from: F */
    private int f37574F;

    /* renamed from: F0 */
    private ColorStateList f37575F0;

    /* renamed from: G */
    private C3226h f37576G;

    /* renamed from: G0 */
    private int f37577G0;

    /* renamed from: H */
    private C3226h f37578H;

    /* renamed from: H0 */
    private int f37579H0;

    /* renamed from: I */
    private ColorStateList f37580I;

    /* renamed from: I0 */
    private int f37581I0;

    /* renamed from: J */
    private ColorStateList f37582J;

    /* renamed from: J0 */
    private int f37583J0;

    /* renamed from: K */
    private CharSequence f37584K;

    /* renamed from: K0 */
    private int f37585K0;

    /* renamed from: L */
    private final TextView f37586L;

    /* renamed from: L0 */
    private boolean f37587L0;

    /* renamed from: M */
    private boolean f37588M;

    /* renamed from: M0 */
    final C5644b f37589M0;

    /* renamed from: N */
    private CharSequence f37590N;

    /* renamed from: N0 */
    private boolean f37591N0;

    /* renamed from: O */
    private boolean f37592O;

    /* renamed from: O0 */
    private boolean f37593O0;

    /* renamed from: P */
    private C14038g f37594P;

    /* renamed from: P0 */
    private ValueAnimator f37595P0;

    /* renamed from: Q */
    private C14038g f37596Q;

    /* renamed from: Q0 */
    private boolean f37597Q0;

    /* renamed from: R */
    private C14038g f37598R;

    /* renamed from: R0 */
    private boolean f37599R0;

    /* renamed from: S */
    private C14045k f37600S;

    /* renamed from: T */
    private boolean f37601T;

    /* renamed from: U */
    private final int f37602U;

    /* renamed from: V */
    private int f37603V;

    /* renamed from: W */
    private int f37604W;

    /* renamed from: a0 */
    private int f11208a0;

    /* renamed from: b0 */
    private int f11209b0;

    /* renamed from: c0 */
    private int f11210c0;

    /* renamed from: d0 */
    private int f11211d0;

    /* renamed from: e0 */
    private int f11212e0;

    /* renamed from: f0 */
    private final Rect f11213f0;

    /* renamed from: g0 */
    private final Rect f11214g0;

    /* renamed from: h0 */
    private final RectF f11215h0;

    /* renamed from: i0 */
    private Typeface f11216i0;

    /* renamed from: j0 */
    private Drawable f11217j0;

    /* renamed from: k */
    private final FrameLayout f11218k;

    /* renamed from: k0 */
    private int f11219k0;

    /* renamed from: l */
    private final C5760l f11220l;

    /* renamed from: l0 */
    private final LinkedHashSet<AbstractC5717f> f11221l0;

    /* renamed from: m */
    private final LinearLayout f11222m;

    /* renamed from: m0 */
    private int f11223m0;

    /* renamed from: n */
    private final FrameLayout f11224n;

    /* renamed from: n0 */
    private final SparseArray<AbstractC5746f> f11225n0;

    /* renamed from: o */
    EditText f11226o;

    /* renamed from: o0 */
    private final CheckableImageButton f11227o0;

    /* renamed from: p */
    private CharSequence f11228p;

    /* renamed from: p0 */
    private final LinkedHashSet<AbstractC5718g> f11229p0;

    /* renamed from: q */
    private int f11230q;

    /* renamed from: q0 */
    private ColorStateList f11231q0;

    /* renamed from: r */
    private int f11232r;

    /* renamed from: r0 */
    private PorterDuff.Mode f11233r0;

    /* renamed from: s */
    private int f11234s;

    /* renamed from: s0 */
    private Drawable f11235s0;

    /* renamed from: t */
    private int f11236t;

    /* renamed from: t0 */
    private int f11237t0;

    /* renamed from: u */
    private final C5748h f11238u;

    /* renamed from: u0 */
    private Drawable f11239u0;

    /* renamed from: v */
    boolean f11240v;

    /* renamed from: v0 */
    private View.OnLongClickListener f11241v0;

    /* renamed from: w */
    private int f11242w;

    /* renamed from: w0 */
    private View.OnLongClickListener f11243w0;

    /* renamed from: x */
    private boolean f11244x;

    /* renamed from: x0 */
    private final CheckableImageButton f11245x0;

    /* renamed from: y */
    private TextView f11246y;

    /* renamed from: y0 */
    private ColorStateList f11247y0;

    /* renamed from: z */
    private int f11248z;

    /* renamed from: z0 */
    private PorterDuff.Mode f11249z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes3.dex */
    public class C5712a implements TextWatcher {
        C5712a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m27581w0(!textInputLayout.f37599R0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f11240v) {
                textInputLayout2.m27601m0(editable.length());
            }
            if (TextInputLayout.this.f37568C) {
                TextInputLayout.this.m27656A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes3.dex */
    class RunnableC5713b implements Runnable {
        RunnableC5713b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f11227o0.performClick();
            TextInputLayout.this.f11227o0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes3.dex */
    class RunnableC5714c implements Runnable {
        RunnableC5714c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f11226o.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes3.dex */
    public class C5715d implements ValueAnimator.AnimatorUpdateListener {
        C5715d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f37589M0.m27909d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes3.dex */
    public static class C5716e extends C2549a {

        /* renamed from: a */
        private final TextInputLayout f11254a;

        public C5716e(TextInputLayout textInputLayout) {
            this.f11254a = textInputLayout;
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence;
            boolean z;
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.f11254a.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f11254a.getHint();
            CharSequence error = this.f11254a.getError();
            CharSequence placeholderText = this.f11254a.getPlaceholderText();
            int counterMaxLength = this.f11254a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f11254a.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(charSequence);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f11254a.m27639N();
            boolean z5 = !TextUtils.isEmpty(error);
            if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f11254a.f11220l.m27434v(accessibilityNodeInfoCompat);
            if (z2) {
                accessibilityNodeInfoCompat.m37418D0(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                accessibilityNodeInfoCompat.m37418D0(str);
                if (z4 && placeholderText != null) {
                    accessibilityNodeInfoCompat.m37418D0(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.m37418D0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.m37369k0(str);
                } else {
                    if (z2) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    accessibilityNodeInfoCompat.m37418D0(str);
                }
                accessibilityNodeInfoCompat.m37339z0(!z2);
            }
            if (charSequence == null || charSequence.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.m37361o0(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.m37377g0(error);
            }
            View s = this.f11254a.f11238u.m27475s();
            if (s != null) {
                accessibilityNodeInfoCompat.m37365m0(s);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes3.dex */
    public interface AbstractC5717f {
        /* renamed from: a */
        void mo27457a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes3.dex */
    public interface AbstractC5718g {
        /* renamed from: a */
        void mo27456a(TextInputLayout textInputLayout, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    /* loaded from: classes3.dex */
    public static class C5719h extends AbstractC7736a {
        public static final Parcelable.Creator<C5719h> CREATOR = new C5720a();

        /* renamed from: m */
        CharSequence f11255m;

        /* renamed from: n */
        boolean f11256n;

        /* renamed from: o */
        CharSequence f11257o;

        /* renamed from: p */
        CharSequence f11258p;

        /* renamed from: q */
        CharSequence f11259q;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        /* loaded from: classes3.dex */
        class C5720a implements Parcelable.ClassLoaderCreator<C5719h> {
            C5720a() {
            }

            /* renamed from: a */
            public C5719h createFromParcel(Parcel parcel) {
                return new C5719h(parcel, null);
            }

            /* renamed from: b */
            public C5719h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5719h(parcel, classLoader);
            }

            /* renamed from: c */
            public C5719h[] newArray(int i) {
                return new C5719h[i];
            }
        }

        C5719h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f11255m) + " hint=" + ((Object) this.f11257o) + " helperText=" + ((Object) this.f11258p) + " placeholderText=" + ((Object) this.f11259q) + "}";
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f11255m, parcel, i);
            parcel.writeInt(this.f11256n ? 1 : 0);
            TextUtils.writeToParcel(this.f11257o, parcel, i);
            TextUtils.writeToParcel(this.f11258p, parcel, i);
            TextUtils.writeToParcel(this.f11259q, parcel, i);
        }

        C5719h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11255m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11256n = parcel.readInt() != 1 ? false : true;
            this.f11257o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11258p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11259q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f37990J);
    }

    /* renamed from: A */
    private boolean m27657A() {
        return this.f37588M && !TextUtils.isEmpty(this.f37590N) && (this.f37594P instanceof C5732d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m27656A0(int i) {
        if (i != 0 || this.f37587L0) {
            m27643J();
        } else {
            m27611h0();
        }
    }

    /* renamed from: B */
    private void m27655B() {
        Iterator<AbstractC5717f> it = this.f11221l0.iterator();
        while (it.hasNext()) {
            it.next().mo27457a(this);
        }
    }

    /* renamed from: B0 */
    private void m27654B0(boolean z, boolean z2) {
        int defaultColor = this.f37575F0.getDefaultColor();
        int colorForState = this.f37575F0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f37575F0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f11211d0 = colorForState2;
        } else if (z2) {
            this.f11211d0 = colorForState;
        } else {
            this.f11211d0 = defaultColor;
        }
    }

    /* renamed from: C */
    private void m27653C(int i) {
        Iterator<AbstractC5718g> it = this.f11229p0.iterator();
        while (it.hasNext()) {
            it.next().mo27456a(this, i);
        }
    }

    /* renamed from: C0 */
    private void m27652C0() {
        int i;
        if (this.f11226o != null) {
            if (m27642K() || m27641L()) {
                i = 0;
            } else {
                i = C2733w0.m37055F(this.f11226o);
            }
            C2733w0.m37054F0(this.f37586L, getContext().getResources().getDimensionPixelSize(C6805d.f14580v), this.f11226o.getPaddingTop(), i, this.f11226o.getPaddingBottom());
        }
    }

    /* renamed from: D */
    private void m27651D(Canvas canvas) {
        C14038g gVar;
        if (this.f37598R != null && (gVar = this.f37596Q) != null) {
            gVar.draw(canvas);
            if (this.f11226o.isFocused()) {
                Rect bounds = this.f37598R.getBounds();
                Rect bounds2 = this.f37596Q.getBounds();
                float x = this.f37589M0.m27882x();
                int centerX = bounds2.centerX();
                bounds.left = C7101a.m23397c(centerX, bounds2.left, x);
                bounds.right = C7101a.m23397c(centerX, bounds2.right, x);
                this.f37598R.draw(canvas);
            }
        }
    }

    /* renamed from: D0 */
    private void m27650D0() {
        int i;
        int visibility = this.f37586L.getVisibility();
        boolean z = false;
        if (this.f37584K == null || m27639N()) {
            i = 8;
        } else {
            i = 0;
        }
        if (visibility != i) {
            AbstractC5746f endIconDelegate = getEndIconDelegate();
            if (i == 0) {
                z = true;
            }
            endIconDelegate.mo27518c(z);
        }
        m27587t0();
        this.f37586L.setVisibility(i);
        m27593q0();
    }

    /* renamed from: E */
    private void m27649E(Canvas canvas) {
        if (this.f37588M) {
            this.f37589M0.m27894l(canvas);
        }
    }

    /* renamed from: F */
    private void m27647F(boolean z) {
        ValueAnimator valueAnimator = this.f37595P0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37595P0.cancel();
        }
        if (!z || !this.f37593O0) {
            this.f37589M0.m27909d0(0.0f);
        } else {
            m27606k(0.0f);
        }
        if (m27657A() && ((C5732d) this.f37594P).m27561l0()) {
            m27580x();
        }
        this.f37587L0 = true;
        m27643J();
        this.f11220l.m27447i(true);
        m27650D0();
    }

    /* renamed from: G */
    private int m27646G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f11226o.getCompoundPaddingLeft();
        if (getPrefixText() == null || z) {
            return compoundPaddingLeft;
        }
        return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: H */
    private int m27645H(int i, boolean z) {
        int compoundPaddingRight = i - this.f11226o.getCompoundPaddingRight();
        if (getPrefixText() == null || !z) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* renamed from: I */
    private boolean m27644I() {
        return this.f11223m0 != 0;
    }

    /* renamed from: J */
    private void m27643J() {
        TextView textView = this.f37570D;
        if (textView != null && this.f37568C) {
            textView.setText((CharSequence) null);
            C3184a0.m34980a(this.f11218k, this.f37578H);
            this.f37570D.setVisibility(4);
        }
    }

    /* renamed from: L */
    private boolean m27641L() {
        return this.f11245x0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m27637P() {
        if (this.f37603V != 1 || this.f11226o.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private void m27636Q() {
        m27598o();
        m27627Z();
        m27648E0();
        m27607j0();
        m27608j();
        if (this.f37603V != 0) {
            m27583v0();
        }
    }

    /* renamed from: R */
    private void m27635R() {
        if (m27657A()) {
            RectF rectF = this.f11215h0;
            this.f37589M0.m27891o(rectF, this.f11226o.getWidth(), this.f11226o.getGravity());
            m27600n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f11208a0);
            ((C5732d) this.f37594P).m27558o0(rectF);
        }
    }

    /* renamed from: S */
    private void m27634S() {
        if (m27657A() && !this.f37587L0) {
            m27580x();
            m27635R();
        }
    }

    /* renamed from: T */
    private static void m27633T(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m27633T((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m27629X() {
        TextView textView = this.f37570D;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: Z */
    private void m27627Z() {
        if (m27613g0()) {
            C2733w0.m36982u0(this.f11226o, this.f37594P);
        }
    }

    /* renamed from: a0 */
    private static void m27625a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean P = C2733w0.m37035P(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (P || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(P);
        checkableImageButton.setPressable(P);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C2733w0.m37064A0(checkableImageButton, i);
    }

    /* renamed from: b0 */
    private static void m27623b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m27625a0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: c0 */
    private static void m27621c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m27625a0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: e0 */
    private boolean m27617e0() {
        if ((this.f11245x0.getVisibility() == 0 || ((m27644I() && m27642K()) || this.f37584K != null)) && this.f11222m.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m27615f0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f11220l.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private boolean m27613g0() {
        EditText editText = this.f11226o;
        if (editText == null || this.f37594P == null || editText.getBackground() != null || this.f37603V == 0) {
            return false;
        }
        return true;
    }

    private AbstractC5746f getEndIconDelegate() {
        AbstractC5746f fVar = this.f11225n0.get(this.f11223m0);
        if (fVar != null) {
            return fVar;
        }
        return this.f11225n0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f11245x0.getVisibility() == 0) {
            return this.f11245x0;
        }
        if (!m27644I() || !m27642K()) {
            return null;
        }
        return this.f11227o0;
    }

    /* renamed from: h0 */
    private void m27611h0() {
        if (this.f37570D != null && this.f37568C && !TextUtils.isEmpty(this.f37566B)) {
            this.f37570D.setText(this.f37566B);
            C3184a0.m34980a(this.f11218k, this.f37576G);
            this.f37570D.setVisibility(0);
            this.f37570D.bringToFront();
            announceForAccessibility(this.f37566B);
        }
    }

    /* renamed from: i */
    private void m27610i() {
        TextView textView = this.f37570D;
        if (textView != null) {
            this.f11218k.addView(textView);
            this.f37570D.setVisibility(0);
        }
    }

    /* renamed from: i0 */
    private void m27609i0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            C5747g.m27516a(this, this.f11227o0, this.f11231q0, this.f11233r0);
            return;
        }
        Drawable mutate = C2400a.m37825r(getEndIconDrawable()).mutate();
        C2400a.m37829n(mutate, this.f11238u.m27478p());
        this.f11227o0.setImageDrawable(mutate);
    }

    /* renamed from: j */
    private void m27608j() {
        if (this.f11226o != null && this.f37603V == 1) {
            if (C13242c.m4234h(getContext())) {
                EditText editText = this.f11226o;
                C2733w0.m37054F0(editText, C2733w0.m37053G(editText), getResources().getDimensionPixelSize(C6805d.f14574p), C2733w0.m37055F(this.f11226o), getResources().getDimensionPixelSize(C6805d.f14573o));
            } else if (C13242c.m4235g(getContext())) {
                EditText editText2 = this.f11226o;
                C2733w0.m37054F0(editText2, C2733w0.m37053G(editText2), getResources().getDimensionPixelSize(C6805d.f14572n), C2733w0.m37055F(this.f11226o), getResources().getDimensionPixelSize(C6805d.f14571m));
            }
        }
    }

    /* renamed from: j0 */
    private void m27607j0() {
        if (this.f37603V != 1) {
            return;
        }
        if (C13242c.m4234h(getContext())) {
            this.f37604W = getResources().getDimensionPixelSize(C6805d.f14576r);
        } else if (C13242c.m4235g(getContext())) {
            this.f37604W = getResources().getDimensionPixelSize(C6805d.f14575q);
        }
    }

    /* renamed from: k0 */
    private void m27605k0(Rect rect) {
        C14038g gVar = this.f37596Q;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f11209b0, rect.right, i);
        }
        C14038g gVar2 = this.f37598R;
        if (gVar2 != null) {
            int i2 = rect.bottom;
            gVar2.setBounds(rect.left, i2 - this.f11210c0, rect.right, i2);
        }
    }

    /* renamed from: l */
    private void m27604l() {
        C14038g gVar = this.f37594P;
        if (gVar != null) {
            C14045k E = gVar.m2001E();
            C14045k kVar = this.f37600S;
            if (E != kVar) {
                this.f37594P.setShapeAppearanceModel(kVar);
                m27595p0();
            }
            if (m27584v()) {
                this.f37594P.m1971e0(this.f11208a0, this.f11211d0);
            }
            int p = m27596p();
            this.f11212e0 = p;
            this.f37594P.m1981Y(ColorStateList.valueOf(p));
            if (this.f11223m0 == 3) {
                this.f11226o.getBackground().invalidateSelf();
            }
            m27602m();
            invalidate();
        }
    }

    /* renamed from: l0 */
    private void m27603l0() {
        int i;
        if (this.f11246y != null) {
            EditText editText = this.f11226o;
            if (editText == null) {
                i = 0;
            } else {
                i = editText.getText().length();
            }
            m27601m0(i);
        }
    }

    /* renamed from: m */
    private void m27602m() {
        ColorStateList colorStateList;
        if (this.f37596Q != null && this.f37598R != null) {
            if (m27582w()) {
                C14038g gVar = this.f37596Q;
                if (this.f11226o.isFocused()) {
                    colorStateList = ColorStateList.valueOf(this.f37569C0);
                } else {
                    colorStateList = ColorStateList.valueOf(this.f11211d0);
                }
                gVar.m1981Y(colorStateList);
                this.f37598R.m1981Y(ColorStateList.valueOf(this.f11211d0));
            }
            invalidate();
        }
    }

    /* renamed from: n */
    private void m27600n(RectF rectF) {
        float f = rectF.left;
        int i = this.f37602U;
        rectF.left = f - i;
        rectF.right += i;
    }

    /* renamed from: n0 */
    private static void m27599n0(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = C6810i.f14641c;
        } else {
            i3 = C6810i.f14640b;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: o */
    private void m27598o() {
        int i = this.f37603V;
        if (i == 0) {
            this.f37594P = null;
            this.f37596Q = null;
            this.f37598R = null;
        } else if (i == 1) {
            this.f37594P = new C14038g(this.f37600S);
            this.f37596Q = new C14038g();
            this.f37598R = new C14038g();
        } else if (i == 2) {
            if (!this.f37588M || (this.f37594P instanceof C5732d)) {
                this.f37594P = new C14038g(this.f37600S);
            } else {
                this.f37594P = new C5732d(this.f37600S);
            }
            this.f37596Q = null;
            this.f37598R = null;
        } else {
            throw new IllegalArgumentException(this.f37603V + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: o0 */
    private void m27597o0() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f11246y;
        if (textView != null) {
            if (this.f11244x) {
                i = this.f11248z;
            } else {
                i = this.f37564A;
            }
            m27619d0(textView, i);
            if (!this.f11244x && (colorStateList2 = this.f37580I) != null) {
                this.f11246y.setTextColor(colorStateList2);
            }
            if (this.f11244x && (colorStateList = this.f37582J) != null) {
                this.f11246y.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: p */
    private int m27596p() {
        int i = this.f11212e0;
        if (this.f37603V == 1) {
            return C10395a.m13514g(C10395a.m13516e(this, C6803b.f14539m, 0), this.f11212e0);
        }
        return i;
    }

    /* renamed from: p0 */
    private void m27595p0() {
        if (this.f11223m0 == 3 && this.f37603V == 2) {
            ((C5733e) this.f11225n0.get(3)).m27542O((AutoCompleteTextView) this.f11226o);
        }
    }

    /* renamed from: q */
    private Rect m27594q(Rect rect) {
        if (this.f11226o != null) {
            Rect rect2 = this.f11214g0;
            boolean e = C5665o.m27826e(this);
            rect2.bottom = rect.bottom;
            int i = this.f37603V;
            if (i == 1) {
                rect2.left = m27646G(rect.left, e);
                rect2.top = rect.top + this.f37604W;
                rect2.right = m27645H(rect.right, e);
                return rect2;
            } else if (i != 2) {
                rect2.left = m27646G(rect.left, e);
                rect2.top = getPaddingTop();
                rect2.right = m27645H(rect.right, e);
                return rect2;
            } else {
                rect2.left = rect.left + this.f11226o.getPaddingLeft();
                rect2.top = rect.top - m27586u();
                rect2.right = rect.right - this.f11226o.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    private int m27592r(Rect rect, Rect rect2, float f) {
        if (m27637P()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.f11226o.getCompoundPaddingBottom();
    }

    /* renamed from: s */
    private int m27590s(Rect rect, float f) {
        if (m27637P()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.f11226o.getCompoundPaddingTop();
    }

    /* renamed from: s0 */
    private boolean m27589s0() {
        int max;
        if (this.f11226o == null || this.f11226o.getMeasuredHeight() >= (max = Math.max(this.f11222m.getMeasuredHeight(), this.f11220l.getMeasuredHeight()))) {
            return false;
        }
        this.f11226o.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f11226o == null) {
            if (this.f11223m0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f11226o = editText;
            int i = this.f11230q;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f11234s);
            }
            int i2 = this.f11232r;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f11236t);
            }
            m27636Q();
            setTextInputAccessibilityDelegate(new C5716e(this));
            this.f37589M0.m27897j0(this.f11226o.getTypeface());
            this.f37589M0.m27913b0(this.f11226o.getTextSize());
            this.f37589M0.m27919X(this.f11226o.getLetterSpacing());
            int gravity = this.f11226o.getGravity();
            this.f37589M0.m27924S((gravity & (-113)) | 48);
            this.f37589M0.m27915a0(gravity);
            this.f11226o.addTextChangedListener(new C5712a());
            if (this.f37565A0 == null) {
                this.f37565A0 = this.f11226o.getHintTextColors();
            }
            if (this.f37588M) {
                if (TextUtils.isEmpty(this.f37590N)) {
                    CharSequence hint = this.f11226o.getHint();
                    this.f11228p = hint;
                    setHint(hint);
                    this.f11226o.setHint((CharSequence) null);
                }
                this.f37592O = true;
            }
            if (this.f11246y != null) {
                m27601m0(this.f11226o.getText().length());
            }
            m27591r0();
            this.f11238u.m27488f();
            this.f11220l.bringToFront();
            this.f11222m.bringToFront();
            this.f11224n.bringToFront();
            this.f11245x0.bringToFront();
            m27655B();
            m27652C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m27579x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f37590N)) {
            this.f37590N = charSequence;
            this.f37589M0.m27901h0(charSequence);
            if (!this.f37587L0) {
                m27635R();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f37568C != z) {
            if (z) {
                m27610i();
            } else {
                m27629X();
                this.f37570D = null;
            }
            this.f37568C = z;
        }
    }

    /* renamed from: t */
    private Rect m27588t(Rect rect) {
        if (this.f11226o != null) {
            Rect rect2 = this.f11214g0;
            float w = this.f37589M0.m27883w();
            rect2.left = rect.left + this.f11226o.getCompoundPaddingLeft();
            rect2.top = m27590s(rect, w);
            rect2.right = rect.right - this.f11226o.getCompoundPaddingRight();
            rect2.bottom = m27592r(rect, rect2, w);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t0 */
    private void m27587t0() {
        int i;
        boolean z;
        boolean z2;
        FrameLayout frameLayout = this.f11224n;
        int i2 = 8;
        if (this.f11227o0.getVisibility() != 0 || m27641L()) {
            i = 8;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
        if (this.f37584K == null || m27639N()) {
            z = true;
        } else {
            z = false;
        }
        if (m27642K() || m27641L() || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        LinearLayout linearLayout = this.f11222m;
        if (z2) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
    }

    /* renamed from: u */
    private int m27586u() {
        float q;
        if (!this.f37588M) {
            return 0;
        }
        int i = this.f37603V;
        if (i == 0) {
            q = this.f37589M0.m27889q();
        } else if (i != 2) {
            return 0;
        } else {
            q = this.f37589M0.m27889q() / 2.0f;
        }
        return (int) q;
    }

    /* renamed from: u0 */
    private void m27585u0() {
        boolean z;
        int i = 0;
        if (getErrorIconDrawable() == null || !this.f11238u.m27468z() || !this.f11238u.m27482l()) {
            z = false;
        } else {
            z = true;
        }
        CheckableImageButton checkableImageButton = this.f11245x0;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m27587t0();
        m27652C0();
        if (!m27644I()) {
            m27593q0();
        }
    }

    /* renamed from: v */
    private boolean m27584v() {
        return this.f37603V == 2 && m27582w();
    }

    /* renamed from: v0 */
    private void m27583v0() {
        if (this.f37603V != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11218k.getLayoutParams();
            int u = m27586u();
            if (u != layoutParams.topMargin) {
                layoutParams.topMargin = u;
                this.f11218k.requestLayout();
            }
        }
    }

    /* renamed from: w */
    private boolean m27582w() {
        return this.f11208a0 > -1 && this.f11211d0 != 0;
    }

    /* renamed from: x */
    private void m27580x() {
        if (m27657A()) {
            ((C5732d) this.f37594P).m27560m0();
        }
    }

    /* renamed from: x0 */
    private void m27579x0(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f11226o;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        EditText editText2 = this.f11226o;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean l = this.f11238u.m27482l();
        ColorStateList colorStateList2 = this.f37565A0;
        if (colorStateList2 != null) {
            this.f37589M0.m27925R(colorStateList2);
            this.f37589M0.m27917Z(this.f37565A0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f37565A0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f37585K0);
            } else {
                i = this.f37585K0;
            }
            this.f37589M0.m27925R(ColorStateList.valueOf(i));
            this.f37589M0.m27917Z(ColorStateList.valueOf(i));
        } else if (l) {
            this.f37589M0.m27925R(this.f11238u.m27477q());
        } else if (this.f11244x && (textView = this.f11246y) != null) {
            this.f37589M0.m27925R(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f37567B0) != null) {
            this.f37589M0.m27925R(colorStateList);
        }
        if (z3 || !this.f37591N0 || (isEnabled() && z4)) {
            if (z2 || this.f37587L0) {
                m27578y(z);
            }
        } else if (z2 || !this.f37587L0) {
            m27647F(z);
        }
    }

    /* renamed from: y */
    private void m27578y(boolean z) {
        ValueAnimator valueAnimator = this.f37595P0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37595P0.cancel();
        }
        if (!z || !this.f37593O0) {
            this.f37589M0.m27909d0(1.0f);
        } else {
            m27606k(1.0f);
        }
        this.f37587L0 = false;
        if (m27657A()) {
            m27635R();
        }
        m27575z0();
        this.f11220l.m27447i(false);
        m27650D0();
    }

    /* renamed from: y0 */
    private void m27577y0() {
        EditText editText;
        if (this.f37570D != null && (editText = this.f11226o) != null) {
            this.f37570D.setGravity(editText.getGravity());
            this.f37570D.setPadding(this.f11226o.getCompoundPaddingLeft(), this.f11226o.getCompoundPaddingTop(), this.f11226o.getCompoundPaddingRight(), this.f11226o.getCompoundPaddingBottom());
        }
    }

    /* renamed from: z */
    private C3226h m27576z() {
        C3226h hVar = new C3226h();
        hVar.setDuration(87L);
        hVar.setInterpolator(C7101a.f15486a);
        return hVar;
    }

    /* renamed from: z0 */
    private void m27575z0() {
        EditText editText = this.f11226o;
        m27656A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m27648E0() {
        boolean z;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f37594P != null && this.f37603V != 0) {
            boolean z2 = false;
            if (isFocused() || ((editText2 = this.f11226o) != null && editText2.hasFocus())) {
                z = true;
            } else {
                z = false;
            }
            if (isHovered() || ((editText = this.f11226o) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.f11211d0 = this.f37585K0;
            } else if (this.f11238u.m27482l()) {
                if (this.f37575F0 != null) {
                    m27654B0(z, z2);
                } else {
                    this.f11211d0 = this.f11238u.m27478p();
                }
            } else if (!this.f11244x || (textView = this.f11246y) == null) {
                if (z) {
                    this.f11211d0 = this.f37573E0;
                } else if (z2) {
                    this.f11211d0 = this.f37571D0;
                } else {
                    this.f11211d0 = this.f37569C0;
                }
            } else if (this.f37575F0 != null) {
                m27654B0(z, z2);
            } else {
                this.f11211d0 = textView.getCurrentTextColor();
            }
            m27585u0();
            m27631V();
            m27630W();
            m27632U();
            if (getEndIconDelegate().mo27517d()) {
                m27609i0(this.f11238u.m27482l());
            }
            if (this.f37603V == 2) {
                int i = this.f11208a0;
                if (!z || !isEnabled()) {
                    this.f11208a0 = this.f11209b0;
                } else {
                    this.f11208a0 = this.f11210c0;
                }
                if (this.f11208a0 != i) {
                    m27634S();
                }
            }
            if (this.f37603V == 1) {
                if (!isEnabled()) {
                    this.f11212e0 = this.f37579H0;
                } else if (z2 && !z) {
                    this.f11212e0 = this.f37583J0;
                } else if (z) {
                    this.f11212e0 = this.f37581I0;
                } else {
                    this.f11212e0 = this.f37577G0;
                }
            }
            m27604l();
        }
    }

    /* renamed from: K */
    public boolean m27642K() {
        return this.f11224n.getVisibility() == 0 && this.f11227o0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean m27640M() {
        return this.f11238u.m27510A();
    }

    /* renamed from: N */
    final boolean m27639N() {
        return this.f37587L0;
    }

    /* renamed from: O */
    public boolean m27638O() {
        return this.f37592O;
    }

    /* renamed from: U */
    public void m27632U() {
        C5747g.m27514c(this, this.f11227o0, this.f11231q0);
    }

    /* renamed from: V */
    public void m27631V() {
        C5747g.m27514c(this, this.f11245x0, this.f11247y0);
    }

    /* renamed from: W */
    public void m27630W() {
        this.f11220l.m27446j();
    }

    /* renamed from: Y */
    public void m27628Y(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        boolean e = C5665o.m27826e(this);
        this.f37601T = e;
        if (e) {
            f5 = f2;
        } else {
            f5 = f;
        }
        if (!e) {
            f = f2;
        }
        if (e) {
            f6 = f4;
        } else {
            f6 = f3;
        }
        if (!e) {
            f3 = f4;
        }
        C14038g gVar = this.f37594P;
        if (gVar == null || gVar.m1998H() != f5 || this.f37594P.m1997I() != f || this.f37594P.m1951s() != f6 || this.f37594P.m1950t() != f3) {
            this.f37600S = this.f37600S.m1914v().m1910A(f5).m1906E(f).m1886s(f6).m1882w(f3).m1892m();
            m27604l();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f11218k.addView(view, layoutParams2);
            this.f11218k.setLayoutParams(layoutParams);
            m27583v0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m27619d0(TextView textView, int i) {
        boolean z = true;
        try {
            C2803l.m36674n(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C2803l.m36674n(textView, C6811j.f14656b);
            textView.setTextColor(C2337a.m38135c(getContext(), C6804c.f14553a));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f11226o;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f11228p != null) {
            boolean z = this.f37592O;
            this.f37592O = false;
            CharSequence hint = editText.getHint();
            this.f11226o.setHint(this.f11228p);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f11226o.setHint(hint);
                this.f37592O = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f11218k.getChildCount());
            for (int i2 = 0; i2 < this.f11218k.getChildCount(); i2++) {
                View childAt = this.f11218k.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f11226o) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f37599R0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f37599R0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m27649E(canvas);
        m27651D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z;
        if (!this.f37597Q0) {
            boolean z2 = true;
            this.f37597Q0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C5644b bVar = this.f37589M0;
            if (bVar != null) {
                z = bVar.m27903g0(drawableState) | false;
            } else {
                z = false;
            }
            if (this.f11226o != null) {
                if (!C2733w0.m37029U(this) || !isEnabled()) {
                    z2 = false;
                }
                m27581w0(z2);
            }
            m27591r0();
            m27648E0();
            if (z) {
                invalidate();
            }
            this.f37597Q0 = false;
        }
    }

    /* renamed from: g */
    public void m27614g(AbstractC5717f fVar) {
        this.f11221l0.add(fVar);
        if (this.f11226o != null) {
            fVar.mo27457a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f11226o;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m27586u();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14038g getBoxBackground() {
        int i = this.f37603V;
        if (i == 1 || i == 2) {
            return this.f37594P;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f11212e0;
    }

    public int getBoxBackgroundMode() {
        return this.f37603V;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f37604W;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C5665o.m27826e(this)) {
            return this.f37600S.m1926j().mo1937a(this.f11215h0);
        }
        return this.f37600S.m1924l().mo1937a(this.f11215h0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C5665o.m27826e(this)) {
            return this.f37600S.m1924l().mo1937a(this.f11215h0);
        }
        return this.f37600S.m1926j().mo1937a(this.f11215h0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C5665o.m27826e(this)) {
            return this.f37600S.m1918r().mo1937a(this.f11215h0);
        }
        return this.f37600S.m1916t().mo1937a(this.f11215h0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C5665o.m27826e(this)) {
            return this.f37600S.m1916t().mo1937a(this.f11215h0);
        }
        return this.f37600S.m1918r().mo1937a(this.f11215h0);
    }

    public int getBoxStrokeColor() {
        return this.f37573E0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f37575F0;
    }

    public int getBoxStrokeWidth() {
        return this.f11209b0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f11210c0;
    }

    public int getCounterMaxLength() {
        return this.f11242w;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f11240v || !this.f11244x || (textView = this.f11246y) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f37580I;
    }

    public ColorStateList getCounterTextColor() {
        return this.f37580I;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f37565A0;
    }

    public EditText getEditText() {
        return this.f11226o;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f11227o0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f11227o0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f11223m0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f11227o0;
    }

    public CharSequence getError() {
        if (this.f11238u.m27468z()) {
            return this.f11238u.m27479o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f11238u.m27480n();
    }

    public int getErrorCurrentTextColors() {
        return this.f11238u.m27478p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f11245x0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f11238u.m27478p();
    }

    public CharSequence getHelperText() {
        if (this.f11238u.m27510A()) {
            return this.f11238u.m27476r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f11238u.m27474t();
    }

    public CharSequence getHint() {
        if (this.f37588M) {
            return this.f37590N;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f37589M0.m27889q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f37589M0.m27886t();
    }

    public ColorStateList getHintTextColor() {
        return this.f37567B0;
    }

    public int getMaxEms() {
        return this.f11232r;
    }

    public int getMaxWidth() {
        return this.f11236t;
    }

    public int getMinEms() {
        return this.f11230q;
    }

    public int getMinWidth() {
        return this.f11234s;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f11227o0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f11227o0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f37568C) {
            return this.f37566B;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f37574F;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f37572E;
    }

    public CharSequence getPrefixText() {
        return this.f11220l.m27455a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f11220l.m27454b();
    }

    public TextView getPrefixTextView() {
        return this.f11220l.m27453c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f11220l.m27452d();
    }

    public Drawable getStartIconDrawable() {
        return this.f11220l.m27451e();
    }

    public CharSequence getSuffixText() {
        return this.f37584K;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f37586L.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f37586L;
    }

    public Typeface getTypeface() {
        return this.f11216i0;
    }

    /* renamed from: h */
    public void m27612h(AbstractC5718g gVar) {
        this.f11229p0.add(gVar);
    }

    /* renamed from: k */
    void m27606k(float f) {
        if (this.f37589M0.m27882x() != f) {
            if (this.f37595P0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f37595P0 = valueAnimator;
                valueAnimator.setInterpolator(C7101a.f15487b);
                this.f37595P0.setDuration(167L);
                this.f37595P0.addUpdateListener(new C5715d());
            }
            this.f37595P0.setFloatValues(this.f37589M0.m27882x(), f);
            this.f37595P0.start();
        }
    }

    /* renamed from: m0 */
    void m27601m0(int i) {
        boolean z;
        boolean z2 = this.f11244x;
        int i2 = this.f11242w;
        if (i2 == -1) {
            this.f11246y.setText(String.valueOf(i));
            this.f11246y.setContentDescription(null);
            this.f11244x = false;
        } else {
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            this.f11244x = z;
            m27599n0(getContext(), this.f11246y, i, this.f11242w, this.f11244x);
            if (z2 != this.f11244x) {
                m27597o0();
            }
            this.f11246y.setText(C2485a.m37650c().m37643j(getContext().getString(C6810i.f14642d, Integer.valueOf(i), Integer.valueOf(this.f11242w))));
        }
        if (this.f11226o != null && z2 != this.f11244x) {
            m27581w0(false);
            m27648E0();
            m27591r0();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f37589M0.m27935H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f11226o;
        if (editText != null) {
            Rect rect = this.f11213f0;
            C5646c.m27879a(this, editText, rect);
            m27605k0(rect);
            if (this.f37588M) {
                this.f37589M0.m27913b0(this.f11226o.getTextSize());
                int gravity = this.f11226o.getGravity();
                this.f37589M0.m27924S((gravity & (-113)) | 48);
                this.f37589M0.m27915a0(gravity);
                this.f37589M0.m27928O(m27594q(rect));
                this.f37589M0.m27920W(m27588t(rect));
                this.f37589M0.m27932K();
                if (m27657A() && !this.f37587L0) {
                    m27635R();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean s0 = m27589s0();
        boolean q0 = m27593q0();
        if (s0 || q0) {
            this.f11226o.post(new RunnableC5714c());
        }
        m27577y0();
        m27652C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5719h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5719h hVar = (C5719h) parcelable;
        super.onRestoreInstanceState(hVar.m21547a());
        setError(hVar.f11255m);
        if (hVar.f11256n) {
            this.f11227o0.post(new RunnableC5713b());
        }
        setHint(hVar.f11257o);
        setHelperText(hVar.f11258p);
        setPlaceholderText(hVar.f11259q);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        boolean z;
        float f;
        float f2;
        super.onRtlPropertiesChanged(i);
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f37601T;
        if (z != z3) {
            if (z && !z3) {
                z2 = true;
            }
            float a = this.f37600S.m1918r().mo1937a(this.f11215h0);
            float a2 = this.f37600S.m1916t().mo1937a(this.f11215h0);
            float a3 = this.f37600S.m1926j().mo1937a(this.f11215h0);
            float a4 = this.f37600S.m1924l().mo1937a(this.f11215h0);
            if (z2) {
                f = a;
            } else {
                f = a2;
            }
            if (z2) {
                a = a2;
            }
            if (z2) {
                f2 = a3;
            } else {
                f2 = a4;
            }
            if (z2) {
                a3 = a4;
            }
            m27628Y(f, a, f2, a3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C5719h hVar = new C5719h(super.onSaveInstanceState());
        if (this.f11238u.m27482l()) {
            hVar.f11255m = getError();
        }
        if (!m27644I() || !this.f11227o0.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        hVar.f11256n = z;
        hVar.f11257o = getHint();
        hVar.f11258p = getHelperText();
        hVar.f11259q = getPlaceholderText();
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean m27593q0() {
        boolean z;
        if (this.f11226o == null) {
            return false;
        }
        boolean z2 = true;
        if (m27615f0()) {
            int measuredWidth = this.f11220l.getMeasuredWidth() - this.f11226o.getPaddingLeft();
            if (this.f11217j0 == null || this.f11219k0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f11217j0 = colorDrawable;
                this.f11219k0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a = C2803l.m36687a(this.f11226o);
            Drawable drawable = a[0];
            Drawable drawable2 = this.f11217j0;
            if (drawable != drawable2) {
                C2803l.m36679i(this.f11226o, drawable2, a[1], a[2], a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f11217j0 != null) {
                Drawable[] a2 = C2803l.m36687a(this.f11226o);
                C2803l.m36679i(this.f11226o, null, a2[1], a2[2], a2[3]);
                this.f11217j0 = null;
                z = true;
            }
            z = false;
        }
        if (m27617e0()) {
            int measuredWidth2 = this.f37586L.getMeasuredWidth() - this.f11226o.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + C2731w.m37076b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a3 = C2803l.m36687a(this.f11226o);
            Drawable drawable3 = this.f11235s0;
            if (drawable3 == null || this.f11237t0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f11235s0 = colorDrawable2;
                    this.f11237t0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a3[2];
                Drawable drawable5 = this.f11235s0;
                if (drawable4 != drawable5) {
                    this.f11239u0 = drawable4;
                    C2803l.m36679i(this.f11226o, a3[0], a3[1], drawable5, a3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f11237t0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C2803l.m36679i(this.f11226o, a3[0], a3[1], this.f11235s0, a3[3]);
            }
        } else if (this.f11235s0 == null) {
            return z;
        } else {
            Drawable[] a4 = C2803l.m36687a(this.f11226o);
            if (a4[2] == this.f11235s0) {
                C2803l.m36679i(this.f11226o, a4[0], a4[1], this.f11239u0, a4[3]);
            } else {
                z2 = z;
            }
            this.f11235s0 = null;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void m27591r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f11226o;
        if (editText != null && this.f37603V == 0 && (background = editText.getBackground()) != null) {
            if (C1709q0.m40058a(background)) {
                background = background.mutate();
            }
            if (this.f11238u.m27482l()) {
                background.setColorFilter(C1683j.m40159e(this.f11238u.m27478p(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f11244x || (textView = this.f11246y) == null) {
                C2400a.m37840c(background);
                this.f11226o.refreshDrawableState();
            } else {
                background.setColorFilter(C1683j.m40159e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f11212e0 != i) {
            this.f11212e0 = i;
            this.f37577G0 = i;
            this.f37581I0 = i;
            this.f37583J0 = i;
            m27604l();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C2337a.m38135c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f37577G0 = defaultColor;
        this.f11212e0 = defaultColor;
        this.f37579H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f37581I0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f37583J0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m27604l();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f37603V) {
            this.f37603V = i;
            if (this.f11226o != null) {
                m27636Q();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f37604W = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f37573E0 != i) {
            this.f37573E0 = i;
            m27648E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f37569C0 = colorStateList.getDefaultColor();
            this.f37585K0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f37571D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f37573E0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f37573E0 != colorStateList.getDefaultColor()) {
            this.f37573E0 = colorStateList.getDefaultColor();
        }
        m27648E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f37575F0 != colorStateList) {
            this.f37575F0 = colorStateList;
            m27648E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f11209b0 = i;
        m27648E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f11210c0 = i;
        m27648E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f11240v != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f11246y = appCompatTextView;
                appCompatTextView.setId(C6807f.f38025K);
                Typeface typeface = this.f11216i0;
                if (typeface != null) {
                    this.f11246y.setTypeface(typeface);
                }
                this.f11246y.setMaxLines(1);
                this.f11238u.m27489e(this.f11246y, 2);
                C2731w.m37074d((ViewGroup.MarginLayoutParams) this.f11246y.getLayoutParams(), getResources().getDimensionPixelOffset(C6805d.f38014V));
                m27597o0();
                m27603l0();
            } else {
                this.f11238u.m27509B(this.f11246y, 2);
                this.f11246y = null;
            }
            this.f11240v = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f11242w != i) {
            if (i > 0) {
                this.f11242w = i;
            } else {
                this.f11242w = -1;
            }
            if (this.f11240v) {
                m27603l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f11248z != i) {
            this.f11248z = i;
            m27597o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f37582J != colorStateList) {
            this.f37582J = colorStateList;
            m27597o0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f37564A != i) {
            this.f37564A = i;
            m27597o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f37580I != colorStateList) {
            this.f37580I = colorStateList;
            m27597o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f37565A0 = colorStateList;
        this.f37567B0 = colorStateList;
        if (this.f11226o != null) {
            m27581w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m27633T(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f11227o0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f11227o0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C6525a.m25364b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.f11223m0;
        if (i2 != i) {
            this.f11223m0 = i;
            m27653C(i2);
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            setEndIconVisible(z);
            if (getEndIconDelegate().mo27519b(this.f37603V)) {
                getEndIconDelegate().mo27462a();
                C5747g.m27516a(this, this.f11227o0, this.f11231q0, this.f11233r0);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f37603V + " is not supported by the end icon mode " + i);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m27623b0(this.f11227o0, onClickListener, this.f11241v0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11241v0 = onLongClickListener;
        m27621c0(this.f11227o0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f11231q0 != colorStateList) {
            this.f11231q0 = colorStateList;
            C5747g.m27516a(this, this.f11227o0, colorStateList, this.f11233r0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f11233r0 != mode) {
            this.f11233r0 = mode;
            C5747g.m27516a(this, this.f11227o0, this.f11231q0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (m27642K() != z) {
            CheckableImageButton checkableImageButton = this.f11227o0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m27587t0();
            m27652C0();
            m27593q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f11238u.m27468z()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f11238u.m27496O(charSequence);
        } else {
            this.f11238u.m27472v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f11238u.m27507D(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f11238u.m27506E(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C6525a.m25364b(getContext(), i) : null);
        m27631V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m27623b0(this.f11245x0, onClickListener, this.f11243w0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11243w0 = onLongClickListener;
        m27621c0(this.f11245x0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f11247y0 != colorStateList) {
            this.f11247y0 = colorStateList;
            C5747g.m27516a(this, this.f11245x0, colorStateList, this.f11249z0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f11249z0 != mode) {
            this.f11249z0 = mode;
            C5747g.m27516a(this, this.f11245x0, this.f11247y0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f11238u.m27505F(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f11238u.m27504G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f37591N0 != z) {
            this.f37591N0 = z;
            m27581w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!m27640M()) {
                setHelperTextEnabled(true);
            }
            this.f11238u.m27495P(charSequence);
        } else if (m27640M()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f11238u.m27501J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f11238u.m27502I(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f11238u.m27503H(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f37588M) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f37593O0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f37588M) {
            this.f37588M = z;
            if (!z) {
                this.f37592O = false;
                if (!TextUtils.isEmpty(this.f37590N) && TextUtils.isEmpty(this.f11226o.getHint())) {
                    this.f11226o.setHint(this.f37590N);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f11226o.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f37590N)) {
                        setHint(hint);
                    }
                    this.f11226o.setHint((CharSequence) null);
                }
                this.f37592O = true;
            }
            if (this.f11226o != null) {
                m27583v0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f37589M0.m27927P(i);
        this.f37567B0 = this.f37589M0.m27890p();
        if (this.f11226o != null) {
            m27581w0(false);
            m27583v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f37567B0 != colorStateList) {
            if (this.f37565A0 == null) {
                this.f37589M0.m27925R(colorStateList);
            }
            this.f37567B0 = colorStateList;
            if (this.f11226o != null) {
                m27581w0(false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f11232r = i;
        EditText editText = this.f11226o;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.f11236t = i;
        EditText editText = this.f11226o;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f11230q = i;
        EditText editText = this.f11226o;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.f11234s = i;
        EditText editText = this.f11226o;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C6525a.m25364b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f11223m0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f11231q0 = colorStateList;
        C5747g.m27516a(this, this.f11227o0, colorStateList, this.f11233r0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f11233r0 = mode;
        C5747g.m27516a(this, this.f11227o0, this.f11231q0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f37570D == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f37570D = appCompatTextView;
            appCompatTextView.setId(C6807f.f38028N);
            C2733w0.m37064A0(this.f37570D, 2);
            C3226h z = m27576z();
            this.f37576G = z;
            z.setStartDelay(67L);
            this.f37578H = m27576z();
            setPlaceholderTextAppearance(this.f37574F);
            setPlaceholderTextColor(this.f37572E);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f37568C) {
                setPlaceholderTextEnabled(true);
            }
            this.f37566B = charSequence;
        }
        m27575z0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f37574F = i;
        TextView textView = this.f37570D;
        if (textView != null) {
            C2803l.m36674n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f37572E != colorStateList) {
            this.f37572E = colorStateList;
            TextView textView = this.f37570D;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f11220l.m27445k(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f11220l.m27444l(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f11220l.m27443m(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f11220l.m27442n(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C6525a.m25364b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f11220l.m27439q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11220l.m27438r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f11220l.m27437s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f11220l.m27436t(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f11220l.m27435u(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f37584K = charSequence2;
        this.f37586L.setText(charSequence);
        m27650D0();
    }

    public void setSuffixTextAppearance(int i) {
        C2803l.m36674n(this.f37586L, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f37586L.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C5716e eVar) {
        EditText editText = this.f11226o;
        if (editText != null) {
            C2733w0.m36990q0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f11216i0) {
            this.f11216i0 = typeface;
            this.f37589M0.m27897j0(typeface);
            this.f11238u.m27499L(typeface);
            TextView textView = this.f11246y;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void m27581w0(boolean z) {
        m27579x0(z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f11227o0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f11227o0.setImageDrawable(drawable);
        if (drawable != null) {
            C5747g.m27516a(this, this.f11227o0, this.f11231q0, this.f11233r0);
            m27632U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f11220l.m27441o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f11220l.m27440p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f11245x0.setImageDrawable(drawable);
        m27585u0();
        C5747g.m27516a(this, this.f11245x0, this.f11247y0, this.f11249z0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f11227o0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f11227o0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
