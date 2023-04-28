package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.p */
/* loaded from: classes.dex */
class C3250p {

    /* renamed from: a */
    static final Matrix f5139a = new C3251a();

    /* renamed from: androidx.transition.p$a */
    /* loaded from: classes.dex */
    static class C3251a extends Matrix {
        C3251a() {
        }

        /* renamed from: a */
        void m34857a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f, float f2, float f3) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2, float f3, float f4) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2, float f3, float f4) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f, float f2) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f, float f2, float f3) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2, float f3, float f4) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2, float f3, float f4) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f, float f2) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f, float f2, float f3) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2, float f3, float f4) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2, float f3, float f4) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2, float f3, float f4) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f, float f2) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2) {
            m34857a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2) {
            m34857a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2) {
            m34857a();
        }
    }
}
