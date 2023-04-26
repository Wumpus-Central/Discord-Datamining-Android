.class final enum Lcom/github/yamill/orientation/OrientationModule$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/yamill/orientation/OrientationModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/github/yamill/orientation/OrientationModule$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0082\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/github/yamill/orientation/OrientationModule$d;",
        "",
        "",
        "k",
        "I",
        "b",
        "()I",
        "orientationInt",
        "<init>",
        "(Ljava/lang/String;II)V",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "react-native-orientation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum l:Lcom/github/yamill/orientation/OrientationModule$d;

.field public static final enum m:Lcom/github/yamill/orientation/OrientationModule$d;

.field public static final enum n:Lcom/github/yamill/orientation/OrientationModule$d;

.field public static final enum o:Lcom/github/yamill/orientation/OrientationModule$d;

.field public static final enum p:Lcom/github/yamill/orientation/OrientationModule$d;

.field public static final enum q:Lcom/github/yamill/orientation/OrientationModule$d;

.field private static final synthetic r:[Lcom/github/yamill/orientation/OrientationModule$d;


# instance fields
.field private final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/github/yamill/orientation/OrientationModule$d;

    .line 2
    .line 3
    const-string v1, "LOCKED_PORTRAIT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/github/yamill/orientation/OrientationModule$d;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->l:Lcom/github/yamill/orientation/OrientationModule$d;

    .line 11
    .line 12
    new-instance v0, Lcom/github/yamill/orientation/OrientationModule$d;

    .line 13
    .line 14
    const-string v1, "LOCKED_LANDSCAPE"

    .line 15
    .line 16
    const/4 v4, 0x6

    .line 17
    invoke-direct {v0, v1, v3, v4}, Lcom/github/yamill/orientation/OrientationModule$d;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->m:Lcom/github/yamill/orientation/OrientationModule$d;

    .line 21
    .line 22
    new-instance v0, Lcom/github/yamill/orientation/OrientationModule$d;

    .line 23
    .line 24
    const-string v1, "LOCKED_LANDSCAPE_LEFT"

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v0, v1, v3, v2}, Lcom/github/yamill/orientation/OrientationModule$d;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->n:Lcom/github/yamill/orientation/OrientationModule$d;

    .line 31
    .line 32
    new-instance v0, Lcom/github/yamill/orientation/OrientationModule$d;

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    const/16 v2, 0x8

    .line 36
    .line 37
    const-string v3, "LOCKED_LANDSCAPE_RIGHT"

    .line 38
    .line 39
    invoke-direct {v0, v3, v1, v2}, Lcom/github/yamill/orientation/OrientationModule$d;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->o:Lcom/github/yamill/orientation/OrientationModule$d;

    .line 43
    .line 44
    new-instance v0, Lcom/github/yamill/orientation/OrientationModule$d;

    .line 45
    .line 46
    const-string v1, "UNLOCKED"

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    invoke-direct {v0, v1, v2, v2}, Lcom/github/yamill/orientation/OrientationModule$d;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->p:Lcom/github/yamill/orientation/OrientationModule$d;

    .line 53
    .line 54
    new-instance v0, Lcom/github/yamill/orientation/OrientationModule$d;

    .line 55
    .line 56
    const/4 v1, 0x5

    .line 57
    const/4 v2, -0x1

    .line 58
    const-string v3, "UNSPECIFIED"

    .line 59
    .line 60
    invoke-direct {v0, v3, v1, v2}, Lcom/github/yamill/orientation/OrientationModule$d;-><init>(Ljava/lang/String;II)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->q:Lcom/github/yamill/orientation/OrientationModule$d;

    .line 64
    .line 65
    invoke-static {}, Lcom/github/yamill/orientation/OrientationModule$d;->a()[Lcom/github/yamill/orientation/OrientationModule$d;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->r:[Lcom/github/yamill/orientation/OrientationModule$d;

    .line 70
    .line 71
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/github/yamill/orientation/OrientationModule$d;->k:I

    return-void
.end method

.method private static final synthetic a()[Lcom/github/yamill/orientation/OrientationModule$d;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/github/yamill/orientation/OrientationModule$d;

    const/4 v1, 0x0

    sget-object v2, Lcom/github/yamill/orientation/OrientationModule$d;->l:Lcom/github/yamill/orientation/OrientationModule$d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/github/yamill/orientation/OrientationModule$d;->m:Lcom/github/yamill/orientation/OrientationModule$d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/github/yamill/orientation/OrientationModule$d;->n:Lcom/github/yamill/orientation/OrientationModule$d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/github/yamill/orientation/OrientationModule$d;->o:Lcom/github/yamill/orientation/OrientationModule$d;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/github/yamill/orientation/OrientationModule$d;->p:Lcom/github/yamill/orientation/OrientationModule$d;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/github/yamill/orientation/OrientationModule$d;->q:Lcom/github/yamill/orientation/OrientationModule$d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/github/yamill/orientation/OrientationModule$d;
    .locals 1

    const-class v0, Lcom/github/yamill/orientation/OrientationModule$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/github/yamill/orientation/OrientationModule$d;

    return-object p0
.end method

.method public static values()[Lcom/github/yamill/orientation/OrientationModule$d;
    .locals 1

    sget-object v0, Lcom/github/yamill/orientation/OrientationModule$d;->r:[Lcom/github/yamill/orientation/OrientationModule$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/github/yamill/orientation/OrientationModule$d;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lcom/github/yamill/orientation/OrientationModule$d;->k:I

    return v0
.end method
