.class public Lpg/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:Lmg/m;

.field private b:Lmg/e0;

.field private c:Lmg/u;

.field private d:Lmg/u0;

.field private e:Z

.field private f:Lmg/b$a;

.field private g:Ldi/n1;

.field private h:Z

.field private i:Lmg/x0;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation
.end field

.field private k:Llh/f;

.field private l:Ldi/g0;

.field final synthetic m:Lpg/c0;


# direct methods
.method public constructor <init>(Lpg/c0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lpg/c0$a;->m:Lpg/c0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lpg/k;->b()Lmg/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lpg/c0$a;->a:Lmg/m;

    .line 11
    .line 12
    invoke-virtual {p1}, Lpg/c0;->l()Lmg/e0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lpg/c0$a;->b:Lmg/e0;

    .line 17
    .line 18
    invoke-virtual {p1}, Lpg/c0;->getVisibility()Lmg/u;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lpg/c0$a;->c:Lmg/u;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lpg/c0$a;->d:Lmg/u0;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iput-boolean v1, p0, Lpg/c0$a;->e:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Lpg/c0;->g()Lmg/b$a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Lpg/c0$a;->f:Lmg/b$a;

    .line 35
    .line 36
    sget-object v1, Ldi/n1;->b:Ldi/n1;

    .line 37
    .line 38
    iput-object v1, p0, Lpg/c0$a;->g:Ldi/n1;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iput-boolean v1, p0, Lpg/c0$a;->h:Z

    .line 42
    .line 43
    invoke-static {p1}, Lpg/c0;->M0(Lpg/c0;)Lmg/x0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Lpg/c0$a;->i:Lmg/x0;

    .line 48
    .line 49
    iput-object v0, p0, Lpg/c0$a;->j:Ljava/util/List;

    .line 50
    .line 51
    invoke-virtual {p1}, Lpg/j;->getName()Llh/f;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lpg/c0$a;->k:Llh/f;

    .line 56
    .line 57
    invoke-virtual {p1}, Lpg/m0;->getType()Ldi/g0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Lpg/c0$a;->l:Ldi/g0;

    .line 62
    .line 63
    return-void
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

.method private static synthetic a(I)V
    .locals 24

    move/from16 v0, p0

    const/16 v1, 0x11

    const/16 v2, 0x10

    const/16 v3, 0xe

    const/16 v4, 0xd

    const/16 v5, 0x13

    const/16 v6, 0xb

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eq v0, v12, :cond_0

    if-eq v0, v11, :cond_0

    if-eq v0, v10, :cond_0

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    const-string v13, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v13, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-eq v0, v10, :cond_1

    if-eq v0, v9, :cond_1

    if-eq v0, v8, :cond_1

    if-eq v0, v7, :cond_1

    if-eq v0, v6, :cond_1

    if-eq v0, v5, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    move v14, v10

    goto :goto_1

    :cond_1
    move v14, v11

    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration"

    const/16 v16, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v17, "owner"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_0
    const-string v17, "name"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_1
    const-string v17, "substitution"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_2
    const-string v17, "typeParameters"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_3
    const-string v17, "kind"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_4
    const-string v17, "visibility"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_5
    const-string v17, "modality"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_6
    const-string v17, "type"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_7
    aput-object v15, v14, v16

    :goto_2
    const-string v16, "setName"

    const-string v17, "setSubstitution"

    const-string v18, "setTypeParameters"

    const-string v19, "setKind"

    const-string v20, "setVisibility"

    const-string v21, "setModality"

    const-string v22, "setReturnType"

    const-string v23, "setOwner"

    if-eq v0, v12, :cond_d

    if-eq v0, v11, :cond_c

    if-eq v0, v10, :cond_b

    if-eq v0, v9, :cond_a

    if-eq v0, v8, :cond_9

    if-eq v0, v7, :cond_8

    if-eq v0, v6, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    aput-object v15, v14, v12

    goto :goto_3

    :cond_2
    const-string v15, "setCopyOverrides"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_3
    aput-object v17, v14, v12

    goto :goto_3

    :cond_4
    const-string v15, "setDispatchReceiverParameter"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_5
    aput-object v18, v14, v12

    goto :goto_3

    :cond_6
    aput-object v16, v14, v12

    goto :goto_3

    :cond_7
    aput-object v19, v14, v12

    goto :goto_3

    :cond_8
    aput-object v20, v14, v12

    goto :goto_3

    :cond_9
    aput-object v21, v14, v12

    goto :goto_3

    :cond_a
    aput-object v22, v14, v12

    goto :goto_3

    :cond_b
    const-string v15, "setPreserveSourceElement"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_c
    const-string v15, "setOriginal"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_d
    aput-object v23, v14, v12

    :goto_3
    packed-switch v0, :pswitch_data_1

    aput-object v23, v14, v11

    goto :goto_4

    :pswitch_8
    aput-object v16, v14, v11

    goto :goto_4

    :pswitch_9
    aput-object v17, v14, v11

    goto :goto_4

    :pswitch_a
    aput-object v18, v14, v11

    goto :goto_4

    :pswitch_b
    aput-object v19, v14, v11

    goto :goto_4

    :pswitch_c
    aput-object v20, v14, v11

    goto :goto_4

    :pswitch_d
    aput-object v21, v14, v11

    goto :goto_4

    :pswitch_e
    aput-object v22, v14, v11

    :goto_4
    :pswitch_f
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eq v0, v12, :cond_e

    if-eq v0, v11, :cond_e

    if-eq v0, v10, :cond_e

    if-eq v0, v9, :cond_e

    if-eq v0, v8, :cond_e

    if-eq v0, v7, :cond_e

    if-eq v0, v6, :cond_e

    if-eq v0, v5, :cond_e

    if-eq v0, v4, :cond_e

    if-eq v0, v3, :cond_e

    if-eq v0, v2, :cond_e

    if-eq v0, v1, :cond_e

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_7
        :pswitch_0
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_f
        :pswitch_c
        :pswitch_f
        :pswitch_b
        :pswitch_f
        :pswitch_a
        :pswitch_f
        :pswitch_f
        :pswitch_9
        :pswitch_f
        :pswitch_f
        :pswitch_8
        :pswitch_f
    .end packed-switch
.end method

.method static synthetic b(Lpg/c0$a;)Lmg/m;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->a:Lmg/m;

    return-object p0
.end method

.method static synthetic c(Lpg/c0$a;)Ldi/g0;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->l:Ldi/g0;

    return-object p0
.end method

.method static synthetic d(Lpg/c0$a;)Lmg/x0;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->i:Lmg/x0;

    return-object p0
.end method

.method static synthetic e(Lpg/c0$a;)Z
    .locals 0

    iget-boolean p0, p0, Lpg/c0$a;->h:Z

    return p0
.end method

.method static synthetic f(Lpg/c0$a;)Lmg/e0;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->b:Lmg/e0;

    return-object p0
.end method

.method static synthetic g(Lpg/c0$a;)Lmg/u;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->c:Lmg/u;

    return-object p0
.end method

.method static synthetic h(Lpg/c0$a;)Lmg/u0;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->d:Lmg/u0;

    return-object p0
.end method

.method static synthetic i(Lpg/c0$a;)Lmg/b$a;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->f:Lmg/b$a;

    return-object p0
.end method

.method static synthetic j(Lpg/c0$a;)Llh/f;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->k:Llh/f;

    return-object p0
.end method

.method static synthetic k(Lpg/c0$a;)Z
    .locals 0

    iget-boolean p0, p0, Lpg/c0$a;->e:Z

    return p0
.end method

.method static synthetic l(Lpg/c0$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic m(Lpg/c0$a;)Ldi/n1;
    .locals 0

    iget-object p0, p0, Lpg/c0$a;->g:Ldi/n1;

    return-object p0
.end method


# virtual methods
.method public n()Lmg/u0;
    .locals 1

    iget-object v0, p0, Lpg/c0$a;->m:Lpg/c0;

    invoke-virtual {v0, p0}, Lpg/c0;->Q0(Lpg/c0$a;)Lmg/u0;

    move-result-object v0

    return-object v0
.end method

.method o()Lmg/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lpg/c0$a;->d:Lmg/u0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lmg/u0;->f()Lmg/v0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
.end method

.method p()Lmg/w0;
    .locals 1

    .line 1
    iget-object v0, p0, Lpg/c0$a;->d:Lmg/u0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lmg/u0;->h()Lmg/w0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
.end method

.method public q(Z)Lpg/c0$a;
    .locals 0

    iput-boolean p1, p0, Lpg/c0$a;->h:Z

    return-object p0
.end method

.method public r(Lmg/b$a;)Lpg/c0$a;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    invoke-static {v0}, Lpg/c0$a;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/c0$a;->f:Lmg/b$a;

    .line 9
    .line 10
    return-object p0
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

.method public s(Lmg/e0;)Lpg/c0$a;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-static {v0}, Lpg/c0$a;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    iput-object p1, p0, Lpg/c0$a;->b:Lmg/e0;

    .line 8
    .line 9
    return-object p0
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

.method public t(Lmg/b;)Lpg/c0$a;
    .locals 0

    check-cast p1, Lmg/u0;

    iput-object p1, p0, Lpg/c0$a;->d:Lmg/u0;

    return-object p0
.end method

.method public u(Lmg/m;)Lpg/c0$a;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Lpg/c0$a;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    iput-object p1, p0, Lpg/c0$a;->a:Lmg/m;

    .line 8
    .line 9
    return-object p0
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

.method public v(Ldi/n1;)Lpg/c0$a;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xf

    .line 4
    .line 5
    invoke-static {v0}, Lpg/c0$a;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/c0$a;->g:Ldi/n1;

    .line 9
    .line 10
    return-object p0
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

.method public w(Lmg/u;)Lpg/c0$a;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-static {v0}, Lpg/c0$a;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/c0$a;->c:Lmg/u;

    .line 9
    .line 10
    return-object p0
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
