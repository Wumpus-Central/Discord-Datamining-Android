package com.discord.chat.bridge.contentnode;

import bj.C3622a2;
import bj.C3681n1;
import com.discord.chat.bridge.MessageType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278BX\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011BP\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b J\u001b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0014J\u0019\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b$J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0019\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b'J^\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "", "seen1", "", "action", "", "userId", "Lcom/discord/primitives/UserId;", "messageId", "Lcom/discord/primitives/MessageId;", "applicationUserId", "messageType", "Lcom/discord/chat/bridge/MessageType;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "getApplicationUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getMessageChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getMessageType", "()Lcom/discord/chat/bridge/MessageType;", "getUserId-wUX8bhU", "component1", "component2", "component2-wUX8bhU", "component3", "component3-N_6c4I0", "component4", "component4-wUX8bhU", "component5", "component6", "component6-qMVnFVQ", "copy", "copy-jIMHauk", "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class CommandOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final UserId applicationUserId;
    private final ChannelId messageChannelId;
    private final String messageId;
    private final MessageType messageType;
    private final UserId userId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommandOnClick> serializer() {
            return CommandOnClick$$serializer.INSTANCE;
        }
    }

    private CommandOnClick(int i, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C3681n1.m33818b(i, 0, CommandOnClick$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = str;
        }
        if ((i & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i & 4) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str2;
        }
        if ((i & 8) == 0) {
            this.applicationUserId = null;
        } else {
            this.applicationUserId = userId2;
        }
        if ((i & 16) == 0) {
            this.messageType = null;
        } else {
            this.messageType = messageType;
        }
        if ((i & 32) == 0) {
            this.messageChannelId = null;
        } else {
            this.messageChannelId = channelId;
        }
    }

    public /* synthetic */ CommandOnClick(int i, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, userId, str2, userId2, messageType, channelId, serializationConstructorMarker);
    }

    public /* synthetic */ CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, userId, str2, userId2, messageType, channelId);
    }

    /* renamed from: copy-jIMHauk$default  reason: not valid java name */
    public static /* synthetic */ CommandOnClick m41609copyjIMHauk$default(CommandOnClick commandOnClick, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commandOnClick.action;
        }
        if ((i & 2) != 0) {
            userId = commandOnClick.userId;
        }
        if ((i & 4) != 0) {
            str2 = commandOnClick.messageId;
        }
        if ((i & 8) != 0) {
            userId2 = commandOnClick.applicationUserId;
        }
        if ((i & 16) != 0) {
            messageType = commandOnClick.messageType;
        }
        if ((i & 32) != 0) {
            channelId = commandOnClick.messageChannelId;
        }
        return commandOnClick.m41614copyjIMHauk(str, userId, str2, userId2, messageType, channelId);
    }

    public static final void write$Self(CommandOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MessageId messageId;
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        boolean z6 = false;
        if (!output.mo13893A(serialDesc, 0) && self.action == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 0, C3622a2.f5917a, self.action);
        }
        if (!output.mo13893A(serialDesc, 1) && self.userId == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 1, UserId$$serializer.INSTANCE, self.userId);
        }
        if (!output.mo13893A(serialDesc, 2) && self.messageId == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
            String str = self.messageId;
            if (str != null) {
                messageId = MessageId.m42115boximpl(str);
            } else {
                messageId = null;
            }
            output.mo13874p(serialDesc, 2, messageId$$serializer, messageId);
        }
        if (!output.mo13893A(serialDesc, 3) && self.applicationUserId == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            output.mo13874p(serialDesc, 3, UserId$$serializer.INSTANCE, self.applicationUserId);
        }
        if (!output.mo13893A(serialDesc, 4) && self.messageType == null) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            output.mo13874p(serialDesc, 4, MessageType.Serializer.INSTANCE, self.messageType);
        }
        if (output.mo13893A(serialDesc, 5) || self.messageChannelId != null) {
            z6 = true;
        }
        if (z6) {
            output.mo13874p(serialDesc, 5, ChannelId$$serializer.INSTANCE, self.messageChannelId);
        }
    }

    public final String component1() {
        return this.action;
    }

    /* renamed from: component2-wUX8bhU  reason: not valid java name */
    public final UserId m41610component2wUX8bhU() {
        return this.userId;
    }

    /* renamed from: component3-N_6c4I0  reason: not valid java name */
    public final String m41611component3N_6c4I0() {
        return this.messageId;
    }

    /* renamed from: component4-wUX8bhU  reason: not valid java name */
    public final UserId m41612component4wUX8bhU() {
        return this.applicationUserId;
    }

    public final MessageType component5() {
        return this.messageType;
    }

    /* renamed from: component6-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41613component6qMVnFVQ() {
        return this.messageChannelId;
    }

    /* renamed from: copy-jIMHauk  reason: not valid java name */
    public final CommandOnClick m41614copyjIMHauk(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId) {
        return new CommandOnClick(str, userId, str2, userId2, messageType, channelId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.discord.chat.bridge.contentnode.CommandOnClick
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.discord.chat.bridge.contentnode.CommandOnClick r5 = (com.discord.chat.bridge.contentnode.CommandOnClick) r5
            java.lang.String r1 = r4.action
            java.lang.String r3 = r5.action
            boolean r1 = kotlin.jvm.internal.C9971q.m14638b(r1, r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            com.discord.primitives.UserId r1 = r4.userId
            com.discord.primitives.UserId r3 = r5.userId
            boolean r1 = kotlin.jvm.internal.C9971q.m14638b(r1, r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r1 = r4.messageId
            java.lang.String r3 = r5.messageId
            if (r1 != 0) goto L_0x002c
            if (r3 != 0) goto L_0x002e
            r1 = r0
            goto L_0x0034
        L_0x002c:
            if (r3 != 0) goto L_0x0030
        L_0x002e:
            r1 = r2
            goto L_0x0034
        L_0x0030:
            boolean r1 = com.discord.primitives.MessageId.m42119equalsimpl0(r1, r3)
        L_0x0034:
            if (r1 != 0) goto L_0x0037
            return r2
        L_0x0037:
            com.discord.primitives.UserId r1 = r4.applicationUserId
            com.discord.primitives.UserId r3 = r5.applicationUserId
            boolean r1 = kotlin.jvm.internal.C9971q.m14638b(r1, r3)
            if (r1 != 0) goto L_0x0042
            return r2
        L_0x0042:
            com.discord.chat.bridge.MessageType r1 = r4.messageType
            com.discord.chat.bridge.MessageType r3 = r5.messageType
            if (r1 == r3) goto L_0x0049
            return r2
        L_0x0049:
            com.discord.primitives.ChannelId r1 = r4.messageChannelId
            com.discord.primitives.ChannelId r5 = r5.messageChannelId
            boolean r5 = kotlin.jvm.internal.C9971q.m14638b(r1, r5)
            if (r5 != 0) goto L_0x0054
            return r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.contentnode.CommandOnClick.equals(java.lang.Object):boolean");
    }

    public final String getAction() {
        return this.action;
    }

    /* renamed from: getApplicationUserId-wUX8bhU  reason: not valid java name */
    public final UserId m41615getApplicationUserIdwUX8bhU() {
        return this.applicationUserId;
    }

    /* renamed from: getMessageChannelId-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41616getMessageChannelIdqMVnFVQ() {
        return this.messageChannelId;
    }

    /* renamed from: getMessageId-N_6c4I0  reason: not valid java name */
    public final String m41617getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final MessageType getMessageType() {
        return this.messageType;
    }

    /* renamed from: getUserId-wUX8bhU  reason: not valid java name */
    public final UserId m41618getUserIdwUX8bhU() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.action;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.userId;
        int i2 = (hashCode + (userId == null ? 0 : UserId.m42158hashCodeimpl(userId.m42162unboximpl()))) * 31;
        String str2 = this.messageId;
        int i3 = (i2 + (str2 == null ? 0 : MessageId.m42120hashCodeimpl(str2))) * 31;
        UserId userId2 = this.applicationUserId;
        int i4 = (i3 + (userId2 == null ? 0 : UserId.m42158hashCodeimpl(userId2.m42162unboximpl()))) * 31;
        MessageType messageType = this.messageType;
        int hashCode2 = (i4 + (messageType == null ? 0 : messageType.hashCode())) * 31;
        ChannelId channelId = this.messageChannelId;
        if (channelId != null) {
            i = ChannelId.m42094hashCodeimpl(channelId.m42098unboximpl());
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.action;
        UserId userId = this.userId;
        String str2 = this.messageId;
        String str3 = str2 == null ? "null" : MessageId.m42121toStringimpl(str2);
        UserId userId2 = this.applicationUserId;
        MessageType messageType = this.messageType;
        ChannelId channelId = this.messageChannelId;
        return "CommandOnClick(action=" + str + ", userId=" + userId + ", messageId=" + str3 + ", applicationUserId=" + userId2 + ", messageType=" + messageType + ", messageChannelId=" + channelId + ")";
    }

    private CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId) {
        this.action = str;
        this.userId = userId;
        this.messageId = str2;
        this.applicationUserId = userId2;
        this.messageType = messageType;
        this.messageChannelId = channelId;
    }

    public /* synthetic */ CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : userId2, (i & 16) != 0 ? null : messageType, (i & 32) == 0 ? channelId : null, null);
    }
}
