package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/bridge/contentnode/ErrorContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorContentNode extends ContentNode {
    private final Throwable throwable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorContentNode(Throwable throwable) {
        super(null);
        q.g(throwable, "throwable");
        this.throwable = throwable;
    }

    public static /* synthetic */ ErrorContentNode copy$default(ErrorContentNode errorContentNode, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = errorContentNode.throwable;
        }
        return errorContentNode.copy(th2);
    }

    public final Throwable component1() {
        return this.throwable;
    }

    public final ErrorContentNode copy(Throwable throwable) {
        q.g(throwable, "throwable");
        return new ErrorContentNode(throwable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorContentNode) && q.b(this.throwable, ((ErrorContentNode) obj).throwable);
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public String toString() {
        Throwable th2 = this.throwable;
        return "ErrorContentNode(throwable=" + th2 + ")";
    }
}
