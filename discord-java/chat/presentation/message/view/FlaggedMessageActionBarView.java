package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.databinding.FlaggedMessageActionBarViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\r\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/FlaggedMessageActionBarView;", "Landroid/widget/LinearLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/FlaggedMessageActionBarViewBinding;", "setActions", "", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "onTapAutoModerationActions", "Landroid/view/View$OnClickListener;", "onTapAutoModerationFeedback", "spacingPxOverride", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlaggedMessageActionBarView extends LinearLayout implements VerticalSpacingItemDecoration.SpacingProviderView {
    private final FlaggedMessageActionBarViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageActionBarView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ FlaggedMessageActionBarView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setActions(AutoModerationContext autoModerationContext, View.OnClickListener onTapAutoModerationActions, View.OnClickListener onTapAutoModerationFeedback) {
        q.g(autoModerationContext, "autoModerationContext");
        q.g(onTapAutoModerationActions, "onTapAutoModerationActions");
        q.g(onTapAutoModerationFeedback, "onTapAutoModerationFeedback");
        String actionsIconURL = autoModerationContext.getActionsIconURL();
        String actionsText = autoModerationContext.getActionsText();
        DCDButton dCDButton = this.binding.actionsButton;
        if (actionsIconURL != null) {
            dCDButton.setIcon(actionsIconURL, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton.setText(actionsText);
        dCDButton.setOnClickButtonListener(onTapAutoModerationActions);
        String feedbackText = autoModerationContext.getFeedbackText();
        DCDButton dCDButton2 = this.binding.feedbackButton;
        dCDButton2.setText(feedbackText);
        dCDButton2.setOnClickButtonListener(onTapAutoModerationFeedback);
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    public Integer spacingPxOverride() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageActionBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        FlaggedMessageActionBarViewBinding inflate = FlaggedMessageActionBarViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        ImageView _init_$lambda$0 = inflate.separatorDot;
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(4));
        DCDButton dCDButton = inflate.actionsButton;
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextBrand()));
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        dCDButton.setDiscordFont(discordFont);
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundPrimary());
        DCDButton dCDButton2 = inflate.feedbackButton;
        dCDButton2.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton2.setTextSizeSp(12.0f);
        dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextBrand()));
        dCDButton2.setDiscordFont(discordFont);
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundPrimary());
    }
}
