.class public Lpg/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lmg/y$a<",
        "Lmg/y;",
        ">;"
    }
.end annotation


# instance fields
.field protected a:Ldi/n1;

.field protected b:Lmg/m;

.field protected c:Lmg/e0;

.field protected d:Lmg/u;

.field protected e:Lmg/y;

.field protected f:Lmg/b$a;

.field protected g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmg/j1;",
            ">;"
        }
    .end annotation
.end field

.field protected h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmg/x0;",
            ">;"
        }
    .end annotation
.end field

.field protected i:Lmg/x0;

.field protected j:Lmg/x0;

.field protected k:Ldi/g0;

.field protected l:Llh/f;

.field protected m:Z

.field protected n:Z

.field protected o:Z

.field protected p:Z

.field private q:Z

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lng/g;

.field private t:Z

.field private u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lmg/a$a<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/lang/Boolean;

.field protected w:Z

.field final synthetic x:Lpg/p;


# direct methods
.method public constructor <init>(Lpg/p;Ldi/n1;Lmg/m;Lmg/e0;Lmg/u;Lmg/b$a;Ljava/util/List;Ljava/util/List;Lmg/x0;Ldi/g0;Llh/f;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/n1;",
            "Lmg/m;",
            "Lmg/e0;",
            "Lmg/u;",
            "Lmg/b$a;",
            "Ljava/util/List<",
            "Lmg/j1;",
            ">;",
            "Ljava/util/List<",
            "Lmg/x0;",
            ">;",
            "Lmg/x0;",
            "Ldi/g0;",
            "Llh/f;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    if-nez p3, :cond_1

    .line 9
    .line 10
    invoke-static {v1}, Lpg/p$c;->u(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p4, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-static {v2}, Lpg/p$c;->u(I)V

    .line 17
    .line 18
    .line 19
    :cond_2
    if-nez p5, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-static {v2}, Lpg/p$c;->u(I)V

    .line 23
    .line 24
    .line 25
    :cond_3
    if-nez p6, :cond_4

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-static {v2}, Lpg/p$c;->u(I)V

    .line 29
    .line 30
    .line 31
    :cond_4
    if-nez p7, :cond_5

    .line 32
    .line 33
    const/4 v2, 0x5

    .line 34
    invoke-static {v2}, Lpg/p$c;->u(I)V

    .line 35
    .line 36
    .line 37
    :cond_5
    if-nez p8, :cond_6

    .line 38
    .line 39
    const/4 v2, 0x6

    .line 40
    invoke-static {v2}, Lpg/p$c;->u(I)V

    .line 41
    .line 42
    .line 43
    :cond_6
    if-nez p10, :cond_7

    .line 44
    .line 45
    const/4 v2, 0x7

    .line 46
    invoke-static {v2}, Lpg/p$c;->u(I)V

    .line 47
    .line 48
    .line 49
    :cond_7
    iput-object p1, p0, Lpg/p$c;->x:Lpg/p;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    iput-object v2, p0, Lpg/p$c;->e:Lmg/y;

    .line 56
    .line 57
    invoke-static {p1}, Lpg/p;->F0(Lpg/p;)Lmg/x0;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, p0, Lpg/p$c;->j:Lmg/x0;

    .line 62
    .line 63
    iput-boolean v1, p0, Lpg/p$c;->m:Z

    .line 64
    .line 65
    iput-boolean v0, p0, Lpg/p$c;->n:Z

    .line 66
    .line 67
    iput-boolean v0, p0, Lpg/p$c;->o:Z

    .line 68
    .line 69
    iput-boolean v0, p0, Lpg/p$c;->p:Z

    .line 70
    .line 71
    invoke-virtual {p1}, Lpg/p;->w0()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iput-boolean v1, p0, Lpg/p$c;->q:Z

    .line 76
    .line 77
    iput-object v2, p0, Lpg/p$c;->r:Ljava/util/List;

    .line 78
    .line 79
    iput-object v2, p0, Lpg/p$c;->s:Lng/g;

    .line 80
    .line 81
    invoke-virtual {p1}, Lpg/p;->C0()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput-boolean p1, p0, Lpg/p$c;->t:Z

    .line 86
    .line 87
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lpg/p$c;->u:Ljava/util/Map;

    .line 93
    .line 94
    iput-object v2, p0, Lpg/p$c;->v:Ljava/lang/Boolean;

    .line 95
    .line 96
    iput-boolean v0, p0, Lpg/p$c;->w:Z

    .line 97
    .line 98
    iput-object p2, p0, Lpg/p$c;->a:Ldi/n1;

    .line 99
    .line 100
    iput-object p3, p0, Lpg/p$c;->b:Lmg/m;

    .line 101
    .line 102
    iput-object p4, p0, Lpg/p$c;->c:Lmg/e0;

    .line 103
    .line 104
    iput-object p5, p0, Lpg/p$c;->d:Lmg/u;

    .line 105
    .line 106
    iput-object p6, p0, Lpg/p$c;->f:Lmg/b$a;

    .line 107
    .line 108
    iput-object p7, p0, Lpg/p$c;->g:Ljava/util/List;

    .line 109
    .line 110
    iput-object p8, p0, Lpg/p$c;->h:Ljava/util/List;

    .line 111
    .line 112
    iput-object p9, p0, Lpg/p$c;->i:Lmg/x0;

    .line 113
    .line 114
    iput-object p10, p0, Lpg/p$c;->k:Ldi/g0;

    .line 115
    .line 116
    iput-object p11, p0, Lpg/p$c;->l:Llh/f;

    .line 117
    .line 118
    return-void
.end method

.method static synthetic A(Lpg/p$c;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lpg/p$c;->u:Ljava/util/Map;

    return-object p0
.end method

.method private static synthetic u(I)V
    .locals 17

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    :pswitch_2
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_3
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    :pswitch_4
    const-string v5, "substitution"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "userDataKey"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "additionalAnnotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "contextReceiverParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "type"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "parameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "visibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "modality"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_e
    const-string v5, "owner"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_f
    const-string v5, "newReturnType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_10
    const-string v5, "newContextReceiverParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_11
    const-string v5, "newValueParameterDescriptors"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_12
    const-string v5, "kind"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_13
    const-string v5, "newVisibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_14
    const-string v5, "newModality"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_15
    const-string v5, "newOwner"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "putUserData"

    const-string v5, "setSubstitution"

    const-string v6, "setAdditionalAnnotations"

    const-string v7, "setContextReceiverParameters"

    const-string v8, "setReturnType"

    const-string v9, "setTypeParameters"

    const-string v10, "setValueParameters"

    const-string v11, "setName"

    const-string v12, "setKind"

    const-string v13, "setVisibility"

    const-string v14, "setModality"

    const-string v15, "setOwner"

    const/16 v16, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_16
    aput-object v3, v2, v16

    goto/16 :goto_3

    :pswitch_17
    const-string v3, "setJustForTypeSubstitution"

    aput-object v3, v2, v16

    goto/16 :goto_3

    :pswitch_18
    const-string v3, "getSubstitution"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_19
    aput-object v4, v2, v16

    goto :goto_3

    :pswitch_1a
    aput-object v5, v2, v16

    goto :goto_3

    :pswitch_1b
    aput-object v6, v2, v16

    goto :goto_3

    :pswitch_1c
    const-string v3, "setHiddenForResolutionEverywhereBesideSupercalls"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_1d
    const-string v3, "setHiddenToOvercomeSignatureClash"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_1e
    const-string v3, "setDropOriginalInContainingParts"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_1f
    const-string v3, "setPreserveSourceElement"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_20
    const-string v3, "setSignatureChange"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_21
    const-string v3, "setOriginal"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_22
    const-string v3, "setDispatchReceiverParameter"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_23
    const-string v3, "setExtensionReceiverParameter"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_24
    aput-object v7, v2, v16

    goto :goto_3

    :pswitch_25
    aput-object v8, v2, v16

    goto :goto_3

    :pswitch_26
    aput-object v9, v2, v16

    goto :goto_3

    :pswitch_27
    aput-object v10, v2, v16

    goto :goto_3

    :pswitch_28
    aput-object v11, v2, v16

    goto :goto_3

    :pswitch_29
    const-string v3, "setCopyOverrides"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_2a
    aput-object v12, v2, v16

    goto :goto_3

    :pswitch_2b
    aput-object v13, v2, v16

    goto :goto_3

    :pswitch_2c
    aput-object v14, v2, v16

    goto :goto_3

    :pswitch_2d
    aput-object v15, v2, v16

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_2e
    aput-object v4, v2, v1

    goto :goto_4

    :pswitch_2f
    aput-object v5, v2, v1

    goto :goto_4

    :pswitch_30
    aput-object v6, v2, v1

    goto :goto_4

    :pswitch_31
    aput-object v7, v2, v1

    goto :goto_4

    :pswitch_32
    aput-object v8, v2, v1

    goto :goto_4

    :pswitch_33
    aput-object v9, v2, v1

    goto :goto_4

    :pswitch_34
    aput-object v10, v2, v1

    goto :goto_4

    :pswitch_35
    aput-object v11, v2, v1

    goto :goto_4

    :pswitch_36
    aput-object v12, v2, v1

    goto :goto_4

    :pswitch_37
    aput-object v13, v2, v1

    goto :goto_4

    :pswitch_38
    aput-object v14, v2, v1

    goto :goto_4

    :pswitch_39
    aput-object v15, v2, v1

    :goto_4
    :pswitch_3a
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_3b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_3c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v1

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_d
        :pswitch_12
        :pswitch_d
        :pswitch_d
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_8
        :pswitch_d
        :pswitch_7
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_6
        :pswitch_d
        :pswitch_4
        :pswitch_d
        :pswitch_5
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_2d
        :pswitch_16
        :pswitch_2c
        :pswitch_16
        :pswitch_2b
        :pswitch_16
        :pswitch_2a
        :pswitch_29
        :pswitch_16
        :pswitch_28
        :pswitch_16
        :pswitch_27
        :pswitch_16
        :pswitch_26
        :pswitch_16
        :pswitch_25
        :pswitch_16
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_16
        :pswitch_1b
        :pswitch_16
        :pswitch_1a
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x8
        :pswitch_39
        :pswitch_3a
        :pswitch_38
        :pswitch_3a
        :pswitch_37
        :pswitch_3a
        :pswitch_36
        :pswitch_3a
        :pswitch_3a
        :pswitch_35
        :pswitch_3a
        :pswitch_34
        :pswitch_3a
        :pswitch_33
        :pswitch_3a
        :pswitch_32
        :pswitch_3a
        :pswitch_31
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_30
        :pswitch_3a
        :pswitch_2f
        :pswitch_3a
        :pswitch_2e
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
    .end packed-switch
.end method

.method static synthetic v(Lpg/p$c;)Lng/g;
    .locals 0

    iget-object p0, p0, Lpg/p$c;->s:Lng/g;

    return-object p0
.end method

.method static synthetic w(Lpg/p$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpg/p$c;->r:Ljava/util/List;

    return-object p0
.end method

.method static synthetic x(Lpg/p$c;)Z
    .locals 0

    iget-boolean p0, p0, Lpg/p$c;->q:Z

    return p0
.end method

.method static synthetic y(Lpg/p$c;)Z
    .locals 0

    iget-boolean p0, p0, Lpg/p$c;->t:Z

    return p0
.end method

.method static synthetic z(Lpg/p$c;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lpg/p$c;->v:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public B(Lng/g;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x23

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->s:Lng/g;

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

.method public C(Z)Lpg/p$c;
    .locals 0

    iput-boolean p1, p0, Lpg/p$c;->m:Z

    return-object p0
.end method

.method public D(Lmg/x0;)Lpg/p$c;
    .locals 0

    iput-object p1, p0, Lpg/p$c;->j:Lmg/x0;

    return-object p0
.end method

.method public E()Lpg/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg/p$c;->p:Z

    return-object p0
.end method

.method public F(Lmg/x0;)Lpg/p$c;
    .locals 0

    iput-object p1, p0, Lpg/p$c;->i:Lmg/x0;

    return-object p0
.end method

.method public G(Z)Lpg/p$c;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lpg/p$c;->v:Ljava/lang/Boolean;

    return-object p0
.end method

.method public H()Lpg/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg/p$c;->t:Z

    return-object p0
.end method

.method public I()Lpg/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg/p$c;->q:Z

    return-object p0
.end method

.method public J(Z)Lpg/p$c;
    .locals 0

    iput-boolean p1, p0, Lpg/p$c;->w:Z

    return-object p0
.end method

.method public K(Lmg/b$a;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->f:Lmg/b$a;

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

.method public L(Lmg/e0;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->c:Lmg/e0;

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

.method public M(Llh/f;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->l:Llh/f;

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

.method public N(Lmg/b;)Lpg/p$c;
    .locals 0

    check-cast p1, Lmg/y;

    iput-object p1, p0, Lpg/p$c;->e:Lmg/y;

    return-object p0
.end method

.method public O(Lmg/m;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->b:Lmg/m;

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

.method public P()Lpg/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg/p$c;->o:Z

    return-object p0
.end method

.method public Q(Ldi/g0;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x17

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->k:Ldi/g0;

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

.method public R()Lpg/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg/p$c;->n:Z

    return-object p0
.end method

.method public S(Ldi/n1;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x25

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->a:Ldi/n1;

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

.method public T(Ljava/util/List;)Lpg/p$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;)",
            "Lpg/p$c;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x15

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->r:Ljava/util/List;

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

.method public U(Ljava/util/List;)Lpg/p$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmg/j1;",
            ">;)",
            "Lpg/p$c;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x13

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->g:Ljava/util/List;

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

.method public V(Lmg/u;)Lpg/p$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lpg/p$c;->d:Lmg/u;

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

.method public bridge synthetic a()Lmg/y$a;
    .locals 1

    invoke-virtual {p0}, Lpg/p$c;->E()Lpg/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/util/List;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->U(Ljava/util/List;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public build()Lmg/y;
    .locals 1

    iget-object v0, p0, Lpg/p$c;->x:Lpg/p;

    invoke-virtual {v0, p0}, Lpg/p;->M0(Lpg/p$c;)Lmg/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Lmg/x0;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->D(Lmg/x0;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lmg/b$a;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->K(Lmg/b$a;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lng/g;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->B(Lng/g;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lmg/x0;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->F(Lmg/x0;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Llh/f;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->M(Llh/f;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h()Lmg/y$a;
    .locals 1

    invoke-virtual {p0}, Lpg/p$c;->P()Lpg/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i(Lmg/b;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->N(Lmg/b;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j()Lmg/y$a;
    .locals 1

    invoke-virtual {p0}, Lpg/p$c;->H()Lpg/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(Z)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->C(Z)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lmg/e0;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->L(Lmg/e0;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/util/List;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->T(Ljava/util/List;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n(Ldi/n1;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->S(Ldi/n1;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public o(Lmg/a$a;Ljava/lang/Object;)Lmg/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lmg/a$a<",
            "TV;>;TV;)",
            "Lmg/y$a<",
            "Lmg/y;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x27

    .line 4
    .line 5
    invoke-static {v0}, Lpg/p$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lpg/p$c;->u:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object p0
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

.method public bridge synthetic p(Lmg/m;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->O(Lmg/m;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q()Lmg/y$a;
    .locals 1

    invoke-virtual {p0}, Lpg/p$c;->I()Lpg/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r(Ldi/g0;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->Q(Ldi/g0;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Lmg/u;)Lmg/y$a;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/p$c;->V(Lmg/u;)Lpg/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic t()Lmg/y$a;
    .locals 1

    invoke-virtual {p0}, Lpg/p$c;->R()Lpg/p$c;

    move-result-object v0

    return-object v0
.end method
