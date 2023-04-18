.class public abstract Ldi/r;
.super Ldi/o0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldi/o0;-><init>()V

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

    invoke-virtual {p0}, Ldi/r;->W0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->L0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Ldi/c1;
    .locals 1

    invoke-virtual {p0}, Ldi/r;->W0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->M0()Ldi/c1;

    move-result-object v0

    return-object v0
.end method

.method public N0()Ldi/g1;
    .locals 1

    invoke-virtual {p0}, Ldi/r;->W0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    invoke-virtual {p0}, Ldi/r;->W0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->O0()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/r;->X0(Lei/g;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/r;->X0(Lei/g;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method protected abstract W0()Ldi/o0;
.end method

.method public X0(Lei/g;)Ldi/o0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldi/r;->W0()Ldi/o0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Lei/g;->h(Lhi/i;)Ldi/g0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Ldi/o0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ldi/r;->Y0(Ldi/o0;)Ldi/r;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
    .line 26
    .line 27
.end method

.method public abstract Y0(Ldi/o0;)Ldi/r;
.end method

.method public p()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Ldi/r;->W0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->p()Lwh/h;

    move-result-object v0

    return-object v0
.end method
