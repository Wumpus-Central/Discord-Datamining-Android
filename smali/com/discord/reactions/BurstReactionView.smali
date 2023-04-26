.class public final Lcom/discord/reactions/BurstReactionView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/reactions/BurstReactionView$BurstColorPalette;,
        Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/discord/reactions/BurstReactionView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/discord/reactions/databinding/ReactionViewBinding;",
        "currentCount",
        "",
        "Ljava/lang/Integer;",
        "currentEmojiId",
        "",
        "currentShouldAnimate",
        "",
        "Ljava/lang/Boolean;",
        "configureBackground",
        "",
        "isMe",
        "palette",
        "Lcom/discord/reactions/BurstReactionView$BurstColorPalette;",
        "configureCount",
        "count",
        "animate",
        "configureTextColor",
        "setReaction",
        "reaction",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "BurstColorPalette",
        "ThemedBurstColorPalette",
        "reactions_release"
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
.field private final binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

.field private currentCount:Ljava/lang/Integer;

.field private currentEmojiId:Ljava/lang/String;

.field private currentShouldAnimate:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/reactions/BurstReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 4
    invoke-static {p1, p0}, Lcom/discord/reactions/databinding/ReactionViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/reactions/databinding/ReactionViewBinding;

    move-result-object p1

    const-string p2, "inflate(\n        LayoutI\u2026ext),\n        this,\n    )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/reactions/BurstReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v0, 0x10

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 7
    sget-object v0, Lcom/discord/reactions/ReactionView;->Companion:Lcom/discord/reactions/ReactionView$Companion;

    invoke-virtual {v0}, Lcom/discord/reactions/ReactionView$Companion;->getMINIMUM_WIDTH()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 8
    invoke-virtual {v0}, Lcom/discord/reactions/ReactionView$Companion;->getHORIZ_PADDING()I

    move-result v1

    invoke-virtual {v0}, Lcom/discord/reactions/ReactionView$Companion;->getHORIZ_PADDING()I

    move-result v0

    invoke-virtual {p0, v1, p2, v0, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 9
    iget-object v0, p1, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount1:Landroid/widget/TextView;

    const-string v1, "binding.reactionCount1"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 10
    iget-object v0, p1, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount1:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v0, v1, v1}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 11
    iget-object v0, p1, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount2:Landroid/widget/TextView;

    const-string v3, "binding.reactionCount2"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 12
    iget-object v0, p1, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount2:Landroid/widget/TextView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v1}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 13
    iget-object p1, p1, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCountSwitcher:Landroid/widget/TextSwitcher;

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->setMeasureAllChildren(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/reactions/BurstReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final configureBackground(ZLcom/discord/reactions/BurstReactionView$BurstColorPalette;)V
    .locals 4

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-interface {p2}, Lcom/discord/reactions/BurstReactionView$BurstColorPalette;->getOpacity()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v0, v0

    .line 10
    mul-float/2addr v1, v0

    .line 11
    invoke-static {v1}, Lzf/a;->a(F)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-interface {p2}, Lcom/discord/reactions/BurstReactionView$BurstColorPalette;->getBackgroundColor()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2, v0}, Landroidx/core/graphics/a;->k(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v0, v1

    .line 38
    :goto_0
    if-eqz p2, :cond_2

    .line 39
    .line 40
    invoke-interface {p2}, Lcom/discord/reactions/BurstReactionView$BurstColorPalette;->getAccentColor()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-object p2, v1

    .line 56
    :goto_1
    const-string v2, "context"

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget v3, Lcom/discord/reactions/R$color;->brand_new_500_alpha_20:I

    .line 75
    .line 76
    invoke-static {v0, v3}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    :goto_2
    if-eqz p1, :cond_6

    .line 90
    .line 91
    if-eqz p2, :cond_5

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget p2, Lcom/discord/reactions/R$color;->brand_560:I

    .line 106
    .line 107
    invoke-static {p1, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :cond_6
    sget-object p1, Lcom/discord/reactions/ReactionView;->Companion:Lcom/discord/reactions/ReactionView$Companion;

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/discord/reactions/ReactionView$Companion;->getSTROKE_WIDTH()I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-virtual {p1}, Lcom/discord/reactions/ReactionView$Companion;->getCORNER_RADIUS()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-static {p0, v0, p1, v1, p2}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundRectangle(Landroid/view/View;IILjava/lang/Integer;I)V

    .line 126
    .line 127
    .line 128
    return-void
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
.end method

.method private final configureCount(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCountSwitcher:Landroid/widget/TextSwitcher;

    .line 4
    .line 5
    if-eqz p2, :cond_2

    .line 6
    .line 7
    iget-object p2, p0, Lcom/discord/reactions/BurstReactionView;->currentCount:Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p2, 0x0

    .line 17
    :goto_0
    if-le p1, p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    sget v1, Lcom/discord/reactions/R$anim;->anim_slide_in_up:I

    .line 24
    .line 25
    invoke-virtual {v0, p2, v1}, Landroid/widget/ViewAnimator;->setInAnimation(Landroid/content/Context;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget v1, Lcom/discord/reactions/R$anim;->anim_slide_out_up:I

    .line 33
    .line 34
    invoke-virtual {v0, p2, v1}, Landroid/widget/ViewAnimator;->setOutAnimation(Landroid/content/Context;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    sget v1, Lcom/discord/reactions/R$anim;->anim_slide_in_down:I

    .line 43
    .line 44
    invoke-virtual {v0, p2, v1}, Landroid/widget/ViewAnimator;->setInAnimation(Landroid/content/Context;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    sget v1, Lcom/discord/reactions/R$anim;->anim_slide_out_down:I

    .line 52
    .line 53
    invoke-virtual {v0, p2, v1}, Landroid/widget/ViewAnimator;->setOutAnimation(Landroid/content/Context;I)V

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {v0, p2}, Landroid/widget/TextSwitcher;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {v0, p2}, Landroid/widget/TextSwitcher;->setCurrentText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lcom/discord/reactions/BurstReactionView;->currentCount:Ljava/lang/Integer;

    .line 76
    .line 77
    return-void
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
.end method

.method private final configureTextColor(Lcom/discord/reactions/BurstReactionView$BurstColorPalette;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/discord/reactions/BurstReactionView$BurstColorPalette;->getAccentColor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    :goto_0
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionEmoji:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount1:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount2:Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 41
    .line 42
    .line 43
    return-void
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
.end method


# virtual methods
.method public final setReaction(Lcom/discord/reactions/ReactionView$Reaction;)V
    .locals 10

    .line 1
    const-string v0, "reaction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/discord/reactions/databinding/ReactionViewBinding;->getRoot()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lcom/discord/reactions/ReactionView$Emoji;->getDisplayName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->currentEmojiId:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Lcom/discord/reactions/ReactionView$Emoji;->getEmojiId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x1

    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->currentShouldAnimate:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Lcom/discord/reactions/ReactionView$Emoji;->getShouldAnimate()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    move v0, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v0, v2

    .line 64
    :goto_0
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getBurstCount()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    iget-object v4, p0, Lcom/discord/reactions/BurstReactionView;->currentCount:Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getBurstCount()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    iget-object v5, p0, Lcom/discord/reactions/BurstReactionView;->currentCount:Ljava/lang/Integer;

    .line 79
    .line 80
    if-nez v5, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eq v4, v5, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    move v1, v2

    .line 91
    :goto_1
    invoke-direct {p0, v3, v1}, Lcom/discord/reactions/BurstReactionView;->configureCount(IZ)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    instance-of v1, v1, Lcom/discord/theme/DarkTheme;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getThemedBurstColors()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    invoke-interface {v1}, Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;->getDark()Lcom/discord/reactions/BurstReactionView$BurstColorPalette;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getThemedBurstColors()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    invoke-interface {v1}, Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;->getLight()Lcom/discord/reactions/BurstReactionView$BurstColorPalette;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :cond_4
    :goto_2
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->isMeBurst()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-direct {p0, v1, v2}, Lcom/discord/reactions/BurstReactionView;->configureBackground(ZLcom/discord/reactions/BurstReactionView$BurstColorPalette;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {p0, v2}, Lcom/discord/reactions/BurstReactionView;->configureTextColor(Lcom/discord/reactions/BurstReactionView$BurstColorPalette;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-interface {v1}, Lcom/discord/reactions/ReactionView$Emoji;->getShouldAnimate()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iput-object v1, p0, Lcom/discord/reactions/BurstReactionView;->currentShouldAnimate:Ljava/lang/Boolean;

    .line 147
    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    return-void

    .line 151
    :cond_5
    iget-object v0, p0, Lcom/discord/reactions/BurstReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 152
    .line 153
    iget-object v0, v0, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionEmoji:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 154
    .line 155
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v1}, Lcom/discord/reactions/ReactionView$Emoji;->renderable()Lcom/discord/emoji/RenderableEmoji;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    const-string v1, "context"

    .line 168
    .line 169
    invoke-static {v3, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    sget-object v1, Lcom/discord/reactions/ReactionView;->Companion:Lcom/discord/reactions/ReactionView$Companion;

    .line 173
    .line 174
    invoke-virtual {v1}, Lcom/discord/reactions/ReactionView$Companion;->getEMOJI_SIZE()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-interface {v1}, Lcom/discord/reactions/ReactionView$Emoji;->getShouldAnimate()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    const/4 v6, 0x0

    .line 187
    const/4 v7, 0x0

    .line 188
    const/16 v8, 0x30

    .line 189
    .line 190
    const/4 v9, 0x0

    .line 191
    invoke-static/range {v2 .. v9}, Lcom/discord/emoji/RenderableEmojiKt;->renderEmoji$default(Lcom/discord/emoji/RenderableEmoji;Landroid/content/Context;IZILkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Emoji;->getEmojiId()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iput-object p1, p0, Lcom/discord/reactions/BurstReactionView;->currentEmojiId:Ljava/lang/String;

    .line 207
    .line 208
    return-void
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
.end method
