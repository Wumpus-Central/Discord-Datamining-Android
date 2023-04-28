package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.ErrorMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/ErrorMessage;", "(Lcom/discord/chat/bridge/ErrorMessage;)V", "getMessage", "()Lcom/discord/chat/bridge/ErrorMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class DeserializationErrorMessageItem extends ChatListItem {
    private final ErrorMessage message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializationErrorMessageItem(ErrorMessage message) {
        super(message.m41568getId3Eiw7ao(), null);
        C9677q.m14633g(message, "message");
        this.message = message;
    }

    public static /* synthetic */ DeserializationErrorMessageItem copy$default(DeserializationErrorMessageItem deserializationErrorMessageItem, ErrorMessage errorMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            errorMessage = deserializationErrorMessageItem.message;
        }
        return deserializationErrorMessageItem.copy(errorMessage);
    }

    public final ErrorMessage component1() {
        return this.message;
    }

    public final DeserializationErrorMessageItem copy(ErrorMessage message) {
        C9677q.m14633g(message, "message");
        return new DeserializationErrorMessageItem(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeserializationErrorMessageItem) && C9677q.m14638b(this.message, ((DeserializationErrorMessageItem) obj).message);
    }

    public final ErrorMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        ErrorMessage errorMessage = this.message;
        return "DeserializationErrorMessageItem(message=" + errorMessage + ")";
    }
}
