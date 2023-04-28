.class final Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/MediaView;->prepareMediaPlayer(Lcom/discord/media_player/MediaSource;Z)Lkotlin/Pair;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/media_player/MediaPlayer$Event;",
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
        "event",
        "Lcom/discord/media_player/MediaPlayer$Event;",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/MediaView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/MediaView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$1;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/media_player/MediaPlayer$Event;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$1;->invoke(Lcom/discord/media_player/MediaPlayer$Event;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/media_player/MediaPlayer$Event;)V
    .locals 15

    const-string v0, "event"

    move-object/from16 v6, p1

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    .line 2
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$1;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x7ef

    const/4 v14, 0x0

    invoke-static/range {v1 .. v14}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData$default(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZILjava/lang/Object;)V

    return-void
.end method
