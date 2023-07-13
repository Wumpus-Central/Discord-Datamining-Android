package com.discord.primitives;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/primitives/MessageFlag;", "", "value", "", "(Ljava/lang/String;IJ)V", "getValue", "()J", "CROSSPOSTED", "IS_CROSSPOST", "SUPPRESS_EMBEDS", "SOURCE_MESSAGE_DELETED", "URGENT", "HAS_THREAD", "EPHEMERAL", "LOADING", "FAILED_TO_MENTION_SOME_ROLES_IN_THREAD", "SHOULD_SHOW_LINK_NOT_DISCORD_WARNING", "SUPPRESS_NOTIFICATIONS", "IS_VOICE_MESSAGE", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum MessageFlag {
    CROSSPOSTED(1),
    IS_CROSSPOST(2),
    SUPPRESS_EMBEDS(4),
    SOURCE_MESSAGE_DELETED(8),
    URGENT(16),
    HAS_THREAD(32),
    EPHEMERAL(64),
    LOADING(128),
    FAILED_TO_MENTION_SOME_ROLES_IN_THREAD(256),
    SHOULD_SHOW_LINK_NOT_DISCORD_WARNING(1024),
    SUPPRESS_NOTIFICATIONS(4096),
    IS_VOICE_MESSAGE(8192);
    
    private final long value;

    MessageFlag(long j10) {
        this.value = j10;
    }

    public final long getValue() {
        return this.value;
    }
}
