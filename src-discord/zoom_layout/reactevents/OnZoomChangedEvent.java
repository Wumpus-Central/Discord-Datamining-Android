package com.discord.zoom_layout.reactevents;

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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/discord/zoom_layout/reactevents/OnZoomChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "zoomScale", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(F)V", "getZoomScale", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OnZoomChangedEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final float zoomScale;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/zoom_layout/reactevents/OnZoomChangedEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/zoom_layout/reactevents/OnZoomChangedEvent;", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnZoomChangedEvent> serializer() {
            return OnZoomChangedEvent$$serializer.INSTANCE;
        }
    }

    public OnZoomChangedEvent(float f10) {
        this.zoomScale = f10;
    }

    public static  OnZoomChangedEvent copy$default(OnZoomChangedEvent onZoomChangedEvent, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = onZoomChangedEvent.zoomScale;
        }
        return onZoomChangedEvent.copy(f10);
    }

    public static final void write$Self(OnZoomChangedEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.s(serialDesc, 0, self.zoomScale);
    }

    public final float component1() {
        return this.zoomScale;
    }

    public final OnZoomChangedEvent copy(float f10) {
        return new OnZoomChangedEvent(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnZoomChangedEvent) && Float.compare(this.zoomScale, ((OnZoomChangedEvent) obj).zoomScale) == 0;
    }

    public final float getZoomScale() {
        return this.zoomScale;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.zoomScale);
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        float f10 = this.zoomScale;
        return "OnZoomChangedEvent(zoomScale=" + f10 + ")";
    }

    public  OnZoomChangedEvent(int i10, float f10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, OnZoomChangedEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.zoomScale = f10;
    }
}
