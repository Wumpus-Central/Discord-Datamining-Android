.class final Lio/sentry/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/k0;


# static fields
.field private static final a:Lio/sentry/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/l1;

    invoke-direct {v0}, Lio/sentry/l1;-><init>()V

    sput-object v0, Lio/sentry/l1;->a:Lio/sentry/l1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lio/sentry/l1;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lio/sentry/l1;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static e()Lio/sentry/k0;
    .locals 1

    sget-object v0, Lio/sentry/l1;->a:Lio/sentry/l1;

    return-object v0
.end method

.method private static synthetic f()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private static synthetic g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J)",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/util/concurrent/FutureTask;

    new-instance p2, Lio/sentry/k1;

    invoke-direct {p2}, Lio/sentry/k1;-><init>()V

    invoke-direct {p1, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-object p1
.end method

.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/util/concurrent/FutureTask;

    new-instance v0, Lio/sentry/j1;

    invoke-direct {v0}, Lio/sentry/j1;-><init>()V

    invoke-direct {p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-object p1
.end method
