package com.discord.chat.presentation.separator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.SeparatorSummaryViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/separator/SummarySeparatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SeparatorSummaryViewBinding;", "setDividerColor", "", ViewProps.COLOR, "", "setIsBeforeContent", "isBeforeContent", "", "setJumpToBottomHandler", "onJumpToBottom", "Landroid/view/View$OnClickListener;", "setMoreActionsHandler", "onMoreActions", "setText", "text", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SummarySeparatorView extends ConstraintLayout {
    private final SeparatorSummaryViewBinding binding;

    
    public SummarySeparatorView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  SummarySeparatorView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void setDividerColor(int i10) {
        SeparatorSummaryViewBinding separatorSummaryViewBinding = this.binding;
        SimpleDraweeView indicatorTop = separatorSummaryViewBinding.indicatorTop;
        q.f(indicatorTop, "indicatorTop");
        ColorUtilsKt.setTintColor(indicatorTop, Integer.valueOf(i10));
        SimpleDraweeView indicatorBottom = separatorSummaryViewBinding.indicatorBottom;
        q.f(indicatorBottom, "indicatorBottom");
        ColorUtilsKt.setTintColor(indicatorBottom, Integer.valueOf(i10));
        separatorSummaryViewBinding.rightBar.setBackgroundColor(i10);
        SimpleDraweeView icon = separatorSummaryViewBinding.icon;
        q.f(icon, "icon");
        ColorUtilsKt.setTintColor(icon, Integer.valueOf(i10));
        separatorSummaryViewBinding.middleText.setTextColor(i10);
    }

    public final void setIsBeforeContent(boolean z10) {
        SeparatorSummaryViewBinding separatorSummaryViewBinding = this.binding;
        if (z10) {
            separatorSummaryViewBinding.indicatorTop.setVisibility(0);
            separatorSummaryViewBinding.indicatorBottom.setVisibility(8);
            separatorSummaryViewBinding.jumpButton.setVisibility(0);
            separatorSummaryViewBinding.moreButton.setVisibility(8);
            return;
        }
        separatorSummaryViewBinding.indicatorTop.setVisibility(8);
        separatorSummaryViewBinding.indicatorBottom.setVisibility(0);
        separatorSummaryViewBinding.jumpButton.setVisibility(8);
        separatorSummaryViewBinding.moreButton.setVisibility(0);
    }

    public final void setJumpToBottomHandler(View.OnClickListener onJumpToBottom) {
        q.g(onJumpToBottom, "onJumpToBottom");
        SimpleDraweeView simpleDraweeView = this.binding.jumpButton;
        q.f(simpleDraweeView, "binding.jumpButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onJumpToBottom, 1, null);
    }

    public final void setMoreActionsHandler(View.OnClickListener onMoreActions) {
        q.g(onMoreActions, "onMoreActions");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, onMoreActions, 1, null);
        SimpleDraweeView simpleDraweeView = this.binding.moreButton;
        q.f(simpleDraweeView, "binding.moreButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onMoreActions, 1, null);
    }

    public final void setText(CharSequence text) {
        q.g(text, "text");
        this.binding.middleText.setText(text);
    }

    
    public SummarySeparatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        SeparatorSummaryViewBinding inflate = SeparatorSummaryViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        View root = inflate.getRoot();
        q.f(root, "root");
        root.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.message_divider_margin_start), root.getPaddingTop(), context.getResources().getDimensionPixelSize(R.dimen.message_divider_margin_end), root.getPaddingBottom());
        TextView lambda$1$lambda$0 = inflate.middleText;
        q.f(lambda$1$lambda$0, "lambda$1$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(lambda$1$lambda$0, SizeUtilsKt.getDpToPx(4));
        DiscordFontUtilsKt.setDiscordFont(lambda$1$lambda$0, DiscordFont.PrimarySemibold);
        SetTextSizeSpKt.setTextSizeSp(lambda$1$lambda$0, 12.0f);
        SimpleDraweeView indicatorTop = inflate.indicatorTop;
        q.f(indicatorTop, "indicatorTop");
        ReactAssetUtilsKt.setReactAsset(indicatorTop, ReactAsset.SummaryIndicatorStart);
        SimpleDraweeView indicatorBottom = inflate.indicatorBottom;
        q.f(indicatorBottom, "indicatorBottom");
        ReactAssetUtilsKt.setReactAsset(indicatorBottom, ReactAsset.SummaryIndicatorEnd);
        SimpleDraweeView icon = inflate.icon;
        q.f(icon, "icon");
        ReactAssetUtilsKt.setReactAsset(icon, ReactAsset.Summary);
        SimpleDraweeView jumpButton = inflate.jumpButton;
        q.f(jumpButton, "jumpButton");
        ReactAssetUtilsKt.setReactAsset(jumpButton, ReactAsset.JumpToBottom);
        SimpleDraweeView jumpButton2 = inflate.jumpButton;
        q.f(jumpButton2, "jumpButton");
        ColorUtilsKt.setTintColor(jumpButton2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        SimpleDraweeView moreButton = inflate.moreButton;
        q.f(moreButton, "moreButton");
        ReactAssetUtilsKt.setReactAsset(moreButton, ReactAsset.More);
        SimpleDraweeView moreButton2 = inflate.moreButton;
        q.f(moreButton2, "moreButton");
        ColorUtilsKt.setTintColor(moreButton2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
    }
}
