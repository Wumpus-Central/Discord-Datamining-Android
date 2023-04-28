package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C3147R;
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
import kotlin.collections.C9610j;
import kotlin.collections.C9618r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010u\u001a\u00020t\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010v¢\u0006\u0004\bx\u0010yJ9\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJK\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0017\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J8\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u001f\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002Jå\u0001\u00107\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u00062\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070*H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\u0010\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u00020&H\u0002J\u001b\u0010;\u001a\u00020\u00072\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b;\u0010<J0\u0010E\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0002J0\u0010H\u001a\u00020\u00072\b\u0010F\u001a\u0004\u0018\u00010\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J;\u0010M\u001a\u00020\u00072\b\u0010I\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010J\u001a\u00020\u00042\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bM\u0010NJ\u0012\u0010Q\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010OH\u0002J\b\u0010R\u001a\u00020\u0007H\u0002J\b\u0010S\u001a\u00020\u0007H\u0002J\b\u0010T\u001a\u00020\u0007H\u0002J\b\u0010U\u001a\u00020\u0007H\u0002J\b\u0010V\u001a\u00020\u0007H\u0002J\b\u0010W\u001a\u00020\u0007H\u0002J\b\u0010X\u001a\u00020\u0007H\u0002J\b\u0010Y\u001a\u00020\u0007H\u0002J\b\u0010Z\u001a\u00020\u0007H\u0002J\b\u0010[\u001a\u00020\u0007H\u0002J\b\u0010\\\u001a\u00020\u0007H\u0002J\b\u0010]\u001a\u00020\u0007H\u0002J\u008f\u0003\u0010m\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?2\u0006\u0010%\u001a\u00020$2\u0006\u0010^\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00042\u0006\u0010`\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2 \u0010a\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022 \u0010b\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u001c\u0010d\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070*2\b\u0010f\u001a\u0004\u0018\u00010e2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u00062\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010j\u001a\u00020cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010qR\u0016\u0010r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010s\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006z"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/EmbedView;", "Landroid/widget/FrameLayout;", "", "provider", "", "providerColor", "Lkotlin/Function1;", "", "onTapCopyText", "setProvider", "(Ljava/lang/CharSequence;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "", "rawTitle", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "title", "titleColor", "Landroid/view/View$OnClickListener;", "onClickListener", "onLongClickListener", "setTitle", "(Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/lang/Integer;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;)V", "authorUrl", "authorName", "setAuthor", "listener", "setAuthorOnClickListener", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "thumbnail", "setThumbnail", "rawDescription", "description", "descriptionColor", "setDescription", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "fields", "Lcom/discord/primitives/MessageId;", "messageId", "", "shouldAnimateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "onLinkLongClicked", "Lkotlin/Function0;", "onTapSpoiler", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lkotlin/Function3;", "onTapChannel", "onTapMention", "setFields-thlxG-E", "(Ljava/util/List;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "setFields", "isBackgroundColorEnabled", "setBackgroundColorEnabled", ViewProps.COLOR, "setBorder", "(Ljava/lang/Integer;)V", "Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;", "mediaView", "Lcom/discord/chat/bridge/embed/Embed;", "embed", "Lcom/discord/media_player/MediaSource;", "mediaSource", "maxHeightPx", "maxWidthPx", "setMediaEmbed", "imageUrl", "text", "setFooter", "error", "textColor", "iconURL", "iconTint", "setError", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "configureSpoiler", "reset", "clearInlineMedia", "clearBorder", "clearThumbnail", "clearProvider", "clearAuthor", "clearTitle", "clearDescription", "clearFields", "clearMedia", "clearFooter", "clearError", "constrainedWidth", "radiusPx", "shouldAutoPlayGifs", "onTitleLinkClicked", "onAuthorLinkClicked", "", "onMediaClicked", "Landroid/view/View$OnLongClickListener;", "onMediaLongClicked", "onLongTapLinkNode", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "portal", "setEmbed-lKx2FiY", "(Lcom/discord/chat/bridge/embed/Embed;Ljava/lang/String;IIIZZZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;D)V", "setEmbed", "Lcom/discord/chat/databinding/EmbedViewBinding;", "binding", "Lcom/discord/chat/databinding/EmbedViewBinding;", "Lcom/discord/chat/bridge/embed/Embed;", "maxThumbnailSize", "I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EmbedView extends FrameLayout {
    private final EmbedViewBinding binding;
    private Embed embed;
    private int maxThumbnailSize;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbedType.values().length];
            try {
                iArr[EmbedType.Rich.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbedView(Context context) {
        this(context, null, 2, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ EmbedView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void clearAuthor() {
        TextView textView = this.binding.authorName;
        C9677q.m14634f(textView, "binding.authorName");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        C9677q.m14634f(simpleDraweeView, "binding.authorAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
        LinearLayout linearLayout = this.binding.authorContainer;
        C9677q.m14634f(linearLayout, "binding.authorContainer");
        linearLayout.setVisibility(8);
    }

    private final void clearBorder() {
        View view = this.binding.border;
        C9677q.m14634f(view, "binding.border");
        view.setVisibility(8);
    }

    private final void clearDescription() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.description;
        C9677q.m14634f(simpleDraweeSpanTextView, "binding.description");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
    }

    private final void clearError() {
        TextView textView = this.binding.error;
        C9677q.m14634f(textView, "binding.error");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.errorIcon;
        C9677q.m14634f(simpleDraweeView, "binding.errorIcon");
        simpleDraweeView.setVisibility(8);
    }

    private final void clearFields() {
        LinearLayout linearLayout = this.binding.fieldsContainer;
        C9677q.m14634f(linearLayout, "binding.fieldsContainer");
        linearLayout.setVisibility(8);
    }

    private final void clearFooter() {
        TextView textView = this.binding.footerText;
        C9677q.m14634f(textView, "binding.footerText");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.footerAvatar;
        C9677q.m14634f(simpleDraweeView, "binding.footerAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
        LinearLayout linearLayout = this.binding.footerContainer;
        C9677q.m14634f(linearLayout, "binding.footerContainer");
        linearLayout.setVisibility(8);
        Space space = this.binding.spacer;
        C9677q.m14634f(space, "binding.spacer");
        space.setVisibility(0);
    }

    private final void clearInlineMedia() {
        EmbedViewBinding embedViewBinding = this.binding;
        EmbedViewResizingMediaView[] embedViewResizingMediaViewArr = {embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4};
        for (int i = 0; i < 4; i++) {
            EmbedViewResizingMediaView it = embedViewResizingMediaViewArr[i];
            C9677q.m14634f(it, "it");
            MediaView.setMediaData$default(it, null, false, false, false, null, false, null, null, false, false, false, 2046, null);
            it.setOnMediaClickListeners(null, null);
            it.setVisibility(8);
        }
    }

    private final void clearMedia() {
        EmbedViewResizingMediaView clearMedia$lambda$29 = this.binding.mediaView;
        C9677q.m14634f(clearMedia$lambda$29, "clearMedia$lambda$29");
        MediaView.setMediaData$default(clearMedia$lambda$29, null, false, false, false, null, false, null, null, false, false, false, 2046, null);
        clearMedia$lambda$29.setVisibility(8);
    }

    private final void clearProvider() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.provider;
        C9677q.m14634f(simpleDraweeSpanTextView, "binding.provider");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
    }

    private final void clearThumbnail() {
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        C9677q.m14634f(simpleDraweeView, "binding.thumbnail");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
    }

    private final void clearTitle() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.title;
        C9677q.m14634f(simpleDraweeSpanTextView, "binding.title");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = this.binding.title;
        C9677q.m14634f(simpleDraweeSpanTextView2, "binding.title");
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setAuthor(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.discord.chat.databinding.EmbedViewBinding r0 = r6.binding
            android.widget.LinearLayout r0 = r0.authorContainer
            java.lang.String r1 = "binding.authorContainer"
            kotlin.jvm.internal.C9677q.m14634f(r0, r1)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L_0x0016
            boolean r3 = p327ri.C12576l.m5767w(r7)
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            if (r3 == 0) goto L_0x0029
            if (r8 == 0) goto L_0x0024
            boolean r3 = p327ri.C12576l.m5767w(r8)
            if (r3 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r3 = r2
            goto L_0x0025
        L_0x0024:
            r3 = r1
        L_0x0025:
            if (r3 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r2 = 8
        L_0x002e:
            r0.setVisibility(r2)
            com.discord.chat.databinding.EmbedViewBinding r0 = r6.binding
            android.widget.TextView r0 = r0.authorName
            java.lang.String r1 = "binding.authorName"
            kotlin.jvm.internal.C9677q.m14634f(r0, r1)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r0, r8)
            com.discord.chat.databinding.EmbedViewBinding r8 = r6.binding
            com.facebook.drawee.view.SimpleDraweeView r0 = r8.authorAvatar
            java.lang.String r8 = "binding.authorAvatar"
            kotlin.jvm.internal.C9677q.m14634f(r0, r8)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r1 = r7
            com.discord.image.fresco.SetOptionalImageUrlKt.setOptionalImageUrl$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setAuthor(java.lang.String, java.lang.String):void");
    }

    private final void setAuthorOnClickListener(View.OnClickListener onClickListener, final Function1<? super CharSequence, Unit> function1) {
        TextView setAuthorOnClickListener$lambda$15 = this.binding.authorName;
        C9677q.m14634f(setAuthorOnClickListener$lambda$15, "setAuthorOnClickListener$lambda$15");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(setAuthorOnClickListener$lambda$15, false, onClickListener, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setAuthorOnClickListener$lambda$15, false, new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean authorOnClickListener$lambda$15$lambda$14;
                authorOnClickListener$lambda$15$lambda$14 = EmbedView.setAuthorOnClickListener$lambda$15$lambda$14(Function1.this, this, view);
                return authorOnClickListener$lambda$15$lambda$14;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setAuthorOnClickListener$lambda$15$lambda$14(Function1 onTapCopyText, EmbedView this$0, View view) {
        C9677q.m14633g(onTapCopyText, "$onTapCopyText");
        C9677q.m14633g(this$0, "this$0");
        CharSequence text = this$0.binding.authorName.getText();
        C9677q.m14634f(text, "binding.authorName.text");
        onTapCopyText.invoke(text);
        return true;
    }

    private final void setBackgroundColorEnabled(boolean z) {
        if (z) {
            setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        } else {
            setBackgroundColor(0);
        }
    }

    private final void setBorder(Integer num) {
        boolean z;
        if (num != null) {
            this.binding.border.setBackgroundColor(num.intValue());
        }
        View view = this.binding.border;
        C9677q.m14634f(view, "binding.border");
        int i = 0;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final void setDescription(final String str, DraweeSpanStringBuilder draweeSpanStringBuilder, int i, final Function1<? super CharSequence, Unit> function1) {
        SimpleDraweeSpanTextView setDescription$lambda$19 = this.binding.description;
        C9677q.m14634f(setDescription$lambda$19, "setDescription$lambda$19");
        if (draweeSpanStringBuilder != null) {
            SpannableExtensionsKt.coverWithSpan(draweeSpanStringBuilder, new BackgroundSpanDrawer(setDescription$lambda$19));
        } else {
            draweeSpanStringBuilder = null;
        }
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setDescription$lambda$19, draweeSpanStringBuilder);
        setDescription$lambda$19.setTextColor(i);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setDescription$lambda$19, false, new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean description$lambda$19$lambda$18;
                description$lambda$19$lambda$18 = EmbedView.setDescription$lambda$19$lambda$18(Function1.this, str, view);
                return description$lambda$19$lambda$18;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDescription$lambda$19$lambda$18(Function1 onTapCopyText, String rawDescription, View view) {
        C9677q.m14633g(onTapCopyText, "$onTapCopyText");
        C9677q.m14633g(rawDescription, "$rawDescription");
        onTapCopyText.invoke(rawDescription);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbed_lKx2FiY$lambda$3$lambda$2(Function3 onTitleLinkClicked, String messageId, String url, DraweeSpanStringBuilder draweeSpanStringBuilder, View view) {
        String str;
        C9677q.m14633g(onTitleLinkClicked, "$onTitleLinkClicked");
        C9677q.m14633g(messageId, "$messageId");
        C9677q.m14633g(url, "$url");
        MessageId messageId2 = MessageId.m42115boximpl(messageId);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbed_lKx2FiY$lambda$5$lambda$4(Function3 onAuthorLinkClicked, String messageId, Embed embed, View view) {
        C9677q.m14633g(onAuthorLinkClicked, "$onAuthorLinkClicked");
        C9677q.m14633g(messageId, "$messageId");
        C9677q.m14633g(embed, "$embed");
        onAuthorLinkClicked.invoke(MessageId.m42115boximpl(messageId), embed.getAuthor().getUrl(), embed.getAuthor().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setError(java.lang.String r3, int r4, java.lang.String r5, java.lang.Integer r6) {
        /*
            r2 = this;
            com.discord.chat.databinding.EmbedViewBinding r0 = r2.binding
            android.widget.TextView r0 = r0.error
            java.lang.String r1 = "setError$lambda$27"
            kotlin.jvm.internal.C9677q.m14634f(r0, r1)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r0, r3)
            com.discord.fonts.DiscordFont r1 = com.discord.fonts.DiscordFont.PrimaryMedium
            com.discord.fonts.DiscordFontUtilsKt.setDiscordFont(r0, r1)
            r0.setTextColor(r4)
            com.discord.chat.databinding.EmbedViewBinding r0 = r2.binding
            com.facebook.drawee.view.SimpleDraweeView r0 = r0.errorIcon
            java.lang.String r1 = "binding.errorIcon"
            kotlin.jvm.internal.C9677q.m14634f(r0, r1)
            if (r6 == 0) goto L_0x0023
            int r4 = r6.intValue()
        L_0x0023:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.discord.theme.utils.ColorUtilsKt.setTintColor(r0, r4)
            com.discord.chat.databinding.EmbedViewBinding r4 = r2.binding
            com.facebook.drawee.view.SimpleDraweeView r4 = r4.errorIcon
            kotlin.jvm.internal.C9677q.m14634f(r4, r1)
            com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(r4, r5)
            com.discord.chat.databinding.EmbedViewBinding r4 = r2.binding
            com.facebook.drawee.view.SimpleDraweeView r4 = r4.errorIcon
            kotlin.jvm.internal.C9677q.m14634f(r4, r1)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0048
            boolean r3 = p327ri.C12576l.m5767w(r3)
            if (r3 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r3 = r5
            goto L_0x0049
        L_0x0048:
            r3 = r6
        L_0x0049:
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r5 = 8
        L_0x004f:
            r4.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setError(java.lang.String, int, java.lang.String, java.lang.Integer):void");
    }

    static /* synthetic */ void setError$default(EmbedView embedView, String str, int i, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        embedView.setError(str, i, str2, num);
    }

    /* renamed from: setFields-thlxG-E  reason: not valid java name */
    private final void m41853setFieldsthlxGE(List<EmbedField> list, String str, boolean z, boolean z2, boolean z3, Function2<? super MessageId, ? super LinkContentNode, Unit> function2, Function1<? super LinkContentNode, Unit> function1, Function1<? super CharSequence, Unit> function12, Function0<Unit> function0, Function1<? super EmojiContentNode, Unit> function13, Function3<? super String, ? super String, ? super String, Unit> function3, Function2<? super String, ? super String, Unit> function22) {
        EmbedView$setFields$onLinkClickedWithMessageId$1 embedView$setFields$onLinkClickedWithMessageId$1;
        String str2;
        EmbedFieldView embedFieldView;
        String str3;
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        String str4;
        EmbedFieldView embedFieldView2;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        EmbedView$setFields$onLinkClickedWithMessageId$1 embedView$setFields$onLinkClickedWithMessageId$12 = new EmbedView$setFields$onLinkClickedWithMessageId$1(function2, str);
        LinearLayout setFields_thlxG_E$lambda$22 = this.binding.fieldsContainer;
        C9677q.m14634f(setFields_thlxG_E$lambda$22, "setFields_thlxG_E$lambda$22");
        int i = 0;
        setFields_thlxG_E$lambda$22.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        ViewGroupUtilsKt.setUpLayoutForList(setFields_thlxG_E$lambda$22, list.size(), new EmbedView$setFields$1$1(setFields_thlxG_E$lambda$22));
        for (Object obj : list) {
            i++;
            if (i < 0) {
                C9610j.m14810s();
            }
            EmbedField embedField = (EmbedField) obj;
            View childAt = setFields_thlxG_E$lambda$22.getChildAt(i);
            C9677q.m14635e(childAt, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.EmbedFieldView");
            EmbedFieldView embedFieldView3 = (EmbedFieldView) childAt;
            String rawName = embedField.getRawName();
            String str5 = rawName == null ? "" : rawName;
            StructurableText name = embedField.getName();
            if (name != null) {
                Context context = embedFieldView3.getContext();
                C9677q.m14634f(context, "context");
                str2 = "context";
                setFields_thlxG_E$lambda$22 = setFields_thlxG_E$lambda$22;
                embedView$setFields$onLinkClickedWithMessageId$1 = embedView$setFields$onLinkClickedWithMessageId$12;
                draweeSpanStringBuilder = TextUtilsKt.toSpannable$default(name, context, str, z, z2, z3, embedView$setFields$onLinkClickedWithMessageId$12, function1, function3, null, function22, null, null, null, function13, null, function0, false, null, 0.0f, 482560, null);
                str3 = str5;
                embedFieldView = embedFieldView3;
            } else {
                str2 = "context";
                setFields_thlxG_E$lambda$22 = setFields_thlxG_E$lambda$22;
                embedView$setFields$onLinkClickedWithMessageId$1 = embedView$setFields$onLinkClickedWithMessageId$12;
                str3 = str5;
                embedFieldView = embedFieldView3;
                draweeSpanStringBuilder = null;
            }
            embedFieldView.setName(str3, draweeSpanStringBuilder, function12);
            String rawValue = embedField.getRawValue();
            String str6 = rawValue == null ? "" : rawValue;
            StructurableText value = embedField.getValue();
            if (value != null) {
                Context context2 = embedFieldView.getContext();
                Paint.FontMetrics fontMetrics = embedFieldView.getBinding().value.getPaint().getFontMetrics();
                C9677q.m14634f(fontMetrics, "binding.value.paint.fontMetrics");
                float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
                C9677q.m14634f(context2, str2);
                draweeSpanStringBuilder2 = TextUtilsKt.toSpannable$default(value, context2, str, z, z2, z3, embedView$setFields$onLinkClickedWithMessageId$1, function1, function3, null, function22, null, null, null, function13, null, function0, false, null, baselineHeight, 220416, null);
                str4 = str6;
                embedFieldView2 = embedFieldView;
            } else {
                str4 = str6;
                embedFieldView2 = embedFieldView;
                draweeSpanStringBuilder2 = null;
            }
            embedFieldView2.setValue(str4, draweeSpanStringBuilder2, function12);
            embedView$setFields$onLinkClickedWithMessageId$12 = embedView$setFields$onLinkClickedWithMessageId$1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setFooter(java.lang.String r10, final java.lang.String r11, final kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> r12) {
        /*
            r9 = this;
            com.discord.chat.databinding.EmbedViewBinding r0 = r9.binding
            android.widget.LinearLayout r0 = r0.footerContainer
            java.lang.String r1 = "binding.footerContainer"
            kotlin.jvm.internal.C9677q.m14634f(r0, r1)
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L_0x0016
            boolean r3 = p327ri.C12576l.m5767w(r10)
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            if (r3 == 0) goto L_0x002a
            if (r11 == 0) goto L_0x0024
            boolean r3 = p327ri.C12576l.m5767w(r11)
            if (r3 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r3 = r2
            goto L_0x0025
        L_0x0024:
            r3 = r1
        L_0x0025:
            if (r3 != 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r3 = r2
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            if (r3 == 0) goto L_0x002f
            r3 = r2
            goto L_0x0031
        L_0x002f:
            r3 = 8
        L_0x0031:
            r0.setVisibility(r3)
            com.discord.chat.databinding.EmbedViewBinding r0 = r9.binding
            com.facebook.drawee.view.SimpleDraweeView r3 = r0.footerAvatar
            java.lang.String r0 = "binding.footerAvatar"
            kotlin.jvm.internal.C9677q.m14634f(r3, r0)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r4 = r10
            com.discord.image.fresco.SetOptionalImageUrlKt.setOptionalImageUrl$default(r3, r4, r5, r6, r7, r8)
            com.discord.chat.databinding.EmbedViewBinding r10 = r9.binding
            android.widget.TextView r10 = r10.footerText
            java.lang.String r0 = "setFooter$lambda$26"
            kotlin.jvm.internal.C9677q.m14634f(r10, r0)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r10, r11)
            r0 = 0
            if (r11 == 0) goto L_0x005a
            com.discord.chat.presentation.message.view.m r3 = new com.discord.chat.presentation.message.view.m
            r3.<init>()
            goto L_0x005b
        L_0x005a:
            r3 = r0
        L_0x005b:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(r10, r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setFooter(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setFooter$lambda$26$lambda$25$lambda$24(Function1 onTapCopyText, String str, View view) {
        C9677q.m14633g(onTapCopyText, "$onTapCopyText");
        onTapCopyText.invoke(str);
        return true;
    }

    private final void setMediaEmbed(EmbedViewResizingMediaView embedViewResizingMediaView, Embed embed, MediaSource mediaSource, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (i > 0 && i2 > 0) {
            Pair<Integer, Integer> targetDimensions = EmbedUtilsKt.getTargetDimensions(embed);
            Integer a = targetDimensions.m15067a();
            Integer b = targetDimensions.m15066b();
            if (a != null) {
                i3 = a.intValue();
            } else {
                i3 = 0;
            }
            if (b != null) {
                i4 = b.intValue();
            } else {
                i4 = 0;
            }
            embedViewResizingMediaView.setTarget(i3, i4, i, i2);
        }
        embedViewResizingMediaView.setVisibility(0);
        EmbedThumbnail thumbnail = embed.getThumbnail();
        if (thumbnail != null) {
            z = C9677q.m14638b(thumbnail.getShowPlayButton(), Boolean.TRUE);
        } else {
            z = false;
        }
        MediaView.setMediaData$default(embedViewResizingMediaView, mediaSource, false, false, false, null, false, null, null, false, z, false, 1534, null);
    }

    private final void setProvider(final CharSequence charSequence, Integer num, final Function1<? super CharSequence, Unit> function1) {
        int i;
        View.OnLongClickListener onLongClickListener;
        SimpleDraweeSpanTextView setProvider$lambda$10 = this.binding.provider;
        C9677q.m14634f(setProvider$lambda$10, "setProvider$lambda$10");
        ViewUtilsKt.setOptionalText(setProvider$lambda$10, charSequence);
        if (num != null) {
            i = num.intValue();
        } else {
            i = ThemeManagerKt.getTheme().getTextNormal();
        }
        setProvider$lambda$10.setTextColor(i);
        if (charSequence != null) {
            onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.r
                @Override // android.view.View.OnLongClickListener
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setProvider$lambda$10$lambda$9$lambda$8(Function1 onTapCopyText, CharSequence charSequence, View view) {
        C9677q.m14633g(onTapCopyText, "$onTapCopyText");
        onTapCopyText.invoke(charSequence);
        return true;
    }

    private final void setThumbnail(EmbedThumbnail embedThumbnail) {
        int i;
        String str;
        SimpleDraweeView setThumbnail$lambda$16 = this.binding.thumbnail;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        C9677q.m14634f(setThumbnail$lambda$16, "setThumbnail$lambda$16");
        int i2 = 0;
        if (embedThumbnail != null) {
            i = embedThumbnail.getWidth();
        } else {
            i = 0;
        }
        if (embedThumbnail != null) {
            i2 = embedThumbnail.getHeight();
        }
        int i3 = this.maxThumbnailSize;
        MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, setThumbnail$lambda$16, i, i2, i3, i3, null, 16, null);
        if (embedThumbnail != null) {
            str = embedThumbnail.getProxyURL();
        } else {
            str = null;
        }
        SetOptionalImageUrlKt.setOptionalImageUrl$default(setThumbnail$lambda$16, str, false, null, 6, null);
    }

    private final void setTitle(final String str, DraweeSpanStringBuilder draweeSpanStringBuilder, Integer num, View.OnClickListener onClickListener, final Function1<? super String, Unit> function1) {
        int i;
        View.OnLongClickListener onLongClickListener;
        SimpleDraweeSpanTextView setTitle$lambda$13 = this.binding.title;
        C9677q.m14634f(setTitle$lambda$13, "setTitle$lambda$13");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setTitle$lambda$13, draweeSpanStringBuilder);
        if (num != null) {
            i = num.intValue();
        } else {
            i = ThemeManagerKt.getTheme().getTextNormal();
        }
        setTitle$lambda$13.setTextColor(i);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(setTitle$lambda$13, false, onClickListener, 1, null);
        if (draweeSpanStringBuilder != null) {
            onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.n
                @Override // android.view.View.OnLongClickListener
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTitle$lambda$13$lambda$12$lambda$11(Function1 onLongClickListener, String rawTitle, View view) {
        C9677q.m14633g(onLongClickListener, "$onLongClickListener");
        C9677q.m14633g(rawTitle, "$rawTitle");
        onLongClickListener.invoke(rawTitle);
        return true;
    }

    /* renamed from: setEmbed-lKx2FiY  reason: not valid java name */
    public final void m41854setEmbedlKx2FiY(final Embed embed, final String messageId, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, final Function3<? super MessageId, ? super String, ? super String, Unit> onTitleLinkClicked, final Function3<? super MessageId, ? super String, ? super String, Unit> onAuthorLinkClicked, Function2<? super Double, ? super Integer, Unit> onMediaClicked, View.OnLongClickListener onLongClickListener, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, Function1<? super LinkContentNode, Unit> onLongTapLinkNode, Function1<? super CharSequence, Unit> onTapCopyText, Function0<Unit> onTapSpoiler, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, SpoilerConfig spoilerConfig, double d) {
        final DraweeSpanStringBuilder draweeSpanStringBuilder;
        Integer num;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        List L0;
        C9677q.m14633g(embed, "embed");
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(onTitleLinkClicked, "onTitleLinkClicked");
        C9677q.m14633g(onAuthorLinkClicked, "onAuthorLinkClicked");
        C9677q.m14633g(onMediaClicked, "onMediaClicked");
        C9677q.m14633g(onLinkClicked, "onLinkClicked");
        C9677q.m14633g(onLongTapLinkNode, "onLongTapLinkNode");
        C9677q.m14633g(onTapCopyText, "onTapCopyText");
        C9677q.m14633g(onTapSpoiler, "onTapSpoiler");
        C9677q.m14633g(onTapEmoji, "onTapEmoji");
        C9677q.m14633g(onTapChannel, "onTapChannel");
        C9677q.m14633g(onTapMention, "onTapMention");
        C9677q.m14633g(onTapCommand, "onTapCommand");
        if (!C9677q.m14638b(embed, this.embed)) {
            reset();
            this.embed = embed;
        }
        View root = this.binding.getRoot();
        C9677q.m14634f(root, "binding.root");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, i3);
        ConstraintLayout constraintLayout = this.binding.inlineMediaContainer;
        C9677q.m14634f(constraintLayout, "binding.inlineMediaContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(constraintLayout, i3);
        EmbedViewResizingMediaView embedViewResizingMediaView = this.binding.mediaView;
        C9677q.m14634f(embedViewResizingMediaView, "binding.mediaView");
        ViewClippingUtilsKt.clipToRoundedRectangle(embedViewResizingMediaView, i3);
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        C9677q.m14634f(simpleDraweeView, "binding.thumbnail");
        ViewClippingUtilsKt.clipToRoundedRectangle(simpleDraweeView, i3);
        if (!EmbedUtilsKt.isInlineMedia(embed)) {
            MediaSource mediaSource = EmbedUtilsKt.toMediaSource(embed, z, Double.valueOf(d));
            if (mediaSource != null) {
                Space space = this.binding.spacer;
                C9677q.m14634f(space, "binding.spacer");
                space.setVisibility(8);
                if (mediaSource.getPreviewUrl() != null) {
                    EmbedViewResizingMediaView embedViewResizingMediaView2 = this.binding.mediaView;
                    C9677q.m14634f(embedViewResizingMediaView2, "binding.mediaView");
                    setMediaEmbed(embedViewResizingMediaView2, embed, mediaSource, i2, MessageAccessoriesView.Companion.getWidth(i));
                    this.binding.mediaView.setOnMediaClickListeners(new EmbedView$setEmbed$1$1(onMediaClicked), onLongClickListener);
                    setBackgroundColorEnabled(false);
                }
            }
        } else {
            StructurableText title = embed.getTitle();
            if (title != null) {
                Context context = getContext();
                C9677q.m14634f(context, "context");
                draweeSpanStringBuilder = TextUtilsKt.toSpannable$default(title, context, messageId, z2, z3, z4, null, null, onTapChannel, null, onTapMention, onTapCommand, null, null, onTapEmoji, null, onTapSpoiler, false, null, 0.0f, 481632, null);
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
            setTitle(str, draweeSpanStringBuilder, num, url != null ? new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.o
                @Override // android.view.View.OnClickListener
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
                Paint.FontMetrics fontMetrics = this.binding.description.getPaint().getFontMetrics();
                C9677q.m14634f(fontMetrics, "binding.description.paint.fontMetrics");
                float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
                C9677q.m14634f(context2, "context");
                draweeSpanStringBuilder2 = TextUtilsKt.toSpannable$default(description, context2, messageId, z2, z3, z4, new EmbedView$setEmbed$3(onLinkClicked, messageId), onLongTapLinkNode, onTapChannel, null, onTapMention, onTapCommand, null, null, onTapEmoji, null, onTapSpoiler, false, null, baselineHeight, 219392, null);
            } else {
                draweeSpanStringBuilder2 = null;
            }
            setDescription(rawDescription, draweeSpanStringBuilder2, embed.getBodyTextColor(), onTapCopyText);
            EmbedProvider provider = embed.getProvider();
            setProvider(provider != null ? provider.getName() : null, embed.getProviderColor(), onTapCopyText);
            setBackgroundColorEnabled(!C9677q.m14638b(embed.getDisableBackgroundColor(), Boolean.TRUE));
            setBorder(embed.getBorderLeftColor());
            EmbedAuthor author = embed.getAuthor();
            String imageUrl = author != null ? author.getImageUrl() : null;
            EmbedAuthor author2 = embed.getAuthor();
            setAuthor(imageUrl, author2 != null ? author2.getName() : null);
            EmbedAuthor author3 = embed.getAuthor();
            setAuthorOnClickListener((author3 == null || author3.getUrl() == null) ? null : new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmbedView.setEmbed_lKx2FiY$lambda$5$lambda$4(Function3.this, messageId, embed, view);
                }
            }, onTapCopyText);
            List<EmbedField> fields = embed.getFields();
            if (fields == null) {
                fields = C9610j.m14820i();
            }
            m41853setFieldsthlxGE(fields, messageId, z2, z3, z4, onLinkClicked, onLongTapLinkNode, onTapCopyText, onTapSpoiler, onTapEmoji, onTapChannel, onTapMention);
            EmbedFooter footer = embed.getFooter();
            String imageUrl2 = footer != null ? footer.getImageUrl() : null;
            EmbedFooter footer2 = embed.getFooter();
            setFooter(imageUrl2, footer2 != null ? footer2.getContent() : null, onTapCopyText);
            if (embed.getFailureState() == EmbedFailureState.AUTO_MODERATION_BLOCKED_MESSAGE) {
                setError(embed.getMessageSendError(), ThemeManagerKt.getTheme().getTextMuted(), embed.getIconURL(), Integer.valueOf(ColorUtilsKt.getColorCompat(this, C3147R.color.red_345)));
            } else {
                setError(embed.getMessageSendError(), embed.getBodyTextColor(), embed.getIconURL(), null);
            }
            List<MediaSource> imageMediaSources = EmbedUtilsKt.toImageMediaSources(embed);
            if (imageMediaSources != null) {
                int i4 = (int) (i2 * 0.75d);
                int widthForEmbedContent = MessageAccessoriesView.Companion.getWidthForEmbedContent(i);
                MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
                ConstraintLayout constraintLayout2 = this.binding.inlineMediaContainer;
                C9677q.m14634f(constraintLayout2, "binding.inlineMediaContainer");
                MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, constraintLayout2, widthForEmbedContent, i4, widthForEmbedContent, i4, null, 16, null);
                EmbedViewBinding embedViewBinding = this.binding;
                L0 = C9618r.m14779L0(imageMediaSources, new EmbedViewResizingMediaView[]{embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4});
                int i5 = 0;
                for (Object obj : L0) {
                    i5++;
                    if (i5 < 0) {
                        C9610j.m14810s();
                    }
                    Pair pair = (Pair) obj;
                    EmbedViewResizingMediaView mediaView = (EmbedViewResizingMediaView) pair.m15066b();
                    C9677q.m14634f(mediaView, "mediaView");
                    setMediaEmbed(mediaView, embed, (MediaSource) pair.m15067a(), 0, 0);
                    mediaView.setOnMediaClickListeners(new EmbedView$setEmbed$5$1(onMediaClicked, i5), onLongClickListener);
                }
            } else {
                MediaSource mediaSource2 = EmbedUtilsKt.toMediaSource(embed, z, Double.valueOf(d));
                if (mediaSource2 != null) {
                    EmbedViewResizingMediaView embedViewResizingMediaView3 = this.binding.inlineMediaView;
                    C9677q.m14634f(embedViewResizingMediaView3, "binding.inlineMediaView");
                    setMediaEmbed(embedViewResizingMediaView3, embed, mediaSource2, i2, MessageAccessoriesView.Companion.getWidthForEmbedContent(i));
                    this.binding.inlineMediaView.setOnMediaClickListeners(new EmbedView$setEmbed$6$1(onMediaClicked), onLongClickListener);
                }
                if (WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()] != 1 ? mediaSource2 == null : embed.getVideo() == null) {
                    setThumbnail(embed.getThumbnail());
                }
            }
        }
        configureSpoiler(spoilerConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9677q.m14633g(context, "context");
        EmbedViewBinding inflate = EmbedViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.maxThumbnailSize = context.getResources().getDimensionPixelSize(C3147R.dimen.message_embed_max_thumbnail_size);
        inflate.getRoot().setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        SimpleDraweeSpanTextView _init_$lambda$0 = inflate.provider;
        C9677q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 10.0f);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        C9677q.m14634f(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        TextView textView = inflate.authorName;
        C9677q.m14634f(textView, "binding.authorName");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont2);
        inflate.authorName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView textView2 = inflate.authorName;
        C9677q.m14634f(textView2, "binding.authorName");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = inflate.title;
        C9677q.m14634f(simpleDraweeSpanTextView, "binding.title");
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont2);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = inflate.title;
        C9677q.m14634f(simpleDraweeSpanTextView2, "binding.title");
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView2, 16.0f);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = inflate.description;
        C9677q.m14634f(simpleDraweeSpanTextView3, "binding.description");
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView3, discordFont);
        TextView textView3 = inflate.footerText;
        C9677q.m14634f(textView3, "binding.footerText");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        inflate.footerText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView4 = inflate.footerText;
        C9677q.m14634f(textView4, "binding.footerText");
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        TextView textView5 = inflate.error;
        C9677q.m14634f(textView5, "binding.error");
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont);
        TextView textView6 = inflate.error;
        C9677q.m14634f(textView6, "binding.error");
        SetTextSizeSpKt.setTextSizeSp(textView6, 12.0f);
        SimpleDraweeView simpleDraweeView2 = inflate.errorIcon;
        C9677q.m14634f(simpleDraweeView2, "binding.errorIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.Alert);
    }
}
