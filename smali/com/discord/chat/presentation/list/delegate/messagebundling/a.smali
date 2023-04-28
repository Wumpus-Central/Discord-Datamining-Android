.class public final synthetic Lcom/discord/chat/presentation/list/delegate/messagebundling/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleConversationDelegate;

.field public final synthetic l:Lcom/discord/chat/presentation/list/item/MessageBundleItem;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleConversationDelegate;Lcom/discord/chat/presentation/list/item/MessageBundleItem;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/list/delegate/messagebundling/a;->k:Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleConversationDelegate;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/delegate/messagebundling/a;->l:Lcom/discord/chat/presentation/list/item/MessageBundleItem;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/messagebundling/a;->k:Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleConversationDelegate;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/delegate/messagebundling/a;->l:Lcom/discord/chat/presentation/list/item/MessageBundleItem;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleConversationDelegate;->a(Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleConversationDelegate;Lcom/discord/chat/presentation/list/item/MessageBundleItem;Landroid/view/View;)V

    return-void
.end method
