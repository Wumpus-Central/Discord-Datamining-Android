.class public final Lw/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/x2;
.implements Lw/k1;
.implements Lz/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/x2<",
        "Landroidx/camera/core/g1;",
        ">;",
        "Lw/k1;",
        "Lz/g;"
    }
.end annotation


# static fields
.field public static final A:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Lw/o0;",
            ">;"
        }
    .end annotation
.end field

.field public static final B:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final C:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final D:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Landroidx/camera/core/n1;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final F:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Lw/m0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Lw/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "camerax.core.imageCapture.captureMode"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sput-object v1, Lw/f1;->x:Lw/r0$a;

    .line 10
    .line 11
    const-string v1, "camerax.core.imageCapture.flashMode"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sput-object v1, Lw/f1;->y:Lw/r0$a;

    .line 18
    .line 19
    const-string v1, "camerax.core.imageCapture.captureBundle"

    .line 20
    .line 21
    const-class v2, Lw/m0;

    .line 22
    .line 23
    invoke-static {v1, v2}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sput-object v1, Lw/f1;->z:Lw/r0$a;

    .line 28
    .line 29
    const-string v1, "camerax.core.imageCapture.captureProcessor"

    .line 30
    .line 31
    const-class v2, Lw/o0;

    .line 32
    .line 33
    invoke-static {v1, v2}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lw/f1;->A:Lw/r0$a;

    .line 38
    .line 39
    const-string v1, "camerax.core.imageCapture.bufferFormat"

    .line 40
    .line 41
    const-class v2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-static {v1, v2}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sput-object v1, Lw/f1;->B:Lw/r0$a;

    .line 48
    .line 49
    const-string v1, "camerax.core.imageCapture.maxCaptureStages"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sput-object v1, Lw/f1;->C:Lw/r0$a;

    .line 56
    .line 57
    const-string v1, "camerax.core.imageCapture.imageReaderProxyProvider"

    .line 58
    .line 59
    const-class v2, Landroidx/camera/core/n1;

    .line 60
    .line 61
    invoke-static {v1, v2}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sput-object v1, Lw/f1;->D:Lw/r0$a;

    .line 66
    .line 67
    const-string v1, "camerax.core.imageCapture.useSoftwareJpegEncoder"

    .line 68
    .line 69
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    invoke-static {v1, v2}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sput-object v1, Lw/f1;->E:Lw/r0$a;

    .line 76
    .line 77
    const-string v1, "camerax.core.imageCapture.flashType"

    .line 78
    .line 79
    invoke-static {v1, v0}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sput-object v1, Lw/f1;->F:Lw/r0$a;

    .line 84
    .line 85
    const-string v1, "camerax.core.imageCapture.jpegCompressionQuality"

    .line 86
    .line 87
    invoke-static {v1, v0}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lw/f1;->G:Lw/r0$a;

    .line 92
    .line 93
    return-void
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

.method public constructor <init>(Lw/c2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/f1;->w:Lw/c2;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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


# virtual methods
.method public synthetic A(Lw/k2;)Lw/k2;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->d(Lw/x2;Lw/k2;)Lw/k2;

    move-result-object p1

    return-object p1
.end method

.method public synthetic B(Landroidx/camera/core/t;)Landroidx/camera/core/t;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->a(Lw/x2;Landroidx/camera/core/t;)Landroidx/camera/core/t;

    move-result-object p1

    return-object p1
.end method

.method public synthetic C(Landroidx/camera/core/w2$b;)Landroidx/camera/core/w2$b;
    .locals 0

    invoke-static {p0, p1}, Lz/l;->a(Lz/m;Landroidx/camera/core/w2$b;)Landroidx/camera/core/w2$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic D(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->f(Lw/k1;I)I

    move-result p1

    return p1
.end method

.method public F(Lw/m0;)Lw/m0;
    .locals 1

    sget-object v0, Lw/f1;->z:Lw/r0$a;

    invoke-virtual {p0, v0, p1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/m0;

    return-object p1
.end method

.method public G()I
    .locals 1

    sget-object v0, Lw/f1;->x:Lw/r0$a;

    invoke-virtual {p0, v0}, Lw/f1;->b(Lw/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public H(Lw/o0;)Lw/o0;
    .locals 1

    sget-object v0, Lw/f1;->A:Lw/r0$a;

    invoke-virtual {p0, v0, p1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/o0;

    return-object p1
.end method

.method public I(I)I
    .locals 1

    sget-object v0, Lw/f1;->y:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public J(I)I
    .locals 1

    sget-object v0, Lw/f1;->F:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public K()Landroidx/camera/core/n1;
    .locals 2

    sget-object v0, Lw/f1;->D:Lw/r0$a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/n1;

    return-object v0
.end method

.method public L(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lz/g;->r:Lw/r0$a;

    invoke-virtual {p0, v0, p1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public M()I
    .locals 1

    sget-object v0, Lw/f1;->G:Lw/r0$a;

    invoke-virtual {p0, v0}, Lw/f1;->b(Lw/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public N(I)I
    .locals 1

    sget-object v0, Lw/f1;->C:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public O()Z
    .locals 1

    sget-object v0, Lw/f1;->x:Lw/r0$a;

    invoke-virtual {p0, v0}, Lw/f1;->e(Lw/r0$a;)Z

    move-result v0

    return v0
.end method

.method public P()Z
    .locals 2

    sget-object v0, Lw/f1;->E:Lw/r0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lw/f1;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public synthetic a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/h2;->g(Lw/i2;Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lw/r0$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->f(Lw/i2;Lw/r0$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, Lw/h2;->e(Lw/i2;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Lw/r0$a;)Lw/r0$c;
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->c(Lw/i2;Lw/r0$a;)Lw/r0$c;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Lw/r0$a;)Z
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->a(Lw/i2;Lw/r0$a;)Z

    move-result p1

    return p1
.end method

.method public synthetic f(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->b(Lw/k1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic i(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->c(Lw/k1;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public j()Lw/r0;
    .locals 1

    iget-object v0, p0, Lw/f1;->w:Lw/c2;

    return-object v0
.end method

.method public l()I
    .locals 1

    sget-object v0, Lw/i1;->e:Lw/r0$a;

    invoke-virtual {p0, v0}, Lw/f1;->b(Lw/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public synthetic m(Lw/k2$d;)Lw/k2$d;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->e(Lw/x2;Lw/k2$d;)Lw/k2$d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic n(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->a(Lw/k1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic o(Ljava/lang/String;Lw/r0$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw/h2;->b(Lw/i2;Ljava/lang/String;Lw/r0$b;)V

    return-void
.end method

.method public synthetic p(Lw/r0$a;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lw/h2;->d(Lw/i2;Lw/r0$a;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public synthetic q(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/j1;->e(Lw/k1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic r(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lz/h;->a(Lz/i;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic t(Lw/n0;)Lw/n0;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->c(Lw/x2;Lw/n0;)Lw/n0;

    move-result-object p1

    return-object p1
.end method

.method public synthetic u(Lw/n0$b;)Lw/n0$b;
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->b(Lw/x2;Lw/n0$b;)Lw/n0$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic v()Z
    .locals 1

    invoke-static {p0}, Lw/j1;->g(Lw/k1;)Z

    move-result v0

    return v0
.end method

.method public synthetic w(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/w2;->f(Lw/x2;I)I

    move-result p1

    return p1
.end method

.method public synthetic x()I
    .locals 1

    invoke-static {p0}, Lw/j1;->d(Lw/k1;)I

    move-result v0

    return v0
.end method

.method public synthetic z(Lw/r0$a;Lw/r0$c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/h2;->h(Lw/i2;Lw/r0$a;Lw/r0$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
