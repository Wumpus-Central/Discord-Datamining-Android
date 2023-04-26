.class Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->resetPerfStats()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$2;->this$0:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    iget-object v4, p0, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$2;->this$0:Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;

    .line 10
    .line 11
    invoke-static {v4}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->access$000(Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;)Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v4, v0, v1, v2, v3}, Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;->access$100(Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;JJ)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
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
.end method
