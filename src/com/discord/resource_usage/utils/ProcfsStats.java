package com.discord.resource_usage.utils;

import co.discord.media_engine.C4081a;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import p326ri.C12719v;
import p327rj.C12729c;
import p426xf.C14097l;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/resource_usage/utils/ProcfsStats;", "", "totalTime", "", "rssPages", "(JJ)V", "getRssPages", "()J", "getTotalTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "resource_usage_monitor_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class ProcfsStats {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<File> statFile$delegate;
    private final long rssPages;
    private final long totalTime;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m15073d2 = {"Lcom/discord/resource_usage/utils/ProcfsStats$Companion;", "", "()V", "statFile", "Ljava/io/File;", "getStatFile", "()Ljava/io/File;", "statFile$delegate", "Lkotlin/Lazy;", "readStatFile", "Lcom/discord/resource_usage/utils/ProcfsStats;", "parsePidStats", "resource_usage_monitor_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File getStatFile() {
            return (File) ProcfsStats.statFile$delegate.getValue();
        }

        private final ProcfsStats parsePidStats(File file) {
            String d;
            boolean z;
            List y0;
            try {
                if (!file.exists()) {
                    return null;
                }
                d = C14097l.m1686d(file, null, 1, null);
                if (d.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                y0 = C12719v.m5661y0(d, new char[]{' '}, false, 0, 6, null);
                return new ProcfsStats(C12729c.m5623T((String) y0.get(13), 0L) + C12729c.m5623T((String) y0.get(14), 0L), C12729c.m5623T((String) y0.get(23), 0L));
            } catch (Exception unused) {
                return null;
            }
        }

        public final ProcfsStats readStatFile() {
            return parsePidStats(getStatFile());
        }
    }

    static {
        Lazy<File> a;
        a = C11084n.m10945a(ProcfsStats$Companion$statFile$2.INSTANCE);
        statFile$delegate = a;
    }

    public ProcfsStats(long j, long j2) {
        this.totalTime = j;
        this.rssPages = j2;
    }

    public static /* synthetic */ ProcfsStats copy$default(ProcfsStats procfsStats, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = procfsStats.totalTime;
        }
        if ((i & 2) != 0) {
            j2 = procfsStats.rssPages;
        }
        return procfsStats.copy(j, j2);
    }

    public final long component1() {
        return this.totalTime;
    }

    public final long component2() {
        return this.rssPages;
    }

    public final ProcfsStats copy(long j, long j2) {
        return new ProcfsStats(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcfsStats)) {
            return false;
        }
        ProcfsStats procfsStats = (ProcfsStats) obj;
        return this.totalTime == procfsStats.totalTime && this.rssPages == procfsStats.rssPages;
    }

    public final long getRssPages() {
        return this.rssPages;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public int hashCode() {
        return (C4081a.m32873a(this.totalTime) * 31) + C4081a.m32873a(this.rssPages);
    }

    public String toString() {
        long j = this.totalTime;
        long j2 = this.rssPages;
        return "ProcfsStats(totalTime=" + j + ", rssPages=" + j2 + ")";
    }
}
