package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import java.util.List;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223Bc\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003JU\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lcom/discord/chat/bridge/row/EmbeddedActivityRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "index", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "content", "", "avatarUrls", "", "buttonText", "embeddedActivityKey", "dismissButtonAccessibilityLabel", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrls", "()Ljava/util/List;", "getButtonText", "()Ljava/lang/String;", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getContent", "getDismissButtonAccessibilityLabel", "getEmbeddedActivityKey", "getIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmbeddedActivityRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final List<String> avatarUrls;
    private final String buttonText;
    private final ChangeType changeType;
    private final String content;
    private final String dismissButtonAccessibilityLabel;
    private final String embeddedActivityKey;
    private final int index;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/EmbeddedActivityRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/EmbeddedActivityRow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmbeddedActivityRow> serializer() {
            return EmbeddedActivityRow$$serializer.INSTANCE;
        }
    }

    
    public  EmbeddedActivityRow(int i10, int i11, ChangeType changeType, String str, List list, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (127 != (i10 & 127)) {
            n1.b(i10, 127, EmbeddedActivityRow$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i11;
        this.changeType = changeType;
        this.content = str;
        this.avatarUrls = list;
        this.buttonText = str2;
        this.embeddedActivityKey = str3;
        this.dismissButtonAccessibilityLabel = str4;
    }

    
    public static  EmbeddedActivityRow copy$default(EmbeddedActivityRow embeddedActivityRow, int i10, ChangeType changeType, String str, List list, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = embeddedActivityRow.getIndex();
        }
        if ((i11 & 2) != 0) {
            changeType = embeddedActivityRow.getChangeType();
        }
        if ((i11 & 4) != 0) {
            str = embeddedActivityRow.content;
        }
        if ((i11 & 8) != 0) {
            list = embeddedActivityRow.avatarUrls;
        }
        if ((i11 & 16) != 0) {
            str2 = embeddedActivityRow.buttonText;
        }
        if ((i11 & 32) != 0) {
            str3 = embeddedActivityRow.embeddedActivityKey;
        }
        if ((i11 & 64) != 0) {
            str4 = embeddedActivityRow.dismissButtonAccessibilityLabel;
        }
        return embeddedActivityRow.copy(i10, changeType, str, list, str2, str3, str4);
    }

    public static final void write$Self(EmbeddedActivityRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, self.getIndex());
        output.n(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.s(serialDesc, 2, self.content);
        output.n(serialDesc, 3, new si.f(a2.f26231a), self.avatarUrls);
        output.s(serialDesc, 4, self.buttonText);
        output.s(serialDesc, 5, self.embeddedActivityKey);
        output.s(serialDesc, 6, self.dismissButtonAccessibilityLabel);
    }

    public final int component1() {
        return getIndex();
    }

    public final ChangeType component2() {
        return getChangeType();
    }

    public final String component3() {
        return this.content;
    }

    public final List<String> component4() {
        return this.avatarUrls;
    }

    public final String component5() {
        return this.buttonText;
    }

    public final String component6() {
        return this.embeddedActivityKey;
    }

    public final String component7() {
        return this.dismissButtonAccessibilityLabel;
    }

    public final EmbeddedActivityRow copy(int i10, ChangeType changeType, String content, List<String> avatarUrls, String buttonText, String embeddedActivityKey, String dismissButtonAccessibilityLabel) {
        q.g(changeType, "changeType");
        q.g(content, "content");
        q.g(avatarUrls, "avatarUrls");
        q.g(buttonText, "buttonText");
        q.g(embeddedActivityKey, "embeddedActivityKey");
        q.g(dismissButtonAccessibilityLabel, "dismissButtonAccessibilityLabel");
        return new EmbeddedActivityRow(i10, changeType, content, avatarUrls, buttonText, embeddedActivityKey, dismissButtonAccessibilityLabel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedActivityRow)) {
            return false;
        }
        EmbeddedActivityRow embeddedActivityRow = (EmbeddedActivityRow) obj;
        return getIndex() == embeddedActivityRow.getIndex() && getChangeType() == embeddedActivityRow.getChangeType() && q.b(this.content, embeddedActivityRow.content) && q.b(this.avatarUrls, embeddedActivityRow.avatarUrls) && q.b(this.buttonText, embeddedActivityRow.buttonText) && q.b(this.embeddedActivityKey, embeddedActivityRow.embeddedActivityKey) && q.b(this.dismissButtonAccessibilityLabel, embeddedActivityRow.dismissButtonAccessibilityLabel);
    }

    public final List<String> getAvatarUrls() {
        return this.avatarUrls;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    @Override 
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDismissButtonAccessibilityLabel() {
        return this.dismissButtonAccessibilityLabel;
    }

    public final String getEmbeddedActivityKey() {
        return this.embeddedActivityKey;
    }

    @Override 
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (((((((((((getIndex() * 31) + getChangeType().hashCode()) * 31) + this.content.hashCode()) * 31) + this.avatarUrls.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.embeddedActivityKey.hashCode()) * 31) + this.dismissButtonAccessibilityLabel.hashCode();
    }

    public String toString() {
        int index = getIndex();
        ChangeType changeType = getChangeType();
        String str = this.content;
        List<String> list = this.avatarUrls;
        String str2 = this.buttonText;
        String str3 = this.embeddedActivityKey;
        String str4 = this.dismissButtonAccessibilityLabel;
        return "EmbeddedActivityRow(index=" + index + ", changeType=" + changeType + ", content=" + str + ", avatarUrls=" + list + ", buttonText=" + str2 + ", embeddedActivityKey=" + str3 + ", dismissButtonAccessibilityLabel=" + str4 + ")";
    }

    
    public EmbeddedActivityRow(int i10, ChangeType changeType, String content, List<String> avatarUrls, String buttonText, String embeddedActivityKey, String dismissButtonAccessibilityLabel) {
        super(null);
        q.g(changeType, "changeType");
        q.g(content, "content");
        q.g(avatarUrls, "avatarUrls");
        q.g(buttonText, "buttonText");
        q.g(embeddedActivityKey, "embeddedActivityKey");
        q.g(dismissButtonAccessibilityLabel, "dismissButtonAccessibilityLabel");
        this.index = i10;
        this.changeType = changeType;
        this.content = content;
        this.avatarUrls = avatarUrls;
        this.buttonText = buttonText;
        this.embeddedActivityKey = embeddedActivityKey;
        this.dismissButtonAccessibilityLabel = dismissButtonAccessibilityLabel;
    }
}
