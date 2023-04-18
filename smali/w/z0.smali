.class public final synthetic Lw/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ljava/util/concurrent/Executor;

.field public final synthetic l:Lfc/b;

.field public final synthetic m:Landroidx/concurrent/futures/c$a;

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lfc/b;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/z0;->k:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lw/z0;->l:Lfc/b;

    iput-object p3, p0, Lw/z0;->m:Landroidx/concurrent/futures/c$a;

    iput-wide p4, p0, Lw/z0;->n:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lw/z0;->k:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lw/z0;->l:Lfc/b;

    iget-object v2, p0, Lw/z0;->m:Landroidx/concurrent/futures/c$a;

    iget-wide v3, p0, Lw/z0;->n:J

    invoke-static {v0, v1, v2, v3, v4}, Lw/b1;->d(Ljava/util/concurrent/Executor;Lfc/b;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method
