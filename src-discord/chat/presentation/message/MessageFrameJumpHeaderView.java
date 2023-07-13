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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/MessageFrameJumpHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageFrameJumpHeaderBinding;", "configure", "", "messageFrame", "Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageFrameJumpHeaderView extends ConstraintLayout {
    private final MessageFrameJumpHeaderBinding binding;

    
    public MessageFrameJumpHeaderView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    
    public MessageFrameJumpHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public  MessageFrameJumpHeaderView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void configure(MessageFrameJump messageFrame) {
        q.g(messageFrame, "messageFrame");
        TextView textView = this.binding.messageHeaderTitle;
        q.f(textView, "binding.messageHeaderTitle");
        ViewUtilsKt.setOptionalText(textView, messageFrame.getChannelName());
        TextView textView2 = this.binding.messageHeaderSubtitle;
        q.f(textView2, "binding.messageHeaderSubtitle");
        ViewUtilsKt.setOptionalText(textView2, messageFrame.getGuildName());
    }

    
    public MessageFrameJumpHeaderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        MessageFrameJumpHeaderBinding inflate = MessageFrameJumpHeaderBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.messageHeaderTitle;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        TextView _init_$lambda$1 = inflate.messageHeaderSubtitle;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryNormal);
        setPadding(SizeUtilsKt.getDpToPx(8), 0, SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(8));
    }
}
