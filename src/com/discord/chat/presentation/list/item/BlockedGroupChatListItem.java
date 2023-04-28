package com.discord.chat.presentation.list.item;

import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, m15073d2 = {"Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "text", "", "id", "textColor", "", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "isRevealed", "", "content", "", "(Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/List;)V", "getBackgroundColor", "()I", "getBorderColor", "getContent", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "()Z", "getText", "getTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class BlockedGroupChatListItem extends ChatListItem {
    private final int backgroundColor;
    private final int borderColor;
    private final List<ChatListItem> content;

    /* renamed from: id */
    private final String f8503id;
    private final boolean isRevealed;
    private final String text;
    private final int textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockedGroupChatListItem(String text, String id2, int i, int i2, int i3, boolean z, List<? extends ChatListItem> content) {
        super(id2, null);
        C9677q.m14633g(text, "text");
        C9677q.m14633g(id2, "id");
        C9677q.m14633g(content, "content");
        this.text = text;
        this.f8503id = id2;
        this.textColor = i;
        this.backgroundColor = i2;
        this.borderColor = i3;
        this.isRevealed = z;
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockedGroupChatListItem copy$default(BlockedGroupChatListItem blockedGroupChatListItem, String str, String str2, int i, int i2, int i3, boolean z, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = blockedGroupChatListItem.text;
        }
        if ((i4 & 2) != 0) {
            str2 = blockedGroupChatListItem.getId();
        }
        if ((i4 & 4) != 0) {
            i = blockedGroupChatListItem.textColor;
        }
        if ((i4 & 8) != 0) {
            i2 = blockedGroupChatListItem.backgroundColor;
        }
        if ((i4 & 16) != 0) {
            i3 = blockedGroupChatListItem.borderColor;
        }
        if ((i4 & 32) != 0) {
            z = blockedGroupChatListItem.isRevealed;
        }
        if ((i4 & 64) != 0) {
            list = blockedGroupChatListItem.content;
        }
        return blockedGroupChatListItem.copy(str, str2, i, i2, i3, z, list);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return getId();
    }

    public final int component3() {
        return this.textColor;
    }

    public final int component4() {
        return this.backgroundColor;
    }

    public final int component5() {
        return this.borderColor;
    }

    public final boolean component6() {
        return this.isRevealed;
    }

    public final List<ChatListItem> component7() {
        return this.content;
    }

    public final BlockedGroupChatListItem copy(String text, String id2, int i, int i2, int i3, boolean z, List<? extends ChatListItem> content) {
        C9677q.m14633g(text, "text");
        C9677q.m14633g(id2, "id");
        C9677q.m14633g(content, "content");
        return new BlockedGroupChatListItem(text, id2, i, i2, i3, z, content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockedGroupChatListItem)) {
            return false;
        }
        BlockedGroupChatListItem blockedGroupChatListItem = (BlockedGroupChatListItem) obj;
        return C9677q.m14638b(this.text, blockedGroupChatListItem.text) && C9677q.m14638b(getId(), blockedGroupChatListItem.getId()) && this.textColor == blockedGroupChatListItem.textColor && this.backgroundColor == blockedGroupChatListItem.backgroundColor && this.borderColor == blockedGroupChatListItem.borderColor && this.isRevealed == blockedGroupChatListItem.isRevealed && C9677q.m14638b(this.content, blockedGroupChatListItem.content);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final List<ChatListItem> getContent() {
        return this.content;
    }

    @Override // com.discord.chat.presentation.list.item.ChatListItem
    public String getId() {
        return this.f8503id;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = ((((((((this.text.hashCode() * 31) + getId().hashCode()) * 31) + this.textColor) * 31) + this.backgroundColor) * 31) + this.borderColor) * 31;
        boolean z = this.isRevealed;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + this.content.hashCode();
    }

    public final boolean isRevealed() {
        return this.isRevealed;
    }

    public String toString() {
        String str = this.text;
        String id2 = getId();
        int i = this.textColor;
        int i2 = this.backgroundColor;
        int i3 = this.borderColor;
        boolean z = this.isRevealed;
        List<ChatListItem> list = this.content;
        return "BlockedGroupChatListItem(text=" + str + ", id=" + id2 + ", textColor=" + i + ", backgroundColor=" + i2 + ", borderColor=" + i3 + ", isRevealed=" + z + ", content=" + list + ")";
    }
}
