package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.PostPreviewEmbedViewBinding;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$1;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$10;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$11;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$2;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$3;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$4;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$5;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$6;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$7;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$8;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$9;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002J%\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0087\u0001\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010-\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0010H\u0002J\u001a\u0010.\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/PostPreviewEmbedViewBinding;", "setButtonColor", "", "ctaButtonColor", "setButtonText", "cta", "", "setCoverImage", "url", "", "blurredThumbnailUrl", "backgroundImageUrl", "setCoverImageButtonText", "coverImageOverlayText", "setFooter", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "messageId", "Lcom/discord/primitives/MessageId;", "setFooter-Ayv7vGE", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;)V", "setPostPreviewEmbed", "title", "subtitle", "ctaCopy", "thumbnailUrl", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "isSpoiler", "", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "setPostPreviewEmbed-OGpb6Gk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;)V", "setSubtitle", "setTitle", "setupSpoilerView", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PostPreviewEmbedView extends ConstraintLayout {
    private final PostPreviewEmbedViewBinding binding;

    
    public PostPreviewEmbedView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public PostPreviewEmbedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  PostPreviewEmbedView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setButtonColor(int i10) {
        this.binding.cta.setBackgroundColor(i10);
    }

    private final void setButtonText(CharSequence charSequence) {
        this.binding.cta.setText(charSequence);
    }

    
    
    
    
    
    
    
    
    
    
    
    private final void setCoverImage(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setCoverImage(java.lang.String, java.lang.String, java.lang.String):void");
    }

    
    
    private final void setCoverImageButtonText(java.lang.String r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setCoverImageButtonText(java.lang.String):void");
    }

    
    private final void m326setFooterAyv7vGE(StructurableText structurableText, String str) {
        DraweeSpanStringBuilder spannable;
        SimpleDraweeSpanTextView setFooter_Ayv7vGE$lambda$4 = this.binding.footer;
        q.g(setFooter_Ayv7vGE$lambda$4, "setFooter_Ayv7vGE$lambda$4");
        Context context = setFooter_Ayv7vGE$lambda$4.getContext();
        q.g(context, "context");
        Paint.FontMetrics fontMetrics = setFooter_Ayv7vGE$lambda$4.getPaint().getFontMetrics();
        q.g(fontMetrics, "paint.fontMetrics");
        spannable = TextUtilsKt.toSpannable(structurableText, context, str, false, false, true, (r42 & 32) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r42 & 64) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r42 & 128) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r42 & 256) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r42 & 512) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r42 & 1024) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r42 & 8192) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (r42 & 16384) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (32768 & r42) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (65536 & r42) != 0 ? false : true, (131072 & r42) != 0 ? ThemeManagerKt.getTheme() : null, (r42 & 262144) != 0 ? -1.0f : TextUtilsKt.getBaselineHeight(fontMetrics));
        ViewUtilsKt.setOptionalText(setFooter_Ayv7vGE$lambda$4, spannable);
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setFooter_Ayv7vGE$lambda$4, false, 1, null);
    }

    
    
    private final void setSubtitle(java.lang.CharSequence r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setSubtitle(java.lang.CharSequence):void");
    }

    private final void setTitle(CharSequence charSequence) {
        this.binding.title.setText(charSequence);
    }

    private final void setupSpoilerView(SpoilerConfig spoilerConfig, boolean z10) {
        boolean z11;
        this.binding.spoiler.configure(spoilerConfig);
        SpoilerView spoilerView = this.binding.spoiler;
        q.g(spoilerView, "binding.spoiler");
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

    
    public final void m327setPostPreviewEmbedOGpb6Gk(String title, String str, String ctaCopy, int i10, StructurableText footer, String messageId, String str2, String str3, String str4, String str5, View.OnClickListener onButtonClickListener, boolean z10, SpoilerConfig spoilerConfig) {
        q.h(title, "title");
        q.h(ctaCopy, "ctaCopy");
        q.h(footer, "footer");
        q.h(messageId, "messageId");
        q.h(onButtonClickListener, "onButtonClickListener");
        setButtonText(ctaCopy);
        setButtonColor(i10);
        setTitle(title);
        setSubtitle(str);
        m326setFooterAyv7vGE(footer, messageId);
        setCoverImage(str2, str3, str5);
        setCoverImageButtonText(str4);
        this.binding.cta.setOnClickButtonListener(onButtonClickListener);
        SimpleDraweeView simpleDraweeView = this.binding.coverImage;
        q.g(simpleDraweeView, "binding.coverImage");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onButtonClickListener, 1, null);
        this.binding.coverImageOverlayButton.setOnClickButtonListener(onButtonClickListener);
        setupSpoilerView(spoilerConfig, z10);
    }

    
    public PostPreviewEmbedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        PostPreviewEmbedViewBinding inflate = PostPreviewEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$0 = inflate.title;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        TextView _init_$lambda$1 = inflate.subtitle;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        q.g(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SimpleDraweeSpanTextView _init_$lambda$2 = inflate.footer;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        q.g(_init_$lambda$2, "_init_$lambda$2");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        DCDButton dCDButton = inflate.coverImageOverlayButton;
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
        dCDButton.setAlpha(0.7f);
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(64));
    }
}
