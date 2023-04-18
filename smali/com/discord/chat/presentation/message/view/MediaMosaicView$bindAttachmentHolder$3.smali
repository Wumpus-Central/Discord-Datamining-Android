.class final Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/MediaMosaicView;->bindAttachmentHolder(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Double;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "invoke",
        "(Ljava/lang/Double;)V"
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

.field final synthetic $item:Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/MediaMosaicView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/MediaMosaicView;Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->this$0:Lcom/discord/chat/presentation/message/view/MediaMosaicView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->$item:Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->$holder:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->invoke(Ljava/lang/Double;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Double;)V
    .locals 3

    .line 2
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->this$0:Lcom/discord/chat/presentation/message/view/MediaMosaicView;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/MediaMosaicView;->access$getOnAttachmentClicked$p(Lcom/discord/chat/presentation/message/view/MediaMosaicView;)Lkotlin/jvm/functions/Function3;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "onAttachmentClicked"

    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->$item:Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getIndex()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->$item:Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$3;->$holder:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    invoke-interface {p1, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
