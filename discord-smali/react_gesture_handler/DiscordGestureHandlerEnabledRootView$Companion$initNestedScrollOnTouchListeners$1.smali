.class final Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;->initNestedScrollOnTouchListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroid/view/View;",
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "Landroid/view/MotionEvent;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroid/view/View;",
        "view",
        "Lkotlin/Function1;",
        "Landroid/view/MotionEvent;",
        "",
        "callback",
        "invoke",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;

    invoke-direct {v0}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;-><init>()V

    sput-object v0, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;->INSTANCE:Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1, p2}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion$initNestedScrollOnTouchListeners$1;->invoke(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;->Companion:Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;

    invoke-virtual {v0, p1}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;->get$react_gesture_handler_release(Landroid/view/View;)Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;

    move-result-object p1

    invoke-static {p1}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;->access$getSupplementalMotionEventReceivedCallbacks$p(Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;)Ljava/util/Map;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
