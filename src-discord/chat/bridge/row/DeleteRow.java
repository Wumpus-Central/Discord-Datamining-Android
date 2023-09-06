package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/discord/chat/bridge/row/DeleteRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "index", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/discord/chat/bridge/ChangeType;)V", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DeleteRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final ChangeType changeType;
    private final int index;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/DeleteRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/DeleteRow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeleteRow> serializer() {
            return DeleteRow$$serializer.INSTANCE;
        }
    }

    
    public  DeleteRow(int i10, int i11, ChangeType changeType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, DeleteRow$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i11;
        if ((i10 & 2) == 0) {
            this.changeType = ChangeType.DELETE;
        } else {
            this.changeType = changeType;
        }
    }

    public static  DeleteRow copy$default(DeleteRow deleteRow, int i10, ChangeType changeType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = deleteRow.getIndex();
        }
        if ((i11 & 2) != 0) {
            changeType = deleteRow.getChangeType();
        }
        return deleteRow.copy(i10, changeType);
    }

    public static final void write$Self(DeleteRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z10 = false;
        output.w(serialDesc, 0, self.getIndex());
        if (output.z(serialDesc, 1) || self.getChangeType() != ChangeType.DELETE) {
            z10 = true;
        }
        if (z10) {
            output.h(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        }
    }

    public final int component1() {
        return getIndex();
    }

    public final ChangeType component2() {
        return getChangeType();
    }

    public final DeleteRow copy(int i10, ChangeType changeType) {
        q.h(changeType, "changeType");
        return new DeleteRow(i10, changeType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteRow)) {
            return false;
        }
        DeleteRow deleteRow = (DeleteRow) obj;
        return getIndex() == deleteRow.getIndex() && getChangeType() == deleteRow.getChangeType();
    }

    @Override 
    public ChangeType getChangeType() {
        return this.changeType;
    }

    @Override 
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (getIndex() * 31) + getChangeType().hashCode();
    }

    public String toString() {
        int index = getIndex();
        ChangeType changeType = getChangeType();
        return "DeleteRow(index=" + index + ", changeType=" + changeType + ")";
    }

    public  DeleteRow(int i10, ChangeType changeType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? ChangeType.DELETE : changeType);
    }

    
    public DeleteRow(int i10, ChangeType changeType) {
        super(null);
        q.h(changeType, "changeType");
        this.index = i10;
        this.changeType = changeType;
    }
}
