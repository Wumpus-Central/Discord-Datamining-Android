.class public final Lcom/mrousavy/camera/CameraView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/CameraView;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/mrousavy/camera/CameraView$b",
        "Lcom/facebook/react/bridge/LifecycleEventListener;",
        "",
        "onHostResume",
        "onHostPause",
        "onHostDestroy",
        "react-native-vision-camera_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lcom/mrousavy/camera/CameraView;


# direct methods
.method constructor <init>(Lcom/mrousavy/camera/CameraView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onHostDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->k:Landroidx/lifecycle/Lifecycle$State;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/mrousavy/camera/CameraView;->n(Lcom/mrousavy/camera/CameraView;Landroidx/lifecycle/Lifecycle$State;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/mrousavy/camera/CameraView;->o(Lcom/mrousavy/camera/CameraView;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/mrousavy/camera/CameraView;->g(Lcom/mrousavy/camera/CameraView;)Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/mrousavy/camera/CameraView;->getTakePhotoExecutor$react_native_vision_camera_release()Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/mrousavy/camera/CameraView;->getRecordVideoExecutor$react_native_vision_camera_release()Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/mrousavy/camera/CameraView;->l(Lcom/mrousavy/camera/CameraView;)Lcom/facebook/react/bridge/ReactContext;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 47
    .line 48
    .line 49
    return-void
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
    .line 94
.end method

.method public onHostPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->m:Landroidx/lifecycle/Lifecycle$State;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/mrousavy/camera/CameraView;->n(Lcom/mrousavy/camera/CameraView;Landroidx/lifecycle/Lifecycle$State;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/mrousavy/camera/CameraView;->o(Lcom/mrousavy/camera/CameraView;)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method public onHostResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->o:Landroidx/lifecycle/Lifecycle$State;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/mrousavy/camera/CameraView;->n(Lcom/mrousavy/camera/CameraView;Landroidx/lifecycle/Lifecycle$State;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/mrousavy/camera/CameraView;->o(Lcom/mrousavy/camera/CameraView;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$b;->k:Lcom/mrousavy/camera/CameraView;

    .line 14
    .line 15
    invoke-static {}, Lcom/mrousavy/camera/CameraView;->k()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/mrousavy/camera/CameraView;->v(Ljava/util/ArrayList;)Z

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
.end method
