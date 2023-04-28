.class public final Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView<",
        "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00192\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B%\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0018H\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;",
        "Landroid/widget/LinearLayout;",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;",
        "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "configure",
        "",
        "component",
        "componentProvider",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "componentActionListener",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;",
        "configurePadding",
        "views",
        "Landroid/view/ViewGroup;",
        "isTop",
        "",
        "getComponentType",
        "Lkotlin/reflect/KClass;",
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
.field public static final Companion:Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;->Companion:Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final configurePadding(Landroid/view/ViewGroup;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 p2, 0x8

    .line 14
    .line 15
    invoke-static {p2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    :goto_0
    iput p2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 26
    .line 27
    const-string p2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
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


# virtual methods
.method public configure(Lcom/discord/chat/bridge/botuikit/ActionRowComponent;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V
    .locals 10

    const-string v0, "component"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "componentProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "componentActionListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->bind(Landroid/view/View;)Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;

    move-result-object v0

    const-string v1, "bind(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/ActionRowComponent;->getComponents()Ljava/util/List;

    move-result-object v1

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "binding.actionRowComponentViewGroup"

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v7, v4, 0x1

    if-gez v4, :cond_0

    .line 6
    invoke-static {}, Lkotlin/collections/h;->s()V

    :cond_0
    check-cast v5, Lcom/discord/chat/bridge/botuikit/Component;

    .line 7
    iget-object v8, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroup:Lcom/google/android/flexbox/FlexboxLayout;

    invoke-static {v8, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v6, v4, Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;

    const/4 v9, 0x0

    if-eqz v6, :cond_1

    check-cast v4, Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;

    goto :goto_1

    :cond_1
    move-object v4, v9

    :goto_1
    if-eqz v4, :cond_3

    .line 9
    invoke-interface {v4}, Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;->getComponentType()Lkotlin/reflect/KClass;

    move-result-object v6

    instance-of v6, v6, Lcom/discord/chat/bridge/botuikit/Component;

    if-eqz v6, :cond_2

    move-object v9, v4

    :cond_2
    if-nez v9, :cond_4

    .line 10
    :cond_3
    new-instance v4, Lcom/discord/chat/presentation/message/view/botuikit/ComponentInflater;

    invoke-virtual {p2}, Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v4, v6}, Lcom/discord/chat/presentation/message/view/botuikit/ComponentInflater;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v5, v8}, Lcom/discord/chat/presentation/message/view/botuikit/ComponentInflater;->inflateComponent(Lcom/discord/chat/bridge/botuikit/Component;Landroid/view/ViewGroup;)Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;

    move-result-object v9

    :cond_4
    if-eqz v9, :cond_5

    .line 11
    invoke-interface {v9, v5, p2, p3}, Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;->configure(Lcom/discord/chat/bridge/botuikit/Component;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V

    .line 12
    :cond_5
    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v7

    goto :goto_0

    .line 13
    :cond_6
    invoke-static {v2}, Lkotlin/collections/h;->R(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    .line 14
    iget-object p3, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroup:Lcom/google/android/flexbox/FlexboxLayout;

    invoke-static {p3, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p2}, Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsViewKt;->replaceViews(Landroid/view/ViewGroup;Ljava/util/List;)V

    .line 15
    iget-object p3, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroup:Lcom/google/android/flexbox/FlexboxLayout;

    invoke-static {p3, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const/16 v4, 0x8

    if-eqz v1, :cond_7

    move v1, v3

    goto :goto_2

    :cond_7
    move v1, v4

    .line 16
    :goto_2
    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, v2

    if-eqz p2, :cond_9

    .line 18
    iget-object p2, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroup:Lcom/google/android/flexbox/FlexboxLayout;

    invoke-static {p2, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/ActionRowComponent;->getIndices()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-nez p3, :cond_8

    move p3, v2

    goto :goto_3

    :cond_8
    move p3, v3

    :goto_3
    invoke-direct {p0, p2, p3}, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;->configurePadding(Landroid/view/ViewGroup;Z)V

    .line 19
    :cond_9
    iget-object p2, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroupErrorRow:Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;

    invoke-virtual {p2}, Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string p3, "binding.actionRowComponentViewGroupErrorRow.root"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/ActionRowComponent;->getErrorText()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_a

    goto :goto_4

    :cond_a
    move v2, v3

    :goto_4
    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    move v3, v4

    .line 20
    :goto_5
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 21
    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/ActionRowComponent;->getErrorText()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 22
    iget-object p2, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroupErrorRow:Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;

    iget-object p2, p2, Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;->viewInteractionFailedLabelIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string p3, "binding.actionRowCompone\u2026nteractionFailedLabelIcon"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->Warning:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {p2, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 24
    iget-object p2, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroupErrorRow:Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;

    iget-object p2, p2, Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;->viewInteractionFailedLabelIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 25
    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getInfoDangerForeground()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 26
    iget-object p2, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroupErrorRow:Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;

    iget-object p2, p2, Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;->viewInteractionFailedLabelMessage:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget-object p1, v0, Lcom/discord/chat/databinding/MessageComponentActionRowViewBinding;->actionRowComponentViewGroupErrorRow:Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;

    iget-object p1, p1, Lcom/discord/chat/databinding/ComponentFailedLabelViewBinding;->viewInteractionFailedLabelMessage:Landroid/widget/TextView;

    .line 28
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getInfoDangerForeground()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_c
    return-void
.end method

.method public bridge synthetic configure(Lcom/discord/chat/bridge/botuikit/Component;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/botuikit/ActionRowComponent;

    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;->configure(Lcom/discord/chat/bridge/botuikit/ActionRowComponent;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V

    return-void
.end method

.method public getComponentType()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/discord/chat/bridge/botuikit/ActionRowComponent;

    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    return-object v0
.end method
