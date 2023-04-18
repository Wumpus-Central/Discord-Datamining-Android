.class public final Ldi/v;
.super Ldi/a0;
.source "SourceFile"

# interfaces
.implements Lhi/f;


# instance fields
.field private final n:Ldi/c1;


# direct methods
.method public constructor <init>(Ljg/h;Ldi/c1;)V
    .locals 2

    .line 1
    const-string v0, "builtIns"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljg/h;->H()Ldi/o0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "builtIns.nothingType"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljg/h;->I()Ldi/o0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "builtIns.nullableAnyType"

    .line 25
    .line 26
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Ldi/a0;-><init>(Ldi/o0;Ldi/o0;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Ldi/v;->n:Ldi/c1;

    .line 33
    .line 34
    return-void
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
.method public M0()Ldi/c1;
    .locals 1

    iget-object v0, p0, Ldi/v;->n:Ldi/c1;

    return-object v0
.end method

.method public O0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/v;->Z0(Lei/g;)Ldi/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/v;->Y0(Z)Ldi/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/v;->Z0(Lei/g;)Ldi/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/v;->a1(Ldi/c1;)Ldi/v;

    move-result-object p1

    return-object p1
.end method

.method public U0()Ldi/o0;
    .locals 1

    invoke-virtual {p0}, Ldi/a0;->W0()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method public X0(Loh/c;Loh/f;)Ljava/lang/String;
    .locals 1

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "options"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dynamic"

    return-object p1
.end method

.method public Y0(Z)Ldi/v;
    .locals 0

    return-object p0
.end method

.method public Z0(Lei/g;)Ldi/v;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public a1(Ldi/c1;)Ldi/v;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/v;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldi/v;->U0()Ldi/o0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lii/a;->i(Ldi/g0;)Ljg/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, p1}, Ldi/v;-><init>(Ljg/h;Ldi/c1;)V

    .line 17
    .line 18
    .line 19
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
