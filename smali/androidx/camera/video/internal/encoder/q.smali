.class public final synthetic Landroidx/camera/video/internal/encoder/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0;

.field public final synthetic l:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/q;->k:Landroidx/camera/video/internal/encoder/a0;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/q;->l:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/q;->k:Landroidx/camera/video/internal/encoder/a0;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/q;->l:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0;->l(Landroidx/camera/video/internal/encoder/a0;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
