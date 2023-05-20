package com.discord.external_pip.react_events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import uj.f;
import xj.n1;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "isInPipMode", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "external_pip_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes5.dex */
public final class OnPipModeChangedEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean isInPipMode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/external_pip/react_events/OnPipModeChangedEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;", "external_pip_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
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

    public /* synthetic */ OnPipModeChangedEvent(int i10, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, OnPipModeChangedEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.isInPipMode = z10;
    }

    public static /* synthetic */ OnPipModeChangedEvent copy$default(OnPipModeChangedEvent onPipModeChangedEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = onPipModeChangedEvent.isInPipMode;
        }
        return onPipModeChangedEvent.copy(z10);
    }

    public static final void write$Self(OnPipModeChangedEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.isInPipMode);
    }

    public final boolean component1() {
        return this.isInPipMode;
    }

    public final OnPipModeChangedEvent copy(boolean z10) {
        return new OnPipModeChangedEvent(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPipModeChangedEvent) && this.isInPipMode == ((OnPipModeChangedEvent) obj).isInPipMode;
    }

    public int hashCode() {
        boolean z10 = this.isInPipMode;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final boolean isInPipMode() {
        return this.isInPipMode;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        boolean z10 = this.isInPipMode;
        return "OnPipModeChangedEvent(isInPipMode=" + z10 + ")";
    }

    public OnPipModeChangedEvent(boolean z10) {
        this.isInPipMode = z10;
    }
}
