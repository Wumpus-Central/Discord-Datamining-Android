package com.discord.chatreplay.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m15073d2 = {"Lcom/discord/chatreplay/logger/ReleaseRowLogger;", "Lcom/discord/chatreplay/logger/RowLogger;", "()V", "logRowsClear", "", "logRowsUpdate", "rowsJson", "", "chat_replay_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ReleaseRowLogger implements RowLogger {
    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsClear() {
    }

    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsUpdate(String rowsJson) {
        C9971q.m14633g(rowsJson, "rowsJson");
    }
}
