.class public final synthetic Lq/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/h2;

.field public final synthetic l:Landroidx/concurrent/futures/c$a;

.field public final synthetic m:Landroidx/camera/core/g0;


# direct methods
.method public synthetic constructor <init>(Lq/h2;Landroidx/concurrent/futures/c$a;Landroidx/camera/core/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/g2;->k:Lq/h2;

    iput-object p2, p0, Lq/g2;->l:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Lq/g2;->m:Landroidx/camera/core/g0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq/g2;->k:Lq/h2;

    iget-object v1, p0, Lq/g2;->l:Landroidx/concurrent/futures/c$a;

    iget-object v2, p0, Lq/g2;->m:Landroidx/camera/core/g0;

    invoke-static {v0, v1, v2}, Lq/h2;->c(Lq/h2;Landroidx/concurrent/futures/c$a;Landroidx/camera/core/g0;)V

    return-void
.end method
