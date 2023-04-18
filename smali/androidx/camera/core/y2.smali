.class public final synthetic Landroidx/camera/core/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Z

.field public final synthetic l:Landroid/media/MediaCodec;


# direct methods
.method public synthetic constructor <init>(ZLandroid/media/MediaCodec;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroidx/camera/core/y2;->k:Z

    iput-object p2, p0, Landroidx/camera/core/y2;->l:Landroid/media/MediaCodec;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, Landroidx/camera/core/y2;->k:Z

    iget-object v1, p0, Landroidx/camera/core/y2;->l:Landroid/media/MediaCodec;

    invoke-static {v0, v1}, Landroidx/camera/core/b3;->K(ZLandroid/media/MediaCodec;)V

    return-void
.end method
