.class public Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/JavaJSExecutor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorCallbackFuture;,
        Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$WebsocketExecutorTimeoutException;,
        Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;
    }
.end annotation


# static fields
.field private static final CONNECT_RETRY_COUNT:I = 0x3

.field private static final CONNECT_TIMEOUT_MS:J = 0x1388L


# instance fields
.field private final mInjectedObjects:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mWebSocketClient:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->mInjectedObjects:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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

.method static synthetic access$000(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;Ljava/lang/String;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->connectInternal(Ljava/lang/String;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V

    return-void
.end method

.method static synthetic access$102(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;)Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->mWebSocketClient:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    return-object p1
.end method

.method private connectInternal(Ljava/lang/String;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$2;

    .line 16
    .line 17
    invoke-direct {v2, p0, v0, v1, p2}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$2;-><init>(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;Landroid/os/Handler;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v2}, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;->connect(Ljava/lang/String;Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient$JSDebuggerCallback;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;

    .line 24
    .line 25
    invoke-direct {p1, p0, v0, p2}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$3;-><init>(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v2, 0x1388

    .line 29
    .line 30
    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    return-void
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
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->mWebSocketClient:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;->closeQuietly()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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

.method public connect(Ljava/lang/String;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$1;

    .line 8
    .line 9
    invoke-direct {v1, p0, p2, v0, p1}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$1;-><init>(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, v1}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->connectInternal(Ljava/lang/String;Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
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
.end method

.method public executeJSCall(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorCallbackFuture;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorCallbackFuture;-><init>(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$1;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->mWebSocketClient:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    .line 8
    .line 9
    invoke-static {v1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    .line 14
    .line 15
    invoke-virtual {v1, p1, p2, v0}, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;->executeJSCall(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient$JSDebuggerCallback;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorCallbackFuture;->get()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    return-object p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    new-instance p2, Lcom/facebook/react/bridge/JavaJSExecutor$ProxyExecutorException;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JavaJSExecutor$ProxyExecutorException;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p2
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
.end method

.method public loadBundle(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorCallbackFuture;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorCallbackFuture;-><init>(Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$1;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->mWebSocketClient:Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    .line 8
    .line 9
    invoke-static {v1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->mInjectedObjects:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1, v2, v0}, Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient;->loadBundle(Ljava/lang/String;Ljava/util/HashMap;Lcom/facebook/react/devsupport/JSDebuggerWebSocketClient$JSDebuggerCallback;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorCallbackFuture;->get()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    new-instance v0, Lcom/facebook/react/bridge/JavaJSExecutor$ProxyExecutorException;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/JavaJSExecutor$ProxyExecutorException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v0
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
.end method

.method public setGlobalVariable(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor;->mInjectedObjects:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
