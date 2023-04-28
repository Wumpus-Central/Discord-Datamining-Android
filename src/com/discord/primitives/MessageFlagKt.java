package com.discord.primitives;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"hasMessageFlag", "", "", "flag", "Lcom/discord/primitives/MessageFlag;", "(Ljava/lang/Long;Lcom/discord/primitives/MessageFlag;)Z", "primitives_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class MessageFlagKt {
    public static final boolean hasMessageFlag(Long l, MessageFlag flag) {
        C9971q.m14633g(flag, "flag");
        if (l != null && (l.longValue() & flag.getValue()) == flag.getValue()) {
            return true;
        }
        return false;
    }
}
