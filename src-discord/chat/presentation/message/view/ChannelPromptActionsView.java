package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.channelprompt.ChannelPromptData;
import com.discord.chat.databinding.ChannelPromptActionsViewBinding;
import com.discord.core.DCDButton;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/view/ChannelPromptActionsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ChannelPromptActionsViewBinding;", "configure", "", "message", "Lcom/discord/chat/bridge/Message;", "onTapCameraButton", "Landroid/view/View$OnClickListener;", "onTapEmojiButton", "onTapGamingStatsButton", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChannelPromptActionsView extends LinearLayout {
    private final ChannelPromptActionsViewBinding binding;

    
    public ChannelPromptActionsView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  ChannelPromptActionsView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void configure(Message message, View.OnClickListener onTapCameraButton, View.OnClickListener onTapEmojiButton, View.OnClickListener onTapGamingStatsButton) {
        String str;
        String str2;
        q.h(message, "message");
        q.h(onTapCameraButton, "onTapCameraButton");
        q.h(onTapEmojiButton, "onTapEmojiButton");
        q.h(onTapGamingStatsButton, "onTapGamingStatsButton");
        DCDButton configure$lambda$0 = this.binding.cameraButton;
        ChannelPromptData channelPromptData = message.getChannelPromptData();
        String str3 = null;
        if (channelPromptData != null) {
            str = channelPromptData.getCameraButtonIcon();
        } else {
            str = null;
        }
        if (str != null) {
            configure$lambda$0.setIcon(message.getChannelPromptData().getCameraButtonIcon(), SizeUtilsKt.getDpToPx(24));
            q.g(configure$lambda$0, "configure$lambda$0");
            configure$lambda$0.setVisibility(0);
        } else {
            q.g(configure$lambda$0, "configure$lambda$0");
            configure$lambda$0.setVisibility(8);
        }
        configure$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
        configure$lambda$0.setOnClickButtonListener(onTapCameraButton);
        DCDButton configure$lambda$1 = this.binding.emojiButton;
        ChannelPromptData channelPromptData2 = message.getChannelPromptData();
        if (channelPromptData2 != null) {
            str2 = channelPromptData2.getEmojiButtonIcon();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            configure$lambda$1.setIcon(message.getChannelPromptData().getEmojiButtonIcon(), SizeUtilsKt.getDpToPx(24));
            q.g(configure$lambda$1, "configure$lambda$1");
            configure$lambda$1.setVisibility(0);
        } else {
            q.g(configure$lambda$1, "configure$lambda$1");
            configure$lambda$1.setVisibility(8);
        }
        configure$lambda$1.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
        configure$lambda$1.setOnClickButtonListener(onTapEmojiButton);
        DCDButton configure$lambda$2 = this.binding.gamingStatsButton;
        ChannelPromptData channelPromptData3 = message.getChannelPromptData();
        if (channelPromptData3 != null) {
            str3 = channelPromptData3.getGamingStatsButtonText();
        }
        if (str3 != null) {
            configure$lambda$2.setText(message.getChannelPromptData().getGamingStatsButtonText());
            q.g(configure$lambda$2, "configure$lambda$2");
            configure$lambda$2.setVisibility(0);
        } else {
            q.g(configure$lambda$2, "configure$lambda$2");
            configure$lambda$2.setVisibility(8);
        }
        configure$lambda$2.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
        configure$lambda$2.setOnClickButtonListener(onTapGamingStatsButton);
    }

    
    public ChannelPromptActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        ChannelPromptActionsViewBinding inflate = ChannelPromptActionsViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
    }
}
