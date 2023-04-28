package com.discord.chatreplay.logger;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m15073d2 = {"outputStream", "Ljava/io/FileOutputStream;", "Ljava/io/File;", "append", "", "chat_replay_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class DebugRowLoggerKt {
    public static final FileOutputStream outputStream(File file, boolean z) {
        C9677q.m14633g(file, "<this>");
        return new FileOutputStream(file, z);
    }
}
