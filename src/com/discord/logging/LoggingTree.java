package com.discord.logging;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import timber.log.C13143a;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\r"}, m15073d2 = {"Lcom/discord/logging/LoggingTree;", "Ltimber/log/a$c;", "", "priority", "", "tag", "message", "", "t", "", "log", "<init>", "()V", "logging_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class LoggingTree extends C13143a.AbstractC13145c {
    @Override // timber.log.C13143a.AbstractC13145c
    protected void log(int i, String str, String message, Throwable th2) {
        C9971q.m14633g(message, "message");
        Log.println(i, str, message);
    }
}
