.class final Landroidx/camera/core/q0;
.super Landroidx/camera/core/p0;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/p0;-><init>()V

    return-void
.end method


# virtual methods
.method d(Lw/m1;)Landroidx/camera/core/ImageProxy;
    .locals 0

    invoke-interface {p1}, Lw/m1;->g()Landroidx/camera/core/ImageProxy;

    move-result-object p1

    return-object p1
.end method

.method g()V
    .locals 0

    return-void
.end method

.method p(Landroidx/camera/core/ImageProxy;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/core/p0;->e(Landroidx/camera/core/ImageProxy;)Lfc/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/camera/core/q0$a;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Landroidx/camera/core/q0$a;-><init>(Landroidx/camera/core/q0;Landroidx/camera/core/ImageProxy;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v0, v1, p1}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method
