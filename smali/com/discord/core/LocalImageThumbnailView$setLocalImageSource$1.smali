.class final Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/core/LocalImageThumbnailView;->setLocalImageSource(Landroid/net/Uri;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1"
    f = "LocalImageThumbnailView.kt"
    l = {
        0x52,
        0x65
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $heightDp:I

.field final synthetic $uri:Landroid/net/Uri;

.field final synthetic $widthDp:I

.field label:I

.field final synthetic this$0:Lcom/discord/core/LocalImageThumbnailView;


# direct methods
.method constructor <init>(IILcom/discord/core/LocalImageThumbnailView;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/discord/core/LocalImageThumbnailView;",
            "Landroid/net/Uri;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$widthDp:I

    iput p2, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$heightDp:I

    iput-object p3, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->this$0:Lcom/discord/core/LocalImageThumbnailView;

    iput-object p4, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$uri:Landroid/net/Uri;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;

    iget v1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$widthDp:I

    iget v2, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$heightDp:I

    iget-object v3, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->this$0:Lcom/discord/core/LocalImageThumbnailView;

    iget-object v4, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$uri:Landroid/net/Uri;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;-><init>(IILcom/discord/core/LocalImageThumbnailView;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_8

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :try_start_0
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_8

    .line 34
    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :cond_2
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget p1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$widthDp:I

    .line 42
    .line 43
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget v1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$heightDp:I

    .line 48
    .line 49
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    if-nez v1, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    new-instance v6, Landroid/util/Size;

    .line 59
    .line 60
    invoke-direct {v6, p1, v1}, Landroid/util/Size;-><init>(II)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    :goto_0
    new-instance v6, Landroid/util/Size;

    .line 65
    .line 66
    const/16 p1, 0xc8

    .line 67
    .line 68
    invoke-direct {v6, p1, p1}, Landroid/util/Size;-><init>(II)V

    .line 69
    .line 70
    .line 71
    :goto_1
    :try_start_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v1, 0x1d

    .line 74
    .line 75
    if-lt p1, v1, :cond_5

    .line 76
    .line 77
    iget-object p1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->this$0:Lcom/discord/core/LocalImageThumbnailView;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object v1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$uri:Landroid/net/Uri;

    .line 88
    .line 89
    invoke-static {p1, v1, v6, v2}, Lcom/discord/core/a;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_2
    move-object v10, p1

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    iget-object p1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->this$0:Lcom/discord/core/LocalImageThumbnailView;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object v1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$uri:Landroid/net/Uri;

    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    invoke-static {p1, v6, v7, v5, v2}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    goto :goto_2

    .line 123
    :goto_3
    if-eqz v10, :cond_6

    .line 124
    .line 125
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    goto :goto_4

    .line 130
    :cond_6
    move p1, v4

    .line 131
    :goto_4
    if-nez p1, :cond_7

    .line 132
    .line 133
    move p1, v5

    .line 134
    goto :goto_5

    .line 135
    :cond_7
    move p1, v4

    .line 136
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    new-instance v12, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1$1;

    .line 141
    .line 142
    iget-object v7, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->this$0:Lcom/discord/core/LocalImageThumbnailView;

    .line 143
    .line 144
    if-eqz p1, :cond_8

    .line 145
    .line 146
    move v8, v5

    .line 147
    goto :goto_6

    .line 148
    :cond_8
    move v8, v4

    .line 149
    :goto_6
    iget-object v9, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$uri:Landroid/net/Uri;

    .line 150
    .line 151
    const/4 v11, 0x0

    .line 152
    move-object v6, v12

    .line 153
    invoke-direct/range {v6 .. v11}, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1$1;-><init>(Lcom/discord/core/LocalImageThumbnailView;ZLandroid/net/Uri;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    .line 154
    .line 155
    .line 156
    iput v5, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->label:I

    .line 157
    .line 158
    invoke-static {v1, v12, p0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 162
    if-ne p1, v0, :cond_9

    .line 163
    .line 164
    return-object v0

    .line 165
    :goto_7
    sget-object v6, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 166
    .line 167
    const-string v7, "DCDLocalImageThumbnail - Failed to load thumbnail"

    .line 168
    .line 169
    new-array v1, v3, [Lkotlin/Pair;

    .line 170
    .line 171
    const-string v8, "exception"

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {v8, p1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    aput-object p1, v1, v4

    .line 182
    .line 183
    iget-object p1, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$uri:Landroid/net/Uri;

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string v4, "url"

    .line 190
    .line 191
    invoke-static {v4, p1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    aput-object p1, v1, v5

    .line 196
    .line 197
    invoke-static {v1}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    const/4 v9, 0x0

    .line 202
    const/4 v10, 0x4

    .line 203
    const/4 v11, 0x0

    .line 204
    invoke-static/range {v6 .. v11}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    new-instance v1, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1$2;

    .line 212
    .line 213
    iget-object v4, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->this$0:Lcom/discord/core/LocalImageThumbnailView;

    .line 214
    .line 215
    iget-object v5, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->$uri:Landroid/net/Uri;

    .line 216
    .line 217
    invoke-direct {v1, v4, v5, v2}, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1$2;-><init>(Lcom/discord/core/LocalImageThumbnailView;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    .line 218
    .line 219
    .line 220
    iput v3, p0, Lcom/discord/core/LocalImageThumbnailView$setLocalImageSource$1;->label:I

    .line 221
    .line 222
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-ne p1, v0, :cond_9

    .line 227
    .line 228
    return-object v0

    .line 229
    :cond_9
    :goto_8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p1
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
.end method
