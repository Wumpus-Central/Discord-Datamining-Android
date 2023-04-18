.class final Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;->bindView(Lcom/discord/chat/presentation/message/MessageView;Lcom/discord/chat/presentation/list/item/MessageItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/discord/chat/presentation/message/MessageView$ChainPart;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/message/MessageView$ChainPart;",
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
.field final synthetic $item:Lcom/discord/chat/presentation/list/item/MessageItem;

.field final synthetic $metadata:Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata<",
            "Lcom/discord/chat/presentation/message/MessageView;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;Lcom/discord/chat/presentation/list/item/MessageItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;",
            "Lcom/discord/chat/presentation/list/item/MessageItem;",
            "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata<",
            "Lcom/discord/chat/presentation/message/MessageView;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;->this$0:Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;->$item:Lcom/discord/chat/presentation/list/item/MessageItem;

    iput-object p3, p0, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;->$metadata:Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/discord/chat/presentation/message/MessageView$ChainPart;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;->this$0:Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;->$item:Lcom/discord/chat/presentation/list/item/MessageItem;

    iget-object v2, p0, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;->$metadata:Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;

    invoke-static {v0, v1, v2}, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;->access$getChainPart(Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;Lcom/discord/chat/presentation/list/item/MessageItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate$bindView$1;->invoke()Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    move-result-object v0

    return-object v0
.end method
