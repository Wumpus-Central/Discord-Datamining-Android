.class public final Lfi/h;
.super Ldi/o0;
.source "SourceFile"


# instance fields
.field private final l:Ldi/g1;

.field private final m:Lwh/h;

.field private final n:Lfi/j;

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldi/k1;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Z

.field private final q:[Ljava/lang/String;

.field private final r:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Ldi/g1;Lwh/h;Lfi/j;Ljava/util/List;Z[Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/g1;",
            "Lwh/h;",
            "Lfi/j;",
            "Ljava/util/List<",
            "+",
            "Ldi/k1;",
            ">;Z[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ldi/o0;-><init>()V

    .line 4
    iput-object p1, p0, Lfi/h;->l:Ldi/g1;

    .line 5
    iput-object p2, p0, Lfi/h;->m:Lwh/h;

    .line 6
    iput-object p3, p0, Lfi/h;->n:Lfi/j;

    .line 7
    iput-object p4, p0, Lfi/h;->o:Ljava/util/List;

    .line 8
    iput-boolean p5, p0, Lfi/h;->p:Z

    .line 9
    iput-object p6, p0, Lfi/h;->q:[Ljava/lang/String;

    .line 10
    sget-object p1, Lkotlin/jvm/internal/k0;->a:Lkotlin/jvm/internal/k0;

    invoke-virtual {p3}, Lfi/j;->b()Ljava/lang/String;

    move-result-object p1

    array-length p2, p6

    invoke-static {p6, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length p3, p2

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lfi/h;->r:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ldi/g1;Lwh/h;Lfi/j;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 1
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v6}, Lfi/h;-><init>(Ldi/g1;Lwh/h;Lfi/j;Ljava/util/List;Z[Ljava/lang/String;)V

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

    iget-object v0, p0, Lfi/h;->o:Ljava/util/List;

    return-object v0
.end method

.method public M0()Ldi/c1;
    .locals 1

    sget-object v0, Ldi/c1;->l:Ldi/c1$a;

    invoke-virtual {v0}, Ldi/c1$a;->h()Ldi/c1;

    move-result-object v0

    return-object v0
.end method

.method public N0()Ldi/g1;
    .locals 1

    iget-object v0, p0, Lfi/h;->l:Ldi/g1;

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lfi/h;->p:Z

    return v0
.end method

.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Lfi/h;->Y0(Lei/g;)Lfi/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lfi/h;->U0(Z)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lfi/h;->Y0(Lei/g;)Lfi/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Lfi/h;->V0(Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Ldi/o0;
    .locals 8

    new-instance v7, Lfi/h;

    invoke-virtual {p0}, Lfi/h;->N0()Ldi/g1;

    move-result-object v1

    invoke-virtual {p0}, Lfi/h;->p()Lwh/h;

    move-result-object v2

    iget-object v3, p0, Lfi/h;->n:Lfi/j;

    invoke-virtual {p0}, Lfi/h;->L0()Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, Lfi/h;->q:[Ljava/lang/String;

    array-length v5, v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Ljava/lang/String;

    move-object v0, v7

    move v5, p1

    invoke-direct/range {v0 .. v6}, Lfi/h;-><init>(Ldi/g1;Lwh/h;Lfi/j;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v7
.end method

.method public V0(Ldi/c1;)Ldi/o0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final W0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfi/h;->r:Ljava/lang/String;

    return-object v0
.end method

.method public final X0()Lfi/j;
    .locals 1

    iget-object v0, p0, Lfi/h;->n:Lfi/j;

    return-object v0
.end method

.method public Y0(Lei/g;)Lfi/h;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public p()Lwh/h;
    .locals 1

    iget-object v0, p0, Lfi/h;->m:Lwh/h;

    return-object v0
.end method
