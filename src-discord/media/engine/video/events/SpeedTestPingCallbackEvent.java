package com.discord.media.engine.video.events;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BC\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/discord/media/engine/video/events/SpeedTestPingCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "connectionId", "ping", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "seq", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IILjava/lang/String;II)V", "getConnectionId", "()I", "getPing", "getPort", "getSeq", "getServer", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SpeedTestPingCallbackEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int connectionId;
    private final int ping;
    private final int port;
    private final int seq;
    private final String server;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/SpeedTestPingCallbackEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/SpeedTestPingCallbackEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpeedTestPingCallbackEvent> serializer() {
            return SpeedTestPingCallbackEvent$$serializer.INSTANCE;
        }
    }

    public  SpeedTestPingCallbackEvent(int i10, int i11, int i12, String str, int i13, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, SpeedTestPingCallbackEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.connectionId = i11;
        this.ping = i12;
        this.server = str;
        this.port = i13;
        this.seq = i14;
    }

    public static  SpeedTestPingCallbackEvent copy$default(SpeedTestPingCallbackEvent speedTestPingCallbackEvent, int i10, int i11, String str, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = speedTestPingCallbackEvent.connectionId;
        }
        if ((i14 & 2) != 0) {
            i11 = speedTestPingCallbackEvent.ping;
        }
        if ((i14 & 4) != 0) {
            str = speedTestPingCallbackEvent.server;
        }
        if ((i14 & 8) != 0) {
            i12 = speedTestPingCallbackEvent.port;
        }
        if ((i14 & 16) != 0) {
            i13 = speedTestPingCallbackEvent.seq;
        }
        return speedTestPingCallbackEvent.copy(i10, i11, str, i12, i13);
    }

    public static final void write$Self(SpeedTestPingCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.w(serialDesc, 0, self.connectionId);
        output.w(serialDesc, 1, self.ping);
        output.y(serialDesc, 2, self.server);
        output.w(serialDesc, 3, self.port);
        output.w(serialDesc, 4, self.seq);
    }

    public final int component1() {
        return this.connectionId;
    }

    public final int component2() {
        return this.ping;
    }

    public final String component3() {
        return this.server;
    }

    public final int component4() {
        return this.port;
    }

    public final int component5() {
        return this.seq;
    }

    public final SpeedTestPingCallbackEvent copy(int i10, int i11, String server, int i12, int i13) {
        q.h(server, "server");
        return new SpeedTestPingCallbackEvent(i10, i11, server, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedTestPingCallbackEvent)) {
            return false;
        }
        SpeedTestPingCallbackEvent speedTestPingCallbackEvent = (SpeedTestPingCallbackEvent) obj;
        return this.connectionId == speedTestPingCallbackEvent.connectionId && this.ping == speedTestPingCallbackEvent.ping && q.c(this.server, speedTestPingCallbackEvent.server) && this.port == speedTestPingCallbackEvent.port && this.seq == speedTestPingCallbackEvent.seq;
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    public final int getPing() {
        return this.ping;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getServer() {
        return this.server;
    }

    public int hashCode() {
        return (((((((this.connectionId * 31) + this.ping) * 31) + this.server.hashCode()) * 31) + this.port) * 31) + this.seq;
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.connectionId;
        int i11 = this.ping;
        String str = this.server;
        int i12 = this.port;
        int i13 = this.seq;
        return "SpeedTestPingCallbackEvent(connectionId=" + i10 + ", ping=" + i11 + ", server=" + str + ", port=" + i12 + ", seq=" + i13 + ")";
    }

    public SpeedTestPingCallbackEvent(int i10, int i11, String server, int i12, int i13) {
        q.h(server, "server");
        this.connectionId = i10;
        this.ping = i11;
        this.server = server;
        this.port = i12;
        this.seq = i13;
    }
}
