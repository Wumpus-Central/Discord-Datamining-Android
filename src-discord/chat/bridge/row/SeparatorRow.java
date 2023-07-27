package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.bridge.summaries.Summary$$serializer;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.h;
import si.n1;

@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278Be\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jd\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÇ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\r\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00069"}, d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "index", "text", "", "id", ViewProps.COLOR, "scrollTo", "", "isBeforeContent", "summary", "Lcom/discord/chat/bridge/summaries/Summary;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;)V", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getColor", "()I", "getId", "()Ljava/lang/String;", "getIndex", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScrollTo", "getSummary", "()Lcom/discord/chat/bridge/summaries/Summary;", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;)Lcom/discord/chat/bridge/row/SeparatorRow;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SeparatorRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final ChangeType changeType;
    private final int color;

    
    private final String f6887id;
    private final int index;
    private final Boolean isBeforeContent;
    private final Boolean scrollTo;
    private final Summary summary;
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SeparatorRow> serializer() {
            return SeparatorRow$$serializer.INSTANCE;
        }
    }

    
    public  SeparatorRow(int i10, ChangeType changeType, int i11, String str, String str2, int i12, Boolean bool, Boolean bool2, Summary summary, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, SeparatorRow$$serializer.INSTANCE.getDescriptor());
        }
        this.changeType = changeType;
        this.index = i11;
        this.text = str;
        this.f6887id = str2;
        this.color = i12;
        if ((i10 & 32) == 0) {
            this.scrollTo = null;
        } else {
            this.scrollTo = bool;
        }
        if ((i10 & 64) == 0) {
            this.isBeforeContent = null;
        } else {
            this.isBeforeContent = bool2;
        }
        if ((i10 & 128) == 0) {
            this.summary = null;
        } else {
            this.summary = summary;
        }
    }

    public static final void write$Self(SeparatorRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z12 = false;
        output.n(serialDesc, 0, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.q(serialDesc, 1, self.getIndex());
        output.s(serialDesc, 2, self.text);
        output.s(serialDesc, 3, self.f6887id);
        output.q(serialDesc, 4, self.color);
        if (!output.w(serialDesc, 5) && self.scrollTo == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 5, h.f26279a, self.scrollTo);
        }
        if (!output.w(serialDesc, 6) && self.isBeforeContent == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 6, h.f26279a, self.isBeforeContent);
        }
        if (output.w(serialDesc, 7) || self.summary != null) {
            z12 = true;
        }
        if (z12) {
            output.z(serialDesc, 7, Summary$$serializer.INSTANCE, self.summary);
        }
    }

    public final ChangeType component1() {
        return getChangeType();
    }

    public final int component2() {
        return getIndex();
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.f6887id;
    }

    public final int component5() {
        return this.color;
    }

    public final Boolean component6() {
        return this.scrollTo;
    }

    public final Boolean component7() {
        return this.isBeforeContent;
    }

    public final Summary component8() {
        return this.summary;
    }

    public final SeparatorRow copy(ChangeType changeType, int i10, String text, String id2, int i11, Boolean bool, Boolean bool2, Summary summary) {
        q.g(changeType, "changeType");
        q.g(text, "text");
        q.g(id2, "id");
        return new SeparatorRow(changeType, i10, text, id2, i11, bool, bool2, summary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeparatorRow)) {
            return false;
        }
        SeparatorRow separatorRow = (SeparatorRow) obj;
        return getChangeType() == separatorRow.getChangeType() && getIndex() == separatorRow.getIndex() && q.b(this.text, separatorRow.text) && q.b(this.f6887id, separatorRow.f6887id) && this.color == separatorRow.color && q.b(this.scrollTo, separatorRow.scrollTo) && q.b(this.isBeforeContent, separatorRow.isBeforeContent) && q.b(this.summary, separatorRow.summary);
    }

    @Override 
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getId() {
        return this.f6887id;
    }

    @Override 
    public int getIndex() {
        return this.index;
    }

    public final Boolean getScrollTo() {
        return this.scrollTo;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((((((((getChangeType().hashCode() * 31) + getIndex()) * 31) + this.text.hashCode()) * 31) + this.f6887id.hashCode()) * 31) + this.color) * 31;
        Boolean bool = this.scrollTo;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBeforeContent;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Summary summary = this.summary;
        if (summary != null) {
            i10 = summary.hashCode();
        }
        return hashCode3 + i10;
    }

    public final Boolean isBeforeContent() {
        return this.isBeforeContent;
    }

    public String toString() {
        ChangeType changeType = getChangeType();
        int index = getIndex();
        String str = this.text;
        String str2 = this.f6887id;
        int i10 = this.color;
        Boolean bool = this.scrollTo;
        Boolean bool2 = this.isBeforeContent;
        Summary summary = this.summary;
        return "SeparatorRow(changeType=" + changeType + ", index=" + index + ", text=" + str + ", id=" + str2 + ", color=" + i10 + ", scrollTo=" + bool + ", isBeforeContent=" + bool2 + ", summary=" + summary + ")";
    }

    public  SeparatorRow(ChangeType changeType, int i10, String str, String str2, int i11, Boolean bool, Boolean bool2, Summary summary, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(changeType, i10, str, str2, i11, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : bool2, (i12 & 128) != 0 ? null : summary);
    }

    
    public SeparatorRow(ChangeType changeType, int i10, String text, String id2, int i11, Boolean bool, Boolean bool2, Summary summary) {
        super(null);
        q.g(changeType, "changeType");
        q.g(text, "text");
        q.g(id2, "id");
        this.changeType = changeType;
        this.index = i10;
        this.text = text;
        this.f6887id = id2;
        this.color = i11;
        this.scrollTo = bool;
        this.isBeforeContent = bool2;
        this.summary = summary;
    }
}
