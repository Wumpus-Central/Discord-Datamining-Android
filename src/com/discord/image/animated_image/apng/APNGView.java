package com.discord.image.animated_image.apng;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.appcompat.widget.C1696n;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.linecorp.apng.ApngDrawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.C10139l;
import kotlinx.coroutines.C10230y0;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m15073d2 = {"Lcom/discord/image/animated_image/apng/APNGView;", "Landroidx/appcompat/widget/n;", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "config", "", "fetchAPNG", "playApngAnimation", "pauseApngAnimation", "loadImage", "", "resetState", "showLoading", "recycle", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/graphics/drawable/ShapeDrawable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/ShapeDrawable;", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "apngStateManager", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "Config", "animated_image_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class APNGView extends C1696n {
    public static final Companion Companion = new Companion(null);
    private static final Regex nameRegex = new Regex("(\\w+.png)");
    private final AnimatedImageStateManager<Config> apngStateManager = new AnimatedImageStateManager<>(new APNGView$apngStateManager$1(this), new APNGView$apngStateManager$2(this), new APNGView$apngStateManager$3(this), new APNGView$apngStateManager$4(this), new APNGView$apngStateManager$5(this));
    private final ShapeDrawable placeholder;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m15073d2 = {"Lcom/discord/image/animated_image/apng/APNGView$Companion;", "", "()V", "nameRegex", "Lkotlin/text/Regex;", "getFilename", "", "url", "hasFilename", "", "animated_image_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFilename(String str) {
            List<String> b;
            Object W;
            MatchResult b2 = APNGView.nameRegex.m14588b(str, 0);
            if (!(b2 == null || (b = b2.mo5841b()) == null)) {
                W = C9914r.m14768W(b);
                String str2 = (String) W;
                if (str2 != null) {
                    return str2;
                }
            }
            return "";
        }

        public final boolean hasFilename(String str) {
            boolean w;
            w = C12718u.m5729w(getFilename(str));
            return !w;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView(Context context) {
        super(context);
        C9971q.m14633g(context, "context");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
        this.placeholder = shapeDrawable;
    }

    public final void fetchAPNG(Config config) {
        C10139l.m14174d(CoroutineViewUtilsKt.attachedScope(this, true), C10230y0.m13946b(), null, new APNGView$fetchAPNG$1(this, config, null), 2, null);
    }

    public final void pauseApngAnimation() {
        Drawable drawable = getDrawable();
        ApngDrawable apngDrawable = drawable instanceof ApngDrawable ? (ApngDrawable) drawable : null;
        if (apngDrawable != null) {
            apngDrawable.stop();
        }
    }

    public final void playApngAnimation() {
        Drawable drawable = getDrawable();
        ApngDrawable apngDrawable = drawable instanceof ApngDrawable ? (ApngDrawable) drawable : null;
        if (apngDrawable != null) {
            apngDrawable.start();
        }
    }

    public static /* synthetic */ void recycle$default(APNGView aPNGView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        aPNGView.recycle(z, z2);
    }

    public final void loadImage(Config config) {
        C9971q.m14633g(config, "config");
        this.apngStateManager.onTryFetch(config);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.apngStateManager.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.apngStateManager.onDetachedFromWindow();
    }

    public final void recycle(boolean z, boolean z2) {
        Drawable drawable = getDrawable();
        if (drawable instanceof ApngDrawable) {
            ApngDrawable apngDrawable = (ApngDrawable) drawable;
            apngDrawable.stop();
            apngDrawable.m26488j();
        }
        setImageDrawable(null);
        if (z) {
            this.apngStateManager.reset();
        }
        if (z2) {
            setBackground(this.placeholder);
        }
    }

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011¨\u0006\""}, m15073d2 = {"Lcom/discord/image/animated_image/apng/APNGView$Config;", "", "url", "", "animate", "", "showLoading", "widthDp", "", "heightDp", "cacheDirectory", "(Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAnimate", "()Z", "getCacheDirectory", "()Ljava/lang/String;", "getHeightDp", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowLoading", "getUrl", "getWidthDp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/image/animated_image/apng/APNGView$Config;", "equals", "other", "hashCode", "toString", "animated_image_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Config {
        private final boolean animate;
        private final String cacheDirectory;
        private final Integer heightDp;
        private final boolean showLoading;
        private final String url;
        private final Integer widthDp;

        public Config(String url, boolean z, boolean z2, Integer num, Integer num2, String cacheDirectory) {
            C9971q.m14633g(url, "url");
            C9971q.m14633g(cacheDirectory, "cacheDirectory");
            this.url = url;
            this.animate = z;
            this.showLoading = z2;
            this.widthDp = num;
            this.heightDp = num2;
            this.cacheDirectory = cacheDirectory;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, boolean z, boolean z2, Integer num, Integer num2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = config.url;
            }
            if ((i & 2) != 0) {
                z = config.animate;
            }
            if ((i & 4) != 0) {
                z2 = config.showLoading;
            }
            if ((i & 8) != 0) {
                num = config.widthDp;
            }
            if ((i & 16) != 0) {
                num2 = config.heightDp;
            }
            if ((i & 32) != 0) {
                str2 = config.cacheDirectory;
            }
            return config.copy(str, z, z2, num, num2, str2);
        }

        public final String component1() {
            return this.url;
        }

        public final boolean component2() {
            return this.animate;
        }

        public final boolean component3() {
            return this.showLoading;
        }

        public final Integer component4() {
            return this.widthDp;
        }

        public final Integer component5() {
            return this.heightDp;
        }

        public final String component6() {
            return this.cacheDirectory;
        }

        public final Config copy(String url, boolean z, boolean z2, Integer num, Integer num2, String cacheDirectory) {
            C9971q.m14633g(url, "url");
            C9971q.m14633g(cacheDirectory, "cacheDirectory");
            return new Config(url, z, z2, num, num2, cacheDirectory);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return C9971q.m14638b(this.url, config.url) && this.animate == config.animate && this.showLoading == config.showLoading && C9971q.m14638b(this.widthDp, config.widthDp) && C9971q.m14638b(this.heightDp, config.heightDp) && C9971q.m14638b(this.cacheDirectory, config.cacheDirectory);
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        public final String getCacheDirectory() {
            return this.cacheDirectory;
        }

        public final Integer getHeightDp() {
            return this.heightDp;
        }

        public final boolean getShowLoading() {
            return this.showLoading;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Integer getWidthDp() {
            return this.widthDp;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            boolean z = this.animate;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            boolean z2 = this.showLoading;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            int i6 = (i5 + i) * 31;
            Integer num = this.widthDp;
            int i7 = 0;
            int hashCode2 = (i6 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.heightDp;
            if (num2 != null) {
                i7 = num2.hashCode();
            }
            return ((hashCode2 + i7) * 31) + this.cacheDirectory.hashCode();
        }

        public String toString() {
            String str = this.url;
            boolean z = this.animate;
            boolean z2 = this.showLoading;
            Integer num = this.widthDp;
            Integer num2 = this.heightDp;
            String str2 = this.cacheDirectory;
            return "Config(url=" + str + ", animate=" + z + ", showLoading=" + z2 + ", widthDp=" + num + ", heightDp=" + num2 + ", cacheDirectory=" + str2 + ")";
        }

        public /* synthetic */ Config(String str, boolean z, boolean z2, Integer num, Integer num2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? true : z2, num, num2, str2);
        }
    }
}
