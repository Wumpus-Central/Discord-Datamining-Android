.class public final synthetic Lcom/discord/chat/presentation/message/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

.field public final synthetic l:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

.field public final synthetic m:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/b;->k:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/b;->l:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/b;->m:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/b;->k:Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/b;->l:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/b;->m:Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->b(Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Landroid/view/View;)V

    return-void
.end method
