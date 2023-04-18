.class final Lcom/discord/chat/ChatModule$updateRows$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/ChatModule;->updateRows(ILjava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/discord/chat/listmanager/ChatListManager;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lcom/discord/chat/listmanager/ChatListManager;",
        "manager",
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
    c = "com.discord.chat.ChatModule$updateRows$1"
    f = "ChatModule.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $rowsJSON:Ljava/lang/String;

.field final synthetic $tag:I

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/discord/chat/ChatModule;


# direct methods
.method constructor <init>(Lcom/discord/chat/ChatModule;ILjava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/ChatModule;",
            "I",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/chat/ChatModule$updateRows$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->this$0:Lcom/discord/chat/ChatModule;

    iput p2, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$tag:I

    iput-object p3, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$rowsJSON:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/discord/chat/ChatModule$updateRows$1;

    iget-object v1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->this$0:Lcom/discord/chat/ChatModule;

    iget v2, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$tag:I

    iget-object v3, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$rowsJSON:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/discord/chat/ChatModule$updateRows$1;-><init>(Lcom/discord/chat/ChatModule;ILjava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/discord/chat/ChatModule$updateRows$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcom/discord/chat/listmanager/ChatListManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/listmanager/ChatListManager;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/ChatModule$updateRows$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/ChatModule$updateRows$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/chat/ChatModule$updateRows$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/discord/chat/listmanager/ChatListManager;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/ChatModule$updateRows$1;->invoke(Lcom/discord/chat/listmanager/ChatListManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/discord/chat/ChatModule$updateRows$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lcom/discord/chat/listmanager/ChatListManager;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/discord/chat/ChatModule$updateRows$1;->this$0:Lcom/discord/chat/ChatModule;

    .line 16
    .line 17
    iget v1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$tag:I

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/discord/chat/ChatModule;->access$rowUpdateLoggerFor(Lcom/discord/chat/ChatModule;I)Lcom/discord/chatreplay/logger/RowLogger;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$rowsJSON:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Lcom/discord/chatreplay/logger/RowLogger;->logRowsUpdate(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object v0, p0, Lcom/discord/chat/ChatModule$updateRows$1;->this$0:Lcom/discord/chat/ChatModule;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/discord/chat/ChatModule;->access$getJson$p(Lcom/discord/chat/ChatModule;)Lkotlinx/serialization/json/Json;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$rowsJSON:Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {v0}, Lwi/e;->a()Lbj/c;

    .line 37
    .line 38
    .line 39
    new-instance v2, Lzi/f;

    .line 40
    .line 41
    sget-object v3, Lcom/discord/chat/bridge/row/RowSerializer;->INSTANCE:Lcom/discord/chat/bridge/row/RowSerializer;

    .line 42
    .line 43
    invoke-direct {v2, v3}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2, v1}, Lwi/m;->b(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lcom/discord/chat/listmanager/ChatListManager;->updateRows(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    iget-object v1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$rowsJSON:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1, v0}, Lcom/discord/chat/listmanager/ChatListManager;->handleError(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object v2, Lcom/discord/tti_manager/TTIMetrics;->INSTANCE:Lcom/discord/tti_manager/TTIMetrics;

    .line 70
    .line 71
    const-string v3, "ChatModule.updateRows() Finish"

    .line 72
    .line 73
    const-wide/16 v4, 0x0

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/16 v8, 0xe

    .line 78
    .line 79
    const/4 v9, 0x0

    .line 80
    invoke-static/range {v2 .. v9}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
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
