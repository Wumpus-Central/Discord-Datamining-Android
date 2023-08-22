package com.discord.chat.bridge.spoiler;

import com.discord.chat.bridge.contentnode.SpoilerContentNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "", "id", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getId", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SpoilerIdentifier {
    public static final Companion Companion = new Companion(null);

    
    private final String f7255id;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier$Companion;", "", "()V", "forNode", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "node", "Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "containerId", "", "index", "", "forNode-2sfwrmE", "(Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;Ljava/lang/String;I)Ljava/lang/String;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        
        public final String m130forNode2sfwrmE(SpoilerContentNode node, String containerId, int i10) {
            q.h(node, "node");
            q.h(containerId, "containerId");
            int hashCode = node.hashCode();
            return SpoilerIdentifier.m124constructorimpl("spoiler:" + hashCode + ":" + containerId + ":" + i10);
        }
    }

    private  SpoilerIdentifier(String str) {
        this.f7255id = str;
    }

    
    public static final  SpoilerIdentifier m123boximpl(String str) {
        return new SpoilerIdentifier(str);
    }

    
    public static String m124constructorimpl(String id2) {
        q.h(id2, "id");
        return id2;
    }

    
    public static boolean m125equalsimpl(String str, Object obj) {
        return (obj instanceof SpoilerIdentifier) && q.c(str, ((SpoilerIdentifier) obj).m129unboximpl());
    }

    
    public static final boolean m126equalsimpl0(String str, String str2) {
        return q.c(str, str2);
    }

    
    public static int m127hashCodeimpl(String str) {
        return str.hashCode();
    }

    
    public static String m128toStringimpl(String str) {
        return "SpoilerIdentifier(id=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m125equalsimpl(this.f7255id, obj);
    }

    public final String getId() {
        return this.f7255id;
    }

    public int hashCode() {
        return m127hashCodeimpl(this.f7255id);
    }

    public String toString() {
        return m128toStringimpl(this.f7255id);
    }

    
    public final  String m129unboximpl() {
        return this.f7255id;
    }
}
