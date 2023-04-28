package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.C1696n;
import p001if.c;
import p139hf.AbstractC8011b;
import p200kf.C9854a;
import p200kf.C9857d;
import p200kf.C9863g;

/* renamed from: com.yalantis.ucrop.view.b */
/* loaded from: classes8.dex */
public class C6376b extends C1696n {

    /* renamed from: k */
    protected final float[] f13060k;

    /* renamed from: l */
    protected final float[] f13061l;

    /* renamed from: m */
    private final float[] f13062m;

    /* renamed from: n */
    protected Matrix f13063n;

    /* renamed from: o */
    protected int f13064o;

    /* renamed from: p */
    protected int f13065p;

    /* renamed from: q */
    protected AbstractC0188b f13066q;

    /* renamed from: r */
    private float[] f13067r;

    /* renamed from: s */
    private float[] f13068s;

    /* renamed from: t */
    protected boolean f13069t;

    /* renamed from: u */
    protected boolean f13070u;

    /* renamed from: v */
    private int f13071v;

    /* renamed from: w */
    private String f13072w;

    /* renamed from: x */
    private String f13073x;

    /* renamed from: y */
    private c f13074y;

    /* renamed from: com.yalantis.ucrop.view.b$a */
    /* loaded from: classes8.dex */
    class C6377a implements AbstractC8011b {
        C6377a() {
        }

        @Override // p139hf.AbstractC8011b
        /* renamed from: a */
        public void mo20858a(Bitmap bitmap, c cVar, String str, String str2) {
            C6376b.this.f13072w = str;
            C6376b.this.f13073x = str2;
            C6376b.this.f13074y = cVar;
            C6376b bVar = C6376b.this;
            bVar.f13069t = true;
            bVar.setImageBitmap(bitmap);
        }

        @Override // p139hf.AbstractC8011b
        public void onFailure(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            AbstractC0188b bVar = C6376b.this.f13066q;
            if (bVar != null) {
                bVar.mo25657b(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b */
    /* loaded from: classes8.dex */
    public interface AbstractC0188b {
        /* renamed from: a */
        void mo25658a();

        /* renamed from: b */
        void mo25657b(Exception exc);

        /* renamed from: c */
        void mo25656c(float f);

        /* renamed from: d */
        void mo25655d(float f);
    }

    public C6376b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: o */
    private void m25659o() {
        this.f13063n.mapPoints(this.f13060k, this.f13067r);
        this.f13063n.mapPoints(this.f13061l, this.f13068s);
    }

    /* renamed from: f */
    public float m25668f(Matrix matrix) {
        return (float) (-(Math.atan2(m25666h(matrix, 1), m25666h(matrix, 0)) * 57.29577951308232d));
    }

    /* renamed from: g */
    public float m25667g(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(m25666h(matrix, 0), 2.0d) + Math.pow(m25666h(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return m25668f(this.f13063n);
    }

    public float getCurrentScale() {
        return m25667g(this.f13063n);
    }

    public c getExifInfo() {
        return this.f13074y;
    }

    public String getImageInputPath() {
        return this.f13072w;
    }

    public String getImageOutputPath() {
        return this.f13073x;
    }

    public int getMaxBitmapSize() {
        if (this.f13071v <= 0) {
            this.f13071v = C9854a.m15197b(getContext());
        }
        return this.f13071v;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C9857d)) {
            return null;
        }
        return ((C9857d) getDrawable()).m15186a();
    }

    /* renamed from: h */
    protected float m25666h(Matrix matrix, int i) {
        matrix.getValues(this.f13062m);
        return this.f13062m[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void mo25665i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void mo25664j() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f13067r = C9863g.m15167b(rectF);
            this.f13068s = C9863g.m15168a(rectF);
            this.f13070u = true;
            AbstractC0188b bVar = this.f13066q;
            if (bVar != null) {
                bVar.mo25658a();
            }
        }
    }

    /* renamed from: k */
    public void m25663k(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f13063n.postRotate(f, f2, f3);
            setImageMatrix(this.f13063n);
            AbstractC0188b bVar = this.f13066q;
            if (bVar != null) {
                bVar.mo25655d(m25668f(this.f13063n));
            }
        }
    }

    /* renamed from: l */
    public void mo25662l(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f13063n.postScale(f, f, f2, f3);
            setImageMatrix(this.f13063n);
            AbstractC0188b bVar = this.f13066q;
            if (bVar != null) {
                bVar.mo25656c(m25667g(this.f13063n));
            }
        }
    }

    /* renamed from: m */
    public void m25661m(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f13063n.postTranslate(f, f2);
            setImageMatrix(this.f13063n);
        }
    }

    /* renamed from: n */
    public void m25660n(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        C9854a.m15195d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new C6377a());
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f13069t && !this.f13070u)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f13064o = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f13065p = (getHeight() - getPaddingBottom()) - paddingTop;
            mo25664j();
        }
    }

    @Override // androidx.appcompat.widget.C1696n, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C9857d(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f13063n.set(matrix);
        m25659o();
    }

    public void setMaxBitmapSize(int i) {
        this.f13071v = i;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(AbstractC0188b bVar) {
        this.f13066q = bVar;
    }

    public C6376b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13060k = new float[8];
        this.f13061l = new float[2];
        this.f13062m = new float[9];
        this.f13063n = new Matrix();
        this.f13069t = false;
        this.f13070u = false;
        this.f13071v = 0;
        mo25665i();
    }
}
