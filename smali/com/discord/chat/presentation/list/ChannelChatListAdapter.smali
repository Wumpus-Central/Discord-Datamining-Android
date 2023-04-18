.class public final Lcom/discord/chat/presentation/list/ChannelChatListAdapter;
.super Lcom/discord/chat/presentation/list/BaseChatListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;,
        Lcom/discord/chat/presentation/list/ChannelChatListAdapter$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u00016BS\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\u0010\u0007\u001a\u000c\u0012\u0004\u0012\u00020\u00080\u0003j\u0002`\t\u0012\u0010\u0010\n\u001a\u000c\u0012\u0004\u0012\u00020\u000b0\u0003j\u0002`\u000c\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001bH\u0003J\u0006\u0010\u001e\u001a\u00020\u0011J\u0008\u0010\u001f\u001a\u00020\u0004H\u0007J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020!H\u0003J\u0008\u0010\"\u001a\u00020\u0004H\u0003J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001bH\u0003J\u0016\u0010&\u001a\u00020\u00042\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(H\u0017JB\u0010&\u001a\u00020\u00042\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010(2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0007J*\u0010.\u001a\u00020\u00042\u0008\u0010/\u001a\u0004\u0018\u0001002\u0016\u0008\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u000102H\u0007J\u0016\u00103\u001a\u00020\u00132\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00020+0(H\u0002J\u0008\u00105\u001a\u00020\u0004H\u0002R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"
    }
    d2 = {
        "Lcom/discord/chat/presentation/list/ChannelChatListAdapter;",
        "Lcom/discord/chat/presentation/list/BaseChatListAdapter;",
        "doLayout",
        "Lkotlin/Function0;",
        "",
        "enableAnimations",
        "disableAnimations",
        "eventHandlerProvider",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;",
        "messageComponentProvider",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "getDoLayout",
        "()Lkotlin/jvm/functions/Function0;",
        "firstMessageItemPosition",
        "",
        "isProcessingUpdate",
        "",
        "portalChatListItem",
        "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;",
        "processNextUpdateJob",
        "Lkotlinx/coroutines/Job;",
        "updateCount",
        "updateQueue",
        "Ljava/util/Queue;",
        "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;",
        "enqueueUpdate",
        "update",
        "getFirstMessageItemPosition",
        "onHostDetached",
        "processChatListItemUpdate",
        "Lcom/discord/chat/presentation/list/ChatListItemUpdate;",
        "processNextUpdate",
        "processPortalViewUpdate",
        "Lcom/discord/chat/presentation/list/PortalViewUpdate;",
        "processUpdate",
        "setItems",
        "items",
        "",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "listOperations",
        "Lcom/discord/chat/listmanager/ListOperation;",
        "preCommit",
        "postCommit",
        "setPortalView",
        "portalView",
        "Landroid/view/View;",
        "measuredDimensions",
        "Lkotlin/Pair;",
        "shouldAnimateOperations",
        "operations",
        "syncFirstMessageItemPosition",
        "PortalViewUpdateType",
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
.field private final disableAnimations:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final doLayout:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final enableAnimations:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private firstMessageItemPosition:I

.field private isProcessingUpdate:Z

.field private portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

.field private processNextUpdateJob:Lkotlinx/coroutines/Job;

.field private updateCount:I

.field private final updateQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/discord/chat/presentation/events/ChatEventHandler;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "doLayout"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enableAnimations"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "disableAnimations"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "eventHandlerProvider"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "messageComponentProvider"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p4, p5}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->doLayout:Lkotlin/jvm/functions/Function0;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->enableAnimations:Lkotlin/jvm/functions/Function0;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->disableAnimations:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    const/4 p1, -0x1

    .line 36
    iput p1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->firstMessageItemPosition:I

    .line 37
    .line 38
    new-instance p1, Ljava/util/LinkedList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->updateQueue:Ljava/util/Queue;

    .line 44
    .line 45
    return-void
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
.end method

.method public static final synthetic access$getProcessNextUpdateJob$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Lkotlinx/coroutines/Job;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->processNextUpdateJob:Lkotlinx/coroutines/Job;

    return-object p0
.end method

.method public static final synthetic access$getUpdateQueue$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Ljava/util/Queue;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->updateQueue:Ljava/util/Queue;

    return-object p0
.end method

.method public static final synthetic access$isProcessingUpdate$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->isProcessingUpdate:Z

    return p0
.end method

.method public static final synthetic access$processChatListItemUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lcom/discord/chat/presentation/list/ChatListItemUpdate;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->processChatListItemUpdate(Lcom/discord/chat/presentation/list/ChatListItemUpdate;)V

    return-void
.end method

.method public static final synthetic access$processNextUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->processNextUpdate()V

    return-void
.end method

.method public static final synthetic access$processPortalViewUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lcom/discord/chat/presentation/list/PortalViewUpdate;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->processPortalViewUpdate(Lcom/discord/chat/presentation/list/PortalViewUpdate;)V

    return-void
.end method

.method public static final synthetic access$processUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->processUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V

    return-void
.end method

.method public static final synthetic access$setProcessNextUpdateJob$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lkotlinx/coroutines/Job;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->processNextUpdateJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$setProcessingUpdate$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->isProcessingUpdate:Z

    return-void
.end method

.method public static final synthetic access$syncFirstMessageItemPosition(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->syncFirstMessageItemPosition()V

    return-void
.end method

.method private final enqueueUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$getUpdateQueue$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Ljava/util/Queue;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$getUpdateQueue$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Ljava/util/Queue;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v0, 0x1

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$isProcessingUpdate$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$processNextUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v1, "Expected to be on android main thread. Current: "

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0
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

.method private final processChatListItemUpdate(Lcom/discord/chat/presentation/list/ChatListItemUpdate;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChatListItemUpdate;->getItems()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v4, "items"

    .line 12
    .line 13
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v1, Ljava/util/Collection;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    xor-int/2addr v1, v3

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast v1, Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v1}, Lkotlin/collections/h;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    instance-of v1, v1, Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    move v1, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v1, v2

    .line 47
    :goto_0
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/collections/h;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    instance-of v4, v4, Lcom/discord/chat/presentation/list/item/LoadingChatListItem;

    .line 54
    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    move v4, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move v4, v2

    .line 60
    :goto_1
    if-eqz v4, :cond_2

    .line 61
    .line 62
    iget-object v5, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 63
    .line 64
    invoke-static {v5}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v5}, Lkotlin/collections/h;->p0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :cond_2
    invoke-virtual {p0, v0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->setChatListItems$chat_release(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-super {p0, v0}, Lcom/hannesdorfmann/adapterdelegates4/a;->setItems(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    if-nez v4, :cond_3

    .line 84
    .line 85
    move v2, v3

    .line 86
    :cond_3
    if-eqz v2, :cond_4

    .line 87
    .line 88
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->disableAnimations:Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_4
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChatListItemUpdate;->getListOperations()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_c

    .line 103
    .line 104
    sget-object v0, Lcom/discord/chat/presentation/root/ChatView;->Companion:Lcom/discord/chat/presentation/root/ChatView$Companion;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChatListItemUpdate;->getListOperations()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-direct {p0, v0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->shouldAnimateOperations(Ljava/util/List;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->enableAnimations:Lkotlin/jvm/functions/Function0;

    .line 123
    .line 124
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->disableAnimations:Lkotlin/jvm/functions/Function0;

    .line 129
    .line 130
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :goto_2
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChatListItemUpdate;->getListOperations()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_d

    .line 146
    .line 147
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation;

    .line 152
    .line 153
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$Change;

    .line 154
    .line 155
    if-eqz v1, :cond_7

    .line 156
    .line 157
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$Change;

    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Change;->getIndex()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_7
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$Insert;

    .line 168
    .line 169
    if-eqz v1, :cond_8

    .line 170
    .line 171
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$Insert;

    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Insert;->getIndex()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$Remove;

    .line 182
    .line 183
    if-eqz v1, :cond_9

    .line 184
    .line 185
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$Remove;

    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$Remove;->getIndex()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_9
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 196
    .line 197
    if-eqz v1, :cond_a

    .line 198
    .line 199
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;->getFirst()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;->getCount()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {p0, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_a
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 214
    .line 215
    if-eqz v1, :cond_b

    .line 216
    .line 217
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$InsertRange;

    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;->getFirst()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$InsertRange;->getCount()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-virtual {p0, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeInserted(II)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_b
    instance-of v1, v0, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 232
    .line 233
    if-eqz v1, :cond_6

    .line 234
    .line 235
    check-cast v0, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;

    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;->getFirst()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ListOperation$RemoveRange;->getCount()I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-virtual {p0, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeRemoved(II)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 250
    .line 251
    .line 252
    :cond_d
    :goto_4
    return-void
.end method

.method private final processNextUpdate()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$getUpdateQueue$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Ljava/util/Queue;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$getUpdateQueue$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Ljava/util/Queue;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "updateQueue.remove()"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v0, Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;

    .line 33
    .line 34
    invoke-static {p0, v0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$processUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v2, "Expected to be on android main thread. Current: "

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method private final processPortalViewUpdate(Lcom/discord/chat/presentation/list/PortalViewUpdate;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->disableAnimations:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lkotlin/collections/h;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v0, v0, Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getPortalChatListItem()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move v1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-eqz v1, :cond_1

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    sget-object v0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;->ADD:Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;->CHANGE:Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-nez v1, :cond_9

    .line 41
    .line 42
    if-eqz v0, :cond_9

    .line 43
    .line 44
    sget-object v0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;->REMOVE:Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;

    .line 45
    .line 46
    :goto_1
    sget-object v1, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    aget v3, v1, v3

    .line 53
    .line 54
    const/4 v4, 0x3

    .line 55
    const/4 v5, 0x2

    .line 56
    if-eq v3, v2, :cond_5

    .line 57
    .line 58
    if-eq v3, v5, :cond_4

    .line 59
    .line 60
    if-ne v3, v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3}, Lkotlin/collections/h;->F0(Ljava/util/Collection;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {v6}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getPortalChatListItem()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v3, v6, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    new-instance p1, Llf/q;

    .line 90
    .line 91
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_4
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1, v2}, Lkotlin/collections/h;->P(Ljava/util/List;I)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getPortalChatListItem()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v3, p1}, Lkotlin/collections/h;->p0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    :goto_2
    invoke-virtual {p0, v3}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->setChatListItems$chat_release(Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-super {p0, p1}, Lcom/hannesdorfmann/adapterdelegates4/a;->setItems(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    aget p1, v1, p1

    .line 134
    .line 135
    if-eq p1, v2, :cond_8

    .line 136
    .line 137
    if-eq p1, v5, :cond_7

    .line 138
    .line 139
    if-eq p1, v4, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    add-int/2addr p1, v2

    .line 163
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_8
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1}, Lkotlin/collections/h;->k(Ljava/util/List;)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    .line 176
    .line 177
    .line 178
    :cond_9
    :goto_3
    return-void
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

.method private final processUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p0, v0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$setProcessingUpdate$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;->getPreCommit()Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    instance-of v0, p1, Lcom/discord/chat/presentation/list/PortalViewUpdate;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    check-cast v0, Lcom/discord/chat/presentation/list/PortalViewUpdate;

    .line 24
    .line 25
    invoke-static {p0, v0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$processPortalViewUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lcom/discord/chat/presentation/list/PortalViewUpdate;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of v0, p1, Lcom/discord/chat/presentation/list/ChatListItemUpdate;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v0, p1

    .line 34
    check-cast v0, Lcom/discord/chat/presentation/list/ChatListItemUpdate;

    .line 35
    .line 36
    invoke-static {p0, v0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$processChatListItemUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lcom/discord/chat/presentation/list/ChatListItemUpdate;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    sget-object v0, Lcom/discord/chat/presentation/root/ChatView;->Companion:Lcom/discord/chat/presentation/root/ChatView$Companion;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;->getPostCommit()Lkotlin/jvm/functions/Function0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->getDoLayout()Lkotlin/jvm/functions/Function0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$syncFirstMessageItemPosition(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;->getPostCommit()Lkotlin/jvm/functions/Function0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-static {}, Lkotlinx/coroutines/k0;->b()Lkotlinx/coroutines/CoroutineScope;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v1, 0x0

    .line 82
    const/4 v2, 0x0

    .line 83
    new-instance v3, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$processUpdate$1$1;

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    invoke-direct {v3, p0, p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$processUpdate$1$1;-><init>(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lkotlin/coroutines/Continuation;)V

    .line 87
    .line 88
    .line 89
    const/4 v4, 0x3

    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p0, p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$setProcessNextUpdateJob$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lkotlinx/coroutines/Job;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v1, "Expected to be on android main thread. Current: "

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v0
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

.method public static synthetic setPortalView$default(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Landroid/view/View;Lkotlin/Pair;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->setPortalView(Landroid/view/View;Lkotlin/Pair;)V

    return-void
.end method

.method private final shouldAnimateOperations(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/listmanager/ListOperation;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/collections/h;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/discord/chat/listmanager/ListOperation;

    .line 19
    .line 20
    instance-of v0, p1, Lcom/discord/chat/listmanager/ListOperation$Change;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    instance-of v0, p1, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p1, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/discord/chat/listmanager/ListOperation$ChangeRange;->getCount()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v0, 0x2

    .line 35
    if-le p1, v0, :cond_2

    .line 36
    .line 37
    :cond_1
    move v1, v2

    .line 38
    :cond_2
    return v1
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

.method private final syncFirstMessageItemPosition()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/BaseChatListAdapter;->getChatListItems$chat_release()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, -0x1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/discord/chat/presentation/list/item/ChatListItem;

    .line 25
    .line 26
    instance-of v1, v1, Lcom/discord/chat/presentation/list/item/MessageItem;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v0, v2

    .line 36
    :goto_0
    if-ne v0, v2, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v2, v0

    .line 40
    :goto_1
    iput v2, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->firstMessageItemPosition:I

    .line 41
    .line 42
    return-void
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


# virtual methods
.method public final getDoLayout()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->doLayout:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getFirstMessageItemPosition()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->firstMessageItemPosition:I

    return v0
.end method

.method public final onHostDetached()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$getProcessNextUpdateJob$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;)Lkotlinx/coroutines/Job;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$a;->a(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0, v1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$setProcessNextUpdateJob$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Lkotlinx/coroutines/Job;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->access$setProcessingUpdate$p(Lcom/discord/chat/presentation/list/ChannelChatListAdapter;Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "Expected to be on android main thread. Current: "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1
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

.method public bridge synthetic setItems(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->setItems(Ljava/util/List;)V

    return-void
.end method

.method public setItems(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/list/item/ChatListItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$setItems$1;->INSTANCE:Lcom/discord/chat/presentation/list/ChannelChatListAdapter$setItems$1;

    sget-object v1, Lcom/discord/chat/presentation/list/ChannelChatListAdapter$setItems$2;->INSTANCE:Lcom/discord/chat/presentation/list/ChannelChatListAdapter$setItems$2;

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v0, v1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->setItems(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public final setItems(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/list/item/ChatListItem;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/listmanager/ListOperation;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preCommit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postCommit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/discord/chat/presentation/list/ChatListItemUpdate;

    .line 4
    iget v1, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->updateCount:I

    add-int/lit8 v4, v1, 0x1

    iput v4, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->updateCount:I

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    .line 5
    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/list/ChatListItemUpdate;-><init>(Ljava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 6
    invoke-direct {p0, v0}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->enqueueUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V

    return-void
.end method

.method public final setPortalView(Landroid/view/View;Lkotlin/Pair;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 4
    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "randomUUID().toString()"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1, p2}, Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;-><init>(Ljava/lang/String;Landroid/view/View;Lkotlin/Pair;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    iput-object v0, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 24
    .line 25
    new-instance p1, Lcom/discord/chat/presentation/list/PortalViewUpdate;

    .line 26
    .line 27
    iget p2, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->updateCount:I

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    iput p2, p0, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->updateCount:I

    .line 32
    .line 33
    invoke-direct {p1, v0, p2}, Lcom/discord/chat/presentation/list/PortalViewUpdate;-><init>(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/list/ChannelChatListAdapter;->enqueueUpdate(Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V

    .line 37
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
.end method
