package com.discord.crash_reporting;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/discord/crash_reporting/PackageProcessTimings;", "", "()V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "modules", "", "", "getModules", "()Ljava/util/List;", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PackageProcessTimings {
    private long endTime;
    private final List<String> modules = new ArrayList();

    public final long getEndTime() {
        return this.endTime;
    }

    public final List<String> getModules() {
        return this.modules;
    }

    public final void setEndTime(long j10) {
        this.endTime = j10;
    }
}
