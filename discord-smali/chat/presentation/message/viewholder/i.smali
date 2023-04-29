.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;

.field public final synthetic l:Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/i;->k:Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/i;->l:Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/i;->k:Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/i;->l:Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;->a(Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;Landroid/view/View;)V

    return-void
.end method
