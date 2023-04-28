package com.discord.chat.reactevents;

import bj.C3681n1;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B@\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB(\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u001c\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0015J>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J!\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÇ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m15073d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "totalDurationSecs", "", "endDurationSecs", "senderUserId", "Lcom/discord/primitives/UserId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;FFLcom/discord/primitives/UserId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;FFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndDurationSecs", "()F", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSenderUserId-re6GcUE", "()J", "J", "getTotalDurationSecs", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component4-re6GcUE", "copy", "copy-OuNwOLg", "(Ljava/lang/String;FFJ)Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class VoiceMessagePlaybackEndedData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final float endDurationSecs;
    private final String messageId;
    private final long senderUserId;
    private final float totalDurationSecs;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VoiceMessagePlaybackEndedData> serializer() {
            return VoiceMessagePlaybackEndedData$$serializer.INSTANCE;
        }
    }

    private VoiceMessagePlaybackEndedData(int i, String str, float f, float f2, UserId userId, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C3681n1.m33818b(i, 15, VoiceMessagePlaybackEndedData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.totalDurationSecs = f;
        this.endDurationSecs = f2;
        this.senderUserId = userId.m42162unboximpl();
    }

    public /* synthetic */ VoiceMessagePlaybackEndedData(int i, String str, float f, float f2, UserId userId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, f, f2, userId, serializationConstructorMarker);
    }

    public /* synthetic */ VoiceMessagePlaybackEndedData(String str, float f, float f2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, j);
    }

    /* renamed from: copy-OuNwOLg$default  reason: not valid java name */
    public static /* synthetic */ VoiceMessagePlaybackEndedData m41965copyOuNwOLg$default(VoiceMessagePlaybackEndedData voiceMessagePlaybackEndedData, String str, float f, float f2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceMessagePlaybackEndedData.messageId;
        }
        if ((i & 2) != 0) {
            f = voiceMessagePlaybackEndedData.totalDurationSecs;
        }
        if ((i & 4) != 0) {
            f2 = voiceMessagePlaybackEndedData.endDurationSecs;
        }
        if ((i & 8) != 0) {
            j = voiceMessagePlaybackEndedData.senderUserId;
        }
        return voiceMessagePlaybackEndedData.m41968copyOuNwOLg(str, f, f2, j);
    }

    public static final void write$Self(VoiceMessagePlaybackEndedData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13870t(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42115boximpl(self.messageId));
        output.mo13871s(serialDesc, 1, self.totalDurationSecs);
        output.mo13871s(serialDesc, 2, self.endDurationSecs);
        output.mo13870t(serialDesc, 3, UserId$$serializer.INSTANCE, UserId.m42153boximpl(self.senderUserId));
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41966component13Eiw7ao() {
        return this.messageId;
    }

    public final float component2() {
        return this.totalDurationSecs;
    }

    public final float component3() {
        return this.endDurationSecs;
    }

    /* renamed from: component4-re6GcUE  reason: not valid java name */
    public final long m41967component4re6GcUE() {
        return this.senderUserId;
    }

    /* renamed from: copy-OuNwOLg  reason: not valid java name */
    public final VoiceMessagePlaybackEndedData m41968copyOuNwOLg(String messageId, float f, float f2, long j) {
        C9971q.m14633g(messageId, "messageId");
        return new VoiceMessagePlaybackEndedData(messageId, f, f2, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceMessagePlaybackEndedData)) {
            return false;
        }
        VoiceMessagePlaybackEndedData voiceMessagePlaybackEndedData = (VoiceMessagePlaybackEndedData) obj;
        return MessageId.m42119equalsimpl0(this.messageId, voiceMessagePlaybackEndedData.messageId) && Float.compare(this.totalDurationSecs, voiceMessagePlaybackEndedData.totalDurationSecs) == 0 && Float.compare(this.endDurationSecs, voiceMessagePlaybackEndedData.endDurationSecs) == 0 && UserId.m42157equalsimpl0(this.senderUserId, voiceMessagePlaybackEndedData.senderUserId);
    }

    public final float getEndDurationSecs() {
        return this.endDurationSecs;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41969getMessageId3Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: getSenderUserId-re6GcUE  reason: not valid java name */
    public final long m41970getSenderUserIdre6GcUE() {
        return this.senderUserId;
    }

    public final float getTotalDurationSecs() {
        return this.totalDurationSecs;
    }

    public int hashCode() {
        return (((((MessageId.m42120hashCodeimpl(this.messageId) * 31) + Float.floatToIntBits(this.totalDurationSecs)) * 31) + Float.floatToIntBits(this.endDurationSecs)) * 31) + UserId.m42158hashCodeimpl(this.senderUserId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(this.messageId);
        float f = this.totalDurationSecs;
        float f2 = this.endDurationSecs;
        String str2 = UserId.m42160toStringimpl(this.senderUserId);
        return "VoiceMessagePlaybackEndedData(messageId=" + str + ", totalDurationSecs=" + f + ", endDurationSecs=" + f2 + ", senderUserId=" + str2 + ")";
    }

    private VoiceMessagePlaybackEndedData(String str, float f, float f2, long j) {
        this.messageId = str;
        this.totalDurationSecs = f;
        this.endDurationSecs = f2;
        this.senderUserId = j;
    }
}
