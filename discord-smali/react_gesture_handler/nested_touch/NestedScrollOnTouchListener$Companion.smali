.class public final Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011RB\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cRB\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000e\u0010\n\"\u0004\u0008\u000f\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;",
        "",
        "Lkotlin/Function2;",
        "Landroid/view/View;",
        "Lkotlin/Function1;",
        "Landroid/view/MotionEvent;",
        "",
        "onAddNativeEventListener",
        "Lkotlin/jvm/functions/Function2;",
        "getOnAddNativeEventListener",
        "()Lkotlin/jvm/functions/Function2;",
        "setOnAddNativeEventListener",
        "(Lkotlin/jvm/functions/Function2;)V",
        "onRemoveNativeEventListener",
        "getOnRemoveNativeEventListener",
        "setOnRemoveNativeEventListener",
        "<init>",
        "()V",
        "react_gesture_handler_release"
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

    invoke-direct {p0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOnAddNativeEventListener()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->access$getOnAddNativeEventListener$cp()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    return-object v0
.end method

.method public final getOnRemoveNativeEventListener()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->access$getOnRemoveNativeEventListener$cp()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    return-object v0
.end method

.method public final setOnAddNativeEventListener(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->access$setOnAddNativeEventListener$cp(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final setOnRemoveNativeEventListener(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->access$setOnRemoveNativeEventListener$cp(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method
