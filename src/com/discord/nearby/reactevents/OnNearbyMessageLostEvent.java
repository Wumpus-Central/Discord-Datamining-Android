package com.discord.nearby.reactevents;

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
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m15073d2 = {"Lcom/discord/nearby/reactevents/OnNearbyMessageLostEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "body", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "nearby_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class OnNearbyMessageLostEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String body;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/nearby/reactevents/OnNearbyMessageLostEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/nearby/reactevents/OnNearbyMessageLostEvent;", "nearby_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnNearbyMessageLostEvent> serializer() {
            return OnNearbyMessageLostEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnNearbyMessageLostEvent(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2560n1.m33818b(i, 1, OnNearbyMessageLostEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.body = str;
    }

    public static /* synthetic */ OnNearbyMessageLostEvent copy$default(OnNearbyMessageLostEvent onNearbyMessageLostEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onNearbyMessageLostEvent.body;
        }
        return onNearbyMessageLostEvent.copy(str);
    }

    public static final void write$Self(OnNearbyMessageLostEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.body);
    }

    public final String component1() {
        return this.body;
    }

    public final OnNearbyMessageLostEvent copy(String body) {
        C9677q.m14633g(body, "body");
        return new OnNearbyMessageLostEvent(body);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnNearbyMessageLostEvent) && C9677q.m14638b(this.body, ((OnNearbyMessageLostEvent) obj).body);
    }

    public final String getBody() {
        return this.body;
    }

    public int hashCode() {
        return this.body.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.body;
        return "OnNearbyMessageLostEvent(body=" + str + ")";
    }

    public OnNearbyMessageLostEvent(String body) {
        C9677q.m14633g(body, "body");
        this.body = body;
    }
}
