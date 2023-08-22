package com.discord.chat.presentation.list.item;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "id", "", "json", "causeMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCauseMessage", "()Ljava/lang/String;", "getId", "getJson", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DeserializationErrorChatListItem extends ChatListItem {
    private final String causeMessage;

    
    private final String f7299id;
    private final String json;

    
    public DeserializationErrorChatListItem(String id2, String json, String causeMessage) {
        super(id2, null);
        q.h(id2, "id");
        q.h(json, "json");
        q.h(causeMessage, "causeMessage");
        this.f7299id = id2;
        this.json = json;
        this.causeMessage = causeMessage;
    }

    public static  DeserializationErrorChatListItem copy$default(DeserializationErrorChatListItem deserializationErrorChatListItem, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deserializationErrorChatListItem.getId();
        }
        if ((i10 & 2) != 0) {
            str2 = deserializationErrorChatListItem.json;
        }
        if ((i10 & 4) != 0) {
            str3 = deserializationErrorChatListItem.causeMessage;
        }
        return deserializationErrorChatListItem.copy(str, str2, str3);
    }

    public final String component1() {
        return getId();
    }

    public final String component2() {
        return this.json;
    }

    public final String component3() {
        return this.causeMessage;
    }

    public final DeserializationErrorChatListItem copy(String id2, String json, String causeMessage) {
        q.h(id2, "id");
        q.h(json, "json");
        q.h(causeMessage, "causeMessage");
        return new DeserializationErrorChatListItem(id2, json, causeMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeserializationErrorChatListItem)) {
            return false;
        }
        DeserializationErrorChatListItem deserializationErrorChatListItem = (DeserializationErrorChatListItem) obj;
        return q.c(getId(), deserializationErrorChatListItem.getId()) && q.c(this.json, deserializationErrorChatListItem.json) && q.c(this.causeMessage, deserializationErrorChatListItem.causeMessage);
    }

    public final String getCauseMessage() {
        return this.causeMessage;
    }

    @Override 
    public String getId() {
        return this.f7299id;
    }

    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        return (((getId().hashCode() * 31) + this.json.hashCode()) * 31) + this.causeMessage.hashCode();
    }

    public String toString() {
        String id2 = getId();
        String str = this.json;
        String str2 = this.causeMessage;
        return "DeserializationErrorChatListItem(id=" + id2 + ", json=" + str + ", causeMessage=" + str2 + ")";
    }
}
