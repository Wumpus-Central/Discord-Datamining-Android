package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ChatListUpdate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatListView$onChatListUpdate$1$1 extends s implements Function0<Unit> {
    final /* synthetic */ ChatListUpdate $update;
    final /* synthetic */ Ref$BooleanRef $wasAtBottom;
    final /* synthetic */ ChatListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$onChatListUpdate$1$1(Ref$BooleanRef ref$BooleanRef, ChatListView chatListView, ChatListUpdate chatListUpdate) {
        super(0);
        this.$wasAtBottom = ref$BooleanRef;
        this.this$0 = chatListView;
        this.$update = chatListUpdate;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChatScrollStateObserver chatScrollStateObserver;
        ChatScrollStateObserver chatScrollStateObserver2;
        Ref$BooleanRef ref$BooleanRef = this.$wasAtBottom;
        chatScrollStateObserver = this.this$0.scrollStateObserver;
        ScrollState scrollState = chatScrollStateObserver.getScrollState();
        boolean z10 = false;
        if (scrollState != null && scrollState.isAtBottom()) {
            z10 = true;
        }
        ref$BooleanRef.f22060k = z10;
        if (this.$update.getAction() instanceof ChatListAction.Clear) {
            chatScrollStateObserver2 = this.this$0.scrollStateObserver;
            chatScrollStateObserver2.stopWatching();
        }
    }
}
