.class public final synthetic Lio/sentry/transport/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/h$a;


# instance fields
.field public final synthetic a:Lio/sentry/transport/d$c;

.field public final synthetic b:Lio/sentry/transport/a0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/transport/d$c;Lio/sentry/transport/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/transport/e;->a:Lio/sentry/transport/d$c;

    iput-object p2, p0, Lio/sentry/transport/e;->b:Lio/sentry/transport/a0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/transport/e;->a:Lio/sentry/transport/d$c;

    iget-object v1, p0, Lio/sentry/transport/e;->b:Lio/sentry/transport/a0;

    check-cast p1, Lio/sentry/hints/k;

    invoke-static {v0, v1, p1}, Lio/sentry/transport/d$c;->g(Lio/sentry/transport/d$c;Lio/sentry/transport/a0;Lio/sentry/hints/k;)V

    return-void
.end method
