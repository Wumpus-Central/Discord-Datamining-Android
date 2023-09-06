package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.spoiler.SpoilerableData;
import java.util.List;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002 !B3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\fJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "content", "", "spoilerOrNull", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getSpoilerOrNull", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SpoilerContentNode extends ContentNode implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final List<ContentNode> content;
    private final String spoilerOrNull;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/SpoilerContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpoilerContentNode> serializer() {
            return SpoilerContentNode$$serializer.INSTANCE;
        }
    }

    
    public  SpoilerContentNode(int i10, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, SpoilerContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.content = list;
        if ((i10 & 2) == 0) {
            this.spoilerOrNull = "";
        } else {
            this.spoilerOrNull = str;
        }
    }

    
    public static  SpoilerContentNode copy$default(SpoilerContentNode spoilerContentNode, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = spoilerContentNode.content;
        }
        return spoilerContentNode.copy(list);
    }

    public static final void write$Self(SpoilerContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z10 = false;
        output.h(serialDesc, 0, new xi.f(ContentNodeSerializer.INSTANCE), self.content);
        if (output.z(serialDesc, 1) || !q.c(self.getSpoilerOrNull(), "")) {
            z10 = true;
        }
        if (z10) {
            output.y(serialDesc, 1, self.getSpoilerOrNull());
        }
    }

    public final List<ContentNode> component1() {
        return this.content;
    }

    public final SpoilerContentNode copy(List<? extends ContentNode> content) {
        q.h(content, "content");
        return new SpoilerContentNode(content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpoilerContentNode) && q.c(this.content, ((SpoilerContentNode) obj).content);
    }

    public final List<ContentNode> getContent() {
        return this.content;
    }

    @Override 
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        List<ContentNode> list = this.content;
        return "SpoilerContentNode(content=" + list + ")";
    }

    
    
    public SpoilerContentNode(List<? extends ContentNode> content) {
        super(null);
        q.h(content, "content");
        this.content = content;
        this.spoilerOrNull = "";
    }
}
