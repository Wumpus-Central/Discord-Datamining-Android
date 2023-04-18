.class public final Lw9/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/accounts/Account;

.field private b:Landroidx/collection/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/b<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lza/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lza/a;->t:Lza/a;

    iput-object v0, p0, Lw9/d$a;->e:Lza/a;

    return-void
.end method


# virtual methods
.method public a()Lw9/d;
    .locals 11

    new-instance v10, Lw9/d;

    iget-object v1, p0, Lw9/d$a;->a:Landroid/accounts/Account;

    iget-object v2, p0, Lw9/d$a;->b:Landroidx/collection/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Lw9/d$a;->c:Ljava/lang/String;

    iget-object v7, p0, Lw9/d$a;->d:Ljava/lang/String;

    iget-object v8, p0, Lw9/d$a;->e:Lza/a;

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lw9/d;-><init>(Landroid/accounts/Account;Ljava/util/Set;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lza/a;Z)V

    return-object v10
.end method

.method public b(Ljava/lang/String;)Lw9/d$a;
    .locals 0

    iput-object p1, p0, Lw9/d$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/util/Collection;)Lw9/d$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Lw9/d$a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lw9/d$a;->b:Landroidx/collection/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/collection/b;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/collection/b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lw9/d$a;->b:Landroidx/collection/b;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lw9/d$a;->b:Landroidx/collection/b;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/collection/b;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final d(Landroid/accounts/Account;)Lw9/d$a;
    .locals 0

    iput-object p1, p0, Lw9/d$a;->a:Landroid/accounts/Account;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lw9/d$a;
    .locals 0

    iput-object p1, p0, Lw9/d$a;->d:Ljava/lang/String;

    return-object p0
.end method
