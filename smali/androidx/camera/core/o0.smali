.class public final synthetic Landroidx/camera/core/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/p0;

.field public final synthetic l:Landroidx/camera/core/ImageProxy;

.field public final synthetic m:Landroid/graphics/Matrix;

.field public final synthetic n:Landroidx/camera/core/ImageProxy;

.field public final synthetic o:Landroid/graphics/Rect;

.field public final synthetic p:Landroidx/camera/core/m0$a;

.field public final synthetic q:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/p0;Landroidx/camera/core/ImageProxy;Landroid/graphics/Matrix;Landroidx/camera/core/ImageProxy;Landroid/graphics/Rect;Landroidx/camera/core/m0$a;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/o0;->k:Landroidx/camera/core/p0;

    iput-object p2, p0, Landroidx/camera/core/o0;->l:Landroidx/camera/core/ImageProxy;

    iput-object p3, p0, Landroidx/camera/core/o0;->m:Landroid/graphics/Matrix;

    iput-object p4, p0, Landroidx/camera/core/o0;->n:Landroidx/camera/core/ImageProxy;

    iput-object p5, p0, Landroidx/camera/core/o0;->o:Landroid/graphics/Rect;

    iput-object p6, p0, Landroidx/camera/core/o0;->p:Landroidx/camera/core/m0$a;

    iput-object p7, p0, Landroidx/camera/core/o0;->q:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Landroidx/camera/core/o0;->k:Landroidx/camera/core/p0;

    iget-object v1, p0, Landroidx/camera/core/o0;->l:Landroidx/camera/core/ImageProxy;

    iget-object v2, p0, Landroidx/camera/core/o0;->m:Landroid/graphics/Matrix;

    iget-object v3, p0, Landroidx/camera/core/o0;->n:Landroidx/camera/core/ImageProxy;

    iget-object v4, p0, Landroidx/camera/core/o0;->o:Landroid/graphics/Rect;

    iget-object v5, p0, Landroidx/camera/core/o0;->p:Landroidx/camera/core/m0$a;

    iget-object v6, p0, Landroidx/camera/core/o0;->q:Landroidx/concurrent/futures/c$a;

    invoke-static/range {v0 .. v6}, Landroidx/camera/core/p0;->c(Landroidx/camera/core/p0;Landroidx/camera/core/ImageProxy;Landroid/graphics/Matrix;Landroidx/camera/core/ImageProxy;Landroid/graphics/Rect;Landroidx/camera/core/m0$a;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
