.class final Lcom/discord/chat/presentation/list/item/ChatListItem$recyclerItemId$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/item/ChatListItem;-><init>(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Long;"
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
.field final synthetic this$0:Lcom/discord/chat/presentation/list/item/ChatListItem;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/item/ChatListItem;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/item/ChatListItem$recyclerItemId$2;->this$0:Lcom/discord/chat/presentation/list/item/ChatListItem;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/ChatListItem$recyclerItemId$2;->this$0:Lcom/discord/chat/presentation/list/item/ChatListItem;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/list/item/ChatListItem;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/recycler_view/ids/IdUtilsKt;->convertToId(Ljava/lang/CharSequence;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/item/ChatListItem$recyclerItemId$2;->invoke()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
