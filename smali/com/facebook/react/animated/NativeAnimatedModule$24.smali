.class Lcom/facebook/react/animated/NativeAnimatedModule$24;
.super Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->queueAndExecuteBatchedOperations(Lcom/facebook/react/bridge/ReadableArray;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

.field final synthetic val$opBufferSize:I

.field final synthetic val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opBufferSize:I

    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/NativeAnimatedModule$1;)V

    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$700(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opBufferSize:I

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 12
    .line 13
    add-int/lit8 v2, v0, 0x1

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->fromId(I)Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lcom/facebook/react/animated/NativeAnimatedModule$25;->$SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes:[I

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    aget v0, v1, v0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    packed-switch v0, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    const-string v0, "Batch animation execution op: unknown op code"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 44
    .line 45
    add-int/lit8 v1, v2, 0x1

    .line 46
    .line 47
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 52
    .line 53
    add-int/lit8 v3, v1, 0x1

    .line 54
    .line 55
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 60
    .line 61
    add-int/lit8 v4, v3, 0x1

    .line 62
    .line 63
    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->addAnimatedEventToView(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 72
    .line 73
    add-int/lit8 v1, v2, 0x1

    .line 74
    .line 75
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 80
    .line 81
    add-int/lit8 v3, v1, 0x1

    .line 82
    .line 83
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->connectAnimatedNodeToView(II)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 93
    .line 94
    add-int/lit8 v1, v2, 0x1

    .line 95
    .line 96
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 101
    .line 102
    invoke-static {v2, v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$900(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 106
    .line 107
    add-int/lit8 v3, v1, 0x1

    .line 108
    .line 109
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 114
    .line 115
    add-int/lit8 v4, v3, 0x1

    .line 116
    .line 117
    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->removeAnimatedEventFromView(ILjava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    :goto_1
    move v0, v4

    .line 125
    goto :goto_0

    .line 126
    :pswitch_3
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 127
    .line 128
    add-int/lit8 v3, v2, 0x1

    .line 129
    .line 130
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 135
    .line 136
    add-int/lit8 v4, v3, 0x1

    .line 137
    .line 138
    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 143
    .line 144
    add-int/lit8 v5, v4, 0x1

    .line 145
    .line 146
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {p1, v0, v2, v3, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->startAnimatingNode(IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    .line 151
    .line 152
    .line 153
    move v0, v5

    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :pswitch_4
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 157
    .line 158
    add-int/lit8 v1, v2, 0x1

    .line 159
    .line 160
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 165
    .line 166
    add-int/lit8 v3, v1, 0x1

    .line 167
    .line 168
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 173
    .line 174
    invoke-static {v2, v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$900(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->disconnectAnimatedNodeFromView(II)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    :pswitch_5
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 183
    .line 184
    add-int/lit8 v1, v2, 0x1

    .line 185
    .line 186
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 191
    .line 192
    add-int/lit8 v3, v1, 0x1

    .line 193
    .line 194
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 195
    .line 196
    .line 197
    move-result-wide v1

    .line 198
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->setAnimatedNodeValue(ID)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_3

    .line 202
    .line 203
    :pswitch_6
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 204
    .line 205
    add-int/lit8 v1, v2, 0x1

    .line 206
    .line 207
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 212
    .line 213
    add-int/lit8 v3, v1, 0x1

    .line 214
    .line 215
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 216
    .line 217
    .line 218
    move-result-wide v1

    .line 219
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->setAnimatedNodeValue(ID)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_3

    .line 223
    .line 224
    :pswitch_7
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 225
    .line 226
    add-int/lit8 v1, v2, 0x1

    .line 227
    .line 228
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 233
    .line 234
    add-int/lit8 v3, v1, 0x1

    .line 235
    .line 236
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->disconnectAnimatedNodes(II)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_3

    .line 244
    .line 245
    :pswitch_8
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 246
    .line 247
    add-int/lit8 v1, v2, 0x1

    .line 248
    .line 249
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 254
    .line 255
    add-int/lit8 v3, v1, 0x1

    .line 256
    .line 257
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->connectAnimatedNodes(II)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_3

    .line 265
    .line 266
    :pswitch_9
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 267
    .line 268
    add-int/lit8 v1, v2, 0x1

    .line 269
    .line 270
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 275
    .line 276
    add-int/lit8 v3, v1, 0x1

    .line 277
    .line 278
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->updateAnimatedNodeConfig(ILcom/facebook/react/bridge/ReadableMap;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_3

    .line 286
    .line 287
    :pswitch_a
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 288
    .line 289
    add-int/lit8 v1, v2, 0x1

    .line 290
    .line 291
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 296
    .line 297
    add-int/lit8 v3, v1, 0x1

    .line 298
    .line 299
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->createAnimatedNode(ILcom/facebook/react/bridge/ReadableMap;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_3

    .line 307
    .line 308
    :pswitch_b
    add-int/lit8 v2, v2, 0x1

    .line 309
    .line 310
    move v0, v2

    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :pswitch_c
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 314
    .line 315
    add-int/lit8 v1, v2, 0x1

    .line 316
    .line 317
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    invoke-virtual {p1, v0}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->dropAnimatedNode(I)V

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :pswitch_d
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 326
    .line 327
    add-int/lit8 v1, v2, 0x1

    .line 328
    .line 329
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    invoke-virtual {p1, v0}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->restoreDefaultValues(I)V

    .line 334
    .line 335
    .line 336
    goto :goto_2

    .line 337
    :pswitch_e
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 338
    .line 339
    add-int/lit8 v1, v2, 0x1

    .line 340
    .line 341
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    invoke-virtual {p1, v0}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->extractAnimatedNodeOffset(I)V

    .line 346
    .line 347
    .line 348
    goto :goto_2

    .line 349
    :pswitch_f
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 350
    .line 351
    add-int/lit8 v1, v2, 0x1

    .line 352
    .line 353
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    invoke-virtual {p1, v0}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->flattenAnimatedNodeOffset(I)V

    .line 358
    .line 359
    .line 360
    goto :goto_2

    .line 361
    :pswitch_10
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 362
    .line 363
    add-int/lit8 v1, v2, 0x1

    .line 364
    .line 365
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    invoke-virtual {p1, v0}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->stopAnimation(I)V

    .line 370
    .line 371
    .line 372
    goto :goto_2

    .line 373
    :pswitch_11
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 374
    .line 375
    add-int/lit8 v1, v2, 0x1

    .line 376
    .line 377
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    invoke-virtual {p1, v0}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->stopListeningToAnimatedNodeValue(I)V

    .line 382
    .line 383
    .line 384
    goto :goto_2

    .line 385
    :pswitch_12
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 386
    .line 387
    add-int/lit8 v1, v2, 0x1

    .line 388
    .line 389
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    new-instance v2, Lcom/facebook/react/animated/NativeAnimatedModule$24$1;

    .line 394
    .line 395
    invoke-direct {v2, p0, v0}, Lcom/facebook/react/animated/NativeAnimatedModule$24$1;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule$24;I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p1, v0, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->startListeningToAnimatedNodeValue(ILcom/facebook/react/animated/AnimatedNodeValueListener;)V

    .line 399
    .line 400
    .line 401
    :goto_2
    move v0, v1

    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :pswitch_13
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$24;->val$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 405
    .line 406
    add-int/lit8 v3, v2, 0x1

    .line 407
    .line 408
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getValue(ILcom/facebook/react/bridge/Callback;)V

    .line 413
    .line 414
    .line 415
    :goto_3
    move v0, v3

    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :cond_0
    return-void

    .line 419
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method
