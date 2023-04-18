.class final Lio/sentry/android/core/internal/gestures/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/internal/gestures/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private c:F

.field private d:F


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->a:Ljava/lang/String;

    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/sentry/android/core/internal/gestures/g$b;->b:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->c:F

    .line 5
    iput v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->d:F

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/android/core/internal/gestures/g$a;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lio/sentry/android/core/internal/gestures/g$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lio/sentry/android/core/internal/gestures/g$b;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lio/sentry/android/core/internal/gestures/g$b;->b:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic b(Lio/sentry/android/core/internal/gestures/g$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/sentry/android/core/internal/gestures/g$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lio/sentry/android/core/internal/gestures/g$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/g$b;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lio/sentry/android/core/internal/gestures/g$b;Landroid/view/MotionEvent;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/internal/gestures/g$b;->i(Landroid/view/MotionEvent;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lio/sentry/android/core/internal/gestures/g$b;)V
    .locals 0

    invoke-direct {p0}, Lio/sentry/android/core/internal/gestures/g$b;->j()V

    return-void
.end method

.method static synthetic f(Lio/sentry/android/core/internal/gestures/g$b;F)F
    .locals 0

    iput p1, p0, Lio/sentry/android/core/internal/gestures/g$b;->c:F

    return p1
.end method

.method static synthetic g(Lio/sentry/android/core/internal/gestures/g$b;F)F
    .locals 0

    iput p1, p0, Lio/sentry/android/core/internal/gestures/g$b;->d:F

    return p1
.end method

.method static synthetic h(Lio/sentry/android/core/internal/gestures/g$b;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/internal/gestures/g$b;->k(Landroid/view/View;)V

    return-void
.end method

.method private i(Landroid/view/MotionEvent;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lio/sentry/android/core/internal/gestures/g$b;->c:F

    .line 6
    .line 7
    sub-float/2addr v0, v1

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget v1, p0, Lio/sentry/android/core/internal/gestures/g$b;->d:F

    .line 13
    .line 14
    sub-float/2addr p1, v1

    .line 15
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    cmpl-float v1, v1, v2

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    cmpl-float p1, v0, v2

    .line 29
    .line 30
    if-lez p1, :cond_0

    .line 31
    .line 32
    const-string p1, "right"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p1, "left"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    cmpl-float p1, p1, v2

    .line 39
    .line 40
    if-lez p1, :cond_2

    .line 41
    .line 42
    const-string p1, "down"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-string p1, "up"

    .line 46
    .line 47
    :goto_0
    return-object p1
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
.end method

.method private j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->c:F

    .line 11
    .line 12
    iput v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->d:F

    .line 13
    .line 14
    return-void
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

.method private k(Landroid/view/View;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/g$b;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method
