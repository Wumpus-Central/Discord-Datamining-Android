package com.discord.activity_invites;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.activity_invites.databinding.ActivityInviteEmbedViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9610j;
import kotlin.collections.C9611k;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C10839n;
import nf.EnumC10842p;
import p076e4.C6139f;
import p209l4.C10061c;

@Metadata(m15074d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0002Jn\u0010\u001b\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&J\u001a\u0010'\u001a\u00020\u00192\u0010\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010 H\u0002J\u001c\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0001\u0010,\u001a\u00020\u0007H\u0002J\u0012\u0010-\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0016H\u0016J \u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0016H\u0002J\u0012\u00105\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010+H\u0002J\u0012\u00106\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0012\u00107\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010+H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u00069"}, m15073d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;", "grayscalePostprocessor", "Lcom/facebook/imagepipeline/request/Postprocessor;", "getGrayscalePostprocessor", "()Lcom/facebook/imagepipeline/request/Postprocessor;", "grayscalePostprocessor$delegate", "Lkotlin/Lazy;", "buildImageConfig", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "imageUri", "", "listening", "", "joinable", "configureImage", "", "imageConfig", "setActivityInviteEmbed", "isListening", "headerText", "partyStatus", "avatarsToRender", "", "maxPartySize", "name", "subtext", "ctaText", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "setAvatars", "avatars", "setBottomEndLabel", "text", "", ViewProps.COLOR, "setButtonText", "buttonText", "setEnabled", ViewProps.ENABLED, "setEndImage", "uri", "fullSize", "grayscale", "setHeaderText", "setHeroText", "setSubtext", "ImageConfig", "activity_invites_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class ActivityInviteEmbedView extends ConstraintLayout {
    private final ActivityInviteEmbedViewBinding binding;
    private final Lazy grayscalePostprocessor$delegate;

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m15073d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "", "()V", "End", "None", "Start", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$End;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$None;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$Start;", "activity_invites_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    private static abstract class ImageConfig {

        @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m15073d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$End;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "uri", "", "fullSize", "", "grayscale", "(Ljava/lang/String;ZZ)V", "getFullSize", "()Z", "getGrayscale", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "activity_invites_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes.dex */
        public static final class End extends ImageConfig {
            private final boolean fullSize;
            private final boolean grayscale;
            private final String uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public End(String uri, boolean z, boolean z2) {
                super(null);
                C9677q.m14633g(uri, "uri");
                this.uri = uri;
                this.fullSize = z;
                this.grayscale = z2;
            }

            public static /* synthetic */ End copy$default(End end, String str, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = end.uri;
                }
                if ((i & 2) != 0) {
                    z = end.fullSize;
                }
                if ((i & 4) != 0) {
                    z2 = end.grayscale;
                }
                return end.copy(str, z, z2);
            }

            public final String component1() {
                return this.uri;
            }

            public final boolean component2() {
                return this.fullSize;
            }

            public final boolean component3() {
                return this.grayscale;
            }

            public final End copy(String uri, boolean z, boolean z2) {
                C9677q.m14633g(uri, "uri");
                return new End(uri, z, z2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof End)) {
                    return false;
                }
                End end = (End) obj;
                return C9677q.m14638b(this.uri, end.uri) && this.fullSize == end.fullSize && this.grayscale == end.grayscale;
            }

            public final boolean getFullSize() {
                return this.fullSize;
            }

            public final boolean getGrayscale() {
                return this.grayscale;
            }

            public final String getUri() {
                return this.uri;
            }

            public int hashCode() {
                int hashCode = this.uri.hashCode() * 31;
                boolean z = this.fullSize;
                int i = 1;
                if (z) {
                    z = true;
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = (hashCode + i2) * 31;
                boolean z2 = this.grayscale;
                if (!z2) {
                    i = z2 ? 1 : 0;
                }
                return i5 + i;
            }

            public String toString() {
                String str = this.uri;
                boolean z = this.fullSize;
                boolean z2 = this.grayscale;
                return "End(uri=" + str + ", fullSize=" + z + ", grayscale=" + z2 + ")";
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$None;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "()V", "activity_invites_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes.dex */
        public static final class None extends ImageConfig {
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$Start;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "uri", "", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "activity_invites_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes.dex */
        public static final class Start extends ImageConfig {
            private final String uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(String uri) {
                super(null);
                C9677q.m14633g(uri, "uri");
                this.uri = uri;
            }

            public static /* synthetic */ Start copy$default(Start start, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = start.uri;
                }
                return start.copy(str);
            }

            public final String component1() {
                return this.uri;
            }

            public final Start copy(String uri) {
                C9677q.m14633g(uri, "uri");
                return new Start(uri);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Start) && C9677q.m14638b(this.uri, ((Start) obj).uri);
            }

            public final String getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.uri.hashCode();
            }

            public String toString() {
                String str = this.uri;
                return "Start(uri=" + str + ")";
            }
        }

        private ImageConfig() {
        }

        public /* synthetic */ ImageConfig(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityInviteEmbedView(Context context) {
        this(context, null, 0, 6, null);
        C9677q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityInviteEmbedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ ActivityInviteEmbedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final ImageConfig buildImageConfig(String str, boolean z, boolean z2) {
        ImageConfig end;
        if (str == null) {
            return ImageConfig.None.INSTANCE;
        }
        if (z && z2) {
            end = new ImageConfig.Start(str);
        } else if (z && !z2) {
            end = new ImageConfig.End(str, false, false);
        } else if (!z && z2) {
            end = new ImageConfig.End(str, true, false);
        } else if (z || z2) {
            throw new IllegalStateException("this can never happen.".toString());
        } else {
            end = new ImageConfig.End(str, true, true);
        }
        return end;
    }

    private final void configureImage(ImageConfig imageConfig) {
        int i;
        if (imageConfig instanceof ImageConfig.None) {
            View view = this.binding.bgGradient;
            C9677q.m14634f(view, "binding.bgGradient");
            view.setVisibility(8);
            SimpleDraweeView simpleDraweeView = this.binding.endImage;
            C9677q.m14634f(simpleDraweeView, "binding.endImage");
            simpleDraweeView.setVisibility(8);
            SimpleDraweeView simpleDraweeView2 = this.binding.startImage;
            C9677q.m14634f(simpleDraweeView2, "binding.startImage");
            simpleDraweeView2.setVisibility(8);
        } else if (imageConfig instanceof ImageConfig.Start) {
            View view2 = this.binding.bgGradient;
            C9677q.m14634f(view2, "binding.bgGradient");
            view2.setVisibility(8);
            SimpleDraweeView simpleDraweeView3 = this.binding.startImage;
            C9677q.m14634f(simpleDraweeView3, "binding.startImage");
            simpleDraweeView3.setVisibility(0);
            SimpleDraweeView simpleDraweeView4 = this.binding.endImage;
            C9677q.m14634f(simpleDraweeView4, "binding.endImage");
            simpleDraweeView4.setVisibility(8);
            this.binding.startImage.setImageURI(((ImageConfig.Start) imageConfig).getUri());
        } else if (imageConfig instanceof ImageConfig.End) {
            View view3 = this.binding.bgGradient;
            C9677q.m14634f(view3, "binding.bgGradient");
            ImageConfig.End end = (ImageConfig.End) imageConfig;
            if (end.getFullSize()) {
                i = 0;
            } else {
                i = 8;
            }
            view3.setVisibility(i);
            SimpleDraweeView simpleDraweeView5 = this.binding.startImage;
            C9677q.m14634f(simpleDraweeView5, "binding.startImage");
            simpleDraweeView5.setVisibility(8);
            SimpleDraweeView simpleDraweeView6 = this.binding.endImage;
            C9677q.m14634f(simpleDraweeView6, "binding.endImage");
            simpleDraweeView6.setVisibility(0);
            setEndImage(end.getUri(), end.getFullSize(), end.getGrayscale());
        }
    }

    private final Postprocessor getGrayscalePostprocessor() {
        return (Postprocessor) this.grayscalePostprocessor$delegate.getValue();
    }

    private final void setAvatars(List<String> list) {
        int i;
        int t;
        if (list == null) {
            list = C9610j.m14820i();
        }
        OverlappingCirclesView overlappingCirclesView = this.binding.avatars;
        C9677q.m14634f(overlappingCirclesView, "binding.avatars");
        if (!list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        overlappingCirclesView.setVisibility(i);
        OverlappingCirclesView overlappingCirclesView2 = this.binding.avatars;
        t = C9611k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (String str : list) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView2.setItems(arrayList);
    }

    private final void setBottomEndLabel(CharSequence charSequence, int i) {
        TextView textView = this.binding.bottomEndLabel;
        C9677q.m14634f(textView, "binding.bottomEndLabel");
        ViewUtilsKt.setOptionalText(textView, charSequence);
        this.binding.bottomEndLabel.setTextColor(i);
    }

    private final void setButtonText(String str) {
        this.binding.button.setText(str);
    }

    private final void setEndImage(String str, boolean z, boolean z2) {
        if (z) {
            SimpleDraweeView simpleDraweeView = this.binding.endImage;
            C9677q.m14634f(simpleDraweeView, "binding.endImage");
            ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                layoutParams2.setMarginEnd(0);
                simpleDraweeView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            SimpleDraweeView simpleDraweeView2 = this.binding.endImage;
            C9677q.m14634f(simpleDraweeView2, "binding.endImage");
            ViewGroup.LayoutParams layoutParams3 = simpleDraweeView2.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).width = SizeUtilsKt.getDpToPx(64);
                ((ViewGroup.MarginLayoutParams) layoutParams4).height = SizeUtilsKt.getDpToPx(64);
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = SizeUtilsKt.getDpToPx(16);
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = SizeUtilsKt.getDpToPx(16);
                layoutParams4.setMarginEnd(SizeUtilsKt.getDpToPx(8));
                simpleDraweeView2.setLayoutParams(layoutParams4);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        ImageRequestBuilder s = ImageRequestBuilder.m30874s(C6139f.m24595o(str));
        if (z2) {
            s.m30902A(getGrayscalePostprocessor());
        }
        this.binding.endImage.setController(C10061c.m13583g().m31933D(s.m30892a()).build());
    }

    private final void setHeaderText(CharSequence charSequence) {
        TextView textView = this.binding.header;
        C9677q.m14634f(textView, "binding.header");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    private final void setHeroText(CharSequence charSequence) {
        TextView textView = this.binding.heroText;
        C9677q.m14634f(textView, "binding.heroText");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    private final void setSubtext(CharSequence charSequence) {
        TextView textView = this.binding.subtext;
        C9677q.m14634f(textView, "binding.subtext");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r4.getGrayscale() != false) goto L_0x005f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setActivityInviteEmbed(java.lang.String r1, boolean r2, java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5, int r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, android.view.View.OnClickListener r11) {
        /*
            r0 = this;
            java.lang.String r6 = "headerText"
            kotlin.jvm.internal.C9677q.m14633g(r3, r6)
            java.lang.String r6 = "partyStatus"
            kotlin.jvm.internal.C9677q.m14633g(r4, r6)
            java.lang.String r6 = "ctaText"
            kotlin.jvm.internal.C9677q.m14633g(r10, r6)
            java.lang.String r6 = "onButtonClickListener"
            kotlin.jvm.internal.C9677q.m14633g(r11, r6)
            r0.setHeaderText(r3)
            r0.setButtonText(r10)
            r0.setAvatars(r5)
            r0.setSubtext(r8)
            com.discord.activity_invites.ActivityInviteEmbedView$ImageConfig r1 = r0.buildImageConfig(r1, r2, r9)
            r2 = 1
            if (r9 == 0) goto L_0x0043
            r0.setEnabled(r2)
            r0.setHeroText(r7)
            com.discord.activity_invites.databinding.ActivityInviteEmbedViewBinding r2 = r0.binding
            android.widget.TextView r2 = r2.bottomEndLabel
            java.lang.String r3 = "binding.bottomEndLabel"
            kotlin.jvm.internal.C9677q.m14634f(r2, r3)
            r3 = 8
            r2.setVisibility(r3)
            com.discord.activity_invites.databinding.ActivityInviteEmbedViewBinding r2 = r0.binding
            com.discord.core.DCDButton r2 = r2.button
            r2.setOnClickButtonListener(r11)
            goto L_0x0076
        L_0x0043:
            r3 = 0
            r0.setEnabled(r3)
            r0.setHeroText(r4)
            boolean r4 = r1 instanceof com.discord.activity_invites.ActivityInviteEmbedView.ImageConfig.End
            if (r4 == 0) goto L_0x005e
            r4 = r1
            com.discord.activity_invites.ActivityInviteEmbedView$ImageConfig$End r4 = (com.discord.activity_invites.ActivityInviteEmbedView.ImageConfig.End) r4
            boolean r5 = r4.getFullSize()
            if (r5 == 0) goto L_0x005e
            boolean r4 = r4.getGrayscale()
            if (r4 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r2 = r3
        L_0x005f:
            if (r2 == 0) goto L_0x0063
            r2 = -1
            goto L_0x006b
        L_0x0063:
            com.discord.theme.DiscordTheme r2 = com.discord.theme.ThemeManagerKt.getTheme()
            int r2 = r2.getHeaderPrimary()
        L_0x006b:
            r0.setBottomEndLabel(r7, r2)
            com.discord.activity_invites.databinding.ActivityInviteEmbedViewBinding r2 = r0.binding
            com.discord.core.DCDButton r2 = r2.button
            r3 = 0
            r2.setOnClickButtonListener(r3)
        L_0x0076:
            r0.configureImage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.activity_invites.ActivityInviteEmbedView.setActivityInviteEmbed(java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, boolean, java.lang.String, android.view.View$OnClickListener):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        this.binding.button.setClickable(z);
        DCDButton dCDButton = this.binding.button;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        dCDButton.setAlpha(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityInviteEmbedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy b;
        C9677q.m14633g(context, "context");
        ActivityInviteEmbedViewBinding inflate = ActivityInviteEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        b = C10839n.m10944b(EnumC10842p.NONE, ActivityInviteEmbedView$grayscalePostprocessor$2.INSTANCE);
        this.grayscalePostprocessor$delegate = b;
        setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
        SimpleDraweeView simpleDraweeView = inflate.startImage;
        C9677q.m14634f(simpleDraweeView, "binding.startImage");
        ViewClippingUtilsKt.clipToRoundedRectangle(simpleDraweeView, SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$0 = inflate.header;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9677q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryBold);
        TextView _init_$lambda$1 = inflate.bottomEndLabel;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        C9677q.m14634f(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        TextView _init_$lambda$2 = inflate.heroText;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        C9677q.m14634f(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        TextView _init_$lambda$3 = inflate.subtext;
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9677q.m14634f(_init_$lambda$3, "_init_$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, DiscordFont.PrimaryMedium);
        inflate.button.setBackgroundColor(ColorUtilsKt.getColorCompat(this, C3089R.color.green_360));
        inflate.bgGradient.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundSecondary()));
    }
}
