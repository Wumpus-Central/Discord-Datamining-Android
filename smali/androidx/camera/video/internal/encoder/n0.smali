.class public final synthetic Landroidx/camera/video/internal/encoder/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0$f;

.field public final synthetic l:Landroid/media/MediaCodec$BufferInfo;

.field public final synthetic m:Landroid/media/MediaCodec;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/n0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/n0;->l:Landroid/media/MediaCodec$BufferInfo;

    iput-object p3, p0, Landroidx/camera/video/internal/encoder/n0;->m:Landroid/media/MediaCodec;

    iput p4, p0, Landroidx/camera/video/internal/encoder/n0;->n:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/n0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/n0;->l:Landroid/media/MediaCodec$BufferInfo;

    iget-object v2, p0, Landroidx/camera/video/internal/encoder/n0;->m:Landroid/media/MediaCodec;

    iget v3, p0, Landroidx/camera/video/internal/encoder/n0;->n:I

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/video/internal/encoder/a0$f;->i(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    return-void
.end method
