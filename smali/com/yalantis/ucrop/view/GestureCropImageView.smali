.class public Lcom/yalantis/ucrop/view/GestureCropImageView;
.super Lcom/yalantis/ucrop/view/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yalantis/ucrop/view/GestureCropImageView$c;,
        Lcom/yalantis/ucrop/view/GestureCropImageView$b;,
        Lcom/yalantis/ucrop/view/GestureCropImageView$d;
    }
.end annotation


# instance fields
.field private L:Landroid/view/ScaleGestureDetector;

.field private M:Lif/h;

.field private N:Landroid/view/GestureDetector;

.field private O:F

.field private P:F

.field private Q:Z

.field private R:Z

.field private S:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/yalantis/ucrop/view/GestureCropImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->Q:Z

    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->R:Z

    const/4 p1, 0x5

    .line 4
    iput p1, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->S:I

    return-void
.end method

.method static synthetic G(Lcom/yalantis/ucrop/view/GestureCropImageView;)F
    .locals 0

    iget p0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->O:F

    return p0
.end method

.method static synthetic H(Lcom/yalantis/ucrop/view/GestureCropImageView;)F
    .locals 0

    iget p0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->P:F

    return p0
.end method

.method private I()V
    .locals 5

    .line 1
    new-instance v0, Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lcom/yalantis/ucrop/view/GestureCropImageView$b;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, p0, v3}, Lcom/yalantis/ucrop/view/GestureCropImageView$b;-><init>(Lcom/yalantis/ucrop/view/GestureCropImageView;Lcom/yalantis/ucrop/view/GestureCropImageView$a;)V

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->N:Landroid/view/GestureDetector;

    .line 18
    .line 19
    new-instance v0, Landroid/view/ScaleGestureDetector;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Lcom/yalantis/ucrop/view/GestureCropImageView$d;

    .line 26
    .line 27
    invoke-direct {v2, p0, v3}, Lcom/yalantis/ucrop/view/GestureCropImageView$d;-><init>(Lcom/yalantis/ucrop/view/GestureCropImageView;Lcom/yalantis/ucrop/view/GestureCropImageView$a;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, v2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->L:Landroid/view/ScaleGestureDetector;

    .line 34
    .line 35
    new-instance v0, Lif/h;

    .line 36
    .line 37
    new-instance v1, Lcom/yalantis/ucrop/view/GestureCropImageView$c;

    .line 38
    .line 39
    invoke-direct {v1, p0, v3}, Lcom/yalantis/ucrop/view/GestureCropImageView$c;-><init>(Lcom/yalantis/ucrop/view/GestureCropImageView;Lcom/yalantis/ucrop/view/GestureCropImageView$a;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1}, Lif/h;-><init>(Lif/h$a;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->M:Lif/h;

    .line 46
    .line 47
    return-void
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
.end method


# virtual methods
.method public getDoubleTapScaleSteps()I
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->S:I

    return v0
.end method

.method protected getDoubleTapTargetScale()F
    .locals 5

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    move-result v0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    move-result v1

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMinScale()F

    move-result v2

    div-float/2addr v1, v2

    float-to-double v1, v1

    iget v3, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->S:I

    int-to-float v3, v3

    const/high16 v4, 0x3f800000    # 1.0f

    div-float/2addr v4, v3

    float-to-double v3, v4

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v0, v1

    return v0
.end method

.method protected i()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/yalantis/ucrop/view/b;->i()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/GestureCropImageView;->I()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->t()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-le v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-float/2addr v2, v3

    .line 29
    const/high16 v3, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v2, v3

    .line 32
    iput v2, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->O:F

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-float/2addr v0, v2

    .line 43
    div-float/2addr v0, v3

    .line 44
    iput v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->P:F

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->N:Landroid/view/GestureDetector;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 49
    .line 50
    .line 51
    iget-boolean v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->R:Z

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-object v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->L:Landroid/view/ScaleGestureDetector;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-boolean v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->Q:Z

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->M:Lif/h;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lif/h;->d(Landroid/view/MotionEvent;)Z

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    and-int/lit16 p1, p1, 0xff

    .line 74
    .line 75
    if-ne p1, v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->z()V

    .line 78
    .line 79
    .line 80
    :cond_4
    return v1
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
.end method

.method public setDoubleTapScaleSteps(I)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->S:I

    return-void
.end method

.method public setRotateEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->Q:Z

    return-void
.end method

.method public setScaleEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/GestureCropImageView;->R:Z

    return-void
.end method
