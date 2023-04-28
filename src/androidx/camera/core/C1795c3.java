package androidx.camera.core;

import android.util.Rational;
import androidx.core.util.C2517g;

/* renamed from: androidx.camera.core.c3 */
/* loaded from: classes.dex */
public final class C1795c3 {

    /* renamed from: a */
    private int f1675a;

    /* renamed from: b */
    private Rational f1676b;

    /* renamed from: c */
    private int f1677c;

    /* renamed from: d */
    private int f1678d;

    /* renamed from: androidx.camera.core.c3$a */
    /* loaded from: classes.dex */
    public static final class C1796a {

        /* renamed from: b */
        private final Rational f1680b;

        /* renamed from: c */
        private final int f1681c;

        /* renamed from: a */
        private int f1679a = 1;

        /* renamed from: d */
        private int f1682d = 0;

        public C1796a(Rational rational, int i) {
            this.f1680b = rational;
            this.f1681c = i;
        }

        /* renamed from: a */
        public C1795c3 m39804a() {
            C2517g.m37587h(this.f1680b, "The crop aspect ratio must be set.");
            return new C1795c3(this.f1679a, this.f1680b, this.f1681c, this.f1682d);
        }

        /* renamed from: b */
        public C1796a m39803b(int i) {
            this.f1682d = i;
            return this;
        }

        /* renamed from: c */
        public C1796a m39802c(int i) {
            this.f1679a = i;
            return this;
        }
    }

    C1795c3(int i, Rational rational, int i2, int i3) {
        this.f1675a = i;
        this.f1676b = rational;
        this.f1677c = i2;
        this.f1678d = i3;
    }

    /* renamed from: a */
    public Rational m39808a() {
        return this.f1676b;
    }

    /* renamed from: b */
    public int m39807b() {
        return this.f1678d;
    }

    /* renamed from: c */
    public int m39806c() {
        return this.f1677c;
    }

    /* renamed from: d */
    public int m39805d() {
        return this.f1675a;
    }
}
