.class final Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$22;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Integer;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "index",
        "",
        "attachment",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "attachmentViewHolder",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$22;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    check-cast p3, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$22;->invoke(ILcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(ILcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V
    .locals 9

    const-string v0, "attachment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentViewHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v3

    .line 3
    instance-of v0, p2, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :goto_0
    move-object v6, p2

    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p2, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    if-eqz v0, :cond_1

    .line 5
    check-cast p2, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    invoke-virtual {p2}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getPortal()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    goto :goto_0

    .line 6
    :goto_1
    sget-object v8, Lcom/discord/chat/reactevents/ViewResizeMode;->Cover:Lcom/discord/chat/reactevents/ViewResizeMode;

    .line 7
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$22;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    const-string v5, "attachment"

    const/4 v7, 0x0

    move-object v2, p3

    move v4, p1

    invoke-static/range {v1 .. v8}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->access$onMediaClicked-l3ndG-o(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V

    return-void

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported accessory: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
