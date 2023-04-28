.class public interface abstract Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001R\u001b\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0005R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u000c\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbed;",
        "",
        "applicationId",
        "Lcom/discord/primitives/ApplicationId;",
        "getApplicationId-VavddsQ",
        "()J",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "getChannelId-o4g7jtM",
        "description",
        "",
        "getDescription",
        "()Ljava/lang/String;",
        "extendedType",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "getExtendedType",
        "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "participantAvatarUris",
        "",
        "getParticipantAvatarUris",
        "()Ljava/util/List;",
        "participantsText",
        "getParticipantsText",
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
.method public abstract getApplicationId-VavddsQ()J
.end method

.method public abstract getChannelId-o4g7jtM()J
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getExtendedType()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;
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

.method public abstract getParticipantsText()Ljava/lang/String;
.end method
