.class public final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0008H\u0002J\u0018\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\u0008H\u0002J\u0018\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\u0008H\u0002J\u0018\u0010$\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\u0008H\u0002J\u0018\u0010\'\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\u0008H\u0002J\u0016\u0010.\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010,\u001a\u00020\u0008R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0014\u001a\u0004\u0008\u001d\u0010\u001eR#\u0010 \u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0014\u001a\u0004\u0008!\u0010\u001eR#\u0010#\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0014\u001a\u0004\u0008$\u0010\u001eR#\u0010&\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u0014\u001a\u0004\u0008\'\u0010\u001e\u00a8\u00061"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;",
        "",
        "context",
        "Landroid/content/Context;",
        "binding",
        "Lcom/discord/chat/databinding/AudioPlayerViewBinding;",
        "(Landroid/content/Context;Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V",
        "animateToPlay",
        "",
        "animatorSet",
        "Landroid/animation/AnimatorSet;",
        "argbEvaluator",
        "Landroid/animation/ArgbEvaluator;",
        "brand500",
        "",
        "buttonContainerActiveDrawable",
        "Landroid/graphics/drawable/ColorDrawable;",
        "getButtonContainerActiveDrawable",
        "()Landroid/graphics/drawable/ColorDrawable;",
        "buttonContainerActiveDrawable$delegate",
        "Lkotlin/Lazy;",
        "buttonContainerDefaultDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "getButtonContainerDefaultDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "buttonContainerDefaultDrawable$delegate",
        "buttonIconColorAnimator",
        "Landroid/animation/ValueAnimator;",
        "kotlin.jvm.PlatformType",
        "getButtonIconColorAnimator",
        "()Landroid/animation/ValueAnimator;",
        "buttonIconColorAnimator$delegate",
        "progressColorAnimator",
        "getProgressColorAnimator",
        "progressColorAnimator$delegate",
        "scaleAnimator",
        "getScaleAnimator",
        "scaleAnimator$delegate",
        "textColorAnimator",
        "getTextColorAnimator",
        "textColorAnimator$delegate",
        "getAnimatorSet",
        "currentPlayTime",
        "",
        "shouldAnimate",
        "shouldPlay",
        "startAnimator",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$Companion;

.field private static final WASH_ANIMATION_MS:J = 0xc8L


# instance fields
.field private animateToPlay:Z

.field private animatorSet:Landroid/animation/AnimatorSet;

.field private final argbEvaluator:Landroid/animation/ArgbEvaluator;

.field private final brand500:I

.field private final buttonContainerActiveDrawable$delegate:Lkotlin/Lazy;

.field private final buttonContainerDefaultDrawable$delegate:Lkotlin/Lazy;

.field private final buttonIconColorAnimator$delegate:Lkotlin/Lazy;

.field private final progressColorAnimator$delegate:Lkotlin/Lazy;

.field private final scaleAnimator$delegate:Lkotlin/Lazy;

.field private final textColorAnimator$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->Companion:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "binding"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/discord/chat/R$color;->brand_500:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->brand500:I

    .line 21
    .line 22
    new-instance v0, Landroid/animation/ArgbEvaluator;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->argbEvaluator:Landroid/animation/ArgbEvaluator;

    .line 28
    .line 29
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->buttonContainerDefaultDrawable$delegate:Lkotlin/Lazy;

    .line 39
    .line 40
    sget-object p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerActiveDrawable$2;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerActiveDrawable$2;

    .line 41
    .line 42
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->buttonContainerActiveDrawable$delegate:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;

    .line 49
    .line 50
    invoke-direct {p1, p2, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;-><init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->scaleAnimator$delegate:Lkotlin/Lazy;

    .line 58
    .line 59
    new-instance p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$textColorAnimator$2;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$textColorAnimator$2;-><init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->textColorAnimator$delegate:Lkotlin/Lazy;

    .line 69
    .line 70
    new-instance p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonIconColorAnimator$2;

    .line 71
    .line 72
    invoke-direct {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonIconColorAnimator$2;-><init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->buttonIconColorAnimator$delegate:Lkotlin/Lazy;

    .line 80
    .line 81
    new-instance p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$progressColorAnimator$2;

    .line 82
    .line 83
    invoke-direct {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$progressColorAnimator$2;-><init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->progressColorAnimator$delegate:Lkotlin/Lazy;

    .line 91
    .line 92
    return-void
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

.method public static final synthetic access$getButtonContainerActiveDrawable(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)Landroid/graphics/drawable/ColorDrawable;
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getButtonContainerActiveDrawable()Landroid/graphics/drawable/ColorDrawable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getButtonContainerDefaultDrawable(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getButtonContainerDefaultDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setAnimatorSet$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;Landroid/animation/AnimatorSet;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->animatorSet:Landroid/animation/AnimatorSet;

    return-void
.end method

.method private final getAnimatorSet(ZJZ)Landroid/animation/AnimatorSet;
    .locals 4

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    new-array v1, v1, [Landroid/animation/Animator;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getScaleAnimator(Z)Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getTextColorAnimator(Z)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    aput-object v3, v1, v2

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getButtonIconColorAnimator(Z)Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    aput-object v3, v1, v2

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getProgressColorAnimator(Z)Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    aput-object p1, v1, v2

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 38
    .line 39
    .line 40
    if-eqz p4, :cond_0

    .line 41
    .line 42
    const-wide/16 v1, 0xc8

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-wide/16 v1, 0x0

    .line 46
    .line 47
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 48
    .line 49
    .line 50
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 p4, 0x1a

    .line 53
    .line 54
    if-lt p1, p4, :cond_1

    .line 55
    .line 56
    invoke-static {v0, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/g;->a(Landroid/animation/AnimatorSet;J)V

    .line 57
    .line 58
    .line 59
    :cond_1
    new-instance p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$getAnimatorSet$lambda$7$$inlined$addListener$default$1;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$getAnimatorSet$lambda$7$$inlined$addListener$default$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 65
    .line 66
    .line 67
    return-object v0
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
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
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
.end method

.method private final getButtonContainerActiveDrawable()Landroid/graphics/drawable/ColorDrawable;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->buttonContainerActiveDrawable$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    return-object v0
.end method

.method private final getButtonContainerDefaultDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->buttonContainerDefaultDrawable$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method private final getButtonIconColorAnimator()Landroid/animation/ValueAnimator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->buttonIconColorAnimator$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method private final getButtonIconColorAnimator(Z)Landroid/animation/ValueAnimator;
    .locals 5

    .line 2
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getButtonIconColorAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz p1, :cond_0

    new-array p1, v4, [I

    aput v1, p1, v3

    .line 3
    iget v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->brand500:I

    aput v1, p1, v2

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    goto :goto_0

    :cond_0
    new-array p1, v4, [I

    .line 4
    iget v4, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->brand500:I

    aput v4, p1, v3

    aput v1, p1, v2

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->argbEvaluator:Landroid/animation/ArgbEvaluator;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    return-object v0
.end method

.method private final getProgressColorAnimator()Landroid/animation/ValueAnimator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->progressColorAnimator$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method private final getProgressColorAnimator(Z)Landroid/animation/ValueAnimator;
    .locals 5

    .line 2
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getProgressColorAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz p1, :cond_0

    new-array p1, v4, [I

    .line 3
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getInteractiveActive()I

    move-result v4

    aput v4, p1, v3

    aput v2, p1, v1

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    goto :goto_0

    :cond_0
    new-array p1, v4, [I

    aput v2, p1, v3

    .line 4
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v2

    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getInteractiveActive()I

    move-result v2

    aput v2, p1, v1

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->argbEvaluator:Landroid/animation/ArgbEvaluator;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    return-object v0
.end method

.method private final getScaleAnimator()Landroid/animation/ValueAnimator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->scaleAnimator$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method private final getScaleAnimator(Z)Landroid/animation/ValueAnimator;
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getScaleAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz p1, :cond_0

    new-array p1, v1, [F

    .line 3
    fill-array-data p1, :array_0

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    goto :goto_0

    :cond_0
    new-array p1, v1, [F

    .line 4
    fill-array-data p1, :array_1

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    :goto_0
    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private final getTextColorAnimator()Landroid/animation/ValueAnimator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->textColorAnimator$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method private final getTextColorAnimator(Z)Landroid/animation/ValueAnimator;
    .locals 5

    .line 2
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getTextColorAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz p1, :cond_0

    new-array p1, v4, [I

    .line 3
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v4

    aput v4, p1, v3

    aput v2, p1, v1

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    goto :goto_0

    :cond_0
    new-array p1, v4, [I

    aput v2, p1, v3

    .line 4
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v2

    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v2

    aput v2, p1, v1

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->argbEvaluator:Landroid/animation/ArgbEvaluator;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    return-object v0
.end method


# virtual methods
.method public final startAnimator(ZZ)V
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_6

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->animateToPlay:Z

    .line 6
    .line 7
    if-ne v2, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-eq v2, p1, :cond_6

    .line 11
    .line 12
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->animatorSet:Landroid/animation/AnimatorSet;

    .line 13
    .line 14
    if-eqz v2, :cond_6

    .line 15
    .line 16
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v4, 0x1a

    .line 19
    .line 20
    if-lt v3, v4, :cond_5

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->getDuration()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-wide v2, v0

    .line 30
    :goto_0
    iget-object v4, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->animatorSet:Landroid/animation/AnimatorSet;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-static {v4}, Lcom/discord/chat/presentation/message/view/voicemessages/h;->a(Landroid/animation/AnimatorSet;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-wide v4, v0

    .line 40
    :goto_1
    sub-long/2addr v2, v4

    .line 41
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    cmp-long v5, v0, v3

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    if-gtz v5, :cond_3

    .line 53
    .line 54
    const-wide/16 v7, 0xc9

    .line 55
    .line 56
    cmp-long v3, v3, v7

    .line 57
    .line 58
    if-gez v3, :cond_3

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    :cond_3
    if-eqz v6, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const/4 v2, 0x0

    .line 65
    :goto_2
    if-eqz v2, :cond_5

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    :cond_5
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->animatorSet:Landroid/animation/AnimatorSet;

    .line 72
    .line 73
    if-eqz v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->cancel()V

    .line 76
    .line 77
    .line 78
    :cond_6
    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->animateToPlay:Z

    .line 79
    .line 80
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->getAnimatorSet(ZJZ)Landroid/animation/AnimatorSet;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->animatorSet:Landroid/animation/AnimatorSet;

    .line 88
    .line 89
    return-void
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
