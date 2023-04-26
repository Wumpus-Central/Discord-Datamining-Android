.class Lcom/facebook/react/views/modal/ModalHostHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MAX_POINT:Landroid/graphics/Point;

.field private static final MIN_POINT:Landroid/graphics/Point;

.field private static final SIZE_POINT:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/views/modal/ModalHostHelper;->MIN_POINT:Landroid/graphics/Point;

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Point;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/facebook/react/views/modal/ModalHostHelper;->MAX_POINT:Landroid/graphics/Point;

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Point;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/facebook/react/views/modal/ModalHostHelper;->SIZE_POINT:Landroid/graphics/Point;

    .line 21
    .line 22
    return-void
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
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getModalHostSize(Landroid/content/Context;)Landroid/graphics/Point;
    .locals 8

    .line 1
    const-string v0, "window"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/WindowManager;

    .line 8
    .line 9
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/WindowManager;

    .line 14
    .line 15
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lcom/facebook/react/views/modal/ModalHostHelper;->MIN_POINT:Landroid/graphics/Point;

    .line 20
    .line 21
    sget-object v2, Lcom/facebook/react/views/modal/ModalHostHelper;->MAX_POINT:Landroid/graphics/Point;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/view/Display;->getCurrentSizeRange(Landroid/graphics/Point;Landroid/graphics/Point;)V

    .line 24
    .line 25
    .line 26
    sget-object v3, Lcom/facebook/react/views/modal/ModalHostHelper;->SIZE_POINT:Landroid/graphics/Point;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    new-array v0, v0, [I

    .line 33
    .line 34
    const v4, 0x101020d

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    aput v4, v0, v5

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v4, "dimen"

    .line 57
    .line 58
    const-string v6, "android"

    .line 59
    .line 60
    const-string v7, "status_bar_height"

    .line 61
    .line 62
    invoke-virtual {p0, v7, v4, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    if-lez v4, :cond_0

    .line 69
    .line 70
    invoke-virtual {p0, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    float-to-int v5, p0

    .line 75
    :cond_0
    iget p0, v3, Landroid/graphics/Point;->x:I

    .line 76
    .line 77
    iget v0, v3, Landroid/graphics/Point;->y:I

    .line 78
    .line 79
    if-ge p0, v0, :cond_1

    .line 80
    .line 81
    new-instance p0, Landroid/graphics/Point;

    .line 82
    .line 83
    iget v0, v1, Landroid/graphics/Point;->x:I

    .line 84
    .line 85
    iget v1, v2, Landroid/graphics/Point;->y:I

    .line 86
    .line 87
    add-int/2addr v1, v5

    .line 88
    invoke-direct {p0, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_1
    new-instance p0, Landroid/graphics/Point;

    .line 93
    .line 94
    iget v0, v2, Landroid/graphics/Point;->x:I

    .line 95
    .line 96
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 97
    .line 98
    add-int/2addr v1, v5

    .line 99
    invoke-direct {p0, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 100
    .line 101
    .line 102
    return-object p0
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
.end method
