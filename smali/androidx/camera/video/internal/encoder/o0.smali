.class public final synthetic Landroidx/camera/video/internal/encoder/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0$f;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0$f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/o0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iput p2, p0, Landroidx/camera/video/internal/encoder/o0;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/o0;->k:Landroidx/camera/video/internal/encoder/a0$f;

    iget v1, p0, Landroidx/camera/video/internal/encoder/o0;->l:I

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0$f;->d(Landroidx/camera/video/internal/encoder/a0$f;I)V

    return-void
.end method
