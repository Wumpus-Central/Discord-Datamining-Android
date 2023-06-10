package com.discord.chat.presentation.list;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "scrollState", "Lcom/discord/chat/presentation/list/ScrollState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChatListView$scrollStateObserver$1 extends s implements Function1<ScrollState, Unit> {
    final /* synthetic */ ChatListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$scrollStateObserver$1(ChatListView chatListView) {
        super(1);
        this.this$0 = chatListView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScrollState scrollState) {
        invoke2(scrollState);
        return Unit.f22104a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ScrollState scrollState) {
        ChatEventHandler chatEventHandler;
        ChatEventHandler chatEventHandler2;
        q.g(scrollState, "scrollState");
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler != null) {
            chatEventHandler2 = this.this$0.eventHandler;
            if (chatEventHandler2 == null) {
                q.y("eventHandler");
                chatEventHandler2 = null;
            }
            chatEventHandler2.onScrollStateChanged(scrollState);
        }
    }
}
