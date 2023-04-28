package com.discord.chat.presentation.list.item;

import com.discord.recycler_view.ids.IdUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class ChatListItem$recyclerItemId$2 extends AbstractC9679s implements Function0<Long> {
    final /* synthetic */ ChatListItem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListItem$recyclerItemId$2(ChatListItem chatListItem) {
        super(0);
        this.this$0 = chatListItem;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(IdUtilsKt.convertToId(this.this$0.getId()));
    }
}
