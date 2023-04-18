.class public final Lio/sentry/p4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/util/Date;

.field private c:Z

.field private d:Ljava/lang/Long;

.field private e:Z

.field private f:Lio/sentry/o4;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/sentry/p4;->a:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lio/sentry/p4;->b:Ljava/util/Date;

    .line 9
    .line 10
    iput-boolean v0, p0, Lio/sentry/p4;->c:Z

    .line 11
    .line 12
    iput-object v1, p0, Lio/sentry/p4;->d:Ljava/lang/Long;

    .line 13
    .line 14
    iput-boolean v0, p0, Lio/sentry/p4;->e:Z

    .line 15
    .line 16
    iput-object v1, p0, Lio/sentry/p4;->f:Lio/sentry/o4;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public a()Lio/sentry/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/sentry/p4;->d:Ljava/lang/Long;

    return-object v0
.end method

.method public c()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/sentry/p4;->b:Ljava/util/Date;

    return-object v0
.end method

.method public d()Lio/sentry/o4;
    .locals 1

    iget-object v0, p0, Lio/sentry/p4;->f:Lio/sentry/o4;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/p4;->a:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/p4;->e:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/p4;->c:Z

    return v0
.end method

.method public h(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/p4;->d:Ljava/lang/Long;

    return-void
.end method

.method public i(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/p4;->b:Ljava/util/Date;

    return-void
.end method

.method public j(Lio/sentry/o4;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/p4;->f:Lio/sentry/o4;

    return-void
.end method

.method public k(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/p4;->e:Z

    return-void
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/p4;->c:Z

    return-void
.end method
