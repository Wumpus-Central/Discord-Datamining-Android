package com.facebook.imagepipeline.core;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.C4780c;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.datasource.C4912d;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.AbstractC5001l0;
import com.facebook.imagepipeline.producers.AbstractC5041v0;
import com.facebook.imagepipeline.producers.C5025r0;
import com.facebook.imagepipeline.producers.C5044x;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p278p5.C11538e;
import p314r5.AbstractC12393g;
import p314r5.C12398k;
import p332s3.AbstractC12782a;
import p380v5.AbstractC13432c;
import p394w3.AbstractC13741k;
import p416x5.AbstractC13937d;
import p416x5.C13935b;
import p416x5.C13936c;
import p455z3.AbstractC14535g;

/* loaded from: classes7.dex */
public class ImagePipeline {

    /* renamed from: o */
    private static final CancellationException f8155o = new CancellationException("Prefetching is not enabled");

    /* renamed from: a */
    private final C12398k f8156a;

    /* renamed from: b */
    private final RequestListener f8157b;

    /* renamed from: c */
    private final AbstractC13937d f8158c;

    /* renamed from: d */
    private final Supplier<Boolean> f8159d;

    /* renamed from: e */
    private final AbstractC11564s<CacheKey, AbstractC13432c> f8160e;

    /* renamed from: f */
    private final AbstractC11564s<CacheKey, AbstractC14535g> f8161f;

    /* renamed from: g */
    private final C11538e f8162g;

    /* renamed from: h */
    private final C11538e f8163h;

    /* renamed from: i */
    private final AbstractC11543f f8164i;

    /* renamed from: j */
    private final AbstractC5041v0 f8165j;

    /* renamed from: k */
    private final Supplier<Boolean> f8166k;

    /* renamed from: l */
    private AtomicLong f8167l = new AtomicLong();

    /* renamed from: m */
    private final Supplier<Boolean> f8168m;

    /* renamed from: n */
    private final AbstractC12393g f8169n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipeline$a */
    /* loaded from: classes7.dex */
    public class C4899a implements AbstractC13741k<CacheKey> {
        C4899a() {
        }

        /* renamed from: a */
        public boolean apply(CacheKey cacheKey) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipeline$b */
    /* loaded from: classes7.dex */
    public class C4900b implements AbstractC13741k<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ Uri f8171a;

        C4900b(Uri uri) {
            this.f8171a = uri;
        }

        /* renamed from: a */
        public boolean apply(CacheKey cacheKey) {
            return cacheKey.mo255b(this.f8171a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipeline$c */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C4901c {

        /* renamed from: a */
        static final /* synthetic */ int[] f8173a;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            f8173a = iArr;
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8173a[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ImagePipeline(C12398k kVar, Set<RequestListener> set, Set<AbstractC13937d> set2, Supplier<Boolean> supplier, AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11564s<CacheKey, AbstractC14535g> sVar2, C11538e eVar, C11538e eVar2, AbstractC11543f fVar, AbstractC5041v0 v0Var, Supplier<Boolean> supplier2, Supplier<Boolean> supplier3, AbstractC12782a aVar, AbstractC12393g gVar) {
        this.f8156a = kVar;
        this.f8157b = new C13936c(set);
        this.f8158c = new C13935b(set2);
        this.f8159d = supplier;
        this.f8160e = sVar;
        this.f8161f = sVar2;
        this.f8162g = eVar;
        this.f8163h = eVar2;
        this.f8164i = fVar;
        this.f8165j = v0Var;
        this.f8166k = supplier2;
        this.f8168m = supplier3;
        this.f8169n = gVar;
    }

    /* renamed from: r */
    private AbstractC13741k<CacheKey> m31473r(Uri uri) {
        return new C4900b(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<T>> m31469v(com.facebook.imagepipeline.producers.AbstractC5001l0<com.facebook.common.references.CloseableReference<T>> r15, com.facebook.imagepipeline.request.ImageRequest r16, com.facebook.imagepipeline.request.ImageRequest.RequestLevel r17, java.lang.Object r18, com.facebook.imagepipeline.listener.RequestListener r19, java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            boolean r0 = p007a6.C1271b.m41491d()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            p007a6.C1271b.m41494a(r0)
        L_0x000c:
            com.facebook.imagepipeline.producers.x r0 = new com.facebook.imagepipeline.producers.x
            r3 = r16
            r2 = r19
            com.facebook.imagepipeline.listener.RequestListener r2 = r14.m31479l(r3, r2)
            x5.d r4 = r1.f8158c
            r0.<init>(r2, r4)
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r2 = r16.getLowestPermittedRequestLevel()     // Catch: all -> 0x0061, Exception -> 0x0063
            r4 = r17
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r8 = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.m30905a(r2, r4)     // Catch: all -> 0x0061, Exception -> 0x0063
            com.facebook.imagepipeline.producers.r0 r13 = new com.facebook.imagepipeline.producers.r0     // Catch: all -> 0x0061, Exception -> 0x0063
            java.lang.String r4 = r14.m31482i()     // Catch: all -> 0x0061, Exception -> 0x0063
            r9 = 0
            boolean r2 = r16.getProgressiveRenderingEnabled()     // Catch: all -> 0x0061, Exception -> 0x0063
            if (r2 != 0) goto L_0x003f
            android.net.Uri r2 = r16.getSourceUri()     // Catch: all -> 0x0061, Exception -> 0x0063
            boolean r2 = p076e4.C6706f.m24597m(r2)     // Catch: all -> 0x0061, Exception -> 0x0063
            if (r2 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r2 = 0
            goto L_0x0040
        L_0x003f:
            r2 = 1
        L_0x0040:
            r10 = r2
            com.facebook.imagepipeline.common.Priority r11 = r16.getPriority()     // Catch: all -> 0x0061, Exception -> 0x0063
            r5.g r12 = r1.f8169n     // Catch: all -> 0x0061, Exception -> 0x0063
            r2 = r13
            r3 = r16
            r5 = r20
            r6 = r0
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: all -> 0x0061, Exception -> 0x0063
            r2 = r15
            com.facebook.datasource.DataSource r0 = com.facebook.imagepipeline.datasource.C4911c.m31329I(r15, r13, r0)     // Catch: all -> 0x0061, Exception -> 0x0063
            boolean r2 = p007a6.C1271b.m41491d()
            if (r2 == 0) goto L_0x0060
            p007a6.C1271b.m41493b()
        L_0x0060:
            return r0
        L_0x0061:
            r0 = move-exception
            goto L_0x0072
        L_0x0063:
            r0 = move-exception
            com.facebook.datasource.DataSource r0 = com.facebook.datasource.C4780c.m32000b(r0)     // Catch: all -> 0x0061
            boolean r2 = p007a6.C1271b.m41491d()
            if (r2 == 0) goto L_0x0071
            p007a6.C1271b.m41493b()
        L_0x0071:
            return r0
        L_0x0072:
            boolean r2 = p007a6.C1271b.m41491d()
            if (r2 == 0) goto L_0x007b
            p007a6.C1271b.m41493b()
        L_0x007b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.ImagePipeline.m31469v(com.facebook.imagepipeline.producers.l0, com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.request.ImageRequest$RequestLevel, java.lang.Object, com.facebook.imagepipeline.listener.RequestListener, java.lang.String):com.facebook.datasource.DataSource");
    }

    /* renamed from: w */
    private DataSource<Void> m31468w(AbstractC5001l0<Void> l0Var, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, Priority priority, RequestListener requestListener) {
        C5044x xVar = new C5044x(m31479l(imageRequest, requestListener), this.f8158c);
        try {
            return C4912d.m31324H(l0Var, new C5025r0(imageRequest, m31482i(), xVar, obj, ImageRequest.RequestLevel.m30905a(imageRequest.getLowestPermittedRequestLevel(), requestLevel), true, false, priority, this.f8169n), xVar);
        } catch (Exception e) {
            return C4780c.m32000b(e);
        }
    }

    /* renamed from: a */
    public void m31490a() {
        m31488c();
        m31489b();
    }

    /* renamed from: b */
    public void m31489b() {
        this.f8162g.m9424j();
        this.f8163h.m9424j();
    }

    /* renamed from: c */
    public void m31488c() {
        C4899a aVar = new C4899a();
        this.f8160e.mo9353e(aVar);
        this.f8161f.mo9353e(aVar);
    }

    /* renamed from: d */
    public DataSource<CloseableReference<AbstractC13432c>> m31487d(ImageRequest imageRequest, Object obj) {
        return m31486e(imageRequest, obj, ImageRequest.RequestLevel.FULL_FETCH);
    }

    /* renamed from: e */
    public DataSource<CloseableReference<AbstractC13432c>> m31486e(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        return m31485f(imageRequest, obj, requestLevel, null);
    }

    /* renamed from: f */
    public DataSource<CloseableReference<AbstractC13432c>> m31485f(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener) {
        return m31484g(imageRequest, obj, requestLevel, requestListener, null);
    }

    /* renamed from: g */
    public DataSource<CloseableReference<AbstractC13432c>> m31484g(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener, String str) {
        try {
            return m31469v(this.f8156a.m6880g(imageRequest), imageRequest, requestLevel, obj, requestListener, str);
        } catch (Exception e) {
            return C4780c.m32000b(e);
        }
    }

    /* renamed from: h */
    public DataSource<CloseableReference<AbstractC13432c>> m31483h(ImageRequest imageRequest, Object obj) {
        return m31486e(imageRequest, obj, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
    }

    /* renamed from: i */
    public String m31482i() {
        return String.valueOf(this.f8167l.getAndIncrement());
    }

    /* renamed from: j */
    public AbstractC11564s<CacheKey, AbstractC13432c> m31481j() {
        return this.f8160e;
    }

    /* renamed from: k */
    public AbstractC11543f m31480k() {
        return this.f8164i;
    }

    /* renamed from: l */
    public RequestListener m31479l(ImageRequest imageRequest, RequestListener requestListener) {
        if (requestListener == null) {
            if (imageRequest.getRequestListener() == null) {
                return this.f8157b;
            }
            return new C13936c(this.f8157b, imageRequest.getRequestListener());
        } else if (imageRequest.getRequestListener() == null) {
            return new C13936c(this.f8157b, requestListener);
        } else {
            return new C13936c(this.f8157b, requestListener, imageRequest.getRequestListener());
        }
    }

    /* renamed from: m */
    public boolean m31478m(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f8160e.mo9354d(m31473r(uri));
    }

    /* renamed from: n */
    public boolean m31477n(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        CloseableReference<AbstractC13432c> closeableReference = this.f8160e.get(this.f8164i.mo9397a(imageRequest, null));
        try {
            return CloseableReference.m32036R(closeableReference);
        } finally {
            CloseableReference.m32025t(closeableReference);
        }
    }

    /* renamed from: o */
    public boolean m31476o(Uri uri) {
        if (m31475p(uri, ImageRequest.CacheChoice.SMALL) || m31475p(uri, ImageRequest.CacheChoice.DEFAULT)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m31475p(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        return m31474q(ImageRequestBuilder.m30874s(uri).m30871v(cacheChoice).m30892a());
    }

    /* renamed from: q */
    public boolean m31474q(ImageRequest imageRequest) {
        CacheKey d = this.f8164i.mo9394d(imageRequest, null);
        int i = C4901c.f8173a[imageRequest.getCacheChoice().ordinal()];
        if (i == 1) {
            return this.f8162g.m9422l(d);
        }
        if (i != 2) {
            return false;
        }
        return this.f8163h.m9422l(d);
    }

    /* renamed from: s */
    public DataSource<Void> m31472s(ImageRequest imageRequest, Object obj) {
        return m31471t(imageRequest, obj, Priority.MEDIUM);
    }

    /* renamed from: t */
    public DataSource<Void> m31471t(ImageRequest imageRequest, Object obj, Priority priority) {
        return m31470u(imageRequest, obj, priority, null);
    }

    /* renamed from: u */
    public DataSource<Void> m31470u(ImageRequest imageRequest, Object obj, Priority priority, RequestListener requestListener) {
        if (!this.f8159d.get().booleanValue()) {
            return C4780c.m32000b(f8155o);
        }
        try {
            return m31468w(this.f8156a.m6878i(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, priority, requestListener);
        } catch (Exception e) {
            return C4780c.m32000b(e);
        }
    }
}
