.class public final synthetic Landroidx/camera/video/internal/encoder/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0$d;

.field public final synthetic l:Lw/a2$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/d0;->k:Landroidx/camera/video/internal/encoder/a0$d;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/d0;->l:Lw/a2$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/d0;->k:Landroidx/camera/video/internal/encoder/a0$d;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/d0;->l:Lw/a2$a;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0$d;->f(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;)V

    return-void
.end method
