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
/* loaded from: classes5.dex */
public final class FlaggedMessageEmbedFooterView extends ConstraintLayout {
    private final FlaggedMessageEmbedFooterViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageEmbedFooterView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ FlaggedMessageEmbedFooterView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r0 != false) goto L_0x0056;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAutomodContext(com.discord.chat.bridge.automod.AutoModerationContext r5) {
        /*
            r4 = this;
            java.lang.String r0 = "autoModerationContext"
            kotlin.jvm.internal.q.g(r5, r0)
            java.lang.String r0 = r5.getKeywordDisplayText()
            java.lang.String r5 = r5.getRuleDisplayText()
            com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding r1 = r4.binding
            android.widget.TextView r1 = r1.flaggedMessageKeyword
            java.lang.String r2 = "binding.flaggedMessageKeyword"
            kotlin.jvm.internal.q.f(r1, r2)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r1, r0)
            com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding r0 = r4.binding
            android.widget.TextView r0 = r0.flaggedMessageRuleName
            java.lang.String r1 = "binding.flaggedMessageRuleName"
            kotlin.jvm.internal.q.f(r0, r1)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r0, r5)
            com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding r5 = r4.binding
            android.widget.ImageView r5 = r5.separatorDot
            java.lang.String r0 = "binding.separatorDot"
            kotlin.jvm.internal.q.f(r5, r0)
            com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding r0 = r4.binding
            android.widget.TextView r0 = r0.flaggedMessageKeyword
            kotlin.jvm.internal.q.f(r0, r2)
            int r0 = r0.getVisibility()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x003f
            r0 = r2
            goto L_0x0040
        L_0x003f:
            r0 = r3
        L_0x0040:
            if (r0 == 0) goto L_0x0055
            com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding r0 = r4.binding
            android.widget.TextView r0 = r0.flaggedMessageRuleName
            kotlin.jvm.internal.q.f(r0, r1)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0051
            r0 = r2
            goto L_0x0052
        L_0x0051:
            r0 = r3
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 8
        L_0x005b:
            r5.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.FlaggedMessageEmbedFooterView.setAutomodContext(com.discord.chat.bridge.automod.AutoModerationContext):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageEmbedFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        FlaggedMessageEmbedFooterViewBinding inflate = FlaggedMessageEmbedFooterViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        ImageView _init_$lambda$0 = inflate.separatorDot;
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(4));
        TextView _init_$lambda$1 = inflate.flaggedMessageKeyword;
        q.f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 12.0f, 15.0f);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView _init_$lambda$2 = inflate.flaggedMessageRuleName;
        q.f(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 12.0f, 15.0f);
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
