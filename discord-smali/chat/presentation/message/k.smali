.class public final synthetic Lcom/discord/chat/presentation/message/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function4;

.field public final synthetic l:Lcom/discord/chat/bridge/Message;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/k;->k:Lkotlin/jvm/functions/Function4;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/k;->l:Lcom/discord/chat/bridge/Message;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/k;->k:Lkotlin/jvm/functions/Function4;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/k;->l:Lcom/discord/chat/bridge/Message;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/MessageView;->f(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
