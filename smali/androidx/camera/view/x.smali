.class public final synthetic Landroidx/camera/view/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/view/a0;

.field public final synthetic l:Landroid/view/Surface;

.field public final synthetic m:Lfc/b;

.field public final synthetic n:Landroidx/camera/core/v2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/a0;Landroid/view/Surface;Lfc/b;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/x;->k:Landroidx/camera/view/a0;

    iput-object p2, p0, Landroidx/camera/view/x;->l:Landroid/view/Surface;

    iput-object p3, p0, Landroidx/camera/view/x;->m:Lfc/b;

    iput-object p4, p0, Landroidx/camera/view/x;->n:Landroidx/camera/core/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/view/x;->k:Landroidx/camera/view/a0;

    iget-object v1, p0, Landroidx/camera/view/x;->l:Landroid/view/Surface;

    iget-object v2, p0, Landroidx/camera/view/x;->m:Lfc/b;

    iget-object v3, p0, Landroidx/camera/view/x;->n:Landroidx/camera/core/v2;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/view/a0;->l(Landroidx/camera/view/a0;Landroid/view/Surface;Lfc/b;Landroidx/camera/core/v2;)V

    return-void
.end method
