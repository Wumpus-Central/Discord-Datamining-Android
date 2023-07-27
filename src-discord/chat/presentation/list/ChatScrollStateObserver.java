package com.discord.chat.presentation.list;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import wf.j;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "scrollStateUpdated", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/list/ScrollState;", "", "(Lkotlin/jvm/functions/Function1;)V", "isWatching", "", "scrollState", "scrollStateInt", "", "computeScrollState", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scrollAmountY", "emitMode", "Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;", "getScrollState", "onScrollStateChanged", "newState", "onScrolled", "dx", "dy", "startWatching", "stopWatching", "EmitMode", "Thresholds", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatScrollStateObserver extends RecyclerView.OnScrollListener {
    private boolean isWatching;
    private ScrollState scrollState;
    private int scrollStateInt;
    private final Function1<ScrollState, Unit> scrollStateUpdated;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;", "", "(Ljava/lang/String;I)V", "YES", "NO", "IF_CHANGED", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum EmitMode {
        YES,
        NO,
        IF_CHANGED
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver$Thresholds;", "", "()V", "NearBottom", "", "NearTop", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    private static final class Thresholds {
        public static final Thresholds INSTANCE = new Thresholds();
        public static final int NearBottom = 5;
        public static final int NearTop = 15;

        private Thresholds() {
        }
    }

    
    public ChatScrollStateObserver(Function1<? super ScrollState, Unit> scrollStateUpdated) {
        q.g(scrollStateUpdated, "scrollStateUpdated");
        this.scrollStateUpdated = scrollStateUpdated;
    }

    private final void computeScrollState(RecyclerView recyclerView, int i10, int i11, EmitMode emitMode) {
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        int c10;
        boolean z13;
        boolean z14;
        boolean z15;
        ScrollDirection scrollDirection;
        boolean z16;
        ScrollState scrollState;
        if (this.isWatching) {
            this.scrollStateInt = i10;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            q.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            boolean x22 = linearLayoutManager.x2();
            int i22 = linearLayoutManager.i2();
            if (i22 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = 5;
            if (x22) {
                i12 = 5;
            } else {
                i12 = 15;
            }
            if (i22 <= i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            int j02 = linearLayoutManager.j0() - 1;
            int j22 = linearLayoutManager.j2();
            int l22 = linearLayoutManager.l2();
            if (j22 != j02 || j22 < 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (x22) {
                i13 = 15;
            }
            c10 = j.c(j02 - i13, 0);
            if (c10 > j22 || j22 > j02) {
                z13 = false;
            } else {
                z13 = true;
            }
            int i14 = this.scrollStateInt;
            if (i14 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i14 == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i11 < 0) {
                scrollDirection = ScrollDirection.UP;
            } else if (i11 > 0) {
                scrollDirection = ScrollDirection.DOWN;
            } else {
                scrollDirection = null;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            q.e(adapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChannelChatListAdapter");
            int firstMessageItemPosition = ((ChannelChatListAdapter) adapter).getFirstMessageItemPosition();
            if (i22 > firstMessageItemPosition || firstMessageItemPosition > j22) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (x22) {
                scrollState = new ScrollState(z14, z15, z11, z10, z13, z12, scrollDirection, z16, l22, i22);
            } else {
                scrollState = new ScrollState(z14, z15, z13, z12, z11, z10, scrollDirection, z16, i22, l22);
            }
            boolean z17 = !q.b(this.scrollState, scrollState);
            this.scrollState = scrollState;
            if (emitMode == EmitMode.YES || (emitMode == EmitMode.IF_CHANGED && z17)) {
                this.scrollStateUpdated.invoke(scrollState);
            }
        }
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override 
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        q.g(recyclerView, "recyclerView");
        computeScrollState(recyclerView, i10, 0, EmitMode.IF_CHANGED);
    }

    @Override 
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        q.g(recyclerView, "recyclerView");
        computeScrollState(recyclerView, this.scrollStateInt, i11, EmitMode.IF_CHANGED);
    }

    public final void startWatching(RecyclerView recyclerView, EmitMode emitMode) {
        q.g(recyclerView, "recyclerView");
        q.g(emitMode, "emitMode");
        this.isWatching = true;
        computeScrollState(recyclerView, this.scrollStateInt, 0, emitMode);
    }

    public final void stopWatching() {
        this.isWatching = false;
    }
}
