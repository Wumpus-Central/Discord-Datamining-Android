package com.discord.chat.bridge.structurabletext;

import com.discord.chat.bridge.contentnode.ContentNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import pi.f;

@f(with = AnnotatedStructurableTextSerializer.class)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "(Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "hasContent", "", "getHasContent", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnnotatedStructurableText extends StructurableText {
    public static final Companion Companion = new Companion(null);
    private final List<ContentNode> content;
    private final boolean hasContent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnnotatedStructurableText> serializer() {
            return AnnotatedStructurableTextSerializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedStructurableText(List<? extends ContentNode> content) {
        super(null);
        q.g(content, "content");
        this.content = content;
        this.hasContent = !content.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnotatedStructurableText copy$default(AnnotatedStructurableText annotatedStructurableText, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = annotatedStructurableText.content;
        }
        return annotatedStructurableText.copy(list);
    }

    public final List<ContentNode> component1() {
        return this.content;
    }

    public final AnnotatedStructurableText copy(List<? extends ContentNode> content) {
        q.g(content, "content");
        return new AnnotatedStructurableText(content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnnotatedStructurableText) && q.b(this.content, ((AnnotatedStructurableText) obj).content);
    }

    public final List<ContentNode> getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.structurabletext.StructurableText
    public boolean getHasContent() {
        return this.hasContent;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        List<ContentNode> list = this.content;
        return "AnnotatedStructurableText(content=" + list + ")";
    }
}
