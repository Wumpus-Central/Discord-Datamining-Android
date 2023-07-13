package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SystemMessageItem;
import com.discord.chat.presentation.message.system.SystemMessageView;
import com.discord.chat.presentation.root.MessageContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/SystemMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/SystemMessageItem;", "Lcom/discord/chat/presentation/message/system/SystemMessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageAccessoriesRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "(Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createAndBindStandaloneView", "parent", "Landroid/view/ViewGroup;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "createView", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SystemMessageDelegate extends BaseChatListItemDelegate<SystemMessageItem, SystemMessageView> {
    private final RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool;

    
    public SystemMessageDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider, RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool) {
        super(eventHandlerProvider, null, 2, null);
        q.g(eventHandlerProvider, "eventHandlerProvider");
        q.g(messageAccessoriesRecycledViewPool, "messageAccessoriesRecycledViewPool");
        this.messageAccessoriesRecycledViewPool = messageAccessoriesRecycledViewPool;
    }

    public final SystemMessageView createAndBindStandaloneView(ViewGroup parent, Message message, MessageContext messageContext) {
        q.g(parent, "parent");
        q.g(message, "message");
        q.g(messageContext, "messageContext");
        SystemMessageView createView = createView(parent);
        SystemMessageItem systemMessageItem = new SystemMessageItem(message, messageContext, null, 4, null);
        createView.setMessage(systemMessageItem.getMessage(), systemMessageItem.getMessageContext(), getEventHandler());
        return createView;
    }

    @Override 
    public boolean isForItem(ChatListItem item, int i10) {
        q.g(item, "item");
        return item instanceof SystemMessageItem;
    }

    public void bindView(SystemMessageView view, SystemMessageItem item, BaseChatListItemDelegate.Metadata<SystemMessageView> metadata) {
        q.g(view, "view");
        q.g(item, "item");
        q.g(metadata, "metadata");
        view.setMessage(item.getMessage(), item.getMessageContext(), getEventHandler());
    }

    @Override 
    public SystemMessageView createView(ViewGroup parent) {
        q.g(parent, "parent");
        Context context = parent.getContext();
        q.f(context, "parent.context");
        SystemMessageView systemMessageView = new SystemMessageView(context, null, 2, null);
        systemMessageView.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
        return systemMessageView;
    }
}
