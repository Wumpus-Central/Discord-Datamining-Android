package com.discord.resource_usage.utils;

import co.discord.media_engine.b;
import java.io.File;
import java.util.List;
import jf.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.p;
import mj.c;
import tf.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/discord/resource_usage/utils/ProcfsStats;", "", "totalTime", "", "rssPages", "(JJ)V", "getRssPages", "()J", "getTotalTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "resource_usage_monitor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ProcfsStats {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<File> statFile$delegate;
    private final long rssPages;
    private final long totalTime;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/discord/resource_usage/utils/ProcfsStats$Companion;", "", "()V", "statFile", "Ljava/io/File;", "getStatFile", "()Ljava/io/File;", "statFile$delegate", "Lkotlin/Lazy;", "readStatFile", "Lcom/discord/resource_usage/utils/ProcfsStats;", "parsePidStats", "resource_usage_monitor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File getStatFile() {
            return (File) ProcfsStats.statFile$delegate.getValue();
        }

        private final ProcfsStats parsePidStats(File file) {
            String d10;
            boolean z10;
            List y02;
            try {
                if (!file.exists()) {
                    return null;
                }
                d10 = l.d(file, null, 1, null);
                if (d10.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return null;
                }
                y02 = p.y0(d10, new char[]{' '}, false, 0, 6, null);
                return new ProcfsStats(c.T((String) y02.get(13), 0L) + c.T((String) y02.get(14), 0L), c.T((String) y02.get(23), 0L));
            } catch (Exception unused) {
                return null;
            }
        }

        public final ProcfsStats readStatFile() {
            return parsePidStats(getStatFile());
        }
    }

    static {
        Lazy<File> b10;
        b10 = n.b(ProcfsStats$Companion$statFile$2.INSTANCE);
        statFile$delegate = b10;
    }

    public ProcfsStats(long j10, long j11) {
        this.totalTime = j10;
        this.rssPages = j11;
    }

    public static  ProcfsStats copy$default(ProcfsStats procfsStats, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = procfsStats.totalTime;
        }
        if ((i10 & 2) != 0) {
            j11 = procfsStats.rssPages;
        }
        return procfsStats.copy(j10, j11);
    }

    public final long component1() {
        return this.totalTime;
    }

    public final long component2() {
        return this.rssPages;
    }

    public final ProcfsStats copy(long j10, long j11) {
        return new ProcfsStats(j10, j11);
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
        return (b.a(this.totalTime) * 31) + b.a(this.rssPages);
    }

    public String toString() {
        long j10 = this.totalTime;
        long j11 = this.rssPages;
        return "ProcfsStats(totalTime=" + j10 + ", rssPages=" + j11 + ")";
    }
}
