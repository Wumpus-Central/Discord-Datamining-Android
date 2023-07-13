package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BD\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fB(\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0017\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "guildId", "", "parentChannelId", "threadId", "messageId", "Lcom/discord/primitives/MessageId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGuildId", "()Ljava/lang/String;", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getParentChannelId", "getThreadId", "component1", "component2", "component3", "component4", "component4-3Eiw7ao", "copy", "copy-wInV0_I", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TapPostPreviewEmbedData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String guildId;
    private final String messageId;
    private final String parentChannelId;
    private final String threadId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/TapPostPreviewEmbedData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapPostPreviewEmbedData> serializer() {
            return TapPostPreviewEmbedData$$serializer.INSTANCE;
        }
    }

    private TapPostPreviewEmbedData(int i10, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, TapPostPreviewEmbedData$$serializer.INSTANCE.getDescriptor());
        }
        this.guildId = str;
        this.parentChannelId = str2;
        this.threadId = str3;
        this.messageId = str4;
    }

    public  TapPostPreviewEmbedData(int i10, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, serializationConstructorMarker);
    }

    public  TapPostPreviewEmbedData(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    
    public static  TapPostPreviewEmbedData m396copywInV0_I$default(TapPostPreviewEmbedData tapPostPreviewEmbedData, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tapPostPreviewEmbedData.guildId;
        }
        if ((i10 & 2) != 0) {
            str2 = tapPostPreviewEmbedData.parentChannelId;
        }
        if ((i10 & 4) != 0) {
            str3 = tapPostPreviewEmbedData.threadId;
        }
        if ((i10 & 8) != 0) {
            str4 = tapPostPreviewEmbedData.messageId;
        }
        return tapPostPreviewEmbedData.m398copywInV0_I(str, str2, str3, str4);
    }

    public static final void write$Self(TapPostPreviewEmbedData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.s(serialDesc, 0, self.guildId);
        output.s(serialDesc, 1, self.parentChannelId);
        output.s(serialDesc, 2, self.threadId);
        output.n(serialDesc, 3, MessageId$$serializer.INSTANCE, MessageId.m590boximpl(self.messageId));
    }

    public final String component1() {
        return this.guildId;
    }

    public final String component2() {
        return this.parentChannelId;
    }

    public final String component3() {
        return this.threadId;
    }

    
    public final String m397component43Eiw7ao() {
        return this.messageId;
    }

    
    public final TapPostPreviewEmbedData m398copywInV0_I(String guildId, String parentChannelId, String threadId, String messageId) {
        q.g(guildId, "guildId");
        q.g(parentChannelId, "parentChannelId");
        q.g(threadId, "threadId");
        q.g(messageId, "messageId");
        return new TapPostPreviewEmbedData(guildId, parentChannelId, threadId, messageId, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapPostPreviewEmbedData)) {
            return false;
        }
        TapPostPreviewEmbedData tapPostPreviewEmbedData = (TapPostPreviewEmbedData) obj;
        return q.b(this.guildId, tapPostPreviewEmbedData.guildId) && q.b(this.parentChannelId, tapPostPreviewEmbedData.parentChannelId) && q.b(this.threadId, tapPostPreviewEmbedData.threadId) && MessageId.m594equalsimpl0(this.messageId, tapPostPreviewEmbedData.messageId);
    }

    public final String getGuildId() {
        return this.guildId;
    }

    
    public final String m399getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final String getParentChannelId() {
        return this.parentChannelId;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return (((((this.guildId.hashCode() * 31) + this.parentChannelId.hashCode()) * 31) + this.threadId.hashCode()) * 31) + MessageId.m595hashCodeimpl(this.messageId);
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.guildId;
        String str2 = this.parentChannelId;
        String str3 = this.threadId;
        String str4 = MessageId.m596toStringimpl(this.messageId);
        return "TapPostPreviewEmbedData(guildId=" + str + ", parentChannelId=" + str2 + ", threadId=" + str3 + ", messageId=" + str4 + ")";
    }

    private TapPostPreviewEmbedData(String str, String str2, String str3, String str4) {
        this.guildId = str;
        this.parentChannelId = str2;
        this.threadId = str3;
        this.messageId = str4;
    }
}
