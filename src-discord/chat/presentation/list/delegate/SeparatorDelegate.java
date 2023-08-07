package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.ViewGroup;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.separator.SeparatorView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/SeparatorDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;", "Lcom/discord/chat/presentation/separator/SeparatorView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "(Lkotlin/jvm/functions/Function0;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createView", "parent", "Landroid/view/ViewGroup;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SeparatorDelegate extends BaseChatListItemDelegate<SeparatorChatListItem, SeparatorView> {
    
    public SeparatorDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        q.h(eventHandlerProvider, "eventHandlerProvider");
    }

    @Override 
    public boolean isForItem(ChatListItem item, int i10) {
        q.h(item, "item");
        return item instanceof SeparatorChatListItem;
    }

    public void bindView(SeparatorView view, SeparatorChatListItem item, BaseChatListItemDelegate.Metadata<SeparatorView> metadata) {
        q.h(view, "view");
        q.h(item, "item");
        q.h(metadata, "metadata");
        view.setColor(item.getColor());
        view.setText(item.getText());
    }

    @Override 
    public SeparatorView createView(ViewGroup parent) {
        q.h(parent, "parent");
        Context context = parent.getContext();
        q.g(context, "parent.context");
        return new SeparatorView(context, null, 2, null);
    }
}
