package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2733w0;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6807f;
import p083eb.C6811j;
import p083eb.C6812k;
import p366ub.C13242c;
import p385vb.C13488b;
import p422xb.C14035d;
import p422xb.C14036e;
import p422xb.C14038g;
import p422xb.C14044j;
import p422xb.C14045k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.card.a */
/* loaded from: classes3.dex */
public class C5553a {

    /* renamed from: u */
    private static final double f10683u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: v */
    private static final Drawable f10684v;

    /* renamed from: a */
    private final MaterialCardView f10685a;

    /* renamed from: c */
    private final C14038g f10687c;

    /* renamed from: d */
    private final C14038g f10688d;

    /* renamed from: e */
    private int f10689e;

    /* renamed from: f */
    private int f10690f;

    /* renamed from: g */
    private int f10691g;

    /* renamed from: h */
    private int f10692h;

    /* renamed from: i */
    private Drawable f10693i;

    /* renamed from: j */
    private Drawable f10694j;

    /* renamed from: k */
    private ColorStateList f10695k;

    /* renamed from: l */
    private ColorStateList f10696l;

    /* renamed from: m */
    private C14045k f10697m;

    /* renamed from: n */
    private ColorStateList f10698n;

    /* renamed from: o */
    private Drawable f10699o;

    /* renamed from: p */
    private LayerDrawable f10700p;

    /* renamed from: q */
    private C14038g f10701q;

    /* renamed from: r */
    private C14038g f10702r;

    /* renamed from: t */
    private boolean f10704t;

    /* renamed from: b */
    private final Rect f10686b = new Rect();

    /* renamed from: s */
    private boolean f10703s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.card.a$a */
    /* loaded from: classes3.dex */
    public class C0153a extends InsetDrawable {
        C0153a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f10684v = colorDrawable;
    }

    public C5553a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f10685a = materialCardView;
        C14038g gVar = new C14038g(materialCardView.getContext(), attributeSet, i, i2);
        this.f10687c = gVar;
        gVar.m1991O(materialCardView.getContext());
        gVar.m1973d0(-12303292);
        C14045k.C14047b v = gVar.m2001E().m1914v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C6812k.f14774m0, i, C6811j.f14655a);
        int i3 = C6812k.f14782n0;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.m1890o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f10688d = new C14038g();
        m28460V(v.m1892m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    private Drawable m28480B(Drawable drawable) {
        int i;
        int i2;
        if (this.f10685a.getUseCompatPadding()) {
            i = (int) Math.ceil(m28449d());
            i2 = (int) Math.ceil(m28451c());
        } else {
            i2 = 0;
            i = 0;
        }
        return new C0153a(drawable, i2, i, i2, i);
    }

    /* renamed from: E */
    private boolean m28477E() {
        return (this.f10691g & 80) == 80;
    }

    /* renamed from: F */
    private boolean m28476F() {
        return (this.f10691g & 8388613) == 8388613;
    }

    /* renamed from: Z */
    private boolean m28456Z() {
        return this.f10685a.getPreventCornerOverlap() && !m28447e();
    }

    /* renamed from: a */
    private float m28455a() {
        return Math.max(Math.max(m28453b(this.f10697m.m1919q(), this.f10687c.m1998H()), m28453b(this.f10697m.m1917s(), this.f10687c.m1997I())), Math.max(m28453b(this.f10697m.m1925k(), this.f10687c.m1950t()), m28453b(this.f10697m.m1927i(), this.f10687c.m1951s())));
    }

    /* renamed from: a0 */
    private boolean m28454a0() {
        if (!this.f10685a.getPreventCornerOverlap() || !m28447e() || !this.f10685a.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private float m28453b(C14035d dVar, float f) {
        if (dVar instanceof C14044j) {
            return (float) ((1.0d - f10683u) * f);
        }
        if (dVar instanceof C14036e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    private float m28451c() {
        float f;
        float maxCardElevation = this.f10685a.getMaxCardElevation();
        if (m28454a0()) {
            f = m28455a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: d */
    private float m28449d() {
        float f;
        float maxCardElevation = this.f10685a.getMaxCardElevation() * 1.5f;
        if (m28454a0()) {
            f = m28455a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: e */
    private boolean m28447e() {
        return this.f10687c.m1988R();
    }

    /* renamed from: e0 */
    private void m28446e0(Drawable drawable) {
        if (this.f10685a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f10685a.getForeground()).setDrawable(drawable);
        } else {
            this.f10685a.setForeground(m28480B(drawable));
        }
    }

    /* renamed from: f */
    private Drawable m28445f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C14038g h = m28441h();
        this.f10701q = h;
        h.m1981Y(this.f10695k);
        stateListDrawable.addState(new int[]{16842919}, this.f10701q);
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m28443g() {
        if (!C13488b.f30123a) {
            return m28445f();
        }
        this.f10702r = m28441h();
        return new RippleDrawable(this.f10695k, null, this.f10702r);
    }

    /* renamed from: g0 */
    private void m28442g0() {
        Drawable drawable;
        if (!C13488b.f30123a || (drawable = this.f10699o) == null) {
            C14038g gVar = this.f10701q;
            if (gVar != null) {
                gVar.m1981Y(this.f10695k);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f10695k);
    }

    /* renamed from: h */
    private C14038g m28441h() {
        return new C14038g(this.f10697m);
    }

    /* renamed from: r */
    private Drawable m28430r() {
        if (this.f10699o == null) {
            this.f10699o = m28443g();
        }
        if (this.f10700p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f10699o, this.f10688d, this.f10694j});
            this.f10700p = layerDrawable;
            layerDrawable.setId(2, C6807f.f14617z);
        }
        return this.f10700p;
    }

    /* renamed from: t */
    private float m28428t() {
        if (!this.f10685a.getPreventCornerOverlap() || !this.f10685a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f10683u) * this.f10685a.getCardViewRadius());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public Rect m28481A() {
        return this.f10686b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m28479C() {
        return this.f10703s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m28478D() {
        return this.f10704t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m28475G(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a = C13242c.m4241a(this.f10685a.getContext(), typedArray, C6812k.f14857w3);
        this.f10698n = a;
        if (a == null) {
            this.f10698n = ColorStateList.valueOf(-1);
        }
        this.f10692h = typedArray.getDimensionPixelSize(C6812k.f14865x3, 0);
        boolean z = typedArray.getBoolean(C6812k.f14793o3, false);
        this.f10704t = z;
        this.f10685a.setLongClickable(z);
        this.f10696l = C13242c.m4241a(this.f10685a.getContext(), typedArray, C6812k.f14841u3);
        m28468N(C13242c.m4238d(this.f10685a.getContext(), typedArray, C6812k.f14809q3));
        m28465Q(typedArray.getDimensionPixelSize(C6812k.f14833t3, 0));
        m28466P(typedArray.getDimensionPixelSize(C6812k.f14825s3, 0));
        this.f10691g = typedArray.getInteger(C6812k.f14817r3, 8388661);
        ColorStateList a2 = C13242c.m4241a(this.f10685a.getContext(), typedArray, C6812k.f14849v3);
        this.f10695k = a2;
        if (a2 == null) {
            this.f10695k = ColorStateList.valueOf(C10395a.m13517d(this.f10685a, C6803b.f14535i));
        }
        m28471K(C13242c.m4241a(this.f10685a.getContext(), typedArray, C6812k.f14801p3));
        m28442g0();
        m28448d0();
        m28440h0();
        this.f10685a.setBackgroundInternal(m28480B(this.f10687c));
        if (this.f10685a.isClickable()) {
            drawable = m28430r();
        } else {
            drawable = this.f10688d;
        }
        this.f10693i = drawable;
        this.f10685a.setForeground(m28480B(drawable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m28474H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f10700p != null) {
            if (this.f10685a.getUseCompatPadding()) {
                i4 = (int) Math.ceil(m28449d() * 2.0f);
                i3 = (int) Math.ceil(m28451c() * 2.0f);
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (m28476F()) {
                i5 = ((i - this.f10689e) - this.f10690f) - i3;
            } else {
                i5 = this.f10689e;
            }
            if (m28477E()) {
                i6 = this.f10689e;
            } else {
                i6 = ((i2 - this.f10689e) - this.f10690f) - i4;
            }
            if (m28476F()) {
                i7 = this.f10689e;
            } else {
                i7 = ((i - this.f10689e) - this.f10690f) - i3;
            }
            if (m28477E()) {
                i8 = ((i2 - this.f10689e) - this.f10690f) - i4;
            } else {
                i8 = this.f10689e;
            }
            if (C2733w0.m37063B(this.f10685a) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.f10700p.setLayerInset(2, i10, i8, i9, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m28473I(boolean z) {
        this.f10703s = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m28472J(ColorStateList colorStateList) {
        this.f10687c.m1981Y(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m28471K(ColorStateList colorStateList) {
        C14038g gVar = this.f10688d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.m1981Y(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m28470L(boolean z) {
        this.f10704t = z;
    }

    /* renamed from: M */
    public void m28469M(boolean z) {
        int i;
        Drawable drawable = this.f10694j;
        if (drawable != null) {
            if (z) {
                i = 255;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m28468N(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = C2400a.m37825r(drawable).mutate();
            this.f10694j = mutate;
            C2400a.m37828o(mutate, this.f10696l);
            m28469M(this.f10685a.isChecked());
        } else {
            this.f10694j = f10684v;
        }
        LayerDrawable layerDrawable = this.f10700p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C6807f.f14617z, this.f10694j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m28467O(int i) {
        this.f10691g = i;
        m28474H(this.f10685a.getMeasuredWidth(), this.f10685a.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m28466P(int i) {
        this.f10689e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m28465Q(int i) {
        this.f10690f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m28464R(ColorStateList colorStateList) {
        this.f10696l = colorStateList;
        Drawable drawable = this.f10694j;
        if (drawable != null) {
            C2400a.m37828o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m28463S(float f) {
        m28460V(this.f10697m.m1913w(f));
        this.f10693i.invalidateSelf();
        if (m28454a0() || m28456Z()) {
            m28450c0();
        }
        if (m28454a0()) {
            m28444f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m28462T(float f) {
        this.f10687c.m1980Z(f);
        C14038g gVar = this.f10688d;
        if (gVar != null) {
            gVar.m1980Z(f);
        }
        C14038g gVar2 = this.f10702r;
        if (gVar2 != null) {
            gVar2.m1980Z(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m28461U(ColorStateList colorStateList) {
        this.f10695k = colorStateList;
        m28442g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m28460V(C14045k kVar) {
        this.f10697m = kVar;
        this.f10687c.setShapeAppearanceModel(kVar);
        C14038g gVar = this.f10687c;
        gVar.m1975c0(!gVar.m1988R());
        C14038g gVar2 = this.f10688d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        C14038g gVar3 = this.f10702r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        C14038g gVar4 = this.f10701q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m28459W(ColorStateList colorStateList) {
        if (this.f10698n != colorStateList) {
            this.f10698n = colorStateList;
            m28440h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m28458X(int i) {
        if (i != this.f10692h) {
            this.f10692h = i;
            m28440h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m28457Y(int i, int i2, int i3, int i4) {
        this.f10686b.set(i, i2, i3, i4);
        m28450c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m28452b0() {
        Drawable drawable;
        Drawable drawable2 = this.f10693i;
        if (this.f10685a.isClickable()) {
            drawable = m28430r();
        } else {
            drawable = this.f10688d;
        }
        this.f10693i = drawable;
        if (drawable2 != drawable) {
            m28446e0(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m28450c0() {
        boolean z;
        float f;
        if (m28456Z() || m28454a0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = m28455a();
        } else {
            f = 0.0f;
        }
        int t = (int) (f - m28428t());
        MaterialCardView materialCardView = this.f10685a;
        Rect rect = this.f10686b;
        materialCardView.m28482g(rect.left + t, rect.top + t, rect.right + t, rect.bottom + t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m28448d0() {
        this.f10687c.m1982X(this.f10685a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m28444f0() {
        if (!m28479C()) {
            this.f10685a.setBackgroundInternal(m28480B(this.f10687c));
        }
        this.f10685a.setForeground(m28480B(this.f10693i));
    }

    /* renamed from: h0 */
    void m28440h0() {
        this.f10688d.m1969f0(this.f10692h, this.f10698n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m28439i() {
        Drawable drawable = this.f10699o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f10699o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f10699o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C14038g m28438j() {
        return this.f10687c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public ColorStateList m28437k() {
        return this.f10687c.m1946x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m28436l() {
        return this.f10688d.m1946x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Drawable m28435m() {
        return this.f10694j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m28434n() {
        return this.f10691g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m28433o() {
        return this.f10689e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m28432p() {
        return this.f10690f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList m28431q() {
        return this.f10696l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public float m28429s() {
        return this.f10687c.m1998H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public float m28427u() {
        return this.f10687c.m1945y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList m28426v() {
        return this.f10695k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C14045k m28425w() {
        return this.f10697m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m28424x() {
        ColorStateList colorStateList = this.f10698n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public ColorStateList m28423y() {
        return this.f10698n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m28422z() {
        return this.f10692h;
    }
}
