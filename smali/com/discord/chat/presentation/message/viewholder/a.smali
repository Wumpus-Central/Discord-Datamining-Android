.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/a;->k:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/a;->l:Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/a;->k:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/a;->l:Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/viewholder/ActivityInviteEmbedViewHolder;->a(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;Landroid/view/View;)V

    return-void
.end method
