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
import qi.f;
import ti.n1;

@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B@\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB(\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u001c\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J!\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackStartedData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "totalDurationSecs", "", "startDurationSecs", "senderUserId", "Lcom/discord/primitives/UserId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;FFLcom/discord/primitives/UserId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;FFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSenderUserId-re6GcUE", "()J", "J", "getStartDurationSecs", "()F", "getTotalDurationSecs", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component4-re6GcUE", "copy", "copy-OuNwOLg", "(Ljava/lang/String;FFJ)Lcom/discord/chat/reactevents/VoiceMessagePlaybackStartedData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VoiceMessagePlaybackStartedData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String messageId;
    private final long senderUserId;
    private final float startDurationSecs;
    private final float totalDurationSecs;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackStartedData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackStartedData;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VoiceMessagePlaybackStartedData> serializer() {
            return VoiceMessagePlaybackStartedData$$serializer.INSTANCE;
        }
    }

    private VoiceMessagePlaybackStartedData(int i10, String str, float f10, float f11, UserId userId, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, VoiceMessagePlaybackStartedData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.totalDurationSecs = f10;
        this.startDurationSecs = f11;
        this.senderUserId = userId.m635unboximpl();
    }

    public /* synthetic */ VoiceMessagePlaybackStartedData(int i10, String str, float f10, float f11, UserId userId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, f10, f11, userId, serializationConstructorMarker);
    }

    public /* synthetic */ VoiceMessagePlaybackStartedData(String str, float f10, float f11, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, j10);
    }

    /* renamed from: copy-OuNwOLg$default  reason: not valid java name */
    public static /* synthetic */ VoiceMessagePlaybackStartedData m434copyOuNwOLg$default(VoiceMessagePlaybackStartedData voiceMessagePlaybackStartedData, String str, float f10, float f11, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voiceMessagePlaybackStartedData.messageId;
        }
        if ((i10 & 2) != 0) {
            f10 = voiceMessagePlaybackStartedData.totalDurationSecs;
        }
        if ((i10 & 4) != 0) {
            f11 = voiceMessagePlaybackStartedData.startDurationSecs;
        }
        if ((i10 & 8) != 0) {
            j10 = voiceMessagePlaybackStartedData.senderUserId;
        }
        return voiceMessagePlaybackStartedData.m437copyOuNwOLg(str, f10, f11, j10);
    }

    public static final void write$Self(VoiceMessagePlaybackStartedData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.C(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m588boximpl(self.messageId));
        output.m(serialDesc, 1, self.totalDurationSecs);
        output.m(serialDesc, 2, self.startDurationSecs);
        output.C(serialDesc, 3, UserId$$serializer.INSTANCE, UserId.m626boximpl(self.senderUserId));
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m435component13Eiw7ao() {
        return this.messageId;
    }

    public final float component2() {
        return this.totalDurationSecs;
    }

    public final float component3() {
        return this.startDurationSecs;
    }

    /* renamed from: component4-re6GcUE  reason: not valid java name */
    public final long m436component4re6GcUE() {
        return this.senderUserId;
    }

    /* renamed from: copy-OuNwOLg  reason: not valid java name */
    public final VoiceMessagePlaybackStartedData m437copyOuNwOLg(String messageId, float f10, float f11, long j10) {
        q.g(messageId, "messageId");
        return new VoiceMessagePlaybackStartedData(messageId, f10, f11, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceMessagePlaybackStartedData)) {
            return false;
        }
        VoiceMessagePlaybackStartedData voiceMessagePlaybackStartedData = (VoiceMessagePlaybackStartedData) obj;
        return MessageId.m592equalsimpl0(this.messageId, voiceMessagePlaybackStartedData.messageId) && Float.compare(this.totalDurationSecs, voiceMessagePlaybackStartedData.totalDurationSecs) == 0 && Float.compare(this.startDurationSecs, voiceMessagePlaybackStartedData.startDurationSecs) == 0 && UserId.m630equalsimpl0(this.senderUserId, voiceMessagePlaybackStartedData.senderUserId);
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m438getMessageId3Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: getSenderUserId-re6GcUE  reason: not valid java name */
    public final long m439getSenderUserIdre6GcUE() {
        return this.senderUserId;
    }

    public final float getStartDurationSecs() {
        return this.startDurationSecs;
    }

    public final float getTotalDurationSecs() {
        return this.totalDurationSecs;
    }

    public int hashCode() {
        return (((((MessageId.m593hashCodeimpl(this.messageId) * 31) + Float.floatToIntBits(this.totalDurationSecs)) * 31) + Float.floatToIntBits(this.startDurationSecs)) * 31) + UserId.m631hashCodeimpl(this.senderUserId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = MessageId.m594toStringimpl(this.messageId);
        float f10 = this.totalDurationSecs;
        float f11 = this.startDurationSecs;
        String str2 = UserId.m633toStringimpl(this.senderUserId);
        return "VoiceMessagePlaybackStartedData(messageId=" + str + ", totalDurationSecs=" + f10 + ", startDurationSecs=" + f11 + ", senderUserId=" + str2 + ")";
    }

    private VoiceMessagePlaybackStartedData(String str, float f10, float f11, long j10) {
        this.messageId = str;
        this.totalDurationSecs = f10;
        this.startDurationSecs = f11;
        this.senderUserId = j10;
    }
}
