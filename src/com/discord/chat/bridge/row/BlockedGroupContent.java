package com.discord.chat.bridge.row;

import bj.C3681n1;
import com.discord.chat.bridge.MessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m15073d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupContent;", "", "seen1", "", "message", "Lcom/discord/chat/bridge/MessageBase;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/MessageBase;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/MessageBase;)V", "getMessage$annotations", "()V", "getMessage", "()Lcom/discord/chat/bridge/MessageBase;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class BlockedGroupContent {
    public static final Companion Companion = new Companion(null);
    private final MessageBase message;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/BlockedGroupContent;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlockedGroupContent> serializer() {
            return BlockedGroupContent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BlockedGroupContent(int i, @AbstractC14435f(with = MessageSerializer.class) MessageBase messageBase, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C3681n1.m33818b(i, 1, BlockedGroupContent$$serializer.INSTANCE.getDescriptor());
        }
        this.message = messageBase;
    }

    public static /* synthetic */ BlockedGroupContent copy$default(BlockedGroupContent blockedGroupContent, MessageBase messageBase, int i, Object obj) {
        if ((i & 1) != 0) {
            messageBase = blockedGroupContent.message;
        }
        return blockedGroupContent.copy(messageBase);
    }

    @AbstractC14435f(with = MessageSerializer.class)
    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final void write$Self(BlockedGroupContent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13870t(serialDesc, 0, MessageSerializer.INSTANCE, self.message);
    }

    public final MessageBase component1() {
        return this.message;
    }

    public final BlockedGroupContent copy(MessageBase message) {
        C9971q.m14633g(message, "message");
        return new BlockedGroupContent(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockedGroupContent) && C9971q.m14638b(this.message, ((BlockedGroupContent) obj).message);
    }

    public final MessageBase getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        MessageBase messageBase = this.message;
        return "BlockedGroupContent(message=" + messageBase + ")";
    }

    public BlockedGroupContent(MessageBase message) {
        C9971q.m14633g(message, "message");
        this.message = message;
    }
}
