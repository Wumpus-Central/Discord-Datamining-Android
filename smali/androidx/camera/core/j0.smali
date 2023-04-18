.class public final synthetic Landroidx/camera/core/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/j2;

.field public final synthetic l:Landroidx/camera/core/j2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/j2;Landroidx/camera/core/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/j0;->k:Landroidx/camera/core/j2;

    iput-object p2, p0, Landroidx/camera/core/j0;->l:Landroidx/camera/core/j2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/j0;->k:Landroidx/camera/core/j2;

    iget-object v1, p0, Landroidx/camera/core/j0;->l:Landroidx/camera/core/j2;

    invoke-static {v0, v1}, Landroidx/camera/core/m0;->M(Landroidx/camera/core/j2;Landroidx/camera/core/j2;)V

    return-void
.end method
