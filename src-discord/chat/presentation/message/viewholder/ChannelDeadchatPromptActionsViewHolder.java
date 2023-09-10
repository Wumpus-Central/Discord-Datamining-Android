package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import com.discord.chat.presentation.message.view.DeadchatPromptActionsView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ChannelDeadchatPromptActionsViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "deadchatPromptActionsView", "Lcom/discord/chat/presentation/message/view/DeadchatPromptActionsView;", "(Lcom/discord/chat/presentation/message/view/DeadchatPromptActionsView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/ChannelPromptActionsAccessory;", "onTapChannelPromptButton", "Lkotlin/Function3;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChannelDeadchatPromptActionsViewHolder extends MessagePartViewHolder {
    private final DeadchatPromptActionsView deadchatPromptActionsView;

    
    public ChannelDeadchatPromptActionsViewHolder(DeadchatPromptActionsView deadchatPromptActionsView) {
        super(deadchatPromptActionsView, null);
        q.h(deadchatPromptActionsView, "deadchatPromptActionsView");
        this.deadchatPromptActionsView = deadchatPromptActionsView;
        deadchatPromptActionsView.setLayoutParams(new RecyclerView.i(-2, -2));
    }

    
    public static final void bind$lambda$0(Function3 onTapChannelPromptButton, ChannelPromptActionsAccessory accessory, View view) {
        q.h(onTapChannelPromptButton, "$onTapChannelPromptButton");
        q.h(accessory, "$accessory");
        onTapChannelPromptButton.invoke(MessageId.m624boximpl(accessory.mo233getMessageId3Eiw7ao()), ChannelId.m598boximpl(accessory.getMessage().m23getChannelIdo4g7jtM()), "camera");
    }

    
    public static final void bind$lambda$1(Function3 onTapChannelPromptButton, ChannelPromptActionsAccessory accessory, View view) {
        q.h(onTapChannelPromptButton, "$onTapChannelPromptButton");
        q.h(accessory, "$accessory");
        onTapChannelPromptButton.invoke(MessageId.m624boximpl(accessory.mo233getMessageId3Eiw7ao()), ChannelId.m598boximpl(accessory.getMessage().m23getChannelIdo4g7jtM()), "emoji");
    }

    public final void bind(final ChannelPromptActionsAccessory accessory, final Function3<? super MessageId, ? super ChannelId, ? super String, Unit> onTapChannelPromptButton) {
        q.h(accessory, "accessory");
        q.h(onTapChannelPromptButton, "onTapChannelPromptButton");
        this.deadchatPromptActionsView.configure(accessory.getMessage(), new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ChannelDeadchatPromptActionsViewHolder.bind$lambda$0(Function3.this, accessory, view);
            }
        }, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ChannelDeadchatPromptActionsViewHolder.bind$lambda$1(Function3.this, accessory, view);
            }
        });
    }
}
