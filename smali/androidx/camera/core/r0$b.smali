.class Landroidx/camera/core/r0$b;
.super Landroidx/camera/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final m:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/camera/core/r0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/i0;-><init>(Landroidx/camera/core/ImageProxy;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/camera/core/r0$b;->m:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    new-instance p1, Landroidx/camera/core/s0;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Landroidx/camera/core/s0;-><init>(Landroidx/camera/core/r0$b;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/camera/core/i0;->b(Landroidx/camera/core/i0$a;)V

    .line 17
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
.end method

.method public static synthetic i(Landroidx/camera/core/r0$b;Landroidx/camera/core/ImageProxy;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/r0$b;->p(Landroidx/camera/core/ImageProxy;)V

    return-void
.end method

.method public static synthetic k(Landroidx/camera/core/r0;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/r0$b;->l(Landroidx/camera/core/r0;)V

    return-void
.end method

.method private static synthetic l(Landroidx/camera/core/r0;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/r0;->A()V

    return-void
.end method

.method private synthetic p(Landroidx/camera/core/ImageProxy;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/camera/core/r0$b;->m:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/camera/core/r0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/camera/core/r0;->u:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    new-instance v1, Landroidx/camera/core/t0;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Landroidx/camera/core/t0;-><init>(Landroidx/camera/core/r0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
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
.end method
