.class final Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$25;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "reaction",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$25;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/reactions/ReactionView$Reaction;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$25;->invoke(Lcom/discord/reactions/ReactionView$Reaction;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/reactions/ReactionView$Reaction;)V
    .locals 7

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$25;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->access$getEventHandler$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Lcom/discord/chat/presentation/events/ChatEventHandler;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "eventHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$25;->this$0:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->access$getMessageId$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    .line 4
    invoke-static/range {v1 .. v6}, Lcom/discord/chat/presentation/events/ChatEventHandler$DefaultImpls;->onTapReaction-u7_MRrM$default(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;ILjava/lang/Object;)V

    return-void
.end method
