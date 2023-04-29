.class final Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/bridge/sticker/Sticker;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/discord/chat/bridge/sticker/Sticker;",
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
.field final synthetic $part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;->$part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/sticker/Sticker;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;->invoke(Lcom/discord/chat/bridge/sticker/Sticker;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/chat/bridge/sticker/Sticker;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->access$getEventHandler$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Lcom/discord/chat/presentation/events/ChatEventHandler;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "eventHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;->$part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    check-cast v0, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;->getSticker()Lcom/discord/chat/bridge/sticker/Sticker;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;->$part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onStickerClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V

    return-void
.end method
