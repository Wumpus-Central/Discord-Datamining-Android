.class public final Lcom/discord/bridge/DCDPackageList;
.super Lcom/facebook/react/PackageList;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\u0008\u0012\u0004\u0012\u00020\u0007`\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/bridge/DCDPackageList;",
        "Lcom/facebook/react/PackageList;",
        "host",
        "Lcom/facebook/react/ReactNativeHost;",
        "(Lcom/facebook/react/ReactNativeHost;)V",
        "getPackages",
        "Ljava/util/ArrayList;",
        "Lcom/facebook/react/ReactPackage;",
        "Lkotlin/collections/ArrayList;",
        "app_canaryRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/ReactNativeHost;)V
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/PackageList;-><init>(Lcom/facebook/react/ReactNativeHost;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method public getPackages()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/ReactPackage;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/facebook/react/PackageList;->getPackages()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ld2/a;

    .line 6
    .line 7
    invoke-direct {v1}, Ld2/a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/reactnativecommunity/clipboard/a;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/reactnativecommunity/clipboard/a;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    new-instance v1, Lcom/imagepicker/c;

    .line 22
    .line 23
    invoke-direct {v1}, Lcom/imagepicker/c;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    new-instance v1, Lw4/a;

    .line 30
    .line 31
    invoke-direct {v1}, Lw4/a;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    new-instance v1, Lcom/reactnative/ivpusic/imagepicker/e;

    .line 38
    .line 39
    invoke-direct {v1}, Lcom/reactnative/ivpusic/imagepicker/e;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    new-instance v1, Lcom/BV/LinearGradient/a;

    .line 46
    .line 47
    invoke-direct {v1}, Lcom/BV/LinearGradient/a;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    new-instance v1, Lcom/airbnb/android/react/lottie/b;

    .line 54
    .line 55
    invoke-direct {v1}, Lcom/airbnb/android/react/lottie/b;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    new-instance v1, Lye/c;

    .line 62
    .line 63
    invoke-direct {v1}, Lye/c;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    new-instance v1, Lcom/discord/bridge/DCDPackageList$getPackages$1;

    .line 70
    .line 71
    invoke-direct {v1}, Lcom/discord/bridge/DCDPackageList$getPackages$1;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    new-instance v1, Lcom/reactnativecommunity/slider/c;

    .line 78
    .line 79
    invoke-direct {v1}, Lcom/reactnativecommunity/slider/c;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    new-instance v1, Lz2/c;

    .line 86
    .line 87
    invoke-direct {v1}, Lz2/c;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    new-instance v1, Lcom/swmansion/reanimated/ReanimatedPackage;

    .line 94
    .line 95
    invoke-direct {v1}, Lcom/swmansion/reanimated/ReanimatedPackage;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    new-instance v1, Lcom/reactnativecommunity/webview/e1;

    .line 102
    .line 103
    invoke-direct {v1}, Lcom/reactnativecommunity/webview/e1;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    new-instance v1, Lcom/henninghall/date_picker/b;

    .line 110
    .line 111
    invoke-direct {v1}, Lcom/henninghall/date_picker/b;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    new-instance v1, Lcom/reactnativedocumentpicker/b;

    .line 118
    .line 119
    invoke-direct {v1}, Lcom/reactnativedocumentpicker/b;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    new-instance v1, Ldf/a;

    .line 126
    .line 127
    invoke-direct {v1}, Ldf/a;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    new-instance v1, Lkk/a;

    .line 134
    .line 135
    invoke-direct {v1}, Lkk/a;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    new-instance v1, Lcom/mkuczera/a;

    .line 142
    .line 143
    invoke-direct {v1}, Lcom/mkuczera/a;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    new-instance v1, Lcom/swmansion/rnscreens/i;

    .line 150
    .line 151
    invoke-direct {v1}, Lcom/swmansion/rnscreens/i;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    new-instance v1, Lio/sentry/react/i;

    .line 158
    .line 159
    invoke-direct {v1}, Lio/sentry/react/i;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    new-instance v1, Lcom/th3rdwave/safeareacontext/b;

    .line 166
    .line 167
    invoke-direct {v1}, Lcom/th3rdwave/safeareacontext/b;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    new-instance v1, Lcom/horcrux/svg/SvgPackage;

    .line 174
    .line 175
    invoke-direct {v1}, Lcom/horcrux/svg/SvgPackage;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    new-instance v1, Lcom/mrousavy/camera/d;

    .line 182
    .line 183
    invoke-direct {v1}, Lcom/mrousavy/camera/d;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    new-instance v1, Lcom/shopify/reactnative/skia/RNSkiaPackage;

    .line 190
    .line 191
    invoke-direct {v1}, Lcom/shopify/reactnative/skia/RNSkiaPackage;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    new-instance v1, Lcom/reactnativepagerview/b;

    .line 198
    .line 199
    invoke-direct {v1}, Lcom/reactnativepagerview/b;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    sget-object v1, Lcom/discord/bridge/DCDModuleProvider;->INSTANCE:Lcom/discord/bridge/DCDModuleProvider;

    .line 206
    .line 207
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$2;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$2;

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$3;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$3;

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$4;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$4;

    .line 226
    .line 227
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$5;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$5;

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$6;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$6;

    .line 244
    .line 245
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$7;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$7;

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$8;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$8;

    .line 262
    .line 263
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$9;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$9;

    .line 271
    .line 272
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$10;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$10;

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$11;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$11;

    .line 289
    .line 290
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$12;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$12;

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$13;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$13;

    .line 307
    .line 308
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$14;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$14;

    .line 316
    .line 317
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$15;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$15;

    .line 325
    .line 326
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$16;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$16;

    .line 334
    .line 335
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$17;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$17;

    .line 343
    .line 344
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$18;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$18;

    .line 352
    .line 353
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$19;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$19;

    .line 361
    .line 362
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$20;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$20;

    .line 370
    .line 371
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$21;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$21;

    .line 379
    .line 380
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$22;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$22;

    .line 388
    .line 389
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$23;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$23;

    .line 397
    .line 398
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$24;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$24;

    .line 406
    .line 407
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$25;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$25;

    .line 415
    .line 416
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$26;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$26;

    .line 424
    .line 425
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$27;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$27;

    .line 433
    .line 434
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$28;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$28;

    .line 442
    .line 443
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$29;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$29;

    .line 451
    .line 452
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$30;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$30;

    .line 460
    .line 461
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$31;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$31;

    .line 469
    .line 470
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$32;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$32;

    .line 478
    .line 479
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$33;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$33;

    .line 487
    .line 488
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$34;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$34;

    .line 496
    .line 497
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$35;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$35;

    .line 505
    .line 506
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$36;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$36;

    .line 514
    .line 515
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$37;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$37;

    .line 523
    .line 524
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$38;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$38;

    .line 532
    .line 533
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$39;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$39;

    .line 541
    .line 542
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$40;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$40;

    .line 550
    .line 551
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$41;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$41;

    .line 559
    .line 560
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$42;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$42;

    .line 568
    .line 569
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$43;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$43;

    .line 577
    .line 578
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$44;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$44;

    .line 586
    .line 587
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$45;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$45;

    .line 595
    .line 596
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$46;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$46;

    .line 604
    .line 605
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$47;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$47;

    .line 613
    .line 614
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$48;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$48;

    .line 622
    .line 623
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$49;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$49;

    .line 631
    .line 632
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$50;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$50;

    .line 640
    .line 641
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$51;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$51;

    .line 649
    .line 650
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$52;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$52;

    .line 658
    .line 659
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    new-instance v2, Lcom/discord/chat/ChatPackage;

    .line 667
    .line 668
    invoke-direct {v2}, Lcom/discord/chat/ChatPackage;-><init>()V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    new-instance v2, Lcom/discord/react_gesture_handler/DiscordGestureHandlerPackage;

    .line 675
    .line 676
    invoke-direct {v2}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerPackage;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    new-instance v2, Lcom/discord/emoji_picker/react/EmojiPickerPackage;

    .line 683
    .line 684
    invoke-direct {v2}, Lcom/discord/emoji_picker/react/EmojiPickerPackage;-><init>()V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    new-instance v2, Lcom/discord/sticker_picker/react/StickerPickerPackage;

    .line 691
    .line 692
    invoke-direct {v2}, Lcom/discord/sticker_picker/react/StickerPickerPackage;-><init>()V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    new-instance v2, Lcom/discord/sticker/react/StickerPackage;

    .line 699
    .line 700
    invoke-direct {v2}, Lcom/discord/sticker/react/StickerPackage;-><init>()V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    new-instance v2, Lcom/discord/avatar/react/AvatarPackage;

    .line 707
    .line 708
    invoke-direct {v2}, Lcom/discord/avatar/react/AvatarPackage;-><init>()V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    new-instance v2, Lcom/discord/kvstorage/KvStoragePackage;

    .line 715
    .line 716
    invoke-direct {v2}, Lcom/discord/kvstorage/KvStoragePackage;-><init>()V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    sget-object v2, Lcom/discord/flipper/FlipperUtils;->INSTANCE:Lcom/discord/flipper/FlipperUtils;

    .line 723
    .line 724
    invoke-virtual {v2}, Lcom/discord/flipper/FlipperUtils;->getFlipperPackage()Lcom/facebook/react/ReactPackage;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$53;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$53;

    .line 732
    .line 733
    const/4 v3, 0x0

    .line 734
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$54;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$54;

    .line 742
    .line 743
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$55;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$55;

    .line 744
    .line 745
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$56;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$56;

    .line 753
    .line 754
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$57;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$57;

    .line 755
    .line 756
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$58;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$58;

    .line 764
    .line 765
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$59;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$59;

    .line 773
    .line 774
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$60;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$60;

    .line 775
    .line 776
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$61;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$61;

    .line 784
    .line 785
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$62;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$62;

    .line 786
    .line 787
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$63;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$63;

    .line 795
    .line 796
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$64;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$64;

    .line 804
    .line 805
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$65;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$65;

    .line 806
    .line 807
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$66;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$66;

    .line 815
    .line 816
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$67;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$67;

    .line 824
    .line 825
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    const-string v2, "RTNAudioRouteEmitter"

    .line 833
    .line 834
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$68;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$68;

    .line 835
    .line 836
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    const-string v2, "RTNDeviceManager"

    .line 844
    .line 845
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$69;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$69;

    .line 846
    .line 847
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    const-string v2, "RTNDeviceLocaleManager"

    .line 855
    .line 856
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$70;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$70;

    .line 857
    .line 858
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    const-string v2, "RTNFileManager"

    .line 866
    .line 867
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$71;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$71;

    .line 868
    .line 869
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    const-string v2, "RTNClientInfoManager"

    .line 877
    .line 878
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$72;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$72;

    .line 879
    .line 880
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    const-string v2, "RTNKeyboardManager"

    .line 888
    .line 889
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$73;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$73;

    .line 890
    .line 891
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    const-string v2, "RTNHeartbeatKeyProvider"

    .line 899
    .line 900
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$74;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$74;

    .line 901
    .line 902
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 903
    .line 904
    .line 905
    move-result-object v2

    .line 906
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    const-string v2, "RTNThemeManager"

    .line 910
    .line 911
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$75;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$75;

    .line 912
    .line 913
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    const-string v2, "RTNMobileVoiceOverlay"

    .line 921
    .line 922
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$76;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$76;

    .line 923
    .line 924
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 925
    .line 926
    .line 927
    move-result-object v1

    .line 928
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    const-string v1, "packages"

    .line 932
    .line 933
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    return-object v0
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
.end method
