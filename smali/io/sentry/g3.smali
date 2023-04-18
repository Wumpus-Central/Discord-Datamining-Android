.class public final synthetic Lio/sentry/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/sentry/b;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lio/sentry/b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/g3;->a:Lio/sentry/b;

    iput-wide p2, p0, Lio/sentry/g3;->b:J

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/sentry/g3;->a:Lio/sentry/b;

    iget-wide v1, p0, Lio/sentry/g3;->b:J

    invoke-static {v0, v1, v2}, Lio/sentry/h3;->f(Lio/sentry/b;J)[B

    move-result-object v0

    return-object v0
.end method
