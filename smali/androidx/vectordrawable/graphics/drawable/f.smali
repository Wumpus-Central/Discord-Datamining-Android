.class public Landroidx/vectordrawable/graphics/drawable/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# static fields
.field private static final a:Landroidx/vectordrawable/graphics/drawable/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/vectordrawable/graphics/drawable/f;

    invoke-direct {v0}, Landroidx/vectordrawable/graphics/drawable/f;-><init>()V

    sput-object v0, Landroidx/vectordrawable/graphics/drawable/f;->a:Landroidx/vectordrawable/graphics/drawable/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroidx/vectordrawable/graphics/drawable/f;
    .locals 1

    sget-object v0, Landroidx/vectordrawable/graphics/drawable/f;->a:Landroidx/vectordrawable/graphics/drawable/f;

    return-object v0
.end method


# virtual methods
.method public evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p2, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    shr-int/lit8 v0, p2, 0x18

    .line 8
    .line 9
    and-int/lit16 v0, v0, 0xff

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    const/high16 v1, 0x437f0000    # 255.0f

    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    shr-int/lit8 v2, p2, 0x10

    .line 16
    .line 17
    and-int/lit16 v2, v2, 0xff

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    div-float/2addr v2, v1

    .line 21
    shr-int/lit8 v3, p2, 0x8

    .line 22
    .line 23
    and-int/lit16 v3, v3, 0xff

    .line 24
    .line 25
    int-to-float v3, v3

    .line 26
    div-float/2addr v3, v1

    .line 27
    and-int/lit16 p2, p2, 0xff

    .line 28
    .line 29
    int-to-float p2, p2

    .line 30
    div-float/2addr p2, v1

    .line 31
    check-cast p3, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    shr-int/lit8 v4, p3, 0x18

    .line 38
    .line 39
    and-int/lit16 v4, v4, 0xff

    .line 40
    .line 41
    int-to-float v4, v4

    .line 42
    div-float/2addr v4, v1

    .line 43
    shr-int/lit8 v5, p3, 0x10

    .line 44
    .line 45
    and-int/lit16 v5, v5, 0xff

    .line 46
    .line 47
    int-to-float v5, v5

    .line 48
    div-float/2addr v5, v1

    .line 49
    shr-int/lit8 v6, p3, 0x8

    .line 50
    .line 51
    and-int/lit16 v6, v6, 0xff

    .line 52
    .line 53
    int-to-float v6, v6

    .line 54
    div-float/2addr v6, v1

    .line 55
    and-int/lit16 p3, p3, 0xff

    .line 56
    .line 57
    int-to-float p3, p3

    .line 58
    div-float/2addr p3, v1

    .line 59
    float-to-double v7, v2

    .line 60
    const-wide v9, 0x400199999999999aL    # 2.2

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    double-to-float v2, v7

    .line 70
    float-to-double v7, v3

    .line 71
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    double-to-float v3, v7

    .line 76
    float-to-double v7, p2

    .line 77
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    double-to-float p2, v7

    .line 82
    float-to-double v7, v5

    .line 83
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    double-to-float v5, v7

    .line 88
    float-to-double v6, v6

    .line 89
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    double-to-float v6, v6

    .line 94
    float-to-double v7, p3

    .line 95
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    double-to-float p3, v7

    .line 100
    sub-float/2addr v4, v0

    .line 101
    mul-float/2addr v4, p1

    .line 102
    add-float/2addr v0, v4

    .line 103
    sub-float/2addr v5, v2

    .line 104
    mul-float/2addr v5, p1

    .line 105
    add-float/2addr v2, v5

    .line 106
    sub-float/2addr v6, v3

    .line 107
    mul-float/2addr v6, p1

    .line 108
    add-float/2addr v3, v6

    .line 109
    sub-float/2addr p3, p2

    .line 110
    mul-float/2addr p1, p3

    .line 111
    add-float/2addr p2, p1

    .line 112
    mul-float/2addr v0, v1

    .line 113
    float-to-double v4, v2

    .line 114
    const-wide v6, 0x3fdd1745d1745d17L    # 0.45454545454545453

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    double-to-float p1, v4

    .line 124
    mul-float/2addr p1, v1

    .line 125
    float-to-double v2, v3

    .line 126
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    double-to-float p3, v2

    .line 131
    mul-float/2addr p3, v1

    .line 132
    float-to-double v2, p2

    .line 133
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 134
    .line 135
    .line 136
    move-result-wide v2

    .line 137
    double-to-float p2, v2

    .line 138
    mul-float/2addr p2, v1

    .line 139
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    shl-int/lit8 v0, v0, 0x18

    .line 144
    .line 145
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    shl-int/lit8 p1, p1, 0x10

    .line 150
    .line 151
    or-int/2addr p1, v0

    .line 152
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 153
    .line 154
    .line 155
    move-result p3

    .line 156
    shl-int/lit8 p3, p3, 0x8

    .line 157
    .line 158
    or-int/2addr p1, p3

    .line 159
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    or-int/2addr p1, p2

    .line 164
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    return-object p1
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
.end method
