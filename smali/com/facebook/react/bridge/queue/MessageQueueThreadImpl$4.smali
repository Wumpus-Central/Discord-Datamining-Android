.class Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->startNewBackgroundThread(Ljava/lang/String;JLcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$dataFuture:Lcom/facebook/react/common/futures/SimpleSettableFuture;


# direct methods
.method constructor <init>(Lcom/facebook/react/common/futures/SimpleSettableFuture;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$4;->val$dataFuture:Lcom/facebook/react/common/futures/SimpleSettableFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    const/4 v0, -0x4

    .line 2
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->access$100(Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;JJ)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$4;->val$dataFuture:Lcom/facebook/react/common/futures/SimpleSettableFuture;

    .line 25
    .line 26
    new-instance v2, Landroid/util/Pair;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v2, v3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lcom/facebook/react/common/futures/SimpleSettableFuture;->set(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->loop()V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
.end method
