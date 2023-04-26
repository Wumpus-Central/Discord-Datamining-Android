.class final enum Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "BatchExecutionOpCodes"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_ADD_LISTENER:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_CONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_CREATE_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_DISCONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_DROP_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_GET_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_REMOVE_LISTENERS:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_RESTORE_DEFAULT_VALUES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_SET_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_SET_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_START_ANIMATING_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_STOP_ANIMATION:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_UPDATE_ANIMATED_NODE_CONFIG:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_START_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field private static valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 2
    .line 3
    const-string v1, "OP_CODE_CREATE_ANIMATED_NODE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CREATE_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 11
    .line 12
    new-instance v1, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 13
    .line 14
    const-string v4, "OP_CODE_UPDATE_ANIMATED_NODE_CONFIG"

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v1, v4, v3, v5}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_UPDATE_ANIMATED_NODE_CONFIG:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 21
    .line 22
    new-instance v4, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 23
    .line 24
    const-string v6, "OP_CODE_GET_VALUE"

    .line 25
    .line 26
    const/4 v7, 0x3

    .line 27
    invoke-direct {v4, v6, v5, v7}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v4, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_GET_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 31
    .line 32
    new-instance v6, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 33
    .line 34
    const-string v8, "OP_START_LISTENING_TO_ANIMATED_NODE_VALUE"

    .line 35
    .line 36
    const/4 v9, 0x4

    .line 37
    invoke-direct {v6, v8, v7, v9}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v6, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_START_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 41
    .line 42
    new-instance v8, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 43
    .line 44
    const-string v10, "OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE"

    .line 45
    .line 46
    const/4 v11, 0x5

    .line 47
    invoke-direct {v8, v10, v9, v11}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v8, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 51
    .line 52
    new-instance v10, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 53
    .line 54
    const-string v12, "OP_CODE_CONNECT_ANIMATED_NODES"

    .line 55
    .line 56
    const/4 v13, 0x6

    .line 57
    invoke-direct {v10, v12, v11, v13}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 58
    .line 59
    .line 60
    sput-object v10, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 61
    .line 62
    new-instance v12, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 63
    .line 64
    const-string v14, "OP_CODE_DISCONNECT_ANIMATED_NODES"

    .line 65
    .line 66
    const/4 v15, 0x7

    .line 67
    invoke-direct {v12, v14, v13, v15}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 68
    .line 69
    .line 70
    sput-object v12, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DISCONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 71
    .line 72
    new-instance v14, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 73
    .line 74
    const-string v13, "OP_CODE_START_ANIMATING_NODE"

    .line 75
    .line 76
    const/16 v11, 0x8

    .line 77
    .line 78
    invoke-direct {v14, v13, v15, v11}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    .line 81
    sput-object v14, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_START_ANIMATING_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 82
    .line 83
    new-instance v13, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 84
    .line 85
    const-string v15, "OP_CODE_STOP_ANIMATION"

    .line 86
    .line 87
    const/16 v9, 0x9

    .line 88
    .line 89
    invoke-direct {v13, v15, v11, v9}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    .line 92
    sput-object v13, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_STOP_ANIMATION:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 93
    .line 94
    new-instance v15, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 95
    .line 96
    const-string v11, "OP_CODE_SET_ANIMATED_NODE_VALUE"

    .line 97
    .line 98
    const/16 v7, 0xa

    .line 99
    .line 100
    invoke-direct {v15, v11, v9, v7}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 101
    .line 102
    .line 103
    sput-object v15, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_SET_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 104
    .line 105
    new-instance v11, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 106
    .line 107
    const-string v9, "OP_CODE_SET_ANIMATED_NODE_OFFSET"

    .line 108
    .line 109
    const/16 v5, 0xb

    .line 110
    .line 111
    invoke-direct {v11, v9, v7, v5}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 112
    .line 113
    .line 114
    sput-object v11, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_SET_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 115
    .line 116
    new-instance v9, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 117
    .line 118
    const-string v7, "OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET"

    .line 119
    .line 120
    const/16 v3, 0xc

    .line 121
    .line 122
    invoke-direct {v9, v7, v5, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 123
    .line 124
    .line 125
    sput-object v9, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 126
    .line 127
    new-instance v7, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 128
    .line 129
    const-string v5, "OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET"

    .line 130
    .line 131
    const/16 v2, 0xd

    .line 132
    .line 133
    invoke-direct {v7, v5, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    sput-object v7, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 137
    .line 138
    new-instance v5, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 139
    .line 140
    const-string v3, "OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW"

    .line 141
    .line 142
    move-object/from16 v16, v7

    .line 143
    .line 144
    const/16 v7, 0xe

    .line 145
    .line 146
    invoke-direct {v5, v3, v2, v7}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 147
    .line 148
    .line 149
    sput-object v5, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 150
    .line 151
    new-instance v3, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 152
    .line 153
    const-string v2, "OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW"

    .line 154
    .line 155
    move-object/from16 v17, v5

    .line 156
    .line 157
    const/16 v5, 0xf

    .line 158
    .line 159
    invoke-direct {v3, v2, v7, v5}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 160
    .line 161
    .line 162
    sput-object v3, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 163
    .line 164
    new-instance v2, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 165
    .line 166
    const-string v7, "OP_CODE_RESTORE_DEFAULT_VALUES"

    .line 167
    .line 168
    move-object/from16 v18, v3

    .line 169
    .line 170
    const/16 v3, 0x10

    .line 171
    .line 172
    invoke-direct {v2, v7, v5, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 173
    .line 174
    .line 175
    sput-object v2, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_RESTORE_DEFAULT_VALUES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 176
    .line 177
    new-instance v7, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 178
    .line 179
    const-string v5, "OP_CODE_DROP_ANIMATED_NODE"

    .line 180
    .line 181
    move-object/from16 v19, v2

    .line 182
    .line 183
    const/16 v2, 0x11

    .line 184
    .line 185
    invoke-direct {v7, v5, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 186
    .line 187
    .line 188
    sput-object v7, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DROP_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 189
    .line 190
    new-instance v5, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 191
    .line 192
    const-string v3, "OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW"

    .line 193
    .line 194
    move-object/from16 v20, v7

    .line 195
    .line 196
    const/16 v7, 0x12

    .line 197
    .line 198
    invoke-direct {v5, v3, v2, v7}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 199
    .line 200
    .line 201
    sput-object v5, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 202
    .line 203
    new-instance v3, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 204
    .line 205
    const-string v2, "OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW"

    .line 206
    .line 207
    move-object/from16 v21, v5

    .line 208
    .line 209
    const/16 v5, 0x13

    .line 210
    .line 211
    invoke-direct {v3, v2, v7, v5}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 212
    .line 213
    .line 214
    sput-object v3, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 215
    .line 216
    new-instance v2, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 217
    .line 218
    const-string v7, "OP_CODE_ADD_LISTENER"

    .line 219
    .line 220
    move-object/from16 v22, v3

    .line 221
    .line 222
    const/16 v3, 0x14

    .line 223
    .line 224
    invoke-direct {v2, v7, v5, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 225
    .line 226
    .line 227
    sput-object v2, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_ADD_LISTENER:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 228
    .line 229
    new-instance v7, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 230
    .line 231
    const-string v5, "OP_CODE_REMOVE_LISTENERS"

    .line 232
    .line 233
    move-object/from16 v23, v2

    .line 234
    .line 235
    const/16 v2, 0x15

    .line 236
    .line 237
    invoke-direct {v7, v5, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 238
    .line 239
    .line 240
    sput-object v7, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_REMOVE_LISTENERS:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 241
    .line 242
    new-array v2, v2, [Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 243
    .line 244
    const/4 v5, 0x0

    .line 245
    aput-object v0, v2, v5

    .line 246
    .line 247
    const/4 v0, 0x1

    .line 248
    aput-object v1, v2, v0

    .line 249
    .line 250
    const/4 v0, 0x2

    .line 251
    aput-object v4, v2, v0

    .line 252
    .line 253
    const/4 v0, 0x3

    .line 254
    aput-object v6, v2, v0

    .line 255
    .line 256
    const/4 v0, 0x4

    .line 257
    aput-object v8, v2, v0

    .line 258
    .line 259
    const/4 v0, 0x5

    .line 260
    aput-object v10, v2, v0

    .line 261
    .line 262
    const/4 v0, 0x6

    .line 263
    aput-object v12, v2, v0

    .line 264
    .line 265
    const/4 v0, 0x7

    .line 266
    aput-object v14, v2, v0

    .line 267
    .line 268
    const/16 v0, 0x8

    .line 269
    .line 270
    aput-object v13, v2, v0

    .line 271
    .line 272
    const/16 v0, 0x9

    .line 273
    .line 274
    aput-object v15, v2, v0

    .line 275
    .line 276
    const/16 v0, 0xa

    .line 277
    .line 278
    aput-object v11, v2, v0

    .line 279
    .line 280
    const/16 v0, 0xb

    .line 281
    .line 282
    aput-object v9, v2, v0

    .line 283
    .line 284
    const/16 v0, 0xc

    .line 285
    .line 286
    aput-object v16, v2, v0

    .line 287
    .line 288
    const/16 v0, 0xd

    .line 289
    .line 290
    aput-object v17, v2, v0

    .line 291
    .line 292
    const/16 v0, 0xe

    .line 293
    .line 294
    aput-object v18, v2, v0

    .line 295
    .line 296
    const/16 v0, 0xf

    .line 297
    .line 298
    aput-object v19, v2, v0

    .line 299
    .line 300
    const/16 v0, 0x10

    .line 301
    .line 302
    aput-object v20, v2, v0

    .line 303
    .line 304
    const/16 v0, 0x11

    .line 305
    .line 306
    aput-object v21, v2, v0

    .line 307
    .line 308
    const/16 v0, 0x12

    .line 309
    .line 310
    aput-object v22, v2, v0

    .line 311
    .line 312
    const/16 v0, 0x13

    .line 313
    .line 314
    aput-object v23, v2, v0

    .line 315
    .line 316
    aput-object v7, v2, v3

    .line 317
    .line 318
    sput-object v2, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->$VALUES:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 319
    .line 320
    const/4 v0, 0x0

    .line 321
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 322
    .line 323
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->value:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public static fromId(I)Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->values()[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 12
    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    aget-object p0, v0, p0

    .line 16
    .line 17
    return-object p0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
    .locals 1

    const-class v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
    .locals 1

    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->$VALUES:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    invoke-virtual {v0}, [Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->value:I

    return v0
.end method
