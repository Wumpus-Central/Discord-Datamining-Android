package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.MessageType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.a2;
import wi.n1;

@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278BX\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011BP\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b J\u001b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0014J\u0019\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b$J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0019\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b'J^\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "", "seen1", "", "action", "", "userId", "Lcom/discord/primitives/UserId;", "messageId", "Lcom/discord/primitives/MessageId;", "applicationUserId", "messageType", "Lcom/discord/chat/bridge/MessageType;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "getApplicationUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getMessageChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getMessageType", "()Lcom/discord/chat/bridge/MessageType;", "getUserId-wUX8bhU", "component1", "component2", "component2-wUX8bhU", "component3", "component3-N_6c4I0", "component4", "component4-wUX8bhU", "component5", "component6", "component6-qMVnFVQ", "copy", "copy-jIMHauk", "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CommandOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final UserId applicationUserId;
    private final ChannelId messageChannelId;
    private final String messageId;
    private final MessageType messageType;
    private final UserId userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommandOnClick> serializer() {
            return CommandOnClick$$serializer.INSTANCE;
        }
    }

    private CommandOnClick(int i10, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, CommandOnClick$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.action = null;
        } else {
            this.action = str;
        }
        if ((i10 & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i10 & 4) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str2;
        }
        if ((i10 & 8) == 0) {
            this.applicationUserId = null;
        } else {
            this.applicationUserId = userId2;
        }
        if ((i10 & 16) == 0) {
            this.messageType = null;
        } else {
            this.messageType = messageType;
        }
        if ((i10 & 32) == 0) {
            this.messageChannelId = null;
        } else {
            this.messageChannelId = channelId;
        }
    }

    public  CommandOnClick(int i10, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, userId, str2, userId2, messageType, channelId, serializationConstructorMarker);
    }

    public  CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, userId, str2, userId2, messageType, channelId);
    }

    
    public static  CommandOnClick m55copyjIMHauk$default(CommandOnClick commandOnClick, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = commandOnClick.action;
        }
        if ((i10 & 2) != 0) {
            userId = commandOnClick.userId;
        }
        if ((i10 & 4) != 0) {
            str2 = commandOnClick.messageId;
        }
        if ((i10 & 8) != 0) {
            userId2 = commandOnClick.applicationUserId;
        }
        if ((i10 & 16) != 0) {
            messageType = commandOnClick.messageType;
        }
        if ((i10 & 32) != 0) {
            channelId = commandOnClick.messageChannelId;
        }
        return commandOnClick.m60copyjIMHauk(str, userId, str2, userId2, messageType, channelId);
    }

    public static final void write$Self(CommandOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        MessageId messageId;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z15 = false;
        if (!output.z(serialDesc, 0) && self.action == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.B(serialDesc, 0, a2.f29764a, self.action);
        }
        if (!output.z(serialDesc, 1) && self.userId == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.B(serialDesc, 1, UserId$$serializer.INSTANCE, self.userId);
        }
        if (!output.z(serialDesc, 2) && self.messageId == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
            String str = self.messageId;
            if (str != null) {
                messageId = MessageId.m617boximpl(str);
            } else {
                messageId = null;
            }
            output.B(serialDesc, 2, messageId$$serializer, messageId);
        }
        if (!output.z(serialDesc, 3) && self.applicationUserId == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.B(serialDesc, 3, UserId$$serializer.INSTANCE, self.applicationUserId);
        }
        if (!output.z(serialDesc, 4) && self.messageType == null) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            output.B(serialDesc, 4, MessageType.Serializer.INSTANCE, self.messageType);
        }
        if (output.z(serialDesc, 5) || self.messageChannelId != null) {
            z15 = true;
        }
        if (z15) {
            output.B(serialDesc, 5, ChannelId$$serializer.INSTANCE, self.messageChannelId);
        }
    }

    public final String component1() {
        return this.action;
    }

    
    public final UserId m56component2wUX8bhU() {
        return this.userId;
    }

    
    public final String m57component3N_6c4I0() {
        return this.messageId;
    }

    
    public final UserId m58component4wUX8bhU() {
        return this.applicationUserId;
    }

    public final MessageType component5() {
        return this.messageType;
    }

    
    public final ChannelId m59component6qMVnFVQ() {
        return this.messageChannelId;
    }

    
    public final CommandOnClick m60copyjIMHauk(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId) {
        return new CommandOnClick(str, userId, str2, userId2, messageType, channelId, null);
    }

    
    
    
    public boolean equals(java.lang.Object r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.contentnode.CommandOnClick.equals(java.lang.Object):boolean");
    }

    public final String getAction() {
        return this.action;
    }

    
    public final UserId m61getApplicationUserIdwUX8bhU() {
        return this.applicationUserId;
    }

    
    public final ChannelId m62getMessageChannelIdqMVnFVQ() {
        return this.messageChannelId;
    }

    
    public final String m63getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final MessageType getMessageType() {
        return this.messageType;
    }

    
    public final UserId m64getUserIdwUX8bhU() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.action;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.userId;
        int i11 = (hashCode + (userId == null ? 0 : UserId.m660hashCodeimpl(userId.m664unboximpl()))) * 31;
        String str2 = this.messageId;
        int i12 = (i11 + (str2 == null ? 0 : MessageId.m622hashCodeimpl(str2))) * 31;
        UserId userId2 = this.applicationUserId;
        int i13 = (i12 + (userId2 == null ? 0 : UserId.m660hashCodeimpl(userId2.m664unboximpl()))) * 31;
        MessageType messageType = this.messageType;
        int hashCode2 = (i13 + (messageType == null ? 0 : messageType.hashCode())) * 31;
        ChannelId channelId = this.messageChannelId;
        if (channelId != null) {
            i10 = ChannelId.m596hashCodeimpl(channelId.m600unboximpl());
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.action;
        UserId userId = this.userId;
        String str2 = this.messageId;
        String str3 = str2 == null ? "null" : MessageId.m623toStringimpl(str2);
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

    public  CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : userId, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : userId2, (i10 & 16) != 0 ? null : messageType, (i10 & 32) == 0 ? channelId : null, null);
    }
}
