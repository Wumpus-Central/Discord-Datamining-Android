package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
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
import wi.m0;
import wi.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BD\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB0\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u001a\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J!\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "", "seen1", "", "action", "", "userId", "Lcom/discord/primitives/UserId;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "linkColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/primitives/ChannelId;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/primitives/ChannelId;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "getLinkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getUserId-re6GcUE", "()J", "J", "component1", "component2", "component2-re6GcUE", "component3", "component3-qMVnFVQ", "component4", "copy", "copy-GE3CLCU", "(Ljava/lang/String;JLcom/discord/primitives/ChannelId;Ljava/lang/Integer;)Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class UserNameOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final Integer linkColor;
    private final ChannelId messageChannelId;
    private final long userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UserNameOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserNameOnClick> serializer() {
            return UserNameOnClick$$serializer.INSTANCE;
        }
    }

    private UserNameOnClick(int i10, String str, UserId userId, ChannelId channelId, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, UserNameOnClick$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.userId = userId.m652unboximpl();
        if ((i10 & 4) == 0) {
            this.messageChannelId = null;
        } else {
            this.messageChannelId = channelId;
        }
        if ((i10 & 8) == 0) {
            this.linkColor = null;
        } else {
            this.linkColor = num;
        }
    }

    public  UserNameOnClick(int i10, String str, UserId userId, ChannelId channelId, Integer num, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, userId, channelId, num, serializationConstructorMarker);
    }

    public  UserNameOnClick(String str, long j10, ChannelId channelId, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, channelId, num);
    }

    
    public static  UserNameOnClick m87copyGE3CLCU$default(UserNameOnClick userNameOnClick, String str, long j10, ChannelId channelId, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userNameOnClick.action;
        }
        if ((i10 & 2) != 0) {
            j10 = userNameOnClick.userId;
        }
        if ((i10 & 4) != 0) {
            channelId = userNameOnClick.messageChannelId;
        }
        if ((i10 & 8) != 0) {
            num = userNameOnClick.linkColor;
        }
        return userNameOnClick.m90copyGE3CLCU(str, j10, channelId, num);
    }

    public static final void write$Self(UserNameOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z11 = false;
        output.s(serialDesc, 0, self.action);
        output.h(serialDesc, 1, UserId$$serializer.INSTANCE, UserId.m643boximpl(self.userId));
        if (!output.w(serialDesc, 2) && self.messageChannelId == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 2, ChannelId$$serializer.INSTANCE, self.messageChannelId);
        }
        if (output.w(serialDesc, 3) || self.linkColor != null) {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 3, m0.f29625a, self.linkColor);
        }
    }

    public final String component1() {
        return this.action;
    }

    
    public final long m88component2re6GcUE() {
        return this.userId;
    }

    
    public final ChannelId m89component3qMVnFVQ() {
        return this.messageChannelId;
    }

    public final Integer component4() {
        return this.linkColor;
    }

    
    public final UserNameOnClick m90copyGE3CLCU(String action, long j10, ChannelId channelId, Integer num) {
        q.h(action, "action");
        return new UserNameOnClick(action, j10, channelId, num, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserNameOnClick)) {
            return false;
        }
        UserNameOnClick userNameOnClick = (UserNameOnClick) obj;
        return q.c(this.action, userNameOnClick.action) && UserId.m647equalsimpl0(this.userId, userNameOnClick.userId) && q.c(this.messageChannelId, userNameOnClick.messageChannelId) && q.c(this.linkColor, userNameOnClick.linkColor);
    }

    public final String getAction() {
        return this.action;
    }

    public final Integer getLinkColor() {
        return this.linkColor;
    }

    
    public final ChannelId m91getMessageChannelIdqMVnFVQ() {
        return this.messageChannelId;
    }

    
    public final long m92getUserIdre6GcUE() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((this.action.hashCode() * 31) + UserId.m648hashCodeimpl(this.userId)) * 31;
        ChannelId channelId = this.messageChannelId;
        int i10 = 0;
        int i11 = (hashCode + (channelId == null ? 0 : ChannelId.m584hashCodeimpl(channelId.m588unboximpl()))) * 31;
        Integer num = this.linkColor;
        if (num != null) {
            i10 = num.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.action;
        String str2 = UserId.m650toStringimpl(this.userId);
        ChannelId channelId = this.messageChannelId;
        Integer num = this.linkColor;
        return "UserNameOnClick(action=" + str + ", userId=" + str2 + ", messageChannelId=" + channelId + ", linkColor=" + num + ")";
    }

    private UserNameOnClick(String str, long j10, ChannelId channelId, Integer num) {
        this.action = str;
        this.userId = j10;
        this.messageChannelId = channelId;
        this.linkColor = num;
    }

    public  UserNameOnClick(String str, long j10, ChannelId channelId, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? null : channelId, (i10 & 8) != 0 ? null : num, null);
    }
}
