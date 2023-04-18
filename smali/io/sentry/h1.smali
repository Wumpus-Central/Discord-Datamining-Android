.class public final Lio/sentry/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/f0;


# static fields
.field private static final b:Lio/sentry/h1;


# instance fields
.field private final a:Lio/sentry/o3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/h1;

    invoke-direct {v0}, Lio/sentry/h1;-><init>()V

    sput-object v0, Lio/sentry/h1;->b:Lio/sentry/h1;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lio/sentry/o3;->empty()Lio/sentry/o3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lio/sentry/h1;->a:Lio/sentry/o3;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static a()Lio/sentry/h1;
    .locals 1

    sget-object v0, Lio/sentry/h1;->b:Lio/sentry/h1;

    return-object v0
.end method


# virtual methods
.method public clone()Lio/sentry/f0;
    .locals 1

    .line 2
    sget-object v0, Lio/sentry/h1;->b:Lio/sentry/h1;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/h1;->clone()Lio/sentry/f0;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public d(J)V
    .locals 0

    return-void
.end method

.method public synthetic e(Lio/sentry/d;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/e0;->a(Lio/sentry/f0;Lio/sentry/d;)V

    return-void
.end method

.method public f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 0

    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

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

    invoke-static {}, Lio/sentry/o1;->n()Lio/sentry/o1;

    move-result-object p1

    return-object p1
.end method

.method public i(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 0

    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    return-object p1
.end method

.method public isEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j(Lio/sentry/d;Lio/sentry/v;)V
    .locals 0

    return-void
.end method

.method public k(Lio/sentry/b2;)V
    .locals 0

    return-void
.end method

.method public l(Lio/sentry/n4;Lio/sentry/f;Z)Lio/sentry/m0;
    .locals 0

    invoke-static {}, Lio/sentry/o1;->n()Lio/sentry/o1;

    move-result-object p1

    return-object p1
.end method

.method public m()Ljava/lang/Boolean;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public n(Ljava/lang/Throwable;Lio/sentry/ISpan;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public o()Lio/sentry/o3;
    .locals 1

    iget-object v0, p0, Lio/sentry/h1;->a:Lio/sentry/o3;

    return-object v0
.end method

.method public p(Lio/sentry/b2;)V
    .locals 0

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

    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    return-object p1
.end method

.method public t(Ljava/lang/String;Lio/sentry/n3;)Lio/sentry/protocol/p;
    .locals 0

    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

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

    return-void
.end method

.method public y(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 0

    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    return-object p1
.end method
