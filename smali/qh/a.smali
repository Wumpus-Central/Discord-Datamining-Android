.class public final Lqh/a;
.super Ldi/o0;
.source "SourceFile"

# interfaces
.implements Lhi/d;


# instance fields
.field private final l:Ldi/k1;

.field private final m:Lqh/b;

.field private final n:Z

.field private final o:Ldi/c1;


# direct methods
.method public constructor <init>(Ldi/k1;Lqh/b;ZLdi/c1;)V
    .locals 1

    const-string v0, "typeProjection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ldi/o0;-><init>()V

    .line 5
    iput-object p1, p0, Lqh/a;->l:Ldi/k1;

    .line 6
    iput-object p2, p0, Lqh/a;->m:Lqh/b;

    .line 7
    iput-boolean p3, p0, Lqh/a;->n:Z

    .line 8
    iput-object p4, p0, Lqh/a;->o:Ldi/c1;

    return-void
.end method

.method public synthetic constructor <init>(Ldi/k1;Lqh/b;ZLdi/c1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    new-instance p2, Lqh/c;

    invoke-direct {p2, p1}, Lqh/c;-><init>(Ldi/k1;)V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, Ldi/c1;->l:Ldi/c1$a;

    invoke-virtual {p4}, Ldi/c1$a;->h()Ldi/c1;

    move-result-object p4

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lqh/a;-><init>(Ldi/k1;Lqh/b;ZLdi/c1;)V

    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/k1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Ldi/c1;
    .locals 1

    iget-object v0, p0, Lqh/a;->o:Ldi/c1;

    return-object v0
.end method

.method public bridge synthetic N0()Ldi/g1;
    .locals 1

    invoke-virtual {p0}, Lqh/a;->W0()Lqh/b;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lqh/a;->n:Z

    return v0
.end method

.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Lqh/a;->Y0(Lei/g;)Lqh/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lqh/a;->X0(Z)Lqh/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lqh/a;->Y0(Lei/g;)Lqh/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lqh/a;->V0(Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic U0(Z)Ldi/o0;
    .locals 0

    invoke-virtual {p0, p1}, Lqh/a;->X0(Z)Lqh/a;

    move-result-object p1

    return-object p1
.end method

.method public V0(Ldi/c1;)Ldi/o0;
    .locals 4

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqh/a;

    .line 7
    .line 8
    iget-object v1, p0, Lqh/a;->l:Ldi/k1;

    .line 9
    .line 10
    invoke-virtual {p0}, Lqh/a;->W0()Lqh/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0}, Lqh/a;->O0()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {v0, v1, v2, v3, p1}, Lqh/a;-><init>(Ldi/k1;Lqh/b;ZLdi/c1;)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public W0()Lqh/b;
    .locals 1

    iget-object v0, p0, Lqh/a;->m:Lqh/b;

    return-object v0
.end method

.method public X0(Z)Lqh/a;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lqh/a;->O0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lqh/a;

    .line 9
    .line 10
    iget-object v1, p0, Lqh/a;->l:Ldi/k1;

    .line 11
    .line 12
    invoke-virtual {p0}, Lqh/a;->W0()Lqh/b;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Lqh/a;->M0()Ldi/c1;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v0, v1, v2, p1, v3}, Lqh/a;-><init>(Ldi/k1;Lqh/b;ZLdi/c1;)V

    .line 21
    .line 22
    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public Y0(Lei/g;)Lqh/a;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqh/a;

    .line 7
    .line 8
    iget-object v1, p0, Lqh/a;->l:Ldi/k1;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Ldi/k1;->p(Lei/g;)Ldi/k1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v1, "typeProjection.refine(kotlinTypeRefiner)"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lqh/a;->W0()Lqh/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0}, Lqh/a;->O0()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p0}, Lqh/a;->M0()Ldi/c1;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v0, p1, v1, v2, v3}, Lqh/a;-><init>(Ldi/k1;Lqh/b;ZLdi/c1;)V

    .line 32
    .line 33
    .line 34
    return-object v0
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
.end method

.method public p()Lwh/h;
    .locals 3

    .line 1
    sget-object v0, Lfi/g;->l:Lfi/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v2, v1}, Lfi/k;->a(Lfi/g;Z[Ljava/lang/String;)Lfi/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Captured("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqh/a;->l:Ldi/k1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqh/a;->O0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "?"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
