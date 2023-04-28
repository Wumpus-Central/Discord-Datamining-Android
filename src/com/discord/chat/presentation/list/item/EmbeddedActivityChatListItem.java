package com.discord.chat.presentation.list.item;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001e"}, m15073d2 = {"Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "content", "", "avatarUrls", "", "buttonText", "embeddedActivityKey", "dismissButtonAccessibilityLabel", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrls", "()Ljava/util/List;", "getButtonText", "()Ljava/lang/String;", "getContent", "getDismissButtonAccessibilityLabel", "getEmbeddedActivityKey", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EmbeddedActivityChatListItem extends ChatListItem {
    private final List<String> avatarUrls;
    private final String buttonText;
    private final String content;
    private final String dismissButtonAccessibilityLabel;
    private final String embeddedActivityKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityChatListItem(String content, List<String> avatarUrls, String buttonText, String embeddedActivityKey, String dismissButtonAccessibilityLabel) {
        super(embeddedActivityKey, null);
        C9971q.m14633g(content, "content");
        C9971q.m14633g(avatarUrls, "avatarUrls");
        C9971q.m14633g(buttonText, "buttonText");
        C9971q.m14633g(embeddedActivityKey, "embeddedActivityKey");
        C9971q.m14633g(dismissButtonAccessibilityLabel, "dismissButtonAccessibilityLabel");
        this.content = content;
        this.avatarUrls = avatarUrls;
        this.buttonText = buttonText;
        this.embeddedActivityKey = embeddedActivityKey;
        this.dismissButtonAccessibilityLabel = dismissButtonAccessibilityLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbeddedActivityChatListItem copy$default(EmbeddedActivityChatListItem embeddedActivityChatListItem, String str, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embeddedActivityChatListItem.content;
        }
        if ((i & 2) != 0) {
            list = embeddedActivityChatListItem.avatarUrls;
        }
        if ((i & 4) != 0) {
            str2 = embeddedActivityChatListItem.buttonText;
        }
        if ((i & 8) != 0) {
            str3 = embeddedActivityChatListItem.embeddedActivityKey;
        }
        if ((i & 16) != 0) {
            str4 = embeddedActivityChatListItem.dismissButtonAccessibilityLabel;
        }
        return embeddedActivityChatListItem.copy(str, list, str2, str3, str4);
    }

    public final String component1() {
        return this.content;
    }

    public final List<String> component2() {
        return this.avatarUrls;
    }

    public final String component3() {
        return this.buttonText;
    }

    public final String component4() {
        return this.embeddedActivityKey;
    }

    public final String component5() {
        return this.dismissButtonAccessibilityLabel;
    }

    public final EmbeddedActivityChatListItem copy(String content, List<String> avatarUrls, String buttonText, String embeddedActivityKey, String dismissButtonAccessibilityLabel) {
        C9971q.m14633g(content, "content");
        C9971q.m14633g(avatarUrls, "avatarUrls");
        C9971q.m14633g(buttonText, "buttonText");
        C9971q.m14633g(embeddedActivityKey, "embeddedActivityKey");
        C9971q.m14633g(dismissButtonAccessibilityLabel, "dismissButtonAccessibilityLabel");
        return new EmbeddedActivityChatListItem(content, avatarUrls, buttonText, embeddedActivityKey, dismissButtonAccessibilityLabel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedActivityChatListItem)) {
            return false;
        }
        EmbeddedActivityChatListItem embeddedActivityChatListItem = (EmbeddedActivityChatListItem) obj;
        return C9971q.m14638b(this.content, embeddedActivityChatListItem.content) && C9971q.m14638b(this.avatarUrls, embeddedActivityChatListItem.avatarUrls) && C9971q.m14638b(this.buttonText, embeddedActivityChatListItem.buttonText) && C9971q.m14638b(this.embeddedActivityKey, embeddedActivityChatListItem.embeddedActivityKey) && C9971q.m14638b(this.dismissButtonAccessibilityLabel, embeddedActivityChatListItem.dismissButtonAccessibilityLabel);
    }

    public final List<String> getAvatarUrls() {
        return this.avatarUrls;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDismissButtonAccessibilityLabel() {
        return this.dismissButtonAccessibilityLabel;
    }

    public final String getEmbeddedActivityKey() {
        return this.embeddedActivityKey;
    }

    public int hashCode() {
        return (((((((this.content.hashCode() * 31) + this.avatarUrls.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.embeddedActivityKey.hashCode()) * 31) + this.dismissButtonAccessibilityLabel.hashCode();
    }

    public String toString() {
        String str = this.content;
        List<String> list = this.avatarUrls;
        String str2 = this.buttonText;
        String str3 = this.embeddedActivityKey;
        String str4 = this.dismissButtonAccessibilityLabel;
        return "EmbeddedActivityChatListItem(content=" + str + ", avatarUrls=" + list + ", buttonText=" + str2 + ", embeddedActivityKey=" + str3 + ", dismissButtonAccessibilityLabel=" + str4 + ")";
    }
}
