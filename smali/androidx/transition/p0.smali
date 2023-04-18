.class Landroidx/transition/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroidx/transition/c1;

.field static final b:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field static final c:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/transition/b1;

    .line 8
    .line 9
    invoke-direct {v0}, Landroidx/transition/b1;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Landroidx/transition/a1;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/transition/a1;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    .line 21
    .line 22
    :goto_0
    new-instance v0, Landroidx/transition/p0$a;

    .line 23
    .line 24
    const-class v1, Ljava/lang/Float;

    .line 25
    .line 26
    const-string v2, "translationAlpha"

    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Landroidx/transition/p0$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Landroidx/transition/p0;->b:Landroid/util/Property;

    .line 32
    .line 33
    new-instance v0, Landroidx/transition/p0$b;

    .line 34
    .line 35
    const-class v1, Landroid/graphics/Rect;

    .line 36
    .line 37
    const-string v2, "clipBounds"

    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, Landroidx/transition/p0$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Landroidx/transition/p0;->c:Landroid/util/Property;

    .line 43
    .line 44
    return-void
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
.end method

.method static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0}, Landroidx/transition/c1;->a(Landroid/view/View;)V

    return-void
.end method

.method static b(Landroid/view/View;)Landroidx/transition/o0;
    .locals 1

    new-instance v0, Landroidx/transition/n0;

    invoke-direct {v0, p0}, Landroidx/transition/n0;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method static c(Landroid/view/View;)F
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0}, Landroidx/transition/c1;->b(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method static d(Landroid/view/View;)Landroidx/transition/g1;
    .locals 1

    new-instance v0, Landroidx/transition/f1;

    invoke-direct {v0, p0}, Landroidx/transition/f1;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method static e(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0}, Landroidx/transition/c1;->c(Landroid/view/View;)V

    return-void
.end method

.method static f(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/c1;->d(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method static g(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/transition/c1;->e(Landroid/view/View;IIII)V

    return-void
.end method

.method static h(Landroid/view/View;F)V
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/c1;->f(Landroid/view/View;F)V

    return-void
.end method

.method static i(Landroid/view/View;I)V
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/c1;->g(Landroid/view/View;I)V

    return-void
.end method

.method static j(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/c1;->h(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method static k(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Landroidx/transition/p0;->a:Landroidx/transition/c1;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/c1;->i(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method
