.class Lcom/google/android/material/timepicker/ClockFaceView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/timepicker/ClockFaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/google/android/material/timepicker/ClockFaceView;


# direct methods
.method constructor <init>(Lcom/google/android/material/timepicker/ClockFaceView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/timepicker/ClockFaceView$a;->k:Lcom/google/android/material/timepicker/ClockFaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockFaceView$a;->k:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockFaceView$a;->k:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockFaceView$a;->k:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    div-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    iget-object v2, p0, Lcom/google/android/material/timepicker/ClockFaceView$a;->k:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 29
    .line 30
    invoke-static {v2}, Lcom/google/android/material/timepicker/ClockFaceView;->h(Lcom/google/android/material/timepicker/ClockFaceView;)Lcom/google/android/material/timepicker/ClockHandView;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Lcom/google/android/material/timepicker/ClockHandView;->g()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sub-int/2addr v0, v2

    .line 39
    iget-object v2, p0, Lcom/google/android/material/timepicker/ClockFaceView$a;->k:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 40
    .line 41
    invoke-static {v2}, Lcom/google/android/material/timepicker/ClockFaceView;->i(Lcom/google/android/material/timepicker/ClockFaceView;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sub-int/2addr v0, v2

    .line 46
    iget-object v2, p0, Lcom/google/android/material/timepicker/ClockFaceView$a;->k:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Lcom/google/android/material/timepicker/ClockFaceView;->d(I)V

    .line 49
    .line 50
    .line 51
    return v1
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
.end method
