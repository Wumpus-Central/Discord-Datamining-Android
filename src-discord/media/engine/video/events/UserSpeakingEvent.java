package com.discord.media.engine.video.events;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B3\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/discord/media/engine/video/events/UserSpeakingEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "connectionId", "userId", "", "isSpeaking", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;I)V", "getConnectionId", "()I", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class UserSpeakingEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int connectionId;
    private final int isSpeaking;
    private final String userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/UserSpeakingEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/UserSpeakingEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSpeakingEvent> serializer() {
            return UserSpeakingEvent$$serializer.INSTANCE;
        }
    }

    public  UserSpeakingEvent(int i10, int i11, String str, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, UserSpeakingEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.connectionId = i11;
        this.userId = str;
        this.isSpeaking = i12;
    }

    public static  UserSpeakingEvent copy$default(UserSpeakingEvent userSpeakingEvent, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = userSpeakingEvent.connectionId;
        }
        if ((i12 & 2) != 0) {
            str = userSpeakingEvent.userId;
        }
        if ((i12 & 4) != 0) {
            i11 = userSpeakingEvent.isSpeaking;
        }
        return userSpeakingEvent.copy(i10, str, i11);
    }

    public static final void write$Self(UserSpeakingEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.q(serialDesc, 0, self.connectionId);
        output.s(serialDesc, 1, self.userId);
        output.q(serialDesc, 2, self.isSpeaking);
    }

    public final int component1() {
        return this.connectionId;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.isSpeaking;
    }

    public final UserSpeakingEvent copy(int i10, String userId, int i11) {
        q.h(userId, "userId");
        return new UserSpeakingEvent(i10, userId, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSpeakingEvent)) {
            return false;
        }
        UserSpeakingEvent userSpeakingEvent = (UserSpeakingEvent) obj;
        return this.connectionId == userSpeakingEvent.connectionId && q.c(this.userId, userSpeakingEvent.userId) && this.isSpeaking == userSpeakingEvent.isSpeaking;
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.connectionId * 31) + this.userId.hashCode()) * 31) + this.isSpeaking;
    }

    public final int isSpeaking() {
        return this.isSpeaking;
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.connectionId;
        String str = this.userId;
        int i11 = this.isSpeaking;
        return "UserSpeakingEvent(connectionId=" + i10 + ", userId=" + str + ", isSpeaking=" + i11 + ")";
    }

    public UserSpeakingEvent(int i10, String userId, int i11) {
        q.h(userId, "userId");
        this.connectionId = i10;
        this.userId = userId;
        this.isSpeaking = i11;
    }
}
