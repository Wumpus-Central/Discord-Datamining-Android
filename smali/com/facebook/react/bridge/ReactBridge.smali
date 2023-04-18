.class public Lcom/facebook/react/bridge/ReactBridge;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile sDidInit:Z = false

.field private static volatile sLoadEndTime:J

.field private static volatile sLoadStartTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getLoadEndTime()J
    .locals 2

    sget-wide v0, Lcom/facebook/react/bridge/ReactBridge;->sLoadEndTime:J

    return-wide v0
.end method

.method public static getLoadStartTime()J
    .locals 2

    sget-wide v0, Lcom/facebook/react/bridge/ReactBridge;->sLoadStartTime:J

    return-wide v0
.end method

.method public static isInitialized()Z
    .locals 1

    sget-boolean v0, Lcom/facebook/react/bridge/ReactBridge;->sDidInit:Z

    return v0
.end method

.method public static declared-synchronized staticInit()V
    .locals 4

    .line 1
    const-class v0, Lcom/facebook/react/bridge/ReactBridge;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/facebook/react/bridge/ReactBridge;->sDidInit:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    sput-wide v1, Lcom/facebook/react/bridge/ReactBridge;->sLoadStartTime:J

    .line 15
    .line 16
    const-string v1, "ReactBridge.staticInit::load:reactnativejni"

    .line 17
    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    invoke-static {v2, v3, v1}, Lg6/a;->c(JLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->LOAD_REACT_NATIVE_SO_FILE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 24
    .line 25
    invoke-static {v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "reactnativejni"

    .line 29
    .line 30
    invoke-static {v1}, Lcom/facebook/soloader/SoLoader;->r(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->LOAD_REACT_NATIVE_SO_FILE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 34
    .line 35
    invoke-static {v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, Lg6/a;->g(J)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    sput-wide v1, Lcom/facebook/react/bridge/ReactBridge;->sLoadEndTime:J

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    sput-boolean v1, Lcom/facebook/react/bridge/ReactBridge;->sDidInit:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    monitor-exit v0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    monitor-exit v0

    .line 54
    throw v1
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
