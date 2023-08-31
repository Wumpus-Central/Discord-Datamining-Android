package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.embed.EmbedAuthor;
import com.discord.chat.bridge.embed.EmbedFailureState;
import com.discord.chat.bridge.embed.EmbedField;
import com.discord.chat.bridge.embed.EmbedFooter;
import com.discord.chat.bridge.embed.EmbedProvider;
import com.discord.chat.bridge.embed.EmbedThumbnail;
import com.discord.chat.bridge.embed.EmbedType;
import com.discord.chat.bridge.embed.EmbedUtilsKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.EmbedViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.MessageAccessoriesView;
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
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.media_player.MediaSource;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewGroupUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010w\u001a\u00020v\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010x¢\u0006\u0004\bz\u0010{J9\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJK\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0017\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J8\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u001f\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002Jå\u0001\u00107\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u00062\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070*H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J#\u0010:\u001a\u00020\u00072\u0006\u00108\u001a\u00020&2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u00020\u00072\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b=\u0010>J0\u0010G\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0002J0\u0010J\u001a\u00020\u00072\b\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010I\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J;\u0010O\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010L\u001a\u00020\u00042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bO\u0010PJ\u0012\u0010S\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010QH\u0002J\b\u0010T\u001a\u00020\u0007H\u0002J\b\u0010U\u001a\u00020\u0007H\u0002J\b\u0010V\u001a\u00020\u0007H\u0002J\b\u0010W\u001a\u00020\u0007H\u0002J\b\u0010X\u001a\u00020\u0007H\u0002J\b\u0010Y\u001a\u00020\u0007H\u0002J\b\u0010Z\u001a\u00020\u0007H\u0002J\b\u0010[\u001a\u00020\u0007H\u0002J\b\u0010\\\u001a\u00020\u0007H\u0002J\b\u0010]\u001a\u00020\u0007H\u0002J\b\u0010^\u001a\u00020\u0007H\u0002J\b\u0010_\u001a\u00020\u0007H\u0002J\u008f\u0003\u0010o\u001a\u00020\u00072\u0006\u0010B\u001a\u00020A2\u0006\u0010%\u001a\u00020$2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2 \u0010c\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022 \u0010d\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u001c\u0010f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010e\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070*2\b\u0010h\u001a\u0004\u0018\u00010g2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u00062\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010l\u001a\u00020eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010sR\u0016\u0010t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010u\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006|"}, d2 = {"Lcom/discord/chat/presentation/message/view/EmbedView;", "Landroid/widget/FrameLayout;", "", "provider", "", "providerColor", "Lkotlin/Function1;", "", "onTapCopyText", "setProvider", "(Ljava/lang/CharSequence;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "", "rawTitle", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "title", "titleColor", "Landroid/view/View$OnClickListener;", "onClickListener", "onLongClickListener", "setTitle", "(Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/lang/Integer;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;)V", "authorUrl", "authorName", "setAuthor", "listener", "setAuthorOnClickListener", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "thumbnail", "setThumbnail", "rawDescription", "description", "descriptionColor", "setDescription", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "fields", "Lcom/discord/primitives/MessageId;", "messageId", "", "shouldAnimateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "onLinkLongClicked", "Lkotlin/Function0;", "onTapSpoiler", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lkotlin/Function3;", "onTapChannel", "onTapMention", "setFields-thlxG-E", "(Ljava/util/List;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "setFields", "isBackgroundColorEnabled", ViewProps.BACKGROUND_COLOR, "setBackgroundColorEnabled", "(ZLjava/lang/Integer;)V", ViewProps.COLOR, "setBorder", "(Ljava/lang/Integer;)V", "Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;", "mediaView", "Lcom/discord/chat/bridge/embed/Embed;", "embed", "Lcom/discord/media_player/MediaSource;", "mediaSource", "maxHeightPx", "maxWidthPx", "setMediaEmbed", "imageUrl", "text", "setFooter", "error", "textColor", "iconURL", "iconTint", "setError", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "configureSpoiler", "reset", "clearInlineMedia", "clearBorder", "clearThumbnail", "clearProvider", "clearAuthor", "clearTitle", "clearDescription", "clearFields", "clearMedia", "clearFooter", "clearError", "constrainedWidth", "radiusPx", "shouldAutoPlayGifs", "onTitleLinkClicked", "onAuthorLinkClicked", "", "onMediaClicked", "Landroid/view/View$OnLongClickListener;", "onMediaLongClicked", "onLongTapLinkNode", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "portal", "setEmbed-lKx2FiY", "(Lcom/discord/chat/bridge/embed/Embed;Ljava/lang/String;IIIZZZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;D)V", "setEmbed", "Lcom/discord/chat/databinding/EmbedViewBinding;", "binding", "Lcom/discord/chat/databinding/EmbedViewBinding;", "Lcom/discord/chat/bridge/embed/Embed;", "maxThumbnailSize", "I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class EmbedView extends FrameLayout {
    private final EmbedViewBinding binding;
    private Embed embed;
    private int maxThumbnailSize;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbedType.values().length];
            try {
                iArr[EmbedType.Rich.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    
    public EmbedView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  EmbedView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void clearAuthor() {
        TextView textView = this.binding.authorName;
        q.g(textView, "binding.authorName");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        q.g(simpleDraweeView, "binding.authorAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
        LinearLayout linearLayout = this.binding.authorContainer;
        q.g(linearLayout, "binding.authorContainer");
        linearLayout.setVisibility(8);
    }

    private final void clearBorder() {
        View view = this.binding.border;
        q.g(view, "binding.border");
        view.setVisibility(8);
    }

    private final void clearDescription() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.description;
        q.g(simpleDraweeSpanTextView, "binding.description");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
    }

    private final void clearError() {
        TextView textView = this.binding.error;
        q.g(textView, "binding.error");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.errorIcon;
        q.g(simpleDraweeView, "binding.errorIcon");
        simpleDraweeView.setVisibility(8);
    }

    private final void clearFields() {
        LinearLayout linearLayout = this.binding.fieldsContainer;
        q.g(linearLayout, "binding.fieldsContainer");
        linearLayout.setVisibility(8);
    }

    private final void clearFooter() {
        TextView textView = this.binding.footerText;
        q.g(textView, "binding.footerText");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.footerAvatar;
        q.g(simpleDraweeView, "binding.footerAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
        LinearLayout linearLayout = this.binding.footerContainer;
        q.g(linearLayout, "binding.footerContainer");
        linearLayout.setVisibility(8);
        Space space = this.binding.spacer;
        q.g(space, "binding.spacer");
        space.setVisibility(0);
    }

    private final void clearInlineMedia() {
        EmbedViewBinding embedViewBinding = this.binding;
        EmbedViewResizingMediaView[] embedViewResizingMediaViewArr = {embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4};
        for (int i10 = 0; i10 < 4; i10++) {
            EmbedViewResizingMediaView it = embedViewResizingMediaViewArr[i10];
            q.g(it, "it");
            MediaView.setMediaData$default(it, null, false, false, false, null, false, null, null, false, false, false, null, null, null, null, 32766, null);
            it.setOnMediaClickListeners(null, null);
            it.setVisibility(8);
        }
    }

    private final void clearMedia() {
        EmbedViewResizingMediaView clearMedia$lambda$29 = this.binding.mediaView;
        q.g(clearMedia$lambda$29, "clearMedia$lambda$29");
        MediaView.setMediaData$default(clearMedia$lambda$29, null, false, false, false, null, false, null, null, false, false, false, null, null, null, null, 32766, null);
        clearMedia$lambda$29.setVisibility(8);
    }

    private final void clearProvider() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.provider;
        q.g(simpleDraweeSpanTextView, "binding.provider");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
    }

    private final void clearThumbnail() {
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        q.g(simpleDraweeView, "binding.thumbnail");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
    }

    private final void clearTitle() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.title;
        q.g(simpleDraweeSpanTextView, "binding.title");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = this.binding.title;
        q.g(simpleDraweeSpanTextView2, "binding.title");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeSpanTextView2, false, null, 1, null);
    }

    private final void configureSpoiler(SpoilerConfig spoilerConfig) {
        this.binding.spoiler.configure(spoilerConfig);
    }

    private final void reset() {
        clearProvider();
        clearTitle();
        clearDescription();
        clearAuthor();
        clearFields();
        clearInlineMedia();
        clearThumbnail();
        clearBorder();
        clearMedia();
        clearFooter();
        clearError();
    }

    
    
    
    
    private final void setAuthor(java.lang.String r7, java.lang.String r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setAuthor(java.lang.String, java.lang.String):void");
    }

    private final void setAuthorOnClickListener(View.OnClickListener onClickListener, final Function1<? super CharSequence, Unit> function1) {
        TextView setAuthorOnClickListener$lambda$15 = this.binding.authorName;
        q.g(setAuthorOnClickListener$lambda$15, "setAuthorOnClickListener$lambda$15");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(setAuthorOnClickListener$lambda$15, false, onClickListener, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setAuthorOnClickListener$lambda$15, false, new View.OnLongClickListener() { 
            @Override 
            public final boolean onLongClick(View view) {
                boolean authorOnClickListener$lambda$15$lambda$14;
                authorOnClickListener$lambda$15$lambda$14 = EmbedView.setAuthorOnClickListener$lambda$15$lambda$14(Function1.this, this, view);
                return authorOnClickListener$lambda$15$lambda$14;
            }
        }, 1, null);
    }

    
    public static final boolean setAuthorOnClickListener$lambda$15$lambda$14(Function1 onTapCopyText, EmbedView this$0, View view) {
        q.h(onTapCopyText, "$onTapCopyText");
        q.h(this$0, "this$0");
        CharSequence text = this$0.binding.authorName.getText();
        q.g(text, "binding.authorName.text");
        onTapCopyText.invoke(text);
        return true;
    }

    private final void setBackgroundColorEnabled(boolean z10, Integer num) {
        int i10;
        if (z10) {
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = ThemeManagerKt.getTheme().getBackgroundSecondary();
            }
            setBackgroundColor(i10);
            return;
        }
        setBackgroundColor(0);
    }

    static  void setBackgroundColorEnabled$default(EmbedView embedView, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        embedView.setBackgroundColorEnabled(z10, num);
    }

    private final void setBorder(Integer num) {
        boolean z10;
        if (num != null) {
            this.binding.border.setBackgroundColor(num.intValue());
        }
        View view = this.binding.border;
        q.g(view, "binding.border");
        int i10 = 0;
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private final void setDescription(final String str, DraweeSpanStringBuilder draweeSpanStringBuilder, int i10, final Function1<? super CharSequence, Unit> function1) {
        SimpleDraweeSpanTextView setDescription$lambda$19 = this.binding.description;
        q.g(setDescription$lambda$19, "setDescription$lambda$19");
        if (draweeSpanStringBuilder != null) {
            SpannableExtensionsKt.coverWithSpan(draweeSpanStringBuilder, new BackgroundSpanDrawer(setDescription$lambda$19));
        } else {
            draweeSpanStringBuilder = null;
        }
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setDescription$lambda$19, draweeSpanStringBuilder);
        setDescription$lambda$19.setTextColor(i10);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setDescription$lambda$19, false, new View.OnLongClickListener() { 
            @Override 
            public final boolean onLongClick(View view) {
                boolean description$lambda$19$lambda$18;
                description$lambda$19$lambda$18 = EmbedView.setDescription$lambda$19$lambda$18(Function1.this, str, view);
                return description$lambda$19$lambda$18;
            }
        }, 1, null);
    }

    
    public static final boolean setDescription$lambda$19$lambda$18(Function1 onTapCopyText, String rawDescription, View view) {
        q.h(onTapCopyText, "$onTapCopyText");
        q.h(rawDescription, "$rawDescription");
        onTapCopyText.invoke(rawDescription);
        return true;
    }

    
    public static final void setEmbed_lKx2FiY$lambda$3$lambda$2(Function3 onTitleLinkClicked, String messageId, String url, DraweeSpanStringBuilder draweeSpanStringBuilder, View view) {
        String str;
        q.h(onTitleLinkClicked, "$onTitleLinkClicked");
        q.h(messageId, "$messageId");
        q.h(url, "$url");
        MessageId messageId2 = MessageId.m617boximpl(messageId);
        if (draweeSpanStringBuilder != null) {
            str = draweeSpanStringBuilder.toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        onTitleLinkClicked.invoke(messageId2, url, str);
    }

    
    public static final void setEmbed_lKx2FiY$lambda$5$lambda$4(Function3 onAuthorLinkClicked, String messageId, Embed embed, View view) {
        q.h(onAuthorLinkClicked, "$onAuthorLinkClicked");
        q.h(messageId, "$messageId");
        q.h(embed, "$embed");
        onAuthorLinkClicked.invoke(MessageId.m617boximpl(messageId), embed.getAuthor().getUrl(), embed.getAuthor().getName());
    }

    
    
    private final void setError(java.lang.String r3, int r4, java.lang.String r5, java.lang.Integer r6) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setError(java.lang.String, int, java.lang.String, java.lang.Integer):void");
    }

    static  void setError$default(EmbedView embedView, String str, int i10, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            num = null;
        }
        embedView.setError(str, i10, str2, num);
    }

    
    private final void m320setFieldsthlxGE(List<EmbedField> list, String str, boolean z10, boolean z11, boolean z12, Function2<? super MessageId, ? super LinkContentNode, Unit> function2, Function1<? super LinkContentNode, Unit> function1, Function1<? super CharSequence, Unit> function12, Function0<Unit> function0, Function1<? super EmojiContentNode, Unit> function13, Function3<? super String, ? super String, ? super String, Unit> function3, Function2<? super String, ? super String, Unit> function22) {
        EmbedView$setFields$onLinkClickedWithMessageId$1 embedView$setFields$onLinkClickedWithMessageId$1;
        String str2;
        String str3;
        EmbedFieldView embedFieldView;
        String str4;
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        String str5;
        EmbedFieldView embedFieldView2;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        DraweeSpanStringBuilder spannable;
        EmbedView$setFields$onLinkClickedWithMessageId$1 embedView$setFields$onLinkClickedWithMessageId$12 = new EmbedView$setFields$onLinkClickedWithMessageId$1(function2, str);
        LinearLayout setFields_thlxG_E$lambda$22 = this.binding.fieldsContainer;
        q.g(setFields_thlxG_E$lambda$22, "setFields_thlxG_E$lambda$22");
        int i10 = 0;
        setFields_thlxG_E$lambda$22.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        ViewGroupUtilsKt.setUpLayoutForList(setFields_thlxG_E$lambda$22, list.size(), new EmbedView$setFields$1$1(setFields_thlxG_E$lambda$22));
        for (Object obj : list) {
            i10++;
            if (i10 < 0) {
                j.r();
            }
            EmbedField embedField = (EmbedField) obj;
            View childAt = setFields_thlxG_E$lambda$22.getChildAt(i10);
            q.f(childAt, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.EmbedFieldView");
            EmbedFieldView embedFieldView3 = (EmbedFieldView) childAt;
            String rawName = embedField.getRawName();
            String str6 = rawName == null ? "" : rawName;
            StructurableText name = embedField.getName();
            if (name != null) {
                Context context = embedFieldView3.getContext();
                TextPaint paint = embedFieldView3.getBinding().name.getPaint();
                q.g(context, "context");
                q.g(paint, "paint");
                str3 = "context";
                str2 = "paint";
                setFields_thlxG_E$lambda$22 = setFields_thlxG_E$lambda$22;
                embedView$setFields$onLinkClickedWithMessageId$1 = embedView$setFields$onLinkClickedWithMessageId$12;
                draweeSpanStringBuilder = TextUtilsKt.toSpannable(name, context, str, z10, z11, z12, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : embedView$setFields$onLinkClickedWithMessageId$12, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : function1, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : function3, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : function22, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : function13, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : function0, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : 0.0f);
                str4 = str6;
                embedFieldView = embedFieldView3;
            } else {
                str3 = "context";
                str2 = "paint";
                setFields_thlxG_E$lambda$22 = setFields_thlxG_E$lambda$22;
                embedView$setFields$onLinkClickedWithMessageId$1 = embedView$setFields$onLinkClickedWithMessageId$12;
                str4 = str6;
                embedFieldView = embedFieldView3;
                draweeSpanStringBuilder = null;
            }
            embedFieldView.setName(str4, draweeSpanStringBuilder, function12);
            String rawValue = embedField.getRawValue();
            String str7 = rawValue == null ? "" : rawValue;
            StructurableText value = embedField.getValue();
            if (value != null) {
                Context context2 = embedFieldView.getContext();
                TextPaint paint2 = embedFieldView.getBinding().value.getPaint();
                Paint.FontMetrics fontMetrics = embedFieldView.getBinding().value.getPaint().getFontMetrics();
                q.g(fontMetrics, "binding.value.paint.fontMetrics");
                float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
                q.g(context2, str3);
                q.g(paint2, str2);
                spannable = TextUtilsKt.toSpannable(value, context2, str, z10, z11, z12, paint2, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : embedView$setFields$onLinkClickedWithMessageId$1, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : function1, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : function3, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : function22, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : function13, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : function0, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
                draweeSpanStringBuilder2 = spannable;
                str5 = str7;
                embedFieldView2 = embedFieldView;
            } else {
                str5 = str7;
                embedFieldView2 = embedFieldView;
                draweeSpanStringBuilder2 = null;
            }
            embedFieldView2.setValue(str5, draweeSpanStringBuilder2, function12);
            embedView$setFields$onLinkClickedWithMessageId$12 = embedView$setFields$onLinkClickedWithMessageId$1;
        }
    }

    
    
    
    
    
    
    
    private final void setFooter(java.lang.String r10, final java.lang.String r11, final kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> r12) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setFooter(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    
    public static final boolean setFooter$lambda$26$lambda$25$lambda$24(Function1 onTapCopyText, String str, View view) {
        q.h(onTapCopyText, "$onTapCopyText");
        onTapCopyText.invoke(str);
        return true;
    }

    private final void setMediaEmbed(EmbedViewResizingMediaView embedViewResizingMediaView, Embed embed, MediaSource mediaSource, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        if (i10 > 0 && i11 > 0) {
            Pair<Integer, Integer> targetDimensions = EmbedUtilsKt.getTargetDimensions(embed);
            Integer a10 = targetDimensions.a();
            Integer b10 = targetDimensions.b();
            if (a10 != null) {
                i12 = a10.intValue();
            } else {
                i12 = 0;
            }
            if (b10 != null) {
                i13 = b10.intValue();
            } else {
                i13 = 0;
            }
            embedViewResizingMediaView.setTarget(i12, i13, i10, i11);
        }
        embedViewResizingMediaView.setVisibility(0);
        EmbedThumbnail thumbnail = embed.getThumbnail();
        if (thumbnail != null) {
            z10 = q.c(thumbnail.getShowPlayButton(), Boolean.TRUE);
        } else {
            z10 = false;
        }
        MediaView.setMediaData$default(embedViewResizingMediaView, mediaSource, false, false, false, null, false, null, null, false, z10, false, null, null, null, null, 32254, null);
    }

    private final void setProvider(final CharSequence charSequence, Integer num, final Function1<? super CharSequence, Unit> function1) {
        int i10;
        View.OnLongClickListener onLongClickListener;
        SimpleDraweeSpanTextView setProvider$lambda$10 = this.binding.provider;
        q.g(setProvider$lambda$10, "setProvider$lambda$10");
        ViewUtilsKt.setOptionalText(setProvider$lambda$10, charSequence);
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = ThemeManagerKt.getTheme().getTextNormal();
        }
        setProvider$lambda$10.setTextColor(i10);
        if (charSequence != null) {
            onLongClickListener = new View.OnLongClickListener() { 
                @Override 
                public final boolean onLongClick(View view) {
                    boolean provider$lambda$10$lambda$9$lambda$8;
                    provider$lambda$10$lambda$9$lambda$8 = EmbedView.setProvider$lambda$10$lambda$9$lambda$8(Function1.this, charSequence, view);
                    return provider$lambda$10$lambda$9$lambda$8;
                }
            };
        } else {
            onLongClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setProvider$lambda$10, false, onLongClickListener, 1, null);
    }

    
    public static final boolean setProvider$lambda$10$lambda$9$lambda$8(Function1 onTapCopyText, CharSequence charSequence, View view) {
        q.h(onTapCopyText, "$onTapCopyText");
        onTapCopyText.invoke(charSequence);
        return true;
    }

    private final void setThumbnail(EmbedThumbnail embedThumbnail) {
        int i10;
        String str;
        SimpleDraweeView setThumbnail$lambda$16 = this.binding.thumbnail;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        q.g(setThumbnail$lambda$16, "setThumbnail$lambda$16");
        int i11 = 0;
        if (embedThumbnail != null) {
            i10 = embedThumbnail.getWidth();
        } else {
            i10 = 0;
        }
        if (embedThumbnail != null) {
            i11 = embedThumbnail.getHeight();
        }
        int i12 = this.maxThumbnailSize;
        MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, setThumbnail$lambda$16, i10, i11, i12, i12, null, 16, null);
        if (embedThumbnail != null) {
            str = embedThumbnail.getProxyURL();
        } else {
            str = null;
        }
        SetOptionalImageUrlKt.setOptionalImageUrl$default(setThumbnail$lambda$16, str, false, null, 6, null);
    }

    private final void setTitle(final String str, DraweeSpanStringBuilder draweeSpanStringBuilder, Integer num, View.OnClickListener onClickListener, final Function1<? super String, Unit> function1) {
        int i10;
        View.OnLongClickListener onLongClickListener;
        SimpleDraweeSpanTextView setTitle$lambda$13 = this.binding.title;
        q.g(setTitle$lambda$13, "setTitle$lambda$13");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setTitle$lambda$13, draweeSpanStringBuilder);
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = ThemeManagerKt.getTheme().getTextNormal();
        }
        setTitle$lambda$13.setTextColor(i10);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(setTitle$lambda$13, false, onClickListener, 1, null);
        if (draweeSpanStringBuilder != null) {
            onLongClickListener = new View.OnLongClickListener() { 
                @Override 
                public final boolean onLongClick(View view) {
                    boolean title$lambda$13$lambda$12$lambda$11;
                    title$lambda$13$lambda$12$lambda$11 = EmbedView.setTitle$lambda$13$lambda$12$lambda$11(Function1.this, str, view);
                    return title$lambda$13$lambda$12$lambda$11;
                }
            };
        } else {
            onLongClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setTitle$lambda$13, false, onLongClickListener, 1, null);
    }

    
    public static final boolean setTitle$lambda$13$lambda$12$lambda$11(Function1 onLongClickListener, String rawTitle, View view) {
        q.h(onLongClickListener, "$onLongClickListener");
        q.h(rawTitle, "$rawTitle");
        onLongClickListener.invoke(rawTitle);
        return true;
    }

    
    public final void m321setEmbedlKx2FiY(final Embed embed, final String messageId, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, final Function3<? super MessageId, ? super String, ? super String, Unit> onTitleLinkClicked, final Function3<? super MessageId, ? super String, ? super String, Unit> onAuthorLinkClicked, Function2<? super Double, ? super Integer, Unit> onMediaClicked, View.OnLongClickListener onLongClickListener, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, Function1<? super LinkContentNode, Unit> onLongTapLinkNode, Function1<? super CharSequence, Unit> onTapCopyText, Function0<Unit> onTapSpoiler, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, SpoilerConfig spoilerConfig, double d10) {
        final DraweeSpanStringBuilder draweeSpanStringBuilder;
        Integer num;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        List J0;
        DraweeSpanStringBuilder spannable;
        q.h(embed, "embed");
        q.h(messageId, "messageId");
        q.h(onTitleLinkClicked, "onTitleLinkClicked");
        q.h(onAuthorLinkClicked, "onAuthorLinkClicked");
        q.h(onMediaClicked, "onMediaClicked");
        q.h(onLinkClicked, "onLinkClicked");
        q.h(onLongTapLinkNode, "onLongTapLinkNode");
        q.h(onTapCopyText, "onTapCopyText");
        q.h(onTapSpoiler, "onTapSpoiler");
        q.h(onTapEmoji, "onTapEmoji");
        q.h(onTapChannel, "onTapChannel");
        q.h(onTapMention, "onTapMention");
        q.h(onTapCommand, "onTapCommand");
        if (!q.c(embed, this.embed)) {
            reset();
            this.embed = embed;
        }
        View root = this.binding.getRoot();
        q.g(root, "binding.root");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, i12);
        ConstraintLayout constraintLayout = this.binding.inlineMediaContainer;
        q.g(constraintLayout, "binding.inlineMediaContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(constraintLayout, i12);
        EmbedViewResizingMediaView embedViewResizingMediaView = this.binding.mediaView;
        q.g(embedViewResizingMediaView, "binding.mediaView");
        ViewClippingUtilsKt.clipToRoundedRectangle(embedViewResizingMediaView, i12);
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        q.g(simpleDraweeView, "binding.thumbnail");
        ViewClippingUtilsKt.clipToRoundedRectangle(simpleDraweeView, i12);
        if (!EmbedUtilsKt.isInlineMedia(embed)) {
            MediaSource mediaSource = EmbedUtilsKt.toMediaSource(embed, z10, Double.valueOf(d10));
            if (mediaSource != null) {
                Space space = this.binding.spacer;
                q.g(space, "binding.spacer");
                space.setVisibility(8);
                if (mediaSource.getPreviewUrl() != null) {
                    EmbedViewResizingMediaView embedViewResizingMediaView2 = this.binding.mediaView;
                    q.g(embedViewResizingMediaView2, "binding.mediaView");
                    setMediaEmbed(embedViewResizingMediaView2, embed, mediaSource, i11, MessageAccessoriesView.Companion.getWidth(i10));
                    this.binding.mediaView.setOnMediaClickListeners(new EmbedView$setEmbed$1$1(onMediaClicked), onLongClickListener);
                    setBackgroundColorEnabled$default(this, false, null, 2, null);
                }
            }
        } else {
            StructurableText title = embed.getTitle();
            if (title != null) {
                Context context = getContext();
                TextPaint paint = this.binding.title.getPaint();
                q.g(context, "context");
                q.g(paint, "paint");
                spannable = TextUtilsKt.toSpannable(title, context, messageId, z11, z12, z13, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : onTapChannel, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : onTapMention, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : onTapCommand, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : onTapEmoji, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : onTapSpoiler, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : 0.0f);
                draweeSpanStringBuilder = spannable;
            } else {
                draweeSpanStringBuilder = null;
            }
            String rawTitle = embed.getRawTitle();
            String str = rawTitle == null ? "" : rawTitle;
            if (embed.getUrl() != null) {
                num = Integer.valueOf(ThemeManagerKt.getTheme().getTextLink());
            } else {
                num = embed.getHeaderTextColor();
            }
            final String url = embed.getUrl();
            setTitle(str, draweeSpanStringBuilder, num, url != null ? new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    EmbedView.setEmbed_lKx2FiY$lambda$3$lambda$2(Function3.this, messageId, url, draweeSpanStringBuilder, view);
                }
            } : null, onTapCopyText);
            String rawDescription = embed.getRawDescription();
            if (rawDescription == null) {
                rawDescription = "";
            }
            StructurableText description = embed.getDescription();
            if (description != null) {
                Context context2 = getContext();
                TextPaint paint2 = this.binding.description.getPaint();
                Paint.FontMetrics fontMetrics = this.binding.description.getPaint().getFontMetrics();
                q.g(fontMetrics, "binding.description.paint.fontMetrics");
                float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
                q.g(context2, "context");
                q.g(paint2, "paint");
                draweeSpanStringBuilder2 = TextUtilsKt.toSpannable(description, context2, messageId, z11, z12, z13, paint2, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : new EmbedView$setEmbed$3(onLinkClicked, messageId), (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : onLongTapLinkNode, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : onTapChannel, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : onTapMention, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : onTapCommand, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : onTapEmoji, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : onTapSpoiler, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
            } else {
                draweeSpanStringBuilder2 = null;
            }
            setDescription(rawDescription, draweeSpanStringBuilder2, embed.getBodyTextColor(), onTapCopyText);
            EmbedProvider provider = embed.getProvider();
            setProvider(provider != null ? provider.getName() : null, embed.getProviderColor(), onTapCopyText);
            setBackgroundColorEnabled(!q.c(embed.getDisableBackgroundColor(), Boolean.TRUE), embed.getBackgroundColor());
            setBorder(embed.getBorderLeftColor());
            EmbedAuthor author = embed.getAuthor();
            String imageUrl = author != null ? author.getImageUrl() : null;
            EmbedAuthor author2 = embed.getAuthor();
            setAuthor(imageUrl, author2 != null ? author2.getName() : null);
            EmbedAuthor author3 = embed.getAuthor();
            setAuthorOnClickListener((author3 == null || author3.getUrl() == null) ? null : new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    EmbedView.setEmbed_lKx2FiY$lambda$5$lambda$4(Function3.this, messageId, embed, view);
                }
            }, onTapCopyText);
            List<EmbedField> fields = embed.getFields();
            if (fields == null) {
                fields = j.h();
            }
            m320setFieldsthlxGE(fields, messageId, z11, z12, z13, onLinkClicked, onLongTapLinkNode, onTapCopyText, onTapSpoiler, onTapEmoji, onTapChannel, onTapMention);
            EmbedFooter footer = embed.getFooter();
            String imageUrl2 = footer != null ? footer.getImageUrl() : null;
            EmbedFooter footer2 = embed.getFooter();
            setFooter(imageUrl2, footer2 != null ? footer2.getContent() : null, onTapCopyText);
            if (embed.getFailureState() == EmbedFailureState.AUTO_MODERATION_BLOCKED_MESSAGE) {
                setError(embed.getMessageSendError(), ThemeManagerKt.getTheme().getTextMuted(), embed.getIconURL(), Integer.valueOf(ColorUtilsKt.getColorCompat(this, R.color.red_345)));
            } else {
                setError(embed.getMessageSendError(), embed.getBodyTextColor(), embed.getIconURL(), null);
            }
            List<MediaSource> imageMediaSources = EmbedUtilsKt.toImageMediaSources(embed);
            if (imageMediaSources != null) {
                int i13 = (int) (i11 * 0.75d);
                int widthForEmbedContent = MessageAccessoriesView.Companion.getWidthForEmbedContent(i10);
                MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
                ConstraintLayout constraintLayout2 = this.binding.inlineMediaContainer;
                q.g(constraintLayout2, "binding.inlineMediaContainer");
                MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, constraintLayout2, widthForEmbedContent, i13, widthForEmbedContent, i13, null, 16, null);
                EmbedViewBinding embedViewBinding = this.binding;
                J0 = r.J0(imageMediaSources, new EmbedViewResizingMediaView[]{embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4});
                int i14 = 0;
                for (Object obj : J0) {
                    i14++;
                    if (i14 < 0) {
                        j.r();
                    }
                    Pair pair = (Pair) obj;
                    EmbedViewResizingMediaView mediaView = (EmbedViewResizingMediaView) pair.b();
                    q.g(mediaView, "mediaView");
                    setMediaEmbed(mediaView, embed, (MediaSource) pair.a(), 0, 0);
                    mediaView.setOnMediaClickListeners(new EmbedView$setEmbed$5$1(onMediaClicked, i14), onLongClickListener);
                }
            } else {
                MediaSource mediaSource2 = EmbedUtilsKt.toMediaSource(embed, z10, Double.valueOf(d10));
                if (mediaSource2 != null) {
                    EmbedViewResizingMediaView embedViewResizingMediaView3 = this.binding.inlineMediaView;
                    q.g(embedViewResizingMediaView3, "binding.inlineMediaView");
                    setMediaEmbed(embedViewResizingMediaView3, embed, mediaSource2, i11, MessageAccessoriesView.Companion.getWidthForEmbedContent(i10));
                    this.binding.inlineMediaView.setOnMediaClickListeners(new EmbedView$setEmbed$6$1(onMediaClicked), onLongClickListener);
                }
                boolean z14 = true;
                if (WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()] != 1 ? mediaSource2 != null : embed.getVideo() != null) {
                    z14 = false;
                }
                if (z14) {
                    setThumbnail(embed.getThumbnail());
                }
            }
        }
        configureSpoiler(spoilerConfig);
    }

    
    public EmbedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        EmbedViewBinding inflate = EmbedViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.maxThumbnailSize = context.getResources().getDimensionPixelSize(R.dimen.message_embed_max_thumbnail_size);
        inflate.getRoot().setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        SimpleDraweeSpanTextView _init_$lambda$0 = inflate.provider;
        q.g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 10.0f);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        q.g(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        TextView textView = inflate.authorName;
        q.g(textView, "binding.authorName");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont2);
        inflate.authorName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView textView2 = inflate.authorName;
        q.g(textView2, "binding.authorName");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = inflate.title;
        q.g(simpleDraweeSpanTextView, "binding.title");
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont2);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = inflate.title;
        q.g(simpleDraweeSpanTextView2, "binding.title");
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView2, 16.0f);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = inflate.description;
        q.g(simpleDraweeSpanTextView3, "binding.description");
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView3, discordFont);
        TextView textView3 = inflate.footerText;
        q.g(textView3, "binding.footerText");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        inflate.footerText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView4 = inflate.footerText;
        q.g(textView4, "binding.footerText");
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        TextView textView5 = inflate.error;
        q.g(textView5, "binding.error");
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont);
        TextView textView6 = inflate.error;
        q.g(textView6, "binding.error");
        SetTextSizeSpKt.setTextSizeSp(textView6, 12.0f);
        SimpleDraweeView simpleDraweeView2 = inflate.errorIcon;
        q.g(simpleDraweeView2, "binding.errorIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.Alert);
    }
}
