.class public abstract Ldi/x1;
.super Ldi/g0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldi/g0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-virtual {p0}, Ldi/x1;->R0()Ldi/g0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->L0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Ldi/c1;
    .locals 1

    invoke-virtual {p0}, Ldi/x1;->R0()Ldi/g0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->M0()Ldi/c1;

    move-result-object v0

    return-object v0
.end method

.method public N0()Ldi/g1;
    .locals 1

    invoke-virtual {p0}, Ldi/x1;->R0()Ldi/g0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    invoke-virtual {p0}, Ldi/x1;->R0()Ldi/g0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->O0()Z

    move-result v0

    return v0
.end method

.method public final Q0()Ldi/v1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldi/x1;->R0()Ldi/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    instance-of v1, v0, Ldi/x1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldi/x1;

    .line 10
    .line 11
    invoke-virtual {v0}, Ldi/x1;->R0()Ldi/g0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v0, Ldi/v1;

    .line 22
    .line 23
    return-object v0
    .line 24
.end method

.method protected abstract R0()Ldi/g0;
.end method

.method public S0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public p()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Ldi/x1;->R0()Ldi/g0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->p()Lwh/h;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldi/x1;->S0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldi/x1;->R0()Ldi/g0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v0, "<Not computed yet>"

    .line 17
    .line 18
    :goto_0
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
