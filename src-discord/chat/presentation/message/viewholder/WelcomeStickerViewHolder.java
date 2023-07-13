package com.discord.chat.presentation.message.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory;
import com.discord.chat.presentation.stickers.WelcomeStickerView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\tø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/WelcomeStickerViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;", "welcomeStickerAccessory", "", "bind", "Lcom/discord/chat/presentation/stickers/WelcomeStickerView;", "welcomeStickerView", "Lcom/discord/chat/presentation/stickers/WelcomeStickerView;", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/sticker/Sticker;", "Lcom/discord/primitives/MessageId;", "onWelcomeReplyClicked", "Lkotlin/jvm/functions/Function2;", "<init>", "(Lcom/discord/chat/presentation/stickers/WelcomeStickerView;Lkotlin/jvm/functions/Function2;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class WelcomeStickerViewHolder extends MessagePartViewHolder {
    private final Function2<Sticker, MessageId, Unit> onWelcomeReplyClicked;
    private final WelcomeStickerView welcomeStickerView;

    
    
    public WelcomeStickerViewHolder(WelcomeStickerView welcomeStickerView, Function2<? super Sticker, ? super MessageId, Unit> onWelcomeReplyClicked) {
        super(welcomeStickerView, null);
        q.g(welcomeStickerView, "welcomeStickerView");
        q.g(onWelcomeReplyClicked, "onWelcomeReplyClicked");
        this.welcomeStickerView = welcomeStickerView;
        this.onWelcomeReplyClicked = onWelcomeReplyClicked;
        welcomeStickerView.setLayoutParams(new RecyclerView.i(-2, -2));
    }

    public final void bind(WelcomeStickerAccessory welcomeStickerAccessory) {
        q.g(welcomeStickerAccessory, "welcomeStickerAccessory");
        this.welcomeStickerView.setSticker(welcomeStickerAccessory.getSticker(), welcomeStickerAccessory.getMessage(), this.onWelcomeReplyClicked);
    }
}
