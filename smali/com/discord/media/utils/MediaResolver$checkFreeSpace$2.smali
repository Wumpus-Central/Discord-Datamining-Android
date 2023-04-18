.class final Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/utils/MediaResolver;->checkFreeSpace(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.discord.media.utils.MediaResolver$checkFreeSpace$2"
    f = "MediaResolver.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/discord/media/utils/MediaResolver;


# direct methods
.method constructor <init>(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/media/utils/MediaResolver;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;

    iget-object v0, p0, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    invoke-direct {p1, v0, p2}, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;-><init>(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/discord/media/utils/MediaResolver;->access$getCacheDir$p(Lcom/discord/media/utils/MediaResolver;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/io/File;->getUsableSpace()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    long-to-double v0, v0

    .line 22
    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/discord/media/utils/MediaResolver;->access$getCacheDir$p(Lcom/discord/media/utils/MediaResolver;)Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/io/File;->getTotalSpace()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    long-to-double v2, v2

    .line 33
    div-double/2addr v0, v2

    .line 34
    const-wide v2, 0x3fc999999999999aL    # 0.2

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    cmpg-double p1, v0, v2

    .line 40
    .line 41
    if-gez p1, :cond_3

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-static {}, Lcom/discord/media/utils/MediaResolver;->access$getCompanion$p()Lcom/discord/media/utils/MediaResolver$Companion;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/discord/media/utils/MediaResolver$Companion;->getHALF_DAY_MILLIS()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    sub-long/2addr v0, v2

    .line 56
    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$checkFreeSpace$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/discord/media/utils/MediaResolver;->access$getCacheDir$p(Lcom/discord/media/utils/MediaResolver;)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    array-length v2, p1

    .line 69
    const/4 v3, 0x0

    .line 70
    move v4, v3

    .line 71
    :goto_0
    if-ge v4, v2, :cond_3

    .line 72
    .line 73
    aget-object v5, p1, v4

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_0

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const-string v7, "cacheItem.name"

    .line 86
    .line 87
    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 v7, 0x2

    .line 91
    const/4 v8, 0x0

    .line 92
    const-string v9, "temp_"

    .line 93
    .line 94
    invoke-static {v6, v9, v3, v7, v8}, Lpi/l;->H(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_0

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    .line 101
    .line 102
    .line 103
    move-result-wide v6

    .line 104
    cmp-long v6, v6, v0

    .line 105
    .line 106
    if-gez v6, :cond_0

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_2

    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    const-string v7, "compressor"

    .line 123
    .line 124
    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_2

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    if-eqz v5, :cond_2

    .line 135
    .line 136
    const-string v6, "listFiles()"

    .line 137
    .line 138
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    array-length v6, v5

    .line 142
    move v7, v3

    .line 143
    :goto_1
    if-ge v7, v6, :cond_2

    .line 144
    .line 145
    aget-object v8, v5, v7

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_1

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    .line 154
    .line 155
    .line 156
    move-result-wide v9

    .line 157
    cmp-long v9, v9, v0

    .line 158
    .line 159
    if-gez v9, :cond_1

    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 162
    .line 163
    .line 164
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p1

    .line 173
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 174
    .line 175
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 176
    .line 177
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1
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
.end method
