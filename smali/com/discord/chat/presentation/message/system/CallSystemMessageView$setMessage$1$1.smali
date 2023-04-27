.class final Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1"
    f = "CallSystemMessageView.kt"
    l = {
        0x5a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $message:Lcom/discord/chat/bridge/Message;

.field final synthetic $start:J

.field label:I

.field final synthetic this$0:Lcom/discord/chat/presentation/message/system/CallSystemMessageView;


# direct methods
.method constructor <init>(JLcom/discord/chat/presentation/message/system/CallSystemMessageView;Lcom/discord/chat/bridge/Message;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/discord/chat/presentation/message/system/CallSystemMessageView;",
            "Lcom/discord/chat/bridge/Message;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->$start:J

    iput-object p3, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->this$0:Lcom/discord/chat/presentation/message/system/CallSystemMessageView;

    iput-object p4, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->$message:Lcom/discord/chat/bridge/Message;

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

    new-instance p1, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;

    iget-wide v1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->$start:J

    iget-object v3, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->this$0:Lcom/discord/chat/presentation/message/system/CallSystemMessageView;

    iget-object v4, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->$message:Lcom/discord/chat/bridge/Message;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;-><init>(JLcom/discord/chat/presentation/message/system/CallSystemMessageView;Lcom/discord/chat/bridge/Message;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->label:I

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
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lsi/a;->l:Lsi/a$a;

    .line 28
    .line 29
    sget-object p1, Lsi/d;->o:Lsi/d;

    .line 30
    .line 31
    invoke-static {v2, p1}, Lsi/c;->s(ILsi/d;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    sget-object p1, Lsi/a;->l:Lsi/a$a;

    .line 36
    .line 37
    invoke-virtual {p1}, Lsi/a$a;->b()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    invoke-static {v3, v4, v5, v6}, Lcom/discord/misc/utilities/time/IntervalFlowKt;->intervalFlow-QTBD994(JJ)Lkotlinx/coroutines/flow/Flow;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-wide v3, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->$start:J

    .line 46
    .line 47
    new-instance v1, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1;

    .line 48
    .line 49
    invoke-direct {v1, p1, v3, v4}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;J)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lkotlinx/coroutines/y0;->a()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v1, p1}, Lkotlinx/coroutines/flow/d;->f(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v1, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$2;

    .line 61
    .line 62
    iget-object v3, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->this$0:Lcom/discord/chat/presentation/message/system/CallSystemMessageView;

    .line 63
    .line 64
    iget-object v4, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->$message:Lcom/discord/chat/bridge/Message;

    .line 65
    .line 66
    invoke-direct {v1, v3, v4}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$2;-><init>(Lcom/discord/chat/presentation/message/system/CallSystemMessageView;Lcom/discord/chat/bridge/Message;)V

    .line 67
    .line 68
    .line 69
    iput v2, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1;->label:I

    .line 70
    .line 71
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_2

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p1
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
.end method
