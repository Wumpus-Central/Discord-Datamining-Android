package com.discord.chat.reactevents;

import bj.C2500a2;
import bj.C2560n1;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nf.C10853x;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006%"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapChannelData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "guildId", "", "channelId", "messageId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getGuildId", "getMessageId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapChannelData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String guildId;
    private final String messageId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapChannelData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapChannelData;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapChannelData> serializer() {
            return TapChannelData$$serializer.INSTANCE;
        }
    }

    public TapChannelData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TapChannelData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C2560n1.m33818b(i, 0, TapChannelData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.guildId = null;
        } else {
            this.guildId = str;
        }
        if ((i & 2) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
        }
        if ((i & 4) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str3;
        }
    }

    public static /* synthetic */ TapChannelData copy$default(TapChannelData tapChannelData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapChannelData.guildId;
        }
        if ((i & 2) != 0) {
            str2 = tapChannelData.channelId;
        }
        if ((i & 4) != 0) {
            str3 = tapChannelData.messageId;
        }
        return tapChannelData.copy(str, str2, str3);
    }

    public static final void write$Self(TapChannelData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z3 = false;
        if (!output.mo13893A(serialDesc, 0) && self.guildId == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 0, C2500a2.f6719a, self.guildId);
        }
        if (!output.mo13893A(serialDesc, 1) && self.channelId == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 1, C2500a2.f6719a, self.channelId);
        }
        if (output.mo13893A(serialDesc, 2) || self.messageId != null) {
            z3 = true;
        }
        if (z3) {
            output.mo13874p(serialDesc, 2, C2500a2.f6719a, self.messageId);
        }
    }

    public final String component1() {
        return this.guildId;
    }

    public final String component2() {
        return this.channelId;
    }

    public final String component3() {
        return this.messageId;
    }

    public final TapChannelData copy(String str, String str2, String str3) {
        return new TapChannelData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapChannelData)) {
            return false;
        }
        TapChannelData tapChannelData = (TapChannelData) obj;
        return C9677q.m14638b(this.guildId, tapChannelData.guildId) && C9677q.m14638b(this.channelId, tapChannelData.channelId) && C9677q.m14638b(this.messageId, tapChannelData.messageId);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getGuildId() {
        return this.guildId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        String str = this.guildId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C10853x.m10921a("data", NativeMapExtensionsKt.nativeMapOf(C10853x.m10921a("guildId", this.guildId), C10853x.m10921a("channelId", this.channelId), C10853x.m10921a("messageId", this.messageId))));
    }

    public String toString() {
        String str = this.guildId;
        String str2 = this.channelId;
        String str3 = this.messageId;
        return "TapChannelData(guildId=" + str + ", channelId=" + str2 + ", messageId=" + str3 + ")";
    }

    public TapChannelData(String str, String str2, String str3) {
        this.guildId = str;
        this.channelId = str2;
        this.messageId = str3;
    }

    public /* synthetic */ TapChannelData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
