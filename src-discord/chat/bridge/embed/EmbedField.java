package com.discord.chat.bridge.embed;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.n1;

@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006'"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedField;", "", "seen1", "", "rawName", "", "rawValue", ZeroconfModule.KEY_SERVICE_NAME, "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "value", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/structurabletext/StructurableText;)V", "getName", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getRawName", "()Ljava/lang/String;", "getRawValue", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmbedField {
    public static final Companion Companion = new Companion(null);
    private final StructurableText name;
    private final String rawName;
    private final String rawValue;
    private final StructurableText value;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedField$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedField;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmbedField> serializer() {
            return EmbedField$$serializer.INSTANCE;
        }
    }

    public EmbedField() {
        this((String) null, (String) null, (StructurableText) null, (StructurableText) null, 15, (DefaultConstructorMarker) null);
    }

    public  EmbedField(int i10, String str, String str2, StructurableText structurableText, StructurableText structurableText2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, EmbedField$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.rawName = null;
        } else {
            this.rawName = str;
        }
        if ((i10 & 2) == 0) {
            this.rawValue = null;
        } else {
            this.rawValue = str2;
        }
        if ((i10 & 4) == 0) {
            this.name = null;
        } else {
            this.name = structurableText;
        }
        if ((i10 & 8) == 0) {
            this.value = null;
        } else {
            this.value = structurableText2;
        }
    }

    public static  EmbedField copy$default(EmbedField embedField, String str, String str2, StructurableText structurableText, StructurableText structurableText2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = embedField.rawName;
        }
        if ((i10 & 2) != 0) {
            str2 = embedField.rawValue;
        }
        if ((i10 & 4) != 0) {
            structurableText = embedField.name;
        }
        if ((i10 & 8) != 0) {
            structurableText2 = embedField.value;
        }
        return embedField.copy(str, str2, structurableText, structurableText2);
    }

    public static final void write$Self(EmbedField self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z13 = false;
        if (!output.w(serialDesc, 0) && self.rawName == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 0, a2.f26230a, self.rawName);
        }
        if (!output.w(serialDesc, 1) && self.rawValue == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 1, a2.f26230a, self.rawValue);
        }
        if (!output.w(serialDesc, 2) && self.name == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.z(serialDesc, 2, StructurableTextSerializer.INSTANCE, self.name);
        }
        if (output.w(serialDesc, 3) || self.value != null) {
            z13 = true;
        }
        if (z13) {
            output.z(serialDesc, 3, StructurableTextSerializer.INSTANCE, self.value);
        }
    }

    public final String component1() {
        return this.rawName;
    }

    public final String component2() {
        return this.rawValue;
    }

    public final StructurableText component3() {
        return this.name;
    }

    public final StructurableText component4() {
        return this.value;
    }

    public final EmbedField copy(String str, String str2, StructurableText structurableText, StructurableText structurableText2) {
        return new EmbedField(str, str2, structurableText, structurableText2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbedField)) {
            return false;
        }
        EmbedField embedField = (EmbedField) obj;
        return q.b(this.rawName, embedField.rawName) && q.b(this.rawValue, embedField.rawValue) && q.b(this.name, embedField.name) && q.b(this.value, embedField.value);
    }

    public final StructurableText getName() {
        return this.name;
    }

    public final String getRawName() {
        return this.rawName;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public final StructurableText getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.rawName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rawValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StructurableText structurableText = this.name;
        int hashCode3 = (hashCode2 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        StructurableText structurableText2 = this.value;
        if (structurableText2 != null) {
            i10 = structurableText2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.rawName;
        String str2 = this.rawValue;
        StructurableText structurableText = this.name;
        StructurableText structurableText2 = this.value;
        return "EmbedField(rawName=" + str + ", rawValue=" + str2 + ", name=" + structurableText + ", value=" + structurableText2 + ")";
    }

    public EmbedField(String str, String str2, StructurableText structurableText, StructurableText structurableText2) {
        this.rawName = str;
        this.rawValue = str2;
        this.name = structurableText;
        this.value = structurableText2;
    }

    public  EmbedField(String str, String str2, StructurableText structurableText, StructurableText structurableText2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : structurableText, (i10 & 8) != 0 ? null : structurableText2);
    }
}
