.class public final Lcom/discord/react_gesture_handler/DiscordGestureHandlerRootViewManager;
.super Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0014\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/DiscordGestureHandlerRootViewManager;",
        "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;",
        "()V",
        "canOverrideExistingModule",
        "",
        "createViewInstance",
        "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public canOverrideExistingModule()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerRootViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    invoke-direct {v0, p1}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
