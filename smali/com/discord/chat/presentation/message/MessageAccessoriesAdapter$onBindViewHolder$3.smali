.class final Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Double;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "portal",
        "",
        "index",
        "",
        "invoke",
        "(Ljava/lang/Double;Ljava/lang/Integer;)V"
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
.field final synthetic $holder:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

.field final synthetic $part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->$holder:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->$part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Double;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->invoke(Ljava/lang/Double;Ljava/lang/Integer;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Double;Ljava/lang/Integer;)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->$holder:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    .line 3
    iget-object v2, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->$part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;->$part:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    check-cast v3, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getIndex()I

    move-result v3

    const-string v4, "embed"

    .line 5
    sget-object v7, Lcom/discord/chat/reactevents/ViewResizeMode;->Fill:Lcom/discord/chat/reactevents/ViewResizeMode;

    move-object v5, p1

    move-object v6, p2

    .line 6
    invoke-static/range {v0 .. v7}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->access$onMediaClicked-l3ndG-o(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V

    return-void
.end method
