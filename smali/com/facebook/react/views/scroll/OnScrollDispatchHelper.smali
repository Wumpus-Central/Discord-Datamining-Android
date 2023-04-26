.class public Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MIN_EVENT_SEPARATION_MS:I = 0xa


# instance fields
.field private mLastScrollEventTimeMs:J

.field private mPrevX:I

.field private mPrevY:I

.field private mXFlingVelocity:F

.field private mYFlingVelocity:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    iput v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevX:I

    .line 7
    .line 8
    iput v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevY:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mXFlingVelocity:F

    .line 12
    .line 13
    iput v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mYFlingVelocity:F

    .line 14
    .line 15
    const-wide/16 v0, -0xb

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mLastScrollEventTimeMs:J

    .line 18
    .line 19
    return-void
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
.end method


# virtual methods
.method public getXFlingVelocity()F
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mXFlingVelocity:F

    return v0
.end method

.method public getYFlingVelocity()F
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mYFlingVelocity:F

    return v0
.end method

.method public onScrollChanged(II)Z
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mLastScrollEventTimeMs:J

    .line 6
    .line 7
    sub-long v4, v0, v2

    .line 8
    .line 9
    const-wide/16 v6, 0xa

    .line 10
    .line 11
    cmp-long v4, v4, v6

    .line 12
    .line 13
    if-gtz v4, :cond_1

    .line 14
    .line 15
    iget v4, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevX:I

    .line 16
    .line 17
    if-ne v4, p1, :cond_1

    .line 18
    .line 19
    iget v4, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevY:I

    .line 20
    .line 21
    if-eq v4, p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 v4, 0x1

    .line 27
    :goto_1
    sub-long v5, v0, v2

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    cmp-long v5, v5, v7

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    iget v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevX:I

    .line 36
    .line 37
    sub-int v5, p1, v5

    .line 38
    .line 39
    int-to-float v5, v5

    .line 40
    sub-long v6, v0, v2

    .line 41
    .line 42
    long-to-float v6, v6

    .line 43
    div-float/2addr v5, v6

    .line 44
    iput v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mXFlingVelocity:F

    .line 45
    .line 46
    iget v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevY:I

    .line 47
    .line 48
    sub-int v5, p2, v5

    .line 49
    .line 50
    int-to-float v5, v5

    .line 51
    sub-long v2, v0, v2

    .line 52
    .line 53
    long-to-float v2, v2

    .line 54
    div-float/2addr v5, v2

    .line 55
    iput v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mYFlingVelocity:F

    .line 56
    .line 57
    :cond_2
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mLastScrollEventTimeMs:J

    .line 58
    .line 59
    iput p1, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevX:I

    .line 60
    .line 61
    iput p2, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->mPrevY:I

    .line 62
    .line 63
    return v4
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
.end method
