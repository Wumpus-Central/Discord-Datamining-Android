package com.discord.chat.bridge.contentnode;

import bj.n1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/discord/chat/bridge/contentnode/HeadingContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "level", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;)V", "getContent", "()Ljava/util/List;", "getLevel", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeadingContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final List<ContentNode> content;
    private final int level;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/HeadingContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/HeadingContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeadingContentNode> serializer() {
            return HeadingContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeadingContentNode(int i10, int i11, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, HeadingContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.level = i11;
        this.content = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeadingContentNode copy$default(HeadingContentNode headingContentNode, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = headingContentNode.level;
        }
        if ((i11 & 2) != 0) {
            list = headingContentNode.content;
        }
        return headingContentNode.copy(i10, list);
    }

    public static final void write$Self(HeadingContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.level);
        output.t(serialDesc, 1, new bj.f(ContentNodeSerializer.INSTANCE), self.content);
    }

    public final int component1() {
        return this.level;
    }

    public final List<ContentNode> component2() {
        return this.content;
    }

    public final HeadingContentNode copy(int i10, List<? extends ContentNode> content) {
        q.g(content, "content");
        return new HeadingContentNode(i10, content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeadingContentNode)) {
            return false;
        }
        HeadingContentNode headingContentNode = (HeadingContentNode) obj;
        return this.level == headingContentNode.level && q.b(this.content, headingContentNode.content);
    }

    public final List<ContentNode> getContent() {
        return this.content;
    }

    public final int getLevel() {
        return this.level;
    }

    public int hashCode() {
        return (this.level * 31) + this.content.hashCode();
    }

    public String toString() {
        int i10 = this.level;
        List<ContentNode> list = this.content;
        return "HeadingContentNode(level=" + i10 + ", content=" + list + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeadingContentNode(int i10, List<? extends ContentNode> content) {
        super(null);
        q.g(content, "content");
        this.level = i10;
        this.content = content;
    }
}
