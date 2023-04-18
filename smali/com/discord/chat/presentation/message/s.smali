.class public final synthetic Lcom/discord/chat/presentation/message/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/events/ChatEventHandler;

.field public final synthetic l:Lcom/discord/chat/bridge/roleicons/RoleIcon;

.field public final synthetic m:Lcom/discord/emoji/RenderableEmoji;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/emoji/RenderableEmoji;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/s;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/s;->l:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/s;->m:Lcom/discord/emoji/RenderableEmoji;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/s;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/s;->l:Lcom/discord/chat/bridge/roleicons/RoleIcon;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/s;->m:Lcom/discord/emoji/RenderableEmoji;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/RoleIconView;->a(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/emoji/RenderableEmoji;Landroid/view/View;)V

    return-void
.end method
