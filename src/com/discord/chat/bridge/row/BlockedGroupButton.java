package com.discord.chat.bridge.row;

import bj.C2560n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m15073d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupButton;", "", "seen1", "", "action", "Lcom/discord/chat/bridge/row/BlockedGroupButtonAction;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/row/BlockedGroupButtonAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/row/BlockedGroupButtonAction;)V", "getAction", "()Lcom/discord/chat/bridge/row/BlockedGroupButtonAction;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class BlockedGroupButton {
    public static final Companion Companion = new Companion(null);
    private final BlockedGroupButtonAction action;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupButton$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/BlockedGroupButton;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlockedGroupButton> serializer() {
            return BlockedGroupButton$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BlockedGroupButton(int i, BlockedGroupButtonAction blockedGroupButtonAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2560n1.m33818b(i, 1, BlockedGroupButton$$serializer.INSTANCE.getDescriptor());
        }
        this.action = blockedGroupButtonAction;
    }

    public static /* synthetic */ BlockedGroupButton copy$default(BlockedGroupButton blockedGroupButton, BlockedGroupButtonAction blockedGroupButtonAction, int i, Object obj) {
        if ((i & 1) != 0) {
            blockedGroupButtonAction = blockedGroupButton.action;
        }
        return blockedGroupButton.copy(blockedGroupButtonAction);
    }

    public static final void write$Self(BlockedGroupButton self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13870t(serialDesc, 0, BlockedGroupButtonAction$$serializer.INSTANCE, self.action);
    }

    public final BlockedGroupButtonAction component1() {
        return this.action;
    }

    public final BlockedGroupButton copy(BlockedGroupButtonAction action) {
        C9677q.m14633g(action, "action");
        return new BlockedGroupButton(action);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockedGroupButton) && C9677q.m14638b(this.action, ((BlockedGroupButton) obj).action);
    }

    public final BlockedGroupButtonAction getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        BlockedGroupButtonAction blockedGroupButtonAction = this.action;
        return "BlockedGroupButton(action=" + blockedGroupButtonAction + ")";
    }

    public BlockedGroupButton(BlockedGroupButtonAction action) {
        C9677q.m14633g(action, "action");
        this.action = action;
    }
}
