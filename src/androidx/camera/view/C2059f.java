package androidx.camera.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1936v2;
import androidx.camera.view.C2066l;
import androidx.core.util.C2517g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.f */
/* loaded from: classes.dex */
public final class C2059f {

    /* renamed from: g */
    private static final C2066l.EnumC2071e f2317g = C2066l.EnumC2071e.FILL_CENTER;

    /* renamed from: a */
    private Size f2318a;

    /* renamed from: b */
    private Rect f2319b;

    /* renamed from: c */
    private int f2320c;

    /* renamed from: d */
    private int f2321d;

    /* renamed from: e */
    private boolean f2322e;

    /* renamed from: f */
    private C2066l.EnumC2071e f2323f = f2317g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2060a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2324a;

        static {
            int[] iArr = new int[C2066l.EnumC2071e.values().length];
            f2324a = iArr;
            try {
                iArr[C2066l.EnumC2071e.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2324a[C2066l.EnumC2071e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2324a[C2066l.EnumC2071e.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2324a[C2066l.EnumC2071e.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2324a[C2066l.EnumC2071e.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2324a[C2066l.EnumC2071e.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: b */
    private static RectF m39152b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    /* renamed from: e */
    private Size m39149e() {
        if (C2053b0.m39169d(this.f2320c)) {
            return new Size(this.f2319b.height(), this.f2319b.width());
        }
        return new Size(this.f2319b.width(), this.f2319b.height());
    }

    /* renamed from: j */
    private RectF m39144j(Size size, int i) {
        C2517g.m37586i(m39143k());
        Matrix h = m39146h(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f2318a.getWidth(), this.f2318a.getHeight());
        h.mapRect(rectF);
        return rectF;
    }

    /* renamed from: k */
    private boolean m39143k() {
        return (this.f2319b == null || this.f2318a == null) ? false : true;
    }

    /* renamed from: m */
    private static void m39141m(Matrix matrix, RectF rectF, RectF rectF2, C2066l.EnumC2071e eVar) {
        Matrix.ScaleToFit scaleToFit;
        boolean z;
        switch (C2060a.f2324a[eVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C1915r1.m39525c("PreviewTransform", "Unexpected crop rect: " + eVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (eVar == C2066l.EnumC2071e.FIT_CENTER || eVar == C2066l.EnumC2071e.FIT_START || eVar == C2066l.EnumC2071e.FIT_END) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m39153a(Bitmap bitmap, Size size, int i) {
        if (!m39143k()) {
            return bitmap;
        }
        Matrix i2 = m39145i();
        RectF j = m39144j(size, i);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(i2);
        matrix.postScale(j.width() / this.f2318a.getWidth(), j.height() / this.f2318a.getHeight());
        matrix.postTranslate(j.left, j.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Matrix m39151c(Size size, int i) {
        if (!m39143k()) {
            return null;
        }
        Matrix matrix = new Matrix();
        m39146h(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f2318a.getWidth(), this.f2318a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: d */
    RectF m39150d(Size size, int i) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size e = m39149e();
        RectF rectF2 = new RectF(0.0f, 0.0f, e.getWidth(), e.getHeight());
        Matrix matrix = new Matrix();
        m39141m(matrix, rectF2, rectF, this.f2323f);
        matrix.mapRect(rectF2);
        if (i == 1) {
            return m39152b(rectF2, size.getWidth() / 2.0f);
        }
        return rectF2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C2066l.EnumC2071e m39148f() {
        return this.f2323f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Rect m39147g() {
        return this.f2319b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Matrix m39146h(Size size, int i) {
        RectF rectF;
        C2517g.m37586i(m39143k());
        if (m39142l(size)) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            rectF = m39150d(size, i);
        }
        Matrix c = C2053b0.m39170c(new RectF(this.f2319b), rectF, this.f2320c);
        if (this.f2322e) {
            if (C2053b0.m39169d(this.f2320c)) {
                c.preScale(1.0f, -1.0f, this.f2319b.centerX(), this.f2319b.centerY());
            } else {
                c.preScale(-1.0f, 1.0f, this.f2319b.centerX(), this.f2319b.centerY());
            }
        }
        return c;
    }

    /* renamed from: i */
    Matrix m39145i() {
        C2517g.m37586i(m39143k());
        RectF rectF = new RectF(0.0f, 0.0f, this.f2318a.getWidth(), this.f2318a.getHeight());
        return C2053b0.m39170c(rectF, rectF, -C2053b0.m39167f(this.f2321d));
    }

    /* renamed from: l */
    boolean m39142l(Size size) {
        return C2053b0.m39168e(size, true, m39149e(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m39140n(C2066l.EnumC2071e eVar) {
        this.f2323f = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: o */
    public void m39139o(C1936v2.AbstractC1943g gVar, Size size, boolean z) {
        C1915r1.m39527a("PreviewTransform", "Transformation info set: " + gVar + " " + size + " " + z);
        this.f2319b = gVar.mo39450a();
        this.f2320c = gVar.mo39449b();
        this.f2321d = gVar.mo39448c();
        this.f2318a = size;
        this.f2322e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m39138p(Size size, int i, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            C1915r1.m39517k("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        } else if (m39143k()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(m39145i());
            } else {
                Display display = view.getDisplay();
                if (!(display == null || display.getRotation() == this.f2321d)) {
                    C1915r1.m39525c("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF j = m39144j(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(j.width() / this.f2318a.getWidth());
            view.setScaleY(j.height() / this.f2318a.getHeight());
            view.setTranslationX(j.left - view.getLeft());
            view.setTranslationY(j.top - view.getTop());
        }
    }
}
