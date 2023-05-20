package com.discord.chat.bridge.interaction;

import com.discord.chat.bridge.interaction.InteractionStatusViewState;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import uj.f;
import xj.n1;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/discord/chat/bridge/interaction/InteractionStatus;", "", "seen1", "", "state", "Lcom/discord/chat/bridge/interaction/InteractionStatusViewState;", "text", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/interaction/InteractionStatusViewState;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/interaction/InteractionStatusViewState;Lcom/discord/chat/bridge/structurabletext/StructurableText;)V", "getState", "()Lcom/discord/chat/bridge/interaction/InteractionStatusViewState;", "getText", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isFailed", "isLoading", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes5.dex */
public final class InteractionStatus {
    public static final Companion Companion = new Companion(null);
    private final InteractionStatusViewState state;
    private final StructurableText text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/interaction/InteractionStatus$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InteractionStatus> serializer() {
            return InteractionStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InteractionStatus(int i10, InteractionStatusViewState interactionStatusViewState, StructurableText structurableText, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, InteractionStatus$$serializer.INSTANCE.getDescriptor());
        }
        this.state = interactionStatusViewState;
        this.text = structurableText;
    }

    public static /* synthetic */ InteractionStatus copy$default(InteractionStatus interactionStatus, InteractionStatusViewState interactionStatusViewState, StructurableText structurableText, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interactionStatusViewState = interactionStatus.state;
        }
        if ((i10 & 2) != 0) {
            structurableText = interactionStatus.text;
        }
        return interactionStatus.copy(interactionStatusViewState, structurableText);
    }

    public static final void write$Self(InteractionStatus self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.z(serialDesc, 0, InteractionStatusViewState.Serializer.INSTANCE, self.state);
        output.z(serialDesc, 1, StructurableTextSerializer.INSTANCE, self.text);
    }

    public final InteractionStatusViewState component1() {
        return this.state;
    }

    public final StructurableText component2() {
        return this.text;
    }

    public final InteractionStatus copy(InteractionStatusViewState state, StructurableText text) {
        q.g(state, "state");
        q.g(text, "text");
        return new InteractionStatus(state, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionStatus)) {
            return false;
        }
        InteractionStatus interactionStatus = (InteractionStatus) obj;
        return this.state == interactionStatus.state && q.b(this.text, interactionStatus.text);
    }

    public final InteractionStatusViewState getState() {
        return this.state;
    }

    public final StructurableText getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.state.hashCode() * 31) + this.text.hashCode();
    }

    public final boolean isFailed() {
        return this.state == InteractionStatusViewState.FAILED;
    }

    public final boolean isLoading() {
        return this.state == InteractionStatusViewState.LOADING;
    }

    public String toString() {
        InteractionStatusViewState interactionStatusViewState = this.state;
        StructurableText structurableText = this.text;
        return "InteractionStatus(state=" + interactionStatusViewState + ", text=" + structurableText + ")";
    }

    public InteractionStatus(InteractionStatusViewState state, StructurableText text) {
        q.g(state, "state");
        q.g(text, "text");
        this.state = state;
        this.text = text;
    }
}
