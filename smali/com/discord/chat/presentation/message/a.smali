.class public final synthetic Lcom/discord/chat/presentation/message/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/events/ChatEventHandler;

.field public final synthetic l:Lcom/discord/primitives/UserId;

.field public final synthetic m:Lcom/discord/primitives/GuildId;

.field public final synthetic n:Lcom/discord/primitives/ChannelId;

.field public final synthetic o:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/primitives/UserId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/a;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/a;->l:Lcom/discord/primitives/UserId;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/a;->m:Lcom/discord/primitives/GuildId;

    iput-object p4, p0, Lcom/discord/chat/presentation/message/a;->n:Lcom/discord/primitives/ChannelId;

    iput-object p5, p0, Lcom/discord/chat/presentation/message/a;->o:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget-object v0, p0, Lcom/discord/chat/presentation/message/a;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/a;->l:Lcom/discord/primitives/UserId;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/a;->m:Lcom/discord/primitives/GuildId;

    iget-object v3, p0, Lcom/discord/chat/presentation/message/a;->n:Lcom/discord/primitives/ChannelId;

    iget-object v4, p0, Lcom/discord/chat/presentation/message/a;->o:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;->a(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/primitives/UserId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Landroid/view/View;)V

    return-void
.end method
