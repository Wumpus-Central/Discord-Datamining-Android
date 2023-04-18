.class public final synthetic Lio/sentry/v2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/io/File;

.field public final synthetic b:J

.field public final synthetic c:Lio/sentry/w1;

.field public final synthetic d:Lio/sentry/l0;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;JLio/sentry/w1;Lio/sentry/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/v2;->a:Ljava/io/File;

    iput-wide p2, p0, Lio/sentry/v2;->b:J

    iput-object p4, p0, Lio/sentry/v2;->c:Lio/sentry/w1;

    iput-object p5, p0, Lio/sentry/v2;->d:Lio/sentry/l0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lio/sentry/v2;->a:Ljava/io/File;

    iget-wide v1, p0, Lio/sentry/v2;->b:J

    iget-object v3, p0, Lio/sentry/v2;->c:Lio/sentry/w1;

    iget-object v4, p0, Lio/sentry/v2;->d:Lio/sentry/l0;

    invoke-static {v0, v1, v2, v3, v4}, Lio/sentry/h3;->b(Ljava/io/File;JLio/sentry/w1;Lio/sentry/l0;)[B

    move-result-object v0

    return-object v0
.end method
