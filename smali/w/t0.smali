.class public final Lw/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/a2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lw/a2<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final b:Lw/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/t0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lfc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfc/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/t0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw/t0;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lw/t0;->b:Lw/t0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lw/t0;->a:Lfc/b;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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

.method public static synthetic a(Lw/t0;Lw/a2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lw/t0;->f(Lw/a2$a;)V

    return-void
.end method

.method private synthetic f(Lw/a2$a;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lw/t0;->a:Lfc/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, Lw/a2$a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_1

    .line 11
    :catch_0
    move-exception v0

    .line 12
    goto :goto_0

    .line 13
    :catch_1
    move-exception v0

    .line 14
    :goto_0
    invoke-interface {p1, v0}, Lw/a2$a;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :goto_1
    return-void
    .line 18
    .line 19
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

.method public static g(Ljava/lang/Object;)Lw/a2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(TU;)",
            "Lw/a2<",
            "TU;>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lw/t0;->b:Lw/t0;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lw/t0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lw/t0;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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


# virtual methods
.method public c(Ljava/util/concurrent/Executor;Lw/a2$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lw/a2$a<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lw/t0;->a:Lfc/b;

    new-instance v1, Lw/s0;

    invoke-direct {v1, p0, p2}, Lw/s0;-><init>(Lw/t0;Lw/a2$a;)V

    invoke-interface {v0, v1, p1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public d()Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lw/t0;->a:Lfc/b;

    return-object v0
.end method

.method public e(Lw/a2$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/a2$a<",
            "-TT;>;)V"
        }
    .end annotation

    return-void
.end method
