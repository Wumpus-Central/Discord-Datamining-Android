.class public final Lqa/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private volatile b:Ljava/io/InputStream;

.field private volatile c:Z

.field private final d:Landroidx/collection/SimpleArrayMap;

.field private final e:Landroidx/collection/SimpleArrayMap;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lqa/i;->a()Lqa/d;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 16
    .line 17
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x1

    .line 22
    const-wide/16 v3, 0x3c

    .line 23
    .line 24
    move-object v0, v8

    .line 25
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {v8, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 30
    .line 31
    .line 32
    invoke-static {v8}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lqa/k0;->a:Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lqa/k0;->b:Ljava/io/InputStream;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lqa/k0;->c:Z

    .line 43
    .line 44
    new-instance v0, Landroidx/collection/SimpleArrayMap;

    .line 45
    .line 46
    invoke-direct {v0}, Landroidx/collection/SimpleArrayMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lqa/k0;->d:Landroidx/collection/SimpleArrayMap;

    .line 50
    .line 51
    new-instance v0, Landroidx/collection/SimpleArrayMap;

    .line 52
    .line 53
    invoke-direct {v0}, Landroidx/collection/SimpleArrayMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lqa/k0;->e:Landroidx/collection/SimpleArrayMap;

    .line 57
    .line 58
    return-void
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
.end method


# virtual methods
.method final declared-synchronized a()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lqa/k0;->c:Z

    .line 4
    .line 5
    iget-object v0, p0, Lqa/k0;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lqa/k0;->b:Ljava/io/InputStream;

    .line 11
    .line 12
    invoke-static {v0}, Lba/i;->b(Ljava/io/Closeable;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    iget-object v2, p0, Lqa/k0;->d:Landroidx/collection/SimpleArrayMap;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/collection/SimpleArrayMap;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lqa/k0;->d:Landroidx/collection/SimpleArrayMap;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Landroidx/collection/SimpleArrayMap;->n(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/io/Closeable;

    .line 32
    .line 33
    invoke-static {v2}, Lba/i;->b(Ljava/io/Closeable;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v1, p0, Lqa/k0;->d:Landroidx/collection/SimpleArrayMap;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/collection/SimpleArrayMap;->clear()V

    .line 42
    .line 43
    .line 44
    :goto_1
    iget-object v1, p0, Lqa/k0;->e:Landroidx/collection/SimpleArrayMap;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/collection/SimpleArrayMap;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-ge v0, v1, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, Lqa/k0;->e:Landroidx/collection/SimpleArrayMap;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroidx/collection/SimpleArrayMap;->n(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lqa/p0;

    .line 59
    .line 60
    invoke-virtual {v1}, Lqa/p0;->v()Landroid/os/ParcelFileDescriptor;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Lba/i;->a(Landroid/os/ParcelFileDescriptor;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lqa/p0;->z()Landroid/os/ParcelFileDescriptor;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1}, Lba/i;->a(Landroid/os/ParcelFileDescriptor;)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    iget-object v0, p0, Lqa/k0;->e:Landroidx/collection/SimpleArrayMap;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/collection/SimpleArrayMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    monitor-exit p0

    .line 83
    return-void

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    monitor-exit p0

    .line 86
    throw v0
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
.end method
