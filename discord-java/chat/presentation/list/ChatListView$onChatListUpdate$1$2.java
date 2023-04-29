package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.list.ChatScrollStateObserver;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.root.ChatView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.recycler_view.scroller.Scroller;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatListView$onChatListUpdate$1$2 extends s implements Function0<Unit> {
    final /* synthetic */ ChatListUpdate $update;
    final /* synthetic */ Ref$BooleanRef $wasAtBottom;
    final /* synthetic */ ChatListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$onChatListUpdate$1$2(ChatListUpdate chatListUpdate, ChatListView chatListView, Ref$BooleanRef ref$BooleanRef) {
        super(0);
        this.$update = chatListUpdate;
        this.this$0 = chatListView;
        this.$wasAtBottom = ref$BooleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChatScrollStateObserver chatScrollStateObserver;
        Object X;
        Scroller.TargetAlignment targetAlignment;
        ChatScrollStateObserver chatScrollStateObserver2;
        if (!(this.$update.getAction() instanceof ChatListAction.Clear)) {
            chatScrollStateObserver2 = this.this$0.scrollStateObserver;
            chatScrollStateObserver2.startWatching(this.this$0, ChatScrollStateObserver.EmitMode.NO);
        }
        ChatListAction action = this.$update.getAction();
        if (action instanceof ChatListAction.ScrollTo) {
            X = r.X(this.$update.getItems(), ((ChatListAction.ScrollTo) this.$update.getAction()).getPosition());
            if (((ChatListItem) X) instanceof SeparatorChatListItem) {
                targetAlignment = new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4));
            } else {
                targetAlignment = Scroller.TargetAlignment.Center.INSTANCE;
            }
            this.this$0.scrollToPosition(((ChatListAction.ScrollTo) this.$update.getAction()).getPosition(), targetAlignment, ((ChatListAction.ScrollTo) this.$update.getAction()).getAnimated(), ((ChatListAction.ScrollTo) this.$update.getAction()).isHighlight());
        } else if (action instanceof ChatListAction.StickToBottomIfAtBottom) {
            if (!this.$wasAtBottom.f22059k) {
                return;
            }
            if (ChatView.Companion.getAreChatAnimationsEnabled()) {
                chatScrollStateObserver = this.this$0.scrollStateObserver;
                chatScrollStateObserver.startWatching(this.this$0, ChatScrollStateObserver.EmitMode.YES);
                this.this$0.scrollToPosition(0);
                return;
            }
            this.this$0.scrollToPosition(0, Scroller.TargetAlignment.Anywhere.INSTANCE, false, false);
        } else if (!(action instanceof ChatListAction.Clear)) {
            boolean z10 = action instanceof ChatListAction.Noop;
        }
    }
}
