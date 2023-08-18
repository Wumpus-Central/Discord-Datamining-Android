package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.InteractionStatusViewBinding;
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
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.progress_dots.ProgressDots;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/view/InteractionStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/InteractionStatusViewBinding;", "setInteractionStatus", "", "messageId", "Lcom/discord/primitives/MessageId;", "interactionStatus", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "setInteractionStatus-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/interaction/InteractionStatus;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class InteractionStatusView extends ConstraintLayout {
    private InteractionStatusViewBinding binding;

    
    public InteractionStatusView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  InteractionStatusView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    
    public final void m322setInteractionStatusntcYbpo(String messageId, InteractionStatus interactionStatus) {
        int i10;
        DraweeSpanStringBuilder spannable;
        int i11;
        q.h(messageId, "messageId");
        q.h(interactionStatus, "interactionStatus");
        ProgressDots progressDots = this.binding.viewInteractionStatusLoadingDots;
        q.g(progressDots, "binding.viewInteractionStatusLoadingDots");
        int i12 = 0;
        if (interactionStatus.isLoading()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        progressDots.setVisibility(i10);
        SimpleDraweeView simpleDraweeView = this.binding.viewInteractionStatusDangerIcon;
        q.g(simpleDraweeView, "binding.viewInteractionStatusDangerIcon");
        if (!interactionStatus.isFailed()) {
            i12 = 8;
        }
        simpleDraweeView.setVisibility(i12);
        TextView setInteractionStatus_ntcYbpo$lambda$2 = this.binding.viewInteractionStatusLabelMessage;
        q.g(setInteractionStatus_ntcYbpo$lambda$2, "setInteractionStatus_ntcYbpo$lambda$2");
        StructurableText text = interactionStatus.getText();
        Context context = setInteractionStatus_ntcYbpo$lambda$2.getContext();
        q.g(context, "context");
        Paint.FontMetrics fontMetrics = setInteractionStatus_ntcYbpo$lambda$2.getPaint().getFontMetrics();
        q.g(fontMetrics, "paint.fontMetrics");
        spannable = TextUtilsKt.toSpannable(text, context, messageId, false, false, false, (r42 & 32) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r42 & 64) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r42 & 128) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r42 & 256) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r42 & 512) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r42 & 1024) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r42 & 8192) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (r42 & 16384) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (32768 & r42) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (65536 & r42) != 0 ? false : false, (131072 & r42) != 0 ? ThemeManagerKt.getTheme() : null, (r42 & 262144) != 0 ? -1.0f : TextUtilsKt.getBaselineHeight(fontMetrics));
        SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(setInteractionStatus_ntcYbpo$lambda$2));
        ViewUtilsKt.setOptionalText(setInteractionStatus_ntcYbpo$lambda$2, spannable);
        if (interactionStatus.isFailed()) {
            i11 = ThemeManagerKt.getTheme().getTextDanger();
        } else {
            i11 = ThemeManagerKt.getTheme().getTextMuted();
        }
        setInteractionStatus_ntcYbpo$lambda$2.setTextColor(i11);
    }

    
    public InteractionStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        InteractionStatusViewBinding inflate = InteractionStatusViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        SimpleDraweeView _init_$lambda$0 = inflate.viewInteractionStatusDangerIcon;
        q.g(_init_$lambda$0, "_init_$lambda$0");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$0, ReactAsset.Warning);
        ColorUtilsKt.setTintColor(_init_$lambda$0, Integer.valueOf(ThemeManagerKt.getTheme().getTextDanger()));
    }
}
