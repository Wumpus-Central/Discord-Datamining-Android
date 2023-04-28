package com.discord.sticker.sticker_types;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.rlottie.RLottieDrawable;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10230y0;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/sticker/sticker_types/RLottieImageView;", "Lcom/discord/rlottie/RLottieImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/ShapeDrawable;", "rLottieStateManager", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "fetchSticker", "", "config", "loadImage", "onAttachedToWindow", "onDetachedFromWindow", "recycle", "resetState", "", "Config", "sticker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class RLottieImageView extends com.discord.rlottie.RLottieImageView {
    private final ShapeDrawable placeholder;
    private final AnimatedImageStateManager<Config> rLottieStateManager = new AnimatedImageStateManager<>(new RLottieImageView$rLottieStateManager$1(this), new RLottieImageView$rLottieStateManager$2(this), new RLottieImageView$rLottieStateManager$3(this), new RLottieImageView$rLottieStateManager$4(this), new RLottieImageView$rLottieStateManager$5(this));

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, m15073d2 = {"Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "", "url", "", "animate", "", "widthDp", "", "heightDp", "asset", "renderMode", "(Ljava/lang/String;ZIILjava/lang/String;I)V", "getAnimate", "()Z", "getAsset", "()Ljava/lang/String;", "getHeightDp", "()I", "getRenderMode", "getUrl", "getWidthDp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "sticker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Config {
        private final boolean animate;
        private final String asset;
        private final int heightDp;
        private final int renderMode;
        private final String url;
        private final int widthDp;

        public Config(String url, boolean z, int i, int i2, String asset, int i3) {
            C9971q.m14633g(url, "url");
            C9971q.m14633g(asset, "asset");
            this.url = url;
            this.animate = z;
            this.widthDp = i;
            this.heightDp = i2;
            this.asset = asset;
            this.renderMode = i3;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, boolean z, int i, int i2, String str2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = config.url;
            }
            if ((i4 & 2) != 0) {
                z = config.animate;
            }
            if ((i4 & 4) != 0) {
                i = config.widthDp;
            }
            if ((i4 & 8) != 0) {
                i2 = config.heightDp;
            }
            if ((i4 & 16) != 0) {
                str2 = config.asset;
            }
            if ((i4 & 32) != 0) {
                i3 = config.renderMode;
            }
            return config.copy(str, z, i, i2, str2, i3);
        }

        public final String component1() {
            return this.url;
        }

        public final boolean component2() {
            return this.animate;
        }

        public final int component3() {
            return this.widthDp;
        }

        public final int component4() {
            return this.heightDp;
        }

        public final String component5() {
            return this.asset;
        }

        public final int component6() {
            return this.renderMode;
        }

        public final Config copy(String url, boolean z, int i, int i2, String asset, int i3) {
            C9971q.m14633g(url, "url");
            C9971q.m14633g(asset, "asset");
            return new Config(url, z, i, i2, asset, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return C9971q.m14638b(this.url, config.url) && this.animate == config.animate && this.widthDp == config.widthDp && this.heightDp == config.heightDp && C9971q.m14638b(this.asset, config.asset) && this.renderMode == config.renderMode;
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        public final String getAsset() {
            return this.asset;
        }

        public final int getHeightDp() {
            return this.heightDp;
        }

        public final int getRenderMode() {
            return this.renderMode;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getWidthDp() {
            return this.widthDp;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            boolean z = this.animate;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return ((((((((hashCode + i) * 31) + this.widthDp) * 31) + this.heightDp) * 31) + this.asset.hashCode()) * 31) + this.renderMode;
        }

        public String toString() {
            String str = this.url;
            boolean z = this.animate;
            int i = this.widthDp;
            int i2 = this.heightDp;
            String str2 = this.asset;
            int i3 = this.renderMode;
            return "Config(url=" + str + ", animate=" + z + ", widthDp=" + i + ", heightDp=" + i2 + ", asset=" + str2 + ", renderMode=" + i3 + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieImageView(Context context) {
        super(context);
        C9971q.m14633g(context, "context");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
        this.placeholder = shapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchSticker(Config config) {
        C10129j.m14195d(CoroutineViewUtilsKt.getAttachedScope(this), C10230y0.m13946b(), null, new RLottieImageView$fetchSticker$1(this, config, null), 2, null);
    }

    public static /* synthetic */ void recycle$default(RLottieImageView rLottieImageView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        rLottieImageView.recycle(z);
    }

    public final void loadImage(Config config) {
        C9971q.m14633g(config, "config");
        this.rLottieStateManager.onTryFetch(config);
    }

    @Override // com.discord.rlottie.RLottieImageView, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rLottieStateManager.onAttachedToWindow();
    }

    @Override // com.discord.rlottie.RLottieImageView, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rLottieStateManager.onDetachedFromWindow();
    }

    public final void recycle(boolean z) {
        Drawable drawable = getDrawable();
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            rLottieDrawable.stop();
            rLottieDrawable.recycle();
        }
        setImageDrawable(null);
        if (z) {
            this.rLottieStateManager.reset();
        }
        setBackground(this.placeholder);
    }
}
