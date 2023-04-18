.class public final Ldi/j0;
.super Ldi/x1;
.source "SourceFile"


# instance fields
.field private final l:Lci/n;

.field private final m:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci/n;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lci/n;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ldi/g0;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "computation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldi/x1;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldi/j0;->l:Lci/n;

    .line 15
    .line 16
    iput-object p2, p0, Ldi/j0;->m:Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    invoke-interface {p1, p2}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Ldi/j0;->n:Lci/i;

    .line 23
    .line 24
    return-void
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

.method public static final synthetic T0(Ldi/j0;)Lkotlin/jvm/functions/Function0;
    .locals 0

    iget-object p0, p0, Ldi/j0;->m:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/j0;->U0(Lei/g;)Ldi/j0;

    move-result-object p1

    return-object p1
.end method

.method protected R0()Ldi/g0;
    .locals 1

    iget-object v0, p0, Ldi/j0;->n:Lci/i;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/g0;

    return-object v0
.end method

.method public S0()Z
    .locals 1

    iget-object v0, p0, Ldi/j0;->n:Lci/i;

    invoke-interface {v0}, Lci/i;->c()Z

    move-result v0

    return v0
.end method

.method public U0(Lei/g;)Ldi/j0;
    .locals 3

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/j0;

    .line 7
    .line 8
    iget-object v1, p0, Ldi/j0;->l:Lci/n;

    .line 9
    .line 10
    new-instance v2, Ldi/j0$a;

    .line 11
    .line 12
    invoke-direct {v2, p1, p0}, Ldi/j0$a;-><init>(Lei/g;Ldi/j0;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ldi/j0;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    return-object v0
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
