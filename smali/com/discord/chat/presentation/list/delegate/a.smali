.class public final synthetic Lcom/discord/chat/presentation/list/delegate/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;

.field public final synthetic l:Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/list/delegate/a;->k:Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/delegate/a;->l:Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/a;->k:Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/delegate/a;->l:Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;->a(Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;Landroid/view/View;)V

    return-void
.end method