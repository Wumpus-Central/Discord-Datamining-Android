package com.discord.chat.bridge.contentnode;

import com.facebook.react.uimanager.events.TouchesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J/\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "content", "", TouchesHelper.TARGET_KEY, "", "context", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "textContent", "isUrl", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)V", "getContent", "()Ljava/util/List;", "getContext", "()Lcom/discord/chat/bridge/contentnode/LinkContext;", "()Z", "getTarget", "()Ljava/lang/String;", "getTextContent", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LinkContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final List<ContentNode> content;
    private final LinkContext context;
    private final boolean isUrl;
    private final String target;
    private final String textContent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkContentNode> serializer() {
            return LinkContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkContentNode(int i10, List list, String str, LinkContext linkContext, String str2, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        Object W;
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
            W = r.W(list);
            ContentNode contentNode = (ContentNode) W;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkContentNode copy$default(LinkContentNode linkContentNode, List list, String str, LinkContext linkContext, int i10, Object obj) {
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r4 != null) goto L_0x0060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r3 != r4) goto L_0x0076;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.contentnode.LinkContentNode r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.q.g(r6, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.q.g(r7, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.q.g(r8, r0)
            yj.f r0 = new yj.f
            com.discord.chat.bridge.contentnode.ContentNodeSerializer r1 = com.discord.chat.bridge.contentnode.ContentNodeSerializer.INSTANCE
            r0.<init>(r1)
            java.util.List<com.discord.chat.bridge.contentnode.ContentNode> r1 = r6.content
            r2 = 0
            r7.q(r8, r2, r0, r1)
            java.lang.String r0 = r6.target
            r1 = 1
            r7.z(r8, r1, r0)
            r0 = 2
            boolean r3 = r7.A(r8, r0)
            if (r3 == 0) goto L_0x002b
        L_0x0029:
            r3 = r1
            goto L_0x0031
        L_0x002b:
            com.discord.chat.bridge.contentnode.LinkContext r3 = r6.context
            if (r3 == 0) goto L_0x0030
            goto L_0x0029
        L_0x0030:
            r3 = r2
        L_0x0031:
            if (r3 == 0) goto L_0x003a
            com.discord.chat.bridge.contentnode.LinkContext$$serializer r3 = com.discord.chat.bridge.contentnode.LinkContext$$serializer.INSTANCE
            com.discord.chat.bridge.contentnode.LinkContext r4 = r6.context
            r7.u(r8, r0, r3, r4)
        L_0x003a:
            r0 = 3
            boolean r3 = r7.A(r8, r0)
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r3 = r1
            goto L_0x0068
        L_0x0043:
            java.lang.String r3 = r6.textContent
            java.util.List<com.discord.chat.bridge.contentnode.ContentNode> r4 = r6.content
            java.lang.Object r4 = kotlin.collections.h.W(r4)
            com.discord.chat.bridge.contentnode.ContentNode r4 = (com.discord.chat.bridge.contentnode.ContentNode) r4
            if (r4 == 0) goto L_0x005e
            boolean r5 = r4 instanceof com.discord.chat.bridge.contentnode.TextContentNode
            if (r5 != 0) goto L_0x0054
            r4 = 0
        L_0x0054:
            com.discord.chat.bridge.contentnode.TextContentNode r4 = (com.discord.chat.bridge.contentnode.TextContentNode) r4
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r4.getContent()
            if (r4 != 0) goto L_0x0060
        L_0x005e:
            java.lang.String r4 = r6.target
        L_0x0060:
            boolean r3 = kotlin.jvm.internal.q.b(r3, r4)
            if (r3 != 0) goto L_0x0067
            goto L_0x0041
        L_0x0067:
            r3 = r2
        L_0x0068:
            if (r3 == 0) goto L_0x006f
            java.lang.String r3 = r6.textContent
            r7.z(r8, r0, r3)
        L_0x006f:
            r0 = 4
            boolean r3 = r7.A(r8, r0)
            if (r3 == 0) goto L_0x0078
        L_0x0076:
            r2 = r1
            goto L_0x0084
        L_0x0078:
            boolean r3 = r6.isUrl
            com.discord.chat.bridge.contentnode.LinkContext r4 = r6.context
            if (r4 != 0) goto L_0x0080
            r4 = r1
            goto L_0x0081
        L_0x0080:
            r4 = r2
        L_0x0081:
            if (r3 == r4) goto L_0x0084
            goto L_0x0076
        L_0x0084:
            if (r2 == 0) goto L_0x008b
            boolean r6 = r6.isUrl
            r7.y(r8, r0, r6)
        L_0x008b:
            return
        */
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

    public /* synthetic */ LinkContentNode(List list, String str, LinkContext linkContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i10 & 4) != 0 ? null : linkContext);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkContentNode(List<? extends ContentNode> content, String target, LinkContext linkContext) {
        super(null);
        Object W;
        String content2;
        q.g(content, "content");
        q.g(target, "target");
        TextContentNode textContentNode = null;
        this.content = content;
        this.target = target;
        this.context = linkContext;
        W = r.W(content);
        ContentNode contentNode = (ContentNode) W;
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
