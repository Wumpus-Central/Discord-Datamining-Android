.class final Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$1;
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
        "Landroid/view/View;",
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
        "view",
        "Landroid/view/View;",
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
.field final synthetic this$0:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;


# direct methods
.method constructor <init>(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$1;->this$0:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$1;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->Companion:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;

    invoke-virtual {v0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;->getOnAddNativeEventListener()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$1;->this$0:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;

    invoke-static {v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->access$getOnSupplementalMotionEventReceived$p(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method