.class public final Lcom/discord/media/utils/MediaResolver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media/utils/MediaResolver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 22\u00020\u0001:\u00012B)\u0012\u0006\u0010!\u001a\u00020 \u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020#\u00a2\u0006\u0004\u00080\u00101J\u0013\u0010\u0003\u001a\u00020\u0002H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J(\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J5\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u001c\u0010\'\u001a\n &*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0018\u0010/\u001a\u00020\u0015*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00063"
    }
    d2 = {
        "Lcom/discord/media/utils/MediaResolver;",
        "",
        "",
        "checkFreeSpace",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "inputUri",
        "Lcom/discord/media/utils/VideoCompressionQuality;",
        "compressionQuality",
        "handleVideo",
        "(Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "",
        "isLowQuality",
        "handleImage",
        "(Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "uri",
        "Ljava/io/File;",
        "targetFile",
        "copyToFile",
        "(Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "tag",
        "message",
        "outputUri",
        "logMediaError",
        "getMimeType",
        "cancel",
        "imageCompressionQuality",
        "videoCompressionQuality",
        "resolveToUri",
        "(Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Lkotlin/Function2;",
        "onProgress",
        "Lkotlin/jvm/functions/Function2;",
        "kotlin.jvm.PlatformType",
        "cacheDir",
        "Ljava/io/File;",
        "Landroid/content/ContentResolver;",
        "getResolver",
        "()Landroid/content/ContentResolver;",
        "resolver",
        "getRequestId",
        "(Landroid/net/Uri;)Ljava/lang/String;",
        "requestId",
        "<init>",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V",
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
.field private static final Companion:Lcom/discord/media/utils/MediaResolver$Companion;

.field public static final FREE_SPACE_PERCENT:D = 0.2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final HALF_DAY_MILLIS:J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final cacheDir:Ljava/io/File;

.field private final context:Landroid/content/Context;

.field private final onProgress:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/net/Uri;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/media/utils/MediaResolver$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/media/utils/MediaResolver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/media/utils/MediaResolver;->Companion:Lcom/discord/media/utils/MediaResolver$Companion;

    .line 8
    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v1, 0xc

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lcom/discord/media/utils/MediaResolver;->HALF_DAY_MILLIS:J

    .line 18
    .line 19
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/net/Uri;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onProgress"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/discord/media/utils/MediaResolver;->context:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/discord/media/utils/MediaResolver;->onProgress:Lkotlin/jvm/functions/Function2;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/discord/media/utils/MediaResolver;->cacheDir:Ljava/io/File;

    .line 23
    .line 24
    return-void
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
.end method

.method public static final synthetic access$checkFreeSpace(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/media/utils/MediaResolver;->checkFreeSpace(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$copyToFile(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/discord/media/utils/MediaResolver;->copyToFile(Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCacheDir$p(Lcom/discord/media/utils/MediaResolver;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/discord/media/utils/MediaResolver;->cacheDir:Ljava/io/File;

    return-object p0
.end method

.method public static final synthetic access$getCompanion$p()Lcom/discord/media/utils/MediaResolver$Companion;
    .locals 1

    sget-object v0, Lcom/discord/media/utils/MediaResolver;->Companion:Lcom/discord/media/utils/MediaResolver$Companion;

    return-object v0
.end method

.method public static final synthetic access$getHALF_DAY_MILLIS$cp()J
    .locals 2

    sget-wide v0, Lcom/discord/media/utils/MediaResolver;->HALF_DAY_MILLIS:J

    return-wide v0
.end method

.method public static final synthetic access$getOnProgress$p(Lcom/discord/media/utils/MediaResolver;)Lkotlin/jvm/functions/Function2;
    .locals 0

    iget-object p0, p0, Lcom/discord/media/utils/MediaResolver;->onProgress:Lkotlin/jvm/functions/Function2;

    return-object p0
.end method

.method public static final synthetic access$getResolver(Lcom/discord/media/utils/MediaResolver;)Landroid/content/ContentResolver;
    .locals 0

    invoke-direct {p0}, Lcom/discord/media/utils/MediaResolver;->getResolver()Landroid/content/ContentResolver;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleImage(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/discord/media/utils/MediaResolver;->handleImage(Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleVideo(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/discord/media/utils/MediaResolver;->handleVideo(Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final checkFreeSpace(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UsableSpace"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    new-instance v1, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;-><init>(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method private final copyToFile(Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/io/File;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    new-instance v1, Lcom/discord/media/utils/MediaResolver$copyToFile$2;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Lcom/discord/media/utils/MediaResolver$copyToFile$2;-><init>(Ljava/io/File;Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method static synthetic copyToFile$default(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/media/utils/MediaResolver;->copyToFile(Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getRequestId(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getResolver()Landroid/content/ContentResolver;
    .locals 2

    iget-object v0, p0, Lcom/discord/media/utils/MediaResolver;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "context.contentResolver"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final handleImage(Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "IZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lcom/discord/media/utils/MediaResolver$handleImage$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/discord/media/utils/MediaResolver$handleImage$1;-><init>(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    iget v1, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->label:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v3, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    invoke-static {p4}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    iget-object p1, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Landroid/net/Uri;

    .line 57
    .line 58
    iget-object p2, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, Lcom/discord/media/utils/MediaResolver;

    .line 61
    .line 62
    invoke-static {p4}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    invoke-static {p4}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/discord/media/utils/MediaResolver;->getResolver()Landroid/content/ContentResolver;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    sget-object v1, Lcom/discord/media/utils/ContentResolverUtils;->INSTANCE:Lcom/discord/media/utils/ContentResolverUtils;

    .line 74
    .line 75
    invoke-virtual {v1, p4, p1}, Lcom/discord/media/utils/ContentResolverUtils;->isHeif(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    const/4 v5, 0x0

    .line 80
    if-nez v4, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1, p4, p1}, Lcom/discord/media/utils/ContentResolverUtils;->isJpeg(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_5

    .line 87
    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    invoke-virtual {v1, p4, p1}, Lcom/discord/media/utils/ContentResolverUtils;->isPng(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    if-eqz p4, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    move p4, v5

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    :goto_1
    move p4, v3

    .line 100
    :goto_2
    if-eqz p4, :cond_6

    .line 101
    .line 102
    if-eqz p3, :cond_6

    .line 103
    .line 104
    move v5, v3

    .line 105
    :cond_6
    if-eqz p4, :cond_8

    .line 106
    .line 107
    sget-object v1, Llf/a;->a:Llf/a;

    .line 108
    .line 109
    iget-object v2, p0, Lcom/discord/media/utils/MediaResolver;->context:Landroid/content/Context;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    new-instance p3, Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;

    .line 113
    .line 114
    invoke-direct {p3, p2, v5}, Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;-><init>(IZ)V

    .line 115
    .line 116
    .line 117
    const/4 v7, 0x4

    .line 118
    const/4 v8, 0x0

    .line 119
    iput-object p0, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object p1, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    iput v3, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->label:I

    .line 124
    .line 125
    move-object v3, p1

    .line 126
    move-object v5, p3

    .line 127
    move-object v6, v0

    .line 128
    invoke-static/range {v1 .. v8}, Llf/a;->b(Llf/a;Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    if-ne p4, v9, :cond_7

    .line 133
    .line 134
    return-object v9

    .line 135
    :cond_7
    move-object p2, p0

    .line 136
    :goto_3
    check-cast p4, Ljava/io/File;

    .line 137
    .line 138
    iget-object p2, p2, Lcom/discord/media/utils/MediaResolver;->onProgress:Lkotlin/jvm/functions/Function2;

    .line 139
    .line 140
    const/16 p3, 0x64

    .line 141
    .line 142
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    invoke-interface {p2, p1, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-static {p4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-string p2, "fromFile(this)"

    .line 154
    .line 155
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_8
    const/4 v3, 0x0

    .line 160
    const/4 v5, 0x2

    .line 161
    const/4 v6, 0x0

    .line 162
    iput v2, v0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->label:I

    .line 163
    .line 164
    move-object v1, p0

    .line 165
    move-object v2, p1

    .line 166
    move-object v4, v0

    .line 167
    invoke-static/range {v1 .. v6}, Lcom/discord/media/utils/MediaResolver;->copyToFile$default(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p4

    .line 171
    if-ne p4, v9, :cond_9

    .line 172
    .line 173
    return-object v9

    .line 174
    :cond_9
    :goto_4
    return-object p4
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
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
.end method

.method private final handleVideo(Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lcom/discord/media/utils/VideoCompressionQuality;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    instance-of v1, v0, Lcom/discord/media/utils/MediaResolver$handleVideo$1;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lcom/discord/media/utils/MediaResolver$handleVideo$1;

    .line 13
    .line 14
    iget v3, v1, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->label:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v1, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, Lcom/discord/media/utils/MediaResolver$handleVideo$1;

    .line 27
    .line 28
    invoke-direct {v1, v7, v0}, Lcom/discord/media/utils/MediaResolver$handleVideo$1;-><init>(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    move-object v4, v1

    .line 32
    iget-object v0, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v15

    .line 38
    iget v1, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->label:I

    .line 39
    .line 40
    const-string v3, "["

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    const/4 v6, 0x3

    .line 44
    const/4 v14, 0x2

    .line 45
    const/4 v13, 0x1

    .line 46
    const/4 v12, 0x0

    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    if-eq v1, v13, :cond_4

    .line 50
    .line 51
    if-eq v1, v14, :cond_3

    .line 52
    .line 53
    if-eq v1, v6, :cond_2

    .line 54
    .line 55
    if-ne v1, v5, :cond_1

    .line 56
    .line 57
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_9

    .line 61
    .line 62
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_3
    iget-object v1, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$2:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Landroid/net/Uri;

    .line 78
    .line 79
    iget-object v2, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Landroid/net/Uri;

    .line 82
    .line 83
    iget-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Lcom/discord/media/utils/MediaResolver;

    .line 86
    .line 87
    :try_start_0
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object v9, v2

    .line 94
    move-object v8, v5

    .line 95
    move-object v5, v12

    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_4
    iget-object v1, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$4:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lcom/discord/media/utils/MediaResolver;

    .line 101
    .line 102
    iget-object v2, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$3:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Lcom/discord/media/utils/DiscordVideoMediaSource;

    .line 105
    .line 106
    iget-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$2:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v5, Landroid/net/Uri;

    .line 109
    .line 110
    iget-object v8, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v8, Landroid/net/Uri;

    .line 113
    .line 114
    iget-object v9, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v9, Lcom/discord/media/utils/MediaResolver;

    .line 117
    .line 118
    :try_start_1
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    .line 120
    .line 121
    move-object v6, v2

    .line 122
    move-object v2, v8

    .line 123
    move-object v13, v9

    .line 124
    move-object v8, v1

    .line 125
    move v1, v14

    .line 126
    move-object v14, v5

    .line 127
    move-object v5, v12

    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :catchall_1
    move-exception v0

    .line 131
    move-object v1, v5

    .line 132
    move-object v5, v12

    .line 133
    move-object/from16 v17, v9

    .line 134
    .line 135
    move-object v9, v8

    .line 136
    move-object/from16 v8, v17

    .line 137
    .line 138
    goto/16 :goto_6

    .line 139
    .line 140
    :cond_5
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object v8, Lcom/discord/media/utils/ContentResolverUtils;->INSTANCE:Lcom/discord/media/utils/ContentResolverUtils;

    .line 144
    .line 145
    invoke-direct/range {p0 .. p0}, Lcom/discord/media/utils/MediaResolver;->getResolver()Landroid/content/ContentResolver;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    const/4 v11, 0x0

    .line 150
    const-string v0, "mp4"

    .line 151
    .line 152
    const/4 v1, 0x2

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    move-object/from16 v10, p1

    .line 156
    .line 157
    move-object v5, v12

    .line 158
    move-object v12, v0

    .line 159
    move v6, v13

    .line 160
    move v13, v1

    .line 161
    move v1, v14

    .line 162
    move-object/from16 v14, v16

    .line 163
    .line 164
    invoke-static/range {v8 .. v14}, Lcom/discord/media/utils/ContentResolverUtils;->createTempFile$default(Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    const-string v0, "fromFile(this)"

    .line 173
    .line 174
    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :try_start_2
    sget-object v0, Lnf/s;->l:Lnf/s$a;

    .line 178
    .line 179
    new-instance v0, Lcom/discord/media/utils/DiscordVideoMediaSource;

    .line 180
    .line 181
    iget-object v8, v7, Lcom/discord/media/utils/MediaResolver;->context:Landroid/content/Context;

    .line 182
    .line 183
    move-object/from16 v9, p2

    .line 184
    .line 185
    invoke-direct {v0, v8, v2, v14, v9}, Lcom/discord/media/utils/DiscordVideoMediaSource;-><init>(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 192
    goto :goto_1

    .line 193
    :catchall_2
    move-exception v0

    .line 194
    sget-object v8, Lnf/s;->l:Lnf/s$a;

    .line 195
    .line 196
    invoke-static {v0}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_1
    move-object v12, v0

    .line 205
    invoke-static {v12}, Lnf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-eqz v0, :cond_6

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    new-instance v9, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v0, "] Error creating source: "

    .line 227
    .line 228
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v8, "Media source error"

    .line 239
    .line 240
    invoke-direct {v7, v8, v0, v2, v14}, Lcom/discord/media/utils/MediaResolver;->logMediaError(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V

    .line 241
    .line 242
    .line 243
    :cond_6
    invoke-static {v12}, Lnf/s;->g(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_7

    .line 248
    .line 249
    move-object v12, v5

    .line 250
    :cond_7
    move-object v0, v12

    .line 251
    check-cast v0, Lcom/discord/media/utils/DiscordVideoMediaSource;

    .line 252
    .line 253
    if-eqz v0, :cond_e

    .line 254
    .line 255
    :try_start_3
    sget-object v8, Lcom/discord/media/utils/Transcoder;->INSTANCE:Lcom/discord/media/utils/Transcoder;

    .line 256
    .line 257
    invoke-direct/range {p0 .. p1}, Lcom/discord/media/utils/MediaResolver;->getRequestId(Landroid/net/Uri;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    iget-object v10, v7, Lcom/discord/media/utils/MediaResolver;->context:Landroid/content/Context;

    .line 262
    .line 263
    new-instance v12, Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;

    .line 264
    .line 265
    invoke-direct {v12, v7, v2}, Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;-><init>(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V

    .line 266
    .line 267
    .line 268
    iput-object v7, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$0:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v2, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$1:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object v14, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$2:Ljava/lang/Object;

    .line 273
    .line 274
    iput-object v0, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$3:Ljava/lang/Object;

    .line 275
    .line 276
    iput-object v7, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$4:Ljava/lang/Object;

    .line 277
    .line 278
    iput v6, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->label:I

    .line 279
    .line 280
    move-object v11, v0

    .line 281
    move-object v13, v4

    .line 282
    invoke-virtual/range {v8 .. v13}, Lcom/discord/media/utils/Transcoder;->convertCompress(Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 286
    if-ne v6, v15, :cond_8

    .line 287
    .line 288
    return-object v15

    .line 289
    :cond_8
    move-object v8, v7

    .line 290
    move-object v13, v8

    .line 291
    move-object/from16 v17, v6

    .line 292
    .line 293
    move-object v6, v0

    .line 294
    move-object/from16 v0, v17

    .line 295
    .line 296
    :goto_2
    :try_start_4
    check-cast v0, Landroid/net/Uri;

    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    if-eqz v9, :cond_a

    .line 303
    .line 304
    new-instance v10, Ljava/io/File;

    .line 305
    .line 306
    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v10}, Ljava/io/File;->length()J

    .line 310
    .line 311
    .line 312
    move-result-wide v9

    .line 313
    invoke-virtual {v6}, Loe/a;->getSize()J

    .line 314
    .line 315
    .line 316
    move-result-wide v11

    .line 317
    cmp-long v6, v9, v11

    .line 318
    .line 319
    if-lez v6, :cond_a

    .line 320
    .line 321
    const/4 v10, 0x0

    .line 322
    const/4 v12, 0x2

    .line 323
    const/4 v0, 0x0

    .line 324
    iput-object v13, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$0:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v2, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$1:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v14, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$2:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$3:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$4:Ljava/lang/Object;

    .line 333
    .line 334
    iput v1, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->label:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 335
    .line 336
    move-object v9, v2

    .line 337
    move-object v11, v4

    .line 338
    move-object v1, v13

    .line 339
    move-object v13, v0

    .line 340
    :try_start_5
    invoke-static/range {v8 .. v13}, Lcom/discord/media/utils/MediaResolver;->copyToFile$default(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 344
    if-ne v0, v15, :cond_9

    .line 345
    .line 346
    return-object v15

    .line 347
    :cond_9
    :goto_3
    return-object v0

    .line 348
    :catchall_3
    move-exception v0

    .line 349
    goto :goto_4

    .line 350
    :cond_a
    return-object v0

    .line 351
    :catchall_4
    move-exception v0

    .line 352
    move-object v1, v13

    .line 353
    :goto_4
    move-object v8, v1

    .line 354
    move-object v9, v2

    .line 355
    :goto_5
    move-object v1, v14

    .line 356
    goto :goto_6

    .line 357
    :catchall_5
    move-exception v0

    .line 358
    move-object v9, v2

    .line 359
    move-object v8, v7

    .line 360
    goto :goto_5

    .line 361
    :goto_6
    sget-object v2, Lnf/s;->l:Lnf/s$a;

    .line 362
    .line 363
    invoke-static {v0}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v0}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-static {v0}, Lnf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    if-nez v2, :cond_b

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_b
    instance-of v0, v2, Ljava/util/concurrent/CancellationException;

    .line 379
    .line 380
    if-nez v0, :cond_d

    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    new-instance v6, Ljava/lang/StringBuilder;

    .line 387
    .line 388
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    const-string v2, "] Error compressing/converting video: "

    .line 398
    .line 399
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    const-string v2, "Media conversion error"

    .line 410
    .line 411
    invoke-direct {v8, v2, v0, v9, v1}, Lcom/discord/media/utils/MediaResolver;->logMediaError(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V

    .line 412
    .line 413
    .line 414
    const/4 v10, 0x0

    .line 415
    const/4 v12, 0x2

    .line 416
    const/4 v13, 0x0

    .line 417
    iput-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$0:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$1:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$2:Ljava/lang/Object;

    .line 422
    .line 423
    iput-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$3:Ljava/lang/Object;

    .line 424
    .line 425
    iput-object v5, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->L$4:Ljava/lang/Object;

    .line 426
    .line 427
    const/4 v1, 0x3

    .line 428
    iput v1, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->label:I

    .line 429
    .line 430
    move-object v11, v4

    .line 431
    invoke-static/range {v8 .. v13}, Lcom/discord/media/utils/MediaResolver;->copyToFile$default(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    if-ne v0, v15, :cond_c

    .line 436
    .line 437
    return-object v15

    .line 438
    :cond_c
    :goto_7
    check-cast v0, Landroid/net/Uri;

    .line 439
    .line 440
    :goto_8
    check-cast v0, Landroid/net/Uri;

    .line 441
    .line 442
    return-object v0

    .line 443
    :cond_d
    throw v2

    .line 444
    :cond_e
    const/4 v3, 0x0

    .line 445
    const/4 v5, 0x2

    .line 446
    const/4 v6, 0x0

    .line 447
    const/4 v1, 0x4

    .line 448
    iput v1, v4, Lcom/discord/media/utils/MediaResolver$handleVideo$1;->label:I

    .line 449
    .line 450
    move-object/from16 v1, p0

    .line 451
    .line 452
    move-object/from16 v2, p1

    .line 453
    .line 454
    invoke-static/range {v1 .. v6}, Lcom/discord/media/utils/MediaResolver;->copyToFile$default(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    if-ne v0, v15, :cond_f

    .line 459
    .line 460
    return-object v15

    .line 461
    :cond_f
    :goto_9
    return-object v0
.end method

.method private final logMediaError(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 7

    .line 1
    sget-object v6, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [Lkotlin/Pair;

    .line 5
    .line 6
    const-string v1, "inputUri"

    .line 7
    .line 8
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-static {v1, p3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    const/4 v1, 0x0

    .line 17
    aput-object p3, v0, v1

    .line 18
    .line 19
    const-string p3, "outputUri"

    .line 20
    .line 21
    invoke-virtual {p4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    invoke-static {p3, p4}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    const/4 p4, 0x1

    .line 30
    aput-object p3, v0, p4

    .line 31
    .line 32
    invoke-static {v0}, Lof/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x4

    .line 38
    const/4 v5, 0x0

    .line 39
    move-object v0, v6

    .line 40
    move-object v1, p2

    .line 41
    invoke-static/range {v0 .. v5}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object p3, Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;->WARNING:Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;

    .line 45
    .line 46
    invoke-virtual {v6, p1, p2, p3}, Lcom/discord/crash_reporting/CrashReporting;->captureMessage(Ljava/lang/String;Ljava/lang/String;Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;)V

    .line 47
    .line 48
    .line 49
    return-void
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
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
.end method


# virtual methods
.method public final cancel(Landroid/net/Uri;)V
    .locals 1

    .line 1
    const-string v0, "inputUri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/discord/media/utils/Transcoder;->INSTANCE:Lcom/discord/media/utils/Transcoder;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/discord/media/utils/MediaResolver;->getRequestId(Landroid/net/Uri;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lcom/discord/media/utils/Transcoder;->cancel(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public final getMimeType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/media/utils/MediaResolver;->getResolver()Landroid/content/ContentResolver;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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
.end method

.method public final resolveToUri(Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "I",
            "Lcom/discord/media/utils/VideoCompressionQuality;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    new-instance v8, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move v5, p2

    move v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;-><init>(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;IZLkotlin/coroutines/Continuation;)V

    invoke-static {v0, v8, p5}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
