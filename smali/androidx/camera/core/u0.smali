.class public final synthetic Landroidx/camera/core/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/g1;

.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:Landroidx/camera/core/g1$i;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/g1;Ljava/util/concurrent/Executor;Landroidx/camera/core/g1$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/u0;->k:Landroidx/camera/core/g1;

    iput-object p2, p0, Landroidx/camera/core/u0;->l:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/camera/core/u0;->m:Landroidx/camera/core/g1$i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/u0;->k:Landroidx/camera/core/g1;

    iget-object v1, p0, Landroidx/camera/core/u0;->l:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/camera/core/u0;->m:Landroidx/camera/core/g1$i;

    invoke-static {v0, v1, v2}, Landroidx/camera/core/g1;->S(Landroidx/camera/core/g1;Ljava/util/concurrent/Executor;Landroidx/camera/core/g1$i;)V

    return-void
.end method
