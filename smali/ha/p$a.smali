.class public final Lha/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lha/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lha/t;

.field private b:Lha/v;

.field private c:[B

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lha/r;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/Double;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lha/q;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lha/j;

.field private h:Ljava/lang/Integer;

.field private i:Lha/y;

.field private j:Lha/c;

.field private k:Lha/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lha/p;
    .locals 13

    .line 1
    new-instance v12, Lha/p;

    .line 2
    .line 3
    iget-object v1, p0, Lha/p$a;->a:Lha/t;

    .line 4
    .line 5
    iget-object v2, p0, Lha/p$a;->b:Lha/v;

    .line 6
    .line 7
    iget-object v3, p0, Lha/p$a;->c:[B

    .line 8
    .line 9
    iget-object v4, p0, Lha/p$a;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, Lha/p$a;->e:Ljava/lang/Double;

    .line 12
    .line 13
    iget-object v6, p0, Lha/p$a;->f:Ljava/util/List;

    .line 14
    .line 15
    iget-object v7, p0, Lha/p$a;->g:Lha/j;

    .line 16
    .line 17
    iget-object v8, p0, Lha/p$a;->h:Ljava/lang/Integer;

    .line 18
    .line 19
    iget-object v9, p0, Lha/p$a;->i:Lha/y;

    .line 20
    .line 21
    iget-object v0, p0, Lha/p$a;->j:Lha/c;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Lha/c;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    move-object v10, v0

    .line 32
    iget-object v11, p0, Lha/p$a;->k:Lha/d;

    .line 33
    .line 34
    move-object v0, v12

    .line 35
    invoke-direct/range {v0 .. v11}, Lha/p;-><init>(Lha/t;Lha/v;[BLjava/util/List;Ljava/lang/Double;Ljava/util/List;Lha/j;Ljava/lang/Integer;Lha/y;Ljava/lang/String;Lha/d;)V

    .line 36
    .line 37
    .line 38
    return-object v12
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method

.method public final b(Lha/j;)Lha/p$a;
    .locals 0

    iput-object p1, p0, Lha/p$a;->g:Lha/j;

    return-object p0
.end method

.method public final c([B)Lha/p$a;
    .locals 0

    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lha/p$a;->c:[B

    return-object p0
.end method

.method public final d(Ljava/util/List;)Lha/p$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lha/q;",
            ">;)",
            "Lha/p$a;"
        }
    .end annotation

    iput-object p1, p0, Lha/p$a;->f:Ljava/util/List;

    return-object p0
.end method

.method public final e(Ljava/util/List;)Lha/p$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lha/r;",
            ">;)",
            "Lha/p$a;"
        }
    .end annotation

    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lha/p$a;->d:Ljava/util/List;

    return-object p0
.end method

.method public final f(Lha/t;)Lha/p$a;
    .locals 0

    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lha/t;

    iput-object p1, p0, Lha/p$a;->a:Lha/t;

    return-object p0
.end method

.method public final g(Ljava/lang/Double;)Lha/p$a;
    .locals 0

    iput-object p1, p0, Lha/p$a;->e:Ljava/lang/Double;

    return-object p0
.end method

.method public final h(Lha/v;)Lha/p$a;
    .locals 0

    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lha/v;

    iput-object p1, p0, Lha/p$a;->b:Lha/v;

    return-object p0
.end method
