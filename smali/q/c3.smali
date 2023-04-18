.class final Lq/c3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq/c3$b;,
        Lq/c3$a;
    }
.end annotation


# instance fields
.field private final a:Lq/c3$b;


# direct methods
.method constructor <init>(Lq/c3$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/c3;->a:Lq/c3$b;

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
.end method


# virtual methods
.method a(ILjava/util/List;Lq/r2$a;)Ls/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ls/b;",
            ">;",
            "Lq/r2$a;",
            ")",
            "Ls/q;"
        }
    .end annotation

    iget-object v0, p0, Lq/c3;->a:Lq/c3$b;

    invoke-interface {v0, p1, p2, p3}, Lq/c3$b;->g(ILjava/util/List;Lq/r2$a;)Ls/q;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lq/c3;->a:Lq/c3$b;

    invoke-interface {v0}, Lq/c3$b;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method c(Landroid/hardware/camera2/CameraDevice;Ls/q;Ljava/util/List;)Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Ls/q;",
            "Ljava/util/List<",
            "Lw/w0;",
            ">;)",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq/c3;->a:Lq/c3$b;

    invoke-interface {v0, p1, p2, p3}, Lq/c3$b;->m(Landroid/hardware/camera2/CameraDevice;Ls/q;Ljava/util/List;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method d(Ljava/util/List;J)Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/w0;",
            ">;J)",
            "Lfc/b<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lq/c3;->a:Lq/c3$b;

    invoke-interface {v0, p1, p2, p3}, Lq/c3$b;->l(Ljava/util/List;J)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method e()Z
    .locals 1

    iget-object v0, p0, Lq/c3;->a:Lq/c3$b;

    invoke-interface {v0}, Lq/c3$b;->stop()Z

    move-result v0

    return v0
.end method
