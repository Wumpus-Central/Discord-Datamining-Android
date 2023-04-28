package com.facebook.drawee.generic;

import java.util.Arrays;
import p394w3.C13740j;

/* renamed from: com.facebook.drawee.generic.a */
/* loaded from: classes7.dex */
public class C4830a {

    /* renamed from: a */
    private EnumC0114a f7826a = EnumC0114a.BITMAP_ONLY;

    /* renamed from: b */
    private boolean f7827b = false;

    /* renamed from: c */
    private float[] f7828c = null;

    /* renamed from: d */
    private int f7829d = 0;

    /* renamed from: e */
    private float f7830e = 0.0f;

    /* renamed from: f */
    private int f7831f = 0;

    /* renamed from: g */
    private float f7832g = 0.0f;

    /* renamed from: h */
    private boolean f7833h = false;

    /* renamed from: i */
    private boolean f7834i = false;

    /* renamed from: com.facebook.drawee.generic.a$a */
    /* loaded from: classes7.dex */
    public enum EnumC0114a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    public static C4830a m31729a(float f) {
        return new C4830a().m31714p(f);
    }

    /* renamed from: e */
    private float[] m31725e() {
        if (this.f7828c == null) {
            this.f7828c = new float[8];
        }
        return this.f7828c;
    }

    /* renamed from: b */
    public int m31728b() {
        return this.f7831f;
    }

    /* renamed from: c */
    public float m31727c() {
        return this.f7830e;
    }

    /* renamed from: d */
    public float[] m31726d() {
        return this.f7828c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4830a aVar = (C4830a) obj;
        if (this.f7827b == aVar.f7827b && this.f7829d == aVar.f7829d && Float.compare(aVar.f7830e, this.f7830e) == 0 && this.f7831f == aVar.f7831f && Float.compare(aVar.f7832g, this.f7832g) == 0 && this.f7826a == aVar.f7826a && this.f7833h == aVar.f7833h && this.f7834i == aVar.f7834i) {
            return Arrays.equals(this.f7828c, aVar.f7828c);
        }
        return false;
    }

    /* renamed from: f */
    public int m31724f() {
        return this.f7829d;
    }

    /* renamed from: g */
    public float m31723g() {
        return this.f7832g;
    }

    /* renamed from: h */
    public boolean m31722h() {
        return this.f7834i;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        EnumC0114a aVar = this.f7826a;
        int i4 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.f7827b ? 1 : 0)) * 31;
        float[] fArr = this.f7828c;
        if (fArr != null) {
            i2 = Arrays.hashCode(fArr);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f7829d) * 31;
        float f = this.f7830e;
        if (f != 0.0f) {
            i3 = Float.floatToIntBits(f);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f7831f) * 31;
        float f2 = this.f7832g;
        if (f2 != 0.0f) {
            i4 = Float.floatToIntBits(f2);
        }
        return ((((i7 + i4) * 31) + (this.f7833h ? 1 : 0)) * 31) + (this.f7834i ? 1 : 0);
    }

    /* renamed from: i */
    public boolean m31721i() {
        return this.f7827b;
    }

    /* renamed from: j */
    public EnumC0114a m31720j() {
        return this.f7826a;
    }

    /* renamed from: k */
    public boolean m31719k() {
        return this.f7833h;
    }

    /* renamed from: l */
    public C4830a m31718l(int i, float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2838c(z, "the border width cannot be < 0");
        this.f7830e = f;
        this.f7831f = i;
        return this;
    }

    /* renamed from: m */
    public C4830a m31717m(int i) {
        this.f7831f = i;
        return this;
    }

    /* renamed from: n */
    public C4830a m31716n(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2838c(z, "the border width cannot be < 0");
        this.f7830e = f;
        return this;
    }

    /* renamed from: o */
    public C4830a m31715o(float f, float f2, float f3, float f4) {
        float[] e = m31725e();
        e[1] = f;
        e[0] = f;
        e[3] = f2;
        e[2] = f2;
        e[5] = f3;
        e[4] = f3;
        e[7] = f4;
        e[6] = f4;
        return this;
    }

    /* renamed from: p */
    public C4830a m31714p(float f) {
        Arrays.fill(m31725e(), f);
        return this;
    }

    /* renamed from: q */
    public C4830a m31713q(int i) {
        this.f7829d = i;
        this.f7826a = EnumC0114a.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: r */
    public C4830a m31712r(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2838c(z, "the padding cannot be < 0");
        this.f7832g = f;
        return this;
    }

    /* renamed from: s */
    public C4830a m31711s(boolean z) {
        this.f7834i = z;
        return this;
    }

    /* renamed from: t */
    public C4830a m31710t(boolean z) {
        this.f7827b = z;
        return this;
    }

    /* renamed from: u */
    public C4830a m31709u(EnumC0114a aVar) {
        this.f7826a = aVar;
        return this;
    }
}
