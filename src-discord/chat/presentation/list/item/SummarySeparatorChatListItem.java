package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.summaries.Summary;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\f8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\f8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.COLOR, "", "summary", "Lcom/discord/chat/bridge/summaries/Summary;", "isBeforeContent", "", "(ILcom/discord/chat/bridge/summaries/Summary;Z)V", "getColor", "()I", "currentMsgId", "Lcom/discord/primitives/MessageId;", "getCurrentMsgId-3Eiw7ao", "()Ljava/lang/String;", "()Z", "jumpToMsgId", "getJumpToMsgId-3Eiw7ao", "getSummary", "()Lcom/discord/chat/bridge/summaries/Summary;", "text", "", "getText", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SummarySeparatorChatListItem extends ChatListItem {
    private final int color;
    private final boolean isBeforeContent;
    private final Summary summary;

    
    
    public SummarySeparatorChatListItem(int r5, com.discord.chat.bridge.summaries.Summary r6, boolean r7) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.item.SummarySeparatorChatListItem.<init>(int, com.discord.chat.bridge.summaries.Summary, boolean):void");
    }

    public static  SummarySeparatorChatListItem copy$default(SummarySeparatorChatListItem summarySeparatorChatListItem, int i10, Summary summary, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = summarySeparatorChatListItem.color;
        }
        if ((i11 & 2) != 0) {
            summary = summarySeparatorChatListItem.summary;
        }
        if ((i11 & 4) != 0) {
            z10 = summarySeparatorChatListItem.isBeforeContent;
        }
        return summarySeparatorChatListItem.copy(i10, summary, z10);
    }

    public final int component1() {
        return this.color;
    }

    public final Summary component2() {
        return this.summary;
    }

    public final boolean component3() {
        return this.isBeforeContent;
    }

    public final SummarySeparatorChatListItem copy(int i10, Summary summary, boolean z10) {
        q.h(summary, "summary");
        return new SummarySeparatorChatListItem(i10, summary, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummarySeparatorChatListItem)) {
            return false;
        }
        SummarySeparatorChatListItem summarySeparatorChatListItem = (SummarySeparatorChatListItem) obj;
        return this.color == summarySeparatorChatListItem.color && q.c(this.summary, summarySeparatorChatListItem.summary) && this.isBeforeContent == summarySeparatorChatListItem.isBeforeContent;
    }

    public final int getColor() {
        return this.color;
    }

    
    public final String m199getCurrentMsgId3Eiw7ao() {
        return this.isBeforeContent ? this.summary.m149getStartId3Eiw7ao() : this.summary.m148getEndId3Eiw7ao();
    }

    
    public final String m200getJumpToMsgId3Eiw7ao() {
        return this.isBeforeContent ? this.summary.m148getEndId3Eiw7ao() : this.summary.m149getStartId3Eiw7ao();
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final String getText() {
        return this.summary.getTopic();
    }

    public int hashCode() {
        int hashCode = ((this.color * 31) + this.summary.hashCode()) * 31;
        boolean z10 = this.isBeforeContent;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return hashCode + i10;
    }

    public final boolean isBeforeContent() {
        return this.isBeforeContent;
    }

    public String toString() {
        int i10 = this.color;
        Summary summary = this.summary;
        boolean z10 = this.isBeforeContent;
        return "SummarySeparatorChatListItem(color=" + i10 + ", summary=" + summary + ", isBeforeContent=" + z10 + ")";
    }
}
