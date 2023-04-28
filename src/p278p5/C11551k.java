package p278p5;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import p292q3.C11988h;

/* renamed from: p5.k */
/* loaded from: classes7.dex */
public class C11551k implements AbstractC11543f {

    /* renamed from: a */
    private static C11551k f25791a;

    protected C11551k() {
    }

    /* renamed from: f */
    public static synchronized C11551k m9392f() {
        C11551k kVar;
        synchronized (C11551k.class) {
            if (f25791a == null) {
                f25791a = new C11551k();
            }
            kVar = f25791a;
        }
        return kVar;
    }

    @Override // p278p5.AbstractC11543f
    /* renamed from: a */
    public CacheKey mo9397a(ImageRequest imageRequest, Object obj) {
        return new C11535b(m9393e(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), null, null, obj);
    }

    @Override // p278p5.AbstractC11543f
    /* renamed from: b */
    public CacheKey mo9396b(ImageRequest imageRequest, Uri uri, Object obj) {
        return new C11988h(m9393e(uri).toString());
    }

    @Override // p278p5.AbstractC11543f
    /* renamed from: c */
    public CacheKey mo9395c(ImageRequest imageRequest, Object obj) {
        String str;
        CacheKey cacheKey;
        Postprocessor postprocessor = imageRequest.getPostprocessor();
        if (postprocessor != null) {
            CacheKey postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            str = postprocessor.getClass().getName();
            cacheKey = postprocessorCacheKey;
        } else {
            cacheKey = null;
            str = null;
        }
        return new C11535b(m9393e(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), cacheKey, str, obj);
    }

    @Override // p278p5.AbstractC11543f
    /* renamed from: d */
    public CacheKey mo9394d(ImageRequest imageRequest, Object obj) {
        return mo9396b(imageRequest, imageRequest.getSourceUri(), obj);
    }

    /* renamed from: e */
    protected Uri m9393e(Uri uri) {
        return uri;
    }
}
