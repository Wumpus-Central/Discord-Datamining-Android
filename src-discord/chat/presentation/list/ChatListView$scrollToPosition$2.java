package com.discord.chat.presentation.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatScrollStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatListView$scrollToPosition$2 extends s implements Function0<Unit> {
    final  boolean $animated;
    final  boolean $isHighlight;
    final  int $position;
    final  ChatListView this$0;

    
    
    public ChatListView$scrollToPosition$2(ChatListView chatListView, boolean z10, boolean z11, int i10) {
        super(0);
        this.this$0 = chatListView;
        this.$animated = z10;
        this.$isHighlight = z11;
        this.$position = i10;
    }

    @Override 
    
    public final void invoke2() {
        ChatScrollStateObserver chatScrollStateObserver;
        RecyclerView.LayoutManager layoutManager;
        View N;
        chatScrollStateObserver = this.this$0.scrollStateObserver;
        chatScrollStateObserver.startWatching(this.this$0, ChatScrollStateObserver.EmitMode.YES);
        boolean z10 = this.$animated;
        if (z10 && this.$isHighlight) {
            ChatListHighlightItemAtPositionKt.chatListEmphasizeHighlightItemAtPosition$default(this.this$0, this.$position, 0L, 2, null);
        } else if (z10) {
            ChatListHighlightItemAtPositionKt.chatListHighlightItemAtPosition$default(this.this$0, this.$position, 0L, 2, null);
        }
        if (this.$animated && (layoutManager = this.this$0.getLayoutManager()) != null && (N = layoutManager.N(this.$position)) != null) {
            N.sendAccessibilityEvent(8);
        }
    }
}
