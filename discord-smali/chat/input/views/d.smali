.class public final synthetic Lcom/discord/chat/input/views/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/chat/input/views/DCDChatInput;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/input/views/DCDChatInput;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/input/views/d;->k:Lcom/discord/chat/input/views/DCDChatInput;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/input/views/d;->k:Lcom/discord/chat/input/views/DCDChatInput;

    invoke-static {v0}, Lcom/discord/chat/input/views/DCDChatInput;->b(Lcom/discord/chat/input/views/DCDChatInput;)V

    return-void
.end method
