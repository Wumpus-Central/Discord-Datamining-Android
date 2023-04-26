.class public final Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView$Companion;",
        "",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "",
        "b",
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

    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView$Companion;Landroid/view/ViewGroup;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView$Companion;->b(Landroid/view/ViewGroup;)Z

    move-result p0

    return p0
.end method

.method private final b(Landroid/view/ViewGroup;)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :goto_0
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    instance-of v1, p1, Lcom/swmansion/gesturehandler/react/c;

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    instance-of v1, p1, Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    instance-of v1, p1, Lcom/facebook/react/uimanager/RootView;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_3
    return v0
    .line 33
    .line 34
    .line 35
.end method
