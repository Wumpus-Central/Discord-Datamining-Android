package com.discord.chat.presentation.list;

import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatListView$chatListAdapter$5 extends s implements Function0<ComponentProvider> {
    final /* synthetic */ ChatListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$chatListAdapter$5(ChatListView chatListView) {
        super(0);
        this.this$0 = chatListView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ComponentProvider invoke() {
        ComponentProvider componentProvider;
        componentProvider = this.this$0.componentProvider;
        return componentProvider;
    }
}
