package com.discord.core;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.l;
import l3.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\f\u0010\u0016\u001a\u00020\u000e*\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/core/LocalImageThumbnailView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Landroid/widget/ImageView;", "simpleDraweeView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "setLocalImageSource", "", "uri", "Landroid/net/Uri;", "widthDp", "heightDp", "toggleImages", "showSimpleDraweeView", "", "addToParent", "Landroid/view/View;", "loadDefaultBitmap", "Companion", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class LocalImageThumbnailView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_SIZE = 200;
    private ImageView imageView;
    private SimpleDraweeView simpleDraweeView;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/core/LocalImageThumbnailView$Companion;", "", "()V", "DEFAULT_SIZE", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public LocalImageThumbnailView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public LocalImageThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  LocalImageThumbnailView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void addToParent(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
    }

    
    public final void loadDefaultBitmap(SimpleDraweeView simpleDraweeView, Uri uri) {
        simpleDraweeView.setController(c.g().D(ImageRequestBuilder.s(uri).E(ResizeOptions.a(simpleDraweeView.getWidth(), simpleDraweeView.getHeight())).a()).build());
    }

    
    public final void toggleImages(boolean z10) {
        int i10;
        SimpleDraweeView simpleDraweeView = this.simpleDraweeView;
        int i11 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        simpleDraweeView.setVisibility(i10);
        ImageView imageView = this.imageView;
        if (!(!z10)) {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    public final void setLocalImageSource(Uri uri, int i10, int i11) {
        q.h(uri, "uri");
        l.d(CoroutineViewUtilsKt.getAttachedScope(this), a1.b(), null, new LocalImageThumbnailView$setLocalImageSource$1(i10, i11, this, uri, null), 2, null);
    }

    
    public LocalImageThumbnailView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        ImageView imageView = new ImageView(context);
        addToParent(imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        addToParent(simpleDraweeView);
        simpleDraweeView.getHierarchy().t(ScalingUtils.ScaleType.f7772i);
        this.simpleDraweeView = simpleDraweeView;
    }
}
