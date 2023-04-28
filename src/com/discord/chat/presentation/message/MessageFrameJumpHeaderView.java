package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.bridge.messageframe.MessageFrameJump;
import com.discord.chat.databinding.MessageFrameJumpHeaderBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m15073d2 = {"Lcom/discord/chat/presentation/message/MessageFrameJumpHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageFrameJumpHeaderBinding;", "configure", "", "messageFrame", "Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageFrameJumpHeaderView extends ConstraintLayout {
    private final MessageFrameJumpHeaderBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageFrameJumpHeaderView(Context context) {
        this(context, null, 0, 6, null);
        C9971q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageFrameJumpHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ MessageFrameJumpHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void configure(MessageFrameJump messageFrame) {
        C9971q.m14633g(messageFrame, "messageFrame");
        TextView textView = this.binding.messageHeaderTitle;
        C9971q.m14634f(textView, "binding.messageHeaderTitle");
        ViewUtilsKt.setOptionalText(textView, messageFrame.getChannelName());
        TextView textView2 = this.binding.messageHeaderSubtitle;
        C9971q.m14634f(textView2, "binding.messageHeaderSubtitle");
        ViewUtilsKt.setOptionalText(textView2, messageFrame.getGuildName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFrameJumpHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9971q.m14633g(context, "context");
        MessageFrameJumpHeaderBinding inflate = MessageFrameJumpHeaderBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.messageHeaderTitle;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9971q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        TextView _init_$lambda$1 = inflate.messageHeaderSubtitle;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9971q.m14634f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryNormal);
        setPadding(SizeUtilsKt.getDpToPx(8), 0, SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(8));
    }
}
