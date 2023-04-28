package com.facebook.react.views.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.RunnableC4811b;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.C4830a;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.C4838b;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.postprocessors.IterativeBoxBlurPostProcessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.yoga.C5126d;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p076e4.C6706f;
import p293q4.C11992c;
import p394w3.C13736i;

/* loaded from: classes7.dex */
public class ReactImageView extends C4838b {
    public static final int REMOTE_IMAGE_FADE_DURATION_MS = 300;
    public static final String REMOTE_TRANSPARENT_BITMAP_URI = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=";
    private static float[] sComputedCornerRadii = new float[4];
    private static final Matrix sTileMatrix = new Matrix();
    private RoundedColorDrawable mBackgroundImageDrawable;
    private int mBorderColor;
    private float[] mBorderCornerRadii;
    private float mBorderWidth;
    private ImageSource mCachedImageSource;
    private Object mCallerContext;
    private ControllerListener mControllerForTesting;
    private Drawable mDefaultImageDrawable;
    private ReactImageDownloadListener mDownloadListener;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private GlobalImageLoadListener mGlobalImageLoadListener;
    private ReadableMap mHeaders;
    private ImageSource mImageSource;
    private boolean mIsDirty;
    private IterativeBoxBlurPostProcessor mIterativeBoxBlurPostProcessor;
    private Drawable mLoadingImageDrawable;
    private int mOverlayColor;
    private boolean mProgressiveRenderingEnabled;
    private TilePostprocessor mTilePostprocessor;
    private boolean mUseSmallCache;
    private RoundingOutlineProvider viewOutlineProvider;
    private ImageResizeMethod mResizeMethod = ImageResizeMethod.AUTO;
    private final List<ImageSource> mSources = new LinkedList();
    private int mBackgroundColor = 0;
    private float mBorderRadius = Float.NaN;
    private ScalingUtils.ScaleType mScaleType = ImageResizeMode.defaultValue();
    private Shader.TileMode mTileMode = ImageResizeMode.defaultTileMode();
    private int mFadeDurationMs = -1;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    /* loaded from: classes7.dex */
    public class RoundingOutlineProvider extends ViewOutlineProvider {
        Float radius;

        private RoundingOutlineProvider() {
            this.radius = Float.valueOf(0.0f);
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class TilePostprocessor extends BasePostprocessor {
        private TilePostprocessor() {
        }

        @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
        public CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.mScaleType.getTransform(ReactImageView.sTileMatrix, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, ReactImageView.this.mTileMode, ReactImageView.this.mTileMode);
            bitmapShader.setLocalMatrix(ReactImageView.sTileMatrix);
            paint.setShader(bitmapShader);
            CloseableReference<Bitmap> a = platformBitmapFactory.m31511a(ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            try {
                new Canvas(a.m32039C()).drawRect(rect, paint);
                return a.clone();
            } finally {
                CloseableReference.m32025t(a);
            }
        }
    }

    public ReactImageView(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, buildHierarchy(context));
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }

    private static GenericDraweeHierarchy buildHierarchy(Context context) {
        C4830a a = C4830a.m31729a(0.0f);
        a.m31711s(true);
        return new GenericDraweeHierarchyBuilder(context.getResources()).m31757K(a).m31755a();
    }

    private void getCornerRadii(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!C5126d.m30596a(this.mBorderRadius)) {
            f = this.mBorderRadius;
        } else {
            f = 0.0f;
        }
        float[] fArr2 = this.mBorderCornerRadii;
        if (fArr2 == null || C5126d.m30596a(fArr2[0])) {
            f2 = f;
        } else {
            f2 = this.mBorderCornerRadii[0];
        }
        fArr[0] = f2;
        float[] fArr3 = this.mBorderCornerRadii;
        if (fArr3 == null || C5126d.m30596a(fArr3[1])) {
            f3 = f;
        } else {
            f3 = this.mBorderCornerRadii[1];
        }
        fArr[1] = f3;
        float[] fArr4 = this.mBorderCornerRadii;
        if (fArr4 == null || C5126d.m30596a(fArr4[2])) {
            f4 = f;
        } else {
            f4 = this.mBorderCornerRadii[2];
        }
        fArr[2] = f4;
        float[] fArr5 = this.mBorderCornerRadii;
        if (fArr5 != null && !C5126d.m30596a(fArr5[3])) {
            f = this.mBorderCornerRadii[3];
        }
        fArr[3] = f;
    }

    private boolean hasMultipleSources() {
        return this.mSources.size() > 1;
    }

    private boolean isTiled() {
        return this.mTileMode != Shader.TileMode.CLAMP;
    }

    private void setSourceImage() {
        this.mImageSource = null;
        if (this.mSources.isEmpty()) {
            this.mSources.add(new ImageSource(getContext(), REMOTE_TRANSPARENT_BITMAP_URI));
        } else if (hasMultipleSources()) {
            MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.mSources);
            this.mImageSource = bestSourceForSize.getBestResult();
            this.mCachedImageSource = bestSourceForSize.getBestResultInCache();
            return;
        }
        this.mImageSource = this.mSources.get(0);
    }

    private boolean shouldResize(ImageSource imageSource) {
        ImageResizeMethod imageResizeMethod = this.mResizeMethod;
        if (imageResizeMethod == ImageResizeMethod.AUTO) {
            if (C6706f.m24600j(imageSource.getUri()) || C6706f.m24599k(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (imageResizeMethod == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    private void warnImageSource(String str) {
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void maybeUpdateView() {
        if (this.mIsDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                ImageSource imageSource = this.mImageSource;
                if (imageSource != null) {
                    boolean shouldResize = shouldResize(imageSource);
                    if (shouldResize && (getWidth() <= 0 || getHeight() <= 0)) {
                        return;
                    }
                    if (!isTiled() || (getWidth() > 0 && getHeight() > 0)) {
                        GenericDraweeHierarchy hierarchy = getHierarchy();
                        hierarchy.m31774t(this.mScaleType);
                        Drawable drawable = this.mDefaultImageDrawable;
                        if (drawable != null) {
                            hierarchy.m31791A(drawable, this.mScaleType);
                        }
                        Drawable drawable2 = this.mLoadingImageDrawable;
                        if (drawable2 != null) {
                            hierarchy.m31791A(drawable2, ScalingUtils.ScaleType.f7709g);
                        }
                        getCornerRadii(sComputedCornerRadii);
                        C4830a o = hierarchy.m31779o();
                        float[] fArr = sComputedCornerRadii;
                        float f = fArr[0];
                        float f2 = fArr[1];
                        ResizeOptions resizeOptions = null;
                        if (f == f2 && f == fArr[2] && f == fArr[3] && f > 0.0f) {
                            if (this.viewOutlineProvider == null) {
                                this.viewOutlineProvider = new RoundingOutlineProvider();
                            }
                            this.viewOutlineProvider.radius = Float.valueOf(sComputedCornerRadii[0]);
                            setClipToOutline(true);
                            setOutlineProvider(this.viewOutlineProvider);
                        } else {
                            o.m31715o(f, f2, fArr[2], fArr[3]);
                        }
                        RoundedColorDrawable roundedColorDrawable = this.mBackgroundImageDrawable;
                        if (roundedColorDrawable != null) {
                            roundedColorDrawable.setBorder(this.mBorderColor, this.mBorderWidth);
                            this.mBackgroundImageDrawable.mo31801g(o.m31726d());
                            hierarchy.m31773u(this.mBackgroundImageDrawable);
                        }
                        o.m31718l(this.mBorderColor, this.mBorderWidth);
                        int i = this.mOverlayColor;
                        if (i != 0) {
                            o.m31713q(i);
                        } else {
                            o.m31709u(C4830a.EnumC0114a.BITMAP_ONLY);
                        }
                        hierarchy.m31788D(o);
                        int i2 = this.mFadeDurationMs;
                        if (i2 < 0) {
                            if (this.mImageSource.isResource()) {
                                i2 = 0;
                            } else {
                                i2 = REMOTE_IMAGE_FADE_DURATION_MS;
                            }
                        }
                        hierarchy.m31771w(i2);
                        LinkedList linkedList = new LinkedList();
                        IterativeBoxBlurPostProcessor iterativeBoxBlurPostProcessor = this.mIterativeBoxBlurPostProcessor;
                        if (iterativeBoxBlurPostProcessor != null) {
                            linkedList.add(iterativeBoxBlurPostProcessor);
                        }
                        TilePostprocessor tilePostprocessor = this.mTilePostprocessor;
                        if (tilePostprocessor != null) {
                            linkedList.add(tilePostprocessor);
                        }
                        Postprocessor from = MultiPostprocessor.from(linkedList);
                        if (shouldResize) {
                            resizeOptions = new ResizeOptions(getWidth(), getHeight());
                        }
                        ImageRequestBuilder B = ImageRequestBuilder.m30874s(this.mImageSource.getUri()).m30902A(from).m30898E(resizeOptions).m30873t(true).m30901B(this.mProgressiveRenderingEnabled);
                        if (this.mUseSmallCache) {
                            B.m30871v(ImageRequest.CacheChoice.SMALL);
                        } else {
                            B.m30871v(ImageRequest.CacheChoice.DEFAULT);
                        }
                        ReactNetworkImageRequest fromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(B, this.mHeaders);
                        GlobalImageLoadListener globalImageLoadListener = this.mGlobalImageLoadListener;
                        if (globalImageLoadListener != null) {
                            globalImageLoadListener.onLoadAttempt(this.mImageSource.getUri());
                        }
                        this.mDraweeControllerBuilder.m31907y();
                        this.mDraweeControllerBuilder.m31906z(true).m31936A(this.mCallerContext).mo3741b(getController()).m31933D(fromBuilderWithHeaders);
                        ImageSource imageSource2 = this.mCachedImageSource;
                        if (imageSource2 != null) {
                            ImageRequestBuilder B2 = ImageRequestBuilder.m30874s(imageSource2.getUri()).m30902A(from).m30898E(resizeOptions).m30873t(true).m30901B(this.mProgressiveRenderingEnabled);
                            if (this.mUseSmallCache) {
                                B2.m30871v(ImageRequest.CacheChoice.SMALL);
                            } else {
                                B2.m30871v(ImageRequest.CacheChoice.DEFAULT);
                            }
                            this.mDraweeControllerBuilder.m31932E(B2.m30892a());
                        }
                        ReactImageDownloadListener reactImageDownloadListener = this.mDownloadListener;
                        if (reactImageDownloadListener == null || this.mControllerForTesting == null) {
                            ControllerListener controllerListener = this.mControllerForTesting;
                            if (controllerListener != null) {
                                this.mDraweeControllerBuilder.m31934C(controllerListener);
                            } else if (reactImageDownloadListener != null) {
                                this.mDraweeControllerBuilder.m31934C(reactImageDownloadListener);
                            }
                        } else {
                            C11992c cVar = new C11992c();
                            cVar.m8057a(this.mDownloadListener);
                            cVar.m8057a(this.mControllerForTesting);
                            this.mDraweeControllerBuilder.m31934C(cVar);
                        }
                        ReactImageDownloadListener reactImageDownloadListener2 = this.mDownloadListener;
                        if (reactImageDownloadListener2 != null) {
                            hierarchy.m31789C(reactImageDownloadListener2);
                        }
                        setController(this.mDraweeControllerBuilder.build());
                        this.mIsDirty = false;
                        this.mDraweeControllerBuilder.m31907y();
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.mIsDirty || hasMultipleSources() || isTiled()) {
                z = true;
            } else {
                z = false;
            }
            this.mIsDirty = z;
            maybeUpdateView();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.mBackgroundColor != i) {
            this.mBackgroundColor = i;
            this.mBackgroundImageDrawable = new RoundedColorDrawable(i);
            this.mIsDirty = true;
        }
    }

    public void setBlurRadius(float f) {
        int pixelFromDIP = ((int) PixelUtil.toPixelFromDIP(f)) / 2;
        if (pixelFromDIP == 0) {
            this.mIterativeBoxBlurPostProcessor = null;
        } else {
            this.mIterativeBoxBlurPostProcessor = new IterativeBoxBlurPostProcessor(2, pixelFromDIP);
        }
        this.mIsDirty = true;
    }

    public void setBorderColor(int i) {
        if (this.mBorderColor != i) {
            this.mBorderColor = i;
            this.mIsDirty = true;
        }
    }

    public void setBorderRadius(float f) {
        if (!FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            this.mBorderRadius = f;
            this.mIsDirty = true;
        }
    }

    public void setBorderWidth(float f) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f);
        if (!FloatUtil.floatsEqual(this.mBorderWidth, pixelFromDIP)) {
            this.mBorderWidth = pixelFromDIP;
            this.mIsDirty = true;
        }
    }

    public void setControllerListener(ControllerListener controllerListener) {
        this.mControllerForTesting = controllerListener;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    public void setDefaultSource(String str) {
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (!C13736i.m2848a(this.mDefaultImageDrawable, resourceDrawable)) {
            this.mDefaultImageDrawable = resourceDrawable;
            this.mIsDirty = true;
        }
    }

    public void setFadeDuration(int i) {
        this.mFadeDurationMs = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        RunnableC4811b bVar;
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new RunnableC4811b(resourceDrawable, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        } else {
            bVar = null;
        }
        if (!C13736i.m2848a(this.mLoadingImageDrawable, bVar)) {
            this.mLoadingImageDrawable = bVar;
            this.mIsDirty = true;
        }
    }

    public void setOverlayColor(int i) {
        if (this.mOverlayColor != i) {
            this.mOverlayColor = i;
            this.mIsDirty = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        if (this.mResizeMethod != imageResizeMethod) {
            this.mResizeMethod = imageResizeMethod;
            this.mIsDirty = true;
        }
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        if (this.mScaleType != scaleType) {
            this.mScaleType = scaleType;
            this.mIsDirty = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        boolean z2;
        if (this.mDownloadListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (!z) {
                this.mDownloadListener = null;
            } else {
                final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) getContext(), getId());
                this.mDownloadListener = new ReactImageDownloadListener<ImageInfo>() { // from class: com.facebook.react.views.image.ReactImageView.1
                    @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                    public void onFailure(String str, Throwable th2) {
                        eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createErrorEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId(), th2));
                    }

                    @Override // com.facebook.react.views.image.ReactImageDownloadListener
                    public void onProgressChange(int i, int i2) {
                        eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createProgressEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId(), ReactImageView.this.mImageSource.getSource(), i, i2));
                    }

                    @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                    public void onSubmit(String str, Object obj) {
                        eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createLoadStartEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId()));
                    }

                    public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
                        if (imageInfo != null) {
                            eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createLoadEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId(), ReactImageView.this.mImageSource.getSource(), imageInfo.getWidth(), imageInfo.getHeight()));
                            eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createLoadEndEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId()));
                        }
                    }
                };
            }
            this.mIsDirty = true;
        }
    }

    public void setSource(ReadableArray readableArray) {
        boolean z;
        double d;
        double d2;
        LinkedList<ImageSource> linkedList = new LinkedList();
        if (readableArray == null || readableArray.size() == 0) {
            linkedList.add(new ImageSource(getContext(), REMOTE_TRANSPARENT_BITMAP_URI));
        } else {
            boolean z2 = false;
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                ImageSource imageSource = new ImageSource(getContext(), string);
                linkedList.add(imageSource);
                if (Uri.EMPTY.equals(imageSource.getUri())) {
                    warnImageSource(string);
                }
            } else {
                int i = 0;
                while (i < readableArray.size()) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString("uri");
                    if (map.hasKey("isForceCached")) {
                        z = map.getBoolean("isForceCached");
                    } else {
                        z = z2;
                    }
                    if (map.hasKey("width")) {
                        d = map.getDouble("width");
                    } else {
                        d = 0.0d;
                    }
                    if (map.hasKey("height")) {
                        d2 = map.getDouble("height");
                    } else {
                        d2 = 0.0d;
                    }
                    ImageSource imageSource2 = new ImageSource(getContext(), string2, d, d2, z);
                    linkedList.add(imageSource2);
                    if (Uri.EMPTY.equals(imageSource2.getUri())) {
                        warnImageSource(string2);
                    }
                    i++;
                    z2 = false;
                }
            }
        }
        if (!this.mSources.equals(linkedList)) {
            this.mSources.clear();
            for (ImageSource imageSource3 : linkedList) {
                this.mSources.add(imageSource3);
            }
            this.mIsDirty = true;
        }
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.mTileMode != tileMode) {
            this.mTileMode = tileMode;
            if (isTiled()) {
                this.mTilePostprocessor = new TilePostprocessor();
            } else {
                this.mTilePostprocessor = null;
            }
            this.mIsDirty = true;
        }
    }

    public void setUseSmallCache(boolean z) {
        if (this.mUseSmallCache != z) {
            this.mUseSmallCache = z;
            this.mIsDirty = true;
        }
    }

    public void updateCallerContext(Object obj) {
        if (!C13736i.m2848a(this.mCallerContext, obj)) {
            this.mCallerContext = obj;
            this.mIsDirty = true;
        }
    }

    public void setBorderRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            float[] fArr = new float[4];
            this.mBorderCornerRadii = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (!FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            this.mBorderCornerRadii[i] = f;
            this.mIsDirty = true;
        }
    }
}
