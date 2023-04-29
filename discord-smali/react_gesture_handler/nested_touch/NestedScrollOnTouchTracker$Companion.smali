.class final Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;",
        "",
        "()V",
        "CLICK_MAX_DOWN_TIME",
        "",
        "getCLICK_MAX_DOWN_TIME",
        "()J",
        "LONG_PRESS_DOWN_TIME",
        "getLONG_PRESS_DOWN_TIME",
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

    invoke-direct {p0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCLICK_MAX_DOWN_TIME()J
    .locals 2

    invoke-static {}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->access$getCLICK_MAX_DOWN_TIME$cp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getLONG_PRESS_DOWN_TIME()J
    .locals 2

    invoke-static {}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->access$getLONG_PRESS_DOWN_TIME$cp()J

    move-result-wide v0

    return-wide v0
.end method
