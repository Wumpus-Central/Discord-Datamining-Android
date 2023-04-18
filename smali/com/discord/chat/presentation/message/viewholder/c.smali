.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;

.field public final synthetic l:Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/c;->k:Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/c;->l:Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/c;->k:Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/c;->l:Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;->a(Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;Landroid/view/View;)V

    return-void
.end method
