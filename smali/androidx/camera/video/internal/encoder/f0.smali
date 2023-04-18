.class public final synthetic Landroidx/camera/video/internal/encoder/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0$d;

.field public final synthetic l:Lw/a2$a;

.field public final synthetic m:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/f0;->k:Landroidx/camera/video/internal/encoder/a0$d;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/f0;->l:Lw/a2$a;

    iput-object p3, p0, Landroidx/camera/video/internal/encoder/f0;->m:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/f0;->k:Landroidx/camera/video/internal/encoder/a0$d;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/f0;->l:Lw/a2$a;

    iget-object v2, p0, Landroidx/camera/video/internal/encoder/f0;->m:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Landroidx/camera/video/internal/encoder/a0$d;->g(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method
