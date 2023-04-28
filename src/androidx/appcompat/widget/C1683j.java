package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C1652d1;
import androidx.core.graphics.C2382a;
import p052d.C6379a;
import p052d.C6381c;
import p052d.C6382d;
import p052d.C6383e;
import p071e.C6525a;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C1683j {

    /* renamed from: b */
    private static final PorterDuff.Mode f1398b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C1683j f1399c;

    /* renamed from: a */
    private C1652d1 f1400a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.j$a */
    /* loaded from: classes.dex */
    public class C1684a implements C1652d1.AbstractC1658f {

        /* renamed from: a */
        private final int[] f1401a = {C6383e.f37767R, C6383e.f37765P, C6383e.f13145a};

        /* renamed from: b */
        private final int[] f1402b = {C6383e.f13159o, C6383e.f37751B, C6383e.f13164t, C6383e.f13160p, C6383e.f13161q, C6383e.f13163s, C6383e.f13162r};

        /* renamed from: c */
        private final int[] f1403c = {C6383e.f37764O, C6383e.f37766Q, C6383e.f13155k, C6383e.f37760K, C6383e.f37761L, C6383e.f37762M, C6383e.f37763N};

        /* renamed from: d */
        private final int[] f1404d = {C6383e.f13167w, C6383e.f13153i, C6383e.f13166v};

        /* renamed from: e */
        private final int[] f1405e = {C6383e.f37759J, C6383e.f37768S};

        /* renamed from: f */
        private final int[] f1406f = {C6383e.f13147c, C6383e.f13151g, C6383e.f13148d, C6383e.f13152h};

        C1684a() {
        }

        /* renamed from: f */
        private boolean m40149f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m40148g(Context context) {
            return m40147h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m40147h(Context context, int i) {
            int c = C1682i1.m40167c(context, C6379a.f13117w);
            return new ColorStateList(new int[][]{C1682i1.f1389b, C1682i1.f1392e, C1682i1.f1390c, C1682i1.f1396i}, new int[]{C1682i1.m40168b(context, C6379a.f13115u), C2382a.m37924g(c, i), C2382a.m37924g(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m40146i(Context context) {
            return m40147h(context, C1682i1.m40167c(context, C6379a.f13114t));
        }

        /* renamed from: j */
        private ColorStateList m40145j(Context context) {
            return m40147h(context, C1682i1.m40167c(context, C6379a.f13115u));
        }

        /* renamed from: k */
        private ColorStateList m40144k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = C6379a.f13119y;
            ColorStateList e = C1682i1.m40165e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C1682i1.f1389b;
                iArr2[0] = C1682i1.m40168b(context, i);
                iArr[1] = C1682i1.f1393f;
                iArr2[1] = C1682i1.m40167c(context, C6379a.f13116v);
                iArr[2] = C1682i1.f1396i;
                iArr2[2] = C1682i1.m40167c(context, i);
            } else {
                int[] iArr3 = C1682i1.f1389b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = C1682i1.f1393f;
                iArr2[1] = C1682i1.m40167c(context, C6379a.f13116v);
                iArr[2] = C1682i1.f1396i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m40143l(C1652d1 d1Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = d1Var.m40271j(context, C6383e.f37755F);
            Drawable j2 = d1Var.m40271j(context, C6383e.f37756G);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m40142m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C1709q0.m40058a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1683j.f1398b;
            }
            drawable.setColorFilter(C1683j.m40159e(i, mode));
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1658f
        /* renamed from: a */
        public Drawable mo40154a(C1652d1 d1Var, Context context, int i) {
            if (i == C6383e.f13154j) {
                return new LayerDrawable(new Drawable[]{d1Var.m40271j(context, C6383e.f13153i), d1Var.m40271j(context, C6383e.f13155k)});
            }
            if (i == C6383e.f13169y) {
                return m40143l(d1Var, context, C6382d.f13138i);
            }
            if (i == C6383e.f13168x) {
                return m40143l(d1Var, context, C6382d.f13139j);
            }
            if (i == C6383e.f13170z) {
                return m40143l(d1Var, context, C6382d.f13140k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1658f
        /* renamed from: b */
        public ColorStateList mo40153b(Context context, int i) {
            if (i == C6383e.f13157m) {
                return C6525a.m25365a(context, C6381c.f13126e);
            }
            if (i == C6383e.f37758I) {
                return C6525a.m25365a(context, C6381c.f13129h);
            }
            if (i == C6383e.f37757H) {
                return m40144k(context);
            }
            if (i == C6383e.f13150f) {
                return m40145j(context);
            }
            if (i == C6383e.f13146b) {
                return m40148g(context);
            }
            if (i == C6383e.f13149e) {
                return m40146i(context);
            }
            if (i == C6383e.f37753D || i == C6383e.f37754E) {
                return C6525a.m25365a(context, C6381c.f13128g);
            }
            if (m40149f(this.f1402b, i)) {
                return C1682i1.m40165e(context, C6379a.f13118x);
            }
            if (m40149f(this.f1405e, i)) {
                return C6525a.m25365a(context, C6381c.f13125d);
            }
            if (m40149f(this.f1406f, i)) {
                return C6525a.m25365a(context, C6381c.f13124c);
            }
            if (i == C6383e.f37750A) {
                return C6525a.m25365a(context, C6381c.f13127f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.C1652d1.AbstractC1658f
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo40152c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C1683j.m40163a()
                int[] r1 = r7.f1401a
                boolean r1 = r7.m40149f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = p052d.C6379a.f13118x
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f1403c
                boolean r1 = r7.m40149f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = p052d.C6379a.f13116v
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f1404d
                boolean r1 = r7.m40149f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = p052d.C6383e.f13165u
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = p052d.C6383e.f13156l
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x006c
                boolean r3 = androidx.appcompat.widget.C1709q0.m40058a(r10)
                if (r3 == 0) goto L_0x005b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L_0x005b:
                int r8 = androidx.appcompat.widget.C1682i1.m40167c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C1683j.m40159e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x006b
                r10.setAlpha(r0)
            L_0x006b:
                return r2
            L_0x006c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1683j.C1684a.mo40152c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1658f
        /* renamed from: d */
        public PorterDuff.Mode mo40151d(int i) {
            if (i == C6383e.f37757H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C1652d1.AbstractC1658f
        /* renamed from: e */
        public boolean mo40150e(Context context, int i, Drawable drawable) {
            if (i == C6383e.f37752C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C6379a.f13118x;
                m40142m(findDrawableByLayerId, C1682i1.m40167c(context, i2), C1683j.f1398b);
                m40142m(layerDrawable.findDrawableByLayerId(16908303), C1682i1.m40167c(context, i2), C1683j.f1398b);
                m40142m(layerDrawable.findDrawableByLayerId(16908301), C1682i1.m40167c(context, C6379a.f13116v), C1683j.f1398b);
                return true;
            } else if (i != C6383e.f13169y && i != C6383e.f13168x && i != C6383e.f13170z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m40142m(layerDrawable2.findDrawableByLayerId(16908288), C1682i1.m40168b(context, C6379a.f13118x), C1683j.f1398b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C6379a.f13116v;
                m40142m(findDrawableByLayerId2, C1682i1.m40167c(context, i3), C1683j.f1398b);
                m40142m(layerDrawable2.findDrawableByLayerId(16908301), C1682i1.m40167c(context, i3), C1683j.f1398b);
                return true;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C1683j m40162b() {
        C1683j jVar;
        synchronized (C1683j.class) {
            if (f1399c == null) {
                m40156h();
            }
            jVar = f1399c;
        }
        return jVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m40159e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C1683j.class) {
            l = C1652d1.m40269l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m40156h() {
        synchronized (C1683j.class) {
            if (f1399c == null) {
                C1683j jVar = new C1683j();
                f1399c = jVar;
                jVar.f1400a = C1652d1.m40273h();
                f1399c.f1400a.m40260u(new C1684a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m40155i(Drawable drawable, C1692l1 l1Var, int[] iArr) {
        C1652d1.m40258w(drawable, l1Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m40161c(Context context, int i) {
        return this.f1400a.m40271j(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable m40160d(Context context, int i, boolean z) {
        return this.f1400a.m40270k(context, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList m40158f(Context context, int i) {
        return this.f1400a.m40268m(context, i);
    }

    /* renamed from: g */
    public synchronized void m40157g(Context context) {
        this.f1400a.m40262s(context);
    }
}
