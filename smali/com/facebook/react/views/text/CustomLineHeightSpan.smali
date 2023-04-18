.class public Lcom/facebook/react/views/text/CustomLineHeightSpan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LineHeightSpan;
.implements Lcom/facebook/react/views/text/ReactSpan;


# static fields
.field public static chooseHeightOverride:Lcom/facebook/react/bridge/Callback;


# instance fields
.field private final mHeight:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    float-to-double v0, p1

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    double-to-int p1, v0

    .line 10
    iput p1, p0, Lcom/facebook/react/views/text/CustomLineHeightSpan;->mHeight:I

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
.end method


# virtual methods
.method public chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/facebook/react/views/text/CustomLineHeightSpan;->chooseHeightOverride:Lcom/facebook/react/bridge/Callback;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p3, 0x2

    .line 7
    new-array p3, p3, [Ljava/lang/Object;

    .line 8
    .line 9
    aput-object p6, p3, p2

    .line 10
    .line 11
    iget p2, p0, Lcom/facebook/react/views/text/CustomLineHeightSpan;->mHeight:I

    .line 12
    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 p4, 0x1

    .line 18
    aput-object p2, p3, p4

    .line 19
    .line 20
    invoke-interface {p1, p3}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 25
    .line 26
    iget p3, p0, Lcom/facebook/react/views/text/CustomLineHeightSpan;->mHeight:I

    .line 27
    .line 28
    if-le p1, p3, :cond_1

    .line 29
    .line 30
    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 35
    .line 36
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 37
    .line 38
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 39
    .line 40
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 44
    .line 45
    neg-int p4, p2

    .line 46
    add-int/2addr p4, p1

    .line 47
    if-le p4, p3, :cond_2

    .line 48
    .line 49
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 50
    .line 51
    neg-int p2, p3

    .line 52
    add-int/2addr p2, p1

    .line 53
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 54
    .line 55
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    neg-int p1, p2

    .line 59
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 60
    .line 61
    add-int/2addr p1, p4

    .line 62
    if-le p1, p3, :cond_3

    .line 63
    .line 64
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 65
    .line 66
    add-int/2addr p2, p3

    .line 67
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 71
    .line 72
    neg-int p2, p1

    .line 73
    add-int/2addr p2, p4

    .line 74
    if-le p2, p3, :cond_4

    .line 75
    .line 76
    sub-int/2addr p4, p3

    .line 77
    iput p4, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    neg-int p2, p1

    .line 81
    add-int/2addr p2, p4

    .line 82
    sub-int/2addr p3, p2

    .line 83
    int-to-double p1, p1

    .line 84
    int-to-float p3, p3

    .line 85
    const/high16 p4, 0x40000000    # 2.0f

    .line 86
    .line 87
    div-float/2addr p3, p4

    .line 88
    float-to-double p3, p3

    .line 89
    invoke-static {p3, p4}, Ljava/lang/Math;->ceil(D)D

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    sub-double/2addr p1, v0

    .line 94
    double-to-int p1, p1

    .line 95
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 96
    .line 97
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 98
    .line 99
    int-to-double p1, p1

    .line 100
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    .line 101
    .line 102
    .line 103
    move-result-wide p3

    .line 104
    add-double/2addr p1, p3

    .line 105
    double-to-int p1, p1

    .line 106
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 107
    .line 108
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 109
    .line 110
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 111
    .line 112
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 113
    .line 114
    :goto_0
    return-void
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
.end method
