.class Li0/c1$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/c1$b;->f(Li0/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/util/concurrent/ScheduledFuture;

.field final synthetic c:Li0/c1$b;


# direct methods
.method constructor <init>(Li0/c1$b;ZLjava/util/concurrent/ScheduledFuture;)V
    .locals 0

    iput-object p1, p0, Li0/c1$b$a;->c:Li0/c1$b;

    iput-boolean p2, p0, Li0/c1$b$a;->a:Z

    iput-object p3, p0, Li0/c1$b$a;->b:Ljava/util/concurrent/ScheduledFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Li0/c1$b$a;->b(Ljava/lang/Void;)V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li0/c1$b$a;->c:Li0/c1$b;

    .line 2
    .line 3
    iget-object p1, p1, Li0/c1$b;->a:Li0/c1;

    .line 4
    .line 5
    invoke-virtual {p1}, Li0/c1;->T()Li0/h1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-boolean v0, p0, Li0/c1$b$a;->a:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Li0/h1$a;->k:Li0/h1$a;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Li0/h1$a;->l:Li0/h1$a;

    .line 17
    .line 18
    :goto_0
    invoke-interface {p1, v0}, Li0/h1;->b(Li0/h1$a;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Li0/c1$b$a;->b:Ljava/util/concurrent/ScheduledFuture;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 25
    .line 26
    .line 27
    return-void
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "VideoCapture"

    .line 2
    .line 3
    const-string v1, "The surface update future didn\'t complete."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Landroidx/camera/core/r1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Li0/c1$b$a;->c:Li0/c1$b;

    .line 9
    .line 10
    iget-object p1, p1, Li0/c1$b;->a:Li0/c1;

    .line 11
    .line 12
    invoke-virtual {p1}, Li0/c1;->T()Li0/h1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-boolean v0, p0, Li0/c1$b$a;->a:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Li0/h1$a;->k:Li0/h1$a;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v0, Li0/h1$a;->l:Li0/h1$a;

    .line 24
    .line 25
    :goto_0
    invoke-interface {p1, v0}, Li0/h1;->b(Li0/h1$a;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Li0/c1$b$a;->b:Ljava/util/concurrent/ScheduledFuture;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

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
