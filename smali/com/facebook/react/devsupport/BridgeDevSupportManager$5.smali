.class Lcom/facebook/react/devsupport/BridgeDevSupportManager$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/JavaJSExecutor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/BridgeDevSupportManager;->reloadJSInProxyMode()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/BridgeDevSupportManager;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$5;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create()Lcom/facebook/react/bridge/JavaJSExecutor;
    .locals 5

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/common/futures/SimpleSettableFuture;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/facebook/react/common/futures/SimpleSettableFuture;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$5;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getDevServerHelper()Lcom/facebook/react/devsupport/DevServerHelper;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lcom/facebook/react/devsupport/DevServerHelper;->getWebsocketProxyURL()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$5;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 22
    .line 23
    invoke-static {v3, v1}, Lcom/facebook/react/devsupport/BridgeDevSupportManager;->access$100(Lcom/facebook/react/devsupport/BridgeDevSupportManager;Lcom/facebook/react/common/futures/SimpleSettableFuture;)Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->connect(Ljava/lang/String;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    const-wide/16 v3, 0x5a

    .line 33
    .line 34
    invoke-virtual {v1, v3, v4, v2}, Lcom/facebook/react/common/futures/SimpleSettableFuture;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catch_1
    move-exception v0

    .line 41
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :catch_2
    move-exception v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Exception;

    .line 53
    .line 54
    throw v0
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
