.class public Lcom/facebook/react/modules/core/ChoreographerCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;
    }
.end annotation


# static fields
.field private static final ONE_FRAME_MILLIS:J = 0x11L

.field private static sInstance:Lcom/facebook/react/modules/core/ChoreographerCompat;


# instance fields
.field private mChoreographer:Landroid/view/Choreographer;

.field private mHandler:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/react/modules/core/ChoreographerCompat;->getChoreographer()Landroid/view/Choreographer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/facebook/react/modules/core/ChoreographerCompat;->mChoreographer:Landroid/view/Choreographer;

    .line 9
    .line 10
    return-void
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

.method private choreographerPostFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/core/ChoreographerCompat;->mChoreographer:Landroid/view/Choreographer;

    invoke-virtual {v0, p1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method private choreographerPostFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/core/ChoreographerCompat;->mChoreographer:Landroid/view/Choreographer;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/Choreographer;->postFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V

    return-void
.end method

.method private choreographerRemoveFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/core/ChoreographerCompat;->mChoreographer:Landroid/view/Choreographer;

    invoke-virtual {v0, p1}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method private getChoreographer()Landroid/view/Choreographer;
    .locals 1

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance()Lcom/facebook/react/modules/core/ChoreographerCompat;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/facebook/react/modules/core/ChoreographerCompat;->sInstance:Lcom/facebook/react/modules/core/ChoreographerCompat;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/facebook/react/modules/core/ChoreographerCompat;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/facebook/react/modules/core/ChoreographerCompat;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/facebook/react/modules/core/ChoreographerCompat;->sInstance:Lcom/facebook/react/modules/core/ChoreographerCompat;

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/facebook/react/modules/core/ChoreographerCompat;->sInstance:Lcom/facebook/react/modules/core/ChoreographerCompat;

    .line 16
    .line 17
    return-object v0
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
.end method


# virtual methods
.method public postFrameCallback(Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;)V
    .locals 0

    invoke-virtual {p1}, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;->getFrameCallback()Landroid/view/Choreographer$FrameCallback;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/modules/core/ChoreographerCompat;->choreographerPostFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public postFrameCallbackDelayed(Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;J)V
    .locals 0

    invoke-virtual {p1}, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;->getFrameCallback()Landroid/view/Choreographer$FrameCallback;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/modules/core/ChoreographerCompat;->choreographerPostFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V

    return-void
.end method

.method public removeFrameCallback(Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;)V
    .locals 0

    invoke-virtual {p1}, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;->getFrameCallback()Landroid/view/Choreographer$FrameCallback;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/modules/core/ChoreographerCompat;->choreographerRemoveFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
