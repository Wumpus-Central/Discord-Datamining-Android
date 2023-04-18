.class final Ldi/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldi/g1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lei/g;

.field private final b:Lkotlin/Lazy;

.field final synthetic c:Ldi/g;


# direct methods
.method public constructor <init>(Ldi/g;Lei/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lei/g;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldi/g$a;->c:Ldi/g;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Ldi/g$a;->a:Lei/g;

    .line 12
    .line 13
    sget-object p2, Llf/p;->l:Llf/p;

    .line 14
    .line 15
    new-instance v0, Ldi/g$a$a;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Ldi/g$a$a;-><init>(Ldi/g$a;Ldi/g;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2, v0}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Ldi/g$a;->b:Lkotlin/Lazy;

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

.method public static final synthetic c(Ldi/g$a;)Lei/g;
    .locals 0

    iget-object p0, p0, Ldi/g$a;->a:Lei/g;

    return-object p0
.end method

.method private final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldi/g$a;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Ldi/g$a;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    invoke-virtual {v0, p1}, Ldi/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getParameters()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    invoke-interface {v0}, Ldi/g1;->getParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "this@AbstractTypeConstructor.parameters"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    invoke-virtual {v0}, Ldi/m;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic n()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Ldi/g$a;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljg/h;
    .locals 2

    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    invoke-interface {v0}, Ldi/g1;->o()Ljg/h;

    move-result-object v0

    const-string v1, "this@AbstractTypeConstructor.builtIns"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public p(Lei/g;)Ldi/g1;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ldi/g;->p(Lei/g;)Ldi/g1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public q()Lmg/h;
    .locals 1

    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    invoke-virtual {v0}, Ldi/m;->q()Lmg/h;

    move-result-object v0

    return-object v0
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    invoke-interface {v0}, Ldi/g1;->r()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldi/g$a;->c:Ldi/g;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
