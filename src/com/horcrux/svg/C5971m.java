package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.datasource.AbstractC4910b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import p208l4.C10338c;
import p359u3.C13190h;
import p380v5.AbstractC13431b;
import p380v5.AbstractC13432c;
import p414x3.C13925a;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.m */
/* loaded from: classes6.dex */
public class C5971m extends RenderableView {

    /* renamed from: k */
    private SVGLength f11963k;

    /* renamed from: l */
    private SVGLength f11964l;

    /* renamed from: m */
    private SVGLength f11965m;

    /* renamed from: n */
    private SVGLength f11966n;

    /* renamed from: o */
    private String f11967o;

    /* renamed from: p */
    private int f11968p;

    /* renamed from: q */
    private int f11969q;

    /* renamed from: r */
    private String f11970r;

    /* renamed from: s */
    private int f11971s;

    /* renamed from: t */
    private final AtomicBoolean f11972t = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.m$a */
    /* loaded from: classes6.dex */
    public class C5972a extends AbstractC4910b {
        C5972a() {
        }

        @Override // com.facebook.datasource.AbstractC4779b
        public void onFailureImpl(DataSource<CloseableReference<AbstractC13432c>> dataSource) {
            C5971m.this.f11972t.set(false);
            C13925a.m2301K(ReactConstants.TAG, dataSource.mo32019c(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        @Override // com.facebook.imagepipeline.datasource.AbstractC4910b
        public void onNewResultImpl(Bitmap bitmap) {
            C5971m.this.f11972t.set(false);
            SvgView svgView = C5971m.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public C5971m(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: b */
    private void m26719b(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.f11968p == 0 || this.f11969q == 0) {
            this.f11968p = bitmap.getWidth();
            this.f11969q = bitmap.getHeight();
        }
        RectF c = m26718c();
        RectF rectF = new RectF(0.0f, 0.0f, this.f11968p, this.f11969q);
        C5990v0.m26557a(rectF, c, this.f11970r, this.f11971s).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    /* renamed from: c */
    private RectF m26718c() {
        double relativeOnWidth = relativeOnWidth(this.f11963k);
        double relativeOnHeight = relativeOnHeight(this.f11964l);
        double relativeOnWidth2 = relativeOnWidth(this.f11965m);
        double relativeOnHeight2 = relativeOnHeight(this.f11966n);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.f11968p * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.f11969q * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    /* renamed from: d */
    private void m26717d(ImagePipeline imagePipeline, ImageRequest imageRequest) {
        this.f11972t.set(true);
        imagePipeline.m31487d(imageRequest, this.mContext).mo32018d(new C5972a(), C13190h.m4376g());
    }

    /* renamed from: r */
    private void m26703r(ImagePipeline imagePipeline, ImageRequest imageRequest, Canvas canvas, Paint paint, float f) {
        DataSource<CloseableReference<AbstractC13432c>> h = imagePipeline.m31483h(imageRequest, this.mContext);
        try {
            try {
                CloseableReference<AbstractC13432c> g = h.mo31326g();
                if (g != null) {
                    try {
                        try {
                            AbstractC13432c C = g.m32039C();
                            if (C instanceof AbstractC13431b) {
                                Bitmap n = ((AbstractC13431b) C).mo3732n();
                                if (n != null) {
                                    m26719b(canvas, paint, n, f);
                                }
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    } finally {
                        CloseableReference.m32025t(g);
                    }
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            h.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        if (!this.f11972t.get()) {
            ImagePipeline a = C10338c.m13589a();
            ImageRequest fromUri = ImageRequest.fromUri(new ImageSource(this.mContext, this.f11967o).getUri());
            if (a.m31477n(fromUri)) {
                m26703r(a, fromUri, canvas, paint, f * this.mOpacity);
            } else {
                m26717d(a, fromUri);
            }
        }
    }

    /* renamed from: e */
    public void m26716e(Dynamic dynamic) {
        this.f11966n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m26715f(Double d) {
        this.f11966n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m26714g(String str) {
        this.f11966n = SVGLength.m26887e(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(m26718c(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    /* renamed from: h */
    public void m26713h(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f11967o = string;
            if (string != null && !string.isEmpty()) {
                if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
                    this.f11968p = 0;
                    this.f11969q = 0;
                } else {
                    this.f11968p = readableMap.getInt("width");
                    this.f11969q = readableMap.getInt("height");
                }
                if (Uri.parse(this.f11967o).getScheme() == null) {
                    ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(this.mContext, this.f11967o);
                }
            }
        }
    }

    /* renamed from: i */
    public void m26712i(Dynamic dynamic) {
        this.f11965m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: j */
    public void m26711j(Double d) {
        this.f11965m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: k */
    public void m26710k(String str) {
        this.f11965m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: l */
    public void m26709l(Dynamic dynamic) {
        this.f11963k = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: m */
    public void m26708m(Double d) {
        this.f11963k = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: n */
    public void m26707n(String str) {
        this.f11963k = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: o */
    public void m26706o(Dynamic dynamic) {
        this.f11964l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: p */
    public void m26705p(Double d) {
        this.f11964l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: q */
    public void m26704q(String str) {
        this.f11964l = SVGLength.m26887e(str);
        invalidate();
    }

    public void setAlign(String str) {
        this.f11970r = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f11971s = i;
        invalidate();
    }
}
