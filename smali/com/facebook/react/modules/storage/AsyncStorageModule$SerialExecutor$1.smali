.class Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;

.field final synthetic val$r:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor$1;->this$1:Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;

    iput-object p2, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor$1;->val$r:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor$1;->val$r:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor$1;->this$1:Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;->scheduleNext()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    iget-object v1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor$1;->this$1:Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/react/modules/storage/AsyncStorageModule$SerialExecutor;->scheduleNext()V

    .line 16
    .line 17
    .line 18
    throw v0
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
