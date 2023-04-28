package com.discord.resource_usage;

import android.system.Os;
import android.system.OsConstants;
import com.discord.resource_usage.utils.ProcfsStats;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C10845s;
import nf.C10848t;
import p164j$.util.Spliterator;
import p324rf.C12444a;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0007J\b\u0010\u001b\u001a\u00020\u0019H\u0007R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m15073d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageManager;", "", "timeSpanMillis", "", "(J)V", "activeThreadId", "Ljava/lang/Long;", "cpuCoreCount", "", "getCpuCoreCount", "()I", "cpuUsagePercent", "", "getCpuUsagePercent", "()D", "setCpuUsagePercent", "(D)V", "memoryRssKB", "getMemoryRssKB", "setMemoryRssKB", "(I)V", "thread", "Ljava/lang/Thread;", "threadSync", "monitor", "", ViewProps.START, "stop", "Companion", "resource_usage_monitor_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class DeviceResourceUsageManager {
    public static final Companion Companion = new Companion(null);
    private static final long SC_CLK_TCK;
    private static final int SC_CPU_CORE_COUNT;
    private static final long SC_PAGE_SIZE;
    private Long activeThreadId;
    private final int cpuCoreCount;
    private double cpuUsagePercent;
    private int memoryRssKB;
    private Thread thread;
    private final Object threadSync;
    private final long timeSpanMillis;

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m15073d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageManager$Companion;", "", "()V", "SC_CLK_TCK", "", "SC_CPU_CORE_COUNT", "", "SC_PAGE_SIZE", "resource_usage_monitor_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Long l;
        Long l2;
        Integer num;
        try {
            C10845s.C10846a aVar = C10845s.f28533l;
            l = C10845s.m10940b(Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK)));
        } catch (Throwable th2) {
            C10845s.C10846a aVar2 = C10845s.f28533l;
            l = C10845s.m10940b(C10848t.m10931a(th2));
        }
        if (C10845s.m10935g(l)) {
            l = 100L;
        }
        SC_CLK_TCK = ((Number) l).longValue();
        try {
            l2 = C10845s.m10940b(Long.valueOf(Os.sysconf(OsConstants._SC_PAGE_SIZE)));
        } catch (Throwable th3) {
            C10845s.C10846a aVar3 = C10845s.f28533l;
            l2 = C10845s.m10940b(C10848t.m10931a(th3));
        }
        if (C10845s.m10935g(l2)) {
            l2 = 4096L;
        }
        SC_PAGE_SIZE = ((Number) l2).longValue();
        try {
            num = C10845s.m10940b(Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        } catch (Throwable th4) {
            C10845s.C10846a aVar4 = C10845s.f28533l;
            num = C10845s.m10940b(C10848t.m10931a(th4));
        }
        if (C10845s.m10935g(num)) {
            num = 1;
        }
        SC_CPU_CORE_COUNT = ((Number) num).intValue();
    }

    public DeviceResourceUsageManager() {
        this(0L, 1, null);
    }

    public DeviceResourceUsageManager(long j) {
        this.timeSpanMillis = j;
        this.threadSync = new Object();
        int i = SC_CPU_CORE_COUNT;
        this.cpuCoreCount = i == 0 ? 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void monitor() {
        ProcfsStats procfsStats = null;
        Long l = null;
        while (true) {
            synchronized (this.threadSync) {
                Long l2 = this.activeThreadId;
                long id2 = Thread.currentThread().getId();
                if (l2 == null || l2.longValue() != id2) {
                    break;
                }
                Unit unit = Unit.f25780a;
                if (!Thread.interrupted()) {
                    ProcfsStats readStatFile = ProcfsStats.Companion.readStatFile();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!(procfsStats == null || l == null || readStatFile == null)) {
                        this.cpuUsagePercent = (((readStatFile.getTotalTime() - procfsStats.getTotalTime()) * 100) / (SC_CLK_TCK * ((currentTimeMillis - l.longValue()) / 1000.0d))) / Math.max(this.cpuCoreCount, 1);
                        this.memoryRssKB = (int) ((readStatFile.getRssPages() * SC_PAGE_SIZE) / ((long) Spliterator.IMMUTABLE));
                    }
                    l = Long.valueOf(currentTimeMillis);
                    Thread.sleep(this.timeSpanMillis);
                    procfsStats = readStatFile;
                } else {
                    return;
                }
            }
        }
    }

    public final int getCpuCoreCount() {
        return this.cpuCoreCount;
    }

    public final double getCpuUsagePercent() {
        return this.cpuUsagePercent;
    }

    public final int getMemoryRssKB() {
        return this.memoryRssKB;
    }

    public final void setCpuUsagePercent(double d) {
        this.cpuUsagePercent = d;
    }

    public final void setMemoryRssKB(int i) {
        this.memoryRssKB = i;
    }

    public final void start() {
        Thread thread;
        synchronized (this.threadSync) {
            thread = this.thread;
            Thread b = C12444a.m6476b(true, true, null, "DeviceResourceUsageMonitor", 2, new DeviceResourceUsageManager$start$oldThread$1$thread$1(this), 4, null);
            this.activeThreadId = Long.valueOf(b.getId());
            this.thread = b;
        }
        if (thread != null) {
            thread.interrupt();
        }
    }

    public final void stop() {
        Thread thread;
        synchronized (this.threadSync) {
            thread = this.thread;
            this.thread = null;
            this.activeThreadId = null;
        }
        if (thread != null) {
            thread.interrupt();
        }
    }

    public /* synthetic */ DeviceResourceUsageManager(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j);
    }
}
