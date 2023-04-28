package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2733w0;
import com.google.android.material.internal.C5665o;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6812k;
import p366ub.C13242c;
import p385vb.C13486a;
import p385vb.C13488b;
import p422xb.AbstractC14061n;
import p422xb.C14038g;
import p422xb.C14045k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes3.dex */
public class C5551a {

    /* renamed from: t */
    private static final boolean f10654t = true;

    /* renamed from: u */
    private static final boolean f10655u = false;

    /* renamed from: a */
    private final MaterialButton f10656a;

    /* renamed from: b */
    private C14045k f10657b;

    /* renamed from: c */
    private int f10658c;

    /* renamed from: d */
    private int f10659d;

    /* renamed from: e */
    private int f10660e;

    /* renamed from: f */
    private int f10661f;

    /* renamed from: g */
    private int f10662g;

    /* renamed from: h */
    private int f10663h;

    /* renamed from: i */
    private PorterDuff.Mode f10664i;

    /* renamed from: j */
    private ColorStateList f10665j;

    /* renamed from: k */
    private ColorStateList f10666k;

    /* renamed from: l */
    private ColorStateList f10667l;

    /* renamed from: m */
    private Drawable f10668m;

    /* renamed from: n */
    private boolean f10669n = false;

    /* renamed from: o */
    private boolean f10670o = false;

    /* renamed from: p */
    private boolean f10671p = false;

    /* renamed from: q */
    private boolean f10672q;

    /* renamed from: r */
    private LayerDrawable f10673r;

    /* renamed from: s */
    private int f10674s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5551a(MaterialButton materialButton, C14045k kVar) {
        this.f10656a = materialButton;
        this.f10657b = kVar;
    }

    /* renamed from: E */
    private void m28517E(int i, int i2) {
        int G = C2733w0.m37053G(this.f10656a);
        int paddingTop = this.f10656a.getPaddingTop();
        int F = C2733w0.m37055F(this.f10656a);
        int paddingBottom = this.f10656a.getPaddingBottom();
        int i3 = this.f10660e;
        int i4 = this.f10661f;
        this.f10661f = i2;
        this.f10660e = i;
        if (!this.f10670o) {
            m28516F();
        }
        C2733w0.m37054F0(this.f10656a, G, (paddingTop + i) - i3, F, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m28516F() {
        this.f10656a.setInternalBackground(m28512a());
        C14038g f = m28507f();
        if (f != null) {
            f.m1982X(this.f10674s);
        }
    }

    /* renamed from: G */
    private void m28515G(C14045k kVar) {
        if (!f10655u || this.f10670o) {
            if (m28507f() != null) {
                m28507f().setShapeAppearanceModel(kVar);
            }
            if (m28499n() != null) {
                m28499n().setShapeAppearanceModel(kVar);
            }
            if (m28508e() != null) {
                m28508e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int G = C2733w0.m37053G(this.f10656a);
        int paddingTop = this.f10656a.getPaddingTop();
        int F = C2733w0.m37055F(this.f10656a);
        int paddingBottom = this.f10656a.getPaddingBottom();
        m28516F();
        C2733w0.m37054F0(this.f10656a, G, paddingTop, F, paddingBottom);
    }

    /* renamed from: H */
    private void m28514H() {
        int i;
        C14038g f = m28507f();
        C14038g n = m28499n();
        if (f != null) {
            f.m1969f0(this.f10663h, this.f10666k);
            if (n != null) {
                float f2 = this.f10663h;
                if (this.f10669n) {
                    i = C10395a.m13517d(this.f10656a, C6803b.f14539m);
                } else {
                    i = 0;
                }
                n.m1971e0(f2, i);
            }
        }
    }

    /* renamed from: I */
    private InsetDrawable m28513I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f10658c, this.f10660e, this.f10659d, this.f10661f);
    }

    /* renamed from: a */
    private Drawable m28512a() {
        int i;
        C14038g gVar = new C14038g(this.f10657b);
        gVar.m1991O(this.f10656a.getContext());
        C2400a.m37828o(gVar, this.f10665j);
        PorterDuff.Mode mode = this.f10664i;
        if (mode != null) {
            C2400a.m37827p(gVar, mode);
        }
        gVar.m1969f0(this.f10663h, this.f10666k);
        C14038g gVar2 = new C14038g(this.f10657b);
        gVar2.setTint(0);
        float f = this.f10663h;
        if (this.f10669n) {
            i = C10395a.m13517d(this.f10656a, C6803b.f14539m);
        } else {
            i = 0;
        }
        gVar2.m1971e0(f, i);
        if (f10654t) {
            C14038g gVar3 = new C14038g(this.f10657b);
            this.f10668m = gVar3;
            C2400a.m37829n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C13488b.m3601a(this.f10667l), m28513I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f10668m);
            this.f10673r = rippleDrawable;
            return rippleDrawable;
        }
        C13486a aVar = new C13486a(this.f10657b);
        this.f10668m = aVar;
        C2400a.m37828o(aVar, C13488b.m3601a(this.f10667l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f10668m});
        this.f10673r = layerDrawable;
        return m28513I(layerDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private C14038g m28506g(boolean z) {
        LayerDrawable layerDrawable = this.f10673r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f10654t) {
            return (C14038g) ((LayerDrawable) ((InsetDrawable) this.f10673r.getDrawable(0)).getDrawable()).getDrawable(!z);
        }
        return (C14038g) this.f10673r.getDrawable(!z ? 1 : 0);
    }

    /* renamed from: n */
    private C14038g m28499n() {
        return m28506g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m28521A(ColorStateList colorStateList) {
        if (this.f10666k != colorStateList) {
            this.f10666k = colorStateList;
            m28514H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m28520B(int i) {
        if (this.f10663h != i) {
            this.f10663h = i;
            m28514H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m28519C(ColorStateList colorStateList) {
        if (this.f10665j != colorStateList) {
            this.f10665j = colorStateList;
            if (m28507f() != null) {
                C2400a.m37828o(m28507f(), this.f10665j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m28518D(PorterDuff.Mode mode) {
        if (this.f10664i != mode) {
            this.f10664i = mode;
            if (m28507f() != null && this.f10664i != null) {
                C2400a.m37827p(m28507f(), this.f10664i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m28511b() {
        return this.f10662g;
    }

    /* renamed from: c */
    public int m28510c() {
        return this.f10661f;
    }

    /* renamed from: d */
    public int m28509d() {
        return this.f10660e;
    }

    /* renamed from: e */
    public AbstractC14061n m28508e() {
        LayerDrawable layerDrawable = this.f10673r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f10673r.getNumberOfLayers() > 2) {
            return (AbstractC14061n) this.f10673r.getDrawable(2);
        }
        return (AbstractC14061n) this.f10673r.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C14038g m28507f() {
        return m28506g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m28505h() {
        return this.f10667l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C14045k m28504i() {
        return this.f10657b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m28503j() {
        return this.f10666k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m28502k() {
        return this.f10663h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m28501l() {
        return this.f10665j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode m28500m() {
        return this.f10664i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m28498o() {
        return this.f10670o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m28497p() {
        return this.f10672q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m28496q(TypedArray typedArray) {
        this.f10658c = typedArray.getDimensionPixelOffset(C6812k.f14864x2, 0);
        this.f10659d = typedArray.getDimensionPixelOffset(C6812k.f14872y2, 0);
        this.f10660e = typedArray.getDimensionPixelOffset(C6812k.f14880z2, 0);
        this.f10661f = typedArray.getDimensionPixelOffset(C6812k.f38034A2, 0);
        int i = C6812k.f38066E2;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f10662g = dimensionPixelSize;
            m28488y(this.f10657b.m1913w(dimensionPixelSize));
            this.f10671p = true;
        }
        this.f10663h = typedArray.getDimensionPixelSize(C6812k.f38146O2, 0);
        this.f10664i = C5665o.m27825f(typedArray.getInt(C6812k.f38058D2, -1), PorterDuff.Mode.SRC_IN);
        this.f10665j = C13242c.m4241a(this.f10656a.getContext(), typedArray, C6812k.f38050C2);
        this.f10666k = C13242c.m4241a(this.f10656a.getContext(), typedArray, C6812k.f38138N2);
        this.f10667l = C13242c.m4241a(this.f10656a.getContext(), typedArray, C6812k.f38130M2);
        this.f10672q = typedArray.getBoolean(C6812k.f38042B2, false);
        this.f10674s = typedArray.getDimensionPixelSize(C6812k.f38074F2, 0);
        int G = C2733w0.m37053G(this.f10656a);
        int paddingTop = this.f10656a.getPaddingTop();
        int F = C2733w0.m37055F(this.f10656a);
        int paddingBottom = this.f10656a.getPaddingBottom();
        if (typedArray.hasValue(C6812k.f14856w2)) {
            m28494s();
        } else {
            m28516F();
        }
        C2733w0.m37054F0(this.f10656a, G + this.f10658c, paddingTop + this.f10660e, F + this.f10659d, paddingBottom + this.f10661f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m28495r(int i) {
        if (m28507f() != null) {
            m28507f().setTint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m28494s() {
        this.f10670o = true;
        this.f10656a.setSupportBackgroundTintList(this.f10665j);
        this.f10656a.setSupportBackgroundTintMode(this.f10664i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m28493t(boolean z) {
        this.f10672q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m28492u(int i) {
        if (!this.f10671p || this.f10662g != i) {
            this.f10662g = i;
            this.f10671p = true;
            m28488y(this.f10657b.m1913w(i));
        }
    }

    /* renamed from: v */
    public void m28491v(int i) {
        m28517E(this.f10660e, i);
    }

    /* renamed from: w */
    public void m28490w(int i) {
        m28517E(i, this.f10661f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m28489x(ColorStateList colorStateList) {
        if (this.f10667l != colorStateList) {
            this.f10667l = colorStateList;
            boolean z = f10654t;
            if (z && (this.f10656a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f10656a.getBackground()).setColor(C13488b.m3601a(colorStateList));
            } else if (!z && (this.f10656a.getBackground() instanceof C13486a)) {
                ((C13486a) this.f10656a.getBackground()).setTintList(C13488b.m3601a(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m28488y(C14045k kVar) {
        this.f10657b = kVar;
        m28515G(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m28487z(boolean z) {
        this.f10669n = z;
        m28514H();
    }
}
