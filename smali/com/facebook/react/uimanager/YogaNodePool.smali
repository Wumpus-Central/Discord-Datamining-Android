.class public Lcom/facebook/react/uimanager/YogaNodePool;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sInitLock:Ljava/lang/Object;

.field private static sPool:Lcom/facebook/react/common/ClearableSynchronizedPool;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/common/ClearableSynchronizedPool<",
            "Lcom/facebook/yoga/YogaNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/YogaNodePool;->sInitLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/facebook/react/common/ClearableSynchronizedPool;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/common/ClearableSynchronizedPool<",
            "Lcom/facebook/yoga/YogaNode;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/YogaNodePool;->sPool:Lcom/facebook/react/common/ClearableSynchronizedPool;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/YogaNodePool;->sInitLock:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-object v1, Lcom/facebook/react/uimanager/YogaNodePool;->sPool:Lcom/facebook/react/common/ClearableSynchronizedPool;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    new-instance v1, Lcom/facebook/react/common/ClearableSynchronizedPool;

    .line 14
    .line 15
    const/16 v2, 0x400

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lcom/facebook/react/common/ClearableSynchronizedPool;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/facebook/react/uimanager/YogaNodePool;->sPool:Lcom/facebook/react/common/ClearableSynchronizedPool;

    .line 21
    .line 22
    :cond_1
    sget-object v1, Lcom/facebook/react/uimanager/YogaNodePool;->sPool:Lcom/facebook/react/common/ClearableSynchronizedPool;

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object v1

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v1
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
