.class public Lcom/horcrux/svg/SvgPackage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/ReactPackage;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createJSModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/react/bridge/JavaScriptModule;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public createNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Lcom/facebook/react/bridge/NativeModule;

    .line 3
    .line 4
    new-instance v1, Lcom/horcrux/svg/SvgViewModule;

    .line 5
    .line 6
    invoke-direct {v1, p1}, Lcom/horcrux/svg/SvgViewModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    new-instance v1, Lcom/horcrux/svg/RNSVGRenderableManager;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Lcom/horcrux/svg/RNSVGRenderableManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    aput-object v1, v0, p1

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 p1, 0x15

    .line 2
    .line 3
    new-array p1, p1, [Lcom/facebook/react/uimanager/ViewManager;

    .line 4
    .line 5
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$GroupViewManager;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$GroupViewManager;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object v0, p1, v1

    .line 12
    .line 13
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$PathViewManager;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$PathViewManager;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    aput-object v0, p1, v1

    .line 20
    .line 21
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$CircleViewManager;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$CircleViewManager;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    aput-object v0, p1, v1

    .line 28
    .line 29
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$EllipseViewManager;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$EllipseViewManager;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    aput-object v0, p1, v1

    .line 36
    .line 37
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$LineViewManager;

    .line 38
    .line 39
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$LineViewManager;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    aput-object v0, p1, v1

    .line 44
    .line 45
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$RectViewManager;

    .line 46
    .line 47
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$RectViewManager;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x5

    .line 51
    aput-object v0, p1, v1

    .line 52
    .line 53
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$TextViewManager;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$TextViewManager;-><init>()V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    aput-object v0, p1, v1

    .line 60
    .line 61
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$TSpanViewManager;

    .line 62
    .line 63
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$TSpanViewManager;-><init>()V

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x7

    .line 67
    aput-object v0, p1, v1

    .line 68
    .line 69
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$TextPathViewManager;

    .line 70
    .line 71
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$TextPathViewManager;-><init>()V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0x8

    .line 75
    .line 76
    aput-object v0, p1, v1

    .line 77
    .line 78
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$ImageViewManager;

    .line 79
    .line 80
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$ImageViewManager;-><init>()V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0x9

    .line 84
    .line 85
    aput-object v0, p1, v1

    .line 86
    .line 87
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$ClipPathViewManager;

    .line 88
    .line 89
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$ClipPathViewManager;-><init>()V

    .line 90
    .line 91
    .line 92
    const/16 v1, 0xa

    .line 93
    .line 94
    aput-object v0, p1, v1

    .line 95
    .line 96
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$DefsViewManager;

    .line 97
    .line 98
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$DefsViewManager;-><init>()V

    .line 99
    .line 100
    .line 101
    const/16 v1, 0xb

    .line 102
    .line 103
    aput-object v0, p1, v1

    .line 104
    .line 105
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$UseViewManager;

    .line 106
    .line 107
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$UseViewManager;-><init>()V

    .line 108
    .line 109
    .line 110
    const/16 v1, 0xc

    .line 111
    .line 112
    aput-object v0, p1, v1

    .line 113
    .line 114
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$SymbolManager;

    .line 115
    .line 116
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$SymbolManager;-><init>()V

    .line 117
    .line 118
    .line 119
    const/16 v1, 0xd

    .line 120
    .line 121
    aput-object v0, p1, v1

    .line 122
    .line 123
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;

    .line 124
    .line 125
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;-><init>()V

    .line 126
    .line 127
    .line 128
    const/16 v1, 0xe

    .line 129
    .line 130
    aput-object v0, p1, v1

    .line 131
    .line 132
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;

    .line 133
    .line 134
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;-><init>()V

    .line 135
    .line 136
    .line 137
    const/16 v1, 0xf

    .line 138
    .line 139
    aput-object v0, p1, v1

    .line 140
    .line 141
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$PatternManager;

    .line 142
    .line 143
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$PatternManager;-><init>()V

    .line 144
    .line 145
    .line 146
    const/16 v1, 0x10

    .line 147
    .line 148
    aput-object v0, p1, v1

    .line 149
    .line 150
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$MaskManager;

    .line 151
    .line 152
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$MaskManager;-><init>()V

    .line 153
    .line 154
    .line 155
    const/16 v1, 0x11

    .line 156
    .line 157
    aput-object v0, p1, v1

    .line 158
    .line 159
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$ForeignObjectManager;

    .line 160
    .line 161
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$ForeignObjectManager;-><init>()V

    .line 162
    .line 163
    .line 164
    const/16 v1, 0x12

    .line 165
    .line 166
    aput-object v0, p1, v1

    .line 167
    .line 168
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;

    .line 169
    .line 170
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;-><init>()V

    .line 171
    .line 172
    .line 173
    const/16 v1, 0x13

    .line 174
    .line 175
    aput-object v0, p1, v1

    .line 176
    .line 177
    new-instance v0, Lcom/horcrux/svg/SvgViewManager;

    .line 178
    .line 179
    invoke-direct {v0}, Lcom/horcrux/svg/SvgViewManager;-><init>()V

    .line 180
    .line 181
    .line 182
    const/16 v1, 0x14

    .line 183
    .line 184
    aput-object v0, p1, v1

    .line 185
    .line 186
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    return-object p1
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
.end method
