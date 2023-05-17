package com.discord.media.engine.video.events;

import bj.n1;
import co.discord.media_engine.a;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\r\u0010\u001a\u001a\u00060\bj\u0002`\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006-"}, d2 = {"Lcom/discord/media/engine/video/events/OnVideoCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "connectionId", "userId", "", "ssrc", "", "Lcom/discord/media/engine/types/SSRC64;", "streamId", "videoStreamParametersJSON", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getConnectionId", "()I", "getSsrc", "()J", "getStreamId", "()Ljava/lang/String;", "getUserId", "getVideoStreamParametersJSON", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnVideoCallbackEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int connectionId;
    private final long ssrc;
    private final String streamId;
    private final String userId;
    private final String videoStreamParametersJSON;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/OnVideoCallbackEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/OnVideoCallbackEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnVideoCallbackEvent> serializer() {
            return OnVideoCallbackEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnVideoCallbackEvent(int i10, int i11, String str, long j10, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, OnVideoCallbackEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.connectionId = i11;
        this.userId = str;
        this.ssrc = j10;
        this.streamId = str2;
        this.videoStreamParametersJSON = str3;
    }

    public static /* synthetic */ OnVideoCallbackEvent copy$default(OnVideoCallbackEvent onVideoCallbackEvent, int i10, String str, long j10, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = onVideoCallbackEvent.connectionId;
        }
        if ((i11 & 2) != 0) {
            str = onVideoCallbackEvent.userId;
        }
        if ((i11 & 4) != 0) {
            j10 = onVideoCallbackEvent.ssrc;
        }
        if ((i11 & 8) != 0) {
            str2 = onVideoCallbackEvent.streamId;
        }
        if ((i11 & 16) != 0) {
            str3 = onVideoCallbackEvent.videoStreamParametersJSON;
        }
        return onVideoCallbackEvent.copy(i10, str, j10, str2, str3);
    }

    public static final void write$Self(OnVideoCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.connectionId);
        output.z(serialDesc, 1, self.userId);
        output.E(serialDesc, 2, self.ssrc);
        output.z(serialDesc, 3, self.streamId);
        output.z(serialDesc, 4, self.videoStreamParametersJSON);
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

    public final String component5() {
        return this.videoStreamParametersJSON;
    }

    public final OnVideoCallbackEvent copy(int i10, String userId, long j10, String streamId, String videoStreamParametersJSON) {
        q.g(userId, "userId");
        q.g(streamId, "streamId");
        q.g(videoStreamParametersJSON, "videoStreamParametersJSON");
        return new OnVideoCallbackEvent(i10, userId, j10, streamId, videoStreamParametersJSON);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnVideoCallbackEvent)) {
            return false;
        }
        OnVideoCallbackEvent onVideoCallbackEvent = (OnVideoCallbackEvent) obj;
        return this.connectionId == onVideoCallbackEvent.connectionId && q.b(this.userId, onVideoCallbackEvent.userId) && this.ssrc == onVideoCallbackEvent.ssrc && q.b(this.streamId, onVideoCallbackEvent.streamId) && q.b(this.videoStreamParametersJSON, onVideoCallbackEvent.videoStreamParametersJSON);
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

    public final String getVideoStreamParametersJSON() {
        return this.videoStreamParametersJSON;
    }

    public int hashCode() {
        return (((((((this.connectionId * 31) + this.userId.hashCode()) * 31) + a.a(this.ssrc)) * 31) + this.streamId.hashCode()) * 31) + this.videoStreamParametersJSON.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.connectionId;
        String str = this.userId;
        long j10 = this.ssrc;
        String str2 = this.streamId;
        String str3 = this.videoStreamParametersJSON;
        return "OnVideoCallbackEvent(connectionId=" + i10 + ", userId=" + str + ", ssrc=" + j10 + ", streamId=" + str2 + ", videoStreamParametersJSON=" + str3 + ")";
    }

    public OnVideoCallbackEvent(int i10, String userId, long j10, String streamId, String videoStreamParametersJSON) {
        q.g(userId, "userId");
        q.g(streamId, "streamId");
        q.g(videoStreamParametersJSON, "videoStreamParametersJSON");
        this.connectionId = i10;
        this.userId = userId;
        this.ssrc = j10;
        this.streamId = streamId;
        this.videoStreamParametersJSON = videoStreamParametersJSON;
    }
}
