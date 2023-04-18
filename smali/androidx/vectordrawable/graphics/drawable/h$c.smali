.class Landroidx/vectordrawable/graphics/drawable/h$c;
.super Landroidx/vectordrawable/graphics/drawable/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/vectordrawable/graphics/drawable/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private e:[I

.field f:Landroidx/core/content/res/d;

.field g:F

.field h:Landroidx/core/content/res/d;

.field i:F

.field j:F

.field k:F

.field l:F

.field m:F

.field n:Landroid/graphics/Paint$Cap;

.field o:Landroid/graphics/Paint$Join;

.field p:F


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/vectordrawable/graphics/drawable/h$f;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    .line 4
    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    .line 5
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    .line 6
    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    .line 7
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    .line 8
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->n:Landroid/graphics/Paint$Cap;

    .line 9
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->o:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    .line 10
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->p:F

    return-void
.end method

.method constructor <init>(Landroidx/vectordrawable/graphics/drawable/h$c;)V
    .locals 2

    .line 11
    invoke-direct {p0, p1}, Landroidx/vectordrawable/graphics/drawable/h$f;-><init>(Landroidx/vectordrawable/graphics/drawable/h$f;)V

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    .line 14
    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    .line 15
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    .line 16
    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    .line 17
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    .line 18
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->n:Landroid/graphics/Paint$Cap;

    .line 19
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->o:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    .line 20
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->p:F

    .line 21
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->e:[I

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->e:[I

    .line 22
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    .line 23
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    .line 24
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    .line 25
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    .line 26
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    .line 27
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    .line 28
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    .line 29
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    .line 30
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    .line 31
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->n:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->n:Landroid/graphics/Paint$Cap;

    .line 32
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->o:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->o:Landroid/graphics/Paint$Join;

    .line 33
    iget p1, p1, Landroidx/vectordrawable/graphics/drawable/h$c;->p:F

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->p:F

    return-void
.end method

.method private e(ILandroid/graphics/Paint$Cap;)Landroid/graphics/Paint$Cap;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    return-object p2

    .line 10
    :cond_0
    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_1
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_2
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 17
    .line 18
    return-object p1
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
.end method

.method private f(ILandroid/graphics/Paint$Join;)Landroid/graphics/Paint$Join;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    return-object p2

    .line 10
    :cond_0
    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_1
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_2
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 17
    .line 18
    return-object p1
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
.end method

.method private h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->e:[I

    .line 3
    .line 4
    const-string v0, "pathData"

    .line 5
    .line 6
    invoke-static {p2, v0}, Landroidx/core/content/res/l;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->b:Ljava/lang/String;

    .line 21
    .line 22
    :cond_1
    const/4 v0, 0x2

    .line 23
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/core/graphics/d;->d(Ljava/lang/String;)[Landroidx/core/graphics/d$b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Landroidx/core/graphics/d$b;

    .line 34
    .line 35
    :cond_2
    const-string v4, "fillColor"

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    const/4 v6, 0x0

    .line 39
    move-object v1, p1

    .line 40
    move-object v2, p2

    .line 41
    move-object v3, p3

    .line 42
    invoke-static/range {v1 .. v6}, Landroidx/core/content/res/l;->e(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Landroidx/core/content/res/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    .line 47
    .line 48
    const/16 v0, 0xc

    .line 49
    .line 50
    iget v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    .line 51
    .line 52
    const-string v2, "fillAlpha"

    .line 53
    .line 54
    invoke-static {p1, p2, v2, v0, v1}, Landroidx/core/content/res/l;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    .line 59
    .line 60
    const-string v0, "strokeLineCap"

    .line 61
    .line 62
    const/16 v1, 0x8

    .line 63
    .line 64
    const/4 v2, -0x1

    .line 65
    invoke-static {p1, p2, v0, v1, v2}, Landroidx/core/content/res/l;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->n:Landroid/graphics/Paint$Cap;

    .line 70
    .line 71
    invoke-direct {p0, v0, v1}, Landroidx/vectordrawable/graphics/drawable/h$c;->e(ILandroid/graphics/Paint$Cap;)Landroid/graphics/Paint$Cap;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->n:Landroid/graphics/Paint$Cap;

    .line 76
    .line 77
    const-string v0, "strokeLineJoin"

    .line 78
    .line 79
    const/16 v1, 0x9

    .line 80
    .line 81
    invoke-static {p1, p2, v0, v1, v2}, Landroidx/core/content/res/l;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->o:Landroid/graphics/Paint$Join;

    .line 86
    .line 87
    invoke-direct {p0, v0, v1}, Landroidx/vectordrawable/graphics/drawable/h$c;->f(ILandroid/graphics/Paint$Join;)Landroid/graphics/Paint$Join;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->o:Landroid/graphics/Paint$Join;

    .line 92
    .line 93
    const/16 v0, 0xa

    .line 94
    .line 95
    iget v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->p:F

    .line 96
    .line 97
    const-string v2, "strokeMiterLimit"

    .line 98
    .line 99
    invoke-static {p1, p2, v2, v0, v1}, Landroidx/core/content/res/l;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->p:F

    .line 104
    .line 105
    const-string v4, "strokeColor"

    .line 106
    .line 107
    const/4 v5, 0x3

    .line 108
    move-object v1, p1

    .line 109
    move-object v2, p2

    .line 110
    invoke-static/range {v1 .. v6}, Landroidx/core/content/res/l;->e(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Landroidx/core/content/res/d;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    iput-object p3, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    .line 115
    .line 116
    const/16 p3, 0xb

    .line 117
    .line 118
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    .line 119
    .line 120
    const-string v1, "strokeAlpha"

    .line 121
    .line 122
    invoke-static {p1, p2, v1, p3, v0}, Landroidx/core/content/res/l;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    iput p3, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    .line 127
    .line 128
    const/4 p3, 0x4

    .line 129
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    .line 130
    .line 131
    const-string v1, "strokeWidth"

    .line 132
    .line 133
    invoke-static {p1, p2, v1, p3, v0}, Landroidx/core/content/res/l;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    iput p3, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    .line 138
    .line 139
    const/4 p3, 0x6

    .line 140
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    .line 141
    .line 142
    const-string v1, "trimPathEnd"

    .line 143
    .line 144
    invoke-static {p1, p2, v1, p3, v0}, Landroidx/core/content/res/l;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    iput p3, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    .line 149
    .line 150
    const/4 p3, 0x7

    .line 151
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    .line 152
    .line 153
    const-string v1, "trimPathOffset"

    .line 154
    .line 155
    invoke-static {p1, p2, v1, p3, v0}, Landroidx/core/content/res/l;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    iput p3, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    .line 160
    .line 161
    const/4 p3, 0x5

    .line 162
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    .line 163
    .line 164
    const-string v1, "trimPathStart"

    .line 165
    .line 166
    invoke-static {p1, p2, v1, p3, v0}, Landroidx/core/content/res/l;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    iput p3, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    .line 171
    .line 172
    const/16 p3, 0xd

    .line 173
    .line 174
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    .line 175
    .line 176
    const-string v1, "fillType"

    .line 177
    .line 178
    invoke-static {p1, p2, v1, p3, v0}, Landroidx/core/content/res/l;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    .line 183
    .line 184
    return-void
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


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    invoke-virtual {v0}, Landroidx/core/content/res/d;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    invoke-virtual {v0}, Landroidx/core/content/res/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b([I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/content/res/d;->j([I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Landroidx/core/content/res/d;->j([I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    or-int/2addr p1, v0

    .line 14
    return p1
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
.end method

.method public g(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/vectordrawable/graphics/drawable/a;->c:[I

    .line 2
    .line 3
    invoke-static {p1, p3, p2, v0}, Landroidx/core/content/res/l;->k(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1, p4, p3}, Landroidx/vectordrawable/graphics/drawable/h$c;->h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    .line 12
    .line 13
    return-void
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
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
.end method

.method getFillAlpha()F
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    return v0
.end method

.method getFillColor()I
    .locals 1

    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    invoke-virtual {v0}, Landroidx/core/content/res/d;->e()I

    move-result v0

    return v0
.end method

.method getStrokeAlpha()F
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    return v0
.end method

.method getStrokeColor()I
    .locals 1

    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    invoke-virtual {v0}, Landroidx/core/content/res/d;->e()I

    move-result v0

    return v0
.end method

.method getStrokeWidth()F
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    return v0
.end method

.method getTrimPathEnd()F
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    return v0
.end method

.method getTrimPathOffset()F
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    return v0
.end method

.method getTrimPathStart()F
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    return v0
.end method

.method setFillAlpha(F)V
    .locals 0

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    return-void
.end method

.method setFillColor(I)V
    .locals 1

    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    invoke-virtual {v0, p1}, Landroidx/core/content/res/d;->k(I)V

    return-void
.end method

.method setStrokeAlpha(F)V
    .locals 0

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    return-void
.end method

.method setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    invoke-virtual {v0, p1}, Landroidx/core/content/res/d;->k(I)V

    return-void
.end method

.method setStrokeWidth(F)V
    .locals 0

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    return-void
.end method

.method setTrimPathEnd(F)V
    .locals 0

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    return-void
.end method

.method setTrimPathOffset(F)V
    .locals 0

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    return-void
.end method

.method setTrimPathStart(F)V
    .locals 0

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    return-void
.end method
