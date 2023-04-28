package p102fb;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: fb.f */
/* loaded from: classes3.dex */
public class C7106f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f15495a = new Matrix();

    public C7106f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f15495a.set(imageView.getImageMatrix());
        return this.f15495a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
