.class public final Lue/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lue/b;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "ue/b$c",
        "Ljava/lang/Runnable;",
        "",
        "run",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic k:Lue/b;


# direct methods
.method constructor <init>(Lue/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lue/b$c;->k:Lue/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
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
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lue/b$c;->k:Lue/b;

    .line 2
    .line 3
    invoke-static {v0}, Lue/b;->b(Lue/b;)Landroid/widget/OverScroller;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lue/b$c;->k:Lue/b;

    .line 14
    .line 15
    invoke-static {v0}, Lue/b;->d(Lue/b;)Lte/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lte/a;->f()Z

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lue/b$c;->k:Lue/b;

    .line 23
    .line 24
    invoke-static {v0}, Lue/b;->a(Lue/b;)Landroid/view/GestureDetector;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lue/b$c;->k:Lue/b;

    .line 34
    .line 35
    invoke-static {v0}, Lue/b;->b(Lue/b;)Landroid/widget/OverScroller;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    new-instance v0, Lcom/otaliastudios/zoom/ScaledPoint;

    .line 46
    .line 47
    iget-object v1, p0, Lue/b$c;->k:Lue/b;

    .line 48
    .line 49
    invoke-static {v1}, Lue/b;->b(Lue/b;)Landroid/widget/OverScroller;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    int-to-float v1, v1

    .line 58
    iget-object v2, p0, Lue/b$c;->k:Lue/b;

    .line 59
    .line 60
    invoke-static {v2}, Lue/b;->b(Lue/b;)Landroid/widget/OverScroller;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    int-to-float v2, v2

    .line 69
    invoke-direct {v0, v1, v2}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lue/b$c;->k:Lue/b;

    .line 73
    .line 74
    invoke-static {v1}, Lue/b;->c(Lue/b;)Lve/b;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v2, Lue/b$c$a;

    .line 79
    .line 80
    invoke-direct {v2, v0}, Lue/b$c$a;-><init>(Lcom/otaliastudios/zoom/ScaledPoint;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lve/b;->g(Lkotlin/jvm/functions/Function1;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lue/b$c;->k:Lue/b;

    .line 87
    .line 88
    invoke-static {v0}, Lue/b;->c(Lue/b;)Lve/b;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, p0}, Lve/b;->C(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    :goto_0
    return-void
    .line 96
    .line 97
.end method
