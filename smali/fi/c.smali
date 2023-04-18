.class public final Lfi/c;
.super Lpg/g0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lmg/e;)V
    .locals 17

    .line 1
    const-string v0, "containingDeclaration"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    sget-object v0, Lng/g;->f:Lng/g$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    sget-object v0, Lfi/b;->m:Lfi/b;

    .line 16
    .line 17
    invoke-virtual {v0}, Lfi/b;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Llh/f;->k(Ljava/lang/String;)Llh/f;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    sget-object v6, Lmg/b$a;->k:Lmg/b$a;

    .line 26
    .line 27
    sget-object v7, Lmg/a1;->a:Lmg/a1;

    .line 28
    .line 29
    move-object/from16 v1, p0

    .line 30
    .line 31
    invoke-direct/range {v1 .. v7}, Lpg/g0;-><init>(Lmg/m;Lmg/z0;Lng/g;Llh/f;Lmg/b$a;Lmg/a1;)V

    .line 32
    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v13

    .line 48
    sget-object v0, Lfi/j;->u:Lfi/j;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    new-array v1, v1, [Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lfi/k;->d(Lfi/j;[Ljava/lang/String;)Lfi/h;

    .line 54
    .line 55
    .line 56
    move-result-object v14

    .line 57
    sget-object v15, Lmg/e0;->n:Lmg/e0;

    .line 58
    .line 59
    sget-object v16, Lmg/t;->e:Lmg/u;

    .line 60
    .line 61
    move-object/from16 v8, p0

    .line 62
    .line 63
    invoke-virtual/range {v8 .. v16}, Lpg/g0;->n1(Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;)Lpg/g0;

    .line 64
    .line 65
    .line 66
    return-void
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
.method public bridge synthetic B(Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Z)Lmg/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lfi/c;->k1(Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Z)Lmg/z0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic K0(Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Z)Lmg/y;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lfi/c;->k1(Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Z)Lmg/z0;

    move-result-object p1

    return-object p1
.end method

.method protected L0(Lmg/m;Lmg/y;Lmg/b$a;Llh/f;Lng/g;Lmg/a1;)Lpg/p;
    .locals 0

    const-string p2, "newOwner"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "annotations"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k1(Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Z)Lmg/z0;
    .locals 0

    const-string p5, "newOwner"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "modality"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "visibility"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public t()Lmg/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/y$a<",
            "Lmg/z0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfi/c$a;

    invoke-direct {v0, p0}, Lfi/c$a;-><init>(Lfi/c;)V

    return-object v0
.end method

.method public v0(Lmg/a$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lmg/a$a<",
            "TV;>;)TV;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lmg/b;",
            ">;)V"
        }
    .end annotation

    const-string v0, "overriddenDescriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
