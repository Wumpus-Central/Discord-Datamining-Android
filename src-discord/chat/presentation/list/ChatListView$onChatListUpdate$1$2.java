package com.discord.chat.presentation.list;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatScrollStateObserver;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;
import com.discord.chat.presentation.root.ChatView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.recycler_view.scroller.Scroller;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatListView$onChatListUpdate$1$2 extends s implements Function0<Unit> {
    final  ChatListUpdate $update;
    final  Ref$BooleanRef $wasAtBottom;
    final  ChatListView this$0;

    
    
    public ChatListView$onChatListUpdate$1$2(ChatListUpdate chatListUpdate, ChatListView chatListView, Ref$BooleanRef ref$BooleanRef) {
        super(0);
        this.$update = chatListUpdate;
        this.this$0 = chatListView;
        this.$wasAtBottom = ref$BooleanRef;
    }

    @Override 
    
    public final void invoke2() {
        ChatScrollStateObserver chatScrollStateObserver;
        Object W;
        Scroller.TargetAlignment targetAlignment;
        ChatScrollStateObserver chatScrollStateObserver2;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        boolean z10;
        LinearLayoutManager linearLayoutManager3;
        ChatEventHandler chatEventHandler;
        ChatEventHandler chatEventHandler2;
        if (!(this.$update.getAction() instanceof ChatListAction.Clear)) {
            chatScrollStateObserver2 = this.this$0.scrollStateObserver;
            chatScrollStateObserver2.startWatching(this.this$0, ChatScrollStateObserver.EmitMode.NO);
            linearLayoutManager = this.this$0.linearLayoutManager;
            int i22 = linearLayoutManager.i2();
            linearLayoutManager2 = this.this$0.linearLayoutManager;
            int l22 = linearLayoutManager2.l2();
            z10 = this.this$0.isFirstLayout;
            if (z10 && i22 >= 0 && l22 >= 0) {
                this.this$0.isFirstLayout = false;
                linearLayoutManager3 = this.this$0.linearLayoutManager;
                ChatEventHandler chatEventHandler3 = null;
                if (linearLayoutManager3.x2()) {
                    chatEventHandler2 = this.this$0.eventHandler;
                    if (chatEventHandler2 == null) {
                        q.y("eventHandler");
                    } else {
                        chatEventHandler3 = chatEventHandler2;
                    }
                    chatEventHandler3.onFirstLayout(l22, i22);
                } else {
                    chatEventHandler = this.this$0.eventHandler;
                    if (chatEventHandler == null) {
                        q.y("eventHandler");
                    } else {
                        chatEventHandler3 = chatEventHandler;
                    }
                    chatEventHandler3.onFirstLayout(i22, l22);
                }
            }
        }
        ChatListAction action = this.$update.getAction();
        if (action instanceof ChatListAction.ScrollTo) {
            W = r.W(this.$update.getItems(), ((ChatListAction.ScrollTo) this.$update.getAction()).getPosition());
            ChatListItem chatListItem = (ChatListItem) W;
            if (chatListItem instanceof SeparatorChatListItem) {
                targetAlignment = new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4));
            } else if (!(chatListItem instanceof SummarySeparatorChatListItem)) {
                targetAlignment = Scroller.TargetAlignment.Center.INSTANCE;
            } else if (((SummarySeparatorChatListItem) chatListItem).isBeforeContent()) {
                targetAlignment = new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4));
            } else {
                targetAlignment = Scroller.TargetAlignment.Center.INSTANCE;
            }
            this.this$0.scrollToPosition(((ChatListAction.ScrollTo) this.$update.getAction()).getPosition(), targetAlignment, ((ChatListAction.ScrollTo) this.$update.getAction()).getAnimated(), ((ChatListAction.ScrollTo) this.$update.getAction()).isHighlight());
        } else if (action instanceof ChatListAction.StickToBottomIfAtBottom) {
            if (!this.$wasAtBottom.f21625j) {
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
            boolean z11 = action instanceof ChatListAction.Noop;
        }
    }
}
