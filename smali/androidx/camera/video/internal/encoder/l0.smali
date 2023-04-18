.class public final synthetic Landroidx/camera/video/internal/encoder/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0$f;

.field public final synthetic l:Landroid/media/MediaCodec$CodecException;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$CodecException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/l0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/l0;->l:Landroid/media/MediaCodec$CodecException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/l0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/l0;->l:Landroid/media/MediaCodec$CodecException;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0$f;->b(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$CodecException;)V

    return-void
.end method
