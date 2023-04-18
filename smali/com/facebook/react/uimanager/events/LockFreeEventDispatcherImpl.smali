.class public Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/EventDispatcher;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;
    }
.end annotation


# instance fields
.field private final DEBUG_MODE:Z

.field private final TAG:Ljava/lang/String;

.field private final mCurrentFrameCallback:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;

.field private final mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/facebook/react/uimanager/events/EventDispatcherListener;",
            ">;"
        }
    .end annotation
.end field

.field private final mPostEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;",
            ">;"
        }
    .end annotation
.end field

.field private final mReactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private volatile mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->DEBUG_MODE:Z

    .line 6
    .line 7
    const-class v0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->TAG:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mPostEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    new-instance v0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, v1}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;-><init>(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$1;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mCurrentFrameCallback:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

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
.end method

.method static synthetic access$100(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->stopFrameCallback()V

    return-void
.end method

.method static synthetic access$200(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->driveEventBeats()V

    return-void
.end method

.method static synthetic access$300(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;)Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mCurrentFrameCallback:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;

    return-object p0
.end method

.method static synthetic access$400(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method private driveEventBeats()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mPostEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;

    .line 18
    .line 19
    invoke-interface {v1}, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;->onBatchEventDispatched()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
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

.method private maybePostFrameCallbackFromNonUI()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mCurrentFrameCallback:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;->maybePostFromNonUI()V

    .line 8
    .line 9
    .line 10
    :cond_0
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

.method private stopFrameCallback()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mCurrentFrameCallback:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;->stop()V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public addBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mPostEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public dispatchAllEvents()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->maybePostFrameCallbackFromNonUI()V

    return-void
.end method

.method public dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/Event;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Dispatched event hasn\'t been initialized"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lc6/a;->b(ZLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 11
    .line 12
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lcom/facebook/react/uimanager/events/EventDispatcherListener;

    .line 32
    .line 33
    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/events/EventDispatcherListener;->onEventDispatch(Lcom/facebook/react/uimanager/events/Event;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/events/Event;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/Event;->dispose()V

    .line 43
    .line 44
    .line 45
    return-void
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
.end method

.method public onCatalystInstanceDestroyed()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$1;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$1;-><init>(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->stopFrameCallback()V

    return-void
.end method

.method public onHostPause()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->stopFrameCallback()V

    return-void
.end method

.method public onHostResume()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mCurrentFrameCallback:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$ScheduleDispatchFrameCallback;->resume()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public registerEventEmitter(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->register(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    return-void
.end method

.method public registerEventEmitter(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->register(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    return-void
.end method

.method public removeBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mPostEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public unregisterEventEmitter(I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->mReactEventEmitter:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->unregister(I)V

    return-void
.end method
