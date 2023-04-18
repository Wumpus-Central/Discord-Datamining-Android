.class Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/CatalystInstanceImpl$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/CatalystInstanceImpl$1;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1;->this$0:Lcom/facebook/react/bridge/CatalystInstanceImpl;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/bridge/CatalystInstanceImpl;->access$800(Lcom/facebook/react/bridge/CatalystInstanceImpl;)Lcom/facebook/react/bridge/JSIModule;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1;->this$0:Lcom/facebook/react/bridge/CatalystInstanceImpl;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/facebook/react/bridge/CatalystInstanceImpl;->access$800(Lcom/facebook/react/bridge/CatalystInstanceImpl;)Lcom/facebook/react/bridge/JSIModule;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lcom/facebook/react/bridge/JSIModule;->onCatalystInstanceDestroy()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1;->this$0:Lcom/facebook/react/bridge/CatalystInstanceImpl;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/facebook/react/bridge/CatalystInstanceImpl;->getReactQueueConfiguration()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;->getUIQueueThread()Lcom/facebook/react/bridge/queue/MessageQueueThread;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;-><init>(Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/queue/MessageQueueThread;->runOnQueue(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
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
