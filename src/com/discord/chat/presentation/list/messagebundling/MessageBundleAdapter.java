package com.discord.chat.presentation.list.messagebundling;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatListAdapter;
import com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleBaseDelegate;
import com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleConversationDelegate;
import com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleMessageDelegate;
import com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleViewMoreDelegate;
import com.discord.chat.presentation.list.item.MessageBundleItem;
import com.discord.primitives.MessageId;
import com.facebook.react.uimanager.ViewProps;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.C5215b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C10853x;
import p268of.C11053v;

@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004:\u00013B\u0007¢\u0006\u0004\b1\u00102J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0016JZ\u0010\u0019\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR%\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR?\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00118\u0002@BX\u0082\u000eø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u001f\"\u0004\b!\u0010\"R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010#\"\u0004\b$\u0010%R.\u0010'\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m15073d2 = {"Lcom/discord/chat/presentation/list/messagebundling/MessageBundleAdapter;", "Lcom/hannesdorfmann/adapterdelegates4/b;", "", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "Lcom/discord/chat/presentation/list/ChatListAdapter;", "Landroid/view/View;", "view", "", "height", "", "handleTruncation", ViewProps.POSITION, "", "getItemId", "getChatListItems", "getChatListItem", "items", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "onTruncateMessage", "", "truncationThresholdPx", "onTapReply", "Landroid/view/View$OnClickListener;", "onTapViewMoreText", "setItems", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;)V", "Ljava/lang/Float;", "", "messageItemHeights", "[Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function1;", "value", "setOnTapReply", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View$OnClickListener;", "setOnTapViewMoreText", "(Landroid/view/View$OnClickListener;)V", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "messageAccessoriesViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getMessageAccessoriesViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setMessageAccessoriesViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "", "Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleBaseDelegate;", "delegates", "Ljava/util/Map;", "<init>", "()V", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageBundleAdapter extends C5215b<List<? extends MessageBundleItem>> implements ChatListAdapter {
    public static final int CONVERSATION_ROW_VIEW_TYPE = 1;
    public static final Companion Companion = new Companion(null);
    public static final int INVALID_ID = -1;
    public static final int MESSAGE_ROW_VIEW_TYPE = 0;
    public static final int VIEW_MORE_VIEW_TYPE = 2;
    private final Map<Integer, MessageBundleBaseDelegate> delegates;
    private RecyclerView.RecycledViewPool messageAccessoriesViewPool;
    private Float truncationThresholdPx;
    private Integer[] messageItemHeights = new Integer[0];
    private Function1<? super MessageId, Unit> onTruncateMessage = MessageBundleAdapter$onTruncateMessage$1.INSTANCE;
    private Function1<? super MessageId, Unit> onTapReply = MessageBundleAdapter$onTapReply$1.INSTANCE;
    private View.OnClickListener onTapViewMoreText = new View.OnClickListener() { // from class: com.discord.chat.presentation.list.messagebundling.a
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MessageBundleAdapter.onTapViewMoreText$lambda$0(view);
        }
    };

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m15073d2 = {"Lcom/discord/chat/presentation/list/messagebundling/MessageBundleAdapter$Companion;", "", "()V", "CONVERSATION_ROW_VIEW_TYPE", "", "INVALID_ID", "MESSAGE_ROW_VIEW_TYPE", "VIEW_MORE_VIEW_TYPE", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessageBundleAdapter() {
        Map<Integer, MessageBundleBaseDelegate> k;
        k = C11053v.m10248k(C10853x.m10921a(0, new MessageBundleMessageDelegate(new MessageBundleAdapter$delegates$1(this))), C10853x.m10921a(1, new MessageBundleConversationDelegate(new MessageBundleAdapter$delegates$2(this))), C10853x.m10921a(2, new MessageBundleViewMoreDelegate(MessageBundleAdapter$delegates$3.INSTANCE)));
        this.delegates = k;
        for (Map.Entry<Integer, MessageBundleBaseDelegate> entry : k.entrySet()) {
            this.delegatesManager.m27000a(entry.getKey().intValue(), entry.getValue());
        }
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void handleTruncation(View view, int i) {
        int id2 = view.getId();
        Float f = this.truncationThresholdPx;
        if (f != null) {
            float floatValue = f.floatValue();
            if (id2 != -1 && id2 < getItemCount()) {
                this.messageItemHeights[id2] = Integer.valueOf(i);
                Integer[] numArr = this.messageItemHeights;
                int length = numArr.length;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    Integer num = numArr[i2];
                    int i5 = i3 + 1;
                    if (num != null) {
                        i4 += num.intValue();
                        if (i4 > floatValue) {
                            this.onTruncateMessage.invoke(MessageId.m42115boximpl(MessageId.m42116constructorimpl(((MessageBundleItem) ((List) this.items).get(i3)).getId())));
                            return;
                        } else {
                            i2++;
                            i3 = i5;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTapViewMoreText$lambda$0(View view) {
    }

    private final void setOnTapReply(Function1<? super MessageId, Unit> function1) {
        AdapterDelegate d = this.delegatesManager.m26997d(1);
        MessageBundleConversationDelegate messageBundleConversationDelegate = null;
        if (d != null) {
            if (!(d instanceof MessageBundleConversationDelegate)) {
                d = null;
            }
            messageBundleConversationDelegate = (MessageBundleConversationDelegate) d;
        }
        if (messageBundleConversationDelegate != null) {
            messageBundleConversationDelegate.setOnTapReply(function1);
        }
        this.onTapReply = function1;
    }

    private final void setOnTapViewMoreText(View.OnClickListener onClickListener) {
        AdapterDelegate d = this.delegatesManager.m26997d(2);
        MessageBundleViewMoreDelegate messageBundleViewMoreDelegate = null;
        if (d != null) {
            if (!(d instanceof MessageBundleViewMoreDelegate)) {
                d = null;
            }
            messageBundleViewMoreDelegate = (MessageBundleViewMoreDelegate) d;
        }
        if (messageBundleViewMoreDelegate != null) {
            messageBundleViewMoreDelegate.setOnTapViewMoreText(onClickListener);
        }
        this.onTapViewMoreText = onClickListener;
    }

    @Override // com.discord.chat.presentation.list.ChatListAdapter
    public List<MessageBundleItem> getChatListItems() {
        T items = this.items;
        C9677q.m14634f(items, "items");
        return (List) items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return ((MessageBundleItem) ((List) this.items).get(i)).getRecyclerItemId();
    }

    public final RecyclerView.RecycledViewPool getMessageAccessoriesViewPool() {
        return this.messageAccessoriesViewPool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(List<? extends MessageBundleItem> items, Function1<? super MessageId, Unit> onTruncateMessage, Float f, Function1<? super MessageId, Unit> onTapReply, View.OnClickListener onTapViewMoreText) {
        C9677q.m14633g(items, "items");
        C9677q.m14633g(onTruncateMessage, "onTruncateMessage");
        C9677q.m14633g(onTapReply, "onTapReply");
        C9677q.m14633g(onTapViewMoreText, "onTapViewMoreText");
        this.items = items;
        this.onTruncateMessage = onTruncateMessage;
        this.truncationThresholdPx = f;
        this.messageItemHeights = new Integer[items.size()];
        setOnTapReply(onTapReply);
        setOnTapViewMoreText(onTapViewMoreText);
        notifyDataSetChanged();
    }

    public final void setMessageAccessoriesViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        AdapterDelegate d = this.delegatesManager.m26997d(0);
        MessageBundleMessageDelegate messageBundleMessageDelegate = null;
        if (d != null) {
            if (!(d instanceof MessageBundleMessageDelegate)) {
                d = null;
            }
            messageBundleMessageDelegate = (MessageBundleMessageDelegate) d;
        }
        if (messageBundleMessageDelegate != null) {
            messageBundleMessageDelegate.setMessageAccessoriesViewPool(recycledViewPool);
        }
        this.messageAccessoriesViewPool = recycledViewPool;
    }

    @Override // com.discord.chat.presentation.list.ChatListAdapter
    public MessageBundleItem getChatListItem(int i) {
        return (MessageBundleItem) ((List) this.items).get(i);
    }
}
