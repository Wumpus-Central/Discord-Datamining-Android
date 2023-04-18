.class public final synthetic Landroidx/camera/video/internal/encoder/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/l;

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/l;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/y;->k:Landroidx/camera/video/internal/encoder/l;

    iput p2, p0, Landroidx/camera/video/internal/encoder/y;->l:I

    iput-object p3, p0, Landroidx/camera/video/internal/encoder/y;->m:Ljava/lang/String;

    iput-object p4, p0, Landroidx/camera/video/internal/encoder/y;->n:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/y;->k:Landroidx/camera/video/internal/encoder/l;

    iget v1, p0, Landroidx/camera/video/internal/encoder/y;->l:I

    iget-object v2, p0, Landroidx/camera/video/internal/encoder/y;->m:Ljava/lang/String;

    iget-object v3, p0, Landroidx/camera/video/internal/encoder/y;->n:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/video/internal/encoder/a0;->e(Landroidx/camera/video/internal/encoder/l;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
