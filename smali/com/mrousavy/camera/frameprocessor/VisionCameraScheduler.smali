.class public Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Ld6/a;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;->a:Ljava/util/concurrent/ExecutorService;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;->initHybrid()Lcom/facebook/jni/HybridData;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 11
    .line 12
    return-void
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
.end method

.method public static synthetic a(Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;)V
    .locals 0

    invoke-direct {p0}, Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;->triggerUI()V

    return-void
.end method

.method private native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method private scheduleTrigger()V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    iget-object v0, p0, Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/mrousavy/camera/frameprocessor/d;

    invoke-direct {v1, p0}, Lcom/mrousavy/camera/frameprocessor/d;-><init>(Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method private native triggerUI()V
.end method
