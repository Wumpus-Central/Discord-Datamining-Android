.class final Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;-><init>(Landroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/MotionEvent;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "event",
        "Landroid/view/MotionEvent;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $view:Landroid/view/View;

.field final synthetic this$0:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;


# direct methods
.method constructor <init>(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;->this$0:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;

    iput-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;->$view:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;->invoke(Landroid/view/MotionEvent;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/MotionEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;->this$0:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;

    invoke-static {v0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->access$getViewTouchTracker$p(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;)Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;->$view:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->handleTouch$react_gesture_handler_release(Landroid/view/View;Landroid/view/MotionEvent;Z)Z

    return-void
.end method
