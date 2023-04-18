.class public final Lei/i;
.super Ldi/o0;
.source "SourceFile"

# interfaces
.implements Lhi/d;


# instance fields
.field private final l:Lhi/b;

.field private final m:Lei/j;

.field private final n:Ldi/v1;

.field private final o:Ldi/c1;

.field private final p:Z

.field private final q:Z


# direct methods
.method public constructor <init>(Lhi/b;Ldi/v1;Ldi/k1;Lmg/f1;)V
    .locals 10

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "projection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Lei/j;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, Lei/j;-><init>(Ldi/k1;Lkotlin/jvm/functions/Function0;Lei/j;Lmg/f1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x38

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, v0

    move-object v4, p2

    invoke-direct/range {v1 .. v9}, Lei/i;-><init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZ)V
    .locals 1

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ldi/o0;-><init>()V

    .line 4
    iput-object p1, p0, Lei/i;->l:Lhi/b;

    .line 5
    iput-object p2, p0, Lei/i;->m:Lei/j;

    .line 6
    iput-object p3, p0, Lei/i;->n:Ldi/v1;

    .line 7
    iput-object p4, p0, Lei/i;->o:Ldi/c1;

    .line 8
    iput-boolean p5, p0, Lei/i;->p:Z

    .line 9
    iput-boolean p6, p0, Lei/i;->q:Z

    return-void
.end method

.method public synthetic constructor <init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 1
    sget-object p4, Ldi/c1;->l:Ldi/c1$a;

    invoke-virtual {p4}, Ldi/c1$a;->h()Ldi/c1;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    move v5, p8

    goto :goto_0

    :cond_1
    move v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    move v6, p8

    goto :goto_1

    :cond_2
    move v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 2
    invoke-direct/range {v0 .. v6}, Lei/i;-><init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZ)V

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

    iget-object v0, p0, Lei/i;->o:Ldi/c1;

    return-object v0
.end method

.method public bridge synthetic N0()Ldi/g1;
    .locals 1

    invoke-virtual {p0}, Lei/i;->X0()Lei/j;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lei/i;->p:Z

    return v0
.end method

.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Lei/i;->b1(Lei/g;)Lei/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lei/i;->a1(Z)Lei/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lei/i;->b1(Lei/g;)Lei/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lei/i;->V0(Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic U0(Z)Ldi/o0;
    .locals 0

    invoke-virtual {p0, p1}, Lei/i;->a1(Z)Lei/i;

    move-result-object p1

    return-object p1
.end method

.method public V0(Ldi/c1;)Ldi/o0;
    .locals 8

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lei/i;

    .line 7
    .line 8
    iget-object v2, p0, Lei/i;->l:Lhi/b;

    .line 9
    .line 10
    invoke-virtual {p0}, Lei/i;->X0()Lei/j;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    iget-object v4, p0, Lei/i;->n:Ldi/v1;

    .line 15
    .line 16
    invoke-virtual {p0}, Lei/i;->O0()Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    iget-boolean v7, p0, Lei/i;->q:Z

    .line 21
    .line 22
    move-object v1, v0

    .line 23
    move-object v5, p1

    .line 24
    invoke-direct/range {v1 .. v7}, Lei/i;-><init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZ)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final W0()Lhi/b;
    .locals 1

    iget-object v0, p0, Lei/i;->l:Lhi/b;

    return-object v0
.end method

.method public X0()Lei/j;
    .locals 1

    iget-object v0, p0, Lei/i;->m:Lei/j;

    return-object v0
.end method

.method public final Y0()Ldi/v1;
    .locals 1

    iget-object v0, p0, Lei/i;->n:Ldi/v1;

    return-object v0
.end method

.method public final Z0()Z
    .locals 1

    iget-boolean v0, p0, Lei/i;->q:Z

    return v0
.end method

.method public a1(Z)Lei/i;
    .locals 10

    new-instance v9, Lei/i;

    iget-object v1, p0, Lei/i;->l:Lhi/b;

    invoke-virtual {p0}, Lei/i;->X0()Lei/j;

    move-result-object v2

    iget-object v3, p0, Lei/i;->n:Ldi/v1;

    invoke-virtual {p0}, Lei/i;->M0()Ldi/c1;

    move-result-object v4

    const/4 v6, 0x0

    const/16 v7, 0x20

    const/4 v8, 0x0

    move-object v0, v9

    move v5, p1

    invoke-direct/range {v0 .. v8}, Lei/i;-><init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public b1(Lei/g;)Lei/i;
    .locals 10

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lei/i;->l:Lhi/b;

    .line 7
    .line 8
    invoke-virtual {p0}, Lei/i;->X0()Lei/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lei/j;->g(Lei/g;)Lei/j;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v0, p0, Lei/i;->n:Ldi/v1;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lei/g;->h(Lhi/i;)Ldi/g0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ldi/g0;->Q0()Ldi/v1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    move-object v4, p1

    .line 31
    invoke-virtual {p0}, Lei/i;->M0()Ldi/c1;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {p0}, Lei/i;->O0()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v7, 0x0

    .line 40
    const/16 v8, 0x20

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    new-instance p1, Lei/i;

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    invoke-direct/range {v1 .. v9}, Lei/i;-><init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    return-object p1
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

    sget-object v0, Lfi/g;->l:Lfi/g;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lfi/k;->a(Lfi/g;Z[Ljava/lang/String;)Lfi/f;

    move-result-object v0

    return-object v0
.end method
