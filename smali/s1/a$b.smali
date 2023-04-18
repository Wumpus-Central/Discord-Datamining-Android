.class Ls1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/a;->p(Landroidx/concurrent/futures/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lfc/b;

.field final synthetic l:Landroidx/concurrent/futures/d;

.field final synthetic m:Ls1/a;


# direct methods
.method constructor <init>(Ls1/a;Lfc/b;Landroidx/concurrent/futures/d;)V
    .locals 0

    iput-object p1, p0, Ls1/a$b;->m:Ls1/a;

    iput-object p2, p0, Ls1/a$b;->k:Lfc/b;

    iput-object p3, p0, Ls1/a$b;->l:Landroidx/concurrent/futures/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ls1/a$b;->k:Lfc/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls1/a$b;->l:Landroidx/concurrent/futures/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/d;->p(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception v0

    .line 14
    iget-object v1, p0, Ls1/a$b;->l:Landroidx/concurrent/futures/d;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroidx/concurrent/futures/d;->q(Ljava/lang/Throwable;)Z

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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
