.class public abstract Lcom/facebook/react/perflogger/NativeModulePerfLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile sIsSoLibraryLoaded:Z


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/perflogger/NativeModulePerfLogger;->maybeLoadOtherSoLibraries()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/perflogger/NativeModulePerfLogger;->maybeLoadSoLibrary()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/react/perflogger/NativeModulePerfLogger;->initHybrid()Lcom/facebook/jni/HybridData;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/facebook/react/perflogger/NativeModulePerfLogger;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 15
    .line 16
    return-void
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

.method private static declared-synchronized maybeLoadSoLibrary()V
    .locals 2

    .line 1
    const-class v0, Lcom/facebook/react/perflogger/NativeModulePerfLogger;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/facebook/react/perflogger/NativeModulePerfLogger;->sIsSoLibraryLoaded:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "reactperfloggerjni"

    .line 9
    .line 10
    invoke-static {v1}, Lcom/facebook/soloader/SoLoader;->r(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    sput-boolean v1, Lcom/facebook/react/perflogger/NativeModulePerfLogger;->sIsSoLibraryLoaded:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    :cond_0
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0

    .line 20
    throw v1
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


# virtual methods
.method protected abstract initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method protected declared-synchronized maybeLoadOtherSoLibraries()V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    monitor-exit p0

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public abstract moduleCreateCacheHit(Ljava/lang/String;I)V
.end method

.method public abstract moduleCreateConstructEnd(Ljava/lang/String;I)V
.end method

.method public abstract moduleCreateConstructStart(Ljava/lang/String;I)V
.end method

.method public abstract moduleCreateEnd(Ljava/lang/String;I)V
.end method

.method public abstract moduleCreateFail(Ljava/lang/String;I)V
.end method

.method public abstract moduleCreateSetUpEnd(Ljava/lang/String;I)V
.end method

.method public abstract moduleCreateSetUpStart(Ljava/lang/String;I)V
.end method

.method public abstract moduleCreateStart(Ljava/lang/String;I)V
.end method

.method public abstract moduleDataCreateEnd(Ljava/lang/String;I)V
.end method

.method public abstract moduleDataCreateStart(Ljava/lang/String;I)V
.end method
