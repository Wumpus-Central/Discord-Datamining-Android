.class public final Ldi/a;
.super Ldi/r;
.source "SourceFile"


# instance fields
.field private final l:Ldi/o0;

.field private final m:Ldi/o0;


# direct methods
.method public constructor <init>(Ldi/o0;Ldi/o0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "abbreviation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldi/r;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldi/a;->l:Ldi/o0;

    .line 15
    .line 16
    iput-object p2, p0, Ldi/a;->m:Ldi/o0;

    .line 17
    .line 18
    return-void
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
.end method


# virtual methods
.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/a;->b1(Lei/g;)Ldi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/a;->a1(Z)Ldi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/a;->b1(Lei/g;)Ldi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/a;->V0(Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic U0(Z)Ldi/o0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/a;->a1(Z)Ldi/a;

    move-result-object p1

    return-object p1
.end method

.method public V0(Ldi/c1;)Ldi/o0;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/a;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldi/a;->W0()Ldi/o0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, Ldi/o0;->V0(Ldi/c1;)Ldi/o0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, Ldi/a;->m:Ldi/o0;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Ldi/a;-><init>(Ldi/o0;Ldi/o0;)V

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

.method public final W()Ldi/o0;
    .locals 1

    invoke-virtual {p0}, Ldi/a;->W0()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method protected W0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/a;->l:Ldi/o0;

    return-object v0
.end method

.method public bridge synthetic X0(Lei/g;)Ldi/o0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/a;->b1(Lei/g;)Ldi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Y0(Ldi/o0;)Ldi/r;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/a;->c1(Ldi/o0;)Ldi/a;

    move-result-object p1

    return-object p1
.end method

.method public final Z0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/a;->m:Ldi/o0;

    return-object v0
.end method

.method public a1(Z)Ldi/a;
    .locals 3

    new-instance v0, Ldi/a;

    invoke-virtual {p0}, Ldi/a;->W0()Ldi/o0;

    move-result-object v1

    invoke-virtual {v1, p1}, Ldi/o0;->U0(Z)Ldi/o0;

    move-result-object v1

    iget-object v2, p0, Ldi/a;->m:Ldi/o0;

    invoke-virtual {v2, p1}, Ldi/o0;->U0(Z)Ldi/o0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ldi/a;-><init>(Ldi/o0;Ldi/o0;)V

    return-object v0
.end method

.method public b1(Lei/g;)Ldi/a;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/a;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldi/a;->W0()Ldi/o0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1, v1}, Lei/g;->h(Lhi/i;)Ldi/g0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Ldi/o0;

    .line 22
    .line 23
    iget-object v3, p0, Ldi/a;->m:Ldi/o0;

    .line 24
    .line 25
    invoke-virtual {p1, v3}, Lei/g;->h(Lhi/i;)Ldi/g0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Ldi/o0;

    .line 33
    .line 34
    invoke-direct {v0, v1, p1}, Ldi/a;-><init>(Ldi/o0;Ldi/o0;)V

    .line 35
    .line 36
    .line 37
    return-object v0
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

.method public c1(Ldi/o0;)Ldi/a;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/a;

    .line 7
    .line 8
    iget-object v1, p0, Ldi/a;->m:Ldi/o0;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ldi/a;-><init>(Ldi/o0;Ldi/o0;)V

    .line 11
    .line 12
    .line 13
    return-object v0
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
    .line 25
    .line 26
    .line 27
.end method
