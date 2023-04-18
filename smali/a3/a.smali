.class public final synthetic La3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/events/ChatEventHandler;

.field public final synthetic l:Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/a;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iput-object p2, p0, La3/a;->l:Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, La3/a;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iget-object v1, p0, La3/a;->l:Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView;->b(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;Landroid/view/View;)V

    return-void
.end method
