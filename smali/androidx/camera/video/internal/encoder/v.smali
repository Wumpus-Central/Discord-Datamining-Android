.class public final synthetic Landroidx/camera/video/internal/encoder/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0;

.field public final synthetic l:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/v;->k:Landroidx/camera/video/internal/encoder/a0;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/v;->l:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/v;->k:Landroidx/camera/video/internal/encoder/a0;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/v;->l:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0;->h(Landroidx/camera/video/internal/encoder/a0;Ljava/lang/Runnable;)V

    return-void
.end method
