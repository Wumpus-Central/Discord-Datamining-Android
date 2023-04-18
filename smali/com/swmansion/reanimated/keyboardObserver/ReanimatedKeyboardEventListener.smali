.class public Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;,
        Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;
    }
.end annotation


# instance fields
.field private final listeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/swmansion/reanimated/NativeProxy$KeyboardEventDataUpdater;",
            ">;"
        }
    .end annotation
.end field

.field private nextListenerId:I

.field private final reactContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;"
        }
    .end annotation
.end field

.field private state:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->nextListenerId:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->listeners:Ljava/util/HashMap;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->reactContext:Ljava/lang/ref/WeakReference;

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
.end method

.method public static synthetic a(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->bringBackWindowInsets()V

    return-void
.end method

.method static synthetic access$002(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;)Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->state:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    return-object p1
.end method

.method static synthetic access$100(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->updateKeyboard(I)V

    return-void
.end method

.method public static synthetic b(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->setupWindowInsets()V

    return-void
.end method

.method private bringBackWindowInsets()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->reactContext:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, v1}, Landroidx/core/view/r2;->b(Landroid/view/Window;Z)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {v0, v1}, Landroidx/core/view/w0;->D0(Landroid/view/View;Landroidx/core/view/r0;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->getRootView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, v1}, Landroidx/core/view/w0;->M0(Landroid/view/View;Landroidx/core/view/t2$b;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->getRootView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget v1, Lcom/swmansion/reanimated/R$id;->action_bar_root:I

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 51
    .line 52
    const/4 v2, -0x1

    .line 53
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    .line 62
    .line 63
    return-void
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
.end method

.method public static synthetic c(Landroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->lambda$setupWindowInsets$0(Landroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method private getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->reactContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic lambda$setupWindowInsets$0(Landroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$m;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p2, p1}, Landroidx/core/view/WindowInsetsCompat;->f(I)Landroidx/core/graphics/Insets;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Landroidx/core/graphics/Insets;->b:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget v0, Lcom/swmansion/reanimated/R$id;->action_bar_root:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1, p1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    return-object p2
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
    .line 127
    .line 128
    .line 129
.end method

.method private removeCallbacks()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/swmansion/reanimated/keyboardObserver/a;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/swmansion/reanimated/keyboardObserver/a;-><init>(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {v0, v1}, Landroidx/core/view/w0;->M0(Landroid/view/View;Landroidx/core/view/t2$b;)V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method private setUpCallbacks()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/swmansion/reanimated/keyboardObserver/c;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/swmansion/reanimated/keyboardObserver/c;-><init>(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    new-instance v1, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;-><init>(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Landroidx/core/view/w0;->M0(Landroid/view/View;Landroidx/core/view/t2$b;)V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method private setupWindowInsets()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->reactContext:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v1, v2}, Landroidx/core/view/r2;->b(Landroid/view/Window;Z)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lcom/swmansion/reanimated/keyboardObserver/b;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lcom/swmansion/reanimated/keyboardObserver/b;-><init>(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Landroidx/core/view/w0;->D0(Landroid/view/View;Landroidx/core/view/r0;)V

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
.end method

.method private updateKeyboard(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->listeners:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/swmansion/reanimated/NativeProxy$KeyboardEventDataUpdater;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->state:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;->asInt()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2, p1}, Lcom/swmansion/reanimated/NativeProxy$KeyboardEventDataUpdater;->keyboardEventDataUpdater(II)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public subscribeForKeyboardEvents(Lcom/swmansion/reanimated/NativeProxy$KeyboardEventDataUpdater;)I
    .locals 3

    .line 1
    iget v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->nextListenerId:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->nextListenerId:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->listeners:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->setUpCallbacks()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->listeners:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return v0
.end method

.method public unsubscribeFromKeyboardEvents(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->listeners:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->listeners:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->removeCallbacks()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
