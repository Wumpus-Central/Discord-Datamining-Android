package com.discord.chat.bridge.contentnode;

import bj.C3676m0;
import bj.C3681n1;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
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
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BD\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB0\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u001a\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J!\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "", "seen1", "", "action", "", "userId", "Lcom/discord/primitives/UserId;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "linkColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/primitives/ChannelId;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/primitives/ChannelId;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "getLinkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getUserId-re6GcUE", "()J", "J", "component1", "component2", "component2-re6GcUE", "component3", "component3-qMVnFVQ", "component4", "copy", "copy-GE3CLCU", "(Ljava/lang/String;JLcom/discord/primitives/ChannelId;Ljava/lang/Integer;)Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class UserNameOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final Integer linkColor;
    private final ChannelId messageChannelId;
    private final long userId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/UserNameOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserNameOnClick> serializer() {
            return UserNameOnClick$$serializer.INSTANCE;
        }
    }

    private UserNameOnClick(int i, String str, UserId userId, ChannelId channelId, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C3681n1.m33818b(i, 3, UserNameOnClick$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.userId = userId.m42162unboximpl();
        if ((i & 4) == 0) {
            this.messageChannelId = null;
        } else {
            this.messageChannelId = channelId;
        }
        if ((i & 8) == 0) {
            this.linkColor = null;
        } else {
            this.linkColor = num;
        }
    }

    public /* synthetic */ UserNameOnClick(int i, String str, UserId userId, ChannelId channelId, Integer num, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, userId, channelId, num, serializationConstructorMarker);
    }

    public /* synthetic */ UserNameOnClick(String str, long j, ChannelId channelId, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, channelId, num);
    }

    /* renamed from: copy-GE3CLCU$default  reason: not valid java name */
    public static /* synthetic */ UserNameOnClick m41649copyGE3CLCU$default(UserNameOnClick userNameOnClick, String str, long j, ChannelId channelId, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userNameOnClick.action;
        }
        if ((i & 2) != 0) {
            j = userNameOnClick.userId;
        }
        if ((i & 4) != 0) {
            channelId = userNameOnClick.messageChannelId;
        }
        if ((i & 8) != 0) {
            num = userNameOnClick.linkColor;
        }
        return userNameOnClick.m41652copyGE3CLCU(str, j, channelId, num);
    }

    public static final void write$Self(UserNameOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo13864z(serialDesc, 0, self.action);
        output.mo13870t(serialDesc, 1, UserId$$serializer.INSTANCE, UserId.m42153boximpl(self.userId));
        if (!output.mo13893A(serialDesc, 2) && self.messageChannelId == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 2, ChannelId$$serializer.INSTANCE, self.messageChannelId);
        }
        if (output.mo13893A(serialDesc, 3) || self.linkColor != null) {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 3, C3676m0.f5992a, self.linkColor);
        }
    }

    public final String component1() {
        return this.action;
    }

    /* renamed from: component2-re6GcUE  reason: not valid java name */
    public final long m41650component2re6GcUE() {
        return this.userId;
    }

    /* renamed from: component3-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41651component3qMVnFVQ() {
        return this.messageChannelId;
    }

    public final Integer component4() {
        return this.linkColor;
    }

    /* renamed from: copy-GE3CLCU  reason: not valid java name */
    public final UserNameOnClick m41652copyGE3CLCU(String action, long j, ChannelId channelId, Integer num) {
        C9971q.m14633g(action, "action");
        return new UserNameOnClick(action, j, channelId, num, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserNameOnClick)) {
            return false;
        }
        UserNameOnClick userNameOnClick = (UserNameOnClick) obj;
        return C9971q.m14638b(this.action, userNameOnClick.action) && UserId.m42157equalsimpl0(this.userId, userNameOnClick.userId) && C9971q.m14638b(this.messageChannelId, userNameOnClick.messageChannelId) && C9971q.m14638b(this.linkColor, userNameOnClick.linkColor);
    }

    public final String getAction() {
        return this.action;
    }

    public final Integer getLinkColor() {
        return this.linkColor;
    }

    /* renamed from: getMessageChannelId-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41653getMessageChannelIdqMVnFVQ() {
        return this.messageChannelId;
    }

    /* renamed from: getUserId-re6GcUE  reason: not valid java name */
    public final long m41654getUserIdre6GcUE() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((this.action.hashCode() * 31) + UserId.m42158hashCodeimpl(this.userId)) * 31;
        ChannelId channelId = this.messageChannelId;
        int i = 0;
        int i2 = (hashCode + (channelId == null ? 0 : ChannelId.m42094hashCodeimpl(channelId.m42098unboximpl()))) * 31;
        Integer num = this.linkColor;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.action;
        String str2 = UserId.m42160toStringimpl(this.userId);
        ChannelId channelId = this.messageChannelId;
        Integer num = this.linkColor;
        return "UserNameOnClick(action=" + str + ", userId=" + str2 + ", messageChannelId=" + channelId + ", linkColor=" + num + ")";
    }

    private UserNameOnClick(String str, long j, ChannelId channelId, Integer num) {
        this.action = str;
        this.userId = j;
        this.messageChannelId = channelId;
        this.linkColor = num;
    }

    public /* synthetic */ UserNameOnClick(String str, long j, ChannelId channelId, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : channelId, (i & 8) != 0 ? null : num, null);
    }
}
