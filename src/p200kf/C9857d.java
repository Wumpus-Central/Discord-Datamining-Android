package p200kf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: kf.d */
/* loaded from: classes8.dex */
public class C9857d extends Drawable {

    /* renamed from: b */
    private Bitmap f21971b;

    /* renamed from: d */
    private int f21973d;

    /* renamed from: e */
    private int f21974e;

    /* renamed from: a */
    private final Paint f21970a = new Paint(2);

    /* renamed from: c */
    private int f21972c = 255;

    public C9857d(Bitmap bitmap) {
        m15185b(bitmap);
    }

    /* renamed from: a */
    public Bitmap m15186a() {
        return this.f21971b;
    }

    /* renamed from: b */
    public void m15185b(Bitmap bitmap) {
        this.f21971b = bitmap;
        if (bitmap != null) {
            this.f21973d = bitmap.getWidth();
            this.f21974e = this.f21971b.getHeight();
            return;
        }
        this.f21974e = 0;
        this.f21973d = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f21971b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f21971b, (Rect) null, getBounds(), this.f21970a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21972c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f21974e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f21973d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f21974e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f21973d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f21972c = i;
        this.f21970a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21970a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f21970a.setFilterBitmap(z);
    }
}
