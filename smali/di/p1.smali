.class public Ldi/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/p1$d;,
        Ldi/p1$c;
    }
.end annotation


# static fields
.field public static final b:Ldi/p1;


# instance fields
.field private final a:Ldi/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ldi/n1;->b:Ldi/n1;

    invoke-static {v0}, Ldi/p1;->g(Ldi/n1;)Ldi/p1;

    move-result-object v0

    sput-object v0, Ldi/p1;->b:Ldi/p1;

    return-void
.end method

.method protected constructor <init>(Ldi/n1;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldi/p1;->a:Ldi/n1;

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

.method private static synthetic a(I)V
    .locals 13

    const/16 v0, 0x25

    const/16 v1, 0x22

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq p0, v3, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v3, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_4

    packed-switch p0, :pswitch_data_5

    packed-switch p0, :pswitch_data_6

    packed-switch p0, :pswitch_data_7

    const/4 v6, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v6, v4

    :goto_1
    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor"

    const/4 v8, 0x0

    packed-switch p0, :pswitch_data_8

    :pswitch_2
    const-string v9, "substitution"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_3
    const-string v9, "projectionKind"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_4
    const-string v9, "typeParameterVariance"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_5
    const-string v9, "annotations"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_6
    const-string v9, "substituted"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_7
    const-string v9, "originalType"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_8
    const-string v9, "originalProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_9
    const-string v9, "typeProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_a
    const-string v9, "howThisTypeIsUsed"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_b
    const-string v9, "type"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_c
    const-string v9, "context"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_d
    const-string v9, "substitutionContext"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_e
    const-string v9, "second"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_f
    const-string v9, "first"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_10
    aput-object v7, v6, v8

    :goto_2
    const-string v8, "combine"

    const-string v9, "filterOutUnsafeVariance"

    const-string v10, "projectedTypeForConflictedTypeWithUnsafeVariance"

    const-string v11, "unsafeSubstitute"

    const-string v12, "safeSubstitute"

    if-eq p0, v3, :cond_6

    if-eq p0, v4, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_9

    packed-switch p0, :pswitch_data_a

    packed-switch p0, :pswitch_data_b

    packed-switch p0, :pswitch_data_c

    aput-object v7, v6, v3

    goto :goto_3

    :pswitch_11
    aput-object v10, v6, v3

    goto :goto_3

    :pswitch_12
    aput-object v11, v6, v3

    goto :goto_3

    :pswitch_13
    aput-object v12, v6, v3

    goto :goto_3

    :cond_2
    :pswitch_14
    aput-object v8, v6, v3

    goto :goto_3

    :cond_3
    aput-object v9, v6, v3

    goto :goto_3

    :cond_4
    const-string v7, "getSubstitution"

    aput-object v7, v6, v3

    goto :goto_3

    :cond_5
    const-string v7, "replaceWithContravariantApproximatingSubstitution"

    aput-object v7, v6, v3

    goto :goto_3

    :cond_6
    const-string v7, "replaceWithNonApproximatingSubstitution"

    aput-object v7, v6, v3

    :goto_3
    packed-switch p0, :pswitch_data_d

    :pswitch_15
    const-string v7, "create"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_16
    aput-object v8, v6, v4

    goto :goto_4

    :pswitch_17
    aput-object v9, v6, v4

    goto :goto_4

    :pswitch_18
    aput-object v10, v6, v4

    goto :goto_4

    :pswitch_19
    aput-object v11, v6, v4

    goto :goto_4

    :pswitch_1a
    const-string v7, "substituteWithoutApproximation"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1b
    const-string v7, "substitute"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1c
    aput-object v12, v6, v4

    goto :goto_4

    :pswitch_1d
    const-string v7, "<init>"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1e
    const-string v7, "createChainedSubstitutor"

    aput-object v7, v6, v4

    :goto_4
    :pswitch_1f
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eq p0, v3, :cond_7

    if-eq p0, v4, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    packed-switch p0, :pswitch_data_e

    packed-switch p0, :pswitch_data_f

    packed-switch p0, :pswitch_data_10

    packed-switch p0, :pswitch_data_11

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    :pswitch_20
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x28
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xb
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x13
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1d
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x28
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_2
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_5
        :pswitch_10
        :pswitch_4
        :pswitch_9
        :pswitch_10
        :pswitch_4
        :pswitch_3
        :pswitch_10
        :pswitch_10
        :pswitch_10
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0xb
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x13
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x1d
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x28
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_15
        :pswitch_15
        :pswitch_1d
        :pswitch_1f
        :pswitch_1c
        :pswitch_1c
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_17
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0xb
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x13
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x1d
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x28
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch
.end method

.method private static b(ILdi/k1;Ldi/n1;)V
    .locals 2

    const/16 v0, 0x64

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Recursion too deep. Most likely infinite loop while substituting "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ldi/p1;->o(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; substitution: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ldi/p1;->o(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ldi/w1;Ldi/k1;)Ldi/w1;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x23

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x24

    .line 11
    .line 12
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-interface {p1}, Ldi/k1;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    sget-object p0, Ldi/w1;->q:Ldi/w1;

    .line 22
    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    const/16 p1, 0x25

    .line 26
    .line 27
    invoke-static {p1}, Ldi/p1;->a(I)V

    .line 28
    .line 29
    .line 30
    :cond_2
    return-object p0

    .line 31
    :cond_3
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p0, p1}, Ldi/p1;->d(Ldi/w1;Ldi/w1;)Ldi/w1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
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

.method public static d(Ldi/w1;Ldi/w1;)Ldi/w1;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x26

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x27

    .line 11
    .line 12
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    sget-object v0, Ldi/w1;->o:Ldi/w1;

    .line 16
    .line 17
    if-ne p0, v0, :cond_3

    .line 18
    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    const/16 p0, 0x28

    .line 22
    .line 23
    invoke-static {p0}, Ldi/p1;->a(I)V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-object p1

    .line 27
    :cond_3
    if-ne p1, v0, :cond_5

    .line 28
    .line 29
    if-nez p0, :cond_4

    .line 30
    .line 31
    const/16 p1, 0x29

    .line 32
    .line 33
    invoke-static {p1}, Ldi/p1;->a(I)V

    .line 34
    .line 35
    .line 36
    :cond_4
    return-object p0

    .line 37
    :cond_5
    if-ne p0, p1, :cond_7

    .line 38
    .line 39
    if-nez p1, :cond_6

    .line 40
    .line 41
    const/16 p0, 0x2a

    .line 42
    .line 43
    invoke-static {p0}, Ldi/p1;->a(I)V

    .line 44
    .line 45
    .line 46
    :cond_6
    return-object p1

    .line 47
    :cond_7
    new-instance v0, Ljava/lang/AssertionError;

    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v2, "Variance conflict: type parameter variance \'"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, "\' and projection kind \'"

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p0, "\' cannot be combined"

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    throw v0
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private static e(Ldi/w1;Ldi/w1;)Ldi/p1$d;
    .locals 2

    .line 1
    sget-object v0, Ldi/w1;->p:Ldi/w1;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Ldi/w1;->q:Ldi/w1;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    sget-object p0, Ldi/p1$d;->m:Ldi/p1$d;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v1, Ldi/w1;->q:Ldi/w1;

    .line 13
    .line 14
    if-ne p0, v1, :cond_1

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    sget-object p0, Ldi/p1$d;->l:Ldi/p1$d;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Ldi/p1$d;->k:Ldi/p1$d;

    .line 22
    .line 23
    return-object p0
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

.method public static f(Ldi/g0;)Ldi/p1;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Ldi/g0;->N0()Ldi/g1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Ldi/g0;->L0()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {v0, p0}, Ldi/h1;->i(Ldi/g1;Ljava/util/List;)Ldi/n1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ldi/p1;->g(Ldi/n1;)Ldi/p1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static g(Ldi/n1;)Ldi/p1;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance v0, Ldi/p1;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ldi/p1;-><init>(Ldi/n1;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public static h(Ldi/n1;Ldi/n1;)Ldi/p1;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1}, Ldi/u;->i(Ldi/n1;Ldi/n1;)Ldi/n1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Ldi/p1;->g(Ldi/n1;)Ldi/p1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
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

.method private static i(Lng/g;)Lng/g;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x21

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Ljg/k$a;->Q:Llh/c;

    .line 9
    .line 10
    invoke-interface {p0, v0}, Lng/g;->k(Llh/c;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance v0, Lng/l;

    .line 18
    .line 19
    new-instance v1, Ldi/p1$a;

    .line 20
    .line 21
    invoke-direct {v1}, Ldi/p1$a;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, Lng/l;-><init>(Lng/g;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method private static l(Ldi/g0;Ldi/k1;Lmg/f1;Ldi/k1;)Ldi/k1;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x1b

    .line 11
    .line 12
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-nez p3, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x1c

    .line 18
    .line 19
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    invoke-virtual {p0}, Ldi/g0;->getAnnotations()Lng/g;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v0, Ljg/k$a;->Q:Llh/c;

    .line 27
    .line 28
    invoke-interface {p0, v0}, Lng/g;->k(Llh/c;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_4

    .line 33
    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    const/16 p0, 0x1d

    .line 37
    .line 38
    invoke-static {p0}, Ldi/p1;->a(I)V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-object p1

    .line 42
    :cond_4
    invoke-interface {p1}, Ldi/k1;->getType()Ldi/g0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ldi/g0;->N0()Ldi/g1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    instance-of v0, p0, Lei/j;

    .line 51
    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    check-cast p0, Lei/j;

    .line 56
    .line 57
    invoke-virtual {p0}, Lei/j;->b()Ldi/k1;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Ldi/k1;->a()Ldi/w1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {p3}, Ldi/k1;->a()Ldi/w1;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-static {p3, v0}, Ldi/p1;->e(Ldi/w1;Ldi/w1;)Ldi/p1$d;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    sget-object v1, Ldi/p1$d;->m:Ldi/p1$d;

    .line 74
    .line 75
    if-ne p3, v1, :cond_6

    .line 76
    .line 77
    new-instance p1, Ldi/m1;

    .line 78
    .line 79
    invoke-interface {p0}, Ldi/k1;->getType()Ldi/g0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {p1, p0}, Ldi/m1;-><init>(Ldi/g0;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_6
    if-nez p2, :cond_7

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_7
    invoke-interface {p2}, Lmg/f1;->n()Ldi/w1;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-static {p2, v0}, Ldi/p1;->e(Ldi/w1;Ldi/w1;)Ldi/p1$d;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-ne p2, v1, :cond_8

    .line 99
    .line 100
    new-instance p1, Ldi/m1;

    .line 101
    .line 102
    invoke-interface {p0}, Ldi/k1;->getType()Ldi/g0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-direct {p1, p0}, Ldi/m1;-><init>(Ldi/g0;)V

    .line 107
    .line 108
    .line 109
    :cond_8
    return-object p1
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method private static o(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    invoke-static {p0}, Lni/c;->a(Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "[Exception while computing toString(): "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, "]"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    check-cast p0, Ljava/lang/RuntimeException;

    .line 37
    .line 38
    throw p0
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

.method private r(Ldi/k1;I)Ldi/k1;
    .locals 4

    .line 1
    invoke-interface {p1}, Ldi/k1;->getType()Ldi/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2}, Ldi/g1;->q()Lmg/h;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v2, v2, Lmg/f1;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-static {v0}, Ldi/s0;->b(Ldi/g0;)Ldi/o0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ldi/p1;->m()Ldi/p1;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, Ldi/w1;->o:Ldi/w1;

    .line 33
    .line 34
    invoke-virtual {v2, p1, v3}, Ldi/p1;->p(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    :goto_0
    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0}, Ldi/g0;->L0()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-direct {p0, v2, v3, p2}, Ldi/p1;->s(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object v2, p0, Ldi/p1;->a:Ldi/n1;

    .line 57
    .line 58
    invoke-virtual {v0}, Ldi/g0;->getAnnotations()Lng/g;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v2, v3}, Ldi/n1;->d(Lng/g;)Lng/g;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v0, p2, v2}, Ldi/o1;->b(Ldi/g0;Ljava/util/List;Lng/g;)Ldi/g0;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    instance-of v0, p2, Ldi/o0;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    instance-of v0, p1, Ldi/o0;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    check-cast p2, Ldi/o0;

    .line 79
    .line 80
    check-cast p1, Ldi/o0;

    .line 81
    .line 82
    invoke-static {p2, p1}, Ldi/s0;->j(Ldi/o0;Ldi/o0;)Ldi/o0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    :cond_2
    new-instance p1, Ldi/m1;

    .line 87
    .line 88
    invoke-direct {p1, v1, p2}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 89
    .line 90
    .line 91
    return-object p1
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private s(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;",
            "Ljava/util/List<",
            "Ldi/k1;",
            ">;I)",
            "Ljava/util/List<",
            "Ldi/k1;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v1, v3, :cond_4

    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lmg/f1;

    .line 23
    .line 24
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ldi/k1;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    add-int/lit8 v6, p3, 0x1

    .line 32
    .line 33
    invoke-direct {p0, v4, v3, v6}, Ldi/p1;->u(Ldi/k1;Lmg/f1;I)Ldi/k1;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    sget-object v7, Ldi/p1$b;->a:[I

    .line 38
    .line 39
    invoke-interface {v3}, Lmg/f1;->n()Ldi/w1;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-interface {v6}, Ldi/k1;->a()Ldi/w1;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-static {v8, v9}, Ldi/p1;->e(Ldi/w1;Ldi/w1;)Ldi/p1$d;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    aget v7, v7, v8

    .line 56
    .line 57
    if-eq v7, v5, :cond_1

    .line 58
    .line 59
    const/4 v8, 0x2

    .line 60
    if-eq v7, v8, :cond_1

    .line 61
    .line 62
    const/4 v8, 0x3

    .line 63
    if-eq v7, v8, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-interface {v3}, Lmg/f1;->n()Ldi/w1;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    sget-object v7, Ldi/w1;->o:Ldi/w1;

    .line 71
    .line 72
    if-eq v3, v7, :cond_2

    .line 73
    .line 74
    invoke-interface {v6}, Ldi/k1;->b()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    new-instance v3, Ldi/m1;

    .line 81
    .line 82
    invoke-interface {v6}, Ldi/k1;->getType()Ldi/g0;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-direct {v3, v7, v6}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 87
    .line 88
    .line 89
    move-object v6, v3

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-static {v3}, Ldi/s1;->s(Lmg/f1;)Ldi/k1;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    :cond_2
    :goto_1
    if-eq v6, v4, :cond_3

    .line 96
    .line 97
    move v2, v5

    .line 98
    :cond_3
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    if-nez v2, :cond_5

    .line 105
    .line 106
    return-object p2

    .line 107
    :cond_5
    return-object v0
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private u(Ldi/k1;Lmg/f1;I)Ldi/k1;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x12

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Ldi/p1;->a:Ldi/n1;

    .line 9
    .line 10
    invoke-static {p3, p1, v0}, Ldi/p1;->b(ILdi/k1;Ldi/n1;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ldi/k1;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    invoke-interface {p1}, Ldi/k1;->getType()Ldi/g0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Ldi/t1;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    check-cast v0, Ldi/t1;

    .line 30
    .line 31
    invoke-interface {v0}, Ldi/t1;->F0()Ldi/v1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0}, Ldi/t1;->G()Ldi/g0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v3, Ldi/m1;

    .line 40
    .line 41
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v3, v4, v1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 46
    .line 47
    .line 48
    add-int/2addr p3, v2

    .line 49
    invoke-direct {p0, v3, p2, p3}, Ldi/p1;->u(Ldi/k1;Lmg/f1;I)Ldi/k1;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p2}, Ldi/k1;->b()Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-eqz p3, :cond_2

    .line 58
    .line 59
    return-object p2

    .line 60
    :cond_2
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, v0, p1}, Ldi/p1;->p(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p2}, Ldi/k1;->getType()Ldi/g0;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {p3}, Ldi/g0;->Q0()Ldi/v1;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-static {p3, p1}, Ldi/u1;->d(Ldi/v1;Ldi/g0;)Ldi/v1;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance p3, Ldi/m1;

    .line 81
    .line 82
    invoke-interface {p2}, Ldi/k1;->a()Ldi/w1;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-direct {p3, p2, p1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 87
    .line 88
    .line 89
    return-object p3

    .line 90
    :cond_3
    invoke-static {v0}, Ldi/w;->a(Ldi/g0;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_11

    .line 95
    .line 96
    invoke-virtual {v0}, Ldi/g0;->Q0()Ldi/v1;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    instance-of v1, v1, Ldi/n0;

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    goto/16 :goto_3

    .line 105
    .line 106
    :cond_4
    iget-object v1, p0, Ldi/p1;->a:Ldi/n1;

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ldi/n1;->e(Ldi/g0;)Ldi/k1;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-static {v0, v1, p2, p1}, Ldi/p1;->l(Ldi/g0;Ldi/k1;Lmg/f1;Ldi/k1;)Ldi/k1;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    goto :goto_0

    .line 119
    :cond_5
    const/4 v1, 0x0

    .line 120
    :goto_0
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-nez v1, :cond_7

    .line 125
    .line 126
    invoke-static {v0}, Ldi/d0;->b(Ldi/g0;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    invoke-static {v0}, Ldi/e1;->b(Ldi/g0;)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-nez v4, :cond_7

    .line 137
    .line 138
    invoke-static {v0}, Ldi/d0;->a(Ldi/g0;)Ldi/a0;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Ldi/m1;

    .line 143
    .line 144
    invoke-virtual {v0}, Ldi/a0;->V0()Ldi/o0;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-direct {v1, v3, v4}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 149
    .line 150
    .line 151
    add-int/2addr p3, v2

    .line 152
    invoke-direct {p0, v1, p2, p3}, Ldi/p1;->u(Ldi/k1;Lmg/f1;I)Ldi/k1;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    new-instance v2, Ldi/m1;

    .line 157
    .line 158
    invoke-virtual {v0}, Ldi/a0;->W0()Ldi/o0;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-direct {v2, v3, v4}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0, v2, p2, p3}, Ldi/p1;->u(Ldi/k1;Lmg/f1;I)Ldi/k1;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-interface {v1}, Ldi/k1;->a()Ldi/w1;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    invoke-interface {v1}, Ldi/k1;->getType()Ldi/g0;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v0}, Ldi/a0;->V0()Ldi/o0;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-ne v2, v3, :cond_6

    .line 182
    .line 183
    invoke-interface {p2}, Ldi/k1;->getType()Ldi/g0;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v0}, Ldi/a0;->W0()Ldi/o0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-ne v2, v0, :cond_6

    .line 192
    .line 193
    return-object p1

    .line 194
    :cond_6
    invoke-interface {v1}, Ldi/k1;->getType()Ldi/g0;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-static {p1}, Ldi/o1;->a(Ldi/g0;)Ldi/o0;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-interface {p2}, Ldi/k1;->getType()Ldi/g0;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-static {p2}, Ldi/o1;->a(Ldi/g0;)Ldi/o0;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-static {p1, p2}, Ldi/h0;->d(Ldi/o0;Ldi/o0;)Ldi/v1;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    new-instance p2, Ldi/m1;

    .line 215
    .line 216
    invoke-direct {p2, p3, p1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 217
    .line 218
    .line 219
    return-object p2

    .line 220
    :cond_7
    invoke-static {v0}, Ljg/h;->m0(Ldi/g0;)Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-nez p2, :cond_11

    .line 225
    .line 226
    invoke-static {v0}, Ldi/i0;->a(Ldi/g0;)Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-eqz p2, :cond_8

    .line 231
    .line 232
    goto/16 :goto_3

    .line 233
    .line 234
    :cond_8
    if-eqz v1, :cond_10

    .line 235
    .line 236
    invoke-interface {v1}, Ldi/k1;->a()Ldi/w1;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {v3, p1}, Ldi/p1;->e(Ldi/w1;Ldi/w1;)Ldi/p1$d;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-static {v0}, Lqh/d;->d(Ldi/g0;)Z

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    const/4 p3, 0x2

    .line 249
    if-nez p2, :cond_b

    .line 250
    .line 251
    sget-object p2, Ldi/p1$b;->a:[I

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    aget p2, p2, v4

    .line 258
    .line 259
    if-eq p2, v2, :cond_a

    .line 260
    .line 261
    if-eq p2, p3, :cond_9

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_9
    new-instance p1, Ldi/m1;

    .line 265
    .line 266
    sget-object p2, Ldi/w1;->q:Ldi/w1;

    .line 267
    .line 268
    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    .line 269
    .line 270
    .line 271
    move-result-object p3

    .line 272
    invoke-interface {p3}, Ldi/g1;->o()Ljg/h;

    .line 273
    .line 274
    .line 275
    move-result-object p3

    .line 276
    invoke-virtual {p3}, Ljg/h;->I()Ldi/o0;

    .line 277
    .line 278
    .line 279
    move-result-object p3

    .line 280
    invoke-direct {p1, p2, p3}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 281
    .line 282
    .line 283
    return-object p1

    .line 284
    :cond_a
    new-instance p1, Ldi/p1$c;

    .line 285
    .line 286
    const-string p2, "Out-projection in in-position"

    .line 287
    .line 288
    invoke-direct {p1, p2}, Ldi/p1$c;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw p1

    .line 292
    :cond_b
    :goto_1
    invoke-static {v0}, Ldi/e1;->a(Ldi/g0;)Ldi/n;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    invoke-interface {v1}, Ldi/k1;->b()Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-eqz v4, :cond_c

    .line 301
    .line 302
    return-object v1

    .line 303
    :cond_c
    if-eqz p2, :cond_d

    .line 304
    .line 305
    invoke-interface {v1}, Ldi/k1;->getType()Ldi/g0;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-interface {p2, v4}, Ldi/n;->c0(Ldi/g0;)Ldi/g0;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    goto :goto_2

    .line 314
    :cond_d
    invoke-interface {v1}, Ldi/k1;->getType()Ldi/g0;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    invoke-virtual {v0}, Ldi/g0;->O0()Z

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    invoke-static {p2, v4}, Ldi/s1;->q(Ldi/g0;Z)Ldi/g0;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    :goto_2
    invoke-virtual {v0}, Ldi/g0;->getAnnotations()Lng/g;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-interface {v4}, Lng/g;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-nez v4, :cond_e

    .line 335
    .line 336
    iget-object v4, p0, Ldi/p1;->a:Ldi/n1;

    .line 337
    .line 338
    invoke-virtual {v0}, Ldi/g0;->getAnnotations()Lng/g;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v4, v0}, Ldi/n1;->d(Lng/g;)Lng/g;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {v0}, Ldi/p1;->i(Lng/g;)Lng/g;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    new-instance v4, Lng/k;

    .line 351
    .line 352
    new-array p3, p3, [Lng/g;

    .line 353
    .line 354
    invoke-virtual {p2}, Ldi/g0;->getAnnotations()Lng/g;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    const/4 v6, 0x0

    .line 359
    aput-object v5, p3, v6

    .line 360
    .line 361
    aput-object v0, p3, v2

    .line 362
    .line 363
    invoke-direct {v4, p3}, Lng/k;-><init>([Lng/g;)V

    .line 364
    .line 365
    .line 366
    invoke-static {p2, v4}, Lii/a;->v(Ldi/g0;Lng/g;)Ldi/g0;

    .line 367
    .line 368
    .line 369
    move-result-object p2

    .line 370
    :cond_e
    sget-object p3, Ldi/p1$d;->k:Ldi/p1$d;

    .line 371
    .line 372
    if-ne p1, p3, :cond_f

    .line 373
    .line 374
    invoke-interface {v1}, Ldi/k1;->a()Ldi/w1;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-static {v3, p1}, Ldi/p1;->d(Ldi/w1;Ldi/w1;)Ldi/w1;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    :cond_f
    new-instance p1, Ldi/m1;

    .line 383
    .line 384
    invoke-direct {p1, v3, p2}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 385
    .line 386
    .line 387
    return-object p1

    .line 388
    :cond_10
    invoke-direct {p0, p1, p3}, Ldi/p1;->r(Ldi/k1;I)Ldi/k1;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    if-nez p1, :cond_11

    .line 393
    .line 394
    const/16 p2, 0x19

    .line 395
    .line 396
    invoke-static {p2}, Ldi/p1;->a(I)V

    .line 397
    .line 398
    .line 399
    :cond_11
    :goto_3
    return-object p1
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method


# virtual methods
.method public j()Ldi/n1;
    .locals 2

    iget-object v0, p0, Ldi/p1;->a:Ldi/n1;

    if-nez v0, :cond_0

    const/16 v1, 0x8

    invoke-static {v1}, Ldi/p1;->a(I)V

    :cond_0
    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Ldi/p1;->a:Ldi/n1;

    invoke-virtual {v0}, Ldi/n1;->f()Z

    move-result v0

    return v0
.end method

.method public m()Ldi/p1;
    .locals 5

    .line 1
    iget-object v0, p0, Ldi/p1;->a:Ldi/n1;

    .line 2
    .line 3
    instance-of v1, v0, Ldi/e0;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ldi/n1;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ldi/p1;

    .line 15
    .line 16
    new-instance v1, Ldi/e0;

    .line 17
    .line 18
    iget-object v2, p0, Ldi/p1;->a:Ldi/n1;

    .line 19
    .line 20
    check-cast v2, Ldi/e0;

    .line 21
    .line 22
    invoke-virtual {v2}, Ldi/e0;->j()[Lmg/f1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, p0, Ldi/p1;->a:Ldi/n1;

    .line 27
    .line 28
    check-cast v3, Ldi/e0;

    .line 29
    .line 30
    invoke-virtual {v3}, Ldi/e0;->i()[Ldi/k1;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v1, v2, v3, v4}, Ldi/e0;-><init>([Lmg/f1;[Ldi/k1;Z)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Ldi/p1;-><init>(Ldi/n1;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    :goto_0
    return-object p0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public n(Ldi/g0;Ldi/w1;)Ldi/g0;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0}, Ldi/p1;->k()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    const/16 p2, 0xb

    .line 24
    .line 25
    invoke-static {p2}, Ldi/p1;->a(I)V

    .line 26
    .line 27
    .line 28
    :cond_2
    return-object p1

    .line 29
    :cond_3
    const/4 v0, 0x0

    .line 30
    :try_start_0
    new-instance v1, Ldi/m1;

    .line 31
    .line 32
    invoke-direct {v1, p2, p1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-direct {p0, v1, p1, v0}, Ldi/p1;->u(Ldi/k1;Lmg/f1;I)Ldi/k1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Ldi/k1;->getType()Ldi/g0;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_0
    .catch Ldi/p1$c; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    if-nez p1, :cond_4

    .line 45
    .line 46
    const/16 p2, 0xc

    .line 47
    .line 48
    invoke-static {p2}, Ldi/p1;->a(I)V

    .line 49
    .line 50
    .line 51
    :cond_4
    return-object p1

    .line 52
    :catch_0
    move-exception p1

    .line 53
    sget-object p2, Lfi/j;->N:Lfi/j;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    new-array v1, v1, [Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    aput-object p1, v1, v0

    .line 63
    .line 64
    invoke-static {p2, v1}, Lfi/k;->d(Lfi/j;[Ljava/lang/String;)Lfi/h;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    const/16 p2, 0xd

    .line 71
    .line 72
    invoke-static {p2}, Ldi/p1;->a(I)V

    .line 73
    .line 74
    .line 75
    :cond_5
    return-object p1
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public p(Ldi/g0;Ldi/w1;)Ldi/g0;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    const/16 v0, 0xf

    .line 11
    .line 12
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    new-instance v0, Ldi/m1;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldi/p1;->j()Ldi/n1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, p1, p2}, Ldi/n1;->g(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p2, p1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ldi/p1;->q(Ldi/k1;)Ldi/k1;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-interface {p1}, Ldi/k1;->getType()Ldi/g0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    return-object p1
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

.method public q(Ldi/k1;)Ldi/k1;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x10

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Ldi/p1;->t(Ldi/k1;)Ldi/k1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Ldi/p1;->a:Ldi/n1;

    .line 13
    .line 14
    invoke-virtual {v0}, Ldi/n1;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Ldi/p1;->a:Ldi/n1;

    .line 21
    .line 22
    invoke-virtual {v0}, Ldi/n1;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    iget-object v0, p0, Ldi/p1;->a:Ldi/n1;

    .line 30
    .line 31
    invoke-virtual {v0}, Ldi/n1;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {p1, v0}, Lji/b;->c(Ldi/k1;Z)Ldi/k1;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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

.method public t(Ldi/k1;)Ldi/k1;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-static {v0}, Ldi/p1;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Ldi/p1;->k()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    :try_start_0
    invoke-direct {p0, p1, v1, v0}, Ldi/p1;->u(Ldi/k1;Lmg/f1;I)Ldi/k1;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catch Ldi/p1$c; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p1

    .line 22
    :catch_0
    return-object v1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
