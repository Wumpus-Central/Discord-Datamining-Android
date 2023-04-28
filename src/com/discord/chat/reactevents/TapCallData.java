package com.discord.chat.reactevents;

import bj.C2560n1;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nf.C10853x;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002)*B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\rJ*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020!HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapCallData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "copy", "copy-pfaIj0E", "(Ljava/lang/String;J)Lcom/discord/chat/reactevents/TapCallData;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapCallData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final String messageId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapCallData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapCallData;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapCallData> serializer() {
            return TapCallData$$serializer.INSTANCE;
        }
    }

    private TapCallData(int i, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, TapCallData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.channelId = channelId.m42098unboximpl();
    }

    public /* synthetic */ TapCallData(int i, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, serializationConstructorMarker);
    }

    public /* synthetic */ TapCallData(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    /* renamed from: copy-pfaIj0E$default  reason: not valid java name */
    public static /* synthetic */ TapCallData m41923copypfaIj0E$default(TapCallData tapCallData, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapCallData.messageId;
        }
        if ((i & 2) != 0) {
            j = tapCallData.channelId;
        }
        return tapCallData.m41926copypfaIj0E(str, j);
    }

    public static final void write$Self(TapCallData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13870t(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42115boximpl(self.messageId));
        output.mo13870t(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42089boximpl(self.channelId));
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41924component13Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41925component2o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: copy-pfaIj0E  reason: not valid java name */
    public final TapCallData m41926copypfaIj0E(String messageId, long j) {
        C9677q.m14633g(messageId, "messageId");
        return new TapCallData(messageId, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapCallData)) {
            return false;
        }
        TapCallData tapCallData = (TapCallData) obj;
        return MessageId.m42119equalsimpl0(this.messageId, tapCallData.messageId) && ChannelId.m42093equalsimpl0(this.channelId, tapCallData.channelId);
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41927getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41928getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (MessageId.m42120hashCodeimpl(this.messageId) * 31) + ChannelId.m42094hashCodeimpl(this.channelId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C10853x.m10921a("data", NativeMapExtensionsKt.nativeMapOf(C10853x.m10921a("messageId", MessageId.m42121toStringimpl(this.messageId)), C10853x.m10921a("channelId", ChannelId.m42096toStringimpl(this.channelId)))));
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(this.messageId);
        String str2 = ChannelId.m42096toStringimpl(this.channelId);
        return "TapCallData(messageId=" + str + ", channelId=" + str2 + ")";
    }

    private TapCallData(String str, long j) {
        this.messageId = str;
        this.channelId = j;
    }
}
