package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import p007a6.C1271b;
import p115g5.AbstractC7415b;
import p208l4.C10340e;
import p240n4.AbstractC10709b;
import p240n4.AbstractC10713f;
import p278p5.AbstractC11543f;
import p361u5.AbstractC13192a;
import p380v5.AbstractC13432c;
import p394w3.C13732e;
import p394w3.C13743m;

/* loaded from: classes7.dex */
public class PipelineDraweeControllerBuilder extends AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<AbstractC13432c>, ImageInfo> {

    /* renamed from: s */
    private final ImagePipeline f7620s;

    /* renamed from: t */
    private final C10340e f7621t;

    /* renamed from: u */
    private C13732e<AbstractC13192a> f7622u;

    /* renamed from: v */
    private AbstractC10709b f7623v;

    /* renamed from: w */
    private AbstractC10713f f7624w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C4790a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7625a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.EnumC4794c.values().length];
            f7625a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.EnumC4794c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7625a[AbstractDraweeControllerBuilder.EnumC4794c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7625a[AbstractDraweeControllerBuilder.EnumC4794c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PipelineDraweeControllerBuilder(Context context, C10340e eVar, ImagePipeline imagePipeline, Set<ControllerListener> set, Set<AbstractC7415b> set2) {
        super(context, set, set2);
        this.f7620s = imagePipeline;
        this.f7621t = eVar;
    }

    /* renamed from: H */
    public static ImageRequest.RequestLevel m31965H(AbstractDraweeControllerBuilder.EnumC4794c cVar) {
        int i = C4790a.f7625a[cVar.ordinal()];
        if (i == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    /* renamed from: I */
    private CacheKey m31964I() {
        ImageRequest n = m31918n();
        AbstractC11543f k = this.f7620s.m31480k();
        if (k == null || n == null) {
            return null;
        }
        if (n.getPostprocessor() != null) {
            return k.mo9395c(n, m31926f());
        }
        return k.mo9397a(n, m31926f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public DataSource<CloseableReference<AbstractC13432c>> mo31923i(DraweeController draweeController, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.EnumC4794c cVar) {
        return this.f7620s.m31484g(imageRequest, obj, m31965H(cVar), m31962K(draweeController), str);
    }

    /* renamed from: K */
    protected RequestListener m31962K(DraweeController draweeController) {
        if (draweeController instanceof C4791a) {
            return ((C4791a) draweeController).m31950m0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public C4791a mo31909w() {
        C4791a aVar;
        if (C1271b.m41491d()) {
            C1271b.m41494a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            DraweeController p = m31916p();
            String e = AbstractDraweeControllerBuilder.m31927e();
            if (p instanceof C4791a) {
                aVar = (C4791a) p;
            } else {
                aVar = this.f7621t.m13579c();
            }
            aVar.m31948o0(m31908x(aVar, e), e, m31964I(), m31926f(), this.f7622u, this.f7623v);
            aVar.m31947p0(this.f7624w, this, C13743m.f30712b);
            return aVar;
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: M */
    public PipelineDraweeControllerBuilder m31960M(AbstractC10713f fVar) {
        this.f7624w = fVar;
        return m31914r();
    }

    /* renamed from: N */
    public PipelineDraweeControllerBuilder mo3742a(Uri uri) {
        if (uri == null) {
            return (PipelineDraweeControllerBuilder) super.m31933D(null);
        }
        return (PipelineDraweeControllerBuilder) super.m31933D(ImageRequestBuilder.m30874s(uri).m30897F(RotationOptions.m31496b()).m30892a());
    }

    /* renamed from: O */
    public PipelineDraweeControllerBuilder m31958O(String str) {
        if (str == null || str.isEmpty()) {
            return (PipelineDraweeControllerBuilder) super.m31933D(ImageRequest.fromUri(str));
        }
        return mo3742a(Uri.parse(str));
    }
}
