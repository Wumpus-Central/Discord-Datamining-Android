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
    new-instance v1, Lc2/a;

    .line 6
    .line 7
    invoke-direct {v1}, Lc2/a;-><init>()V

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
    new-instance v1, Lv4/a;

    .line 30
    .line 31
    invoke-direct {v1}, Lv4/a;-><init>()V

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
    new-instance v1, Lxe/c;

    .line 62
    .line 63
    invoke-direct {v1}, Lxe/c;-><init>()V

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
    new-instance v1, Ly2/c;

    .line 86
    .line 87
    invoke-direct {v1}, Ly2/c;-><init>()V

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
    new-instance v1, Lbf/a;

    .line 126
    .line 127
    invoke-direct {v1}, Lbf/a;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    new-instance v1, Lik/a;

    .line 134
    .line 135
    invoke-direct {v1}, Lik/a;-><init>()V

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
    sget-object v1, Lcom/discord/bridge/DCDModuleProvider;->INSTANCE:Lcom/discord/bridge/DCDModuleProvider;

    .line 198
    .line 199
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$2;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$2;

    .line 200
    .line 201
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$3;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$3;

    .line 209
    .line 210
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$4;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$4;

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$5;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$5;

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$6;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$6;

    .line 236
    .line 237
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$7;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$7;

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$8;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$8;

    .line 254
    .line 255
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$9;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$9;

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$10;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$10;

    .line 272
    .line 273
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$11;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$11;

    .line 281
    .line 282
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$12;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$12;

    .line 290
    .line 291
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$13;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$13;

    .line 299
    .line 300
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$14;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$14;

    .line 308
    .line 309
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$15;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$15;

    .line 317
    .line 318
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$16;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$16;

    .line 326
    .line 327
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$17;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$17;

    .line 335
    .line 336
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$18;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$18;

    .line 344
    .line 345
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$19;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$19;

    .line 353
    .line 354
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$20;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$20;

    .line 362
    .line 363
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$21;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$21;

    .line 371
    .line 372
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$22;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$22;

    .line 380
    .line 381
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$23;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$23;

    .line 389
    .line 390
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$24;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$24;

    .line 398
    .line 399
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$25;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$25;

    .line 407
    .line 408
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$26;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$26;

    .line 416
    .line 417
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$27;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$27;

    .line 425
    .line 426
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$28;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$28;

    .line 434
    .line 435
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$29;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$29;

    .line 443
    .line 444
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$30;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$30;

    .line 452
    .line 453
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$31;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$31;

    .line 461
    .line 462
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$32;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$32;

    .line 470
    .line 471
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$33;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$33;

    .line 479
    .line 480
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$34;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$34;

    .line 488
    .line 489
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$35;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$35;

    .line 497
    .line 498
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$36;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$36;

    .line 506
    .line 507
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$37;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$37;

    .line 515
    .line 516
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$38;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$38;

    .line 524
    .line 525
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$39;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$39;

    .line 533
    .line 534
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$40;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$40;

    .line 542
    .line 543
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$41;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$41;

    .line 551
    .line 552
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$42;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$42;

    .line 560
    .line 561
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$43;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$43;

    .line 569
    .line 570
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$44;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$44;

    .line 578
    .line 579
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$45;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$45;

    .line 587
    .line 588
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$46;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$46;

    .line 596
    .line 597
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$47;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$47;

    .line 605
    .line 606
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$48;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$48;

    .line 614
    .line 615
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$49;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$49;

    .line 623
    .line 624
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$50;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$50;

    .line 632
    .line 633
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$51;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$51;

    .line 641
    .line 642
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$52;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$52;

    .line 650
    .line 651
    invoke-virtual {v1, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    new-instance v2, Lcom/discord/chat/ChatPackage;

    .line 659
    .line 660
    invoke-direct {v2}, Lcom/discord/chat/ChatPackage;-><init>()V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    new-instance v2, Lcom/discord/react_gesture_handler/DiscordGestureHandlerPackage;

    .line 667
    .line 668
    invoke-direct {v2}, Lcom/discord/react_gesture_handler/DiscordGestureHandlerPackage;-><init>()V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    new-instance v2, Lcom/discord/emoji_picker/react/EmojiPickerPackage;

    .line 675
    .line 676
    invoke-direct {v2}, Lcom/discord/emoji_picker/react/EmojiPickerPackage;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    new-instance v2, Lcom/discord/sticker_picker/react/StickerPickerPackage;

    .line 683
    .line 684
    invoke-direct {v2}, Lcom/discord/sticker_picker/react/StickerPickerPackage;-><init>()V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    new-instance v2, Lcom/discord/sticker/react/StickerPackage;

    .line 691
    .line 692
    invoke-direct {v2}, Lcom/discord/sticker/react/StickerPackage;-><init>()V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    new-instance v2, Lcom/discord/avatar/react/AvatarPackage;

    .line 699
    .line 700
    invoke-direct {v2}, Lcom/discord/avatar/react/AvatarPackage;-><init>()V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    new-instance v2, Lcom/discord/kvstorage/KvStoragePackage;

    .line 707
    .line 708
    invoke-direct {v2}, Lcom/discord/kvstorage/KvStoragePackage;-><init>()V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    sget-object v2, Lcom/discord/flipper/FlipperUtils;->INSTANCE:Lcom/discord/flipper/FlipperUtils;

    .line 715
    .line 716
    invoke-virtual {v2}, Lcom/discord/flipper/FlipperUtils;->getFlipperPackage()Lcom/facebook/react/ReactPackage;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$53;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$53;

    .line 724
    .line 725
    const/4 v3, 0x0

    .line 726
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$54;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$54;

    .line 734
    .line 735
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$55;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$55;

    .line 736
    .line 737
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$56;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$56;

    .line 745
    .line 746
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$57;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$57;

    .line 747
    .line 748
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$58;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$58;

    .line 756
    .line 757
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$59;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$59;

    .line 765
    .line 766
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$60;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$60;

    .line 767
    .line 768
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$61;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$61;

    .line 776
    .line 777
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$62;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$62;

    .line 778
    .line 779
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$63;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$63;

    .line 787
    .line 788
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$64;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$64;

    .line 796
    .line 797
    sget-object v4, Lcom/discord/bridge/DCDPackageList$getPackages$65;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$65;

    .line 798
    .line 799
    invoke-virtual {v1, v2, v4}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$66;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$66;

    .line 807
    .line 808
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    sget-object v2, Lcom/discord/bridge/DCDPackageList$getPackages$67;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$67;

    .line 816
    .line 817
    invoke-virtual {v1, v3, v2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    const-string v2, "RTNAudioRouteEmitter"

    .line 825
    .line 826
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$68;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$68;

    .line 827
    .line 828
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    const-string v2, "RTNDeviceManager"

    .line 836
    .line 837
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$69;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$69;

    .line 838
    .line 839
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    const-string v2, "RTNDeviceLocaleManager"

    .line 847
    .line 848
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$70;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$70;

    .line 849
    .line 850
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    const-string v2, "RTNFileManager"

    .line 858
    .line 859
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$71;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$71;

    .line 860
    .line 861
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    const-string v2, "RTNClientInfoManager"

    .line 869
    .line 870
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$72;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$72;

    .line 871
    .line 872
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    const-string v2, "RTNKeyboardManager"

    .line 880
    .line 881
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$73;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$73;

    .line 882
    .line 883
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    const-string v2, "RTNHeartbeatKeyProvider"

    .line 891
    .line 892
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$74;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$74;

    .line 893
    .line 894
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    const-string v2, "RTNThemeManager"

    .line 902
    .line 903
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$75;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$75;

    .line 904
    .line 905
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    const-string v2, "RTNMobileVoiceOverlay"

    .line 913
    .line 914
    sget-object v3, Lcom/discord/bridge/DCDPackageList$getPackages$76;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$76;

    .line 915
    .line 916
    invoke-virtual {v1, v2, v3}, Lcom/discord/bridge/DCDModuleProvider;->getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    const-string v1, "packages"

    .line 924
    .line 925
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    return-object v0
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
.end method
