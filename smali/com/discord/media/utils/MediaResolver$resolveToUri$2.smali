.class final Lcom/discord/media/utils/MediaResolver$resolveToUri$2;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/utils/MediaResolver;->resolveToUri(Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Landroid/net/Uri;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "Landroid/net/Uri;",
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
    c = "com.discord.media.utils.MediaResolver$resolveToUri$2"
    f = "MediaResolver.kt"
    l = {
        0x39,
        0x3c,
        0x3d,
        0x3e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $imageCompressionQuality:I

.field final synthetic $inputUri:Landroid/net/Uri;

.field final synthetic $isLowQuality:Z

.field final synthetic $videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

.field label:I

.field final synthetic this$0:Lcom/discord/media/utils/MediaResolver;


# direct methods
.method constructor <init>(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;IZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/media/utils/MediaResolver;",
            "Landroid/net/Uri;",
            "Lcom/discord/media/utils/VideoCompressionQuality;",
            "IZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/media/utils/MediaResolver$resolveToUri$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    iput-object p2, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$inputUri:Landroid/net/Uri;

    iput-object p3, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

    iput p4, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$imageCompressionQuality:I

    iput-boolean p5, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$isLowQuality:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance p1, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;

    iget-object v1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    iget-object v2, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$inputUri:Landroid/net/Uri;

    iget-object v3, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

    iget v4, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$imageCompressionQuality:I

    iget-boolean v5, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$isLowQuality:Z

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;-><init>(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;IZLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    if-eq v1, v5, :cond_3

    .line 14
    .line 15
    if-eq v1, v4, :cond_2

    .line 16
    .line 17
    if-eq v1, v3, :cond_1

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 50
    .line 51
    iput v5, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->label:I

    .line 52
    .line 53
    invoke-static {p1, p0}, Lcom/discord/media/utils/MediaResolver;->access$checkFreeSpace(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_5

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_5
    :goto_0
    sget-object p1, Lcom/discord/media/utils/ContentResolverUtils;->INSTANCE:Lcom/discord/media/utils/ContentResolverUtils;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 63
    .line 64
    invoke-static {v1}, Lcom/discord/media/utils/MediaResolver;->access$getResolver(Lcom/discord/media/utils/MediaResolver;)Landroid/content/ContentResolver;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v5, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$inputUri:Landroid/net/Uri;

    .line 69
    .line 70
    invoke-virtual {p1, v1, v5}, Lcom/discord/media/utils/ContentResolverUtils;->isVideo(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_7

    .line 75
    .line 76
    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$inputUri:Landroid/net/Uri;

    .line 79
    .line 80
    iget-object v2, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 81
    .line 82
    iput v4, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->label:I

    .line 83
    .line 84
    invoke-static {p1, v1, v2, p0}, Lcom/discord/media/utils/MediaResolver;->access$handleVideo(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_6

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_6
    :goto_1
    check-cast p1, Landroid/net/Uri;

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_7
    iget-object v1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 95
    .line 96
    invoke-static {v1}, Lcom/discord/media/utils/MediaResolver;->access$getResolver(Lcom/discord/media/utils/MediaResolver;)Landroid/content/ContentResolver;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v4, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$inputUri:Landroid/net/Uri;

    .line 101
    .line 102
    invoke-virtual {p1, v1, v4}, Lcom/discord/media/utils/ContentResolverUtils;->isImage(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 109
    .line 110
    iget-object v1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$inputUri:Landroid/net/Uri;

    .line 111
    .line 112
    iget v2, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$imageCompressionQuality:I

    .line 113
    .line 114
    iget-boolean v4, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$isLowQuality:Z

    .line 115
    .line 116
    iput v3, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->label:I

    .line 117
    .line 118
    invoke-static {p1, v1, v2, v4, p0}, Lcom/discord/media/utils/MediaResolver;->access$handleImage(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v0, :cond_8

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_8
    :goto_2
    check-cast p1, Landroid/net/Uri;

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_9
    iget-object v1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->this$0:Lcom/discord/media/utils/MediaResolver;

    .line 129
    .line 130
    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->$inputUri:Landroid/net/Uri;

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    const/4 v5, 0x2

    .line 134
    const/4 v6, 0x0

    .line 135
    iput v2, p0, Lcom/discord/media/utils/MediaResolver$resolveToUri$2;->label:I

    .line 136
    .line 137
    move-object v2, p1

    .line 138
    move-object v4, p0

    .line 139
    invoke-static/range {v1 .. v6}, Lcom/discord/media/utils/MediaResolver;->copyToFile$default(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p1, v0, :cond_a

    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_a
    :goto_3
    check-cast p1, Landroid/net/Uri;

    .line 147
    .line 148
    :goto_4
    return-object p1
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
.end method
