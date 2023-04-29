package com.discord.billing.react.events;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/discord/billing/react/events/BillingManagerConnectionStateUpdated;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "connectionState", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(I)V", "getConnectionState", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BillingManagerConnectionStateUpdated implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int connectionState;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/react/events/BillingManagerConnectionStateUpdated$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/billing/react/events/BillingManagerConnectionStateUpdated;", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BillingManagerConnectionStateUpdated> serializer() {
            return BillingManagerConnectionStateUpdated$$serializer.INSTANCE;
        }
    }

    public BillingManagerConnectionStateUpdated(int i10) {
        this.connectionState = i10;
    }

    public static /* synthetic */ BillingManagerConnectionStateUpdated copy$default(BillingManagerConnectionStateUpdated billingManagerConnectionStateUpdated, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = billingManagerConnectionStateUpdated.connectionState;
        }
        return billingManagerConnectionStateUpdated.copy(i10);
    }

    public static final void write$Self(BillingManagerConnectionStateUpdated self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.connectionState);
    }

    public final int component1() {
        return this.connectionState;
    }

    public final BillingManagerConnectionStateUpdated copy(int i10) {
        return new BillingManagerConnectionStateUpdated(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillingManagerConnectionStateUpdated) && this.connectionState == ((BillingManagerConnectionStateUpdated) obj).connectionState;
    }

    public final int getConnectionState() {
        return this.connectionState;
    }

    public int hashCode() {
        return this.connectionState;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.connectionState;
        return "BillingManagerConnectionStateUpdated(connectionState=" + i10 + ")";
    }

    public /* synthetic */ BillingManagerConnectionStateUpdated(int i10, int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, BillingManagerConnectionStateUpdated$$serializer.INSTANCE.getDescriptor());
        }
        this.connectionState = i11;
    }
}