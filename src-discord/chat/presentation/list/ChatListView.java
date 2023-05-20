package com.discord.chat.presentation.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate;
import com.discord.chat.presentation.list.delegate.SeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.recycler_view.scroller.Scroller;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import jg.x;
import kg.v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.j;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001;B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0007J\b\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0014J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0003J\b\u0010(\u001a\u00020 H\u0014J\b\u0010)\u001a\u00020 H\u0002J(\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0007J\u000e\u00101\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u00102\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020/H\u0007J&\u00105\u001a\u00020 2\u0006\u00106\u001a\u0002072\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u000109H\u0007J\b\u0010:\u001a\u00020 H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "changeItemAnimators", "Landroidx/recyclerview/widget/DefaultItemAnimator;", "chatListAdapter", "Lcom/discord/chat/presentation/list/ChannelChatListAdapter;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "dataSource", "Lcom/discord/chat/presentation/list/ChatListView$DataSource;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "scrollStateObserver", "Lcom/discord/chat/presentation/list/ChatScrollStateObserver;", "scroller", "Lcom/discord/recycler_view/scroller/Scroller;", "swipeHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "updateSubscriptionJob", "Lkotlinx/coroutines/Job;", "verticalSpacingItemDecoration", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;", "addScrollStateListener", "", "cleanup", "configureRecycledViewPoolSizes", "measureAndLayout", "onAttachedToWindow", "onChatListUpdate", "update", "Lcom/discord/chat/listmanager/ChatListUpdate;", "onDetachedFromWindow", "removeScrollStateListener", "scrollToPosition", ViewProps.POSITION, "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "animated", "", "isHighlight", "setDataSource", "setEventHandler", "setInverted", "inverted", "setPortalView", "portalView", "Landroid/view/View;", "measuredDimensions", "Lkotlin/Pair;", BaseJavaModule.METHOD_TYPE_SYNC, "DataSource", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatListView extends RecyclerView {
    private final DefaultItemAnimator changeItemAnimators;
    private final ChannelChatListAdapter chatListAdapter;
    private final ComponentProvider componentProvider;
    private DataSource dataSource;
    private ChatEventHandler eventHandler;
    private final LinearLayoutManager linearLayoutManager;
    private final ChatScrollStateObserver scrollStateObserver;
    private final Scroller scroller;
    private ItemTouchHelper swipeHelper;
    private Job updateSubscriptionJob;
    private final VerticalSpacingItemDecoration verticalSpacingItemDecoration;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListView$DataSource;", "", "updatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/chat/listmanager/ChatListUpdate;", "getUpdatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface DataSource {
        Flow<ChatListUpdate> getUpdatesFlow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatListView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ChatListView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void addScrollStateListener() {
        addOnScrollListener(this.scrollStateObserver);
    }

    private final void configureRecycledViewPoolSizes() {
        Map k10;
        k10 = v.k(x.a(RegularMessageDelegate.class, 50), x.a(SystemMessageDelegate.class, 25), x.a(SeparatorDelegate.class, 25));
        for (Map.Entry entry : k10.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            Integer num = this.chatListAdapter.getDelegateViewTypes().get((Class) entry.getKey());
            q.d(num);
            getRecycledViewPool().k(num.intValue(), intValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void measureAndLayout() {
        q.e(this, "null cannot be cast to non-null type android.view.View");
        ViewMeasureExtensionsKt.measureAndLayout(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChatListUpdate(ChatListUpdate chatListUpdate) {
        if (ThreadUtilsKt.isOnMainThread()) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            this.chatListAdapter.setItems(chatListUpdate.getItems(), chatListUpdate.getListOperations(), new ChatListView$onChatListUpdate$1$1(ref$BooleanRef, this, chatListUpdate), new ChatListView$onChatListUpdate$1$2(chatListUpdate, this, ref$BooleanRef));
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    private final void removeScrollStateListener() {
        removeOnScrollListener(this.scrollStateObserver);
    }

    private final void sync() {
        Job job = this.updateSubscriptionJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.updateSubscriptionJob = j.d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new ChatListView$sync$1(this, null), 3, null);
    }

    public final void cleanup() {
        removeScrollStateListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sync();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chatListAdapter.onHostDetached();
    }

    public final void scrollToPosition(int i10, Scroller.TargetAlignment targetAlignment, boolean z10, boolean z11) {
        q.g(targetAlignment, "targetAlignment");
        this.scroller.scrollToPosition(i10, targetAlignment, z10, new ChatListView$scrollToPosition$1(this), new ChatListView$scrollToPosition$2(this, z10, z11, i10), new ChatListView$scrollToPosition$3(this));
    }

    public final void setDataSource(DataSource dataSource) {
        q.g(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    public final void setEventHandler(ChatEventHandler eventHandler) {
        q.g(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    public final void setInverted(boolean z10) {
        this.verticalSpacingItemDecoration.setRecyclerLayoutReversed(z10);
        this.linearLayoutManager.M2(z10);
    }

    public final void setPortalView(View portalView, Pair<Integer, Integer> pair) {
        q.g(portalView, "portalView");
        this.chatListAdapter.setPortalView(portalView, pair);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        DefaultItemAnimator defaultItemAnimator = null;
        if (itemAnimator != null) {
            defaultItemAnimator = (DefaultItemAnimator) (!(itemAnimator instanceof DefaultItemAnimator) ? null : itemAnimator);
        }
        q.d(defaultItemAnimator);
        this.changeItemAnimators = defaultItemAnimator;
        ChannelChatListAdapter channelChatListAdapter = new ChannelChatListAdapter(new ChatListView$chatListAdapter$1(this), new ChatListView$chatListAdapter$2(this), new ChatListView$chatListAdapter$3(this), new ChatListView$chatListAdapter$4(this), new ChatListView$chatListAdapter$5(this));
        this.chatListAdapter = channelChatListAdapter;
        this.componentProvider = new ComponentProvider(context);
        this.scroller = new Scroller(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.linearLayoutManager = linearLayoutManager;
        VerticalSpacingItemDecoration verticalSpacingItemDecoration = new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(30), false, 8, null);
        this.verticalSpacingItemDecoration = verticalSpacingItemDecoration;
        this.scrollStateObserver = new ChatScrollStateObserver(new ChatListView$scrollStateObserver$1(this));
        ChatListUtilsKt.configureMessageRecyclerView(this, context, verticalSpacingItemDecoration);
        setLayoutManager(linearLayoutManager);
        setAdapter(channelChatListAdapter);
        addScrollStateListener();
        configureRecycledViewPoolSizes();
        setItemAnimator(defaultItemAnimator);
        new ChatListItemTouchHelper(new SwipeHelper(context)).attachToRecyclerView(this);
    }
}
