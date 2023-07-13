package com.discord.chat.presentation.list.item;

import com.discord.recycler_view.ids.IdUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ChatListItem$recyclerItemId$2 extends s implements Function0<Long> {
    final  ChatListItem this$0;

    
    
    public ChatListItem$recyclerItemId$2(ChatListItem chatListItem) {
        super(0);
        this.this$0 = chatListItem;
    }

    
    @Override 
    public final Long invoke() {
        return Long.valueOf(IdUtilsKt.convertToId(this.this$0.getId()));
    }
}
