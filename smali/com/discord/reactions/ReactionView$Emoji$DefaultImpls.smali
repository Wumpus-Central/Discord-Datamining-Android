.class public final Lcom/discord/reactions/ReactionView$Emoji$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/reactions/ReactionView$Emoji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getEmojiId(Lcom/discord/reactions/ReactionView$Emoji;)Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Emoji;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Emoji;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static getShouldAnimate(Lcom/discord/reactions/ReactionView$Emoji;)Z
    .locals 0

    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Emoji;->getAnimated()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static renderable(Lcom/discord/reactions/ReactionView$Emoji;)Lcom/discord/emoji/RenderableEmoji;
    .locals 5

    .line 1
    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Emoji;->getId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Lpi/l;->o(Ljava/lang/String;)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sget-object v2, Lcom/discord/emoji/RenderableEmoji;->Companion:Lcom/discord/emoji/RenderableEmoji$Companion;

    .line 18
    .line 19
    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Emoji;->getShouldAnimate()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Emoji;->getDisplayName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v2, v0, v1, v3, v4}, Lcom/discord/emoji/RenderableEmoji$Companion;->customWithEmojiId(JZLjava/lang/String;)Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v0, Lcom/discord/emoji/RenderableEmoji;->Companion:Lcom/discord/emoji/RenderableEmoji$Companion;

    .line 35
    .line 36
    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Emoji;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-nez p0, :cond_1

    .line 41
    .line 42
    const-string p0, ""

    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0, p0}, Lcom/discord/emoji/RenderableEmoji$Companion;->unicode(Ljava/lang/String;)Lcom/discord/emoji/RenderableEmoji$Unicode;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    return-object v0
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
.end method
