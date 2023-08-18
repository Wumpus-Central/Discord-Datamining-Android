package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;

@f
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=Bo\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Jk\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001J!\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;HÇ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006>"}, d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "index", "changeType", "Lcom/discord/chat/bridge/ChangeType;", ViewProps.COLOR, ViewProps.BORDER_COLOR, ViewProps.BACKGROUND_COLOR, "text", "", "revealed", "", "button", "Lcom/discord/chat/bridge/row/BlockedGroupButton;", "content", "", "Lcom/discord/chat/bridge/row/BlockedGroupContent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;)V", "getBackgroundColor", "()I", "getBorderColor", "getButton", "()Lcom/discord/chat/bridge/row/BlockedGroupButton;", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getColor", "getContent", "()Ljava/util/List;", "getIndex", "getRevealed", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlockedGroupRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final int backgroundColor;
    private final int borderColor;
    private final BlockedGroupButton button;
    private final ChangeType changeType;
    private final int color;
    private final List<BlockedGroupContent> content;
    private final int index;
    private final boolean revealed;
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/BlockedGroupRow;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlockedGroupRow> serializer() {
            return BlockedGroupRow$$serializer.INSTANCE;
        }
    }

    
    public  BlockedGroupRow(int i10, int i11, ChangeType changeType, int i12, int i13, int i14, String str, boolean z10, BlockedGroupButton blockedGroupButton, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (255 != (i10 & 255)) {
            n1.b(i10, 255, BlockedGroupRow$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i11;
        this.changeType = changeType;
        this.color = i12;
        this.borderColor = i13;
        this.backgroundColor = i14;
        this.text = str;
        this.revealed = z10;
        this.button = blockedGroupButton;
        if ((i10 & 256) == 0) {
            this.content = null;
        } else {
            this.content = list;
        }
    }

    public static final void write$Self(BlockedGroupRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z10 = false;
        output.v(serialDesc, 0, self.getIndex());
        output.o(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.v(serialDesc, 2, self.color);
        output.v(serialDesc, 3, self.borderColor);
        output.v(serialDesc, 4, self.backgroundColor);
        output.x(serialDesc, 5, self.text);
        output.w(serialDesc, 6, self.revealed);
        output.o(serialDesc, 7, BlockedGroupButton$$serializer.INSTANCE, self.button);
        if (output.z(serialDesc, 8) || self.content != null) {
            z10 = true;
        }
        if (z10) {
            output.B(serialDesc, 8, new wi.f(BlockedGroupContent$$serializer.INSTANCE), self.content);
        }
    }

    public final int component1() {
        return getIndex();
    }

    public final ChangeType component2() {
        return getChangeType();
    }

    public final int component3() {
        return this.color;
    }

    public final int component4() {
        return this.borderColor;
    }

    public final int component5() {
        return this.backgroundColor;
    }

    public final String component6() {
        return this.text;
    }

    public final boolean component7() {
        return this.revealed;
    }

    public final BlockedGroupButton component8() {
        return this.button;
    }

    public final List<BlockedGroupContent> component9() {
        return this.content;
    }

    public final BlockedGroupRow copy(int i10, ChangeType changeType, int i11, int i12, int i13, String text, boolean z10, BlockedGroupButton button, List<BlockedGroupContent> list) {
        q.h(changeType, "changeType");
        q.h(text, "text");
        q.h(button, "button");
        return new BlockedGroupRow(i10, changeType, i11, i12, i13, text, z10, button, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockedGroupRow)) {
            return false;
        }
        BlockedGroupRow blockedGroupRow = (BlockedGroupRow) obj;
        return getIndex() == blockedGroupRow.getIndex() && getChangeType() == blockedGroupRow.getChangeType() && this.color == blockedGroupRow.color && this.borderColor == blockedGroupRow.borderColor && this.backgroundColor == blockedGroupRow.backgroundColor && q.c(this.text, blockedGroupRow.text) && this.revealed == blockedGroupRow.revealed && q.c(this.button, blockedGroupRow.button) && q.c(this.content, blockedGroupRow.content);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final BlockedGroupButton getButton() {
        return this.button;
    }

    @Override 
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final int getColor() {
        return this.color;
    }

    public final List<BlockedGroupContent> getContent() {
        return this.content;
    }

    @Override 
    public int getIndex() {
        return this.index;
    }

    public final boolean getRevealed() {
        return this.revealed;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int index = ((((((((((getIndex() * 31) + getChangeType().hashCode()) * 31) + this.color) * 31) + this.borderColor) * 31) + this.backgroundColor) * 31) + this.text.hashCode()) * 31;
        boolean z10 = this.revealed;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int hashCode = (((index + i10) * 31) + this.button.hashCode()) * 31;
        List<BlockedGroupContent> list = this.content;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        int index = getIndex();
        ChangeType changeType = getChangeType();
        int i10 = this.color;
        int i11 = this.borderColor;
        int i12 = this.backgroundColor;
        String str = this.text;
        boolean z10 = this.revealed;
        BlockedGroupButton blockedGroupButton = this.button;
        List<BlockedGroupContent> list = this.content;
        return "BlockedGroupRow(index=" + index + ", changeType=" + changeType + ", color=" + i10 + ", borderColor=" + i11 + ", backgroundColor=" + i12 + ", text=" + str + ", revealed=" + z10 + ", button=" + blockedGroupButton + ", content=" + list + ")";
    }

    public  BlockedGroupRow(int i10, ChangeType changeType, int i11, int i12, int i13, String str, boolean z10, BlockedGroupButton blockedGroupButton, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, changeType, i11, i12, i13, str, z10, blockedGroupButton, (i14 & 256) != 0 ? null : list);
    }

    
    public BlockedGroupRow(int i10, ChangeType changeType, int i11, int i12, int i13, String text, boolean z10, BlockedGroupButton button, List<BlockedGroupContent> list) {
        super(null);
        q.h(changeType, "changeType");
        q.h(text, "text");
        q.h(button, "button");
        this.index = i10;
        this.changeType = changeType;
        this.color = i11;
        this.borderColor = i12;
        this.backgroundColor = i13;
        this.text = text;
        this.revealed = z10;
        this.button = button;
        this.content = list;
    }
}
