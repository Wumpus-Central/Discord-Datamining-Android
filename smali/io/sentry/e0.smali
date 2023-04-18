.class public final synthetic Lio/sentry/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lio/sentry/f0;Lio/sentry/d;)V
    .locals 1

    new-instance v0, Lio/sentry/v;

    invoke-direct {v0}, Lio/sentry/v;-><init>()V

    invoke-interface {p0, p1, v0}, Lio/sentry/f0;->j(Lio/sentry/d;Lio/sentry/v;)V

    return-void
.end method

.method public static b(Lio/sentry/f0;Lio/sentry/q2;)Lio/sentry/protocol/p;
    .locals 1

    new-instance v0, Lio/sentry/v;

    invoke-direct {v0}, Lio/sentry/v;-><init>()V

    invoke-interface {p0, p1, v0}, Lio/sentry/f0;->f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lio/sentry/f0;Ljava/lang/Throwable;)Lio/sentry/protocol/p;
    .locals 1

    new-instance v0, Lio/sentry/v;

    invoke-direct {v0}, Lio/sentry/v;-><init>()V

    invoke-interface {p0, p1, v0}, Lio/sentry/f0;->s(Ljava/lang/Throwable;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;)Lio/sentry/m0;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, v0}, Lio/sentry/f0;->u(Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;)Lio/sentry/m0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;)Lio/sentry/m0;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, p2, p3, v0}, Lio/sentry/f0;->r(Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;Z)Lio/sentry/m0;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;Z)Lio/sentry/m0;
    .locals 1

    new-instance v0, Lio/sentry/n4;

    invoke-direct {v0, p1, p2}, Lio/sentry/n4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, p3, p4}, Lio/sentry/f0;->l(Lio/sentry/n4;Lio/sentry/f;Z)Lio/sentry/m0;

    move-result-object p0

    return-object p0
.end method
