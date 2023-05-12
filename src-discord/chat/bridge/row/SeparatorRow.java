package com.discord.chat.bridge.row;

import bj.h;
import bj.n1;
import com.discord.chat.bridge.ChangeType;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u00062"}, d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "index", "text", "", "id", ViewProps.COLOR, "scrollTo", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)V", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getColor", "()I", "getId", "()Ljava/lang/String;", "getIndex", "getScrollTo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)Lcom/discord/chat/bridge/row/SeparatorRow;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SeparatorRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final ChangeType changeType;
    private final int color;

    /* renamed from: id  reason: collision with root package name */
    private final String f7204id;
    private final int index;
    private final Boolean scrollTo;
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SeparatorRow> serializer() {
            return SeparatorRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SeparatorRow(int i10, ChangeType changeType, int i11, String str, String str2, int i12, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, SeparatorRow$$serializer.INSTANCE.getDescriptor());
        }
        this.changeType = changeType;
        this.index = i11;
        this.text = str;
        this.f7204id = str2;
        this.color = i12;
        if ((i10 & 32) == 0) {
            this.scrollTo = null;
        } else {
            this.scrollTo = bool;
        }
    }

    public static /* synthetic */ SeparatorRow copy$default(SeparatorRow separatorRow, ChangeType changeType, int i10, String str, String str2, int i11, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            changeType = separatorRow.getChangeType();
        }
        if ((i12 & 2) != 0) {
            i10 = separatorRow.getIndex();
        }
        if ((i12 & 4) != 0) {
            str = separatorRow.text;
        }
        if ((i12 & 8) != 0) {
            str2 = separatorRow.f7204id;
        }
        if ((i12 & 16) != 0) {
            i11 = separatorRow.color;
        }
        if ((i12 & 32) != 0) {
            bool = separatorRow.scrollTo;
        }
        return separatorRow.copy(changeType, i10, str, str2, i11, bool);
    }

    public static final void write$Self(SeparatorRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = false;
        output.t(serialDesc, 0, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.x(serialDesc, 1, self.getIndex());
        output.z(serialDesc, 2, self.text);
        output.z(serialDesc, 3, self.f7204id);
        output.x(serialDesc, 4, self.color);
        if (output.A(serialDesc, 5) || self.scrollTo != null) {
            z10 = true;
        }
        if (z10) {
            output.p(serialDesc, 5, h.f5959a, self.scrollTo);
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
        return this.f7204id;
    }

    public final int component5() {
        return this.color;
    }

    public final Boolean component6() {
        return this.scrollTo;
    }

    public final SeparatorRow copy(ChangeType changeType, int i10, String text, String id2, int i11, Boolean bool) {
        q.g(changeType, "changeType");
        q.g(text, "text");
        q.g(id2, "id");
        return new SeparatorRow(changeType, i10, text, id2, i11, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeparatorRow)) {
            return false;
        }
        SeparatorRow separatorRow = (SeparatorRow) obj;
        return getChangeType() == separatorRow.getChangeType() && getIndex() == separatorRow.getIndex() && q.b(this.text, separatorRow.text) && q.b(this.f7204id, separatorRow.f7204id) && this.color == separatorRow.color && q.b(this.scrollTo, separatorRow.scrollTo);
    }

    @Override // com.discord.chat.bridge.row.Row
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getId() {
        return this.f7204id;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public final Boolean getScrollTo() {
        return this.scrollTo;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((((((((getChangeType().hashCode() * 31) + getIndex()) * 31) + this.text.hashCode()) * 31) + this.f7204id.hashCode()) * 31) + this.color) * 31;
        Boolean bool = this.scrollTo;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        ChangeType changeType = getChangeType();
        int index = getIndex();
        String str = this.text;
        String str2 = this.f7204id;
        int i10 = this.color;
        Boolean bool = this.scrollTo;
        return "SeparatorRow(changeType=" + changeType + ", index=" + index + ", text=" + str + ", id=" + str2 + ", color=" + i10 + ", scrollTo=" + bool + ")";
    }

    public /* synthetic */ SeparatorRow(ChangeType changeType, int i10, String str, String str2, int i11, Boolean bool, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(changeType, i10, str, str2, i11, (i12 & 32) != 0 ? null : bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorRow(ChangeType changeType, int i10, String text, String id2, int i11, Boolean bool) {
        super(null);
        q.g(changeType, "changeType");
        q.g(text, "text");
        q.g(id2, "id");
        this.changeType = changeType;
        this.index = i10;
        this.text = text;
        this.f7204id = id2;
        this.color = i11;
        this.scrollTo = bool;
    }
}
