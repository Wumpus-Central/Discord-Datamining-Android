.class public final Lcom/discord/sticker/sticker_types/RLottieImageView;
.super Lcom/discord/rlottie/RLottieImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/sticker/sticker_types/RLottieImageView$Config;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\tH\u0002J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\tJ\u0008\u0010\u000e\u001a\u00020\u000bH\u0014J\u0008\u0010\u000f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/discord/sticker/sticker_types/RLottieImageView;",
        "Lcom/discord/rlottie/RLottieImageView;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "placeholder",
        "Landroid/graphics/drawable/ShapeDrawable;",
        "rLottieStateManager",
        "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;",
        "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;",
        "fetchSticker",
        "",
        "config",
        "loadImage",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "recycle",
        "resetState",
        "",
        "Config",
        "sticker_release"
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
.field private final placeholder:Landroid/graphics/drawable/ShapeDrawable;

.field private final rLottieStateManager:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager<",
            "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/discord/rlottie/RLottieImageView;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Landroid/graphics/drawable/ShapeDrawable;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroid/graphics/drawable/shapes/OvalShape;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundAccent()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->placeholder:Landroid/graphics/drawable/ShapeDrawable;

    .line 38
    .line 39
    new-instance p1, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    .line 40
    .line 41
    new-instance v3, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$1;

    .line 42
    .line 43
    invoke-direct {v3, p0}, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$1;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$2;

    .line 47
    .line 48
    invoke-direct {v4, p0}, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$2;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$3;

    .line 52
    .line 53
    invoke-direct {v5, p0}, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$3;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$4;

    .line 57
    .line 58
    invoke-direct {v6, p0}, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$4;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;)V

    .line 59
    .line 60
    .line 61
    new-instance v7, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$5;

    .line 62
    .line 63
    invoke-direct {v7, p0}, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$5;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;)V

    .line 64
    .line 65
    .line 66
    move-object v2, p1

    .line 67
    invoke-direct/range {v2 .. v7}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->rLottieStateManager:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    .line 71
    .line 72
    return-void
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
.end method

.method public static final synthetic access$fetchSticker(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/sticker/sticker_types/RLottieImageView;->fetchSticker(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V

    return-void
.end method

.method public static final synthetic access$getRLottieStateManager$p(Lcom/discord/sticker/sticker_types/RLottieImageView;)Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;
    .locals 0

    iget-object p0, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->rLottieStateManager:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    return-object p0
.end method

.method private final fetchSticker(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V
    .locals 6

    invoke-static {p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static synthetic recycle$default(Lcom/discord/sticker/sticker_types/RLottieImageView;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/discord/sticker/sticker_types/RLottieImageView;->recycle(Z)V

    return-void
.end method


# virtual methods
.method public final loadImage(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->rLottieStateManager:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;->onTryFetch(Ljava/lang/Object;)V

    .line 9
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
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/discord/rlottie/RLottieImageView;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->rLottieStateManager:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;->onAttachedToWindow()V

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
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/discord/rlottie/RLottieImageView;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->rLottieStateManager:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;->onDetachedFromWindow()Z

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
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public final recycle(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/discord/rlottie/RLottieDrawable;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/discord/rlottie/RLottieDrawable;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/discord/rlottie/RLottieDrawable;->stop()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/discord/rlottie/RLottieDrawable;->recycle()V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/n;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->rLottieStateManager:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;->reset()Z

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView;->placeholder:Landroid/graphics/drawable/ShapeDrawable;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    return-void
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
