.class Lcom/facebook/react/modules/blob/BlobCollector;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "reactnativeblob"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->r(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Ljava/lang/Object;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/facebook/react/modules/blob/BlobCollector;->nativeInstall(Ljava/lang/Object;J)V

    return-void
.end method

.method static install(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/modules/blob/BlobModule;)V
    .locals 1

    new-instance v0, Lcom/facebook/react/modules/blob/BlobCollector$1;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/modules/blob/BlobCollector$1;-><init>(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/modules/blob/BlobModule;)V

    invoke-virtual {p0, v0}, Lcom/facebook/react/bridge/ReactContext;->runOnJSQueueThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static native nativeInstall(Ljava/lang/Object;J)V
.end method
