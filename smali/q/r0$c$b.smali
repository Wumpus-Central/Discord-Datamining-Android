.class Lq/r0$c$b;
.super Lw/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/r0$c;->p(Lw/n0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:Lq/r0$c;


# direct methods
.method constructor <init>(Lq/r0$c;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    iput-object p1, p0, Lq/r0$c$b;->b:Lq/r0$c;

    iput-object p2, p0, Lq/r0$c$b;->a:Landroidx/concurrent/futures/c$a;

    invoke-direct {p0}, Lw/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lq/r0$c$b;->a:Landroidx/concurrent/futures/c$a;

    new-instance v1, Landroidx/camera/core/j1;

    const/4 v2, 0x3

    const/4 v3, 0x0

    const-string v4, "Capture request is cancelled because camera is closed"

    invoke-direct {v1, v2, v4, v3}, Landroidx/camera/core/j1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public b(Lw/t;)V
    .locals 1

    iget-object p1, p0, Lq/r0$c$b;->a:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lw/m;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Capture request failed with reason "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lw/m;->a()Lw/m$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lq/r0$c$b;->a:Landroidx/concurrent/futures/c$a;

    .line 23
    .line 24
    new-instance v1, Landroidx/camera/core/j1;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, v2, p1, v3}, Landroidx/camera/core/j1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
