.class public final synthetic Lio/sentry/transport/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/h$b;


# instance fields
.field public final synthetic a:Lio/sentry/transport/d$c;

.field public final synthetic b:Lio/sentry/q2;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/transport/d$c;Lio/sentry/q2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/transport/i;->a:Lio/sentry/transport/d$c;

    iput-object p2, p0, Lio/sentry/transport/i;->b:Lio/sentry/q2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/transport/i;->a:Lio/sentry/transport/d$c;

    iget-object v1, p0, Lio/sentry/transport/i;->b:Lio/sentry/q2;

    invoke-static {v0, v1, p1, p2}, Lio/sentry/transport/d$c;->a(Lio/sentry/transport/d$c;Lio/sentry/q2;Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method
