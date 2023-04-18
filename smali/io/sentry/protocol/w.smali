.class public final Lio/sentry/protocol/w;
.super Lio/sentry/l2;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/protocol/w$a;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/Double;

.field private final B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/protocol/s;",
            ">;"
        }
    .end annotation
.end field

.field private final C:Ljava/lang/String;

.field private final D:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/sentry/protocol/g;",
            ">;"
        }
    .end annotation
.end field

.field private E:Lio/sentry/protocol/x;

.field private F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/Double;


# direct methods
.method public constructor <init>(Lio/sentry/w3;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lio/sentry/w3;->i()Lio/sentry/protocol/p;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/sentry/l2;-><init>(Lio/sentry/protocol/p;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/w;->B:Ljava/util/List;

    const-string v0, "transaction"

    .line 3
    iput-object v0, p0, Lio/sentry/protocol/w;->C:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/w;->D:Ljava/util/Map;

    const-string v0, "sentryTracer is required"

    .line 5
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p1}, Lio/sentry/w3;->C()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/h;->a(Ljava/util/Date;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/w;->z:Ljava/lang/Double;

    .line 7
    invoke-virtual {p1}, Lio/sentry/w3;->A()Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/w;->A:Ljava/lang/Double;

    .line 8
    invoke-virtual {p1}, Lio/sentry/w3;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/protocol/w;->y:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lio/sentry/w3;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/b4;

    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1}, Lio/sentry/b4;->D()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 11
    iget-object v2, p0, Lio/sentry/protocol/w;->B:Ljava/util/List;

    new-instance v3, Lio/sentry/protocol/s;

    invoke-direct {v3, v1}, Lio/sentry/protocol/s;-><init>(Lio/sentry/b4;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p0}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lio/sentry/w3;->y()Lio/sentry/protocol/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 14
    invoke-virtual {p1}, Lio/sentry/w3;->l()Lio/sentry/c4;

    move-result-object v1

    .line 15
    new-instance v10, Lio/sentry/c4;

    .line 16
    invoke-virtual {v1}, Lio/sentry/c4;->j()Lio/sentry/protocol/p;

    move-result-object v3

    .line 17
    invoke-virtual {v1}, Lio/sentry/c4;->g()Lio/sentry/e4;

    move-result-object v4

    .line 18
    invoke-virtual {v1}, Lio/sentry/c4;->c()Lio/sentry/e4;

    move-result-object v5

    .line 19
    invoke-virtual {v1}, Lio/sentry/c4;->b()Ljava/lang/String;

    move-result-object v6

    .line 20
    invoke-virtual {v1}, Lio/sentry/c4;->a()Ljava/lang/String;

    move-result-object v7

    .line 21
    invoke-virtual {v1}, Lio/sentry/c4;->f()Lio/sentry/m4;

    move-result-object v8

    .line 22
    invoke-virtual {v1}, Lio/sentry/c4;->h()Lio/sentry/f4;

    move-result-object v9

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Lio/sentry/c4;-><init>(Lio/sentry/protocol/p;Lio/sentry/e4;Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Lio/sentry/m4;Lio/sentry/f4;)V

    .line 23
    invoke-virtual {v0, v10}, Lio/sentry/protocol/c;->n(Lio/sentry/c4;)V

    .line 24
    invoke-virtual {v1}, Lio/sentry/c4;->i()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Lio/sentry/l2;->Z(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {p1}, Lio/sentry/w3;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 27
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lio/sentry/l2;->S(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 29
    :cond_3
    new-instance v0, Lio/sentry/protocol/x;

    invoke-virtual {p1}, Lio/sentry/w3;->m()Lio/sentry/protocol/y;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/protocol/y;->apiName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/sentry/protocol/x;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/protocol/w;->E:Lio/sentry/protocol/x;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/Map;Lio/sentry/protocol/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lio/sentry/protocol/s;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/sentry/protocol/g;",
            ">;",
            "Lio/sentry/protocol/x;",
            ")V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Lio/sentry/l2;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/w;->B:Ljava/util/List;

    const-string v1, "transaction"

    .line 32
    iput-object v1, p0, Lio/sentry/protocol/w;->C:Ljava/lang/String;

    .line 33
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/protocol/w;->D:Ljava/util/Map;

    .line 34
    iput-object p1, p0, Lio/sentry/protocol/w;->y:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lio/sentry/protocol/w;->z:Ljava/lang/Double;

    .line 36
    iput-object p3, p0, Lio/sentry/protocol/w;->A:Ljava/lang/Double;

    .line 37
    invoke-interface {v0, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 38
    invoke-interface {v1, p5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 39
    iput-object p6, p0, Lio/sentry/protocol/w;->E:Lio/sentry/protocol/x;

    return-void
.end method

.method static synthetic c0(Lio/sentry/protocol/w;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/w;->y:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d0(Lio/sentry/protocol/w;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/w;->z:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic e0(Lio/sentry/protocol/w;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/w;->A:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic f0(Lio/sentry/protocol/w;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lio/sentry/protocol/w;->B:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g0(Lio/sentry/protocol/w;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/sentry/protocol/w;->D:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic h0(Lio/sentry/protocol/w;Lio/sentry/protocol/x;)Lio/sentry/protocol/x;
    .locals 0

    iput-object p1, p0, Lio/sentry/protocol/w;->E:Lio/sentry/protocol/x;

    return-object p1
.end method

.method private i0(Ljava/lang/Double;)Ljava/math/BigDecimal;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    const/4 v0, 0x6

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {p1, v0, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public j0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/sentry/protocol/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/protocol/w;->D:Ljava/util/Map;

    return-object v0
.end method

.method public k0()Lio/sentry/m4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/protocol/c;->f()Lio/sentry/c4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {v0}, Lio/sentry/c4;->f()Lio/sentry/m4;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public l0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/protocol/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/protocol/w;->B:Ljava/util/List;

    return-object v0
.end method

.method public m0()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/w;->A:Ljava/lang/Double;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/protocol/w;->k0()Lio/sentry/m4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {v0}, Lio/sentry/m4;->c()Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public o0(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/sentry/protocol/w;->F:Ljava/util/Map;

    return-void
.end method

.method public serialize(Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->k()Lio/sentry/vendor/gson/stream/c;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/protocol/w;->y:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "transaction"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, Lio/sentry/protocol/w;->y:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string v0, "start_timestamp"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v2, p0, Lio/sentry/protocol/w;->z:Ljava/lang/Double;

    .line 26
    .line 27
    invoke-direct {p0, v2}, Lio/sentry/protocol/w;->i0(Ljava/lang/Double;)Ljava/math/BigDecimal;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lio/sentry/protocol/w;->A:Ljava/lang/Double;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const-string v0, "timestamp"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v2, p0, Lio/sentry/protocol/w;->A:Ljava/lang/Double;

    .line 45
    .line 46
    invoke-direct {p0, v2}, Lio/sentry/protocol/w;->i0(Ljava/lang/Double;)Ljava/math/BigDecimal;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/w;->B:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    const-string v0, "spans"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v2, p0, Lio/sentry/protocol/w;->B:Ljava/util/List;

    .line 68
    .line 69
    invoke-virtual {v0, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 70
    .line 71
    .line 72
    :cond_2
    const-string v0, "type"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lio/sentry/protocol/w;->D:Ljava/util/Map;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    const-string v0, "measurements"

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v1, p0, Lio/sentry/protocol/w;->D:Ljava/util/Map;

    .line 96
    .line 97
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 98
    .line 99
    .line 100
    :cond_3
    const-string v0, "transaction_info"

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v1, p0, Lio/sentry/protocol/w;->E:Lio/sentry/protocol/x;

    .line 107
    .line 108
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 109
    .line 110
    .line 111
    new-instance v0, Lio/sentry/l2$b;

    .line 112
    .line 113
    invoke-direct {v0}, Lio/sentry/l2$b;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p0, p1, p2}, Lio/sentry/l2$b;->a(Lio/sentry/l2;Lio/sentry/z0;Lio/sentry/g0;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lio/sentry/protocol/w;->F:Ljava/util/Map;

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Ljava/lang/String;

    .line 142
    .line 143
    iget-object v2, p0, Lio/sentry/protocol/w;->F:Ljava/util/Map;

    .line 144
    .line 145
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {p1, v1}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_4
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->s()Lio/sentry/vendor/gson/stream/c;

    .line 157
    .line 158
    .line 159
    return-void
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method
