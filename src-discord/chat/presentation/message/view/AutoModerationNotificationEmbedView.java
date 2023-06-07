package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.automod.AutoModerationNotification;
import com.discord.chat.databinding.AutoModerationNotificationEmbedViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react.FontManager;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "allowChildGestures", "", "binding", "Lcom/discord/chat/databinding/AutoModerationNotificationEmbedViewBinding;", "configure", "", "moderationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "onTapAutoModerationActions", "Landroid/view/View$OnClickListener;", "onTapAutoModerationFeedback", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutoModerationNotificationEmbedView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView {
    private boolean allowChildGestures;
    private final AutoModerationNotificationEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoModerationNotificationEmbedView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ AutoModerationNotificationEmbedView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void configure(AutoModerationContext moderationContext, View.OnClickListener onTapAutoModerationActions, View.OnClickListener onTapAutoModerationFeedback) {
        boolean z10;
        q.g(moderationContext, "moderationContext");
        q.g(onTapAutoModerationActions, "onTapAutoModerationActions");
        q.g(onTapAutoModerationFeedback, "onTapAutoModerationFeedback");
        AutoModerationNotification notification = moderationContext.getNotification();
        int i10 = 8;
        if (notification != null) {
            TextView textView = this.binding.body;
            q.f(textView, "binding.body");
            textView.setVisibility(0);
            this.binding.header.setText(notification.getHeader());
            if (notification.getBody() != null) {
                this.binding.body.setText(notification.getBody());
                TextView textView2 = this.binding.body;
                q.f(textView2, "binding.body");
                textView2.setVisibility(0);
            } else {
                TextView textView3 = this.binding.body;
                q.f(textView3, "binding.body");
                textView3.setVisibility(8);
            }
            if (notification.getSeverity() != null) {
                this.binding.subtitleSeverity.setText(notification.getSeverity());
                TextView textView4 = this.binding.subtitleSeverity;
                q.f(textView4, "binding.subtitleSeverity");
                textView4.setVisibility(0);
            } else {
                TextView textView5 = this.binding.subtitleSeverity;
                q.f(textView5, "binding.subtitleSeverity");
                textView5.setVisibility(8);
            }
            if (notification.getStartTime() != null) {
                this.binding.subtitleStartTime.setText(notification.getStartTime());
                TextView textView6 = this.binding.subtitleStartTime;
                q.f(textView6, "binding.subtitleStartTime");
                textView6.setVisibility(0);
            } else {
                TextView textView7 = this.binding.subtitleStartTime;
                q.f(textView7, "binding.subtitleStartTime");
                textView7.setVisibility(8);
            }
            ImageView imageView = this.binding.subtitleDivider;
            q.f(imageView, "binding.subtitleDivider");
            if (notification.getSeverity() == null || notification.getStartTime() == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
        } else {
            TextView textView8 = this.binding.body;
            q.f(textView8, "binding.body");
            textView8.setVisibility(8);
        }
        String actionsIconURL = moderationContext.getActionsIconURL();
        String actionsText = moderationContext.getActionsText();
        DCDButton dCDButton = this.binding.actionsButton;
        if (actionsIconURL != null) {
            dCDButton.setIcon(actionsIconURL, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton.setText(actionsText);
        dCDButton.setOnClickButtonListener(onTapAutoModerationActions);
        String feedbackText = moderationContext.getFeedbackText();
        DCDButton dCDButton2 = this.binding.feedbackButton;
        dCDButton2.setText(feedbackText);
        dCDButton2.setOnClickButtonListener(onTapAutoModerationFeedback);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        q.g(ev, "ev");
        return !this.allowChildGestures;
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    public Integer spacingPxOverride() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoModerationNotificationEmbedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        AutoModerationNotificationEmbedViewBinding inflate = AutoModerationNotificationEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.allowChildGestures = true;
        RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(8), 1, null);
        View _init_$lambda$0 = inflate.getRoot();
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$1 = inflate.header;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextDanger());
        q.f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimarySemibold);
        float f10 = 16.0f;
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 16.0f, 20.0f);
        _init_$lambda$1.setLineSpacing(0.0f, 1.05f);
        ImageView _init_$lambda$2 = inflate.subtitleDivider;
        _init_$lambda$2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        q.f(_init_$lambda$2, "_init_$lambda$2");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$2, SizeUtilsKt.getDpToPx(4));
        TextView _init_$lambda$3 = inflate.subtitleSeverity;
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.f(_init_$lambda$3, "_init_$lambda$3");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 12.0f, 20.0f);
        TextView _init_$lambda$4 = inflate.subtitleStartTime;
        _init_$lambda$4.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.f(_init_$lambda$4, "_init_$lambda$4");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$4, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$4, 12.0f, 20.0f);
        TextView _init_$lambda$5 = inflate.body;
        _init_$lambda$5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        q.f(_init_$lambda$5, "_init_$lambda$5");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$5, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$5, FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(context) ? 14.0f : f10);
        inflate.actions.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
        ImageView _init_$lambda$7 = inflate.separatorDot;
        _init_$lambda$7.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        q.f(_init_$lambda$7, "_init_$lambda$7");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$7, SizeUtilsKt.getDpToPx(4));
        DCDButton dCDButton = inflate.actionsButton;
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextLink()));
        dCDButton.setDiscordFont(discordFont);
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
        DCDButton dCDButton2 = inflate.feedbackButton;
        dCDButton2.setTextSizeSp(12.0f);
        dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getTextLink()));
        dCDButton2.setDiscordFont(discordFont);
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
    }
}
