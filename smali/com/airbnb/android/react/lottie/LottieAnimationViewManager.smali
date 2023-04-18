.class Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lg2/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final COMMAND_PAUSE:I = 0x3

.field private static final COMMAND_PLAY:I = 0x1

.field private static final COMMAND_RESET:I = 0x2

.field private static final COMMAND_RESUME:I = 0x4

.field private static final REACT_CLASS:Ljava/lang/String; = "LottieAnimationView"

.field private static final TAG:Ljava/lang/String; = "LottieAnimationViewManager"

.field private static final VERSION:I = 0x1


# instance fields
.field private propManagersMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg2/h;",
            "Lcom/airbnb/android/react/lottie/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->propManagersMap:Ljava/util/Map;

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
.end method

.method static synthetic access$000(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lg2/h;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->sendOnAnimationFinishEvent(Lg2/h;Z)V

    return-void
.end method

.method static synthetic access$100(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lg2/h;)Lcom/airbnb/android/react/lottie/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p0

    return-object p0
.end method

.method private getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->propManagersMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/airbnb/android/react/lottie/a;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/airbnb/android/react/lottie/a;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/airbnb/android/react/lottie/a;-><init>(Lg2/h;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->propManagersMap:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
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
.end method

.method private sendOnAnimationFinishEvent(Lg2/h;Z)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "isCancelled"

    .line 6
    .line 7
    invoke-interface {v0, v1, p2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :goto_0
    instance-of v1, p2, Landroid/content/ContextWrapper;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    instance-of v1, p2, Lcom/facebook/react/bridge/ReactContext;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast p2, Lcom/facebook/react/bridge/ReactContext;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p2, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p2, 0x0

    .line 33
    :goto_1
    if-eqz p2, :cond_2

    .line 34
    .line 35
    const-class v1, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 36
    .line 37
    invoke-virtual {p2, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const-string v1, "animationFinish"

    .line 48
    .line 49
    invoke-interface {p2, p1, v1, v0}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
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
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lg2/h;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lg2/h;
    .locals 1

    .line 2
    new-instance v0, Lg2/h;

    invoke-direct {v0, p1}, Lg2/h;-><init>(Landroid/content/Context;)V

    .line 3
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 4
    new-instance p1, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;

    invoke-direct {p1, p0, v0}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;-><init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lg2/h;)V

    invoke-virtual {v0, p1}, Lg2/h;->i(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method

.method public getCommandsMap()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "play"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "reset"

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "pause"

    .line 16
    .line 17
    const/4 v5, 0x3

    .line 18
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const-string v6, "resume"

    .line 23
    .line 24
    const/4 v7, 0x4

    .line 25
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static/range {v0 .. v7}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public getExportedCustomBubblingEventTypeConstants()Ljava/util/Map;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/common/MapBuilder;->builder()Lcom/facebook/react/common/MapBuilder$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "bubbled"

    .line 6
    .line 7
    const-string v2, "onAnimationFinish"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "phasedRegistrationNames"

    .line 14
    .line 15
    invoke-static {v2, v1}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "animationFinish"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/facebook/react/common/MapBuilder$Builder;->build()Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
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
.end method

.method public getExportedViewConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/common/MapBuilder;->builder()Lcom/facebook/react/common/MapBuilder$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "VERSION"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/facebook/react/common/MapBuilder$Builder;->build()Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
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
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "LottieAnimationView"

    return-object v0
.end method

.method protected bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lg2/h;

    invoke-virtual {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->onAfterUpdateTransaction(Lg2/h;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lg2/h;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/airbnb/android/react/lottie/a;->a()V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lg2/h;

    invoke-virtual {p0, p1, p2, p3}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->receiveCommand(Lg2/h;ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lg2/h;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 p3, 0x2

    if-eq p2, p3, :cond_2

    const/4 p3, 0x3

    if-eq p2, p3, :cond_1

    const/4 p3, 0x4

    if-eq p2, p3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p3, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$e;

    invoke-direct {p3, p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$e;-><init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lg2/h;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 3
    :cond_1
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p3, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$d;

    invoke-direct {p3, p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$d;-><init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lg2/h;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 4
    :cond_2
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p3, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;

    invoke-direct {p3, p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;-><init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lg2/h;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 5
    :cond_3
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;

    invoke-direct {v0, p0, p3, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;-><init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lcom/facebook/react/bridge/ReadableArray;Lg2/h;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public setCacheComposition(Lg2/h;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cacheComposition"
    .end annotation

    invoke-virtual {p1, p2}, Lg2/h;->setCacheComposition(Z)V

    return-void
.end method

.method public setColorFilters(Lg2/h;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "colorFilters"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->d(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setEnableMergePaths(Lg2/h;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "enableMergePathsAndroidForKitKatAndAbove"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->e(Z)V

    return-void
.end method

.method public setImageAssetsFolder(Lg2/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "imageAssetsFolder"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->f(Ljava/lang/String;)V

    return-void
.end method

.method public setLoop(Lg2/h;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "loop"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->g(Z)V

    return-void
.end method

.method public setProgress(Lg2/h;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "progress"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->h(Ljava/lang/Float;)V

    return-void
.end method

.method public setRenderMode(Lg2/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "renderMode"
    .end annotation

    .line 1
    const-string v0, "AUTOMATIC"

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p2, Lg2/q0;->k:Lg2/q0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "HARDWARE"

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p2, Lg2/q0;->l:Lg2/q0;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v0, "SOFTWARE"

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    sget-object p2, Lg2/q0;->m:Lg2/q0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 p2, 0x0

    .line 35
    :goto_0
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->i(Lg2/q0;)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method

.method public setResizeMode(Lg2/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "resizeMode"
    .end annotation

    .line 1
    const-string v0, "cover"

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "contain"

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v0, "center"

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 p2, 0x0

    .line 35
    :goto_0
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->j(Landroid/widget/ImageView$ScaleType;)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method

.method public setSourceJson(Lg2/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sourceJson"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public setSourceName(Lg2/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sourceName"
    .end annotation

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p2, ".json"

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :cond_0
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->c(Ljava/lang/String;)V

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
.end method

.method public setSourceURL(Lg2/h;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sourceURL"
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$f;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$f;-><init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Ljava/lang/String;Lg2/h;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public setSpeed(Lg2/h;D)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "speed"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    double-to-float p2, p2

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->k(F)V

    return-void
.end method

.method public setTextFilters(Lg2/h;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "textFiltersAndroid"
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lg2/h;)Lcom/airbnb/android/react/lottie/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/airbnb/android/react/lottie/a;->l(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method
