.class public final synthetic Landroidx/camera/video/internal/encoder/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0$f;

.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:Landroidx/camera/video/internal/encoder/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0$f;Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/s0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/s0;->l:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/camera/video/internal/encoder/s0;->m:Landroidx/camera/video/internal/encoder/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/s0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/s0;->l:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/camera/video/internal/encoder/s0;->m:Landroidx/camera/video/internal/encoder/l;

    invoke-static {v0, v1, v2}, Landroidx/camera/video/internal/encoder/a0$f;->c(Landroidx/camera/video/internal/encoder/a0$f;Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/l;)V

    return-void
.end method
