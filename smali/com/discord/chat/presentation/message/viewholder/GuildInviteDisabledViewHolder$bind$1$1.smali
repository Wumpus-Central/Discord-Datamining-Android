.class final Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder$bind$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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
.field final synthetic $inviteAccessory:Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder$bind$1$1;->this$0:Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder$bind$1$1;->$inviteAccessory:Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder$bind$1$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder$bind$1$1;->this$0:Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;->getEventHandler()Lcom/discord/chat/presentation/events/ChatEventHandler;

    move-result-object v1

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder$bind$1$1;->$inviteAccessory:Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    .line 4
    invoke-static/range {v1 .. v6}, Lcom/discord/chat/presentation/events/ChatEventHandler$DefaultImpls;->onLinkClicked-u7_MRrM$default(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method
