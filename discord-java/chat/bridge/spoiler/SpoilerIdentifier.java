package com.discord.chat.bridge.spoiler;

import com.discord.chat.bridge.contentnode.SpoilerContentNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "", "id", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getId", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpoilerIdentifier {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id  reason: collision with root package name */
    private final String f7204id;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier$Companion;", "", "()V", "forNode", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "node", "Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "containerId", "", "index", "", "forNode-2sfwrmE", "(Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;Ljava/lang/String;I)Ljava/lang/String;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: forNode-2sfwrmE  reason: not valid java name */
        public final String m129forNode2sfwrmE(SpoilerContentNode node, String containerId, int i10) {
            q.g(node, "node");
            q.g(containerId, "containerId");
            int hashCode = node.hashCode();
            return SpoilerIdentifier.m123constructorimpl("spoiler:" + hashCode + ":" + containerId + ":" + i10);
        }
    }

    private /* synthetic */ SpoilerIdentifier(String str) {
        this.f7204id = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ SpoilerIdentifier m122boximpl(String str) {
        return new SpoilerIdentifier(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m123constructorimpl(String id2) {
        q.g(id2, "id");
        return id2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m124equalsimpl(String str, Object obj) {
        return (obj instanceof SpoilerIdentifier) && q.b(str, ((SpoilerIdentifier) obj).m128unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m125equalsimpl0(String str, String str2) {
        return q.b(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m126hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m127toStringimpl(String str) {
        return "SpoilerIdentifier(id=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m124equalsimpl(this.f7204id, obj);
    }

    public final String getId() {
        return this.f7204id;
    }

    public int hashCode() {
        return m126hashCodeimpl(this.f7204id);
    }

    public String toString() {
        return m127toStringimpl(this.f7204id);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m128unboximpl() {
        return this.f7204id;
    }
}
