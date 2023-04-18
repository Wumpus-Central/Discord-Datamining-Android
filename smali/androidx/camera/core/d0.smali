.class public final synthetic Landroidx/camera/core/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/e0;

.field public final synthetic l:Landroidx/camera/core/ImageProxy;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/e0;Landroidx/camera/core/ImageProxy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/d0;->k:Landroidx/camera/core/e0;

    iput-object p2, p0, Landroidx/camera/core/d0;->l:Landroidx/camera/core/ImageProxy;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/d0;->k:Landroidx/camera/core/e0;

    iget-object v1, p0, Landroidx/camera/core/d0;->l:Landroidx/camera/core/ImageProxy;

    invoke-static {v0, v1}, Landroidx/camera/core/e0;->e(Landroidx/camera/core/e0;Landroidx/camera/core/ImageProxy;)V

    return-void
.end method
