.class final synthetic Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$7;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x1

    const-class v3, Lcom/discord/chat/presentation/events/ChatEventHandler;

    const-string v4, "onLinkLongClicked"

    const-string v5, "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/n;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$7;->invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/e;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/discord/chat/presentation/events/ChatEventHandler;

    invoke-interface {v0, p1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V

    return-void
.end method
