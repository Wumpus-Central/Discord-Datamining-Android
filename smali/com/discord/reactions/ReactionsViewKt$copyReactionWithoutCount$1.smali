.class public final Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactions/ReactionView$Reaction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/reactions/ReactionsViewKt;->copyReactionWithoutCount(Lcom/discord/reactions/ReactionView$Reaction;Z)Lcom/discord/reactions/ReactionView$Reaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0005R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "com/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "burstCount",
        "",
        "getBurstCount",
        "()I",
        "count",
        "getCount",
        "emoji",
        "Lcom/discord/reactions/ReactionView$Emoji;",
        "getEmoji",
        "()Lcom/discord/reactions/ReactionView$Emoji;",
        "isMe",
        "",
        "()Z",
        "isMeBurst",
        "themedBurstColors",
        "Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;",
        "getThemedBurstColors",
        "()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;",
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
.field private final burstCount:I

.field private final count:I

.field private final emoji:Lcom/discord/reactions/ReactionView$Emoji;

.field private final isMe:Z

.field private final isMeBurst:Z

.field private final themedBurstColors:Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;


# direct methods
.method constructor <init>(ZLcom/discord/reactions/ReactionView$Reaction;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    move v1, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$Reaction;->getCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_0
    iput v1, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->count:I

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$Reaction;->getBurstCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :cond_1
    iput v0, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->burstCount:I

    .line 22
    .line 23
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$Reaction;->isMe()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-boolean p1, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->isMe:Z

    .line 28
    .line 29
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$Reaction;->isMeBurst()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput-boolean p1, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->isMeBurst:Z

    .line 34
    .line 35
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->emoji:Lcom/discord/reactions/ReactionView$Emoji;

    .line 40
    .line 41
    invoke-interface {p2}, Lcom/discord/reactions/ReactionView$Reaction;->getThemedBurstColors()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->themedBurstColors:Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;

    .line 46
    .line 47
    return-void
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
.end method


# virtual methods
.method public getBurstCount()I
    .locals 1

    iget v0, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->burstCount:I

    return v0
.end method

.method public getCount()I
    .locals 1

    iget v0, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->count:I

    return v0
.end method

.method public getEmoji()Lcom/discord/reactions/ReactionView$Emoji;
    .locals 1

    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->emoji:Lcom/discord/reactions/ReactionView$Emoji;

    return-object v0
.end method

.method public getItemId()Ljava/lang/Long;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/discord/reactions/ReactionView$Reaction$DefaultImpls;->getItemId(Lcom/discord/reactions/ReactionView$Reaction;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getItemId()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->getItemId()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getThemedBurstColors()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;
    .locals 1

    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->themedBurstColors:Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;

    return-object v0
.end method

.method public isBurstReaction()Z
    .locals 1

    invoke-static {p0}, Lcom/discord/reactions/ReactionView$Reaction$DefaultImpls;->isBurstReaction(Lcom/discord/reactions/ReactionView$Reaction;)Z

    move-result v0

    return v0
.end method

.method public isMe()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->isMe:Z

    return v0
.end method

.method public isMeBurst()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/reactions/ReactionsViewKt$copyReactionWithoutCount$1;->isMeBurst:Z

    return v0
.end method
