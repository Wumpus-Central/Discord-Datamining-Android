package com.discord.chat.bridge.contentnode;

import cj.n1;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "", "seen1", "", "action", "", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "getMessageChannelId-o4g7jtM", "()J", "J", "component1", "component2", "component2-o4g7jtM", "copy", "copy-mJqaSGE", "(Ljava/lang/String;J)Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class PinsOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final long messageChannelId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/PinsOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PinsOnClick> serializer() {
            return PinsOnClick$$serializer.INSTANCE;
        }
    }

    private PinsOnClick(int i10, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, PinsOnClick$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.messageChannelId = channelId.m626unboximpl();
    }

    public  PinsOnClick(int i10, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, channelId, serializationConstructorMarker);
    }

    public  PinsOnClick(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    
    public static  PinsOnClick m86copymJqaSGE$default(PinsOnClick pinsOnClick, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pinsOnClick.action;
        }
        if ((i10 & 2) != 0) {
            j10 = pinsOnClick.messageChannelId;
        }
        return pinsOnClick.m88copymJqaSGE(str, j10);
    }

    public static final void write$Self(PinsOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.action);
        output.i(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m617boximpl(self.messageChannelId));
    }

    public final String component1() {
        return this.action;
    }

    
    public final long m87component2o4g7jtM() {
        return this.messageChannelId;
    }

    
    public final PinsOnClick m88copymJqaSGE(String action, long j10) {
        q.h(action, "action");
        return new PinsOnClick(action, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinsOnClick)) {
            return false;
        }
        PinsOnClick pinsOnClick = (PinsOnClick) obj;
        return q.c(this.action, pinsOnClick.action) && ChannelId.m621equalsimpl0(this.messageChannelId, pinsOnClick.messageChannelId);
    }

    public final String getAction() {
        return this.action;
    }

    
    public final long m89getMessageChannelIdo4g7jtM() {
        return this.messageChannelId;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + ChannelId.m622hashCodeimpl(this.messageChannelId);
    }

    public String toString() {
        String str = this.action;
        String str2 = ChannelId.m624toStringimpl(this.messageChannelId);
        return "PinsOnClick(action=" + str + ", messageChannelId=" + str2 + ")";
    }

    private PinsOnClick(String str, long j10) {
        this.action = str;
        this.messageChannelId = j10;
    }
}
