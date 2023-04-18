.class Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->connectInternal(Ljava/lang/String;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;

.field final synthetic val$callback:Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;

.field final synthetic val$client:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;->this$0:Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;

    iput-object p2, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;->val$client:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    iput-object p3, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;->val$callback:Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;->val$client:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;->closeQuietly()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;->val$callback:Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;

    .line 7
    .line 8
    new-instance v1, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$WebsocketExecutorTimeoutException;

    .line 9
    .line 10
    const-string v2, "Timeout while connecting to remote debugger"

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$WebsocketExecutorTimeoutException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;->onFailure(Ljava/lang/Throwable;)V

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
