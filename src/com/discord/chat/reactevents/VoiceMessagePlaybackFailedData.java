package com.discord.chat.reactevents;

import bj.C2500a2;
import bj.C2560n1;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u001a\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J,\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u000e\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m15073d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackFailedData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "errorMessage", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getErrorMessage", "()Ljava/lang/String;", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/reactevents/VoiceMessagePlaybackFailedData;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class VoiceMessagePlaybackFailedData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String errorMessage;
    private final String messageId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackFailedData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackFailedData;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VoiceMessagePlaybackFailedData> serializer() {
            return VoiceMessagePlaybackFailedData$$serializer.INSTANCE;
        }
    }

    private VoiceMessagePlaybackFailedData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, VoiceMessagePlaybackFailedData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.errorMessage = str2;
    }

    public /* synthetic */ VoiceMessagePlaybackFailedData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, serializationConstructorMarker);
    }

    public /* synthetic */ VoiceMessagePlaybackFailedData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: copy-ntcYbpo$default  reason: not valid java name */
    public static /* synthetic */ VoiceMessagePlaybackFailedData m41971copyntcYbpo$default(VoiceMessagePlaybackFailedData voiceMessagePlaybackFailedData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceMessagePlaybackFailedData.messageId;
        }
        if ((i & 2) != 0) {
            str2 = voiceMessagePlaybackFailedData.errorMessage;
        }
        return voiceMessagePlaybackFailedData.m41973copyntcYbpo(str, str2);
    }

    public static final void write$Self(VoiceMessagePlaybackFailedData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13870t(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42115boximpl(self.messageId));
        output.mo13874p(serialDesc, 1, C2500a2.f6719a, self.errorMessage);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41972component13Eiw7ao() {
        return this.messageId;
    }

    public final String component2() {
        return this.errorMessage;
    }

    /* renamed from: copy-ntcYbpo  reason: not valid java name */
    public final VoiceMessagePlaybackFailedData m41973copyntcYbpo(String messageId, String str) {
        C9677q.m14633g(messageId, "messageId");
        return new VoiceMessagePlaybackFailedData(messageId, str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceMessagePlaybackFailedData)) {
            return false;
        }
        VoiceMessagePlaybackFailedData voiceMessagePlaybackFailedData = (VoiceMessagePlaybackFailedData) obj;
        return MessageId.m42119equalsimpl0(this.messageId, voiceMessagePlaybackFailedData.messageId) && C9677q.m14638b(this.errorMessage, voiceMessagePlaybackFailedData.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41974getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        int i = MessageId.m42120hashCodeimpl(this.messageId) * 31;
        String str = this.errorMessage;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(this.messageId);
        String str2 = this.errorMessage;
        return "VoiceMessagePlaybackFailedData(messageId=" + str + ", errorMessage=" + str2 + ")";
    }

    private VoiceMessagePlaybackFailedData(String str, String str2) {
        this.messageId = str;
        this.errorMessage = str2;
    }
}
