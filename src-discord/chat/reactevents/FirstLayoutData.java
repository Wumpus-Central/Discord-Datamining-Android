package com.discord.chat.reactevents;

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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/discord/chat/reactevents/FirstLayoutData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "firstVisibleMessageIndex", "lastVisibleMessageIndex", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(II)V", "getFirstVisibleMessageIndex", "()I", "getLastVisibleMessageIndex", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class FirstLayoutData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int firstVisibleMessageIndex;
    private final int lastVisibleMessageIndex;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/FirstLayoutData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/FirstLayoutData;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FirstLayoutData> serializer() {
            return FirstLayoutData$$serializer.INSTANCE;
        }
    }

    public FirstLayoutData(int i10, int i11) {
        this.firstVisibleMessageIndex = i10;
        this.lastVisibleMessageIndex = i11;
    }

    public static  FirstLayoutData copy$default(FirstLayoutData firstLayoutData, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = firstLayoutData.firstVisibleMessageIndex;
        }
        if ((i12 & 2) != 0) {
            i11 = firstLayoutData.lastVisibleMessageIndex;
        }
        return firstLayoutData.copy(i10, i11);
    }

    public static final void write$Self(FirstLayoutData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.w(serialDesc, 0, self.firstVisibleMessageIndex);
        output.w(serialDesc, 1, self.lastVisibleMessageIndex);
    }

    public final int component1() {
        return this.firstVisibleMessageIndex;
    }

    public final int component2() {
        return this.lastVisibleMessageIndex;
    }

    public final FirstLayoutData copy(int i10, int i11) {
        return new FirstLayoutData(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirstLayoutData)) {
            return false;
        }
        FirstLayoutData firstLayoutData = (FirstLayoutData) obj;
        return this.firstVisibleMessageIndex == firstLayoutData.firstVisibleMessageIndex && this.lastVisibleMessageIndex == firstLayoutData.lastVisibleMessageIndex;
    }

    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    public int hashCode() {
        return (this.firstVisibleMessageIndex * 31) + this.lastVisibleMessageIndex;
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i10 = this.firstVisibleMessageIndex;
        int i11 = this.lastVisibleMessageIndex;
        return "FirstLayoutData(firstVisibleMessageIndex=" + i10 + ", lastVisibleMessageIndex=" + i11 + ")";
    }

    public  FirstLayoutData(int i10, int i11, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, FirstLayoutData$$serializer.INSTANCE.getDescriptor());
        }
        this.firstVisibleMessageIndex = i11;
        this.lastVisibleMessageIndex = i12;
    }
}
