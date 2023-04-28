package p440y8;

import android.text.Layout;

/* renamed from: y8.g */
/* loaded from: classes7.dex */
final class C14318g {

    /* renamed from: a */
    private String f32411a;

    /* renamed from: b */
    private int f32412b;

    /* renamed from: c */
    private boolean f32413c;

    /* renamed from: d */
    private int f32414d;

    /* renamed from: e */
    private boolean f32415e;

    /* renamed from: k */
    private float f32421k;

    /* renamed from: l */
    private String f32422l;

    /* renamed from: o */
    private Layout.Alignment f32425o;

    /* renamed from: q */
    private C14311b f32427q;

    /* renamed from: f */
    private int f32416f = -1;

    /* renamed from: g */
    private int f32417g = -1;

    /* renamed from: h */
    private int f32418h = -1;

    /* renamed from: i */
    private int f32419i = -1;

    /* renamed from: j */
    private int f32420j = -1;

    /* renamed from: m */
    private int f32423m = -1;

    /* renamed from: n */
    private int f32424n = -1;

    /* renamed from: p */
    private int f32426p = -1;

    /* renamed from: r */
    private float f32428r = Float.MAX_VALUE;

    /* renamed from: q */
    private C14318g m893q(C14318g gVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        String str;
        if (gVar != null) {
            if (!this.f32413c && gVar.f32413c) {
                m888v(gVar.f32412b);
            }
            if (this.f32418h == -1) {
                this.f32418h = gVar.f32418h;
            }
            if (this.f32419i == -1) {
                this.f32419i = gVar.f32419i;
            }
            if (this.f32411a == null && (str = gVar.f32411a) != null) {
                this.f32411a = str;
            }
            if (this.f32416f == -1) {
                this.f32416f = gVar.f32416f;
            }
            if (this.f32417g == -1) {
                this.f32417g = gVar.f32417g;
            }
            if (this.f32424n == -1) {
                this.f32424n = gVar.f32424n;
            }
            if (this.f32425o == null && (alignment = gVar.f32425o) != null) {
                this.f32425o = alignment;
            }
            if (this.f32426p == -1) {
                this.f32426p = gVar.f32426p;
            }
            if (this.f32420j == -1) {
                this.f32420j = gVar.f32420j;
                this.f32421k = gVar.f32421k;
            }
            if (this.f32427q == null) {
                this.f32427q = gVar.f32427q;
            }
            if (this.f32428r == Float.MAX_VALUE) {
                this.f32428r = gVar.f32428r;
            }
            if (z && !this.f32415e && gVar.f32415e) {
                m890t(gVar.f32414d);
            }
            if (z && this.f32423m == -1 && (i = gVar.f32423m) != -1) {
                this.f32423m = i;
            }
        }
        return this;
    }

    /* renamed from: A */
    public C14318g m918A(boolean z) {
        this.f32419i = z ? 1 : 0;
        return this;
    }

    /* renamed from: B */
    public C14318g m917B(boolean z) {
        this.f32416f = z ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public C14318g m916C(int i) {
        this.f32424n = i;
        return this;
    }

    /* renamed from: D */
    public C14318g m915D(int i) {
        this.f32423m = i;
        return this;
    }

    /* renamed from: E */
    public C14318g m914E(float f) {
        this.f32428r = f;
        return this;
    }

    /* renamed from: F */
    public C14318g m913F(Layout.Alignment alignment) {
        this.f32425o = alignment;
        return this;
    }

    /* renamed from: G */
    public C14318g m912G(boolean z) {
        this.f32426p = z ? 1 : 0;
        return this;
    }

    /* renamed from: H */
    public C14318g m911H(C14311b bVar) {
        this.f32427q = bVar;
        return this;
    }

    /* renamed from: I */
    public C14318g m910I(boolean z) {
        this.f32417g = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C14318g m909a(C14318g gVar) {
        return m893q(gVar, true);
    }

    /* renamed from: b */
    public int m908b() {
        if (this.f32415e) {
            return this.f32414d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m907c() {
        if (this.f32413c) {
            return this.f32412b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m906d() {
        return this.f32411a;
    }

    /* renamed from: e */
    public float m905e() {
        return this.f32421k;
    }

    /* renamed from: f */
    public int m904f() {
        return this.f32420j;
    }

    /* renamed from: g */
    public String m903g() {
        return this.f32422l;
    }

    /* renamed from: h */
    public int m902h() {
        return this.f32424n;
    }

    /* renamed from: i */
    public int m901i() {
        return this.f32423m;
    }

    /* renamed from: j */
    public float m900j() {
        return this.f32428r;
    }

    /* renamed from: k */
    public int m899k() {
        int i;
        int i2 = this.f32418h;
        if (i2 == -1 && this.f32419i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f32419i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: l */
    public Layout.Alignment m898l() {
        return this.f32425o;
    }

    /* renamed from: m */
    public boolean m897m() {
        return this.f32426p == 1;
    }

    /* renamed from: n */
    public C14311b m896n() {
        return this.f32427q;
    }

    /* renamed from: o */
    public boolean m895o() {
        return this.f32415e;
    }

    /* renamed from: p */
    public boolean m894p() {
        return this.f32413c;
    }

    /* renamed from: r */
    public boolean m892r() {
        return this.f32416f == 1;
    }

    /* renamed from: s */
    public boolean m891s() {
        return this.f32417g == 1;
    }

    /* renamed from: t */
    public C14318g m890t(int i) {
        this.f32414d = i;
        this.f32415e = true;
        return this;
    }

    /* renamed from: u */
    public C14318g m889u(boolean z) {
        this.f32418h = z ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public C14318g m888v(int i) {
        this.f32412b = i;
        this.f32413c = true;
        return this;
    }

    /* renamed from: w */
    public C14318g m887w(String str) {
        this.f32411a = str;
        return this;
    }

    /* renamed from: x */
    public C14318g m886x(float f) {
        this.f32421k = f;
        return this;
    }

    /* renamed from: y */
    public C14318g m885y(int i) {
        this.f32420j = i;
        return this;
    }

    /* renamed from: z */
    public C14318g m884z(String str) {
        this.f32422l = str;
        return this;
    }
}
