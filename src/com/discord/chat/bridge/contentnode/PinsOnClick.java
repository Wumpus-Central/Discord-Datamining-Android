package com.discord.chat.bridge.contentnode;

import bj.C2560n1;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "", "seen1", "", "action", "", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "getMessageChannelId-o4g7jtM", "()J", "J", "component1", "component2", "component2-o4g7jtM", "copy", "copy-mJqaSGE", "(Ljava/lang/String;J)Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class PinsOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final long messageChannelId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/PinsOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PinsOnClick> serializer() {
            return PinsOnClick$$serializer.INSTANCE;
        }
    }

    private PinsOnClick(int i, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, PinsOnClick$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.messageChannelId = channelId.m42098unboximpl();
    }

    public /* synthetic */ PinsOnClick(int i, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, serializationConstructorMarker);
    }

    public /* synthetic */ PinsOnClick(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    /* renamed from: copy-mJqaSGE$default  reason: not valid java name */
    public static /* synthetic */ PinsOnClick m41641copymJqaSGE$default(PinsOnClick pinsOnClick, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinsOnClick.action;
        }
        if ((i & 2) != 0) {
            j = pinsOnClick.messageChannelId;
        }
        return pinsOnClick.m41643copymJqaSGE(str, j);
    }

    public static final void write$Self(PinsOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.action);
        output.mo13870t(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42089boximpl(self.messageChannelId));
    }

    public final String component1() {
        return this.action;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41642component2o4g7jtM() {
        return this.messageChannelId;
    }

    /* renamed from: copy-mJqaSGE  reason: not valid java name */
    public final PinsOnClick m41643copymJqaSGE(String action, long j) {
        C9677q.m14633g(action, "action");
        return new PinsOnClick(action, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinsOnClick)) {
            return false;
        }
        PinsOnClick pinsOnClick = (PinsOnClick) obj;
        return C9677q.m14638b(this.action, pinsOnClick.action) && ChannelId.m42093equalsimpl0(this.messageChannelId, pinsOnClick.messageChannelId);
    }

    public final String getAction() {
        return this.action;
    }

    /* renamed from: getMessageChannelId-o4g7jtM  reason: not valid java name */
    public final long m41644getMessageChannelIdo4g7jtM() {
        return this.messageChannelId;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + ChannelId.m42094hashCodeimpl(this.messageChannelId);
    }

    public String toString() {
        String str = this.action;
        String str2 = ChannelId.m42096toStringimpl(this.messageChannelId);
        return "PinsOnClick(action=" + str + ", messageChannelId=" + str2 + ")";
    }

    private PinsOnClick(String str, long j) {
        this.action = str;
        this.messageChannelId = j;
    }
}
