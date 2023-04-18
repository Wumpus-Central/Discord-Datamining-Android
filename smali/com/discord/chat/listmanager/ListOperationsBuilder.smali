.class public final Lcom/discord/chat/listmanager/ListOperationsBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0013R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/discord/chat/listmanager/ListOperationsBuilder;",
        "",
        "()V",
        "listOperations",
        "",
        "Lcom/discord/chat/listmanager/ListOperation;",
        "add",
        "",
        "newOperation",
        "addChange",
        "changeOperation",
        "Lcom/discord/chat/listmanager/ListOperation$Change;",
        "addInsert",
        "insertOperation",
        "Lcom/discord/chat/listmanager/ListOperation$Insert;",
        "addRemove",
        "removeOperation",
        "Lcom/discord/chat/listmanager/ListOperation$Remove;",
        "build",
        "",
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
.field private final listOperations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/listmanager/ListOperation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
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
.end method

.method private final addChange(Lcom/discord/chat/listmanager/ListOperation$Change;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/h;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation;

    .line 8
    .line 9
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$Change;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$Change;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 34
    .line 35
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-direct {v4, v0, p1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_0
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    if-ne v1, v2, :cond_1

    .line 63
    .line 64
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 71
    .line 72
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-direct {v4, p1, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;->getLast()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    add-int/lit8 v2, v2, -0x1

    .line 113
    .line 114
    if-ne v1, v2, :cond_3

    .line 115
    .line 116
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 117
    .line 118
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 123
    .line 124
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;->getFirst()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-direct {v4, v0, p1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;->getFirst()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    if-ne v1, v2, :cond_4

    .line 155
    .line 156
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 157
    .line 158
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 163
    .line 164
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;->getLast()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-direct {v4, p1, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_4
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_5
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :goto_0
    return-void
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

.method private final addInsert(Lcom/discord/chat/listmanager/ListOperation$Insert;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/h;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation;

    .line 8
    .line 9
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$Insert;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$Insert;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 34
    .line 35
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-direct {v4, v0, p1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_0
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    if-ne v1, v2, :cond_1

    .line 63
    .line 64
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 71
    .line 72
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-direct {v4, p1, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;->getLast()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    add-int/lit8 v2, v2, -0x1

    .line 113
    .line 114
    if-ne v1, v2, :cond_3

    .line 115
    .line 116
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 117
    .line 118
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 123
    .line 124
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;->getFirst()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-direct {v4, v0, p1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;->getFirst()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    if-ne v1, v2, :cond_4

    .line 155
    .line 156
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 157
    .line 158
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 163
    .line 164
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;->getLast()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-direct {v4, p1, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_4
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_5
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :goto_0
    return-void
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

.method private final addRemove(Lcom/discord/chat/listmanager/ListOperation$Remove;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/h;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation;

    .line 8
    .line 9
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$Remove;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$Remove;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 34
    .line 35
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-direct {v4, v0, p1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_0
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    if-ne v1, v2, :cond_1

    .line 63
    .line 64
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 71
    .line 72
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-direct {v4, p1, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;->getLast()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    add-int/lit8 v2, v2, -0x1

    .line 113
    .line 114
    if-ne v1, v2, :cond_3

    .line 115
    .line 116
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 117
    .line 118
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 123
    .line 124
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;->getFirst()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-direct {v4, v0, p1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;->getFirst()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    if-ne v1, v2, :cond_4

    .line 155
    .line 156
    iget-object v1, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 157
    .line 158
    invoke-static {v1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    new-instance v3, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 163
    .line 164
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;->getLast()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-direct {v4, p1, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-direct {v3, v4}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;-><init>(Lkotlin/ranges/IntRange;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_4
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_5
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :goto_0
    return-void
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


# virtual methods
.method public final add(Lcom/discord/chat/listmanager/ListOperation;)V
    .locals 3

    .line 1
    const-string v0, "newOperation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v0, p1, Lcom/discord/chat/listmanager/ListOperation$Insert;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Lcom/discord/chat/listmanager/ListOperation$Insert;

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->addInsert(Lcom/discord/chat/listmanager/ListOperation$Insert;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    instance-of v0, p1, Lcom/discord/chat/listmanager/ListOperation$Remove;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    check-cast p1, Lcom/discord/chat/listmanager/ListOperation$Remove;

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->addRemove(Lcom/discord/chat/listmanager/ListOperation$Remove;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    instance-of v0, p1, Lcom/discord/chat/listmanager/ListOperation$Change;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    check-cast p1, Lcom/discord/chat/listmanager/ListOperation$Change;

    .line 45
    .line 46
    invoke-direct {p0, p1}, Lcom/discord/chat/listmanager/ListOperationsBuilder;->addChange(Lcom/discord/chat/listmanager/ListOperation$Change;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "invalid new operation for add: "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
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

.method public final build()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/listmanager/ListOperation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/listmanager/ListOperationsBuilder;->listOperations:Ljava/util/List;

    return-object v0
.end method
