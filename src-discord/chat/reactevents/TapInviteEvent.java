package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.h;
import wi.n1;

@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006*"}, d2 = {"Lcom/discord/chat/reactevents/TapInviteEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "", "index", "primary", "", "secondary", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "getIndex", "()I", "getMessageId", "()Ljava/lang/String;", "getPrimary", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSecondary", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/chat/reactevents/TapInviteEvent;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TapInviteEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int index;
    private final String messageId;
    private final Boolean primary;
    private final Boolean secondary;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/TapInviteEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapInviteEvent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapInviteEvent> serializer() {
            return TapInviteEvent$$serializer.INSTANCE;
        }
    }

    public  TapInviteEvent(int i10, String str, int i11, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, TapInviteEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.index = i11;
        this.primary = bool;
        this.secondary = bool2;
    }

    public static  TapInviteEvent copy$default(TapInviteEvent tapInviteEvent, String str, int i10, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tapInviteEvent.messageId;
        }
        if ((i11 & 2) != 0) {
            i10 = tapInviteEvent.index;
        }
        if ((i11 & 4) != 0) {
            bool = tapInviteEvent.primary;
        }
        if ((i11 & 8) != 0) {
            bool2 = tapInviteEvent.secondary;
        }
        return tapInviteEvent.copy(str, i10, bool, bool2);
    }

    public static final void write$Self(TapInviteEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.messageId);
        output.v(serialDesc, 1, self.index);
        h hVar = h.f29797a;
        output.B(serialDesc, 2, hVar, self.primary);
        output.B(serialDesc, 3, hVar, self.secondary);
    }

    public final String component1() {
        return this.messageId;
    }

    public final int component2() {
        return this.index;
    }

    public final Boolean component3() {
        return this.primary;
    }

    public final Boolean component4() {
        return this.secondary;
    }

    public final TapInviteEvent copy(String messageId, int i10, Boolean bool, Boolean bool2) {
        q.h(messageId, "messageId");
        return new TapInviteEvent(messageId, i10, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapInviteEvent)) {
            return false;
        }
        TapInviteEvent tapInviteEvent = (TapInviteEvent) obj;
        return q.c(this.messageId, tapInviteEvent.messageId) && this.index == tapInviteEvent.index && q.c(this.primary, tapInviteEvent.primary) && q.c(this.secondary, tapInviteEvent.secondary);
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final Boolean getPrimary() {
        return this.primary;
    }

    public final Boolean getSecondary() {
        return this.secondary;
    }

    public int hashCode() {
        int hashCode = ((this.messageId.hashCode() * 31) + this.index) * 31;
        Boolean bool = this.primary;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.secondary;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.messageId;
        int i10 = this.index;
        Boolean bool = this.primary;
        Boolean bool2 = this.secondary;
        return "TapInviteEvent(messageId=" + str + ", index=" + i10 + ", primary=" + bool + ", secondary=" + bool2 + ")";
    }

    public TapInviteEvent(String messageId, int i10, Boolean bool, Boolean bool2) {
        q.h(messageId, "messageId");
        this.messageId = messageId;
        this.index = i10;
        this.primary = bool;
        this.secondary = bool2;
    }
}
