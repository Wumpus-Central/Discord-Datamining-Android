package com.discord.chat.presentation.list.item;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.COLOR, "", "text", "", "id", "(ILjava/lang/String;Ljava/lang/String;)V", "getColor", "()I", "getId", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeparatorChatListItem extends ChatListItem {
    private final int color;

    /* renamed from: id  reason: collision with root package name */
    private final String f7668id;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorChatListItem(int i10, String text, String id2) {
        super(id2, null);
        q.g(text, "text");
        q.g(id2, "id");
        this.color = i10;
        this.text = text;
        this.f7668id = id2;
    }

    public static /* synthetic */ SeparatorChatListItem copy$default(SeparatorChatListItem separatorChatListItem, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = separatorChatListItem.color;
        }
        if ((i11 & 2) != 0) {
            str = separatorChatListItem.text;
        }
        if ((i11 & 4) != 0) {
            str2 = separatorChatListItem.getId();
        }
        return separatorChatListItem.copy(i10, str, str2);
    }

    public final int component1() {
        return this.color;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return getId();
    }

    public final SeparatorChatListItem copy(int i10, String text, String id2) {
        q.g(text, "text");
        q.g(id2, "id");
        return new SeparatorChatListItem(i10, text, id2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeparatorChatListItem)) {
            return false;
        }
        SeparatorChatListItem separatorChatListItem = (SeparatorChatListItem) obj;
        return this.color == separatorChatListItem.color && q.b(this.text, separatorChatListItem.text) && q.b(getId(), separatorChatListItem.getId());
    }

    public final int getColor() {
        return this.color;
    }

    @Override // com.discord.chat.presentation.list.item.ChatListItem
    public String getId() {
        return this.f7668id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.color * 31) + this.text.hashCode()) * 31) + getId().hashCode();
    }

    public String toString() {
        int i10 = this.color;
        String str = this.text;
        String id2 = getId();
        return "SeparatorChatListItem(color=" + i10 + ", text=" + str + ", id=" + id2 + ")";
    }
}
