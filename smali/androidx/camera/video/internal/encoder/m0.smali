.class public final synthetic Landroidx/camera/video/internal/encoder/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/l;

.field public final synthetic l:Landroidx/camera/video/internal/encoder/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/l;Landroidx/camera/video/internal/encoder/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/m0;->k:Landroidx/camera/video/internal/encoder/l;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/m0;->l:Landroidx/camera/video/internal/encoder/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/m0;->k:Landroidx/camera/video/internal/encoder/l;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/m0;->l:Landroidx/camera/video/internal/encoder/g;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0$f;->h(Landroidx/camera/video/internal/encoder/l;Landroidx/camera/video/internal/encoder/g;)V

    return-void
.end method
