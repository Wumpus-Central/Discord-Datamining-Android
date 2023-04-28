package com.discord.chat.bridge.contentnode;

import bj.C3681n1;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B4\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u001c\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0017J,\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R'\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/MessageReference;", "", "seen1", "", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLcom/discord/primitives/GuildId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getGuildId-qOKuAAo$annotations", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "component1", "component1-o4g7jtM", "component2", "component2-qOKuAAo", "copy", "copy-2_zTmBg", "(JLcom/discord/primitives/GuildId;)Lcom/discord/chat/bridge/contentnode/MessageReference;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageReference {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final GuildId guildId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/MessageReference$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/MessageReference;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageReference> serializer() {
            return MessageReference$$serializer.INSTANCE;
        }
    }

    private MessageReference(int i, ChannelId channelId, GuildId guildId, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C3681n1.m33818b(i, 1, MessageReference$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = channelId.m42098unboximpl();
        if ((i & 2) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
    }

    public /* synthetic */ MessageReference(int i, ChannelId channelId, GuildId guildId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, channelId, guildId, serializationConstructorMarker);
    }

    public /* synthetic */ MessageReference(long j, GuildId guildId, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, guildId);
    }

    /* renamed from: copy-2_zTmBg$default  reason: not valid java name */
    public static /* synthetic */ MessageReference m41633copy2_zTmBg$default(MessageReference messageReference, long j, GuildId guildId, int i, Object obj) {
        if ((i & 1) != 0) {
            j = messageReference.channelId;
        }
        if ((i & 2) != 0) {
            guildId = messageReference.guildId;
        }
        return messageReference.m41638copy2_zTmBg(j, guildId);
    }

    /* renamed from: getChannelId-o4g7jtM$annotations  reason: not valid java name */
    public static /* synthetic */ void m41634getChannelIdo4g7jtM$annotations() {
    }

    /* renamed from: getGuildId-qOKuAAo$annotations  reason: not valid java name */
    public static /* synthetic */ void m41635getGuildIdqOKuAAo$annotations() {
    }

    public static final void write$Self(MessageReference self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        boolean z = false;
        output.mo13870t(serialDesc, 0, ChannelId$$serializer.INSTANCE, ChannelId.m42089boximpl(self.channelId));
        if (output.mo13893A(serialDesc, 1) || self.guildId != null) {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 1, GuildId$$serializer.INSTANCE, self.guildId);
        }
    }

    /* renamed from: component1-o4g7jtM  reason: not valid java name */
    public final long m41636component1o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: component2-qOKuAAo  reason: not valid java name */
    public final GuildId m41637component2qOKuAAo() {
        return this.guildId;
    }

    /* renamed from: copy-2_zTmBg  reason: not valid java name */
    public final MessageReference m41638copy2_zTmBg(long j, GuildId guildId) {
        return new MessageReference(j, guildId, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageReference)) {
            return false;
        }
        MessageReference messageReference = (MessageReference) obj;
        return ChannelId.m42093equalsimpl0(this.channelId, messageReference.channelId) && C9971q.m14638b(this.guildId, messageReference.guildId);
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41639getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m41640getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public int hashCode() {
        int i = ChannelId.m42094hashCodeimpl(this.channelId) * 31;
        GuildId guildId = this.guildId;
        return i + (guildId == null ? 0 : GuildId.m42107hashCodeimpl(guildId.m42111unboximpl()));
    }

    public String toString() {
        String str = ChannelId.m42096toStringimpl(this.channelId);
        GuildId guildId = this.guildId;
        return "MessageReference(channelId=" + str + ", guildId=" + guildId + ")";
    }

    private MessageReference(long j, GuildId guildId) {
        this.channelId = j;
        this.guildId = guildId;
    }

    public /* synthetic */ MessageReference(long j, GuildId guildId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : guildId, null);
    }
}
