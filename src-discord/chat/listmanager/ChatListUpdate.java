package com.discord.chat.listmanager;

import com.discord.chat.presentation.list.item.ChatListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/listmanager/ChatListUpdate;", "", "items", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "action", "Lcom/discord/chat/listmanager/ChatListAction;", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "(Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;)V", "getAction", "()Lcom/discord/chat/listmanager/ChatListAction;", "getItems", "()Ljava/util/List;", "getListOperations", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatListUpdate {
    private final ChatListAction action;
    private final List<ChatListItem> items;
    private final List<ListOperation> listOperations;

    
    public ChatListUpdate(List<? extends ChatListItem> items, ChatListAction action, List<? extends ListOperation> list) {
        q.g(items, "items");
        q.g(action, "action");
        this.items = items;
        this.action = action;
        this.listOperations = list;
    }

    
    public static  ChatListUpdate copy$default(ChatListUpdate chatListUpdate, List list, ChatListAction chatListAction, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = chatListUpdate.items;
        }
        if ((i10 & 2) != 0) {
            chatListAction = chatListUpdate.action;
        }
        if ((i10 & 4) != 0) {
            list2 = chatListUpdate.listOperations;
        }
        return chatListUpdate.copy(list, chatListAction, list2);
    }

    public final List<ChatListItem> component1() {
        return this.items;
    }

    public final ChatListAction component2() {
        return this.action;
    }

    public final List<ListOperation> component3() {
        return this.listOperations;
    }

    public final ChatListUpdate copy(List<? extends ChatListItem> items, ChatListAction action, List<? extends ListOperation> list) {
        q.g(items, "items");
        q.g(action, "action");
        return new ChatListUpdate(items, action, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatListUpdate)) {
            return false;
        }
        ChatListUpdate chatListUpdate = (ChatListUpdate) obj;
        return q.b(this.items, chatListUpdate.items) && q.b(this.action, chatListUpdate.action) && q.b(this.listOperations, chatListUpdate.listOperations);
    }

    public final ChatListAction getAction() {
        return this.action;
    }

    public final List<ChatListItem> getItems() {
        return this.items;
    }

    public final List<ListOperation> getListOperations() {
        return this.listOperations;
    }

    public int hashCode() {
        int hashCode = ((this.items.hashCode() * 31) + this.action.hashCode()) * 31;
        List<ListOperation> list = this.listOperations;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        List<ChatListItem> list = this.items;
        ChatListAction chatListAction = this.action;
        List<ListOperation> list2 = this.listOperations;
        return "ChatListUpdate(items=" + list + ", action=" + chatListAction + ", listOperations=" + list2 + ")";
    }
}
