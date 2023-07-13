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
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/discord/media/engine/video/events/NoInputCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "input", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getInput", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class NoInputCallbackEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean input;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/NoInputCallbackEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/NoInputCallbackEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NoInputCallbackEvent> serializer() {
            return NoInputCallbackEvent$$serializer.INSTANCE;
        }
    }

    public  NoInputCallbackEvent(int i10, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, NoInputCallbackEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.input = z10;
    }

    public static  NoInputCallbackEvent copy$default(NoInputCallbackEvent noInputCallbackEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = noInputCallbackEvent.input;
        }
        return noInputCallbackEvent.copy(z10);
    }

    public static final void write$Self(NoInputCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.r(serialDesc, 0, self.input);
    }

    public final boolean component1() {
        return this.input;
    }

    public final NoInputCallbackEvent copy(boolean z10) {
        return new NoInputCallbackEvent(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NoInputCallbackEvent) && this.input == ((NoInputCallbackEvent) obj).input;
    }

    public final boolean getInput() {
        return this.input;
    }

    public int hashCode() {
        boolean z10 = this.input;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        boolean z10 = this.input;
        return "NoInputCallbackEvent(input=" + z10 + ")";
    }

    public NoInputCallbackEvent(boolean z10) {
        this.input = z10;
    }
}
