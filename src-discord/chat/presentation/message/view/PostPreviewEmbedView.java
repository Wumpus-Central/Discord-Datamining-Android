package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.PostPreviewEmbedViewBinding;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002J%\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0087\u0001\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010-\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0010H\u0002J\u001a\u0010.\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/PostPreviewEmbedViewBinding;", "setButtonColor", "", "ctaButtonColor", "setButtonText", "cta", "", "setCoverImage", "url", "", "blurredThumbnailUrl", "backgroundImageUrl", "setCoverImageButtonText", "coverImageOverlayText", "setFooter", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "messageId", "Lcom/discord/primitives/MessageId;", "setFooter-Ayv7vGE", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;)V", "setPostPreviewEmbed", "title", "subtitle", "ctaCopy", "thumbnailUrl", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "isSpoiler", "", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "setPostPreviewEmbed-OGpb6Gk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;)V", "setSubtitle", "setTitle", "setupSpoilerView", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PostPreviewEmbedView extends ConstraintLayout {
    private final PostPreviewEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ PostPreviewEmbedView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setButtonColor(int i10) {
        this.binding.cta.setBackgroundColor(i10);
    }

    private final void setButtonText(CharSequence charSequence) {
        this.binding.cta.setText(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setCoverImage(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x000d
            boolean r2 = ji.l.w(r8)
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = r1
            goto L_0x000e
        L_0x000d:
            r2 = r0
        L_0x000e:
            if (r2 == 0) goto L_0x0021
            if (r9 == 0) goto L_0x001b
            boolean r2 = ji.l.w(r9)
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r2 = r1
            goto L_0x001c
        L_0x001b:
            r2 = r0
        L_0x001c:
            if (r2 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = r1
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r3 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r3 = r3.coverImage
            java.lang.String r4 = "binding.coverImage"
            kotlin.jvm.internal.q.f(r3, r4)
            r5 = 8
            if (r2 == 0) goto L_0x0031
            r6 = r1
            goto L_0x0032
        L_0x0031:
            r6 = r5
        L_0x0032:
            r3.setVisibility(r6)
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r3 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r3 = r3.backgroundImage
            java.lang.String r6 = "binding.backgroundImage"
            kotlin.jvm.internal.q.f(r3, r6)
            if (r2 == 0) goto L_0x0050
            if (r10 == 0) goto L_0x004b
            boolean r2 = ji.l.w(r10)
            if (r2 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r2 = r1
            goto L_0x004c
        L_0x004b:
            r2 = r0
        L_0x004c:
            if (r2 != 0) goto L_0x0050
            r2 = r0
            goto L_0x0051
        L_0x0050:
            r2 = r1
        L_0x0051:
            if (r2 == 0) goto L_0x0054
            r5 = r1
        L_0x0054:
            r3.setVisibility(r5)
            if (r8 == 0) goto L_0x0062
            boolean r2 = ji.l.w(r8)
            if (r2 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r2 = r1
            goto L_0x0063
        L_0x0062:
            r2 = r0
        L_0x0063:
            if (r2 != 0) goto L_0x009f
            if (r10 == 0) goto L_0x006f
            boolean r9 = ji.l.w(r10)
            if (r9 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r0 = r1
        L_0x006f:
            if (r0 != 0) goto L_0x0088
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.coverImage
            com.facebook.drawee.interfaces.DraweeHierarchy r9 = r9.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r9 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r9
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r0 = com.facebook.drawee.drawable.ScalingUtils.ScaleType.f7394e
            r9.t(r0)
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.backgroundImage
            r9.setImageURI(r10)
            goto L_0x0097
        L_0x0088:
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.coverImage
            com.facebook.drawee.interfaces.DraweeHierarchy r9 = r9.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r9 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r9
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r10 = com.facebook.drawee.drawable.ScalingUtils.ScaleType.f7398i
            r9.t(r10)
        L_0x0097:
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.coverImage
            r9.setImageURI(r8)
            goto L_0x00b5
        L_0x009f:
            if (r9 == 0) goto L_0x00a9
            boolean r8 = ji.l.w(r9)
            if (r8 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            if (r0 != 0) goto L_0x00b5
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r8 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r8 = r8.coverImage
            kotlin.jvm.internal.q.f(r8, r4)
            com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(r8, r9)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setCoverImage(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setCoverImageButtonText(java.lang.String r5) {
        /*
            r4 = this;
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r0 = r4.binding
            com.discord.core.DCDButton r0 = r0.coverImageOverlayButton
            java.lang.String r1 = "setCoverImageButtonText$lambda$5"
            kotlin.jvm.internal.q.f(r0, r1)
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0016
            boolean r3 = ji.l.w(r5)
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 8
        L_0x001d:
            r0.setVisibility(r1)
            r0.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setCoverImageButtonText(java.lang.String):void");
    }

    /* renamed from: setFooter-Ayv7vGE  reason: not valid java name */
    private final void m316setFooterAyv7vGE(StructurableText structurableText, String str) {
        SimpleDraweeSpanTextView setFooter_Ayv7vGE$lambda$4 = this.binding.footer;
        q.f(setFooter_Ayv7vGE$lambda$4, "setFooter_Ayv7vGE$lambda$4");
        Context context = setFooter_Ayv7vGE$lambda$4.getContext();
        q.f(context, "context");
        Paint.FontMetrics fontMetrics = setFooter_Ayv7vGE$lambda$4.getPaint().getFontMetrics();
        q.f(fontMetrics, "paint.fontMetrics");
        ViewUtilsKt.setOptionalText(setFooter_Ayv7vGE$lambda$4, TextUtilsKt.toSpannable$default(structurableText, context, str, false, false, true, null, null, null, null, null, null, null, null, null, null, null, true, null, TextUtilsKt.getBaselineHeight(fontMetrics), 196576, null));
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setFooter_Ayv7vGE$lambda$4, false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setSubtitle(java.lang.CharSequence r5) {
        /*
            r4 = this;
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r0 = r4.binding
            android.widget.TextView r0 = r0.subtitle
            java.lang.String r1 = "binding.subtitle"
            kotlin.jvm.internal.q.f(r0, r1)
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0016
            boolean r3 = ji.l.w(r5)
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 8
        L_0x001d:
            r0.setVisibility(r1)
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r0 = r4.binding
            android.widget.TextView r0 = r0.subtitle
            r0.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setSubtitle(java.lang.CharSequence):void");
    }

    private final void setTitle(CharSequence charSequence) {
        this.binding.title.setText(charSequence);
    }

    private final void setupSpoilerView(SpoilerConfig spoilerConfig, boolean z10) {
        boolean z11;
        this.binding.spoiler.configure(spoilerConfig);
        SpoilerView spoilerView = this.binding.spoiler;
        q.f(spoilerView, "binding.spoiler");
        if (spoilerView.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.binding.coverImage.setImportantForAccessibility(4);
            return;
        }
        this.binding.coverImage.setImportantForAccessibility(0);
        if (z10) {
            this.binding.coverImage.requestFocus();
        }
    }

    /* renamed from: setPostPreviewEmbed-OGpb6Gk  reason: not valid java name */
    public final void m317setPostPreviewEmbedOGpb6Gk(String title, String str, String ctaCopy, int i10, StructurableText footer, String messageId, String str2, String str3, String str4, String str5, View.OnClickListener onButtonClickListener, boolean z10, SpoilerConfig spoilerConfig) {
        q.g(title, "title");
        q.g(ctaCopy, "ctaCopy");
        q.g(footer, "footer");
        q.g(messageId, "messageId");
        q.g(onButtonClickListener, "onButtonClickListener");
        setButtonText(ctaCopy);
        setButtonColor(i10);
        setTitle(title);
        setSubtitle(str);
        m316setFooterAyv7vGE(footer, messageId);
        setCoverImage(str2, str3, str5);
        setCoverImageButtonText(str4);
        this.binding.cta.setOnClickButtonListener(onButtonClickListener);
        SimpleDraweeView simpleDraweeView = this.binding.coverImage;
        q.f(simpleDraweeView, "binding.coverImage");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onButtonClickListener, 1, null);
        this.binding.coverImageOverlayButton.setOnClickButtonListener(onButtonClickListener);
        setupSpoilerView(spoilerConfig, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        PostPreviewEmbedViewBinding inflate = PostPreviewEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$0 = inflate.title;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        TextView _init_$lambda$1 = inflate.subtitle;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        q.f(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SimpleDraweeSpanTextView _init_$lambda$2 = inflate.footer;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        q.f(_init_$lambda$2, "_init_$lambda$2");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        DCDButton dCDButton = inflate.coverImageOverlayButton;
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
        dCDButton.setAlpha(0.7f);
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(64));
    }
}
