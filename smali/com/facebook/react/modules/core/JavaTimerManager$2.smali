.class Lcom/facebook/react/modules/core/JavaTimerManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;->setSendIdleEvents(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

.field final synthetic val$sendIdleEvents:Z


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;Z)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$2;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    iput-boolean p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$2;->val$sendIdleEvents:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$2;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1300(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$2;->val$sendIdleEvents:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$2;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1800(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$2;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 19
    .line 20
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1900(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
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
.end method
