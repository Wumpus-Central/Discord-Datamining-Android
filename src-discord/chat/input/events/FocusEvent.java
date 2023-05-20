package com.discord.chat.input.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import uj.f;
import xj.n1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006#"}, d2 = {"Lcom/discord/chat/input/events/FocusEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", ViewProps.START, ViewProps.END, TouchesHelper.TARGET_KEY, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(III)V", "getEnd", "()I", "getStart", "getTarget", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes5.dex */
public final class FocusEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int end;
    private final int start;
    private final int target;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/input/events/FocusEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/events/FocusEvent;", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FocusEvent> serializer() {
            return FocusEvent$$serializer.INSTANCE;
        }
    }

    public FocusEvent(int i10, int i11, int i12) {
        this.start = i10;
        this.end = i11;
        this.target = i12;
    }

    public static /* synthetic */ FocusEvent copy$default(FocusEvent focusEvent, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = focusEvent.start;
        }
        if ((i13 & 2) != 0) {
            i11 = focusEvent.end;
        }
        if ((i13 & 4) != 0) {
            i12 = focusEvent.target;
        }
        return focusEvent.copy(i10, i11, i12);
    }

    public static final void write$Self(FocusEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = false;
        output.w(serialDesc, 0, self.start);
        output.w(serialDesc, 1, self.end);
        if (output.A(serialDesc, 2) || self.target != 0) {
            z10 = true;
        }
        if (z10) {
            output.w(serialDesc, 2, self.target);
        }
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    public final int component3() {
        return this.target;
    }

    public final FocusEvent copy(int i10, int i11, int i12) {
        return new FocusEvent(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusEvent)) {
            return false;
        }
        FocusEvent focusEvent = (FocusEvent) obj;
        return this.start == focusEvent.start && this.end == focusEvent.end && this.target == focusEvent.target;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (((this.start * 31) + this.end) * 31) + this.target;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.start;
        int i11 = this.end;
        int i12 = this.target;
        return "FocusEvent(start=" + i10 + ", end=" + i11 + ", target=" + i12 + ")";
    }

    public /* synthetic */ FocusEvent(int i10, int i11, int i12, int i13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, FocusEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.start = i11;
        this.end = i12;
        if ((i10 & 4) == 0) {
            this.target = 0;
        } else {
            this.target = i13;
        }
    }

    public /* synthetic */ FocusEvent(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
