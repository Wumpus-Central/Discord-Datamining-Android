.class public final Lpg/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldi/g1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/d;-><init>(Lmg/m;Lng/g;Llh/f;Lmg/a1;Lmg/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lpg/d;


# direct methods
.method constructor <init>(Lpg/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpg/d$c;->a:Lpg/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.method public c()Lmg/e1;
    .locals 1

    iget-object v0, p0, Lpg/d$c;->a:Lpg/d;

    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpg/d$c;->a:Lpg/d;

    invoke-virtual {v0}, Lpg/d;->M0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lpg/d$c;->c()Lmg/e1;

    move-result-object v0

    invoke-interface {v0}, Lmg/e1;->g0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    move-result-object v0

    invoke-interface {v0}, Ldi/g1;->n()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "declarationDescriptor.un\u2026pe.constructor.supertypes"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public o()Ljg/h;
    .locals 1

    invoke-virtual {p0}, Lpg/d$c;->c()Lmg/e1;

    move-result-object v0

    invoke-static {v0}, Lth/c;->j(Lmg/m;)Ljg/h;

    move-result-object v0

    return-object v0
.end method

.method public p(Lei/g;)Ldi/g1;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic q()Lmg/h;
    .locals 1

    invoke-virtual {p0}, Lpg/d$c;->c()Lmg/e1;

    move-result-object v0

    return-object v0
.end method

.method public r()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[typealias "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpg/d$c;->c()Lmg/e1;

    move-result-object v1

    invoke-interface {v1}, Lmg/j0;->getName()Llh/f;

    move-result-object v1

    invoke-virtual {v1}, Llh/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
