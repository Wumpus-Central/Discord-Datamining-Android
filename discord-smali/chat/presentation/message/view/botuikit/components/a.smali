.class public final synthetic Lcom/discord/chat/presentation/message/view/botuikit/components/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/bridge/botuikit/ButtonComponent;

.field public final synthetic l:Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/bridge/botuikit/ButtonComponent;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/a;->k:Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/a;->l:Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/a;->k:Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/a;->l:Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView;->c(Lcom/discord/chat/bridge/botuikit/ButtonComponent;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Landroid/view/View;)V

    return-void
.end method
