.class public abstract Ldi/s;
.super Ldi/r;
.source "SourceFile"


# instance fields
.field private final l:Ldi/o0;


# direct methods
.method public constructor <init>(Ldi/o0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldi/r;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldi/s;->l:Ldi/o0;

    .line 10
    .line 11
    return-void
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
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/s;->U0(Z)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/s;->V0(Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Ldi/o0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldi/r;->O0()Z

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
    invoke-virtual {p0}, Ldi/s;->W0()Ldi/o0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Ldi/o0;->U0(Z)Ldi/o0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Ldi/r;->M0()Ldi/c1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Ldi/o0;->V0(Ldi/c1;)Ldi/o0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
.end method

.method public V0(Ldi/c1;)Ldi/o0;
    .locals 1

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldi/r;->M0()Ldi/c1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ldi/q0;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Ldi/q0;-><init>(Ldi/o0;Ldi/c1;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, p0

    .line 19
    :goto_0
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method protected W0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/s;->l:Ldi/o0;

    return-object v0
.end method
