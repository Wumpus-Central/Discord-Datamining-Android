.class public abstract Lcom/discord/mobile_voice_overlay/views/OverlayDialog;
.super Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0018\u001a\u00020\u0013J\u0008\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010\u001b\u001a\u00020\u00132\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R$\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u000c8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;",
        "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "attributeSetId",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "<anonymous parameter 0>",
        "",
        "isMoving",
        "()Z",
        "setMoving",
        "(Z)V",
        "onDialogClosed",
        "Lkotlin/Function1;",
        "",
        "getOnDialogClosed",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnDialogClosed",
        "(Lkotlin/jvm/functions/Function1;)V",
        "closeDialog",
        "getClosingAnimator",
        "Landroid/animation/Animator;",
        "onConfigurationChanged",
        "newConfig",
        "Landroid/content/res/Configuration;",
        "mobile_voice_overlay_release"
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
.field private onDialogClosed:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;-><init>(Landroid/content/Context;)V

    .line 2
    sget-object p1, Lcom/discord/mobile_voice_overlay/views/OverlayDialog$onDialogClosed$1;->INSTANCE:Lcom/discord/mobile_voice_overlay/views/OverlayDialog$onDialogClosed$1;

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->onDialogClosed:Lkotlin/jvm/functions/Function1;

    .line 3
    new-instance p1, Lcom/discord/mobile_voice_overlay/views/a;

    invoke-direct {p1, p0}, Lcom/discord/mobile_voice_overlay/views/a;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 v0, -0x1

    .line 5
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 6
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v0, 0x0

    .line 7
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 8
    sget-object v0, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->addFlag(Landroid/view/WindowManager$LayoutParams;I)V

    const/high16 v0, 0x3f000000    # 0.5f

    .line 9
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    sget-object p1, Lcom/discord/mobile_voice_overlay/views/OverlayDialog$onDialogClosed$1;->INSTANCE:Lcom/discord/mobile_voice_overlay/views/OverlayDialog$onDialogClosed$1;

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->onDialogClosed:Lkotlin/jvm/functions/Function1;

    .line 13
    new-instance p1, Lcom/discord/mobile_voice_overlay/views/a;

    invoke-direct {p1, p0}, Lcom/discord/mobile_voice_overlay/views/a;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 p2, -0x1

    .line 15
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 16
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p2, 0x0

    .line 17
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 18
    sget-object p2, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    const/4 v0, 0x2

    invoke-virtual {p2, p1, v0}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->addFlag(Landroid/view/WindowManager$LayoutParams;I)V

    const/high16 p2, 0x3f000000    # 0.5f

    .line 19
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    sget-object p1, Lcom/discord/mobile_voice_overlay/views/OverlayDialog$onDialogClosed$1;->INSTANCE:Lcom/discord/mobile_voice_overlay/views/OverlayDialog$onDialogClosed$1;

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->onDialogClosed:Lkotlin/jvm/functions/Function1;

    .line 23
    new-instance p1, Lcom/discord/mobile_voice_overlay/views/a;

    invoke-direct {p1, p0}, Lcom/discord/mobile_voice_overlay/views/a;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 p2, -0x1

    .line 25
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 26
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p2, 0x0

    .line 27
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 28
    sget-object p2, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    const/4 p3, 0x2

    invoke-virtual {p2, p1, p3}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->addFlag(Landroid/view/WindowManager$LayoutParams;I)V

    const/high16 p2, 0x3f000000    # 0.5f

    .line 29
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->closeDialog()V

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
.end method

.method public static synthetic a(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->_init_$lambda$0(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final closeDialog()V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/core/view/w0;->T(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->onDialogClosed:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->getClosingAnimator()Landroid/animation/Animator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/discord/mobile_voice_overlay/views/OverlayDialog$closeDialog$lambda$3$$inlined$doOnEnd$1;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lcom/discord/mobile_voice_overlay/views/OverlayDialog$closeDialog$lambda$3$$inlined$doOnEnd$1;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lcom/discord/mobile_voice_overlay/views/OverlayDialog$closeDialog$1;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lcom/discord/mobile_voice_overlay/views/OverlayDialog$closeDialog$1;-><init>(Landroid/animation/Animator;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 34
    .line 35
    .line 36
    return-void
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
.end method

.method public abstract getClosingAnimator()Landroid/animation/Animator;
.end method

.method public final getOnDialogClosed()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->onDialogClosed:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public isMoving()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->updateViewLayout()V

    .line 18
    .line 19
    .line 20
    return-void
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
.end method

.method public setMoving(Z)V
    .locals 0

    return-void
.end method

.method public final setOnDialogClosed(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->onDialogClosed:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
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
.end method