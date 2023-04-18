.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lic/i;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lic/e;)Ltc/d;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lic/e;)Ltc/d;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lic/e;)Ltc/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/firebase/installations/c;

    .line 2
    .line 3
    const-class v1, Lgc/d;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lic/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lgc/d;

    .line 10
    .line 11
    const-class v2, Lqc/j;

    .line 12
    .line 13
    invoke-interface {p0, v2}, Lic/e;->b(Ljava/lang/Class;)Lsc/b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Lcom/google/firebase/installations/c;-><init>(Lgc/d;Lsc/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lic/d<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lic/d;

    .line 3
    .line 4
    const-class v1, Ltc/d;

    .line 5
    .line 6
    invoke-static {v1}, Lic/d;->c(Ljava/lang/Class;)Lic/d$b;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-class v2, Lgc/d;

    .line 11
    .line 12
    invoke-static {v2}, Lic/q;->i(Ljava/lang/Class;)Lic/q;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Lic/d$b;->b(Lic/q;)Lic/d$b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-class v2, Lqc/j;

    .line 21
    .line 22
    invoke-static {v2}, Lic/q;->h(Ljava/lang/Class;)Lic/q;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Lic/d$b;->b(Lic/q;)Lic/d$b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Ltc/e;

    .line 31
    .line 32
    invoke-direct {v2}, Ltc/e;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lic/d$b;->e(Lic/h;)Lic/d$b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lic/d$b;->d()Lic/d;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    aput-object v1, v0, v2

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-static {}, Lqc/i;->a()Lic/d;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    aput-object v2, v0, v1

    .line 52
    .line 53
    const-string v1, "fire-installations"

    .line 54
    .line 55
    const-string v2, "17.0.1"

    .line 56
    .line 57
    invoke-static {v1, v2}, Lbd/h;->b(Ljava/lang/String;Ljava/lang/String;)Lic/d;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v2, 0x2

    .line 62
    aput-object v1, v0, v2

    .line 63
    .line 64
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method
