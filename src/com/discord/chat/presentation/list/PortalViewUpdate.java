package com.discord.chat.presentation.list;

import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m15073d2 = {"Lcom/discord/chat/presentation/list/PortalViewUpdate;", "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "portalChatListItem", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "updateId", "", "(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)V", "getPortalChatListItem", "()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "getUpdateId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class PortalViewUpdate extends ChannelChatListAdapterUpdate {
    private final PortalViewChatListItem portalChatListItem;
    private final int updateId;

    @Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.chat.presentation.list.PortalViewUpdate$1 */
    /* loaded from: classes4.dex */
    static final class C31861 extends AbstractC9679s implements Function0<Unit> {
        public static final C31861 INSTANCE = new C31861();

        C31861() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.chat.presentation.list.PortalViewUpdate$2 */
    /* loaded from: classes4.dex */
    static final class C31872 extends AbstractC9679s implements Function0<Unit> {
        public static final C31872 INSTANCE = new C31872();

        C31872() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public PortalViewUpdate(PortalViewChatListItem portalViewChatListItem, int i) {
        super(i, C31861.INSTANCE, C31872.INSTANCE, null);
        this.portalChatListItem = portalViewChatListItem;
        this.updateId = i;
    }

    public static /* synthetic */ PortalViewUpdate copy$default(PortalViewUpdate portalViewUpdate, PortalViewChatListItem portalViewChatListItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            portalViewChatListItem = portalViewUpdate.portalChatListItem;
        }
        if ((i2 & 2) != 0) {
            i = portalViewUpdate.getUpdateId();
        }
        return portalViewUpdate.copy(portalViewChatListItem, i);
    }

    public final PortalViewChatListItem component1() {
        return this.portalChatListItem;
    }

    public final int component2() {
        return getUpdateId();
    }

    public final PortalViewUpdate copy(PortalViewChatListItem portalViewChatListItem, int i) {
        return new PortalViewUpdate(portalViewChatListItem, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortalViewUpdate)) {
            return false;
        }
        PortalViewUpdate portalViewUpdate = (PortalViewUpdate) obj;
        return C9677q.m14638b(this.portalChatListItem, portalViewUpdate.portalChatListItem) && getUpdateId() == portalViewUpdate.getUpdateId();
    }

    public final PortalViewChatListItem getPortalChatListItem() {
        return this.portalChatListItem;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    public int getUpdateId() {
        return this.updateId;
    }

    public int hashCode() {
        PortalViewChatListItem portalViewChatListItem = this.portalChatListItem;
        return ((portalViewChatListItem == null ? 0 : portalViewChatListItem.hashCode()) * 31) + getUpdateId();
    }

    public String toString() {
        PortalViewChatListItem portalViewChatListItem = this.portalChatListItem;
        int updateId = getUpdateId();
        return "PortalViewUpdate(portalChatListItem=" + portalViewChatListItem + ", updateId=" + updateId + ")";
    }
}
