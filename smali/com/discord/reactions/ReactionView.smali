.class public final Lcom/discord/reactions/ReactionView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/reactions/ReactionView$Companion;,
        Lcom/discord/reactions/ReactionView$Emoji;,
        Lcom/discord/reactions/ReactionView$Reaction;,
        Lcom/discord/reactions/ReactionView$ReactionsTheme;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001d\u001e\u001f B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006!"
    }
    d2 = {
        "Lcom/discord/reactions/ReactionView;",
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
        "reactionsTheme",
        "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
        "configureCount",
        "count",
        "animate",
        "configureTextColor",
        "setReaction",
        "reaction",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "Companion",
        "Emoji",
        "Reaction",
        "ReactionsTheme",
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


# static fields
.field private static final CORNER_RADIUS:I

.field public static final Companion:Lcom/discord/reactions/ReactionView$Companion;

.field private static final EMOJI_SIZE:I

.field private static final HORIZ_PADDING:I

.field private static final MINIMUM_WIDTH:I

.field private static final STROKE_WIDTH:I


# instance fields
.field private final binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

.field private currentCount:Ljava/lang/Integer;

.field private currentEmojiId:Ljava/lang/String;

.field private currentShouldAnimate:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/reactions/ReactionView$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/reactions/ReactionView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/reactions/ReactionView;->Companion:Lcom/discord/reactions/ReactionView$Companion;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sput v0, Lcom/discord/reactions/ReactionView;->STROKE_WIDTH:I

    .line 15
    .line 16
    const/16 v0, 0x28

    .line 17
    .line 18
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput v0, Lcom/discord/reactions/ReactionView;->MINIMUM_WIDTH:I

    .line 23
    .line 24
    const/4 v0, 0x6

    .line 25
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    sput v1, Lcom/discord/reactions/ReactionView;->HORIZ_PADDING:I

    .line 30
    .line 31
    const/16 v1, 0x10

    .line 32
    .line 33
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sput v1, Lcom/discord/reactions/ReactionView;->EMOJI_SIZE:I

    .line 38
    .line 39
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sput v0, Lcom/discord/reactions/ReactionView;->CORNER_RADIUS:I

    .line 44
    .line 45
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/reactions/ReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    iput-object p1, p0, Lcom/discord/reactions/ReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v0, 0x10

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 7
    sget v0, Lcom/discord/reactions/ReactionView;->MINIMUM_WIDTH:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 8
    sget v0, Lcom/discord/reactions/ReactionView;->HORIZ_PADDING:I

    invoke-virtual {p0, v0, p2, v0, p2}, Landroid/view/View;->setPadding(IIII)V

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
    invoke-direct {p0, p1, p2}, Lcom/discord/reactions/ReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getCORNER_RADIUS$cp()I
    .locals 1

    sget v0, Lcom/discord/reactions/ReactionView;->CORNER_RADIUS:I

    return v0
.end method

.method public static final synthetic access$getEMOJI_SIZE$cp()I
    .locals 1

    sget v0, Lcom/discord/reactions/ReactionView;->EMOJI_SIZE:I

    return v0
.end method

.method public static final synthetic access$getHORIZ_PADDING$cp()I
    .locals 1

    sget v0, Lcom/discord/reactions/ReactionView;->HORIZ_PADDING:I

    return v0
.end method

.method public static final synthetic access$getMINIMUM_WIDTH$cp()I
    .locals 1

    sget v0, Lcom/discord/reactions/ReactionView;->MINIMUM_WIDTH:I

    return v0
.end method

.method public static final synthetic access$getSTROKE_WIDTH$cp()I
    .locals 1

    sget v0, Lcom/discord/reactions/ReactionView;->STROKE_WIDTH:I

    return v0
.end method

.method private final configureBackground(ZLcom/discord/reactions/ReactionView$ReactionsTheme;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const-string p1, "context"

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$ReactionsTheme;->getActiveReactionBackgroundColor()Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget v1, Lcom/discord/reactions/R$color;->brand_new_500_alpha_20:I

    .line 26
    .line 27
    invoke-static {v0, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    :goto_0
    sget v1, Lcom/discord/reactions/ReactionView;->CORNER_RADIUS:I

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$ReactionsTheme;->getActiveReactionBorderColor()Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget p1, Lcom/discord/reactions/R$color;->brand_560:I

    .line 54
    .line 55
    invoke-static {p2, p1}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget p2, Lcom/discord/reactions/ReactionView;->STROKE_WIDTH:I

    .line 64
    .line 65
    invoke-static {p0, v0, v1, p1, p2}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundRectangle(Landroid/view/View;IILjava/lang/Integer;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_2
    if-eqz p2, :cond_3

    .line 70
    .line 71
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$ReactionsTheme;->getReactionBackgroundColor()Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    :goto_2
    if-eqz p2, :cond_4

    .line 91
    .line 92
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$ReactionsTheme;->getReactionBorderColor()Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    const/4 p2, 0x0

    .line 98
    :goto_3
    sget v0, Lcom/discord/reactions/ReactionView;->STROKE_WIDTH:I

    .line 99
    .line 100
    sget v1, Lcom/discord/reactions/ReactionView;->CORNER_RADIUS:I

    .line 101
    .line 102
    invoke-static {p0, p1, v1, p2, v0}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundRectangle(Landroid/view/View;IILjava/lang/Integer;I)V

    .line 103
    .line 104
    .line 105
    :goto_4
    return-void
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

.method private final configureCount(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/reactions/ReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCountSwitcher:Landroid/widget/TextSwitcher;

    .line 4
    .line 5
    if-eqz p2, :cond_2

    .line 6
    .line 7
    iget-object p2, p0, Lcom/discord/reactions/ReactionView;->currentCount:Ljava/lang/Integer;

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
    iput-object p1, p0, Lcom/discord/reactions/ReactionView;->currentCount:Ljava/lang/Integer;

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

.method private final configureTextColor(ZLcom/discord/reactions/ReactionView$ReactionsTheme;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$ReactionsTheme;->getActiveReactionTextColor()Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getInteractiveActive()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    if-eqz p2, :cond_2

    .line 26
    .line 27
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$ReactionsTheme;->getReactionTextColor()Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    :goto_0
    iget-object p2, p0, Lcom/discord/reactions/ReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 47
    .line 48
    iget-object p2, p2, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionEmoji:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/discord/reactions/ReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 54
    .line 55
    iget-object p2, p2, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount1:Landroid/widget/TextView;

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lcom/discord/reactions/ReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 61
    .line 62
    iget-object p2, p2, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionCount2:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 65
    .line 66
    .line 67
    return-void
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
.end method


# virtual methods
.method public final setReaction(Lcom/discord/reactions/ReactionView$Reaction;Lcom/discord/reactions/ReactionView$ReactionsTheme;)V
    .locals 9

    .line 1
    const-string v0, "reaction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/reactions/ReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

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
    iget-object v0, p0, Lcom/discord/reactions/ReactionView;->currentEmojiId:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/discord/reactions/ReactionView;->currentShouldAnimate:Ljava/lang/Boolean;

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
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getCount()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    iget-object v4, p0, Lcom/discord/reactions/ReactionView;->currentCount:Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getCount()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    iget-object v5, p0, Lcom/discord/reactions/ReactionView;->currentCount:Ljava/lang/Integer;

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
    invoke-direct {p0, v3, v1}, Lcom/discord/reactions/ReactionView;->configureCount(IZ)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->isMe()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-direct {p0, v1, p2}, Lcom/discord/reactions/ReactionView;->configureBackground(ZLcom/discord/reactions/ReactionView$ReactionsTheme;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->isMe()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-direct {p0, v1, p2}, Lcom/discord/reactions/ReactionView;->configureTextColor(ZLcom/discord/reactions/ReactionView$ReactionsTheme;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$Emoji;->getShouldAnimate()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    iput-object p2, p0, Lcom/discord/reactions/ReactionView;->currentShouldAnimate:Ljava/lang/Boolean;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    iget-object p2, p0, Lcom/discord/reactions/ReactionView;->binding:Lcom/discord/reactions/databinding/ReactionViewBinding;

    .line 126
    .line 127
    iget-object p2, p2, Lcom/discord/reactions/databinding/ReactionViewBinding;->reactionEmoji:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 128
    .line 129
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {v0}, Lcom/discord/reactions/ReactionView$Emoji;->renderable()Lcom/discord/emoji/RenderableEmoji;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const-string v0, "context"

    .line 142
    .line 143
    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    sget v3, Lcom/discord/reactions/ReactionView;->EMOJI_SIZE:I

    .line 147
    .line 148
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {v0}, Lcom/discord/reactions/ReactionView$Emoji;->getShouldAnimate()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    const/16 v7, 0x30

    .line 159
    .line 160
    const/4 v8, 0x0

    .line 161
    invoke-static/range {v1 .. v8}, Lcom/discord/emoji/RenderableEmojiKt;->renderEmoji$default(Lcom/discord/emoji/RenderableEmoji;Landroid/content/Context;IZILkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {p2, v0}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Emoji;->getEmojiId()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iput-object p1, p0, Lcom/discord/reactions/ReactionView;->currentEmojiId:Ljava/lang/String;

    .line 177
    .line 178
    return-void
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
