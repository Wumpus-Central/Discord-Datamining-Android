package com.discord.media.engine.video.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "streamId", "", AppStateModule.APP_STATE_ACTIVE, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Z)V", "getActive", "()Z", "getStreamId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActiveSinksChangeEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean active;
    private final String streamId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActiveSinksChangeEvent> serializer() {
            return ActiveSinksChangeEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActiveSinksChangeEvent(int i10, String str, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, ActiveSinksChangeEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.streamId = str;
        this.active = z10;
    }

    public static /* synthetic */ ActiveSinksChangeEvent copy$default(ActiveSinksChangeEvent activeSinksChangeEvent, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activeSinksChangeEvent.streamId;
        }
        if ((i10 & 2) != 0) {
            z10 = activeSinksChangeEvent.active;
        }
        return activeSinksChangeEvent.copy(str, z10);
    }

    public static final void write$Self(ActiveSinksChangeEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.z(serialDesc, 0, self.streamId);
        output.y(serialDesc, 1, self.active);
    }

    public final String component1() {
        return this.streamId;
    }

    public final boolean component2() {
        return this.active;
    }

    public final ActiveSinksChangeEvent copy(String streamId, boolean z10) {
        q.g(streamId, "streamId");
        return new ActiveSinksChangeEvent(streamId, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveSinksChangeEvent)) {
            return false;
        }
        ActiveSinksChangeEvent activeSinksChangeEvent = (ActiveSinksChangeEvent) obj;
        return q.b(this.streamId, activeSinksChangeEvent.streamId) && this.active == activeSinksChangeEvent.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public int hashCode() {
        int hashCode = this.streamId.hashCode() * 31;
        boolean z10 = this.active;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return hashCode + i10;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.streamId;
        boolean z10 = this.active;
        return "ActiveSinksChangeEvent(streamId=" + str + ", active=" + z10 + ")";
    }

    public ActiveSinksChangeEvent(String streamId, boolean z10) {
        q.g(streamId, "streamId");
        this.streamId = streamId;
        this.active = z10;
    }
}
