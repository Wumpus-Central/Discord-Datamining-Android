.class public final Lio/sentry/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/m0;


# static fields
.field private static final a:Lio/sentry/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/o1;

    invoke-direct {v0}, Lio/sentry/o1;-><init>()V

    sput-object v0, Lio/sentry/o1;->a:Lio/sentry/o1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static n()Lio/sentry/o1;
    .locals 1

    sget-object v0, Lio/sentry/o1;->a:Lio/sentry/o1;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Lio/sentry/f4;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Lio/sentry/k4;
    .locals 3

    new-instance v0, Lio/sentry/k4;

    sget-object v1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lio/sentry/k4;-><init>(Lio/sentry/protocol/p;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lio/sentry/f4;)V
    .locals 0

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;
    .locals 0

    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    move-result-object p1

    return-object p1
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g()Lio/sentry/b4;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public i()Lio/sentry/protocol/p;
    .locals 1

    sget-object v0, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    return-object v0
.end method

.method public j(Ljava/lang/String;)Lio/sentry/ISpan;
    .locals 0

    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    move-result-object p1

    return-object p1
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l()Lio/sentry/c4;
    .locals 7

    new-instance v6, Lio/sentry/c4;

    sget-object v1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    sget-object v2, Lio/sentry/e4;->l:Lio/sentry/e4;

    const-string v3, "op"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/sentry/c4;-><init>(Lio/sentry/protocol/p;Lio/sentry/e4;Ljava/lang/String;Lio/sentry/e4;Lio/sentry/m4;)V

    return-object v6
.end method

.method public m()Lio/sentry/protocol/y;
    .locals 1

    sget-object v0, Lio/sentry/protocol/y;->CUSTOM:Lio/sentry/protocol/y;

    return-object v0
.end method
