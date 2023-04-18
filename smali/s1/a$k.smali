.class Ls1/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/a;->q(Ljava/lang/Runnable;)Lfc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/concurrent/futures/d;

.field final synthetic l:Ljava/lang/Runnable;

.field final synthetic m:Ls1/a;


# direct methods
.method constructor <init>(Ls1/a;Landroidx/concurrent/futures/d;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Ls1/a$k;->m:Ls1/a;

    iput-object p2, p0, Ls1/a$k;->k:Landroidx/concurrent/futures/d;

    iput-object p3, p0, Ls1/a$k;->l:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/a$k;->k:Landroidx/concurrent/futures/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/concurrent/futures/a;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Ls1/a$k;->l:Ljava/lang/Runnable;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ls1/a$k;->k:Landroidx/concurrent/futures/d;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/d;->p(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    iget-object v1, p0, Ls1/a$k;->k:Landroidx/concurrent/futures/d;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroidx/concurrent/futures/d;->q(Ljava/lang/Throwable;)Z

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
