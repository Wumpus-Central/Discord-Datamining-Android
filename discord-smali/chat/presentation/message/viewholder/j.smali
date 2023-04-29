.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;

.field public final synthetic l:Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/j;->k:Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/j;->l:Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/j;->k:Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/j;->l:Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;->a(Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;Landroid/view/View;)V

    return-void
.end method
