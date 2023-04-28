package androidx.core.graphics;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class Insets {

    /* renamed from: e */
    public static final Insets f3325e = new Insets(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3326a;

    /* renamed from: b */
    public final int f3327b;

    /* renamed from: c */
    public final int f3328c;

    /* renamed from: d */
    public final int f3329d;

    /* renamed from: androidx.core.graphics.Insets$a */
    /* loaded from: classes.dex */
    static class C2381a {
        /* renamed from: a */
        static android.graphics.Insets m37931a(int i, int i2, int i3, int i4) {
            android.graphics.Insets of;
            of = android.graphics.Insets.of(i, i2, i3, i4);
            return of;
        }
    }

    private Insets(int i, int i2, int i3, int i4) {
        this.f3326a = i;
        this.f3327b = i2;
        this.f3328c = i3;
        this.f3329d = i4;
    }

    /* renamed from: a */
    public static Insets m37936a(Insets insets, Insets insets2) {
        return m37935b(Math.max(insets.f3326a, insets2.f3326a), Math.max(insets.f3327b, insets2.f3327b), Math.max(insets.f3328c, insets2.f3328c), Math.max(insets.f3329d, insets2.f3329d));
    }

    /* renamed from: b */
    public static Insets m37935b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f3325e;
        }
        return new Insets(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static Insets m37934c(Rect rect) {
        return m37935b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static Insets m37933d(android.graphics.Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return m37935b(i, i2, i3, i4);
    }

    /* renamed from: e */
    public android.graphics.Insets m37932e() {
        return C2381a.m37931a(this.f3326a, this.f3327b, this.f3328c, this.f3329d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        if (this.f3329d == insets.f3329d && this.f3326a == insets.f3326a && this.f3328c == insets.f3328c && this.f3327b == insets.f3327b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3326a * 31) + this.f3327b) * 31) + this.f3328c) * 31) + this.f3329d;
    }

    public String toString() {
        return "Insets{left=" + this.f3326a + ", top=" + this.f3327b + ", right=" + this.f3328c + ", bottom=" + this.f3329d + '}';
    }
}
