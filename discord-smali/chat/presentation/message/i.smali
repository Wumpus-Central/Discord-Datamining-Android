.class public final synthetic Lcom/discord/chat/presentation/message/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/events/ChatEventHandler;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/i;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/i;->k:Lcom/discord/chat/presentation/events/ChatEventHandler;

    invoke-static {v0, p1}, Lcom/discord/chat/presentation/message/MessageTagView;->a(Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V

    return-void
.end method
