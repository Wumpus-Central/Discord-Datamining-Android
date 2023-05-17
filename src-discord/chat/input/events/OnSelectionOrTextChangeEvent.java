package com.discord.chat.input.events;

import bj.n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006'"}, d2 = {"Lcom/discord/chat/input/events/OnSelectionOrTextChangeEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", ViewProps.START, ViewProps.END, "text", "", "editId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IILjava/lang/String;Ljava/lang/String;)V", "getEditId", "()Ljava/lang/String;", "getEnd", "()I", "getStart", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OnSelectionOrTextChangeEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String editId;
    private final int end;
    private final int start;
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/input/events/OnSelectionOrTextChangeEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/events/OnSelectionOrTextChangeEvent;", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnSelectionOrTextChangeEvent> serializer() {
            return OnSelectionOrTextChangeEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnSelectionOrTextChangeEvent(int i10, int i11, int i12, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, OnSelectionOrTextChangeEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.start = i11;
        this.end = i12;
        this.text = str;
        this.editId = str2;
    }

    public static /* synthetic */ OnSelectionOrTextChangeEvent copy$default(OnSelectionOrTextChangeEvent onSelectionOrTextChangeEvent, int i10, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = onSelectionOrTextChangeEvent.start;
        }
        if ((i12 & 2) != 0) {
            i11 = onSelectionOrTextChangeEvent.end;
        }
        if ((i12 & 4) != 0) {
            str = onSelectionOrTextChangeEvent.text;
        }
        if ((i12 & 8) != 0) {
            str2 = onSelectionOrTextChangeEvent.editId;
        }
        return onSelectionOrTextChangeEvent.copy(i10, i11, str, str2);
    }

    public static final void write$Self(OnSelectionOrTextChangeEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.start);
        output.x(serialDesc, 1, self.end);
        output.z(serialDesc, 2, self.text);
        output.z(serialDesc, 3, self.editId);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.editId;
    }

    public final OnSelectionOrTextChangeEvent copy(int i10, int i11, String text, String editId) {
        q.g(text, "text");
        q.g(editId, "editId");
        return new OnSelectionOrTextChangeEvent(i10, i11, text, editId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSelectionOrTextChangeEvent)) {
            return false;
        }
        OnSelectionOrTextChangeEvent onSelectionOrTextChangeEvent = (OnSelectionOrTextChangeEvent) obj;
        return this.start == onSelectionOrTextChangeEvent.start && this.end == onSelectionOrTextChangeEvent.end && q.b(this.text, onSelectionOrTextChangeEvent.text) && q.b(this.editId, onSelectionOrTextChangeEvent.editId);
    }

    public final String getEditId() {
        return this.editId;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.start * 31) + this.end) * 31) + this.text.hashCode()) * 31) + this.editId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.start;
        int i11 = this.end;
        String str = this.text;
        String str2 = this.editId;
        return "OnSelectionOrTextChangeEvent(start=" + i10 + ", end=" + i11 + ", text=" + str + ", editId=" + str2 + ")";
    }

    public OnSelectionOrTextChangeEvent(int i10, int i11, String text, String editId) {
        q.g(text, "text");
        q.g(editId, "editId");
        this.start = i10;
        this.end = i11;
        this.text = text;
        this.editId = editId;
    }
}
