package com.discord.chat.bridge.automod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.a2;
import xi.n1;

@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "", "seen1", "", "header", "", "severity", "startTime", "body", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeader", "getSeverity", "getStartTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AutoModerationNotification {
    public static final Companion Companion = new Companion(null);
    private final String body;
    private final String header;
    private final String severity;
    private final String startTime;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationNotification$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoModerationNotification> serializer() {
            return AutoModerationNotification$$serializer.INSTANCE;
        }
    }

    public  AutoModerationNotification(int i10, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, AutoModerationNotification$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        if ((i10 & 2) == 0) {
            this.severity = null;
        } else {
            this.severity = str2;
        }
        if ((i10 & 4) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str3;
        }
        if ((i10 & 8) == 0) {
            this.body = null;
        } else {
            this.body = str4;
        }
    }

    public static  AutoModerationNotification copy$default(AutoModerationNotification autoModerationNotification, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = autoModerationNotification.header;
        }
        if ((i10 & 2) != 0) {
            str2 = autoModerationNotification.severity;
        }
        if ((i10 & 4) != 0) {
            str3 = autoModerationNotification.startTime;
        }
        if ((i10 & 8) != 0) {
            str4 = autoModerationNotification.body;
        }
        return autoModerationNotification.copy(str, str2, str3, str4);
    }

    public static final void write$Self(AutoModerationNotification self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z12 = false;
        output.y(serialDesc, 0, self.header);
        if (!output.z(serialDesc, 1) && self.severity == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 1, a2.f30574a, self.severity);
        }
        if (!output.z(serialDesc, 2) && self.startTime == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 2, a2.f30574a, self.startTime);
        }
        if (output.z(serialDesc, 3) || self.body != null) {
            z12 = true;
        }
        if (z12) {
            output.e(serialDesc, 3, a2.f30574a, self.body);
        }
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.severity;
    }

    public final String component3() {
        return this.startTime;
    }

    public final String component4() {
        return this.body;
    }

    public final AutoModerationNotification copy(String header, String str, String str2, String str3) {
        q.h(header, "header");
        return new AutoModerationNotification(header, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoModerationNotification)) {
            return false;
        }
        AutoModerationNotification autoModerationNotification = (AutoModerationNotification) obj;
        return q.c(this.header, autoModerationNotification.header) && q.c(this.severity, autoModerationNotification.severity) && q.c(this.startTime, autoModerationNotification.startTime) && q.c(this.body, autoModerationNotification.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSeverity() {
        return this.severity;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        String str = this.severity;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.body;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.header;
        String str2 = this.severity;
        String str3 = this.startTime;
        String str4 = this.body;
        return "AutoModerationNotification(header=" + str + ", severity=" + str2 + ", startTime=" + str3 + ", body=" + str4 + ")";
    }

    public AutoModerationNotification(String header, String str, String str2, String str3) {
        q.h(header, "header");
        this.header = header;
        this.severity = str;
        this.startTime = str2;
        this.body = str3;
    }

    public  AutoModerationNotification(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
