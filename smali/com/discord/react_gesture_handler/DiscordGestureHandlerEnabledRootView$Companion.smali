.class public final Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008\u000bJ\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0008\u0010\r\u001a\u00020\u000eH\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;",
        "",
        "()V",
        "gestureHandlersToRootView",
        "Ljava/util/WeakHashMap;",
        "Landroid/view/View;",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;",
        "find",
        "view",
        "get",
        "get$react_gesture_handler_release",
        "getNullable",
        "initNestedScrollOnTouchListeners",
        "",
        "react_gesture_handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getNullable(Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;->getNullable(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$initNestedScrollOnTouchListeners(Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;->initNestedScrollOnTouchListeners()V

    return-void
.end method

.method private final find(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    check-cast p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-static {p1}, Landroidx/core/view/k2;->a(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/view/View;

    .line 33
    .line 34
    sget-object v1, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;->Companion:Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;->find(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    const/4 p1, 0x0

    .line 44
    return-object p1
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method private final getNullable(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/facebook/react/bridge/ReactContext;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, Lcom/discord/misc/utilities/activity/ActivityExtensionsKt;->getRootView(Landroid/app/Activity;)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_2
    invoke-static {}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;->access$getGestureHandlersToRootView$cp()Ljava/util/WeakHashMap;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move-object p1, v2

    .line 52
    :goto_1
    if-eqz p1, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    move-object v2, p1

    .line 61
    :cond_4
    if-nez v2, :cond_6

    .line 62
    .line 63
    :cond_5
    invoke-static {}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;->access$getGestureHandlersToRootView$cp()Ljava/util/WeakHashMap;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    const-string p1, "rootView"

    .line 71
    .line 72
    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, v0}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;->find(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    invoke-static {}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;->access$getGestureHandlersToRootView$cp()Ljava/util/WeakHashMap;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 86
    .line 87
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_6
    return-object v2
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method private final initNestedScrollOnTouchListeners()V
    .locals 2

    .line 1
    sget-object v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->Companion:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;

    .line 2
    .line 3
    sget-object v1, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;->INSTANCE:Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;->setOnAddNativeEventListener(Lkotlin/jvm/functions/Function2;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$2;->INSTANCE:Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$2;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;->setOnRemoveNativeEventListener(Lkotlin/jvm/functions/Function2;)V

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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method


# virtual methods
.method public final get$react_gesture_handler_release(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;->getNullable(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method
