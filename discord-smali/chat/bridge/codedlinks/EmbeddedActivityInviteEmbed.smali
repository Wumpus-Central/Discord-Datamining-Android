.class public interface abstract Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbed;",
        "",
        "ctaEnabled",
        "",
        "getCtaEnabled",
        "()Z",
        "extendedType",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "getExtendedType",
        "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "noParticipantsText",
        "",
        "getNoParticipantsText",
        "()Ljava/lang/String;",
        "participantAvatarUris",
        "",
        "getParticipantAvatarUris",
        "()Ljava/util/List;",
        "structurableSubtitleText",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "getStructurableSubtitleText",
        "()Lcom/discord/chat/bridge/structurabletext/StructurableText;",
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


# virtual methods
.method public abstract getCtaEnabled()Z
.end method

.method public abstract getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;
.end method

.method public abstract getNoParticipantsText()Ljava/lang/String;
.end method

.method public abstract getParticipantAvatarUris()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStructurableSubtitleText()Lcom/discord/chat/bridge/structurabletext/StructurableText;
.end method
