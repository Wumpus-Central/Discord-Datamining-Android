.class final Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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
.field final synthetic $item:Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/MediaMosaicView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/MediaMosaicView;Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$2;->this$0:Lcom/discord/chat/presentation/message/view/MediaMosaicView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$2;->$item:Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$2;->this$0:Lcom/discord/chat/presentation/message/view/MediaMosaicView;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/MediaMosaicView;->access$getOnAttachmentSpoilerClicked$p(Lcom/discord/chat/presentation/message/view/MediaMosaicView;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "onAttachmentSpoilerClicked"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/MediaMosaicView$bindAttachmentHolder$2;->$item:Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getAttachmentIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
