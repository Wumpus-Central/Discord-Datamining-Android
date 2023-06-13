package com.discord.chat.input.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J!\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÇ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u00063"}, d2 = {"Lcom/discord/chat/input/bridge/ChatInputNode;", "", "seen1", "", "type", "location", "length", "style", "Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "deleteNodeOnBackspace", "", "tapAction", "Lcom/discord/chat/input/bridge/TapAction;", "editDisabled", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)V", "getDeleteNodeOnBackspace", "()Z", "getEditDisabled", "getLength", "()I", "getLocation", "getStyle", "()Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "getTapAction", "()Lcom/discord/chat/input/bridge/TapAction;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatInputNode {
    public static final Companion Companion = new Companion(null);
    private final boolean deleteNodeOnBackspace;
    private final boolean editDisabled;
    private final int length;
    private final int location;
    private final ChatInputNodeStyle style;
    private final TapAction tapAction;
    private final int type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/input/bridge/ChatInputNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/bridge/ChatInputNode;", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatInputNode> serializer() {
            return ChatInputNode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatInputNode(int i10, int i11, int i12, int i13, ChatInputNodeStyle chatInputNodeStyle, boolean z10, TapAction tapAction, boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, ChatInputNode$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i11;
        this.location = i12;
        this.length = i13;
        if ((i10 & 8) == 0) {
            this.style = null;
        } else {
            this.style = chatInputNodeStyle;
        }
        if ((i10 & 16) == 0) {
            this.deleteNodeOnBackspace = false;
        } else {
            this.deleteNodeOnBackspace = z10;
        }
        if ((i10 & 32) == 0) {
            this.tapAction = null;
        } else {
            this.tapAction = tapAction;
        }
        if ((i10 & 64) == 0) {
            this.editDisabled = false;
        } else {
            this.editDisabled = z11;
        }
    }

    public static /* synthetic */ ChatInputNode copy$default(ChatInputNode chatInputNode, int i10, int i11, int i12, ChatInputNodeStyle chatInputNodeStyle, boolean z10, TapAction tapAction, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = chatInputNode.type;
        }
        if ((i13 & 2) != 0) {
            i11 = chatInputNode.location;
        }
        if ((i13 & 4) != 0) {
            i12 = chatInputNode.length;
        }
        if ((i13 & 8) != 0) {
            chatInputNodeStyle = chatInputNode.style;
        }
        if ((i13 & 16) != 0) {
            z10 = chatInputNode.deleteNodeOnBackspace;
        }
        if ((i13 & 32) != 0) {
            tapAction = chatInputNode.tapAction;
        }
        if ((i13 & 64) != 0) {
            z11 = chatInputNode.editDisabled;
        }
        return chatInputNode.copy(i10, i11, i12, chatInputNodeStyle, z10, tapAction, z11);
    }

    public static final void write$Self(ChatInputNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z13 = false;
        output.x(serialDesc, 0, self.type);
        output.x(serialDesc, 1, self.location);
        output.x(serialDesc, 2, self.length);
        if (!output.A(serialDesc, 3) && self.style == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.u(serialDesc, 3, ChatInputNodeStyle$$serializer.INSTANCE, self.style);
        }
        if (!output.A(serialDesc, 4) && !self.deleteNodeOnBackspace) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.y(serialDesc, 4, self.deleteNodeOnBackspace);
        }
        if (!output.A(serialDesc, 5) && self.tapAction == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.u(serialDesc, 5, TapAction$$serializer.INSTANCE, self.tapAction);
        }
        if (output.A(serialDesc, 6) || self.editDisabled) {
            z13 = true;
        }
        if (z13) {
            output.y(serialDesc, 6, self.editDisabled);
        }
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.location;
    }

    public final int component3() {
        return this.length;
    }

    public final ChatInputNodeStyle component4() {
        return this.style;
    }

    public final boolean component5() {
        return this.deleteNodeOnBackspace;
    }

    public final TapAction component6() {
        return this.tapAction;
    }

    public final boolean component7() {
        return this.editDisabled;
    }

    public final ChatInputNode copy(int i10, int i11, int i12, ChatInputNodeStyle chatInputNodeStyle, boolean z10, TapAction tapAction, boolean z11) {
        return new ChatInputNode(i10, i11, i12, chatInputNodeStyle, z10, tapAction, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatInputNode)) {
            return false;
        }
        ChatInputNode chatInputNode = (ChatInputNode) obj;
        return this.type == chatInputNode.type && this.location == chatInputNode.location && this.length == chatInputNode.length && q.b(this.style, chatInputNode.style) && this.deleteNodeOnBackspace == chatInputNode.deleteNodeOnBackspace && q.b(this.tapAction, chatInputNode.tapAction) && this.editDisabled == chatInputNode.editDisabled;
    }

    public final boolean getDeleteNodeOnBackspace() {
        return this.deleteNodeOnBackspace;
    }

    public final boolean getEditDisabled() {
        return this.editDisabled;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLocation() {
        return this.location;
    }

    public final ChatInputNodeStyle getStyle() {
        return this.style;
    }

    public final TapAction getTapAction() {
        return this.tapAction;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = ((((this.type * 31) + this.location) * 31) + this.length) * 31;
        ChatInputNodeStyle chatInputNodeStyle = this.style;
        int i11 = 0;
        int hashCode = (i10 + (chatInputNodeStyle == null ? 0 : chatInputNodeStyle.hashCode())) * 31;
        boolean z10 = this.deleteNodeOnBackspace;
        int i12 = 1;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        int i16 = (hashCode + i13) * 31;
        TapAction tapAction = this.tapAction;
        if (tapAction != null) {
            i11 = tapAction.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        boolean z11 = this.editDisabled;
        if (!z11) {
            i12 = z11 ? 1 : 0;
        }
        return i17 + i12;
    }

    public String toString() {
        int i10 = this.type;
        int i11 = this.location;
        int i12 = this.length;
        ChatInputNodeStyle chatInputNodeStyle = this.style;
        boolean z10 = this.deleteNodeOnBackspace;
        TapAction tapAction = this.tapAction;
        boolean z11 = this.editDisabled;
        return "ChatInputNode(type=" + i10 + ", location=" + i11 + ", length=" + i12 + ", style=" + chatInputNodeStyle + ", deleteNodeOnBackspace=" + z10 + ", tapAction=" + tapAction + ", editDisabled=" + z11 + ")";
    }

    public ChatInputNode(int i10, int i11, int i12, ChatInputNodeStyle chatInputNodeStyle, boolean z10, TapAction tapAction, boolean z11) {
        this.type = i10;
        this.location = i11;
        this.length = i12;
        this.style = chatInputNodeStyle;
        this.deleteNodeOnBackspace = z10;
        this.tapAction = tapAction;
        this.editDisabled = z11;
    }

    public /* synthetic */ ChatInputNode(int i10, int i11, int i12, ChatInputNodeStyle chatInputNodeStyle, boolean z10, TapAction tapAction, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, (i13 & 8) != 0 ? null : chatInputNodeStyle, (i13 & 16) != 0 ? false : z10, (i13 & 32) != 0 ? null : tapAction, (i13 & 64) != 0 ? false : z11);
    }
}
