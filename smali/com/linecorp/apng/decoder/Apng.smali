.class public final Lcom/linecorp/apng/decoder/Apng;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linecorp/apng/decoder/Apng$DecodeResult;,
        Lcom/linecorp/apng/decoder/Apng$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0015\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 >2\u00020\u0001:\u0002>?BE\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010#\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020$\u0012\u0008\u0008\u0001\u0010,\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u00102\u001a\u00020-\u00a2\u0006\u0004\u0008<\u0010=J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0000J\u0006\u0010\u0005\u001a\u00020\u0002J0\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0015\u001a\u0004\u0008\u001c\u0010\u0017R\u0017\u0010 \u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0015\u001a\u0004\u0008\u001f\u0010\u0017R\u0017\u0010#\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0015\u001a\u0004\u0008\"\u0010\u0017R\u0017\u0010)\u001a\u00020$8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0017\u0010,\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010\u0015\u001a\u0004\u0008+\u0010\u0017R\u0017\u00102\u001a\u00020-8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u0011\u00104\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010\u0017R\u0011\u00106\u001a\u0002058F\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R\u0011\u0010;\u001a\u0002088F\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:\u00a8\u0006@"
    }
    d2 = {
        "Lcom/linecorp/apng/decoder/Apng;",
        "",
        "",
        "recycle",
        "copy",
        "finalize",
        "",
        "frameIndex",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/graphics/Rect;",
        "src",
        "dst",
        "Landroid/graphics/Paint;",
        "paint",
        "drawWithIndex",
        "Landroid/graphics/Bitmap;",
        "a",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "b",
        "I",
        "getDuration",
        "()I",
        "duration",
        "c",
        "id",
        "d",
        "getWidth",
        "width",
        "e",
        "getHeight",
        "height",
        "f",
        "getFrameCount",
        "frameCount",
        "",
        "g",
        "[I",
        "getFrameDurations",
        "()[I",
        "frameDurations",
        "h",
        "getLoopCount",
        "loopCount",
        "",
        "i",
        "J",
        "getAllFrameByteCount",
        "()J",
        "allFrameByteCount",
        "getByteCount",
        "byteCount",
        "",
        "isRecycled",
        "()Z",
        "Landroid/graphics/Bitmap$Config;",
        "getConfig",
        "()Landroid/graphics/Bitmap$Config;",
        "config",
        "<init>",
        "(IIII[IIJ)V",
        "Companion",
        "DecodeResult",
        "apng-drawable_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final Companion:Lcom/linecorp/apng/decoder/Apng$Companion;


# instance fields
.field private final a:Landroid/graphics/Bitmap;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:[I

.field private final h:I

.field private final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/linecorp/apng/decoder/Apng$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/linecorp/apng/decoder/Apng$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/linecorp/apng/decoder/Apng;->Companion:Lcom/linecorp/apng/decoder/Apng$Companion;

    return-void
.end method

.method public constructor <init>(IIII[IIJ)V
    .locals 1

    const-string v0, "frameDurations"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/linecorp/apng/decoder/Apng;->c:I

    iput p2, p0, Lcom/linecorp/apng/decoder/Apng;->d:I

    iput p3, p0, Lcom/linecorp/apng/decoder/Apng;->e:I

    iput p4, p0, Lcom/linecorp/apng/decoder/Apng;->f:I

    iput-object p5, p0, Lcom/linecorp/apng/decoder/Apng;->g:[I

    iput p6, p0, Lcom/linecorp/apng/decoder/Apng;->h:I

    iput-wide p7, p0, Lcom/linecorp/apng/decoder/Apng;->i:J

    .line 2
    sget-object p4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, p4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    const-string p3, "Bitmap.createBitmap(widt\u2026 Bitmap.Config.ARGB_8888)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/linecorp/apng/decoder/Apng;->a:Landroid/graphics/Bitmap;

    const-string p3, "Apng#draw"

    .line 3
    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 4
    invoke-static {p1, p3, p2}, Lcom/linecorp/apng/decoder/ApngDecoderJni;->draw(IILandroid/graphics/Bitmap;)V

    .line 5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 6
    invoke-static {p5}, Lkotlin/collections/b;->l0([I)I

    move-result p1

    iput p1, p0, Lcom/linecorp/apng/decoder/Apng;->b:I

    return-void
.end method

.method public static final synthetic access$getId$p(Lcom/linecorp/apng/decoder/Apng;)I
    .locals 0

    iget p0, p0, Lcom/linecorp/apng/decoder/Apng;->c:I

    return p0
.end method


# virtual methods
.method public final copy()Lcom/linecorp/apng/decoder/Apng;
    .locals 1

    sget-object v0, Lcom/linecorp/apng/decoder/Apng;->Companion:Lcom/linecorp/apng/decoder/Apng$Companion;

    invoke-virtual {v0, p0}, Lcom/linecorp/apng/decoder/Apng$Companion;->copy(Lcom/linecorp/apng/decoder/Apng;)Lcom/linecorp/apng/decoder/Apng;

    move-result-object v0

    return-object v0
.end method

.method public final drawWithIndex(ILandroid/graphics/Canvas;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dst"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "paint"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "Apng#draw"

    .line 17
    .line 18
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v0, p0, Lcom/linecorp/apng/decoder/Apng;->c:I

    .line 22
    .line 23
    iget-object v1, p0, Lcom/linecorp/apng/decoder/Apng;->a:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-static {v0, p1, v1}, Lcom/linecorp/apng/decoder/ApngDecoderJni;->draw(IILandroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/linecorp/apng/decoder/Apng;->a:Landroid/graphics/Bitmap;

    .line 32
    .line 33
    invoke-virtual {p2, p1, p3, p4, p5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    return-void
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
.end method

.method public final finalize()V
    .locals 0

    invoke-virtual {p0}, Lcom/linecorp/apng/decoder/Apng;->recycle()V

    return-void
.end method

.method public final getAllFrameByteCount()J
    .locals 2

    iget-wide v0, p0, Lcom/linecorp/apng/decoder/Apng;->i:J

    return-wide v0
.end method

.method public final getByteCount()I
    .locals 1

    iget-object v0, p0, Lcom/linecorp/apng/decoder/Apng;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    return v0
.end method

.method public final getConfig()Landroid/graphics/Bitmap$Config;
    .locals 2

    iget-object v0, p0, Lcom/linecorp/apng/decoder/Apng;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    const-string v1, "bitmap.config"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/decoder/Apng;->b:I

    return v0
.end method

.method public final getFrameCount()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/decoder/Apng;->f:I

    return v0
.end method

.method public final getFrameDurations()[I
    .locals 1

    iget-object v0, p0, Lcom/linecorp/apng/decoder/Apng;->g:[I

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/decoder/Apng;->e:I

    return v0
.end method

.method public final getLoopCount()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/decoder/Apng;->h:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/decoder/Apng;->d:I

    return v0
.end method

.method public final isRecycled()Z
    .locals 1

    iget-object v0, p0, Lcom/linecorp/apng/decoder/Apng;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    return v0
.end method

.method public final recycle()V
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/decoder/Apng;->c:I

    invoke-static {v0}, Lcom/linecorp/apng/decoder/ApngDecoderJni;->recycle(I)I

    return-void
.end method
