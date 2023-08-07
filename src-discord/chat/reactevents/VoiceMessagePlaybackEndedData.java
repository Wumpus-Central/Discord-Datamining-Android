package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;

@f
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223BH\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0002\u0010\u000eB0\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001a\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0014J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u001e\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0017J\t\u0010 \u001a\u00020\u0007HÆ\u0003JH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "totalDurationSecs", "", "endDurationSecs", "senderUserId", "Lcom/discord/primitives/UserId;", "durationListeningSecs", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;FFLcom/discord/primitives/UserId;FLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;FFJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDurationListeningSecs", "()F", "getEndDurationSecs", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSenderUserId-re6GcUE", "()J", "J", "getTotalDurationSecs", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component4-re6GcUE", "component5", "copy", "copy-HuwN0RY", "(Ljava/lang/String;FFJF)Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class VoiceMessagePlaybackEndedData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final float durationListeningSecs;
    private final float endDurationSecs;
    private final String messageId;
    private final long senderUserId;
    private final float totalDurationSecs;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VoiceMessagePlaybackEndedData> serializer() {
            return VoiceMessagePlaybackEndedData$$serializer.INSTANCE;
        }
    }

    private VoiceMessagePlaybackEndedData(int i10, String str, float f10, float f11, UserId userId, float f12, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, VoiceMessagePlaybackEndedData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.totalDurationSecs = f10;
        this.endDurationSecs = f11;
        this.senderUserId = userId.m640unboximpl();
        this.durationListeningSecs = f12;
    }

    public  VoiceMessagePlaybackEndedData(int i10, String str, float f10, float f11, UserId userId, float f12, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, f10, f11, userId, f12, serializationConstructorMarker);
    }

    public  VoiceMessagePlaybackEndedData(String str, float f10, float f11, long j10, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, j10, f12);
    }

    
    public static  VoiceMessagePlaybackEndedData m429copyHuwN0RY$default(VoiceMessagePlaybackEndedData voiceMessagePlaybackEndedData, String str, float f10, float f11, long j10, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voiceMessagePlaybackEndedData.messageId;
        }
        if ((i10 & 2) != 0) {
            f10 = voiceMessagePlaybackEndedData.totalDurationSecs;
        }
        if ((i10 & 4) != 0) {
            f11 = voiceMessagePlaybackEndedData.endDurationSecs;
        }
        if ((i10 & 8) != 0) {
            j10 = voiceMessagePlaybackEndedData.senderUserId;
        }
        if ((i10 & 16) != 0) {
            f12 = voiceMessagePlaybackEndedData.durationListeningSecs;
        }
        return voiceMessagePlaybackEndedData.m432copyHuwN0RY(str, f10, f11, j10, f12);
    }

    public static final void write$Self(VoiceMessagePlaybackEndedData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.h(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m593boximpl(self.messageId));
        output.m(serialDesc, 1, self.totalDurationSecs);
        output.m(serialDesc, 2, self.endDurationSecs);
        output.h(serialDesc, 3, UserId$$serializer.INSTANCE, UserId.m631boximpl(self.senderUserId));
        output.m(serialDesc, 4, self.durationListeningSecs);
    }

    
    public final String m430component13Eiw7ao() {
        return this.messageId;
    }

    public final float component2() {
        return this.totalDurationSecs;
    }

    public final float component3() {
        return this.endDurationSecs;
    }

    
    public final long m431component4re6GcUE() {
        return this.senderUserId;
    }

    public final float component5() {
        return this.durationListeningSecs;
    }

    
    public final VoiceMessagePlaybackEndedData m432copyHuwN0RY(String messageId, float f10, float f11, long j10, float f12) {
        q.h(messageId, "messageId");
        return new VoiceMessagePlaybackEndedData(messageId, f10, f11, j10, f12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceMessagePlaybackEndedData)) {
            return false;
        }
        VoiceMessagePlaybackEndedData voiceMessagePlaybackEndedData = (VoiceMessagePlaybackEndedData) obj;
        return MessageId.m597equalsimpl0(this.messageId, voiceMessagePlaybackEndedData.messageId) && Float.compare(this.totalDurationSecs, voiceMessagePlaybackEndedData.totalDurationSecs) == 0 && Float.compare(this.endDurationSecs, voiceMessagePlaybackEndedData.endDurationSecs) == 0 && UserId.m635equalsimpl0(this.senderUserId, voiceMessagePlaybackEndedData.senderUserId) && Float.compare(this.durationListeningSecs, voiceMessagePlaybackEndedData.durationListeningSecs) == 0;
    }

    public final float getDurationListeningSecs() {
        return this.durationListeningSecs;
    }

    public final float getEndDurationSecs() {
        return this.endDurationSecs;
    }

    
    public final String m433getMessageId3Eiw7ao() {
        return this.messageId;
    }

    
    public final long m434getSenderUserIdre6GcUE() {
        return this.senderUserId;
    }

    public final float getTotalDurationSecs() {
        return this.totalDurationSecs;
    }

    public int hashCode() {
        return (((((((MessageId.m598hashCodeimpl(this.messageId) * 31) + Float.floatToIntBits(this.totalDurationSecs)) * 31) + Float.floatToIntBits(this.endDurationSecs)) * 31) + UserId.m636hashCodeimpl(this.senderUserId)) * 31) + Float.floatToIntBits(this.durationListeningSecs);
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = MessageId.m599toStringimpl(this.messageId);
        float f10 = this.totalDurationSecs;
        float f11 = this.endDurationSecs;
        String str2 = UserId.m638toStringimpl(this.senderUserId);
        float f12 = this.durationListeningSecs;
        return "VoiceMessagePlaybackEndedData(messageId=" + str + ", totalDurationSecs=" + f10 + ", endDurationSecs=" + f11 + ", senderUserId=" + str2 + ", durationListeningSecs=" + f12 + ")";
    }

    private VoiceMessagePlaybackEndedData(String str, float f10, float f11, long j10, float f12) {
        this.messageId = str;
        this.totalDurationSecs = f10;
        this.endDurationSecs = f11;
        this.senderUserId = j10;
        this.durationListeningSecs = f12;
    }
}
