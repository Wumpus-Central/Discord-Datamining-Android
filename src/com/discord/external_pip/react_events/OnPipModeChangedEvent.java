package com.discord.external_pip.react_events;

import bj.C2560n1;
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
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "isInPipMode", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "external_pip_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class OnPipModeChangedEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean isInPipMode;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/external_pip/react_events/OnPipModeChangedEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;", "external_pip_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnPipModeChangedEvent> serializer() {
            return OnPipModeChangedEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnPipModeChangedEvent(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2560n1.m33818b(i, 1, OnPipModeChangedEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.isInPipMode = z;
    }

    public static /* synthetic */ OnPipModeChangedEvent copy$default(OnPipModeChangedEvent onPipModeChangedEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onPipModeChangedEvent.isInPipMode;
        }
        return onPipModeChangedEvent.copy(z);
    }

    public static final void write$Self(OnPipModeChangedEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13865y(serialDesc, 0, self.isInPipMode);
    }

    public final boolean component1() {
        return this.isInPipMode;
    }

    public final OnPipModeChangedEvent copy(boolean z) {
        return new OnPipModeChangedEvent(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPipModeChangedEvent) && this.isInPipMode == ((OnPipModeChangedEvent) obj).isInPipMode;
    }

    public int hashCode() {
        boolean z = this.isInPipMode;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isInPipMode() {
        return this.isInPipMode;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        boolean z = this.isInPipMode;
        return "OnPipModeChangedEvent(isInPipMode=" + z + ")";
    }

    public OnPipModeChangedEvent(boolean z) {
        this.isInPipMode = z;
    }
}
