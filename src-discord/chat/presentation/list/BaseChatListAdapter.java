package com.discord.chat.presentation.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.facebook.react.uimanager.ViewProps;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager;
import com.hannesdorfmann.adapterdelegates4.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B+\u0012\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u001d0\u001cj\u0002`\u001e\u0012\u0010\u0010\"\u001a\f\u0012\u0004\u0012\u00020 0\u001cj\u0002`!¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R;\u0010\u0018\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0006\b\u0001\u0012\u00020\u00170\u00160\u0015\u0012\u0004\u0012\u00020\u00060\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/discord/chat/presentation/list/BaseChatListAdapter;", "Lcom/hannesdorfmann/adapterdelegates4/b;", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Lcom/discord/chat/presentation/list/ChatListAdapter;", "getChatListItems", "", ViewProps.POSITION, "getChatListItem", "", "getItemId", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "messageAccessoriesRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "chatListItems", "Ljava/util/List;", "getChatListItems$chat_release", "()Ljava/util/List;", "setChatListItems$chat_release", "(Ljava/util/List;)V", "", "Ljava/lang/Class;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Landroid/view/View;", "delegateViewTypes", "Ljava/util/Map;", "getDelegateViewTypes", "()Ljava/util/Map;", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "eventHandlerProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageComponentProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public class BaseChatListAdapter extends b<List<? extends ChatListItem>> implements ChatListAdapter {
    private List<? extends ChatListItem> chatListItems;
    private final Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> delegateViewTypes;
    private final RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool;

    public BaseChatListAdapter(Function0<? extends ChatEventHandler> eventHandlerProvider, Function0<ComponentProvider> messageComponentProvider) {
        List<? extends ChatListItem> h10;
        q.h(eventHandlerProvider, "eventHandlerProvider");
        q.h(messageComponentProvider, "messageComponentProvider");
        RecyclerView.RecycledViewPool messageAccessoriesViewPool = ChatListUtilsKt.getMessageAccessoriesViewPool();
        this.messageAccessoriesRecycledViewPool = messageAccessoriesViewPool;
        h10 = j.h();
        this.chatListItems = h10;
        AdapterDelegatesManager<T> delegatesManager = this.delegatesManager;
        q.g(delegatesManager, "delegatesManager");
        this.delegateViewTypes = ChatListAdapterConfiguratorKt.chatListAdapterConfigurator(delegatesManager, eventHandlerProvider, messageComponentProvider, messageAccessoriesViewPool);
        setHasStableIds(true);
    }

    @Override 
    public ChatListItem getChatListItem(int i10) {
        Object V;
        V = r.V(this.chatListItems, i10);
        return (ChatListItem) V;
    }

    @Override 
    public List<ChatListItem> getChatListItems() {
        T items = this.items;
        q.g(items, "items");
        return (List) items;
    }

    public final List<ChatListItem> getChatListItems$chat_release() {
        return this.chatListItems;
    }

    public final Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> getDelegateViewTypes() {
        return this.delegateViewTypes;
    }

    @Override 
    public long getItemId(int i10) {
        return ((ChatListItem) ((List) this.items).get(i10)).getRecyclerItemId();
    }

    public final void setChatListItems$chat_release(List<? extends ChatListItem> list) {
        q.h(list, "<set-?>");
        this.chatListItems = list;
    }
}
