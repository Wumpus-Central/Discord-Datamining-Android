.class public abstract Lpg/c;
.super Lpg/j;
.source "SourceFile"

# interfaces
.implements Lmg/x0;


# direct methods
.method public constructor <init>(Lng/g;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Lpg/c;->G(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    sget-object v0, Llh/h;->i:Llh/f;

    .line 8
    .line 9
    invoke-direct {p0, p1, v0}, Lpg/j;-><init>(Lng/g;Llh/f;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method private static synthetic G(I)V
    .locals 6

    packed-switch p0, :pswitch_data_0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_0
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    const/4 v2, 0x3

    goto :goto_1

    :pswitch_1
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "annotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_2
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_3
    const-string v5, "substitutor"

    aput-object v5, v2, v4

    :goto_2
    const/4 v4, 0x1

    packed-switch p0, :pswitch_data_3

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_4
    const-string v3, "getSource"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_5
    const-string v3, "getOriginal"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_6
    const-string v3, "getVisibility"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_7
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_8
    const-string v3, "getValueParameters"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_9
    const-string v3, "getType"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_a
    const-string v3, "getTypeParameters"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_b
    const-string v3, "getContextReceiverParameters"

    aput-object v3, v2, v4

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_c
    const-string v3, "substitute"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_d
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_c
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x2
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
    .end packed-switch
.end method


# virtual methods
.method public A0()Lmg/r0;
    .locals 0

    return-object p0
.end method

.method public F()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic a()Lmg/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lpg/c;->A0()Lmg/r0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lmg/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lpg/c;->A0()Lmg/r0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ldi/p1;)Lmg/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lpg/c;->c(Ldi/p1;)Lmg/x0;

    move-result-object p1

    return-object p1
.end method

.method public c(Ldi/p1;)Lmg/x0;
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Lpg/c;->G(I)V

    .line 2
    :cond_0
    invoke-virtual {p1}, Ldi/p1;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 3
    :cond_1
    invoke-interface {p0}, Lmg/i1;->b()Lmg/m;

    move-result-object v0

    instance-of v0, v0, Lmg/e;

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p0}, Lpg/c;->getType()Ldi/g0;

    move-result-object v0

    sget-object v1, Ldi/w1;->q:Ldi/w1;

    invoke-virtual {p1, v0, v1}, Ldi/p1;->p(Ldi/g0;Ldi/w1;)Ldi/g0;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_2
    invoke-virtual {p0}, Lpg/c;->getType()Ldi/g0;

    move-result-object v0

    sget-object v1, Ldi/w1;->o:Ldi/w1;

    invoke-virtual {p1, v0, v1}, Ldi/p1;->p(Ldi/g0;Ldi/w1;)Ldi/g0;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_3

    const/4 p1, 0x0

    return-object p1

    .line 6
    :cond_3
    invoke-virtual {p0}, Lpg/c;->getType()Ldi/g0;

    move-result-object v0

    if-ne p1, v0, :cond_4

    return-object p0

    .line 7
    :cond_4
    new-instance v0, Lpg/f0;

    invoke-interface {p0}, Lmg/i1;->b()Lmg/m;

    move-result-object v1

    new-instance v2, Lxh/j;

    invoke-direct {v2, p1}, Lxh/j;-><init>(Ldi/g0;)V

    invoke-virtual {p0}, Lng/b;->getAnnotations()Lng/g;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lpg/f0;-><init>(Lmg/m;Lxh/g;Lng/g;)V

    return-object v0
.end method

.method public e()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "+",
            "Lmg/a;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, Lpg/c;->G(I)V

    :cond_0
    return-object v0
.end method

.method public f0()Lmg/x0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getReturnType()Ldi/g0;
    .locals 1

    invoke-virtual {p0}, Lpg/c;->getType()Ldi/g0;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ldi/g0;
    .locals 2

    invoke-interface {p0}, Lmg/x0;->getValue()Lxh/g;

    move-result-object v0

    invoke-interface {v0}, Lxh/g;->getType()Ldi/g0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, Lpg/c;->G(I)V

    :cond_0
    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x3

    invoke-static {v1}, Lpg/c;->G(I)V

    :cond_0
    return-object v0
.end method

.method public getVisibility()Lmg/u;
    .locals 2

    sget-object v0, Lmg/t;->f:Lmg/u;

    if-nez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, Lpg/c;->G(I)V

    :cond_0
    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/j1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, Lpg/c;->G(I)V

    :cond_0
    return-object v0
.end method

.method public j()Lmg/a1;
    .locals 2

    sget-object v0, Lmg/a1;->a:Lmg/a1;

    if-nez v0, :cond_0

    const/16 v1, 0x9

    invoke-static {v1}, Lpg/c;->G(I)V

    :cond_0
    return-object v0
.end method

.method public k0()Lmg/x0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public t0(Lmg/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
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

    invoke-interface {p1, p0, p2}, Lmg/o;->a(Lmg/x0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
