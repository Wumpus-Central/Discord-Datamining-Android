package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.summaries.Summary;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.COLOR, "", "summary", "Lcom/discord/chat/bridge/summaries/Summary;", "isBeforeContent", "", "(ILcom/discord/chat/bridge/summaries/Summary;Z)V", "getColor", "()I", "()Z", "getSummary", "()Lcom/discord/chat/bridge/summaries/Summary;", "text", "", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SummarySeparatorChatListItem extends ChatListItem {
    private final int color;
    private final boolean isBeforeContent;
    private final Summary summary;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SummarySeparatorChatListItem(int r5, com.discord.chat.bridge.summaries.Summary r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "summary"
            kotlin.jvm.internal.q.g(r6, r0)
            java.lang.String r0 = r6.getId()
            if (r7 == 0) goto L_0x000e
            java.lang.String r1 = "start"
            goto L_0x0010
        L_0x000e:
            java.lang.String r1 = "end"
        L_0x0010:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "separator: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 0
            r4.<init>(r0, r1)
            r4.color = r5
            r4.summary = r6
            r4.isBeforeContent = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.item.SummarySeparatorChatListItem.<init>(int, com.discord.chat.bridge.summaries.Summary, boolean):void");
    }

    public static /* synthetic */ SummarySeparatorChatListItem copy$default(SummarySeparatorChatListItem summarySeparatorChatListItem, int i10, Summary summary, boolean z10, int i11, Object obj) {
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
        q.g(summary, "summary");
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
        return this.color == summarySeparatorChatListItem.color && q.b(this.summary, summarySeparatorChatListItem.summary) && this.isBeforeContent == summarySeparatorChatListItem.isBeforeContent;
    }

    public final int getColor() {
        return this.color;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final String getText() {
        return this.isBeforeContent ? this.summary.getTopic() : this.summary.getSummShort();
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
