.class public final synthetic Landroidx/camera/video/internal/encoder/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/j$a;

.field public final synthetic l:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/j$a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/w0;->k:Landroidx/camera/video/internal/encoder/j$a;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/w0;->l:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/w0;->k:Landroidx/camera/video/internal/encoder/j$a;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/w0;->l:Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0$g;->b(Landroidx/camera/video/internal/encoder/j$a;Landroid/view/Surface;)V

    return-void
.end method
