.class public final Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;",
        "",
        "()V",
        "override",
        "",
        "overrideLineHeight",
        "fm",
        "Landroid/graphics/Paint$FontMetricsInt;",
        "mHeight",
        "",
        "react_fork_overrides_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;

    invoke-direct {v0}, Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;-><init>()V

    sput-object v0, Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;->INSTANCE:Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a([Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;->override$lambda$0([Ljava/lang/Object;)V

    return-void
.end method

.method private static final override$lambda$0([Ljava/lang/Object;)V
    .locals 3

    .line 1
    const-string v0, "(fm, mHeight)"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p0, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object p0, p0, v1

    .line 11
    .line 12
    sget-object v1, Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;->INSTANCE:Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;

    .line 13
    .line 14
    const-string v2, "null cannot be cast to non-null type android.graphics.Paint.FontMetricsInt"

    .line 15
    .line 16
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast v0, Landroid/graphics/Paint$FontMetricsInt;

    .line 20
    .line 21
    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    .line 22
    .line 23
    invoke-static {p0, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p0, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-direct {v1, v0, p0}, Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;->overrideLineHeight(Landroid/graphics/Paint$FontMetricsInt;I)V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method private final overrideLineHeight(Landroid/graphics/Paint$FontMetricsInt;I)V
    .locals 6

    .line 1
    iget v0, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 2
    .line 3
    iget v1, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 4
    .line 5
    sub-int v2, v0, v1

    .line 6
    .line 7
    if-lt p2, v2, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-eqz v2, :cond_1

    .line 13
    .line 14
    neg-int v2, v1

    .line 15
    add-int/2addr v2, v0

    .line 16
    sub-int/2addr p2, v2

    .line 17
    int-to-float p2, p2

    .line 18
    const/high16 v0, 0x40000000    # 2.0f

    .line 19
    .line 20
    div-float/2addr p2, v0

    .line 21
    float-to-double v2, p2

    .line 22
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    double-to-int p2, v4

    .line 27
    sub-int/2addr v1, p2

    .line 28
    iput v1, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 29
    .line 30
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 31
    .line 32
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    double-to-int v0, v0

    .line 37
    add-int/2addr p2, v0

    .line 38
    iput p2, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 39
    .line 40
    iget v0, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 41
    .line 42
    iput v0, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 43
    .line 44
    iput p2, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget v0, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 48
    .line 49
    iget v1, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 50
    .line 51
    sub-int v1, v0, v1

    .line 52
    .line 53
    if-gtz v1, :cond_2

    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    int-to-float v2, p2

    .line 57
    const/high16 v3, 0x3f400000    # 0.75f

    .line 58
    .line 59
    mul-float/2addr v2, v3

    .line 60
    int-to-float v1, v1

    .line 61
    div-float/2addr v2, v1

    .line 62
    int-to-float v0, v0

    .line 63
    mul-float/2addr v0, v2

    .line 64
    invoke-static {v0}, Lbg/a;->a(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 69
    .line 70
    sub-int/2addr v0, p2

    .line 71
    iput v0, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 72
    .line 73
    :goto_1
    return-void
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
.end method


# virtual methods
.method public final override()V
    .locals 1

    new-instance v0, Ll3/a;

    invoke-direct {v0}, Ll3/a;-><init>()V

    sput-object v0, Lcom/facebook/react/views/text/CustomLineHeightSpan;->chooseHeightOverride:Lcom/facebook/react/bridge/Callback;

    return-void
.end method
