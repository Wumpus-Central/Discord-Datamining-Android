.class public final synthetic Lio/sentry/transport/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/h$a;


# instance fields
.field public final synthetic a:Lio/sentry/transport/d$c;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/transport/d$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/transport/f;->a:Lio/sentry/transport/d$c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/transport/f;->a:Lio/sentry/transport/d$c;

    check-cast p1, Lio/sentry/hints/c;

    invoke-static {v0, p1}, Lio/sentry/transport/d$c;->c(Lio/sentry/transport/d$c;Lio/sentry/hints/c;)V

    return-void
.end method
