.class public final synthetic Lcom/discord/chat/presentation/message/view/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/MediaMosaicView;

.field public final synthetic l:Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

.field public final synthetic m:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/MediaMosaicView;Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/b0;->k:Lcom/discord/chat/presentation/message/view/MediaMosaicView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/b0;->l:Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/b0;->m:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/b0;->k:Lcom/discord/chat/presentation/message/view/MediaMosaicView;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/b0;->l:Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/b0;->m:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/view/MediaMosaicView;->a(Lcom/discord/chat/presentation/message/view/MediaMosaicView;Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Landroid/view/View;)V

    return-void
.end method
