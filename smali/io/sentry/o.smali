.class public final synthetic Lio/sentry/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/h$a;


# instance fields
.field public final synthetic a:Lio/sentry/r;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/o;->a:Lio/sentry/r;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/o;->a:Lio/sentry/r;

    check-cast p1, Lio/sentry/hints/d;

    invoke-static {v0, p1}, Lio/sentry/r;->h(Lio/sentry/r;Lio/sentry/hints/d;)V

    return-void
.end method
