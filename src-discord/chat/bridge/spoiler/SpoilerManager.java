package com.discord.chat.bridge.spoiler;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerManager;", "", "()V", "revealedSpoilers", "", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "isNotRevealed", "", "id", "isNotRevealed-V2PEE7g", "(Ljava/lang/String;)Z", "isRevealed", "isRevealed-V2PEE7g", "markRevealed", "", "markRevealed-V2PEE7g", "(Ljava/lang/String;)V", "reset", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SpoilerManager {
    public static final SpoilerManager INSTANCE = new SpoilerManager();
    private static final Set<SpoilerIdentifier> revealedSpoilers = new LinkedHashSet();

    private SpoilerManager() {
    }

    
    public final boolean m130isNotRevealedV2PEE7g(String id2) {
        q.g(id2, "id");
        return !m131isRevealedV2PEE7g(id2);
    }

    
    public final boolean m131isRevealedV2PEE7g(String id2) {
        q.g(id2, "id");
        return revealedSpoilers.contains(SpoilerIdentifier.m122boximpl(id2));
    }

    
    public final void m132markRevealedV2PEE7g(String id2) {
        q.g(id2, "id");
        revealedSpoilers.add(SpoilerIdentifier.m122boximpl(id2));
    }

    public final void reset() {
        revealedSpoilers.clear();
    }
}
