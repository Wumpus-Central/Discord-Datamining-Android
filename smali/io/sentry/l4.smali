.class final Lio/sentry/l4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lio/sentry/o3;

.field private final b:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>(Lio/sentry/o3;)V
    .locals 1

    const-string v0, "options are required"

    .line 1
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/o3;

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, p1, v0}, Lio/sentry/l4;-><init>(Lio/sentry/o3;Ljava/security/SecureRandom;)V

    return-void
.end method

.method constructor <init>(Lio/sentry/o3;Ljava/security/SecureRandom;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/sentry/l4;->a:Lio/sentry/o3;

    .line 4
    iput-object p2, p0, Lio/sentry/l4;->b:Ljava/security/SecureRandom;

    return-void
.end method

.method private b(Ljava/lang/Double;)Z
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Lio/sentry/l4;->b:Ljava/security/SecureRandom;

    invoke-virtual {p1}, Ljava/util/Random;->nextDouble()D

    move-result-wide v2

    cmpg-double p1, v0, v2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method a(Lio/sentry/a2;)Lio/sentry/m4;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lio/sentry/a2;->a()Lio/sentry/n4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/c4;->f()Lio/sentry/m4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l4;->a:Lio/sentry/o3;

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/sentry/o3;->getProfilesSampler()Lio/sentry/o3$d;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lio/sentry/l4;->a:Lio/sentry/o3;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/o3;->getProfilesSampleRate()Ljava/lang/Double;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lio/sentry/l4;->b(Ljava/lang/Double;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lio/sentry/l4;->a:Lio/sentry/o3;

    .line 39
    .line 40
    invoke-virtual {v2}, Lio/sentry/o3;->getTracesSampler()Lio/sentry/o3$g;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lio/sentry/a2;->a()Lio/sentry/n4;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lio/sentry/n4;->r()Lio/sentry/m4;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    iget-object p1, p0, Lio/sentry/l4;->a:Lio/sentry/o3;

    .line 55
    .line 56
    invoke-virtual {p1}, Lio/sentry/o3;->getTracesSampleRate()Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    new-instance v2, Lio/sentry/m4;

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lio/sentry/l4;->b(Ljava/lang/Double;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-direct {v2, v3, p1, v1, v0}, Lio/sentry/m4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :cond_3
    new-instance p1, Lio/sentry/m4;

    .line 77
    .line 78
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-direct {p1, v0, v1, v0, v1}, Lio/sentry/m4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 82
    .line 83
    .line 84
    return-object p1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
