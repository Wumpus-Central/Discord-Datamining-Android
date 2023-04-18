.class public final synthetic Lq/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/k3;

.field public final synthetic l:Landroidx/concurrent/futures/c$a;

.field public final synthetic m:Landroidx/camera/core/d3;


# direct methods
.method public synthetic constructor <init>(Lq/k3;Landroidx/concurrent/futures/c$a;Landroidx/camera/core/d3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/j3;->k:Lq/k3;

    iput-object p2, p0, Lq/j3;->l:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Lq/j3;->m:Landroidx/camera/core/d3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq/j3;->k:Lq/k3;

    iget-object v1, p0, Lq/j3;->l:Landroidx/concurrent/futures/c$a;

    iget-object v2, p0, Lq/j3;->m:Landroidx/camera/core/d3;

    invoke-static {v0, v1, v2}, Lq/k3;->a(Lq/k3;Landroidx/concurrent/futures/c$a;Landroidx/camera/core/d3;)V

    return-void
.end method
