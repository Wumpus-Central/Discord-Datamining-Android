.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->toggleDurationEmitter(Z)V
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
    c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2"
    f = "AudioPlayerView.kt"
    l = {
        0x165
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-direct {v0, v1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 15
    .line 16
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

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
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    :goto_0
    move-object p1, p0

    .line 37
    :cond_2
    invoke-static {v1}, Lkotlinx/coroutines/k0;->h(Lkotlinx/coroutines/CoroutineScope;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iget-object v3, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    .line 44
    .line 45
    invoke-static {v3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$getState$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->shouldEmitDuration$chat_release()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    iget-object v3, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    .line 56
    .line 57
    invoke-static {v3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$configureProgress(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x3

    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-static {v3, v6, v4, v5, v6}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureDuration$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Ljava/lang/Long;ZILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lkotlinx/coroutines/y0;->a()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v4, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2$1;

    .line 73
    .line 74
    invoke-direct {v4, v6}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput v2, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;->label:I

    .line 80
    .line 81
    invoke-static {v3, v4, p1}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-ne v3, v0, :cond_2

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p1
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
.end method
