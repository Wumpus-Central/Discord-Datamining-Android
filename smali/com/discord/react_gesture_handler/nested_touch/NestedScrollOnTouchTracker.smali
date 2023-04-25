.class public final Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 &2\u00020\u0001:\u0001&BU\u0008\u0000\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\u0008\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\u0016\u0008\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\'\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;",
        "",
        "Landroid/view/View;",
        "view",
        "",
        "cleanUp",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "isSupplementalEvent",
        "handleTouch$react_gesture_handler_release",
        "(Landroid/view/View;Landroid/view/MotionEvent;Z)Z",
        "handleTouch",
        "Landroid/view/View$OnClickListener;",
        "onClickListener",
        "Landroid/view/View$OnClickListener;",
        "Landroid/view/View$OnLongClickListener;",
        "onLongClickListener",
        "Landroid/view/View$OnLongClickListener;",
        "Lkotlin/Function1;",
        "onTrackingStart",
        "Lkotlin/jvm/functions/Function1;",
        "onTrackingFinish",
        "Lkotlinx/coroutines/Job;",
        "job",
        "Lkotlinx/coroutines/Job;",
        "doClickOnUp",
        "Z",
        "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;",
        "originTracker",
        "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;",
        "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;",
        "spanBeingTouched",
        "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Companion",
        "react_gesture_handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final CLICK_MAX_DOWN_TIME:J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;

.field private static final LONG_PRESS_DOWN_TIME:J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private doClickOnUp:Z

.field private job:Lkotlinx/coroutines/Job;

.field private final onClickListener:Landroid/view/View$OnClickListener;

.field private final onLongClickListener:Landroid/view/View$OnLongClickListener;

.field private final onTrackingFinish:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTrackingStart:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final originTracker:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;

.field private spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->Companion:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v0, v0

    .line 14
    sput-wide v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->CLICK_MAX_DOWN_TIME:J

    .line 15
    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-long v0, v0

    .line 21
    sput-wide v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->LONG_PRESS_DOWN_TIME:J

    .line 22
    .line 23
    return-void
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

.method public constructor <init>(Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/View$OnClickListener;",
            "Landroid/view/View$OnLongClickListener;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onClickListener:Landroid/view/View$OnClickListener;

    .line 3
    iput-object p3, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 4
    iput-object p4, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onTrackingStart:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p5, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onTrackingFinish:Lkotlin/jvm/functions/Function1;

    .line 6
    new-instance p2, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;

    invoke-direct {p2, p1}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->originTracker:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p4

    :goto_0
    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 7
    invoke-direct/range {v1 .. v6}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;-><init>(Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$cleanUp(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->cleanUp(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getCLICK_MAX_DOWN_TIME$cp()J
    .locals 2

    sget-wide v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->CLICK_MAX_DOWN_TIME:J

    return-wide v0
.end method

.method public static final synthetic access$getCompanion$p()Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;
    .locals 1

    sget-object v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->Companion:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;

    return-object v0
.end method

.method public static final synthetic access$getLONG_PRESS_DOWN_TIME$cp()J
    .locals 2

    sget-wide v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->LONG_PRESS_DOWN_TIME:J

    return-wide v0
.end method

.method public static final synthetic access$getOnLongClickListener$p(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;)Landroid/view/View$OnLongClickListener;
    .locals 0

    iget-object p0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onLongClickListener:Landroid/view/View$OnLongClickListener;

    return-object p0
.end method

.method public static final synthetic access$getSpanBeingTouched$p(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;)Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;
    .locals 0

    iget-object p0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    return-object p0
.end method

.method public static final synthetic access$setDoClickOnUp$p(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->doClickOnUp:Z

    return-void
.end method

.method private final cleanUp(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->originTracker:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->cleanUp()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->job:Lkotlinx/coroutines/Job;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$a;->a(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onTrackingFinish:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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


# virtual methods
.method public final handleTouch$react_gesture_handler_release(Landroid/view/View;Landroid/view/MotionEvent;Z)Z
    .locals 11

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p1, Landroid/widget/TextView;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move-object v0, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, p1

    .line 19
    :goto_0
    check-cast v0, Landroid/widget/TextView;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v0, :cond_e

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_5

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    instance-of v5, v4, Landroid/text/Spannable;

    .line 36
    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    check-cast v4, Landroid/text/Spannable;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v4, v1

    .line 43
    :goto_1
    if-nez v4, :cond_3

    .line 44
    .line 45
    :cond_2
    :goto_2
    new-array v4, v3, [Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    float-to-int v5, v5

    .line 53
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    sub-int/2addr v5, v6

    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    add-int/2addr v5, v6

    .line 63
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    float-to-int v6, v6

    .line 68
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    sub-int/2addr v6, v7

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    add-int/2addr v6, v7

    .line 78
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {v7, v6}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v7, v6}, Landroid/text/Layout;->getLineRight(I)F

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual {v8, v6}, Landroid/text/Layout;->getLineLeft(I)F

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    int-to-float v9, v5

    .line 103
    cmpl-float v7, v9, v7

    .line 104
    .line 105
    if-gtz v7, :cond_2

    .line 106
    .line 107
    if-ltz v5, :cond_4

    .line 108
    .line 109
    cmpg-float v5, v9, v8

    .line 110
    .line 111
    if-gez v5, :cond_4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v5, v6, v9}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const-class v6, Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 123
    .line 124
    invoke-interface {v4, v5, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-string v5, "spannableText.getSpans(\n\u2026     T::class.java,\n    )"

    .line 129
    .line 130
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    check-cast v4, [Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move-object v4, v1

    .line 137
    :goto_4
    if-eqz v4, :cond_8

    .line 138
    .line 139
    array-length v5, v4

    .line 140
    if-nez v5, :cond_6

    .line 141
    .line 142
    move v5, v2

    .line 143
    goto :goto_5

    .line 144
    :cond_6
    move v5, v3

    .line 145
    :goto_5
    if-eqz v5, :cond_7

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_7
    move v5, v3

    .line 149
    goto :goto_7

    .line 150
    :cond_8
    :goto_6
    move v5, v2

    .line 151
    :goto_7
    if-nez v5, :cond_e

    .line 152
    .line 153
    array-length v5, v4

    .line 154
    if-nez v5, :cond_9

    .line 155
    .line 156
    move v5, v2

    .line 157
    goto :goto_8

    .line 158
    :cond_9
    move v5, v3

    .line 159
    :goto_8
    if-eqz v5, :cond_a

    .line 160
    .line 161
    move-object v5, v1

    .line 162
    goto :goto_a

    .line 163
    :cond_a
    aget-object v5, v4, v3

    .line 164
    .line 165
    invoke-static {v4}, Lkotlin/collections/b;->I([Ljava/lang/Object;)I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-nez v6, :cond_b

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_b
    invoke-interface {v5}, Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;->getTouchPriority()Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 177
    .line 178
    invoke-direct {v8, v2, v6}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8}, Lkotlin/ranges/a;->h()Lmf/p;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    :cond_c
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_d

    .line 190
    .line 191
    invoke-virtual {v6}, Lmf/p;->nextInt()I

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    aget-object v8, v4, v8

    .line 196
    .line 197
    invoke-interface {v8}, Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;->getTouchPriority()Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-interface {v7, v9}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-gez v10, :cond_c

    .line 206
    .line 207
    move-object v5, v8

    .line 208
    move-object v7, v9

    .line 209
    goto :goto_9

    .line 210
    :cond_d
    :goto_a
    invoke-static {v5}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iput-object v5, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 214
    .line 215
    if-eqz v5, :cond_e

    .line 216
    .line 217
    invoke-interface {v5, v0}, Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;->enableHighlight(Landroid/widget/TextView;)V

    .line 218
    .line 219
    .line 220
    :cond_e
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_18

    .line 225
    .line 226
    if-eq v0, v2, :cond_12

    .line 227
    .line 228
    const/4 v1, 0x2

    .line 229
    if-eq v0, v1, :cond_10

    .line 230
    .line 231
    const/4 p2, 0x3

    .line 232
    if-eq v0, p2, :cond_f

    .line 233
    .line 234
    return v3

    .line 235
    :cond_f
    invoke-direct {p0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->cleanUp(Landroid/view/View;)V

    .line 236
    .line 237
    .line 238
    return v2

    .line 239
    :cond_10
    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->originTracker:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;

    .line 240
    .line 241
    invoke-virtual {v0, p3, p2}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->hasOriginMoved(ZLandroid/view/MotionEvent;)Z

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    if-nez p2, :cond_11

    .line 246
    .line 247
    return v3

    .line 248
    :cond_11
    invoke-direct {p0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->cleanUp(Landroid/view/View;)V

    .line 249
    .line 250
    .line 251
    iput-boolean v3, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->doClickOnUp:Z

    .line 252
    .line 253
    return v3

    .line 254
    :cond_12
    iget-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 255
    .line 256
    if-nez p2, :cond_13

    .line 257
    .line 258
    iget-boolean p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->doClickOnUp:Z

    .line 259
    .line 260
    if-eqz p2, :cond_13

    .line 261
    .line 262
    iget-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onClickListener:Landroid/view/View$OnClickListener;

    .line 263
    .line 264
    if-eqz p2, :cond_13

    .line 265
    .line 266
    invoke-virtual {p1, v2}, Landroid/view/View;->setPressed(Z)V

    .line 267
    .line 268
    .line 269
    :cond_13
    iget-boolean p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->doClickOnUp:Z

    .line 270
    .line 271
    if-eqz p2, :cond_15

    .line 272
    .line 273
    iput-boolean v3, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->doClickOnUp:Z

    .line 274
    .line 275
    iget-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 276
    .line 277
    if-eqz p2, :cond_14

    .line 278
    .line 279
    if-eqz p2, :cond_15

    .line 280
    .line 281
    invoke-interface {p2, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;->onClick(Landroid/view/View;)V

    .line 282
    .line 283
    .line 284
    goto :goto_b

    .line 285
    :cond_14
    iget-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onClickListener:Landroid/view/View$OnClickListener;

    .line 286
    .line 287
    if-eqz p2, :cond_15

    .line 288
    .line 289
    invoke-interface {p2, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    :cond_15
    :goto_b
    invoke-direct {p0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->cleanUp(Landroid/view/View;)V

    .line 293
    .line 294
    .line 295
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 296
    .line 297
    if-nez p1, :cond_17

    .line 298
    .line 299
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onClickListener:Landroid/view/View$OnClickListener;

    .line 300
    .line 301
    if-eqz p1, :cond_16

    .line 302
    .line 303
    goto :goto_c

    .line 304
    :cond_16
    move v2, v3

    .line 305
    :cond_17
    :goto_c
    return v2

    .line 306
    :cond_18
    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->originTracker:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;

    .line 307
    .line 308
    invoke-virtual {v0, p3, p2}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->hasOriginMoved(ZLandroid/view/MotionEvent;)Z

    .line 309
    .line 310
    .line 311
    if-eqz p3, :cond_19

    .line 312
    .line 313
    return v3

    .line 314
    :cond_19
    iget-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onTrackingStart:Lkotlin/jvm/functions/Function1;

    .line 315
    .line 316
    if-eqz p2, :cond_1a

    .line 317
    .line 318
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    :cond_1a
    iput-boolean v2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->doClickOnUp:Z

    .line 322
    .line 323
    iget-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->job:Lkotlinx/coroutines/Job;

    .line 324
    .line 325
    if-eqz p2, :cond_1b

    .line 326
    .line 327
    invoke-static {p2, v1, v2, v1}, Lkotlinx/coroutines/Job$a;->a(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_1b
    invoke-static {p1, v2}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->attachedScope(Landroid/view/View;Z)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    const/4 v5, 0x0

    .line 335
    const/4 v6, 0x0

    .line 336
    new-instance v7, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$handleTouch$2;

    .line 337
    .line 338
    invoke-direct {v7, p0, p1, v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$handleTouch$2;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;Landroid/view/View;Lkotlin/coroutines/Continuation;)V

    .line 339
    .line 340
    .line 341
    const/4 v8, 0x3

    .line 342
    const/4 v9, 0x0

    .line 343
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    iput-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->job:Lkotlinx/coroutines/Job;

    .line 348
    .line 349
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->spanBeingTouched:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;

    .line 350
    .line 351
    if-nez p1, :cond_1d

    .line 352
    .line 353
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->onLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 354
    .line 355
    if-eqz p1, :cond_1c

    .line 356
    .line 357
    goto :goto_d

    .line 358
    :cond_1c
    move v2, v3

    .line 359
    :cond_1d
    :goto_d
    return v2
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
.end method
