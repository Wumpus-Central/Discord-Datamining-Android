.class public final synthetic Lcom/discord/chat/presentation/message/view/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function3;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lcom/discord/chat/bridge/embed/Embed;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lcom/discord/chat/bridge/embed/Embed;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/p;->k:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/p;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/p;->m:Lcom/discord/chat/bridge/embed/Embed;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/p;->k:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/p;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/p;->m:Lcom/discord/chat/bridge/embed/Embed;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/view/EmbedView;->b(Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lcom/discord/chat/bridge/embed/Embed;Landroid/view/View;)V

    return-void
.end method
