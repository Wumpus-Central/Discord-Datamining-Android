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
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJu\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010*\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\u001a\u0010+\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/PostPreviewEmbedViewBinding;", "setButtonText", "", "cta", "", "setCoverImage", "url", "", "blurredThumbnailUrl", "setCoverImageButtonText", "coverImageOverlayText", "setFooter", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "messageId", "Lcom/discord/primitives/MessageId;", "setFooter-Ayv7vGE", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;)V", "setPostPreviewEmbed", "title", "subtitle", "ctaCopy", "thumbnailUrl", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "isSpoiler", "", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "setPostPreviewEmbed-0JD92Ks", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;)V", "setSubtitle", "setTitle", "setupSpoilerView", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
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

    private final void setButtonText(CharSequence charSequence) {
        this.binding.cta.setText(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setCoverImage(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r0 = r5.binding
            com.facebook.drawee.view.SimpleDraweeView r0 = r0.coverImage
            java.lang.String r1 = "binding.coverImage"
            kotlin.jvm.internal.q.f(r0, r1)
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L_0x0016
            boolean r4 = oj.l.w(r6)
            if (r4 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r4 = r3
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            if (r4 == 0) goto L_0x002a
            if (r7 == 0) goto L_0x0024
            boolean r4 = oj.l.w(r7)
            if (r4 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r4 = r3
            goto L_0x0025
        L_0x0024:
            r4 = r2
        L_0x0025:
            if (r4 != 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r4 = r3
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            if (r4 == 0) goto L_0x002f
            r4 = r3
            goto L_0x0031
        L_0x002f:
            r4 = 8
        L_0x0031:
            r0.setVisibility(r4)
            if (r6 == 0) goto L_0x003f
            boolean r0 = oj.l.w(r6)
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r3
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x004a
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r7 = r5.binding
            com.facebook.drawee.view.SimpleDraweeView r7 = r7.coverImage
            r7.setImageURI(r6)
            goto L_0x0060
        L_0x004a:
            if (r7 == 0) goto L_0x0054
            boolean r6 = oj.l.w(r7)
            if (r6 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            if (r2 != 0) goto L_0x0060
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r6 = r5.binding
            com.facebook.drawee.view.SimpleDraweeView r6 = r6.coverImage
            kotlin.jvm.internal.q.f(r6, r1)
            com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(r6, r7)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setCoverImage(java.lang.String, java.lang.String):void");
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
            boolean r3 = oj.l.w(r5)
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
    private final void m306setFooterAyv7vGE(StructurableText structurableText, String str) {
        DraweeSpanStringBuilder spannable;
        SimpleDraweeSpanTextView setFooter_Ayv7vGE$lambda$4 = this.binding.footer;
        q.f(setFooter_Ayv7vGE$lambda$4, "setFooter_Ayv7vGE$lambda$4");
        Context context = setFooter_Ayv7vGE$lambda$4.getContext();
        q.f(context, "context");
        Paint.FontMetrics fontMetrics = setFooter_Ayv7vGE$lambda$4.getPaint().getFontMetrics();
        q.f(fontMetrics, "paint.fontMetrics");
        spannable = TextUtilsKt.toSpannable(structurableText, context, str, false, false, true, (r42 & 32) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r42 & 64) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r42 & 128) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r42 & Spliterator.NONNULL) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r42 & 512) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r42 & Spliterator.IMMUTABLE) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r42 & 4096) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r42 & 8192) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (r42 & Spliterator.SUBSIZED) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (32768 & r42) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (65536 & r42) != 0 ? false : true, (131072 & r42) != 0 ? ThemeManagerKt.getTheme() : null, (r42 & 262144) != 0 ? -1.0f : TextUtilsKt.getBaselineHeight(fontMetrics));
        ViewUtilsKt.setOptionalText(setFooter_Ayv7vGE$lambda$4, spannable);
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
            boolean r3 = oj.l.w(r5)
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

    /* renamed from: setPostPreviewEmbed-0JD92Ks  reason: not valid java name */
    public final void m307setPostPreviewEmbed0JD92Ks(String title, String str, String ctaCopy, StructurableText footer, String messageId, String str2, String str3, String str4, View.OnClickListener onButtonClickListener, boolean z10, SpoilerConfig spoilerConfig) {
        q.g(title, "title");
        q.g(ctaCopy, "ctaCopy");
        q.g(footer, "footer");
        q.g(messageId, "messageId");
        q.g(onButtonClickListener, "onButtonClickListener");
        setButtonText(ctaCopy);
        setTitle(title);
        setSubtitle(str);
        m306setFooterAyv7vGE(footer, messageId);
        setCoverImage(str2, str3);
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
