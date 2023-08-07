package com.discord.activity_invites;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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
import e3.f;
import java.util.ArrayList;
import java.util.List;
import jf.n;
import jf.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import l3.c;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0002Jn\u0010\u001b\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&J\u001a\u0010'\u001a\u00020\u00192\u0010\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010 H\u0002J\u001c\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0001\u0010,\u001a\u00020\u0007H\u0002J\u0012\u0010-\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0016H\u0016J \u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0016H\u0002J\u0012\u00105\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010+H\u0002J\u0012\u00106\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0012\u00107\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010+H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u00069"}, d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;", "grayscalePostprocessor", "Lcom/facebook/imagepipeline/request/Postprocessor;", "getGrayscalePostprocessor", "()Lcom/facebook/imagepipeline/request/Postprocessor;", "grayscalePostprocessor$delegate", "Lkotlin/Lazy;", "buildImageConfig", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "imageUri", "", "listening", "", "joinable", "configureImage", "", "imageConfig", "setActivityInviteEmbed", "isListening", "headerText", "partyStatus", "avatarsToRender", "", "maxPartySize", ZeroconfModule.KEY_SERVICE_NAME, "subtext", "ctaText", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "setAvatars", "avatars", "setBottomEndLabel", "text", "", ViewProps.COLOR, "setButtonText", "buttonText", "setEnabled", ViewProps.ENABLED, "setEndImage", "uri", "fullSize", "grayscale", "setHeaderText", "setHeroText", "setSubtext", "ImageConfig", "activity_invites_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ActivityInviteEmbedView extends ConstraintLayout {
    private final ActivityInviteEmbedViewBinding binding;
    private final Lazy grayscalePostprocessor$delegate;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "", "()V", "End", "None", "Start", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$End;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$None;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$Start;", "activity_invites_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    private static abstract class ImageConfig {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$End;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "uri", "", "fullSize", "", "grayscale", "(Ljava/lang/String;ZZ)V", "getFullSize", "()Z", "getGrayscale", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "activity_invites_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class End extends ImageConfig {
            private final boolean fullSize;
            private final boolean grayscale;
            private final String uri;

            
            public End(String uri, boolean z10, boolean z11) {
                super(null);
                q.h(uri, "uri");
                this.uri = uri;
                this.fullSize = z10;
                this.grayscale = z11;
            }

            public static  End copy$default(End end, String str, boolean z10, boolean z11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = end.uri;
                }
                if ((i10 & 2) != 0) {
                    z10 = end.fullSize;
                }
                if ((i10 & 4) != 0) {
                    z11 = end.grayscale;
                }
                return end.copy(str, z10, z11);
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

            public final End copy(String uri, boolean z10, boolean z11) {
                q.h(uri, "uri");
                return new End(uri, z10, z11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof End)) {
                    return false;
                }
                End end = (End) obj;
                return q.c(this.uri, end.uri) && this.fullSize == end.fullSize && this.grayscale == end.grayscale;
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
                boolean z10 = this.fullSize;
                int i10 = 1;
                if (z10) {
                    z10 = true;
                }
                int i11 = z10 ? 1 : 0;
                int i12 = z10 ? 1 : 0;
                int i13 = z10 ? 1 : 0;
                int i14 = (hashCode + i11) * 31;
                boolean z11 = this.grayscale;
                if (!z11) {
                    i10 = z11 ? 1 : 0;
                }
                return i14 + i10;
            }

            public String toString() {
                String str = this.uri;
                boolean z10 = this.fullSize;
                boolean z11 = this.grayscale;
                return "End(uri=" + str + ", fullSize=" + z10 + ", grayscale=" + z11 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$None;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "()V", "activity_invites_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class None extends ImageConfig {
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig$Start;", "Lcom/discord/activity_invites/ActivityInviteEmbedView$ImageConfig;", "uri", "", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "activity_invites_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Start extends ImageConfig {
            private final String uri;

            
            public Start(String uri) {
                super(null);
                q.h(uri, "uri");
                this.uri = uri;
            }

            public static  Start copy$default(Start start, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = start.uri;
                }
                return start.copy(str);
            }

            public final String component1() {
                return this.uri;
            }

            public final Start copy(String uri) {
                q.h(uri, "uri");
                return new Start(uri);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Start) && q.c(this.uri, ((Start) obj).uri);
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

        public  ImageConfig(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public ActivityInviteEmbedView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public ActivityInviteEmbedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  ActivityInviteEmbedView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final ImageConfig buildImageConfig(String str, boolean z10, boolean z11) {
        ImageConfig end;
        if (str == null) {
            return ImageConfig.None.INSTANCE;
        }
        if (z10 && z11) {
            end = new ImageConfig.Start(str);
        } else if (z10 && !z11) {
            end = new ImageConfig.End(str, false, false);
        } else if (!z10 && z11) {
            end = new ImageConfig.End(str, true, false);
        } else if (z10 || z11) {
            throw new IllegalStateException("this can never happen.".toString());
        } else {
            end = new ImageConfig.End(str, true, true);
        }
        return end;
    }

    private final void configureImage(ImageConfig imageConfig) {
        int i10;
        if (imageConfig instanceof ImageConfig.None) {
            View view = this.binding.bgGradient;
            q.g(view, "binding.bgGradient");
            view.setVisibility(8);
            SimpleDraweeView simpleDraweeView = this.binding.endImage;
            q.g(simpleDraweeView, "binding.endImage");
            simpleDraweeView.setVisibility(8);
            SimpleDraweeView simpleDraweeView2 = this.binding.startImage;
            q.g(simpleDraweeView2, "binding.startImage");
            simpleDraweeView2.setVisibility(8);
        } else if (imageConfig instanceof ImageConfig.Start) {
            View view2 = this.binding.bgGradient;
            q.g(view2, "binding.bgGradient");
            view2.setVisibility(8);
            SimpleDraweeView simpleDraweeView3 = this.binding.startImage;
            q.g(simpleDraweeView3, "binding.startImage");
            simpleDraweeView3.setVisibility(0);
            SimpleDraweeView simpleDraweeView4 = this.binding.endImage;
            q.g(simpleDraweeView4, "binding.endImage");
            simpleDraweeView4.setVisibility(8);
            this.binding.startImage.setImageURI(((ImageConfig.Start) imageConfig).getUri());
        } else if (imageConfig instanceof ImageConfig.End) {
            View view3 = this.binding.bgGradient;
            q.g(view3, "binding.bgGradient");
            ImageConfig.End end = (ImageConfig.End) imageConfig;
            if (end.getFullSize()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view3.setVisibility(i10);
            SimpleDraweeView simpleDraweeView5 = this.binding.startImage;
            q.g(simpleDraweeView5, "binding.startImage");
            simpleDraweeView5.setVisibility(8);
            SimpleDraweeView simpleDraweeView6 = this.binding.endImage;
            q.g(simpleDraweeView6, "binding.endImage");
            simpleDraweeView6.setVisibility(0);
            setEndImage(end.getUri(), end.getFullSize(), end.getGrayscale());
        }
    }

    private final Postprocessor getGrayscalePostprocessor() {
        return (Postprocessor) this.grayscalePostprocessor$delegate.getValue();
    }

    private final void setAvatars(List<String> list) {
        int i10;
        int s10;
        if (list == null) {
            list = j.h();
        }
        OverlappingCirclesView overlappingCirclesView = this.binding.avatars;
        q.g(overlappingCirclesView, "binding.avatars");
        if (!list.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        overlappingCirclesView.setVisibility(i10);
        OverlappingCirclesView overlappingCirclesView2 = this.binding.avatars;
        s10 = k.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (String str : list) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView2.setItems(arrayList);
    }

    private final void setBottomEndLabel(CharSequence charSequence, int i10) {
        TextView textView = this.binding.bottomEndLabel;
        q.g(textView, "binding.bottomEndLabel");
        ViewUtilsKt.setOptionalText(textView, charSequence);
        this.binding.bottomEndLabel.setTextColor(i10);
    }

    private final void setButtonText(String str) {
        this.binding.button.setText(str);
    }

    private final void setEndImage(String str, boolean z10, boolean z11) {
        if (z10) {
            SimpleDraweeView simpleDraweeView = this.binding.endImage;
            q.g(simpleDraweeView, "binding.endImage");
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
            q.g(simpleDraweeView2, "binding.endImage");
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
        ImageRequestBuilder s10 = ImageRequestBuilder.s(f.o(str));
        if (z11) {
            s10.A(getGrayscalePostprocessor());
        }
        this.binding.endImage.setController(c.g().D(s10.a()).build());
    }

    private final void setHeaderText(CharSequence charSequence) {
        TextView textView = this.binding.header;
        q.g(textView, "binding.header");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    private final void setHeroText(CharSequence charSequence) {
        TextView textView = this.binding.heroText;
        q.g(textView, "binding.heroText");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    private final void setSubtext(CharSequence charSequence) {
        TextView textView = this.binding.subtext;
        q.g(textView, "binding.subtext");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    
    
    public final void setActivityInviteEmbed(java.lang.String r1, boolean r2, java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5, int r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, android.view.View.OnClickListener r11) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.activity_invites.ActivityInviteEmbedView.setActivityInviteEmbed(java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, boolean, java.lang.String, android.view.View$OnClickListener):void");
    }

    @Override 
    public void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        this.binding.button.setClickable(z10);
        DCDButton dCDButton = this.binding.button;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        dCDButton.setAlpha(f10);
    }

    
    public ActivityInviteEmbedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Lazy a10;
        q.h(context, "context");
        ActivityInviteEmbedViewBinding inflate = ActivityInviteEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        a10 = n.a(p.NONE, ActivityInviteEmbedView$grayscalePostprocessor$2.INSTANCE);
        this.grayscalePostprocessor$delegate = a10;
        setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
        SimpleDraweeView simpleDraweeView = inflate.startImage;
        q.g(simpleDraweeView, "binding.startImage");
        ViewClippingUtilsKt.clipToRoundedRectangle(simpleDraweeView, SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$0 = inflate.header;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryBold);
        TextView _init_$lambda$1 = inflate.bottomEndLabel;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.g(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        TextView _init_$lambda$2 = inflate.heroText;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.g(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        TextView _init_$lambda$3 = inflate.subtext;
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        q.g(_init_$lambda$3, "_init_$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, DiscordFont.PrimaryMedium);
        inflate.button.setBackgroundColor(ColorUtilsKt.getColorCompat(this, R.color.green_360));
        inflate.bgGradient.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundSecondary()));
    }
}
