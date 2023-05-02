package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.InteractionStatusViewBinding;
import com.discord.chat.presentation.textutils.TextUtilsKt;
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
/* loaded from: classes4.dex */
public final class InteractionStatusView extends ConstraintLayout {
    private InteractionStatusViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractionStatusView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ InteractionStatusView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: setInteractionStatus-ntcYbpo  reason: not valid java name */
    public final void m298setInteractionStatusntcYbpo(String messageId, InteractionStatus interactionStatus) {
        int i10;
        int i11;
        q.g(messageId, "messageId");
        q.g(interactionStatus, "interactionStatus");
        ProgressDots progressDots = this.binding.viewInteractionStatusLoadingDots;
        q.f(progressDots, "binding.viewInteractionStatusLoadingDots");
        int i12 = 0;
        if (interactionStatus.isLoading()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        progressDots.setVisibility(i10);
        SimpleDraweeView simpleDraweeView = this.binding.viewInteractionStatusDangerIcon;
        q.f(simpleDraweeView, "binding.viewInteractionStatusDangerIcon");
        if (!interactionStatus.isFailed()) {
            i12 = 8;
        }
        simpleDraweeView.setVisibility(i12);
        TextView setInteractionStatus_ntcYbpo$lambda$2 = this.binding.viewInteractionStatusLabelMessage;
        q.f(setInteractionStatus_ntcYbpo$lambda$2, "setInteractionStatus_ntcYbpo$lambda$2");
        StructurableText text = interactionStatus.getText();
        Context context = setInteractionStatus_ntcYbpo$lambda$2.getContext();
        q.f(context, "context");
        Paint.FontMetrics fontMetrics = setInteractionStatus_ntcYbpo$lambda$2.getPaint().getFontMetrics();
        q.f(fontMetrics, "paint.fontMetrics");
        DraweeSpanStringBuilder spannable$default = TextUtilsKt.toSpannable$default(text, context, messageId, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, TextUtilsKt.getBaselineHeight(fontMetrics), 262112, null);
        SpannableExtensionsKt.coverWithSpan(spannable$default, new BackgroundSpanDrawer(setInteractionStatus_ntcYbpo$lambda$2));
        ViewUtilsKt.setOptionalText(setInteractionStatus_ntcYbpo$lambda$2, spannable$default);
        if (interactionStatus.isFailed()) {
            i11 = ThemeManagerKt.getTheme().getTextDanger();
        } else {
            i11 = ThemeManagerKt.getTheme().getTextMuted();
        }
        setInteractionStatus_ntcYbpo$lambda$2.setTextColor(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        InteractionStatusViewBinding inflate = InteractionStatusViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        SimpleDraweeView _init_$lambda$0 = inflate.viewInteractionStatusDangerIcon;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$0, ReactAsset.Warning);
        ColorUtilsKt.setTintColor(_init_$lambda$0, Integer.valueOf(ThemeManagerKt.getTheme().getTextDanger()));
    }
}
