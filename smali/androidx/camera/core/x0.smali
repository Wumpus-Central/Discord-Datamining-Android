.class public final synthetic Landroidx/camera/core/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/g1;

.field public final synthetic l:Landroidx/camera/core/g1$i;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/g1;Landroidx/camera/core/g1$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/x0;->k:Landroidx/camera/core/g1;

    iput-object p2, p0, Landroidx/camera/core/x0;->l:Landroidx/camera/core/g1$i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/x0;->k:Landroidx/camera/core/g1;

    iget-object v1, p0, Landroidx/camera/core/x0;->l:Landroidx/camera/core/g1$i;

    invoke-static {v0, v1}, Landroidx/camera/core/g1;->M(Landroidx/camera/core/g1;Landroidx/camera/core/g1$i;)V

    return-void
.end method
