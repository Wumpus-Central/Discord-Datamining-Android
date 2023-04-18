.class Landroidx/camera/core/v2$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/v2;->v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/core/util/b;

.field final synthetic b:Landroid/view/Surface;

.field final synthetic c:Landroidx/camera/core/v2;


# direct methods
.method constructor <init>(Landroidx/camera/core/v2;Landroidx/core/util/b;Landroid/view/Surface;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/v2$d;->c:Landroidx/camera/core/v2;

    iput-object p2, p0, Landroidx/camera/core/v2$d;->a:Landroidx/core/util/b;

    iput-object p3, p0, Landroidx/camera/core/v2$d;->b:Landroid/view/Surface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/v2$d;->b(Ljava/lang/Void;)V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Landroidx/camera/core/v2$d;->a:Landroidx/core/util/b;

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/camera/core/v2$d;->b:Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/core/v2$f;->c(ILandroid/view/Surface;)Landroidx/camera/core/v2$f;

    move-result-object v0

    invoke-interface {p1, v0}, Landroidx/core/util/b;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroidx/camera/core/v2$e;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Camera surface session should only fail with request cancellation. Instead failed due to:\n"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {v0, p1}, Landroidx/core/util/g;->j(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Landroidx/camera/core/v2$d;->a:Landroidx/core/util/b;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iget-object v1, p0, Landroidx/camera/core/v2$d;->b:Landroid/view/Surface;

    .line 27
    .line 28
    invoke-static {v0, v1}, Landroidx/camera/core/v2$f;->c(ILandroid/view/Surface;)Landroidx/camera/core/v2$f;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {p1, v0}, Landroidx/core/util/b;->accept(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
