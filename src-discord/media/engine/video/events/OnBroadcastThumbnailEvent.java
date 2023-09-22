package com.discord.media.engine.video.events;

import cj.n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/discord/media/engine/video/events/OnBroadcastThumbnailEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "imgdata", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getImgdata", "()Ljava/lang/String;", "setImgdata", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class OnBroadcastThumbnailEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private String imgdata;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/OnBroadcastThumbnailEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/OnBroadcastThumbnailEvent;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnBroadcastThumbnailEvent> serializer() {
            return OnBroadcastThumbnailEvent$$serializer.INSTANCE;
        }
    }

    public  OnBroadcastThumbnailEvent(int i10, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, OnBroadcastThumbnailEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.imgdata = str;
    }

    public static  OnBroadcastThumbnailEvent copy$default(OnBroadcastThumbnailEvent onBroadcastThumbnailEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = onBroadcastThumbnailEvent.imgdata;
        }
        return onBroadcastThumbnailEvent.copy(str);
    }

    public static final void write$Self(OnBroadcastThumbnailEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.imgdata);
    }

    public final String component1() {
        return this.imgdata;
    }

    public final OnBroadcastThumbnailEvent copy(String imgdata) {
        q.h(imgdata, "imgdata");
        return new OnBroadcastThumbnailEvent(imgdata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnBroadcastThumbnailEvent) && q.c(this.imgdata, ((OnBroadcastThumbnailEvent) obj).imgdata);
    }

    public final String getImgdata() {
        return this.imgdata;
    }

    public int hashCode() {
        return this.imgdata.hashCode();
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public final void setImgdata(String str) {
        q.h(str, "<set-?>");
        this.imgdata = str;
    }

    public String toString() {
        String str = this.imgdata;
        return "OnBroadcastThumbnailEvent(imgdata=" + str + ")";
    }

    public OnBroadcastThumbnailEvent(String imgdata) {
        q.h(imgdata, "imgdata");
        this.imgdata = imgdata;
    }
}
