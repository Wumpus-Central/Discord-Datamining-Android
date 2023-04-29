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
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/discord/chat/ChatModule$updateRows$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

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
    invoke-interface {v0}, Lyi/e;->a()Ldj/c;

    .line 37
    .line 38
    .line 39
    new-instance v2, Lbj/f;

    .line 40
    .line 41
    sget-object v3, Lcom/discord/chat/bridge/row/RowSerializer;->INSTANCE:Lcom/discord/chat/bridge/row/RowSerializer;

    .line 42
    .line 43
    invoke-direct {v2, v3}, Lbj/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2, v1}, Lyi/m;->b(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

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
    sget-object v7, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 58
    .line 59
    const-string v2, "Bad row update"

    .line 60
    .line 61
    const/4 v1, 0x4

    .line 62
    new-array v1, v1, [Lkotlin/Pair;

    .line 63
    .line 64
    iget v3, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$tag:I

    .line 65
    .line 66
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string v4, "tag"

    .line 71
    .line 72
    invoke-static {v4, v3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/4 v4, 0x0

    .line 77
    aput-object v3, v1, v4

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ChatListManager;->getRowCount()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const-string v4, "tagRowSize"

    .line 88
    .line 89
    invoke-static {v4, v3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const/4 v4, 0x1

    .line 94
    aput-object v3, v1, v4

    .line 95
    .line 96
    iget-object v3, p0, Lcom/discord/chat/ChatModule$updateRows$1;->this$0:Lcom/discord/chat/ChatModule;

    .line 97
    .line 98
    invoke-static {v3}, Lcom/discord/chat/ChatModule;->access$getPreviousRowUpdateTag$p(Lcom/discord/chat/ChatModule;)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const-string v4, "previousTag"

    .line 107
    .line 108
    invoke-static {v4, v3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const/4 v4, 0x2

    .line 113
    aput-object v3, v1, v4

    .line 114
    .line 115
    iget-object v3, p0, Lcom/discord/chat/ChatModule$updateRows$1;->this$0:Lcom/discord/chat/ChatModule;

    .line 116
    .line 117
    invoke-static {v3}, Lcom/discord/chat/ChatModule;->access$getPreviousRowUpdateTag$p(Lcom/discord/chat/ChatModule;)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-virtual {v3, v4}, Lcom/discord/chat/ChatModule;->getChatListManager(I)Lcom/discord/chat/listmanager/ChatListManager;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3}, Lcom/discord/chat/listmanager/ChatListManager;->getRowCount()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v4, "previousTagRowSize"

    .line 134
    .line 135
    invoke-static {v4, v3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    const/4 v4, 0x3

    .line 140
    aput-object v3, v1, v4

    .line 141
    .line 142
    invoke-static {v1}, Lof/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const/4 v4, 0x0

    .line 147
    const/4 v5, 0x4

    .line 148
    const/4 v6, 0x0

    .line 149
    move-object v1, v7

    .line 150
    invoke-static/range {v1 .. v6}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    new-instance v1, Ljava/lang/Exception;

    .line 154
    .line 155
    const-string v2, "Failed to update rows"

    .line 156
    .line 157
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v1}, Lcom/discord/crash_reporting/CrashReporting;->captureException(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$rowsJSON:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v1, v0}, Lcom/discord/chat/listmanager/ChatListManager;->handleError(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_0
    sget-object v2, Lcom/discord/tti_manager/TTIMetrics;->INSTANCE:Lcom/discord/tti_manager/TTIMetrics;

    .line 176
    .line 177
    const-string v3, "ChatModule.updateRows() Finish"

    .line 178
    .line 179
    const-wide/16 v4, 0x0

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v7, 0x0

    .line 183
    const/16 v8, 0xe

    .line 184
    .line 185
    const/4 v9, 0x0

    .line 186
    invoke-static/range {v2 .. v9}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object p1, p0, Lcom/discord/chat/ChatModule$updateRows$1;->this$0:Lcom/discord/chat/ChatModule;

    .line 190
    .line 191
    iget v0, p0, Lcom/discord/chat/ChatModule$updateRows$1;->$tag:I

    .line 192
    .line 193
    invoke-static {p1, v0}, Lcom/discord/chat/ChatModule;->access$setPreviousRowUpdateTag$p(Lcom/discord/chat/ChatModule;I)V

    .line 194
    .line 195
    .line 196
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p1

    .line 199
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 200
    .line 201
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p1
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
