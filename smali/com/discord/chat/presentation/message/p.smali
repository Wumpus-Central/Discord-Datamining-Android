.class public final synthetic Lcom/discord/chat/presentation/message/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function4;

.field public final synthetic l:Lcom/discord/chat/bridge/Message;

.field public final synthetic m:I

.field public final synthetic n:Lcom/discord/chat/bridge/MediaType;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/p;->k:Lkotlin/jvm/functions/Function4;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/p;->l:Lcom/discord/chat/bridge/Message;

    iput p3, p0, Lcom/discord/chat/presentation/message/p;->m:I

    iput-object p4, p0, Lcom/discord/chat/presentation/message/p;->n:Lcom/discord/chat/bridge/MediaType;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/message/p;->k:Lkotlin/jvm/functions/Function4;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/p;->l:Lcom/discord/chat/bridge/Message;

    iget v2, p0, Lcom/discord/chat/presentation/message/p;->m:I

    iget-object v3, p0, Lcom/discord/chat/presentation/message/p;->n:Lcom/discord/chat/bridge/MediaType;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/discord/chat/presentation/message/MessageView;->f(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
