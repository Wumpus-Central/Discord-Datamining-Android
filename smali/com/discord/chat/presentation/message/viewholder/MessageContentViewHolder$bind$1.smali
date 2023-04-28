.class final Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder$bind$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        "it",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $messageContentItem:Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder$bind$1;->$messageContentItem:Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/discord/chat/presentation/textutils/LinkStyle;

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder$bind$1;->$messageContentItem:Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getBoldLinkText()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimaryNormal:Lcom/discord/fonts/DiscordFont;

    .line 6
    :goto_0
    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder$bind$1;->$messageContentItem:Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getLinkColor()I

    move-result v1

    .line 7
    invoke-direct {p1, v0, v1}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;I)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder$bind$1;->invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;

    move-result-object p1

    return-object p1
.end method
