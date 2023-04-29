.class public final synthetic Lcom/discord/chat/messagemanager/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/facebook/react/bridge/ReactContext;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReactContext;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/messagemanager/a;->k:Lcom/facebook/react/bridge/ReactContext;

    iput p2, p0, Lcom/discord/chat/messagemanager/a;->l:I

    iput p3, p0, Lcom/discord/chat/messagemanager/a;->m:I

    iput p4, p0, Lcom/discord/chat/messagemanager/a;->n:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/messagemanager/a;->k:Lcom/facebook/react/bridge/ReactContext;

    iget v1, p0, Lcom/discord/chat/messagemanager/a;->l:I

    iget v2, p0, Lcom/discord/chat/messagemanager/a;->m:I

    iget v3, p0, Lcom/discord/chat/messagemanager/a;->n:I

    invoke-static {v0, v1, v2, v3}, Lcom/discord/chat/messagemanager/MessageViewManagers;->a(Lcom/facebook/react/bridge/ReactContext;III)V

    return-void
.end method
