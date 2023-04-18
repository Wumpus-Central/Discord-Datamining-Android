.class public final synthetic Lio/sentry/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/sentry/l0;

.field public final synthetic b:Lio/sentry/clientreport/b;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/l0;Lio/sentry/clientreport/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/a3;->a:Lio/sentry/l0;

    iput-object p2, p0, Lio/sentry/a3;->b:Lio/sentry/clientreport/b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/sentry/a3;->a:Lio/sentry/l0;

    iget-object v1, p0, Lio/sentry/a3;->b:Lio/sentry/clientreport/b;

    invoke-static {v0, v1}, Lio/sentry/h3;->i(Lio/sentry/l0;Lio/sentry/clientreport/b;)[B

    move-result-object v0

    return-object v0
.end method
