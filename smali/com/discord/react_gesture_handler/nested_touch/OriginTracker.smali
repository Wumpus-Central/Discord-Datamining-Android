.class public final Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000c\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
        "origin",
        "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;",
        "originSupplemental",
        "scaledTouchSlopPx",
        "",
        "cleanUp",
        "",
        "hasOriginMoved",
        "",
        "isSupplementalEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "x",
        "",
        "y",
        "Origin",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private origin:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

.field private originSupplemental:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

.field private final scaledTouchSlopPx:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->context:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->scaledTouchSlopPx:I

    .line 20
    .line 21
    return-void
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

.method private final hasOriginMoved(Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;FF)Z
    .locals 1

    .line 7
    invoke-virtual {p1}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;->getXOrigin()F

    move-result v0

    sub-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget v0, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->scaledTouchSlopPx:I

    int-to-float v0, v0

    cmpl-float p2, p2, v0

    if-gtz p2, :cond_1

    invoke-virtual {p1}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;->getYOrigin()F

    move-result p1

    sub-float/2addr p3, p1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->scaledTouchSlopPx:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public final cleanUp()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->origin:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->originSupplemental:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final hasOriginMoved(ZLandroid/view/MotionEvent;)Z
    .locals 4

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    .line 1
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->originSupplemental:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {p1, v2, v3}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;-><init>(FF)V

    iput-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->originSupplemental:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->originSupplemental:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-direct {p0, p1, v2, p2}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->hasOriginMoved(Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;FF)Z

    move-result p1

    if-ne p1, v1, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    if-eqz p1, :cond_5

    return v1

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->origin:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    if-nez p1, :cond_3

    .line 5
    new-instance p1, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {p1, v2, v3}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;-><init>(FF)V

    iput-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->origin:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->origin:Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;

    if-eqz p1, :cond_4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-direct {p0, p1, v2, p2}, Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;->hasOriginMoved(Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;FF)Z

    move-result p1

    if-ne p1, v1, :cond_4

    move p1, v1

    goto :goto_1

    :cond_4
    move p1, v0

    :goto_1
    if-eqz p1, :cond_5

    return v1

    :cond_5
    return v0
.end method
