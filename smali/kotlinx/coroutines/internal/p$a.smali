.class public abstract Lkotlinx/coroutines/internal/p$a;
.super Lkotlinx/coroutines/internal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/internal/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\u000c\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u0008H\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\u00082\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00082\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00152\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0008R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001a\u00a8\u0006 "
    }
    d2 = {
        "Lkotlinx/coroutines/internal/p$a;",
        "Lkotlinx/coroutines/internal/b;",
        "Lkotlinx/coroutines/internal/y;",
        "op",
        "Lkotlinx/coroutines/internal/p;",
        "Lkotlinx/coroutines/internal/Node;",
        "m",
        "affected",
        "",
        "e",
        "next",
        "",
        "l",
        "",
        "f",
        "n",
        "Lkotlinx/coroutines/internal/p$c;",
        "prepareOp",
        "g",
        "j",
        "k",
        "Lkotlinx/coroutines/internal/d;",
        "c",
        "failure",
        "a",
        "h",
        "()Lkotlinx/coroutines/internal/p;",
        "affectedNode",
        "i",
        "originalNext",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/coroutines/internal/d;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/internal/d<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p2, 0x0

    .line 6
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/p$a;->h()Lkotlinx/coroutines/internal/p;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/p$a;->i()Lkotlinx/coroutines/internal/p;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    return-void

    .line 20
    :cond_2
    if-eqz p2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/internal/p$a;->n(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    goto :goto_1

    .line 27
    :cond_3
    move-object v2, v1

    .line 28
    :goto_1
    sget-object v3, Lkotlinx/coroutines/internal/p;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 29
    .line 30
    invoke-static {v3, v0, p1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/internal/p$a;->f(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final c(Lkotlinx/coroutines/internal/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/internal/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/p$a;->m(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object p1, Lkotlinx/coroutines/internal/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_1
    iget-object v1, v0, Lkotlinx/coroutines/internal/p;->_next:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ne v1, p1, :cond_2

    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_2
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/d;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_3
    instance-of v3, v1, Lkotlinx/coroutines/internal/y;

    .line 24
    .line 25
    if-eqz v3, :cond_5

    .line 26
    .line 27
    check-cast v1, Lkotlinx/coroutines/internal/y;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lkotlinx/coroutines/internal/y;->b(Lkotlinx/coroutines/internal/y;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    sget-object p1, Lkotlinx/coroutines/internal/c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_4
    invoke-virtual {v1, v0}, Lkotlinx/coroutines/internal/y;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_5
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/internal/p$a;->e(Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_6

    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_6
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/internal/p$a;->l(Lkotlinx/coroutines/internal/p;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    new-instance v3, Lkotlinx/coroutines/internal/p$c;

    .line 56
    .line 57
    move-object v4, v1

    .line 58
    check-cast v4, Lkotlinx/coroutines/internal/p;

    .line 59
    .line 60
    invoke-direct {v3, v0, v4, p0}, Lkotlinx/coroutines/internal/p$c;-><init>(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p$a;)V

    .line 61
    .line 62
    .line 63
    sget-object v4, Lkotlinx/coroutines/internal/p;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 64
    .line 65
    invoke-static {v4, v0, v1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    :try_start_0
    invoke-virtual {v3, v0}, Lkotlinx/coroutines/internal/p$c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sget-object v0, Lkotlinx/coroutines/internal/q;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    if-eq v4, v0, :cond_0

    .line 78
    .line 79
    return-object v2

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    sget-object v2, Lkotlinx/coroutines/internal/p;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 82
    .line 83
    invoke-static {v2, v0, v3, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    throw p1
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method protected abstract e(Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;
.end method

.method protected abstract f(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)V
.end method

.method public abstract g(Lkotlinx/coroutines/internal/p$c;)V
.end method

.method protected abstract h()Lkotlinx/coroutines/internal/p;
.end method

.method protected abstract i()Lkotlinx/coroutines/internal/p;
.end method

.method public j(Lkotlinx/coroutines/internal/p$c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/p$a;->g(Lkotlinx/coroutines/internal/p$c;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public k(Lkotlinx/coroutines/internal/p;)V
    .locals 0

    return-void
.end method

.method protected abstract l(Lkotlinx/coroutines/internal/p;Ljava/lang/Object;)Z
.end method

.method protected abstract m(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/p;
.end method

.method public abstract n(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;
.end method
