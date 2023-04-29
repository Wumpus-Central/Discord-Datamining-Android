.class public final synthetic Lcom/discord/chat/presentation/list/delegate/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/list/delegate/EmbeddedActivityMessageDelegate;

.field public final synthetic l:Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/list/delegate/EmbeddedActivityMessageDelegate;Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/list/delegate/c;->k:Lcom/discord/chat/presentation/list/delegate/EmbeddedActivityMessageDelegate;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/delegate/c;->l:Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/c;->k:Lcom/discord/chat/presentation/list/delegate/EmbeddedActivityMessageDelegate;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/delegate/c;->l:Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/list/delegate/EmbeddedActivityMessageDelegate;->b(Lcom/discord/chat/presentation/list/delegate/EmbeddedActivityMessageDelegate;Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;Landroid/view/View;)V

    return-void
.end method
