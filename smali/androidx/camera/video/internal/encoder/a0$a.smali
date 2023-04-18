.class Landroidx/camera/video/internal/encoder/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/video/internal/encoder/a0;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Landroidx/camera/video/internal/encoder/x0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/video/internal/encoder/a0;


# direct methods
.method constructor <init>(Landroidx/camera/video/internal/encoder/a0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$a;->a:Landroidx/camera/video/internal/encoder/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/camera/video/internal/encoder/x0;

    invoke-virtual {p0, p1}, Landroidx/camera/video/internal/encoder/a0$a;->b(Landroidx/camera/video/internal/encoder/x0;)V

    return-void
.end method

.method public b(Landroidx/camera/video/internal/encoder/x0;)V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/camera/video/internal/encoder/a0;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p1, v0, v1}, Landroidx/camera/video/internal/encoder/x0;->e(J)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-interface {p1, v0}, Landroidx/camera/video/internal/encoder/x0;->c(Z)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/x0;->d()Z

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/x0;->b()Lfc/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Landroidx/camera/video/internal/encoder/a0$a$a;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Landroidx/camera/video/internal/encoder/a0$a$a;-><init>(Landroidx/camera/video/internal/encoder/a0$a;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$a;->a:Landroidx/camera/video/internal/encoder/a0;

    .line 25
    .line 26
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    invoke-static {p1, v0, v1}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$a;->a:Landroidx/camera/video/internal/encoder/a0;

    const/4 v1, 0x0

    const-string v2, "Unable to acquire InputBuffer."

    invoke-virtual {v0, v1, v2, p1}, Landroidx/camera/video/internal/encoder/a0;->q(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
