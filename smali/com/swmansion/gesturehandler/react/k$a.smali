.class public final Lcom/swmansion/gesturehandler/react/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/gesturehandler/react/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ%\u0010\u0006\u001a\u00020\u0005\"\u000e\u0008\u0000\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\t\u001a\u00020\u0008\"\u000e\u0008\u0000\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0013\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/react/k$a;",
        "",
        "Lcf/d;",
        "T",
        "handler",
        "Lcom/swmansion/gesturehandler/react/k;",
        "b",
        "(Lcf/d;)Lcom/swmansion/gesturehandler/react/k;",
        "Lcom/facebook/react/bridge/WritableMap;",
        "a",
        "(Lcf/d;)Lcom/facebook/react/bridge/WritableMap;",
        "Landroidx/core/util/Pools$SynchronizedPool;",
        "EVENTS_POOL",
        "Landroidx/core/util/Pools$SynchronizedPool;",
        "",
        "EVENT_NAME",
        "Ljava/lang/String;",
        "",
        "EVENT_TOUCH_CANCELLED",
        "I",
        "EVENT_TOUCH_DOWN",
        "EVENT_TOUCH_MOVE",
        "EVENT_TOUCH_UP",
        "EVENT_UNDETERMINED",
        "TOUCH_EVENTS_POOL_SIZE",
        "<init>",
        "()V",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcf/d;)Lcom/facebook/react/bridge/WritableMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcf/d<",
            "TT;>;>(TT;)",
            "Lcom/facebook/react/bridge/WritableMap;"
        }
    .end annotation

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lcf/d;->P()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "handlerTag"

    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcf/d;->O()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const-string v2, "state"

    .line 24
    .line 25
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    const-string v1, "numberOfTouches"

    .line 29
    .line 30
    invoke-virtual {p1}, Lcf/d;->R()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-interface {v0, v1, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    const-string v1, "eventType"

    .line 38
    .line 39
    invoke-virtual {p1}, Lcf/d;->Q()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-interface {v0, v1, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcf/d;->s()Lcom/facebook/react/bridge/WritableArray;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    const-string v3, "changedTouches"

    .line 53
    .line 54
    invoke-interface {v0, v3, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {p1}, Lcf/d;->r()Lcom/facebook/react/bridge/WritableArray;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    const-string v3, "allTouches"

    .line 64
    .line 65
    invoke-interface {v0, v3, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {p1}, Lcf/d;->X()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1}, Lcf/d;->O()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    const/4 v1, 0x4

    .line 79
    if-ne p1, v1, :cond_2

    .line 80
    .line 81
    const/4 p1, 0x2

    .line 82
    invoke-interface {v0, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    :cond_2
    const-string p1, "createMap().apply {\n    \u2026TATE_BEGAN)\n      }\n    }"

    .line 86
    .line 87
    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method

.method public final b(Lcf/d;)Lcom/swmansion/gesturehandler/react/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcf/d<",
            "TT;>;>(TT;)",
            "Lcom/swmansion/gesturehandler/react/k;"
        }
    .end annotation

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/swmansion/gesturehandler/react/k;->a()Landroidx/core/util/Pools$SynchronizedPool;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroidx/core/util/Pools$SynchronizedPool;->acquire()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/swmansion/gesturehandler/react/k;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lcom/swmansion/gesturehandler/react/k;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/react/k;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {v0, p1}, Lcom/swmansion/gesturehandler/react/k;->b(Lcom/swmansion/gesturehandler/react/k;Lcf/d;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
