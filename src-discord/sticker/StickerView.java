package com.discord.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.discord.image.animated_image.apng.APNGImageView;
import com.discord.image.animated_image.apng.APNGView;
import com.discord.sticker.sticker_types.PNGStickerView;
import com.discord.sticker.sticker_types.RLottieImageView;
import com.discord.sticker.sticker_types.RLottieStubView;
import com.discord.sticker.sticker_types.RLottieUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ/\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J6\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0007J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u000eJ\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discord/sticker/StickerView;", "Lcom/discord/image/animated_image/apng/APNGImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lottieView", "Landroid/view/View;", "pngView", "Lcom/discord/sticker/sticker_types/PNGStickerView;", "asApng", "", "url", "", "widthDp", "heightDp", "animate", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "asGif", "asLottie", "asset", "renderMode", "asPng", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "inflateLottieView", "inflatePngView", "recycleChild", "child", "sticker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StickerView extends APNGImageView {
    private View lottieView;
    private PNGStickerView pngView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ StickerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void asApng(String url, Integer num, Integer num2, boolean z10) {
        q.g(url, "url");
        APNGImageView.inflateApngView$default(this, false, 1, null);
        getApngView().loadImage(new APNGView.Config(url, z10, false, num, num2, "stickers", 4, null));
        APNGImageView.resetViews$default(this, getApngView(), false, 2, null);
    }

    public final void asGif(String url, Integer num, Integer num2, boolean z10) {
        q.g(url, "url");
        inflatePngView();
        PNGStickerView pNGStickerView = this.pngView;
        if (pNGStickerView == null) {
            q.y("pngView");
            pNGStickerView = null;
        }
        pNGStickerView.loadGifImage(url, num, num2, z10);
        PNGStickerView pNGStickerView2 = this.pngView;
        if (pNGStickerView2 == null) {
            q.y("pngView");
            pNGStickerView2 = null;
        }
        APNGImageView.resetViews$default(this, pNGStickerView2, false, 2, null);
    }

    public final void asLottie(String url, int i10, int i11, boolean z10, String asset, int i12) {
        RLottieImageView rLottieImageView;
        q.g(url, "url");
        q.g(asset, "asset");
        inflateLottieView();
        View view = this.lottieView;
        if (view == null) {
            q.y("lottieView");
            view = null;
        }
        if (view instanceof RLottieImageView) {
            rLottieImageView = (RLottieImageView) view;
        } else {
            rLottieImageView = null;
        }
        if (rLottieImageView != null) {
            rLottieImageView.loadImage(new RLottieImageView.Config(url, z10, i10, i11, asset, i12));
            APNGImageView.resetViews$default(this, rLottieImageView, false, 2, null);
        }
    }

    public final void asPng(String url, Integer num, Integer num2) {
        q.g(url, "url");
        inflatePngView();
        PNGStickerView pNGStickerView = this.pngView;
        if (pNGStickerView == null) {
            q.y("pngView");
            pNGStickerView = null;
        }
        pNGStickerView.loadImage(url, num, num2);
        PNGStickerView pNGStickerView2 = this.pngView;
        if (pNGStickerView2 == null) {
            q.y("pngView");
            pNGStickerView2 = null;
        }
        APNGImageView.resetViews$default(this, pNGStickerView2, false, 2, null);
    }

    public final void inflateLottieView() {
        if (this.lottieView == null) {
            View view = null;
            if (RLottieUtils.INSTANCE.getInitialized$sticker_release()) {
                Context context = getContext();
                q.f(context, "context");
                RLottieImageView rLottieImageView = new RLottieImageView(context);
                RLottieImageView.recycle$default(rLottieImageView, false, 1, null);
                this.lottieView = rLottieImageView;
            } else {
                Context context2 = getContext();
                q.f(context2, "context");
                this.lottieView = new RLottieStubView(context2);
            }
            View view2 = this.lottieView;
            if (view2 == null) {
                q.y("lottieView");
            } else {
                view = view2;
            }
            addView(view);
        }
    }

    public final void inflatePngView() {
        if (this.pngView == null) {
            Context context = getContext();
            q.f(context, "context");
            PNGStickerView pNGStickerView = new PNGStickerView(context);
            this.pngView = pNGStickerView;
            addView(pNGStickerView);
        }
    }

    @Override // com.discord.image.animated_image.apng.APNGImageView
    public void recycleChild(View child) {
        RLottieImageView rLottieImageView;
        q.g(child, "child");
        super.recycleChild(child);
        if (child instanceof RLottieImageView) {
            rLottieImageView = (RLottieImageView) child;
        } else {
            rLottieImageView = null;
        }
        if (rLottieImageView != null) {
            rLottieImageView.recycle(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
    }
}
