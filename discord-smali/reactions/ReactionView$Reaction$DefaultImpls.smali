.class public final Lcom/discord/reactions/ReactionView$Reaction$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/reactions/ReactionView$Reaction;
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
.method public static getItemId(Lcom/discord/reactions/ReactionView$Reaction;)Ljava/lang/Long;
    .locals 2

    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    move-result-object v0

    invoke-interface {v0}, Lcom/discord/reactions/ReactionView$Emoji;->getEmojiId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Reaction;->isBurstReaction()Z

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/discord/recycler_view/ids/IdUtilsKt;->convertToId(Ljava/lang/CharSequence;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static isBurstReaction(Lcom/discord/reactions/ReactionView$Reaction;)Z
    .locals 0

    invoke-interface {p0}, Lcom/discord/reactions/ReactionView$Reaction;->getBurstCount()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
