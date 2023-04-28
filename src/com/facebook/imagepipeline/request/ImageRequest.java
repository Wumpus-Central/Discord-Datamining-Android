package com.facebook.imagepipeline.request;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.AbstractC4767Fn;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.listener.RequestListener;
import java.io.File;
import p076e4.C6706f;
import p394w3.C13736i;
import p435y3.C14221a;

/* loaded from: classes7.dex */
public class ImageRequest {
    public static final AbstractC4767Fn<ImageRequest, Uri> REQUEST_TO_URI_FN = new C5060a();
    private static boolean sCacheHashcode;
    private static boolean sUseCachedHashcodeInEquals;
    private final BytesRange mBytesRange;
    private final CacheChoice mCacheChoice;
    private final Boolean mDecodePrefetches;
    private final int mDelayMs;
    private int mHashcode;
    private final ImageDecodeOptions mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final RequestLevel mLowestPermittedRequestLevel;
    private final Postprocessor mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    private final RequestListener mRequestListener;
    private final Priority mRequestPriority;
    private final ResizeOptions mResizeOptions;
    private final Boolean mResizingAllowedOverride;
    private final RotationOptions mRotationOptions;
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType;

    /* loaded from: classes7.dex */
    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    /* loaded from: classes7.dex */
    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: k */
        private int f8695k;

        RequestLevel(int i) {
            this.f8695k = i;
        }

        /* renamed from: a */
        public static RequestLevel m30905a(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.m30904b() > requestLevel2.m30904b() ? requestLevel : requestLevel2;
        }

        /* renamed from: b */
        public int m30904b() {
            return this.f8695k;
        }
    }

    /* renamed from: com.facebook.imagepipeline.request.ImageRequest$a */
    /* loaded from: classes7.dex */
    static class C5060a implements AbstractC4767Fn<ImageRequest, Uri> {
        C5060a() {
        }

        /* renamed from: a */
        public Uri apply(ImageRequest imageRequest) {
            if (imageRequest != null) {
                return imageRequest.getSourceUri();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        RotationOptions rotationOptions;
        this.mCacheChoice = imageRequestBuilder.m30889d();
        Uri n = imageRequestBuilder.m30879n();
        this.mSourceUri = n;
        this.mSourceUriType = getSourceUriType(n);
        this.mProgressiveRenderingEnabled = imageRequestBuilder.m30875r();
        this.mLocalThumbnailPreviewsEnabled = imageRequestBuilder.m30877p();
        this.mImageDecodeOptions = imageRequestBuilder.m30887f();
        this.mResizeOptions = imageRequestBuilder.m30882k();
        if (imageRequestBuilder.m30880m() == null) {
            rotationOptions = RotationOptions.m31497a();
        } else {
            rotationOptions = imageRequestBuilder.m30880m();
        }
        this.mRotationOptions = rotationOptions;
        this.mBytesRange = imageRequestBuilder.m30890c();
        this.mRequestPriority = imageRequestBuilder.m30883j();
        this.mLowestPermittedRequestLevel = imageRequestBuilder.m30886g();
        this.mIsDiskCacheEnabled = imageRequestBuilder.m30878o();
        this.mIsMemoryCacheEnabled = imageRequestBuilder.m30876q();
        this.mDecodePrefetches = imageRequestBuilder.m30894I();
        this.mPostprocessor = imageRequestBuilder.m30885h();
        this.mRequestListener = imageRequestBuilder.m30884i();
        this.mResizingAllowedOverride = imageRequestBuilder.m30881l();
        this.mDelayMs = imageRequestBuilder.m30888e();
    }

    public static ImageRequest fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(C6706f.m24606d(file));
    }

    public static ImageRequest fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m30874s(uri).m30892a();
    }

    public static void setCacheHashcode(boolean z) {
        sCacheHashcode = z;
    }

    public static void setUseCachedHashcodeInEquals(boolean z) {
        sUseCachedHashcodeInEquals = z;
    }

    public boolean equals(Object obj) {
        CacheKey cacheKey;
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (sUseCachedHashcodeInEquals) {
            int i = this.mHashcode;
            int i2 = imageRequest.mHashcode;
            if (!(i == 0 || i2 == 0 || i == i2)) {
                return false;
            }
        }
        if (this.mLocalThumbnailPreviewsEnabled != imageRequest.mLocalThumbnailPreviewsEnabled || this.mIsDiskCacheEnabled != imageRequest.mIsDiskCacheEnabled || this.mIsMemoryCacheEnabled != imageRequest.mIsMemoryCacheEnabled || !C13736i.m2848a(this.mSourceUri, imageRequest.mSourceUri) || !C13736i.m2848a(this.mCacheChoice, imageRequest.mCacheChoice) || !C13736i.m2848a(this.mSourceFile, imageRequest.mSourceFile) || !C13736i.m2848a(this.mBytesRange, imageRequest.mBytesRange) || !C13736i.m2848a(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) || !C13736i.m2848a(this.mResizeOptions, imageRequest.mResizeOptions) || !C13736i.m2848a(this.mRequestPriority, imageRequest.mRequestPriority) || !C13736i.m2848a(this.mLowestPermittedRequestLevel, imageRequest.mLowestPermittedRequestLevel) || !C13736i.m2848a(this.mDecodePrefetches, imageRequest.mDecodePrefetches) || !C13736i.m2848a(this.mResizingAllowedOverride, imageRequest.mResizingAllowedOverride) || !C13736i.m2848a(this.mRotationOptions, imageRequest.mRotationOptions)) {
            return false;
        }
        Postprocessor postprocessor = this.mPostprocessor;
        CacheKey cacheKey2 = null;
        if (postprocessor != null) {
            cacheKey = postprocessor.getPostprocessorCacheKey();
        } else {
            cacheKey = null;
        }
        Postprocessor postprocessor2 = imageRequest.mPostprocessor;
        if (postprocessor2 != null) {
            cacheKey2 = postprocessor2.getPostprocessorCacheKey();
        }
        if (C13736i.m2848a(cacheKey, cacheKey2) && this.mDelayMs == imageRequest.mDelayMs) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.m31491g();
    }

    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        return resizeOptions != null ? resizeOptions.f8142b : RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public int getPreferredWidth() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        return resizeOptions != null ? resizeOptions.f8141a : RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public Priority getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public synchronized File getSourceFile() {
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        return this.mSourceFile;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public int hashCode() {
        int i;
        CacheKey cacheKey;
        boolean z = sCacheHashcode;
        if (z) {
            i = this.mHashcode;
        } else {
            i = 0;
        }
        if (i == 0) {
            Postprocessor postprocessor = this.mPostprocessor;
            if (postprocessor != null) {
                cacheKey = postprocessor.getPostprocessorCacheKey();
            } else {
                cacheKey = null;
            }
            i = C13736i.m2847b(this.mCacheChoice, this.mSourceUri, Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled), this.mBytesRange, this.mRequestPriority, this.mLowestPermittedRequestLevel, Boolean.valueOf(this.mIsDiskCacheEnabled), Boolean.valueOf(this.mIsMemoryCacheEnabled), this.mImageDecodeOptions, this.mDecodePrefetches, this.mResizeOptions, this.mRotationOptions, cacheKey, this.mResizingAllowedOverride, Integer.valueOf(this.mDelayMs));
            if (z) {
                this.mHashcode = i;
            }
        }
        return i;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public String toString() {
        return C13736i.m2846c(this).m2844b("uri", this.mSourceUri).m2844b("cacheChoice", this.mCacheChoice).m2844b("decodeOptions", this.mImageDecodeOptions).m2844b("postprocessor", this.mPostprocessor).m2844b("priority", this.mRequestPriority).m2844b("resizeOptions", this.mResizeOptions).m2844b("rotationOptions", this.mRotationOptions).m2844b("bytesRange", this.mBytesRange).m2844b("resizingAllowedOverride", this.mResizingAllowedOverride).m2843c("progressiveRenderingEnabled", this.mProgressiveRenderingEnabled).m2843c("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).m2844b("lowestPermittedRequestLevel", this.mLowestPermittedRequestLevel).m2843c("isDiskCacheEnabled", this.mIsDiskCacheEnabled).m2843c("isMemoryCacheEnabled", this.mIsMemoryCacheEnabled).m2844b("decodePrefetches", this.mDecodePrefetches).m2845a("delayMs", this.mDelayMs).toString();
    }

    public static ImageRequest fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    private static int getSourceUriType(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C6706f.m24597m(uri)) {
            return 0;
        }
        if (C6706f.m24599k(uri)) {
            return C14221a.m1346c(C14221a.m1347b(uri.getPath())) ? 2 : 3;
        }
        if (C6706f.m24600j(uri)) {
            return 4;
        }
        if (C6706f.m24603g(uri)) {
            return 5;
        }
        if (C6706f.m24598l(uri)) {
            return 6;
        }
        if (C6706f.m24604f(uri)) {
            return 7;
        }
        return C6706f.m24596n(uri) ? 8 : -1;
    }
}
