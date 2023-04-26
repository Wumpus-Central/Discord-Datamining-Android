.class public Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/scroll/ReactScrollViewHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReactScrollViewScrollState"
.end annotation


# instance fields
.field private mDecelerationRate:F

.field private final mFinalAnimatedPositionScroll:Landroid/graphics/Point;

.field private mIsCanceled:Z

.field private mIsFinished:Z

.field private final mLastStateUpdateScroll:Landroid/graphics/Point;

.field private final mLayoutDirection:I

.field private mScrollAwayPaddingTop:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mFinalAnimatedPositionScroll:Landroid/graphics/Point;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mScrollAwayPaddingTop:I

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/Point;

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    invoke-direct {v1, v2, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mLastStateUpdateScroll:Landroid/graphics/Point;

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mIsCanceled:Z

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mIsFinished:Z

    .line 26
    .line 27
    const v0, 0x3f7c28f6    # 0.985f

    .line 28
    .line 29
    .line 30
    iput v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mDecelerationRate:F

    .line 31
    .line 32
    iput p1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mLayoutDirection:I

    .line 33
    .line 34
    return-void
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
.end method


# virtual methods
.method public getDecelerationRate()F
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mDecelerationRate:F

    return v0
.end method

.method public getFinalAnimatedPositionScroll()Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mFinalAnimatedPositionScroll:Landroid/graphics/Point;

    return-object v0
.end method

.method public getIsCanceled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mIsCanceled:Z

    return v0
.end method

.method public getIsFinished()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mIsFinished:Z

    return v0
.end method

.method public getLastStateUpdateScroll()Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mLastStateUpdateScroll:Landroid/graphics/Point;

    return-object v0
.end method

.method public getLayoutDirection()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mLayoutDirection:I

    return v0
.end method

.method public getScrollAwayPaddingTop()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mScrollAwayPaddingTop:I

    return v0
.end method

.method public setDecelerationRate(F)Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mDecelerationRate:F

    return-object p0
.end method

.method public setFinalAnimatedPositionScroll(II)Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mFinalAnimatedPositionScroll:Landroid/graphics/Point;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    return-object p0
.end method

.method public setIsCanceled(Z)Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mIsCanceled:Z

    return-object p0
.end method

.method public setIsFinished(Z)Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mIsFinished:Z

    return-object p0
.end method

.method public setLastStateUpdateScroll(II)Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mLastStateUpdateScroll:Landroid/graphics/Point;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    return-object p0
.end method

.method public setScrollAwayPaddingTop(I)Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;->mScrollAwayPaddingTop:I

    return-object p0
.end method
