package com.discord.chat.bridge.roleicons;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/roleicons/RoleIcon;", "", "seen1", "", "source", "", "unicodeEmoji", ZeroconfModule.KEY_SERVICE_NAME, "size", "alt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getName", "getSize", "()I", "getSource", "getUnicodeEmoji", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class RoleIcon {
    public static final Companion Companion = new Companion(null);
    private final String alt;
    private final String name;
    private final int size;
    private final String source;
    private final String unicodeEmoji;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/roleicons/RoleIcon$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/roleicons/RoleIcon;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RoleIcon> serializer() {
            return RoleIcon$$serializer.INSTANCE;
        }
    }

    public  RoleIcon(int i10, String str, String str2, String str3, int i11, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (28 != (i10 & 28)) {
            n1.b(i10, 28, RoleIcon$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
        if ((i10 & 2) == 0) {
            this.unicodeEmoji = null;
        } else {
            this.unicodeEmoji = str2;
        }
        this.name = str3;
        this.size = i11;
        this.alt = str4;
    }

    public static  RoleIcon copy$default(RoleIcon roleIcon, String str, String str2, String str3, int i10, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = roleIcon.source;
        }
        if ((i11 & 2) != 0) {
            str2 = roleIcon.unicodeEmoji;
        }
        if ((i11 & 4) != 0) {
            str3 = roleIcon.name;
        }
        if ((i11 & 8) != 0) {
            i10 = roleIcon.size;
        }
        if ((i11 & 16) != 0) {
            str4 = roleIcon.alt;
        }
        return roleIcon.copy(str, str2, str3, i10, str4);
    }

    public static final void write$Self(RoleIcon self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z11 = false;
        if (!output.z(serialDesc, 0) && self.source == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 0, a2.f30568a, self.source);
        }
        if (output.z(serialDesc, 1) || self.unicodeEmoji != null) {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 1, a2.f30568a, self.unicodeEmoji);
        }
        output.y(serialDesc, 2, self.name);
        output.w(serialDesc, 3, self.size);
        output.y(serialDesc, 4, self.alt);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.unicodeEmoji;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.size;
    }

    public final String component5() {
        return this.alt;
    }

    public final RoleIcon copy(String str, String str2, String name, int i10, String alt) {
        q.h(name, "name");
        q.h(alt, "alt");
        return new RoleIcon(str, str2, name, i10, alt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoleIcon)) {
            return false;
        }
        RoleIcon roleIcon = (RoleIcon) obj;
        return q.c(this.source, roleIcon.source) && q.c(this.unicodeEmoji, roleIcon.unicodeEmoji) && q.c(this.name, roleIcon.name) && this.size == roleIcon.size && q.c(this.alt, roleIcon.alt);
    }

    public final String getAlt() {
        return this.alt;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSize() {
        return this.size;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getUnicodeEmoji() {
        return this.unicodeEmoji;
    }

    public int hashCode() {
        String str = this.source;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.unicodeEmoji;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((((hashCode + i10) * 31) + this.name.hashCode()) * 31) + this.size) * 31) + this.alt.hashCode();
    }

    public String toString() {
        String str = this.source;
        String str2 = this.unicodeEmoji;
        String str3 = this.name;
        int i10 = this.size;
        String str4 = this.alt;
        return "RoleIcon(source=" + str + ", unicodeEmoji=" + str2 + ", name=" + str3 + ", size=" + i10 + ", alt=" + str4 + ")";
    }

    public RoleIcon(String str, String str2, String name, int i10, String alt) {
        q.h(name, "name");
        q.h(alt, "alt");
        this.source = str;
        this.unicodeEmoji = str2;
        this.name = name;
        this.size = i10;
        this.alt = alt;
    }

    public  RoleIcon(String str, String str2, String str3, int i10, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3, i10, str4);
    }
}
