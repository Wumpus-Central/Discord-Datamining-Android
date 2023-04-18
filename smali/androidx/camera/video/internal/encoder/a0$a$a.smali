.class Landroidx/camera/video/internal/encoder/a0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/video/internal/encoder/a0$a;->b(Landroidx/camera/video/internal/encoder/x0;)V
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
.field final synthetic a:Landroidx/camera/video/internal/encoder/a0$a;


# direct methods
.method constructor <init>(Landroidx/camera/video/internal/encoder/a0$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$a$a;->a:Landroidx/camera/video/internal/encoder/a0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/video/internal/encoder/a0$a$a;->b(Ljava/lang/Void;)V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroid/media/MediaCodec$CodecException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$a$a;->a:Landroidx/camera/video/internal/encoder/a0$a;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0$a;->a:Landroidx/camera/video/internal/encoder/a0;

    .line 8
    .line 9
    check-cast p1, Landroid/media/MediaCodec$CodecException;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/encoder/a0;->r(Landroid/media/MediaCodec$CodecException;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$a$a;->a:Landroidx/camera/video/internal/encoder/a0$a;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0$a;->a:Landroidx/camera/video/internal/encoder/a0;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, v2, v1, p1}, Landroidx/camera/video/internal/encoder/a0;->q(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
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
