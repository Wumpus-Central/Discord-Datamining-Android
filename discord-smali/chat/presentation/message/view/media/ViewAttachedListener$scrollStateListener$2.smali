.class final Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener$scrollStateListener$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener$scrollStateListener$2;->this$0:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;
    .locals 3

    .line 2
    new-instance v0, Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;

    .line 3
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener$scrollStateListener$2;->this$0:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    invoke-static {v1}, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;->access$getView$p(Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;)Landroid/view/View;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener$scrollStateListener$2;->this$0:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    invoke-static {v2}, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;->access$getViewScrolling$p(Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;)Lkotlin/jvm/functions/Function1;

    move-result-object v2

    .line 5
    invoke-direct {v0, v1, v2}, Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener$scrollStateListener$2;->invoke()Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;

    move-result-object v0

    return-object v0
.end method