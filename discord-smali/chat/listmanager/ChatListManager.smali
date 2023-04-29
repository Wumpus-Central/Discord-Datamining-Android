.class public final Lcom/discord/chat/listmanager/ChatListManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0013H\u0002J\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001cJ\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0014\u0010\u001f\u001a\u00020\u000f2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0013J\u001a\u0010 \u001a\u00020\u000f*\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010!\u001a\u00020\nH\u0002J\u000c\u0010\"\u001a\u00020#*\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lcom/discord/chat/listmanager/ChatListManager;",
        "",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "(Lkotlinx/coroutines/CoroutineScope;)V",
        "isDisabled",
        "",
        "publishScope",
        "rows",
        "",
        "Lcom/discord/chat/bridge/row/Row;",
        "updatesFlow",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/discord/chat/listmanager/ChatListUpdate;",
        "clearRows",
        "",
        "createNewRows",
        "Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;",
        "updates",
        "",
        "getRowCount",
        "",
        "handleError",
        "errorJson",
        "",
        "causeMessage",
        "modifyExistingRows",
        "observeUpdates",
        "Lkotlinx/coroutines/flow/Flow;",
        "publishUpdate",
        "update",
        "updateRows",
        "insert",
        "row",
        "toChatListItem",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "RowsModificationResult",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private isDisabled:Z

.field private final publishScope:Lkotlinx/coroutines/CoroutineScope;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/row/Row;",
            ">;"
        }
    .end annotation
.end field

.field private final updatesFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/discord/chat/listmanager/ChatListUpdate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;)V
    .locals 3

    .line 1
    const-string v0, "coroutineScope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    sget-object v1, Lui/e;->k:Lui/e;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {v2, v0, v1}, Lkotlinx/coroutines/flow/m;->a(IILui/e;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/discord/chat/listmanager/ChatListManager;->updatesFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 18
    .line 19
    invoke-static {}, Lkotlinx/coroutines/y0;->a()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p1, v0}, Lkotlinx/coroutines/k0;->i(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/discord/chat/listmanager/ChatListManager;->publishScope:Lkotlinx/coroutines/CoroutineScope;

    .line 28
    .line 29
    return-void
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
    .line 252
.end method

.method public static final synthetic access$getUpdatesFlow$p(Lcom/discord/chat/listmanager/ChatListManager;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/listmanager/ChatListManager;->updatesFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method private final createNewRows(Ljava/util/List;)Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/row/Row;",
            ">;)",
            "Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/util/Collection;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lcom/discord/chat/bridge/row/Row;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/discord/chat/bridge/row/Row;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v4, Lcom/discord/chat/bridge/ChangeType;->DELETE:Lcom/discord/chat/bridge/ChangeType;

    .line 35
    .line 36
    if-ne v3, v4, :cond_2

    .line 37
    .line 38
    move v3, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v3, v1

    .line 41
    :goto_0
    if-eqz v3, :cond_1

    .line 42
    .line 43
    move v1, v2

    .line 44
    :cond_3
    :goto_1
    xor-int/lit8 v0, v1, 0x1

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/collections/h;->F0(Ljava/util/Collection;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/discord/chat/listmanager/ChatListManager;->rows:Ljava/util/List;

    .line 53
    .line 54
    new-instance v0, Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-direct {v0, p1, v2, v1}, Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;-><init>(Ljava/util/List;ZLjava/util/List;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string v0, "Deletes are not expected or allowed during syncs."

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1
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
.end method

.method private final insert(Ljava/util/List;Lcom/discord/chat/bridge/row/Row;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/row/Row;",
            ">;",
            "Lcom/discord/chat/bridge/row/Row;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/discord/chat/bridge/row/DeleteRow;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface {p1, v0, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p2, "Unexpected delete during insert."

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
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
.end method

.method private final modifyExistingRows(Ljava/util/List;)Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/row/Row;",
            ">;)",
            "Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ChatListManager;->rows:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 2
    new-instance v1, Lcom/discord/chat/listmanager/ListOperationsBuilder;

    invoke-direct {v1}, Lcom/discord/chat/listmanager/ListOperationsBuilder;-><init>()V

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/discord/chat/bridge/row/Row;

    .line 5
    invoke-virtual {v7}, Lcom/discord/chat/bridge/row/Row;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v7

    sget-object v8, Lcom/discord/chat/bridge/ChangeType;->INSERT:Lcom/discord/chat/bridge/ChangeType;

    if-ne v7, v8, :cond_1

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    if-eqz v5, :cond_0

    .line 6
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    move v3, v6

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/discord/chat/bridge/row/Row;

    .line 8
    invoke-direct {p0, v0, v4}, Lcom/discord/chat/listmanager/ChatListManager;->insert(Ljava/util/List;Lcom/discord/chat/bridge/row/Row;)V

    .line 9
    new-instance v7, Lcom/discord/chat/listmanager/ListOperation$Insert;

    invoke-virtual {v4}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    move-result v8

    invoke-direct {v7, v8}, Lcom/discord/chat/listmanager/ListOperation$Insert;-><init>(I)V

    invoke-virtual {v1, v7}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->add(Lcom/discord/chat/listmanager/ListOperation;)V

    if-nez v3, :cond_4

    .line 10
    invoke-virtual {v4}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    move-result v3

    if-nez v3, :cond_3

    :cond_4
    move v3, v5

    goto :goto_2

    .line 11
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/discord/chat/bridge/row/Row;

    .line 13
    invoke-virtual {v7}, Lcom/discord/chat/bridge/row/Row;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v8

    sget-object v9, Lcom/discord/chat/bridge/ChangeType;->DELETE:Lcom/discord/chat/bridge/ChangeType;

    if-eq v8, v9, :cond_8

    invoke-virtual {v7}, Lcom/discord/chat/bridge/row/Row;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v7

    sget-object v8, Lcom/discord/chat/bridge/ChangeType;->UPDATE:Lcom/discord/chat/bridge/ChangeType;

    if-ne v7, v8, :cond_7

    goto :goto_4

    :cond_7
    move v7, v6

    goto :goto_5

    :cond_8
    :goto_4
    move v7, v5

    :goto_5
    if-eqz v7, :cond_6

    .line 14
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 15
    :cond_9
    invoke-static {v2}, Lkotlin/collections/h;->F(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/discord/chat/bridge/row/Row;

    .line 17
    instance-of v4, v2, Lcom/discord/chat/bridge/row/DeleteRow;

    if-eqz v4, :cond_a

    .line 18
    invoke-virtual {v2}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    move-result v4

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 19
    new-instance v4, Lcom/discord/chat/listmanager/ListOperation$Remove;

    invoke-virtual {v2}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    move-result v2

    invoke-direct {v4, v2}, Lcom/discord/chat/listmanager/ListOperation$Remove;-><init>(I)V

    invoke-virtual {v1, v4}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->add(Lcom/discord/chat/listmanager/ListOperation;)V

    goto :goto_6

    .line 20
    :cond_a
    instance-of v4, v2, Lcom/discord/chat/bridge/row/LoadingRow;

    if-eqz v4, :cond_b

    .line 21
    move-object v4, v2

    check-cast v4, Lcom/discord/chat/bridge/row/LoadingRow;

    invoke-virtual {v4}, Lcom/discord/chat/bridge/row/LoadingRow;->getButton()Lcom/discord/chat/bridge/row/LoadMoreButton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/chat/bridge/row/LoadMoreButton;->getAction()Lcom/discord/chat/bridge/row/LoadingAction;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/chat/bridge/row/LoadingAction;->getType()Lcom/discord/chat/bridge/row/LoadingActionType;

    move-result-object v4

    sget-object v7, Lcom/discord/chat/bridge/row/LoadingActionType;->LOAD_MORE_AFTER:Lcom/discord/chat/bridge/row/LoadingActionType;

    if-ne v4, v7, :cond_b

    .line 22
    invoke-virtual {v2}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    move-result v4

    if-nez v4, :cond_b

    move v4, v5

    goto :goto_7

    :cond_b
    move v4, v6

    .line 23
    :goto_7
    invoke-static {v0}, Lkotlin/collections/h;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/discord/chat/bridge/row/Row;

    .line 24
    instance-of v8, v7, Lcom/discord/chat/bridge/row/LoadingRow;

    if-eqz v8, :cond_c

    check-cast v7, Lcom/discord/chat/bridge/row/LoadingRow;

    invoke-virtual {v7}, Lcom/discord/chat/bridge/row/LoadingRow;->isLoading()Z

    move-result v7

    if-eqz v7, :cond_c

    move v7, v5

    goto :goto_8

    :cond_c
    move v7, v6

    :goto_8
    if-eqz v4, :cond_d

    if-eqz v7, :cond_d

    move v4, v5

    goto :goto_9

    :cond_d
    move v4, v6

    :goto_9
    if-eqz v4, :cond_e

    .line 25
    invoke-interface {v0, v5, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 26
    invoke-interface {v0, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 27
    new-instance v2, Lcom/discord/chat/listmanager/ListOperation$Insert;

    invoke-direct {v2, v5}, Lcom/discord/chat/listmanager/ListOperation$Insert;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->add(Lcom/discord/chat/listmanager/ListOperation;)V

    .line 28
    new-instance v2, Lcom/discord/chat/listmanager/ListOperation$Remove;

    invoke-direct {v2, v6}, Lcom/discord/chat/listmanager/ListOperation$Remove;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->add(Lcom/discord/chat/listmanager/ListOperation;)V

    goto :goto_6

    .line 29
    :cond_e
    invoke-virtual {v2}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    move-result v4

    invoke-interface {v0, v4, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 30
    new-instance v4, Lcom/discord/chat/listmanager/ListOperation$Change;

    invoke-virtual {v2}, Lcom/discord/chat/bridge/row/Row;->getIndex()I

    move-result v2

    invoke-direct {v4, v2}, Lcom/discord/chat/listmanager/ListOperation$Change;-><init>(I)V

    invoke-virtual {v1, v4}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->add(Lcom/discord/chat/listmanager/ListOperation;)V

    goto/16 :goto_6

    .line 31
    :cond_f
    new-instance p1, Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;

    .line 32
    invoke-virtual {v1}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->build()Ljava/util/List;

    move-result-object v1

    .line 33
    invoke-direct {p1, v0, v3, v1}, Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;-><init>(Ljava/util/List;ZLjava/util/List;)V

    return-object p1
.end method

.method private final publishUpdate(Lcom/discord/chat/listmanager/ChatListUpdate;)V
    .locals 6

    iget-object v0, p0, Lcom/discord/chat/listmanager/ChatListManager;->publishScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/discord/chat/listmanager/ChatListManager$publishUpdate$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/discord/chat/listmanager/ChatListManager$publishUpdate$1;-><init>(Lcom/discord/chat/listmanager/ChatListManager;Lcom/discord/chat/listmanager/ChatListUpdate;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final toChatListItem(Lcom/discord/chat/bridge/row/Row;)Lcom/discord/chat/presentation/list/item/ChatListItem;
    .locals 26

    move-object/from16 v0, p1

    .line 1
    instance-of v1, v0, Lcom/discord/chat/bridge/row/MessageRow;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/discord/chat/bridge/row/MessageRow;

    invoke-static {v0}, Lcom/discord/chat/bridge/row/MessageRowKt;->toChatListMessageItem(Lcom/discord/chat/bridge/row/MessageRow;)Lcom/discord/chat/presentation/list/item/ChatListItem;

    move-result-object v0

    goto/16 :goto_2

    .line 2
    :cond_0
    instance-of v1, v0, Lcom/discord/chat/bridge/row/UploadProgressRow;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/discord/chat/presentation/list/item/MessageItem;

    check-cast v0, Lcom/discord/chat/bridge/row/UploadProgressRow;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/UploadProgressRow;->getMessage()Lcom/discord/chat/bridge/Message;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xfe

    const/4 v12, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v12}, Lcom/discord/chat/presentation/list/item/MessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v0, v1

    goto/16 :goto_2

    .line 3
    :cond_1
    instance-of v1, v0, Lcom/discord/chat/bridge/row/EmbeddedActivityRow;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;

    .line 4
    check-cast v0, Lcom/discord/chat/bridge/row/EmbeddedActivityRow;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/EmbeddedActivityRow;->getContent()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/EmbeddedActivityRow;->getAvatarUrls()Ljava/util/List;

    move-result-object v4

    .line 6
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/EmbeddedActivityRow;->getButtonText()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/EmbeddedActivityRow;->getEmbeddedActivityKey()Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/EmbeddedActivityRow;->getDismissButtonAccessibilityLabel()Ljava/lang/String;

    move-result-object v7

    move-object v2, v1

    .line 9
    invoke-direct/range {v2 .. v7}, Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_2
    instance-of v1, v0, Lcom/discord/chat/bridge/row/LoadingRow;

    if-eqz v1, :cond_3

    new-instance v1, Lcom/discord/chat/presentation/list/item/LoadingChatListItem;

    .line 11
    check-cast v0, Lcom/discord/chat/bridge/row/LoadingRow;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/LoadingRow;->getButton()Lcom/discord/chat/bridge/row/LoadMoreButton;

    move-result-object v2

    .line 12
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/LoadingRow;->isLoading()Z

    move-result v0

    .line 13
    invoke-direct {v1, v2, v0}, Lcom/discord/chat/presentation/list/item/LoadingChatListItem;-><init>(Lcom/discord/chat/bridge/row/LoadMoreButton;Z)V

    goto :goto_0

    .line 14
    :cond_3
    instance-of v1, v0, Lcom/discord/chat/bridge/row/SeparatorRow;

    if-eqz v1, :cond_4

    new-instance v1, Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;

    .line 15
    check-cast v0, Lcom/discord/chat/bridge/row/SeparatorRow;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/SeparatorRow;->getColor()I

    move-result v2

    .line 16
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/SeparatorRow;->getText()Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/SeparatorRow;->getText()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "separator: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-direct {v1, v2, v3, v0}, Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_4
    instance-of v1, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;

    if-eqz v1, :cond_7

    .line 20
    check-cast v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getText()Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getButton()Lcom/discord/chat/bridge/row/BlockedGroupButton;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/row/BlockedGroupButton;->getAction()Lcom/discord/chat/bridge/row/BlockedGroupButtonAction;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/row/BlockedGroupButtonAction;->getContext()Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getColor()I

    move-result v4

    .line 23
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getBackgroundColor()I

    move-result v5

    .line 24
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getBorderColor()I

    move-result v6

    .line 25
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getRevealed()Z

    move-result v7

    .line 26
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getContent()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    .line 27
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 29
    check-cast v8, Lcom/discord/chat/bridge/row/BlockedGroupContent;

    .line 30
    invoke-virtual {v8}, Lcom/discord/chat/bridge/row/BlockedGroupContent;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    move-result-object v9

    const/4 v10, 0x0

    new-instance v8, Lcom/discord/chat/presentation/root/MessageContext;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xfff

    const/16 v25, 0x0

    move-object v11, v8

    invoke-direct/range {v11 .. v25}, Lcom/discord/chat/presentation/root/MessageContext;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v14, 0x0

    const/16 v17, 0x7d

    invoke-static/range {v9 .. v18}, Lcom/discord/chat/bridge/row/MessageRowKt;->toChatListMessageItem$default(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;ILjava/lang/Object;)Lcom/discord/chat/presentation/list/item/ChatListItem;

    move-result-object v8

    .line 31
    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 32
    :cond_6
    invoke-static {v1}, Lkotlin/collections/h;->F(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 33
    new-instance v0, Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;-><init>(Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/List;)V

    :goto_2
    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown row type."

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final clearRows()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ChatListManager;->rows:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lcom/discord/chat/bridge/spoiler/SpoilerManager;->INSTANCE:Lcom/discord/chat/bridge/spoiler/SpoilerManager;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/discord/chat/bridge/spoiler/SpoilerManager;->reset()V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/discord/chat/listmanager/ChatListUpdate;

    .line 24
    .line 25
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, Lcom/discord/chat/listmanager/ChatListAction$Clear;->INSTANCE:Lcom/discord/chat/listmanager/ChatListAction$Clear;

    .line 30
    .line 31
    invoke-direct {v0, v2, v3, v1}, Lcom/discord/chat/listmanager/ChatListUpdate;-><init>(Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0}, Lcom/discord/chat/listmanager/ChatListManager;->publishUpdate(Lcom/discord/chat/listmanager/ChatListUpdate;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iput-object v1, p0, Lcom/discord/chat/listmanager/ChatListManager;->rows:Ljava/util/List;

    .line 38
    .line 39
    return-void
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
.end method

.method public final getRowCount()I
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/listmanager/ChatListManager;->rows:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final handleError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "errorJson"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "causeMessage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/discord/chat/listmanager/ChatListUpdate;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v2, v1, [Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;

    .line 15
    .line 16
    new-instance v3, Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;

    .line 17
    .line 18
    const-string v4, "error-id"

    .line 19
    .line 20
    invoke-direct {v3, v4, p1, p2}, Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    aput-object v3, v2, p1

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/collections/h;->o([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object p2, Lcom/discord/chat/listmanager/ChatListAction$Noop;->INSTANCE:Lcom/discord/chat/listmanager/ChatListAction$Noop;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, p1, p2, v2}, Lcom/discord/chat/listmanager/ChatListUpdate;-><init>(Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0}, Lcom/discord/chat/listmanager/ChatListManager;->publishUpdate(Lcom/discord/chat/listmanager/ChatListUpdate;)V

    .line 37
    .line 38
    .line 39
    iput-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListManager;->isDisabled:Z

    .line 40
    .line 41
    return-void
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
.end method

.method public final observeUpdates()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/discord/chat/listmanager/ChatListUpdate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/listmanager/ChatListManager;->updatesFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object v0
.end method

.method public final updateRows(Ljava/util/List;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/row/Row;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "updates"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v2, v0, Lcom/discord/chat/listmanager/ChatListManager;->isDisabled:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v2, v0, Lcom/discord/chat/listmanager/ChatListManager;->rows:Ljava/util/List;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-direct/range {p0 .. p1}, Lcom/discord/chat/listmanager/ChatListManager;->modifyExistingRows(Ljava/util/List;)Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/discord/chat/listmanager/ChatListManager;->createNewRows(Ljava/util/List;)Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    invoke-virtual {v2}, Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;->component1()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v2}, Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;->component2()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v2}, Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;->component3()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v5, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v6, 0xa

    .line 43
    .line 44
    invoke-static {v3, v6}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v7, 0x0

    .line 56
    move v10, v7

    .line 57
    const/4 v8, 0x0

    .line 58
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_b

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    add-int/lit8 v16, v10, 0x1

    .line 69
    .line 70
    if-gez v10, :cond_2

    .line 71
    .line 72
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 73
    .line 74
    .line 75
    :cond_2
    move-object v15, v9

    .line 76
    check-cast v15, Lcom/discord/chat/bridge/row/Row;

    .line 77
    .line 78
    instance-of v9, v15, Lcom/discord/chat/bridge/row/MessageRow;

    .line 79
    .line 80
    if-eqz v9, :cond_3

    .line 81
    .line 82
    move-object v11, v15

    .line 83
    check-cast v11, Lcom/discord/chat/bridge/row/MessageRow;

    .line 84
    .line 85
    invoke-virtual {v11}, Lcom/discord/chat/bridge/row/MessageRow;->getScrollTo()Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-static {v11, v12}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    instance-of v11, v15, Lcom/discord/chat/bridge/row/SeparatorRow;

    .line 97
    .line 98
    if-eqz v11, :cond_4

    .line 99
    .line 100
    move-object v11, v15

    .line 101
    check-cast v11, Lcom/discord/chat/bridge/row/SeparatorRow;

    .line 102
    .line 103
    invoke-virtual {v11}, Lcom/discord/chat/bridge/row/SeparatorRow;->getScrollTo()Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-static {v11, v12}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move v11, v7

    .line 115
    :goto_2
    if-eqz v11, :cond_5

    .line 116
    .line 117
    invoke-virtual {v15}, Lcom/discord/chat/bridge/row/Row;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    sget-object v12, Lcom/discord/chat/bridge/ChangeType;->DELETE:Lcom/discord/chat/bridge/ChangeType;

    .line 122
    .line 123
    if-eq v11, v12, :cond_5

    .line 124
    .line 125
    const/4 v11, 0x1

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    move v11, v7

    .line 128
    :goto_3
    if-eqz v11, :cond_a

    .line 129
    .line 130
    invoke-interface {v1, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-eqz v11, :cond_a

    .line 135
    .line 136
    new-instance v8, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    .line 137
    .line 138
    if-eqz v9, :cond_6

    .line 139
    .line 140
    move-object v11, v15

    .line 141
    check-cast v11, Lcom/discord/chat/bridge/row/MessageRow;

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_6
    const/4 v11, 0x0

    .line 145
    :goto_4
    if-eqz v11, :cond_7

    .line 146
    .line 147
    invoke-virtual {v11}, Lcom/discord/chat/bridge/row/MessageRow;->getJumped()Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    if-eqz v11, :cond_7

    .line 152
    .line 153
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    goto :goto_5

    .line 158
    :cond_7
    move v11, v7

    .line 159
    :goto_5
    const/4 v12, 0x0

    .line 160
    if-eqz v9, :cond_8

    .line 161
    .line 162
    move-object v9, v15

    .line 163
    check-cast v9, Lcom/discord/chat/bridge/row/MessageRow;

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    const/4 v9, 0x0

    .line 167
    :goto_6
    if-eqz v9, :cond_9

    .line 168
    .line 169
    invoke-virtual {v9}, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight()Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    move v13, v9

    .line 174
    goto :goto_7

    .line 175
    :cond_9
    move v13, v7

    .line 176
    :goto_7
    const/4 v14, 0x4

    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    move-object v9, v8

    .line 180
    move-object v6, v15

    .line 181
    move-object/from16 v15, v17

    .line 182
    .line 183
    invoke-direct/range {v9 .. v15}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 184
    .line 185
    .line 186
    goto :goto_8

    .line 187
    :cond_a
    move-object v6, v15

    .line 188
    :goto_8
    invoke-direct {v0, v6}, Lcom/discord/chat/listmanager/ChatListManager;->toChatListItem(Lcom/discord/chat/bridge/row/Row;)Lcom/discord/chat/presentation/list/item/ChatListItem;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move/from16 v10, v16

    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_b
    if-eqz v8, :cond_c

    .line 200
    .line 201
    goto :goto_9

    .line 202
    :cond_c
    if-eqz v4, :cond_d

    .line 203
    .line 204
    sget-object v8, Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;->INSTANCE:Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;

    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_d
    sget-object v8, Lcom/discord/chat/listmanager/ChatListAction$Noop;->INSTANCE:Lcom/discord/chat/listmanager/ChatListAction$Noop;

    .line 208
    .line 209
    :goto_9
    new-instance v1, Lcom/discord/chat/listmanager/ChatListUpdate;

    .line 210
    .line 211
    invoke-direct {v1, v5, v8, v2}, Lcom/discord/chat/listmanager/ChatListUpdate;-><init>(Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;)V

    .line 212
    .line 213
    .line 214
    invoke-direct {v0, v1}, Lcom/discord/chat/listmanager/ChatListManager;->publishUpdate(Lcom/discord/chat/listmanager/ChatListUpdate;)V

    .line 215
    .line 216
    .line 217
    return-void
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
