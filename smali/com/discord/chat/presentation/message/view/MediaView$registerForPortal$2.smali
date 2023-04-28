.class final Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/MediaView;->registerForPortal()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
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
        "it",
        "Landroid/view/View;",
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
.field final synthetic $mediaPlayer:Lcom/discord/media_player/MediaPlayer;

.field final synthetic $portal:D

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/MediaView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/MediaView;DLcom/discord/media_player/MediaPlayer;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    iput-wide p2, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->$portal:D

    iput-object p4, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->$mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/MediaView;->access$getManagerModule$p(Lcom/discord/chat/presentation/message/view/MediaView;)Lcom/discord/media_player/MediaPlayerManagerModule;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-wide v0, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->$portal:D

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->$mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    invoke-virtual {p1, v0, v1, v2}, Lcom/discord/media_player/MediaPlayerManagerModule;->startPlayerProgressInterval(DLcom/discord/media_player/MediaPlayer;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/MediaView;->access$play(Lcom/discord/chat/presentation/message/view/MediaView;)V

    return-void
.end method
