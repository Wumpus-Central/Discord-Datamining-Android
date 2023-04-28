package com.budiyev.android.codescanner;

import android.graphics.Matrix;

/* renamed from: com.budiyev.android.codescanner.l */
/* loaded from: classes.dex */
final class C4187l {

    /* renamed from: a */
    private final int f7128a;

    /* renamed from: b */
    private final int f7129b;

    /* renamed from: c */
    private final int f7130c;

    /* renamed from: d */
    private final int f7131d;

    public C4187l(int i, int i2, int i3, int i4) {
        this.f7128a = i;
        this.f7129b = i2;
        this.f7130c = i3;
        this.f7131d = i4;
    }

    /* renamed from: a */
    public C4187l m32415a(int i, int i2, int i3, int i4) {
        int i5 = this.f7128a;
        int i6 = this.f7129b;
        int i7 = this.f7130c;
        int i8 = this.f7131d;
        if (i5 < i || i6 < i2 || i7 > i3 || i8 > i4) {
            return new C4187l(Math.max(i5, i), Math.max(i6, i2), Math.min(i7, i3), Math.min(i8, i4));
        }
        return this;
    }

    /* renamed from: b */
    public C4187l m32414b(C4187l lVar) {
        int i = this.f7128a;
        int i2 = this.f7129b;
        int i3 = this.f7130c;
        int i4 = this.f7131d;
        int h = m32408h();
        int d = m32412d();
        int i5 = lVar.f7128a;
        int i6 = lVar.f7129b;
        int i7 = lVar.f7130c;
        int i8 = lVar.f7131d;
        int h2 = lVar.m32408h();
        int d2 = lVar.m32412d();
        if (i >= i5 && i2 >= i6 && i3 <= i7 && i4 <= i8) {
            return this;
        }
        int min = Math.min(h, h2);
        int min2 = Math.min(d, d2);
        if (i < i5) {
            i3 = i5 + min;
            i = i5;
        } else if (i3 > i7) {
            i = i7 - min;
            i3 = i7;
        }
        if (i2 < i6) {
            i4 = i6 + min2;
            i2 = i6;
        } else if (i4 > i8) {
            i2 = i8 - min2;
            i4 = i8;
        }
        return new C4187l(i, i2, i3, i4);
    }

    /* renamed from: c */
    public int m32413c() {
        return this.f7131d;
    }

    /* renamed from: d */
    public int m32412d() {
        return this.f7131d - this.f7129b;
    }

    /* renamed from: e */
    public int m32411e() {
        return this.f7128a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4187l)) {
            return false;
        }
        C4187l lVar = (C4187l) obj;
        if (this.f7128a == lVar.f7128a && this.f7129b == lVar.f7129b && this.f7130c == lVar.f7130c && this.f7131d == lVar.f7131d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m32410f() {
        return this.f7130c;
    }

    /* renamed from: g */
    public int m32409g() {
        return this.f7129b;
    }

    /* renamed from: h */
    public int m32408h() {
        return this.f7130c - this.f7128a;
    }

    public int hashCode() {
        return (((((this.f7128a * 31) + this.f7129b) * 31) + this.f7130c) * 31) + this.f7131d;
    }

    /* renamed from: i */
    public boolean m32407i(int i, int i2) {
        return this.f7128a < i && this.f7129b < i2 && this.f7130c > i && this.f7131d > i2;
    }

    /* renamed from: j */
    public C4187l m32406j(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        float[] fArr = {this.f7128a, this.f7129b, this.f7130c, this.f7131d};
        matrix.postRotate(f, f2, f3);
        matrix.mapPoints(fArr);
        int i = (int) fArr[0];
        int i2 = (int) fArr[1];
        int i3 = (int) fArr[2];
        int i4 = (int) fArr[3];
        if (i > i3) {
            i3 = i;
            i = i3;
        }
        if (i2 > i4) {
            i4 = i2;
            i2 = i4;
        }
        return new C4187l(i, i2, i3, i4);
    }

    public String toString() {
        return "[(" + this.f7128a + "; " + this.f7129b + ") - (" + this.f7130c + "; " + this.f7131d + ")]";
    }
}
