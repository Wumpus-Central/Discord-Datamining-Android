package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes7.dex */
public class ScalingUtils {

    /* loaded from: classes7.dex */
    public interface ScaleType {

        /* renamed from: a */
        public static final ScaleType f7703a = C4806j.f7722l;

        /* renamed from: b */
        public static final ScaleType f7704b = C4805i.f7721l;

        /* renamed from: c */
        public static final ScaleType f7705c = C4807k.f7723l;

        /* renamed from: d */
        public static final ScaleType f7706d = C4804h.f7720l;

        /* renamed from: e */
        public static final ScaleType f7707e = C4802f.f7718l;

        /* renamed from: f */
        public static final ScaleType f7708f = C4803g.f7719l;

        /* renamed from: g */
        public static final ScaleType f7709g = C4798b.f7714l;

        /* renamed from: h */
        public static final ScaleType f7710h = C4800d.f7716l;

        /* renamed from: i */
        public static final ScaleType f7711i = C4799c.f7715l;

        /* renamed from: j */
        public static final ScaleType f7712j = C4808l.f7724l;

        /* renamed from: k */
        public static final ScaleType f7713k = C4801e.f7717l;

        Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC4797a implements ScaleType {
        @Override // com.facebook.drawee.drawable.ScalingUtils.ScaleType
        public Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            getTransformImpl(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
            return matrix;
        }

        public abstract void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$b */
    /* loaded from: classes7.dex */
    private static class C4798b extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7714l = new C4798b();

        private C4798b() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$c */
    /* loaded from: classes7.dex */
    private static class C4799c extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7715l = new C4799c();

        private C4799c() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                f5 = rect.left + ((rect.width() - (i * f4)) * 0.5f);
                f6 = rect.top;
                f3 = f4;
            } else {
                f6 = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
                f5 = rect.left;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$d */
    /* loaded from: classes7.dex */
    private static class C4800d extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7716l = new C4800d();

        private C4800d() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$e */
    /* loaded from: classes7.dex */
    private static class C4801e extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7717l = new C4801e();

        private C4801e() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$f */
    /* loaded from: classes7.dex */
    private static class C4802f extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7718l = new C4802f();

        private C4802f() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$g */
    /* loaded from: classes7.dex */
    private static class C4803g extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7719l = new C4803g();

        private C4803g() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i * min)) + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$h */
    /* loaded from: classes7.dex */
    private static class C4804h extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7720l = new C4804h();

        private C4804h() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$i */
    /* loaded from: classes7.dex */
    private static class C4805i extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7721l = new C4805i();

        private C4805i() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float height = rect.top + ((rect.height() - (i2 * f3)) * 0.5f);
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_x";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$j */
    /* loaded from: classes7.dex */
    private static class C4806j extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7722l = new C4806j();

        private C4806j() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f3, f4);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$k */
    /* loaded from: classes7.dex */
    private static class C4807k extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7723l = new C4807k();

        private C4807k() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f4, f4);
            matrix.postTranslate((int) (rect.left + ((rect.width() - (i * f4)) * 0.5f) + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_y";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$l */
    /* loaded from: classes7.dex */
    private static class C4808l extends AbstractC4797a {

        /* renamed from: l */
        public static final ScaleType f7724l = new C4808l();

        private C4808l() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC4797a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = i * f4;
                f5 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f7), 0.0f), rect.width() - f7);
                f6 = rect.top;
                f3 = f4;
            } else {
                f5 = rect.left;
                float f8 = i2 * f3;
                f6 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f8), 0.0f), rect.height() - f8) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$m */
    /* loaded from: classes7.dex */
    public interface AbstractC4809m {
        Object getState();
    }

    /* renamed from: a */
    public static C4826n m31843a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof C4826n) {
            return (C4826n) drawable;
        }
        if (drawable instanceof AbstractC4812c) {
            return m31843a(((AbstractC4812c) drawable).getDrawable());
        }
        if (drawable instanceof C4810a) {
            C4810a aVar = (C4810a) drawable;
            int d = aVar.m31839d();
            for (int i = 0; i < d; i++) {
                C4826n a = m31843a(aVar.m31841b(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
