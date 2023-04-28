package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory;
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/RoleSubscriptionPurchaseViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "roleSubscriptionPurchaseView", "Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;", "(Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;", "widthPx", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class RoleSubscriptionPurchaseViewHolder extends MessagePartViewHolder {
    private final RoleSubscriptionPurchaseView roleSubscriptionPurchaseView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleSubscriptionPurchaseViewHolder(RoleSubscriptionPurchaseView roleSubscriptionPurchaseView) {
        super(roleSubscriptionPurchaseView, null);
        C9677q.m14633g(roleSubscriptionPurchaseView, "roleSubscriptionPurchaseView");
        this.roleSubscriptionPurchaseView = roleSubscriptionPurchaseView;
    }

    public final void bind(RoleSubscriptionPurchaseAccessory accessory, int i) {
        C9677q.m14633g(accessory, "accessory");
        this.roleSubscriptionPurchaseView.configure(accessory.getAuthorUsername(), accessory.getAuthorAvatar(), i);
    }
}
