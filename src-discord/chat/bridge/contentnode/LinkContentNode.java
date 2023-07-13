package com.discord.chat.bridge.contentnode;

import com.facebook.react.uimanager.events.TouchesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J/\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "content", "", TouchesHelper.TARGET_KEY, "", "context", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "textContent", "isUrl", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)V", "getContent", "()Ljava/util/List;", "getContext", "()Lcom/discord/chat/bridge/contentnode/LinkContext;", "()Z", "getTarget", "()Ljava/lang/String;", "getTextContent", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class LinkContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final List<ContentNode> content;
    private final LinkContext context;
    private final boolean isUrl;
    private final String target;
    private final String textContent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkContentNode> serializer() {
            return LinkContentNode$$serializer.INSTANCE;
        }
    }

    
    public  LinkContentNode(int i10, List list, String str, LinkContext linkContext, String str2, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        Object U;
        String content;
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, LinkContentNode$$serializer.INSTANCE.getDescriptor());
        }
        TextContentNode textContentNode = null;
        this.content = list;
        this.target = str;
        if ((i10 & 4) == 0) {
            this.context = null;
        } else {
            this.context = linkContext;
        }
        if ((i10 & 8) == 0) {
            U = r.U(list);
            ContentNode contentNode = (ContentNode) U;
            if (contentNode != null) {
                TextContentNode textContentNode2 = contentNode instanceof TextContentNode ? contentNode : textContentNode;
                if (!(textContentNode2 == null || (content = textContentNode2.getContent()) == null)) {
                    str = content;
                }
            }
            this.textContent = str;
        } else {
            this.textContent = str2;
        }
        if ((i10 & 16) == 0) {
            this.isUrl = this.context == null;
        } else {
            this.isUrl = z10;
        }
    }

    
    public static  LinkContentNode copy$default(LinkContentNode linkContentNode, List list, String str, LinkContext linkContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = linkContentNode.content;
        }
        if ((i10 & 2) != 0) {
            str = linkContentNode.target;
        }
        if ((i10 & 4) != 0) {
            linkContext = linkContentNode.context;
        }
        return linkContentNode.copy(list, str, linkContext);
    }

    
    
    
    
    
    
    
    public static final void write$Self(com.discord.chat.bridge.contentnode.LinkContentNode r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.contentnode.LinkContentNode.write$Self(com.discord.chat.bridge.contentnode.LinkContentNode, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final List<ContentNode> component1() {
        return this.content;
    }

    public final String component2() {
        return this.target;
    }

    public final LinkContext component3() {
        return this.context;
    }

    public final LinkContentNode copy(List<? extends ContentNode> content, String target, LinkContext linkContext) {
        q.g(content, "content");
        q.g(target, "target");
        return new LinkContentNode(content, target, linkContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkContentNode)) {
            return false;
        }
        LinkContentNode linkContentNode = (LinkContentNode) obj;
        return q.b(this.content, linkContentNode.content) && q.b(this.target, linkContentNode.target) && q.b(this.context, linkContentNode.context);
    }

    public final List<ContentNode> getContent() {
        return this.content;
    }

    public final LinkContext getContext() {
        return this.context;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getTextContent() {
        return this.textContent;
    }

    public int hashCode() {
        int hashCode = ((this.content.hashCode() * 31) + this.target.hashCode()) * 31;
        LinkContext linkContext = this.context;
        return hashCode + (linkContext == null ? 0 : linkContext.hashCode());
    }

    public final boolean isUrl() {
        return this.isUrl;
    }

    public String toString() {
        List<ContentNode> list = this.content;
        String str = this.target;
        LinkContext linkContext = this.context;
        return "LinkContentNode(content=" + list + ", target=" + str + ", context=" + linkContext + ")";
    }

    public  LinkContentNode(List list, String str, LinkContext linkContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i10 & 4) != 0 ? null : linkContext);
    }

    
    
    public LinkContentNode(List<? extends ContentNode> content, String target, LinkContext linkContext) {
        super(null);
        Object U;
        String content2;
        q.g(content, "content");
        q.g(target, "target");
        TextContentNode textContentNode = null;
        this.content = content;
        this.target = target;
        this.context = linkContext;
        U = r.U(content);
        ContentNode contentNode = (ContentNode) U;
        if (contentNode != null) {
            TextContentNode textContentNode2 = contentNode instanceof TextContentNode ? contentNode : textContentNode;
            if (!(textContentNode2 == null || (content2 = textContentNode2.getContent()) == null)) {
                target = content2;
            }
        }
        this.textContent = target;
        this.isUrl = linkContext == null;
    }
}
