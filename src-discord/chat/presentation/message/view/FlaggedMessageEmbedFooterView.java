package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedFooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/FlaggedMessageEmbedFooterViewBinding;", "setAutomodContext", "", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FlaggedMessageEmbedFooterView extends ConstraintLayout {
    private final FlaggedMessageEmbedFooterViewBinding binding;

    
    public FlaggedMessageEmbedFooterView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  FlaggedMessageEmbedFooterView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    
    
    public final void setAutomodContext(com.discord.chat.bridge.automod.AutoModerationContext r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.FlaggedMessageEmbedFooterView.setAutomodContext(com.discord.chat.bridge.automod.AutoModerationContext):void");
    }

    
    public FlaggedMessageEmbedFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        FlaggedMessageEmbedFooterViewBinding inflate = FlaggedMessageEmbedFooterViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        ImageView _init_$lambda$0 = inflate.separatorDot;
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        q.g(_init_$lambda$0, "_init_$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(4));
        TextView _init_$lambda$1 = inflate.flaggedMessageKeyword;
        q.g(_init_$lambda$1, "_init_$lambda$1");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 12.0f, 15.0f);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView _init_$lambda$2 = inflate.flaggedMessageRuleName;
        q.g(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 12.0f, 15.0f);
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
