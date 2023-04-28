package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import p076e4.C6706f;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class ImageRequestBuilder {

    /* renamed from: n */
    private RequestListener f8709n;

    /* renamed from: q */
    private int f8712q;

    /* renamed from: a */
    private Uri f8696a = null;

    /* renamed from: b */
    private ImageRequest.RequestLevel f8697b = ImageRequest.RequestLevel.FULL_FETCH;

    /* renamed from: c */
    private ResizeOptions f8698c = null;

    /* renamed from: d */
    private RotationOptions f8699d = null;

    /* renamed from: e */
    private ImageDecodeOptions f8700e = ImageDecodeOptions.m31502a();

    /* renamed from: f */
    private ImageRequest.CacheChoice f8701f = ImageRequest.CacheChoice.DEFAULT;

    /* renamed from: g */
    private boolean f8702g = ImagePipelineConfig.m31465F().m31413a();

    /* renamed from: h */
    private boolean f8703h = false;

    /* renamed from: i */
    private Priority f8704i = Priority.HIGH;

    /* renamed from: j */
    private Postprocessor f8705j = null;

    /* renamed from: k */
    private boolean f8706k = true;

    /* renamed from: l */
    private boolean f8707l = true;

    /* renamed from: m */
    private Boolean f8708m = null;

    /* renamed from: o */
    private BytesRange f8710o = null;

    /* renamed from: p */
    private Boolean f8711p = null;

    /* renamed from: com.facebook.imagepipeline.request.ImageRequestBuilder$a */
    /* loaded from: classes7.dex */
    public static class C5061a extends RuntimeException {
        public C5061a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private ImageRequestBuilder() {
    }

    /* renamed from: b */
    public static ImageRequestBuilder m30891b(ImageRequest imageRequest) {
        return m30874s(imageRequest.getSourceUri()).m30869x(imageRequest.getImageDecodeOptions()).m30872u(imageRequest.getBytesRange()).m30871v(imageRequest.getCacheChoice()).m30868y(imageRequest.getLocalThumbnailPreviewsEnabled()).m30867z(imageRequest.getLowestPermittedRequestLevel()).m30902A(imageRequest.getPostprocessor()).m30901B(imageRequest.getProgressiveRenderingEnabled()).m30899D(imageRequest.getPriority()).m30898E(imageRequest.getResizeOptions()).m30900C(imageRequest.getRequestListener()).m30897F(imageRequest.getRotationOptions()).m30896G(imageRequest.shouldDecodePrefetches()).m30870w(imageRequest.getDelayMs());
    }

    /* renamed from: s */
    public static ImageRequestBuilder m30874s(Uri uri) {
        return new ImageRequestBuilder().m30895H(uri);
    }

    /* renamed from: A */
    public ImageRequestBuilder m30902A(Postprocessor postprocessor) {
        this.f8705j = postprocessor;
        return this;
    }

    /* renamed from: B */
    public ImageRequestBuilder m30901B(boolean z) {
        this.f8702g = z;
        return this;
    }

    /* renamed from: C */
    public ImageRequestBuilder m30900C(RequestListener requestListener) {
        this.f8709n = requestListener;
        return this;
    }

    /* renamed from: D */
    public ImageRequestBuilder m30899D(Priority priority) {
        this.f8704i = priority;
        return this;
    }

    /* renamed from: E */
    public ImageRequestBuilder m30898E(ResizeOptions resizeOptions) {
        this.f8698c = resizeOptions;
        return this;
    }

    /* renamed from: F */
    public ImageRequestBuilder m30897F(RotationOptions rotationOptions) {
        this.f8699d = rotationOptions;
        return this;
    }

    /* renamed from: G */
    public ImageRequestBuilder m30896G(Boolean bool) {
        this.f8708m = bool;
        return this;
    }

    /* renamed from: H */
    public ImageRequestBuilder m30895H(Uri uri) {
        C13740j.m2834g(uri);
        this.f8696a = uri;
        return this;
    }

    /* renamed from: I */
    public Boolean m30894I() {
        return this.f8708m;
    }

    /* renamed from: J */
    protected void m30893J() {
        Uri uri = this.f8696a;
        if (uri != null) {
            if (C6706f.m24598l(uri)) {
                if (!this.f8696a.isAbsolute()) {
                    throw new C5061a("Resource URI path must be absolute.");
                } else if (!this.f8696a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f8696a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new C5061a("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new C5061a("Resource URI must not be empty");
                }
            }
            if (C6706f.m24603g(this.f8696a) && !this.f8696a.isAbsolute()) {
                throw new C5061a("Asset URI path must be absolute.");
            }
            return;
        }
        throw new C5061a("Source must be set!");
    }

    /* renamed from: a */
    public ImageRequest m30892a() {
        m30893J();
        return new ImageRequest(this);
    }

    /* renamed from: c */
    public BytesRange m30890c() {
        return this.f8710o;
    }

    /* renamed from: d */
    public ImageRequest.CacheChoice m30889d() {
        return this.f8701f;
    }

    /* renamed from: e */
    public int m30888e() {
        return this.f8712q;
    }

    /* renamed from: f */
    public ImageDecodeOptions m30887f() {
        return this.f8700e;
    }

    /* renamed from: g */
    public ImageRequest.RequestLevel m30886g() {
        return this.f8697b;
    }

    /* renamed from: h */
    public Postprocessor m30885h() {
        return this.f8705j;
    }

    /* renamed from: i */
    public RequestListener m30884i() {
        return this.f8709n;
    }

    /* renamed from: j */
    public Priority m30883j() {
        return this.f8704i;
    }

    /* renamed from: k */
    public ResizeOptions m30882k() {
        return this.f8698c;
    }

    /* renamed from: l */
    public Boolean m30881l() {
        return this.f8711p;
    }

    /* renamed from: m */
    public RotationOptions m30880m() {
        return this.f8699d;
    }

    /* renamed from: n */
    public Uri m30879n() {
        return this.f8696a;
    }

    /* renamed from: o */
    public boolean m30878o() {
        return this.f8706k && C6706f.m24597m(this.f8696a);
    }

    /* renamed from: p */
    public boolean m30877p() {
        return this.f8703h;
    }

    /* renamed from: q */
    public boolean m30876q() {
        return this.f8707l;
    }

    /* renamed from: r */
    public boolean m30875r() {
        return this.f8702g;
    }

    @Deprecated
    /* renamed from: t */
    public ImageRequestBuilder m30873t(boolean z) {
        if (z) {
            return m30897F(RotationOptions.m31497a());
        }
        return m30897F(RotationOptions.m31494d());
    }

    /* renamed from: u */
    public ImageRequestBuilder m30872u(BytesRange bytesRange) {
        this.f8710o = bytesRange;
        return this;
    }

    /* renamed from: v */
    public ImageRequestBuilder m30871v(ImageRequest.CacheChoice cacheChoice) {
        this.f8701f = cacheChoice;
        return this;
    }

    /* renamed from: w */
    public ImageRequestBuilder m30870w(int i) {
        this.f8712q = i;
        return this;
    }

    /* renamed from: x */
    public ImageRequestBuilder m30869x(ImageDecodeOptions imageDecodeOptions) {
        this.f8700e = imageDecodeOptions;
        return this;
    }

    /* renamed from: y */
    public ImageRequestBuilder m30868y(boolean z) {
        this.f8703h = z;
        return this;
    }

    /* renamed from: z */
    public ImageRequestBuilder m30867z(ImageRequest.RequestLevel requestLevel) {
        this.f8697b = requestLevel;
        return this;
    }
}
