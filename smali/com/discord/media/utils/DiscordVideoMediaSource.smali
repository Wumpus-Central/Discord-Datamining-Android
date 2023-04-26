.class public final Lcom/discord/media/utils/DiscordVideoMediaSource;
.super Lne/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media/utils/DiscordVideoMediaSource$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\'\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008(\u0010)J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002J\u0006\u0010\u000c\u001a\u00020\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0018\u001a\u0004\u0008 \u0010!R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0018\u001a\u0004\u0008#\u0010!\u00a8\u0006+"
    }
    d2 = {
        "Lcom/discord/media/utils/DiscordVideoMediaSource;",
        "Lne/a;",
        "",
        "width",
        "height",
        "frameRate",
        "getAVCBitrate",
        "getDefaultBitrate",
        "Landroid/media/MediaFormat;",
        "srcAudioFormat",
        "getAudioFormatWithBitrate",
        "",
        "isHevc",
        "Landroid/net/Uri;",
        "inputUri",
        "Landroid/net/Uri;",
        "getInputUri",
        "()Landroid/net/Uri;",
        "outputUri",
        "getOutputUri",
        "",
        "srcTrackFormats",
        "Ljava/util/List;",
        "srcVideoFormat",
        "Landroid/media/MediaFormat;",
        "estimatedVideoBitrate",
        "I",
        "bitRate",
        "",
        "iFrameInterval",
        "F",
        "videoFormat",
        "getVideoFormat",
        "()Landroid/media/MediaFormat;",
        "audioFormat",
        "getAudioFormat",
        "Landroid/content/Context;",
        "context",
        "Lcom/discord/media/utils/VideoCompressionQuality;",
        "compressionQuality",
        "<init>",
        "(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;)V",
        "Companion",
        "media_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final Companion:Lcom/discord/media/utils/DiscordVideoMediaSource$Companion;

.field public static final DEFAULT_FRAMERATE:I = 0x1e
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final DEFAULT_HEIGHT:I = 0x1e0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final DEFAULT_IFRAME:F = 5.0f
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final DEFAULT_WIDTH:I = 0x280
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final audioFormat:Landroid/media/MediaFormat;

.field private final bitRate:I

.field private final estimatedVideoBitrate:I

.field private final frameRate:I

.field private final height:I

.field private final iFrameInterval:F

.field private final inputUri:Landroid/net/Uri;

.field private final outputUri:Landroid/net/Uri;

.field private final srcAudioFormat:Landroid/media/MediaFormat;

.field private final srcTrackFormats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;"
        }
    .end annotation
.end field

.field private final srcVideoFormat:Landroid/media/MediaFormat;

.field private final videoFormat:Landroid/media/MediaFormat;

.field private final width:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/media/utils/DiscordVideoMediaSource$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/media/utils/DiscordVideoMediaSource$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/media/utils/DiscordVideoMediaSource;->Companion:Lcom/discord/media/utils/DiscordVideoMediaSource$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;)V
    .locals 11

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "inputUri"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "outputUri"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "compressionQuality"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2}, Lne/a;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->inputUri:Landroid/net/Uri;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->outputUri:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-virtual {p0}, Lne/a;->getTrackCount()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-static {p2, p1}, Lcg/h;->q(II)Lkotlin/ranges/IntRange;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p3, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v0, 0xa

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    move-object v0, p1

    .line 59
    check-cast v0, Lmf/p;

    .line 60
    .line 61
    invoke-virtual {v0}, Lmf/p;->nextInt()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0, v0}, Lne/a;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {p3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iput-object p3, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcTrackFormats:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    const-string v0, "it"

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    const/4 v2, 0x2

    .line 87
    const/4 v3, 0x1

    .line 88
    if-eqz p3, :cond_3

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    move-object v4, p3

    .line 95
    check-cast v4, Landroid/media/MediaFormat;

    .line 96
    .line 97
    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v4}, Lcom/discord/media/utils/MediaFormatUtilsKt;->getMimeType(Landroid/media/MediaFormat;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-eqz v4, :cond_2

    .line 105
    .line 106
    const-string v5, "video"

    .line 107
    .line 108
    invoke-static {v4, v5, p2, v2, v1}, Lpi/l;->H(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-ne v4, v3, :cond_2

    .line 113
    .line 114
    move v4, v3

    .line 115
    goto :goto_1

    .line 116
    :cond_2
    move v4, p2

    .line 117
    :goto_1
    if-eqz v4, :cond_1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    move-object p3, v1

    .line 121
    :goto_2
    check-cast p3, Landroid/media/MediaFormat;

    .line 122
    .line 123
    iput-object p3, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcVideoFormat:Landroid/media/MediaFormat;

    .line 124
    .line 125
    iget-object p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcTrackFormats:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    if-eqz p3, :cond_6

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    move-object v4, p3

    .line 142
    check-cast v4, Landroid/media/MediaFormat;

    .line 143
    .line 144
    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v4}, Lcom/discord/media/utils/MediaFormatUtilsKt;->getMimeType(Landroid/media/MediaFormat;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    if-eqz v4, :cond_5

    .line 152
    .line 153
    const-string v5, "audio"

    .line 154
    .line 155
    invoke-static {v4, v5, p2, v2, v1}, Lpi/l;->H(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-ne v4, v3, :cond_5

    .line 160
    .line 161
    move v4, v3

    .line 162
    goto :goto_3

    .line 163
    :cond_5
    move v4, p2

    .line 164
    :goto_3
    if-eqz v4, :cond_4

    .line 165
    .line 166
    move-object v1, p3

    .line 167
    :cond_6
    check-cast v1, Landroid/media/MediaFormat;

    .line 168
    .line 169
    iput-object v1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcAudioFormat:Landroid/media/MediaFormat;

    .line 170
    .line 171
    iget-object p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcTrackFormats:Ljava/util/List;

    .line 172
    .line 173
    iget-object p3, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcVideoFormat:Landroid/media/MediaFormat;

    .line 174
    .line 175
    invoke-static {p1, p3}, Lkotlin/collections/h;->Z(Ljava/util/List;Ljava/lang/Object;)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-static {p0, p1}, Lqe/h;->a(Lne/c;I)I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    iput p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->estimatedVideoBitrate:I

    .line 184
    .line 185
    iget-object p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcVideoFormat:Landroid/media/MediaFormat;

    .line 186
    .line 187
    const-string p3, "frame-rate"

    .line 188
    .line 189
    const-string v0, "bitrate"

    .line 190
    .line 191
    const-string v1, "height"

    .line 192
    .line 193
    const-string v2, "width"

    .line 194
    .line 195
    const/high16 v4, 0x40a00000    # 5.0f

    .line 196
    .line 197
    const/16 v5, 0x1e

    .line 198
    .line 199
    const/16 v6, 0x1e0

    .line 200
    .line 201
    const/16 v7, 0x280

    .line 202
    .line 203
    const-string v8, "i-frame-interval"

    .line 204
    .line 205
    if-eqz p1, :cond_e

    .line 206
    .line 207
    :try_start_0
    sget-object v9, Llf/s;->l:Llf/s$a;

    .line 208
    .line 209
    invoke-virtual {p1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    goto :goto_4

    .line 222
    :catchall_0
    move-exception v9

    .line 223
    sget-object v10, Llf/s;->l:Llf/s$a;

    .line 224
    .line 225
    invoke-static {v9}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    :goto_4
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-static {v9}, Llf/s;->g(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-eqz v10, :cond_7

    .line 242
    .line 243
    move-object v9, v7

    .line 244
    :cond_7
    check-cast v9, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    :try_start_1
    invoke-virtual {p1, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 262
    goto :goto_5

    .line 263
    :catchall_1
    move-exception v9

    .line 264
    sget-object v10, Llf/s;->l:Llf/s$a;

    .line 265
    .line 266
    invoke-static {v9}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    :goto_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-static {v9}, Llf/s;->g(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-eqz v10, :cond_8

    .line 283
    .line 284
    move-object v9, v6

    .line 285
    :cond_8
    check-cast v9, Ljava/lang/Number;

    .line 286
    .line 287
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    :try_start_2
    invoke-virtual {p1, p3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 303
    goto :goto_6

    .line 304
    :catchall_2
    move-exception v9

    .line 305
    sget-object v10, Llf/s;->l:Llf/s$a;

    .line 306
    .line 307
    invoke-static {v9}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    :goto_6
    invoke-static {v9}, Llf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    if-nez v10, :cond_9

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_9
    :try_start_3
    invoke-virtual {p1, p3}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    float-to-int v9, v9

    .line 327
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 335
    goto :goto_7

    .line 336
    :catchall_3
    move-exception v9

    .line 337
    sget-object v10, Llf/s;->l:Llf/s$a;

    .line 338
    .line 339
    invoke-static {v9}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    :goto_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    invoke-static {v9}, Llf/s;->g(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    if-eqz v10, :cond_a

    .line 356
    .line 357
    move-object v9, v5

    .line 358
    :cond_a
    check-cast v9, Ljava/lang/Number;

    .line 359
    .line 360
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    iput v5, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->frameRate:I

    .line 365
    .line 366
    :try_start_4
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    invoke-static {v5}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 378
    goto :goto_8

    .line 379
    :catchall_4
    move-exception v5

    .line 380
    sget-object v9, Llf/s;->l:Llf/s$a;

    .line 381
    .line 382
    invoke-static {v5}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    invoke-static {v5}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    :goto_8
    invoke-static {v5}, Llf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 391
    .line 392
    .line 393
    move-result-object v9

    .line 394
    if-nez v9, :cond_b

    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_b
    iget v5, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->frameRate:I

    .line 398
    .line 399
    invoke-direct {p0, v7, v6, v5}, Lcom/discord/media/utils/DiscordVideoMediaSource;->getAVCBitrate(III)I

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    :goto_9
    check-cast v5, Ljava/lang/Number;

    .line 408
    .line 409
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    :try_start_5
    invoke-virtual {p1, v8}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 414
    .line 415
    .line 416
    move-result v9

    .line 417
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 425
    goto :goto_a

    .line 426
    :catchall_5
    move-exception v9

    .line 427
    sget-object v10, Llf/s;->l:Llf/s$a;

    .line 428
    .line 429
    invoke-static {v9}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    invoke-static {v9}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    :goto_a
    invoke-static {v9}, Llf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 438
    .line 439
    .line 440
    move-result-object v10

    .line 441
    if-nez v10, :cond_c

    .line 442
    .line 443
    goto :goto_c

    .line 444
    :cond_c
    :try_start_6
    invoke-virtual {p1, v8}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 445
    .line 446
    .line 447
    move-result p1

    .line 448
    int-to-float p1, p1

    .line 449
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    invoke-static {p1}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 457
    goto :goto_b

    .line 458
    :catchall_6
    move-exception p1

    .line 459
    sget-object v9, Llf/s;->l:Llf/s$a;

    .line 460
    .line 461
    invoke-static {p1}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    invoke-static {p1}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    :goto_b
    move-object v9, p1

    .line 470
    :goto_c
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    invoke-static {v9}, Llf/s;->g(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    if-eqz v4, :cond_d

    .line 479
    .line 480
    move-object v9, p1

    .line 481
    :cond_d
    check-cast v9, Ljava/lang/Number;

    .line 482
    .line 483
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 484
    .line 485
    .line 486
    move-result p1

    .line 487
    iput p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->iFrameInterval:F

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_e
    iput v5, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->frameRate:I

    .line 491
    .line 492
    invoke-direct {p0, v7, v6, v5}, Lcom/discord/media/utils/DiscordVideoMediaSource;->getAVCBitrate(III)I

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    iput v4, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->iFrameInterval:F

    .line 497
    .line 498
    :goto_d
    invoke-virtual {p4}, Lcom/discord/media/utils/VideoCompressionQuality;->getTargetResolution()I

    .line 499
    .line 500
    .line 501
    move-result p1

    .line 502
    int-to-float p1, p1

    .line 503
    int-to-float v4, v7

    .line 504
    div-float/2addr p1, v4

    .line 505
    invoke-virtual {p4}, Lcom/discord/media/utils/VideoCompressionQuality;->getTargetResolution()I

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    int-to-float v7, v7

    .line 510
    int-to-float v6, v6

    .line 511
    div-float/2addr v7, v6

    .line 512
    invoke-static {p1, v7}, Ljava/lang/Math;->max(FF)F

    .line 513
    .line 514
    .line 515
    move-result p1

    .line 516
    const/high16 v7, 0x3f800000    # 1.0f

    .line 517
    .line 518
    cmpg-float v9, p1, v7

    .line 519
    .line 520
    if-gez v9, :cond_f

    .line 521
    .line 522
    goto :goto_e

    .line 523
    :cond_f
    move p1, v7

    .line 524
    :goto_e
    mul-float/2addr v4, p1

    .line 525
    invoke-static {v4}, Lzf/a;->a(F)I

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    rem-int/lit8 v7, v4, 0x2

    .line 530
    .line 531
    if-nez v7, :cond_10

    .line 532
    .line 533
    goto :goto_f

    .line 534
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 535
    .line 536
    :goto_f
    iput v4, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->width:I

    .line 537
    .line 538
    mul-float/2addr p1, v6

    .line 539
    invoke-static {p1}, Lzf/a;->a(F)I

    .line 540
    .line 541
    .line 542
    move-result p1

    .line 543
    rem-int/lit8 v6, p1, 0x2

    .line 544
    .line 545
    if-nez v6, :cond_11

    .line 546
    .line 547
    goto :goto_10

    .line 548
    :cond_11
    add-int/lit8 p1, p1, 0x1

    .line 549
    .line 550
    :goto_10
    iput p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->height:I

    .line 551
    .line 552
    iget v6, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->estimatedVideoBitrate:I

    .line 553
    .line 554
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    int-to-double v5, v5

    .line 559
    const-wide/high16 v9, 0x3fe8000000000000L    # 0.75

    .line 560
    .line 561
    mul-double/2addr v5, v9

    .line 562
    double-to-int v5, v5

    .line 563
    const v6, 0x493e0

    .line 564
    .line 565
    .line 566
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    invoke-virtual {p4}, Lcom/discord/media/utils/VideoCompressionQuality;->getTargetBitrate()I

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    if-le v6, v5, :cond_12

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_12
    invoke-virtual {p4}, Lcom/discord/media/utils/VideoCompressionQuality;->getTargetBitrate()I

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    :goto_11
    iput v5, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->bitRate:I

    .line 582
    .line 583
    rem-int/lit8 p4, v4, 0x2

    .line 584
    .line 585
    if-nez p4, :cond_13

    .line 586
    .line 587
    rem-int/lit8 p4, p1, 0x2

    .line 588
    .line 589
    if-nez p4, :cond_13

    .line 590
    .line 591
    move p2, v3

    .line 592
    :cond_13
    if-eqz p2, :cond_15

    .line 593
    .line 594
    new-instance p2, Landroid/media/MediaFormat;

    .line 595
    .line 596
    invoke-direct {p2}, Landroid/media/MediaFormat;-><init>()V

    .line 597
    .line 598
    .line 599
    const-string p4, "mime"

    .line 600
    .line 601
    const-string v3, "video/avc"

    .line 602
    .line 603
    invoke-virtual {p2, p4, v3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {p2, v2, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {p2, v1, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {p2, v0, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 613
    .line 614
    .line 615
    iget p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->frameRate:I

    .line 616
    .line 617
    invoke-virtual {p2, p3, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 621
    .line 622
    const/16 p3, 0x19

    .line 623
    .line 624
    if-lt p1, p3, :cond_14

    .line 625
    .line 626
    iget p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->iFrameInterval:F

    .line 627
    .line 628
    invoke-virtual {p2, v8, p1}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 629
    .line 630
    .line 631
    goto :goto_12

    .line 632
    :cond_14
    iget p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->iFrameInterval:F

    .line 633
    .line 634
    float-to-int p1, p1

    .line 635
    invoke-virtual {p2, v8, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 636
    .line 637
    .line 638
    :goto_12
    iput-object p2, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->videoFormat:Landroid/media/MediaFormat;

    .line 639
    .line 640
    iget-object p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcAudioFormat:Landroid/media/MediaFormat;

    .line 641
    .line 642
    invoke-direct {p0, p1}, Lcom/discord/media/utils/DiscordVideoMediaSource;->getAudioFormatWithBitrate(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    iput-object p1, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->audioFormat:Landroid/media/MediaFormat;

    .line 647
    .line 648
    return-void

    .line 649
    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 650
    .line 651
    const-string p2, "MediaCodec fails if width/height are not a multiple of the alignment; see MediaCodecInfo.VideoCapabilities.getWidthAlignment()"

    .line 652
    .line 653
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p2

    .line 657
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    throw p1
.end method

.method private final getAVCBitrate(III)I
    .locals 12

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    move v5, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    if-ge v4, v6, :cond_6

    .line 14
    .line 15
    move v8, v3

    .line 16
    :goto_1
    if-ge v8, v0, :cond_5

    .line 17
    .line 18
    aget v9, v1, v8

    .line 19
    .line 20
    invoke-static {v4, v9}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    .line 21
    .line 22
    .line 23
    move-result v10

    .line 24
    if-nez v10, :cond_0

    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_0
    invoke-static {v4, v9}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    iget v10, v9, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 32
    .line 33
    if-ne p1, v10, :cond_1

    .line 34
    .line 35
    iget v11, v9, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 36
    .line 37
    if-ne p2, v11, :cond_1

    .line 38
    .line 39
    move v11, v7

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    move v11, v3

    .line 42
    :goto_2
    if-ne p2, v10, :cond_2

    .line 43
    .line 44
    iget v10, v9, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 45
    .line 46
    if-ne p1, v10, :cond_2

    .line 47
    .line 48
    move v10, v7

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    move v10, v3

    .line 51
    :goto_3
    if-nez v11, :cond_3

    .line 52
    .line 53
    if-eqz v10, :cond_4

    .line 54
    .line 55
    :cond_3
    iget v10, v9, Landroid/media/CamcorderProfile;->videoFrameRate:I

    .line 56
    .line 57
    if-ne p3, v10, :cond_4

    .line 58
    .line 59
    iget v10, v9, Landroid/media/CamcorderProfile;->videoCodec:I

    .line 60
    .line 61
    if-ne v10, v6, :cond_4

    .line 62
    .line 63
    iget v6, v9, Landroid/media/CamcorderProfile;->videoBitRate:I

    .line 64
    .line 65
    if-ge v5, v6, :cond_5

    .line 66
    .line 67
    move v5, v6

    .line 68
    goto :goto_5

    .line 69
    :cond_4
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eq v1, v2, :cond_7

    .line 84
    .line 85
    move v3, v7

    .line 86
    :cond_7
    if-eqz v3, :cond_8

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_8
    const/4 v0, 0x0

    .line 90
    :goto_6
    if-eqz v0, :cond_9

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    goto :goto_7

    .line 97
    :cond_9
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/media/utils/DiscordVideoMediaSource;->getDefaultBitrate(III)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    :goto_7
    return p1

    .line 102
    nop

    .line 103
    :array_0
    .array-data 4
        0x8
        0x6
        0x5
        0x4
        0x0
    .end array-data
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
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
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
.end method

.method private final getAudioFormatWithBitrate(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 4

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const-string v0, "bitrate"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v2, 0x1d

    .line 15
    .line 16
    const v3, 0x3e800

    .line 17
    .line 18
    .line 19
    if-lt v1, v2, :cond_1

    .line 20
    .line 21
    new-instance v1, Landroid/media/MediaFormat;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Landroid/media/MediaFormat;-><init>(Landroid/media/MediaFormat;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    move-object p1, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p1, v0, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-object p1

    .line 35
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 36
    return-object p1
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
.end method

.method private final getDefaultBitrate(III)I
    .locals 2

    mul-int/2addr p1, p2

    mul-int/2addr p1, p3

    int-to-double p1, p1

    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    mul-double/2addr p1, v0

    double-to-int p1, p1

    return p1
.end method


# virtual methods
.method public final getAudioFormat()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->audioFormat:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public final getInputUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->inputUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getOutputUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->outputUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getVideoFormat()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->videoFormat:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public final isHevc()Z
    .locals 3

    iget-object v0, p0, Lcom/discord/media/utils/DiscordVideoMediaSource;->srcVideoFormat:Landroid/media/MediaFormat;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/discord/media/utils/MediaFormatUtilsKt;->isHevcVideo(Landroid/media/MediaFormat;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method
