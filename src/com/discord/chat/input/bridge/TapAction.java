package com.discord.chat.input.bridge;

import bj.C3681n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, m15073d2 = {"Lcom/discord/chat/input/bridge/TapAction;", "", "seen1", "", "action", "", "channelId", "optionName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getChannelId", "getOptionName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapAction {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final String channelId;
    private final String optionName;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/input/bridge/TapAction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/bridge/TapAction;", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapAction> serializer() {
            return TapAction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapAction(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C3681n1.m33818b(i, 7, TapAction$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.channelId = str2;
        this.optionName = str3;
    }

    public static /* synthetic */ TapAction copy$default(TapAction tapAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapAction.action;
        }
        if ((i & 2) != 0) {
            str2 = tapAction.channelId;
        }
        if ((i & 4) != 0) {
            str3 = tapAction.optionName;
        }
        return tapAction.copy(str, str2, str3);
    }

    public static final void write$Self(TapAction self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.action);
        output.mo13864z(serialDesc, 1, self.channelId);
        output.mo13864z(serialDesc, 2, self.optionName);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.channelId;
    }

    public final String component3() {
        return this.optionName;
    }

    public final TapAction copy(String action, String channelId, String optionName) {
        C9971q.m14633g(action, "action");
        C9971q.m14633g(channelId, "channelId");
        C9971q.m14633g(optionName, "optionName");
        return new TapAction(action, channelId, optionName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapAction)) {
            return false;
        }
        TapAction tapAction = (TapAction) obj;
        return C9971q.m14638b(this.action, tapAction.action) && C9971q.m14638b(this.channelId, tapAction.channelId) && C9971q.m14638b(this.optionName, tapAction.optionName);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getOptionName() {
        return this.optionName;
    }

    public int hashCode() {
        return (((this.action.hashCode() * 31) + this.channelId.hashCode()) * 31) + this.optionName.hashCode();
    }

    public String toString() {
        String str = this.action;
        String str2 = this.channelId;
        String str3 = this.optionName;
        return "TapAction(action=" + str + ", channelId=" + str2 + ", optionName=" + str3 + ")";
    }

    public TapAction(String action, String channelId, String optionName) {
        C9971q.m14633g(action, "action");
        C9971q.m14633g(channelId, "channelId");
        C9971q.m14633g(optionName, "optionName");
        this.action = action;
        this.channelId = channelId;
        this.optionName = optionName;
    }
}
