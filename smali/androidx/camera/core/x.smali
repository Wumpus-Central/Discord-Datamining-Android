.class public final synthetic Landroidx/camera/core/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/z;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:Ljava/util/concurrent/Executor;

.field public final synthetic n:Landroidx/concurrent/futures/c$a;

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/z;Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/x;->k:Landroidx/camera/core/z;

    iput-object p2, p0, Landroidx/camera/core/x;->l:Landroid/content/Context;

    iput-object p3, p0, Landroidx/camera/core/x;->m:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Landroidx/camera/core/x;->n:Landroidx/concurrent/futures/c$a;

    iput-wide p5, p0, Landroidx/camera/core/x;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Landroidx/camera/core/x;->k:Landroidx/camera/core/z;

    iget-object v1, p0, Landroidx/camera/core/x;->l:Landroid/content/Context;

    iget-object v2, p0, Landroidx/camera/core/x;->m:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Landroidx/camera/core/x;->n:Landroidx/concurrent/futures/c$a;

    iget-wide v4, p0, Landroidx/camera/core/x;->o:J

    invoke-static/range {v0 .. v5}, Landroidx/camera/core/z;->b(Landroidx/camera/core/z;Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method
