package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.EphemeralActionViewBinding;
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
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "ephemeralIndication", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "Lkotlin/Function1;", "", "onHelpArticleClicked", "setEphemeralIndication-AFFcxXc", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "setEphemeralIndication", "Lcom/discord/chat/databinding/EphemeralActionViewBinding;", "binding", "Lcom/discord/chat/databinding/EphemeralActionViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class EphemeralIndicationView extends ConstraintLayout {
    private EphemeralActionViewBinding binding;

    
    public EphemeralIndicationView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    
    public EphemeralIndicationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public  EphemeralIndicationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    
    public static final void setEphemeralIndication_AFFcxXc$lambda$4$lambda$3(Function1 onHelpArticleClicked, EphemeralIndication ephemeralIndication, View view) {
        q.g(onHelpArticleClicked, "$onHelpArticleClicked");
        q.g(ephemeralIndication, "$ephemeralIndication");
        onHelpArticleClicked.invoke(ephemeralIndication.getHelpArticleLink());
    }

    
    public final void m306setEphemeralIndicationAFFcxXc(String messageId, final EphemeralIndication ephemeralIndication, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, final Function1<? super String, Unit> onHelpArticleClicked) {
        DraweeSpanStringBuilder spannable;
        q.g(messageId, "messageId");
        q.g(ephemeralIndication, "ephemeralIndication");
        q.g(onLinkClicked, "onLinkClicked");
        q.g(onHelpArticleClicked, "onHelpArticleClicked");
        SimpleDraweeView simpleDraweeView = this.binding.chatListAdapterItemIconHelp;
        simpleDraweeView.setContentDescription(ephemeralIndication.getHelpButtonAccessibilityLabel());
        simpleDraweeView.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                EphemeralIndicationView.setEphemeralIndication_AFFcxXc$lambda$4$lambda$3(Function1.this, ephemeralIndication, view);
            }
        });
        SimpleDraweeSpanTextView setEphemeralIndication_AFFcxXc$lambda$6 = this.binding.chatListAdapterItemTextDismiss;
        q.f(setEphemeralIndication_AFFcxXc$lambda$6, "setEphemeralIndication_AFFcxXc$lambda$6");
        StructurableText content = ephemeralIndication.getContent();
        Context context = setEphemeralIndication_AFFcxXc$lambda$6.getContext();
        q.f(context, "context");
        EphemeralIndicationView$setEphemeralIndication$2$1 ephemeralIndicationView$setEphemeralIndication$2$1 = new EphemeralIndicationView$setEphemeralIndication$2$1(onLinkClicked, messageId);
        Paint.FontMetrics fontMetrics = setEphemeralIndication_AFFcxXc$lambda$6.getPaint().getFontMetrics();
        q.f(fontMetrics, "paint.fontMetrics");
        spannable = TextUtilsKt.toSpannable(content, context, messageId, false, false, false, (r42 & 32) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : ephemeralIndicationView$setEphemeralIndication$2$1, (r42 & 64) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r42 & 128) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r42 & 256) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r42 & 512) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r42 & 1024) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r42 & 8192) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (r42 & 16384) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (32768 & r42) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (65536 & r42) != 0 ? false : false, (131072 & r42) != 0 ? ThemeManagerKt.getTheme() : null, (r42 & 262144) != 0 ? -1.0f : TextUtilsKt.getBaselineHeight(fontMetrics));
        SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(setEphemeralIndication_AFFcxXc$lambda$6));
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setEphemeralIndication_AFFcxXc$lambda$6, spannable);
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setEphemeralIndication_AFFcxXc$lambda$6, false, 1, null);
    }

    
    public EphemeralIndicationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        EphemeralActionViewBinding inflate = EphemeralActionViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        SimpleDraweeSpanTextView _init_$lambda$0 = inflate.chatListAdapterItemTextDismiss;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SimpleDraweeView _init_$lambda$1 = this.binding.chatListAdapterItemIconHelp;
        q.f(_init_$lambda$1, "_init_$lambda$1");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$1, ReactAsset.Help);
        ColorUtilsKt.setTintColor(_init_$lambda$1, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        SimpleDraweeView _init_$lambda$2 = this.binding.chatListAdapterItemVisibilityIcon;
        q.f(_init_$lambda$2, "_init_$lambda$2");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$2, ReactAsset.ShowPassword);
        ColorUtilsKt.setTintColor(_init_$lambda$2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
    }
}
