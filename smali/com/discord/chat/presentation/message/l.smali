.class public final synthetic Lcom/discord/chat/presentation/message/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/bridge/Message;

.field public final synthetic l:Lcom/discord/chat/presentation/events/ChatEventHandler;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/l;->k:Lcom/discord/chat/bridge/Message;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/l;->l:Lcom/discord/chat/presentation/events/ChatEventHandler;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/l;->k:Lcom/discord/chat/bridge/Message;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/l;->l:Lcom/discord/chat/presentation/events/ChatEventHandler;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/MessageView;->c(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V

    return-void
.end method
