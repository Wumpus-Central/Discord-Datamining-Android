.class Landroidx/camera/video/internal/encoder/a0$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/video/internal/encoder/a0$f;->s(Landroidx/camera/video/internal/encoder/g;Landroidx/camera/video/internal/encoder/l;Ljava/util/concurrent/Executor;)V
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
.field final synthetic a:Landroidx/camera/video/internal/encoder/g;

.field final synthetic b:Landroidx/camera/video/internal/encoder/a0$f;


# direct methods
.method constructor <init>(Landroidx/camera/video/internal/encoder/a0$f;Landroidx/camera/video/internal/encoder/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->b:Landroidx/camera/video/internal/encoder/a0$f;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->a:Landroidx/camera/video/internal/encoder/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f$a;->b(Ljava/lang/Void;)V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->b:Landroidx/camera/video/internal/encoder/a0$f;

    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->k:Ljava/util/Set;

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->a:Landroidx/camera/video/internal/encoder/g;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->b:Landroidx/camera/video/internal/encoder/a0$f;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->k:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->a:Landroidx/camera/video/internal/encoder/g;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    instance-of v0, p1, Landroid/media/MediaCodec$CodecException;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->b:Landroidx/camera/video/internal/encoder/a0$f;

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 19
    .line 20
    check-cast p1, Landroid/media/MediaCodec$CodecException;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/encoder/a0;->r(Landroid/media/MediaCodec$CodecException;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f$a;->b:Landroidx/camera/video/internal/encoder/a0$f;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v0, v2, v1, p1}, Landroidx/camera/video/internal/encoder/a0;->q(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
    .line 39
    .line 40
.end method
