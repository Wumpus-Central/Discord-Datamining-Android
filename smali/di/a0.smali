.class public abstract Ldi/a0;
.super Ldi/v1;
.source "SourceFile"

# interfaces
.implements Lhi/g;


# instance fields
.field private final l:Ldi/o0;

.field private final m:Ldi/o0;


# direct methods
.method public constructor <init>(Ldi/o0;Ldi/o0;)V
    .locals 1

    .line 1
    const-string v0, "lowerBound"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "upperBound"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Ldi/v1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ldi/a0;->l:Ldi/o0;

    .line 16
    .line 17
    iput-object p2, p0, Ldi/a0;->m:Ldi/o0;

    .line 18
    .line 19
    return-void
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

    invoke-virtual {p0}, Ldi/a0;->U0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->L0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Ldi/c1;
    .locals 1

    invoke-virtual {p0}, Ldi/a0;->U0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->M0()Ldi/c1;

    move-result-object v0

    return-object v0
.end method

.method public N0()Ldi/g1;
    .locals 1

    invoke-virtual {p0}, Ldi/a0;->U0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    invoke-virtual {p0}, Ldi/a0;->U0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->O0()Z

    move-result v0

    return v0
.end method

.method public abstract U0()Ldi/o0;
.end method

.method public final V0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/a0;->l:Ldi/o0;

    return-object v0
.end method

.method public final W0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/a0;->m:Ldi/o0;

    return-object v0
.end method

.method public abstract X0(Loh/c;Loh/f;)Ljava/lang/String;
.end method

.method public p()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Ldi/a0;->U0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->p()Lwh/h;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Loh/c;->j:Loh/c;

    invoke-virtual {v0, p0}, Loh/c;->w(Ldi/g0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
