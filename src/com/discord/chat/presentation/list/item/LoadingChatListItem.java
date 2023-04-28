package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.row.LoadMoreButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/chat/presentation/list/item/LoadingChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "button", "Lcom/discord/chat/bridge/row/LoadMoreButton;", "isLoading", "", "(Lcom/discord/chat/bridge/row/LoadMoreButton;Z)V", "getButton", "()Lcom/discord/chat/bridge/row/LoadMoreButton;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class LoadingChatListItem extends ChatListItem {
    private final LoadMoreButton button;
    private final boolean isLoading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingChatListItem(LoadMoreButton button, boolean z) {
        super("loading + " + z, null);
        C9677q.m14633g(button, "button");
        this.button = button;
        this.isLoading = z;
    }

    public static /* synthetic */ LoadingChatListItem copy$default(LoadingChatListItem loadingChatListItem, LoadMoreButton loadMoreButton, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            loadMoreButton = loadingChatListItem.button;
        }
        if ((i & 2) != 0) {
            z = loadingChatListItem.isLoading;
        }
        return loadingChatListItem.copy(loadMoreButton, z);
    }

    public final LoadMoreButton component1() {
        return this.button;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final LoadingChatListItem copy(LoadMoreButton button, boolean z) {
        C9677q.m14633g(button, "button");
        return new LoadingChatListItem(button, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingChatListItem)) {
            return false;
        }
        LoadingChatListItem loadingChatListItem = (LoadingChatListItem) obj;
        return C9677q.m14638b(this.button, loadingChatListItem.button) && this.isLoading == loadingChatListItem.isLoading;
    }

    public final LoadMoreButton getButton() {
        return this.button;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        boolean z = this.isLoading;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        LoadMoreButton loadMoreButton = this.button;
        boolean z = this.isLoading;
        return "LoadingChatListItem(button=" + loadMoreButton + ", isLoading=" + z + ")";
    }
}
