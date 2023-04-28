.class public final Lcom/discord/resource_usage/DeviceResourceUsageManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/resource_usage/DeviceResourceUsageManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0018\u001a\u00020\u0019H\u0002J\u0008\u0010\u001a\u001a\u00020\u0019H\u0007J\u0008\u0010\u001b\u001a\u00020\u0019H\u0007R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\n\"\u0004\u0008\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/discord/resource_usage/DeviceResourceUsageManager;",
        "",
        "timeSpanMillis",
        "",
        "(J)V",
        "activeThreadId",
        "Ljava/lang/Long;",
        "cpuCoreCount",
        "",
        "getCpuCoreCount",
        "()I",
        "cpuUsagePercent",
        "",
        "getCpuUsagePercent",
        "()D",
        "setCpuUsagePercent",
        "(D)V",
        "memoryRssKB",
        "getMemoryRssKB",
        "setMemoryRssKB",
        "(I)V",
        "thread",
        "Ljava/lang/Thread;",
        "threadSync",
        "monitor",
        "",
        "start",
        "stop",
        "Companion",
        "resource_usage_monitor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/discord/resource_usage/DeviceResourceUsageManager$Companion;

.field private static final SC_CLK_TCK:J

.field private static final SC_CPU_CORE_COUNT:I

.field private static final SC_PAGE_SIZE:J


# instance fields
.field private activeThreadId:Ljava/lang/Long;

.field private final cpuCoreCount:I

.field private cpuUsagePercent:D

.field private memoryRssKB:I

.field private thread:Ljava/lang/Thread;

.field private final threadSync:Ljava/lang/Object;

.field private final timeSpanMillis:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/resource_usage/DeviceResourceUsageManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/resource_usage/DeviceResourceUsageManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->Companion:Lcom/discord/resource_usage/DeviceResourceUsageManager$Companion;

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lnf/s;->l:Lnf/s$a;

    .line 10
    .line 11
    sget v0, Landroid/system/OsConstants;->_SC_CLK_TCK:I

    .line 12
    .line 13
    invoke-static {v0}, Landroid/system/Os;->sysconf(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    sget-object v1, Lnf/s;->l:Lnf/s$a;

    .line 28
    .line 29
    invoke-static {v0}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    const-wide/16 v1, 0x64

    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v0}, Lnf/s;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    move-object v0, v1

    .line 50
    :cond_0
    check-cast v0, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    sput-wide v0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->SC_CLK_TCK:J

    .line 57
    .line 58
    :try_start_1
    sget v0, Landroid/system/OsConstants;->_SC_PAGE_SIZE:I

    .line 59
    .line 60
    invoke-static {v0}, Landroid/system/Os;->sysconf(I)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    goto :goto_1

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    sget-object v1, Lnf/s;->l:Lnf/s$a;

    .line 75
    .line 76
    invoke-static {v0}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_1
    const-wide/16 v1, 0x1000

    .line 85
    .line 86
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v0}, Lnf/s;->g(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    move-object v0, v1

    .line 97
    :cond_1
    check-cast v0, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    sput-wide v0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->SC_PAGE_SIZE:J

    .line 104
    .line 105
    :try_start_2
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 121
    goto :goto_2

    .line 122
    :catchall_2
    move-exception v0

    .line 123
    sget-object v1, Lnf/s;->l:Lnf/s$a;

    .line 124
    .line 125
    invoke-static {v0}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_2
    const/4 v1, 0x1

    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v0}, Lnf/s;->g(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_2

    .line 143
    .line 144
    move-object v0, v1

    .line 145
    :cond_2
    check-cast v0, Ljava/lang/Number;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    sput v0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->SC_CPU_CORE_COUNT:I

    .line 152
    .line 153
    return-void
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/discord/resource_usage/DeviceResourceUsageManager;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->timeSpanMillis:J

    .line 3
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->threadSync:Ljava/lang/Object;

    .line 4
    sget p1, Lcom/discord/resource_usage/DeviceResourceUsageManager;->SC_CPU_CORE_COUNT:I

    if-nez p1, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput p1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->cpuCoreCount:I

    return-void
.end method

.method public synthetic constructor <init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x3e8

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/resource_usage/DeviceResourceUsageManager;-><init>(J)V

    return-void
.end method

.method public static final synthetic access$monitor(Lcom/discord/resource_usage/DeviceResourceUsageManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/resource_usage/DeviceResourceUsageManager;->monitor()V

    return-void
.end method

.method private final monitor()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->threadSync:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    iget-object v3, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->activeThreadId:Ljava/lang/Long;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    cmp-long v3, v6, v4

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    :goto_1
    monitor-exit v2

    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    monitor-exit v2

    .line 32
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    sget-object v2, Lcom/discord/resource_usage/utils/ProcfsStats;->Companion:Lcom/discord/resource_usage/utils/ProcfsStats$Companion;

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/discord/resource_usage/utils/ProcfsStats$Companion;->readStatFile()Lcom/discord/resource_usage/utils/ProcfsStats;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    sub-long v5, v3, v5

    .line 60
    .line 61
    long-to-double v5, v5

    .line 62
    const-wide v7, 0x408f400000000000L    # 1000.0

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    div-double/2addr v5, v7

    .line 68
    invoke-virtual {v2}, Lcom/discord/resource_usage/utils/ProcfsStats;->getTotalTime()J

    .line 69
    .line 70
    .line 71
    move-result-wide v7

    .line 72
    invoke-virtual {v0}, Lcom/discord/resource_usage/utils/ProcfsStats;->getTotalTime()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    sub-long/2addr v7, v0

    .line 77
    const/16 v0, 0x64

    .line 78
    .line 79
    int-to-long v0, v0

    .line 80
    mul-long/2addr v7, v0

    .line 81
    long-to-double v0, v7

    .line 82
    sget-wide v7, Lcom/discord/resource_usage/DeviceResourceUsageManager;->SC_CLK_TCK:J

    .line 83
    .line 84
    long-to-double v7, v7

    .line 85
    mul-double/2addr v7, v5

    .line 86
    div-double/2addr v0, v7

    .line 87
    iget v5, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->cpuCoreCount:I

    .line 88
    .line 89
    const/4 v6, 0x1

    .line 90
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    int-to-double v5, v5

    .line 95
    div-double/2addr v0, v5

    .line 96
    iput-wide v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->cpuUsagePercent:D

    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/discord/resource_usage/utils/ProcfsStats;->getRssPages()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    sget-wide v5, Lcom/discord/resource_usage/DeviceResourceUsageManager;->SC_PAGE_SIZE:J

    .line 103
    .line 104
    mul-long/2addr v0, v5

    .line 105
    const/16 v5, 0x400

    .line 106
    .line 107
    int-to-long v5, v5

    .line 108
    div-long/2addr v0, v5

    .line 109
    long-to-int v0, v0

    .line 110
    iput v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->memoryRssKB:I

    .line 111
    .line 112
    :cond_3
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-wide v3, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->timeSpanMillis:J

    .line 117
    .line 118
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 119
    .line 120
    .line 121
    move-object v0, v2

    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    monitor-exit v2

    .line 125
    throw v0
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method


# virtual methods
.method public final getCpuCoreCount()I
    .locals 1

    iget v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->cpuCoreCount:I

    return v0
.end method

.method public final getCpuUsagePercent()D
    .locals 2

    iget-wide v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->cpuUsagePercent:D

    return-wide v0
.end method

.method public final getMemoryRssKB()I
    .locals 1

    iget v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->memoryRssKB:I

    return v0
.end method

.method public final setCpuUsagePercent(D)V
    .locals 0

    iput-wide p1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->cpuUsagePercent:D

    return-void
.end method

.method public final setMemoryRssKB(I)V
    .locals 0

    iput p1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->memoryRssKB:I

    return-void
.end method

.method public final start()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->threadSync:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->thread:Ljava/lang/Thread;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const-string v5, "DeviceResourceUsageMonitor"

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    new-instance v7, Lcom/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1;

    .line 13
    .line 14
    invoke-direct {v7, p0}, Lcom/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1;-><init>(Lcom/discord/resource_usage/DeviceResourceUsageManager;)V

    .line 15
    .line 16
    .line 17
    const/4 v8, 0x4

    .line 18
    const/4 v9, 0x0

    .line 19
    invoke-static/range {v2 .. v9}, Lrf/a;->b(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iput-object v3, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->activeThreadId:Ljava/lang/Long;

    .line 32
    .line 33
    iput-object v2, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->thread:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit v0

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    monitor-exit v0

    .line 44
    throw v1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->threadSync:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->thread:Ljava/lang/Thread;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->thread:Ljava/lang/Thread;

    .line 8
    .line 9
    iput-object v2, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager;->activeThreadId:Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0

    .line 20
    throw v1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method
