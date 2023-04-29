package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.sticker.StickerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/StickerApngViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/StickerPartViewHolder;", "stickerView", "Lcom/discord/sticker/StickerView;", "(Lcom/discord/sticker/StickerView;)V", "bind", "", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "onStickerClicked", "Lkotlin/Function1;", "onStickerLongClicked", "widthDp", "", "heightDp", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StickerApngViewHolder extends StickerPartViewHolder {
    private final StickerView stickerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerApngViewHolder(StickerView stickerView) {
        super(stickerView);
        q.g(stickerView, "stickerView");
        this.stickerView = stickerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function1 onStickerClicked, Sticker sticker, View view) {
        q.g(onStickerClicked, "$onStickerClicked");
        q.g(sticker, "$sticker");
        onStickerClicked.invoke(sticker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$1(Function1 onStickerLongClicked, Sticker sticker, View view) {
        q.g(onStickerLongClicked, "$onStickerLongClicked");
        q.g(sticker, "$sticker");
        onStickerLongClicked.invoke(sticker);
        return true;
    }

    @Override // com.discord.chat.presentation.message.viewholder.StickerPartViewHolder
    public void bind(final Sticker sticker, final Function1<? super Sticker, Unit> onStickerClicked, final Function1<? super Sticker, Unit> onStickerLongClicked, int i10, int i11) {
        boolean z10;
        q.g(sticker, "sticker");
        q.g(onStickerClicked, "onStickerClicked");
        q.g(onStickerLongClicked, "onStickerLongClicked");
        StickerView stickerView = this.stickerView;
        String url = sticker.getUrl();
        if (sticker.getRenderMode() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        stickerView.asApng(url, Integer.valueOf(i10), Integer.valueOf(i11), z10);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.stickerView, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickerApngViewHolder.bind$lambda$0(Function1.this, sticker, view);
            }
        }, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.stickerView, false, new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.viewholder.m
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean bind$lambda$1;
                bind$lambda$1 = StickerApngViewHolder.bind$lambda$1(Function1.this, sticker, view);
                return bind$lambda$1;
            }
        }, 1, null);
    }
}
