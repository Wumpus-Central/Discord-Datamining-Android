.class public final Lfi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/u0;


# instance fields
.field private final synthetic k:Lpg/c0;


# direct methods
.method public constructor <init>()V
    .locals 21

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lfi/k;->a:Lfi/k;

    .line 5
    .line 6
    invoke-virtual {v0}, Lfi/k;->h()Lfi/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lng/g;->f:Lng/g$a;

    .line 11
    .line 12
    invoke-virtual {v2}, Lng/g$a;->b()Lng/g;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Lmg/e0;->n:Lmg/e0;

    .line 17
    .line 18
    sget-object v4, Lmg/t;->e:Lmg/u;

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    sget-object v6, Lfi/b;->p:Lfi/b;

    .line 22
    .line 23
    invoke-virtual {v6}, Lfi/b;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-static {v6}, Llh/f;->k(Ljava/lang/String;)Llh/f;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    sget-object v7, Lmg/b$a;->k:Lmg/b$a;

    .line 32
    .line 33
    sget-object v8, Lmg/a1;->a:Lmg/a1;

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    const/4 v14, 0x0

    .line 41
    invoke-static/range {v1 .. v14}, Lpg/c0;->O0(Lmg/m;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/b$a;Lmg/a1;ZZZZZZ)Lpg/c0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Lfi/k;->k()Ldi/g0;

    .line 46
    .line 47
    .line 48
    move-result-object v16

    .line 49
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v17

    .line 53
    const/16 v18, 0x0

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v20

    .line 61
    move-object v15, v1

    .line 62
    invoke-virtual/range {v15 .. v20}, Lpg/c0;->b1(Ldi/g0;Ljava/util/List;Lmg/x0;Lmg/x0;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v0, p0

    .line 66
    .line 67
    iput-object v1, v0, Lfi/e;->k:Lpg/c0;

    .line 68
    .line 69
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method


# virtual methods
.method public B(Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Z)Lmg/b;
    .locals 6

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lpg/c0;->N0(Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Z)Lmg/u0;

    move-result-object p1

    return-object p1
.end method

.method public E0()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->E0()Z

    move-result v0

    return v0
.end method

.method public F()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/m0;->F()Z

    move-result v0

    return v0
.end method

.method public K()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->K()Z

    move-result v0

    return v0
.end method

.method public M()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->M()Z

    move-result v0

    return v0
.end method

.method public X()Lrh/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/n0;->X()Lrh/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lmg/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfi/e;->a()Lmg/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lmg/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lfi/e;->a()Lmg/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lmg/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lfi/e;->a()Lmg/u0;

    move-result-object v0

    return-object v0
.end method

.method public a()Lmg/u0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->a()Lmg/u0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lmg/m;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/k;->b()Lmg/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ldi/p1;)Lmg/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfi/e;->c(Ldi/p1;)Lmg/u0;

    move-result-object p1

    return-object p1
.end method

.method public c(Ldi/p1;)Lmg/u0;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0, p1}, Lpg/c0;->c(Ldi/p1;)Lmg/u0;

    move-result-object p1

    return-object p1
.end method

.method public e()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "+",
            "Lmg/u0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->e()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public f()Lmg/v0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->R0()Lpg/d0;

    move-result-object v0

    return-object v0
.end method

.method public f0()Lmg/x0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->f0()Lmg/x0;

    move-result-object v0

    return-object v0
.end method

.method public g()Lmg/b$a;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->g()Lmg/b$a;

    move-result-object v0

    return-object v0
.end method

.method public getAnnotations()Lng/g;
    .locals 2

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lng/b;->getAnnotations()Lng/g;

    move-result-object v0

    const-string v1, "<get-annotations>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getName()Llh/f;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/j;->getName()Llh/f;

    move-result-object v0

    return-object v0
.end method

.method public getReturnType()Ldi/g0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->getReturnType()Ldi/g0;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ldi/g0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/m0;->getType()Ldi/g0;

    move-result-object v0

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()Lmg/u;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->getVisibility()Lmg/u;

    move-result-object v0

    return-object v0
.end method

.method public h()Lmg/w0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->h()Lmg/w0;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/j1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/m0;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i0()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/n0;->i0()Z

    move-result v0

    return v0
.end method

.method public isExternal()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->isExternal()Z

    move-result v0

    return v0
.end method

.method public j()Lmg/a1;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/k;->j()Lmg/a1;

    move-result-object v0

    return-object v0
.end method

.method public k0()Lmg/x0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->k0()Lmg/x0;

    move-result-object v0

    return-object v0
.end method

.method public l()Lmg/e0;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->l()Lmg/e0;

    move-result-object v0

    return-object v0
.end method

.method public l0()Lmg/w;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->l0()Lmg/w;

    move-result-object v0

    return-object v0
.end method

.method public o0()Lmg/w;
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->o0()Lmg/w;

    move-result-object v0

    return-object v0
.end method

.method public p0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/x0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->p0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public q0()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->q0()Z

    move-result v0

    return v0
.end method

.method public t0(Lmg/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            ">(",
            "Lmg/o<",
            "TR;TD;>;TD;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0, p1, p2}, Lpg/c0;->t0(Lmg/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/t0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->v()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public v0(Lmg/a$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lmg/a$a<",
            "TV;>;)TV;"
        }
    .end annotation

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0, p1}, Lpg/c0;->v0(Lmg/a$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lmg/b;",
            ">;)V"
        }
    .end annotation

    const-string v0, "overriddenDescriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0, p1}, Lpg/c0;->x0(Ljava/util/Collection;)V

    return-void
.end method

.method public y()Z
    .locals 1

    iget-object v0, p0, Lfi/e;->k:Lpg/c0;

    invoke-virtual {v0}, Lpg/c0;->y()Z

    move-result v0

    return v0
.end method
