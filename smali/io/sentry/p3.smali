.class final Lio/sentry/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t;


# instance fields
.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "java.version"

    .line 4
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.vendor"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lio/sentry/p3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/p3;->k:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/sentry/p3;->l:Ljava/lang/String;

    return-void
.end method

.method private a(Lio/sentry/l2;)Lio/sentry/l2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/sentry/l2;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/protocol/c;->d()Lio/sentry/protocol/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lio/sentry/protocol/r;

    .line 16
    .line 17
    invoke-direct {v1}, Lio/sentry/protocol/r;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->m(Lio/sentry/protocol/r;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lio/sentry/protocol/c;->d()Lio/sentry/protocol/r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/protocol/r;->d()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lio/sentry/protocol/r;->e()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lio/sentry/p3;->l:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lio/sentry/protocol/r;->f(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lio/sentry/p3;->k:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lio/sentry/protocol/r;->h(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-object p1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public b(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/p3;->a(Lio/sentry/l2;)Lio/sentry/l2;

    move-result-object p1

    check-cast p1, Lio/sentry/j3;

    return-object p1
.end method

.method public f(Lio/sentry/protocol/w;Lio/sentry/v;)Lio/sentry/protocol/w;
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/p3;->a(Lio/sentry/l2;)Lio/sentry/l2;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/w;

    return-object p1
.end method
