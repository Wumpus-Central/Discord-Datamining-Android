package com.discord.chat.bridge.row;

import bj.n1;
import com.discord.chat.bridge.ChangeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/row/LoadingRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "index", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "button", "Lcom/discord/chat/bridge/row/LoadMoreButton;", "isLoading", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Lcom/discord/chat/bridge/row/LoadMoreButton;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/discord/chat/bridge/ChangeType;Lcom/discord/chat/bridge/row/LoadMoreButton;Z)V", "getButton", "()Lcom/discord/chat/bridge/row/LoadMoreButton;", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getIndex", "()I", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoadingRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final LoadMoreButton button;
    private final ChangeType changeType;
    private final int index;
    private final boolean isLoading;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/LoadingRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/LoadingRow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoadingRow> serializer() {
            return LoadingRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingRow(int i10, int i11, ChangeType changeType, LoadMoreButton loadMoreButton, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, LoadingRow$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i11;
        this.changeType = changeType;
        this.button = loadMoreButton;
        this.isLoading = z10;
    }

    public static /* synthetic */ LoadingRow copy$default(LoadingRow loadingRow, int i10, ChangeType changeType, LoadMoreButton loadMoreButton, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = loadingRow.getIndex();
        }
        if ((i11 & 2) != 0) {
            changeType = loadingRow.getChangeType();
        }
        if ((i11 & 4) != 0) {
            loadMoreButton = loadingRow.button;
        }
        if ((i11 & 8) != 0) {
            z10 = loadingRow.isLoading;
        }
        return loadingRow.copy(i10, changeType, loadMoreButton, z10);
    }

    public static final void write$Self(LoadingRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.getIndex());
        output.t(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.t(serialDesc, 2, LoadMoreButton$$serializer.INSTANCE, self.button);
        output.y(serialDesc, 3, self.isLoading);
    }

    public final int component1() {
        return getIndex();
    }

    public final ChangeType component2() {
        return getChangeType();
    }

    public final LoadMoreButton component3() {
        return this.button;
    }

    public final boolean component4() {
        return this.isLoading;
    }

    public final LoadingRow copy(int i10, ChangeType changeType, LoadMoreButton button, boolean z10) {
        q.g(changeType, "changeType");
        q.g(button, "button");
        return new LoadingRow(i10, changeType, button, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingRow)) {
            return false;
        }
        LoadingRow loadingRow = (LoadingRow) obj;
        return getIndex() == loadingRow.getIndex() && getChangeType() == loadingRow.getChangeType() && q.b(this.button, loadingRow.button) && this.isLoading == loadingRow.isLoading;
    }

    public final LoadMoreButton getButton() {
        return this.button;
    }

    @Override // com.discord.chat.bridge.row.Row
    public ChangeType getChangeType() {
        return this.changeType;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int index = ((((getIndex() * 31) + getChangeType().hashCode()) * 31) + this.button.hashCode()) * 31;
        boolean z10 = this.isLoading;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return index + i10;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        int index = getIndex();
        ChangeType changeType = getChangeType();
        LoadMoreButton loadMoreButton = this.button;
        boolean z10 = this.isLoading;
        return "LoadingRow(index=" + index + ", changeType=" + changeType + ", button=" + loadMoreButton + ", isLoading=" + z10 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingRow(int i10, ChangeType changeType, LoadMoreButton button, boolean z10) {
        super(null);
        q.g(changeType, "changeType");
        q.g(button, "button");
        this.index = i10;
        this.changeType = changeType;
        this.button = button;
        this.isLoading = z10;
    }
}
