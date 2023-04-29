.class public interface abstract Lcom/discord/reactions/ReactionView$Reaction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/recycler_view/utils/ItemDiffableType;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/reactions/ReactionView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Reaction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/reactions/ReactionView$Reaction$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0018\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0012\u0010\u0008\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0012\u0010\u000c\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "Lcom/discord/recycler_view/utils/ItemDiffableType;",
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
        "itemId",
        "",
        "getItemId",
        "()Ljava/lang/Long;",
        "themedBurstColors",
        "Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;",
        "getThemedBurstColors",
        "()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;",
        "isBurstReaction",
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


# virtual methods
.method public abstract getBurstCount()I
.end method

.method public abstract getCount()I
.end method

.method public abstract getEmoji()Lcom/discord/reactions/ReactionView$Emoji;
.end method

.method public abstract getItemId()Ljava/lang/Long;
.end method

.method public abstract getThemedBurstColors()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;
.end method

.method public abstract isBurstReaction()Z
.end method

.method public abstract isMe()Z
.end method

.method public abstract isMeBurst()Z
.end method
