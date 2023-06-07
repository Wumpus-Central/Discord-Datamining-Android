package com.discord.chat.presentation.message.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView;
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/InviteToSpeakViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;", "inviteToSpeakAccessory", "", "bind", "Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;", "inviteToSpeakView", "Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "onInviteToSpeakClicked", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;Lkotlin/jvm/functions/Function1;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class InviteToSpeakViewHolder extends MessagePartViewHolder {
    private final InviteToSpeakView inviteToSpeakView;
    private final Function1<MessageId, Unit> onInviteToSpeakClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InviteToSpeakViewHolder(InviteToSpeakView inviteToSpeakView, Function1<? super MessageId, Unit> onInviteToSpeakClicked) {
        super(inviteToSpeakView, null);
        q.g(inviteToSpeakView, "inviteToSpeakView");
        q.g(onInviteToSpeakClicked, "onInviteToSpeakClicked");
        this.inviteToSpeakView = inviteToSpeakView;
        this.onInviteToSpeakClicked = onInviteToSpeakClicked;
        inviteToSpeakView.setLayoutParams(new RecyclerView.i(-2, -2));
    }

    public final void bind(InviteToSpeakAccessory inviteToSpeakAccessory) {
        q.g(inviteToSpeakAccessory, "inviteToSpeakAccessory");
        this.inviteToSpeakView.setProps(inviteToSpeakAccessory.getMessage(), this.onInviteToSpeakClicked);
    }
}
