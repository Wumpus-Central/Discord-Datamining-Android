package com.discord.media.engine.video.events;

import co.discord.media_engine.b;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\r\u0010\u0018\u001a\u00060\bj\u0002`\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J5\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\t2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006*"}, d2 = {"Lcom/discord/media/engine/video/events/FirstFrameCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "connectionId", "userId", "", "ssrc", "", "Lcom/discord/media/engine/types/SSRC64;", "streamId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;JLjava/lang/String;)V", "getConnectionId", "()I", "getSsrc", "()J", "getStreamId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FirstFrameCallbackEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int connectionId;
    private final long ssrc;
    private final String streamId;
    private final String userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/FirstFrameCallbackEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/FirstFrameCallbackEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FirstFrameCallbackEvent> serializer() {
            return FirstFrameCallbackEvent$$serializer.INSTANCE;
        }
    }

    public  FirstFrameCallbackEvent(int i10, int i11, String str, long j10, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, FirstFrameCallbackEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.connectionId = i11;
        this.userId = str;
        this.ssrc = j10;
        this.streamId = str2;
    }

    public static  FirstFrameCallbackEvent copy$default(FirstFrameCallbackEvent firstFrameCallbackEvent, int i10, String str, long j10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = firstFrameCallbackEvent.connectionId;
        }
        if ((i11 & 2) != 0) {
            str = firstFrameCallbackEvent.userId;
        }
        if ((i11 & 4) != 0) {
            j10 = firstFrameCallbackEvent.ssrc;
        }
        if ((i11 & 8) != 0) {
            str2 = firstFrameCallbackEvent.streamId;
        }
        return firstFrameCallbackEvent.copy(i10, str, j10, str2);
    }

    public static final void write$Self(FirstFrameCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, self.connectionId);
        output.s(serialDesc, 1, self.userId);
        output.D(serialDesc, 2, self.ssrc);
        output.s(serialDesc, 3, self.streamId);
    }

    public final int component1() {
        return this.connectionId;
    }

    public final String component2() {
        return this.userId;
    }

    public final long component3() {
        return this.ssrc;
    }

    public final String component4() {
        return this.streamId;
    }

    public final FirstFrameCallbackEvent copy(int i10, String userId, long j10, String streamId) {
        q.g(userId, "userId");
        q.g(streamId, "streamId");
        return new FirstFrameCallbackEvent(i10, userId, j10, streamId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirstFrameCallbackEvent)) {
            return false;
        }
        FirstFrameCallbackEvent firstFrameCallbackEvent = (FirstFrameCallbackEvent) obj;
        return this.connectionId == firstFrameCallbackEvent.connectionId && q.b(this.userId, firstFrameCallbackEvent.userId) && this.ssrc == firstFrameCallbackEvent.ssrc && q.b(this.streamId, firstFrameCallbackEvent.streamId);
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    public final long getSsrc() {
        return this.ssrc;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.connectionId * 31) + this.userId.hashCode()) * 31) + b.a(this.ssrc)) * 31) + this.streamId.hashCode();
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.connectionId;
        String str = this.userId;
        long j10 = this.ssrc;
        String str2 = this.streamId;
        return "FirstFrameCallbackEvent(connectionId=" + i10 + ", userId=" + str + ", ssrc=" + j10 + ", streamId=" + str2 + ")";
    }

    public FirstFrameCallbackEvent(int i10, String userId, long j10, String streamId) {
        q.g(userId, "userId");
        q.g(streamId, "streamId");
        this.connectionId = i10;
        this.userId = userId;
        this.ssrc = j10;
        this.streamId = streamId;
    }
}
