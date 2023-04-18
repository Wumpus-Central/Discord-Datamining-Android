.class public final Lio/sentry/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/f0;


# static fields
.field private static final a:Lio/sentry/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/b0;

    invoke-direct {v0}, Lio/sentry/b0;-><init>()V

    sput-object v0, Lio/sentry/b0;->a:Lio/sentry/b0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lio/sentry/b0;
    .locals 1

    sget-object v0, Lio/sentry/b0;->a:Lio/sentry/b0;

    return-object v0
.end method


# virtual methods
.method public clone()Lio/sentry/f0;
    .locals 1

    .line 2
    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/f0;->clone()Lio/sentry/f0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/b0;->clone()Lio/sentry/f0;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 0

    invoke-static {}, Lio/sentry/k2;->i()V

    return-void
.end method

.method public d(J)V
    .locals 0

    invoke-static {p1, p2}, Lio/sentry/k2;->l(J)V

    return-void
.end method

.method public synthetic e(Lio/sentry/d;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/e0;->a(Lio/sentry/f0;Lio/sentry/d;)V

    return-void
.end method

.method public f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/f0;->f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public synthetic g(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/m0;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/e0;->d(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public h(Lio/sentry/n4;Lio/sentry/p4;)Lio/sentry/m0;
    .locals 0

    invoke-static {p1, p2}, Lio/sentry/k2;->v(Lio/sentry/n4;Lio/sentry/p4;)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public i(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/f0;->i(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public isEnabled()Z
    .locals 1

    invoke-static {}, Lio/sentry/k2;->r()Z

    move-result v0

    return v0
.end method

.method public j(Lio/sentry/d;Lio/sentry/v;)V
    .locals 0

    invoke-static {p1, p2}, Lio/sentry/k2;->c(Lio/sentry/d;Lio/sentry/v;)V

    return-void
.end method

.method public k(Lio/sentry/b2;)V
    .locals 0

    invoke-static {p1}, Lio/sentry/k2;->j(Lio/sentry/b2;)V

    return-void
.end method

.method public l(Lio/sentry/n4;Lio/sentry/f;Z)Lio/sentry/m0;
    .locals 0

    invoke-static {p1, p2, p3}, Lio/sentry/k2;->u(Lio/sentry/n4;Lio/sentry/f;Z)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public m()Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->q()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public n(Ljava/lang/Throwable;Lio/sentry/ISpan;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/f0;->n(Ljava/lang/Throwable;Lio/sentry/ISpan;Ljava/lang/String;)V

    return-void
.end method

.method public o()Lio/sentry/o3;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/f0;->o()Lio/sentry/o3;

    move-result-object v0

    return-object v0
.end method

.method public p(Lio/sentry/b2;)V
    .locals 0

    invoke-static {p1}, Lio/sentry/k2;->x(Lio/sentry/b2;)V

    return-void
.end method

.method public synthetic q(Ljava/lang/Throwable;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/e0;->c(Lio/sentry/f0;Ljava/lang/Throwable;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public synthetic r(Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;Z)Lio/sentry/m0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/sentry/e0;->f(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;Z)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p1, p2}, Lio/sentry/k2;->g(Ljava/lang/Throwable;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;Lio/sentry/n3;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p1, p2}, Lio/sentry/k2;->h(Ljava/lang/String;Lio/sentry/n3;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public synthetic u(Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;)Lio/sentry/m0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/sentry/e0;->e(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public v()V
    .locals 0

    invoke-static {}, Lio/sentry/k2;->k()V

    return-void
.end method

.method public synthetic w(Lio/sentry/q2;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/e0;->b(Lio/sentry/f0;Lio/sentry/q2;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public x()V
    .locals 0

    invoke-static {}, Lio/sentry/k2;->t()V

    return-void
.end method

.method public y(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p1, p2}, Lio/sentry/k2;->e(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method
