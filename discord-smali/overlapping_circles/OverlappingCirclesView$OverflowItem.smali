.class final Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;
.super Lcom/google/android/material/textview/MaterialTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/overlapping_circles/OverlappingCirclesView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "OverflowItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;",
        "Lcom/google/android/material/textview/MaterialTextView;",
        "context",
        "Landroid/content/Context;",
        "count",
        "",
        "textSizePx",
        "textColor",
        "bgColor",
        "sizePx",
        "(Landroid/content/Context;IIIII)V",
        "overlapping_circles_release"
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
.method public constructor <init>(Landroid/content/Context;IIIII)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/material/textview/MaterialTextView;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lcom/discord/fonts/DiscordFont;->PrimaryBold:Lcom/discord/fonts/DiscordFont;

    .line 10
    .line 11
    invoke-static {p0, p1}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 12
    .line 13
    .line 14
    int-to-float p1, p3

    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-virtual {p0, p3, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string p4, "+"

    .line 28
    .line 29
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    const/16 p1, 0x11

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p6}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/high16 p2, 0x41a00000    # 20.0f

    .line 52
    .line 53
    cmpl-float p1, p1, p2

    .line 54
    .line 55
    const/16 p2, 0x8

    .line 56
    .line 57
    const/4 p4, 0x4

    .line 58
    if-lez p1, :cond_0

    .line 59
    .line 60
    invoke-static {p2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 61
    .line 62
    .line 63
    move-result p6

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {p4}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 66
    .line 67
    .line 68
    move-result p6

    .line 69
    :goto_0
    if-lez p1, :cond_1

    .line 70
    .line 71
    invoke-static {p2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {p4}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    :goto_1
    invoke-virtual {p0, p6, p3, p1, p3}, Landroid/view/View;->setPadding(IIII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToCircle(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1;

    .line 90
    .line 91
    invoke-direct {p1, p0, p0}, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1;-><init>(Landroid/view/View;Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0, p1}, Landroidx/core/view/u0;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/u0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string p2, "View.doOnPreDraw(\n    cr\u2026dd(this) { action(this) }"

    .line 99
    .line 100
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
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
.end method
