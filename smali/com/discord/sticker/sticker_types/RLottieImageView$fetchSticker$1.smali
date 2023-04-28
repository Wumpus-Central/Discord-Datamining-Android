.class final Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/sticker/sticker_types/RLottieImageView;->fetchSticker(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V
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
    c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1"
    f = "RLottieImageView.kt"
    l = {
        0x49,
        0x52
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

.field label:I

.field final synthetic this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;


# direct methods
.method constructor <init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/sticker/sticker_types/RLottieImageView;",
            "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    iput-object p2, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->$config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;

    iget-object v0, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    iget-object v1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->$config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    invoke-direct {p1, v0, v1, p2}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v1, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$1;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-direct {v1, v4, v5}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$1;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lkotlin/coroutines/Continuation;)V

    .line 45
    .line 46
    .line 47
    iput v3, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->label:I

    .line 48
    .line 49
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_3
    :goto_0
    sget-object v3, Lcom/discord/file_downloader/FileDownloader;->INSTANCE:Lcom/discord/file_downloader/FileDownloader;

    .line 57
    .line 58
    iget-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-string p1, "context"

    .line 65
    .line 66
    invoke-static {v4, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->$config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/discord/sticker/sticker_types/RLottieImageView$Config;->getUrl()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    iget-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->$config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/discord/sticker/sticker_types/RLottieImageView$Config;->getAsset()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, ".json"

    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    new-instance v7, Ljava/io/File;

    .line 99
    .line 100
    iget-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string v1, "stickers"

    .line 111
    .line 112
    invoke-direct {v7, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const/4 v8, 0x0

    .line 116
    const/16 v9, 0x10

    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    invoke-static/range {v3 .. v10}, Lcom/discord/file_downloader/FileDownloader;->downloadFile$default(Lcom/discord/file_downloader/FileDownloader;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;ZILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v1, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;

    .line 124
    .line 125
    iget-object v3, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    .line 126
    .line 127
    iget-object v4, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->$config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    .line 128
    .line 129
    invoke-direct {v1, v3, v4}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V

    .line 130
    .line 131
    .line 132
    iput v2, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->label:I

    .line 133
    .line 134
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_4

    .line 139
    .line 140
    return-object v0

    .line 141
    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p1
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
