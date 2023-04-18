.class public final synthetic Lio/sentry/transport/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/RejectedExecutionHandler;


# instance fields
.field public final synthetic a:Lio/sentry/cache/e;

.field public final synthetic b:Lio/sentry/g0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/cache/e;Lio/sentry/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/transport/a;->a:Lio/sentry/cache/e;

    iput-object p2, p0, Lio/sentry/transport/a;->b:Lio/sentry/g0;

    return-void
.end method


# virtual methods
.method public final rejectedExecution(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/transport/a;->a:Lio/sentry/cache/e;

    iget-object v1, p0, Lio/sentry/transport/a;->b:Lio/sentry/g0;

    invoke-static {v0, v1, p1, p2}, Lio/sentry/transport/d;->b(Lio/sentry/cache/e;Lio/sentry/g0;Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method
