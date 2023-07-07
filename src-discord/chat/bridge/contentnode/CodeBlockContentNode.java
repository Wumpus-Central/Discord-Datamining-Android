package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B5\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "lang", "", "content", "inQuote", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getInQuote", "()Z", "getLang", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodeBlockContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final boolean inQuote;
    private final String lang;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CodeBlockContentNode> serializer() {
            return CodeBlockContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CodeBlockContentNode(int i10, String str, String str2, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, CodeBlockContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.lang = str;
        this.content = str2;
        this.inQuote = z10;
    }

    public static /* synthetic */ CodeBlockContentNode copy$default(CodeBlockContentNode codeBlockContentNode, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = codeBlockContentNode.lang;
        }
        if ((i10 & 2) != 0) {
            str2 = codeBlockContentNode.content;
        }
        if ((i10 & 4) != 0) {
            z10 = codeBlockContentNode.inQuote;
        }
        return codeBlockContentNode.copy(str, str2, z10);
    }

    public static final void write$Self(CodeBlockContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.t(serialDesc, 0, self.lang);
        output.t(serialDesc, 1, self.content);
        output.s(serialDesc, 2, self.inQuote);
    }

    public final String component1() {
        return this.lang;
    }

    public final String component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.inQuote;
    }

    public final CodeBlockContentNode copy(String lang, String content, boolean z10) {
        q.g(lang, "lang");
        q.g(content, "content");
        return new CodeBlockContentNode(lang, content, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeBlockContentNode)) {
            return false;
        }
        CodeBlockContentNode codeBlockContentNode = (CodeBlockContentNode) obj;
        return q.b(this.lang, codeBlockContentNode.lang) && q.b(this.content, codeBlockContentNode.content) && this.inQuote == codeBlockContentNode.inQuote;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getInQuote() {
        return this.inQuote;
    }

    public final String getLang() {
        return this.lang;
    }

    public int hashCode() {
        int hashCode = ((this.lang.hashCode() * 31) + this.content.hashCode()) * 31;
        boolean z10 = this.inQuote;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return hashCode + i10;
    }

    public String toString() {
        String str = this.lang;
        String str2 = this.content;
        boolean z10 = this.inQuote;
        return "CodeBlockContentNode(lang=" + str + ", content=" + str2 + ", inQuote=" + z10 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeBlockContentNode(String lang, String content, boolean z10) {
        super(null);
        q.g(lang, "lang");
        q.g(content, "content");
        this.lang = lang;
        this.content = content;
        this.inQuote = z10;
    }
}
