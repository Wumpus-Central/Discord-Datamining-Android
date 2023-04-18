.class Lcom/google/firebase/messaging/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lca/b;

    const-string v2, "Firebase-Messaging-Init"

    invoke-direct {v1, v2}, Lca/b;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    return-object v0
.end method

.method static b()Ljava/util/concurrent/ExecutorService;
    .locals 3

    .line 1
    invoke-static {}, Lad/b;->a()Lad/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lca/b;

    .line 6
    .line 7
    const-string v2, "Firebase-Messaging-Intent-Handle"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lca/b;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lad/c;->l:Lad/c;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lad/a;->a(Ljava/util/concurrent/ThreadFactory;Lad/c;)Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method static c()Ljava/util/concurrent/ExecutorService;
    .locals 2

    new-instance v0, Lca/b;

    const-string v1, "Firebase-Messaging-Network-Io"

    invoke-direct {v0, v1}, Lca/b;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method static d()Ljava/util/concurrent/ExecutorService;
    .locals 2

    new-instance v0, Lca/b;

    const-string v1, "Firebase-Messaging-Task"

    invoke-direct {v0, v1}, Lca/b;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method static e()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lca/b;

    const-string v2, "Firebase-Messaging-Topics-Io"

    invoke-direct {v1, v2}, Lca/b;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    return-object v0
.end method
