.class public final synthetic Lcom/discord/chat/presentation/message/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/events/ChatEventHandler;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/r;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/r;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/r;->m:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/r;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/r;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/r;->m:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->c(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Landroid/view/View;)V

    return-void
.end method