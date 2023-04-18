.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->finishAnimation()V
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
    c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1"
    f = "AudioWaveView.kt"
    l = {
        0x87
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

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

    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    invoke-direct {v0, v1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->label:I

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
    iget v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->I$1:I

    .line 13
    .line 14
    iget v3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->I$0:I

    .line 15
    .line 16
    iget-object v4, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->L$1:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 19
    .line 20
    iget-object v5, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->L$0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lkotlinx/coroutines/CoroutineScope;

    .line 23
    .line 24
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object p1, p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 43
    .line 44
    invoke-static {}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->access$getFINISH_ANIMATION_NUM_REPEAT$cp()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget-object v3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    move-object v5, p1

    .line 52
    move-object p1, p0

    .line 53
    move-object v9, v3

    .line 54
    move v3, v1

    .line 55
    move v1, v4

    .line 56
    move-object v4, v9

    .line 57
    :goto_0
    if-ge v1, v3, :cond_4

    .line 58
    .line 59
    invoke-static {}, Lkotlinx/coroutines/y0;->a()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    new-instance v7, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1$1$1;

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-direct {v7, v8}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 67
    .line 68
    .line 69
    iput-object v5, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v4, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    iput v3, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->I$0:I

    .line 74
    .line 75
    iput v1, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->I$1:I

    .line 76
    .line 77
    iput v2, p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$finishAnimation$1;->label:I

    .line 78
    .line 79
    invoke-static {v6, v7, p1}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-ne v6, v0, :cond_2

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_2
    :goto_1
    invoke-static {v5}, Lkotlinx/coroutines/k0;->h(Lkotlinx/coroutines/CoroutineScope;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_3

    .line 91
    .line 92
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 93
    .line 94
    .line 95
    :cond_3
    add-int/2addr v1, v2

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p1
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
