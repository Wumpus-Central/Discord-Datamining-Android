.class public final synthetic Landroidx/camera/core/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/z;

.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:J

.field public final synthetic n:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/z;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/y;->k:Landroidx/camera/core/z;

    iput-object p2, p0, Landroidx/camera/core/y;->l:Ljava/util/concurrent/Executor;

    iput-wide p3, p0, Landroidx/camera/core/y;->m:J

    iput-object p5, p0, Landroidx/camera/core/y;->n:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/y;->k:Landroidx/camera/core/z;

    iget-object v1, p0, Landroidx/camera/core/y;->l:Ljava/util/concurrent/Executor;

    iget-wide v2, p0, Landroidx/camera/core/y;->m:J

    iget-object v4, p0, Landroidx/camera/core/y;->n:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/camera/core/z;->c(Landroidx/camera/core/z;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V

    return-void
.end method
