.class Landroidx/camera/core/g2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/g2;-><init>(IIILandroid/os/Handler;Lw/p0;Lw/o0;Lw/w0;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Landroid/view/Surface;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/g2;


# direct methods
.method constructor <init>(Landroidx/camera/core/g2;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/g2$a;->a:Landroidx/camera/core/g2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/view/Surface;

    invoke-virtual {p0, p1}, Landroidx/camera/core/g2$a;->b(Landroid/view/Surface;)V

    return-void
.end method

.method public b(Landroid/view/Surface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g2$a;->a:Landroidx/camera/core/g2;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/camera/core/g2;->m:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/g2$a;->a:Landroidx/camera/core/g2;

    .line 7
    .line 8
    iget-object v1, v1, Landroidx/camera/core/g2;->u:Lw/o0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-interface {v1, p1, v2}, Lw/o0;->b(Landroid/view/Surface;I)V

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "ProcessingSurfaceTextur"

    .line 2
    .line 3
    const-string v1, "Failed to extract Listenable<Surface>."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
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
