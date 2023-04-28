.class final Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;Ljava/lang/Float;)V
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
.field final synthetic $uploadItemId:Ljava/lang/String;

.field final synthetic $uploaderId:Ljava/lang/String;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->$uploaderId:Ljava/lang/String;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->$uploadItemId:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->this$0:Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->$uploaderId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->$uploadItemId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->this$0:Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;->access$getEventHandler$p(Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;)Lcom/discord/chat/presentation/events/ChatEventHandler;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->$uploaderId:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder$bind$onCancelUpload$1;->$uploadItemId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
