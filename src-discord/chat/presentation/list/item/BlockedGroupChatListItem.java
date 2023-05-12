package com.discord.chat.presentation.list.item;

import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "text", "", "id", "textColor", "", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "isRevealed", "", "content", "", "(Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/List;)V", "getBackgroundColor", "()I", "getBorderColor", "getContent", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "()Z", "getText", "getTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BlockedGroupChatListItem extends ChatListItem {
    private final int backgroundColor;
    private final int borderColor;
    private final List<ChatListItem> content;

    /* renamed from: id  reason: collision with root package name */
    private final String f7242id;
    private final boolean isRevealed;
    private final String text;
    private final int textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockedGroupChatListItem(String text, String id2, int i10, int i11, int i12, boolean z10, List<? extends ChatListItem> content) {
        super(id2, null);
        q.g(text, "text");
        q.g(id2, "id");
        q.g(content, "content");
        this.text = text;
        this.f7242id = id2;
        this.textColor = i10;
        this.backgroundColor = i11;
        this.borderColor = i12;
        this.isRevealed = z10;
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockedGroupChatListItem copy$default(BlockedGroupChatListItem blockedGroupChatListItem, String str, String str2, int i10, int i11, int i12, boolean z10, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = blockedGroupChatListItem.text;
        }
        if ((i13 & 2) != 0) {
            str2 = blockedGroupChatListItem.getId();
        }
        if ((i13 & 4) != 0) {
            i10 = blockedGroupChatListItem.textColor;
        }
        if ((i13 & 8) != 0) {
            i11 = blockedGroupChatListItem.backgroundColor;
        }
        if ((i13 & 16) != 0) {
            i12 = blockedGroupChatListItem.borderColor;
        }
        if ((i13 & 32) != 0) {
            z10 = blockedGroupChatListItem.isRevealed;
        }
        if ((i13 & 64) != 0) {
            list = blockedGroupChatListItem.content;
        }
        return blockedGroupChatListItem.copy(str, str2, i10, i11, i12, z10, list);
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

    public final BlockedGroupChatListItem copy(String text, String id2, int i10, int i11, int i12, boolean z10, List<? extends ChatListItem> content) {
        q.g(text, "text");
        q.g(id2, "id");
        q.g(content, "content");
        return new BlockedGroupChatListItem(text, id2, i10, i11, i12, z10, content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockedGroupChatListItem)) {
            return false;
        }
        BlockedGroupChatListItem blockedGroupChatListItem = (BlockedGroupChatListItem) obj;
        return q.b(this.text, blockedGroupChatListItem.text) && q.b(getId(), blockedGroupChatListItem.getId()) && this.textColor == blockedGroupChatListItem.textColor && this.backgroundColor == blockedGroupChatListItem.backgroundColor && this.borderColor == blockedGroupChatListItem.borderColor && this.isRevealed == blockedGroupChatListItem.isRevealed && q.b(this.content, blockedGroupChatListItem.content);
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
        return this.f7242id;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = ((((((((this.text.hashCode() * 31) + getId().hashCode()) * 31) + this.textColor) * 31) + this.backgroundColor) * 31) + this.borderColor) * 31;
        boolean z10 = this.isRevealed;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return ((hashCode + i10) * 31) + this.content.hashCode();
    }

    public final boolean isRevealed() {
        return this.isRevealed;
    }

    public String toString() {
        String str = this.text;
        String id2 = getId();
        int i10 = this.textColor;
        int i11 = this.backgroundColor;
        int i12 = this.borderColor;
        boolean z10 = this.isRevealed;
        List<ChatListItem> list = this.content;
        return "BlockedGroupChatListItem(text=" + str + ", id=" + id2 + ", textColor=" + i10 + ", backgroundColor=" + i11 + ", borderColor=" + i12 + ", isRevealed=" + z10 + ", content=" + list + ")";
    }
}
