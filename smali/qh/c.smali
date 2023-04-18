.class public final Lqh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqh/b;


# instance fields
.field private final a:Ldi/k1;

.field private b:Lei/j;


# direct methods
.method public constructor <init>(Ldi/k1;)V
    .locals 1

    .line 1
    const-string v0, "projection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lqh/c;->a:Ldi/k1;

    .line 10
    .line 11
    invoke-virtual {p0}, Lqh/c;->b()Ldi/k1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 16
    .line 17
    .line 18
    sget-object p1, Ldi/w1;->o:Ldi/w1;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public b()Ldi/k1;
    .locals 1

    iget-object v0, p0, Lqh/c;->a:Ldi/k1;

    return-object v0
.end method

.method public c()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Lei/j;
    .locals 1

    iget-object v0, p0, Lqh/c;->b:Lei/j;

    return-object v0
.end method

.method public e(Lei/g;)Lqh/c;
    .locals 2

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqh/c;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqh/c;->b()Ldi/k1;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1, p1}, Ldi/k1;->p(Lei/g;)Ldi/k1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "projection.refine(kotlinTypeRefiner)"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1}, Lqh/c;-><init>(Ldi/k1;)V

    .line 22
    .line 23
    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
.end method

.method public final f(Lei/j;)V
    .locals 0

    iput-object p1, p0, Lqh/c;->b:Lei/j;

    return-void
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lqh/c;->b()Ldi/k1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ldi/k1;->a()Ldi/w1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ldi/w1;->q:Ldi/w1;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lqh/c;->b()Ldi/k1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ldi/k1;->getType()Ldi/g0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lqh/c;->o()Ljg/h;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljg/h;->I()Ldi/o0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    const-string v1, "if (projection.projectio\u2026 builtIns.nullableAnyType"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
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
.end method

.method public o()Ljg/h;
    .locals 2

    invoke-virtual {p0}, Lqh/c;->b()Ldi/k1;

    move-result-object v0

    invoke-interface {v0}, Ldi/k1;->getType()Ldi/g0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    move-result-object v0

    invoke-interface {v0}, Ldi/g1;->o()Ljg/h;

    move-result-object v0

    const-string v1, "projection.type.constructor.builtIns"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic p(Lei/g;)Ldi/g1;
    .locals 0

    invoke-virtual {p0, p1}, Lqh/c;->e(Lei/g;)Lqh/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q()Lmg/h;
    .locals 1

    invoke-virtual {p0}, Lqh/c;->c()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lmg/h;

    return-object v0
.end method

.method public r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CapturedTypeConstructor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqh/c;->b()Ldi/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
