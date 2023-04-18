.class public final synthetic Lcom/discord/chat/presentation/message/view/botuikit/components/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;

.field public final synthetic l:Lcom/discord/chat/bridge/botuikit/SelectComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/SelectComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/c;->k:Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/c;->l:Lcom/discord/chat/bridge/botuikit/SelectComponent;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/c;->k:Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/c;->l:Lcom/discord/chat/bridge/botuikit/SelectComponent;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->b(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/SelectComponent;Landroid/view/View;)V

    return-void
.end method
