package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory;
import com.discord.chat.presentation.message.view.GiftView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/GiftViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "", "onTapEmbed", "onTapAccept", "bind", "Lcom/discord/chat/presentation/message/view/GiftView;", "giftView", "Lcom/discord/chat/presentation/message/view/GiftView;", "<init>", "(Lcom/discord/chat/presentation/message/view/GiftView;)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class GiftViewHolder extends MessagePartViewHolder {
    private final GiftView giftView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftViewHolder(GiftView giftView) {
        super(giftView, null);
        C9677q.m14633g(giftView, "giftView");
        this.giftView = giftView;
    }

    public final void bind(GiftMessageAccessory accessory, Function1<? super String, Unit> onTapEmbed, Function1<? super String, Unit> onTapAccept) {
        C9677q.m14633g(accessory, "accessory");
        C9677q.m14633g(onTapEmbed, "onTapEmbed");
        C9677q.m14633g(onTapAccept, "onTapAccept");
        this.giftView.bind(accessory, onTapEmbed, onTapAccept);
    }
}
