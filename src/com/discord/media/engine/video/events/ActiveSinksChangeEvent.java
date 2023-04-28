package com.discord.media.engine.video.events;

import bj.C3681n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m15073d2 = {"Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "streamId", "", AppStateModule.APP_STATE_ACTIVE, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Z)V", "getActive", "()Z", "getStreamId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ActiveSinksChangeEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean active;
    private final String streamId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent;", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
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

    public /* synthetic */ ActiveSinksChangeEvent(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C3681n1.m33818b(i, 3, ActiveSinksChangeEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.streamId = str;
        this.active = z;
    }

    public static /* synthetic */ ActiveSinksChangeEvent copy$default(ActiveSinksChangeEvent activeSinksChangeEvent, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeSinksChangeEvent.streamId;
        }
        if ((i & 2) != 0) {
            z = activeSinksChangeEvent.active;
        }
        return activeSinksChangeEvent.copy(str, z);
    }

    public static final void write$Self(ActiveSinksChangeEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.streamId);
        output.mo13865y(serialDesc, 1, self.active);
    }

    public final String component1() {
        return this.streamId;
    }

    public final boolean component2() {
        return this.active;
    }

    public final ActiveSinksChangeEvent copy(String streamId, boolean z) {
        C9971q.m14633g(streamId, "streamId");
        return new ActiveSinksChangeEvent(streamId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveSinksChangeEvent)) {
            return false;
        }
        ActiveSinksChangeEvent activeSinksChangeEvent = (ActiveSinksChangeEvent) obj;
        return C9971q.m14638b(this.streamId, activeSinksChangeEvent.streamId) && this.active == activeSinksChangeEvent.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public int hashCode() {
        int hashCode = this.streamId.hashCode() * 31;
        boolean z = this.active;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.streamId;
        boolean z = this.active;
        return "ActiveSinksChangeEvent(streamId=" + str + ", active=" + z + ")";
    }

    public ActiveSinksChangeEvent(String streamId, boolean z) {
        C9971q.m14633g(streamId, "streamId");
        this.streamId = streamId;
        this.active = z;
    }
}
