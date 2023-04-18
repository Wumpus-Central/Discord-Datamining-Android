.class public Lpg/s;
.super Lpg/t;
.source "SourceFile"


# instance fields
.field private final l:Lpg/t;

.field private final m:Ldi/p1;

.field private n:Ldi/p1;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ldi/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lpg/t;Ldi/p1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpg/t;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpg/s;->l:Lpg/t;

    .line 5
    .line 6
    iput-object p2, p0, Lpg/s;->m:Ldi/p1;

    .line 7
    .line 8
    return-void
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

.method private static synthetic A0(I)V
    .locals 15

    const/16 v0, 0x17

    const/16 v1, 0xd

    const/16 v2, 0xa

    const/16 v3, 0x8

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq p0, v7, :cond_0

    if-eq p0, v6, :cond_0

    if-eq p0, v5, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v8, "@NotNull method %s.%s must not return null"

    goto :goto_0

    :cond_0
    const-string v8, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    :goto_0
    if-eq p0, v7, :cond_1

    if-eq p0, v6, :cond_1

    if-eq p0, v5, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v9, v7

    goto :goto_1

    :cond_1
    move v9, v6

    :goto_1
    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"

    const/4 v11, 0x0

    if-eq p0, v7, :cond_5

    if-eq p0, v6, :cond_4

    if-eq p0, v5, :cond_3

    if-eq p0, v4, :cond_4

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_3

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_2

    aput-object v10, v9, v11

    goto :goto_2

    :cond_2
    const-string v12, "substitutor"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_3
    const-string v12, "typeSubstitution"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_4
    const-string v12, "kotlinTypeRefiner"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_5
    const-string v12, "typeArguments"

    aput-object v12, v9, v11

    :goto_2
    const-string v11, "substitute"

    const-string v12, "getUnsubstitutedMemberScope"

    const-string v13, "getMemberScope"

    const/4 v14, 0x1

    packed-switch p0, :pswitch_data_0

    const-string v10, "getTypeConstructor"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_0
    const-string v10, "getSealedSubclasses"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_1
    const-string v10, "getDeclaredTypeParameters"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_2
    const-string v10, "getSource"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_3
    const-string v10, "getUnsubstitutedInnerClassesScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_4
    const-string v10, "getVisibility"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_5
    const-string v10, "getModality"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_6
    const-string v10, "getKind"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_7
    aput-object v11, v9, v14

    goto :goto_3

    :pswitch_8
    const-string v10, "getContainingDeclaration"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_9
    const-string v10, "getOriginal"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_a
    const-string v10, "getName"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_b
    const-string v10, "getAnnotations"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_c
    const-string v10, "getConstructors"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_d
    const-string v10, "getContextReceivers"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_e
    const-string v10, "getDefaultType"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_f
    const-string v10, "getStaticScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_10
    aput-object v12, v9, v14

    goto :goto_3

    :pswitch_11
    aput-object v13, v9, v14

    goto :goto_3

    :pswitch_12
    aput-object v10, v9, v14

    :goto_3
    if-eq p0, v7, :cond_8

    if-eq p0, v6, :cond_8

    if-eq p0, v5, :cond_8

    if-eq p0, v4, :cond_8

    if-eq p0, v3, :cond_8

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_6

    goto :goto_4

    :cond_6
    aput-object v11, v9, v7

    goto :goto_4

    :cond_7
    aput-object v12, v9, v7

    goto :goto_4

    :cond_8
    aput-object v13, v9, v7

    :goto_4
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eq p0, v7, :cond_9

    if-eq p0, v6, :cond_9

    if-eq p0, v5, :cond_9

    if-eq p0, v4, :cond_9

    if-eq p0, v3, :cond_9

    if-eq p0, v2, :cond_9

    if-eq p0, v1, :cond_9

    if-eq p0, v0, :cond_9

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_12
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_12
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic F0(Lpg/s;Ldi/o0;)Ldi/o0;
    .locals 0

    invoke-direct {p0, p1}, Lpg/s;->M0(Ldi/o0;)Ldi/o0;

    move-result-object p0

    return-object p0
.end method

.method private K0()Ldi/p1;
    .locals 3

    .line 1
    iget-object v0, p0, Lpg/s;->n:Ldi/p1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lpg/s;->m:Ldi/p1;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldi/p1;->k()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lpg/s;->m:Ldi/p1;

    .line 14
    .line 15
    iput-object v0, p0, Lpg/s;->n:Ldi/p1;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    .line 19
    .line 20
    invoke-interface {v0}, Lmg/h;->k()Ldi/g1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lpg/s;->o:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p0, Lpg/s;->m:Ldi/p1;

    .line 40
    .line 41
    invoke-virtual {v1}, Ldi/p1;->j()Ldi/n1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v2, p0, Lpg/s;->o:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v0, v1, p0, v2}, Ldi/t;->b(Ljava/util/List;Ldi/n1;Lmg/m;Ljava/util/List;)Ldi/p1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lpg/s;->n:Ldi/p1;

    .line 52
    .line 53
    iget-object v0, p0, Lpg/s;->o:Ljava/util/List;

    .line 54
    .line 55
    new-instance v1, Lpg/s$a;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lpg/s$a;-><init>(Lpg/s;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/collections/h;->Q(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lpg/s;->p:Ljava/util/List;

    .line 65
    .line 66
    :cond_1
    :goto_0
    iget-object v0, p0, Lpg/s;->n:Ldi/p1;

    .line 67
    .line 68
    return-object v0
    .line 69
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

.method private M0(Ldi/o0;)Ldi/o0;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lpg/s;->m:Ldi/p1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldi/p1;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, Lpg/s;->K0()Ldi/p1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ldi/w1;->o:Ldi/w1;

    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Ldi/p1;->p(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ldi/o0;

    .line 23
    .line 24
    :cond_1
    :goto_0
    return-object p1
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public C()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->C()Z

    move-result v0

    return v0
.end method

.method public D0()Lwh/h;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-static {v0}, Lph/e;->g(Lmg/m;)Lmg/h0;

    move-result-object v0

    invoke-static {v0}, Lth/c;->o(Lmg/h0;)Lei/g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpg/s;->c0(Lei/g;)Lwh/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xc

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public E0()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/d0;->E0()Z

    move-result v0

    return v0
.end method

.method public G(Ldi/n1;Lei/g;)Lwh/h;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    invoke-static {v0}, Lpg/s;->A0(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p2, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    invoke-static {v0}, Lpg/s;->A0(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lpg/t;->G(Ldi/n1;Lei/g;)Lwh/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, Lpg/s;->m:Ldi/p1;

    .line 20
    .line 21
    invoke-virtual {p2}, Ldi/p1;->k()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    const/4 p2, 0x7

    .line 30
    invoke-static {p2}, Lpg/s;->A0(I)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-object p1

    .line 34
    :cond_3
    new-instance p2, Lwh/m;

    .line 35
    .line 36
    invoke-direct {p0}, Lpg/s;->K0()Ldi/p1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p2, p1, v0}, Lwh/m;-><init>(Lwh/h;Ldi/p1;)V

    .line 41
    .line 42
    .line 43
    return-object p2
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public H0()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/x0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x11

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public I()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->I()Ljava/util/Collection;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1f

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public I0()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->I0()Z

    move-result v0

    return v0
.end method

.method public J()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->J()Z

    move-result v0

    return v0
.end method

.method public J0()Lmg/x0;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public K()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/d0;->K()Z

    move-result v0

    return v0
.end method

.method public L()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/i;->L()Z

    move-result v0

    return v0
.end method

.method public L0(Ldi/p1;)Lmg/e;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x17

    .line 4
    .line 5
    invoke-static {v0}, Lpg/s;->A0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Ldi/p1;->k()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v0, Lpg/s;

    .line 16
    .line 17
    invoke-virtual {p1}, Ldi/p1;->j()Ldi/n1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0}, Lpg/s;->K0()Ldi/p1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ldi/p1;->j()Ldi/n1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {p1, v1}, Ldi/p1;->h(Ldi/n1;Ldi/n1;)Ldi/p1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v0, p0, p1}, Lpg/s;-><init>(Lpg/t;Ldi/p1;)V

    .line 34
    .line 35
    .line 36
    return-object v0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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
.end method

.method public O(Ldi/n1;)Lwh/h;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    invoke-static {v0}, Lpg/s;->A0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Lph/e;->g(Lmg/m;)Lmg/h0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lth/c;->o(Lmg/h0;)Lei/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, p1, v0}, Lpg/s;->G(Ldi/n1;Lei/g;)Lwh/h;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xb

    .line 23
    .line 24
    invoke-static {v0}, Lpg/s;->A0(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-object p1
.end method

.method public R()Lmg/d;
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->R()Lmg/d;

    move-result-object v0

    return-object v0
.end method

.method public S()Lwh/h;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->S()Lwh/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public U()Lmg/e;
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->U()Lmg/e;

    move-result-object v0

    return-object v0
.end method

.method public a()Lmg/e;
    .locals 2

    .line 3
    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->a()Lmg/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic a()Lmg/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lpg/s;->a()Lmg/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lmg/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lpg/s;->a()Lmg/e;

    move-result-object v0

    return-object v0
.end method

.method public b()Lmg/m;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->b()Lmg/m;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x16

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic c(Ldi/p1;)Lmg/n;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/s;->L0(Ldi/p1;)Lmg/e;

    move-result-object p1

    return-object p1
.end method

.method public c0(Lei/g;)Lwh/h;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    invoke-static {v0}, Lpg/s;->A0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lpg/t;->c0(Lei/g;)Lwh/h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lpg/s;->m:Ldi/p1;

    .line 15
    .line 16
    invoke-virtual {v0}, Ldi/p1;->k()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const/16 v0, 0xe

    .line 25
    .line 26
    invoke-static {v0}, Lpg/s;->A0(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-object p1

    .line 30
    :cond_2
    new-instance v0, Lwh/m;

    .line 31
    .line 32
    invoke-direct {p0}, Lpg/s;->K0()Ldi/p1;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, p1, v1}, Lwh/m;-><init>(Lwh/h;Ldi/p1;)V

    .line 37
    .line 38
    .line 39
    return-object v0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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
.end method

.method public g()Lmg/f;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->g()Lmg/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x19

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public getAnnotations()Lng/g;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lng/a;->getAnnotations()Lng/g;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x13

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public getName()Llh/f;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/j0;->getName()Llh/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x14

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public getVisibility()Lmg/u;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->getVisibility()Lmg/u;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1b

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/d0;->isExternal()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->isInline()Z

    move-result v0

    return v0
.end method

.method public j()Lmg/a1;
    .locals 2

    sget-object v0, Lmg/a1;->a:Lmg/a1;

    if-nez v0, :cond_0

    const/16 v1, 0x1d

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public k()Ldi/g1;
    .locals 5

    .line 1
    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lmg/h;->k()Ldi/g1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lpg/s;->m:Ldi/p1;

    .line 8
    .line 9
    invoke-virtual {v1}, Ldi/p1;->k()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v1}, Lpg/s;->A0(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0

    .line 22
    :cond_1
    iget-object v1, p0, Lpg/s;->q:Ldi/g1;

    .line 23
    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    invoke-direct {p0}, Lpg/s;->K0()Ldi/p1;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0}, Ldi/g1;->n()Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ldi/g0;

    .line 58
    .line 59
    sget-object v4, Ldi/w1;->o:Ldi/w1;

    .line 60
    .line 61
    invoke-virtual {v1, v3, v4}, Ldi/p1;->p(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance v0, Ldi/l;

    .line 70
    .line 71
    iget-object v1, p0, Lpg/s;->o:Ljava/util/List;

    .line 72
    .line 73
    sget-object v3, Lci/f;->e:Lci/n;

    .line 74
    .line 75
    invoke-direct {v0, p0, v1, v2, v3}, Ldi/l;-><init>(Lmg/e;Ljava/util/List;Ljava/util/Collection;Lci/n;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lpg/s;->q:Ldi/g1;

    .line 79
    .line 80
    :cond_3
    iget-object v0, p0, Lpg/s;->q:Ldi/g1;

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-static {v1}, Lpg/s;->A0(I)V

    .line 86
    .line 87
    .line 88
    :cond_4
    return-object v0
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

.method public l()Lmg/e0;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->l()Lmg/e0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1a

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public m()Ljava/util/Collection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lmg/e;->m()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lmg/d;

    .line 31
    .line 32
    invoke-interface {v2}, Lmg/y;->t()Lmg/y$a;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v2}, Lmg/d;->a()Lmg/d;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v3, v4}, Lmg/y$a;->i(Lmg/b;)Lmg/y$a;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v2}, Lmg/d0;->l()Lmg/e0;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v3, v4}, Lmg/y$a;->l(Lmg/e0;)Lmg/y$a;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v2}, Lmg/d0;->getVisibility()Lmg/u;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v3, v4}, Lmg/y$a;->s(Lmg/u;)Lmg/y$a;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v2}, Lmg/b;->g()Lmg/b$a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v3, v2}, Lmg/y$a;->d(Lmg/b$a;)Lmg/y$a;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-interface {v2, v3}, Lmg/y$a;->k(Z)Lmg/y$a;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, Lmg/y$a;->build()Lmg/y;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lmg/d;

    .line 78
    .line 79
    invoke-direct {p0}, Lpg/s;->K0()Ldi/p1;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v2, v3}, Lmg/d;->c(Ldi/p1;)Lmg/d;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    return-object v1
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public s()Ldi/o0;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lpg/s;->k()Ldi/g1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ldi/s1;->g(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ldi/o;->a:Ldi/o;

    .line 14
    .line 15
    invoke-virtual {p0}, Lpg/s;->getAnnotations()Lng/g;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v1, v2, v3, v3}, Ldi/o;->a(Lng/g;Ldi/g1;Lmg/m;)Ldi/c1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, Lpg/s;->k()Ldi/g1;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p0}, Lpg/s;->D0()Lwh/h;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v1, v2, v0, v3, v4}, Ldi/h0;->k(Ldi/c1;Ldi/g1;Ljava/util/List;ZLwh/h;)Ldi/o0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/16 v1, 0x10

    .line 40
    .line 41
    invoke-static {v1}, Lpg/s;->A0(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v0
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

    invoke-interface {p1, p0, p2}, Lmg/o;->k(Lmg/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public u()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lpg/s;->K0()Ldi/p1;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpg/s;->p:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    invoke-static {v1}, Lpg/s;->A0(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
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
.end method

.method public x()Z
    .locals 1

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->x()Z

    move-result v0

    return v0
.end method

.method public y0()Lwh/h;
    .locals 2

    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    invoke-interface {v0}, Lmg/e;->y0()Lwh/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1c

    invoke-static {v1}, Lpg/s;->A0(I)V

    :cond_0
    return-object v0
.end method

.method public z0()Lmg/h1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/h1<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lpg/s;->l:Lpg/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lmg/e;->z0()Lmg/h1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v1, Lpg/s$b;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lpg/s$b;-><init>(Lpg/s;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lmg/h1;->b(Lkotlin/jvm/functions/Function1;)Lmg/h1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
    .line 21
    .line 22
    .line 23
    .line 24
.end method
