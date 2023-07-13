package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.n1;

@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/bridge/contentnode/TextContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TextContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final String content;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/TextContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/TextContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TextContentNode> serializer() {
            return TextContentNode$$serializer.INSTANCE;
        }
    }

    public TextContentNode() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    
    public  TextContentNode(int i10, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, TextContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
    }

    public static  TextContentNode copy$default(TextContentNode textContentNode, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = textContentNode.content;
        }
        return textContentNode.copy(str);
    }

    public static final void write$Self(TextContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = true;
        if (!output.w(serialDesc, 0) && self.content == null) {
            z10 = false;
        }
        if (z10) {
            output.z(serialDesc, 0, a2.f26230a, self.content);
        }
    }

    public final String component1() {
        return this.content;
    }

    public final TextContentNode copy(String str) {
        return new TextContentNode(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextContentNode) && q.b(this.content, ((TextContentNode) obj).content);
    }

    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        String str = this.content;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.content;
        return "TextContentNode(content=" + str + ")";
    }

    public TextContentNode(String str) {
        super(null);
        this.content = str;
    }

    public  TextContentNode(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
