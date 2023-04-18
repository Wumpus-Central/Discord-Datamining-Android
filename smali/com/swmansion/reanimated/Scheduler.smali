.class public Lcom/swmansion/reanimated/Scheduler;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mActive:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Ld6/a;
    .end annotation
.end field

.field private final mUIThreadRunnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/swmansion/reanimated/Scheduler;->mActive:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Lcom/swmansion/reanimated/Scheduler$1;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/swmansion/reanimated/Scheduler$1;-><init>(Lcom/swmansion/reanimated/Scheduler;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/swmansion/reanimated/Scheduler;->mUIThreadRunnable:Ljava/lang/Runnable;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/swmansion/reanimated/Scheduler;->initHybrid()Lcom/facebook/jni/HybridData;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/swmansion/reanimated/Scheduler;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/swmansion/reanimated/Scheduler;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 26
    .line 27
    return-void
.end method

.method static synthetic access$000(Lcom/swmansion/reanimated/Scheduler;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/swmansion/reanimated/Scheduler;->mActive:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$100(Lcom/swmansion/reanimated/Scheduler;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/swmansion/reanimated/Scheduler;->mUIThreadRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method private native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method private scheduleOnUI()V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    .line 1
    new-instance v0, Lcom/swmansion/reanimated/Scheduler$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/reanimated/Scheduler;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->getExceptionHandler()Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1}, Lcom/swmansion/reanimated/Scheduler$2;-><init>(Lcom/swmansion/reanimated/Scheduler;Lcom/facebook/react/bridge/JSExceptionHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

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
.end method


# virtual methods
.method public deactivate()V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/reanimated/Scheduler;->mActive:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public native triggerUI()V
.end method
