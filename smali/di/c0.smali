.class public final Ldi/c0;
.super Ldi/a0;
.source "SourceFile"

# interfaces
.implements Ldi/t1;


# instance fields
.field private final n:Ldi/a0;

.field private final o:Ldi/g0;


# direct methods
.method public constructor <init>(Ldi/a0;Ldi/g0;)V
    .locals 2

    .line 1
    const-string v0, "origin"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enhancement"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ldi/a0;->V0()Ldi/o0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Ldi/a0;->W0()Ldi/o0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0, v0, v1}, Ldi/a0;-><init>(Ldi/o0;Ldi/o0;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldi/c0;->n:Ldi/a0;

    .line 23
    .line 24
    iput-object p2, p0, Ldi/c0;->o:Ldi/g0;

    .line 25
    .line 26
    return-void
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
.method public bridge synthetic F0()Ldi/v1;
    .locals 1

    invoke-virtual {p0}, Ldi/c0;->Y0()Ldi/a0;

    move-result-object v0

    return-object v0
.end method

.method public G()Ldi/g0;
    .locals 1

    iget-object v0, p0, Ldi/c0;->o:Ldi/g0;

    return-object v0
.end method

.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/c0;->Z0(Lei/g;)Ldi/c0;

    move-result-object p1

    return-object p1
.end method

.method public R0(Z)Ldi/v1;
    .locals 2

    invoke-virtual {p0}, Ldi/c0;->Y0()Ldi/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldi/v1;->R0(Z)Ldi/v1;

    move-result-object v0

    invoke-virtual {p0}, Ldi/c0;->G()Ldi/g0;

    move-result-object v1

    invoke-virtual {v1}, Ldi/g0;->Q0()Ldi/v1;

    move-result-object v1

    invoke-virtual {v1, p1}, Ldi/v1;->R0(Z)Ldi/v1;

    move-result-object p1

    invoke-static {v0, p1}, Ldi/u1;->d(Ldi/v1;Ldi/g0;)Ldi/v1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/c0;->Z0(Lei/g;)Ldi/c0;

    move-result-object p1

    return-object p1
.end method

.method public T0(Ldi/c1;)Ldi/v1;
    .locals 1

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldi/c0;->Y0()Ldi/a0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ldi/v1;->T0(Ldi/c1;)Ldi/v1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Ldi/c0;->G()Ldi/g0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1, v0}, Ldi/u1;->d(Ldi/v1;Ldi/g0;)Ldi/v1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public U0()Ldi/o0;
    .locals 1

    invoke-virtual {p0}, Ldi/c0;->Y0()Ldi/a0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/a0;->U0()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method public X0(Loh/c;Loh/f;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "renderer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Loh/f;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ldi/c0;->G()Ldi/g0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1, p2}, Loh/c;->w(Ldi/g0;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-virtual {p0}, Ldi/c0;->Y0()Ldi/a0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1, p2}, Ldi/a0;->X0(Loh/c;Loh/f;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
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

.method public Y0()Ldi/a0;
    .locals 1

    iget-object v0, p0, Ldi/c0;->n:Ldi/a0;

    return-object v0
.end method

.method public Z0(Lei/g;)Ldi/c0;
    .locals 3

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/c0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldi/c0;->Y0()Ldi/a0;

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
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Ldi/a0;

    .line 22
    .line 23
    invoke-virtual {p0}, Ldi/c0;->G()Ldi/g0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1, v2}, Lei/g;->h(Lhi/i;)Ldi/g0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, v1, p1}, Ldi/c0;-><init>(Ldi/a0;Ldi/g0;)V

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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[@EnhancedForWarnings("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ldi/c0;->G()Ldi/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ldi/c0;->Y0()Ldi/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
