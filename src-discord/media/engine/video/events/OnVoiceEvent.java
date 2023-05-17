package com.discord.media.engine.video.events;

import bj.n1;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/discord/media/engine/video/events/OnVoiceEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "level", "", "speaking", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(FI)V", "getLevel", "()F", "getSpeaking", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnVoiceEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final float level;
    private final int speaking;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/OnVoiceEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/OnVoiceEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnVoiceEvent> serializer() {
            return OnVoiceEvent$$serializer.INSTANCE;
        }
    }

    public OnVoiceEvent(float f10, int i10) {
        this.level = f10;
        this.speaking = i10;
    }

    public static /* synthetic */ OnVoiceEvent copy$default(OnVoiceEvent onVoiceEvent, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = onVoiceEvent.level;
        }
        if ((i11 & 2) != 0) {
            i10 = onVoiceEvent.speaking;
        }
        return onVoiceEvent.copy(f10, i10);
    }

    public static final void write$Self(OnVoiceEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.s(serialDesc, 0, self.level);
        output.x(serialDesc, 1, self.speaking);
    }

    public final float component1() {
        return this.level;
    }

    public final int component2() {
        return this.speaking;
    }

    public final OnVoiceEvent copy(float f10, int i10) {
        return new OnVoiceEvent(f10, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnVoiceEvent)) {
            return false;
        }
        OnVoiceEvent onVoiceEvent = (OnVoiceEvent) obj;
        return Float.compare(this.level, onVoiceEvent.level) == 0 && this.speaking == onVoiceEvent.speaking;
    }

    public final float getLevel() {
        return this.level;
    }

    public final int getSpeaking() {
        return this.speaking;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.level) * 31) + this.speaking;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        float f10 = this.level;
        int i10 = this.speaking;
        return "OnVoiceEvent(level=" + f10 + ", speaking=" + i10 + ")";
    }

    public /* synthetic */ OnVoiceEvent(int i10, float f10, int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, OnVoiceEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.level = f10;
        this.speaking = i11;
    }
}
